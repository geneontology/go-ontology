PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX in_taxon: <http://purl.obolibrary.org/obo/RO_0002162>
INSERT {
  ?subtaxon owl:disjointWith ?sibling .
}
WHERE {
  ?subtaxon rdfs:subClassOf ?supertaxon .
  ?sibling rdfs:subClassOf ?supertaxon .
  FILTER(?sibling != ?subtaxon)
  FILTER(isIRI(?subtaxon))
  FILTER(isIRI(?sibling))
  FILTER(STRSTARTS(STR(?subtaxon), "http://purl.obolibrary.org/obo/NCBITaxon_"))
  FILTER(STRSTARTS(STR(?sibling), "http://purl.obolibrary.org/obo/NCBITaxon_"))
}
