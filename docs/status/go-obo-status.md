---
id: obo:go/releases/2026-01-28go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-28go.owl
was_generated_by:
  started_at_time: '2026-01-28T05:47:31.759925'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30842
    deprecated_class_count: 6298
    non_deprecated_class_count: 24544
    class_count_with_text_definitions: 30842
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41717
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2936
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4491
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 416
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2580
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2594
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 139
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93712
    synonym_statement_count: 94485
    change_summary:
      NodeUnobsoletion: 635
      NodeRename: 696
      EdgeCreation: 2061
      NodeTextDefinitionChange: 711
      RemoveMapping: 302
      RemoveNodeFromSubset: 12
      EdgeDeletion: 321
      RemoveSynonym: 27
      NodeDeletion: 25
      AddNodeToSubset: 23
      NodeObsoletion: 1
      MappingCreation: 50
      NewSynonym: 72
      All_Obsoletion: 1
      All_Synonym: 99
    edge_count: 54887
  molecular_function:
    id: molecular_function
    class_count: 12825
    deprecated_class_count: 2701
    non_deprecated_class_count: 10124
    class_count_with_text_definitions: 12825
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12413
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 803
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
      NodeRename: 117
      RemoveSynonym: 52
      NewSynonym: 27
      NodeTextDefinitionChange: 158
      EdgeDeletion: 99
      EdgeCreation: 195
      RemoveMapping: 1467
      MappingCreation: 498
      NodeDeletion: 20
      NodeUnobsoletion: 40
      AddNodeToSubset: 20
      NodeObsoletionWithDirectReplacement: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 79
    edge_count: 13677
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
      RemoveSynonym: 26
      NodeRename: 22
      NodeTextDefinitionChange: 32
      EdgeDeletion: 45
      EdgeCreation: 27
      NodeDeletion: 12
      NodeUnobsoletion: 1
      RemoveNodeFromSubset: 1
      NewSynonym: 1
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
