# import_into_cell

[http://purl.obolibrary.org/obo/go/patterns/import_into_cell.yaml](http://purl.obolibrary.org/obo/go/patterns/import_into_cell.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{imported}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) or [GO_0043234](http://purl.obolibrary.org/obo/GO_0043234) |
| `{exact_syn}` | xsd:string |
| `{narrow_syn}` | xsd:string |
| `{def_xrefs}` | xsd:string |
| `{cross_references}` | xsd:string |
| `{broad_syn}` | xsd:string |
| `{related_syn}` | xsd:string |

## Name

"`{imported}` import into cell"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The directed movement of `{imported}` from outside of a cell into the cytoplasmic compartment. This may occur via transport across the plasma membrane or via endocytosis."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some [extracellular region](http://purl.obolibrary.org/obo/GO_0005576))  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some [obsolete intracellular part](http://purl.obolibrary.org/obo/GO_0044424))  and ([imports](http://purl.obolibrary.org/obo/RO_0002340) some `{imported}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/import_into_cell.tsv)*

|  |
|


