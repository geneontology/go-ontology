[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository contains the 'source' for the GO ontology. You should
__NOT__ use this repository to download production versions of
GO. Always use [the PURLs](http://obofoundry.org/ontology/go.html).

This repository is primarily for the developers of the GO.

The ontology design patterns are here: [src/design_patterns](src/design_patterns).

## Editors Instructions

Most of the work of the editors is done in the [src/ontology](src/ontology) folder.

Instructions for editing the ontology can be found in the [GO wiki/Ontology section](http://wiki.geneontology.org/index.php/Ontology_Development). 

## Pipeline Overview

 - Travis perform tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - A Jenkins job runs on every commit and produce inference reports (https://build.berkeleybop.org/job/go-new-inferences-summary-email/)
 - A jenkins job producse nightly SNAPSHOT releases - https://build.geneontology.org/job/geneontology/job/pipeline/job/snapshot/
    * Our S3 bucket for go-data-product-snapshot/ontology/ which is mapped to http://snapshot.geneontology.org/ontology/, which is redirected to from the OBO Library PURL (http://purl.obolibrary.org/obo/go/snapshot/FOO)
 - a jenkins job will produce production releases, monthly (https://build.geneontology.org/job/geneontology/job/pipeline/job/release/)

### TEMPORARY

 - https://build.berkeleybop.org/job/sync-go-editors-from-github/ - copy from this repo to old svn repo, from which current pipeline currently runs
