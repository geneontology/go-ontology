[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository is primarily for the developers of the GO and contains the source code for the GO ontology. 

More general documentation about GO can be found on the [GO website](http://geneontology.org/); ontology files can be downloaded from the [GO website/downloads](http://geneontology.org/docs/downloads/).

You should __NOT__ use this repository to download production versions of GO.

## Ontology Editors

Instructions for editing the ontology can be found in the [GO wiki/Ontology section](http://wiki.geneontology.org/index.php/Ontology_Development). 

## Ontology Pipeline Overview

 - Travis performs tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - A Jenkins job runs on every commit and produce inference reports (https://build.berkeleybop.org/job/go-new-inferences-summary-email/)
 - A jenkins job producse nightly SNAPSHOT releases - https://build.geneontology.org/job/geneontology/job/pipeline/job/snapshot/
    * Our S3 bucket for go-data-product-snapshot/ontology/ which is mapped to http://snapshot.geneontology.org/ontology/, which is redirected to from the OBO Library PURL (http://purl.obolibrary.org/obo/go/snapshot/FOO)
 - A jenkins job will produce production releases, monthly (https://build.geneontology.org/job/geneontology/job/pipeline/job/release/)
