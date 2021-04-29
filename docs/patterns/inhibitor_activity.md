# inhibitor_activity

[http://purl.obolibrary.org/obo/go/patterns/inhibitor_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/inhibitor_activity.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{regulated_activity}` | [catalytic activity](http://purl.obolibrary.org/obo/GO_0003824) |
| `{exact_syn}` | xsd:string |
| `{narrow_syn}` | xsd:string |
| `{def_xrefs}` | xsd:string |
| `{cross_references}` | xsd:string |
| `{broad_syn}` | xsd:string |
| `{related_syn}` | xsd:string |

## Name

"`{regulated_activity}` inhibitor activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)
- [database_cross_reference](http://www.geneontology.org/formats/oboInOwl#hasDbXref): "`{cross_references}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Direct interaction with a gene product or complex that has `{regulated_activity}`, resulting in negative regulation of its `{regulated_activity}`. Direct interaction in this case includes binding and interactions leading to covalent modification."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular_function](http://purl.obolibrary.org/obo/GO_0003674)  and ([directly negatively regulates](http://purl.obolibrary.org/obo/RO_0002630) some `{regulated_activity}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/inhibitor_activity.tsv)*

| defined_class | defined_class_label | regulated_activity | regulated_activity_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0004862](http://purl.obolibrary.org/obo/GO_0004862) | cAMP-dependent protein kinase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0004691](http://purl.obolibrary.org/obo/GO_0004691) | cAMP-dependent protein kinase activity |
| [http://purl.obolibrary.org/obo/GO_0008427](http://purl.obolibrary.org/obo/GO_0008427) | calcium-dependent protein kinase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0010857](http://purl.obolibrary.org/obo/GO_0010857) | calcium-dependent protein kinase activity |
| [http://purl.obolibrary.org/obo/GO_0004861](http://purl.obolibrary.org/obo/GO_0004861) | cyclin-dependent protein serine/threonine kinase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0004693](http://purl.obolibrary.org/obo/GO_0004693) | cyclin-dependent protein serine/threonine kinase activity |
| [http://purl.obolibrary.org/obo/GO_0004857](http://purl.obolibrary.org/obo/GO_0004857) | enzyme inhibitor activity | [http://purl.obolibrary.org/obo/GO_0003824](http://purl.obolibrary.org/obo/GO_0003824) | catalytic activity |
| [http://purl.obolibrary.org/obo/GO_0019210](http://purl.obolibrary.org/obo/GO_0019210) | kinase inhibitor activity | [http://purl.obolibrary.org/obo/GO_0016301](http://purl.obolibrary.org/obo/GO_0016301) | kinase activity |

