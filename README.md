[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository contains the 'source' for the GO ontology. You should
__NOT__ use this repository to download production versions of
GO. Always use the PURLs.

This repository is primarily for the developers of the GO.

## Editors Instructions

Most of the work of the editors is done in the [src/ontology](src/ontology) folder.

Please start by reading the [src/ontology/README-editors.md](src/ontology/README-editors.md) file.

## Pipeline Overview

 - travis will perform fast tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - a jenkins job will run on every commit and produce inference reports (TODO)
 - a jenkins job will run on every commit (TODO: merge with above)  - https://build.berkeleybop.org/job/build-go-NEW
 - a jenkins job will produce nightly SNAPSHOT releases TODO - https://build.berkeleybop.org/job/release-go-snapshot-NEW
 - a jenkins job will produce production releases - https://build.berkeleybop.org/job/release-go-NEW

### TEMPORARY

 - https://build.berkeleybop.org/job/sync-go-editors-from-github/ - copy from this repo to old svn repo, from which current pipeline currently runs
