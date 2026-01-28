---
name: research-agent
description: Use a research agent when performing background research from the literature or the web to create a RESEARCH.md file; also covers use of `deep-research-client`
---

You can use normal web search tools to find relevant literature. You can also use trusted encyclopedic sources such
as wikipedia but it's good to follow up with the publications themselves. All research must be summarized in a file RESEARCH.md
(not committed).

Use this appropriately. If the request is to fix a typo in a synonym or definition, there is no need to do research (write as N/A in any checklists). Similarly if the request pertains to a trivial compositional term then research is not required. But if there is any nuanced biology involved, it is good to do the appropriate level of research.

Always bear in mind:

- GO is pan-species; while human relevance is good, don't assume the term will only be used for human biology
- GO is primarily interested in evolved molecular and cellular biology, and not pleiotropic phenotypes
- For ontology terms, recent reviews are often better than older references, or references that focus on specific experimental results
- Encyclopedic and book references are perfectly fine for high level biology (e.g. "nucleus"); but even for well understood processes (e.g. apoptosis), recent reviews are favored

## Deep Research

For detailed searches, you can do deep research queries:

```
deep-research-client research --provider perplexity "<DETAILED RESEARCH QUESTION HERE>" --output results.md --separate-citations citations.md
```

This will take around 5 minutes or so

## Caching PMIDs and DOIs

You can use `linkml-reference-validator` to cache references. This is in your path. Note that this will not always work for full texts.

Example:
`linkml-reference-validator cache reference PMID:28318978`
==> writes to `references_cache/PMID_28318978.md`

Always use this to check that there are no typos or hallucinations with reference IDs. If the title or abstract doesn't match with what the reference is purportedly supporting, there is likely a typo or hallucination.

Note that `references_cache` should NOT be checked back in to git.

## Incorporating research results back into your work

PMIDs are preferred for most purposes. These are usually written as CURIEs, e.g. `PMID:123456`. Next best are DOIs, also curies `DOI:<doi>`

For GO, usually the best place to include citations is in definition provenance; e.g

```obo
def: "<genus and differentia>. <additional info>" [PMID:nnnn]
```

But you should ALWAYS include more detailed summaries of publications in RESEARCH.md

Entries in RESEARCH.md should have blocks in the following format:

```
## <PMID:nnnnnnn> "<TITLE>"

<brief summary>

* SUPPORT: <PMID:nnnnnn> "<EXACT excerpt from publication>"
    - finding 1
    - finding 2
    - ...

i.e. `^ SUPPORT: (\S+:\S+) "(.*)$"` all on one line, with no newlines between the `""`s

You MUST validate the supporting text like this:

`linkml-reference-validator validate text-file -r 'SUPPORT: (\S+:\S+) "(.*)"' -t 2 -R 1 RESEARCH.md`

In some cases, if a full text is not available and support cannot be found in the abstract, but support came from deep research, you can say:

* NO_FULL_TEXT: <PMID:nnnn> <say how you obtained the information>
    - finding 1
    - finding 2
    - ...

On completion, this agent should produce a complete RESEARCH.md, with no fabricated results.

