---
id: obo:go/releases/2025-12-22go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2025-12-22go.owl
was_generated_by:
  started_at_time: '2025-12-22T05:47:14.076906'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30834
    deprecated_class_count: 5737
    non_deprecated_class_count: 25097
    class_count_with_text_definitions: 30834
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 42843
      RO:0002211:
        facet: RO:0002211
        filtered_count: 3002
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4763
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 423
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2637
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2651
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 141
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93723
    synonym_statement_count: 94496
    change_summary:
      EdgeDeletion: 130
      EdgeCreation: 283
      NodeRename: 120
      NodeTextDefinitionChange: 135
      NodeUnobsoletion: 73
      AddNodeToSubset: 14
      RemoveMapping: 215
      MappingCreation: 10
      NewSynonym: 49
      NodeDeletion: 17
      RemoveSynonym: 18
      RemoveNodeFromSubset: 2
      All_Obsoletion: 0
      All_Synonym: 67
    edge_count: 56474
  molecular_function:
    id: molecular_function
    class_count: 12818
    deprecated_class_count: 2680
    non_deprecated_class_count: 10138
    class_count_with_text_definitions: 12818
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12462
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 825
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
        filtered_count: 40
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28466
    synonym_statement_count: 29615
    change_summary:
      RemoveMapping: 1464
      MappingCreation: 498
      NodeRename: 72
      NodeTextDefinitionChange: 112
      EdgeDeletion: 41
      EdgeCreation: 63
      NodeDeletion: 13
      RemoveSynonym: 34
      NodeUnobsoletion: 19
      NewSynonym: 17
      AddNodeToSubset: 9
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 51
    edge_count: 13751
  cellular_component:
    id: cellular_component
    class_count: 4582
    deprecated_class_count: 517
    non_deprecated_class_count: 4065
    class_count_with_text_definitions: 4582
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4658
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1824
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5065
    synonym_statement_count: 5262
    change_summary:
      NodeRename: 21
      EdgeCreation: 17
      NodeTextDefinitionChange: 30
      NodeUnobsoletion: 1
      RemoveSynonym: 21
      NewSynonym: 1
      NodeDeletion: 8
      EdgeDeletion: 28
      All_Obsoletion: 0
      All_Synonym: 22
    edge_count: 6664
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
