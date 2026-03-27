---
id: obo:go/releases/2026-03-27go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-03-27go.owl
was_generated_by:
  started_at_time: '2026-03-27T06:17:49.903769'
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
        filtered_count: 41531
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
    distinct_synonym_count: 93699
    synonym_statement_count: 94473
    change_summary:
      NodeTextDefinitionChange: 1790
      MappingCreation: 143
      RemoveMapping: 322
      EdgeCreation: 470
      EdgeDeletion: 228
      RemoveNodeFromSubset: 26
      NodeUnobsoletion: 140
      NodeRename: 175
      RemoveSynonym: 44
      AddNodeToSubset: 10
      NodeDeletion: 17
      NewSynonym: 68
      All_Obsoletion: 0
      All_Synonym: 112
    edge_count: 54657
  molecular_function:
    id: molecular_function
    class_count: 12839
    deprecated_class_count: 2783
    non_deprecated_class_count: 10056
    class_count_with_text_definitions: 12839
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12301
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 800
      RO:0002212:
        facet: RO:0002212
        filtered_count: 76
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 237
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28602
    synonym_statement_count: 29751
    change_summary:
      NodeTextDefinitionChange: 493
      EdgeDeletion: 116
      EdgeCreation: 230
      NodeRename: 212
      NodeUnobsoletion: 77
      MappingCreation: 276
      RemoveMapping: 2562
      NodeDeletion: 14
      RemoveSynonym: 159
      NewSynonym: 39
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 198
    edge_count: 13562
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
        filtered_count: 4691
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1804
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5099
    synonym_statement_count: 5297
    change_summary:
      NodeTextDefinitionChange: 124
      EdgeDeletion: 71
      EdgeCreation: 65
      NodeUnobsoletion: 2
      AddNodeToSubset: 3
      NodeRename: 6
      NodeDeletion: 9
      RemoveSynonym: 6
      NewSynonym: 1
      RemoveNodeFromSubset: 2
      All_Obsoletion: 0
      All_Synonym: 7
    edge_count: 6677
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
