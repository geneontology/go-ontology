---
id: obo:go/releases/2026-10-07go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-10-07go.owl
was_generated_by:
  started_at_time: '2026-10-07T05:52:58.880296'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30907
    deprecated_class_count: 7050
    non_deprecated_class_count: 23857
    class_count_with_text_definitions: 30907
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40287
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2886
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4465
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 324
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2543
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2557
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 137
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93690
    synonym_statement_count: 94477
    change_summary:
      RemoveSynonym: 92
      RemoveMapping: 20
      EdgeDeletion: 106
      EdgeCreation: 320
      NodeTextDefinitionChange: 240
      NodeRename: 167
      NodeUnobsoletion: 139
      RemoveNodeFromSubset: 6
      NodeDeletion: 22
      MappingCreation: 11
      NewSynonym: 63
      AddNodeToSubset: 1
      All_Obsoletion: 0
      All_Synonym: 155
    edge_count: 53213
  molecular_function:
    id: molecular_function
    class_count: 12880
    deprecated_class_count: 2835
    non_deprecated_class_count: 10045
    class_count_with_text_definitions: 12880
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12286
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 795
      RO:0002212:
        facet: RO:0002212
        filtered_count: 79
      RO:0002213:
        facet: RO:0002213
        filtered_count: 65
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28747
    synonym_statement_count: 29899
    change_summary:
      NodeTextDefinitionChange: 62
      RemoveMapping: 58
      RemoveSynonym: 52
      NewSynonym: 20
      EdgeDeletion: 70
      NodeRename: 45
      NodeObsoletionWithDirectReplacement: 1
      NodeUnobsoletion: 21
      EdgeCreation: 51
      NodeDeletion: 25
      MappingCreation: 28
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 72
    edge_count: 13547
  cellular_component:
    id: cellular_component
    class_count: 4608
    deprecated_class_count: 526
    non_deprecated_class_count: 4082
    class_count_with_text_definitions: 4608
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4700
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5134
    synonym_statement_count: 5333
    change_summary:
      EdgeCreation: 10
      NodeTextDefinitionChange: 27
      NodeRename: 6
      NodeUnobsoletion: 3
      NewSynonym: 4
      EdgeDeletion: 15
      NodeDeletion: 8
      RemoveSynonym: 4
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 8
    edge_count: 6684
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
