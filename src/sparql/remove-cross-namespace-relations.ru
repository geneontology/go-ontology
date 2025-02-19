PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX oio: <http://www.geneontology.org/formats/oboInOwl#>

DELETE {
  ?term rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?filler .
}
WHERE { 
  ?term rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?filler .
  ?term oio:hasOBONamespace ?term_ns .
  ?filler oio:hasOBONamespace ?filler_ns .
  FILTER(?term_ns != ?filler_ns)
}
