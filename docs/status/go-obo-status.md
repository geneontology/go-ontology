---
id: obo:go/releases/2026-08-31go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-08-31go.owl
was_generated_by:
  started_at_time: '2026-08-31T05:53:36.955061'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30899
    deprecated_class_count: 7023
    non_deprecated_class_count: 23876
    class_count_with_text_definitions: 30899
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40324
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2887
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4465
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 324
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2544
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2559
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 134
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93661
    synonym_statement_count: 94441
    change_summary:
      NodeUnobsoletion: 112
      EdgeCreation: 240
      NodeRename: 122
      NodeTextDefinitionChange: 150
      EdgeDeletion: 64
      RemoveSynonym: 24
      NodeDeletion: 14
      RemoveNodeFromSubset: 5
      NewSynonym: 14
      MappingCreation: 7
      AddNodeToSubset: 1
      RemoveMapping: 5
      All_Obsoletion: 0
      All_Synonym: 38
    edge_count: 53251
  molecular_function:
    id: molecular_function
    class_count: 12870
    deprecated_class_count: 2829
    non_deprecated_class_count: 10041
    class_count_with_text_definitions: 12870
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12282
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 795
      RO:0002212:
        facet: RO:0002212
        filtered_count: 78
      RO:0002213:
        facet: RO:0002213
        filtered_count: 64
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28700
    synonym_statement_count: 29853
    change_summary:
      NodeDeletion: 15
      EdgeDeletion: 50
      NodeTextDefinitionChange: 32
      NodeUnobsoletion: 16
      MappingCreation: 21
      EdgeCreation: 37
      NodeRename: 21
      NodeObsoletionWithDirectReplacement: 1
      RemoveMapping: 11
      RemoveSynonym: 23
      NewSynonym: 9
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 32
    edge_count: 13541
  cellular_component:
    id: cellular_component
    class_count: 4607
    deprecated_class_count: 524
    non_deprecated_class_count: 4083
    class_count_with_text_definitions: 4607
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4702
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1804
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5129
    synonym_statement_count: 5328
    change_summary:
      NodeDeletion: 7
      EdgeDeletion: 13
      NewSynonym: 4
      EdgeCreation: 5
      NodeUnobsoletion: 1
      NodeRename: 2
      NodeTextDefinitionChange: 3
      RemoveSynonym: 3
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 7
    edge_count: 6687
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
