---
name: mapping-agent
description: An agent for for working with mappings (dbxrefs) in GO.
---

Mappings in GO have been historically represented as xrefs

`xref: EC:2.5.1.30`

Mappings are always represented at the term level. Mappings should not be confused with definition provance, although there
may be some duplication here, this is OK. Mappings should not be confused with external logical definition (we never map to CHEBI or UBERON for example, but we may have relationships or logical definitions pointing there).

More recently in GO we have been concerned with the *meaning* of a mapping and newer mappings always have a skos predicate for the mapping indicated as a trailing qualifier.

```
id: GO:0000031
name: mannosylphosphate transferase activity
xref: MetaCyc:RXN-22693 {source="skos:narrowMatch"}
```

means that the GO ID has a narrower concept in the MetaCyc ID

Example where the external term is narrower in meaning:

```
id: GO:0000031
name: mannosylphosphate transferase activity
namespace: molecular_function
def: "Catalysis of the reaction: GDP-alpha-D-mannose + n {[alpha-D-Man-(1->2)-alpha-D-Man-(1->2)]-alpha-D-Man-(1->6)}60-(Man9GlcNAc2-[protein] = phosphorylated {[alpha-D-Man-(1->2)-alpha-D-Man-(1->2)]-alpha-D-Man-(1->6)}60-(Man9GlcNAc2-[protein] + n GMP + n H+ or GDP-alpha-D-mannose + alpha-D-Man-(1->3)-alpha-D-Man-(1->3)-alpha-D-Man-(1->2)-alpha-D-Man-(1->2)-alpha-D-Man-3-O-(Ser/Thr)-[protein] = alpha-D-Man-(1->3)-alpha-D-Man-(1->3)-[alpha-D-Man-6P-]-alpha-D-Man-(1->2)-alpha-D-Man-(1->2)-alpha-D-Man-3-O-(Ser/Thr)-[protein] + GMP + H+." [MetaCyc:RXN-22693, MetaCyc:RXN-22694]
xref: MetaCyc:RXN-22693 {source="skos:narrowMatch"}
xref: MetaCyc:RXN-22694 {source="skos:narrowMatch"}
is_a: GO:0016758 ! hexosyltransferase activity
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28340" xsd:anyURI
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28811" xsd:anyURI
```

Example where the RHEA ID is equivalent, we disambiguate two MetaCycs and the EC is broader

```
id: GO:0000121
name: sn-glycerol 1-phosphatase activity
namespace: molecular_function
def: "Catalysis of the reaction: H2O + sn-glycerol 1-phosphate = glycerol + phosphate." [RHEA:46084]
synonym: "alpha-glycerol phosphatase activity" RELATED [EC:3.1.3.21]
synonym: "alpha-glycerophosphatase activity" RELATED [EC:3.1.3.21]
synonym: "glycerol 3-phosphatase activity" RELATED [EC:3.1.3.21]
synonym: "glycerol 3-phosphate phosphohydrolase activity" RELATED [EC:3.1.3.21]
synonym: "glycerol-1-phosphatase activity" BROAD [EC:3.1.3.21]
synonym: "glycerol-1-phosphate phosphohydrolase activity" RELATED [EC:3.1.3.21]
synonym: "glycerol-3-phosphate phosphatase activity" RELATED [EC:3.1.3.21]
xref: EC:3.1.3.21 {source="skos:broadMatch"}
xref: MetaCyc:GLYCEROL-1-PHOSPHATASE-RXN {source="skos:broadMatch"}
xref: MetaCyc:RXN-14964 {source="skos:exactMatch"}
xref: RHEA:46084 {source="skos:exactMatch"}
is_a: GO:0016791 ! phosphatase activity
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27964" xsd:anyURI
property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28176" xsd:anyURI
```

Note that the GO def follows the RHEA definition precisely, and one of the participants is 1-phosphate; there is a similar reaction (RHEA:66372; sn-glycerol 3-phosphate + H2O = glycerol + phosphate) with a different participant. Both are mapped to the broader EC.

## Looking up external IDs (EC and RHEA)

`runoak -i sqlite:obo:eccode info EC:3.1.3.21`
=> EC:3.1.3.21 ! glycerol-1-phosphatase

`runoak -i sqlite:obo:rhea info RHEA:46084`
=> RHEA:46084 ! sn-glycerol 1-phosphate + H2O = glycerol + phosphate

Always lookup these IDs.

## Special Rules for MF

Most mappings are in MF, and it is possible to be precise due to the fact that RHEA has precise participants. ALWAYS consider the reaction participants when mapping MFs.

