Note: the most up to date documentation is currently here, this will later be translated into Markdown:

https://docs.google.com/document/d/165IqcYhyGUolphR-wIO0rgO57lhW869TQplY534jWUA/edit

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

Go to Properties/New Entities

Entity IRI

 * Start with: `http://purl.obolibrary.org/obo`
 * Followed by: `/`

Entity Label

 * Custom label: `http://www.w3.org/2000/01/rdf-schema#label`

Auto-generated ID

 * Numeric
 * Prefix `GO_`
 * Suffix: leave this blank
 * Digit Count `7`
 * Start: see go-idranges.owl
 * End: see go-idranges.owl
 * Remember ID: __ALWAYS CHECK THIS__

Note you want the ID to be remembered to prevent clases when working in parallel on branches

## Release Process

This Jenkins job will create releases https://build.berkeleybop.org/job/release-go-ontology-snapshot

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

# Tips

## Setting up your local git

Add the following to your ~/.profile or ~/.bashrc:


```
. ~/repos/go-ontology/src/util/git-completion.bash
parse_git_branch() {
  git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'
}
PS1="\w\$(parse_git_branch) $ "
```


