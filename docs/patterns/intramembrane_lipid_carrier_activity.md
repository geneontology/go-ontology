# intramembrane lipid carrier activity

[http://purl.obolibrary.org/obo/go/patterns/intramembrane_lipid_carrier_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/intramembrane_lipid_carrier_activity.yaml)

## Description

Cargo-differentiated intramembrane lipid carriers directly under GO:0140303 intramembrane lipid carrier activity, i.e. terms whose genus is GO:0140303 and which are not further specialised by translocation direction / energy source.
For direction-specific children, use one of the sibling patterns:
  - lipid_flippase_activity.yaml (genus GO:0140327 flippase activity;
    exoplasmic to cytosolic, ATP-driven)
  - lipid_floppase_activity.yaml (genus GO:0140328 floppase activity;
    cytosolic to exoplasmic, ATP-driven)

There is currently no cargo-differentiated pattern under GO:0017128 phospholipid scramblase activity (bidirectional, ATP-independent), since GO:0017128 has no logical-definition children in the ontology.
Do NOT use this pattern for intermembrane lipid transfer (use intermembrane_lipid_transfer_activity.yaml) or for generic lipid delivery to an acceptor molecule (use molecular_carrier_activity.yaml).





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{lipid_cargo}` | [lipid](http://purl.obolibrary.org/obo/CHEBI_18059) |

## Name

"`{lipid_cargo}` intramembrane carrier activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Enables the transport of `{lipid_cargo}` from a region of a membrane to a different region on the same membrane."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[intramembrane lipid carrier activity](http://purl.obolibrary.org/obo/GO_0140303)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{lipid_cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/intramembrane_lipid_carrier_activity.tsv)*

| defined_class | defined_class_label | lipid_cargo | lipid_cargo_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0008525](http://purl.obolibrary.org/obo/GO_0008525) | phosphatidylcholine intramembrane carrier activity | [http://purl.obolibrary.org/obo/CHEBI_64482](http://purl.obolibrary.org/obo/CHEBI_64482) | phosphatidylcholine |
| [http://purl.obolibrary.org/obo/GO_0046624](http://purl.obolibrary.org/obo/GO_0046624) | sphingolipid intramembrane carrier activity | [http://purl.obolibrary.org/obo/CHEBI_26739](http://purl.obolibrary.org/obo/CHEBI_26739) | sphingolipid |

