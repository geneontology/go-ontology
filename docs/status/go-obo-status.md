---
id: obo:go/releases/2026-01-30go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-30go.owl
was_generated_by:
  started_at_time: '2026-01-30T05:56:34.860635'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30842
    deprecated_class_count: 6317
    non_deprecated_class_count: 24525
    class_count_with_text_definitions: 30842
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41677
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2936
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4491
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 412
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2580
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2594
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 139
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93717
    synonym_statement_count: 94490
    change_summary:
      EdgeDeletion: 306
      EdgeCreation: 2090
      NodeRename: 711
      NodeTextDefinitionChange: 754
      NodeUnobsoletion: 654
      NodeDeletion: 25
      RemoveMapping: 312
      MappingCreation: 54
      RemoveSynonym: 32
      NewSynonym: 72
      AddNodeToSubset: 31
      RemoveNodeFromSubset: 13
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 104
    edge_count: 54843
  molecular_function:
    id: molecular_function
    class_count: 12827
    deprecated_class_count: 2702
    non_deprecated_class_count: 10125
    class_count_with_text_definitions: 12827
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12414
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 803
      RO:0002212:
        facet: RO:0002212
        filtered_count: 75
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 239
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28473
    synonym_statement_count: 29622
    change_summary:
      RemoveSynonym: 53
      NodeRename: 119
      NodeTextDefinitionChange: 175
      RemoveMapping: 1493
      MappingCreation: 501
      EdgeDeletion: 103
      EdgeCreation: 197
      NodeDeletion: 22
      NodeUnobsoletion: 41
      AddNodeToSubset: 20
      NewSynonym: 31
      NodeObsoletionWithDirectReplacement: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 84
    edge_count: 13679
  cellular_component:
    id: cellular_component
    class_count: 4589
    deprecated_class_count: 517
    non_deprecated_class_count: 4072
    class_count_with_text_definitions: 4589
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4666
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1826
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5082
    synonym_statement_count: 5280
    change_summary:
      RemoveSynonym: 26
      NodeTextDefinitionChange: 33
      NodeRename: 22
      EdgeDeletion: 48
      EdgeCreation: 27
      NodeDeletion: 15
      RemoveNodeFromSubset: 1
      NodeUnobsoletion: 1
      NewSynonym: 1
      All_Obsoletion: 0
      All_Synonym: 27
    edge_count: 6674
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
