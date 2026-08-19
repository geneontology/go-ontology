# molecular carrier activity

[http://purl.obolibrary.org/obo/go/patterns/molecular_carrier_activity.yaml](http://purl.obolibrary.org/obo/go/patterns/molecular_carrier_activity.yaml)

## Description

Molecular carrier activities differentiated by cargo. A carrier binds a specific chemical entity or protein and moves with it to an acceptor molecule or a specific location.
Label conventions (editorial, not encoded in the axiom):
  - Default label form: '%s carrier activity' (e.g. lipid carrier activity,
    oxygen carrier activity, lipoprotein carrier activity).
  - For carriers whose acceptor is a protein (metal chaperones, histone
    chaperones, etc), curators use '%s chaperone activity' instead
    (e.g. metallochaperone activity, copper chaperone activity,
    iron chaperone activity, iron-sulfur cluster chaperone activity,
    zinc chaperone activity, nickel chaperone activity).
  - Exception: GO:0140597 keeps the label 'protein carrier activity'
    rather than 'protein chaperone activity' to avoid a collision with
    GO:0044183 protein folding chaperone, which is a different
    sense of "chaperone" (folding assistance rather than cargo delivery).

The carrier/chaperone distinction is editorial only - the equivalence axiom is the same for both. Chaperone and non-chaperone terms are both listed in the companion TSV.
When the cargo cannot be pinned to a single class (heterogeneous cargo) but the transport process is defined, use molecular_carrier_activity_by_process.yaml instead.





## Variables

| Variable name | Allowed type |
|:--------------|:-------------|
| `{cargo}` | [chemical entity](http://purl.obolibrary.org/obo/CHEBI_24431) or [protein](http://purl.obolibrary.org/obo/PR_000000001) |

## Name

"`{cargo}` carrier activity"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Annotations

- [has_obo_namespace](http://www.geneontology.org/formats/oboInOwl#hasOBONamespace): "molecular_function"^^[string](http://www.w3.org/2001/XMLSchema#string)

## Definition

"Binding to and delivering `{cargo}` to an acceptor molecule or a specific location."^^[string](http://www.w3.org/2001/XMLSchema#string)

## Equivalent to

[molecular carrier activity](http://purl.obolibrary.org/obo/GO_0140104)  and ([has primary input](http://purl.obolibrary.org/obo/RO_0004009) some `{cargo}`)







## Data preview

*See full table [here](https://github.com/geneontology/go-ontology/tree/master/src/design_patterns/molecular_carrier_activity.tsv)*

| defined_class | defined_class_label | cargo | cargo_label |
|:--|:--|:--|:--|
| [http://purl.obolibrary.org/obo/GO_0016531](http://purl.obolibrary.org/obo/GO_0016531) | copper chaperone activity | [http://purl.obolibrary.org/obo/CHEBI_23378](http://purl.obolibrary.org/obo/CHEBI_23378) | copper cation |
| [http://purl.obolibrary.org/obo/GO_0034986](http://purl.obolibrary.org/obo/GO_0034986) | iron chaperone activity | [http://purl.obolibrary.org/obo/CHEBI_24875](http://purl.obolibrary.org/obo/CHEBI_24875) | iron cation |
| [http://purl.obolibrary.org/obo/GO_0140132](http://purl.obolibrary.org/obo/GO_0140132) | iron-sulfur cluster chaperone activity | [http://purl.obolibrary.org/obo/CHEBI_30408](http://purl.obolibrary.org/obo/CHEBI_30408) | iron-sulfur cluster |
| [http://purl.obolibrary.org/obo/GO_0005319](http://purl.obolibrary.org/obo/GO_0005319) | lipid carrier activity | [http://purl.obolibrary.org/obo/CHEBI_18059](http://purl.obolibrary.org/obo/CHEBI_18059) | lipid |
| [http://purl.obolibrary.org/obo/GO_0140598](http://purl.obolibrary.org/obo/GO_0140598) | lipoprotein carrier activity | [http://purl.obolibrary.org/obo/CHEBI_6495](http://purl.obolibrary.org/obo/CHEBI_6495) | lipoprotein |

