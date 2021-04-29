# negative_regulation

[http://purl.obolibrary.org/obo/go/patterns/negative_regulation.yaml](http://purl.obolibrary.org/obo/go/patterns/negative_regulation.yaml)

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

"negative regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "downregulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "down-regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_exact_synonym](http://www.geneontology.org/formats/oboInOwl#hasExactSynonym): "down regulation of `{entity}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Any process that stops, prevents or reduces the frequency, rate or extent of `{entity}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[biological regulation](http://purl.obolibrary.org/obo/GO_0065007)  and ([negatively regulates](http://purl.obolibrary.org/obo/RO_0002212) some `{entity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/negative_regulation.tsv)*

| defined_class | defined_class_label | entity | entity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0051452](http://purl.obolibrary.org/obo/GO_0051452) | intracellular pH reduction | [http://purl.obolibrary.org/obo/OBA_0000050](http://purl.obolibrary.org/obo/OBA_0000050) | cell pH |
| [http://purl.obolibrary.org/obo/GO_0007042](http://purl.obolibrary.org/obo/GO_0007042) | lysosomal lumen acidification | [http://purl.obolibrary.org/obo/OBA_0000091](http://purl.obolibrary.org/obo/OBA_0000091) | lysosomal lumen pH |
| [http://purl.obolibrary.org/obo/GO_0106108](http://purl.obolibrary.org/obo/GO_0106108) | negative regulation of (R)-mevalonic acid biosynthetic process | [http://purl.obolibrary.org/obo/GO_1901737](http://purl.obolibrary.org/obo/GO_1901737) | (R)-mevalonic acid biosynthetic process |
| [http://purl.obolibrary.org/obo/GO_0150144](http://purl.obolibrary.org/obo/GO_0150144) | negative regulation of CD80 production | [http://purl.obolibrary.org/obo/GO_0035780](http://purl.obolibrary.org/obo/GO_0035780) | CD80 biosynthetic process |
| [http://purl.obolibrary.org/obo/GO_0150141](http://purl.obolibrary.org/obo/GO_0150141) | negative regulation of CD86 production | [http://purl.obolibrary.org/obo/GO_0035781](http://purl.obolibrary.org/obo/GO_0035781) | CD86 biosynthetic process |

