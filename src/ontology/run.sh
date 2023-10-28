#!/bin/sh

# Any updates to the odkfull version MUST be coordinated with geneontology/pipeline.
# When updating the odkfull version, remember to also update the GitHub Actions workflows.

docker run -m 12g  -v $PWD/../../:/work -w /work/src/ontology --rm -ti obolibrary/odkfull:v1.4 "$@"
