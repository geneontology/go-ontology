# GO Ontology Project Guide

This includes instructions for editing the GO ontology. 

## Project Layout
- Main development file is `src/ontology/go-edit.obo`
- individual terms checked out in `terms`

## Querying ontology

- To look at a specific term if you know the ID:
    - `obo-grep.pl -r 'id: GO:0004177' src/ontology/go-edit.obo`
- All mentions of an ID
    - `obo-grep.pl -r 'GO:0004177' src/ontology/go-edit.obo`
- Note that `obo-grep.pl` is in your PATH, no need to search for it    
- Only search over `src/ontology/go-edit.obo`
- DO NOT bother doing your own greps over the file, or looking for other files, unless otherwise asked, you will just waste time.
- ONLY use the methods above for searching the ontology

## Before making edits
- Read the request carefully and make a plan, especially if there is nuance
- If related issues are mentioned read them: `gh issue view GITHUB-ISSUE-NUMBER`
- if a PMID is mentioned in the issue, ALWAYS try and read it
- ALWAYS check proposed parent terms for consistency
- For terms that are compositional, check `src/patterns/dosdp-patterns/*.yaml`

## Editors guide
- design patterns are in docs/patterns

## Edits
- IMPORTANT: Do not edit the edit file directly, it's large
- Add edits should be made in the `terms/` folder
- check out a term into `terms/`: `obo-checkout.pl src/ontology/go-edit.obo GO:1234567 [OTHER IDS]`
- This will create a single stanza obo files `terms/npso_1234567.obo` which you can easily edit
     - (note the colon is replaced with an underscore)
- You can go ahead and edit the smallers files in the `terms/` folder
- After edits, check back in: `obo-checkin.pl src/ontology/go-edit.obo GO:1234567 [OTHER IDS]`
- if you like you can edit multiple terms in one batch, e.g. `terms/my_batch.obo`
     - `obo-checkout.pl src/ontology/go-edit.obo terms/my_batch.obo`
- checking in will update the edit file and remove the file from `terms/`
- Commits are then made on src/ontology/go-edit.obo as appropriate
- Note that `obo-checkin.pl` and `obo-checkin.pl` are in your PATH, no need to search for it    


## OBO Format Guidelines
- Term ID format: GO:NNNNNNN (7-digit number)
- Handling New Term Requests (NTRs):
  - New terms start  GO:777xxxx
  - Do do `grep id: GO:777 src/ontology/go-edit.obo` to check for clashes
- Each term requires: id, name, namespace, definition with references
- Never guess GO IDs, use search tools above to determine actual term
- Never guess PMIDs for references, do a web search if needed
- Use standard relationship types: is_a, part_of, has_part, etc.
- Follow existing term patterns for consistency

## Publications
- Run the command `aurelian fulltext <PMID:nnn>` to fetch full text for a publication. A doi or URL can also be used
- You should cite publications appropriately, e.g. `def: "...." [PMID:nnnn, doi:mmmm]

## GitHub Contribution Process
- most requests from users should follow one of two patterns:
    - you are not confident how to proceed, in which case end with asking a clarifying question (via `gh`)
    - you are confident how to proceed, you make changes, commit on a branch, and open a PR for the user to review
- Check existing terms before adding new ones
- For new terms: provide name, definition, place in hierarchy, and references
- Include PMIDs for all assertions
- Follow naming conventions from parent terms
- always commit in a branch, e.g. issue-NNN
- always make clear detailed commit messages, saying what you did and why
- always sign your commits `@dragon-ai-agent`
- create PRs using `gh pr create ...`
- File PRs with clear descriptions, and sign your PR

## Handling GitHub issues and requests
- Use `gh` to read and write issues/PRs
- Sign all commits and PRs as `@dragon-ai-agent`

## Syntax Checking

- To validate syntax: `robot convert --catalog src/ontology/catalog-v001.xml -i go-edit.obo -f obo -o go-edit.TMP.obo`
- Use `-vvv` for a full stack trace if there are errors.

## Gene Ontology Guidelines

## `namespace` tags

Unlike other obo ontologies, there is always a `namespace:` tag in GO.

## Obsoleting terms

obsolete terms should have no logical axioms (is_a, relationship,
intersection_of) on them. Obsolete terms may be replaced by a single
term (so-called obsoletion with exact replacement), or by zero to many `consider` tags.

Synonyms and xrefs can be migrated judiciously,

We never do complete merges now, so there should be no `alt_ids` or
disappearing stanzas. If a user asks for a merge, they usually mean
obsoletion with direct replacement, as here:

```
[Term]
id: GO:0000170
name: obsolete sphingosine hydroxylase activity
namespace: molecular_function
def: "OBSOLETE. Catalysis of the hydroxylation of sphingolipid long chain bases." [PMID:9556590]
comment: The reason for obsoletion is that this term is equivalent to sphingolipid C4-monooxygenase activity.
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29717" xsd:anyURI
is_obsolete: true
replaced_by: GO:0102772
```

Note the pattern for names and definitions.

No relationship should point to an obsolete term - when you obsolete a term, you may need to also rewire
terms to "skip" the obsoleted term.

## Other metadata

- Link back to the issue you are dealing with using the `term_tracker_item`
- All terms should have definitions, with at least one definition xref, ideally a PMID
- You can sign terms as `created_by: dragon-ai-agent`

## Relationships

All terms should have at least one `is_a` (this can be implicit by a logical definition, see below).
It's common for BP and CC terms to have a `part_of` relationship.

## Taxon Constraints

These live in `src/taxon_constraints`

- `never_in_taxon.tsv`
- `only_in_taxon.tsv`

When obsoleting a term, you may need to remove the taxon constraint, as these should never point to obsoletes

## Logical definitions

These should follow genus-differentia form, and the text definition should mirror the logical definition. Example:

```
[Term]
id: GO:0001649
name: osteoblast differentiation
namespace: biological_process
def: "The process whereby a relatively unspecialized cell acquires the specialized features of an osteoblast, a mesodermal or neural crest cell that gives rise to bone." [CL:0000062]
synonym: "osteoblast cell differentiation" EXACT []
intersection_of: GO:0030154 ! cell differentiation
intersection_of: results_in_acquisition_of_features_of CL:0000062 ! osteoblast
relationship: part_of GO:0001503 ! ossification
```

Here the genus is `cell differentiation` and the differentia points to a CL term. Never guess these IDs, use tools to find them.
Never guess the pattern or relationships. Consult the design pattern docs or look for similar terms (e.g. other differentiation terms).

The reasoner can find the most specific `is_a`, so it's OK to leave this off.

## Reaction Terms

Reaction terms may have mappings that are qualified using skos (using `source` qualifiers), as in the following:

```
[Term]
id: GO:0000140
name: acylglycerone-phosphate reductase (NADP+) activity
namespace: molecular_function
def: "Catalysis of the reaction: 1-hexadecanoyl-sn-glycero-3-phosphate + NADP+ = 1-hexadecanoylglycerone 3-phosphate + H+ + NADPH." [RHEA:17341]
synonym: "1-acyldihydroxyacetone-phosphate reductase activity" EXACT []
synonym: "1-palmitoylglycerol-3-phosphate:NADP+ oxidoreductase activity" RELATED [EC:1.1.1.101]
synonym: "acyldihydroxyacetone phosphate reductase activity" RELATED [EC:1.1.1.101]
synonym: "palmitoyl dihydroxyacetone phosphate reductase activity" RELATED [EC:1.1.1.101]
synonym: "palmitoyl-dihydroxyacetone-phosphate reductase activity" RELATED [EC:1.1.1.101]
synonym: "palmitoyldihydroxyacetone-phosphate reductase activity" RELATED [EC:1.1.1.101]
xref: EC:1.1.1.101 {source="skos:exactMatch"}
xref: MetaCyc:ACYLGLYCERONE-PHOSPHATE-REDUCTASE-RXN {source="skos:exactMatch"}
xref: MetaCyc:RXN-15046 {source="skos:narrowMatch"}
xref: RHEA:17341 {source="skos:exactMatch"}
xref: RHEA:36175 {source="skos:narrowMatch"}
is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
```

Ideally there is a single source of truth for a reaction terms, which should be specified in the def xref



