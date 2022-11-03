[![Build Status](https://github.com/geneontology/go-ontology/workflows/CI/badge.svg)](https://github.com/geneontology/go-ontology/actions?query=workflow%3ACI)

# Repository for GO Ontology

This repository is primarily for the developers of the GO and contains the source code for the GO ontology. 

More general documentation about GO can be found on the [GO website](http://geneontology.org/); ontology files can be downloaded from the [GO website/downloads](http://geneontology.org/docs/download-ontology/).

You should __NOT__ use this repository to download production versions of GO.

## Ontology Editors

Instructions for editing the ontology can be found in the [GO wiki/Ontology section](http://wiki.geneontology.org/index.php/Ontology_Development#Editing_the_Ontology). 

## Ontology Pipeline Overview

 - GitHub Actions performs tests on every commit or pull request - https://github.com/geneontology/go-ontology/actions?query=workflow%3ACI
 - A Jenkins job producse nightly SNAPSHOT releases - https://build.geneontology.org/job/geneontology/job/pipeline/job/snapshot/
    * The S3 bucket for go-data-product-snapshot/ontology/, mapped to http://snapshot.geneontology.org/ontology/, is redirected to from the OBO Library PURL (http://purl.obolibrary.org/obo/go/snapshot/FOO)
 - A Jenkins job produces monthly production releases (https://build.geneontology.org/job/geneontology/job/pipeline/job/release/)

