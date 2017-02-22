[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository contains the 'source' for the GO ontology. You should
__NOT__ use this repository to download production versions of
GO. Always use the PURLs.

This repository is primarily for the developers of the GO.

## Editors Instructions

Most of the work of the editors is done in the [src/ontology](src/ontology) folder.

Please start by reading the [src/ontology/README-editors.md](src/ontology/README-editors.md) file.

## Pipeline

 - travis will perform fast tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - a jenkins job will run on every commit and produce inference reports (TODO)
 - a jenkins job will produce SNAPSHOT releases - https://build.berkeleybop.org/job/release-go-snapshot-NEW
 - a jenkins job will produce production releases - https://build.berkeleybop.org/job/release-go-NEW

