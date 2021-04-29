# transmembrane_import_into_cytosol

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

[transport](http://purl.obolibrary.org/obo/GO_0006810)  and ([has target start location](http://purl.obolibrary.org/obo/RO_0002338) some [extracellular region](http://purl.obolibrary.org/obo/GO_0005576))  and ([has target end location](http://purl.obolibrary.org/obo/RO_0002339) some [cytosol](http://purl.obolibrary.org/obo/GO_0005829))  and ([imports](http://purl.obolibrary.org/obo/RO_0002340) some `{imported}`)  and ([results in transport across](http://purl.obolibrary.org/obo/RO_0002342) some [plasma membrane](http://purl.obolibrary.org/obo/GO_0005886))







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/transmembrane_import_into_cell.tsv)*

| defined_class | defined_class_label | imported | imported_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0070779](http://purl.obolibrary.org/obo/GO_0070779) | D-aspartate import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_29994](http://purl.obolibrary.org/obo/CHEBI_29994) | D-aspartate(2-) |
| [http://purl.obolibrary.org/obo/GO_1904273](http://purl.obolibrary.org/obo/GO_1904273) | L-alanine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_16977](http://purl.obolibrary.org/obo/CHEBI_16977) | L-alanine |
| [http://purl.obolibrary.org/obo/GO_0097638](http://purl.obolibrary.org/obo/GO_0097638) | L-arginine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_16467](http://purl.obolibrary.org/obo/CHEBI_16467) | L-arginine |
| [http://purl.obolibrary.org/obo/GO_1903811](http://purl.obolibrary.org/obo/GO_1903811) | L-asparagine import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_17196](http://purl.obolibrary.org/obo/CHEBI_17196) | L-asparagine |
| [http://purl.obolibrary.org/obo/GO_0098712](http://purl.obolibrary.org/obo/GO_0098712) | L-glutamate import across plasma membrane | [http://purl.obolibrary.org/obo/CHEBI_29985](http://purl.obolibrary.org/obo/CHEBI_29985) | L-glutamate(1-) |

