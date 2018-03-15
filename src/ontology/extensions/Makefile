

# -- GLOBAL VARIABLES --


OBO=        http://purl.obolibrary.org/obo

# ----------------------------------------
# ANNOTATION RELATIONS
# ----------------------------------------

# Create a module from RO that is seeded from the gorel-edit ontology.
# Note that to be a seed, a relation needs at least one logical axiom;
# we recommend making each RO relation to be seeded a subproperty of 'go annotation extension relation'
gorel-ro-import.owl: gorel-edit.owl ../imports/ro_import.owl
	owltools $< --add-support-from-imports --extract-module -c -s $(OBO)/ro.owl -o $@

# Public edition: gorel-edit axioms merged with RO module
gorel.owl: gorel-edit.owl gorel-ro-import.owl
	owltools --map-ontology-iri $(OBO)/ro.owl gorel-ro-import.owl $< --merge-imports-closure --add-obo-shorthand-to-properties -o $@

# OBO translation, with symbols as IDs
gorel.obo: gorel.owl
	owltools $< --add-obo-shorthand-to-properties --remove-tbox -o -f obo --no-check $@.tmp && grep -v ^owl-axioms $@.tmp > $@
