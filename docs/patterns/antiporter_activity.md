# antiporter activity

[http://purl.obolibrary.org/obo/go/patterns/antiporter_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/antiporter_activity.yaml)

## Description

This pattern is for classes representing antiporter activities, differentiated by the type of inputs.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{input1}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) |
| `{input2}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) |

## Name

"`{input1}`:`{input2}` antiporter activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: `{input1}`(out) + `{input2}`(in) = `{input1}`(in) + `{input2}`(out)."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[antiporter activity](http://purl.obolibrary.org/obo/GO_0015297)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{input1}`)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{input2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/antiporter_activity.tsv)*

| input2 | input1_label | input2_label | defined_class_label | input1 | defined_class |
|:--|:--|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/CHEBI_16347](http://purl.obolibrary.org/obo/CHEBI_16347) | 4-(trimethylammonio)butanoate | (R)-carnitine | [(R)-carnitine:4-(trimethylammonio)butanoate antiporter activity](http://purl.obolibrary.org/obo/(R)-carnitine_4-(trimethylammonio)butanoate antiporter activity) | [http://purl.obolibrary.org/obo/CHEBI_16244](http://purl.obolibrary.org/obo/CHEBI_16244) | [http://purl.obolibrary.org/obo/GO_0044667](http://purl.obolibrary.org/obo/GO_0044667) |
| [http://purl.obolibrary.org/obo/CHEBI_16244](http://purl.obolibrary.org/obo/CHEBI_16244) | (R)-carnitine | 4-(trimethylammonio)butanoate | [(R)-carnitine:4-(trimethylammonio)butanoate antiporter activity](http://purl.obolibrary.org/obo/(R)-carnitine_4-(trimethylammonio)butanoate antiporter activity) | [http://purl.obolibrary.org/obo/CHEBI_16347](http://purl.obolibrary.org/obo/CHEBI_16347) | [http://purl.obolibrary.org/obo/GO_0044667](http://purl.obolibrary.org/obo/GO_0044667) |
| [http://purl.obolibrary.org/obo/CHEBI_456216](http://purl.obolibrary.org/obo/CHEBI_456216) | hydrogenphosphate | ADP(3-) | [ADP:phosphate antiporter activity](http://purl.obolibrary.org/obo/ADP_phosphate antiporter activity) | [http://purl.obolibrary.org/obo/CHEBI_43474](http://purl.obolibrary.org/obo/CHEBI_43474) | [http://purl.obolibrary.org/obo/GO_0140988](http://purl.obolibrary.org/obo/GO_0140988) |
| [http://purl.obolibrary.org/obo/CHEBI_43474](http://purl.obolibrary.org/obo/CHEBI_43474) | ADP(3-) | hydrogenphosphate | [ADP:phosphate antiporter activity](http://purl.obolibrary.org/obo/ADP_phosphate antiporter activity) | [http://purl.obolibrary.org/obo/CHEBI_456216](http://purl.obolibrary.org/obo/CHEBI_456216) | [http://purl.obolibrary.org/obo/GO_0140988](http://purl.obolibrary.org/obo/GO_0140988) |
| [http://purl.obolibrary.org/obo/CHEBI_456216](http://purl.obolibrary.org/obo/CHEBI_456216) | ATP(4-) | ADP(3-) | [ATP:ADP antiporter activity](http://purl.obolibrary.org/obo/ATP_ADP antiporter activity) | [http://purl.obolibrary.org/obo/CHEBI_30616](http://purl.obolibrary.org/obo/CHEBI_30616) | [http://purl.obolibrary.org/obo/GO_0005471](http://purl.obolibrary.org/obo/GO_0005471) |

