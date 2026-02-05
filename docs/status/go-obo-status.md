---
id: obo:go/releases/2026-02-05go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-02-05go.owl
was_generated_by:
  started_at_time: '2026-02-05T06:00:39.335065'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30843
    deprecated_class_count: 6331
    non_deprecated_class_count: 24512
    class_count_with_text_definitions: 30843
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41646
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2935
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4491
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 411
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2580
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2593
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 139
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93690
    synonym_statement_count: 94463
    change_summary:
      NodeTextDefinitionChange: 72
      EdgeDeletion: 11
      EdgeCreation: 101
      AddNodeToSubset: 8
      NodeUnobsoletion: 38
      NodeRename: 39
      NodeDeletion: 3
      MappingCreation: 4
      RemoveNodeFromSubset: 17
      RemoveMapping: 10
      NewSynonym: 27
      RemoveSynonym: 5
      All_Obsoletion: 0
      All_Synonym: 32
    edge_count: 54809
  molecular_function:
    id: molecular_function
    class_count: 12830
    deprecated_class_count: 2711
    non_deprecated_class_count: 10119
    class_count_with_text_definitions: 12830
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12399
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 799
      RO:0002212:
        facet: RO:0002212
        filtered_count: 75
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28565
    synonym_statement_count: 29717
    change_summary:
      RemoveSynonym: 113
      NodeRename: 110
      NodeTextDefinitionChange: 123
      EdgeDeletion: 68
      EdgeCreation: 85
      NodeUnobsoletion: 10
      RemoveMapping: 41
      MappingCreation: 8
      NewSynonym: 24
      NodeDeletion: 5
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 137
    edge_count: 13659
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
      NodeDeletion: 3
      EdgeDeletion: 3
      NodeTextDefinitionChange: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 0
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
