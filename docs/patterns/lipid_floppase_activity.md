# lipid floppase activity

[http://purl.obolibrary.org/obo/go/patterns/lipid_floppase_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/lipid_floppase_activity.yaml)

## Description

Cargo-differentiated floppase activities under GO:0140328 floppase activity (catalysis of the movement of a lipid from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP).
Related patterns for the sibling families:
  - lipid_flippase_activity.yaml (genus GO:0140327; exoplasmic to
    cytosolic, ATP-driven)
  - intramembrane_lipid_carrier_activity.yaml (genus GO:0140303;
    cargo-differentiated terms not further specialised by direction)

ATP hydrolysis: GO:0140326 ATPase-coupled intramembrane lipid carrier activity (the parent of GO:0140327 and GO:0140328) asserts 'relationship: has_part GO:0016887 ATP hydrolysis activity' once; that axiom is inherited by every flippase / floppase child and should not be re-asserted on individual instances.





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{lipid_cargo}` | [lipid](http://purl.obolibrary.org/obo/CHEBI_18059) |

## Name

"`{lipid_cargo}` floppase activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Catalysis of the movement of `{lipid_cargo}` from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[floppase activity](http://purl.obolibrary.org/obo/GO_0140328)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{lipid_cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/lipid_floppase_activity.tsv)*

| defined_class | defined_class_label | lipid_cargo | lipid_cargo_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0099038](http://purl.obolibrary.org/obo/GO_0099038) | ceramide floppase activity | [http://purl.obolibrary.org/obo/CHEBI_17761](http://purl.obolibrary.org/obo/CHEBI_17761) | ceramide |
| [http://purl.obolibrary.org/obo/GO_0034202](http://purl.obolibrary.org/obo/GO_0034202) | glycolipid floppase activity | [http://purl.obolibrary.org/obo/CHEBI_33563](http://purl.obolibrary.org/obo/CHEBI_33563) | glycolipid |
| [http://purl.obolibrary.org/obo/GO_0015437](http://purl.obolibrary.org/obo/GO_0015437) | lipopolysaccharide floppase activity | [http://purl.obolibrary.org/obo/CHEBI_16412](http://purl.obolibrary.org/obo/CHEBI_16412) | lipopolysaccharide |
| [http://purl.obolibrary.org/obo/GO_0090554](http://purl.obolibrary.org/obo/GO_0090554) | phosphatidylcholine floppase activity | [http://purl.obolibrary.org/obo/CHEBI_64482](http://purl.obolibrary.org/obo/CHEBI_64482) | phosphatidylcholine |
| [http://purl.obolibrary.org/obo/GO_0046623](http://purl.obolibrary.org/obo/GO_0046623) | sphingolipid floppase activity | [http://purl.obolibrary.org/obo/CHEBI_26739](http://purl.obolibrary.org/obo/CHEBI_26739) | sphingolipid |

