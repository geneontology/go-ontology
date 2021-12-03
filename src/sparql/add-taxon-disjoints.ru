PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX in_taxon: <http://purl.obolibrary.org/obo/RO_0002162>
INSERT {
  [  
     a owl:Restriction ;
     owl:onProperty in_taxon: ;
     owl:someValuesFrom ?subtaxon ;
     owl:disjointWith [
       a owl:Restriction ;
       owl:onProperty in_taxon: ;
       owl:someValuesFrom [
         a owl:Class ;
         owl:complementOf ?subtaxon
       ] 
     ]
  ] .
}
WHERE {
  ?subtaxon rdfs:subClassOf ?supertaxon . 
  FILTER(isIRI(?subtaxon))
  FILTER(STRSTARTS(STR(?subtaxon), "http://purl.obolibrary.org/obo/NCBITaxon_"))
}
