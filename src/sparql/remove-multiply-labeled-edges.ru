PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX oio: <http://www.geneontology.org/formats/oboInOwl#>
PREFIX regulates: <http://purl.obolibrary.org/obo/RO_0002211>
PREFIX positively_regulates: <http://purl.obolibrary.org/obo/RO_0002213>
PREFIX negatively_regulates: <http://purl.obolibrary.org/obo/RO_0002212>

# For go-basic.
# Filter out other relations between two terms when is_a already exists.

DELETE {
  ?term1 rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?term2 .
  ?axiom ?p ?o .
}
WHERE {
  ?term1 rdfs:subClassOf ?term2 .
  ?term1 rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?term2 .
  OPTIONAL {
    ?axiom rdf:type owl:Axiom ;
           owl:annotatedSource ?term1 ;
           owl:annotatedProperty rdfs:subClassOf ;
           owl:annotatedTarget ?svf ;
           ?p ?o .
  }
}
