---
id: obo:go/releases/2026-05-06go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-05-06go.owl
was_generated_by:
  started_at_time: '2026-05-06T06:41:17.074841'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30868
    deprecated_class_count: 6573
    non_deprecated_class_count: 24295
    class_count_with_text_definitions: 30868
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41102
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2906
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4481
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 375
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
    distinct_synonym_count: 93698
    synonym_statement_count: 94475
    change_summary:
      EdgeCreation: 694
      RemoveSynonym: 41
      NodeUnobsoletion: 144
      NodeTextDefinitionChange: 173
      NewSynonym: 62
      NodeRename: 164
      RemoveMapping: 23
      MappingCreation: 20
      EdgeDeletion: 184
      AddNodeToSubset: 2
      RemoveNodeFromSubset: 5
      NodeDeletion: 11
      All_Obsoletion: 0
      All_Synonym: 103
    edge_count: 54156
  molecular_function:
    id: molecular_function
    class_count: 12847
    deprecated_class_count: 2798
    non_deprecated_class_count: 10049
    class_count_with_text_definitions: 12847
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12276
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
    distinct_synonym_count: 28631
    synonym_statement_count: 29778
    change_summary:
      NodeDeletion: 8
      EdgeDeletion: 209
      NodeTextDefinitionChange: 103
      NodeRename: 44
      NodeUnobsoletion: 16
      EdgeCreation: 240
      RemoveMapping: 778
      RemoveSynonym: 30
      NewSynonym: 16
      MappingCreation: 11
      AddNodeToSubset: 3
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 46
    edge_count: 13531
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
      EdgeCreation: 10
      NodeTextDefinitionChange: 8
      NodeRename: 5
      NodeUnobsoletion: 3
      RemoveSynonym: 4
      NewSynonym: 1
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
