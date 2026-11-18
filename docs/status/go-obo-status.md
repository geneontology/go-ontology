---
id: obo:go/releases/2026-11-18go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-11-18go.owl
was_generated_by:
  started_at_time: '2026-11-18T05:41:24.604225'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30928
    deprecated_class_count: 7138
    non_deprecated_class_count: 23790
    class_count_with_text_definitions: 30928
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40112
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2876
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4441
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 314
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2534
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2550
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 136
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93748
    synonym_statement_count: 94538
    change_summary:
      RemoveSynonym: 136
      NewSynonym: 82
      NodeTextDefinitionChange: 364
      EdgeDeletion: 233
      EdgeCreation: 683
      NodeUnobsoletion: 227
      NodeRename: 269
      RemoveMapping: 79
      MappingCreation: 51
      NodeDeletion: 43
      RemoveNodeFromSubset: 17
      AddNodeToSubset: 2
      All_Obsoletion: 0
      All_Synonym: 218
    edge_count: 52977
  molecular_function:
    id: molecular_function
    class_count: 12911
    deprecated_class_count: 2853
    non_deprecated_class_count: 10058
    class_count_with_text_definitions: 12911
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12308
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
        filtered_count: 239
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28803
    synonym_statement_count: 29967
    change_summary:
      NodeDeletion: 56
      EdgeDeletion: 148
      MappingCreation: 6774
      RemoveMapping: 216
      NodeUnobsoletion: 37
      NodeTextDefinitionChange: 139
      NodeRename: 78
      EdgeCreation: 97
      RemoveSynonym: 94
      NewSynonym: 46
      NodeObsoletionWithDirectReplacement: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 140
    edge_count: 13579
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
      NodeRename: 6
      NodeTextDefinitionChange: 30
      EdgeDeletion: 21
      EdgeCreation: 15
      NodeDeletion: 9
      NodeUnobsoletion: 3
      RemoveMapping: 2
      MappingCreation: 2
      NewSynonym: 4
      RemoveNodeFromSubset: 1
      RemoveSynonym: 4
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
