# regulator activity

[http://purl.obolibrary.org/obo/go/patterns/regulator_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/regulator_activity.yaml)

## Description

This pattern is for representing regulators of molecular functions differentiated by the specific molecular function regulated.





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{regulated_activity}` | [catalytic activity](http://purl.obolibrary.org/obo/GO_0003824) |

## Name

"`{regulated_activity}` regulator activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Direct interaction with a gene product or complex that has `{regulated_activity}`,  resulting in regulation of its `{regulated_activity}`. Direct interaction  in this case includes binding and interactions leading to  covalent modification."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular function regulator activity](http://purl.obolibrary.org/obo/GO_0098772)  and ([regulates](http://purl.obolibrary.org/obo/RO_0002211) some `{regulated_activity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/regulator_activity.tsv)*

| defined_class | defined_class_label | regulated_activity | regulated_activity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0060308](http://purl.obolibrary.org/obo/GO_0060308) | GTP cyclohydrolase I regulator activity | [http://purl.obolibrary.org/obo/GO_0003934](http://purl.obolibrary.org/obo/GO_0003934) | GTP cyclohydrolase I activity |
| [http://purl.obolibrary.org/obo/GO_0030695](http://purl.obolibrary.org/obo/GO_0030695) | GTPase regulator activity | [http://purl.obolibrary.org/obo/GO_0003924](http://purl.obolibrary.org/obo/GO_0003924) | GTPase activity |
| [http://purl.obolibrary.org/obo/GO_0043763](http://purl.obolibrary.org/obo/GO_0043763) | [UTP:glucose-1-phosphate uridylyltransferase regulator activity](http://purl.obolibrary.org/obo/UTP_glucose-1-phosphate uridylyltransferase regulator activity) | [http://purl.obolibrary.org/obo/GO_0003983](http://purl.obolibrary.org/obo/GO_0003983) | [UTP:glucose-1-phosphate uridylyltransferase activity](http://purl.obolibrary.org/obo/UTP_glucose-1-phosphate uridylyltransferase activity) |
| [http://purl.obolibrary.org/obo/GO_0019909](http://purl.obolibrary.org/obo/GO_0019909) | [pyruvate dehydrogenase (lipoamide)] phosphatase regulator activity | [http://purl.obolibrary.org/obo/GO_0004741](http://purl.obolibrary.org/obo/GO_0004741) | [pyruvate dehydrogenase (lipoamide)] phosphatase activity |
| [http://purl.obolibrary.org/obo/GO_1990610](http://purl.obolibrary.org/obo/GO_1990610) | acetolactate synthase regulator activity | [http://purl.obolibrary.org/obo/GO_0003984](http://purl.obolibrary.org/obo/GO_0003984) | acetolactate synthase activity |

