# Proposed skill changes (companion to CLAUDE.md edits in this PR)

The `.claude/` subtree is a protected path for the `ai4c-agent` workflow, so
these two skill edits could not be applied by the agent that opened this PR.
They are documented here as ready-to-apply patches for a curator with write
permission.

Both patches are additive; neither removes any existing content.

---

## 1. `.claude/skills/taxon-constraint/SKILL.md`

### Change A — replace the "OBO comments after `!`" note

**Locate** (near the top, right after the code block showing the three example
axioms):

```
The class labels are "only in <taxon>" and "never in <taxon>". OBO comments
after `!` are helpful when present, but do not rely on them being preserved by
serialization for these internal idspaces.
```

**Replace with**:

```
The class labels are "only in <taxon>" and "never in <taxon>".

**Do not add trailing `! only in X` / `! never in X` OBO comments** to these
axioms when editing. The referenced classes are declared in
`imports/go-taxon-constraint-classes.ofn`, not in `go-edit.obo`, so a `robot
convert` round-trip through `go-edit.obo` cannot resolve the label and drops
the comment — the next editor of the region sees a phantom deletion. The
house style is bare: no `is_a: neverin:*` / `is_a: onlyin:*` axiom in
`go-edit.obo` carries a trailing `!` comment (0 of 1671 as of this writing).
```

### Change B — extend the "Evidence" section

**Locate** (verbatim, including the fenced `obo` block):

````
## Evidence

Put evidence on the `is_a` axiom as `source` annotations. Multiple sources are
multiple annotations on the same axiom:

```obo
is_a: onlyin:4952 {source="PMID:10629216", source="PMID:14504266"}
```

Use the same care as before: research both phylogeny and GO term usage, and
report the evidence when communicating on the issue or PR.
````

**Append**:

```
### What may appear inside `{source="…"}`

The default is to find and cite a PMID whose scope actually covers the taxa
the axiom asserts over. Only when that search fails should the axiom go
unsourced — the reasoning then belongs in the tracker item, not on the axiom.

Every PMID cited on a taxon-constraint axiom must have been read for scope,
not just for topic: a 1972 survey of vertebrates and amphioxus is not
evidence about arthropods, even if its title uses the phrase "the animal
kingdom". Cite what the paper looked at, not what it aspired to.

Allowed values inside `{source="…"}`:

- **PMIDs** — the default, and what most sourced axioms carry.
- **Registered `GOC:` handles** — e.g. `GOC:vw`, `GOC:kmv`. These are curator
  identifiers, not free text. Do **not** invent a new `GOC:<agent>`
  identifier; if the handle you want to use is not already present in
  `go-edit.obo` and not registered in the go-site metadata, do not use it.
- **`ORCID:…`** — where a specific person's expert judgement is the evidence.

If none of the above fits, leave the axiom unsourced rather than reach for a
citation that does not support what it is being asked to support. Unsourced
is not a failure state: 692 of the 732 `is_a: neverin:*` axioms in
`go-edit.obo` carry no `source=` annotation at all (40 do). A wrong citation
is a defect; a missing one is a style choice — but "missing" only after the
search, not instead of it.
```

### Change C — add a "Metabolism vs biosynthesis / catabolism" section

**Append** (after the current "Creating new taxon constraints" section, or
anywhere in the skill body):

```
## Metabolism vs biosynthesis / catabolism

Placing a `neverin:` on an `X metabolic process` term is a stronger claim
than it looks: metabolism covers both biosynthesis and catabolism, and
degradation pathways in the target taxon can produce the substance from a
derivative (e.g. bacterial and fungal creatininase converts creatinine to
creatine as `has_primary_output`).

Before placing a `neverin:` at metabolism level, verify the constraint
holds for **both** the biosynthesis and the catabolism side. If only one
side is safe, place the constraint on the safe child term and let the
other child remain unconstrained.

Before placing a `neverin:` on an `X biosynthetic process` term, check
whether any documented pathway in the target taxon has the substance as
`has_primary_output` — including as a degradation intermediate — since the
logical definition (`biosynthetic process and has_primary_output X`) is
route-agnostic and will collide with any such pathway.

For any candidate constraint, also query the annotation store (e.g. QuickGO)
for existing IDA / IMP / IPI annotations to the target term or its
descendants in the target taxon. If any exist, the constraint will ship in
a state that invalidates them — either drop the constraint or file the
retraction request first.
```

---

## 2. `.claude/skills/pr-review/SKILL.md`

### Change — add an "Empty-diff short-circuit" subsection

**Append** (after the "Do not re-derive what CI already covers" section, or
near the top of the "What to check" content — placement is not load-bearing):

```
## Empty-diff short-circuit

If the review was triggered by a synchronize event whose diff on the in-scope
files is empty (e.g. a merge from master that touched no in-scope stanza), do
not re-run the full review.

Run this from the repo root. The in-scope files are the ones the PR itself
declares — derive them, do not hardcode. Capture them first and verify the
substitution is non-empty (a failed `gh` call yields an empty list, which
would silently become an unrestricted diff):

    FILES=$(gh pr diff <PR-NUMBER> --name-only)
    [ -n "$FILES" ] || { echo "gh pr diff returned no files; review normally"; exit 0; }

Recover the previous round's head SHA and round number by listing this bot's
own prior tracking comments on the PR. Filter out the current run's own
in-progress tracking comment (matched by this run's workflow URL, which the
action injects into every tracking comment body), paginate in case the trail
exceeds one page, and select the last remaining match. Substitute real values
for `<OWNER>`, `<REPO>`, `<PR-NUMBER>`, and `<THIS-RUN-URL>`:

    gh api --paginate repos/<OWNER>/<REPO>/issues/<PR-NUMBER>/comments \
      --jq '[.[] | select(.user.login == "ai4c-reviewer[bot]")
                 | select(.body | contains("<THIS-RUN-URL>") | not)]
            | last | .body'

Extract `<PREV-SHA>` and round `N` from that body with tolerant patterns
(`^Head reviewed:` and `^### Review — PR #\d+, round \d+`, rest ignored) —
do not require them at a fixed line number, since the workflow prepends a
banner and separator rule the agent cannot suppress. If either pattern
fails, the short-circuit is not applicable: review normally.

For this to be recoverable at all, every tracking comment this bot posts
must state its round number and reviewed head SHA in a fixed, greppable
form somewhere in the body — e.g. an `### Review — PR #<N>, round <K>`
heading followed by a `Head reviewed: <full-SHA>` line, both anchored to
column 0. Free-form phrasings do not survive automated extraction.

Then compute the delta since the previous round, path-restricted to the
in-scope files:

    git diff <PREV-SHA> HEAD -- $FILES

`git diff <PREV-SHA> HEAD -- <files>` is preferred over `git show --cc HEAD
-- <files>`: it directly answers "has anything changed on these files since
the previous round" regardless of whether the intervening commits were
regular commits, merges, or a mix (`--cc HEAD` only shows conflicted hunks
on the tip commit, and reports empty for any change delivered by an earlier
non-tip commit). Both `<PREV-SHA>` and `HEAD` must be present in the local
checkout; on shallow clones fetch enough history first (`git fetch
--deepen=50` is usually sufficient), otherwise review normally.

If, and only if, that diff is empty on every in-scope file, post a one-line
comment of the form

    No content changed on <file(s)> since round N (SHA <shortsha>); previous
    findings unchanged.

and exit. **Do not submit a new `gh pr review`** — the previous round's
verdict (approve / request-changes / comment) stands and must not be
overwritten by an implicit approval on the stub. A conflict resolution or a
stray whitespace change is not a short-circuit trigger; those need reviewing
like any other diff.
```

---

## Rationale (short)

- **Sources**: `/taxon-constraint` was silent on what may appear inside
  `{source="…"}`, which is how `GOC:ai4c-agent` (unregistered) got invented
  in PR #32435 round 2 to plug an evidence hole flagged in round 1.
- **Trailing `!` comments**: no `neverin:` / `onlyin:` axiom in `go-edit.obo`
  carries one (0 of 1671 as of this PR's base). The referenced classes are
  declared in `imports/go-taxon-constraint-classes.ofn`, so a `robot convert`
  round-trip drops the label — future editors see a phantom deletion. Nine
  were added mid-review in PR #32435 and removed again before merge.
- **Metabolism vs biosynthesis**: the round-1 finding on `neverin:2` /
  `neverin:4751` at GO:0006601 came from missing that creatininase produces
  creatine as `has_primary_output` in bacteria and fungi. A prompted check
  would have caught it before the initial PR.
- **Empty-diff short-circuit**: round 4 of PR #32435 was consumed by a
  full review of a clean master merge that changed nothing on
  `go-edit.obo`, re-posting round-3 findings verbatim.

See issue #32437 and the [PR #32435 post-mortem
comment](https://github.com/geneontology/go-ontology/pull/32435#issuecomment-5257521912)
for the round-by-round trail.
