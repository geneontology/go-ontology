# import_across_membrane

[http://purl.obolibrary.org/obo/go/patterns/import_across_membrane.yaml](http://purl.obolibrary.org/obo/go/patterns/import_across_membrane.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{membrane}` | [membrane](http://purl.obolibrary.org/obo/GO_0016020) |
| `{cargo}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) or [protein-containing complex](http://purl.obolibrary.org/obo/GO_0032991) or [transcript](http://purl.obolibrary.org/obo/SO_0000673) |
| `{start}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{end}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{exact_syn}` | xsd:string |
| `{narrow_syn}` | xsd:string |
| `{def_xrefs}` | xsd:string |
| `{cross_references}` | xsd:string |
| `{broad_syn}` | xsd:string |
| `{related_syn}` | xsd:string |

## Name

"`{cargo}` export across `{membrane}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [comment](http://www.w3.org/2000/01/rdf-schema#comment): "This term covers `{cargo}` *across* the `{membrane}`  through a channel or pore.  It does not cover export via vesicle fusion with `{membrane}`, as in this case transport does not involve crossing the membrane."^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The directed import of `{cargo}` from `{start}`, across the `{membrane}` and into the `{end}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{end}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{start}`)  and ([results in transport across](http://purl.obolibrary.org/obo/RO_0002342) some `{membrane}`)  and ([exports](http://purl.obolibrary.org/obo/RO_0002345) some `{cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/export_across_membrane.tsv)*

|  |
|


