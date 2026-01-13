---
id: obo:go/releases/2026-01-13go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-13go.owl
was_generated_by:
  started_at_time: '2026-01-13T05:49:33.683615'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30836
    deprecated_class_count: 6236
    non_deprecated_class_count: 24600
    class_count_with_text_definitions: 30836
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41824
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2938
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4498
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 418
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2585
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2596
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 139
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93708
    synonym_statement_count: 94481
    change_summary:
      RemoveNodeFromSubset: 2
      EdgeDeletion: 281
      EdgeCreation: 1896
      NodeTextDefinitionChange: 644
      NodeRename: 627
      NodeUnobsoletion: 572
      MappingCreation: 17
      RemoveMapping: 224
      AddNodeToSubset: 23
      RemoveSynonym: 25
      NewSynonym: 72
      NodeDeletion: 19
      All_Obsoletion: 0
      All_Synonym: 97
    edge_count: 55012
  molecular_function:
    id: molecular_function
    class_count: 12822
    deprecated_class_count: 2701
    non_deprecated_class_count: 10121
    class_count_with_text_definitions: 12822
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12410
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 807
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
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28475
    synonym_statement_count: 29624
    change_summary:
      RemoveMapping: 1467
      MappingCreation: 498
      EdgeDeletion: 84
      EdgeCreation: 180
      NodeDeletion: 17
      NodeTextDefinitionChange: 155
      NodeRename: 113
      RemoveSynonym: 49
      NodeUnobsoletion: 40
      NewSynonym: 24
      AddNodeToSubset: 20
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 73
    edge_count: 13677
  cellular_component:
    id: cellular_component
    class_count: 4585
    deprecated_class_count: 517
    non_deprecated_class_count: 4068
    class_count_with_text_definitions: 4585
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4663
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1827
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5074
    synonym_statement_count: 5271
    change_summary:
      RemoveSynonym: 25
      NodeTextDefinitionChange: 31
      NodeRename: 21
      NodeDeletion: 11
      EdgeDeletion: 36
      EdgeCreation: 17
      NewSynonym: 1
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 26
    edge_count: 6672
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
