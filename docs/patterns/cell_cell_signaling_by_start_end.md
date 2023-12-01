# cell–cell signaling by start and end cell types

[http://purl.obolibrary.org/obo/go/patterns/cell_cell_signaling_by_start_end.yaml](http://purl.obolibrary.org/obo/go/patterns/cell_cell_signaling_by_start_end.yaml)

## Description

This pattern is for classes representing cell–cell signaling, differentiated by the start and end cell types.




## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{start}` | [cell](http://purl.obolibrary.org/obo/CL_0000000) |
| `{end}` | [cell](http://purl.obolibrary.org/obo/CL_0000000) |

## Name

"`{start}`-`{end}` signaling"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations



## Definition

"Cell-cell signaling that mediates the transfer of information from a `{start}` to a `{end}`."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[cell-cell signaling](http://purl.obolibrary.org/obo/GO_0007267)  and ([has start location](http://purl.obolibrary.org/obo/RO_0002231) some `{start}`)  and ([has end location](http://purl.obolibrary.org/obo/RO_0002232) some `{end}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/cell_cell_signaling_by_start_end.tsv)*

| end_label | start_label | defined_class_label | end | start | defined_class |
|:--|:--|:--|:--|:--|:--|
| ventricular cardiac muscle cell | Purkinje myocyte | Purkinje myocyte to ventricular cardiac muscle cell signaling | [http://purl.obolibrary.org/obo/CL_2000046](http://purl.obolibrary.org/obo/CL_2000046) | [http://purl.obolibrary.org/obo/CL_0002068](http://purl.obolibrary.org/obo/CL_0002068) | [http://purl.obolibrary.org/obo/GO_0086029](http://purl.obolibrary.org/obo/GO_0086029) |
| dopaminergic neuron | astrocyte | astrocyte-dopaminergic neuron signaling | [http://purl.obolibrary.org/obo/CL_0000700](http://purl.obolibrary.org/obo/CL_0000700) | [http://purl.obolibrary.org/obo/CL_0000127](http://purl.obolibrary.org/obo/CL_0000127) | [http://purl.obolibrary.org/obo/GO_0036520](http://purl.obolibrary.org/obo/GO_0036520) |
| mesodermal cell | endodermal cell | endodermal-mesodermal cell signaling | [http://purl.obolibrary.org/obo/CL_0000222](http://purl.obolibrary.org/obo/CL_0000222) | [http://purl.obolibrary.org/obo/CL_0000223](http://purl.obolibrary.org/obo/CL_0000223) | [http://purl.obolibrary.org/obo/GO_0003133](http://purl.obolibrary.org/obo/GO_0003133) |
| mesenchymal cell | epithelial cell | epithelial-mesenchymal cell signaling | [http://purl.obolibrary.org/obo/CL_0008019](http://purl.obolibrary.org/obo/CL_0008019) | [http://purl.obolibrary.org/obo/CL_0000066](http://purl.obolibrary.org/obo/CL_0000066) | [http://purl.obolibrary.org/obo/GO_0060684](http://purl.obolibrary.org/obo/GO_0060684) |
| neuron | glial cell | glial cell-neuron signaling | [http://purl.obolibrary.org/obo/CL_0000540](http://purl.obolibrary.org/obo/CL_0000540) | [http://purl.obolibrary.org/obo/CL_0000125](http://purl.obolibrary.org/obo/CL_0000125) | [http://purl.obolibrary.org/obo/GO_0150098](http://purl.obolibrary.org/obo/GO_0150098) |

