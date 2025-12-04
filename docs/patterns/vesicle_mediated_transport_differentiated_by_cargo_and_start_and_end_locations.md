# vesicle-mediated transport differentiated by cargo and start and end locations

[http://purl.obolibrary.org/obo/go/patterns/vesicle_mediated_transport_differentiated_by_cargo_and_start_and_end_locations.yaml](http://purl.obolibrary.org/obo/go/patterns/vesicle_mediated_transport_differentiated_by_cargo_and_start_and_end_locations.yaml)

## Description

This pattern is for representing transmembrane transport, differentiated by the type of cargo as well as the start and end locations.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{cargo}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) |
| `{start location}` | [cellular anatomical structure](http://purl.obolibrary.org/obo/GO_0110165) |
| `{end location}` | [cellular anatomical structure](http://purl.obolibrary.org/obo/GO_0110165) |

## Name

"`{cargo}` vesicle-mediated transport from `{start location}` to `{end location}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"The vesicle-mediated and directed movement of `{cargo}` from `{start location}` to `{end location}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[vesicle-mediated transport](http://purl.obolibrary.org/obo/GO_0016192)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some `{start location}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{end location}`)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/vesicle_mediated_transport_differentiated_by_cargo_and_start_and_end_locations.tsv)*

|  |
|


