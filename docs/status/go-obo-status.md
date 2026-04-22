---
id: obo:go/releases/2026-04-22go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-04-22go.owl
was_generated_by:
  started_at_time: '2026-04-22T06:19:33.178911'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30865
    deprecated_class_count: 6504
    non_deprecated_class_count: 24361
    class_count_with_text_definitions: 30865
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41300
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2923
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4485
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 388
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2576
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2590
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93722
    synonym_statement_count: 94500
    change_summary:
      NodeRename: 86
      NodeTextDefinitionChange: 94
      RemoveSynonym: 31
      NodeUnobsoletion: 75
      EdgeCreation: 432
      EdgeDeletion: 180
      RemoveMapping: 12
      NewSynonym: 25
      NodeDeletion: 8
      MappingCreation: 11
      AddNodeToSubset: 2
      All_Obsoletion: 0
      All_Synonym: 56
    edge_count: 54414
  molecular_function:
    id: molecular_function
    class_count: 12846
    deprecated_class_count: 2791
    non_deprecated_class_count: 10055
    class_count_with_text_definitions: 12846
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12282
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 798
      RO:0002212:
        facet: RO:0002212
        filtered_count: 76
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 233
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28614
    synonym_statement_count: 29761
    change_summary:
      RemoveMapping: 767
      EdgeDeletion: 124
      EdgeCreation: 149
      NodeDeletion: 7
      NewSynonym: 13
      NodeTextDefinitionChange: 72
      NodeRename: 22
      RemoveSynonym: 12
      NodeUnobsoletion: 9
      MappingCreation: 5
      AddNodeToSubset: 3
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 25
    edge_count: 13537
  cellular_component:
    id: cellular_component
    class_count: 4595
    deprecated_class_count: 521
    non_deprecated_class_count: 4074
    class_count_with_text_definitions: 4595
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4692
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5101
    synonym_statement_count: 5299
    change_summary:
      NodeRename: 3
      NodeTextDefinitionChange: 6
      RemoveSynonym: 2
      EdgeDeletion: 6
      NodeUnobsoletion: 2
      EdgeCreation: 7
      All_Obsoletion: 0
      All_Synonym: 2
    edge_count: 6676
  external:
    id: external
    class_count: 0
    deprecated_class_count: 0
    non_deprecated_class_count: 0
    class_count_with_text_definitions: 0
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subPropertyOf:
        facet: rdfs:subPropertyOf
        filtered_count: 3
      owl:inverseOf:
        facet: owl:inverseOf
        filtered_count: 1
    distinct_synonym_count: 0
    synonym_statement_count: 0
    edge_count: 4
---

# Status and change summary since last release for go.obo

## biological process

- terms: {{ page.partitions.biological_process.class_count }}
  - active: {{ page.partitions.biological_process.non_deprecated_class_count }}
  - obsolete: {{ page.partitions.biological_process.deprecated_class_count }}
- relations: {{ page.partitions.biological_process.edge_count }}
- since last release:
  - terms:
    - added: {{ page.partitions.biological_process.change_summary.NodeDeletion }}
    - obsoleted: {{ page.partitions.biological_process.change_summary.NodeUnobsoletion }}
    - missing: {{ page.partitions.biological_process.change_summary.ClassCreation }}
  - relations:
    - added: {{ page.partitions.biological_process.change_summary.EdgeDeletion }}
    - removed: {{ page.partitions.biological_process.change_summary.EdgeCreation }}

## molecular function

- terms: {{ page.partitions.molecular_function.class_count }}
  - active: {{ page.partitions.molecular_function.non_deprecated_class_count }}
  - obsolete: {{ page.partitions.molecular_function.deprecated_class_count }}
- relations: {{ page.partitions.molecular_function.edge_count }}
- since last release:
  - terms:
    - added: {{ page.partitions.molecular_function.change_summary.NodeDeletion }}
    - obsoleted: {{ page.partitions.molecular_function.change_summary.NodeUnobsoletion }}
    - missing: {{ page.partitions.molecular_function.change_summary.ClassCreation }}
  - relations:
    - added: {{ page.partitions.molecular_function.change_summary.EdgeDeletion }}
    - removed: {{ page.partitions.molecular_function.change_summary.EdgeCreation }}

## cellular component

- terms: {{ page.partitions.cellular_component.class_count }}
  - active: {{ page.partitions.cellular_component.non_deprecated_class_count }}
  - obsolete: {{ page.partitions.cellular_component.deprecated_class_count }}
- relations: {{ page.partitions.cellular_component.edge_count }}
- since last release:
  - terms:
    - added: {{ page.partitions.cellular_component.change_summary.NodeDeletion }}
    - obsoleted: {{ page.partitions.cellular_component.change_summary.NodeUnobsoletion }}
    - missing: {{ page.partitions.cellular_component.change_summary.ClassCreation }}
  - relations:
    - added: {{ page.partitions.cellular_component.change_summary.EdgeDeletion }}
    - removed: {{ page.partitions.cellular_component.change_summary.EdgeCreation }}
