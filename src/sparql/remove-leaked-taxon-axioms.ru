PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>

# Cleanup for the taxon-constraint-classes import after precomputing its internal hierarchy.
# The hierarchy is computed by merging taxslim + the taxon unions and reasoning (jfact); after
# unmerging those, the reasoner-inferred taxonomy axioms (NCBITaxon_* / NCBITaxon_Union_* subclass
# etc.) remain. This removes every triple whose subject is an NCBITaxon class, so the import
# defines ONLY the taxon constraint classes (their equivalence axioms + the inferred
# constraint-class subsumption hierarchy). Referenced taxa survive as fillers and are re-declared
# on output.
DELETE {
  ?s ?p ?o .
}
WHERE {
  ?s ?p ?o .
  FILTER( STRSTARTS(STR(?s), "http://purl.obolibrary.org/obo/NCBITaxon_") )
}
