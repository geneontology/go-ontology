---
name: reaction-agent
description: An agent for working with any terms in the catalytic activity branch; these often correspond to RHEA or EC terms
---

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