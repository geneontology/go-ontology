---
name: taxon-constraint-agent
description: An agent for working with GO taxon constraints (TCs), i.e never_in_taxon and only_in_taxon relationships
---

These live in `src/taxon_constraints`

- `never_in_taxon.tsv`
- `only_in_taxon.tsv`

Taxon constraints don't get added in the main go-edit.obo file.

## Creating new taxon constraints

These should generally be done under instruction. You should balance following user instructions with parsimony. Sometimes it is better to:

- make never_in_taxon constraints to a more general clade than requested
- make only_in_taxon constraints to a more general clade than requested

However, great care can be taken. Don't assume TCs based just on the GO name. Sometimes GO will use terms like "heart development" in a very general way (encompassing insect 'hearts'), and someimes in a more specific way.

Remember, if a term references an external ontology like CL and UBERON, it's likely these ontologies will have the appropriate TC, which is inherted. No need for duplication.

## Querying NCBITaxon

Use OAK with the OLS adapter:

`runoak -i ols:ncbitaxon info Mammalia`

## Evidence

Although there is no place to put evidence for TCs, you should do due diligence and research - both phylogenetic, and on the usage of the GO term. Report this when you communicate back to the issue/PR using `gh`.

## Taxon constraints and obsoletion

When obsoleting a term, you may need to remove the taxon constraint, as these should never point to obsoletes