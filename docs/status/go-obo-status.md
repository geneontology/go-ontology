---
id: obo:go/releases/2026-08-08go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-08-08go.owl
was_generated_by:
  started_at_time: '2026-08-08T05:57:32.458357'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30890
    deprecated_class_count: 6927
    non_deprecated_class_count: 23963
    class_count_with_text_definitions: 30890
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40479
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2890
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4463
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 328
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2548
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2563
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 135
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93635
    synonym_statement_count: 94414
    change_summary:
      EdgeDeletion: 184
      EdgeCreation: 600
      NodeTextDefinitionChange: 220
      NodeUnobsoletion: 175
      NodeRename: 214
      AddNodeToSubset: 40
      RemoveMapping: 21
      RemoveSynonym: 82
      MappingCreation: 49
      NodeDeletion: 9
      NewSynonym: 44
      All_Obsoletion: 0
      All_Synonym: 126
    edge_count: 53420
  molecular_function:
    id: molecular_function
    class_count: 12866
    deprecated_class_count: 2816
    non_deprecated_class_count: 10050
    class_count_with_text_definitions: 12866
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12288
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
        filtered_count: 234
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28682
    synonym_statement_count: 29835
    change_summary:
      RemoveMapping: 122
      NodeTextDefinitionChange: 38
      NodeRename: 42
      EdgeDeletion: 66
      EdgeCreation: 44
      NodeDeletion: 15
      RemoveSynonym: 13
      MappingCreation: 14
      NodeUnobsoletion: 6
      NewSynonym: 6
      All_Obsoletion: 0
      All_Synonym: 19
    edge_count: 13543
  cellular_component:
    id: cellular_component
    class_count: 4603
    deprecated_class_count: 523
    non_deprecated_class_count: 4080
    class_count_with_text_definitions: 4603
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4699
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5116
    synonym_statement_count: 5315
    change_summary:
      NodeDeletion: 6
      EdgeDeletion: 10
      NewSynonym: 3
      RemoveSynonym: 3
      NodeTextDefinitionChange: 2
      EdgeCreation: 3
      NodeUnobsoletion: 1
      NodeRename: 2
      All_Obsoletion: 0
      All_Synonym: 6
    edge_count: 6683
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
