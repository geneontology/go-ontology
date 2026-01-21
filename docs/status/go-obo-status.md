---
id: obo:go/releases/2026-01-21go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-21go.owl
was_generated_by:
  started_at_time: '2026-01-21T05:47:51.825757'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30839
    deprecated_class_count: 6290
    non_deprecated_class_count: 24549
    class_count_with_text_definitions: 30839
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41731
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2937
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4493
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 416
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2584
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2595
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 139
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93710
    synonym_statement_count: 94483
    change_summary:
      EdgeCreation: 2033
      EdgeDeletion: 315
      RemoveMapping: 302
      NodeUnobsoletion: 627
      NodeRename: 688
      NodeTextDefinitionChange: 703
      RemoveSynonym: 27
      NodeDeletion: 22
      RemoveNodeFromSubset: 12
      NewSynonym: 72
      AddNodeToSubset: 23
      MappingCreation: 50
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 99
    edge_count: 54909
  molecular_function:
    id: molecular_function
    class_count: 12824
    deprecated_class_count: 2701
    non_deprecated_class_count: 10123
    class_count_with_text_definitions: 12824
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12410
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 808
      RO:0002212:
        facet: RO:0002212
        filtered_count: 75
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28476
    synonym_statement_count: 29625
    change_summary:
      MappingCreation: 498
      NodeRename: 117
      RemoveMapping: 1467
      NodeTextDefinitionChange: 158
      NodeUnobsoletion: 40
      EdgeCreation: 183
      RemoveSynonym: 52
      NewSynonym: 27
      EdgeDeletion: 89
      AddNodeToSubset: 20
      RemoveNodeFromSubset: 1
      NodeDeletion: 19
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 79
    edge_count: 13679
  cellular_component:
    id: cellular_component
    class_count: 4586
    deprecated_class_count: 517
    non_deprecated_class_count: 4069
    class_count_with_text_definitions: 4586
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4663
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1826
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5076
    synonym_statement_count: 5274
    change_summary:
      NodeRename: 22
      RemoveSynonym: 26
      NodeTextDefinitionChange: 32
      EdgeDeletion: 45
      EdgeCreation: 27
      NodeDeletion: 12
      NodeUnobsoletion: 1
      NewSynonym: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 27
    edge_count: 6671
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
