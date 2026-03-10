---
id: obo:go/releases/2026-03-10go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-03-10go.owl
was_generated_by:
  started_at_time: '2026-03-10T05:57:13.606511'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30853
    deprecated_class_count: 6405
    non_deprecated_class_count: 24448
    class_count_with_text_definitions: 30853
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41591
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2926
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4489
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 393
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
    distinct_synonym_count: 93699
    synonym_statement_count: 94472
    change_summary:
      NodeTextDefinitionChange: 1769
      RemoveMapping: 307
      EdgeDeletion: 200
      EdgeCreation: 376
      MappingCreation: 132
      RemoveNodeFromSubset: 25
      NodeDeletion: 13
      NodeRename: 139
      NodeUnobsoletion: 112
      RemoveSynonym: 32
      NewSynonym: 50
      AddNodeToSubset: 10
      All_Obsoletion: 0
      All_Synonym: 82
    edge_count: 54723
  molecular_function:
    id: molecular_function
    class_count: 12838
    deprecated_class_count: 2783
    non_deprecated_class_count: 10055
    class_count_with_text_definitions: 12838
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12300
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
    distinct_synonym_count: 28598
    synonym_statement_count: 29747
    change_summary:
      NodeTextDefinitionChange: 490
      RemoveMapping: 655
      NodeRename: 208
      EdgeDeletion: 114
      EdgeCreation: 229
      MappingCreation: 275
      NodeDeletion: 13
      RemoveSynonym: 156
      NodeUnobsoletion: 77
      NewSynonym: 39
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 195
    edge_count: 13561
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
        filtered_count: 4675
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1802
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5099
    synonym_statement_count: 5297
    change_summary:
      NodeDeletion: 9
      EdgeDeletion: 38
      EdgeCreation: 50
      NodeTextDefinitionChange: 116
      NodeRename: 6
      RemoveSynonym: 6
      NewSynonym: 1
      NodeUnobsoletion: 2
      AddNodeToSubset: 3
      RemoveNodeFromSubset: 2
      All_Obsoletion: 0
      All_Synonym: 7
    edge_count: 6659
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
