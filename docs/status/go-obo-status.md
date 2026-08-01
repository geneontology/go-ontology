---
id: obo:go/releases/2026-08-01go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-08-01go.owl
was_generated_by:
  started_at_time: '2026-08-01T06:39:28.760176'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30888
    deprecated_class_count: 6927
    non_deprecated_class_count: 23961
    class_count_with_text_definitions: 30888
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40473
      RO:0002211:
        facet: RO:0002211
        filtered_count: 2890
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 4462
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 328
      RO:0002212:
        facet: RO:0002212
        filtered_count: 2548
      RO:0002213:
        facet: RO:0002213
        filtered_count: 2563
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 136
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93631
    synonym_statement_count: 94410
    change_summary:
      EdgeCreation: 599
      EdgeDeletion: 177
      NodeRename: 211
      NodeTextDefinitionChange: 216
      NodeUnobsoletion: 175
      RemoveMapping: 21
      RemoveSynonym: 80
      MappingCreation: 49
      NewSynonym: 44
      NodeDeletion: 7
      AddNodeToSubset: 40
      All_Obsoletion: 0
      All_Synonym: 124
    edge_count: 53414
  molecular_function:
    id: molecular_function
    class_count: 12860
    deprecated_class_count: 2815
    non_deprecated_class_count: 10045
    class_count_with_text_definitions: 12860
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12279
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 796
      RO:0002212:
        facet: RO:0002212
        filtered_count: 78
      RO:0002213:
        facet: RO:0002213
        filtered_count: 64
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 234
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28673
    synonym_statement_count: 29823
    change_summary:
      EdgeCreation: 39
      NodeTextDefinitionChange: 37
      NodeRename: 41
      MappingCreation: 12
      NodeUnobsoletion: 5
      EdgeDeletion: 54
      RemoveMapping: 122
      RemoveSynonym: 13
      NodeDeletion: 9
      NewSynonym: 6
      All_Obsoletion: 0
      All_Synonym: 19
    edge_count: 13536
  cellular_component:
    id: cellular_component
    class_count: 4601
    deprecated_class_count: 523
    non_deprecated_class_count: 4078
    class_count_with_text_definitions: 4601
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4697
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5116
    synonym_statement_count: 5315
    change_summary:
      NodeDeletion: 4
      EdgeDeletion: 8
      NodeTextDefinitionChange: 2
      RemoveSynonym: 3
      EdgeCreation: 3
      NewSynonym: 1
      NodeRename: 2
      NodeUnobsoletion: 1
      All_Obsoletion: 0
      All_Synonym: 4
    edge_count: 6681
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
