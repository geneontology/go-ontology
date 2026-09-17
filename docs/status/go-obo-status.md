---
id: obo:go/releases/2026-09-17go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-09-17go.owl
was_generated_by:
  started_at_time: '2026-09-17T05:48:24.095603'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30902
    deprecated_class_count: 7040
    non_deprecated_class_count: 23862
    class_count_with_text_definitions: 30902
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40298
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2887
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4462
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 323
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2544
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
    distinct_synonym_count: 93669
    synonym_statement_count: 94454
    change_summary:
      EdgeDeletion: 81
      EdgeCreation: 288
      NodeTextDefinitionChange: 210
      NodeUnobsoletion: 129
      NodeRename: 153
      RemoveNodeFromSubset: 6
      NodeDeletion: 17
      RemoveSynonym: 64
      NewSynonym: 41
      MappingCreation: 11
      RemoveMapping: 16
      AddNodeToSubset: 1
      All_Obsoletion: 0
      All_Synonym: 105
    edge_count: 53220
  molecular_function:
    id: molecular_function
    class_count: 12876
    deprecated_class_count: 2832
    non_deprecated_class_count: 10044
    class_count_with_text_definitions: 12876
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12284
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
        filtered_count: 239
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28715
    synonym_statement_count: 29867
    change_summary:
      EdgeDeletion: 57
      EdgeCreation: 41
      NodeRename: 33
      NodeUnobsoletion: 18
      NodeTextDefinitionChange: 50
      NodeDeletion: 21
      RemoveSynonym: 36
      NewSynonym: 19
      RemoveMapping: 18
      MappingCreation: 28
      NodeObsoletionWithDirectReplacement: 1
      RemoveNodeFromSubset: 1
      All_Obsoletion: 1
      All_Synonym: 55
    edge_count: 13544
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
      NodeRename: 6
      NodeDeletion: 7
      EdgeDeletion: 13
      NodeTextDefinitionChange: 27
      EdgeCreation: 8
      NodeUnobsoletion: 3
      RemoveNodeFromSubset: 1
      RemoveSynonym: 4
      NewSynonym: 4
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
