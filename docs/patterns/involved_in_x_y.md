# involved in x y

[http://purl.obolibrary.org/obo/go/patterns/involved_in_x_y.yaml](http://purl.obolibrary.org/obo/go/patterns/involved_in_x_y.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{process1}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |
| `{process2}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |

## Name

"`{process1}` involved in `{process2}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any `{process1}` that is involved in `{process2}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{process1}`  and ([part of](http://purl.obolibrary.org/obo/BFO_0000050) some `{process2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/involved_in_x_y.tsv)*

| process1_label | process2 | defined_class_label | defined_class | process2_label | process1 |
|:--|:--|:--|:--|:--|:--|
| B cell activation | [http://purl.obolibrary.org/obo/GO_0006955](http://purl.obolibrary.org/obo/GO_0006955) | B cell activation involved in immune response | [http://purl.obolibrary.org/obo/GO_0002312](http://purl.obolibrary.org/obo/GO_0002312) | immune response | [http://purl.obolibrary.org/obo/GO_0042113](http://purl.obolibrary.org/obo/GO_0042113) |
| B cell apoptotic process | [http://purl.obolibrary.org/obo/GO_0002514](http://purl.obolibrary.org/obo/GO_0002514) | B cell deletion | [http://purl.obolibrary.org/obo/GO_0002516](http://purl.obolibrary.org/obo/GO_0002516) | B cell tolerance induction | [http://purl.obolibrary.org/obo/GO_0001783](http://purl.obolibrary.org/obo/GO_0001783) |
| B cell proliferation | [http://purl.obolibrary.org/obo/GO_0006955](http://purl.obolibrary.org/obo/GO_0006955) | B cell proliferation involved in immune response | [http://purl.obolibrary.org/obo/GO_0002322](http://purl.obolibrary.org/obo/GO_0002322) | immune response | [http://purl.obolibrary.org/obo/GO_0042100](http://purl.obolibrary.org/obo/GO_0042100) |
| CD4-positive, CD25-positive, alpha-beta regulatory T cell differentiation | [http://purl.obolibrary.org/obo/GO_0006955](http://purl.obolibrary.org/obo/GO_0006955) | CD4-positive, CD25-positive, alpha-beta regulatory T cell differentiation involved in immune response | [http://purl.obolibrary.org/obo/GO_0002298](http://purl.obolibrary.org/obo/GO_0002298) | immune response | [http://purl.obolibrary.org/obo/GO_0002361](http://purl.obolibrary.org/obo/GO_0002361) |
| CD4-positive, alpha-beta T cell differentiation | [http://purl.obolibrary.org/obo/GO_0006955](http://purl.obolibrary.org/obo/GO_0006955) | CD4-positive, alpha-beta T cell differentiation involved in immune response | [http://purl.obolibrary.org/obo/GO_0002294](http://purl.obolibrary.org/obo/GO_0002294) | immune response | [http://purl.obolibrary.org/obo/GO_0043367](http://purl.obolibrary.org/obo/GO_0043367) |

