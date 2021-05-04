# cc organization

[http://purl.obolibrary.org/obo/go/patterns/cc_organization.yaml](http://purl.obolibrary.org/obo/go/patterns/cc_organization.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{component}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |

## Name

"`{component}` organization"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"A process that is carried out at the cellular level which results in the assembly, arrangement of constituent parts, or disassembly of `{component}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[cellular process](http://purl.obolibrary.org/obo/GO_0009987)  and ([results in organization of](http://purl.obolibrary.org/obo/RO_0002592) some `{component}`)




## Other axioms

- [cellular process](http://purl.obolibrary.org/obo/GO_0009987) and ([results in organization of](http://purl.obolibrary.org/obo/RO_0002592) some ([part of](http://purl.obolibrary.org/obo/BFO_0000050) some `{component}`)) SubClassOf [part of](http://purl.obolibrary.org/obo/BFO_0000050) some  ([cellular process](http://purl.obolibrary.org/obo/GO_0009987) and ([results in organization of](http://purl.obolibrary.org/obo/RO_0002592) some `{component}`))

## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/cc_organization.tsv)*

|  |
|


