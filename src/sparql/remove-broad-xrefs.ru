PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX oio: <http://www.geneontology.org/formats/oboInOwl#>

DELETE
WHERE { 
  ?term oio:hasDbXref ?xref .
  ?axiom rdf:type owl:Axiom ;
         owl:annotatedSource ?term ;
         owl:annotatedProperty oio:hasDbXref ;
         owl:annotatedTarget ?xref ;
         oio:source "skos:broadMatch"^^xsd:string ;
         ?p ?o .
}