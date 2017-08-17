[![Build Status](https://travis-ci.org/geneontology/design_patterns.svg?branch=master)](https://travis-ci.org/geneontology/design_patterns)


# design_patterns

A repository of design patterns for GO, written using [DOS-DP](https://github.com/dosumis/dead_simple_owl_design_patterns).

Design patterns live in this folder and ~are~ will soon be checked via travis. Edits to design patterns should be made in a branch and only merged once the travis checks pass and the edits have been reviewed.

The subfolder 'templates' contains yaml files that can be used as templates for making new design patterns.  [templates/generic_go_pattern_outline.yaml](templates/generic_go_pattern_outline.yaml) is a generic template for GO design patterns.  It includes comments to guide editors.

## Paper/spec: 

Dead Simple OWL Design Patterns David Osumi-Sutherland, Melanie Courtot, James P. Balhoff and Christopher Mungall Journal of Biomedical Semantics 2017 8:18 DOI:10.1186/s13326-017-0126-0

The formal specification is relatively human readable and can be found at https://github.com/dosumis/dead_simple_owl_design_patterns/tree/master/spec

## TSVs

TSV spec: https://github.com/dosumis/dead_simple_owl_design_patterns/blob/master/spec/dosdp_tsv_schema.md

## Querying the ontology to find terms that match an existing pattern

TBA: Documentation of matching (works on formal axioms only?  On Equivalent Class axioms only?)

https://build.berkeleybop.org/job/query-go-patterns/

```
dsversion=0.3.2

curl -L -O https://github.com/balhoff/dosdp-scala/releases/download/v$dsversion/dosdp-scala-$dsversion.tgz

tar -zxf dosdp-scala-$dsversion.tgz

export PATH=$PATH:$(pwd)/dosdp-scala-$dsversion/bin

git clone https://github.com/geneontology/go-ontology.git

cd src/design_patterns

make query
```
