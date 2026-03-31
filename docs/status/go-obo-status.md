---
id: obo:go/releases/2026-03-31go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-03-31go.owl
was_generated_by:
  started_at_time: '2026-03-31T06:18:22.339204'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30857
    deprecated_class_count: 6433
    non_deprecated_class_count: 24424
    class_count_with_text_definitions: 30857
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41532
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2925
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4490
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 388
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2579
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2592
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93701
    synonym_statement_count: 94475
    change_summary:
      NodeTextDefinitionChange: 1790
      EdgeCreation: 472
      RemoveMapping: 328
      EdgeDeletion: 231
      RemoveSynonym: 46
      NewSynonym: 68
      NodeRename: 175
      NodeUnobsoletion: 140
      MappingCreation: 143
      RemoveNodeFromSubset: 26
      AddNodeToSubset: 10
      NodeDeletion: 17
      All_Obsoletion: 0
      All_Synonym: 114
    edge_count: 54658
  molecular_function:
    id: molecular_function
    class_count: 12839
    deprecated_class_count: 2786
    non_deprecated_class_count: 10053
    class_count_with_text_definitions: 12839
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12302
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
        filtered_count: 232
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28596
    synonym_statement_count: 29744
    change_summary:
      RemoveMapping: 2563
      NodeTextDefinitionChange: 496
      NodeUnobsoletion: 80
      EdgeCreation: 240
      MappingCreation: 276
      NodeRename: 215
      EdgeDeletion: 120
      NewSynonym: 46
      RemoveSynonym: 159
      NodeDeletion: 14
      AddNodeToSubset: 3
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 205
    edge_count: 13556
  cellular_component:
    id: cellular_component
    class_count: 4595
    deprecated_class_count: 519
    non_deprecated_class_count: 4076
    class_count_with_text_definitions: 4595
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4693
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1805
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5099
    synonym_statement_count: 5297
    change_summary:
      NodeTextDefinitionChange: 124
      EdgeDeletion: 74
      EdgeCreation: 65
      RemoveSynonym: 6
      NewSynonym: 1
      NodeRename: 6
      NodeUnobsoletion: 2
      AddNodeToSubset: 3
      RemoveNodeFromSubset: 2
      NodeDeletion: 9
      All_Obsoletion: 0
      All_Synonym: 7
    edge_count: 6680
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
