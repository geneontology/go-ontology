# catabolic process

[http://purl.obolibrary.org/obo/go/patterns/catabolic_process.yaml](http://purl.obolibrary.org/obo/go/patterns/catabolic_process.yaml)

## Description

This pattern is for classes representing catabolic processes differentiated by their primary inputs.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{participant}` | [Thing](http://www.w3.org/2002/07/owl#Thing) |

## Name

"`{participant}` catabolic process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "`{participant}` catabolism"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "`{participant}` breakdown"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "`{participant}` degradation"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The chemical reactions and pathways resulting in the breakdown of `{participant}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[catabolic process](http://purl.obolibrary.org/obo/GO_0009056)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{participant}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/catabolic_process.tsv)*

| defined_class | defined_class_label | participant | participant_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0019383](http://purl.obolibrary.org/obo/GO_0019383) | (+)-camphor catabolic process | [http://purl.obolibrary.org/obo/CHEBI_15396](http://purl.obolibrary.org/obo/CHEBI_15396) | (R)-camphor |
| [http://purl.obolibrary.org/obo/GO_1901942](http://purl.obolibrary.org/obo/GO_1901942) | (+)-epi-alpha-bisabolol catabolic process | [http://purl.obolibrary.org/obo/CHEBI_68658](http://purl.obolibrary.org/obo/CHEBI_68658) | (+)-epi-alpha-bisabolol |
| [http://purl.obolibrary.org/obo/GO_1900595](http://purl.obolibrary.org/obo/GO_1900595) | (+)-kotanin catabolic process | [http://purl.obolibrary.org/obo/CHEBI_64454](http://purl.obolibrary.org/obo/CHEBI_64454) | (+)-kotanin |
| [http://purl.obolibrary.org/obo/GO_1902131](http://purl.obolibrary.org/obo/GO_1902131) | (+)-lariciresinol catabolic process | [http://purl.obolibrary.org/obo/CHEBI_67246](http://purl.obolibrary.org/obo/CHEBI_67246) | (+)-lariciresinol |
| [http://purl.obolibrary.org/obo/GO_1902125](http://purl.obolibrary.org/obo/GO_1902125) | (+)-pinoresinol catabolic process | [http://purl.obolibrary.org/obo/CHEBI_40](http://purl.obolibrary.org/obo/CHEBI_40) | (+)-pinoresinol |

