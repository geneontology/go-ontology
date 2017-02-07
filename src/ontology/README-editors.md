# GO Editors Instructions

Make sure you have an ID range in the [idranges file](go-idranges.owl)

If you do not have one, get one from the head curator.

The editors version is [go-edit.obo](go-edit.obo)

__NOTE__ derived release files are NOT stored in this repository. We instead deploy to S3 via Jenkins.

To edit, open the file in Protege. First make sure you have the repository cloned, see [the GitHub project](https://github.com/obophenotype/gene-ontology) for details.

## ID Ranges

These are stored in the file

 * [go-idranges.owl](go-idranges.owl)

** ONLY USE IDs WITHIN YOUR RANGE!! **

If you have only just set up this repository, modify the idranges file
and add yourself or other editors. Note Protege does not read the file
- it is up to you to ensure correct Protege configuration.


## Setting ID ranges in Protege

We aim to put this up on the technical docs for OBO on http://obofoundry.org/

For now, consult the [Protege Planteome Tutorial](https://github.com/Planteome/protege-tutorial/blob/master/presentations/protege_planteome_tutorial.doc?raw=true) and look for the section "new entities"


## Release Process

NOT YET LIVE

This Jenkins job will create releases https://build.berkeleybop.org/job/release-go-NEW/

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

 - travis will perform fast tests on every commit or pull request
 - a jenkins job will run on every commit and produce inference reports
 - a jenkins job will produce SNAPSHOT releases
 - a jenkins job will produce production releases - https://build.berkeleybop.org/job/release-go-NEW

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
