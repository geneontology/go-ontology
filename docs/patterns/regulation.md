# regulation

[http://purl.obolibrary.org/obo/go/patterns/regulation.yaml](http://purl.obolibrary.org/obo/go/patterns/regulation.yaml)

## Description

This pattern is for classes representing types of regulation differentiated by the process they regulate. One of three core patterns for regulation terms in the GO. Do not use this pattern for the 3 grouping classes: regulation of MF, regulation of BP, regulation of BQ




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{entity}` | [Thing](http://www.w3.org/2002/07/owl#Thing) |

## Name

"regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"Any process that modulates the frequency, rate or extent of `{entity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[biological regulation](http://purl.obolibrary.org/obo/GO_0065007)  and ([regulates](http://purl.obolibrary.org/obo/RO_0002211) some `{entity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/regulation.tsv)*

| defined_class | defined_class_label | entity | entity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0052372](http://purl.obolibrary.org/obo/GO_0052372) | modulation by symbiont of entry into host | [http://purl.obolibrary.org/obo/GO_0044409](http://purl.obolibrary.org/obo/GO_0044409) | symbiont entry into host |
| [http://purl.obolibrary.org/obo/GO_0050804](http://purl.obolibrary.org/obo/GO_0050804) | modulation of chemical synaptic transmission | [http://purl.obolibrary.org/obo/GO_0007268](http://purl.obolibrary.org/obo/GO_0007268) | chemical synaptic transmission |
| [http://purl.obolibrary.org/obo/GO_0044145](http://purl.obolibrary.org/obo/GO_0044145) | modulation of formation of structure involved in a symbiotic process | [http://purl.obolibrary.org/obo/GO_0044111](http://purl.obolibrary.org/obo/GO_0044111) | formation of structure involved in a symbiotic process |
| [http://purl.obolibrary.org/obo/GO_0075030](http://purl.obolibrary.org/obo/GO_0075030) | modulation of formation of symbiont germ tube hook structure for appressorium development | [http://purl.obolibrary.org/obo/GO_0075029](http://purl.obolibrary.org/obo/GO_0075029) | formation of appressorium germ tube hook structure |
| [http://purl.obolibrary.org/obo/GO_0075054](http://purl.obolibrary.org/obo/GO_0075054) | modulation of penetration peg formation | [http://purl.obolibrary.org/obo/GO_0075053](http://purl.obolibrary.org/obo/GO_0075053) | penetration peg formation |

