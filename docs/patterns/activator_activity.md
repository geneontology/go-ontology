# molecular function activator activity

[http://purl.obolibrary.org/obo/go/patterns/activator_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/activator_activity.yaml)

## Description

This pattern is for representing a function that activates some molecular function, differentiated by the specific molecular function activated.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{regulated_activity}` | [catalytic activity](http://purl.obolibrary.org/obo/GO_0003824) |
| `{def_dbxrefs}` | xsd:string |

## Name

"`{regulated_activity}` activator activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Binds to and increases the activity of `{regulated_activity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular function activator activity](http://purl.obolibrary.org/obo/GO_0140677)  and ([directly positively regulates](http://purl.obolibrary.org/obo/RO_0002629) some `{regulated_activity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/activator_activity.tsv)*

| defined_class | defined_class_label | regulated_activity | regulated_activity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0098744](http://purl.obolibrary.org/obo/GO_0098744) | 1-phosphatidylinositol 4-kinase activator activity | [http://purl.obolibrary.org/obo/GO_0004430](http://purl.obolibrary.org/obo/GO_0004430) | 1-phosphatidylinositol 4-kinase activity |
| [http://purl.obolibrary.org/obo/GO_0030337](http://purl.obolibrary.org/obo/GO_0030337) | DNA polymerase processivity factor activity | [http://purl.obolibrary.org/obo/GO_0034061](http://purl.obolibrary.org/obo/GO_0034061) | DNA polymerase activity |
| [http://purl.obolibrary.org/obo/GO_0140619](http://purl.obolibrary.org/obo/GO_0140619) | DNA strand exchange activator activity | [http://purl.obolibrary.org/obo/GO_0000150](http://purl.obolibrary.org/obo/GO_0000150) | DNA strand exchange activity |
| [http://purl.obolibrary.org/obo/GO_0072587](http://purl.obolibrary.org/obo/GO_0072587) | DNA topoisomerase type II (double strand cut, ATP-hydrolyzing) activator activity | [http://purl.obolibrary.org/obo/GO_0003918](http://purl.obolibrary.org/obo/GO_0003918) | DNA topoisomerase type II (double strand cut, ATP-hydrolyzing) activity |
| [http://purl.obolibrary.org/obo/GO_0005096](http://purl.obolibrary.org/obo/GO_0005096) | GTPase activator activity | [http://purl.obolibrary.org/obo/GO_0003924](http://purl.obolibrary.org/obo/GO_0003924) | GTPase activity |

