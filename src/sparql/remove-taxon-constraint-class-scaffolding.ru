PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>

# Remove all taxon-constraint-class scaffolding from a GO product.
#
# The taxon constraint classes (their in_taxon restriction axioms, declarations, labels,
# disjoints) are removed by unmerging the go-taxon-constraint-classes.owl import. This update mops
# up everything unmerge cannot reach: the asserted is_a edges from GO terms to taxon constraint
# classes (they live in the edit file, not the import) AND any axioms a reasoner inferred between
# taxon constraint classes (e.g. "only in Vertebrata" SubClassOf "only in Bilateria"). It deletes
# every triple whose subject or object is in the taxon-constraint-class namespace.
#
# Run AFTER unmerging the taxon-constraint-classes import and BEFORE/anytime relative to merging
# the computed constraints (which never reference taxon-constraint-class IRIs).
DELETE {
  ?s ?p ?o .
}
WHERE {
  ?s ?p ?o .
  FILTER( STRSTARTS(STR(?s), "http://geneontology.org/internal/taxon-constraints/")
       || STRSTARTS(STR(?o), "http://geneontology.org/internal/taxon-constraints/") )
}
