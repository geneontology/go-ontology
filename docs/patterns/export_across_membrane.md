# export across membrane

[http://purl.obolibrary.org/obo/go/patterns/export_across_membrane.yaml](http://purl.obolibrary.org/obo/go/patterns/export_across_membrane.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{membrane}` | [membrane](http://purl.obolibrary.org/obo/GO_0016020) |
| `{cargo}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) or [protein-containing complex](http://purl.obolibrary.org/obo/GO_0032991) or [transcript](http://purl.obolibrary.org/obo/SO_0000673) |
| `{start}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |
| `{end}` | [cellular_component](http://purl.obolibrary.org/obo/GO_0005575) |

## Name

"`{cargo}` export from `{start}` into `{end}`, across `{membrane}`"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [comment](http://www.w3.org/2000/01/rdf-schema#comment): "This term covers `{cargo}` *across* the `{membrane}`  through a channel or pore.  It does not cover export via vesicle fusion with `{membrane}`, as in this case transport does not involve crossing the membrane."^^[string](http://www.w3.org/2001/XMLSchema#string)
- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "biological_process"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"The directed export of `{cargo}` from `{start}`, across the `{membrane}` and into the `{end}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some `{start}`)  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some `{end}`)  and ([results in transport across](http://purl.obolibrary.org/obo/RO_0002342) some `{membrane}`)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/export_across_membrane.tsv)*

| start_label | defined_class_label | end | start | membrane | cargo_label | cargo | end_label | defined_class | membrane_label |
|:--|:--|:--|:--|:--|:--|:--|:--|:--|:--|
| extracellular region | 5-aminolevulinic acid import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | 5-ammoniolevulinate | [http://purl.obolibrary.org/obo/CHEBI_356416](http://purl.obolibrary.org/obo/CHEBI_356416) | cytosol | [http://purl.obolibrary.org/obo/GO_0140484](http://purl.obolibrary.org/obo/GO_0140484) | plasma membrane |
| extracellular region | D-aspartate import across plasma membrane | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | D-aspartate(1-) | [http://purl.obolibrary.org/obo/CHEBI_29990](http://purl.obolibrary.org/obo/CHEBI_29990) | cytosol | [http://purl.obolibrary.org/obo/GO_0070779](http://purl.obolibrary.org/obo/GO_0070779) | plasma membrane |
| cytosol | GDP-fucose import into Golgi lumen | [http://purl.obolibrary.org/obo/GO_0005796](http://purl.obolibrary.org/obo/GO_0005796) | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0000139](http://purl.obolibrary.org/obo/GO_0000139) | GDP-fucose | [http://purl.obolibrary.org/obo/CHEBI_64608](http://purl.obolibrary.org/obo/CHEBI_64608) | Golgi lumen | [http://purl.obolibrary.org/obo/GO_0036085](http://purl.obolibrary.org/obo/GO_0036085) | Golgi membrane |
| cytosol | GDP-fucose import into endoplasmic reticulum lumen | [http://purl.obolibrary.org/obo/GO_0005783](http://purl.obolibrary.org/obo/GO_0005783) | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005789](http://purl.obolibrary.org/obo/GO_0005789) | GDP-fucose | [http://purl.obolibrary.org/obo/CHEBI_64608](http://purl.obolibrary.org/obo/CHEBI_64608) | endoplasmic reticulum | [http://purl.obolibrary.org/obo/GO_0036084](http://purl.obolibrary.org/obo/GO_0036084) | endoplasmic reticulum membrane |
| cytosol | L-alanine export across the plasma membrane | [http://purl.obolibrary.org/obo/GO_0005576](http://purl.obolibrary.org/obo/GO_0005576) | [http://purl.obolibrary.org/obo/GO_0005829](http://purl.obolibrary.org/obo/GO_0005829) | [http://purl.obolibrary.org/obo/GO_0005886](http://purl.obolibrary.org/obo/GO_0005886) | L-alanine zwitterion | [http://purl.obolibrary.org/obo/CHEBI_57972](http://purl.obolibrary.org/obo/CHEBI_57972) | extracellular region | [http://purl.obolibrary.org/obo/GO_0140406](http://purl.obolibrary.org/obo/GO_0140406) | plasma membrane |

