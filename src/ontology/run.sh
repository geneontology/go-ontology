#!/bin/sh

# Any updates to the odkfull version MUST be coordinated with geneontology/pipeline.
# When updating the odkfull version, remember to also update the GitHub Actions workflows.

# Keep Scala CLI/Coursier downloads across disposable containers.
docker run -m 12g -v $PWD/../../:/work -v go-ontology-coursier:/root/.cache/coursier -w /work/src/ontology --rm -ti obolibrary/odkfull:v1.6.1 "$@"
