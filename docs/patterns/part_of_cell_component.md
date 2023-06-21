# part of cell component

[http://purl.obolibrary.org/obo/go/patterns/part_of_cell_component.yaml](http://purl.obolibrary.org/obo/go/patterns/part_of_cell_component.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{component1}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{component2}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |

## Name

"`{component1}` `{component2}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any `{component1}` that is part of a `{component2}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{component1}`  and ([part of](http://purl.obolibrary.org/obo/BFO_0000050) some `{component2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/part_of_cell_component.tsv)*

| component1_label | component2_label | component2 | component1 | defined_class_label | defined_class |
|:--|:--|:--|:--|:--|:--|
| ubiquitin ligase complex | endoplasmic reticulum | [http://purl.obolibrary.org/obo/GO_0005783](http://purl.obolibrary.org/obo/GO_0005783) | [http://purl.obolibrary.org/obo/GO_0000151](http://purl.obolibrary.org/obo/GO_0000151) | ER ubiquitin ligase complex | [http://purl.obolibrary.org/obo/GO_0000835](http://purl.obolibrary.org/obo/GO_0000835) |
| organelle subcompartment | Golgi apparatus | [http://purl.obolibrary.org/obo/GO_0005794](http://purl.obolibrary.org/obo/GO_0005794) | [http://purl.obolibrary.org/obo/GO_0031984](http://purl.obolibrary.org/obo/GO_0031984) | Golgi apparatus subcompartment | [http://purl.obolibrary.org/obo/GO_0098791](http://purl.obolibrary.org/obo/GO_0098791) |
| protein-containing complex | outer kinetochore | [http://purl.obolibrary.org/obo/GO_0000940](http://purl.obolibrary.org/obo/GO_0000940) | [http://purl.obolibrary.org/obo/GO_0032991](http://purl.obolibrary.org/obo/GO_0032991) | Knl1/Spc105 complex | [http://purl.obolibrary.org/obo/GO_0180019](http://purl.obolibrary.org/obo/GO_0180019) |
| DNA-directed RNA polymerase complex | RNA polymerase II, holoenzyme | [http://purl.obolibrary.org/obo/GO_0016591](http://purl.obolibrary.org/obo/GO_0016591) | [http://purl.obolibrary.org/obo/GO_0000428](http://purl.obolibrary.org/obo/GO_0000428) | RNA polymerase II, core complex | [http://purl.obolibrary.org/obo/GO_0005665](http://purl.obolibrary.org/obo/GO_0005665) |
| THO complex | transcription export complex | [http://purl.obolibrary.org/obo/GO_0000346](http://purl.obolibrary.org/obo/GO_0000346) | [http://purl.obolibrary.org/obo/GO_0000347](http://purl.obolibrary.org/obo/GO_0000347) | THO complex part of transcription export complex | [http://purl.obolibrary.org/obo/GO_0000445](http://purl.obolibrary.org/obo/GO_0000445) |

