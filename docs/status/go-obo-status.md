---
id: obo:go/releases/2026-02-28go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-02-28go.owl
was_generated_by:
  started_at_time: '2026-02-28T05:48:28.642844'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30847
    deprecated_class_count: 6373
    non_deprecated_class_count: 24474
    class_count_with_text_definitions: 30847
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41553
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2928
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4490
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 404
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2580
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
    distinct_synonym_count: 93697
    synonym_statement_count: 94470
    change_summary:
      NodeTextDefinitionChange: 1737
      RemoveNodeFromSubset: 25
      RemoveMapping: 291
      EdgeDeletion: 49
      EdgeCreation: 249
      NodeRename: 92
      NodeUnobsoletion: 80
      MappingCreation: 123
      NodeDeletion: 7
      NewSynonym: 33
      AddNodeToSubset: 9
      RemoveSynonym: 14
      All_Obsoletion: 0
      All_Synonym: 47
    edge_count: 54699
  molecular_function:
    id: molecular_function
    class_count: 12837
    deprecated_class_count: 2782
    non_deprecated_class_count: 10055
    class_count_with_text_definitions: 12837
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12302
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 800
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
    distinct_synonym_count: 28594
    synonym_statement_count: 29743
    change_summary:
      NodeTextDefinitionChange: 484
      NodeRename: 205
      RemoveSynonym: 147
      RemoveMapping: 654
      NodeUnobsoletion: 76
      EdgeCreation: 210
      EdgeDeletion: 96
      MappingCreation: 275
      NodeDeletion: 12
      NewSynonym: 34
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 181
    edge_count: 13562
  cellular_component:
    id: cellular_component
    class_count: 4593
    deprecated_class_count: 518
    non_deprecated_class_count: 4075
    class_count_with_text_definitions: 4593
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4669
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1825
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5097
    synonym_statement_count: 5295
    change_summary:
      NodeRename: 4
      EdgeCreation: 6
      NodeUnobsoletion: 1
      NodeTextDefinitionChange: 114
      RemoveSynonym: 5
      NodeDeletion: 7
      EdgeDeletion: 11
      NewSynonym: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 6
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
