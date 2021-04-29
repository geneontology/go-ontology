# regulation_by

[http://purl.obolibrary.org/obo/go/patterns/regulation_by.yaml](http://purl.obolibrary.org/obo/go/patterns/regulation_by.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{target1}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |
| `{target2}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |

## Name

"regulation of `{target1}` by `{target2}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"`{target1}` that results in regulation of `{target2}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{target1}`  and ([regulates](http://purl.obolibrary.org/obo/RO_0002211) some `{target2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/regulation_by.tsv)*

| target1 | target1_label | defined_class_label | target2_label | target2 | defined_class |
|:--|:--|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | modulation by host of viral process | modulation by host of viral RNA genome replication | viral RNA genome replication | [http://purl.obolibrary.org/obo/GO_0039694](http://purl.obolibrary.org/obo/GO_0039694) | [http://purl.obolibrary.org/obo/GO_0044830](http://purl.obolibrary.org/obo/GO_0044830) |
| [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | modulation by host of viral process | modulation by host of viral genome replication | viral genome replication | [http://purl.obolibrary.org/obo/GO_0019079](http://purl.obolibrary.org/obo/GO_0019079) | [http://purl.obolibrary.org/obo/GO_0044827](http://purl.obolibrary.org/obo/GO_0044827) |
| [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | modulation by host of viral process | modulation by host of viral glycoprotein metabolic process | glycoprotein metabolic process | [http://purl.obolibrary.org/obo/GO_0009100](http://purl.obolibrary.org/obo/GO_0009100) | [http://purl.obolibrary.org/obo/GO_0044870](http://purl.obolibrary.org/obo/GO_0044870) |
| [http://purl.obolibrary.org/obo/GO_0044788](http://purl.obolibrary.org/obo/GO_0044788) | modulation by host of viral process | modulation by host of viral release from host cell | viral release from host cell | [http://purl.obolibrary.org/obo/GO_0019076](http://purl.obolibrary.org/obo/GO_0019076) | [http://purl.obolibrary.org/obo/GO_0044789](http://purl.obolibrary.org/obo/GO_0044789) |
| [http://purl.obolibrary.org/obo/GO_0065007](http://purl.obolibrary.org/obo/GO_0065007) | biological regulation | modulation by symbiont of entry into host | entry into host | [http://purl.obolibrary.org/obo/GO_0044409](http://purl.obolibrary.org/obo/GO_0044409) | [http://purl.obolibrary.org/obo/GO_0052372](http://purl.obolibrary.org/obo/GO_0052372) |

