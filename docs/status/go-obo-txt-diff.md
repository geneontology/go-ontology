# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-08-24 05:40:43.921900348 +0000
+++ go.obo	2026-08-24 05:54:08.925509440 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-07-26
+data-version: releases/2026-08-24
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -22,6 +22,7 @@
 subsetdef: goslim_synapse "synapse GO slim"
 subsetdef: goslim_virus "GO subset for viruses"
 subsetdef: goslim_yeast "Yeast GO slim"
+subsetdef: noctua_allowed "ChEBI terms allowed for use in Noctua, comprising the Rhea pH 7.3 subset and the GO ChEBI allow-list."
 synonymtypedef: syngo_official_label "label approved by the SynGO project"
 synonymtypedef: systematic_synonym "Systematic synonym" EXACT
 default-namespace: gene_ontology
@@ -44,7 +45,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-07-26" xsd:string
+property_value: owl:versionInfo "2026-08-24" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -1071,8 +1072,10 @@
 xref: MetaCyc:SO4ASSIM-PWY
 xref: MetaCyc:SULFMETII-PWY
 is_a: GO:0006790 ! sulfur compound metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 property_value: skos:narrowMatch MetaCyc:SO4ASSIM-PWY
 property_value: skos:narrowMatch MetaCyc:SULFMETII-PWY
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
 
 [Term]
 id: GO:0000104
@@ -10748,6 +10751,7 @@
 synonym: "ganglioside metabolism" EXACT []
 is_a: GO:0006672 ! ceramide metabolic process
 is_a: GO:0006687 ! glycosphingolipid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32322" xsd:anyURI
 
 [Term]
 id: GO:0001574
@@ -12201,6 +12205,7 @@
 xref: Reactome:R-HSA-72095 "Internal Methylation of mRNA"
 xref: RHEA:55584
 is_a: GO:0008174 ! mRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.348
 property_value: skos:exactMatch RHEA:55584
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27389" xsd:anyURI
@@ -16017,13 +16022,13 @@
 
 [Term]
 id: GO:0002084
-name: protein depalmitoylation
+name: obsolete protein depalmitoylation
 namespace: biological_process
-def: "The removal of palymitoyl groups from a lipoprotein." [GOC:hjd]
-subset: gocheck_obsoletion_candidate
-is_a: GO:0035601 ! protein deacylation
-is_a: GO:0042159 ! lipoprotein catabolic process
-is_a: GO:0098734 ! macromolecule depalmitoylation
+def: "OBSOLETE. The removal of palymitoyl groups from a lipoprotein." [GOC:hjd]
+comment: The reason for obsoletion is that this term represents a molecular function, not a biological process. Consider instead annotating to the molecular function 'palmitoyl-(protein) hydrolase activity' (GO:0008474).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32290" xsd:anyURI
+is_obsolete: true
+consider: GO:0008474
 
 [Term]
 id: GO:0002085
@@ -34490,7 +34495,7 @@
 id: GO:0003919
 name: FMN adenylyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + FMN = diphosphate + FAD." [EC:2.7.7.2, RHEA:17237]
+def: "Catalysis of the reaction: FMN + ATP + H+ = FAD + diphosphate." [RHEA:17237]
 synonym: "adenosine triphosphate-riboflavin mononucleotide transadenylase activity" RELATED [EC:2.7.7.2]
 synonym: "adenosine triphosphate-riboflavine mononucleotide transadenylase activity" RELATED [EC:2.7.7.2]
 synonym: "ATP:FMN adenylyltransferase activity" EXACT []
@@ -34510,6 +34515,7 @@
 property_value: skos:exactMatch EC:2.7.7.2
 property_value: skos:exactMatch RHEA:17237
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32345" xsd:anyURI
 
 [Term]
 id: GO:0003920
@@ -36658,7 +36664,6 @@
 xref: RHEA:10736
 xref: RHEA:10740
 xref: RHEA:12216
-xref: RHEA:12785
 xref: RHEA:13221
 xref: RHEA:15757
 xref: RHEA:16317
@@ -36731,7 +36736,6 @@
 property_value: skos:narrowMatch RHEA:10736
 property_value: skos:narrowMatch RHEA:10740
 property_value: skos:narrowMatch RHEA:12216
-property_value: skos:narrowMatch RHEA:12785
 property_value: skos:narrowMatch RHEA:13221
 property_value: skos:narrowMatch RHEA:15757
 property_value: skos:narrowMatch RHEA:16317
@@ -37086,26 +37090,32 @@
 
 [Term]
 id: GO:0004032
-name: aldose reductase (NADPH) activity
+name: aldose reductase [NAD(P)H] activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an alditol + NADP+ = an aldose + NADPH + H+." [EC:1.1.1.21]
+def: "Catalysis of the reaction: an alditol + NAD(P)+ = an aldose + NAD(P)H + H+." [EC:1.1.1.21]
 synonym: "aldehyde reductase activity" RELATED [EC:1.1.1.21]
-synonym: "alditol:NADP+ 1-oxidoreductase activity" EXACT []
-synonym: "aldose reductase activity" RELATED [EC:1.1.1.21]
+synonym: "alditol:NAD(P)+ 1-oxidoreductase activity" EXACT [EC:1.1.1.21]
+synonym: "alditol:NADP+ 1-oxidoreductase activity" NARROW []
+synonym: "aldose reductase (NADPH) activity" NARROW []
+synonym: "aldose reductase activity" EXACT [EC:1.1.1.21]
 synonym: "polyol dehydrogenase (NADP(+)) activity" RELATED [EC:1.1.1.21]
+xref: EC:1.1.1.21
 xref: KEGG_REACTION:R02820
+xref: MetaCyc:ALDEHYDE-REDUCTASE-RXN
 xref: Reactome:R-HSA-196060 "Reduction of isocaproaldehyde to 4-methylpentan-1-ol"
 xref: Reactome:R-HSA-5652172 "AKR1B1 reduces Glc to D-sorbitol"
 xref: Reactome:R-HSA-9931850 "AKR1B1 reduces galactose to galactitol"
+xref: RHEA:12785
 xref: RHEA:12789
 xref: RHEA:37967
 xref: RHEA:59924
 xref: RHEA:59932
-is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
-property_value: skos:broadMatch EC:1.1.1.21
-property_value: skos:broadMatch MetaCyc:ALDEHYDE-REDUCTASE-RXN
-property_value: skos:exactMatch KEGG_REACTION:R02820
-property_value: skos:exactMatch RHEA:12789
+is_a: GO:0018455 ! alcohol dehydrogenase [NAD(P)+] activity
+property_value: skos:exactMatch EC:1.1.1.21
+property_value: skos:exactMatch MetaCyc:ALDEHYDE-REDUCTASE-RXN
+property_value: skos:narrowMatch KEGG_REACTION:R02820
+property_value: skos:narrowMatch RHEA:12785
+property_value: skos:narrowMatch RHEA:12789
 property_value: skos:narrowMatch RHEA:37967
 property_value: skos:narrowMatch RHEA:59924
 property_value: skos:narrowMatch RHEA:59932
@@ -61237,11 +61247,13 @@
 name: binding
 namespace: molecular_function
 def: "The selective, non-covalent, often stoichiometric, interaction of a molecule with one or more specific sites on another molecule." [GOC:ceb, GOC:mah, ISBN:0198506732]
+subset: gocheck_do_not_annotate
 subset: goslim_pir
 subset: goslim_plant
 synonym: "ligand" NARROW []
 xref: Wikipedia:Binding_(molecular)
 is_a: GO:0003674 ! molecular_function
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0005489
@@ -66695,14 +66707,18 @@
 
 [Term]
 id: GO:0006041
-name: D-glucosamine metabolic process
+name: obsolete D-glucosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving glucosamine (2-amino-2-deoxyglucopyranose), an aminodeoxysugar that occurs in combined form in chitin." [GOC:jl, ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving glucosamine (2-amino-2-deoxyglucopyranose), an aminodeoxysugar that occurs in combined form in chitin." [GOC:jl, ISBN:0198506732]
+comment: The reason for obsoletion is that these terms were added in error.
 synonym: "chitosamine metabolic process" EXACT []
 synonym: "chitosamine metabolism" EXACT []
 synonym: "glucosamine metabolic process" EXACT []
 synonym: "glucosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0006042
+consider: GO:0006043
 
 [Term]
 id: GO:0006042
@@ -66716,7 +66732,6 @@
 synonym: "glucosamine biosynthetic process" EXACT []
 synonym: "glucosamine formation" EXACT []
 synonym: "glucosamine synthesis" EXACT []
-is_a: GO:0006041 ! D-glucosamine metabolic process
 is_a: GO:1901073 ! glucosamine-containing compound biosynthetic process
 
 [Term]
@@ -66730,18 +66745,21 @@
 synonym: "glucosamine catabolic process" EXACT []
 synonym: "glucosamine catabolism" EXACT []
 synonym: "glucosamine degradation" EXACT []
-is_a: GO:0006041 ! D-glucosamine metabolic process
 is_a: GO:1901072 ! glucosamine-containing compound catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 
 [Term]
 id: GO:0006044
-name: N-acetylglucosamine metabolic process
+name: obsolete N-acetylglucosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving N-acetylglucosamine. The D isomer is a common structural unit of glycoproteins in plants, bacteria and animals; it is often the terminal sugar of an oligosaccharide group of a glycoprotein." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving N-acetylglucosamine. The D isomer is a common structural unit of glycoproteins in plants, bacteria and animals; it is often the terminal sugar of an oligosaccharide group of a glycoprotein." [ISBN:0198506732]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "N-acetylglucosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0006045
+consider: GO:0006046
 
 [Term]
 id: GO:0006045
@@ -66752,7 +66770,6 @@
 synonym: "N-acetylglucosamine biosynthesis" EXACT []
 synonym: "N-acetylglucosamine formation" EXACT []
 synonym: "N-acetylglucosamine synthesis" EXACT []
-is_a: GO:0006044 ! N-acetylglucosamine metabolic process
 is_a: GO:1901073 ! glucosamine-containing compound biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -66766,7 +66783,6 @@
 synonym: "N-acetylglucosamine degradation" EXACT []
 xref: MetaCyc:GLUAMCAT-PWY
 xref: MetaCyc:PWY-6517
-is_a: GO:0006044 ! N-acetylglucosamine metabolic process
 is_a: GO:1901072 ! glucosamine-containing compound catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUAMCAT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6517
@@ -66776,12 +66792,14 @@
 
 [Term]
 id: GO:0006047
-name: UDP-N-acetylglucosamine metabolic process
+name: obsolete UDP-N-acetylglucosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving UDP-N-acetylglucosamine, a substance composed of N-acetylglucosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving UDP-N-acetylglucosamine, a substance composed of N-acetylglucosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "UDP-N-acetylglucosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
-is_a: GO:0009225 ! nucleotide-sugar metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0006048
 
 [Term]
 id: GO:0006048
@@ -66797,7 +66815,6 @@
 xref: MetaCyc:UDPNACETYLGALSYN-PWY
 xref: MetaCyc:UDPNAGSYN-PWY
 xref: Reactome:R-HSA-446210 "Synthesis of UDP-N-acetyl-glucosamine"
-is_a: GO:0006047 ! UDP-N-acetylglucosamine metabolic process
 is_a: GO:0009226 ! nucleotide-sugar biosynthetic process
 is_a: GO:0046349 ! amino sugar biosynthetic process
 property_value: skos:narrowMatch MetaCyc:UDPNACETYLGALSYN-PWY
@@ -66829,11 +66846,15 @@
 
 [Term]
 id: GO:0006051
-name: N-acetylmannosamine metabolic process
+name: obsolete N-acetylmannosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving N-acetylmannosamine, the acetylated derivative of mannosamine, 2-amino-2-deoxymannose." [GOC:ai, ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving N-acetylmannosamine, the acetylated derivative of mannosamine, 2-amino-2-deoxymannose." [GOC:ai, ISBN:0198506732]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "N-acetylmannosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0006052
+consider: GO:0006053
 
 [Term]
 id: GO:0006052
@@ -66844,7 +66865,6 @@
 synonym: "N-acetylmannosamine biosynthesis" EXACT []
 synonym: "N-acetylmannosamine formation" EXACT []
 synonym: "N-acetylmannosamine synthesis" EXACT []
-is_a: GO:0006051 ! N-acetylmannosamine metabolic process
 is_a: GO:0046347 ! mannosamine biosynthetic process
 
 [Term]
@@ -66855,19 +66875,21 @@
 synonym: "N-acetylmannosamine breakdown" EXACT []
 synonym: "N-acetylmannosamine catabolism" EXACT []
 synonym: "N-acetylmannosamine degradation" EXACT []
-is_a: GO:0006051 ! N-acetylmannosamine metabolic process
 is_a: GO:0046346 ! mannosamine catabolic process
 
 [Term]
 id: GO:0006054
-name: N-acetylneuraminate metabolic process
+name: obsolete N-acetylneuraminate metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving N-acetylneuraminate, the anion of 5-(acetylamino)-3,5-dideoxy-D-glycero-D-galacto-non-3-ulosonic acid." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving N-acetylneuraminate, the anion of 5-(acetylamino)-3,5-dideoxy-D-glycero-D-galacto-non-3-ulosonic acid." [ISBN:0198506732]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "N-acetylneuraminate metabolism" EXACT []
 synonym: "sialic acid metabolic process" BROAD []
 synonym: "sialic acid metabolism" BROAD []
-is_a: GO:0006040 ! amino sugar metabolic process
-is_a: GO:0019752 ! carboxylic acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0019262
+consider: GO:0046380
 
 [Term]
 id: GO:0006055
@@ -66958,6 +66980,7 @@
 is_a: GO:0019406 ! hexitol biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-5054
 property_value: skos:narrowMatch MetaCyc:PWY-5530
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32269" xsd:anyURI
 
 [Term]
 id: GO:0006062
@@ -71811,17 +71834,19 @@
 
 [Term]
 id: GO:0006515
-name: protein quality control for misfolded or incompletely synthesized proteins
+name: protein quality control
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of misfolded or attenuated proteins." [GOC:jl]
-synonym: "degradation of misfolded or incompletely synthesized proteins" EXACT []
-synonym: "misfolded or incompletely synthesized protein breakdown" EXACT []
-synonym: "misfolded or incompletely synthesized protein catabolic process" EXACT []
-synonym: "misfolded or incompletely synthesized protein catabolism" EXACT []
-synonym: "misfolded or incompletely synthesized protein degradation" EXACT []
-synonym: "protein quality control (PQC)" EXACT []
-synonym: "protein quality control by the ubiquitin-proteasome system" BROAD []
-is_a: GO:0030163 ! protein catabolic process
+def: "The chemical reactions and pathways resulting in the breakdown or refolding of misfolded, dysfunctional, or incompletely synthesized proteins." [PMID:21746797]
+synonym: "degradation of misfolded or incompletely synthesized proteins" NARROW []
+synonym: "misfolded or incompletely synthesized protein breakdown" NARROW []
+synonym: "misfolded or incompletely synthesized protein catabolic process" NARROW []
+synonym: "misfolded or incompletely synthesized protein catabolism" NARROW []
+synonym: "misfolded or incompletely synthesized protein degradation" NARROW []
+synonym: "PQC" EXACT []
+synonym: "protein quality control by the ubiquitin-proteasome system" NARROW []
+synonym: "protein quality control for misfolded or incompletely synthesized proteins" NARROW []
+is_a: GO:0009987 ! cellular process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32442" xsd:anyURI
 
 [Term]
 id: GO:0006516
@@ -73107,6 +73132,7 @@
 xref: Reactome:R-HSA-71288 "Creatine metabolism"
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0032787 ! monocarboxylic acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32279" xsd:anyURI
 
 [Term]
 id: GO:0006601
@@ -73148,6 +73174,7 @@
 synonym: "phosphocreatine metabolism" EXACT []
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32279" xsd:anyURI
 
 [Term]
 id: GO:0006604
@@ -77269,6 +77296,8 @@
 is_a: GO:0006984 ! ER-nucleus signaling pathway
 is_a: GO:0034976 ! response to endoplasmic reticulum stress
 is_a: GO:0071216 ! cellular response to biotic stimulus
+relationship: part_of GO:0170080 ! endoplasmic reticulum protein quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20914" xsd:anyURI
 
 [Term]
 id: GO:0006984
@@ -77490,11 +77519,9 @@
 def: "A process that is carried out at the cellular level which results in the assembly, arrangement of constituent parts, or disassembly of a mitochondrial membrane, either of the lipid bilayer surrounding a mitochondrion." [GOC:ai, GOC:dph, GOC:jl, GOC:mah]
 synonym: "mitochondrial membrane organisation" EXACT []
 synonym: "mitochondrial membrane organization and biogenesis" RELATED [GOC:mah]
-is_a: GO:0007005 ! mitochondrion organization
 is_a: GO:0061024 ! membrane organization
-intersection_of: GO:0061024 ! membrane organization
-intersection_of: occurs_in GO:0005739 ! mitochondrion
-relationship: occurs_in GO:0005739 ! mitochondrion
+relationship: part_of GO:0007005 ! mitochondrion organization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32356" xsd:anyURI
 
 [Term]
 id: GO:0007007
@@ -81065,17 +81092,19 @@
 id: GO:0007350
 name: blastoderm segmentation
 namespace: biological_process
-def: "The hierarchical steps resulting in the progressive subdivision of the anterior/posterior axis of the embryo." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The hierarchical steps resulting in the progressive subdivision of the anterior/posterior axis of the embryo." [ISBN:0879694238]
 is_a: GO:0009880 ! embryonic pattern specification
 is_a: GO:0035282 ! segmentation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007351
 name: tripartite regional subdivision
 namespace: biological_process
-def: "Subdivision of the embryo along the anterior/posterior axis into anterior, posterior and terminal regions." [GOC:dph, GOC:isa_complete, http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "Subdivision of the embryo along the anterior/posterior axis into anterior, posterior and terminal regions." [GOC:dph, GOC:isa_complete, ISBN:0879694238]
 is_a: GO:0003002 ! regionalization
 relationship: part_of GO:0007350 ! blastoderm segmentation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007352
@@ -81102,24 +81131,27 @@
 id: GO:0007354
 name: zygotic determination of anterior/posterior axis, embryo
 namespace: biological_process
-def: "The specification of the anterior/posterior axis of the embryo by products of genes expressed in the zygote; exemplified in insects by the gap genes, pair rule genes and segment polarity gene cascade." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The specification of the anterior/posterior axis of the embryo by products of genes expressed in the zygote; exemplified in insects by the gap genes, pair rule genes and segment polarity gene cascade." [ISBN:0879694238]
 is_a: GO:0008595 ! anterior/posterior axis specification, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007355
 name: anterior region determination
 namespace: biological_process
-def: "Specification of the anterior (head and thoracic segments) of the embryo by the gap genes; exemplified in insects by the actions of hunchback gene product." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "Specification of the anterior (head and thoracic segments) of the embryo by the gap genes; exemplified in insects by the actions of hunchback gene product." [ISBN:0879694238]
 is_a: GO:0009952 ! anterior/posterior pattern specification
 relationship: part_of GO:0007354 ! zygotic determination of anterior/posterior axis, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007356
 name: thorax and anterior abdomen determination
 namespace: biological_process
-def: "Specification of the central (trunk) regions of the embryo by the gap genes; exemplified in insects by the actions of the Kruppel gene product." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "Specification of the central (trunk) regions of the embryo by the gap genes; exemplified in insects by the actions of the Kruppel gene product." [ISBN:0879694238]
 is_a: GO:0009952 ! anterior/posterior pattern specification
 relationship: part_of GO:0007354 ! zygotic determination of anterior/posterior axis, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007357
@@ -81139,8 +81171,9 @@
 id: GO:0007358
 name: obsolete establishment of central gap gene boundaries
 namespace: biological_process
-def: "OBSOLETE. Specification of the borders of central gap gene expression mediated largely by the effects of other gap genes; in insects this is exemplified by knirps repression of Kruppel." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "OBSOLETE. Specification of the borders of central gap gene expression mediated largely by the effects of other gap genes; in insects this is exemplified by knirps repression of Kruppel." [ISBN:0879694238]
 comment: This term has been obsoleted because it represents a transcriptional feedback loop covered by other processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22546" xsd:anyURI
 is_obsolete: true
 
@@ -81148,10 +81181,11 @@
 id: GO:0007359
 name: posterior abdomen determination
 namespace: biological_process
-def: "The regionalization process in which the posterior (abdominal) regions of the embryo are specified by the gap genes." [GOC:dph, GOC:isa_complete, http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The regionalization process in which the posterior (abdominal) regions of the embryo are specified by the gap genes." [GOC:dph, GOC:isa_complete, ISBN:0879694238]
 comment: Note that this process is exemplified in insects by the actions of the knirps gene product.
 is_a: GO:0009952 ! anterior/posterior pattern specification
 relationship: part_of GO:0007354 ! zygotic determination of anterior/posterior axis, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007360
@@ -81172,7 +81206,7 @@
 id: GO:0007361
 name: obsolete establishment of posterior gap gene boundaries
 namespace: biological_process
-def: "OBSOLETE. Specification of the borders of posterior gap gene expression mediated largely by the effects of other gap genes; in insects this is exemplified by hunchback and tailless repression of knirps." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "OBSOLETE. Specification of the borders of posterior gap gene expression mediated largely by the effects of other gap genes; in insects this is exemplified by hunchback and tailless repression of knirps." [ISBN:0879694238]
 comment: This term has been obsoleted because it represents a transcriptional feedback loop covered by other processes.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22546" xsd:anyURI
 is_obsolete: true
@@ -81181,9 +81215,10 @@
 id: GO:0007362
 name: terminal region determination
 namespace: biological_process
-def: "Specification of the terminal regions (the two non-segmented ends) of the embryo by the gap genes; exemplified in insects by the actions of huckebein and tailless gene products." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "Specification of the terminal regions (the two non-segmented ends) of the embryo by the gap genes; exemplified in insects by the actions of huckebein and tailless gene products." [ISBN:0879694238]
 is_a: GO:0009880 ! embryonic pattern specification
 relationship: part_of GO:0007354 ! zygotic determination of anterior/posterior axis, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007363
@@ -81203,7 +81238,7 @@
 id: GO:0007364
 name: obsolete establishment of terminal gap gene boundary
 namespace: biological_process
-def: "OBSOLETE. Specification of the borders of terminal gap gene expression mediated largely by the effects of other gap genes." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "OBSOLETE. Specification of the borders of terminal gap gene expression mediated largely by the effects of other gap genes." [ISBN:0879694238]
 comment: This term has been obsoleted because it represents a transcriptional feedback loop covered by other processes.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22546" xsd:anyURI
 is_obsolete: true
@@ -81221,16 +81256,18 @@
 id: GO:0007366
 name: periodic partitioning by pair rule gene
 namespace: biological_process
-def: "Allocation of cells to parasegments in the embryo, through the action of overlapping series of pair rule gene activities." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0632030488, ISBN:0879694238]
+def: "Allocation of cells to parasegments in the embryo, through the action of overlapping series of pair rule gene activities." [ISBN:0632030488, ISBN:0879694238]
 is_a: GO:0007365 ! periodic partitioning
 is_a: GO:0009952 ! anterior/posterior pattern specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007367
 name: segment polarity determination
 namespace: biological_process
-def: "Division of the 14 parasegments of the embryo into anterior and posterior compartments; exemplified by the actions of the segment polarity gene products." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0632030488, ISBN:0879694238]
+def: "Division of the 14 parasegments of the embryo into anterior and posterior compartments; exemplified by the actions of the segment polarity gene products." [ISBN:0632030488, ISBN:0879694238]
 is_a: GO:0007365 ! periodic partitioning
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007368
@@ -81319,9 +81356,10 @@
 id: GO:0007379
 name: segment specification
 namespace: biological_process
-def: "The process in which segments assume individual identities; exemplified in insects by the actions of the products of the homeotic genes." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The process in which segments assume individual identities; exemplified in insects by the actions of the products of the homeotic genes." [ISBN:0879694238]
 is_a: GO:0007389 ! pattern specification process
 relationship: part_of GO:0035282 ! segmentation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007380
@@ -81376,24 +81414,27 @@
 id: GO:0007386
 name: compartment pattern specification
 namespace: biological_process
-def: "The regionalization process in which embryonic segments are divided into compartments that will result in differences in cell differentiation." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The regionalization process in which embryonic segments are divided into compartments that will result in differences in cell differentiation." [ISBN:0879694238]
 synonym: "compartment specification" RELATED [GOC:dph]
 is_a: GO:0009952 ! anterior/posterior pattern specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007387
 name: anterior compartment pattern formation
 namespace: biological_process
-def: "The process giving rise to specification of cell identity in the anterior compartments of the segmented embryo." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The process giving rise to specification of cell identity in the anterior compartments of the segmented embryo." [ISBN:0879694238]
 synonym: "anterior compartment pattern specification" RELATED [GOC:dph]
 is_a: GO:0007386 ! compartment pattern specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007388
 name: posterior compartment specification
 namespace: biological_process
-def: "The process involved in the specification of cell identity in the posterior compartments of the segmented embryo." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The process involved in the specification of cell identity in the posterior compartments of the segmented embryo." [ISBN:0879694238]
 is_a: GO:0007386 ! compartment pattern specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007389
@@ -82047,9 +82088,10 @@
 id: GO:0007469
 name: antennal development
 namespace: biological_process
-def: "The process whose specific outcome is the progression of the antenna over time, from its formation to the mature structure. The antenna are the sensory structures on the head that are capable of detecting various environmental stimuli." [http://fly.ebi.ac.uk/.bin/cvreport2?id=FBcv0004526]
+def: "The process whose specific outcome is the progression of the antenna over time, from its formation to the mature structure. The antenna are the sensory structures on the head that are capable of detecting various environmental stimuli." [FBbt:00004511]
 is_a: GO:0035114 ! imaginal disc-derived appendage morphogenesis
 relationship: part_of GO:0035214 ! eye-antennal disc development
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0007470
@@ -84132,9 +84174,10 @@
 id: GO:0008056
 name: ocellus development
 namespace: biological_process
-def: "The process whose specific outcome is the progression of the ocellus over time, from its formation to the mature structure. The ocellus is a simple visual organ of insects." [http://fly.ebi.ac.uk/.bin/cvreport2?id=FBcv0004540]
+def: "The process whose specific outcome is the progression of the ocellus over time, from its formation to the mature structure. The ocellus is a simple visual organ of insects." [FBbt:00004505]
 is_a: GO:0007423 ! sensory organ development
 relationship: part_of GO:0035214 ! eye-antennal disc development
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0008057
@@ -84150,12 +84193,14 @@
 
 [Term]
 id: GO:0008058
-name: ocellus pigment granule organization
+name: obsolete ocellus pigment granule organization
 namespace: biological_process
-def: "A process that is carried out at the cellular level which results in the assembly, arrangement of constituent parts, or disassembly of intracellular pigment storage granules in the ocellus." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm]
+def: "OBSOLETE. A process that is carried out at the cellular level which results in the assembly, arrangement of constituent parts, or disassembly of intracellular pigment storage granules in the ocellus." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm]
+comment: The reason for obsoletion is that this term was made in error.
 synonym: "ocellus pigment granule organisation" EXACT []
 synonym: "ocellus pigment granule organization and biogenesis" RELATED [GOC:mah]
-is_a: GO:0048753 ! pigment granule organization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0008061
@@ -87871,8 +87916,9 @@
 id: GO:0008358
 name: maternal determination of anterior/posterior axis, embryo
 namespace: biological_process
-def: "The specification of the anterior/posterior axis of the embryo by gradients of maternally-transcribed gene products; exemplified in insects by the morphogens, bicoid and nanos." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The specification of the anterior/posterior axis of the embryo by gradients of maternally-transcribed gene products; exemplified in insects by the morphogens, bicoid and nanos." [ISBN:0879694238]
 is_a: GO:0008595 ! anterior/posterior axis specification, embryo
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0008359
@@ -88071,24 +88117,24 @@
 
 [Term]
 id: GO:0008379
-name: thioredoxin peroxidase activity
+name: obsolete thioredoxin peroxidase activity
 namespace: molecular_function
 alt_id: GO:0009031
-def: "Catalysis of the reaction: [thioredoxin]-dithiol + H2O2 = [thioredoxin]-disulfide + H2O." [RHEA:63528]
+def: "OBSOLETE. Catalysis of the reaction: [thioredoxin]-dithiol + H2O2 = [thioredoxin]-disulfide + H2O." [RHEA:63528]
+comment: This term was obsoleted because it is redundant with GO:0140824 thioredoxin-dependent peroxiredoxin activity. Both enzyme activities use thioredoxin; the nominal distinction was that GO:0008379/RHEA:63528 specified hydrogen peroxide as substrate while GO:0140824/RHEA:62620 uses a hydroperoxide (of which H2O2 is a subtype). RHEA:63528 has no proteins associated with it and this term has been misannotated for enzymes with broader hydroperoxide specificity.
 synonym: "thiol peroxidase activity" EXACT []
 synonym: "TPx activity" EXACT []
 synonym: "TrxPx activity" EXACT []
-xref: MetaCyc:RXN0-267
 xref: Reactome:R-HSA-3322995 "PRDX3,5 catalyze TXN2 reduced + H2O2 => TXN2 oxidized + 2H2O"
 xref: Reactome:R-HSA-3341343 "PRDX1,2,5 catalyze TXN reduced + H2O2 => TXN oxidized + 2H2O"
 xref: Reactome:R-HSA-3697882 "PRDX5 reduces peroxynitrite to nitrite using TXN"
 xref: Reactome:R-HSA-3697894 "PRDX5 reduces peroxynitrite to nitrite using TXN2"
-xref: RHEA:63528
-is_a: GO:0140824 ! thioredoxin-dependent peroxiredoxin activity
-property_value: skos:exactMatch RHEA:63528
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22598" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23121" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32388" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0140824
 
 [Term]
 id: GO:0008380
@@ -90289,7 +90335,7 @@
 id: GO:0008531
 name: riboflavin kinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + riboflavin = ADP + FMN + 2 H+." [EC:2.7.1.26, RHEA:14357]
+def: "Catalysis of the reaction: riboflavin + ATP = FMN + ADP + H+." [RHEA:14357]
 synonym: "ATP:riboflavin 5'-phosphotransferase activity" RELATED [EC:2.7.1.26]
 synonym: "FK" RELATED [EC:2.7.1.26]
 synonym: "flavokinase activity" RELATED [EC:2.7.1.26]
@@ -90305,6 +90351,7 @@
 property_value: skos:exactMatch EC:2.7.1.26
 property_value: skos:exactMatch RHEA:14357
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32345" xsd:anyURI
 
 [Term]
 id: GO:0008532
@@ -90547,6 +90594,7 @@
 namespace: molecular_function
 alt_id: GO:0008561
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O + Cd2+(in) = ADP + phosphate + Cd2+(out)." [PMID:17326661]
+comment: Note that RHEA:12132 represents both the ABC and the P-type cadmium transporters.
 synonym: "cadmium exporting ATPase activity" EXACT []
 synonym: "cadmium transmembrane transporter activity, phosphorylative mechanism" RELATED []
 synonym: "cadmium-exporting ATPase activity" NARROW []
@@ -90555,12 +90603,12 @@
 synonym: "Cd2+-exporting ATPase activity" RELATED [EC:7.2.2.21]
 xref: EC:7.2.2.21
 xref: MetaCyc:3.6.3.3-RXN
-xref: RHEA:12132
 is_a: GO:0015086 ! cadmium ion transmembrane transporter activity
 is_a: GO:0015662 ! P-type ion transporter activity
 is_a: GO:0019829 ! ATPase-coupled monoatomic cation transmembrane transporter activity
+property_value: skos:broadMatch RHEA:12132
 property_value: skos:exactMatch EC:7.2.2.21
-property_value: skos:exactMatch RHEA:12132
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20824" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26941" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28183" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -90729,7 +90777,7 @@
 id: GO:0008564
 name: protein-exporting ATPase activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O + protein+(in) = ADP + phosphate + protein+(out); drives the concomitant secretion of proteins." [EC:7.4.2.8, PMID:30346996]
+def: "Enables the transfer of a protein from one side of a membrane to the other according to the reaction: ATP + H2O + protein+(in) = ADP + phosphate + protein+(out); drives the concomitant secretion of proteins." [EC:7.4.2.8, PMID:30346996]
 comment: Represents ATP- hydrolyzing enzymes of the general secretory pathway (Sec or Type II), of the virulence-related secretory pathway (Type III) and of the conjugal DNA-protein transfer pathway (Type IV). Type II enzymes occur in bacteria, archaea and eukaryotes, whereas type III and type IV enzymes occur in bacteria where they form components of a multi-subunit complex.
 synonym: "ATPase-coupled protein transporter activity" EXACT []
 xref: EC:7.4.2.8
@@ -90739,6 +90787,7 @@
 is_a: GO:0015450 ! protein-transporting ATPase activity
 property_value: skos:exactMatch EC:7.4.2.8
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30815" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32395" xsd:anyURI
 
 [Term]
 id: GO:0008565
@@ -90754,19 +90803,17 @@
 
 [Term]
 id: GO:0008566
-name: mitochondrial protein-transporting ATPase activity
+name: obsolete mitochondrial protein-transporting ATPase activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O = ADP + phosphate; drives the transport of proteins into the mitochondrion via the mitochondrial inner membrane translocase complex." [EC:7.4.2.3]
-comment: See also the cellular component term 'mitochondrial inner membrane presequence translocase complex ; GO:0005744'.
+def: "OBSOLETE. Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O = ADP + phosphate; drives the transport of proteins into the mitochondrion via the mitochondrial inner membrane translocase complex." [EC:7.4.2.3]
+comment: The reason for obsoletion is that the term is not clearly defined and usage has been inconsistent.
 synonym: "ATPase-coupled mitochondrial protein transporter activity" EXACT []
 xref: EC:7.4.2.3
 xref: MetaCyc:3.6.3.51-RXN
-is_a: GO:0015450 ! protein-transporting ATPase activity
-intersection_of: GO:0015450 ! protein-transporting ATPase activity
-intersection_of: occurs_in GO:0005739 ! mitochondrion
-relationship: occurs_in GO:0005739 ! mitochondrion
 property_value: skos:exactMatch EC:7.4.2.3
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32393" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0008567
@@ -91066,7 +91113,7 @@
 id: GO:0008595
 name: anterior/posterior axis specification, embryo
 namespace: biological_process
-def: "The specification of the anterior/posterior axis of the embryo by the products of genes expressed maternally and genes expressed in the zygote." [http://fly.ebi.ac.uk/allied-data/lk/interactive-fly/aimain/1aahome.htm, ISBN:0879694238]
+def: "The specification of the anterior/posterior axis of the embryo by the products of genes expressed maternally and genes expressed in the zygote." [ISBN:0879694238]
 synonym: "anterior/posterior axis determination, embryo" RELATED [GOC:dph]
 is_a: GO:0000578 ! embryonic axis specification
 is_a: GO:0009948 ! anterior/posterior axis specification
@@ -95317,22 +95364,24 @@
 
 [Term]
 id: GO:0008876
-name: quinoprotein glucose dehydrogenase activity
+name: glucose dehydrogenase (PQQ, quinone) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-glucose + ubiquinone = D-glucono-1,5-lactone + ubiquinol." [RHEA:22152]
+def: "Catalysis of the reaction: D-glucose + ubiquinone = D-glucono-1,5-lactone + ubiquinol, using PQQ as a cofactor." [EC:1.1.5.2]
 synonym: "D-glucose:(pyrroloquinoline-quinone) 1-oxidoreductase activity" RELATED [EC:1.1.5.2]
 synonym: "D-glucose:ubiquinone oxidoreductase activity" RELATED [EC:1.1.5.2]
 synonym: "glucose dehydrogenase (PQQ-dependent) activity" RELATED [EC:1.1.5.2]
 synonym: "glucose dehydrogenase (pyrroloquinoline-quinone) activity" EXACT []
 synonym: "quinoprotein D-glucose dehydrogenase activity" RELATED [EC:1.1.5.2]
+synonym: "quinoprotein glucose dehydrogenase (PQQ, quinone) activity" EXACT []
+synonym: "quinoprotein glucose dehydrogenase activity" BROAD []
 xref: EC:1.1.5.2
-xref: KEGG_REACTION:R00305
-xref: MetaCyc:RXN0-6373
-xref: RHEA:22152
 is_a: GO:0004344 ! glucose dehydrogenase activity
 is_a: GO:0016901 ! oxidoreductase activity, acting on the CH-OH group of donors, quinone or similar compound as acceptor
+property_value: skos:broadMatch KEGG_REACTION:R06620
+property_value: skos:broadMatch MetaCyc:RXN0-6373
+property_value: skos:broadMatch RHEA:22152
 property_value: skos:exactMatch EC:1.1.5.2
-property_value: skos:exactMatch RHEA:22152
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32504" xsd:anyURI
 
 [Term]
 id: GO:0008877
@@ -97203,7 +97252,8 @@
 xref: TC:4.A
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
-is_a: GO:0022804 ! active transmembrane transporter activity
+is_a: GO:7770111 ! group translocator activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27496" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31586" xsd:anyURI
 
 [Term]
@@ -97323,8 +97373,8 @@
 xref: RHEA:58724
 xref: RHEA:58728
 xref: RHEA:62612
-is_a: GO:0008170 ! N-methyltransferase activity
 is_a: GO:0016433 ! rRNA (adenine) methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch RHEA:58728
 property_value: skos:narrowMatch RHEA:58724
 property_value: skos:narrowMatch RHEA:62612
@@ -99098,10 +99148,11 @@
 
 [Term]
 id: GO:0009107
-name: lipoate biosynthetic process
+name: obsolete lipoate biosynthetic process
 namespace: biological_process
 alt_id: GO:0009105
-def: "The chemical reactions and pathways resulting in the formation of lipoate, 1,2-dithiolane-3-pentanoate, the anion derived from lipoic acid." [GOC:ai, ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of lipoate, 1,2-dithiolane-3-pentanoate, the anion derived from lipoic acid." [GOC:ai, ISBN:0198506732]
+comment: The reason for obsoletion is that the term usage has been inconsistent.
 synonym: "lipoate anabolism" EXACT []
 synonym: "lipoate biosynthesis" EXACT []
 synonym: "lipoate formation" EXACT []
@@ -99111,9 +99162,9 @@
 synonym: "lipoic acid biosynthetic process" EXACT []
 synonym: "lipoic acid formation" EXACT []
 synonym: "lipoic acid synthesis" EXACT []
-is_a: GO:0006633 ! fatty acid biosynthetic process
-is_a: GO:0009106 ! lipoate metabolic process
-is_a: GO:0044272 ! sulfur compound biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32418" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009249
 
 [Term]
 id: GO:0009108
@@ -100705,13 +100756,18 @@
 name: protein lipoylation
 namespace: biological_process
 alt_id: GO:0018055
-def: "The lipoylation of peptidyl-lysine to form peptidyl-N6-lipoyl-L-lysine." [RESID:AA0118]
+def: "The chemical reactions and pathways resulting in the attachment of a lipoyl group to a lipoyl carrier protein, either by de novo assembly on the carrier protein via transfer of an octanoyl group followed by sulfur insertion, or by ligation of exogenous lipoate." [PMID:29987032, RESID:AA0118]
+synonym: "lipoate biosynthesis" NARROW []
+synonym: "lipoate biosynthetic process" NARROW []
+synonym: "lipoic acid biosynthetic process" NARROW []
 synonym: "peptidyl-lysine lipoylation" EXACT []
 synonym: "protein-lipoic acid cofactor linkage" EXACT []
 xref: Reactome:R-HSA-9857492 "Protein lipoylation"
+is_a: GO:0009106 ! lipoate metabolic process
 is_a: GO:0018205 ! peptidyl-lysine modification
 is_a: GO:0051604 ! protein maturation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29772" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32418" xsd:anyURI
 
 [Term]
 id: GO:0009250
@@ -100802,19 +100858,20 @@
 
 [Term]
 id: GO:0009257
-name: 10-formyltetrahydrofolate biosynthetic process
+name: obsolete 10-formyltetrahydrofolate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 10-formyltetrahydrofolate, the formylated derivative of tetrahydrofolate." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of 10-formyltetrahydrofolate, the formylated derivative of tetrahydrofolate." [GOC:ai]
+comment: This term was obsoleted because it represents the same process as folate cycle ; GO:0035999.
 synonym: "10-formyl-THF biosynthesis" EXACT []
 synonym: "10-formyl-THF biosynthetic process" EXACT []
 synonym: "10-formyltetrahydrofolate anabolism" EXACT []
 synonym: "10-formyltetrahydrofolate biosynthesis" EXACT []
 synonym: "10-formyltetrahydrofolate formation" EXACT []
 synonym: "10-formyltetrahydrofolate synthesis" EXACT []
-is_a: GO:0009256 ! 10-formyltetrahydrofolate metabolic process
-is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
-is_a: GO:0046654 ! tetrahydrofolate biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32289" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0035999
 
 [Term]
 id: GO:0009258
@@ -125811,6 +125868,7 @@
 name: ABC-type cadmium transporter activity
 namespace: molecular_function
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O + Cd (cytosol) = ADP + phosphate + Cd (vacuole)." [PMID:12455987]
+comment: Note that RHEA:12132 represents both the ABC and the P-type cadmium transporters.
 synonym: "ATP-dependent cadmium transmembrane transporter activity" RELATED []
 synonym: "ATPase-coupled cadmium transmembrane transporter activity" RELATED []
 synonym: "cadmium ABC transporter" EXACT []
@@ -125820,7 +125878,9 @@
 is_a: GO:0015086 ! cadmium ion transmembrane transporter activity
 is_a: GO:0019829 ! ATPase-coupled monoatomic cation transmembrane transporter activity
 is_a: GO:0140359 ! ABC-type transporter activity
+property_value: skos:broadMatch RHEA:12132
 property_value: skos:exactMatch EC:7.2.2.2
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20824" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -126160,7 +126220,7 @@
 id: GO:0015462
 name: ABC-type protein transporter activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O + protein(out) = ADP + phosphate + protein(in)." [GOC:jl]
+def: "Enables the transfer of a protein from one side of a membrane to the other according to the reaction: ATP + H2O + protein(out) = ADP + phosphate + protein(in)." [GOC:jl]
 comment: Enzymes with this activity include bacterial enzymes dedicated to the secretion of one or several closely related proteins belonging to the toxin, protease and lipase families, for example alpha-hemolysin, cyclolysin, colicin V, siderophores, bacteriocin, subtilin, competence factor and pediocin (from EC:7.4.2.5).
 synonym: "ABC-type protein transmembrane transporter activity" EXACT []
 synonym: "ATPase-coupled protein transmembrane transporter activity" RELATED []
@@ -126171,6 +126231,7 @@
 is_a: GO:0015450 ! protein-transporting ATPase activity
 is_a: GO:0140359 ! ABC-type transporter activity
 property_value: skos:broadMatch EC:7.4.2.5
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32395" xsd:anyURI
 
 [Term]
 id: GO:0015464
@@ -135396,7 +135457,7 @@
 id: GO:0016464
 name: chloroplast protein-transporting ATPase activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O = ADP + phosphate; drives the transport of proteins into the chloroplast stroma." [EC:7.4.2.4]
+def: "Enables the transfer of a protein from one side of a membrane to the other according to the reaction: ATP + H2O = ADP + phosphate; drives the transport of proteins into the chloroplast stroma." [EC:7.4.2.4]
 synonym: "AAA chloroplast protein-transporting ATPase" EXACT []
 synonym: "ATPase-coupled chloroplast protein transporter activity" EXACT []
 xref: EC:7.4.2.4
@@ -135404,6 +135465,7 @@
 is_a: GO:0015450 ! protein-transporting ATPase activity
 property_value: skos:exactMatch EC:7.4.2.4
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32395" xsd:anyURI
 
 [Term]
 id: GO:0016465
@@ -141157,7 +141219,7 @@
 xref: Reactome:R-HSA-6793591 "LIAS synthesizes lipoyl-GCSH"
 xref: RHEA:16585
 is_a: GO:0016783 ! sulfurtransferase activity
-relationship: part_of GO:0009107 ! lipoate biosynthetic process
+relationship: part_of GO:0009249 ! protein lipoylation
 property_value: skos:exactMatch EC:2.8.1.8
 property_value: skos:exactMatch MetaCyc:RXN0-949
 property_value: skos:exactMatch RHEA:16585
@@ -157306,7 +157368,6 @@
 synonym: "N-acetylneuraminate catabolism" EXACT []
 synonym: "N-acetylneuraminate degradation" EXACT []
 xref: MetaCyc:P441-PWY
-is_a: GO:0006054 ! N-acetylneuraminate metabolic process
 is_a: GO:0046348 ! amino sugar catabolic process
 is_a: GO:0046395 ! carboxylic acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
@@ -157451,12 +157512,14 @@
 
 [Term]
 id: GO:0019276
-name: UDP-N-acetylgalactosamine metabolic process
+name: obsolete UDP-N-acetylgalactosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving UDP-N-acetylgalactosamine, a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving UDP-N-acetylgalactosamine, a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "UDP-N-acetylgalactosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
-is_a: GO:0009225 ! nucleotide-sugar metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0019277
 
 [Term]
 id: GO:0019277
@@ -157471,7 +157534,6 @@
 xref: MetaCyc:PWY-5514
 xref: MetaCyc:PWY-8013
 is_a: GO:0009226 ! nucleotide-sugar biosynthetic process
-is_a: GO:0019276 ! UDP-N-acetylgalactosamine metabolic process
 is_a: GO:0046349 ! amino sugar biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-5512
 property_value: skos:narrowMatch MetaCyc:PWY-5514
@@ -159257,7 +159319,7 @@
 synonym: "dissimilatory sulphate reduction" EXACT []
 xref: MetaCyc:DISSULFRED-PWY
 xref: Wikipedia:Sulfate-reducing_microorganism
-is_a: GO:0000103 ! sulfate assimilation
+is_a: GO:0006790 ! sulfur compound metabolic process
 is_a: GO:0009061 ! anaerobic respiration
 relationship: has_part GO:0018551 ! dissimilatory sulfite reductase (NADH) activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26582" xsd:anyURI
@@ -159772,11 +159834,12 @@
 id: GO:0019464
 name: glycine decarboxylation via glycine cleavage system
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of glycine by oxidative cleavage to carbon dioxide, ammonia, and a methylene group, mediated by enzymes of the glycine cleavage complex." [MetaCyc:GLYCLEAV-PWY]
+def: "The chemical reactions and pathways resulting in the breakdown of glycine by oxidative cleavage to carbon dioxide, ammonia, and a methylene group, mediated by enzymes of the glycine cleavage complex." [MetaCyc:GLYCLEAV-PWY, PMID:36347252, PMID:41521798]
 synonym: "glycine cleavage system" BROAD []
 xref: MetaCyc:GLYCLEAV-PWY
 is_a: GO:0006546 ! glycine catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 
 [Term]
 id: GO:0019465
@@ -161770,7 +161833,6 @@
 synonym: "urate degradation" EXACT []
 synonym: "uric acid catabolic process" EXACT []
 xref: MetaCyc:P165-PWY
-is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:0046415 ! urate metabolic process
 is_a: GO:0072523 ! purine-containing compound catabolic process
 
@@ -161886,10 +161948,12 @@
 name: organophosphate metabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways involving organophosphates, any phosphate-containing organic compound." [ISBN:0198506732]
+subset: gocheck_do_not_annotate
 subset: goslim_pombe
 synonym: "organophosphate metabolism" EXACT []
 is_a: GO:0006793 ! phosphorus metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26992" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0019638
@@ -162018,6 +162082,7 @@
 xref: MetaCyc:PWY-1622
 xref: MetaCyc:PWY-1861
 is_a: GO:0046292 ! formaldehyde metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 property_value: skos:narrowMatch MetaCyc:P185-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-1622
 property_value: skos:narrowMatch MetaCyc:PWY-1861
@@ -162409,11 +162474,13 @@
 is_a: GO:0006536 ! glutamate metabolic process
 is_a: GO:0006541 ! L-glutamine metabolic process
 is_a: GO:0019740 ! nitrogen utilization
+is_a: GO:7770097 ! nutrient assimilation
 property_value: skos:narrowMatch MetaCyc:AMMASSIM-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-3282
 property_value: skos:narrowMatch MetaCyc:PWY-6963
 property_value: skos:narrowMatch MetaCyc:PWY-6964
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
 
 [Term]
 id: GO:0019677
@@ -164637,14 +164704,14 @@
 name: obsolete diaminopimelate biosynthetic process
 namespace: biological_process
 def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of diaminopimelate, both as an intermediate in lysine biosynthesis and as a component (as meso-diaminopimelate) of the peptidoglycan of Gram-negative bacterial cell walls." [GOC:ma, ISBN:0198547684]
-comment: This term was obsoleted because it represents an intermediate in L-leucine biosynthesis.
+comment: This term was obsoleted because it represents an intermediate in L-lysine biosynthesis.
 synonym: "diaminopimelate anabolism" EXACT []
 synonym: "diaminopimelate biosynthesis" EXACT []
 synonym: "diaminopimelate formation" EXACT []
 synonym: "diaminopimelate synthesis" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 is_obsolete: true
-consider: GO:0009098
+consider: GO:0009085
 
 [Term]
 id: GO:0019878
@@ -173177,10 +173244,11 @@
 xref: Reactome:R-HSA-9856871 "MDH1 reduces OA"
 xref: RHEA:21432
 is_a: GO:0016615 ! malate dehydrogenase activity
-is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+is_a: GO:0102443 ! L-2-hydroxycarboxylate dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.1.1.37
 property_value: skos:exactMatch RHEA:21432
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 
 [Term]
 id: GO:0030061
@@ -176629,11 +176697,15 @@
 
 [Term]
 id: GO:0030389
-name: fructosamine metabolic process
+name: obsolete fructosamine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving fructosamine, a fructose molecule containing an amino group in place of a hydroxyl group." [GOC:jl, ISBN:0192801023]
+def: "OBSOLETE. The chemical reactions and pathways involving fructosamine, a fructose molecule containing an amino group in place of a hydroxyl group." [GOC:jl, ISBN:0192801023]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "fructosamine metabolism" EXACT []
-is_a: GO:0006040 ! amino sugar metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
+consider: GO:0030391
+consider: GO:0030392
 
 [Term]
 id: GO:0030391
@@ -176644,7 +176716,6 @@
 synonym: "fructosamine biosynthesis" EXACT []
 synonym: "fructosamine formation" EXACT []
 synonym: "fructosamine synthesis" EXACT []
-is_a: GO:0030389 ! fructosamine metabolic process
 is_a: GO:0046349 ! amino sugar biosynthetic process
 
 [Term]
@@ -176655,7 +176726,6 @@
 synonym: "fructosamine breakdown" EXACT []
 synonym: "fructosamine catabolism" EXACT []
 synonym: "fructosamine degradation" EXACT []
-is_a: GO:0030389 ! fructosamine metabolic process
 is_a: GO:0046348 ! amino sugar catabolic process
 
 [Term]
@@ -176664,8 +176734,8 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving fructoselysine, a fructose molecule containing a lysine group in place of a hydroxyl group." [GOC:ai]
 synonym: "fructoselysine metabolism" EXACT []
+is_a: GO:0006040 ! amino sugar metabolic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
-is_a: GO:0030389 ! fructosamine metabolic process
 
 [Term]
 id: GO:0030394
@@ -177862,11 +177932,12 @@
 name: regulation of axon extension
 namespace: biological_process
 def: "Any process that modulates the rate, direction or extent of axon extension." [GOC:curators]
+is_a: GO:0001558 ! regulation of cell growth
 is_a: GO:0048638 ! regulation of developmental growth
-is_a: GO:0061387 ! regulation of extent of cell growth
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0048675 ! axon extension
 relationship: regulates GO:0048675 ! axon extension
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 
 [Term]
 id: GO:0030517
@@ -179725,7 +179796,7 @@
 id: GO:0030701
 name: NAD+-dinitrogen-reductase ADP-D-ribosyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: NAD+ + [dinitrogen reductase] = nicotinamide + ADP-D-ribosyl-[dinitrogen reductase]." [EC:2.4.2.37]
+def: "Catalysis of the reaction: L-arginyl-[dinitrogen reductase] + NAD+ = N(omega)-alpha-(ADP-D-ribosyl)-L-arginyl-[dinitrogen reductase] + nicotinamide + H+." [RHEA:18077]
 synonym: "ADP-ribosyltransferase activity" BROAD [EC:2.4.2.37]
 synonym: "NAD+:[dinitrogen reductase] (ADP-D-ribosyl)transferase activity" RELATED [EC:2.4.2.37]
 synonym: "NAD--azoferredoxin (ADP-ribose)transferase activity" RELATED [EC:2.4.2.37]
@@ -179734,10 +179805,11 @@
 xref: EC:2.4.2.37
 xref: MetaCyc:2.4.2.37-RXN
 xref: RHEA:18077
-is_a: GO:0016763 ! pentosyltransferase activity
+is_a: GO:0106274 ! NAD+-protein-arginine ADP-ribosyltransferase activity
 property_value: skos:exactMatch EC:2.4.2.37
 property_value: skos:exactMatch RHEA:18077
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 
 [Term]
 id: GO:0030703
@@ -183154,6 +183226,8 @@
 is_a: GO:0034976 ! response to endoplasmic reticulum stress
 is_a: GO:0035556 ! intracellular signal transduction
 relationship: part_of GO:0034620 ! cellular response to unfolded protein
+relationship: part_of GO:0170080 ! endoplasmic reticulum protein quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20914" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28057" xsd:anyURI
 
 [Term]
@@ -188877,12 +188951,12 @@
 synonym: "telomeric heterochromatin formation" RELATED []
 synonym: "telomeric silencing" EXACT [GOC:bf]
 is_a: GO:0140719 ! constitutive heterochromatin formation
-relationship: occurs_in GO:0000781 ! chromosome, telomeric region
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19188" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19308" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22027" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23553" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29160" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32403" xsd:anyURI
 
 [Term]
 id: GO:0031510
@@ -203927,11 +204001,13 @@
 xref: EC:1.1.1.431
 xref: MetaCyc:RXN-8773
 xref: RHEA:27445
-is_a: GO:0004032 ! aldose reductase (NADPH) activity
+is_a: GO:0004032 ! aldose reductase [NAD(P)H] activity
+is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.1.1.431
 property_value: skos:exactMatch MetaCyc:RXN-8773
 property_value: skos:exactMatch RHEA:27445
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27136" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27881" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30910" xsd:anyURI
 
 [Term]
@@ -203946,9 +204022,11 @@
 xref: MetaCyc:RXN-8772
 xref: RHEA:25229
 xref: SABIO-RK:1858
-is_a: GO:0004032 ! aldose reductase (NADPH) activity
+is_a: GO:0004032 ! aldose reductase [NAD(P)H] activity
+is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
 property_value: skos:exactMatch RHEA:25229
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27136" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27881" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -205354,9 +205432,9 @@
 xref: Reactome:R-HSA-9906955 "MT-ND4 is translated"
 xref: Reactome:R-HSA-9926981 "Bam complex inserts Hbp into outer membrane"
 is_a: GO:0140597 ! protein carrier activity
-relationship: part_of GO:0090150 ! establishment of protein localization to membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16976" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20414" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32404" xsd:anyURI
 
 [Term]
 id: GO:0032978
@@ -209095,11 +209173,14 @@
 
 [Term]
 id: GO:0033331
-name: ent-kaurene metabolic process
+name: obsolete ent-kaurene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving ent-kaur-16-ene. Ent-kaurene is a tetracyclic diterpenoid that is a precursor of several plant isoprenoids, including gibberellins." [GOC:mah, PMID:17064690]
+def: "OBSOLETE. The chemical reactions and pathways involving ent-kaur-16-ene. Ent-kaurene is a tetracyclic diterpenoid that is a precursor of several plant isoprenoids, including gibberellins." [GOC:mah, PMID:17064690]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
 synonym: "ent-kaurene metabolism" EXACT []
-is_a: GO:0042214 ! terpene metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28120" xsd:anyURI
+is_obsolete: true
+consider: GO:0033332
 
 [Term]
 id: GO:0033332
@@ -209112,7 +209193,6 @@
 synonym: "ent-kaurene synthesis" EXACT []
 xref: MetaCyc:PWY-5032
 xref: MetaCyc:PWY-6653
-is_a: GO:0033331 ! ent-kaurene metabolic process
 is_a: GO:0046246 ! terpene biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-5032
 property_value: skos:narrowMatch MetaCyc:PWY-6653
@@ -209311,7 +209391,7 @@
 id: GO:0033353
 name: L-methionine cycle
 namespace: biological_process
-def: "A cyclic series of interconversions involving S-adenosyl-L-homocysteine, L-homocysteine, L-methionine and S-adenosyl-L-methionine (SAM). Couples utilization of the methyl group of SAM with recycling of the homocysteinyl group and regeneration of L-methionine." [PMID:31950558, PMID:39394448]
+def: "A cyclic series of interconversions involving S-adenosyl-L-homocysteine, L-homocysteine, L-methionine and S-adenosyl-L-methionine (SAM). Couples utilization of the methyl group of SAM with recycling of the homocysteinyl group and regeneration of L-methionine." [PMID:31950558, PMID:32961717, PMID:39394448]
 synonym: "activated methyl cycle" EXACT []
 synonym: "S-adenosylmethionine cycle" EXACT []
 synonym: "SAM cycle" EXACT []
@@ -209319,6 +209399,7 @@
 xref: MetyaCyc:PWY-6151
 is_a: GO:0006555 ! L-methionine metabolic process
 is_a: GO:0006575 ! modified amino acid metabolic process
+is_a: GO:0006730 ! one-carbon metabolic process
 is_a: GO:0046128 ! purine ribonucleoside metabolic process
 is_a: GO:0046500 ! S-adenosylmethionine metabolic process
 is_a: GO:0050667 ! homocysteine metabolic process
@@ -209326,6 +209407,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31840" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 
 [Term]
 id: GO:0033354
@@ -211302,9 +211384,11 @@
 id: GO:0033528
 name: S-methylmethionine cycle
 namespace: biological_process
-def: "A cyclic series of interconversions involving S-methyl-L-methionine, S-adenosyl-L-homocysteine, S-adenosyl-L-methionine, L-homocysteine, and L-methionine. Converts the methionine group of adenosylmethionine back to free methionine, and may serve regulate the cellular adenosylmethionine level." [GOC:mah, MetaCyc:PWY-5441]
+def: "A cyclic series of interconversions involving S-methyl-L-methionine, S-adenosyl-L-homocysteine, S-adenosyl-L-methionine, L-homocysteine, and L-methionine. Converts the methionine group of S-adenosylmethionine back to free L-methionine, and may serve regulate the cellular adenosylmethionine level." [GOC:mah, MetaCyc:PWY-5441, PMID:11337394]
 xref: MetaCyc:PWY-5441
+is_a: GO:0006730 ! one-carbon metabolic process
 is_a: GO:0033477 ! S-methylmethionine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 
 [Term]
 id: GO:0033529
@@ -222163,6 +222247,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29050" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29666" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32456" xsd:anyURI
 
 [Term]
 id: GO:0034355
@@ -239543,11 +239628,13 @@
 
 [Term]
 id: GO:0035999
-name: tetrahydrofolate interconversion
+name: folate cycle
 namespace: biological_process
-def: "The chemical reactions and pathways by which one-carbon (C1) units are transferred between tetrahydrofolate molecules, to synthesize other tetrahydrofolate molecules." [GOC:yaf, PMID:1825999]
-synonym: "folate cycle" EXACT []
+def: "A cyclic series of interconversions of the one-carbon unit carried by tetrahydrofolate - as 10-formyltetrahydrofolate, 5,10-methenyltetrahydrofolate, 5,10-methylenetetrahydrofolate and 5-methyltetrahydrofolate. Couples the acquisition of a one-carbon unit from donors such as serine, glycine or formate with its transfer, in the appropriate oxidation state, to biosynthetic acceptors, and with regeneration of tetrahydrofolate." [PMID:1825999, PMID:18804690, PMID:27641100]
 synonym: "folate transformations" EXACT []
+synonym: "folate-mediated one-carbon metabolism" EXACT []
+synonym: "folic acid cycle" EXACT []
+synonym: "tetrahydrofolate interconversion" EXACT []
 xref: MetaCyc:1CMET2-PWY
 xref: MetaCyc:PWY-2201
 xref: MetaCyc:PWY-3841
@@ -239558,6 +239645,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-3841
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32289" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 created_by: bf
 creation_date: 2011-09-02T01:35:49Z
 
@@ -240947,7 +241035,6 @@
 name: very long-chain fatty-acyl-CoA catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of very long-chain fatty-acyl-CoAs, any derivative of coenzyme A in which the sulfhydryl group is in a thioester linkage with a very long-chain fatty-acyl group. A very long-chain fatty acid has an aliphatic tail containing more than 22 carbons." [GOC:pm]
-comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
 synonym: "very long-chain fatty-acyl-CoA breakdown" EXACT [GOC:bf]
 synonym: "very long-chain fatty-acyl-CoA catabolism" EXACT [GOC:bf]
 synonym: "very long-chain fatty-acyl-CoA degradation" EXACT [GOC:bf]
@@ -242784,7 +242871,7 @@
 id: GO:0036261
 name: 7-methylguanosine cap hypermethylation
 namespace: biological_process
-def: "Hypermethylation of the 7-(mono)methylguanosine (m(7)G) cap structure at the 2' position of the guanosine residue to convert a mono-methylated cap to a 2,2,7-trimethylguanosine cap structure. This type of cap modification occurs on small nuclear RNAs (snRNAs) and small nucleolar RNAs (snoRNAs) and is dependent on prior guanine-N7 methylation." [GOC:bf, GOC:BHF, GOC:krc, GOC:mah, GOC:rl, PMID:11983179, PMID:18775984]
+def: "Hypermethylation of the 7-(mono)methylguanosine (m(7)G) cap structure at the N2 position of the guanine base to convert a mono-methylated cap to a 2,2,7-trimethylguanosine cap structure. This type of cap modification occurs on small nuclear RNAs (snRNAs) and small nucleolar RNAs (snoRNAs) and is dependent on prior guanine-N7 methylation." [GOC:bf, GOC:BHF, GOC:krc, GOC:mah, GOC:rl, PMID:11983179, PMID:15590684, PMID:18775984]
 synonym: "2,2,7-trimethylguanosine cap formation" EXACT [PMID:11983179]
 synonym: "conversion of m(7)G to m(3)G" EXACT [PMID:11983179]
 synonym: "hypermethylation of snoRNA cap" NARROW [GOC:bf, GOC:krc, GOC:mah]
@@ -242796,6 +242883,7 @@
 is_a: GO:0001510 ! RNA methylation
 is_a: GO:0036260 ! RNA capping
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26208" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27628" xsd:anyURI
 created_by: bf
 creation_date: 2012-06-15T02:21:39Z
 
@@ -245755,6 +245843,8 @@
 is_a: GO:0010498 ! proteasomal protein catabolic process
 is_a: GO:0034976 ! response to endoplasmic reticulum stress
 is_a: GO:0042221 ! response to chemical
+is_a: GO:0170080 ! endoplasmic reticulum protein quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20914" xsd:anyURI
 created_by: bf
 creation_date: 2015-05-14T11:43:06Z
 
@@ -246714,6 +246804,7 @@
 synonym: "IL-5-mediated signaling pathway" EXACT [GOC:bf]
 synonym: "interleukin-5-mediated signalling pathway" EXACT [GOC:mah]
 is_a: GO:0019221 ! cytokine-mediated signaling pathway
+relationship: part_of GO:7770103 ! cellular response to interleukin-5
 created_by: bf
 creation_date: 2011-11-03T04:18:21Z
 
@@ -248084,6 +248175,7 @@
 synonym: "granulocyte colony-stimulating factor receptor signaling pathway" EXACT [GOC:nhn]
 synonym: "granulocyte colony-stimulating factor signalling pathway" RELATED [GOC:bf]
 is_a: GO:0019221 ! cytokine-mediated signaling pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32373" xsd:anyURI
 created_by: bf
 creation_date: 2012-05-14T01:30:28Z
 
@@ -253176,6 +253268,7 @@
 xref: MetaCyc:PWY490-3
 is_a: GO:0042126 ! nitrate metabolic process
 is_a: GO:0071941 ! nitrogen cycle metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 relationship: has_part GO:0015112 ! nitrate transmembrane transporter activity
 relationship: has_part GO:0098809 ! nitrite reductase activity
 property_value: skos:narrowMatch MetaCyc:PWY-381
@@ -253184,6 +253277,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27216" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30537" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
 
 [Term]
 id: GO:0042129
@@ -259024,11 +259118,10 @@
 def: "mitochondrial protein-containing complex localised in the mitochondrial inner membrane space that chaperones proteins to the TIM22 complex for insertion into the mitochondrial inner membrane." [GOC:vw]
 synonym: "mitochondrial intermembrane space protein transporter complex" RELATED []
 synonym: "small TIM complex" EXACT []
-synonym: "Tim8-Tim13 complex" NARROW []
-synonym: "Tim9-Tim10 complex" NARROW []
 is_a: GO:0098798 ! mitochondrial protein-containing complex
 relationship: part_of GO:0005758 ! mitochondrial intermembrane space
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30351" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32408" xsd:anyURI
 
 [Term]
 id: GO:0042720
@@ -260158,7 +260251,7 @@
 name: bipolar cell growth
 namespace: biological_process
 def: "The process in which a cell irreversibly increases in size along one axis through simultaneous polarized growth from opposite ends of a cell, resulting in morphogenesis of the cell." [GOC:vw]
-comment: Bipolar cell growth refers to a change in both cell size and cell shape. For shape changes where cell size is not affected, consider instead the term 'establishment or maintenance of bipolar cell polarity resulting in cell shape ; GO:0061246' and its children.
+comment: Bipolar cell growth refers to a change in both cell size and cell shape. For shape changes where cell size is not affected, consider instead the term 'establishment or maintenance of bipolar cell polarity; GO:0061245' and its children.
 synonym: "bipolar cell elongation" NARROW []
 synonym: "bipolar growth" BROAD []
 synonym: "polar cell elongation" RELATED []
@@ -278118,66 +278211,81 @@
 
 [Term]
 id: GO:0044472
-name: venom-mediated perturbation of calcium channel activity
+name: obsolete venom-mediated perturbation of calcium channel activity
 namespace: biological_process
-def: "A process in which an organism alters or subverts the activity of a calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+def: "OBSOLETE. A process in which an organism alters or subverts the activity of a calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in modulation of calcium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in modulation of calcium channel activity in other organism" EXACT []
-is_a: GO:0044560 ! venom-mediated perturbation of ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0005246
 created_by: jl
 creation_date: 2012-01-19T02:17:25Z
 
 [Term]
 id: GO:0044473
-name: venom-mediated inhibition of calcium channel activity
+name: obsolete venom-mediated inhibition of calcium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of calcium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of calcium channel activity in other organism" EXACT []
-is_a: GO:0044472 ! venom-mediated perturbation of calcium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0019855
 created_by: jl
 creation_date: 2012-01-19T02:19:46Z
 
 [Term]
 id: GO:0044474
-name: venom-mediated inhibition of voltage-gated calcium channel activity
+name: obsolete venom-mediated inhibition of voltage-gated calcium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of voltage-gated calcium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of voltage-gated calcium channel activity in other organism" EXACT []
-is_a: GO:0044473 ! venom-mediated inhibition of calcium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0019855
 created_by: jl
 creation_date: 2012-01-19T02:25:04Z
 
 [Term]
 id: GO:0044475
-name: venom-mediated inhibition of high voltage-gated calcium channel activity
+name: obsolete venom-mediated inhibition of high voltage-gated calcium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a high voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a high voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of high voltage-gated calcium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of high voltage-gated calcium channel activity in other organism" EXACT []
-is_a: GO:0044474 ! venom-mediated inhibition of voltage-gated calcium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0019855
 created_by: jl
 creation_date: 2012-01-19T02:28:11Z
 
 [Term]
 id: GO:0044476
-name: venom-mediated inhibition of low voltage-gated calcium channel activity
+name: obsolete venom-mediated inhibition of low voltage-gated calcium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a low voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a low voltage-gated calcium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:20920515]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of low voltage-gated calcium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of low voltage-gated calcium channel activity in other organism" EXACT []
-is_a: GO:0044474 ! venom-mediated inhibition of voltage-gated calcium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0019855
 created_by: jl
 creation_date: 2012-01-19T02:28:42Z
 
@@ -278380,38 +278488,47 @@
 
 [Term]
 id: GO:0044492
-name: venom-mediated perturbation of voltage-gated sodium channel activity
+name: obsolete venom-mediated perturbation of voltage-gated sodium channel activity
 namespace: biological_process
-def: "A process in which an organism alters or subverts the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+def: "OBSOLETE. A process in which an organism alters or subverts the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in modulation of voltage-gated sodium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in modulation of voltage-gated sodium channel activity in other organism" EXACT []
-is_a: GO:0044560 ! venom-mediated perturbation of ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0017080
 created_by: jl
 creation_date: 2012-02-01T01:23:04Z
 
 [Term]
 id: GO:0044493
-name: venom-mediated inhibition of voltage-gated sodium channel activity
+name: obsolete venom-mediated inhibition of voltage-gated sodium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of voltage-gated sodium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of voltage-gated sodium channel activity in other organism" EXACT []
-is_a: GO:0044492 ! venom-mediated perturbation of voltage-gated sodium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0019871
 created_by: jl
 creation_date: 2012-02-01T01:26:59Z
 
 [Term]
 id: GO:0044494
-name: venom-mediated activation of voltage-gated sodium channel activity
+name: obsolete venom-mediated activation of voltage-gated sodium channel activity
 namespace: biological_process
-def: "A process in which an organism initiates, promotes, or enhances the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+def: "OBSOLETE. A process in which an organism initiates, promotes, or enhances the activity of a voltage-gated sodium channel in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21781281]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in positive regulation of voltage-gated sodium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in positive regulation of voltage-gated sodium channel activity in other organism" EXACT []
-is_a: GO:0044492 ! venom-mediated perturbation of voltage-gated sodium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:7770087
 created_by: jl
 creation_date: 2012-02-01T01:29:25Z
 
@@ -279221,28 +279338,33 @@
 
 [Term]
 id: GO:0044559
-name: venom-mediated perturbation of voltage-gated potassium channel activity
+name: obsolete venom-mediated perturbation of voltage-gated potassium channel activity
 namespace: biological_process
-def: "A process in which an organism alters or subverts the activity of a voltage-gated potassium channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+def: "OBSOLETE. A process in which an organism alters or subverts the activity of a voltage-gated potassium channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in modulation of voltage-gated potassium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in modulation of voltage-gated potassium channel activity in other organism" EXACT []
-is_a: GO:0044560 ! venom-mediated perturbation of ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0015459
 created_by: jl
 creation_date: 2012-04-05T03:35:20Z
 
 [Term]
 id: GO:0044560
-name: venom-mediated perturbation of ion channel activity
+name: obsolete venom-mediated perturbation of ion channel activity
 namespace: biological_process
-def: "A process in which an organism alters or subverts the activity of an ion channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+def: "OBSOLETE. A process in which an organism alters or subverts the activity of an ion channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in modulation of ion channel activity in another organism" EXACT []
 synonym: "envenomation resulting in modulation of ion channel activity in other organism" EXACT []
 synonym: "envenomation resulting in regulation of ion channel activity in other organism" EXACT []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
 created_by: jl
 creation_date: 2012-04-05T03:46:35Z
 
@@ -279261,13 +279383,16 @@
 
 [Term]
 id: GO:0044562
-name: venom-mediated inhibition of voltage-gated potassium channel activity
+name: obsolete venom-mediated inhibition of voltage-gated potassium channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a  voltage-gated potassium channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a  voltage-gated potassium channel in another organism via the action of a venom." [GOC:fj, GOC:jl]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of voltage-gated potassium channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of voltage-gated potassium channel activity in other organism" EXACT []
-is_a: GO:0044559 ! venom-mediated perturbation of voltage-gated potassium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:7770090
 created_by: jl
 creation_date: 2012-04-05T04:01:49Z
 
@@ -279281,7 +279406,6 @@
 synonym: "voltage-dependence of activation shift (to the left)" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29857" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0044562
 created_by: jl
 creation_date: 2012-04-05T04:06:29Z
 
@@ -279294,7 +279418,6 @@
 synonym: "envenomation resulting in occlusion of the pore of voltage-gated potassium channel in other organism" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29857" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0044562
 created_by: jl
 creation_date: 2012-04-05T04:14:24Z
 
@@ -281044,49 +281167,58 @@
 
 [Term]
 id: GO:0044733
-name: venom-mediated perturbation of pH-gated ion channel activity
+name: obsolete venom-mediated perturbation of pH-gated ion channel activity
 namespace: biological_process
-def: "A process in which an organism alters or subverts the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+def: "OBSOLETE. A process in which an organism alters or subverts the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in modulation of acid-sensing ion channel activity in another organism" EXACT []
 synonym: "envenomation resulting in modulation of acid-sensing ion channel activity in other organism" EXACT []
 synonym: "envenomation resulting in modulation of ASIC channel activity in other organism" EXACT []
 synonym: "venom-mediated perturbation of acid-sensing ion channel activity" EXACT []
-is_a: GO:0044560 ! venom-mediated perturbation of ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29859" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0099106
 created_by: jl
 creation_date: 2012-11-06T15:58:36Z
 
 [Term]
 id: GO:0044734
-name: venom-mediated activation of pH-gated ion channel activity
+name: obsolete venom-mediated activation of pH-gated ion channel activity
 namespace: biological_process
-def: "A process in which an organism initiates, promotes, or enhances the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+def: "OBSOLETE. A process in which an organism initiates, promotes, or enhances the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in positive regulation of acid-sensing ion channel activity in another organism" EXACT []
 synonym: "envenomation resulting in positive regulation of acid-sensing ion channel activity in other organism" EXACT []
 synonym: "envenomation resulting in positive regulation of ASIC channel activity in other organism" EXACT []
 synonym: "venom-mediated activation of acid-sensing ion channel activity" RELATED []
-is_a: GO:0044733 ! venom-mediated perturbation of pH-gated ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29859" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0099103
 created_by: jl
 creation_date: 2012-11-06T16:02:01Z
 
 [Term]
 id: GO:0044735
-name: venom-mediated inhibition of pH-gated ion channel activity
+name: obsolete venom-mediated inhibition of pH-gated ion channel activity
 namespace: biological_process
-def: "A process in which an organism inhibits or disrupts the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+def: "OBSOLETE. A process in which an organism inhibits or disrupts the activity of a pH-gated (also known as acid-sensing ion channel (ASIC)) in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:23034652]
+comment: This term was obsoleted because it represents a molecular function.
 synonym: "envenomation resulting in negative regulation of acid-sensing ion channel activity in another organism" EXACT []
 synonym: "envenomation resulting in negative regulation of acid-sensing ion channel activity in other organism" EXACT []
 synonym: "envenomation resulting in negative regulation of ASIC channel activity in other organism" EXACT []
 synonym: "venom-mediated inhibition of acid-sensing ion channel activity" RELATED []
-is_a: GO:0044733 ! venom-mediated perturbation of pH-gated ion channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29859" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32401" xsd:anyURI
+is_obsolete: true
+consider: GO:0008200
 created_by: jl
 creation_date: 2012-11-06T16:05:58Z
 
@@ -287032,8 +287164,9 @@
 id: GO:0045498
 name: sex comb development
 namespace: biological_process
-def: "The process whose specific outcome is the progression of the sex comb over time, from its formation to the mature structure. The sex combs are the male specific chaetae located on the prothoracic tarsal segment of the prothoracic leg." [http://fly.ebi.ac.uk]
+def: "The process whose specific outcome is the progression of the sex comb over time, from its formation to the mature structure. The sex combs are the male specific chaetae located on the prothoracic tarsal segment of the prothoracic leg." [FBbt:00004296]
 is_a: GO:0007423 ! sensory organ development
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0045499
@@ -298746,7 +298879,6 @@
 synonym: "N-acetylneuraminate biosynthesis" EXACT []
 synonym: "N-acetylneuraminate formation" EXACT []
 synonym: "N-acetylneuraminate synthesis" EXACT []
-is_a: GO:0006054 ! N-acetylneuraminate metabolic process
 is_a: GO:0046349 ! amino sugar biosynthetic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
 
@@ -298885,23 +299017,27 @@
 name: carboxylic acid biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of carboxylic acids, any organic acid containing one or more carboxyl (-COOH) groups." [ISBN:0198506732]
+subset: gocheck_do_not_annotate
 synonym: "carboxylic acid anabolism" EXACT []
 synonym: "carboxylic acid biosynthesis" EXACT []
 synonym: "carboxylic acid formation" EXACT []
 synonym: "carboxylic acid synthesis" EXACT []
 is_a: GO:0019752 ! carboxylic acid metabolic process
 is_a: GO:0044283 ! small molecule biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0046395
 name: carboxylic acid catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of carboxylic acids, any organic acid containing one or more carboxyl (-COOH) groups." [ISBN:0198506732]
+subset: gocheck_do_not_annotate
 synonym: "carboxylic acid breakdown" EXACT []
 synonym: "carboxylic acid catabolism" EXACT []
 synonym: "carboxylic acid degradation" EXACT []
 is_a: GO:0019752 ! carboxylic acid metabolic process
 is_a: GO:0044282 ! small molecule catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0046396
@@ -299390,11 +299526,13 @@
 name: organophosphate catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of organophosphates, any phosphate-containing organic compound." [GOC:ai]
+subset: gocheck_do_not_annotate
 synonym: "organophosphate breakdown" EXACT []
 synonym: "organophosphate catabolism" EXACT []
 synonym: "organophosphate degradation" EXACT []
 is_a: GO:0009056 ! catabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0046435
@@ -304916,16 +305054,18 @@
 id: GO:0046923
 name: ER lumen protein retrieval receptor activity
 namespace: molecular_function
-def: "Binding to an endoplasmic reticulum (ER) retention sequence, a short stretch of amino acids found in a protein that acts as a signal to retain the protein within the ER." [GOC:ai]
+def: "Binding to a C-terminal ER retrieval signal, such as KDEL, HDEL or DDEL, present on soluble lumenal proteins that have escaped from the endoplasmic reticulum (ER) to the Golgi, and mediating their return to the ER." [PMID:33037041]
 synonym: "DDEL sequence binding" NARROW []
-synonym: "DDEL signal sequence receptor activity" NARROW []
-synonym: "endoplasmic reticulum retention sequence binding" EXACT []
-synonym: "ER retention sequence binding" NARROW []
+synonym: "DDEL signal sequence receptor activity" RELATED []
+synonym: "endoplasmic reticulum retention sequence binding" RELATED []
+synonym: "ER retention sequence binding" RELATED []
 synonym: "HDEL sequence binding" NARROW []
-synonym: "HDEL signal sequence receptor activity" NARROW []
+synonym: "HDEL signal sequence receptor activity" RELATED []
 synonym: "KDEL sequence binding" NARROW []
-synonym: "KDEL signal sequence receptor activity" NARROW []
-is_a: GO:0005048 ! signal sequence receptor activity
+synonym: "KDEL signal sequence receptor activity" RELATED []
+is_a: GO:0038024 ! cargo receptor activity
+relationship: part_of GO:0006890 ! retrograde vesicle-mediated transport, Golgi to endoplasmic reticulum
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32307" xsd:anyURI
 
 [Term]
 id: GO:0046924
@@ -330005,12 +330145,13 @@
 name: regulation of collateral sprouting
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of collateral sprouting." [GOC:dgh, GOC:dph, GOC:jid, GOC:lm]
+is_a: GO:0001558 ! regulation of cell growth
 is_a: GO:0048638 ! regulation of developmental growth
 is_a: GO:0050770 ! regulation of axonogenesis
-is_a: GO:0061387 ! regulation of extent of cell growth
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0048668 ! collateral sprouting
 relationship: regulates GO:0048668 ! collateral sprouting
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 
 [Term]
 id: GO:0048671
@@ -330195,12 +330336,13 @@
 name: regulation of sprouting of injured axon
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of sprouting of an injured axon." [GOC:dgh, GOC:dph, GOC:jid, GOC:lm]
+is_a: GO:0001558 ! regulation of cell growth
 is_a: GO:0022603 ! regulation of anatomical structure morphogenesis
 is_a: GO:0048638 ! regulation of developmental growth
-is_a: GO:0061387 ! regulation of extent of cell growth
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0048682 ! sprouting of injured axon
 relationship: regulates GO:0048682 ! sprouting of injured axon
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 
 [Term]
 id: GO:0048687
@@ -331504,11 +331646,12 @@
 id: GO:0048816
 name: ocellus morphogenesis
 namespace: biological_process
-def: "The process in which the anatomical structures of the ocellus are generated and organized. The ocellus is a simple visual organ of insects." [http://fly.ebi.ac.uk/.bin/cvreport2?id=FBcv0004540]
+def: "The process in which the anatomical structures of the ocellus are generated and organized. The ocellus is a simple visual organ of insects." [FBbt:00004505]
 is_a: GO:0009886 ! post-embryonic animal morphogenesis
 is_a: GO:0090596 ! sensory organ morphogenesis
 relationship: part_of GO:0007455 ! eye-antennal disc morphogenesis
 relationship: part_of GO:0008056 ! ocellus development
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18983" xsd:anyURI
 
 [Term]
 id: GO:0048817
@@ -336074,7 +336217,7 @@
 id: GO:0050197
 name: phytanate-CoA ligase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + CoA + phytanate = AMP + diphosphate + H+ + phytanoyl-CoA." [EC:6.2.1.24, RHEA:21380]
+def: "Catalysis of the reaction: ATP + CoA + phytanate = AMP + diphosphate + H+ + phytanoyl-CoA." [RHEA:21380]
 synonym: "phytanate:CoA ligase (AMP-forming)" RELATED [EC:6.2.1.24]
 synonym: "phytanoyl-CoA ligase activity" RELATED [EC:6.2.1.24]
 xref: EC:6.2.1.24
@@ -336082,10 +336225,11 @@
 xref: MetaCyc:PHYTANATE--COA-LIGASE-RXN
 xref: Reactome:R-HSA-389622 "phytanate + CoA-SH + ATP => phytanoyl-CoA + AMP + pyrophosphate"
 xref: RHEA:21380
-is_a: GO:0016405 ! CoA-ligase activity
+is_a: GO:0120515 ! fatty acid-CoA ligase activity
 property_value: skos:exactMatch EC:6.2.1.24
 property_value: skos:exactMatch RHEA:21380
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 
 [Term]
 id: GO:0050198
@@ -343428,7 +343572,7 @@
 id: GO:0050633
 name: acetyl-CoA C-myristoyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: myristoyl-CoA + acetyl-CoA = 3-oxopalmitoyl-CoA + CoA." [EC:2.3.1.155, MetaCyc:2.3.1.155-RXN]
+def: "Catalysis of the reaction: tetradecanoyl-CoA + acetyl-CoA = 3-oxohexadecanoyl-CoA + CoA." [RHEA:18161]
 synonym: "3-oxopalmitoyl-CoA hydrolase activity" RELATED [EC:2.3.1.155]
 synonym: "3-oxopalmitoyl-CoA-CoA acetyltransferase activity" RELATED [EC:2.3.1.155]
 synonym: "myristoyl-CoA C-acetyltransferase activity" RELATED [EC:2.3.1.155]
@@ -343436,10 +343580,12 @@
 xref: EC:2.3.1.155
 xref: MetaCyc:2.3.1.155-RXN
 xref: RHEA:18161
+is_a: GO:0003988 ! acetyl-CoA C-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.155
 property_value: skos:exactMatch RHEA:18161
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 
 [Term]
 id: GO:0050634
@@ -350108,7 +350254,6 @@
 synonym: "protein-mitochondrion membrane insertion" EXACT []
 is_a: GO:0007006 ! mitochondrial membrane organization
 is_a: GO:0051205 ! protein insertion into membrane
-is_a: GO:0051649 ! establishment of localization in cell
 is_a: GO:0072594 ! establishment of protein localization to organelle
 relationship: part_of GO:0070585 ! protein localization to mitochondrion
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15800" xsd:anyURI
@@ -358521,7 +358666,7 @@
 id: GO:0051920
 name: peroxiredoxin activity
 namespace: molecular_function
-def: "Catalysis of the reaction: [protein]-dithol + ROOH = [protein]-disulfide + H2O + ROH." [RHEA:10008]
+def: "Catalysis of the reaction: [protein]-dithiol + ROOH = [protein]-disulfide + H2O + ROH." [RHEA:10008]
 comment: Includes redox chemistry as part of the catalytic reaction (2 R'-SH = R'-S-S-R'), where R' refers to peroxiredoxin itself).
 synonym: "PRDX activity" EXACT []
 synonym: "Prx activity" EXACT []
@@ -358529,16 +358674,13 @@
 xref: Reactome:R-HSA-1222755 "Peroxynitrite is reduced to nitrite by Tpx"
 xref: Reactome:R-HSA-1500804 "Peroxynitrite is reduced by AhpE"
 xref: RHEA:10008
-xref: RHEA:62624
-xref: RHEA:62640
 is_a: GO:0004601 ! peroxidase activity
 property_value: skos:exactMatch RHEA:10008
-property_value: skos:narrowMatch RHEA:62624
-property_value: skos:narrowMatch RHEA:62640
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22598" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23121" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31239" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32405" xsd:anyURI
 
 [Term]
 id: GO:0051921
@@ -369027,10 +369169,11 @@
 xref: KEGG_REACTION:R07041
 xref: MetaCyc:RXN-19677
 xref: RHEA:39755
-is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
+is_a: GO:0102033 ! long-chain fatty acid omega-hydroxylase activity
 property_value: skos:exactMatch RHEA:39755
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28648" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 created_by: ai
 creation_date: 2012-01-30T03:05:27Z
 
@@ -383918,22 +384061,25 @@
 
 [Term]
 id: GO:0061160
-name: regulation of establishment of bipolar cell polarity regulating cell shape
+name: obsolete regulation of establishment of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that modulates the rate, frequency or extent of the establishment of bipolar cell polarity that contributes to the shape of a cell." [GOC:dph, GOC:vw]
-is_a: GO:0061172 ! regulation of establishment of bipolar cell polarity
-is_a: GO:2000100 ! regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that modulates the rate, frequency or extent of the establishment of bipolar cell polarity that contributes to the shape of a cell." [GOC:dph, GOC:vw]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-06-23T09:21:36Z
 
 [Term]
 id: GO:0061161
-name: positive regulation of establishment of bipolar cell polarity regulating cell shape
+name: obsolete positive regulation of establishment of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that increases the rate, frequency or extent of the establishment of bipolar cell polarity that regulates the shape of a cell." [GOC:dph, GOC:vw]
-is_a: GO:0061160 ! regulation of establishment of bipolar cell polarity regulating cell shape
-is_a: GO:0061173 ! positive regulation of establishment of bipolar cell polarity
-is_a: GO:2000247 ! positive regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that increases the rate, frequency or extent of the establishment of bipolar cell polarity that regulates the shape of a cell." [GOC:dph, GOC:vw]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-06-23T09:26:45Z
 
@@ -384867,11 +385013,13 @@
 
 [Term]
 id: GO:0061246
-name: establishment or maintenance of bipolar cell polarity regulating cell shape
+name: obsolete establishment or maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any cellular process that results in the specification, formation or maintenance of a bipolar intracellular organization or cell growth patterns that regulates the shaping of a cell." [GOC:dph, GOC:vw]
-is_a: GO:0061245 ! establishment or maintenance of bipolar cell polarity
-is_a: GO:0071963 ! establishment or maintenance of cell polarity regulating cell shape
+def: "OBSOLETE. Any cellular process that results in the specification, formation or maintenance of a bipolar intracellular organization or cell growth patterns that regulates the shaping of a cell." [GOC:dph, GOC:vw]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-08-23T09:46:01Z
 
@@ -385528,10 +385676,13 @@
 
 [Term]
 id: GO:0061305
-name: maintenance of bipolar cell polarity regulating cell shape
+name: obsolete maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "The maintenance of established bipolar anisotropic intracellular organization or cell growth patterns that results in the shaping of a cell." [GOC:dph, GOC:vw]
-is_a: GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. The maintenance of established bipolar anisotropic intracellular organization or cell growth patterns that results in the shaping of a cell." [GOC:dph, GOC:vw]
+comment: The reason for obsoletion is that these terms were added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-09-16T09:25:18Z
 
@@ -386203,23 +386354,25 @@
 
 [Term]
 id: GO:0061361
-name: positive regulation of maintenance of bipolar cell polarity regulating cell shape
+name: obsolete positive regulation of maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that increases the frequency, rate or extent of maintenance of bipolar cell polarity regulating cell shape." [GOC:dph]
-is_a: GO:2000115 ! regulation of maintenance of bipolar cell polarity regulating cell shape
-is_a: GO:2000247 ! positive regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
-relationship: positively_regulates GO:0061305 ! maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that increases the frequency, rate or extent of maintenance of bipolar cell polarity regulating cell shape." [GOC:dph]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-10-13T09:00:59Z
 
 [Term]
 id: GO:0061362
-name: negative regulation of maintenance of bipolar cell polarity regulating cell shape
+name: obsolete negative regulation of maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that decreases the frequency, rate or extent of maintenance of bipolar cell polarity regulating cell shape." [GOC:dph]
-is_a: GO:2000115 ! regulation of maintenance of bipolar cell polarity regulating cell shape
-is_a: GO:2000750 ! negative regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
-relationship: negatively_regulates GO:0061305 ! maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that decreases the frequency, rate or extent of maintenance of bipolar cell polarity regulating cell shape." [GOC:dph]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-10-13T09:03:42Z
 
@@ -386482,9 +386635,10 @@
 id: GO:0061387
 name: regulation of extent of cell growth
 namespace: biological_process
-def: "Any process that modulates the extent of cell growth." [GOC:mah, GOC:vw]
+def: "Any process that modulates how much additional mass a cell adds during cell growth before growth ceases." [GOC:mah, GOC:vw]
 is_a: GO:0001558 ! regulation of cell growth
 relationship: part_of GO:0008361 ! regulation of cell size
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 created_by: dph
 creation_date: 2011-07-14T10:15:42Z
 
@@ -386492,8 +386646,9 @@
 id: GO:0061388
 name: regulation of rate of cell growth
 namespace: biological_process
-def: "Any process that modulates the rate of cell growth." [GOC:mah, GOC:vw]
+def: "Any process that modulates how fast a cell adds additional mass during cell growth." [GOC:mah, GOC:vw]
 is_a: GO:0001558 ! regulation of cell growth
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 created_by: dph
 creation_date: 2011-07-14T10:18:06Z
 
@@ -386501,9 +386656,10 @@
 id: GO:0061389
 name: regulation of direction of cell growth
 namespace: biological_process
-def: "Any process that modulates the direction of cell growth." [GOC:mah, GOC:vw]
+def: "Any process that modulates where in a cell additional mass is added during cell growth." [GOC:mah, GOC:vw]
 is_a: GO:0001558 ! regulation of cell growth
 is_a: GO:0008360 ! regulation of cell shape
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19737" xsd:anyURI
 created_by: dph
 creation_date: 2011-07-14T10:19:46Z
 
@@ -390717,13 +390873,14 @@
 
 [Term]
 id: GO:0061753
-name: substrate localization to autophagosome
+name: obsolete substrate localization to autophagosome
 namespace: biological_process
-def: "The localization process by which an autophagic substrate is delivered to a forming autophagosome." [GOC:dph, GOC:pad, GOC:PARL, PMID:23545414]
+def: "OBSOLETE. The localization process by which an autophagic substrate is delivered to a forming autophagosome." [GOC:dph, GOC:pad, GOC:PARL, PMID:23545414]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term: localization terms that are not transport terms are largely uninformative about biological process. The intended biology in every observed use is better captured by a specific selective-autophagy term (e.g. mitophagy, glycophagy, reticulophagy). See the annotation review at https://github.com/geneontology/go-annotation/issues/6497 for per-annotation transfer recommendations.
 synonym: "substrate sequestration to autophagosome" EXACT []
 synonym: "substrate sequestration to phagophore" EXACT []
-is_a: GO:0051649 ! establishment of localization in cell
-relationship: part_of GO:0000045 ! autophagosome assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32304" xsd:anyURI
+is_obsolete: true
 created_by: dph
 creation_date: 2015-11-20T11:14:22Z
 
@@ -391218,13 +391375,13 @@
 
 [Term]
 id: GO:0061796
-name: membrane addition at site of mitotic cytokinesis
+name: obsolete membrane addition at site of mitotic cytokinesis
 namespace: biological_process
-def: "A mitotic cell cycle process involved in the net addition of membrane at the site of cytokinesis; includes vesicle recruitment and fusion, local lipid synthesis and insertion." [GOC:dph, GOC:vw]
-is_a: GO:0007107 ! membrane addition at site of cytokinesis
-is_a: GO:1902410 ! mitotic cytokinetic process
-intersection_of: GO:0007107 ! membrane addition at site of cytokinesis
-intersection_of: part_of GO:0000278 ! mitotic cell cycle
+def: "OBSOLETE. A mitotic cell cycle process involved in the net addition of membrane at the site of cytokinesis; includes vesicle recruitment and fusion, local lipid synthesis and insertion." [GOC:dph, GOC:vw]
+comment: The reason for obsoletion is that this term is pre-composed and should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31687" xsd:anyURI
+is_obsolete: true
+consider: GO:0006887
 created_by: dph
 creation_date: 2016-10-05T12:06:11Z
 
@@ -391393,14 +391550,14 @@
 xref: Reactome:R-HSA-8938076 "CD38 hydrolyses NAD+ to NAM and ADP-ribose"
 xref: Reactome:R-HSA-9637699 "CpnT hydrolyses NAD+"
 xref: RHEA:38611
-xref: RHEA:38615
 is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
+relationship: has_part GO:0061812 ! cyclic ADP-ribose hydrolase activity
 property_value: skos:broadMatch RHEA:16301
 property_value: skos:exactMatch EC:3.2.2.6
 property_value: skos:narrowMatch RHEA:38611
-property_value: skos:narrowMatch RHEA:38615
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26011" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32457" xsd:anyURI
 created_by: dph
 creation_date: 2016-11-11T13:14:13Z
 
@@ -391430,13 +391587,16 @@
 
 [Term]
 id: GO:0061812
-name: obsolete cyclic ADP-ribose hydrolase
+name: cyclic ADP-ribose hydrolase activity
 namespace: molecular_function
-def: "OBSOLETE. Catalysis of the reaction: cyclic ADP-ribose + H20 = ADP-ribose (ADPR)." [GOC:dph, GOC:pad, GOC:PARL, PMID:11866528]
-comment: This term was obsoleted because it represents a step in a multi-step reaction.
+def: "Catalysis of the reaction: cyclic ADP-beta-D-ribose + H2O = ADP-D-ribose." [PMID:42243876, RHEA:38615]
+comment: Note that this term was reinstated from obsolete.
+synonym: "cADPR hydrolase activity" EXACT []
+xref: RHEA:38615
+is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
+property_value: skos:exactMatch RHEA:38615
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26011" xsd:anyURI
-is_obsolete: true
-replaced_by: GO:0061809
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32457" xsd:anyURI
 created_by: dph
 creation_date: 2016-11-11T13:32:43Z
 
@@ -391860,11 +392020,13 @@
 id: GO:0061857
 name: endoplasmic reticulum stress-induced pre-emptive quality control
 namespace: biological_process
-def: "The response to endoplasimic reticulum stress in which nascent proteins are degraded by attenuation of their translocation into the ER followed by rerouting to the cytosol without cleavage of the signal peptide, and subsequent degradation by the proteasome." [PMID:17129784, PMID:26565908]
+def: "The response to endoplasmic reticulum stress in which nascent proteins are degraded by attenuation of their translocation into the ER followed by rerouting to the cytosol without cleavage of the signal peptide, and subsequent degradation by the proteasome." [PMID:17129784, PMID:26565908]
 synonym: "ER pQC" EXACT []
-synonym: "ER stress-indiced pre-emptive quality control" EXACT []
+synonym: "ER stress-induced pre-emptive quality control" EXACT []
 is_a: GO:0034976 ! response to endoplasmic reticulum stress
+is_a: GO:0170080 ! endoplasmic reticulum protein quality control
 relationship: has_part GO:0043161 ! proteasome-mediated ubiquitin-dependent protein catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20914" xsd:anyURI
 created_by: dph
 creation_date: 2017-03-28T13:05:03Z
 
@@ -393958,7 +394120,8 @@
 namespace: cellular_component
 def: "A protein complex essential for autophagy during nutrient deprivation, a catabolic process that sequesters undesired cellular material into autophagosomes for delivery to lysosomes for degradation. Contributes to nutrition homeostasis and damage control in eukaryotic cells. Functions at a late step of autophagosome formation for efficient completion of sequestration, probably through facilitating recruitment of ATG8-phosphatidylethanolamine (PE) to the preautophagosomal structure (PAS) and/or its protection from deconjugation by ATG4. Composed of ATG2 and ATG18 in Saccharomyces cerevisiae." [GOC:bhm, PMID:23230146]
 is_a: GO:0098796 ! membrane protein complex
-relationship: part_of GO:0034045 ! phagophore assembly site membrane
+relationship: part_of GO:7770114 ! phagophore membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29437" xsd:anyURI
 created_by: dph
 creation_date: 2018-10-12T13:47:25Z
 
@@ -395986,10 +396149,12 @@
 name: intracellular organelle lumen
 namespace: cellular_component
 def: "An organelle lumen that is part of an intracellular organelle." [GOC:mah]
+subset: gocheck_do_not_annotate
 is_a: GO:0043233 ! organelle lumen
 intersection_of: GO:0031974 ! membrane-enclosed lumen
 intersection_of: part_of GO:0043229 ! intracellular organelle
 relationship: part_of GO:0043229 ! intracellular organelle
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 
 [Term]
 id: GO:0070014
@@ -399284,7 +399449,7 @@
 name: inward rectifier potassium channel inhibitor activity
 namespace: molecular_function
 def: "Binds to and stops, prevents, or reduces the activity of an inwardly rectifying potassium channel." [GOC:mah]
-is_a: GO:0019870 ! potassium channel inhibitor activity
+is_a: GO:7770090 ! voltage-gated potassium channel inhibitor activity
 relationship: negatively_regulates GO:0005242 ! inward rectifier potassium channel activity
 
 [Term]
@@ -414502,7 +414667,7 @@
 synonym: "nucleus-associated proteasomal ubiquitin-dependent protein catabolism" EXACT [GOC:mah]
 synonym: "nucleus-associated proteasomal ubiquitin-dependent protein degradation" EXACT [GOC:mah]
 synonym: "ubiquitin-dependent catabolism of misfolded proteins by nucleus-associated proteasome" EXACT []
-is_a: GO:0006515 ! protein quality control for misfolded or incompletely synthesized proteins
+is_a: GO:0006515 ! protein quality control
 is_a: GO:0043161 ! proteasome-mediated ubiquitin-dependent protein catabolic process
 relationship: part_of GO:0071218 ! cellular response to misfolded protein
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26433" xsd:anyURI
@@ -424177,7 +424342,7 @@
 synonym: "purine-containing compound breakdown" EXACT [GOC:mah]
 synonym: "purine-containing compound catabolism" EXACT [GOC:mah]
 synonym: "purine-containing compound degradation" EXACT [GOC:mah]
-is_a: GO:0009056 ! catabolic process
+is_a: GO:0034656 ! nucleobase-containing small molecule catabolic process
 is_a: GO:0072521 ! purine-containing compound metabolic process
 created_by: mah
 creation_date: 2011-01-04T03:17:20Z
@@ -438839,7 +439004,8 @@
 def: "A process that is carried out at the cellular level which results in the arrangement of constituent parts of a phagosome within a cell. Phagosome maturation begins with endocytosis and formation of the early phagosome and ends with the formation of the hybrid organelle, the phagolysosome." [GOC:kmv, GOC:tb]
 is_a: GO:0006996 ! organelle organization
 relationship: has_part GO:0001845 ! phagolysosome assembly
-relationship: has_part GO:0006887 ! exocytosis
+relationship: has_part GO:0006897 ! endocytosis
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32152" xsd:anyURI
 created_by: tb
 creation_date: 2010-10-19T11:10:34Z
 
@@ -439115,8 +439281,10 @@
 name: organophosphate biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the biosynthesis of deoxyribose phosphate, the phosphorylated sugar 2-deoxy-erythro-pentose." [GOC:chem_mtg]
+subset: gocheck_do_not_annotate
 is_a: GO:0009058 ! biosynthetic process
 is_a: GO:0019637 ! organophosphate metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32294" xsd:anyURI
 created_by: tb
 creation_date: 2011-02-26T02:22:41Z
 
@@ -440700,7 +440868,8 @@
 def: "Catalysis of the PEP-dependent, phosphoryl transfer-driven transport of substances across a membrane. The transport happens by catalysis of the reaction: protein S-phosphocysteine + sugar(out) = protein cysteine + sugar phosphate(in). This differs from primary and secondary active transport in that the solute is modified during transport." [GOC:am]
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
-is_a: GO:0022804 ! active transmembrane transporter activity
+is_a: GO:7770111 ! group translocator activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27496" xsd:anyURI
 created_by: tb
 creation_date: 2014-04-08T14:58:00Z
 
@@ -449391,19 +449560,21 @@
 
 [Term]
 id: GO:0097620
-name: (R)-mandelate dehydrogenase activity
+name: (R)-mandelate dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: (R)-mandelate + NAD+ = phenylglyoxylate + NADH + H+." [PMID:1731758, RHEA:43112]
 comment: In the yeast Rhodotorula graminis, (R)-mandelate dehydrogenase is the first enzyme of the mandelate pathway, and catalyzes the NAD-dependent oxidation of (R)-mandelate to phenylglyoxylate.
-synonym: "D-mandelate dehydrogenase activity" EXACT []
+synonym: "(R)-mandelate dehydrogenase activity" BROAD []
+synonym: "D-mandelate dehydrogenase activity" BROAD []
 xref: EC:1.1.1.379
 xref: MetaCyc:RXN-15840
 xref: RHEA:43112
-is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+is_a: GO:0140175 ! (2R)-2-hydroxyacid dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.1.1.379
 property_value: skos:exactMatch MetaCyc:RXN-15840
 property_value: skos:exactMatch RHEA:43112
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30910" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 created_by: pr
 creation_date: 2014-07-30T09:53:23Z
 
@@ -449538,16 +449709,18 @@
 
 [Term]
 id: GO:0097632
-name: extrinsic component of phagophore assembly site membrane
+name: extrinsic component of phagophore membrane
 namespace: cellular_component
-def: "The component of the phagophore assembly site membrane consisting of gene products and protein complexes that are loosely bound to one of its surfaces, but not integrated into the hydrophobic region." [GOC:mf]
-synonym: "extrinsic component of pre-autophagosomal structure membrane" NARROW []
-synonym: "extrinsic to phagophore assembly site membrane" EXACT []
+def: "The component of a phagophore membrane consisting of gene products and protein complexes that are loosely bound to one of its surfaces, but not integrated into the hydrophobic region." [GOC:mf]
+synonym: "extrinsic component of phagophore assembly site membrane" RELATED []
+synonym: "extrinsic component of pre-autophagosomal structure membrane" RELATED []
+synonym: "extrinsic to phagophore assembly site membrane" RELATED []
 synonym: "phagophore assembly site peripheral membrane" RELATED []
-is_a: GO:0031312 ! extrinsic component of organelle membrane
+is_a: GO:0019898 ! extrinsic component of membrane
 intersection_of: GO:0019898 ! extrinsic component of membrane
-intersection_of: part_of GO:0034045 ! phagophore assembly site membrane
-relationship: part_of GO:0034045 ! phagophore assembly site membrane
+intersection_of: part_of GO:7770114 ! phagophore membrane
+relationship: part_of GO:7770114 ! phagophore membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29437" xsd:anyURI
 
 [Term]
 id: GO:0097633
@@ -452278,7 +452451,6 @@
 xref: Reactome:R-HSA-5690046 "PPT2 hydrolyses PALMCoA to PALM"
 xref: Reactome:R-HSA-9027670 "ESTG binding induces ESR depalmitoylation"
 is_a: GO:0016787 ! hydrolase activity
-relationship: part_of GO:0098734 ! macromolecule depalmitoylation
 created_by: dos
 creation_date: 2014-04-11T17:57:36Z
 
@@ -453703,10 +453875,14 @@
 
 [Term]
 id: GO:0098734
-name: macromolecule depalmitoylation
+name: obsolete macromolecule depalmitoylation
 namespace: biological_process
-def: "The removal of palymitoyl groups from a macromolecule." [GOC:dos]
-is_a: GO:0098732 ! macromolecule deacylation
+def: "OBSOLETE. The removal of palymitoyl groups from a macromolecule." [GOC:dos]
+comment: The reason for obsoletion is that this term represents a molecular function, not a biological process. Consider instead annotating to the molecular function 'palmitoyl hydrolase activity' (GO:0098599), or, for protein substrates, 'palmitoyl-(protein) hydrolase activity' (GO:0008474).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32290" xsd:anyURI
+is_obsolete: true
+consider: GO:0008474
+consider: GO:0098599
 
 [Term]
 id: GO:0098735
@@ -461066,10 +461242,11 @@
 xref: MetaCyc:R4-RXN
 xref: Reactome:R-HSA-1222526 "AhpC reduces peroxidated lipids"
 xref: RHEA:62628
-is_a: GO:0051920 ! peroxiredoxin activity
+is_a: GO:0004601 ! peroxidase activity
 property_value: skos:exactMatch EC:1.11.1.26
 property_value: skos:exactMatch RHEA:62628
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32372" xsd:anyURI
 
 [Term]
 id: GO:0102040
@@ -470428,7 +470605,6 @@
 xref: RHEA:25367
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.295
-property_value: skos:exactMatch RHEA:25363
 property_value: skos:narrowMatch RHEA:25363
 property_value: skos:narrowMatch RHEA:25367
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19648" xsd:anyURI
@@ -475811,6 +475987,7 @@
 synonym: "U2 snRNA adenosine m6 methyltransferase activity" EXACT []
 synonym: "U2 snRNA adenosine N6 methyltransferase activity" EXACT []
 is_a: GO:0106346 ! snRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27392" xsd:anyURI
 created_by: hjd
 creation_date: 2020-12-18T15:12:57Z
@@ -479500,6 +479677,7 @@
 xref: MetaCyc:RXN-18779
 xref: RHEA:52808
 is_a: GO:0106346 ! snRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.346
 property_value: skos:exactMatch RHEA:52808
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/13569" xsd:anyURI
@@ -486709,8 +486887,10 @@
 def: "Catalysis of the reaction: (R)-lactate + FAD + H+ = FADH2 + pyruvate." [RHEA:82479]
 xref: RHEA:82479
 is_a: GO:0047809 ! D-lactate dehydrogenase activity
+is_a: GO:0140174 ! (2R)-2-hydroxycarboxylate dehydrogenase (FAD) activity
 property_value: skos:exactMatch RHEA:82479
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30132" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32501" xsd:anyURI
 created_by: pg
 creation_date: 2025-04-17T08:20:22Z
 
@@ -486753,9 +486933,10 @@
 
 [Term]
 id: GO:0140174
-name: (2R)-2-hydroxycarboxylate dehydrogenase activity
+name: (2R)-2-hydroxycarboxylate dehydrogenase (FAD) activity
 namespace: molecular_function
 def: "Catalysis of the activity: a (2R)-2-hydroxycarboxylate + FAD + H+ = a 2-oxocarboxylate + FADH2." [PMID:37863926, RHEA:82511]
+synonym: "(2R)-2-hydroxycarboxylate dehydrogenase activity" BROAD []
 xref: RHEA:82483
 xref: RHEA:82487
 xref: RHEA:82491
@@ -489129,12 +489310,13 @@
 
 [Term]
 id: GO:0140357
-name: heme export from vacuole to cytoplasm
+name: heme export from vacuole to cytosol
 namespace: biological_process
 def: "The directed movement of heme from inside the vacuole across the vacuolar membrane and into the cytosol." [PMID:28193844]
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0035351 ! heme transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17407" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32419" xsd:anyURI
 created_by: pg
 creation_date: 2019-05-28T07:40:48Z
 
@@ -490404,9 +490586,10 @@
 id: GO:0140455
 name: cytoplasm protein quality control
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of misfolded proteins in the cytoplasm, which are either targeted to cytoplasmic proteasomes for degradation or protected by chaperones to shield thermosensitive proteins from degradation until conditions allow disaggregation and refolding." [PMID:32075773]
-is_a: GO:0006515 ! protein quality control for misfolded or incompletely synthesized proteins
+def: "The chemical reactions and pathways resulting in the breakdown or refolding of misfolded proteins in the cytoplasm, which are either targeted to cytoplasmic proteasomes for degradation or protected by chaperones to shield thermosensitive proteins from degradation until conditions allow disaggregation and refolding." [PMID:32075773]
+is_a: GO:0006515 ! protein quality control
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19172" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32442" xsd:anyURI
 created_by: pg
 creation_date: 2020-04-20T15:46:20Z
 
@@ -490818,13 +491001,15 @@
 
 [Term]
 id: GO:0140493
-name: very long-chain fatty acid beta-oxidation
+name: obsolete very long-chain fatty acid beta-oxidation
 namespace: biological_process
-def: "A fatty acid beta-oxidation pathway acting on a very long-chain fatty acid. A very long-chain fatty acid has an aliphatic tail containing more than 22 carbons. The partway stars with the conversion of an acyl-CoA to a trans-2-enoyl-CoA, catalyzed by acyl-CoA oxidase; the electrons removed by oxidation pass directly to oxygen and produce hydrogen peroxide, which is cleaved by peroxisomal catalases. Fatty acid beta-oxidation begins with the addition of coenzyme A to a fatty acid, and ends when only two or three carbons remain (as acetyl-CoA or propionyl-CoA respectively)." [GOC:ha, PMID:17028011, PMID:32169171]
-comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
-is_a: GO:0042760 ! very long-chain fatty acid catabolic process
+def: "OBSOLETE. A fatty acid beta-oxidation pathway acting on a very long-chain fatty acid. A very long-chain fatty acid has an aliphatic tail containing more than 22 carbons. The partway stars with the conversion of an acyl-CoA to a trans-2-enoyl-CoA, catalyzed by acyl-CoA oxidase; the electrons removed by oxidation pass directly to oxygen and produce hydrogen peroxide, which is cleaved by peroxisomal catalases. Fatty acid beta-oxidation begins with the addition of coenzyme A to a fatty acid, and ends when only two or three carbons remain (as acetyl-CoA or propionyl-CoA respectively)." [GOC:ha, PMID:17028011, PMID:32169171]
+comment: This term was obsoleted because it represents the same process as very long-chain fatty acid catabolic process ; GO:0042760.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19735" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0042760
 created_by: pg
 creation_date: 2020-07-10T08:39:22Z
 
@@ -492215,7 +492400,7 @@
 name: outward rectifier potassium channel inhibitor activity
 namespace: molecular_function
 def: "Binds to and stops, prevents, or reduces the activity of an outwardly rectifying potassium channel." [PMID:28108814]
-is_a: GO:0019870 ! potassium channel inhibitor activity
+is_a: GO:7770090 ! voltage-gated potassium channel inhibitor activity
 relationship: negatively_regulates GO:0015271 ! outward rectifier potassium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21157" xsd:anyURI
 created_by: pg
@@ -493975,17 +494160,19 @@
 id: GO:0140762
 name: glucose dehydrogenase (FAD, quinone) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a quinone + D-glucose = a quinol + D-glucono-1,5-lactone." [RHEA:47372]
+def: "Catalysis of the reaction: D-glucose + a quinone = D-glucono-1,5-lactone + a quinol, using FAD as a cofactor." [EC:1.1.5.9]
+synonym: "FAD-dependent glucose dehydrogenase activity" EXACT [EC:1.1.5.9]
 xref: EC:1.1.5.9
-xref: MetaCyc:GLUCOSE-DEHYDROGENASE-ACCEPTOR-RXN
-xref: RHEA:47372
 is_a: GO:0004344 ! glucose dehydrogenase activity
 is_a: GO:0016901 ! oxidoreductase activity, acting on the CH-OH group of donors, quinone or similar compound as acceptor
+property_value: skos:broadMatch KEGG_REACTION:R00305
+property_value: skos:broadMatch MetaCyc:GLUCOSE-DEHYDROGENASE-ACCEPTOR-RXN
+property_value: skos:broadMatch RHEA:47372
 property_value: skos:exactMatch EC:1.1.5.9
-property_value: skos:exactMatch RHEA:47372
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22585" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25441" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32504" xsd:anyURI
 created_by: pg
 creation_date: 2022-02-04T08:02:40Z
 
@@ -494862,17 +495049,26 @@
 name: thioredoxin-dependent peroxiredoxin activity
 namespace: molecular_function
 def: "Catalysis of the reaction: [thioredoxin]-dithiol + a hydroperoxide = [thioredoxin]-disulfide + an alcohol + H2O." [PMID:12707274, PMID:19820102, RHEA:62620]
+synonym: "thiol peroxidase activity" RELATED []
+synonym: "thioredoxin peroxidase activity" EXACT []
+synonym: "TPx activity" EXACT []
+synonym: "TrxPx activity" EXACT []
 xref: EC:1.11.1.24
+xref: MetaCyc:RXN0-267
 xref: RHEA:62620
+xref: RHEA:63528
 xref: RHEA:63840
 xref: RHEA:63844
 is_a: GO:0051920 ! peroxiredoxin activity
 property_value: skos:exactMatch EC:1.11.1.24
 property_value: skos:exactMatch RHEA:62620
+property_value: skos:narrowMatch MetaCyc:RXN0-267
+property_value: skos:narrowMatch RHEA:63528
 property_value: skos:narrowMatch RHEA:63840
 property_value: skos:narrowMatch RHEA:63844
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23121" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32388" xsd:anyURI
 created_by: pg
 creation_date: 2022-05-18T14:25:09Z
 
@@ -499342,7 +499538,8 @@
 name: mitochondrial protein quality control
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of misfolded proteins in the mitochondrion, which are targeted for degradation." [PMID:38280230]
-is_a: GO:0006515 ! protein quality control for misfolded or incompletely synthesized proteins
+is_a: GO:0006515 ! protein quality control
+is_a: GO:0030163 ! protein catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27044" xsd:anyURI
 created_by: pg
 creation_date: 2024-02-14T07:11:38Z
@@ -504537,7 +504734,7 @@
 synonym: "autophagy adaptor activity" EXACT []
 synonym: "selective autophagy receptor activity" EXACT []
 is_a: GO:0030674 ! protein-macromolecule adaptor activity
-relationship: part_of GO:0061753 ! substrate localization to autophagosome
+relationship: part_of GO:0016236 ! macroautophagy
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28283" xsd:anyURI
 created_by: rynl
 creation_date: 2025-02-10T16:57:01Z
@@ -506163,6 +506360,7 @@
 def: "A quality control pathway that degrades peroxisomal matrix protein receptors when the recycling machinery is blocked. When recycling to the cytosol fails, cargo-free receptors accumulate at the peroxisomal membrane, where they are polyubiquitinated and subsequently degraded by the ubiquitin-proteasome system (UPS)." [PMID:16390998, PMID:17011644, PMID:41076631]
 synonym: "Receptor Accumulation and Degradation in the Absence of Recycling" EXACT []
 is_a: GO:0043161 ! proteasome-mediated ubiquitin-dependent protein catabolic process
+is_a: GO:0170079 ! peroxisomal protein quality control
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31570" xsd:anyURI
 created_by: ew
 creation_date: 2026-02-17T22:02:27Z
@@ -506186,6 +506384,81 @@
 creation_date: 2026-03-23T21:12:37Z
 
 [Term]
+id: GO:0170076
+name: gap endonuclease activity
+namespace: molecular_function
+def: "Specific recognition and catalysis of the internal cleavage of the phosphodiester backbone within single-stranded DNA gaps or looped DNA structures at the junctions of single-stranded and double-stranded DNA. Primarily involved in the resolution of triplet repeat sequences, removal of aberrant secondary structures formed during the maturation of Okazaki fragments, telomeric R-loop resolution and the processing of stalled replication forks, that all involve cleavage at internal or branched DNA structures." [PMID:10330154, PMID:15592449]
+synonym: "Gap specific endonuclease activity" EXACT []
+synonym: "GEN activity" EXACT []
+is_a: GO:0004520 ! DNA endonuclease activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32367" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-10T17:51:18Z
+
+[Term]
+id: GO:0170077
+name: negative regulation of coenzyme A biosynthetic process
+namespace: biological_process
+def: "Any process that stops, prevents, or reduces the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of coenzyme A." [PMID:42000723]
+is_a: GO:0080020 ! regulation of coenzyme A biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32390" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-10T18:46:59Z
+
+[Term]
+id: GO:0170078
+name: Sca1 Ras guanyl-nucleotide exchange factor complex
+namespace: cellular_component
+def: "A protein complex found in Dictyostelium, containing the scaffold protein Sca1, the Ras guanine nucleotide exchange factors Aimless (RasGEFA) and RasGEFH, and PP2A components, which promotes RasC activation during chemotaxis." [PMID:20493808]
+synonym: "Sca1 RasGEF complex" BROAD []
+synonym: "Sca1 signaling complex" BROAD []
+synonym: "Sca1-Aimless signaling complex" BROAD []
+synonym: "Sca1-associated Ras guanyl-nucleotide exchange factor complex" BROAD []
+is_a: GO:1905742 ! Ras guanyl-nucleotide exchange factor complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32432" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-11T17:42:26Z
+
+[Term]
+id: GO:0170079
+name: peroxisomal protein quality control
+namespace: biological_process
+def: "The chemical reactions and pathways resulting in the breakdown of dysfunctional peroxisomal proteins, independent of pexophagy." [PMID:19538506, PMID:25305535, PMID:37552037]
+is_a: GO:0006515 ! protein quality control
+is_a: GO:0030163 ! protein catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32442" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-12T16:13:58Z
+
+[Term]
+id: GO:0170080
+name: endoplasmic reticulum protein quality control
+namespace: biological_process
+def: "Any process that monitors and mediates the fidelity of protein folding in the endoplasmic reticulum, or prevents misfolded proteins from accumulating in or transiting the endoplasmic reticulum. Processes result in the export of correctly folded proteins to the Golgi apparatus while retaining, refolding, or targeting terminally misfolded proteins for degradation." [PMID:12612637, PMID:17129784]
+synonym: "ERQC" RELATED []
+is_a: GO:0006515 ! protein quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32495" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-20T16:01:05Z
+
+[Term]
+id: GO:0170081
+name: ribosome-associated chaperone complex
+namespace: cellular_component
+def: "A conserved heterodimeric co-chaperone complex, composed of a J-domain (Hsp40-family) protein and an atypical Hsp70-family protein, that associates with the ribosome and acts on nascent polypeptide chains as they emerge from the exit tunnel to enable their co-translational folding. In Saccharomyces cerevisiae, the complex consists of the J-domain protein Zuo1 (Hsp40) and the non-canonical Hsp70 homolog Ssz1. The mammalian ortholog comprises ZRF1/MPP11 (Hsp40) and HSPA14/HSP70L1 (Hsp70)." [PMID:11274393, PMID:16002468]
+comment: Note that this term does not cover the nascent polypeptide-associated complex (GO:0005854), a distinct ribosome-associated heterodimer that acts in nascent chain sorting rather than folding.
+synonym: "MPP11/Hsp70L1 complex" NARROW []
+synonym: "RAC" RELATED []
+synonym: "ribosome-associated complex" RELATED []
+synonym: "Zuo1/Ssz1 complex" NARROW []
+synonym: "zuotin complex" NARROW []
+is_a: GO:0101031 ! protein folding chaperone complex
+relationship: part_of GO:0005829 ! cytosol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32185" xsd:anyURI
+created_by: ew
+creation_date: 2026-08-20T20:04:20Z
+
+[Term]
 id: GO:0180000
 name: histone methyltransferase inhibitor activity
 namespace: molecular_function
@@ -506568,12 +506841,16 @@
 id: GO:0180031
 name: snoRNA 2,2,7-trimethylguanosine (TMG) capping
 namespace: biological_process
-def: "The sequence of enzymatic reactions by which a 2,2,7-trimethylguanosine cap structure is added to the 5' end of an snoRNA. The snoRNA capping includes the formation of 7-methyl-G caps found on all RNA polymerase II transcripts, followed by hypermethylation at the 2' position of the guanosine residue to convert a mono-methylated cap to a 2,2,7-trimethylguanosine cap structure. Note that the pol III transcribed snoRNAs are also TMG capped." [GOC:vw, PMID:15590684]
+def: "The sequence of enzymatic reactions by which a 2,2,7-trimethylguanosine (TMG) cap structure is added to the 5' end of an snoRNA. The process begins with the formation of a 7-methylguanosine cap, as found on all RNA polymerase II transcripts, followed by dimethylation at the N2 position of the guanine base to convert the monomethylated cap to a 2,2,7-trimethylguanosine cap structure." [GOC:vw, PMID:11983179, PMID:15590684]
+comment: TMG capped snoRNAs are RNA polymerase II transcripts. Where a snoRNA is transcribed by RNA polymerase III it is not TMG capped: plant U3 snoRNA, which is Pol III transcribed, carries a gamma-monomethyl phosphate cap, whereas the same snoRNA is TMG capped in the animals and fungi where it is Pol II transcribed (PMID:1618872).
 synonym: "snoRNA 2,2,7-trimethylguanosine (TMG) cap formation" EXACT []
 synonym: "snoRNA capping" EXACT []
 is_a: GO:0036260 ! RNA capping
 is_a: GO:0043144 ! sno(s)RNA processing
+relationship: has_part GO:0009452 ! 7-methylguanosine RNA capping
+relationship: has_part GO:0036261 ! 7-methylguanosine cap hypermethylation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26940" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27628" xsd:anyURI
 created_by: vw
 creation_date: 2024-02-07T13:55:54Z
 
@@ -550711,12 +550988,13 @@
 
 [Term]
 id: GO:1902334
-name: fructose export from vacuole to cytoplasm
+name: fructose export from vacuole to cytosol
 namespace: biological_process
 def: "The directed movement of fructose from vacuole to cytoplasm." [GOC:TermGenie, PMID:23583552]
 synonym: "fructose transport from vacuole to cytoplasm" EXACT []
 is_a: GO:0015755 ! fructose transmembrane transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32419" xsd:anyURI
 created_by: tb
 creation_date: 2013-07-26T22:18:12Z
 
@@ -555068,7 +555346,8 @@
 synonym: "66S preribosome formation" NARROW [GOC:TermGenie]
 synonym: "preribosome, large subunit precursor formation" EXACT [GOC:TermGenie]
 is_a: GO:0022618 ! protein-RNA complex assembly
-relationship: part_of GO:0000027 ! ribosomal large subunit assembly
+relationship: part_of GO:0180023 ! cytosolic large ribosomal subunit assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32473" xsd:anyURI
 created_by: tb
 creation_date: 2014-01-16T19:38:05Z
 
@@ -578736,7 +579015,7 @@
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of cristae formation." [GO_REF:0000058, GOC:pad, GOC:PARL, GOC:TermGenie, PMID:19279012]
 comment: AN example of this is PINK1 in human (Q9BXM7) in PMID:19279012 inferred from mutant phenotype
-is_a: GO:0010821 ! regulation of mitochondrion organization
+is_a: GO:0051128 ! regulation of cellular component organization
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0042407 ! cristae formation
 relationship: regulates GO:0042407 ! cristae formation
@@ -578753,7 +579032,7 @@
 synonym: "down-regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "downregulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "inhibition of cristae formation" NARROW [GOC:TermGenie]
-is_a: GO:0010639 ! negative regulation of organelle organization
+is_a: GO:0051129 ! negative regulation of cellular component organization
 is_a: GO:1903850 ! regulation of cristae formation
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0042407 ! cristae formation
@@ -578771,7 +579050,7 @@
 synonym: "up regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "up-regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of cristae formation" EXACT [GOC:TermGenie]
-is_a: GO:0010638 ! positive regulation of organelle organization
+is_a: GO:0051130 ! positive regulation of cellular component organization
 is_a: GO:1903850 ! regulation of cristae formation
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0042407 ! cristae formation
@@ -622662,6 +622941,8 @@
 synonym: "ribosome-associated ubiquitin-dependent protein catabolism" EXACT []
 synonym: "ribosome-associated ubiquitin-dependent protein degradation" EXACT []
 is_a: GO:0043161 ! proteasome-mediated ubiquitin-dependent protein catabolic process
+relationship: part_of GO:7770112 ! ribosome-associated quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26238" xsd:anyURI
 created_by: pr
 creation_date: 2013-06-05T11:46:01Z
 
@@ -624414,14 +624695,18 @@
 id: GO:1990273
 name: snRNA 2,2,7-trimethylguanosine (TMG) capping
 namespace: biological_process
-def: "The sequence of enzymatic reactions by which a 2,2,7-trimethylguanosine cap structure is added to the 5' end of an snRNA. The snRNA capping process includes the formation of 7-methyl-G caps found on all RNA polymerase II transcripts, followed by hypermethylation at the 2' position of the guanosine residue to convert a mono-methylated cap to a 2,2,7-trimethylguanosine cap structure. Note that the pol III transcribed U6 snRNA is also TMG capped." [GOC:vw, PMID:15590684]
+def: "The sequence of enzymatic reactions by which a 2,2,7-trimethylguanosine (TMG) cap structure is added to the 5' end of an snRNA. The process begins with the formation of a 7-methylguanosine cap, as found on all RNA polymerase II transcripts, followed by dimethylation at the N2 position of the guanine base to convert the monomethylated cap to a 2,2,7-trimethylguanosine cap structure." [GOC:vw, PMID:11142384, PMID:15590684]
+comment: TMG capped snRNAs are RNA polymerase II transcripts. The RNA polymerase III transcribed U6 snRNA is not TMG capped; it carries a gamma-monomethyl phosphate cap added by the Bin3/MePCE family of methylphosphate capping enzymes (PMID:2229067, PMID:37403782). TMG capping of a Pol III transcript has been reported only for engineered U6 variants in which disruption of the 5' stem-loop exposes the 5'-triphosphate to the normal methylguanosine capping machinery (PMID:11142384).
 synonym: "snRNA 2,2,7-trimethylguanosine (TMG) cap formation" EXACT []
 synonym: "snRNA 5'-end processing" BROAD []
 synonym: "snRNA capping" EXACT []
 is_a: GO:0016180 ! snRNA processing
 is_a: GO:0036260 ! RNA capping
+relationship: has_part GO:0009452 ! 7-methylguanosine RNA capping
+relationship: has_part GO:0036261 ! 7-methylguanosine cap hypermethylation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23084" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26940" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27628" xsd:anyURI
 created_by: al
 creation_date: 2014-01-15T15:32:06Z
 
@@ -633383,14 +633668,13 @@
 
 [Term]
 id: GO:2000100
-name: regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
+name: obsolete regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:obol]
-is_a: GO:2000099 ! regulation of establishment or maintenance of bipolar cell polarity
-is_a: GO:2000769 ! regulation of establishment or maintenance of cell polarity regulating cell shape
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
-relationship: regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:obol]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-09-14T04:44:57Z
 
@@ -633605,13 +633889,13 @@
 
 [Term]
 id: GO:2000115
-name: regulation of maintenance of bipolar cell polarity regulating cell shape
+name: obsolete regulation of maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of maintenance of bipolar cell polarity regulating in cell shape." [GOC:obol]
-is_a: GO:2000100 ! regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0061305 ! maintenance of bipolar cell polarity regulating cell shape
-relationship: regulates GO:0061305 ! maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of maintenance of bipolar cell polarity regulating in cell shape." [GOC:obol]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: dph
 creation_date: 2010-09-21T06:33:26Z
 
@@ -635480,14 +635764,13 @@
 
 [Term]
 id: GO:2000247
-name: positive regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
+name: obsolete positive regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:obol]
-is_a: GO:2000100 ! regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
-is_a: GO:2000771 ! positive regulation of establishment or maintenance of cell polarity regulating cell shape
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
-relationship: positively_regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:obol]
+comment: The reason for obsoletion is that these terms were added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: vw
 creation_date: 2010-11-11T11:39:34Z
 
@@ -642623,14 +642906,13 @@
 
 [Term]
 id: GO:2000750
-name: negative regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
+name: obsolete negative regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:mah]
-is_a: GO:2000100 ! regulation of establishment or maintenance of bipolar cell polarity regulating cell shape
-is_a: GO:2000770 ! negative regulation of establishment or maintenance of cell polarity regulating cell shape
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
-relationship: negatively_regulates GO:0061246 ! establishment or maintenance of bipolar cell polarity regulating cell shape
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of establishment or maintenance of bipolar cell polarity regulating cell shape." [GOC:mah]
+comment: The reason for obsoletion is that this term was made in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21217" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061245
 created_by: mah
 creation_date: 2011-06-16T11:51:49Z
 
@@ -649884,9 +650166,10 @@
 
 [Term]
 id: GO:2001289
-name: lipid X metabolic process
+name: obsolete lipid X metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving lipid X, 2,3-diacylglucosamine 1-phosphate." [GOC:obol]
+def: "OBSOLETE. The chemical reactions and pathways involving lipid X, 2,3-diacylglucosamine 1-phosphate." [GOC:obol]
+comment: The reason for obsoletion is that this term was made in error and is an unnecessary grouping term.
 synonym: "2,3-Bis(3-hydroxytetradecanoyl)-beta-D-glucosaminyl 1-phosphate metabolic process" RELATED [GOC:obol]
 synonym: "2,3-Bis(3-hydroxytetradecanoyl)-beta-D-glucosaminyl 1-phosphate metabolism" RELATED [GOC:obol]
 synonym: "2,3-Bis(beta-hydoroxymyristoyl)-beta-D-glucosaminyl 1-phosphate metabolic process" RELATED [GOC:obol]
@@ -649894,8 +650177,8 @@
 synonym: "2-deoxy-3-O-[(3R)-3-hydroxytetradecanoyl]-2-{[(3R)-3-hydroxytetradecanoyl]amino}-1-O-phosphono-alpha-D-glucopyranose metabolic process" EXACT [GOC:obol]
 synonym: "2-deoxy-3-O-[(3R)-3-hydroxytetradecanoyl]-2-{[(3R)-3-hydroxytetradecanoyl]amino}-1-O-phosphono-alpha-D-glucopyranose metabolism" EXACT [GOC:obol]
 synonym: "lipid X metabolism" EXACT [GOC:obol]
-is_a: GO:0006040 ! amino sugar metabolic process
-is_a: GO:0019637 ! organophosphate metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32273" xsd:anyURI
+is_obsolete: true
 created_by: tb
 creation_date: 2012-01-13T11:28:58Z
 
@@ -650514,8 +650797,9 @@
 name: rescue of stalled mitochondrial ribosome
 namespace: biological_process
 def: "A process of mitochondrial translational elongation that takes place when a mitochondrial ribosome has stalled during translation, and results in freeing the ribosome from the stalled translation complex." [PMID:33243891]
+is_a: GO:0032790 ! ribosome disassembly
 is_a: GO:0070125 ! mitochondrial translational elongation
-is_a: GO:0072344 ! rescue of stalled cytosolic ribosome
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26238" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30547" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650961,8 +651245,8 @@
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + adenosine(37) in tRNA(Val) = S-adenosyl-L-homocysteine + N(6)-methyladenosine(37) in tRNA(Val) + H+." [PMID:19383770, RHEA:43160]
 xref: EC:2.1.1.223
 xref: RHEA:43160
-is_a: GO:0008170 ! N-methyltransferase activity
 is_a: GO:0016426 ! tRNA (adenine) methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.223
 property_value: skos:exactMatch RHEA:43160
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31644" xsd:anyURI
@@ -651420,6 +651704,402 @@
 created_by: dragon-ai-agent
 creation_date: 2026-07-22T21:20:31Z
 
+[Term]
+id: GO:7770089
+name: large conductance calcium-activated potassium channel inhibitor activity
+namespace: molecular_function
+def: "Binds to and stops, prevents, or reduces the activity of a large conductance calcium-activated potassium channel." [PMID:17591990, PMID:39971906]
+synonym: "BK calcium-activated potassium channel inhibitor activity" EXACT []
+synonym: "BK channel inhibitor activity" RELATED []
+synonym: "BK KCa channel inhibitor activity" EXACT []
+synonym: "large conductance KCa channel inhibitor activity" EXACT []
+is_a: GO:0019870 ! potassium channel inhibitor activity
+relationship: negatively_regulates GO:0060072 ! large conductance calcium-activated potassium channel activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32358" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-28T00:46:41Z
+
+[Term]
+id: GO:7770090
+name: voltage-gated potassium channel inhibitor activity
+namespace: molecular_function
+def: "Binds to and stops, prevents, or reduces the activity of a voltage-gated potassium channel." [PMID:35797055]
+synonym: "Kv channel inhibitor activity" EXACT []
+synonym: "Kv inhibitor activity" EXACT []
+synonym: "voltage-gated potassium channel (Kv) inhibitor activity" EXACT []
+is_a: GO:0019870 ! potassium channel inhibitor activity
+relationship: negatively_regulates GO:0005249 ! voltage-gated potassium channel activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32371" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-28T16:49:43Z
+
+[Term]
+id: GO:7770091
+name: lipoyl-GcvH:protein N-lipoyltransferase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: N6-[(R)-lipoyl]-L-lysyl-[glycine-cleavage complex H protein] + L-lysyl-[lipoyl-carrier protein] = L-lysyl-[glycine-cleavage complex H protein] + N6-[(R)-lipoyl]-L-lysyl-[lipoyl-carrier protein]." [EC:2.3.1.204, PMID:38624243]
+comment: The enzyme also transfers the biosynthetic precursor octanoyl group, and relays the acyl group from GcvH onto the E2 subunits of the pyruvate, 2-oxoglutarate, branched-chain 2-oxoacid and acetoin dehydrogenase complexes.
+synonym: "lipoyl amidotransferase activity" BROAD []
+synonym: "lipoyl relay activity" RELATED []
+synonym: "octanoyl-[GcvH]:protein N-octanoyltransferase activity" RELATED []
+xref: EC:2.3.1.204
+xref: RHEA:16413
+xref: RHEA:20213
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+is_a: GO:0140096 ! catalytic activity, acting on a protein
+property_value: skos:exactMatch EC:2.3.1.204
+property_value: skos:narrowMatch RHEA:16413
+property_value: skos:narrowMatch RHEA:20213
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32361" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-28T20:08:06Z
+
+[Term]
+id: GO:7770092
+name: Sec body
+namespace: cellular_component
+def: "A condensate that forms reversibly in the cytoplasm under stress, notably amino acid starvation or salt stress, by coalescence of endoplasmic reticulum exit site (ERES) components including the scaffold protein Sec16 and COPII coat subunits. Sec bodies form through liquid-liquid phase separation and act as a protective reservoir for ERES components, permitting reversible shutdown of the early secretory pathway and promoting cell survival during stress." [PMID:25386913, PMID:31152627, PMID:36325988]
+comment: A Sec body forms from components of an endoplasmic reticulum exit site (GO:0070971), which is progressively depleted as the Sec body grows; a Sec body is a distinct structure and is not part of an ER exit site.
+synonym: "sec-body" EXACT []
+is_a: GO:0043232 ! intracellular membraneless organelle
+relationship: part_of GO:0005737 ! cytoplasm
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32313" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-28T23:40:49Z
+
+[Term]
+id: GO:7770093
+name: Sec body assembly
+namespace: biological_process
+def: "The aggregation, arrangement and bonding together of a set of components to form a Sec body." [PMID:25386913, PMID:27874829]
+synonym: "Sec body formation" EXACT []
+synonym: "sec-body assembly" EXACT []
+is_a: GO:0140694 ! membraneless organelle assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32314" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-28T23:40:49Z
+
+[Term]
+id: GO:7770094
+name: ER membrane protein retrieval receptor activity
+namespace: molecular_function
+def: "Binding to a retrieval signal, such as a C-terminal KKXX/KXKX-type dilysine motif or an exposed transmembrane domain determinant, present on integral membrane proteins that have escaped from the endoplasmic reticulum (ER) to the Golgi, and mediating their return to the ER." [PMID:12972550]
+synonym: "dilysine motif binding" NARROW []
+synonym: "endoplasmic reticulum membrane protein retrieval receptor activity" EXACT []
+synonym: "KKXX motif binding" NARROW []
+synonym: "KKXX signal receptor activity" NARROW []
+is_a: GO:0038024 ! cargo receptor activity
+relationship: part_of GO:0006890 ! retrograde vesicle-mediated transport, Golgi to endoplasmic reticulum
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32307" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-29T19:05:05Z
+
+[Term]
+id: GO:7770095
+name: 4'-phosphopantetheine phosphatase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: (R)-4'-phosphopantetheine + H2O = (R)-pantetheine + phosphate." [EC:3.1.3.110, PMID:18678912, PMID:27322068, PMID:35896750, RHEA:68328]
+synonym: "pantetheine-4'-phosphate phosphatase activity" EXACT []
+synonym: "phosphopantetheine phosphatase activity" EXACT []
+xref: EC:3.1.3.110
+xref: KEGG_REACTION:R10748
+xref: MetaCyc:RXN-24222
+xref: RHEA:68328
+is_a: GO:0016791 ! phosphatase activity
+property_value: skos:exactMatch EC:3.1.3.110
+property_value: skos:exactMatch MetaCyc:RXN-24222
+property_value: skos:exactMatch RHEA:68328
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32389" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-30T17:40:49Z
+
+[Term]
+id: GO:7770096
+name: FAD regeneration via ETF:ETFQO system
+namespace: biological_process
+def: "A metabolic process that transfers electrons produced by FAD-dependent dehydrogenases involved in amino acid and lipid catabolism to the electron transport chain. Electrons released during FADH2 oxidation are transferred by electron-transfer flavoprotein (ETF) to ETF-ubiquinone oxidoreductase (ETF-QO), which in turn transfers them to ubiquinone and then to complex III of the electron transport chain." [PMID:28808132, PMID:33450351]
+comment: In eukaryotes, FAD regeneration via the ETF:ETFQO system occurs in the mitochondrion, with ETF in the matrix and ETF-QO in the inner membrane. Some bacteria and archaea have a similar system, so no taxon constraint applies to this term. This term covers the ETF/ETF-QO route specifically; do not use it for flavoprotein dehydrogenases that reduce the quinone pool directly without ETF (for example succinate dehydrogenase, see GO:0006121), or for reoxidation of flavin by molecular oxygen in peroxisomes or the endoplasmic reticulum.
+synonym: "ETF-ETFQO system" EXACT []
+synonym: "FAD regeneration via ETF-ETFQO system" EXACT []
+synonym: "reoxidation of reduced electron transfer flavoprotein" EXACT []
+is_a: GO:0022904 ! respiratory electron transport chain
+is_a: GO:0046443 ! FAD metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32355" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-30T22:03:00Z
+
+[Term]
+id: GO:7770097
+name: nutrient assimilation
+namespace: biological_process
+def: "The chemical reactions and pathways by which a cell or organism takes up a nutrient from its environment and incorporates it into cellular constituents, characteristically converting a simple, usually inorganic, nutrient source such as nitrate, sulfate, ammonia or a one-carbon compound into organic constituents of the cell." [PMID:22103536, PMID:27572125, PMID:34973427]
+subset: gocheck_do_not_annotate
+synonym: "assimilation of nutrients" EXACT []
+is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-07-29T05:36:39Z
+
+[Term]
+id: GO:7770098
+name: ATP-dependent folded protein transmembrane transporter activity
+namespace: molecular_function
+def: "Enables the transfer of a protein in its native, folded conformation from one side of a membrane to the other, coupled to the hydrolysis of ATP and without unfolding of the substrate, according to the reaction: ATP + H2O + protein[side 1] = ADP + phosphate + protein[side 2]." [PMID:31988523, PMID:32042153, PMID:40410623]
+comment: This activity is exemplified by the mitochondrial inner membrane AAA-ATPase Bcs1 (BCS1L in mammals), which translocates the folded, 2Fe-2S-loaded Rieske iron-sulfur protein from the mitochondrial matrix across the inner membrane during respiratory complex III assembly. Unlike most AAA+ protein translocases, the substrate is not threaded through an axial pore in an extended conformation; in Bcs1 it passes between two aqueous vestibules separated by a seal, in an airlock-like mechanism that preserves the membrane permeability barrier. Do not use this term for the separable channel and motor activities of multi-subunit translocases; for those, consider 'transmembrane protein transporter activity ; GO:0008320' and 'protein translocation chaperone activity ; GO:0140388'.
+synonym: "ATPase-coupled folded protein transmembrane transporter activity" EXACT []
+synonym: "folded protein translocase activity" RELATED []
+synonym: "folded protein-transporting ATPase activity" EXACT []
+is_a: GO:0015450 ! protein-transporting ATPase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32394" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T00:40:41Z
+
+[Term]
+id: GO:7770099
+name: glutaredoxin-dependent peroxiredoxin activity
+namespace: molecular_function
+def: "Catalysis of the reaction: [glutaredoxin]-dithiol + a hydroperoxide = [glutaredoxin]-disulfide + an alcohol + H2O." [PMID:11832487, PMID:12517450, RHEA:62624]
+synonym: "GrxPx activity" EXACT []
+synonym: "thiol peroxidase activity" RELATED []
+xref: EC:1.11.1.25
+xref: RHEA:62624
+is_a: GO:0051920 ! peroxiredoxin activity
+property_value: skos:exactMatch EC:1.11.1.25
+property_value: skos:exactMatch RHEA:62624
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32405" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T17:43:33Z
+
+[Term]
+id: GO:7770100
+name: mycoredoxin-dependent peroxiredoxin activity
+namespace: molecular_function
+def: "Catalysis of the reaction: [mycoredoxin]-dithiol + a hydroperoxide = [mycoredoxin]-disulfide + an alcohol + H2O." [PMID:19737009, PMID:24379404, RHEA:62640]
+synonym: "thiol peroxidase activity" RELATED []
+xref: EC:1.11.1.29
+xref: RHEA:62640
+is_a: GO:0051920 ! peroxiredoxin activity
+property_value: skos:exactMatch EC:1.11.1.29
+property_value: skos:exactMatch RHEA:62640
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32405" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T17:43:33Z
+
+[Term]
+id: GO:7770101
+name: glutathione-dependent peroxiredoxin activity
+namespace: molecular_function
+def: "Catalysis of the reaction: a hydroperoxide + 2 glutathione = an alcohol + glutathione disulfide + H2O." [PMID:12606554, PMID:15004285, RHEA:62632]
+synonym: "thiol peroxidase activity" RELATED []
+xref: EC:1.11.1.27
+xref: RHEA:62632
+xref: RHEA:69412
+xref: RHEA:69651
+xref: RHEA:76731
+is_a: GO:0004601 ! peroxidase activity
+property_value: skos:exactMatch EC:1.11.1.27
+property_value: skos:exactMatch RHEA:62632
+property_value: skos:narrowMatch RHEA:69412
+property_value: skos:narrowMatch RHEA:69651
+property_value: skos:narrowMatch RHEA:76731
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32405" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T17:43:33Z
+
+[Term]
+id: GO:7770102
+name: response to interleukin-5
+namespace: biological_process
+def: "Any process that results in a change in state or activity of a cell or an organism (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of an interleukin-5 stimulus." [PMID:41207640]
+synonym: "response to IL-5" EXACT []
+is_a: GO:0034097 ! response to cytokine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32411" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T23:16:15Z
+
+[Term]
+id: GO:7770103
+name: cellular response to interleukin-5
+namespace: biological_process
+def: "Any process that results in a change in state or activity of a cell (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of an interleukin-5 stimulus." [PMID:41207640]
+synonym: "cellular response to IL-5" EXACT []
+is_a: GO:0071345 ! cellular response to cytokine stimulus
+is_a: GO:7770102 ! response to interleukin-5
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32411" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-04T23:16:15Z
+
+[Term]
+id: GO:7770104
+name: Tim8-Tim13 complex
+namespace: cellular_component
+def: "A chaperone complex located in the mitochondrial intermembrane space, composed of the small TIM proteins Tim8 and Tim13." [PMID:11101512, PMID:33355130]
+synonym: "TIM8-13 complex" EXACT []
+is_a: GO:0042719 ! mitochondrial intermembrane space chaperone complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32408" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-07T16:51:54Z
+
+[Term]
+id: GO:7770105
+name: Tim9-Tim10 complex
+namespace: cellular_component
+def: "A chaperone complex located in the mitochondrial intermembrane space, composed of the small TIM proteins Tim9 and Tim10." [PMID:16387659, PMID:33355130]
+synonym: "TIM9-10 complex" EXACT []
+is_a: GO:0042719 ! mitochondrial intermembrane space chaperone complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32408" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-07T16:51:54Z
+
+[Term]
+id: GO:7770106
+name: ATP-dependent protein-RNA complex displacement activity
+namespace: molecular_function
+def: "An activity that displaces a protein or protein complex from RNA in a ribonucleoprotein (RNP) complex, driven by ATP hydrolysis." [PMID:11175897, PMID:15118161, PMID:28864812, PMID:39122693]
+comment: Analogous to the DNA-side activity GO:0061995 (ATP-dependent protein-DNA complex displacement activity). The community-used term "RNPase" refers to this activity.
+synonym: "ATP-dependent RNA-protein complex displacement activity" EXACT []
+synonym: "RNP remodeling ATPase activity" BROAD []
+synonym: "RNPase activity" EXACT []
+is_a: GO:0008186 ! ATP-dependent activity, acting on RNA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32232" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-07T16:59:22Z
+
+[Term]
+id: GO:7770107
+name: RNA (adenine-N6)-methyltransferase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: an adenosine in RNA + S-adenosyl-L-methionine = an N(6)-methyladenosine in RNA + S-adenosyl-L-homocysteine + H+." [PMID:34023900, PMID:36736310]
+synonym: "RNA (N6-adenosine)-methyltransferase activity" EXACT []
+synonym: "RNA m6A methyltransferase activity" EXACT []
+is_a: GO:0008170 ! N-methyltransferase activity
+is_a: GO:0008173 ! RNA methyltransferase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27200" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-07T23:44:01Z
+
+[Term]
+id: GO:7770108
+name: citrate-malate shuttle
+namespace: biological_process
+def: "The process of transferring acetyl-CoA from the mitochondrion to the cytosol via citrate. Acetyl-CoA and oxaloacetate produced in the mitochondrion are condensed to citrate by citrate synthase; the citrate is exported to the cytosol by the mitochondrial citrate/malate antiporter in exchange for malate; in the cytosol, ATP citrate lyase cleaves the citrate back to acetyl-CoA and oxaloacetate; the oxaloacetate is then reduced to malate by cytosolic malate dehydrogenase, and the malate is imported back into the mitochondrion to complete the cycle." [PMID:32414018, PMID:35264789]
+synonym: "acetyl-CoA biosynthesis from citrate" NARROW []
+synonym: "citrate-malate cycle" EXACT []
+synonym: "malate-citrate shuttle" EXACT []
+synonym: "non-canonical TCA cycle" RELATED []
+xref: Wikipedia:Citrate-malate_shuttle
+is_a: GO:0006084 ! acetyl-CoA metabolic process
+is_a: GO:0006101 ! citrate metabolic process
+intersection_of: GO:0008152 ! metabolic process
+intersection_of: has_part GO:0003878 ! ATP citrate synthase activity
+intersection_of: has_part GO:0030060 ! L-malate dehydrogenase (NAD+) activity
+relationship: has_part GO:0003878 ! ATP citrate synthase activity
+relationship: has_part GO:0006843 ! mitochondrial citrate transmembrane transport
+relationship: has_part GO:0030060 ! L-malate dehydrogenase (NAD+) activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32353" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-12T10:08:31Z
+
+[Term]
+id: GO:7770109
+name: myo-inositol export across plasma membrane
+namespace: biological_process
+def: "The directed movement of myo-inositol from inside of a cell, across the plasma membrane and into the extracellular region." [PMID:42567923]
+synonym: "inositol export" BROAD []
+synonym: "myo-inositol export" BROAD []
+synonym: "myo-inositol export from cell" EXACT []
+is_a: GO:0015791 ! polyol transmembrane transport
+is_a: GO:0015798 ! myo-inositol transport
+is_a: GO:0140115 ! export across plasma membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32460" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-14T19:33:20Z
+
+[Term]
+id: GO:7770110
+name: exit from cytosolic ribosome hibernation
+namespace: biological_process
+def: "A cellular process that results in the reactivation of hibernating cytosolic ribosomes, enabling them to resume translation. Upon reversal of unfavorable conditions such as nutrient limitation, dedicated molecular machinery reactivates hibernating ribosomes and promotes recovery of active translation." [PMID:32687489, PMID:42129552]
+synonym: "ribosome hibernation exit" EXACT []
+synonym: "ribosome reactivation" RELATED []
+synonym: "translational restart after ribosome hibernation" EXACT []
+is_a: GO:2000767 ! positive regulation of cytoplasmic translation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32461" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-14T22:52:06Z
+
+[Term]
+id: GO:7770111
+name: group translocator activity
+namespace: molecular_function
+def: "Enables the transfer of a substance from one side of a membrane to the other, where the substance is chemically modified as an integral part of the translocation process, so that the species released on the far side of the membrane is not the species that was bound on the near side. This differs from primary and secondary active transport, in which the transported substance is unchanged." [PMID:31214989, PMID:33170213]
+synonym: "group translocation activity" EXACT []
+synonym: "group translocator" RELATED []
+xref: TC:4
+is_a: GO:0022857 ! transmembrane transporter activity
+relationship: has_part GO:0003824 ! catalytic activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27496" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-18T00:41:26Z
+
+[Term]
+id: GO:7770112
+name: ribosome-associated quality control
+namespace: biological_process
+def: "A protein quality control pathway that acts on ribosomes stalled during translation to target the incomplete nascent polypeptide chain for degradation." [PMID:32569528, PMID:34233554, PMID:35452614]
+comment: The core RQC machinery (NEMF/Rqc2/RqcH and the associated untemplated C-terminal chain elongation) is conserved from bacteria to humans, so this term is not restricted to eukaryotes.
+synonym: "ribosome quality control" EXACT []
+synonym: "ribosome-associated protein quality control" EXACT [PMID:26733220]
+synonym: "RQC" EXACT []
+is_a: GO:0006515 ! protein quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18610" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26238" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-18T05:06:46Z
+
+[Term]
+id: GO:7770113
+name: RQC-specific ribosome subunit dissociation
+namespace: biological_process
+def: "The disaggregation of a stalled ribosome into its constituent large and small ribosomal subunits as part of ribosome-associated quality control (RQC), releasing the large subunit with the incomplete nascent polypeptide chain still attached via peptidyl-tRNA for downstream RQC processing." [PMID:32203490, PMID:32579943, PMID:35452614]
+comment: In eukaryotes, this step is carried out by the yeast RQT complex (Rqt2/Slh1, Rqt3/Cue3, Rqt4) or the metazoan ASCC complex, acting on Hel2/ZNF598-ubiquitinated collided ribosomes. In bacteria, MutS2 splits stalled collided ribosomes; this term is not restricted to eukaryotes.
+synonym: "ASCC-dependent ribosome subunit dissociation" NARROW []
+synonym: "ribosome disassembly involved in ribosome-associated quality control" EXACT []
+synonym: "RQT-dependent ribosome subunit dissociation" NARROW []
+is_a: GO:0032790 ! ribosome disassembly
+intersection_of: GO:0032790 ! ribosome disassembly
+intersection_of: part_of GO:7770112 ! ribosome-associated quality control
+relationship: part_of GO:7770112 ! ribosome-associated quality control
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32478" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-18T18:06:47Z
+
+[Term]
+id: GO:7770114
+name: phagophore membrane
+namespace: cellular_component
+def: "A membrane that is part of a phagophore." [PMID:23217709, PMID:33773106]
+comment: Covers the membrane of the nascent phagophore, including membrane contributed by Atg9/ATG9A-containing vesicles once they have been incorporated into the phagophore, and the membrane of the expanding cup-shaped structure. After the structure has closed, annotate to autophagosome membrane (GO:0000421) instead. Do not use for Atg9/ATG9A-containing vesicles themselves, either before or after their recruitment to the phagophore assembly site: a vesicle is a membrane-bounded structure, not a membrane.
+is_a: GO:0016020 ! membrane
+relationship: part_of GO:0061908 ! phagophore
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29437" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-19T23:59:26Z
+
+[Term]
+id: GO:7770115
+name: Atg9-containing vesicle
+namespace: cellular_component
+def: "A small, single-membrane cytoplasmic vesicle that carries the transmembrane autophagy protein Atg9 (ATG9A in mammals). Vesicles of this type are derived from the Golgi apparatus and from endosomal compartments, and can be delivered to the phagophore assembly site, where they contribute membrane to the nascent phagophore." [PMID:20855505, PMID:22826123, PMID:24034251, PMID:32883836]
+comment: In Saccharomyces cerevisiae these vesicles are 30-60 nm in diameter and approximately three are consumed per autophagosome. In mammals ATG9A vesicles traffic via the trans-Golgi network and recycling endosomes, and a substantial part of the pool is not engaged in autophagosome formation at any given time. Use this term for the vesicle itself, at any stage of its itinerary. Membrane that has been incorporated into the phagophore is phagophore membrane (GO:7770114) rather than a vesicle. The Atg9-containing compartment/reservoir described by Mari et al. (PMID:20855505) is a cluster of these vesicles and tubules rather than a single vesicle; use this term for the individual vesicles that make up such clusters.
+synonym: "Atg9 vesicle" EXACT []
+synonym: "Atg9-containing compartment" RELATED [PMID:20855505]
+synonym: "ATG9A vesicle" NARROW []
+is_a: GO:0031410 ! cytoplasmic vesicle
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29437" xsd:anyURI
+created_by: ai4c-agent
+creation_date: 2026-08-20T23:57:41Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
