---
id: obo:go/releases/2026-11-10go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-11-10go.owl
was_generated_by:
  started_at_time: '2026-11-10T05:40:20.049682'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30922
    deprecated_class_count: 7109
    non_deprecated_class_count: 23813
    class_count_with_text_definitions: 30922
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40147
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2881
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4448
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 315
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2539
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2555
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 135
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93734
    synonym_statement_count: 94524
    change_summary:
      EdgeCreation: 563
      NodeTextDefinitionChange: 330
      EdgeDeletion: 170
      NodeUnobsoletion: 198
      NodeRename: 240
      NodeDeletion: 37
      RemoveNodeFromSubset: 15
      RemoveSynonym: 134
      NewSynonym: 82
      RemoveMapping: 39
      MappingCreation: 19
      AddNodeToSubset: 2
      All_Obsoletion: 0
      All_Synonym: 216
    edge_count: 53034
  molecular_function:
    id: molecular_function
    class_count: 12908
    deprecated_class_count: 2853
    non_deprecated_class_count: 10055
    class_count_with_text_definitions: 12908
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12304
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
    distinct_synonym_count: 28795
    synonym_statement_count: 29958
    change_summary:
      RemoveSynonym: 92
      NewSynonym: 46
      NodeTextDefinitionChange: 136
      NodeDeletion: 53
      EdgeDeletion: 141
      EdgeCreation: 95
      NodeUnobsoletion: 37
      NodeRename: 77
      RemoveMapping: 206
      MappingCreation: 40
      NodeObsoletionWithDirectReplacement: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 138
    edge_count: 13574
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
      EdgeDeletion: 21
      EdgeCreation: 15
      NodeDeletion: 9
      NodeTextDefinitionChange: 29
      NodeRename: 6
      NodeUnobsoletion: 3
      RemoveSynonym: 4
      NewSynonym: 4
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
