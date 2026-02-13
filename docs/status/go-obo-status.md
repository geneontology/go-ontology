---
id: obo:go/releases/2026-02-13go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-02-13go.owl
was_generated_by:
  started_at_time: '2026-02-13T06:03:44.376392'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30843
    deprecated_class_count: 6343
    non_deprecated_class_count: 24500
    class_count_with_text_definitions: 30843
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41622
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2933
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
    distinct_synonym_count: 93687
    synonym_statement_count: 94460
    change_summary:
      NodeTextDefinitionChange: 107
      AddNodeToSubset: 8
      NodeRename: 51
      NodeUnobsoletion: 50
      EdgeCreation: 132
      RemoveMapping: 162
      MappingCreation: 102
      EdgeDeletion: 14
      RemoveNodeFromSubset: 23
      NewSynonym: 31
      RemoveSynonym: 6
      NodeDeletion: 3
      All_Obsoletion: 0
      All_Synonym: 37
    edge_count: 54781
  molecular_function:
    id: molecular_function
    class_count: 12836
    deprecated_class_count: 2731
    non_deprecated_class_count: 10105
    class_count_with_text_definitions: 12836
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12382
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
    distinct_synonym_count: 28585
    synonym_statement_count: 29737
    change_summary:
      RemoveMapping: 638
      NodeRename: 146
      NodeTextDefinitionChange: 285
      RemoveSynonym: 136
      EdgeDeletion: 80
      EdgeCreation: 114
      NodeUnobsoletion: 25
      MappingCreation: 214
      NodeDeletion: 11
      NewSynonym: 27
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 163
    edge_count: 13642
  cellular_component:
    id: cellular_component
    class_count: 4591
    deprecated_class_count: 518
    non_deprecated_class_count: 4073
    class_count_with_text_definitions: 4591
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4667
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1825
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5092
    synonym_statement_count: 5290
    change_summary:
      EdgeCreation: 6
      NodeTextDefinitionChange: 53
      NodeRename: 2
      RemoveSynonym: 3
      EdgeDeletion: 9
      NodeDeletion: 5
      NodeUnobsoletion: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 3
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
