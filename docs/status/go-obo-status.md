---
id: obo:go/releases/2026-05-28go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-05-28go.owl
was_generated_by:
  started_at_time: '2026-05-28T07:02:34.989290'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30878
    deprecated_class_count: 6742
    non_deprecated_class_count: 24136
    class_count_with_text_definitions: 30878
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40870
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2901
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4464
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 328
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2560
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2574
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93602
    synonym_statement_count: 94379
    change_summary:
      RemoveMapping: 123
      MappingCreation: 100
      NodeTextDefinitionChange: 360
      NodeUnobsoletion: 313
      NodeRename: 339
      EdgeCreation: 1197
      EdgeDeletion: 380
      RemoveSynonym: 50
      NewSynonym: 187
      NodeDeletion: 21
      RemoveNodeFromSubset: 6
      NodeObsoletion: 1
      AddNodeToSubset: 5
      All_Obsoletion: 1
      All_Synonym: 237
    edge_count: 53849
  molecular_function:
    id: molecular_function
    class_count: 12850
    deprecated_class_count: 2808
    non_deprecated_class_count: 10042
    class_count_with_text_definitions: 12850
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12269
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 794
      RO:0002212:
        facet: RO:0002212
        filtered_count: 76
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 234
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28645
    synonym_statement_count: 29792
    change_summary:
      NodeTextDefinitionChange: 115
      EdgeDeletion: 215
      EdgeCreation: 256
      NodeDeletion: 11
      RemoveMapping: 792
      NodeUnobsoletion: 26
      NodeRename: 54
      RemoveSynonym: 45
      NodeObsoletion: 1
      NewSynonym: 19
      MappingCreation: 13
      AddNodeToSubset: 3
      All_Obsoletion: 1
      All_Synonym: 64
    edge_count: 13521
  cellular_component:
    id: cellular_component
    class_count: 4597
    deprecated_class_count: 522
    non_deprecated_class_count: 4075
    class_count_with_text_definitions: 4597
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4693
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1802
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5106
    synonym_statement_count: 5304
    change_summary:
      NodeTextDefinitionChange: 8
      NodeUnobsoletion: 3
      NodeRename: 5
      EdgeCreation: 10
      EdgeDeletion: 9
      NodeDeletion: 2
      RemoveSynonym: 4
      NewSynonym: 1
      All_Obsoletion: 0
      All_Synonym: 5
    edge_count: 6676
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
