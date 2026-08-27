---
id: obo:go/releases/2026-08-27go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-08-27go.owl
was_generated_by:
  started_at_time: '2026-08-27T08:20:29.895238'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30898
    deprecated_class_count: 6965
    non_deprecated_class_count: 23933
    class_count_with_text_definitions: 30898
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40407
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2887
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4467
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 335
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2545
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2560
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 135
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93655
    synonym_statement_count: 94435
    change_summary:
      RemoveNodeFromSubset: 5
      EdgeCreation: 138
      NodeTextDefinitionChange: 90
      NodeUnobsoletion: 54
      NodeRename: 59
      NodeDeletion: 13
      EdgeDeletion: 61
      RemoveSynonym: 17
      NewSynonym: 11
      AddNodeToSubset: 1
      All_Obsoletion: 0
      All_Synonym: 28
    edge_count: 53350
  molecular_function:
    id: molecular_function
    class_count: 12870
    deprecated_class_count: 2828
    non_deprecated_class_count: 10042
    class_count_with_text_definitions: 12870
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12283
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 795
      RO:0002212:
        facet: RO:0002212
        filtered_count: 78
      RO:0002213:
        facet: RO:0002213
        filtered_count: 64
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28700
    synonym_statement_count: 29853
    change_summary:
      EdgeDeletion: 49
      NodeUnobsoletion: 15
      NodeTextDefinitionChange: 31
      EdgeCreation: 35
      NodeRename: 20
      RemoveSynonym: 23
      MappingCreation: 17
      NodeDeletion: 15
      NewSynonym: 9
      RemoveNodeFromSubset: 1
      NodeObsoletionWithDirectReplacement: 1
      RemoveMapping: 11
      All_Obsoletion: 1
      All_Synonym: 32
    edge_count: 13542
  cellular_component:
    id: cellular_component
    class_count: 4607
    deprecated_class_count: 524
    non_deprecated_class_count: 4083
    class_count_with_text_definitions: 4607
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4702
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1804
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5129
    synonym_statement_count: 5328
    change_summary:
      EdgeCreation: 5
      NodeUnobsoletion: 1
      NodeTextDefinitionChange: 3
      NodeRename: 2
      NodeDeletion: 7
      EdgeDeletion: 13
      RemoveSynonym: 3
      NewSynonym: 4
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 7
    edge_count: 6687
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
