PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX oboInOwl: <http://www.geneontology.org/formats/oboInOwl#>
PREFIX skos: <http://www.w3.org/2004/02/skos/core#>
INSERT {
  ?term ?skosRelation ?mapping .
}
WHERE {
  VALUES ( ?skosCategory ?skosRelation) {
    ( "skos:exactMatch"   skos:exactMatch )
    ( "skos:narrowMatch"  skos:narrowMatch )
    ( "skos:broadMatch"   skos:broadMatch )
    ( "skos:relatedMatch" skos:relatedMatch )
    ( "skos:closeMatch"   skos:closeMatch )
  }
  # Should align with expansions defined in
  # https://github.com/geneontology/go-site/blob/master/metadata/db-xrefs.yaml
  # Each of these should be defined as an idspace in go-edit.obo
  # and also added in prefixes.jsonld
  VALUES ( ?prefix ?iriStem ) {
    ( "EC:"                "http://purl.uniprot.org/enzyme/" )
    ( "KEGG_REACTION:"     "http://www.kegg.jp/entry/" ) # update db-xrefs.yaml
    ( "TC:"                "http://identifiers.org/tcdb/" ) # update db-xrefs.yaml?
    ( "MetaCyc:"           "http://identifiers.org/metacyc.reaction/" )
    ( "Reactome:"          "http://identifiers.org/reactome/" )
    ( "RHEA:"              "http://rdf.rhea-db.org/" )
    ( "UM-BBD_pathwayID:"  "http://identifiers.org/umbbd.pathway/" ) # update db-xrefs.yaml
    ( "UM-BBD_reactionID:" "http://identifiers.org/umbbd.reaction/" ) # update db-xrefs.yaml
    ( "VZ:"                "https://viralzone.expasy.org/" ) # update db-xrefs.yaml
  }
  ?term a owl:Class .
  FILTER(isIRI(?term))
  FILTER(STRSTARTS(STR(?term), "http://purl.obolibrary.org/obo/GO_"))
  ?term oboInOwl:hasDbXref ?xref .
  [ a owl:Axiom ;
      owl:annotatedSource ?term ;
      owl:annotatedProperty oboInOwl:hasDbXref ;
      owl:annotatedTarget ?xref ;
      oboInOwl:source ?skosCategory
   ] .
   FILTER(STRSTARTS(?xref, ?prefix))
   BIND(IRI(CONCAT(?iriStem, STRAFTER(?xref, ?prefix))) AS ?mapping)
}
