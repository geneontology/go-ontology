[![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Repository for GO Ontology

This repository contains the 'source' for the GO ontology. You should
__NOT__ use this repository to download production versions of
GO. Always use [the PURLs](http://obofoundry.org/ontology/go.html).

This repository is primarily for the developers of the GO.

The yaml design patterns are here: [src/design_patterns](src/design_patterns).

## Editors Instructions

The files required to maintain the ontology are in the [src/ontology](src/ontology) folder.

Instructions to edit the ontology can be found [here](http://wiki.geneontology.org/index.php/Ontology_Development). 

## Pipeline Overview

 - travis will perform fast tests on every commit or pull request (https://travis-ci.org/geneontology/go-ontology)
 - a jenkins job will run on every commit and produce inference reports (https://build.berkeleybop.org/job/go-new-inferences-summary-email/)
 - a jenkins job will produce nightly SNAPSHOT releases - https://build.geneontology.org/job/geneontology/job/pipeline/job/snapshot/
    * Our S3 bucket for go-data-product-snapshot/ontology/ which is mapped to http://snapshot.geneontology.org/ontology/, which is redirected to from the OBO Library PURL (http://purl.obolibrary.org/obo/go/snapshot/FOO)
 - a jenkins job will produce production releases, monthly (https://build.geneontology.org/job/geneontology/job/pipeline/job/release/)

### TEMPORARY

 - https://build.berkeleybop.org/job/sync-go-editors-from-github/ - copy from this repo to old svn repo, from which current pipeline currently runs
 
 
## Release Process

This Jenkins job will create releases https://build.geneontology.org/job/geneontology/job/pipeline/job/snapshot/

(see [the parent README](../../README.md) for more details)

The release process can be simulated as follows:

    cd src/ontology
    make

If this looks good type:

    make release

This generates derived files such as go.owl and go.obo and places
them in the target dir (../../target/). The versionIRI will be added.

At this point Jenkins will release the target files to S3, they will be available via the usual PURLs

 * http://purl.obolibrary.org/obo/go.owl <-- current ontology PURL
 * http://purl.obolibrary.org/obo/go/releases/YYYY-MM-DD.owl <-- change to the release you just made

For questions on this contact Chris Mungall or email obo-admin AT obofoundry.org

# Jobs

See [parent README](../../README.md)

# Travis Continuous Integration System

Check the build status here: [![Build Status](https://travis-ci.org/geneontology/go-ontology.svg?branch=master)](https://travis-ci.org/geneontology/go-ontology)

# Makefile

The [Makefile](Makefile) contains instructions to automatically build (or simulate the build) of the release.

To run tests:

`make test`

(this is what is executed by travis)

To prepare files for a release:

`make prepare_release`

To regenerate stale imports:

`make all_imports`

