# molecular function inhibitor activity

[http://purl.obolibrary.org/obo/go/patterns/inhibitor_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/inhibitor_activity.yaml)

## Description

This pattern is for representing a function that inhibits some molecular function, differentiated by the specific molecular function inhibited.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{regulated_activity}` | [catalytic activity](http://purl.obolibrary.org/obo/GO_0003824) |

## Name

"`{regulated_activity}` inhibitor activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Binds to and stops, prevents, or reduces the activity of `{regulated_activity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular function regulator activity](http://purl.obolibrary.org/obo/GO_0098772)  and ([directly negatively regulates](http://purl.obolibrary.org/obo/RO_0002630) some `{regulated_activity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/inhibitor_activity.tsv)*

| defined_class | defined_class_label | regulated_activity | regulated_activity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0140620](http://purl.obolibrary.org/obo/GO_0140620) | DNA strand exchange inhibitor activity | [http://purl.obolibrary.org/obo/GO_0000150](http://purl.obolibrary.org/obo/GO_0000150) | DNA strand exchange activity |
| [http://purl.obolibrary.org/obo/GO_0008657](http://purl.obolibrary.org/obo/GO_0008657) | DNA topoisomerase type II (double strand cut, ATP-hydrolyzing) inhibitor activity | [http://purl.obolibrary.org/obo/GO_0003918](http://purl.obolibrary.org/obo/GO_0003918) | DNA topoisomerase type II (double strand cut, ATP-hydrolyzing) activity |
| [http://purl.obolibrary.org/obo/GO_0005095](http://purl.obolibrary.org/obo/GO_0005095) | GTPase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0003924](http://purl.obolibrary.org/obo/GO_0003924) | GTPase activity |
| [http://purl.obolibrary.org/obo/GO_1990119](http://purl.obolibrary.org/obo/GO_1990119) | RNA helicase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0003724](http://purl.obolibrary.org/obo/GO_0003724) | RNA helicase activity |
| [http://purl.obolibrary.org/obo/GO_0140870](http://purl.obolibrary.org/obo/GO_0140870) | RNA polymerase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0097747](http://purl.obolibrary.org/obo/GO_0097747) | RNA polymerase activity |

