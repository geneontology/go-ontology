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
house style is bare: essentially all pre-existing `is_a: neverin:*` /
`is_a: onlyin:*` axioms in `go-edit.obo` have no trailing comment.
Pre-existing comments elsewhere can be helpful to read but should not be
added to new axioms.
```

### Change B — extend the "Evidence" section

**Locate**:

```
## Evidence

Put evidence on the `is_a` axiom as `source` annotations. Multiple sources are
multiple annotations on the same axiom:

    is_a: onlyin:4952 {source="PMID:10629216", source="PMID:14504266"}

Use the same care as before: research both phylogeny and GO term usage, and
report the evidence when communicating on the issue or PR.
```

**Append**:

```
### What may appear inside `{source="…"}`

- **PMIDs** — the default, and what most sourced axioms carry.
- **Registered `GOC:` handles** — e.g. `GOC:vw`, `GOC:kmv`. These are curator
  identifiers, not free text. Do **not** invent a new `GOC:<agent>`
  identifier; if the handle you want to use is not already present in
  `go-edit.obo` and not registered in the go-site metadata, do not use it.
- **`ORCID:…`** — where a specific person's expert judgement is the evidence.

If none of the above fits, leave the axiom unsourced. Sourceless is the
majority house style — the overwhelming majority of `is_a: neverin:*`
axioms in `go-edit.obo` carry no `source=` annotation at all — and a bare
axiom that rests on the arguments recorded in the tracker item is strictly
preferable to one propped up with a citation the paper does not support.
A wrong citation is a defect; no citation is a style choice.

Every PMID cited on a taxon-constraint axiom must have been read for scope,
not just for topic: a 1972 survey of vertebrates and amphioxus is not
evidence about arthropods, even if its title uses the phrase "the animal
kingdom". Cite what the paper looked at, not what it aspired to.
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

If the review was triggered by a synchronize event whose combined diff on the
ontology-relevant files is empty (e.g. a merge from master that touched no
in-scope stanza), do not re-run the full review. Post a one-line

    No content changed on <file(s)> since round N (SHA <shortsha>); previous
    findings unchanged.

and exit. The findings from the previous round remain outstanding and the
next author-side commit will trigger a fresh review with a non-empty diff.

Check with:

    git show --cc <SHA> -- src/ontology/go-edit.obo

Empty output on all in-scope files is the trigger. A conflict resolution or
a stray whitespace change is not — those need reviewing like any other diff.
```

---

## Rationale (short)

- **Sources**: `/taxon-constraint` was silent on what may appear inside
  `{source="…"}`, which is how `GOC:ai4c-agent` (unregistered) got invented
  in PR #32435 round 2 to plug an evidence hole flagged in round 1.
- **Trailing `!` comments**: 9 of 732 `neverin:` axioms in `go-edit.obo`
  currently carry one, all from PR #32435. The referenced classes are
  declared in `imports/go-taxon-constraint-classes.ofn`, so a `robot convert`
  round-trip drops the label — future editors see a phantom deletion.
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
