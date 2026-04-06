# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-04-06 06:08:50.963350223 +0000
+++ go.obo	2026-04-06 06:18:12.287876478 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-03-25
+data-version: releases/2026-04-06
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-03-25" xsd:string
+property_value: owl:versionInfo "2026-04-06" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -86,7 +86,7 @@
 is_obsolete: true
 consider: GO:0042254
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0000006
@@ -9883,7 +9883,6 @@
 name: glycerophosphodiester transmembrane transport
 namespace: biological_process
 def: "The process in which a glycerophosphodiester is transported across a membrane. Glycerophosphodiesters are small molecules composed of glycerol-3-phosphate and an alcohol, for example, glycerophosphoinositol." [GOC:mcc, PMID:12912892]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -16456,7 +16455,7 @@
 id: GO:0002143
 name: tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:16871210]
+def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:16871210]
 comment: In E. coli, the first step of the reaction is reductive elimination of sulfur from L-cysteine by IscS cysteine desulfurase to form an enzyme-bound cysteine-persulfide intermediate. Then, five essential gene products, TusA, TusB, TusC, TusD and TusE, mediate a sulfur relay that delivers the terminal sulfur of persulfide from IscS to MnmA12. The last protein, MnmA catalyzes the transfer of the sulfur from IscS to an ATP activated U34 of the tRNA.
 synonym: "tRNA wobble uridine thiolation" EXACT [GOC:mah]
 synonym: "wobble position s2U biosynthesis" EXACT []
@@ -31376,7 +31375,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003755
@@ -31445,7 +31444,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003762
@@ -38880,12 +38879,13 @@
 is_a: GO:0009055 ! electron transfer activity
 is_a: GO:0015078 ! proton transmembrane transporter activity
 is_a: GO:0015453 ! oxidoreduction-driven active transmembrane transporter activity
+is_a: GO:0016675 ! oxidoreductase activity, acting on a heme group of donors
 is_a: GO:0022853 ! active monoatomic ion transmembrane transporter activity
-relationship: has_part GO:0016675 ! oxidoreductase activity, acting on a heme group of donors
 property_value: skos:exactMatch EC:7.1.1.9
 property_value: skos:exactMatch RHEA:11436
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20924" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21275" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25935" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30272" xsd:anyURI
 
 [Term]
@@ -65636,7 +65636,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -70202,7 +70201,7 @@
 id: GO:0006423
 name: cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accetping tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accepting tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
 is_a: GO:0006418 ! tRNA aminoacylation for protein translation
 
 [Term]
@@ -70450,7 +70449,8 @@
 synonym: "binding unfolded ER proteins" EXACT []
 is_obsolete: true
 consider: GO:0005783
-consider: GO:0051082
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0006460
@@ -72304,11 +72304,14 @@
 name: polyamine catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of polyamines, any organic compound containing two or more amino groups." [ISBN:0198506732]
+synonym: "polyamine back-conversion" RELATED []
 synonym: "polyamine breakdown" EXACT []
 synonym: "polyamine catabolism" EXACT []
 synonym: "polyamine degradation" EXACT []
+synonym: "polyamine interconversion" RELATED []
 is_a: GO:0006595 ! polyamine metabolic process
 is_a: GO:0042402 ! biogenic amine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0006599
@@ -75283,7 +75286,6 @@
 alt_id: GO:0015815
 def: "The directed movement of glutamine, 2-amino-4-carbamoylbutanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "glutamine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -79402,14 +79404,13 @@
 
 [Term]
 id: GO:0007263
-name: nitric oxide mediated signal transduction
+name: obsolete nitric oxide mediated signal transduction
 namespace: biological_process
-def: "An intracellular signaling cassette that starts with production of nitric oxide, detection by receptors/sensors for nitric oxide (such as soluble guanylyl cyclase/sGC) and ends with the activation of downstream effectors that further transmit the signal within the cell. Nitric oxide transmits its downstream effects through either cyclic GMP (cGMP)-dependent or independent mechanisms." [GOC:jl, PMID:21549190]
-synonym: "nitric oxide signaling" EXACT [GOC:bf]
-synonym: "nitric oxide-mediated signal transduction" EXACT []
-synonym: "NO mediated signal transduction" EXACT []
-synonym: "NO-mediated signal transduction" EXACT []
-is_a: GO:0141124 ! intracellular signaling cassette
+def: "OBSOLETE. An intracellular signaling cassette that starts with production of nitric oxide, detection by receptors/sensors for nitric oxide (such as soluble guanylyl cyclase/sGC) and ends with the activation of downstream effectors that further transmit the signal within the cell. Nitric oxide transmits its downstream effects through either cyclic GMP (cGMP)-dependent or independent mechanisms." [GOC:jl, PMID:21549190]
+comment: The reason for obsoletion is that this term has been inconsistently used and NO signaling proceeds via cGMP, so the more specific replacement term is preferred.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26613" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0038060
 
 [Term]
 id: GO:0007264
@@ -84110,12 +84111,13 @@
 is_a: GO:0009055 ! electron transfer activity
 is_a: GO:0015078 ! proton transmembrane transporter activity
 is_a: GO:0015453 ! oxidoreduction-driven active transmembrane transporter activity
+is_a: GO:0016679 ! oxidoreductase activity, acting on diphenols and related substances as donors
 is_a: GO:0022853 ! active monoatomic ion transmembrane transporter activity
-relationship: has_part GO:0016679 ! oxidoreductase activity, acting on diphenols and related substances as donors
 property_value: skos:exactMatch EC:7.1.1.8
 property_value: skos:exactMatch RHEA:11484
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20616" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21275" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25935" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26941" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30272" xsd:anyURI
 
@@ -84405,17 +84407,18 @@
 xref: MetaCyc:NADH-DEHYDROG-A-RXN
 xref: Reactome:R-HSA-163217 "Complex I oxidises NADH to NAD+, reduces CoQ to CoQH2"
 xref: RHEA:29091
+is_a: GO:0003954 ! NADH dehydrogenase activity
 is_a: GO:0009055 ! electron transfer activity
 is_a: GO:0015078 ! proton transmembrane transporter activity
 is_a: GO:0015453 ! oxidoreduction-driven active transmembrane transporter activity
+is_a: GO:0016655 ! oxidoreductase activity, acting on NAD(P)H, quinone or similar compound as acceptor
 is_a: GO:0022853 ! active monoatomic ion transmembrane transporter activity
-relationship: has_part GO:0003954 ! NADH dehydrogenase activity
-relationship: has_part GO:0016655 ! oxidoreductase activity, acting on NAD(P)H, quinone or similar compound as acceptor
 property_value: skos:exactMatch EC:7.1.1.2
 property_value: skos:exactMatch RHEA:29091
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20616" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21275" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25784" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25935" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27641" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30272" xsd:anyURI
@@ -89012,7 +89015,6 @@
 xref: Reactome:R-HSA-380620 "Reuptake of serotonin from the synapse"
 xref: Reactome:R-HSA-5660706 "Defective SLC6A3 does not cotransport DA, Na+ from extracellular region to cytosol"
 is_a: GO:0022804 ! active transmembrane transporter activity
-relationship: part_of GO:0015844 ! monoamine transport
 
 [Term]
 id: GO:0008506
@@ -101662,8 +101664,19 @@
 synonym: "putrescine breakdown" EXACT []
 synonym: "putrescine catabolism" EXACT []
 synonym: "putrescine degradation" EXACT []
+xref: MetaCyc:PUTDEG-PWY
+xref: MetaCyc:PWY-0
+xref: MetaCyc:PWY-2
+xref: MetaCyc:PWY-3
+xref: MetaCyc:PWY0-1221
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0009445 ! putrescine metabolic process
+property_value: skos:narrowMatch MetaCyc:PUTDEG-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-0
+property_value: skos:narrowMatch MetaCyc:PWY-2
+property_value: skos:narrowMatch MetaCyc:PWY-3
+property_value: skos:narrowMatch MetaCyc:PWY0-1221
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0009448
@@ -114725,38 +114738,33 @@
 
 [Term]
 id: GO:0010749
-name: regulation of nitric oxide mediated signal transduction
+name: obsolete regulation of nitric oxide mediated signal transduction
 namespace: biological_process
-def: "Any process that modulates the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
-synonym: "regulation of nitric oxide-mediated signal transduction" EXACT []
-is_a: GO:1902531 ! regulation of intracellular signal transduction
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0007263 ! nitric oxide mediated signal transduction
-relationship: regulates GO:0007263 ! nitric oxide mediated signal transduction
+def: "OBSOLETE. Any process that modulates the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
+comment: The reason for obsoletion is that this term has been inconsistently used and NO signaling proceeds via cGMP, so the more specific replacement term is preferred.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26613" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0141149
 
 [Term]
 id: GO:0010750
-name: positive regulation of nitric oxide mediated signal transduction
+name: obsolete positive regulation of nitric oxide mediated signal transduction
 namespace: biological_process
-def: "Any process that increases the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
-synonym: "positive regulation of nitric oxide-mediated signal transduction" EXACT []
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
-is_a: GO:1902533 ! positive regulation of intracellular signal transduction
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0007263 ! nitric oxide mediated signal transduction
-relationship: positively_regulates GO:0007263 ! nitric oxide mediated signal transduction
+def: "OBSOLETE. Any process that increases the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
+comment: The reason for obsoletion is that this term has been inconsistently used and NO signaling proceeds via cGMP, so the more specific replacement term is preferred.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26613" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0141150
 
 [Term]
 id: GO:0010751
-name: negative regulation of nitric oxide mediated signal transduction
+name: obsolete negative regulation of nitric oxide mediated signal transduction
 namespace: biological_process
-def: "Any process that decreases the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
-synonym: "negative regulation of nitric oxide-mediated signal transduction" EXACT []
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
-is_a: GO:1902532 ! negative regulation of intracellular signal transduction
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0007263 ! nitric oxide mediated signal transduction
-relationship: negatively_regulates GO:0007263 ! nitric oxide mediated signal transduction
+def: "OBSOLETE. Any process that decreases the rate, frequency or extent of nitric oxide mediated signal transduction. Nitric oxide mediated signal transduction is The series of molecular signals mediated by the detection of nitric oxide (NO)." [GOC:BHF, GOC:dph, GOC:tb]
+comment: The reason for obsoletion is that this term has been inconsistently used and NO signaling proceeds via cGMP, so the more specific replacement term is preferred.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26613" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0141151
 
 [Term]
 id: GO:0010752
@@ -125032,7 +125040,7 @@
 consider: GO:0009297
 consider: GO:0030674
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0015473
@@ -126840,7 +126848,6 @@
 namespace: biological_process
 def: "A process in which ferric-enterobactin, the iron-bound form of the siderophore enterobactin, is transported into the cell by specific cell surface receptors." [GOC:pg, PMID:23192658]
 synonym: "ferric-enterobactin transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033214 ! siderophore-iron import into cell
 
 [Term]
@@ -126914,10 +126921,13 @@
 
 [Term]
 id: GO:0015695
-name: organic cation transport
+name: obsolete organic cation transport
 namespace: biological_process
-def: "The directed movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic cations are atoms or small molecules with a positive charge which contain carbon in covalent linkage." [GOC:ai]
-is_a: GO:0006810 ! transport
+def: "OBSOLETE. The directed movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic cations are atoms or small molecules with a positive charge which contain carbon in covalent linkage." [GOC:ai]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30715" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0055085
 
 [Term]
 id: GO:0015697
@@ -126961,7 +126971,7 @@
 xref: Reactome:R-HSA-1475029 "Reversible hydration of carbon dioxide"
 xref: Reactome:R-HSA-1480926 "O2/CO2 exchange in erythrocytes"
 xref: Reactome:R-HSA-425381 "Bicarbonate transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0006810 ! transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26780" xsd:anyURI
 
 [Term]
@@ -127049,11 +127059,14 @@
 
 [Term]
 id: GO:0015711
-name: organic anion transport
+name: obsolete organic anion transport
 namespace: biological_process
-def: "The directed movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic anions are atoms or small molecules with a negative charge which contain carbon in covalent linkage." [GOC:ai, GOC:krc]
+def: "OBSOLETE. The directed movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic anions are atoms or small molecules with a negative charge which contain carbon in covalent linkage." [GOC:ai, GOC:krc]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
 xref: Reactome:R-HSA-9955298 "SLC-mediated transport of organic anions"
-is_a: GO:0006810 ! transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30715" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0055085
 
 [Term]
 id: GO:0015712
@@ -127349,7 +127362,6 @@
 def: "The directed movement of urate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc]
 synonym: "urate transmembrane transport" EXACT [GOC:mah]
 synonym: "uric acid transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -127449,7 +127461,6 @@
 name: glucose-6-phosphate transport
 namespace: biological_process
 def: "The directed movement of glucose-6-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Glucose-6-phosphate is a monophosphorylated derivative of glucose with the phosphate group attached to C-6." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015712 ! hexose phosphate transport
 
 [Term]
@@ -127614,7 +127625,6 @@
 def: "The directed movement of CMP-N-acetylneuraminate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "CMP-N-acetylneuraminate transport" RELATED []
 synonym: "CMP-sialic acid transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127630,7 +127640,6 @@
 name: UDP-glucose transmembrane transport
 namespace: biological_process
 def: "The process in which UDP-glucose is transported across a membrane." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14450" xsd:anyURI
 
@@ -127651,7 +127660,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-N-acetylgalactosamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-N-acetylgalactosamine is a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-N-acetylgalactosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127660,7 +127668,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-xylose into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-xylose is a substance composed of xylose in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-xylose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127699,7 +127706,6 @@
 namespace: biological_process
 def: "The process in which glycerol-3-phosphate is transported across a membrane. Glycerol-3-phosphate is a phosphoric monoester of glycerol." [GOC:ai]
 synonym: "glycerol-3-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -127802,7 +127808,6 @@
 synonym: "S-adenosyl methionine transport" EXACT []
 synonym: "S-adenosylmethionine transport" EXACT []
 synonym: "SAM transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0072348 ! sulfur compound transport
 
 [Term]
@@ -127892,7 +127897,6 @@
 name: glycine transport
 namespace: biological_process
 def: "The directed movement of glycine, aminoethanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -127936,7 +127940,6 @@
 namespace: biological_process
 def: "The directed movement of L-leucine, 2-amino-4-methylpentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "leucine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015803 ! branched-chain amino acid transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -127949,7 +127952,6 @@
 synonym: "L-methionine transport" NARROW []
 is_a: GO:0000101 ! sulfur amino acid transport
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 
 [Term]
 id: GO:0015822
@@ -127958,7 +127960,6 @@
 def: "The directed movement of ornithine, 2,5-diaminopentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-ornithine transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -127977,7 +127978,6 @@
 namespace: biological_process
 def: "The directed movement of proline, pyrrolidine-2-carboxylic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-proline transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128010,7 +128010,6 @@
 def: "The directed movement of tryptophan, 2-amino-3-(1H-indol-3-yl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tryptophan transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 
 [Term]
@@ -128019,7 +128018,6 @@
 namespace: biological_process
 def: "The directed movement of tyrosine, 2-amino-3-(4-hydroxyphenyl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tyrosine transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128111,7 +128109,6 @@
 name: cadaverine transport
 namespace: biological_process
 def: "The directed movement of cadaverine, 1,5-pentanediamine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -128142,7 +128139,6 @@
 name: methylammonium transport
 namespace: biological_process
 def: "The directed movement of methylammonium into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0019755 ! one-carbon compound transport
 
@@ -128166,7 +128162,6 @@
 name: putrescine transport
 namespace: biological_process
 def: "The directed movement of putrescine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Putrescine is 1,4-diaminobutane, the polyamine formed by decarboxylation of ornithine and the metabolic precursor of spermidine and spermine." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128174,7 +128169,6 @@
 name: spermidine transport
 namespace: biological_process
 def: "The directed movement of spermidine, N-(3-aminopropyl)-1,4-diaminobutane, a polyamine formed by the transfer of a propylamine group from decarboxylated S-adenosylmethionine to putrescine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128313,7 +128307,6 @@
 name: ADP transport
 namespace: biological_process
 def: "The directed movement of ADP, adenosine diphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128322,7 +128315,6 @@
 name: ATP transport
 namespace: biological_process
 def: "The directed movement of ATP, adenosine triphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128349,7 +128341,6 @@
 name: acetylcholine transport
 namespace: biological_process
 def: "The directed movement of acetylcholine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Acetylcholine is an acetic acid ester of the organic base choline and functions as a neurotransmitter, released at the synapses of parasympathetic nerves and at neuromuscular junctions." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901374 ! acetate ester transport
 
@@ -128358,7 +128349,6 @@
 name: choline transport
 namespace: biological_process
 def: "The directed movement of choline into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Choline (2-hydroxyethyltrimethylammonium) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids and in the neurotransmitter acetylcholine." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -128375,7 +128365,6 @@
 def: "The directed movement of norepinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Norepinephrine (3,4-dihydroxyphenyl-2-aminoethanol) is a hormone secreted by the adrenal medulla and a neurotransmitter in the sympathetic peripheral nervous system and in some tracts of the CNS. It is also the biosynthetic precursor of epinephrine." [GOC:ai, ISBN:0198506732]
 synonym: "levarterenol transport" EXACT []
 synonym: "noradrenaline transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051937 ! catecholamine transport
 
 [Term]
@@ -128420,7 +128409,6 @@
 namespace: biological_process
 def: "The directed movement of carnitine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carnitine is a compound that participates in the transfer of acyl groups across the inner mitochondrial membrane." [GOC:ai]
 synonym: "vitamin Bt transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -128428,7 +128416,6 @@
 name: coenzyme A transport
 namespace: biological_process
 def: "The directed movement of coenzyme A into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Coenzyme A, 3'-phosphoadenosine-(5')diphospho(4')pantatheine, is an acyl carrier in many acylation and acyl-transfer reactions in which the intermediate is a thiol ester." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128466,7 +128453,6 @@
 synonym: "flavin adenine dinucleotide transport" EXACT []
 synonym: "flavin-adenine dinucleotide transport" EXACT []
 is_a: GO:0006862 ! nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 
 [Term]
 id: GO:0015884
@@ -128518,7 +128504,6 @@
 def: "The directed movement of thiamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Thiamine is vitamin B1, a water soluble vitamin present in fresh vegetables and meats, especially liver." [GOC:ai]
 synonym: "thiamin transport" EXACT []
 synonym: "vitamin B1 transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128649,7 +128634,6 @@
 def: "The directed movement of tetracycline from one side of a membrane to the other. Tetracycline is a broad spectrum antibiotic that blocks binding of aminoacyl tRNA to the ribosomes of both Gram-positive and Gram-negative organisms (and those of organelles)." [GOC:curators]
 synonym: "tetracyclin transport" BROAD []
 synonym: "tetracycline transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -128756,7 +128740,6 @@
 synonym: "fatty acyl CoA transport" EXACT []
 synonym: "fatty acyl coenzyme A transport" EXACT []
 synonym: "fatty acyl-CoA transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:1901337 ! thioester transport
@@ -141166,7 +141149,7 @@
 id: GO:0017109
 name: glutamate-cysteine ligase complex
 namespace: cellular_component
-def: "An enzyme complex that catalyzes the ligation of glutamate to cysteine, forming glutamylcysteine." [PMID:9675072]
+def: "An enzyme complex that catalyzes the ligation of L-glutamate to L-cysteine, forming gamma-L-glutamyl-L-cysteine." [PMID:9675072]
 synonym: "gamma-glutamylcysteine synthetase complex" EXACT []
 is_a: GO:1902494 ! catalytic complex
 relationship: part_of GO:0005737 ! cytoplasm
@@ -172542,15 +172525,17 @@
 id: GO:0030150
 name: protein import into mitochondrial matrix
 namespace: biological_process
-def: "The import of proteins across the outer and inner mitochondrial membranes into the matrix. Unfolded proteins enter the mitochondrial matrix with a chaperone protein; the information required to target the precursor protein from the cytosol to the mitochondrial matrix is contained within its N-terminal matrix-targeting sequence. Translocation of precursors to the matrix occurs at the rare sites where the outer and inner membranes are close together." [ISBN:0716731363]
+def: "The import of proteins with mitochondrial targeting sequence from the cytosol across the mitochondrial outer and inner membranes into the matrix via TOM-TIM23-PAM." [ISBN:0716731363, PMID:36931257]
 synonym: "mitochondrial matrix protein import" EXACT []
 synonym: "mitochondrial translocation" BROAD []
 synonym: "protein transport into mitochondrial matrix" EXACT []
-is_a: GO:0010496 ! intercellular transport
+synonym: "TOM-TIM23-PAM presequence matrix import pathway" EXACT []
+is_a: GO:0044743 ! protein transmembrane import into intracellular organelle
 is_a: GO:0070585 ! protein localization to mitochondrion
-is_a: GO:0071806 ! protein transmembrane transport
-is_a: GO:0072594 ! establishment of protein localization to organelle
-property_value: term_tracker_item "/github.com/geneontology/go-ontology/issues/29962" xsd:anyURI
+is_a: GO:0170036 ! import into the mitochondrion
+is_a: GO:7770058 ! mitochondrial protein import pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29962" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
 
 [Term]
 id: GO:0030151
@@ -173008,8 +172993,9 @@
 synonym: "chaperone regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030189
@@ -173020,8 +173006,9 @@
 synonym: "chaperone activator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030190
@@ -173032,8 +173019,9 @@
 synonym: "chaperone inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030191
@@ -173044,8 +173032,9 @@
 synonym: "Hsp70/Hsc70 protein inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030192
@@ -173056,8 +173045,9 @@
 synonym: "Hsp70/Hsc70 protein regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030193
@@ -181692,7 +181682,6 @@
 synonym: "thiamine pyrophosphate transport" NARROW []
 synonym: "TPP transport" EXACT []
 is_a: GO:0015697 ! quaternary ammonium group transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0071934 ! thiamine transmembrane transport
 
@@ -184348,11 +184337,14 @@
 
 [Term]
 id: GO:0031249
-name: denatured protein binding
+name: obsolete denatured protein binding
 namespace: molecular_function
-def: "Binding to a denatured protein." [GOC:mlg]
-comment: Note that this term should not be confused with 'unfolded protein binding ; GO:0051082', which usually refers to proteins that have not yet folded into their active states. Denatured proteins once were in their correct functional conformations, but have become incorrectly folded, and often form aggregates.
-is_a: GO:0005515 ! protein binding
+def: "OBSOLETE. Binding to a denatured protein." [GOC:mlg]
+comment: The reason for obsoletion is that this binding term should be replaced by an activity term such as protein folding chaperone (GO:0044183) or unfolded protein holdase activity (GO:0140309).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30962" xsd:anyURI
+is_obsolete: true
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0031250
@@ -186799,7 +186791,6 @@
 namespace: biological_process
 def: "The directed movement of glycine betaine, N-trimethylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "N-trimethylglycine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -191110,7 +191101,6 @@
 name: pyridoxal transport
 namespace: biological_process
 def: "The directed movement of pyridoxal into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxal, 3-hydroxy-5-(hydroxymethyl)-2-methyl-4-pyridinecarboxaldehyde, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -191119,7 +191109,6 @@
 name: pyridoxal phosphate transport
 namespace: biological_process
 def: "The directed movement of pyridoxal phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore; pyridoxal phosphate is pyridoxal phosphorylated at the hydroxymethyl group of C-5, and is the active form of vitamin B6." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
@@ -191129,7 +191118,6 @@
 name: pyridoxamine transport
 namespace: biological_process
 def: "The directed movement of pyridoxamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxamine, 4-(aminomethyl)-5-(hydroxymethyl)-2-methylpyridin-3-ol, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -194387,7 +194375,6 @@
 name: riboflavin transport
 namespace: biological_process
 def: "The directed movement of riboflavin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Riboflavin (vitamin B2) is a water-soluble B-complex vitamin, converted in the cell to FMN and FAD, cofactors required for the function of flavoproteins." [GOC:rn, PMID:16204239]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -195040,7 +195027,7 @@
 namespace: biological_process
 def: "The regulated release of a gonadotropin, any hormone that stimulates the gonads, especially follicle-stimulating hormone and luteinizing hormone." [GOC:mah, ISBN:0721662544]
 synonym: "gonadotrophin secretion" EXACT []
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032275
@@ -195542,7 +195529,6 @@
 name: alanine transport
 namespace: biological_process
 def: "The directed movement of alanine, 2-aminopropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195554,7 +195540,6 @@
 alt_id: GO:0090478
 def: "The directed movement of L-serine, 2-amino-3-hydroxypropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "serine import" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195617,7 +195602,7 @@
 name: inhibin secretion
 namespace: biological_process
 def: "The regulated release of an inhibin, either of two glycoproteins (designated A and B), secreted by the gonads and present in seminal plasma and follicular fluid, that inhibit pituitary production of follicle-stimulating hormone." [GOC:mah]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032335
@@ -203808,7 +203793,8 @@
 synonym: "insertion of proteins into the mitochondrial membrane from the inner side" EXACT []
 synonym: "protein insertion into mitochondrial inner membrane from matrix side" EXACT []
 synonym: "protein insertion into mitochondrial membrane from inner side" EXACT []
-is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+is_a: GO:0007007 ! inner mitochondrial membrane organization
+is_a: GO:0051204 ! protein insertion into mitochondrial membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25265" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30453" xsd:anyURI
 
@@ -206254,9 +206240,10 @@
 namespace: biological_process
 def: "A process in which iron is solubilized by reduction from Fe3+ to Fe2+ via a cell surface reductase and subsequent transport of the iron across the membrane by iron uptake proteins." [GOC:cjm, GOC:mah, PMID:16963626]
 synonym: "iron assimilation by reduction and transport" EXACT []
-is_a: GO:0033212 ! iron import into cell
+is_a: GO:0098711 ! iron ion import across plasma membrane
 relationship: has_part GO:0000293 ! ferric-chelate reductase activity
 relationship: has_part GO:0034755 ! iron ion transmembrane transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31750" xsd:anyURI
 
 [Term]
 id: GO:0033217
@@ -206366,46 +206353,54 @@
 
 [Term]
 id: GO:0033228
-name: cysteine export across plasma membrane
+name: L-cysteine export across plasma membrane
 namespace: biological_process
-def: "The directed movement of cysteine from inside of a cell, across the plasma membrane and into the extracellular region." [GOC:mlg]
+def: "The directed movement of L-cysteine from inside of a cell, across the plasma membrane and into the extracellular region." [GOC:mlg]
 synonym: "cysteine export" BROAD []
+synonym: "cysteine export across plasma membrane" BROAD []
+synonym: "L-cysteine export" BROAD []
 is_a: GO:0032973 ! amino acid export across plasma membrane
-is_a: GO:1903712 ! cysteine transmembrane transport
+is_a: GO:1903712 ! L-cysteine transmembrane transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27479" xsd:anyURI
 
 [Term]
 id: GO:0033229
-name: cysteine transmembrane transporter activity
+name: L-cysteine transmembrane transporter activity
 namespace: molecular_function
-def: "Enables the transfer of cysteine from one side of a membrane to the other." [GOC:mah]
+def: "Enables the transfer of L-cysteine from one side of a membrane to the other." [GOC:mah]
+synonym: "cysteine transmembrane transporter activity" BROAD []
 is_a: GO:0000099 ! sulfur amino acid transmembrane transporter activity
 is_a: GO:0015175 ! neutral L-amino acid transmembrane transporter activity
-relationship: part_of GO:1903712 ! cysteine transmembrane transport
+is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
+relationship: part_of GO:1903712 ! L-cysteine transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17289" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24076" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27479" xsd:anyURI
 
 [Term]
 id: GO:0033230
-name: ABC-type cysteine transporter activity
+name: ABC-type L-cysteine transporter activity
 namespace: molecular_function
 alt_id: GO:0032519
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: ATP + H2O + L-cysteine(in) = ADP + H+ + L-cysteine(out) + phosphate." [PMID:25837721, PMID:32144203, RHEA:29783]
-synonym: "ATP-dependent cysteine transporter activity" EXACT []
+synonym: "ABC-type cysteine transporter activity" BROAD []
+synonym: "ATP-dependent cysteine transporter activity" BROAD []
 synonym: "ATPase-coupled cysteine transmembrane transporter activity" RELATED []
 synonym: "ATPase-coupled cysteine transporter activity" RELATED []
 synonym: "cysteine exporter" RELATED []
 synonym: "cysteine-exporting ATPase activity" RELATED []
-synonym: "cysteine-transporting ATPase activity" EXACT []
+synonym: "cysteine-transporting ATPase activity" BROAD []
 xref: MetaCyc:RXN0-3
 xref: RHEA:29783
 is_a: GO:0015424 ! ABC-type amino acid transporter activity
-is_a: GO:0033229 ! cysteine transmembrane transporter activity
+is_a: GO:0033229 ! L-cysteine transmembrane transporter activity
 is_a: GO:0033284 ! ATPase-coupled carboxylic acid transmembrane transporter activity
 property_value: skos:exactMatch MetaCyc:RXN0-3
 property_value: skos:exactMatch RHEA:29783
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17289" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24076" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26941" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27479" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 
 [Term]
@@ -206909,7 +206904,6 @@
 namespace: biological_process
 def: "The directed movement of myo-inositol hexakisphosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "phytate transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033271 ! myo-inositol phosphate transport
 
 [Term]
@@ -219104,7 +219098,6 @@
 def: "The directed movement of ethanolamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Ethanolamine (2-aminoethanol, monoethanolamine) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids, such as phosphatidylethanolamine." [GOC:rn, PMID:3514579]
 synonym: "2-aminoethanol transport" EXACT []
 synonym: "monoethanolamine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 
@@ -223232,7 +223225,6 @@
 name: glutathione transport
 namespace: biological_process
 def: "The directed movement of glutathione, the tripeptide glutamylcysteinylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0042939 ! tripeptide transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -231122,7 +231114,6 @@
 def: "The process in which triose phosphate (glyceraldehyde 3-phosphate) is transported across a membrane. Glyceraldehyde 3-phosphate is any organic three carbon compound phosphate ester." [GOC:bf, ISBN:0198506732]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "triose phosphate membrane transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015717 ! triose phosphate transport
 is_a: GO:0055085 ! transmembrane transport
 created_by: bf
@@ -236580,7 +236571,7 @@
 synonym: "parathormone secretion" EXACT [PR:000013429]
 synonym: "parathyrin secretion" EXACT [PR:000013429]
 synonym: "PTH secretion" EXACT [PMID:12171519, PR:000013429]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 created_by: bf
 creation_date: 2011-06-22T09:28:54Z
 
@@ -236944,7 +236935,7 @@
 name: steroid hormone secretion
 namespace: biological_process
 def: "The regulated release of any steroid that acts as a hormone into the circulatory system." [GOC:sl]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 created_by: bf
 creation_date: 2011-07-20T01:01:00Z
@@ -244053,10 +244044,14 @@
 
 [Term]
 id: GO:0036506
-name: maintenance of unfolded protein
+name: obsolete maintenance of unfolded protein
 namespace: biological_process
-def: "Maintaining a protein in an unfolded, soluble state." [GOC:bf, GOC:BHF, GOC:nc, GOC:PARL, PMID:21636303]
-is_a: GO:0031647 ! regulation of protein stability
+def: "OBSOLETE. Maintaining a protein in an unfolded, soluble state." [GOC:bf, GOC:BHF, GOC:nc, GOC:PARL, PMID:21636303]
+comment: The reason for obsoletion is that this term describes a molecular function (holdase activity) rather than a biological process.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31758" xsd:anyURI
+is_obsolete: true
+consider: GO:0140309
+consider: GO:0140597
 created_by: bf
 creation_date: 2015-06-11T10:17:36Z
 
@@ -245141,7 +245136,7 @@
 synonym: "nitric oxide-cGMP-mediated signaling pathway" EXACT []
 synonym: "nitric oxide-cGMP-mediated signalling pathway" EXACT [GOC:mah]
 synonym: "NO-cGMP signaling pathway" EXACT [PMID:22019632]
-is_a: GO:0007263 ! nitric oxide mediated signal transduction
+is_a: GO:0141124 ! intracellular signaling cassette
 created_by: bf
 creation_date: 2012-01-10T05:32:39Z
 
@@ -259129,13 +259124,13 @@
 
 [Term]
 id: GO:0042883
-name: cysteine transport
+name: L-cysteine transport
 namespace: biological_process
-def: "The directed movement of cysteine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, ISBN:0198506732]
-synonym: "L-cysteine transport" NARROW []
+def: "The directed movement of L-cysteine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, ISBN:0198506732]
+synonym: "cysteine transport" BROAD []
 is_a: GO:0000101 ! sulfur amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
+is_a: GO:0015807 ! L-amino acid transport
 
 [Term]
 id: GO:0042884
@@ -259447,7 +259442,6 @@
 def: "The directed movement of an alkanesulfonate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Alkanesulfonates are organic esters or salts of sulfonic acid containing an aliphatic hydrocarbon radical." [PMID:31802112]
 synonym: "alkanesulfonate transport" BROAD []
 synonym: "alkanesulphonate transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -259549,7 +259543,6 @@
 namespace: biological_process
 def: "The directed movement of the siderochrome enterobactin, a cyclic trimer of 2, 3 dihydroxybenzoylserine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl]
 synonym: "enterochelin transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0015891 ! siderophore transport
 
@@ -262376,7 +262369,6 @@
 name: daunorubicin transport
 namespace: biological_process
 def: "The directed movement of daunorubicin, an anthracycline antibiotic produced by Streptomyces coeruleorubidus or S. peucetius and used as an antineoplastic into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, GOC:mlg]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
 
@@ -262738,7 +262730,7 @@
 name: sodium-dependent organic anion transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043252
@@ -262746,7 +262738,7 @@
 namespace: biological_process
 def: "The directed, sodium-independent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
 xref: Reactome:R-HSA-879518 "Organic anion transport by SLCO transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043253
@@ -273385,7 +273377,6 @@
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
 is_a: GO:0003674 ! molecular_function
-relationship: has_part GO:0051082 ! unfolded protein binding
 relationship: part_of GO:0006457 ! protein folding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30552" xsd:anyURI
 created_by: jl
@@ -281170,9 +281161,10 @@
 synonym: "protein import into mitochondrial inner membrane" EXACT []
 synonym: "protein transport into mitochondrial inner membrane" EXACT []
 is_a: GO:0007007 ! inner mitochondrial membrane organization
-is_a: GO:0051204 ! protein insertion into mitochondrial membrane
+is_a: GO:7770058 ! mitochondrial protein import pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15800" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29962" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
 
 [Term]
 id: GO:0045040
@@ -281193,18 +281185,16 @@
 namespace: biological_process
 alt_id: GO:0045043
 alt_id: GO:0045044
-def: "The import of proteins into the space between the inner and outer mitochondrial membranes." [ISBN:0716731363]
+def: "The import of proteins from the cytosol across the outer mitochondrial membrane into the intermembrane space." [ISBN:0716731363]
 synonym: "mitochondrial intermembrane space protein import" EXACT []
 synonym: "protein import into mitochondrial IMS" EXACT []
 synonym: "protein import into mitochondrial intermembrane space, direct" NARROW [GOC:mcc]
 synonym: "protein import into mitochondrial intermembrane space, nonconservative" NARROW [GOC:mcc]
 synonym: "protein transport into mitochondrial IMS" EXACT []
 synonym: "protein transport into mitochondrial intermembrane space" EXACT []
-is_a: GO:0010496 ! intercellular transport
-is_a: GO:0070585 ! protein localization to mitochondrion
-is_a: GO:0071806 ! protein transmembrane transport
-is_a: GO:0072594 ! establishment of protein localization to organelle
+is_a: GO:7770058 ! mitochondrial protein import pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29962" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
 
 [Term]
 id: GO:0045042
@@ -283622,6 +283612,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 
 [Term]
 id: GO:0045276
@@ -283653,6 +283644,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27727" xsd:anyURI
 
 [Term]
@@ -283964,8 +283956,10 @@
 synonym: "nor-spermidine biosynthesis" EXACT []
 synonym: "nor-spermidine formation" EXACT []
 synonym: "nor-spermidine synthesis" EXACT []
+xref: MetaCyc:PWY-6562
 is_a: GO:0006596 ! polyamine biosynthetic process
 is_a: GO:0046204 ! nor-spermidine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0045313
@@ -284621,7 +284615,7 @@
 namespace: biological_process
 def: "The regulated release of juvenile hormones, the three sesquiterpenoid derivatives that function to maintain the larval state of insects at molting and that may be required for other processes, e.g. oogenesis." [GOC:curators, ISBN:0198547684]
 is_a: GO:0046865 ! terpenoid transport
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 
 [Term]
@@ -294650,6 +294644,10 @@
 synonym: "spermidine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008216 ! spermidine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046204
@@ -294699,6 +294697,10 @@
 synonym: "spermine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008215 ! spermine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046209
@@ -300891,18 +300893,15 @@
 
 [Term]
 id: GO:0046715
-name: active borate transmembrane transporter activity
+name: obsolete active borate transmembrane transporter activity
 namespace: molecular_function
 alt_id: GO:0080138
-def: "Enables the transport of borate across a membrane against the concentration gradient." [PMID:12447444]
-synonym: "borate transmembrane transporter activity" BROAD []
-synonym: "borate uptake transmembrane transporter activity" RELATED []
-synonym: "boron transmembrane transporter activity" RELATED []
-synonym: "boron uptake transmembrane transporter activity" RELATED []
-synonym: "efflux-type borate transporter" NARROW []
-synonym: "efflux-type boron transporter" RELATED []
-is_a: GO:0022804 ! active transmembrane transporter activity
-relationship: part_of GO:0035445 ! borate transmembrane transport
+def: "OBSOLETE. Enables the transport of borate across a membrane against the concentration gradient." [PMID:12447444]
+comment: The reason for obsoletion is that the term is not clearly defined and usage has been inconsistent.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27488" xsd:anyURI
+is_obsolete: true
+consider: GO:0080139
+consider: GO:0180044
 created_by: dhl
 creation_date: 2009-05-19T04:09:56Z
 
@@ -303290,7 +303289,6 @@
 name: carboxylic acid transport
 namespace: biological_process
 def: "The directed movement of carboxylic acids into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carboxylic acids are organic acids containing one or more carboxyl (COOH) groups or anions (COO-)." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 
 [Term]
@@ -303387,21 +303385,24 @@
 id: GO:0046951
 name: ketone body biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of ketone bodies, any one of the three substances: acetoacetate, D-3-hydroxybutyrate (beta-hydroxybutyrate) or acetone. Biosynthesis involves the formation of hydroxymethylglutaryl-CoA, which is cleaved to acetate and acetyl-CoA." [ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the formation of ketone bodies, any one of the three substances: acetoacetate, D-3-hydroxybutyrate (beta-hydroxybutyrate) or acetone. Biosynthesis involves the formation of hydroxymethylglutaryl-CoA, which is cleaved to acetate and acetyl-CoA." [MetaCyc:PWY66-367]
+synonym: "ketogenesis" EXACT []
 synonym: "ketone body anabolism" EXACT []
 synonym: "ketone body biosynthesis" EXACT []
 synonym: "ketone body formation" EXACT []
 synonym: "ketone body synthesis" EXACT []
+xref: MetaCyc:PWY66-367
 xref: Reactome:R-HSA-77111 "Synthesis of Ketone Bodies"
 is_a: GO:0044283 ! small molecule biosynthetic process
 is_a: GO:1901570 ! fatty acid derivative biosynthetic process
 is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
 
 [Term]
 id: GO:0046952
 name: ketone body catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of ketone bodies, any one of the three substances: acetoacetate, D-3-hydroxybutyrate (beta-hydroxybutyrate) or acetone. Ketone bodies can be used as an energy source as an alternative to glucose. Utilization of ketone bodies in peripheral tissues involves conversion of acetoacetate to acetoacetyl-CoA, which is then converted to two molecules of acetyl-CoA." [ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of ketone bodies, any one of the three substances: acetoacetate, D-3-hydroxybutyrate (beta-hydroxybutyrate) or acetone. Ketone bodies can be used as an energy source as an alternative to glucose. Utilization of ketone bodies in peripheral tissues involves conversion of acetoacetate to acetoacetyl-CoA, which is then converted to two molecules of acetyl-CoA." [MetaCyc:PWY66-367]
 synonym: "ketolysis" EXACT [MetaCyc:PWY66-368]
 synonym: "ketone body breakdown" EXACT []
 synonym: "ketone body catabolism" EXACT []
@@ -303412,6 +303413,7 @@
 is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:1901569 ! fatty acid derivative catabolic process
 is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
 
 [Term]
 id: GO:0046956
@@ -303534,7 +303536,6 @@
 synonym: "3'-phosphoadenosine 5'-phosphosulphate transport" EXACT []
 synonym: "adenosine 3'-phosphate 5'-phosphosulfate transport" EXACT []
 synonym: "PAPS transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -323865,7 +323866,6 @@
 namespace: biological_process
 def: "The directed movement of epinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jid]
 synonym: "adrenaline transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051937 ! catecholamine transport
 
 [Term]
@@ -346394,17 +346394,17 @@
 
 [Term]
 id: GO:0051082
-name: unfolded protein binding
+name: obsolete unfolded protein binding
 namespace: molecular_function
-def: "Binding to an unfolded protein." [GOC:ai]
-subset: goslim_chembl
-subset: goslim_drosophila
-subset: goslim_yeast
-synonym: "chaperone activity" BROAD []
+def: "OBSOLETE. Binding to an unfolded protein." [GOC:ai]
+comment: The reason for obsoletion is that this binding term should be replaced by an activity term such as protein folding chaperone (GO:0044183) or unfolded protein holdase activity (GO:0140309).
 xref: Reactome:R-HSA-9683772 "Trimmed spike protein binds to calnexin"
 xref: Reactome:R-HSA-9694337 "Trimmed spike protein binds to calnexin"
-is_a: GO:0005515 ! protein binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21436" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30962" xsd:anyURI
+is_obsolete: true
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0051083
@@ -351145,7 +351145,6 @@
 synonym: "adrenotropin secretion" EXACT []
 synonym: "corticotropic hormone secretion" EXACT []
 is_a: GO:0030072 ! peptide hormone secretion
-is_a: GO:0060986 ! endocrine hormone secretion
 
 [Term]
 id: GO:0051459
@@ -379779,11 +379778,13 @@
 
 [Term]
 id: GO:0060986
-name: endocrine hormone secretion
+name: obsolete endocrine hormone secretion
 namespace: biological_process
-def: "The regulated release of a hormone into the circulatory system." [GOC:dph]
-is_a: GO:0046879 ! hormone secretion
-relationship: part_of GO:0050886 ! endocrine process
+def: "OBSOLETE. The regulated release of a hormone into the circulatory system." [GOC:dph]
+comment: The reason for obsoletion is that this term represents fake precision. The distinction between endocrine and other modes of hormone dispersal (paracrine, autocrine) is not always clear-cut, and this term was unevenly used relative to its parent.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17084" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046879
 created_by: dph
 creation_date: 2010-01-11T09:03:48Z
 
@@ -385846,7 +385847,6 @@
 def: "The controlled release of histamine by a cell, in which the histamine acts as a neurotransmitter." [GOC:dph]
 is_a: GO:0001821 ! histamine secretion
 is_a: GO:0007269 ! neurotransmitter secretion
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: dph
@@ -395081,7 +395081,7 @@
 id: GO:0070147
 name: mitochondrial cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
 is_a: GO:0006423 ! cysteinyl-tRNA aminoacylation
 is_a: GO:0070127 ! tRNA aminoacylation for mitochondrial protein translation
 intersection_of: GO:0006423 ! cysteinyl-tRNA aminoacylation
@@ -395231,7 +395231,7 @@
 namespace: biological_process
 def: "The regulated release of adiponectin, a protein hormone, by adipose tissue." [GOC:BHF, GOC:rl]
 is_a: GO:0009306 ! protein secretion
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0070163
@@ -401481,7 +401481,7 @@
 name: sodium-dependent organic cation transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:BHF, GOC:mah]
-is_a: GO:0015695 ! organic cation transport
+is_a: GO:0055085 ! transmembrane transport
 created_by: mah
 creation_date: 2009-06-09T03:26:27Z
 
@@ -401639,7 +401639,6 @@
 namespace: biological_process
 def: "The directed movement of cyclic AMP (cAMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic AMP transport" EXACT [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -401653,7 +401652,6 @@
 def: "The directed movement of cyclic GMP (cGMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic GMP transport" EXACT [GOC:mah]
 is_a: GO:0001408 ! guanine nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
 created_by: mah
@@ -402628,7 +402626,6 @@
 namespace: biological_process
 def: "The process in which glycerol-2-phosphate is transported across a membrane. Glycerol-2-phosphate is a phosphoric monoester of glycerol." [GOC:mah]
 synonym: "glycerol-2-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -402932,7 +402929,6 @@
 namespace: biological_process
 def: "The directed movement of dehydroascorbate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dehydroascorbate, 5-(1,2-dihydroxyethyl)furan-2,3,4(5H)-trione, is an oxidized form of vitamin C." [GOC:sl]
 synonym: "dehydroascorbate transport" EXACT [GOC:sl]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 created_by: mah
 creation_date: 2009-07-30T05:24:31Z
@@ -403279,6 +403275,8 @@
 intersection_of: GO:0098590 ! plasma membrane region
 intersection_of: part_of GO:0043332 ! mating projection tip
 relationship: part_of GO:0043332 ! mating projection tip
+relationship: part_of GO:0070250 ! mating projection membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31775" xsd:anyURI
 created_by: mah
 creation_date: 2009-08-19T04:05:58Z
 
@@ -416412,7 +416410,6 @@
 namespace: biological_process
 def: "The directed movement of a phytochelatin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Phytochelatins are a group of peptides that bind metals (Cd, Zn, Cu, Pb, Hg) in thiolate coordination complexes." [GOC:mah, ISBN:0198506732]
 synonym: "cadystin transport" RELATED [GOC:vw, Wikipedia:Phytochelatin#History]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: mah
 creation_date: 2010-10-25T01:57:55Z
@@ -420147,7 +420144,6 @@
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "UDP-galactose membrane transport" EXACT []
 synonym: "UDP-galactose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: mah
 creation_date: 2010-11-03T02:03:36Z
@@ -429183,8 +429179,6 @@
 namespace: biological_process
 def: "The directed movement of AMP, adenosine monophosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [PMID:18923018]
 synonym: "adenosine monophosphate transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 created_by: dhl
@@ -429478,7 +429472,7 @@
 id: GO:0080145
 name: intracellular cysteine homeostasis
 namespace: biological_process
-def: "A homeostatic process involved in the maintenance of a steady state level of cysteine within a cell." [PMID:19955263]
+def: "A homeostatic process involved in the maintenance of a steady state level of L-cysteine within a cell." [PMID:19955263]
 synonym: "cellular cysteine homeostasis" EXACT []
 synonym: "cysteine homeostasis" EXACT []
 is_a: GO:0080144 ! intracellular amino acid homeostasis
@@ -431835,7 +431829,6 @@
 name: L-histidine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-histidine across a membrane." [PMID:21307582]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -447306,7 +447299,6 @@
 def: "The directed movement of L-arginine from outside of a cell, across the plasma membrane and into the cytosol." [GOC:krc, PMID:8195186]
 synonym: "arginine import" BROAD []
 synonym: "L-arginine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: tb
@@ -482640,13 +482632,14 @@
 id: GO:0140053
 name: mitochondrial gene expression
 namespace: biological_process
-def: "The process in which a mitochondrial gene's sequence is converted into a mature gene product or products (proteins or RNA). This includes the production of an RNA transcript as well as any processing to produce a mature RNA product or an mRNA or circRNA (for protein-coding genes) and the translation of that mRNA or circRNA into protein. Protein maturation is included when required to form an active form of a product from an inactive precursor form." [PMID:27058308]
+def: "The process of transcribing and translating the mitochondrial genome (mtDNA) to produce at least a subset of oxidative phosphorylation (OXPHOS) proteins, 2 rRNAs, and mitochondrial tRNAs, which are critical for ATP production. Protein maturation is included when required to form an active form of a product from an inactive precursor form." [PMID:27058308, PMID:31861673, PMID:38117001]
 subset: goslim_generic
 subset: goslim_pombe
 is_a: GO:0010467 ! gene expression
 intersection_of: GO:0010467 ! gene expression
 intersection_of: occurs_in GO:0005739 ! mitochondrion
 relationship: occurs_in GO:0005739 ! mitochondrion
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31659" xsd:anyURI
 created_by: pg
 creation_date: 2017-06-26T10:57:45Z
 
@@ -486538,7 +486531,6 @@
 name: cyclic-GMP-AMP transmembrane import across plasma membrane
 namespace: biological_process
 def: "The directed movement of cyclic-GMP-AMP from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31126740]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -487051,6 +487043,16 @@
 creation_date: 2026-03-06T09:07:34Z
 
 [Term]
+id: GO:0140401
+name: 4-phosphoerythronate phosphatase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: 4-phospho-D-erythronate + H2O = D-erythronate + phosphate." [PMID:27294321]
+is_a: GO:0016791 ! phosphatase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31118" xsd:anyURI
+created_by: pg
+creation_date: 2026-04-02T12:52:47Z
+
+[Term]
 id: GO:0140403
 name: effector-mediated suppression of host innate immune response
 namespace: biological_process
@@ -487908,7 +487910,6 @@
 name: 5-aminolevulinic acid import across plasma membrane
 namespace: biological_process
 def: "The directed movement of 5-aminolevulinic acid from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31989647]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015718 ! monocarboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -491994,7 +491995,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-beta-L-arabinofuranose from the cytosol to the Golgi apparatus of a cell." [PMID:28373556]
 synonym: "cytosol to Golgi apparatus UDP-beta-L-arabinofuranose transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 is_a: GO:0140820 ! cytosol to Golgi apparatus transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21524" xsd:anyURI
@@ -493462,7 +493462,6 @@
 name: L-phenylalanine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of L-phenylalanine from outside of a cell, across the plasma membrane and into the cytosol." [PMID:11069779]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015823 ! phenylalanine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -496305,7 +496304,7 @@
 name: regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
+is_a: GO:1902531 ! regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496318,8 +496317,8 @@
 name: positive regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:14615391]
-is_a: GO:0010750 ! positive regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902533 ! positive regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496332,8 +496331,8 @@
 name: negative regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that decreases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010751 ! negative regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -501136,14 +501135,16 @@
 
 [Term]
 id: GO:0160203
-name: mitochondrial disulfide relay system
+name: protein import into the intermembrane space via the disulfide relay system
 namespace: biological_process
-def: "A protein folding process that facilitates the import of a subset of soluble proteins into mitochondrial intermembrane space via disulfide bond formation." [PMID:32936885, PMID:37159021]
+def: "The import of small cysteine-containing proteins from the cytosol across the outer mitochondrial membrane via the TOM complex driven by oxidative folding." [PMID:32936885, PMID:37159021]
+synonym: "CHCHD4/Mia40-dependent import" NARROW []
 synonym: "MIA pathway" EXACT []
+synonym: "mitochondrial disulfide relay system" EXACT []
 synonym: "mitochondrial intermembrane space assembly pathway" EXACT []
-is_a: GO:0006457 ! protein folding
-relationship: part_of GO:0045041 ! protein import into mitochondrial intermembrane space
+is_a: GO:0045041 ! protein import into mitochondrial intermembrane space
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28663" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
 created_by: rynl
 creation_date: 2024-08-05T23:59:12Z
 
@@ -502345,9 +502346,11 @@
 name: 6-carboxymethyl-5-methyl-4-hydroxypyridin-2-ol 3-C-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 6-carboxymethyl-5-methyl-4-hydroxypyridin-2-ol + S-adenosyl-L-methionine = 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + S-adenosyl-L-homocysteine + H+." [PMID:27391308, RHEA:85483]
+xref: EC:2.1.1.400
 xref: KEGG_REACTION:R13499
 xref: RHEA:85483
 is_a: GO:0008168 ! methyltransferase activity
+property_value: skos:exactMatch EC:2.1.1.400
 property_value: skos:exactMatch RHEA:85483
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30721" xsd:anyURI
 created_by: rynl
@@ -502445,8 +502448,8 @@
 name: dopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of dopamine neurotransmitters into a synaptic vesicle." [PMID:29666153]
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:0015872 ! dopamine transport
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
 creation_date: 2025-12-02T22:02:35Z
@@ -502456,7 +502459,7 @@
 name: tyramine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of tyramine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:7770032 ! tyramine transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
@@ -502467,7 +502470,7 @@
 name: octopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of octopamine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:7770033 ! octopamine transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
@@ -502976,7 +502979,6 @@
 name: isopentenyl pyrophosphate import into mitochondrion
 namespace: biological_process
 def: "The process in which isopentenyl pyrophosphate is transported across a membrane into the mitochondrion." [GOC:ew, PMID:37813972]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0032365 ! intracellular lipid transport
 is_a: GO:0170036 ! import into the mitochondrion
@@ -520018,7 +520020,6 @@
 synonym: "deoxycarnitine transport" RELATED [GOC:TermGenie]
 synonym: "gamma-Butyrobetain transport" EXACT [GOC:TermGenie]
 synonym: "gamma-butyrobetaine transport" EXACT [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 created_by: jl
 creation_date: 2012-05-29T02:32:37Z
@@ -520049,7 +520050,6 @@
 synonym: "Adriamycin transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicine transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicinum transport" RELATED [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
@@ -542412,7 +542412,6 @@
 name: L-lysine transport
 namespace: biological_process
 def: "The directed movement of a L-lysine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: kmv
 creation_date: 2013-03-27T16:09:06Z
@@ -542422,7 +542421,6 @@
 name: L-histidine transport
 namespace: biological_process
 def: "The directed movement of a L-histidine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015802 ! basic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -549014,7 +549012,6 @@
 name: ceramide 1-phosphate transport
 namespace: biological_process
 def: "The directed movement of a ceramide 1-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:TermGenie, PMID:23863933]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0035627 ! ceramide transport
 created_by: uh
@@ -551452,7 +551449,6 @@
 namespace: biological_process
 def: "The process in which 5'-adenylyl sulfate is transported across a membrane." [GOC:TermGenie, PMID:24296033]
 synonym: "adenosine 5'-phosphosulfate transmembrane transport" EXACT [PMID:24296033]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -573769,12 +573765,13 @@
 
 [Term]
 id: GO:1903712
-name: cysteine transmembrane transport
+name: L-cysteine transmembrane transport
 namespace: biological_process
-def: "The directed movement of cysteine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:17435223]
-is_a: GO:0003333 ! amino acid transmembrane transport
-is_a: GO:0042883 ! cysteine transport
-is_a: GO:1905039 ! carboxylic acid transmembrane transport
+def: "The directed movement of L-cysteine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:17435223]
+synonym: "cysteine transmembrane transport" BROAD []
+is_a: GO:0042883 ! L-cysteine transport
+is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27479" xsd:anyURI
 created_by: vw
 creation_date: 2014-12-06T08:15:06Z
 
@@ -575021,7 +575018,6 @@
 name: L-valine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-valine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:20944394]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015829 ! valine transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: al
@@ -575473,7 +575469,6 @@
 synonym: "isoleucine import" BROAD []
 synonym: "L-isoleucine import" BROAD []
 synonym: "L-isoleucine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903714 ! isoleucine transmembrane transport
@@ -575489,7 +575484,6 @@
 synonym: "L-threonine import" BROAD []
 synonym: "L-threonine import into cell" EXACT []
 synonym: "L-threonine uptake" EXACT [GOC:bf]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015826 ! threonine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -575535,7 +575529,6 @@
 synonym: "asparagine import" BROAD []
 synonym: "L-asparagine import into cell" EXACT []
 is_a: GO:0006867 ! asparagine transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903713 ! asparagine transmembrane transport
@@ -575796,7 +575789,6 @@
 synonym: "L-arginine import" NARROW []
 synonym: "L-arginine transport" BROAD []
 synonym: "L-arginine uptake" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1990822 ! basic amino acid transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22228" xsd:anyURI
@@ -590185,15 +590177,17 @@
 
 [Term]
 id: GO:1904541
-name: fungal-type cell wall disassembly involved in conjugation with cellular fusion
+name: mating projection tip cell wall disassembly
 namespace: biological_process
-def: "Any fungal-type cell wall disassembly that is involved in conjugation with cellular fusion." [GO_REF:0000060, GOC:TermGenie, PMID:25825517]
+def: "Any fungal-type cell wall disassembly that is involved in conjugation with cellular fusion, where the cell wall is locally disassembled to enable conjugation with cellular fusion." [GO_REF:0000060, GOC:TermGenie, PMID:25825517]
 synonym: "fungal-type cell wall disassembly involved in cell fusion" RELATED [GOC:TermGenie]
+synonym: "fungal-type cell wall disassembly involved in conjugation with cellular fusion" EXACT []
 synonym: "fungal-type cell wall disassembly involved in mating" RELATED [GOC:TermGenie]
 is_a: GO:0071853 ! fungal-type cell wall disassembly
 intersection_of: GO:0071853 ! fungal-type cell wall disassembly
 intersection_of: part_of GO:0000747 ! conjugation with cellular fusion
 relationship: part_of GO:0000747 ! conjugation with cellular fusion
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31753" xsd:anyURI
 created_by: al
 creation_date: 2015-08-10T17:12:51Z
 
@@ -591188,10 +591182,10 @@
 def: "The aggregation, arrangement and bonding together of a set of components to form an actin fusion focus." [GO_REF:0000079, GOC:TermGenie, PMID:25825517]
 synonym: "actin fusion focus assembly" BROAD []
 synonym: "actin fusion focus formation" EXACT [GOC:TermGenie]
-is_a: GO:0010927 ! cellular component assembly involved in morphogenesis
 is_a: GO:0030036 ! actin cytoskeleton organization
-relationship: part_of GO:0031382 ! mating projection formation
+relationship: part_of GO:0000755 ! cytogamy
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21688" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-26T10:34:48Z
 
@@ -591204,6 +591198,8 @@
 synonym: "protein localisation to actin fusion focus" EXACT [GOC:TermGenie]
 synonym: "protein localization in actin fusion focus" EXACT [GOC:TermGenie]
 is_a: GO:0015031 ! protein transport
+relationship: part_of GO:0000755 ! cytogamy
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-26T10:36:22Z
 
@@ -598910,6 +598906,7 @@
 synonym: "regulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0010155 ! regulation of proton transport
 is_a: GO:0022898 ! regulation of transmembrane transporter activity
+is_a: GO:0051341 ! regulation of oxidoreductase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0004129 ! cytochrome-c oxidase activity
 relationship: regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -599002,6 +598999,7 @@
 synonym: "upregulation of NADH cytochrome c oxidase" EXACT [GOC:TermGenie]
 synonym: "upregulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0032414 ! positive regulation of ion transmembrane transporter activity
+is_a: GO:0051353 ! positive regulation of oxidoreductase activity
 is_a: GO:1904959 ! regulation of cytochrome-c oxidase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -602559,7 +602557,6 @@
 name: carcinine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of carcinine from outside of a cell, across the plasma membrane and into the cytosol." [GO_REF:0000075, GOC:dph, GOC:TermGenie, PMID:26653853, PMID:26713872]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0098739 ! import across plasma membrane
@@ -606131,7 +606128,6 @@
 synonym: "sphingoid transport" RELATED []
 synonym: "sphingosine transport" NARROW []
 is_a: GO:0006869 ! lipid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2016-07-22T01:40:59Z
@@ -624842,7 +624838,6 @@
 alt_id: GO:0015788
 def: "The process in which UDP-N-acetylglucosamine is transported across a membrane." [PMID:10788474]
 synonym: "UDP-N-acetylglucosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: vw
 creation_date: 2014-11-27T11:56:35Z
@@ -624854,7 +624849,6 @@
 alt_id: GO:0015784
 def: "The process in which GDP-mannose is transported across a membrane." [PMID:9395539]
 synonym: "GDP-mannose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090480 ! purine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: vw
@@ -627333,7 +627327,7 @@
 id: GO:1990799
 name: mitochondrial tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:15509579]
+def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:15509579]
 is_a: GO:0002143 ! tRNA wobble position uridine thiolation
 is_a: GO:0070899 ! mitochondrial tRNA wobble uridine modification
 is_a: GO:0070903 ! mitochondrial tRNA thio-modification
@@ -627571,7 +627565,6 @@
 name: L-arginine transmembrane export from vacuole
 namespace: biological_process
 def: "The directed movement of L-arginine out of the vacuole, across the vacuolar membrane." [PMID:26083598]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0032974 ! amino acid transmembrane export from vacuole
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: vw
@@ -627581,13 +627574,14 @@
 id: GO:1990819
 name: mating projection actin fusion focus
 namespace: cellular_component
-def: "A focus at the mating projection tip where the cell wall is degraded during conjugation with cellular fusion. Actin filaments form an aster-like structure from this location." [PMID:25825517]
+def: "A focus at the mating projection tip where the cell wall is degraded during cytogamy. Actin filaments form an aster-like structure from this location." [PMID:25825517]
 synonym: "actin fusion focus" BROAD []
 is_a: GO:0110165 ! cellular anatomical structure
 relationship: has_part GO:0005884 ! actin filament
 relationship: part_of GO:0015629 ! actin cytoskeleton
 relationship: part_of GO:0043332 ! mating projection tip
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21449" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-10T16:52:15Z
 
@@ -645257,7 +645251,6 @@
 name: N-methylnicotinate transport
 namespace: biological_process
 def: "The directed movement of a N-methylnicotinateacetate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:obol]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015697 ! quaternary ammonium group transport
 created_by: tb
 creation_date: 2011-10-18T05:16:08Z
@@ -648099,7 +648092,6 @@
 name: octopamine transport
 namespace: biological_process
 def: "The directed movement of octopamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Octopamine is a monoamine neurotransmitter occurring predominantly in invertebrates." [PMID:15849736, PMID:32305263, PMID:9870940]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
@@ -648387,6 +648379,75 @@
 created_by: dragon-ai-agent
 creation_date: 2026-03-24T17:37:00Z
 
+[Term]
+id: GO:7770057
+name: copper ion import into Golgi lumen
+namespace: biological_process
+def: "The directed import of copper cation from the cytosol across the Golgi membrane into the Golgi lumen." [PMID:7708696, PMID:9325307]
+synonym: "copper ion import across Golgi membrane" EXACT []
+synonym: "copper ion import into Golgi apparatus" EXACT []
+synonym: "copper ion import into the Golgi" EXACT []
+synonym: "cytosol to Golgi apparatus copper transport" EXACT []
+is_a: GO:0035434 ! copper ion transmembrane transport
+is_a: GO:0140820 ! cytosol to Golgi apparatus transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31723" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-01T09:01:56Z
+
+[Term]
+id: GO:7770058
+name: mitochondrial protein import pathway
+namespace: biological_process
+def: "The import of proteins from the cytosol to their final destination in the mitochondria." [PMID:36931257]
+synonym: "mitochondrial protein import" EXACT []
+is_a: GO:0006839 ! mitochondrial transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-01T10:06:36Z
+
+[Term]
+id: GO:7770059
+name: alpha helical protein insertion into mitochondrial outer membrane
+namespace: biological_process
+def: "The import of alpha helical and tail-anchored proteins from the cytosol and their insertion into the mitochondrial outer membrane." [PMID:40782022]
+comment: In yeast, the insertase is the mitochondrial import (MIM) complex, composed of Mim1 and Mim2. In higher eukaryotes, the functional counterpart MTCH performs a similar role despite lacking sequence and structural homology, reflecting convergent evolution.
+synonym: "MIM pathway" NARROW []
+synonym: "MTCH pathway" NARROW []
+is_a: GO:0006886 ! intracellular protein transport
+is_a: GO:0010496 ! intercellular transport
+is_a: GO:0045040 ! protein insertion into mitochondrial outer membrane
+is_a: GO:0070585 ! protein localization to mitochondrion
+is_a: GO:0072657 ! protein localization to membrane
+is_a: GO:7770058 ! mitochondrial protein import pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-01T12:53:29Z
+
+[Term]
+id: GO:7770060
+name: TOM-TIM23-SORT-mediated protein insertion into the mitochondrial inner membrane
+namespace: biological_process
+def: "The import of proteins from the cytosol across the outer mitochondrial membrane and laterally inserted into the inner membrane. Typically acting on single-pass transmembrane proteins with an N-terminal targeting sequence and an internal hydrophobic stop-transfer sequence which targets them for lateral insertion." [PMID:36931257]
+comment: Some proteins utilize this pathway but can be further processed and released from the inner membrane into the IMS.
+synonym: "stop-transfer pathway" RELATED []
+synonym: "TOM-TIM23-SORT pathway" EXACT []
+is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-01T13:32:53Z
+
+[Term]
+id: GO:7770061
+name: TOM-TIM22-mediated mitochondrial inner membrane protein insertion
+namespace: biological_process
+def: "The import of multipass-membrane proteins from the cytosol and their insertion into the mitochondrial inner membrane, supported by tiny-tim chaperones." [PMID:36931257]
+synonym: "carrier import pathway" NARROW []
+synonym: "carrier pathway" NARROW []
+is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-01T16:37:07Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
