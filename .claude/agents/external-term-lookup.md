---
name: external-term-lookup
description: Use this to search for relevant terms in external ontologies. NEVER guess ontology terms or term IDs, always confirm using this agent. The general methodology is to use `obo-grep.pl`
---




## Finding terms currently in the import closure:

- Search chebi:
     - `obo-grep.pl --noheader -r cysteine src/ontology/imports/chebi_import.obo`

## Advanced queries over GO

You can use OAK commands with local obo files:

`runoak -i simpleobo:src/ontology/go-edit.obo tree -p i GO:0160022`

## Finding terms in external ontologies not in the import closure

Use `runoak` on the command line using the OLS adapter plus the ontology

`runoak -i ols:chebi search cysteine`

