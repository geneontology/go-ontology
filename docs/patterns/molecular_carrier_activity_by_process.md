# molecular carrier activity by transport process

[http://purl.obolibrary.org/obo/go/patterns/molecular_carrier_activity_by_process.yaml](http://purl.obolibrary.org/obo/go/patterns/molecular_carrier_activity_by_process.yaml)

## Description

Molecular carrier activities differentiated by the transport process they are part of, rather than by cargo. Use this pattern only when the cargo cannot be pinned to a single well-defined class (for example, a carrier that moves either proteins or RNAs), but the transport biological process is defined. When the cargo IS a single well-defined class, use molecular_carrier_activity.yaml instead. Prototype: GO:0140142 nucleocytoplasmic carrier activity (part_of GO:0006913 nucleocytoplasmic transport).
Note on the label template: '%s carrier activity' is a naming convention rather than a mechanical substitution. Filling the sole current instance mechanically gives 'nucleocytoplasmic transport carrier activity', where the curated label is 'nucleocytoplasmic carrier activity' - the trailing 'transport' from the process label is dropped. This is analogous to chemical_transport.yaml (where CHEBI labels are similarly not always substituted verbatim into the term name).





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{transport_process}` | [transport](http://purl.obolibrary.org/obo/GO_0006810) |

## Name

"`{transport_process}` carrier activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Binding to and carrying a cargo as part of `{transport_process}` by moving along with the cargo."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular carrier activity](http://purl.obolibrary.org/obo/GO_0140104)  and ([part of](http://purl.obolibrary.org/obo/BFO_0000050) some `{transport_process}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/molecular_carrier_activity_by_process.tsv)*

| defined_class | defined_class_label | transport_process | transport_process_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0140142](http://purl.obolibrary.org/obo/GO_0140142) | nucleocytoplasmic carrier activity | [http://purl.obolibrary.org/obo/GO_0006913](http://purl.obolibrary.org/obo/GO_0006913) | nucleocytoplasmic transport |

