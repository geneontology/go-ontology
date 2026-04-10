---
id: obo:go/releases/2026-04-10go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-04-10go.owl
was_generated_by:
  started_at_time: '2026-04-10T06:17:41.768919'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30864
    deprecated_class_count: 6490
    non_deprecated_class_count: 24374
    class_count_with_text_definitions: 30864
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41334
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2923
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4486
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 388
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2576
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2590
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93708
    synonym_statement_count: 94485
    change_summary:
      EdgeDeletion: 83
      EdgeCreation: 300
      NodeRename: 68
      NodeUnobsoletion: 61
      NodeTextDefinitionChange: 78
      NodeDeletion: 7
      RemoveSynonym: 16
      NewSynonym: 24
      AddNodeToSubset: 1
      RemoveMapping: 12
      MappingCreation: 11
      All_Obsoletion: 0
      All_Synonym: 40
    edge_count: 54449
  molecular_function:
    id: molecular_function
    class_count: 12840
    deprecated_class_count: 2791
    non_deprecated_class_count: 10049
    class_count_with_text_definitions: 12840
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12281
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
    distinct_synonym_count: 28602
    synonym_statement_count: 29750
    change_summary:
      EdgeDeletion: 70
      EdgeCreation: 97
      NodeRename: 14
      NodeUnobsoletion: 8
      NewSynonym: 9
      NodeTextDefinitionChange: 11
      RemoveSynonym: 8
      RemoveMapping: 4
      NodeDeletion: 1
      MappingCreation: 3
      AddNodeToSubset: 3
      All_Obsoletion: 0
      All_Synonym: 17
    edge_count: 13535
  cellular_component:
    id: cellular_component
    class_count: 4595
    deprecated_class_count: 521
    non_deprecated_class_count: 4074
    class_count_with_text_definitions: 4595
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4691
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5099
    synonym_statement_count: 5297
    change_summary:
      EdgeDeletion: 5
      EdgeCreation: 7
      NodeRename: 2
      NodeUnobsoletion: 2
      NodeTextDefinitionChange: 4
      All_Obsoletion: 0
      All_Synonym: 0
    edge_count: 6675
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
