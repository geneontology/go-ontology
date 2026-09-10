---
id: obo:go/releases/2026-09-10go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-09-10go.owl
was_generated_by:
  started_at_time: '2026-09-10T05:54:34.618563'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30900
    deprecated_class_count: 7033
    non_deprecated_class_count: 23867
    class_count_with_text_definitions: 30900
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40315
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2886
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4465
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 323
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2543
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2558
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 134
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93661
    synonym_statement_count: 94441
    change_summary:
      NodeTextDefinitionChange: 194
      NodeUnobsoletion: 122
      EdgeCreation: 256
      NodeRename: 137
      RemoveNodeFromSubset: 5
      NodeDeletion: 15
      EdgeDeletion: 67
      NewSynonym: 14
      AddNodeToSubset: 1
      MappingCreation: 7
      RemoveSynonym: 24
      RemoveMapping: 5
      All_Obsoletion: 0
      All_Synonym: 38
    edge_count: 53238
  molecular_function:
    id: molecular_function
    class_count: 12873
    deprecated_class_count: 2832
    non_deprecated_class_count: 10041
    class_count_with_text_definitions: 12873
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12282
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
        filtered_count: 238
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28705
    synonym_statement_count: 29860
    change_summary:
      NodeTextDefinitionChange: 43
      EdgeDeletion: 50
      EdgeCreation: 37
      NodeUnobsoletion: 18
      NodeRename: 30
      MappingCreation: 27
      NodeDeletion: 18
      RemoveMapping: 15
      RemoveSynonym: 28
      NodeObsoletionWithDirectReplacement: 1
      NewSynonym: 12
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 40
    edge_count: 13541
  cellular_component:
    id: cellular_component
    class_count: 4607
    deprecated_class_count: 526
    non_deprecated_class_count: 4081
    class_count_with_text_definitions: 4607
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4700
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5130
    synonym_statement_count: 5329
    change_summary:
      NodeTextDefinitionChange: 27
      EdgeDeletion: 13
      EdgeCreation: 8
      RemoveNodeFromSubset: 1
      RemoveSynonym: 4
      NewSynonym: 4
      NodeRename: 5
      NodeDeletion: 7
      NodeUnobsoletion: 3
      All_Obsoletion: 0
      All_Synonym: 8
    edge_count: 6684
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
