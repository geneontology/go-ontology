---
id: obo:go/releases/2026-05-02go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-05-02go.owl
was_generated_by:
  started_at_time: '2026-05-02T06:17:46.634964'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30866
    deprecated_class_count: 6562
    non_deprecated_class_count: 24304
    class_count_with_text_definitions: 30866
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41115
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2906
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4482
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 384
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2563
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2577
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93719
    synonym_statement_count: 94497
    change_summary:
      EdgeDeletion: 181
      EdgeCreation: 668
      NodeRename: 151
      NodeUnobsoletion: 133
      NodeTextDefinitionChange: 160
      RemoveMapping: 17
      MappingCreation: 15
      RemoveSynonym: 35
      NewSynonym: 33
      NodeDeletion: 9
      AddNodeToSubset: 2
      All_Obsoletion: 0
      All_Synonym: 68
    edge_count: 54179
  molecular_function:
    id: molecular_function
    class_count: 12847
    deprecated_class_count: 2797
    non_deprecated_class_count: 10050
    class_count_with_text_definitions: 12847
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12277
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 798
      RO:0002212:
        facet: RO:0002212
        filtered_count: 76
      RO:0002213:
        facet: RO:0002213
        filtered_count: 63
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 233
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28629
    synonym_statement_count: 29776
    change_summary:
      NodeRename: 41
      RemoveSynonym: 28
      NodeTextDefinitionChange: 101
      RemoveMapping: 776
      NodeUnobsoletion: 15
      EdgeCreation: 236
      EdgeDeletion: 206
      NodeDeletion: 8
      MappingCreation: 11
      NewSynonym: 16
      AddNodeToSubset: 3
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 44
    edge_count: 13532
  cellular_component:
    id: cellular_component
    class_count: 4596
    deprecated_class_count: 522
    non_deprecated_class_count: 4074
    class_count_with_text_definitions: 4596
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4692
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1802
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5102
    synonym_statement_count: 5300
    change_summary:
      EdgeDeletion: 8
      RemoveSynonym: 4
      NewSynonym: 1
      NodeRename: 5
      EdgeCreation: 10
      NodeTextDefinitionChange: 8
      NodeUnobsoletion: 3
      NodeDeletion: 1
      All_Obsoletion: 0
      All_Synonym: 5
    edge_count: 6675
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
