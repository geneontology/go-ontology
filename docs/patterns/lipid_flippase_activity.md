# lipid flippase activity

[http://purl.obolibrary.org/obo/go/patterns/lipid_flippase_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/lipid_flippase_activity.yaml)

## Description

Cargo-differentiated flippase activities under GO:0140327 flippase activity (catalysis of the movement of lipids from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP).
Related patterns for the sibling families:
  - lipid_floppase_activity.yaml (genus GO:0140328; cytosolic to
    exoplasmic, ATP-driven)
  - intramembrane_lipid_carrier_activity.yaml (genus GO:0140303;
    cargo-differentiated terms not further specialised by direction)

ATP hydrolysis: GO:0140326 ATPase-coupled intramembrane lipid carrier activity (the parent of GO:0140327 and GO:0140328) asserts 'relationship: has_part GO:0016887 ATP hydrolysis activity' once; that axiom is inherited by every flippase / floppase child and should not be re-asserted on individual instances.





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{lipid_cargo}` | [lipid](http://purl.obolibrary.org/obo/CHEBI_18059) |

## Name

"`{lipid_cargo}` flippase activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Catalysis of the movement of `{lipid_cargo}` from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[flippase activity](http://purl.obolibrary.org/obo/GO_0140327)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{lipid_cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/lipid_flippase_activity.tsv)*

| defined_class | defined_class_label | lipid_cargo | lipid_cargo_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0015247](http://purl.obolibrary.org/obo/GO_0015247) | aminophospholipid flippase activity | [http://purl.obolibrary.org/obo/CHEBI_60971](http://purl.obolibrary.org/obo/CHEBI_60971) | aminophospholipid |
| [http://purl.obolibrary.org/obo/GO_0140333](http://purl.obolibrary.org/obo/GO_0140333) | glycerophospholipid flippase activity | [http://purl.obolibrary.org/obo/CHEBI_37739](http://purl.obolibrary.org/obo/CHEBI_37739) | glycerophospholipid |
| [http://purl.obolibrary.org/obo/GO_0140351](http://purl.obolibrary.org/obo/GO_0140351) | glycosylceramide flippase activity | [http://purl.obolibrary.org/obo/CHEBI_62941](http://purl.obolibrary.org/obo/CHEBI_62941) | glycosylceramide |
| [http://purl.obolibrary.org/obo/GO_0140348](http://purl.obolibrary.org/obo/GO_0140348) | lysophosphatidylcholine flippase activity | [http://purl.obolibrary.org/obo/CHEBI_60479](http://purl.obolibrary.org/obo/CHEBI_60479) | lysophosphatidylcholine |
| [http://purl.obolibrary.org/obo/GO_0140345](http://purl.obolibrary.org/obo/GO_0140345) | phosphatidylcholine flippase activity | [http://purl.obolibrary.org/obo/CHEBI_64482](http://purl.obolibrary.org/obo/CHEBI_64482) | phosphatidylcholine |

