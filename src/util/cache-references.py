#!/usr/bin/env python3
"""Cache literature references, recovering full text the validator misses.

`linkml-reference-validator cache reference PMID:N` resolves a PMC id and then
tries PMC full text twice: the Entrez XML API, and, when a publisher restricts
that, an HTML scrape of the article page. The HTML fallback is dead against the
current PMC site -- it looks for `div.article-body` / `div.tsec`, retired
markup, where the live page serves `<section class="body main-article-body">`
(linkml_reference_validator/etl/sources/pmid.py, still the same in 0.2.1). The
failure is silent: the cache entry is written with `content_type: abstract_only`
and nothing says full text was available.

This wrapper runs the validator first, then for anything left abstract-only
with a PMC id it tries two sources in turn: Europe PMC's JATS XML, which
serves most articles as clean structured XML with no publisher restriction and
no markup to scrape; and, for articles deposited in PMC without an open-access
licence (those 404 on Europe PMC), the rendered PMC page, scraped with the
selector the live site actually uses. Recovered text is appended to the cached
file under a `## Full Text` heading, inside the region the validator reads back
as content, so `validate text-file` matches quotes against it unchanged.

Usage:
    src/util/cache-references.py PMID:21423649 PMID:37013624
    src/util/cache-references.py --from RESEARCH.md
    src/util/cache-references.py --recheck        # retry every abstract-only entry

Run from the repo root so .linkml-reference-validator.yaml is picked up.
"""

from __future__ import annotations

import argparse
import json
import re
import subprocess
import sys
import time
import urllib.error
import urllib.request
import xml.etree.ElementTree as ET
from pathlib import Path

CACHE_DIR = Path("references_cache")
CONFIG = Path(".linkml-reference-validator.yaml")

EUROPEPMC = "https://www.ebi.ac.uk/europepmc/webservices/rest/{pmcid}/fullTextXML"
PMC_HTML = "https://pmc.ncbi.nlm.nih.gov/articles/{pmcid}/"
ELINK = (
    "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/elink.fcgi"
    "?dbfrom=pubmed&db=pmc&linkname=pubmed_pmc&retmode=json&id={pmid}&email={email}"
)

# Below this, a "full text" is a headings-only fragment or a stub page, not
# something worth overwriting an honest abstract_only marker for.
MIN_FULLTEXT_CHARS = 3000

REQUEST_DELAY = 0.5
TIMEOUT = 60


def log(msg: str) -> None:
    print(msg, file=sys.stderr)


def config_email() -> str:
    """Read the Entrez contact address out of the repo config."""
    if CONFIG.exists():
        for line in CONFIG.read_text(encoding="utf-8").splitlines():
            if line.startswith("email:"):
                return line.split(":", 1)[1].strip()
    return "linkml-reference-validator@example.com"


def get(url: str, email: str) -> bytes | None:
    """Fetch a URL, returning None rather than raising on any HTTP failure."""
    time.sleep(REQUEST_DELAY)
    req = urllib.request.Request(
        url, headers={"User-Agent": f"go-ontology-cache-references (+{email})"}
    )
    try:
        with urllib.request.urlopen(req, timeout=TIMEOUT) as resp:
            return resp.read()
    except (urllib.error.URLError, urllib.error.HTTPError, TimeoutError) as exc:
        log(f"    fetch failed: {url} -- {exc}")
        return None


def cache_path(ref: str) -> Path:
    return CACHE_DIR / (ref.replace(":", "_") + ".md")


def split_cached(text: str) -> tuple[dict[str, str], str]:
    """Split a cached entry into frontmatter fields and the markdown body.

    Only the scalar fields this script reads or rewrites are parsed; list
    values (keywords, authors) are left alone in the raw text.
    """
    fields: dict[str, str] = {}
    if not text.startswith("---"):
        return fields, text
    end = text.find("\n---", 3)
    if end == -1:
        return fields, text
    for line in text[3:end].splitlines():
        m = re.match(r"^([a-z_]+):\s*(.*)$", line)
        if m:
            fields[m.group(1)] = m.group(2).strip()
    return fields, text[end + 4 :]


def find_pmcid(pmid: str, body: str, email: str) -> str | None:
    """Recover the PMC id, preferring the one Entrez already put in the body."""
    m = re.search(r"PMCID:\s*(PMC\d+)", body)
    if m:
        return m.group(1)

    raw = get(ELINK.format(pmid=pmid, email=email), email)
    if not raw:
        return None
    try:
        linksets = json.loads(raw).get("linksets", [])
        for ls in linksets:
            for db in ls.get("linksetdbs", []):
                # pubmed_pmc is the PMC copy of this article; pubmed_pmc_refs
                # would be articles citing it, which is a different thing.
                if db.get("linkname") == "pubmed_pmc" and db.get("links"):
                    return "PMC" + str(db["links"][0])
    except (ValueError, KeyError, TypeError) as exc:
        log(f"    could not read elink response: {exc}")
    return None


def jats_to_text(xml_bytes: bytes) -> str | None:
    """Flatten the <body> of a JATS article into headings and paragraphs.

    Only <body> is walked, which leaves out <back> -- the reference list,
    acknowledgements and competing-interest statements. Bibliographic xref
    markers are dropped: they interrupt sentences mid-quote and a curator
    quoting the paper will not have copied them.
    """
    try:
        root = ET.fromstring(xml_bytes)
    except ET.ParseError as exc:
        log(f"    JATS parse error: {exc}")
        return None

    body = root.find(".//body")
    if body is None:
        return None

    for xref in body.iter("xref"):
        if xref.get("ref-type") == "bibr":
            # Drop the marker text only. clear() would also discard the tail --
            # the rest of the sentence after the citation -- silently losing
            # most of the prose in a densely cited paragraph.
            xref.text = ""

    parts: list[str] = []
    for el in body.iter():
        if el.tag not in ("title", "p"):
            continue
        text = re.sub(r"\s+", " ", "".join(el.itertext())).strip()
        if not text:
            continue
        parts.append(f"### {text}" if el.tag == "title" else text)

    # dict.fromkeys dedupes boilerplate repeated across sections while keeping order
    return "\n\n".join(dict.fromkeys(parts)) if parts else None


def pmc_html_to_text(html_bytes: bytes) -> str | None:
    """Extract body text from a current PMC article page.

    This is the fallback the validator gets wrong. It looks for
    `div.article-body` / `div.tsec`, markup PMC has retired; the live page
    serves `<section class="body main-article-body">`. Europe PMC covers most
    articles, but not those deposited in PMC without an open-access licence,
    which 404 on its fullTextXML endpoint while still rendering here.
    """
    # Imported here rather than at module scope: bs4 is only needed for this
    # second-tier fallback, and most runs never reach it.
    from bs4 import BeautifulSoup

    soup = BeautifulSoup(html_bytes, "html.parser")
    article = (
        soup.select_one("section.body.main-article-body")
        or soup.select_one("section[aria-label='Article content']")
        or soup.find("article")
    )
    if article is None:
        return None

    parts: list[str] = []
    for el in article.find_all(["h2", "h3", "h4", "p"]):
        if el.find_parent(["figcaption", "table", "nav", "aside", "footer"]):
            continue
        text = re.sub(r"\s+", " ", el.get_text(separator=" ", strip=True)).strip()
        if not text:
            continue
        if el.name != "p":
            parts.append(f"### {text}")
        elif len(text) > 30:
            parts.append(text)

    return "\n\n".join(dict.fromkeys(parts)) if parts else None


def run_validator(ref: str) -> bool:
    """Let the validator do the metadata fetch and write the cache entry."""
    proc = subprocess.run(
        ["linkml-reference-validator", "cache", "reference", ref],
        capture_output=True,
        text=True,
    )
    if proc.returncode != 0:
        log(f"    validator failed: {proc.stderr.strip().splitlines()[-1:] or proc.stdout}")
        return False
    return True


def augment(ref: str, email: str, force: bool = False) -> str:
    """Return a one-word status: full_text, recovered, no_pmc, unavailable, error."""
    path = cache_path(ref)
    if not path.exists():
        if not run_validator(ref):
            return "error"
    if not path.exists():
        return "error"

    text = path.read_text(encoding="utf-8")
    fields, body = split_cached(text)

    if fields.get("content_type", "").startswith("full_text") and not force:
        return "full_text"

    pmid = ref.split(":", 1)[1]
    pmcid = find_pmcid(pmid, body, email)
    if not pmcid:
        return "no_pmc"

    # Tier 1: Europe PMC JATS. Clean structured XML, no markup to scrape, and
    # no publisher restriction on the endpoint -- but it 404s for articles
    # deposited in PMC without an open-access licence.
    full_text, source = None, pmcid
    xml_bytes = get(EUROPEPMC.format(pmcid=pmcid), email)
    if xml_bytes:
        full_text = jats_to_text(xml_bytes)

    # Tier 2: the rendered PMC page, which still carries those articles.
    if not full_text or len(full_text) < MIN_FULLTEXT_CHARS:
        html_bytes = get(PMC_HTML.format(pmcid=pmcid), email)
        if html_bytes:
            html_text = pmc_html_to_text(html_bytes)
            if html_text and len(html_text) > len(full_text or ""):
                full_text, source = html_text, f"{pmcid} (HTML)"

    if not full_text or len(full_text) < MIN_FULLTEXT_CHARS:
        got = len(full_text) if full_text else 0
        log(f"    only {got} chars available from PMC; keeping abstract")
        return "unavailable"

    # Rewrite in place, idempotently: drop anything a previous run of this
    # script added first, so --force does not stack a second full_text_source
    # key (which makes the frontmatter invalid YAML) or a second body copy.
    text = re.sub(r"^full_text_source: .*\n", "", text, flags=re.MULTILINE)
    text = re.sub(r"\n## Full Text\n.*\Z", "", text, flags=re.DOTALL)
    text = re.sub(r"^content_type: full_text_(europepmc|pmc)$", "content_type: abstract_only",
                  text, count=1, flags=re.MULTILINE)

    # The heading sits inside the region the validator reads back (everything
    # after "## Content"), so the recovered text is searched for quotes
    # exactly as the abstract is.
    text = re.sub(
        r"^content_type: .*$",
        f"content_type: full_text_pmc\nfull_text_source: {source}",
        text,
        count=1,
        flags=re.MULTILINE,
    )
    text = re.sub(r"\n*\Z", "\n", text)
    text += f"\n## Full Text\n\nRetrieved from PMC ({source}).\n\n{full_text}\n"
    path.write_text(text, encoding="utf-8")
    return "recovered"


def refs_from_file(path: Path) -> list[str]:
    """Pull every PMID mentioned in a file, in first-seen order."""
    found = re.findall(r"\bPMID:\s?(\d{4,9})\b", path.read_text(encoding="utf-8"))
    return list(dict.fromkeys(f"PMID:{p}" for p in found))


def abstract_only_in_cache() -> list[str]:
    refs = []
    for path in sorted(CACHE_DIR.glob("PMID_*.md")):
        fields, _ = split_cached(path.read_text(encoding="utf-8"))
        if fields.get("content_type") == "abstract_only":
            refs.append(path.stem.replace("_", ":", 1))
    return refs


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    parser.add_argument("refs", nargs="*", help="reference IDs, e.g. PMID:21423649")
    parser.add_argument("--from", dest="from_file", type=Path,
                        help="read every PMID mentioned in this file (e.g. RESEARCH.md)")
    parser.add_argument("--recheck", action="store_true",
                        help="retry full text for every abstract-only entry already cached")
    parser.add_argument("--force", action="store_true",
                        help="re-fetch full text even for entries that already have it")
    args = parser.parse_args()

    if not CONFIG.exists():
        log(f"warning: {CONFIG} not found -- run from the repo root, "
            "or the tool's defaults (placeholder NCBI email) apply")

    refs = list(args.refs)
    if args.from_file:
        refs += refs_from_file(args.from_file)
    if args.recheck:
        refs += abstract_only_in_cache()
    refs = list(dict.fromkeys(refs))

    if not refs:
        parser.error("no references given; pass IDs, --from FILE, or --recheck")

    non_pmid = [r for r in refs if not r.startswith("PMID:")]
    if non_pmid:
        log(f"note: full-text recovery is PMID-only; caching without it: {', '.join(non_pmid)}")

    email = config_email()
    CACHE_DIR.mkdir(parents=True, exist_ok=True)

    counts: dict[str, int] = {}
    for i, ref in enumerate(refs, 1):
        log(f"[{i}/{len(refs)}] {ref}")
        if not ref.startswith("PMID:"):
            status = "full_text" if run_validator(ref) else "error"
        else:
            status = augment(ref, email, force=args.force)
        counts[status] = counts.get(status, 0) + 1
        log(f"    {status}")

    log("")
    log(f"  recovered   full text newly pulled from PMC:     {counts.get('recovered', 0)}")
    log(f"  full_text   already had full text:               {counts.get('full_text', 0)}")
    log(f"  no_pmc      no PMC copy exists; abstract only:   {counts.get('no_pmc', 0)}")
    log(f"  unavailable PMC copy exists but no full text:    {counts.get('unavailable', 0)}")
    log(f"  error       fetch failed:                        {counts.get('error', 0)}")

    return 1 if counts.get("error") else 0


if __name__ == "__main__":
    sys.exit(main())
