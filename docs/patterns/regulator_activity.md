# molecular function regulator activity

[http://purl.obolibrary.org/obo/go/patterns/regulator_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/regulator_activity.yaml)

## Description

This pattern is for representing a function that modulates some molecular function, differentiated by the specific molecular function modulated.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{regulated_activity}` | [catalytic activity](http://purl.obolibrary.org/obo/GO_0003824) |

## Name

"`{regulated_activity}` regulator activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Binds to and modulates the activity of `{regulated_activity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular function regulator activity](http://purl.obolibrary.org/obo/GO_0098772)  and ([regulates](http://purl.obolibrary.org/obo/RO_0002211) some `{regulated_activity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/regulator_activity.tsv)*

| defined_class | defined_class_label | regulated_activity | regulated_activity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0030234](http://purl.obolibrary.org/obo/GO_0030234) | enzyme regulator activity | [http://purl.obolibrary.org/obo/GO_0003824](http://purl.obolibrary.org/obo/GO_0003824) | catalytic activity |

