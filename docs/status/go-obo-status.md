---
id: obo:go/releases/2026-01-25go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-25go.owl
was_generated_by:
  started_at_time: '2026-01-25T05:47:44.279594'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30840
    deprecated_class_count: 6293
    non_deprecated_class_count: 24547
    class_count_with_text_definitions: 30840
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41724
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
        filtered_count: 2581
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
      NodeUnobsoletion: 630
      EdgeCreation: 2044
      NodeRename: 691
      NodeTextDefinitionChange: 706
      EdgeDeletion: 316
      AddNodeToSubset: 23
      RemoveSynonym: 27
      NewSynonym: 72
      RemoveMapping: 302
      RemoveNodeFromSubset: 12
      MappingCreation: 50
      NodeDeletion: 23
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 99
    edge_count: 54899
  molecular_function:
    id: molecular_function
    class_count: 12825
    deprecated_class_count: 2702
    non_deprecated_class_count: 10123
    class_count_with_text_definitions: 12825
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12412
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
      MappingCreation: 498
      RemoveMapping: 1467
      NodeTextDefinitionChange: 159
      EdgeCreation: 196
      NodeRename: 118
      RemoveSynonym: 52
      NewSynonym: 27
      NodeUnobsoletion: 41
      AddNodeToSubset: 20
      NodeObsoletionWithDirectReplacement: 1
      EdgeDeletion: 99
      NodeDeletion: 20
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 79
    edge_count: 13676
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
      NodeDeletion: 12
      EdgeDeletion: 45
      NodeRename: 22
      NodeTextDefinitionChange: 32
      RemoveSynonym: 26
      EdgeCreation: 27
      NewSynonym: 1
      RemoveNodeFromSubset: 1
      NodeUnobsoletion: 1
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
