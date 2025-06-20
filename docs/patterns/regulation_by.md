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
| host-mediated perturbation of viral process | host-mediated perturbation of viral RNA genome replication | [http://purl.obolibrary.org/obo/GO_0039694](http://purl.obolibrary.org/obo/GO_0039694) | [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | viral RNA genome replication | [http://purl.obolibrary.org/obo/GO_0044830](http://purl.obolibrary.org/obo/GO_0044830) |
| host-mediated perturbation of viral process | modulation by host of viral glycoprotein metabolic process | [http://purl.obolibrary.org/obo/GO_0009100](http://purl.obolibrary.org/obo/GO_0009100) | [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | glycoprotein metabolic process | [http://purl.obolibrary.org/obo/GO_0044870](http://purl.obolibrary.org/obo/GO_0044870) |
| biological regulation | modulation by symbiont of entry into host | [http://purl.obolibrary.org/obo/GO_0044409](http://purl.obolibrary.org/obo/GO_0044409) | [http://purl.obolibrary.org/obo/GO_0065007](http://purl.obolibrary.org/obo/GO_0065007) | symbiont entry into host | [http://purl.obolibrary.org/obo/GO_0052372](http://purl.obolibrary.org/obo/GO_0052372) |
| biological regulation | modulation of chemical synaptic transmission | [http://purl.obolibrary.org/obo/GO_0007268](http://purl.obolibrary.org/obo/GO_0007268) | [http://purl.obolibrary.org/obo/GO_0065007](http://purl.obolibrary.org/obo/GO_0065007) | chemical synaptic transmission | [http://purl.obolibrary.org/obo/GO_0050804](http://purl.obolibrary.org/obo/GO_0050804) |

