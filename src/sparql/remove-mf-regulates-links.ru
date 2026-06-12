PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX oio: <http://www.geneontology.org/formats/oboInOwl#>
PREFIX regulates: <http://purl.obolibrary.org/obo/RO_0002211>
PREFIX positively_regulates: <http://purl.obolibrary.org/obo/RO_0002213>
PREFIX negatively_regulates: <http://purl.obolibrary.org/obo/RO_0002212>

DELETE {
  ?term rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?filler .
}
WHERE {
  VALUES ?relation {
    regulates:
    positively_regulates:
    negatively_regulates:
  }
  ?term rdfs:subClassOf ?svf .
  ?svf owl:onProperty ?relation ;
       owl:someValuesFrom ?filler .
  ?term oio:hasOBONamespace "molecular_function"^^xsd:string .
  ?filler oio:hasOBONamespace "molecular_function"^^xsd:string .
}
