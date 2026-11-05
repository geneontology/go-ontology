---
id: obo:go/releases/2026-11-05go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-11-05go.owl
was_generated_by:
  started_at_time: '2026-11-05T05:42:39.146363'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30919
    deprecated_class_count: 7097
    non_deprecated_class_count: 23822
    class_count_with_text_definitions: 30919
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40166
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2884
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4448
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 315
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2542
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2557
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 135
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93731
    synonym_statement_count: 94521
    change_summary:
      EdgeCreation: 531
      NodeRename: 228
      RemoveSynonym: 126
      NewSynonym: 74
      EdgeDeletion: 165
      RemoveNodeFromSubset: 15
      NodeTextDefinitionChange: 314
      NodeUnobsoletion: 186
      MappingCreation: 19
      RemoveMapping: 39
      NodeDeletion: 34
      AddNodeToSubset: 2
      All_Obsoletion: 0
      All_Synonym: 200
    edge_count: 53061
  molecular_function:
    id: molecular_function
    class_count: 12906
    deprecated_class_count: 2851
    non_deprecated_class_count: 10055
    class_count_with_text_definitions: 12906
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12299
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 802
      RO:0002212:
        facet: RO:0002212
        filtered_count: 80
      RO:0002213:
        facet: RO:0002213
        filtered_count: 65
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28788
    synonym_statement_count: 29942
    change_summary:
      NodeTextDefinitionChange: 131
      RemoveSynonym: 85
      NodeRename: 73
      RemoveMapping: 118
      NewSynonym: 46
      NodeDeletion: 51
      EdgeDeletion: 132
      MappingCreation: 36
      NodeUnobsoletion: 35
      EdgeCreation: 91
      RemoveNodeFromSubset: 1
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 131
    edge_count: 13569
  cellular_component:
    id: cellular_component
    class_count: 4609
    deprecated_class_count: 526
    non_deprecated_class_count: 4083
    class_count_with_text_definitions: 4609
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4702
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1802
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5136
    synonym_statement_count: 5335
    change_summary:
      NodeTextDefinitionChange: 29
      NodeUnobsoletion: 3
      EdgeCreation: 15
      NodeRename: 6
      RemoveSynonym: 4
      NewSynonym: 4
      EdgeDeletion: 21
      NodeDeletion: 9
      RemoveMapping: 2
      MappingCreation: 2
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 8
    edge_count: 6685
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
