---
id: obo:go/releases/2026-01-07go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-01-07go.owl
was_generated_by:
  started_at_time: '2026-01-07T05:48:08.947935'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30836
    deprecated_class_count: 6017
    non_deprecated_class_count: 24819
    class_count_with_text_definitions: 30836
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 42237
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2976
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4613
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 422
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2603
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2615
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 140
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93704
    synonym_statement_count: 94477
    change_summary:
      EdgeDeletion: 194
      EdgeCreation: 1201
      NodeTextDefinitionChange: 422
      NodeUnobsoletion: 353
      NodeRename: 404
      NewSynonym: 70
      RemoveMapping: 215
      RemoveNodeFromSubset: 2
      AddNodeToSubset: 19
      NodeDeletion: 19
      MappingCreation: 11
      RemoveSynonym: 19
      All_Obsoletion: 0
      All_Synonym: 89
    edge_count: 55620
  molecular_function:
    id: molecular_function
    class_count: 12820
    deprecated_class_count: 2697
    non_deprecated_class_count: 10123
    class_count_with_text_definitions: 12820
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12412
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 812
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
        filtered_count: 37
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28469
    synonym_statement_count: 29617
    change_summary:
      MappingCreation: 498
      RemoveMapping: 1466
      NodeTextDefinitionChange: 133
      NodeUnobsoletion: 36
      NodeRename: 93
      EdgeCreation: 153
      AddNodeToSubset: 17
      NewSynonym: 19
      EdgeDeletion: 65
      RemoveSynonym: 38
      NodeDeletion: 15
      NodeObsoletionWithDirectReplacement: 1
      All_Obsoletion: 1
      All_Synonym: 57
    edge_count: 13685
  cellular_component:
    id: cellular_component
    class_count: 4585
    deprecated_class_count: 517
    non_deprecated_class_count: 4068
    class_count_with_text_definitions: 4585
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4662
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1827
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5074
    synonym_statement_count: 5271
    change_summary:
      RemoveSynonym: 25
      NodeTextDefinitionChange: 30
      NodeRename: 21
      NodeDeletion: 11
      EdgeDeletion: 35
      EdgeCreation: 17
      NewSynonym: 1
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 26
    edge_count: 6671
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
