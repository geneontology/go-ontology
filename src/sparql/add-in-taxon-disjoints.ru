PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX in_taxon: <http://purl.obolibrary.org/obo/RO_0002162>
INSERT {
  [  
     a owl:Restriction ;
     owl:onProperty in_taxon: ;
     owl:someValuesFrom ?taxonA ;
     owl:disjointWith [
       a owl:Restriction ;
       owl:onProperty in_taxon: ;
       owl:someValuesFrom ?taxonB
     ]
  ] .
}
WHERE {
  ?taxonA owl:disjointWith ?taxonB . 
  FILTER(isIRI(?taxonA))
  FILTER(isIRI(?taxonB))
  FILTER(STRSTARTS(STR(?taxonA), "http://purl.obolibrary.org/obo/NCBITaxon_"))
  FILTER(STRSTARTS(STR(?taxonB), "http://purl.obolibrary.org/obo/NCBITaxon_"))
}
