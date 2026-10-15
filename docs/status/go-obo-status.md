---
id: obo:go/releases/2026-10-15go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-10-15go.owl
was_generated_by:
  started_at_time: '2026-10-15T05:48:29.506324'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30910
    deprecated_class_count: 7057
    non_deprecated_class_count: 23853
    class_count_with_text_definitions: 30910
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40265
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2886
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4465
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 316
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
    distinct_synonym_count: 93712
    synonym_statement_count: 94501
    change_summary:
      NodeUnobsoletion: 146
      EdgeCreation: 365
      NodeTextDefinitionChange: 266
      NodeRename: 184
      MappingCreation: 16
      RemoveSynonym: 113
      EdgeDeletion: 121
      NewSynonym: 64
      NodeDeletion: 25
      RemoveMapping: 35
      RemoveNodeFromSubset: 6
      AddNodeToSubset: 1
      All_Obsoletion: 0
      All_Synonym: 177
    edge_count: 53183
  molecular_function:
    id: molecular_function
    class_count: 12888
    deprecated_class_count: 2849
    non_deprecated_class_count: 10039
    class_count_with_text_definitions: 12888
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12282
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 794
      RO:0002212:
        facet: RO:0002212
        filtered_count: 80
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
    distinct_synonym_count: 28771
    synonym_statement_count: 29925
    change_summary:
      NodeUnobsoletion: 35
      EdgeCreation: 85
      NodeTextDefinitionChange: 107
      NodeRename: 63
      EdgeDeletion: 100
      NodeObsoletionWithDirectReplacement: 1
      RemoveSynonym: 77
      RemoveMapping: 66
      NodeDeletion: 33
      NewSynonym: 43
      MappingCreation: 28
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 120
    edge_count: 13543
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
        filtered_count: 4699
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5134
    synonym_statement_count: 5333
    change_summary:
      EdgeDeletion: 17
      EdgeCreation: 13
      NodeTextDefinitionChange: 28
      NodeDeletion: 8
      NodeUnobsoletion: 3
      NodeRename: 6
      RemoveSynonym: 4
      NewSynonym: 4
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 8
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
