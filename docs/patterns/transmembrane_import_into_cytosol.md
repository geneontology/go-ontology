# transmembrane import into cytosol

[http://purl.obolibrary.org/obo/go/patterns/transmembrane_import_into_cytosol.yaml](http://purl.obolibrary.org/obo/go/patterns/transmembrane_import_into_cytosol.yaml)

## Description

TODO




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{imported}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) or [GO_0043234](http://purl.obolibrary.org/obo/GO_0043234) |

## Name

"`{imported}` import across plasma membrane"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"The directed movement of `{imported}` from outside of a cell, across the plasma membrane and into the cytoplasmic compartment."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some [extracellular region](http://purl.obolibrary.org/obo/GO_0005576))  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some [cytosol](http://purl.obolibrary.org/obo/GO_0005829))  and ([results in transport across](http://purl.obolibrary.org/obo/RO_0002342) some [plasma membrane](http://purl.obolibrary.org/obo/GO_0005886))  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{imported}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/transmembrane_import_into_cytosol.tsv)*

| defined_class | defined_class_label | imported | imported_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0140484](http://purl.obolibrary.org/obo/GO_0140484) | 5-aminolevulinic acid import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_356416](http://purl.obolibrary.org/obo/CHEBI_356416) | 5-ammoniolevulinate |
| [http://purl.obolibrary.org/obo/GO_0070779](http://purl.obolibrary.org/obo/GO_0070779) | D-aspartate import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_29990](http://purl.obolibrary.org/obo/CHEBI_29990) | D-aspartate(1-) |
| [http://purl.obolibrary.org/obo/GO_1904273](http://purl.obolibrary.org/obo/GO_1904273) | L-alanine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_57972](http://purl.obolibrary.org/obo/CHEBI_57972) | L-alanine zwitterion |
| [http://purl.obolibrary.org/obo/GO_0097638](http://purl.obolibrary.org/obo/GO_0097638) | L-arginine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_32682](http://purl.obolibrary.org/obo/CHEBI_32682) | L-argininium(1+) |
| [http://purl.obolibrary.org/obo/GO_1903811](http://purl.obolibrary.org/obo/GO_1903811) | L-asparagine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_58048](http://purl.obolibrary.org/obo/CHEBI_58048) | L-asparagine zwitterion |

