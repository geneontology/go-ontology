# GO Ontology Project Guide

This includes instructions for editing the npso ontology. 

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

## TROUBLESHOOTING
- if your obo file has syntax errors, you can use `robot convert -vvv` to see full trace
