#!/bin/sh
docker run -m 12g  -v $PWD/../../:/work -w /work/src/ontology --rm -ti obolibrary/odkfull  "$@"
