---
name: taxon-constraint
description: For working with GO taxon constraints (TCs) using onlyin:/neverin: superclass assertions
---

Taxon constraints are edited directly in `src/ontology/go-edit.obo`.

A GO term gets a taxon constraint by asserting `is_a` to one of these
materialized classes:

```obo
is_a: onlyin:33213
is_a: neverin:4896
is_a: onlyin:4952 {source="PMID:10629216", source="PMID:14504266"}
```

The class labels are "only in <taxon>" and "never in <taxon>". OBO comments
after `!` are helpful when present, but do not rely on them being preserved by
serialization for these internal idspaces.

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
