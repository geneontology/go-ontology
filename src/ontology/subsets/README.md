# Subsets

This folder contains manually maintained metadata about subsets, including the subset type and the taxonomic range to which it applies. For more information see the Subsets Schema at https://github.com/geneontology/go-ontology/blob/master/src/ontology/subsets/subsets.schema.yaml.

GO subsets are derived from the ontology, and are produced here (http://current.geneontology.org/ontology/subsets/index.html)http://current.geneontology.org/ontology/subsets/index.html.

## Metadata

Subset metadata is in the file [go_subsets_metadata.yaml](go_subsets_metadata.yaml). The schema
is described in LinkML. A derived JSON-Schema file is provided.

Note that validation is not yet integrated into gh actions. For now,
do this:

    linkml-validate -s subsets.schema.yaml go_subsets_metadata.yaml


Or simply

   make validate


