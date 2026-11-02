---
name: taxon-constraint
description: "For working with GO taxon constraints (TCs) using onlyin:/neverin: superclass assertions"
---

Taxon constraints are edited directly in `src/ontology/go-edit.obo`.

A GO term gets a taxon constraint by asserting `is_a` to one of these
materialized classes:

```obo
is_a: onlyin:33213
is_a: neverin:4896
is_a: onlyin:4952 {source="PMID:10629216", source="PMID:14504266"}
```

The class labels are "only in <taxon>" and "never in <taxon>".

**Do not add trailing `! only in X` / `! never in X` OBO comments** to these
axioms when editing. The referenced classes are declared in
`imports/go-taxon-constraint-classes.ofn`, not in `go-edit.obo`, so a `robot
convert` round-trip through `go-edit.obo` cannot resolve the label and drops
the comment — the next editor of the region sees a phantom deletion. The
house style is bare: no `is_a: neverin:*` / `is_a: onlyin:*` axiom in
`go-edit.obo` carries a trailing `!` comment (0 of 1666 as of 2026-11).

## Creating new taxon constraints

These should generally be done under instruction. You should balance following user instructions with parsimony. Sometimes it is better to:

- make `neverin:` constraints to a more general clade than requested
- make `onlyin:` constraints to a more general clade than requested

However, great care can be taken. Don't assume TCs based just on the GO name. Sometimes GO will use terms like "heart development" in a very general way (encompassing insect 'hearts'), and sometimes in a more specific way.

Remember, if a term references an external ontology like CL and UBERON, it's likely these ontologies will have the appropriate TC, which is inherited. No need for duplication.

## Choosing the class

Use `onlyin:<taxon_id>` for `only_in_taxon` constraints and
`neverin:<taxon_id>` for `never_in_taxon` constraints. The local ID is the
NCBITaxon local ID with the `NCBITaxon:` prefix removed:

- `NCBITaxon:33213` becomes `onlyin:33213`
- `NCBITaxon:4896` becomes `neverin:4896`
- `NCBITaxon_Union:0000023` becomes `onlyin:Union_0000023`

Union/grouping taxa are only used for `onlyin:` constraints. Do not create
`neverin:Union_*` constraints. Prefer multiple separate `neverin:` constraints when
multiple taxa are needed.

If the needed atomic taxon class does not exist, add the taxon to
`src/ontology/imports/taxon_constraints_seed.txt` and regenerate
`src/ontology/imports/go-taxon-constraint-classes.ofn`. Union classes come from
`src/ontology/imports/go-taxon-groupings-edit.owl`.

Check whether a class exists before using it:

```bash
rg "only-in/NCBITaxon_33213|never-in/NCBITaxon_4896" src/ontology/imports/go-taxon-constraint-classes.ofn
```

## Evidence

Put evidence on the `is_a` axiom as `source` annotations. Multiple sources are
multiple annotations on the same axiom:

```obo
is_a: onlyin:4952 {source="PMID:10629216", source="PMID:14504266"}
```

Use the same care as before: research both phylogeny and GO term usage, and
report the evidence when communicating on the issue or PR.

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
is not a failure state: 695 of the 735 `is_a: neverin:*` axioms in
`go-edit.obo` carry no `source=` annotation at all (as of 2026-11). A wrong
citation is a defect; a missing one is a style choice — but "missing" only
after the search, not instead of it.

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

## Querying NCBITaxon

Use OAK with the OLS adapter:

`runoak -i ols:ncbitaxon info Mammalia`

## Validation

For ordinary term edits, validate the ontology as usual. The old
`only_in_taxon.tsv` / `never_in_taxon.tsv` column checks no longer apply.

Useful targeted checks:

```bash
cd src/ontology && make check_all_taxon_constraints_columns
cd src/ontology && make imports/go-taxon-constraint-classes.ofn
```

Run the import regeneration target when you change
`taxon_constraints_seed.txt` or taxon grouping definitions. Otherwise, adding an
`is_a: onlyin:` or `is_a: neverin:` axiom in `go-edit.obo` should not require
regenerating the class import.

## Taxon constraints and obsoletion

When obsoleting a term, you may need to remove the taxon constraint, as these should never point to obsoletes
