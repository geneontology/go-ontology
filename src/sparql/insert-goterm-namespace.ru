PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
prefix xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX oio: <http://www.geneontology.org/formats/oboInOwl#>
PREFIX GO: <http://purl.obolibrary.org/obo/GO_>

INSERT {
  ?term oio:hasOBONamespace ?namespace .
}
WHERE { 
  VALUES (?root ?namespace) {
    ( GO:0003674 "molecular_function" )
    ( GO:0008150 "biological_process" )
    ( GO:0005575 "cellular_component" )
  }
  ?term rdfs:subClassOf* ?root .
  FILTER(isIRI(?term))
  FILTER(STRSTARTS(STR(?term), "http://purl.obolibrary.org/obo/GO_"))
}
