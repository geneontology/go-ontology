# metabolic process

[http://purl.obolibrary.org/obo/go/patterns/metabolic_process.yaml](http://purl.obolibrary.org/obo/go/patterns/metabolic_process.yaml)

## Description

This pattern is for classes representing metabolic processes differentiated by their primary inputs or primary outputs.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{participant}` | [Thing](http://www.w3.org/2002/07/owl#Thing) |

## Name

"`{participant}` metabolic process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "`{participant}` metabolism"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The chemical reactions and pathways involving `{participant}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[metabolic process](http://purl.obolibrary.org/obo/GO_0008152)  and ([has primary input or output](http://purl.obolibrary.org/obo/RO_0004007) some `{participant}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/metabolic_process.tsv)*

| defined_class | defined_class_label | participant | participant_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0018882](http://purl.obolibrary.org/obo/GO_0018882) | (+)-camphor metabolic process | [http://purl.obolibrary.org/obo/CHEBI_15396](http://purl.obolibrary.org/obo/CHEBI_15396) | (R)-camphor |
| [http://purl.obolibrary.org/obo/GO_1901941](http://purl.obolibrary.org/obo/GO_1901941) | (+)-epi-alpha-bisabolol metabolic process | [http://purl.obolibrary.org/obo/CHEBI_68658](http://purl.obolibrary.org/obo/CHEBI_68658) | (+)-epi-alpha-bisabolol |
| [http://purl.obolibrary.org/obo/GO_1900594](http://purl.obolibrary.org/obo/GO_1900594) | (+)-kotanin metabolic process | [http://purl.obolibrary.org/obo/CHEBI_64454](http://purl.obolibrary.org/obo/CHEBI_64454) | (+)-kotanin |
| [http://purl.obolibrary.org/obo/GO_1902130](http://purl.obolibrary.org/obo/GO_1902130) | (+)-lariciresinol metabolic process | [http://purl.obolibrary.org/obo/CHEBI_67246](http://purl.obolibrary.org/obo/CHEBI_67246) | (+)-lariciresinol |
| [http://purl.obolibrary.org/obo/GO_1901709](http://purl.obolibrary.org/obo/GO_1901709) | (+)-larreatricin metabolic process | [http://purl.obolibrary.org/obo/CHEBI_67153](http://purl.obolibrary.org/obo/CHEBI_67153) | (+)-larreatricin |

