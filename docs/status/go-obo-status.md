---
id: obo:go/releases/2026-08-11go.owl-statistics
ontologies:
- id: go
  version: obo:go/releases/2026-08-11go.owl
was_generated_by:
  started_at_time: '2026-08-11T06:05:09.674519'
  was_associated_with: OAK
  acted_on_behalf_of: root
partitions:
  biological_process:
    id: biological_process
    class_count: 30891
    deprecated_class_count: 6928
    non_deprecated_class_count: 23963
    class_count_with_text_definitions: 30891
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 40479
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
        filtered_count: 135
      RO:0002092:
        facet: RO:0002092
        filtered_count: 13
      RO:0002093:
        facet: RO:0002093
        filtered_count: 1
    distinct_synonym_count: 93635
    synonym_statement_count: 94414
    change_summary:
      NodeTextDefinitionChange: 21
      NodeUnobsoletion: 17
      EdgeCreation: 28
      NodeRename: 20
      RemoveSynonym: 3
      NewSynonym: 1
      NodeDeletion: 6
      EdgeDeletion: 20
      RemoveNodeFromSubset: 5
      All_Obsoletion: 0
      All_Synonym: 4
    edge_count: 53419
  molecular_function:
    id: molecular_function
    class_count: 12867
    deprecated_class_count: 2816
    non_deprecated_class_count: 10051
    class_count_with_text_definitions: 12867
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 12289
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
        filtered_count: 35
      RO:0002211:
        facet: RO:0002211
        filtered_count: 49
    distinct_synonym_count: 28684
    synonym_statement_count: 29837
    change_summary:
      EdgeDeletion: 28
      EdgeCreation: 12
      NodeTextDefinitionChange: 6
      MappingCreation: 4
      NodeDeletion: 12
      RemoveSynonym: 9
      NewSynonym: 5
      NodeUnobsoletion: 2
      NodeRename: 2
      RemoveMapping: 2
      RemoveNodeFromSubset: 1
      All_Obsoletion: 0
      All_Synonym: 14
    edge_count: 13544
  cellular_component:
    id: cellular_component
    class_count: 4603
    deprecated_class_count: 523
    non_deprecated_class_count: 4080
    class_count_with_text_definitions: 4603
    class_count_without_text_definitions: 0
    edge_count_by_predicate:
      rdfs:subClassOf:
        facet: rdfs:subClassOf
        filtered_count: 4699
      BFO:0000050:
        facet: BFO:0000050
        filtered_count: 1803
      BFO:0000051:
        facet: BFO:0000051
        filtered_count: 181
    distinct_synonym_count: 5116
    synonym_statement_count: 5315
    change_summary:
      NodeDeletion: 3
      EdgeDeletion: 4
      RemoveNodeFromSubset: 1
      NewSynonym: 2
      All_Obsoletion: 0
      All_Synonym: 2
    edge_count: 6683
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
