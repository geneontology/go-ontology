# part_of_cell_component

[http://purl.obolibrary.org/obo/go/patterns/part_of_cell_component.yaml](http://purl.obolibrary.org/obo/go/patterns/part_of_cell_component.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{component1}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{component2}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{exact_syn}` | xsd:string |
| `{narrow_syn}` | xsd:string |
| `{def_xrefs}` | xsd:string |
| `{cross_references}` | xsd:string |
| `{broad_syn}` | xsd:string |
| `{related_syn}` | xsd:string |

## Name

"`{component1}` `{component2}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any `{component1}` that is part of a `{component2}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{component1}`  and ([part of](http://purl.obolibrary.org/obo/BFO_0000050) some `{component2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/part_of_cell_component.tsv)*

| component1_label | component2_label | component2 | component1 | defined_class_label | defined_class |
|:--|:--|:--|:--|:--|:--|
| organelle subcompartment | Golgi apparatus | [http://purl.obolibrary.org/obo/GO_0005794](http://purl.obolibrary.org/obo/GO_0005794) | [http://purl.obolibrary.org/obo/GO_0031984](http://purl.obolibrary.org/obo/GO_0031984) | Golgi apparatus subcompartment | [http://purl.obolibrary.org/obo/GO_0098791](http://purl.obolibrary.org/obo/GO_0098791) |
| THO complex | transcription export complex | [http://purl.obolibrary.org/obo/GO_0000346](http://purl.obolibrary.org/obo/GO_0000346) | [http://purl.obolibrary.org/obo/GO_0000347](http://purl.obolibrary.org/obo/GO_0000347) | THO complex part of transcription export complex | [http://purl.obolibrary.org/obo/GO_0000445](http://purl.obolibrary.org/obo/GO_0000445) |
| F-actin capping protein complex | dynactin complex | [http://purl.obolibrary.org/obo/GO_0005869](http://purl.obolibrary.org/obo/GO_0005869) | [http://purl.obolibrary.org/obo/GO_0008290](http://purl.obolibrary.org/obo/GO_0008290) | actin capping protein of dynactin complex | [http://purl.obolibrary.org/obo/GO_0005870](http://purl.obolibrary.org/obo/GO_0005870) |
| actin cytoskeleton | dendritic spine | [http://purl.obolibrary.org/obo/GO_0043197](http://purl.obolibrary.org/obo/GO_0043197) | [http://purl.obolibrary.org/obo/GO_0015629](http://purl.obolibrary.org/obo/GO_0015629) | actin cytoskeleton of dendritic spine | [http://purl.obolibrary.org/obo/GO_0098938](http://purl.obolibrary.org/obo/GO_0098938) |
| actin filament | actomyosin contractile ring | [http://purl.obolibrary.org/obo/GO_0005826](http://purl.obolibrary.org/obo/GO_0005826) | [http://purl.obolibrary.org/obo/GO_0005884](http://purl.obolibrary.org/obo/GO_0005884) | actomyosin contractile ring actin filament | [http://purl.obolibrary.org/obo/GO_1903144](http://purl.obolibrary.org/obo/GO_1903144) |

