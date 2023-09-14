# vesicle-mediated transport differentiated by start and end locations

[http://purl.obolibrary.org/obo/go/patterns/vesicle_mediated_transport_from_to.yaml](http://purl.obolibrary.org/obo/go/patterns/vesicle_mediated_transport_from_to.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{start location}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{end location}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |

## Name

"`{start location}` to `{end location}` vesicle-mediated transport"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"The vesicle-mediated and directed movement of substances from `{start location}` to `{end location}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[vesicle-mediated transport](http://purl.obolibrary.org/obo/GO_0016192)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some `{start location}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{end location}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/vesicle_mediated_transport_differentiated_by_start_and_end_locations.tsv)*

| start_location_label | end_location | defined_class_label | end_location_label | start_location | defined_class |
|:--|:--|:--|:--|:--|:--|
| Golgi apparatus | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | Golgi to plasma membrane transport | plasma membrane | [http://purl.obolibrary.org/obo/GO_0005794](http://purl.obolibrary.org/obo/GO_0005794) | [http://purl.obolibrary.org/obo/GO_0006893](http://purl.obolibrary.org/obo/GO_0006893) |
| endosome | [http://purl.obolibrary.org/obo/GO_0005768](http://purl.obolibrary.org/obo/GO_0005768) | vesicle-mediated transport between endosomal compartments | endosome | [http://purl.obolibrary.org/obo/GO_0005768](http://purl.obolibrary.org/obo/GO_0005768) | [http://purl.obolibrary.org/obo/GO_0098927](http://purl.obolibrary.org/obo/GO_0098927) |

