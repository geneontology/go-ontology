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

- [has exact synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "`{participant}` metabolism"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The chemical reactions and pathways involving `{participant}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[metabolic process](http://purl.obolibrary.org/obo/GO_0008152)  and ([has primary input or output](http://purl.obolibrary.org/obo/RO_0004007) some `{participant}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/metabolic_process.tsv)*

| defined_class | defined_class_label | participant | participant_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_1901709](http://purl.obolibrary.org/obo/GO_1901709) | (+)-larreatricin metabolic process | [http://purl.obolibrary.org/obo/CHEBI_67153](http://purl.obolibrary.org/obo/CHEBI_67153) | (+)-larreatricin |
| [http://purl.obolibrary.org/obo/GO_1901598](http://purl.obolibrary.org/obo/GO_1901598) | (-)-pinoresinol metabolic process | [http://purl.obolibrary.org/obo/CHEBI_67245](http://purl.obolibrary.org/obo/CHEBI_67245) | (-)-pinoresinol |
| [http://purl.obolibrary.org/obo/GO_0070595](http://purl.obolibrary.org/obo/GO_0070595) | (1->3)-alpha-glucan metabolic process | [http://purl.obolibrary.org/obo/CHEBI_28100](http://purl.obolibrary.org/obo/CHEBI_28100) | (1->3)-alpha-D-glucan |
| [http://purl.obolibrary.org/obo/GO_0006074](http://purl.obolibrary.org/obo/GO_0006074) | (1->3)-beta-D-glucan metabolic process | [http://purl.obolibrary.org/obo/CHEBI_37671](http://purl.obolibrary.org/obo/CHEBI_37671) | (1->3)-beta-D-glucan |
| [http://purl.obolibrary.org/obo/GO_0070629](http://purl.obolibrary.org/obo/GO_0070629) | (1->4)-alpha-glucan metabolic process | [http://purl.obolibrary.org/obo/CHEBI_15444](http://purl.obolibrary.org/obo/CHEBI_15444) | (1->4)-alpha-D-glucan |

