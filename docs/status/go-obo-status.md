---
id: obo:go/releases/2026-07-30go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-07-30go.owl
was_generated_by:
  started_at_time: '2026-07-30T06:35:51.514317'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30886
    deprecated_class_count: 6913
    non_deprecated_class_count: 23973
    class_count_with_text_definitions: 30886
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40481
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
    distinct_synonym_count: 93627
    synonym_statement_count: 94406
    change_summary:
      EdgeDeletion: 170
      EdgeCreation: 584
      NodeTextDefinitionChange: 202
      RemoveMapping: 21
      NodeRename: 197
      NodeUnobsoletion: 161
      MappingCreation: 49
      AddNodeToSubset: 40
      NodeDeletion: 5
      RemoveSynonym: 80
      NewSynonym: 44
      All_Obsoletion: 0
      All_Synonym: 124
    edge_count: 53422
  molecular_function:
    id: molecular_function
    class_count: 12859
    deprecated_class_count: 2814
    non_deprecated_class_count: 10045
    class_count_with_text_definitions: 12859
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12279
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
        filtered_count: 234
      BFO:0000066:
        facet: BFO:0000066
        filtered_count: 36
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28670
    synonym_statement_count: 29817
    change_summary:
      EdgeDeletion: 51
      EdgeCreation: 37
      NodeTextDefinitionChange: 35
      NodeRename: 40
      RemoveMapping: 120
      NodeDeletion: 8
      RemoveSynonym: 4
      NewSynonym: 1
      NodeUnobsoletion: 4
      MappingCreation: 10
      All_Obsoletion: 0
      All_Synonym: 5
    edge_count: 13535
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
      EdgeDeletion: 8
      EdgeCreation: 3
      NodeRename: 2
      RemoveSynonym: 3
      NodeDeletion: 4
      NodeTextDefinitionChange: 2
      NodeUnobsoletion: 1
      NewSynonym: 1
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
