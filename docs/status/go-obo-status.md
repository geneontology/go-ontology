---
id: obo:go/releases/2026-02-24go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-02-24go.owl
was_generated_by:
  started_at_time: '2026-02-24T06:02:14.274709'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30847
    deprecated_class_count: 6356
    non_deprecated_class_count: 24491
    class_count_with_text_definitions: 30847
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 41594
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2933
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4490
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 406
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2581
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2593
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 138
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93694
    synonym_statement_count: 94467
    change_summary:
      NodeTextDefinitionChange: 1716
      MappingCreation: 103
      RemoveMapping: 181
      RemoveNodeFromSubset: 23
      EdgeCreation: 180
      NodeRename: 65
      NodeUnobsoletion: 63
      EdgeDeletion: 30
      RemoveSynonym: 10
      NodeDeletion: 7
      AddNodeToSubset: 9
      NewSynonym: 32
      All_Obsoletion: 0
      All_Synonym: 42
    edge_count: 54749
  molecular_function:
    id: molecular_function
    class_count: 12837
    deprecated_class_count: 2781
    non_deprecated_class_count: 10056
    class_count_with_text_definitions: 12837
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12304
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 800
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
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28594
    synonym_statement_count: 29743
    change_summary:
      MappingCreation: 275
      RemoveSynonym: 147
      NewSynonym: 34
      NodeTextDefinitionChange: 483
      EdgeDeletion: 95
      EdgeCreation: 207
      NodeRename: 204
      NodeUnobsoletion: 75
      RemoveMapping: 654
      NodeDeletion: 12
      NodeObsoletion: 1
      All_Obsoletion: 1
      All_Synonym: 181
    edge_count: 13564
  cellular_component:
    id: cellular_component
    class_count: 4592
    deprecated_class_count: 518
    non_deprecated_class_count: 4074
    class_count_with_text_definitions: 4592
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4668
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1825
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5095
    synonym_statement_count: 5293
    change_summary:
      NodeTextDefinitionChange: 114
      EdgeDeletion: 10
      EdgeCreation: 6
      NodeDeletion: 6
      RemoveNodeFromSubset: 1
      RemoveSynonym: 4
      NodeRename: 3
      NodeUnobsoletion: 1
      NewSynonym: 1
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
