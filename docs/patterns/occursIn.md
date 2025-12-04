# occurs in

[http://purl.obolibrary.org/obo/go/patterns/occursIn.yaml](http://purl.obolibrary.org/obo/go/patterns/occursIn.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{process}` | [biological_process](http://purl.obolibrary.org/obo/GO_0008150) |
| `{location}` | [independent continuant](http://purl.obolibrary.org/obo/BFO_0000004) |

## Name

"`{process}` in `{location}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any `{process}` that takes place in `{location}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

`{process}`  and ([occurs in](http://purl.obolibrary.org/obo/BFO_0000066) some `{location}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/occursIn.tsv)*

| location | process | location_label | process_label | defined_class_label | defined_class |
|:--|:--|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/CL_1000410](http://purl.obolibrary.org/obo/CL_1000410) | [http://purl.obolibrary.org/obo/GO_0001508](http://purl.obolibrary.org/obo/GO_0001508) | myocyte of atrioventricular node | action potential | AV node cell action potential | [http://purl.obolibrary.org/obo/GO_0086016](http://purl.obolibrary.org/obo/GO_0086016) |
| [http://purl.obolibrary.org/obo/CL_0000236](http://purl.obolibrary.org/obo/CL_0000236) | [http://purl.obolibrary.org/obo/GO_0019882](http://purl.obolibrary.org/obo/GO_0019882) | B cell | antigen processing and presentation | B cell antigen processing and presentation | [http://purl.obolibrary.org/obo/GO_0002450](http://purl.obolibrary.org/obo/GO_0002450) |
| [http://purl.obolibrary.org/obo/CL_0000236](http://purl.obolibrary.org/obo/CL_0000236) | [http://purl.obolibrary.org/obo/GO_0002746](http://purl.obolibrary.org/obo/GO_0002746) | B cell | antigen processing and presentation following pinocytosis | B cell antigen processing and presentation following pinocytosis | [http://purl.obolibrary.org/obo/GO_0002421](http://purl.obolibrary.org/obo/GO_0002421) |
| [http://purl.obolibrary.org/obo/CL_0000236](http://purl.obolibrary.org/obo/CL_0000236) | [http://purl.obolibrary.org/obo/GO_0006915](http://purl.obolibrary.org/obo/GO_0006915) | B cell | apoptotic process | B cell apoptotic process | [http://purl.obolibrary.org/obo/GO_0001783](http://purl.obolibrary.org/obo/GO_0001783) |
| [http://purl.obolibrary.org/obo/CL_0000236](http://purl.obolibrary.org/obo/CL_0000236) | [http://purl.obolibrary.org/obo/GO_0050851](http://purl.obolibrary.org/obo/GO_0050851) | B cell | antigen receptor-mediated signaling pathway | B cell receptor signaling pathway | [http://purl.obolibrary.org/obo/GO_0050853](http://purl.obolibrary.org/obo/GO_0050853) |

