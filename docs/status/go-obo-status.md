---
id: obo:go/releases/2026-11-27go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-11-27go.owl
was_generated_by:
  started_at_time: '2026-11-27T05:53:54.132740'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30930
    deprecated_class_count: 7173
    non_deprecated_class_count: 23757
    class_count_with_text_definitions: 30930
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40041
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2868
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4436
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 315
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2533
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2548
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 136
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93695
    synonym_statement_count: 94485
    change_summary:
      EdgeDeletion: 260
      EdgeCreation: 796
      RemoveNodeFromSubset: 25
      NodeTextDefinitionChange: 410
      NodeRename: 316
      NodeUnobsoletion: 263
      MappingCreation: 51
      NodeDeletion: 45
      RemoveMapping: 79
      RemoveSynonym: 163
      NewSynonym: 166
      AddNodeToSubset: 2
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 329
    edge_count: 52891
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
        filtered_count: 800
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
    distinct_synonym_count: 28803
    synonym_statement_count: 29967
    change_summary:
      MappingCreation: 6774
      NodeRename: 78
      RemoveSynonym: 94
      NewSynonym: 46
      RemoveMapping: 230
      EdgeDeletion: 148
      EdgeCreation: 100
      NodeTextDefinitionChange: 141
      NodeUnobsoletion: 37
      NodeDeletion: 56
      RemoveNodeFromSubset: 1
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 140
    edge_count: 13576
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
      NodeTextDefinitionChange: 30
      NodeDeletion: 9
      EdgeDeletion: 21
      NodeRename: 6
      NodeUnobsoletion: 3
      EdgeCreation: 15
      RemoveNodeFromSubset: 1
      RemoveMapping: 2
      MappingCreation: 2
      RemoveSynonym: 4
      NewSynonym: 4
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
