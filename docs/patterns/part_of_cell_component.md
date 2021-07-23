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
| F-actin capping protein complex | dynactin complex | [http://purl.obolibrary.org/obo/GO_0005869](http://purl.obolibrary.org/obo/GO_0005869) | [http://purl.obolibrary.org/obo/GO_0008290](http://purl.obolibrary.org/obo/GO_0008290) | actin capping protein of dynactin complex | [http://purl.obolibrary.org/obo/GO_0005870](http://purl.obolibrary.org/obo/GO_0005870) |
| actin cytoskeleton | dendritic spine | [http://purl.obolibrary.org/obo/GO_0043197](http://purl.obolibrary.org/obo/GO_0043197) | [http://purl.obolibrary.org/obo/GO_0015629](http://purl.obolibrary.org/obo/GO_0015629) | actin cytoskeleton of dendritic spine | [http://purl.obolibrary.org/obo/GO_0098938](http://purl.obolibrary.org/obo/GO_0098938) |
| actin filament | actomyosin contractile ring | [http://purl.obolibrary.org/obo/GO_0005826](http://purl.obolibrary.org/obo/GO_0005826) | [http://purl.obolibrary.org/obo/GO_0005884](http://purl.obolibrary.org/obo/GO_0005884) | actomyosin contractile ring actin filament | [http://purl.obolibrary.org/obo/GO_1903144](http://purl.obolibrary.org/obo/GO_1903144) |
| myosin complex | actomyosin | [http://purl.obolibrary.org/obo/GO_0042641](http://purl.obolibrary.org/obo/GO_0042641) | [http://purl.obolibrary.org/obo/GO_0016459](http://purl.obolibrary.org/obo/GO_0016459) | actomyosin, myosin complex part | [http://purl.obolibrary.org/obo/GO_0042642](http://purl.obolibrary.org/obo/GO_0042642) |
| anchored component of plasma membrane | external side of plasma membrane | [http://purl.obolibrary.org/obo/GO_0009897](http://purl.obolibrary.org/obo/GO_0009897) | [http://purl.obolibrary.org/obo/GO_0046658](http://purl.obolibrary.org/obo/GO_0046658) | anchored component of external side of plasma membrane | [http://purl.obolibrary.org/obo/GO_0031362](http://purl.obolibrary.org/obo/GO_0031362) |

