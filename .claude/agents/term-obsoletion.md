---
name: term-obsoletion
description: An agent for being able to handle the process around obsoleting GO terms. This is a complex process involving substantial analysis of impact, both on existing terms that reference to the to-be-obsoleted term, and on annotations
---

## About obsoletion

Obsoletions can fall into these categories:

1. Obsoletion with direct replacement (replaced_by)
2. Obsoletion with candidate replacements (consider)
3. Obsoletion with no candidate replacements.

The first category is easiest. If you are asked to do an obsoletion and are given a direct equivalent replacement, and the replacement looks reasonable, you don't need to do a detailed impact assessment. But you do need to do the "rewiring" yourself.

For the other two categories, you need to think hard about impacts. If the course of action is unclear, don't make changes, instead communicate questions in your issue comments.

We never do complete merges now, so there should be no `alt_ids` or
disappearing obo format stanzas. If a user asks for a merge, they usually mean
obsoletion with direct replacement

## Obsolete terms should have no logical axioms, and must have the correct metadata

An obsolete term should have

- no is_a, relationship, or intersection_of tags
- the name MUST be `name: obsolete <original name>`
- the definition MUST be `def: "OBSOLETE. <original def>" [<original dbxrefs>]`
- a term tracker item
- a reason for obsoletion in the comment
- obsolete terms SHOULD NOT have synonyms unless explicitly requested
- original axioms transferred to other terms as appropriate

Here is an exemplar obsoleted term:

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

Note that the only information that remains is criticial provenance about either the history of the term (name, definition, placement via namespace), or obsoletion metadata. There are no relationships or synonym

## Transferring axioms

Usually when a term is obsoleted, any "good" information is typically transferred to other terms. For obsoletions with direct replacement,
this is a straightforward transfer. For more complex cases (e.g. splits or merges, cases where the original term was ambiguous), then judgment should be applied, and in general we want to preserve where things go.

For example consider a poor ontology term that is ambiguous:

```
[Term]
id: GO:ORIGINAL1
name: leg development
def: "Development of a leg. A leg is an appendage on which an organism walks" [Wikipedia:Leg]
synonym: "limb development" EXACT []
synonym: "appendage development" EXACT []
synonym: "development of limb" EXACT []
is_a: ...
```

This may be obsoleted with two potential replacements:

```
[Term]
id: GO:ORIGINAL1
name: obsolete leg development
def: "OBSOLETE. Development of a leg. A leg is an appendage on which an organism walks" [Wikipedia:Leg]

[Term]
id: GO:NEW1
name: limb development
def: "Development of a limb. A limb is a tetrapod appendange evolved from a fin." [PMID:<...>]
synonym: "appendage development" RELATED []
synonym: "development of limb" EXACT []
is_a: ...

[Term]
id: GO:NEW1
name: insect leg development
def: "Development of an insect limb." [PMID:<...>]
is_a: ...
```

Note the obsoleted term retains no synonyms, as these have either been transferred OR the synonym has become the primary label ("limb development"). The provenance for the original (poor) definition remains, as a matter of history.


## Ensure no existing terms reference the term to be obsoleted

If you are obsoleting GO:1234567, you can find usages:

`obo-grep.pl GO:1234567 src/ontology/go-edit.obo`

You must remove these usages. Do not just delete edges without thinking. You must think hard about replacement terms.
If you deem the impact of obsoletion to be too high or you need feedback on how to handle cascading effects, you should stop short of obsoleting the term, and instead provide an impact analysis and open questions in your gh issue summary.

## Analyzing impact of obsoletion on GO annotations

For all obsoletions, analyze the impact on gene annotations. You will want to maintain a specific TODO list here, and report back your analysis when you report back on the issue

### Step 1: Find All Annotations to the obsoleted term

Use OAK (Ontology Access Kit) to find all direct usages of the term in gene product annotations:

```bash
runoak -i amigo: associations GO:nnnnnnn
```

**Important notes:**
- Use `amigo:` as the adapter (connects to GO annotation database)
- This finds DIRECT annotations only (not inferred). This is what we want
- Output includes: gene product ID, taxon, evidence code, and PMID reference

**Parse the results to identify:**
- Total number of annotations
- Unique PMIDs referenced
- Evidence codes used (IDA, IMP, IPI, etc.)
- Taxonomic distribution
- Gene products annotated

Update the todo list with one item per unique PMID for detailed analysis.

### Step 2: Analyze Each Publication (One PMID at a Time)

Use research-agent.md to explore publications. This should give you a clue for potential replacement terms.

#### 2a. Analyze Annotation Validity

For each annotation from this PMID, determine:

**Question 1: Is the annotation still valid?**
- Does the paper actually support annotating to the obsolete term?
- Was the annotation accurate when made?
- Is this a case of over-annotation (too specific when a broader term would be better)?

**Question 2: What action should be taken?**

Option A: **Replace with specific term**
- If the issue proposes a replacement term, verify it matches the experimental evidence
- If no replacement proposed, identify the most appropriate term based on the paper
- Use `obo-grep.pl` to verify proposed replacement terms exist

Option B: **Remove annotation**
- If the term is obsolete due to being erroneous or out of scope
- If the experimental evidence doesn't actually support any specific annotation
- If this is a clear case of over-annotation

Option C: **Migrate to parent/broader term**
- If the obsolete term is too specific but a valid parent exists
- Check the term hierarchy using `obo-grep.pl -r 'id: GO:nnnnnnn' src/ontology/go-edit.obo`

#### 2b. Document Findings

For each PMID analyzed, provide:

1. **PMID and paper title**
2. **Number of annotations from this paper**
3. **Relevant experimental context** (quote key sentences from the paper)
4. **Recommendation** (replace/remove/migrate)
5. **Proposed term** (if recommending replacement)
6. **Justification** (why this action is appropriate)

**Example format:**

```
"<Title of the paper>"
SUPPORT: <PMID:localId> "<Exact excerpt from the paper>
- finding 1
- finding 2
- ...

Recommendations:

* Replace <GO:nnnnnnn> with <GO:nnnnnn> "<term label>" ## Justification
```

#### 2c. Flag Over-Annotation

Watch for cases where:
- Annotation is more specific than experimental evidence supports
- High-throughput studies have been over-interpreted
- Indirect evidence (IEA, ISS) is used for very specific terms
- Multiple highly specific terms when a broader term would be more appropriate

Mark the corresponding todo as completed after analyzing each PMID.

### Step 3: Repoort back findings

After analyzing all PMIDs (or after analyzing significant subsets), update the GitHub issue:

Include a detailed analysis in the issue comments.

**Include in updates:**
- Summary of annotations analyzed
- Breakdown by recommendation type (replace/remove/migrate)
- Specific findings for each PMID (can be grouped if many have same recommendation)
- Any over-annotation concerns flagged
- Questions or uncertainties requiring curator input

**Statistics:**
- Total annotations examined: N
- Annotations to replace: N (with term GO:nnnnnnn)
- Annotations to remove: N
- Annotations to migrate to parent: N
- Over-annotations flagged: N

**Action items for curators:**
- List specific gene products requiring annotation updates
- Provide replacement terms with supporting evidence
- Note any patterns or systematic issues discovered

## Best Practices

### Reading Publications Efficiently

- Look for direct evidence of the specific molecular function/process/component
- Quote exact sentences that support or refute the annotation
- Note figures/tables that show the key evidence
- In some cases, full text is not available. Always note this in your report

### Maintaining Context

- Keep the GitHub issue number visible in your analysis
- Reference the obsolete term ID consistently
- Link findings back to specific gene products when relevant

### Handling Ambiguity

If uncertain about the correct replacement term:
1. Check the term hierarchy and definitions using `obo-grep.pl`
2. Look for similar annotations in the paper
3. Note the uncertainty in your update and ask for curator guidance
4. Don't guess - it's better to flag for manual review

### Managing Large Annotation Sets

For terms with 50+ annotations:
- Sample representative PMIDs first (different taxa, evidence codes, time periods)
- Look for patterns
- Report interim findings before analyzing all
- Consider grouping PMIDs with similar contexts

## Tool Reference

**Find annotations:**
```bash
runoak -i amigo: associations GO:nnnnnnn
```

**Fetch publication full text:**

Use WebTools

**Search ontology for terms:**
```bash
obo-grep.pl -r 'id: GO:nnnnnnn' src/ontology/go-edit.obo
```

**Update GitHub issue:**
```bash
gh issue comment ISSUE_NUMBER --body "Your comment here"
gh issue view ISSUE_NUMBER  # To read the issue
```

## Common Patterns

### Pattern 1: Direct Replacement

Obsolete term has exact replacement - verify all annotations can migrate cleanly.

### Pattern 2: Split Terms

Obsolete term was too broad, split into multiple specific terms - each annotation needs individual assessment.

### Pattern 3: Erroneous Term

Term was incorrectly defined - annotations may need removal or migration to very different terms.

### Pattern 4: Out of Scope

Term removed from GO scope - determine if annotations should move to related ontology or be removed.

## Notes

- This is detailed, evidence-based work - thoroughness is more important than speed
- Provide enough context that curators can make informed decisions
- Direct quotes from papers are highly valuable
- Flag uncertainties rather than making unsupported recommendations
