PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
DELETE {
  ?taxonA owl:disjointWith ?taxonB .
  ?taxonB owl:disjointWith ?taxonA .
}
WHERE {
  ?taxonA owl:disjointWith ?taxonB . 
  FILTER(!STRSTARTS(STR(?taxonA), "http://purl.obolibrary.org/obo/NCBITaxon_Union"))
  FILTER(!STRSTARTS(STR(?taxonB), "http://purl.obolibrary.org/obo/NCBITaxon_Union"))
  FILTER(isIRI(?taxonA))
  FILTER(isIRI(?taxonB))
}
