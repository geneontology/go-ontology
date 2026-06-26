---
id: obo:go/releases/2026-06-26go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-06-26go.owl
was_generated_by:
  started_at_time: '2026-06-26T07:05:24.697343'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30883
    deprecated_class_count: 6768
    non_deprecated_class_count: 24115
    class_count_with_text_definitions: 30883
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40821
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2900
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4463
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 328
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2559
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2572
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 137
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93606
    synonym_statement_count: 94384
    change_summary:
      MappingCreation: 13
      EdgeDeletion: 339
      EdgeCreation: 356
      RemoveMapping: 29
      NodeTextDefinitionChange: 53
      NodeUnobsoletion: 30
      NodeRename: 50
      NewSynonym: 140
      RemoveSynonym: 101
      NodeDeletion: 9
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 241
    edge_count: 53794
  molecular_function:
    id: molecular_function
    class_count: 12853
    deprecated_class_count: 2811
    non_deprecated_class_count: 10042
    class_count_with_text_definitions: 12853
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12269
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 795
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
    distinct_synonym_count: 28648
    synonym_statement_count: 29795
    change_summary:
      RemoveMapping: 161
      MappingCreation: 95
      NodeTextDefinitionChange: 18
      EdgeCreation: 15
      NodeUnobsoletion: 13
      NodeRename: 13
      EdgeDeletion: 6
      NodeDeletion: 3
      RemoveSynonym: 14
      NewSynonym: 2
      All_Obsoletion: 0
      All_Synonym: 16
    edge_count: 13522
  cellular_component:
    id: cellular_component
    class_count: 4598
    deprecated_class_count: 523
    non_deprecated_class_count: 4075
    class_count_with_text_definitions: 4598
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
    distinct_synonym_count: 5111
    synonym_statement_count: 5310
    change_summary:
      NodeTextDefinitionChange: 2
      EdgeDeletion: 2
      EdgeCreation: 2
      RemoveSynonym: 3
      NewSynonym: 1
      NodeDeletion: 1
      NodeRename: 2
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 4
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
