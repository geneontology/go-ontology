# cc transport from to

[http://purl.obolibrary.org/obo/go/patterns/cc_transport_from_to.yaml](http://purl.obolibrary.org/obo/go/patterns/cc_transport_from_to.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{target_start}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{target_end}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |

## Name

"`{target_start}` to `{target_end}` transport"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The directed movement of substances from `{target_start}` to `{target_end}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some `{target_start}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{target_end}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/cc_transport_from_to.tsv)*

| target_end | target_end_label | target_start | defined_class | target_start_label | defined_class_label |
|:--|:--|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | extracellular region | [http://purl.obolibrary.org/obo/GO_0005622](http://purl.obolibrary.org/obo/GO_0005622) | [http://purl.obolibrary.org/obo/GO_0140352](http://purl.obolibrary.org/obo/GO_0140352) | intracellular anatomical structure | export from cell |
| [http://purl.obolibrary.org/obo/GO_0005764](http://purl.obolibrary.org/obo/GO_0005764) | lysosome | [http://purl.obolibrary.org/obo/GO_0005770](http://purl.obolibrary.org/obo/GO_0005770) | [http://purl.obolibrary.org/obo/GO_1902774](http://purl.obolibrary.org/obo/GO_1902774) | late endosome | late endosome to lysosome transport |
| [http://purl.obolibrary.org/obo/GO_0005768](http://purl.obolibrary.org/obo/GO_0005768) | endosome | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | [http://purl.obolibrary.org/obo/GO_0048227](http://purl.obolibrary.org/obo/GO_0048227) | plasma membrane | plasma membrane to endosome transport |
| [http://purl.obolibrary.org/obo/GO_0055037](http://purl.obolibrary.org/obo/GO_0055037) | recycling endosome | [http://purl.obolibrary.org/obo/GO_0005802](http://purl.obolibrary.org/obo/GO_0005802) | [http://purl.obolibrary.org/obo/GO_0044795](http://purl.obolibrary.org/obo/GO_0044795) | trans-Golgi network | trans-Golgi network to recycling endosome transport |

