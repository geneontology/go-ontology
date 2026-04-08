---
id: obo:go/releases/2026-04-08go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-04-08go.owl
was_generated_by:
  started_at_time: '2026-04-08T06:14:36.659749'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30864
    deprecated_class_count: 6463
    non_deprecated_class_count: 24401
    class_count_with_text_definitions: 30864
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41398
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2924
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4488
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 388
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2578
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2591
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93719
    synonym_statement_count: 94496
    change_summary:
      NodeRename: 39
      NodeTextDefinitionChange: 49
      NodeUnobsoletion: 34
      EdgeCreation: 211
      EdgeDeletion: 64
      MappingCreation: 4
      RemoveSynonym: 14
      RemoveMapping: 11
      NodeDeletion: 7
      NewSynonym: 11
      All_Obsoletion: 0
      All_Synonym: 25
    edge_count: 54519
  molecular_function:
    id: molecular_function
    class_count: 12840
    deprecated_class_count: 2790
    non_deprecated_class_count: 10050
    class_count_with_text_definitions: 12840
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12282
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 798
      RO:0002212:
        facet: RO:0002212
        filtered_count: 76
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 232
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28598
    synonym_statement_count: 29746
    change_summary:
      EdgeCreation: 96
      EdgeDeletion: 70
      RemoveSynonym: 4
      NewSynonym: 9
      NodeRename: 9
      NodeTextDefinitionChange: 8
      NodeUnobsoletion: 7
      AddNodeToSubset: 3
      NodeDeletion: 1
      RemoveMapping: 1
      All_Obsoletion: 0
      All_Synonym: 13
    edge_count: 13536
  cellular_component:
    id: cellular_component
    class_count: 4595
    deprecated_class_count: 520
    non_deprecated_class_count: 4075
    class_count_with_text_definitions: 4595
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4692
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5099
    synonym_statement_count: 5297
    change_summary:
      EdgeCreation: 6
      EdgeDeletion: 5
      NodeTextDefinitionChange: 3
      NodeRename: 1
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 0
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
