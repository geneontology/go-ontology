# GO Ontology Project Guide

This includes instructions for editing the go ontology and related files in response to GitHub issues.

## Project Layout

The project follows standard ODK layout:

 * src
    * ontology/
       * go-edit.obo
       * Makefile
       * ...
    * taxon_constraints/
       * only_in_taxon.tsv
       * never_in_taxon.tsv
 * terms/   ## checked out copies, for editing
    * GO_NNNNNNN.obo # checked out local copy
 * .claude/
    * agents/   ## specific agent instructions    

 For make targets, a standard pattern is `cd src/ontology && make <TARGET>`. Beware of accidentally changing to the `src/ontology`
 dir and forgetting where you are. It is best to run things from the top level

These instructions are optimized for claude code. Subagents are used, and defined
in `.claude/agents/`

## PLAN: Analyze Issue, Plan Approach, and create a TODO/checklist

Read the entire issue and all associated comments. Be aware that some issues may have auxhiliary discussions, your must first infer the
intent of the requesters and how to satisfy this in a way that conforms to best practice in the ontology. If the user intent from the
issue is hopelessly ambiguous, then write a note asking for clarification in the original issue (using `gh`) and end here.

Create a plan for addressing the issue. The plan MUST have the following components (you can have more components depending on the nature of the issue)

- [ ] PLAN: The issue and all its context has been analyzed, the intent is clear, and a plan for addressing it has been created
- [ ] PRE-VALIDATION: Current state of the ontology validates prior to any changes (if not, we can't validate our changes)
- [ ] RESEARCH: If appropriate, necessary background research performed; always invoke [research-agent] for this, it produces a RESEARCH.md file
- [ ] TERM-SEARCH: Relevant ontology terms (this ontology or others) have been consulted
- [ ] DESIGN-PATTERNS: Existing design patterms, terms, and documentation consulted; always invoke [design-pattern-agent] for this, which produces a DESIGN_PATTERNS.md doc
- [ ] EDITS: correct procedure is followed for making edits, using checkin/checkout commands, and local `./terms/ folder
- [ ] RELATIONSHIPS: appropriate relationships and logical axioms are included
    - [ ] logical definitions are appropriate, and are not over-specified, and conform to DESIGN_PATTERNS.md doc
    - [ ] relationships conform to other similar terms in the ontology
    - [ ] is_a is not over-asserted
    - [ ] is_a, part_of, and other relationships specified appropriately
- [ ] SPECIALIZED-EDITS: include checklists from the following subagents as appropriate, depending on the nature of the request
    - term-obsoletion agent; MUST be invoked for anything involving obsoletion/deprecation of terms
    - chemical-entity-agent; for any request involving CHEBI or chemical terms or nomenclature
    - reaction-agent; for any request involving RHEA, EC, or the cataltic activity branch of GO
    - taxon-constraint-agent; for any request involving restricting usage of a term or branch to a taxon/clade
- [ ] METADATA: The metadata for the changes is correct
- [ ] AUTOMATED-VALIDATION: The ontology validates correctly using `make travis_build` after changes have been made
- [ ] REFERENCE-VALIDATION: All references (eg PMIDs) introduced have been validated, and are relevant, and not typos or hallucinations; always invoke [research-agent] for this
- [ ] CHANGES-COMMITTED
    - [ ] RELEVANT-FILES: changes to src/ontology/go-edit.obo and any other content file are committed with detailed messages and signatures
    - [ ] ACCURACY: The changes made are biologically correct, accurate, and reasonably complete; always invoke [research-agent] to obtain background material
    - [ ] ISSUE-ALIGNMENT: The changes made are in accordance with the issue request and forms a coherent unit of work;
    - [ ] PR is created or amended
    - [ ] Communicate high level summary of changes on original issue(s), and any requests for further info 
    - [ ] Communicated on PR detailed description of changes made, and rationale. Include checklists.

If the user intent is not clear, or you are not confident to make changes, you should stop work, report back to the user, including any questions in the issue.

Otherwise, if you proceed to making and committing changes, include the checklist in the comments you communicate to the PR. Everything should be checked or marked N/A.

### PRE-VALIDATION: What to do if the ontology is invalid BEFORE you commence work.

In general you should ONLY make changes in scope of the issue. However, if validation fails
BEFORE you start work, and this requires a minor fix, go ahead and make it.

Otherwise you should not make edits, and end after communicating back on the original issue with
a detailed description of what is invalid, and a plan for how to fix things.

## RESEARCH [see also: research-agent]

You can do searches for literature using web search tools. For focused deep research, you can use `deep-research-client`.

Use PMIDs where possible, and ALWAYS check that these PMIDs are the correct ones, and not typos or hallucinated.

Never fabricate PMIDs or other reference IDs, always use the research-agent to produce a RESEARCH.md file which you can copy from.

## TERM-SEARCH: Search and lookup of GO terms

You should always find relevant terms in the ontology before starting work.

The recommended way to find terms in `src/ontology/go-edit.obo` is using `obo-grep.pl`

- To look at a specific term if you know the ID:
    - `obo-grep.pl --noheader -r 'id: GO:0004177' src/ontology/go-edit.obo`
- All mentions of an ID
    - `obo-grep.pl --noheader -r 'GO:0004177' src/ontology/go-edit.obo`
- Regexes; all mentions of hand (in any part of the stanza)
    - `obo-grep.pl --noheader -r 'hand' src/ontology/go-edit.obo`
- Regexes; all mentions of hand or foot:
    - `obo-grep.pl --noheader -r '(hand|foot)' src/ontology/go-edit.obo`
- Regexes; all mentions of hand or foot in the definition line:
    - `obo-grep.pl --noheader -r 'def: ".*(hand|foot)' src/ontology/go-edit.obo`
- Note that `obo-grep.pl` is in your PATH, no need to search for it    
- Only search over `src/ontology/go-edit.obo`

Troubleshooting: if you can't find `go-edit.obo` it likely means you have changed folder, navigate back up to where the repo is checked out

### Searching terms in other ontologies

See [external-term-lookup] agent if you need to find non-GO terms.

## DESIGN-PATTERNS: consult documented patterns for categories of ontology terms

This ontology includes many design patterns for different categories of term. If your plan involves making non-trivial edits then
you must use the *design-pattern-agent* to research what design patterns exist for terms to be edited.

### EDITS: creating changes to be checked into the edit obo file

The source file for this ontology is `src/ontology/go-edit.obo`. Generally editing should follow a "checkin" and "checkout" procedure (note: NOT the same as git checkin/out) to facilitate working with small term-specific files, rather than a megafile which is hard to fit into context.

The general procedure is:

* Find relevant terms with `obo-grep.pl`
* Checkout terms with `obo-checkout.pl`
* Make edits in terms/
* Checkin terms with `obo-checkin.pl`
* Perform ontology-wide validation

- IMPORTANT: Do not edit the edit file directly, it's large
- Add edits should be made in the `terms/` folder
- check out a term into `terms/`: `obo-checkout.pl src/ontology/go-edit.obo GO:1234567 [OTHER IDS]`
- This will create a single stanza obo files `terms/go_1234567.obo` which you can easily edit
     - (note the colon is replaced with an underscore)
- You can go ahead and edit the smallers files in the `terms/` folder
- After edits, check back in: `obo-checkin.pl src/ontology/go-edit.obo GO:1234567 [OTHER IDS]`
- if you like you can edit multiple terms in one batch, e.g. `terms/my_batch.obo`
     - `obo-checkout.pl src/ontology/go-edit.obo terms/my_batch.obo`
     - <make edits to terms/my_batch.obo>
     - `obo-checkin.pl src/ontology/go-edit.obo terms/my_batch.obo`
- checking in will update the edit file and remove the file from `terms/`
- Commits are then made on src/ontology/go-edit.obo as appropriate
- Note that `obo-checkout.pl` and `obo-checkin.pl` are in your PATH, no need to search for it    
- Always validate after checkin via `cd src/ontology && make travis_build`

### Creation of new terms

Always follow this procedure:

* Work on new terms in a file in the top level `terms/` folder
* New terms start  GO:777xxxx
   - Do do `grep id: GO:777 src/ontology/go-edit.obo` to check for clashes (in ids and alt_ids)
   - Make a file `terms/GO_777xxxx.obo` with a fresh stanza
* Place this in the edit file with `obo-checkin.pl src/ontology/go-edit.obo terms/GO_777xxxx.obo`

Please do not try and place new terms in the edit file directly as they may end up in the wrong place.

### OBO Format Guidelines

- Term ID format: GO:NNNNNNN (7-digit number)
- Each term requires: id, name, namespace, definition with references
- Never guess GO IDs, use search tools above to determine actual term
- Never guess PMIDs for references, do a web search if needed
- Use standard relationship types: is_a, part_of, has_part, etc.
- Follow existing term patterns for consistency

Tip: It's always a good idea to look at the structure of existing similar terms, these can be found with `obo-grep.pl`

## RELATIONSHIPS: logical axioms and conforming to design patterns

All terms should have at least one `is_a` (this can be implicit by a logical definition, see below).
It's common for BP and CC terms to have a `part_of` relationship. `regulates` relations are used for regulation terms.
In the edit file, all relationship types are specified using the "short form" and not the RO/BFO ID.

Logical definitions should be included if the term is compositional in nature, and there is a design pattern. Logical definitions should follow genus-differentia form, and the text definition should mirror the logical definition. 
 
 Here "logical definitions" means necessary AND SUFFICIENT conditions, expressed in obo format using `intersection_of` tags, which map to OWL equivalence axioms. E.g.

 ```obo
 id: T
 intersection_of: G ! <genus term>
 intersection_of: R D ! <differentia>
 ```
 <=>
 ```owl
 R EquivalentTo (G and R some D)
 ```

 Example:

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
These are necessary and sufficient conditions, so if there is another term for differentiation of a more specific kind of osteoblast, it will be classified here.

The reasoner can find the most specific `is_a`, so it's OK to leave this off. The edit file is in "pre-reasoned" state. Similarly, it's generally an anti-pattern to have more than one asserted `is_a`.

Always make sure that design patterns are conformed to, especially for compositional terms. Use the [design-pattern] agent to check for conformance of name, def and logical def.

But also use prior art: look for similar terms with `obo-grep.pl`

IMPORTANT: logical definitions should map to the text definition and label, and should specify BOTH necessary AND SUFFICIENT conditions.
It may be tempting to use the `intersection_of` construct for expressing links to external ontology terms, but it's fine to simply use `relationship` tags!

A common anti-pattern is using logical definitions where relationships suffice. This is over-specification. For example:

```
!! Example of an INCORRECT axiomatization
name: keratinization
def: "The process in which the cytoplasm of the outermost cells of the vertebrate epidermis is replaced by keratin. Keratinization occurs in the stratum corneum, feathers, hair, claws, nails, hooves, and horns." [GOC:dph, GOC:ebc, GOC:sdb_2009, GOC:tb]
intersection_of: GO:0032501 ! multicellular organismal process ### WRONG
intersection_of: occurs_in CL:0000362 ! epidermal cell         ### WRONG
```

The above is completely wrong. The formal reason that there are OTHER kinds of multicellular organismal processes that occur in epidermal cells that are NOT keratinizations. It might help to think of this in OWL terms, as saying kerarinization is the same as the intersection of MOPs that occurs_in some epidermal cell. Other red flags are:

1. This does not correspond to a design pattern
2. The label does to map to the logical definition (a label for this logical definition would be something like "epidermal multicellular process")
3. The text definition does not map to the logical definition (a text def for this logical definition would be something like "Any MOP that occurs in an epidermal cell")

In this case it is perfectly fine to have weaker axiomatization:

```
!! Example of an CORRECT weaker axiomatization
name: keratinization
def: "The process in which the cytoplasm of the outermost cells of the vertebrate epidermis is replaced by keratin. Keratinization occurs in the stratum corneum, feathers, hair, claws, nails, hooves, and horns." [GOC:dph, GOC:ebc, GOC:sdb_2009, GOC:tb]
is_a: GO:0032501 ! multicellular organismal process ### CORRECT
relationship: occurs_in CL:0000362 ! epidermal cell ### CORRECT
```

An example of when stronger axiomatization is warranted:

```
id: GO:0032042
name: mitochondrial DNA metabolic process
namespace: biological_process
def: "The chemical reactions and pathways involving mitochondrial DNA." [GOC:mah]
synonym: "mitochondrial DNA metabolism" EXACT []
synonym: "mtDNA metabolic process" EXACT []
synonym: "mtDNA metabolism" EXACT []
intersection_of: GO:0006259 ! DNA metabolic process
intersection_of: occurs_in GO:0005739 ! mitochondrion
```

Here the DP, label (and synonyms), text def, logical def all align, and the OWL axiomatization is trivially true.
 

## METADATA

- ALWAYS include created_by and creation_date for terms YOU CREATE
- NEVER add or modify these properties if you are simply editing an existing term
- Unlike other obo ontologies, there is always a `namespace:` tag in GO (including on obsolete terms)
- Link back to the issue you are dealing with using the `term_tracker_item`
- All terms should have definitions, with at least one definition xref, ideally a PMID

You are a GO ontology metadata validation specialist with deep expertise in OBO format standards and GO-specific curation requirements. Your primary responsibility is to ensure that all newly added or modified terms comply with GO's strict metadata standards.

Here is an example of a term with metadata:

```
id: GO:0170048
name: D-alanine import across plasma membrane
namespace: biological_process
def: "The directed import of D-alanine from the extracellular region across the plasma membrane and into the cytosol." [PMID:22418438, PMID:25425233]
synonym: "D-alanine import" BROAD []
synonym: "D-alanine import into cell" EXACT []
synonym: "D-alanine uptake" EXACT []
is_a: GO:0042941 ! D-alanine transmembrane transport
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26844" xsd:anyURI
created_by: ew
creation_date: 2024-01-26T22:35:49Z
```

Note the definition include provenances from two publications. One of the 3 GO namespaces are selected. The synonyms lack axiom-level provenance but this is acceptable for GO. Synonyms with appropriate scopes are present. There is a link to the term tracker that discusses or requests this term. There is provenance about the creation of the term.

When checking metadata on terms, you will:

1. **Add created_by and creation_date but ONLY for NEW terms**: 

These should ALWAYS be added for NEW terms, but NEVER added to existing terms.

Whenever you are creating an entirely new term, ensure that the following are generated:

   ```
   created_by: dragon-ai-agent
   creation_date: <YYYY-MM-DD>T<HH:MM:DD>Z
   ```

You can get the current date in this format via:

`date -u +"%Y-%m-%dT%H:%M:%SZ"`

NEVER add either of these if you are editing an existing term. Many legacy terms lack this property, that is OK! You ONLY stamp terms with these if you are generating a new term, in your own ID space.

Similarly 

2. **Check Required Metadata Elements**:
   - Verify presence of id, name, namespace, and definition
   - Ensure definition includes proper citations in square brackets
   - Confirm at least one is_a relationship exists (can be implicit through logical definitions)
   - Validate that synonyms include proper source attribution (optional)
   - IMPORTANT FOR GO: Check that namespace is one of: biological_process, molecular_function, or cellular_component

3. **Definition Source**: when adding or updating definitions
   - If an ORCID is provided by the user, and that ORCID is a person that contributed to the definition, include in definition provenance
   - Include any necessary PMIDs, but ensure these are validated; these should be taken from REFERENCES.md (produced by the research agent)

Example:

PMID only:

```
def: "<genus differentia definition>" [PMID:<localID>]
```

ORCID plus PMID:

```
def: "<genus differentia definition>" [ORCID:<orcidString>, PMID:<localID>]
```

In GO, sometimes a GOC:<userId> is acceptable for definition provenance.

NEVER guess ORCIDs or PMIDs or GOC IDs. Always validate PMIDs and conform that these are validated. Never guess an ORCID based on a person in an issue.

4. **Check Term Tracker Links**:
   - Verify presence of term_tracker_item property linking to the relevant GitHub issue
   - Ensure the URL format is correct: https://github.com/geneontology/go-ontology/issues/[NUMBER]

These MUST have the following format:

```
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/<NUMBER>" xsd:anyURI
```


## SPECIALIZED-EDITS: appropriate subagents should be used for special cases

- term obsoletions, invoke the [term-obsoletion] agent
    - ensure no references (in ontology or annotations) to obsolete terms; rewire if necessary
    - ensure migration of axioms
    - ensure minimal axioms remain in obsolete term
    - follow metadata conventions
- anything involving CHEBI/chemical entities, invoke the [chemical-entity-agent]
    - use ph7.3 forms
- mappings, invoke the [mapping-agent] agent
    - always provide the skos predicate on a mapping when you can
    - always check the mapped term to see if a mapping makes sense
    - look at mappings holistically
- for anything involving reactions/catalytic activities/RHEA/EC, invoke the [reaction-agent]
- for taxon constraints, see the [taxon-constraint-agent]
    - these are in `src/taxon_constraints` (not the main obo file)
        - `never_in_taxon.tsv`
        - `only_in_taxon.tsv`

## AUTOMATED-VALIDATION using Makefile

This ontology uses standard ODK/ROBOT tests plus custom tests to ensure the ontology is logically, syntactically, and stylistically valid.

Ensure that full validation is performed, using `cd src/ontology && make travis_build` (being sure you are in the right folder)

IMPORTANT: Allow at least 10 mins for travis_build to run

If the build times out you can run tests separately; SPARQL-QC checks:

```
cd src/ontology && robot verify -i go-edit.obo --queries ../sparql/equivalent-classes-violation.sparql  ../sparql/trailing-whitespace-violation.sparql  ../sparql/owldef-self-reference-violation.sparql  ../sparql/synonym-label-match-violation.sparql  ../sparql/replacedby-obsolete-violation.sparql  ../sparql/replacedby-namespace-violation.sparql  ../sparql/missing-namespace-violation.sparql  ../sparql/duplicate-exact-synonym-violation.sparql  ../sparql/duplicate-synonym-violation.sparql  ../sparql/non-IRI-value-violation.sparql  ../sparql/non-anyURI-value-violation.sparql  ../sparql/obsolete-definition-violation.sparql  ../sparql/definition-constraints-violation.sparql  ../sparql/one-to-one-xrefs-by-subject-violation.sparql  ../sparql/one-to-one-xrefs-by-value-violation.sparql  ../sparql/xref-syntax-violation.sparql
```

Reasoning:

```
cd src/ontology && robot reason -r ELK -i go-edit.obo -o go-edit.reasoned.obo
```


To debug syntax errors, try: `cd src/ontology && robot convert -vvv -i go-edit.obo -f obo -o go-edit.TMP.obo`
- The `-vvv` yields a full stack trace if there are errors.

### Logical Error Diagnosis

- Execute `cd src/ontology && robot explain --input go-edit.obo --output go-edit.entailed.obo` to find entailed axioms
- Use `cd src/ontology && robot explain --input go-edit.obo --reasoner ELK  -M unsatisfiability --unsatisfiable all explanations.md` to generate a report explaining unsat classes
- Analyze intersection_of axioms, is_a relationships, and logical definitions for conflicts
- Identify problematic axioms causing reasoning failures
- never use DL reasoners such as hermit for the full ontology, it is too large -- and unneccessary as we only have EL axioms, so ELK is sufficient (ELK is the default)

## REFERENCE-VALIDATION

Ensure that any references introduced came from the RESEARCH.md file created by the research-agent.

RESEARCH.md can be included in your gh issue comments verbatim (but you can exclude references that turned out to be irrelevant)

## COMMITTING

Commit only the files YOU edited. These are generally to src/ontology/go-edit.obo.
In some cases you may also need to change taxon constraint files or other ancilliary content files.
If you did not modify a file yourself, don't commit it. There may be modifications in files like this CLAUDE.md, this is expected, don't commit them.

Include detailed comments.

Changes should be:

- Aligned with original request
- Biologically accurate and well-justified, referencing RESEARCH.md where appropriate

You MUST:

- communicate back to the original requester(s) on the original issue(s)
   - include background material, including RESEARCH.md if relevant
   - include a high level biologist-friendly summary of your changes. Include justifications
   - Don't include in-the-weed technical details here, these can go in the PR details
   - You can include any questions you might have for the original user here
- Communicate detailed changes in the PR
   - include the complete checklist here
   - include any detailed technical details here
   - This is for the attention of the reviewer of the PR, so more details are appropriate here

### Conversational guidelines

When communicating with the user via issues and PRs using `gh`:
be polite, yet direct. Absolutely no sycophancy, and no "Great question!" energy. Keep it professional, concise, and sharp, 
but a little personality and understated wit are welcome when it fits. No emojis, don't be cringe.