[![Build Status](https://travis-ci.org/geneontology/design_patterns.svg?branch=master)](https://travis-ci.org/geneontology/design_patterns)


# design_patterns

A repository of design patterns for GO, written using [DOS-DP](https://github.com/dosumis/dead_simple_owl_design_patterns).

Experimental/draft patterns live in the folder draft_patterns.

Patterns for validation live in the validated_patterns folder.  Patterns in here against the pattern schema via travis.  Current status: [![Build Status](https://travis-ci.org/geneontology/design_patterns.svg?branch=master)](https://travis-ci.org/geneontology/design_patterns)

# Querying the ontology

https://build.berkeleybop.org/job/query-go-patterns/

```
dsversion=0.3.2

curl -L -O https://github.com/balhoff/dosdp-scala/releases/download/v$dsversion/dosdp-scala-$dsversion.tgz

tar -zxf dosdp-scala-$dsversion.tgz

export PATH=$PATH:$(pwd)/dosdp-scala-$dsversion/bin

git clone https://github.com/geneontology/go-ontology.git

cd src/design_patterns

make query
```
