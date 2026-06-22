#!/bin/sh
# Build DOS-DP input TSVs for the taxon constraint classes.
#
# Usage:
#   make-taxon-constraint-templates.sh SEED UNIONS_TSV OUT_ONLYIN OUT_NEVERIN
#
#   SEED        atomic NCBITaxon seed list (imports/taxon_constraints_seed.txt),
#               lines "NCBITaxon:<id> ## <label-hint>" ('#' comment lines ignored)
#   UNIONS_TSV  output of robot query ../sparql/taxon-grouping-unions.sparql (TSV: "?union" with <IRI>)
#   OUT_ONLYIN  DOS-DP input for "only in" classes: atomic seed taxa + union taxa
#   OUT_NEVERIN DOS-DP input for "never in" classes: atomic seed taxa ONLY (no unions)
#
# Output columns (DOS-DP): defined_class, taxon
# Taxon labels are deliberately NOT emitted here; dosdp-tools resolves the label for the "name"
# field from its --ontology label source (taxslim for atomic taxa, go-taxon-groupings-edit for
# unions), which is more robust than carrying labels in this TSV.
# Grouping-class IRIs are deterministic:
#   only-in:  http://geneontology.org/internal/taxon-constraints/only-in/NCBITaxon_<localid>
#   never-in: http://geneontology.org/internal/taxon-constraints/never-in/NCBITaxon_<localid>
set -eu

SEED="$1"
UNIONS="$2"
OUT_ONLY="$3"
OUT_NEVER="$4"

ONLY_BASE="http://geneontology.org/internal/taxon-constraints/only-in/NCBITaxon_"
NEVER_BASE="http://geneontology.org/internal/taxon-constraints/never-in/NCBITaxon_"

printf 'defined_class\ttaxon\n' > "$OUT_ONLY"
printf 'defined_class\ttaxon\n' > "$OUT_NEVER"

# Atomic taxa from the seed -> both only-in and never-in rows.
atomic_rows() {  # $1 = defined_class base
  awk -v base="$1" '
    /^[[:space:]]*NCBITaxon:/ {
      id=$1; sub(/^NCBITaxon:/, "", id)
      printf "%s%s\tNCBITaxon:%s\n", base, id, id
    }
  ' "$SEED"
}
atomic_rows "$ONLY_BASE"  >> "$OUT_ONLY"
atomic_rows "$NEVER_BASE" >> "$OUT_NEVER"

# Union taxa from the groupings query -> only-in rows ONLY.
awk -F'\t' -v base="$ONLY_BASE" '
  NR==1 { next }
  $1 != "" {
    iri=$1; gsub(/^</, "", iri); gsub(/>$/, "", iri)
    sub(/^http:\/\/purl\.obolibrary\.org\/obo\/NCBITaxon_/, "", iri)   # iri -> local id, e.g. Union_0000004
    printf "%s%s\tNCBITaxon:%s\n", base, iri, iri
  }
' "$UNIONS" >> "$OUT_ONLY"
