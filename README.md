[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository contains the 'source' for the GO ontology. You should
__NOT__ use this repository to download production versions of
GO. Always use the PURLs.

This repository is primarily for the developers of the GO.

## Editors Instructions

Most of the work of the editors is done in the [src/ontology](src/ontology) folder.

Start by reading the [Editor's README](src/ontology/README-editors.md) file.

Find the [GO Ontology Editors Guide here](http://go-ontology.readthedocs.io/). The files to edit the guide in GitHub are located in the [docs](docs/) folder.

## Pipeline Overview

 - travis will perform fast tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - a jenkins job will run on every commit and produce inference reports (TODO)
 - a jenkins job will run on every commit (TODO: merge with above)  - https://build.berkeleybop.org/job/build-go-NEW
 - a jenkins job will produce nightly SNAPSHOT releases - https://build.berkeleybop.org/job/release-go-ontology-daily-snapshot
    * Our S3 bucket for go-data-product-snapshot/ontology/ which is mapped to http://snapshot.geneontology.org/ontology/, which is redirected to from the OBO Library PURL
 - a jenkins job will produce production releases - https://build.berkeleybop.org/job/release-go-ontology-production/
    * https://s3.amazonaws.com/go-data-product-current/ontology/ which is mapped to http://current.geneontology.org/ontology/
    * https://s3.amazonaws.com/go-data-product-release/ontology/ which is mapped to http://release.geneontology.org/ontology/

### TEMPORARY

 - https://build.berkeleybop.org/job/sync-go-editors-from-github/ - copy from this repo to old svn repo, from which current pipeline currently runs
