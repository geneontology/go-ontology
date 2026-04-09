---
id: obo:go/releases/2026-04-09go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-04-09go.owl
was_generated_by:
  started_at_time: '2026-04-09T06:16:20.001465'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30864
    deprecated_class_count: 6483
    non_deprecated_class_count: 24381
    class_count_with_text_definitions: 30864
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41344
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
    distinct_synonym_count: 93712
    synonym_statement_count: 94489
    change_summary:
      EdgeCreation: 283
      NodeRename: 61
      NodeUnobsoletion: 54
      NodeTextDefinitionChange: 71
      EdgeDeletion: 82
      MappingCreation: 11
      NewSynonym: 20
      RemoveMapping: 12
      RemoveSynonym: 16
      NodeDeletion: 7
      AddNodeToSubset: 1
      All_Obsoletion: 0
      All_Synonym: 36
    edge_count: 54465
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
      EdgeDeletion: 70
      EdgeCreation: 96
      NodeDeletion: 1
      NodeRename: 9
      NodeUnobsoletion: 7
      NodeTextDefinitionChange: 8
      RemoveMapping: 1
      RemoveSynonym: 4
      NewSynonym: 9
      AddNodeToSubset: 3
      All_Obsoletion: 0
      All_Synonym: 13
    edge_count: 13536
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
      EdgeCreation: 7
      NodeRename: 2
      NodeUnobsoletion: 2
      NodeTextDefinitionChange: 4
      EdgeDeletion: 5
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
