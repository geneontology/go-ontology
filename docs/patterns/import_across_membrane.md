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

"`{cargo}` import across `{membrane}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [comment](http://www.w3.org/2000/01/rdf-schema#comment): "This term covers `{cargo}` *across* the `{membrane}` through a channel or pore. It does not cover import via vesicle fusion with `{membrane}` or vesiculation, as in these cases transport does not involve crossing the membrane."^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The directed import of `{cargo}` from `{start}`, across the `{membrane}` and into the `{end}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some `{start}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{end}`)  and ([imports](http://purl.obolibrary.org/obo/RO_0002340) some `{cargo}`)  and ([results in transport across](http://purl.obolibrary.org/obo/RO_0002342) some `{membrane}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/import_across_membrane.tsv)*

| start_label | defined_class_label | end | start | membrane | cargo_label | cargo | end_label | defined_class | membrane_label |
|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|
| extracellular region | D-aspartate import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | D-aspartate(2-) | [http://purl.obolibrary.org/obo/CHEBI_29994](http://purl.obolibrary.org/obo/CHEBI_29994) | cytosol | [http://purl.obolibrary.org/obo/GO_0070779](http://purl.obolibrary.org/obo/GO_0070779) | plasma membrane |
| extracellular region | L-alanine import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | L-alanine | [http://purl.obolibrary.org/obo/CHEBI_16977](http://purl.obolibrary.org/obo/CHEBI_16977) | cytosol | [http://purl.obolibrary.org/obo/GO_1904273](http://purl.obolibrary.org/obo/GO_1904273) | plasma membrane |
| extracellular region | L-arginine import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | L-arginine | [http://purl.obolibrary.org/obo/CHEBI_16467](http://purl.obolibrary.org/obo/CHEBI_16467) | cytosol | [http://purl.obolibrary.org/obo/GO_0097638](http://purl.obolibrary.org/obo/GO_0097638) | plasma membrane |
| extracellular region | L-asparagine import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | L-asparagine | [http://purl.obolibrary.org/obo/CHEBI_17196](http://purl.obolibrary.org/obo/CHEBI_17196) | cytosol | [http://purl.obolibrary.org/obo/GO_1903811](http://purl.obolibrary.org/obo/GO_1903811) | plasma membrane |
| extracellular region | L-glutamate import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | L-glutamate(1-) | [http://purl.obolibrary.org/obo/CHEBI_29985](http://purl.obolibrary.org/obo/CHEBI_29985) | cytosol | [http://purl.obolibrary.org/obo/GO_0098712](http://purl.obolibrary.org/obo/GO_0098712) | plasma membrane |

