---
id: obo:go/releases/2026-04-29go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-04-29go.owl
was_generated_by:
  started_at_time: '2026-04-29T06:33:58.039318'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30865
    deprecated_class_count: 6556
    non_deprecated_class_count: 24309
    class_count_with_text_definitions: 30865
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41122
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2907
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4484
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
      EdgeDeletion: 180
      NodeTextDefinitionChange: 153
      EdgeCreation: 657
      NodeRename: 142
      NodeUnobsoletion: 127
      MappingCreation: 15
      NewSynonym: 30
      RemoveSynonym: 33
      AddNodeToSubset: 2
      RemoveMapping: 17
      NodeDeletion: 8
      All_Obsoletion: 0
      All_Synonym: 63
    edge_count: 54189
  molecular_function:
    id: molecular_function
    class_count: 12847
    deprecated_class_count: 2796
    non_deprecated_class_count: 10051
    class_count_with_text_definitions: 12847
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12278
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
    distinct_synonym_count: 28624
    synonym_statement_count: 29771
    change_summary:
      EdgeDeletion: 205
      EdgeCreation: 234
      NodeDeletion: 8
      RemoveMapping: 775
      NodeTextDefinitionChange: 95
      RemoveSynonym: 23
      NodeRename: 35
      NodeUnobsoletion: 14
      NewSynonym: 16
      MappingCreation: 11
      AddNodeToSubset: 3
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 39
    edge_count: 13533
  cellular_component:
    id: cellular_component
    class_count: 4595
    deprecated_class_count: 522
    non_deprecated_class_count: 4073
    class_count_with_text_definitions: 4595
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4691
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1802
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5102
    synonym_statement_count: 5300
    change_summary:
      NodeTextDefinitionChange: 8
      EdgeCreation: 10
      NodeRename: 5
      NodeUnobsoletion: 3
      EdgeDeletion: 7
      RemoveSynonym: 4
      NewSynonym: 1
      All_Obsoletion: 0
      All_Synonym: 5
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
