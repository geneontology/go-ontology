# positive_regulation

[http://purl.obolibrary.org/obo/go/patterns/positive_regulation.yaml](http://purl.obolibrary.org/obo/go/patterns/positive_regulation.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{entity}` | [Thing](http://www.w3.org/2002/07/owl#Thing) |
| `{exact_syn}` | xsd:string |
| `{narrow_syn}` | xsd:string |
| `{def_xrefs}` | xsd:string |
| `{cross_references}` | xsd:string |
| `{broad_syn}` | xsd:string |
| `{related_syn}` | xsd:string |

## Name

"positive regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "up regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "upregulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "up-regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any process that activates or increases the frequency, rate or extent of `{entity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[biological regulation](http://purl.obolibrary.org/obo/GO_0065007)  and ([positively regulates](http://purl.obolibrary.org/obo/RO_0002213) some `{entity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/positive_regulation.tsv)*

| defined_class | defined_class_label | entity | entity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0051454](http://purl.obolibrary.org/obo/GO_0051454) | intracellular pH elevation | [http://purl.obolibrary.org/obo/OBA_0000050](http://purl.obolibrary.org/obo/OBA_0000050) | cell pH |
| [http://purl.obolibrary.org/obo/GO_0035752](http://purl.obolibrary.org/obo/GO_0035752) | lysosomal lumen pH elevation | [http://purl.obolibrary.org/obo/OBA_0000091](http://purl.obolibrary.org/obo/OBA_0000091) | lysosomal lumen pH |
| [http://purl.obolibrary.org/obo/GO_0045852](http://purl.obolibrary.org/obo/GO_0045852) | pH elevation | [http://purl.obolibrary.org/obo/OBA_0000121](http://purl.obolibrary.org/obo/OBA_0000121) | pH |
| [http://purl.obolibrary.org/obo/GO_0075294](http://purl.obolibrary.org/obo/GO_0075294) | positive regulation by symbiont of entry into host | [http://purl.obolibrary.org/obo/GO_0044409](http://purl.obolibrary.org/obo/GO_0044409) | entry into host |
| [http://purl.obolibrary.org/obo/GO_0106109](http://purl.obolibrary.org/obo/GO_0106109) | positive regulation of (R)-mevalonic acid biosynthetic process | [http://purl.obolibrary.org/obo/GO_1901737](http://purl.obolibrary.org/obo/GO_1901737) | (R)-mevalonic acid biosynthetic process |

