---
name: research
description: Use the /research skill when performing background research from the literature or the web to create a RESEARCH.md file; also covers use of `deep-research-client`
---

## Context

You can use normal web search tools to find relevant literature. You can also use trusted encyclopedic sources such
as wikipedia but it's good to follow up with the publications themselves. All research must be summarized in a file RESEARCH.md.
This file is NOT to be committed, however, it MUST be communicated back appropriately to the user.

Remember, most of the time you are likely to be running in a GitHub actions context, when triggered from an issue (via a `@ai4c-agent` invocation). If this is the case, the RESEARCH.md contents
should be copied onto the issue comments. Otherwise, the user has no way of seeing the RESEARCH.md file, as it disappears alongside the temporary github actions workspace.

This is especially true if the user asks you explicitly to research a topic  - they want to see the full report! Even if you make the RESEARCH.md as part of a broader task, it is good to post the contents.

You can editorialize if need be

## When to invoke

Use this appropriately. If the request is to fix a typo in a synonym or definition, there is no need to do research (write as N/A in any checklists). Similarly if the request pertains to a trivial compositional term then research is not required. But if there is any nuanced biology involved, it is good to do the appropriate level of research.

Always bear in mind:

- GO is pan-species; while human relevance is good, don't assume the term will only be used for human biology
- GO is primarily interested in evolved molecular and cellular biology, and not pleiotropic phenotypes
- For ontology terms, recent reviews are often better than older references, or references that focus on specific experimental results
- Encyclopedic and book references are perfectly fine for high level biology (e.g. "nucleus"); but even for well understood processes (e.g. apoptosis), recent reviews are favored

## Deep Research

For detailed searches, you can do deep research queries:

```
deep-research-client research --provider perplexity "<DETAILED RESEARCH QUESTION HERE>" --output results.md --separate-citations citations.md
```

This will take around 5 minutes or so.

If the user wants to do more extensive research, or if perplexity credits are exhaustive, then use the `cyberian` provider:


```
deep-research-client research --provider cyberian ....
```

## Caching PMIDs and DOIs

Use `src/util/cache-references.py`, not `linkml-reference-validator` directly:

```
./src/util/cache-references.py PMID:28318978 PMID:21423649
./src/util/cache-references.py --from RESEARCH.md     # every PMID the draft cites
./src/util/cache-references.py --recheck              # retry abstract-only entries
```

==> writes to `references_cache/PMID_28318978.md`

The wrapper runs `linkml-reference-validator cache reference` and then recovers
the full text the validator silently drops. The validator's own PMC HTML
fallback searches for markup PMC retired, so when a publisher restricts the
Entrez XML you get `content_type: abstract_only` with no indication that full
text existed. The wrapper tries Europe PMC's JATS XML, then the rendered PMC
page for articles Europe PMC does not carry, and appends what it finds under
`## Full Text` -- inside the region the validator reads back, so quotes from
Methods and Results validate exactly as abstract quotes do.

Check `content_type` in the cached file to know what you are quoting from:

- `full_text_xml` / `full_text_pmc` -- whole paper is searchable
- `abstract_only` with `no_pmc` reported -- there is no PMC copy; if the
  abstract does not support the claim, use the `NO_FULL_TEXT:` form below
  rather than quoting something you cannot verify

Always cache before citing, to check for typos and hallucinations in reference
IDs. If the title or abstract doesn't match what the reference is purportedly
supporting, there is likely a typo or hallucination. A PMID that does not exist
at all makes the validation run exit non-zero -- that is deliberate, see the
comments in `.linkml-reference-validator.yaml`.

That config sits at the repo root and is auto-discovered, so **run the
validator and this wrapper from the repo root**. From elsewhere the tool falls
back to its defaults: a placeholder NCBI email, and no `skip_prefixes`, which
makes every `GOC:`/`GO_REF:`/`RHEA:` xref look like an unfetchable reference.

`references_cache` and `RESEARCH.md` are gitignored; do not check them in.

## Incorporating research results back into your work

PMIDs are preferred for most purposes. These are usually written as CURIEs, e.g. `PMID:123456`. Next best are DOIs, also curies `DOI:<doi>`

For GO, usually the best place to include citations is in definition provenance; e.g

```obo
def: "<genus and differentia>. <additional info>" [PMID:nnnn]
```

But you should ALWAYS include more detailed summaries of publications in RESEARCH.md

Entries in RESEARCH.md should have blocks in the following format:

```
## <PMID:nnnnnnn> "<TITLE>"

<brief summary>

* SUPPORT: <PMID:nnnnnn> "<EXACT excerpt from publication>"
    - finding 1
    - finding 2
    - ...

i.e. `^ SUPPORT: (\S+:\S+) "(.*)$"` all on one line, with no newlines between the `""`s

You MUST validate the supporting text like this:

`linkml-reference-validator validate text-file -r 'SUPPORT: (\S+:\S+) "(.*)"' -t 2 -R 1 RESEARCH.md`

In some cases, if a full text is not available and support cannot be found in the abstract, but support came from deep research, you can say:

* NO_FULL_TEXT: <PMID:nnnn> <say how you obtained the information>
    - finding 1
    - finding 2
    - ...

## What to at the end of the research phase

Remember that if the user is communicating with you via github action they will not see the RESEARCH.md file

On completion, this skill should produce a complete RESEARCH.md, with no fabricated results.
