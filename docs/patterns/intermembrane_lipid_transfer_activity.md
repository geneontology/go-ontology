# intermembrane lipid transfer activity

[http://purl.obolibrary.org/obo/go/patterns/intermembrane_lipid_transfer_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/intermembrane_lipid_transfer_activity.yaml)

## Description

Lipid transfer activities differentiated by the specific lipid cargo. A refinement of the generic molecular_carrier_activity pattern where the cargo is a lipid and delivery involves extraction from one membrane or monolayer lipid particle, transit through the aqueous phase in a hydrophobic pocket, and deposition into an acceptor membrane or lipid particle. Inherits both is_a lipid carrier activity (GO:0005319) and is_a transporter activity (GO:0005215) via the parent GO:0120013. Do NOT use this pattern for cross-leaflet (intramembrane) lipid movement - use intramembrane_lipid_carrier_activity.yaml for that.





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{lipid_cargo}` | [lipid](http://purl.obolibrary.org/obo/CHEBI_18059) |

## Name

"`{lipid_cargo}` transfer activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Removes a `{lipid_cargo}` from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[lipid transfer activity](http://purl.obolibrary.org/obo/GO_0120013)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{lipid_cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/intermembrane_lipid_transfer_activity.tsv)*

| defined_class | defined_class_label | lipid_cargo | lipid_cargo_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0120017](http://purl.obolibrary.org/obo/GO_0120017) | ceramide transfer activity | [http://purl.obolibrary.org/obo/CHEBI_17761](http://purl.obolibrary.org/obo/CHEBI_17761) | ceramide |
| [http://purl.obolibrary.org/obo/GO_0140340](http://purl.obolibrary.org/obo/GO_0140340) | cerebroside transfer activity | [http://purl.obolibrary.org/obo/CHEBI_23079](http://purl.obolibrary.org/obo/CHEBI_23079) | cerebroside |
| [http://purl.obolibrary.org/obo/GO_0140337](http://purl.obolibrary.org/obo/GO_0140337) | diacylglyceride transfer activity | [http://purl.obolibrary.org/obo/CHEBI_18035](http://purl.obolibrary.org/obo/CHEBI_18035) | diglyceride |
| [http://purl.obolibrary.org/obo/GO_0017089](http://purl.obolibrary.org/obo/GO_0017089) | glycolipid transfer activity | [http://purl.obolibrary.org/obo/CHEBI_33563](http://purl.obolibrary.org/obo/CHEBI_33563) | glycolipid |
| [http://purl.obolibrary.org/obo/GO_0140332](http://purl.obolibrary.org/obo/GO_0140332) | lipopolysaccharide transfer activity | [http://purl.obolibrary.org/obo/CHEBI_16412](http://purl.obolibrary.org/obo/CHEBI_16412) | lipopolysaccharide |

