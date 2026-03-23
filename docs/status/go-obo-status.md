---
id: obo:go/releases/2026-03-23go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-03-23go.owl
was_generated_by:
  started_at_time: '2026-03-23T06:10:40.051128'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30853
    deprecated_class_count: 6429
    non_deprecated_class_count: 24424
    class_count_with_text_definitions: 30853
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41526
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2926
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4489
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 390
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2579
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2593
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93702
    synonym_statement_count: 94476
    change_summary:
      NodeTextDefinitionChange: 1785
      RemoveMapping: 320
      EdgeDeletion: 210
      EdgeCreation: 454
      NodeDeletion: 13
      NodeUnobsoletion: 136
      MappingCreation: 143
      NodeRename: 164
      RemoveNodeFromSubset: 25
      AddNodeToSubset: 10
      NewSynonym: 51
      RemoveSynonym: 37
      All_Obsoletion: 0
      All_Synonym: 88
    edge_count: 54655
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
      NodeRename: 212
      NodeTextDefinitionChange: 493
      RemoveMapping: 2562
      EdgeCreation: 230
      EdgeDeletion: 116
      RemoveSynonym: 159
      MappingCreation: 276
      NodeUnobsoletion: 77
      NodeDeletion: 14
      NodeObsoletion: 1
      NewSynonym: 39
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
      EdgeDeletion: 71
      EdgeCreation: 65
      NodeTextDefinitionChange: 124
      NodeDeletion: 9
      RemoveNodeFromSubset: 2
      RemoveSynonym: 6
      NodeRename: 6
      NewSynonym: 1
      NodeUnobsoletion: 2
      AddNodeToSubset: 3
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
