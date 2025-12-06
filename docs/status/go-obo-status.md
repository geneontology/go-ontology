---
id: obo:go/releases/2025-12-06go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2025-12-06go.owl
was_generated_by:
  started_at_time: '2025-12-06T05:46:25.807671'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30833
    deprecated_class_count: 5691
    non_deprecated_class_count: 25142
    class_count_with_text_definitions: 30833
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 42938
      RO:0002211:
        facet: RO:0002211
        filtered_count: 3007
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4778
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 425
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2641
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2653
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 142
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93749
    synonym_statement_count: 94522
    change_summary:
      AddNodeToSubset: 9
      NodeUnobsoletion: 27
      NodeTextDefinitionChange: 70
      EdgeCreation: 106
      NodeRename: 59
      EdgeDeletion: 77
      RemoveMapping: 209
      MappingCreation: 5
      NodeDeletion: 16
      NewSynonym: 11
      RemoveSynonym: 6
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 17
    edge_count: 56598
  molecular_function:
    id: molecular_function
    class_count: 12818
    deprecated_class_count: 2669
    non_deprecated_class_count: 10149
    class_count_with_text_definitions: 12818
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12477
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 831
      RO:0002212:
        facet: RO:0002212
        filtered_count: 75
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 237
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 43
      RO:0002211:
        facet: RO:0002211
        filtered_count: 51
    distinct_synonym_count: 28467
    synonym_statement_count: 29616
    change_summary:
      MappingCreation: 498
      NodeTextDefinitionChange: 99
      NodeUnobsoletion: 8
      EdgeCreation: 37
      NodeRename: 61
      RemoveMapping: 1464
      EdgeDeletion: 41
      RemoveSynonym: 34
      AddNodeToSubset: 1
      NodeDeletion: 13
      NewSynonym: 16
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 50
    edge_count: 13777
  cellular_component:
    id: cellular_component
    class_count: 4580
    deprecated_class_count: 517
    non_deprecated_class_count: 4063
    class_count_with_text_definitions: 4580
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4656
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1822
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5059
    synonym_statement_count: 5256
    change_summary:
      NodeTextDefinitionChange: 29
      RemoveSynonym: 18
      NodeRename: 19
      EdgeDeletion: 21
      EdgeCreation: 14
      NodeDeletion: 6
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 18
    edge_count: 6660
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
