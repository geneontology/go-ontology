# symporter activity

[http://purl.obolibrary.org/obo/go/patterns/symporter_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/symporter_activity.yaml)

## Description

This pattern is for classes representing symporter activities, differentiated by the type of inputs.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{input1}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) |
| `{input2}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) |

## Name

"`{input1}`:`{input2}` symporter activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: `{input1}`(out) + `{input2}`(out) = `{input1}`(in) + `{input2}`(in)."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[symporter activity](http://purl.obolibrary.org/obo/GO_0015293)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{input1}`)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{input2}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/symporter_activity.tsv)*

| input2 | input1_label | input2_label | defined_class_label | input1 | defined_class |
|:--|:--|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/CHEBI_57990](http://purl.obolibrary.org/obo/CHEBI_57990) | proton | 2-dehydro-3-deoxy-D-gluconate | [2-keto-3-deoxygluconate:proton symporter activity](http://purl.obolibrary.org/obo/2-keto-3-deoxygluconate_proton symporter activity) | [http://purl.obolibrary.org/obo/CHEBI_24636](http://purl.obolibrary.org/obo/CHEBI_24636) | [http://purl.obolibrary.org/obo/GO_0015649](http://purl.obolibrary.org/obo/GO_0015649) |
| [http://purl.obolibrary.org/obo/CHEBI_24636](http://purl.obolibrary.org/obo/CHEBI_24636) | 2-dehydro-3-deoxy-D-gluconate | proton | [2-keto-3-deoxygluconate:proton symporter activity](http://purl.obolibrary.org/obo/2-keto-3-deoxygluconate_proton symporter activity) | [http://purl.obolibrary.org/obo/CHEBI_57990](http://purl.obolibrary.org/obo/CHEBI_57990) | [http://purl.obolibrary.org/obo/GO_0015649](http://purl.obolibrary.org/obo/GO_0015649) |
| [http://purl.obolibrary.org/obo/CHEBI_65228](http://purl.obolibrary.org/obo/CHEBI_65228) | proton | 3-hydroxyphenyl propanoate | [3-hydroxyphenyl propionate:proton symporter activity](http://purl.obolibrary.org/obo/3-hydroxyphenyl propionate_proton symporter activity) | [http://purl.obolibrary.org/obo/CHEBI_24636](http://purl.obolibrary.org/obo/CHEBI_24636) | [http://purl.obolibrary.org/obo/GO_0015540](http://purl.obolibrary.org/obo/GO_0015540) |
| [http://purl.obolibrary.org/obo/CHEBI_24636](http://purl.obolibrary.org/obo/CHEBI_24636) | 3-hydroxyphenyl propanoate | proton | [3-hydroxyphenyl propionate:proton symporter activity](http://purl.obolibrary.org/obo/3-hydroxyphenyl propionate_proton symporter activity) | [http://purl.obolibrary.org/obo/CHEBI_65228](http://purl.obolibrary.org/obo/CHEBI_65228) | [http://purl.obolibrary.org/obo/GO_0015540](http://purl.obolibrary.org/obo/GO_0015540) |
| [http://purl.obolibrary.org/obo/CHEBI_24636](http://purl.obolibrary.org/obo/CHEBI_24636) | D-glucose | proton | [D-glucose:proton symporter activity](http://purl.obolibrary.org/obo/D-glucose_proton symporter activity) | [http://purl.obolibrary.org/obo/CHEBI_17634](http://purl.obolibrary.org/obo/CHEBI_17634) | [http://purl.obolibrary.org/obo/GO_0055055](http://purl.obolibrary.org/obo/GO_0055055) |

