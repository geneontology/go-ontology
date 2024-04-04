PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX in_taxon: <http://purl.obolibrary.org/obo/RO_0002162>
INSERT {
  ?complement_supertaxon rdfs:subClassOf ?complement_subtaxon .
  ?complement_subtaxon owl:equivalentClass [
    a owl:Class ;
    owl:complementOf ?subtaxon
  ] .
}
WHERE {
  ?subtaxon rdfs:subClassOf ?supertaxon . 
  FILTER(isIRI(?subtaxon))
  FILTER(STRSTARTS(STR(?subtaxon), "http://purl.obolibrary.org/obo/NCBITaxon"))
  FILTER(STRSTARTS(STR(?supertaxon), "http://purl.obolibrary.org/obo/NCBITaxon"))
  BIND(IRI(CONCAT(STR(?subtaxon), "#NOT")) AS ?complement_subtaxon)
  BIND(IRI(CONCAT(STR(?supertaxon), "#NOT")) AS ?complement_supertaxon)
}
