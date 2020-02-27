# Instructions for Editors of the Gene Ontology

## GO - Ontology Editors Guide

A step-by-step guide for GO Ontology Editors can be found at [http://wiki.geneontology.org/index.php/Ontology_Development#Documentation](http://wiki.geneontology.org/index.php/Ontology_Development#Documentation).

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
