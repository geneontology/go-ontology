---
id: obo:go/releases/2025-12-17go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2025-12-17go.owl
was_generated_by:
  started_at_time: '2025-12-17T05:46:58.793965'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30834
    deprecated_class_count: 5729
    non_deprecated_class_count: 25105
    class_count_with_text_definitions: 30834
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 42861
      RO:0002211:
        facet: RO:0002211
        filtered_count: 3003
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4765
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 423
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2638
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2652
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
      RemoveMapping: 216
      EdgeDeletion: 116
      EdgeCreation: 246
      NodeTextDefinitionChange: 127
      NodeUnobsoletion: 65
      NodeRename: 112
      RemoveSynonym: 18
      NewSynonym: 49
      RemoveNodeFromSubset: 2
      AddNodeToSubset: 13
      NodeDeletion: 17
      MappingCreation: 10
      All_Obsoletion: 0
      All_Synonym: 67
    edge_count: 56497
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
      NodeTextDefinitionChange: 111
      EdgeDeletion: 41
      EdgeCreation: 63
      RemoveMapping: 1464
      MappingCreation: 498
      RemoveSynonym: 34
      NodeRename: 72
      NodeDeletion: 13
      NewSynonym: 17
      NodeUnobsoletion: 19
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
      RemoveSynonym: 21
      NodeRename: 21
      NodeTextDefinitionChange: 30
      EdgeDeletion: 28
      EdgeCreation: 17
      NodeDeletion: 8
      NewSynonym: 1
      NodeUnobsoletion: 1
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
