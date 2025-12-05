---
id: obo:go/releases/2025-12-04go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2025-12-04go.owl
was_generated_by:
  started_at_time: '2025-12-04T21:59:31.991627'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30833
    deprecated_class_count: 5684
    non_deprecated_class_count: 25149
    class_count_with_text_definitions: 30833
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 42959
      RO:0002211:
        facet: RO:0002211
        filtered_count: 3007
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4778
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 425
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2641
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2653
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 142
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93749
    synonym_statement_count: 94522
    change_summary:
      RemoveMapping: 208
      NodeTextDefinitionChange: 62
      EdgeDeletion: 74
      EdgeCreation: 82
      NodeRename: 52
      NodeUnobsoletion: 20
      AddNodeToSubset: 9
      NodeDeletion: 16
      MappingCreation: 4
      NewSynonym: 11
      RemoveSynonym: 6
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 17
    edge_count: 56619
  molecular_function:
    id: molecular_function
    class_count: 12818
    deprecated_class_count: 2669
    non_deprecated_class_count: 10149
    class_count_with_text_definitions: 12818
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12477
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 831
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
        filtered_count: 43
      RO:0002211:
        facet: RO:0002211
        filtered_count: 51
    distinct_synonym_count: 28467
    synonym_statement_count: 29616
    change_summary:
      RemoveMapping: 1464
      EdgeDeletion: 41
      EdgeCreation: 37
      NodeTextDefinitionChange: 99
      NodeUnobsoletion: 8
      NodeRename: 61
      MappingCreation: 498
      NodeDeletion: 13
      NodeObsoletionWithDirectReplacement: 1
      RemoveSynonym: 34
      NewSynonym: 16
      AddNodeToSubset: 1
      All_Obsoletion: 1
      All_Synonym: 50
    edge_count: 13777
  cellular_component:
    id: cellular_component
    class_count: 4579
    deprecated_class_count: 517
    non_deprecated_class_count: 4062
    class_count_with_text_definitions: 4579
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4655
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1821
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 182
    distinct_synonym_count: 5058
    synonym_statement_count: 5255
    change_summary:
      NodeDeletion: 5
      EdgeDeletion: 18
      NodeTextDefinitionChange: 29
      NodeRename: 19
      RemoveSynonym: 18
      EdgeCreation: 13
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 18
    edge_count: 6658
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

Classes: {{ page.partitions.biological_process.class_count }}

## molecular function

Classes: {{ page.partitions.molecular_function.class_count }}

## cellular component

Classes: {{ page.partitions.cellular_component.class_count }}
