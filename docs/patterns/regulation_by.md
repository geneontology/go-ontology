# regulation by

[http://purl.obolibrary.org/obo/go/patterns/regulation_by.yaml](http://purl.obolibrary.org/obo/go/patterns/regulation_by.yaml)

## Description

This pattern is for classes representing types of regulation differentiated by the process they regulate and the mechanism of regulation.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{mechanism}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |
| `{target}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |

## Name

"regulation of `{target}` by `{mechanism}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"`{mechanism}` that results in regulation of `{target}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{mechanism}`  and ([regulates](http://purl.obolibrary.org/obo/RO_0002211) some `{target}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/regulation_by.tsv)*

| mechanism_label | defined_class_label | target | mechanism | target_label | defined_class |
|:--|:--|:--|:--|:--|:--|
| non-canonical Wnt signaling pathway | Wnt signaling pathway, regulating spindle positioning | [http://purl.obolibrary.org/obo/GO_0040001](http://purl.obolibrary.org/obo/GO_0040001) | [http://purl.obolibrary.org/obo/GO_0035567](http://purl.obolibrary.org/obo/GO_0035567) | establishment of mitotic spindle localization | [http://purl.obolibrary.org/obo/GO_0060069](http://purl.obolibrary.org/obo/GO_0060069) |
| modulation by virus of host process | modification by virus of host cell cycle regulation | [http://purl.obolibrary.org/obo/GO_0022402](http://purl.obolibrary.org/obo/GO_0022402) | [http://purl.obolibrary.org/obo/GO_0019048](http://purl.obolibrary.org/obo/GO_0019048) | cell cycle process | [http://purl.obolibrary.org/obo/GO_0019055](http://purl.obolibrary.org/obo/GO_0019055) |
| modulation by host of viral process | modulation by host of viral RNA genome replication | [http://purl.obolibrary.org/obo/GO_0039694](http://purl.obolibrary.org/obo/GO_0039694) | [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | viral RNA genome replication | [http://purl.obolibrary.org/obo/GO_0044830](http://purl.obolibrary.org/obo/GO_0044830) |
| modulation by host of viral process | modulation by host of viral genome replication | [http://purl.obolibrary.org/obo/GO_0019079](http://purl.obolibrary.org/obo/GO_0019079) | [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | viral genome replication | [http://purl.obolibrary.org/obo/GO_0044827](http://purl.obolibrary.org/obo/GO_0044827) |
| modulation by host of viral process | modulation by host of viral glycoprotein metabolic process | [http://purl.obolibrary.org/obo/GO_0009100](http://purl.obolibrary.org/obo/GO_0009100) | [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | glycoprotein metabolic process | [http://purl.obolibrary.org/obo/GO_0044870](http://purl.obolibrary.org/obo/GO_0044870) |

