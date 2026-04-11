# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-04-11 05:58:09.123002305 +0000
+++ go.obo	2026-04-11 06:07:16.902794378 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-03-25
+data-version: releases/2026-04-11
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-03-25" xsd:string
+property_value: owl:versionInfo "2026-04-11" xsd:string
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
@@ -543,12 +543,15 @@
 
 [Term]
 id: GO:0000052
-name: citrulline metabolic process
+name: obsolete citrulline metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "citrulline metabolism" EXACT []
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
-is_a: GO:1901605 ! alpha-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0019240
+consider: GO:0019241
 
 [Term]
 id: GO:0000053
@@ -1819,7 +1822,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "inactivation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0000175
@@ -5818,14 +5821,15 @@
 
 [Term]
 id: GO:0000750
-name: pheromone-dependent signal transduction involved in conjugation with cellular fusion
+name: obsolete pheromone-dependent signal transduction involved in conjugation with cellular fusion
 namespace: biological_process
 alt_id: GO:0007330
 alt_id: GO:0030454
-def: "A signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion. An example of this process is found in Saccharomyces cerevisiae." [GOC:clt]
-synonym: "transduction of mating signal" BROAD []
-is_a: GO:0032005 ! signal transduction involved in positive regulation of conjugation with cellular fusion
-relationship: part_of GO:0000749 ! response to pheromone triggering conjugation with cellular fusion
+def: "OBSOLETE. A signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion. An example of this process is found in Saccharomyces cerevisiae." [GOC:clt]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0000751
@@ -9883,7 +9887,6 @@
 name: glycerophosphodiester transmembrane transport
 namespace: biological_process
 def: "The process in which a glycerophosphodiester is transported across a membrane. Glycerophosphodiesters are small molecules composed of glycerol-3-phosphate and an alcohol, for example, glycerophosphoinositol." [GOC:mcc, PMID:12912892]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -13143,8 +13146,9 @@
 synonym: "5-HT secretion" EXACT []
 synonym: "5-hydroxytryptamine secretion" EXACT []
 synonym: "serotonin release" RELATED [GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0023061 ! signal release
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0001821
@@ -16125,8 +16129,8 @@
 def: "An actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell, contain an F-actin-rich core surrounded by a ring structure containing proteins such as vinculin and talin, and have a diameter of 0.5 mm." [PMID:12837608, PMID:15890982]
 comment: Note that podosomes can be distinguished from other F-actin-rich structures or from other matrix contacts. For example, focal adhesions and focal contacts do not display a core structure of F-actin. Unlike focal adhesions, podosome assembly does not require de novo protein synthesis. However, most of the podosome ring components are found in focal adhesions and other cell-matrix contacts. Podosomes are typically found in cells that cross tissue boundaries, recruited to the leading edge of migrating cells, and are often sites of extracellular matrix degradation.
 xref: Wikipedia:Podosome
-is_a: GO:0043232 ! intracellular membraneless organelle
-relationship: part_of GO:0015629 ! actin cytoskeleton
+is_a: GO:0098858 ! actin-based cell projection
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0002103
@@ -16456,7 +16460,7 @@
 id: GO:0002143
 name: tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:16871210]
+def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:16871210]
 comment: In E. coli, the first step of the reaction is reductive elimination of sulfur from L-cysteine by IscS cysteine desulfurase to form an enzyme-bound cysteine-persulfide intermediate. Then, five essential gene products, TusA, TusB, TusC, TusD and TusE, mediate a sulfur relay that delivers the terminal sulfur of persulfide from IscS to MnmA12. The last protein, MnmA catalyzes the transfer of the sulfur from IscS to an ATP activated U34 of the tRNA.
 synonym: "tRNA wobble uridine thiolation" EXACT [GOC:mah]
 synonym: "wobble position s2U biosynthesis" EXACT []
@@ -31376,7 +31380,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003755
@@ -31445,7 +31449,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003762
@@ -33513,11 +33517,12 @@
 
 [Term]
 id: GO:0003875
-name: ADP-ribosylarginine hydrolase activity
+name: ADP-ribosylarginine-[protein] hydrolase activity
 namespace: molecular_function
 def: "Catalysis of the reactions: H2O + N(omega)-(ADP-D-ribosyl)-L-arginyl-[protein] = ADP-D-ribose + L-arginyl-[protein], and H2O + N(omega)-(ADP-D-ribosyl)-L-arginine = ADP-D-ribose + L-arginine." [EC:3.2.2.19]
 synonym: "ADP-ribose-L-arginine cleavage enzyme activity" RELATED [EC:3.2.2.19]
 synonym: "ADP-ribose-L-arginine cleaving enzyme activity" RELATED [EC:3.2.2.19]
+synonym: "ADP-ribosylarginine hydrolase activity" EXACT []
 synonym: "ADPribosylarginine hydrolase activity" EXACT []
 synonym: "N(omega)-(ADP-D-ribosyl)-L-arginine ADP-ribosylhydrolase activity" RELATED [EC:3.2.2.19]
 synonym: "nomega-(ADP-D-ribosyl)-L-arginine ADP-ribosylhydrolase activity" RELATED [EC:3.2.2.19]
@@ -33525,8 +33530,10 @@
 synonym: "protein ADP-ribosylarginine hydrolase activity" RELATED [EC:3.2.2.19]
 synonym: "protein-nomega-(ADP-D-ribosyl)-L-arginine ADP-ribosylhydrolase activity" RELATED [EC:3.2.2.19]
 xref: EC:3.2.2.19
+xref: MetaCyc:3.2.2.24-RXN {xref="skos:narrowMatch"}
 xref: MetaCyc:ADP-RIBOSYLARGININE-HYDROLASE-RXN
 xref: MetaCyc:RXN-8732
+xref: RHEA:14493
 xref: RHEA:14885
 xref: RHEA:20784
 is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
@@ -33534,9 +33541,11 @@
 property_value: skos:exactMatch EC:3.2.2.19
 property_value: skos:narrowMatch MetaCyc:ADP-RIBOSYLARGININE-HYDROLASE-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-8732
+property_value: skos:narrowMatch RHEA:14493
 property_value: skos:narrowMatch RHEA:14885
 property_value: skos:narrowMatch RHEA:20784
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
 
 [Term]
 id: GO:0003876
@@ -35794,7 +35803,7 @@
 xref: RHEA:78903
 xref: RHEA:78907
 xref: UM-BBD_reactionID:r1051
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.16
 property_value: skos:exactMatch RHEA:21564
 property_value: skos:narrowMatch RHEA:34799
@@ -36563,7 +36572,6 @@
 xref: RHEA:42340
 xref: RHEA:42384
 xref: RHEA:45764
-xref: RHEA:47152
 xref: RHEA:47932
 xref: RHEA:59432
 xref: RHEA:60688
@@ -36604,7 +36612,6 @@
 property_value: skos:narrowMatch RHEA:42340
 property_value: skos:narrowMatch RHEA:42384
 property_value: skos:narrowMatch RHEA:45764
-property_value: skos:narrowMatch RHEA:47152
 property_value: skos:narrowMatch RHEA:47932
 property_value: skos:narrowMatch RHEA:59432
 property_value: skos:narrowMatch RHEA:60688
@@ -38880,12 +38887,13 @@
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
@@ -39875,7 +39883,7 @@
 xref: KEGG_REACTION:R02375
 xref: MetaCyc:ECDYSONE-O-ACYLTRANSFERASE-RXN
 xref: RHEA:15217
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.139
 property_value: skos:exactMatch RHEA:15217
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -42787,7 +42795,7 @@
 xref: EC:2.3.1.86
 xref: MetaCyc:FATTY-ACYL-COA-SYNTHASE-RXN
 xref: RHEA:22896
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.86
 property_value: skos:exactMatch RHEA:22896
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -43850,7 +43858,7 @@
 xref: RHEA:37199
 xref: RHEA:37203
 xref: RHEA:37463
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.15
 property_value: skos:exactMatch RHEA:15325
 property_value: skos:narrowMatch RHEA:35723
@@ -44112,7 +44120,6 @@
 xref: Reactome:R-HSA-203611 "N-myristoylation of eNOS"
 xref: Reactome:R-HSA-2534087 "NMT1/2 transfer MYS to GNAT1"
 xref: RHEA:15521
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.97
 property_value: skos:exactMatch RHEA:15521
@@ -48645,7 +48652,7 @@
 xref: Reactome:R-HSA-264695 "cholesterol + phosphatidylcholine (lecithin) => cholesterol ester + 2-lysophosphatidylcholine (lysolecithin)"
 xref: RHEA:21204
 xref: RHEA:34087
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.43
 property_value: skos:exactMatch RHEA:21204
 property_value: skos:narrowMatch RHEA:34087
@@ -52977,7 +52984,7 @@
 xref: EC:2.3.1.26
 xref: MetaCyc:RXN-20233
 xref: RHEA:59816
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.26
 property_value: skos:exactMatch MetaCyc:RXN-20233
 property_value: skos:exactMatch RHEA:59816
@@ -53127,7 +53134,7 @@
 id: GO:0004781
 name: sulfate adenylyltransferase (ATP) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + H+ + sulfate = adenosine 5'-phosphosulfate + diphosphate." [EC:2.7.7.4]
+def: "Catalysis of the reaction: sulfate + ATP + H+ = adenosine 5'-phosphosulfate + diphosphate." [RHEA:18133]
 synonym: "adenosine-5'-triphosphate sulfurylase activity" RELATED [EC:2.7.7.4]
 synonym: "adenosinetriphosphate sulfurylase activity" RELATED [EC:2.7.7.4]
 synonym: "adenylylsulfate pyrophosphorylase activity" RELATED [EC:2.7.7.4]
@@ -65636,7 +65643,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -66468,12 +66474,13 @@
 
 [Term]
 id: GO:0006082
-name: organic acid metabolic process
+name: obsolete organic acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
-subset: goslim_pir
-synonym: "organic acid metabolism" EXACT []
-is_a: GO:0044281 ! small molecule metabolic process
+def: "OBSOLETE. The chemical reactions and pathways involving organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31816" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008152
 
 [Term]
 id: GO:0006083
@@ -70202,7 +70209,7 @@
 id: GO:0006423
 name: cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accetping tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accepting tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
 is_a: GO:0006418 ! tRNA aminoacylation for protein translation
 
 [Term]
@@ -70450,7 +70457,8 @@
 synonym: "binding unfolded ER proteins" EXACT []
 is_obsolete: true
 consider: GO:0005783
-consider: GO:0051082
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0006460
@@ -71162,7 +71170,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving arginine, 2-amino-5-(carbamimidamido)pentanoic acid." [GOC:curators]
 synonym: "arginine metabolism" EXACT []
-xref: Wikipedia:Arginine
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
 [Term]
@@ -71350,7 +71357,6 @@
 synonym: "glutamate metabolism" EXACT []
 synonym: "glutamic acid metabolic process" EXACT []
 synonym: "glutamic acid metabolism" EXACT []
-xref: Wikipedia:Glutamic_acid
 is_a: GO:0043648 ! dicarboxylic acid metabolic process
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
@@ -71579,12 +71585,15 @@
 
 [Term]
 id: GO:0006549
-name: isoleucine metabolic process
+name: obsolete isoleucine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "isoleucine metabolism" EXACT []
-is_a: GO:0009081 ! branched-chain amino acid metabolic process
-is_a: GO:1901605 ! alpha-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0006550
+consider: GO:1901705
 
 [Term]
 id: GO:0006550
@@ -71597,7 +71606,6 @@
 xref: MetaCyc:ILEUDEG-PWY
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -71678,7 +71686,6 @@
 synonym: "methionine and threonine metabolic process" BROAD []
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
-xref: UM-BBD_pathwayID:met
 is_a: GO:0000096 ! sulfur amino acid metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
@@ -71886,7 +71893,6 @@
 def: "The chemical reactions and pathways involving tryptophan, the chiral amino acid 2-amino-3-(1H-indol-3-yl)propanoic acid." [ISBN:0198547684]
 synonym: "tryptophan metabolic process" RELATED []
 synonym: "tryptophan metabolism" RELATED []
-xref: Wikipedia:Tryptophan
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
@@ -71940,15 +71946,15 @@
 
 [Term]
 id: GO:0006570
-name: tyrosine metabolic process
+name: obsolete tyrosine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving tyrosine, an aromatic amino acid, 2-amino-3-(4-hydroxyphenyl)propanoic acid." [GOC:curators]
+def: "OBSOLETE. The chemical reactions and pathways involving tyrosine, an aromatic amino acid, 2-amino-3-(4-hydroxyphenyl)propanoic acid." [GOC:curators]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "tyrosine metabolism" EXACT []
-xref: UM-BBD_pathwayID:tyr
-xref: Wikipedia:Tyrosine
-is_a: GO:0009072 ! aromatic amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
-is_a: GO:0170039 ! proteinogenic amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0006571
+consider: GO:0006572
 
 [Term]
 id: GO:0006571
@@ -71964,7 +71970,6 @@
 xref: MetaCyc:PWY-6120
 xref: MetaCyc:PWY-6134
 xref: MetaCyc:TYRSYN
-is_a: GO:0006570 ! tyrosine metabolic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3461
@@ -71988,7 +71993,7 @@
 xref: MetaCyc:PWY3O-4108
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
-is_a: GO:0006570 ! tyrosine metabolic process
+xref: UM-BBD_pathwayID:tyr
 is_a: GO:0009074 ! aromatic amino acid family catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72002,12 +72007,15 @@
 
 [Term]
 id: GO:0006573
-name: valine metabolic process
+name: obsolete valine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving valine, 2-amino-3-methylbutanoic acid." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving valine, 2-amino-3-methylbutanoic acid." [GOC:ai]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "valine metabolism" EXACT []
-is_a: GO:0009081 ! branched-chain amino acid metabolic process
-is_a: GO:1901605 ! alpha-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0006574
+consider: GO:0009099
 
 [Term]
 id: GO:0006574
@@ -72021,7 +72029,6 @@
 xref: MetaCyc:PWY-5057
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72131,8 +72138,10 @@
 synonym: "melanin anabolism from tyrosine" EXACT []
 synonym: "melanin formation from tyrosine" EXACT []
 synonym: "melanin synthesis from tyrosine" EXACT []
-is_a: GO:0006570 ! tyrosine metabolic process
+is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0042438 ! melanin biosynthetic process
+is_a: GO:0170033 ! L-amino acid metabolic process
+is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
 id: GO:0006584
@@ -72151,8 +72160,10 @@
 synonym: "dopamine anabolism from tyrosine" EXACT []
 synonym: "dopamine formation from tyrosine" EXACT []
 synonym: "dopamine synthesis from tyrosine" EXACT []
-is_a: GO:0006570 ! tyrosine metabolic process
+is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0042416 ! dopamine biosynthetic process
+is_a: GO:0170033 ! L-amino acid metabolic process
+is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
 id: GO:0006586
@@ -72168,17 +72179,18 @@
 
 [Term]
 id: GO:0006587
-name: serotonin biosynthetic process from L-tryptophan
+name: obsolete serotonin biosynthetic process from L-tryptophan
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation from L-tryptophan of serotonin (5-hydroxytryptamine), a monoamine neurotransmitter occurring in the peripheral and central nervous systems, also having hormonal properties." [GOC:jl, ISBN:0198506732, PMID:30901029, PMID:35495641]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation from L-tryptophan of serotonin (5-hydroxytryptamine), a monoamine neurotransmitter occurring in the peripheral and central nervous systems, also having hormonal properties." [GOC:jl, ISBN:0198506732, PMID:30901029, PMID:35495641]
+comment: The reason for obsoletion is that the term is too specific.
 synonym: "serotonin anabolism from tryptophan" EXACT []
 synonym: "serotonin formation from tryptophan" EXACT []
 synonym: "serotonin synthesis from tryptophan" EXACT []
-is_a: GO:0006568 ! L-tryptophan metabolic process
-is_a: GO:0042427 ! serotonin biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31021" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31587" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31658" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0042427
 
 [Term]
 id: GO:0006588
@@ -72224,11 +72236,12 @@
 
 [Term]
 id: GO:0006592
-name: ornithine biosynthetic process
+name: L-ornithine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of ornithine, an amino acid only rarely found in proteins, but which is important in living organisms as an intermediate in the reactions of the urea cycle and in arginine biosynthesis." [GOC:jl, ISBN:0192801023]
 synonym: "ornithine anabolism" EXACT []
 synonym: "ornithine biosynthesis" EXACT []
+synonym: "ornithine biosynthetic process" BROAD []
 synonym: "ornithine formation" EXACT []
 synonym: "ornithine synthesis" EXACT []
 xref: MetaCyc:ARGININE-SYN4-PWY
@@ -72304,11 +72317,14 @@
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
@@ -73802,6 +73818,7 @@
 name: ommochrome biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of ommochromes, any of a large group of natural polycyclic pigments commonly found in the Arthropoda, particularly in the ommatidia of the compound eye." [ISBN:0198506732]
+synonym: "kynurenine pathway" BROAD []
 synonym: "ommochrome anabolism" EXACT []
 synonym: "ommochrome biosynthesis" EXACT []
 synonym: "ommochrome formation" EXACT []
@@ -73809,6 +73826,7 @@
 is_a: GO:0006726 ! eye pigment biosynthetic process
 is_a: GO:0008055 ! ocellus pigment biosynthetic process
 is_a: GO:0046152 ! ommochrome metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0006728
@@ -74421,16 +74439,19 @@
 
 [Term]
 id: GO:0006782
-name: protoporphyrinogen IX biosynthetic process
+name: obsolete protoporphyrinogen IX biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX." [GOC:curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX." [GOC:curators]
+comment: This term was obsoleted because protoporphyrinogen IX is an intermediate in heme/chlorophyll/uroporphyrinogen biosynthesis.
 synonym: "protoporphyrinogen IX anabolism" EXACT []
 synonym: "protoporphyrinogen IX biosynthesis" EXACT []
 synonym: "protoporphyrinogen IX formation" EXACT []
 synonym: "protoporphyrinogen IX synthesis" EXACT []
-is_a: GO:0006779 ! porphyrin-containing compound biosynthetic process
-is_a: GO:0046501 ! protoporphyrinogen IX metabolic process
-relationship: part_of GO:0006783 ! heme biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31788" xsd:anyURI
+is_obsolete: true
+consider: GO:0006780
+consider: GO:0006783
+consider: GO:0033305
 
 [Term]
 id: GO:0006783
@@ -74998,11 +75019,12 @@
 
 [Term]
 id: GO:0006837
-name: serotonin transport
+name: obsolete serotonin transport
 namespace: biological_process
-def: "The directed movement of serotonin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Serotonin (5-hydroxytryptamine) is a monoamine neurotransmitter occurring in the peripheral and central nervous systems." [GOC:ai]
-is_a: GO:0015844 ! monoamine transport
-is_a: GO:0015850 ! organic hydroxy compound transport
+def: "OBSOLETE. The directed movement of serotonin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Serotonin (5-hydroxytryptamine) is a monoamine neurotransmitter occurring in the peripheral and central nervous systems." [GOC:ai]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0006838
@@ -75283,7 +75305,6 @@
 alt_id: GO:0015815
 def: "The directed movement of glutamine, 2-amino-4-carbamoylbutanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "glutamine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -76807,7 +76828,8 @@
 namespace: biological_process
 def: "Completion of folding of alpha- and beta-tubulin; takes place subsequent to chaperonin-mediated partial folding; mediated by a complex of folding cofactors." [PMID:10542094]
 xref: Reactome:R-HSA-389977 "Post-chaperonin tubulin folding pathway"
-is_a: GO:0006457 ! protein folding
+is_a: GO:0007021 ! tubulin complex assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31829" xsd:anyURI
 
 [Term]
 id: GO:0007026
@@ -79194,7 +79216,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "MAPKKK cascade (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007245
@@ -79204,7 +79226,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKKK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007246
@@ -79214,7 +79236,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007247
@@ -79224,7 +79246,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-consider: GO:0000750
+consider: GO:0071507
 
 [Term]
 id: GO:0007248
@@ -79234,7 +79256,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "nuclear translocation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007249
@@ -79402,14 +79424,13 @@
 
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
@@ -83499,7 +83520,6 @@
 xref: Reactome:R-HSA-9636560 "Eis acetylates DUSP16"
 xref: Reactome:R-HSA-9913373 "AAC(6)-Ib acetylates ciprofloxacin"
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016410 ! N-acyltransferase activity
 
 [Term]
 id: GO:0008081
@@ -84110,12 +84130,13 @@
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
 
@@ -84405,17 +84426,18 @@
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
@@ -84599,7 +84621,7 @@
 id: GO:0008153
 name: 4-aminobenzoate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [ISBN:0198506732, MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
+def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
 synonym: "4-aminobenzoic acid biosynthesis" EXACT []
 synonym: "4-aminobenzoic acid biosynthetic process" EXACT []
 synonym: "p-aminobenzoic acid biosynthesis" EXACT []
@@ -84618,7 +84640,7 @@
 xref: MetaCyc:PWY-8281
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
-is_a: GO:0046482 ! para-aminobenzoic acid metabolic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6543
 property_value: skos:narrowMatch MetaCyc:PWY-8276
@@ -87056,9 +87078,10 @@
 
 [Term]
 id: GO:0008374
-name: O-acyltransferase activity
+name: obsolete O-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an acyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
+def: "OBSOLETE. Catalysis of the transfer of an acyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
+comment: This term was obsoleted because it represents an unnecessary grouping class that lacks an EC cross-reference and leads to misclassification of children.
 xref: Reactome:R-HSA-1482775 "MLCL is acylated to CL by HADH (IM)"
 xref: Reactome:R-HSA-1482781 "MLCL and PC are converted to CL and 1-acyl LPC by TAZ (IM) (Reversible)"
 xref: Reactome:R-HSA-1482850 "MLCL and PE are converted to CL and 1-acyl LPE by TAZ (IM) (Reversible)"
@@ -87070,7 +87093,9 @@
 xref: Reactome:R-HSA-422104 "Ghrelin O-acyltransferase octanoylates Proghrelin"
 xref: Reactome:R-HSA-5358343 "HHAT palmitoylates Hh N-terminal fragment"
 xref: Reactome:R-HSA-5483229 "HHAT G287V doesn't palmitoylate Hh-Np"
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0008375
@@ -87556,12 +87581,15 @@
 
 [Term]
 id: GO:0008411
-name: 4-hydroxybutyrate CoA-transferase activity
+name: obsolete 4-hydroxybutyrate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of a coenzyme A (CoA) group to 4-hydroxybutyrate." [GOC:jl, PMID:25452282]
+def: "OBSOLETE. Catalysis of the transfer of a coenzyme A (CoA) group to 4-hydroxybutyrate." [GOC:jl, PMID:25452282]
+comment: This term was obsoleted because it represents the same activity as 4-hydroxybutanoyl-CoA dehydratase activity ; GO:0043721. The term was incorrectly defined; the paper cited describes dehydration of 4-hydroxybutyryl-CoA to crotonyl-CoA ((2E)-butenoyl-CoA).
 xref: MetaCyc:RXN-8889
-is_a: GO:0008410 ! CoA-transferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28340" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0043721
 
 [Term]
 id: GO:0008412
@@ -89012,7 +89040,6 @@
 xref: Reactome:R-HSA-380620 "Reuptake of serotonin from the synapse"
 xref: Reactome:R-HSA-5660706 "Defective SLC6A3 does not cotransport DA, Na+ from extracellular region to cytosol"
 is_a: GO:0022804 ! active transmembrane transporter activity
-relationship: part_of GO:0015844 ! monoamine transport
 
 [Term]
 id: GO:0008506
@@ -91330,7 +91357,7 @@
 id: GO:0008695
 name: 3-phenylpropionate dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 3-phenylpropionate + NADH + H+ + O2 = NAD+ + cis-3-(3-carboxyethyl)-3,5-cyclohexadiene-1,2-diol." [UM-BBD_enzymeID:e0307]
+def: "Catalysis of the reaction: 3-phenylpropanoate + NADH + O2 + H+ = 3-(cis-5,6-dihydroxycyclohexa-1,3-dien-1-yl)propanoate + NAD+." [RHEA:20357]
 synonym: "3-phenylpropanoate dioxygenase activity" RELATED [EC:1.14.12.19]
 synonym: "3-phenylpropanoate,NADH:oxygen oxidoreductase (2,3-hydroxylating) activity" RELATED [EC:1.14.12.19]
 synonym: "Hca dioxygenase activity" RELATED [EC:1.14.12.19]
@@ -92635,7 +92662,7 @@
 id: GO:0008775
 name: acetate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acyl-CoA + acetate = a fatty acid anion + acetyl-CoA." [EC:2.8.3.8]
+def: "Catalysis of the reaction: an acyl-CoA + acetate = a carboxylate + acetyl-CoA." [RHEA:13381]
 synonym: "acetate coenzyme A-transferase activity" RELATED [EC:2.8.3.8]
 synonym: "acetyl-CoA:acetoacetate CoA transferase activity" RELATED [EC:2.8.3.8]
 synonym: "acyl-CoA:acetate CoA-transferase activity" RELATED [EC:2.8.3.8]
@@ -92702,7 +92729,7 @@
 xref: EC:2.3.1.40
 xref: MetaCyc:ACYLGPEACYLTRANS-RXN
 xref: RHEA:10304
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.40
 property_value: skos:exactMatch RHEA:10304
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -92722,7 +92749,7 @@
 xref: MetaCyc:RXN-22480
 xref: RHEA:13925
 xref: RHEA:67812
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.129
 property_value: skos:exactMatch RHEA:67812
 property_value: skos:narrowMatch RHEA:13925
@@ -93343,7 +93370,7 @@
 id: GO:0008814
 name: citrate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + citrate = acetate + (3S)-citryl-CoA." [EC:2.8.3.10]
+def: "Catalysis of the reaction: acetyl-CoA + citrate = acetate + (3S)-citryl-CoA." [RHEA:19405]
 synonym: "acetyl-CoA:citrate CoA-transferase activity" RELATED [EC:2.8.3.10]
 xref: EC:2.8.3.10
 xref: MetaCyc:CITTRANS-RXN
@@ -95511,7 +95538,7 @@
 
 [Term]
 id: GO:0008941
-name: nitric oxide dioxygenase NAD(P)H activity
+name: nitric oxide dioxygenase [NAD(P)H] activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2 NO + 2 O2 + NAD(P)H + H+ = 2 nitrate + NAD(P)+." [EC:1.14.12.17]
 comment: Note that this activity is similar to nitric oxide dioxygenase activity, heme protein ; GO:0141118, but GO:0141118 uses a heme protein as the electron donor.
@@ -97955,7 +97982,6 @@
 synonym: "valine formation" EXACT []
 synonym: "valine synthesis" EXACT []
 xref: MetaCyc:VALSYN-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009079 ! pyruvate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
 relationship: has_part GO:0003984 ! acetolactate synthase activity
@@ -101651,8 +101677,15 @@
 synonym: "putrescine biosynthesis" EXACT []
 synonym: "putrescine formation" EXACT []
 synonym: "putrescine synthesis" EXACT []
+xref: MetaCyc:PWY-40
+xref: MetaCyc:PWY-43
+xref: MetaCyc:PWY-46
 is_a: GO:0006596 ! polyamine biosynthetic process
 is_a: GO:0009445 ! putrescine metabolic process
+property_value: skos:narrowMatch MetaCyc:PWY-40
+property_value: skos:narrowMatch MetaCyc:PWY-43
+property_value: skos:narrowMatch MetaCyc:PWY-46
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0009447
@@ -101662,15 +101695,26 @@
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
-name: GABA metabolic process
+name: obsolete GABA metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving gamma-aminobutyric acid (GABA, 4-aminobutyrate), an amino acid which acts as a neurotransmitter in some organisms." [ISBN:0198506732]
-comment: See also the biological process term 'neurotransmitter metabolic process ; GO:0042133'.
+def: "OBSOLETE. The chemical reactions and pathways involving gamma-aminobutyric acid (GABA, 4-aminobutyrate), an amino acid which acts as a neurotransmitter in some organisms." [ISBN:0198506732]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "4-aminobutanoate metabolic process" EXACT []
 synonym: "4-aminobutanoate metabolism" EXACT []
 synonym: "4-aminobutyrate metabolic process" EXACT []
@@ -101678,9 +101722,11 @@
 synonym: "GABA metabolism" EXACT []
 synonym: "gamma-aminobutyric acid metabolic process" EXACT []
 synonym: "gamma-aminobutyric acid metabolism" EXACT []
-is_a: GO:0032787 ! monocarboxylic acid metabolic process
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31732" xsd:anyURI
+is_obsolete: true
+consider: GO:0009449
+consider: GO:0009450
 
 [Term]
 id: GO:0009449
@@ -101700,7 +101746,6 @@
 synonym: "gamma-aminobutyric acid synthesis" EXACT []
 xref: Reactome:R-HSA-888568 "GABA synthesis"
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31732" xsd:anyURI
 
@@ -101726,7 +101771,6 @@
 xref: MetaCyc:PWY-6537
 xref: Reactome:R-HSA-916853 "Degradation of GABA"
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5022
 property_value: skos:narrowMatch MetaCyc:PWY-6473
@@ -112356,20 +112400,23 @@
 
 [Term]
 id: GO:0010514
-name: induction of conjugation with cellular fusion
+name: obsolete induction of conjugation with cellular fusion
 namespace: biological_process
-def: "The process in which a cell initiates conjugation with cellular fusion. Conjugation with cellular fusion is the process that results in the union of cellular and genetic information from compatible mating types." [GOC:dph, GOC:tb]
-is_a: GO:0031139 ! positive regulation of conjugation with cellular fusion
+def: "OBSOLETE. The process in which a cell initiates conjugation with cellular fusion. Conjugation with cellular fusion is the process that results in the union of cellular and genetic information from compatible mating types." [GOC:dph, GOC:tb]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0031139
 
 [Term]
 id: GO:0010515
-name: negative regulation of induction of conjugation with cellular fusion
+name: obsolete negative regulation of induction of conjugation with cellular fusion
 namespace: biological_process
-def: "Any process that stops, prevents, or reduces the frequency or rate of initiation of conjugation with cellular fusion." [GOC:dph, GOC:tb]
-is_a: GO:0031138 ! negative regulation of conjugation with cellular fusion
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0010514 ! induction of conjugation with cellular fusion
-relationship: negatively_regulates GO:0010514 ! induction of conjugation with cellular fusion
+def: "OBSOLETE. Any process that stops, prevents, or reduces the frequency or rate of initiation of conjugation with cellular fusion." [GOC:dph, GOC:tb]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0031138
 
 [Term]
 id: GO:0010516
@@ -114725,38 +114772,33 @@
 
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
@@ -117061,14 +117103,13 @@
 
 [Term]
 id: GO:0010969
-name: regulation of pheromone-dependent signal transduction involved in conjugation with cellular fusion
+name: obsolete regulation of pheromone-dependent signal transduction involved in conjugation with cellular fusion
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of pheromone-dependent signal transduction during conjugation with cellular fusion, a signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion." [GOC:dph, GOC:tb]
-is_a: GO:0009966 ! regulation of signal transduction
-is_a: GO:0031137 ! regulation of conjugation with cellular fusion
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
-relationship: regulates GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of pheromone-dependent signal transduction during conjugation with cellular fusion, a signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion." [GOC:dph, GOC:tb]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0180039
 created_by: tb
 creation_date: 2009-05-20T11:54:57Z
 
@@ -118043,7 +118084,6 @@
 name: dopamine secretion
 namespace: biological_process
 def: "The regulated release of dopamine by a cell. Dopamine is a catecholamine and a precursor of adrenaline and noradrenaline. It acts as a neurotransmitter in the central nervous system but it is also produced peripherally and acts as a hormone." [GOC:ef]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -125032,7 +125072,7 @@
 consider: GO:0009297
 consider: GO:0030674
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0015473
@@ -126840,7 +126880,6 @@
 namespace: biological_process
 def: "A process in which ferric-enterobactin, the iron-bound form of the siderophore enterobactin, is transported into the cell by specific cell surface receptors." [GOC:pg, PMID:23192658]
 synonym: "ferric-enterobactin transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033214 ! siderophore-iron import into cell
 
 [Term]
@@ -126914,10 +126953,13 @@
 
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
@@ -126961,7 +127003,7 @@
 xref: Reactome:R-HSA-1475029 "Reversible hydration of carbon dioxide"
 xref: Reactome:R-HSA-1480926 "O2/CO2 exchange in erythrocytes"
 xref: Reactome:R-HSA-425381 "Bicarbonate transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0006810 ! transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26780" xsd:anyURI
 
 [Term]
@@ -127049,11 +127091,14 @@
 
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
@@ -127349,7 +127394,6 @@
 def: "The directed movement of urate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc]
 synonym: "urate transmembrane transport" EXACT [GOC:mah]
 synonym: "uric acid transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -127449,7 +127493,6 @@
 name: glucose-6-phosphate transport
 namespace: biological_process
 def: "The directed movement of glucose-6-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Glucose-6-phosphate is a monophosphorylated derivative of glucose with the phosphate group attached to C-6." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015712 ! hexose phosphate transport
 
 [Term]
@@ -127614,7 +127657,6 @@
 def: "The directed movement of CMP-N-acetylneuraminate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "CMP-N-acetylneuraminate transport" RELATED []
 synonym: "CMP-sialic acid transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127630,7 +127672,6 @@
 name: UDP-glucose transmembrane transport
 namespace: biological_process
 def: "The process in which UDP-glucose is transported across a membrane." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14450" xsd:anyURI
 
@@ -127651,7 +127692,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-N-acetylgalactosamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-N-acetylgalactosamine is a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-N-acetylgalactosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127660,7 +127700,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-xylose into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-xylose is a substance composed of xylose in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-xylose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127699,7 +127738,6 @@
 namespace: biological_process
 def: "The process in which glycerol-3-phosphate is transported across a membrane. Glycerol-3-phosphate is a phosphoric monoester of glycerol." [GOC:ai]
 synonym: "glycerol-3-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -127802,7 +127840,6 @@
 synonym: "S-adenosyl methionine transport" EXACT []
 synonym: "S-adenosylmethionine transport" EXACT []
 synonym: "SAM transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0072348 ! sulfur compound transport
 
 [Term]
@@ -127892,7 +127929,6 @@
 name: glycine transport
 namespace: biological_process
 def: "The directed movement of glycine, aminoethanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -127936,7 +127972,6 @@
 namespace: biological_process
 def: "The directed movement of L-leucine, 2-amino-4-methylpentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "leucine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015803 ! branched-chain amino acid transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -127949,7 +127984,6 @@
 synonym: "L-methionine transport" NARROW []
 is_a: GO:0000101 ! sulfur amino acid transport
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 
 [Term]
 id: GO:0015822
@@ -127958,7 +127992,6 @@
 def: "The directed movement of ornithine, 2,5-diaminopentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-ornithine transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -127977,7 +128010,6 @@
 namespace: biological_process
 def: "The directed movement of proline, pyrrolidine-2-carboxylic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-proline transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128010,7 +128042,6 @@
 def: "The directed movement of tryptophan, 2-amino-3-(1H-indol-3-yl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tryptophan transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 
 [Term]
@@ -128019,7 +128050,6 @@
 namespace: biological_process
 def: "The directed movement of tyrosine, 2-amino-3-(4-hydroxyphenyl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tyrosine transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128111,7 +128141,6 @@
 name: cadaverine transport
 namespace: biological_process
 def: "The directed movement of cadaverine, 1,5-pentanediamine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -128142,17 +128171,18 @@
 name: methylammonium transport
 namespace: biological_process
 def: "The directed movement of methylammonium into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0019755 ! one-carbon compound transport
 
 [Term]
 id: GO:0015844
-name: monoamine transport
+name: obsolete monoamine transport
 namespace: biological_process
 alt_id: GO:0015873
-def: "The directed movement of monoamines, organic compounds that contain one amino group that is connected to an aromatic ring by an ethylene group (-CH2-CH2-), into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0071705 ! nitrogen compound transport
+def: "OBSOLETE. The directed movement of monoamines, organic compounds that contain one amino group that is connected to an aromatic ring by an ethylene group (-CH2-CH2-), into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0015846
@@ -128166,7 +128196,6 @@
 name: putrescine transport
 namespace: biological_process
 def: "The directed movement of putrescine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Putrescine is 1,4-diaminobutane, the polyamine formed by decarboxylation of ornithine and the metabolic precursor of spermidine and spermine." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128174,7 +128203,6 @@
 name: spermidine transport
 namespace: biological_process
 def: "The directed movement of spermidine, N-(3-aminopropyl)-1,4-diaminobutane, a polyamine formed by the transfer of a propylamine group from decarboxylated S-adenosylmethionine to putrescine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128313,7 +128341,6 @@
 name: ADP transport
 namespace: biological_process
 def: "The directed movement of ADP, adenosine diphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128322,7 +128349,6 @@
 name: ATP transport
 namespace: biological_process
 def: "The directed movement of ATP, adenosine triphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128349,7 +128375,6 @@
 name: acetylcholine transport
 namespace: biological_process
 def: "The directed movement of acetylcholine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Acetylcholine is an acetic acid ester of the organic base choline and functions as a neurotransmitter, released at the synapses of parasympathetic nerves and at neuromuscular junctions." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901374 ! acetate ester transport
 
@@ -128358,25 +128383,25 @@
 name: choline transport
 namespace: biological_process
 def: "The directed movement of choline into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Choline (2-hydroxyethyltrimethylammonium) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids and in the neurotransmitter acetylcholine." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0015872
-name: dopamine transport
+name: obsolete dopamine transport
 namespace: biological_process
-def: "The directed movement of dopamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dopamine is a catecholamine neurotransmitter and a metabolic precursor of noradrenaline and adrenaline." [GOC:ai]
-is_a: GO:0051937 ! catecholamine transport
+def: "OBSOLETE. The directed movement of dopamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dopamine is a catecholamine neurotransmitter and a metabolic precursor of noradrenaline and adrenaline." [GOC:ai]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0015874
-name: norepinephrine transport
+name: obsolete norepinephrine transport
 namespace: biological_process
-def: "The directed movement of norepinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Norepinephrine (3,4-dihydroxyphenyl-2-aminoethanol) is a hormone secreted by the adrenal medulla and a neurotransmitter in the sympathetic peripheral nervous system and in some tracts of the CNS. It is also the biosynthetic precursor of epinephrine." [GOC:ai, ISBN:0198506732]
-synonym: "levarterenol transport" EXACT []
-synonym: "noradrenaline transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0051937 ! catecholamine transport
+def: "OBSOLETE. The directed movement of norepinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Norepinephrine (3,4-dihydroxyphenyl-2-aminoethanol) is a hormone secreted by the adrenal medulla and a neurotransmitter in the sympathetic peripheral nervous system and in some tracts of the CNS. It is also the biosynthetic precursor of epinephrine." [GOC:ai, ISBN:0198506732]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0015875
@@ -128420,7 +128445,6 @@
 namespace: biological_process
 def: "The directed movement of carnitine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carnitine is a compound that participates in the transfer of acyl groups across the inner mitochondrial membrane." [GOC:ai]
 synonym: "vitamin Bt transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -128428,7 +128452,6 @@
 name: coenzyme A transport
 namespace: biological_process
 def: "The directed movement of coenzyme A into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Coenzyme A, 3'-phosphoadenosine-(5')diphospho(4')pantatheine, is an acyl carrier in many acylation and acyl-transfer reactions in which the intermediate is a thiol ester." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128466,7 +128489,6 @@
 synonym: "flavin adenine dinucleotide transport" EXACT []
 synonym: "flavin-adenine dinucleotide transport" EXACT []
 is_a: GO:0006862 ! nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 
 [Term]
 id: GO:0015884
@@ -128518,7 +128540,6 @@
 def: "The directed movement of thiamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Thiamine is vitamin B1, a water soluble vitamin present in fresh vegetables and meats, especially liver." [GOC:ai]
 synonym: "thiamin transport" EXACT []
 synonym: "vitamin B1 transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128649,7 +128670,6 @@
 def: "The directed movement of tetracycline from one side of a membrane to the other. Tetracycline is a broad spectrum antibiotic that blocks binding of aminoacyl tRNA to the ribosomes of both Gram-positive and Gram-negative organisms (and those of organelles)." [GOC:curators]
 synonym: "tetracyclin transport" BROAD []
 synonym: "tetracycline transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -128756,7 +128776,6 @@
 synonym: "fatty acyl CoA transport" EXACT []
 synonym: "fatty acyl coenzyme A transport" EXACT []
 synonym: "fatty acyl-CoA transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:1901337 ! thioester transport
@@ -130103,26 +130122,23 @@
 
 [Term]
 id: GO:0016053
-name: organic acid biosynthetic process
+name: obsolete organic acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
-synonym: "organic acid anabolism" EXACT []
-synonym: "organic acid biosynthesis" EXACT []
-synonym: "organic acid formation" EXACT []
-synonym: "organic acid synthesis" EXACT []
-is_a: GO:0006082 ! organic acid metabolic process
-is_a: GO:0044283 ! small molecule biosynthetic process
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31816" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008152
 
 [Term]
 id: GO:0016054
-name: organic acid catabolic process
+name: obsolete organic acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
-synonym: "organic acid breakdown" EXACT []
-synonym: "organic acid catabolism" EXACT []
-synonym: "organic acid degradation" EXACT []
-is_a: GO:0006082 ! organic acid metabolic process
-is_a: GO:0044282 ! small molecule catabolic process
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of organic acids, any acidic compound containing carbon in covalent linkage." [ISBN:0198506732]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31816" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008152
 
 [Term]
 id: GO:0016055
@@ -133608,7 +133624,7 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the carnitine molecule." [GOC:ai]
 xref: Reactome:R-HSA-200410 "CPT2 converts acylcarnitine to acyl-CoA"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016407
@@ -133627,10 +133643,13 @@
 
 [Term]
 id: GO:0016408
-name: C-acyltransferase activity
+name: obsolete C-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an acyl group to a carbon atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+def: "OBSOLETE. Catalysis of the transfer of an acyl group to a carbon atom on the acceptor molecule." [GOC:ai]
+comment: This term was obsoleted because it represents an unnecessary grouping class that lacks an EC cross-reference and leads to misclassification of children.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0016409
@@ -133644,13 +133663,16 @@
 
 [Term]
 id: GO:0016410
-name: N-acyltransferase activity
+name: obsolete N-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an acyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
+def: "OBSOLETE. Catalysis of the transfer of an acyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
+comment: This term was obsoleted because it represents an unnecessary grouping class that lacks an EC cross-reference and leads to misclassification of children.
 xref: Reactome:R-HSA-177160 "phenylacetyl-CoA + glutamine => phenylacetyl glutamine + Coenzyme A"
 xref: Reactome:R-HSA-6792572 "LIPT1 transfers lipoyl group from lipoyl-GCSH to DBT/DLST"
 xref: Reactome:R-HSA-9858752 "LIPT1 transfers lipoyl group from lipoyl-GCSH to DLAT"
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0016411
@@ -133659,7 +133681,7 @@
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the acylglycerol molecule." [GOC:ai]
 xref: Reactome:R-HSA-1482647 "2-MAG and DAG are transacylated to TAG by PNPLA2/3"
 xref: Reactome:R-HSA-1482654 "2-MAG is transacylated to DAG by PNPLA2/3"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016412
@@ -133676,7 +133698,7 @@
 xref: RHEA:68292
 xref: RHEA:68296
 xref: RHEA:68300
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:68272
 property_value: skos:narrowMatch RHEA:59964
 property_value: skos:narrowMatch RHEA:59972
@@ -133693,7 +133715,6 @@
 name: O-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016407 ! acetyltransferase activity
 
 [Term]
@@ -133704,7 +133725,7 @@
 synonym: "O-octanoyltransferase activity" BROAD []
 xref: EC:2.3.1.273
 xref: RHEA:56868
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.273
 property_value: skos:exactMatch RHEA:56868
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -133727,15 +133748,17 @@
 xref: Reactome:R-HSA-2404137 "LRAT esterifies RBP1:atROL and FACYLs to atREs"
 xref: Reactome:R-HSA-2453855 "LRAT esterifies RBP1:atROL and FACYLs to atREs"
 xref: Reactome:R-HSA-2466710 "Defective LRAT does not esterify RBP1:atROL and FACYLs to atREs"
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016409 ! palmitoyltransferase activity
 
 [Term]
 id: GO:0016417
-name: S-acyltransferase activity
+name: obsolete S-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an acyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+def: "OBSOLETE. Catalysis of the transfer of an acyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
+comment: This term was obsoleted because it represents an unnecessary grouping class that lacks an EC cross-reference and leads to misclassification of children.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0016418
@@ -133743,7 +133766,6 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016417 ! S-acyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17828" xsd:anyURI
 
 [Term]
@@ -133751,7 +133773,6 @@
 name: S-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
@@ -134036,14 +134057,12 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to a carbon atom on the acceptor molecule." [GOC:ai]
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016408 ! C-acyltransferase activity
 
 [Term]
 id: GO:0016454
 name: C-palmitoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a palmitoyl group to a carbon atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016408 ! C-acyltransferase activity
 is_a: GO:0016409 ! palmitoyltransferase activity
 
 [Term]
@@ -137215,7 +137234,6 @@
 name: N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137223,7 +137241,6 @@
 name: O-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137231,7 +137248,6 @@
 name: S-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137246,7 +137262,6 @@
 name: O-sinapoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016752 ! sinapoyltransferase activity
 
 [Term]
@@ -141166,7 +141181,7 @@
 id: GO:0017109
 name: glutamate-cysteine ligase complex
 namespace: cellular_component
-def: "An enzyme complex that catalyzes the ligation of glutamate to cysteine, forming glutamylcysteine." [PMID:9675072]
+def: "An enzyme complex that catalyzes the ligation of L-glutamate to L-cysteine, forming gamma-L-glutamyl-L-cysteine." [PMID:9675072]
 synonym: "gamma-glutamylcysteine synthetase complex" EXACT []
 is_a: GO:1902494 ! catalytic complex
 relationship: part_of GO:0005737 ! cytoplasm
@@ -142403,7 +142418,7 @@
 name: peptidyl-lysine N6-palmitoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a palmitoyl group to the N6 nitrogen atom on a lysine residue of a peptide or protein molecule." [GOC:mah, PMID:29074776]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22878" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22968" xsd:anyURI
@@ -147639,12 +147654,11 @@
 id: GO:0018554
 name: 1,2-dihydroxynaphthalene dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 1,2-dihydroxynaphthalene + O2 = 2-hydroxychromene-2-carboxylate. C6 of the substrate molecular may have an NH2 group attached." [UM-BBD_enzymeID:r0336]
+def: "Catalysis of the reaction: naphthalene-1,2-diol + O2 = 2-hydroxychromene-2-carboxylate + H+." [RHEA:27310]
 xref: EC:1.13.11.56
 xref: RHEA:27310
 xref: UM-BBD_enzymeID:r0336
-is_a: GO:0016701 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen
-is_a: GO:0051213 ! dioxygenase activity
+is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
 property_value: skos:exactMatch EC:1.13.11.56
 property_value: skos:exactMatch RHEA:27310
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -148267,7 +148281,7 @@
 id: GO:0018610
 name: dibenzofuran 4,4a-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dibenzofuran + NADH + H+ + O2 = 2,2',3-trihydroxybiphenyl + NAD+." [MetaCyc:R606-RXN, RHEA:42460]
+def: "Catalysis of the reaction: dibenzofuran + NADH + H+ + O2 = 2,2',3-trihydroxybiphenyl + NAD+." [RHEA:42460]
 xref: MetaCyc:R606-RXN
 xref: RHEA:42460
 xref: UM-BBD_enzymeID:r0026
@@ -148356,16 +148370,20 @@
 synonym: "anthranilic hydroxylase activity" BROAD [EC:1.14.12.1]
 xref: EC:1.14.12.1
 xref: MetaCyc:1.14.12.1-RXN
+xref: RHEA:11072
+xref: RHEA:11076
 xref: UM-BBD_reactionID:r0577
 is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
 property_value: skos:exactMatch EC:1.14.12.1
+property_value: skos:narrowMatch RHEA:11072
+property_value: skos:narrowMatch RHEA:11076
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0018619
 name: benzene 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: benzene + H+ + NADH + O2 = cis-cyclohexa-3,5-diene-1,2-diol + NAD+." [EC:1.14.12.3, RHEA:13813]
+def: "Catalysis of the reaction: benzene + NADH + O2 + H+ = cis-1,2-dihydrobenzene-1,2-diol + NAD+." [RHEA:13813]
 synonym: "benzene dioxygenase activity" RELATED [EC:1.14.12.3]
 synonym: "benzene hydroxylase activity" RELATED [EC:1.14.12.3]
 synonym: "benzene,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.3]
@@ -148383,7 +148401,7 @@
 id: GO:0018620
 name: phthalate 4,5-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + phthalate = cis-4,5-dihydroxycyclohexa-2,6-diene-1,2-dicarboxylate + NAD+." [EC:1.14.12.7, RHEA:17489]
+def: "Catalysis of the reaction: phthalate + NADH + O2 + H+ = cis-4,5-dihydroxycyclohexa-2,6-diene-1,2-dicarboxylate + NAD+." [RHEA:17489]
 synonym: "PDO activity" RELATED [EC:1.14.12.7]
 synonym: "phthalate dioxygenase activity" BROAD [EC:1.14.12.7]
 synonym: "phthalate,NADH:oxygen oxidoreductase (4,5-hydroxylating)" RELATED [EC:1.14.12.7]
@@ -148401,7 +148419,7 @@
 id: GO:0018621
 name: 4-sulfobenzoate 3,4-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-sulfobenzoate + H+ + NADH + O2 = 3,4-dihydroxybenzoate + NAD+ + sulfite." [EC:1.14.12.8, RHEA:13937]
+def: "Catalysis of the reaction: 4-sulfobenzoate + H+ + NADH + O2 = 3,4-dihydroxybenzoate + NAD+ + sulfite." [RHEA:13937]
 synonym: "4-sulfobenzoate 3,4-dioxygenase system" RELATED [EC:1.14.12.8]
 synonym: "4-sulfobenzoate dioxygenase activity" RELATED [EC:1.14.12.8]
 synonym: "4-sulfobenzoate,NADH:oxygen oxidoreductase (3,4-hydroxylating, sulfite-forming)" RELATED [EC:1.14.12.8]
@@ -148420,7 +148438,7 @@
 id: GO:0018622
 name: 4-chlorophenylacetate 3,4-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-chlorophenylacetate + NADH + O2 = 3,4-dihydroxyphenylacetate + chloride + NAD+." [EC:1.14.12.9, RHEA:14689]
+def: "Catalysis of the reaction: 4-chlorophenylacetate + NADH + O2 = 3,4-dihydroxyphenylacetate + chloride + NAD+." [RHEA:14689]
 synonym: "4-chlorophenylacetate,NADH:oxygen oxidoreductase (3,4-hydroxylating, dechlorinating)" RELATED [EC:1.14.12.9]
 xref: EC:1.14.12.9
 xref: KEGG_REACTION:R03306
@@ -148436,7 +148454,7 @@
 id: GO:0018623
 name: benzoate 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: benzoate + NADH + H+ + O2 = catechol + CO2 + NAD+." [EC:1.14.12.10]
+def: "Catalysis of the reaction: benzoate + NADH + O2 + H+ = (1R,6S)-1,6-dihydroxycyclohexa-2,4-diene-1-carboxylate + NAD+." [RHEA:12633]
 synonym: "benzoate dioxygenase activity" RELATED [EC:1.14.12.10]
 synonym: "benzoate hydroxylase activity" RELATED [EC:1.14.12.10]
 synonym: "benzoate,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.10]
@@ -148455,7 +148473,7 @@
 id: GO:0018624
 name: toluene dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + toluene = (1S,2R)-3-methylcyclohexa-3,5-diene-1,2-diol + NAD+." [EC:1.14.12.11, RHEA:16737]
+def: "Catalysis of the reaction: toluene + NADH + O2 + H+ = (1S,2R)-3-methylcyclohexa-3,5-diene-1,2-diol + NAD+." [RHEA:16737]
 synonym: "toluene 1,2-dioxygenase activity" RELATED [EC:1.14.12.11]
 synonym: "toluene 2,3-dioxygenase activity" RELATED [EC:1.14.12.11]
 synonym: "toluene,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.11]
@@ -148509,7 +148527,7 @@
 name: 2-aminobenzenesulfonate 2,3-dioxygenase activity
 namespace: molecular_function
 alt_id: GO:0018605
-def: "Catalysis of the reaction: 2-aminobenzenesulfonate + 2 H+ + NADH + O2 = 2,3-dihydroxybenzenesulfonate + NAD+ + NH4. 2,3-dihydroxybenzenesulfonate is also known as 3-sulfocatechol." [EC:1.14.12.14, RHEA:23468]
+def: "Catalysis of the reaction: 2-aminobenzenesulfonate + 2 H+ + NADH + O2 = 2,3-dihydroxybenzenesulfonate + NAD+ + NH4. 2,3-dihydroxybenzenesulfonate is also known as 3-sulfocatechol." [RHEA:23468]
 synonym: "2-aminobenzenesulfonate dioxygenase activity" EXACT []
 synonym: "2-aminobenzenesulfonate,NADH:oxygen oxidoreductase (2,3-hydroxylating, ammonia-forming)" RELATED [EC:1.14.12.14]
 synonym: "2-aminobenzenesulphonate 2,3-dioxygenase activity" EXACT []
@@ -148529,7 +148547,7 @@
 id: GO:0018628
 name: terephthalate 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + terephthalate = (3S,4R)-3,4-dihydroxycyclohexa-1,5-diene-1,4-dicarboxylate + NAD+." [EC:1.14.12.15, RHEA:10312]
+def: "Catalysis of the reaction: terephthalate + NADH + O2 + H+ = (3S,4R)-3,4-dihydroxycyclohexa-1,5-diene-1,4-dicarboxylate + NAD+." [RHEA:10312]
 synonym: "1,4-dicarboxybenzoate 1,2-dioxygenase activity" RELATED [EC:1.14.12.15]
 synonym: "benzene-1,4-dicarboxylate 1,2-dioxygenase activity" RELATED [EC:1.14.12.15]
 synonym: "benzene-1,4-dicarboxylate,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.15]
@@ -148547,7 +148565,7 @@
 id: GO:0018629
 name: 2-hydroxyquinoline 5,6-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: quinolin-2-ol + NADH + H+ + O2 = 2,5,6-trihydroxy-5,6-dihydroquinoline + NAD+." [EC:1.14.12.16]
+def: "Catalysis of the reaction: quinolin-2-ol + NADH + O2 + H+ = 5,6-dihydroquinoline-2,5,6-triol + NAD+." [RHEA:10976]
 synonym: "2-oxo-1,2-dihydroquinoline 5,6-dioxygenase activity" EXACT []
 synonym: "quinolin-2(1H)-one 5,6-dioxygenase activity" RELATED [EC:1.14.12.16]
 synonym: "quinolin-2-ol 5,6-dioxygenase activity" RELATED [EC:1.14.12.16]
@@ -149399,7 +149417,7 @@
 id: GO:0018687
 name: biphenyl 2,3-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: biphenyl + NADH + H+ + O2 = (2R,3S)-3-phenylcyclohexa-3,5-diene-1,2-diol + NAD+. This reaction requires Fe2+." [EC:1.14.12.18]
+def: "Catalysis of the reaction: biphenyl + NADH + H+ + O2 = (2R,3S)-3-phenylcyclohexa-3,5-diene-1,2-diol + NAD+. This reaction requires Fe2+." [RHEA:18165]
 synonym: "biphenyl dioxygenase activity" RELATED [EC:1.14.12.18]
 synonym: "biphenyl,NADH:oxygen oxidoreductase (2,3-hydroxylating)" RELATED [EC:1.14.12.18]
 xref: EC:1.14.12.18
@@ -149818,7 +149836,7 @@
 id: GO:0018729
 name: propionate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + propanoate = acetate + propanoyl-CoA." [EC:2.8.3.1]
+def: "Catalysis of the reaction: acetyl-CoA + propanoate = acetate + propanoyl-CoA." [RHEA:23520]
 synonym: "acetyl-CoA:propanoate CoA-transferase activity" RELATED [EC:2.8.3.1]
 synonym: "propionate coenzyme A-transferase activity" RELATED [EC:2.8.3.1]
 synonym: "propionate-CoA:lactoyl-CoA transferase activity" RELATED [EC:2.8.3.1]
@@ -149837,7 +149855,7 @@
 id: GO:0018730
 name: glutaconate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + (E)-glutaconate = acetate + glutaconyl-1-CoA." [EC:2.8.3.12]
+def: "Catalysis of the reaction: trans-glutaconate + acetyl-CoA = (2E)-glutaconyl-CoA + acetate." [RHEA:23208]
 synonym: "acetyl-CoA:(E)-glutaconate CoA-transferase activity" RELATED [EC:2.8.3.12]
 xref: EC:2.8.3.12
 xref: MetaCyc:GLUTACONATE-COA-TRANSFERASE-RXN
@@ -152203,6 +152221,7 @@
 xref: UM-BBD_pathwayID:msa
 is_a: GO:0006805 ! xenobiotic metabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0018927
@@ -152834,7 +152853,6 @@
 synonym: "naphthalenesulphonate metabolic process" EXACT []
 synonym: "naphthalenesulphonate metabolism" EXACT []
 xref: UM-BBD_pathwayID:nphs
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -154034,7 +154052,7 @@
 comment: This term has been obsoleted because it represents an unnecessary grouping class and is not consistent with the ontology structure.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22971" xsd:anyURI
 is_obsolete: true
-consider: GO:0016410
+consider: GO:0016747
 
 [Term]
 id: GO:0019107
@@ -155631,15 +155649,15 @@
 
 [Term]
 id: GO:0019240
-name: citrulline biosynthetic process
+name: L-citrulline biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the formation of L-citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
 synonym: "citrulline anabolism" EXACT []
 synonym: "citrulline biosynthesis" EXACT []
+synonym: "citrulline biosynthetic process" BROAD []
 synonym: "citrulline formation" EXACT []
 synonym: "citrulline synthesis" EXACT []
 xref: MetaCyc:CITRULBIO-PWY
-is_a: GO:0000052 ! citrulline metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 is_a: GO:1901607 ! alpha-amino acid biosynthetic process
 
@@ -155652,7 +155670,6 @@
 synonym: "citrulline catabolism" EXACT []
 synonym: "citrulline degradation" EXACT []
 xref: MetaCyc:CITRULLINE-DEG-PWY
-is_a: GO:0000052 ! citrulline metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
@@ -156345,7 +156362,6 @@
 synonym: "coenzyme M synthesis" EXACT []
 xref: MetaCyc:P261-PWY
 xref: MetaCyc:PWY-6643
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 property_value: skos:narrowMatch MetaCyc:P261-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6643
@@ -157028,8 +157044,8 @@
 synonym: "teichoic acid formation" EXACT []
 synonym: "teichoic acid synthesis" EXACT []
 xref: MetaCyc:TEICHOICACID-PWY
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 is_a: GO:0046374 ! teichoic acid metabolic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
@@ -157051,26 +157067,31 @@
 
 [Term]
 id: GO:0019352
-name: protoporphyrinogen IX biosynthetic process from glycine
+name: obsolete protoporphyrinogen IX biosynthetic process from glycine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX from other compounds, including glycine." [GOC:curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX from other compounds, including glycine." [GOC:curators]
+comment: This term was obsoleted because protoporphyrinogen IX is an intermediate in heme/chlorophyll/uroporphyrinogen biosynthesis.
 synonym: "protoporphyrinogen IX anabolism from glycine" EXACT []
 synonym: "protoporphyrinogen IX formation from glycine" EXACT []
 synonym: "protoporphyrinogen IX synthesis from glycine" EXACT []
-is_a: GO:0006544 ! glycine metabolic process
-is_a: GO:0006782 ! protoporphyrinogen IX biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31788" xsd:anyURI
+is_obsolete: true
+consider: GO:0006780
+consider: GO:0006783
+consider: GO:0015995
 
 [Term]
 id: GO:0019353
-name: protoporphyrinogen IX biosynthetic process from glutamate
+name: obsolete protoporphyrinogen IX biosynthetic process from glutamate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX from other compounds, including glutamate." [PMID:32976912]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of protoporphyrinogen IX from other compounds, including glutamate." [PMID:32976912]
+comment: This term was obsoleted because protoporphyrinogen IX is an intermediate in heme/chlorophyll/uroporphyrinogen biosynthesis.
 synonym: "protoporphyrinogen IX anabolism from glutamate" EXACT []
 synonym: "protoporphyrinogen IX formation from glutamate" EXACT []
 synonym: "protoporphyrinogen IX synthesis from glutamate" EXACT []
-is_a: GO:0006782 ! protoporphyrinogen IX biosynthetic process
-is_a: GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17053" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31788" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0019354
@@ -157357,13 +157378,16 @@
 synonym: "atrazine breakdown" EXACT []
 synonym: "atrazine catabolism" EXACT []
 synonym: "atrazine degradation" EXACT []
+xref: MetaCyc:P141-PWY
 xref: MetaCyc:PWY-5724
 xref: UM-BBD_pathwayID:atr
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0042204 ! s-triazine compound catabolic process
 is_a: GO:0090345 ! organohalogen metabolic process
+property_value: skos:narrowMatch MetaCyc:P141-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0019382
@@ -158575,12 +158599,15 @@
 
 [Term]
 id: GO:0019482
-name: beta-alanine metabolic process
+name: obsolete beta-alanine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving beta-alanine (3-aminopropanoic acid), an achiral amino acid and an isomer of alanine. It occurs free (e.g. in brain) and in combination (e.g. in pantothenate) but it is not a constituent of proteins." [GOC:jl, ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving beta-alanine (3-aminopropanoic acid), an achiral amino acid and an isomer of alanine. It occurs free (e.g. in brain) and in combination (e.g. in pantothenate) but it is not a constituent of proteins." [GOC:jl, ISBN:0198506732]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "beta-alanine metabolism" EXACT []
-xref: Wikipedia:Beta-alanine
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0019483
+consider: GO:0019484
 
 [Term]
 id: GO:0019483
@@ -158597,7 +158624,6 @@
 xref: MetaCyc:PWY-5155
 xref: MetaCyc:PWY-5760
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3941
 property_value: skos:narrowMatch MetaCyc:PWY-3981
@@ -158618,7 +158644,6 @@
 xref: MetaCyc:PWY-1781
 xref: MetaCyc:PWY-8120
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:BETA-ALA-DEGRADATION-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-1781
@@ -160219,35 +160244,41 @@
 
 [Term]
 id: GO:0019623
-name: atrazine catabolic process to urea
+name: obsolete atrazine catabolic process to urea
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into urea." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into urea." [GOC:jl]
+comment: The reason for obsoletion is that this term represents a GO-CAM model.
 synonym: "atrazine breakdown to urea" EXACT []
 synonym: "atrazine degradation to urea" EXACT []
-is_a: GO:0019381 ! atrazine catabolic process
-is_a: GO:0019627 ! urea metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019381
 
 [Term]
 id: GO:0019624
-name: atrazine catabolic process to isopropylamine
+name: obsolete atrazine catabolic process to isopropylamine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into isopropylamine." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into isopropylamine." [GOC:jl]
+comment: The reason for obsoletion is that this term represents a GO-CAM model.
 synonym: "atrazine breakdown to isopropylamine" EXACT []
 synonym: "atrazine degradation to isopropylamine" EXACT []
-is_a: GO:0019381 ! atrazine catabolic process
-property_value: skos:broadMatch MetaCyc:P141-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019381
 
 [Term]
 id: GO:0019625
-name: atrazine catabolic process to cyanuric acid
+name: obsolete atrazine catabolic process to cyanuric acid
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into cyanuric acid." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of atrazine, a triazine ring-containing herbicide, into cyanuric acid." [GOC:jl]
+comment: The reason for obsoletion is that this term represents a GO-CAM model.
 synonym: "atrazine breakdown to cyanuric acid" EXACT []
 synonym: "atrazine degradation to cyanuric acid" EXACT []
-is_a: GO:0019381 ! atrazine catabolic process
-property_value: skos:broadMatch MetaCyc:P141-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019381
 
 [Term]
 id: GO:0019626
@@ -161127,7 +161158,6 @@
 synonym: "alkanesulphonate metabolic process" EXACT []
 synonym: "alkanesulphonate metabolism" EXACT []
 xref: MetaCyc:ALKANEMONOX-PWY
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -161290,7 +161320,7 @@
 xref: Reactome:R-HSA-158832 "The acetyl group from acetyl-CoA is transferred to NAT2"
 xref: Reactome:R-HSA-174959 "The acetyl group from acetyl-CoA is transferred to NAT1"
 xref: RHEA:63372
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:63372
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18882" xsd:anyURI
@@ -172542,15 +172572,17 @@
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
@@ -173008,8 +173040,9 @@
 synonym: "chaperone regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030189
@@ -173020,8 +173053,9 @@
 synonym: "chaperone activator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030190
@@ -173032,8 +173066,9 @@
 synonym: "chaperone inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030191
@@ -173044,8 +173079,9 @@
 synonym: "Hsp70/Hsc70 protein inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030192
@@ -173056,8 +173092,9 @@
 synonym: "Hsp70/Hsc70 protein regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030193
@@ -173988,7 +174025,7 @@
 xref: MetaCyc:2.3.1.101-RXN
 xref: RHEA:18061
 xref: UM-BBD_reactionID:r0346
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.101
 property_value: skos:exactMatch RHEA:18061
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -175785,7 +175822,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "MAPKKK cascade (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030456
@@ -175795,7 +175832,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030457
@@ -175805,7 +175842,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030458
@@ -175815,7 +175852,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKKK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030459
@@ -175825,7 +175862,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "inactivation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030460
@@ -175835,7 +175872,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "nuclear translocation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030463
@@ -181692,7 +181729,6 @@
 synonym: "thiamine pyrophosphate transport" NARROW []
 synonym: "TPP transport" EXACT []
 is_a: GO:0015697 ! quaternary ammonium group transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0071934 ! thiamine transmembrane transport
 
@@ -183404,7 +183440,7 @@
 name: induction of conjugation upon nutrient starvation
 namespace: biological_process
 def: "The process in which a cell initiates conjugation with cellular fusion upon starvation for one or more nutrients." [GOC:mah]
-is_a: GO:0010514 ! induction of conjugation with cellular fusion
+is_a: GO:0031139 ! positive regulation of conjugation with cellular fusion
 
 [Term]
 id: GO:0031141
@@ -184348,11 +184384,14 @@
 
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
@@ -185974,11 +186013,13 @@
 
 [Term]
 id: GO:0031388
-name: organic acid phosphorylation
+name: obsolete organic acid phosphorylation
 namespace: biological_process
-def: "The process of introducing one or more phosphate groups into an organic acid." [GOC:mah]
-is_a: GO:0006082 ! organic acid metabolic process
-is_a: GO:0016310 ! phosphorylation
+def: "OBSOLETE. The process of introducing one or more phosphate groups into an organic acid." [GOC:mah]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31816" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008152
 
 [Term]
 id: GO:0031389
@@ -186799,7 +186840,6 @@
 namespace: biological_process
 def: "The directed movement of glycine betaine, N-trimethylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "N-trimethylglycine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -191110,7 +191150,6 @@
 name: pyridoxal transport
 namespace: biological_process
 def: "The directed movement of pyridoxal into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxal, 3-hydroxy-5-(hydroxymethyl)-2-methyl-4-pyridinecarboxaldehyde, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -191119,7 +191158,6 @@
 name: pyridoxal phosphate transport
 namespace: biological_process
 def: "The directed movement of pyridoxal phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore; pyridoxal phosphate is pyridoxal phosphorylated at the hydroxymethyl group of C-5, and is the active form of vitamin B6." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
@@ -191129,7 +191167,6 @@
 name: pyridoxamine transport
 namespace: biological_process
 def: "The directed movement of pyridoxamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxamine, 4-(aminomethyl)-5-(hydroxymethyl)-2-methylpyridin-3-ol, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -192064,13 +192101,13 @@
 
 [Term]
 id: GO:0032005
-name: signal transduction involved in positive regulation of conjugation with cellular fusion
+name: obsolete signal transduction involved in positive regulation of conjugation with cellular fusion
 namespace: biological_process
-def: "The series of molecular signals that bring about the relay, amplification or dampening of a signal generated in response to a cue, such as starvation or pheromone exposure, in organisms that undergo conjugation with cellular fusion." [GOC:mah]
-is_a: GO:0007165 ! signal transduction
-is_a: GO:0031139 ! positive regulation of conjugation with cellular fusion
-intersection_of: GO:0007165 ! signal transduction
-intersection_of: positively_regulates GO:0000747 ! conjugation with cellular fusion
+def: "OBSOLETE. The series of molecular signals that bring about the relay, amplification or dampening of a signal generated in response to a cue, such as starvation or pheromone exposure, in organisms that undergo conjugation with cellular fusion." [GOC:mah]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0032006
@@ -194366,7 +194403,7 @@
 synonym: "GPI-inositol acyltransferase" RELATED []
 xref: RHEA:60496
 xref: RHEA:83759
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:60496
 property_value: skos:narrowMatch RHEA:83759
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30693" xsd:anyURI
@@ -194387,7 +194424,6 @@
 name: riboflavin transport
 namespace: biological_process
 def: "The directed movement of riboflavin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Riboflavin (vitamin B2) is a water-soluble B-complex vitamin, converted in the cell to FMN and FAD, cofactors required for the function of flavoproteins." [GOC:rn, PMID:16204239]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -195040,7 +195076,7 @@
 namespace: biological_process
 def: "The regulated release of a gonadotropin, any hormone that stimulates the gonads, especially follicle-stimulating hormone and luteinizing hormone." [GOC:mah, ISBN:0721662544]
 synonym: "gonadotrophin secretion" EXACT []
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032275
@@ -195542,7 +195578,6 @@
 name: alanine transport
 namespace: biological_process
 def: "The directed movement of alanine, 2-aminopropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195554,7 +195589,6 @@
 alt_id: GO:0090478
 def: "The directed movement of L-serine, 2-amino-3-hydroxypropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "serine import" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195617,7 +195651,7 @@
 name: inhibin secretion
 namespace: biological_process
 def: "The regulated release of an inhibin, either of two glycoproteins (designated A and B), secreted by the gonads and present in seminal plasma and follicular fluid, that inhibit pituitary production of follicle-stimulating hormone." [GOC:mah]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032335
@@ -196649,7 +196683,6 @@
 is_a: GO:0043005 ! neuron projection
 is_a: GO:0098858 ! actin-based cell projection
 relationship: part_of GO:0032421 ! stereocilium bundle
-relationship: part_of GO:0043226 ! organelle
 
 [Term]
 id: GO:0032421
@@ -198225,7 +198258,7 @@
 name: O-linoleoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a linoleoyl ((9Z,12Z)-octadeca-9,12-dienoyl) group to an oxygen atom on the acceptor molecule." [GOC:cb]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0032577
@@ -203023,34 +203056,47 @@
 
 [Term]
 id: GO:0032917
-name: polyamine acetylation
+name: obsolete polyamine acetylation
 namespace: biological_process
-def: "The modification of polyamines by addition of acetyl groups." [GOC:mlg]
-is_a: GO:0006595 ! polyamine metabolic process
+def: "OBSOLETE. The modification of polyamines by addition of acetyl groups." [GOC:mlg]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0004145
+consider: GO:0006598
 
 [Term]
 id: GO:0032918
-name: spermidine acetylation
+name: obsolete spermidine acetylation
 namespace: biological_process
-def: "The modification of spermidine by addition of acetyl groups." [GOC:mlg]
-is_a: GO:0008216 ! spermidine metabolic process
-is_a: GO:0032917 ! polyamine acetylation
+def: "OBSOLETE. The modification of spermidine by addition of acetyl groups." [GOC:mlg]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0004145
+consider: GO:0046203
 
 [Term]
 id: GO:0032919
-name: spermine acetylation
+name: obsolete spermine acetylation
 namespace: biological_process
-def: "The modification of spermine by addition of acetyl groups." [GOC:mlg]
-is_a: GO:0008215 ! spermine metabolic process
-is_a: GO:0032917 ! polyamine acetylation
+def: "OBSOLETE. The modification of spermine by addition of acetyl groups." [GOC:mlg]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0004145
+consider: GO:0046208
 
 [Term]
 id: GO:0032920
-name: putrescine acetylation
+name: obsolete putrescine acetylation
 namespace: biological_process
-def: "The modification of putrescine by addition of acetyl groups." [GOC:mlg]
-is_a: GO:0009445 ! putrescine metabolic process
-is_a: GO:0032917 ! polyamine acetylation
+def: "OBSOLETE. The modification of putrescine by addition of acetyl groups." [GOC:mlg]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0004145
+consider: GO:0009447
 
 [Term]
 id: GO:0032921
@@ -203808,7 +203854,8 @@
 synonym: "insertion of proteins into the mitochondrial membrane from the inner side" EXACT []
 synonym: "protein insertion into mitochondrial inner membrane from matrix side" EXACT []
 synonym: "protein insertion into mitochondrial membrane from inner side" EXACT []
-is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+is_a: GO:0007007 ! inner mitochondrial membrane organization
+is_a: GO:0051204 ! protein insertion into mitochondrial membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25265" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30453" xsd:anyURI
 
@@ -206254,9 +206301,10 @@
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
@@ -206366,46 +206414,54 @@
 
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
@@ -206909,7 +206965,6 @@
 namespace: biological_process
 def: "The directed movement of myo-inositol hexakisphosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "phytate transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033271 ! myo-inositol phosphate transport
 
 [Term]
@@ -207723,10 +207778,15 @@
 synonym: "SAM cycle" EXACT []
 xref: MetaCyc:PWY-5041
 xref: MetyaCyc:PWY-6151
+is_a: GO:0006555 ! L-methionine metabolic process
+is_a: GO:0006575 ! modified amino acid metabolic process
+is_a: GO:0046128 ! purine ribonucleoside metabolic process
 is_a: GO:0046500 ! S-adenosylmethionine metabolic process
+is_a: GO:0050667 ! homocysteine metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5041
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31840" xsd:anyURI
 
 [Term]
 id: GO:0033354
@@ -208128,59 +208188,65 @@
 
 [Term]
 id: GO:0033387
-name: putrescine biosynthetic process from arginine, via ornithine
+name: obsolete putrescine biosynthetic process from arginine, via ornithine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from arginine, via decarboxylation of ornithine." [GOC:mah, MetaCyc:PWY-46]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from arginine, via decarboxylation of ornithine." [GOC:mah, MetaCyc:PWY-46]
+comment: The reason for obsoletion is that this term represents a GO-CAM.
 synonym: "putrescine anabolism from ornithine" EXACT []
 synonym: "putrescine biosynthesis from ornithine" EXACT []
 synonym: "putrescine biosynthetic process from ornithine" EXACT []
 synonym: "putrescine formation from ornithine" EXACT []
 synonym: "putrescine synthesis from ornithine" EXACT []
-xref: MetaCyc:PWY-46
-is_a: GO:0033388 ! putrescine biosynthetic process from arginine
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009446
 
 [Term]
 id: GO:0033388
-name: putrescine biosynthetic process from arginine
+name: obsolete putrescine biosynthetic process from arginine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from other compounds, including arginine." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from other compounds, including arginine." [GOC:mah]
+comment: The reason for obsoletion is that this term represents a GO-CAM.
 synonym: "putrescine anabolism from arginine" EXACT []
 synonym: "putrescine biosynthesis from arginine" EXACT []
 synonym: "putrescine formation from arginine" EXACT []
 synonym: "putrescine synthesis from arginine" EXACT []
-is_a: GO:0006525 ! arginine metabolic process
-is_a: GO:0009446 ! putrescine biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
-is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009446
 
 [Term]
 id: GO:0033389
-name: putrescine biosynthetic process from arginine, via agmatine
+name: obsolete putrescine biosynthetic process from arginine, via agmatine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from arginine via agmatine." [GOC:mah, MetaCyc:PWY-40]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from arginine via agmatine." [GOC:mah, MetaCyc:PWY-40]
+comment: The reason for obsoletion is that this term represents a GO-CAM.
 synonym: "putrescine anabolism from arginine, using agmatinase" EXACT []
 synonym: "putrescine biosynthesis from arginine, using agmatinase" EXACT []
 synonym: "putrescine biosynthetic process from arginine, using agmatinase" EXACT []
 synonym: "putrescine formation from arginine, using agmatinase" EXACT []
 synonym: "putrescine synthesis from arginine, using agmatinase" EXACT []
-xref: MetaCyc:PWY-40
-is_a: GO:0033388 ! putrescine biosynthetic process from arginine
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009446
 
 [Term]
 id: GO:0033390
-name: putrescine biosynthetic process from arginine via N-carbamoylputrescine
+name: obsolete putrescine biosynthetic process from arginine via N-carbamoylputrescine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from other compounds, including arginine, via the intermediate N-carbamoylputrescine; in this pathway, arginine is converted to agmatine, and agmatine is converted to putrescine in two single enzymatic steps." [GOC:mah, MetaCyc:PWY-43]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of putrescine, 1,4-diaminobutane, from other compounds, including arginine, via the intermediate N-carbamoylputrescine; in this pathway, arginine is converted to agmatine, and agmatine is converted to putrescine in two single enzymatic steps." [GOC:mah, MetaCyc:PWY-43]
+comment: The reason for obsoletion is that this term represents a GO-CAM.
 synonym: "putrescine anabolism from arginine via N-carbamoylputrescine" EXACT []
 synonym: "putrescine biosynthesis from arginine via N-carbamoylputrescine" EXACT []
 synonym: "putrescine formation from arginine via N-carbamoylputrescine" EXACT []
 synonym: "putrescine synthesis from arginine via N-carbamoylputrescine" EXACT []
-xref: MetaCyc:PWY-43
-is_a: GO:0033388 ! putrescine biosynthetic process from arginine
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009446
 
 [Term]
 id: GO:0033391
@@ -210524,7 +210590,7 @@
 id: GO:0033608
 name: formyl-CoA transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: formyl-CoA + oxalate = formate + oxalyl-CoA." [EC:2.8.3.16, RHEA:16545]
+def: "Catalysis of the reaction: formyl-CoA + oxalate = formate + oxalyl-CoA." [RHEA:16545]
 synonym: "formyl-CoA oxalate CoA-transferase activity" RELATED [EC:2.8.3.16]
 synonym: "formyl-CoA:oxalate CoA-transferase activity" RELATED [EC:2.8.3.16]
 synonym: "formyl-coenzyme A transferase activity" RELATED [EC:2.8.3.16]
@@ -213389,7 +213455,7 @@
 xref: KEGG_REACTION:R03064
 xref: MetaCyc:2.3.1.175-RXN
 xref: RHEA:23860
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.175
 property_value: skos:exactMatch RHEA:23860
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -213408,7 +213474,7 @@
 synonym: "sterol carrier protein-X" RELATED [EC:2.3.1.176]
 xref: MetaCyc:2.3.1.176-RXN
 xref: RHEA:16865
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:broadMatch EC:2.3.1.176
 property_value: skos:exactMatch RHEA:16865
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -214403,7 +214469,7 @@
 name: succinyl-CoA:(R)-benzylsuccinate CoA-transferase activity
 namespace: molecular_function
 alt_id: GO:0018728
-def: "Catalysis of the reaction: (R)-2-benzylsuccinate + succinyl-CoA = (R)-2-benzylsuccinyl-CoA + succinate." [EC:2.8.3.15, RHEA:16469]
+def: "Catalysis of the reaction: (R)-2-benzylsuccinate + succinyl-CoA = (R)-2-benzylsuccinyl-CoA + succinate." [RHEA:16469]
 synonym: "benzylsuccinate CoA-transferase activity" RELATED [EC:2.8.3.15]
 synonym: "succinyl-CoA:(R)-2-benzylsuccinate CoA-transferase activity" RELATED [EC:2.8.3.15]
 synonym: "succinyl-CoA:benzylsuccinate CoA-transferase activity" EXACT []
@@ -219104,7 +219170,6 @@
 def: "The directed movement of ethanolamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Ethanolamine (2-aminoethanol, monoethanolamine) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids, such as phosphatidylethanolamine." [GOC:rn, PMID:3514579]
 synonym: "2-aminoethanol transport" EXACT []
 synonym: "monoethanolamine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 
@@ -219630,8 +219695,10 @@
 synonym: "kynurenic acid biosynthesis" EXACT []
 synonym: "kynurenic acid formation" RELATED []
 synonym: "kynurenic acid synthesis" EXACT []
+synonym: "kynurenine pathway" BROAD []
 is_a: GO:0034275 ! kynurenic acid metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034277
@@ -220061,7 +220128,7 @@
 synonym: "acyl-coenzymeA:ethanol O-acyltransferase activity" NARROW []
 synonym: "AEATase activity" NARROW []
 synonym: "alcohol acyltransferase activity" EXACT []
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0034319
@@ -220456,6 +220523,7 @@
 synonym: "'de novo' NAD biosynthetic process from L-tryptophan" EXACT []
 synonym: "'de novo' NAD biosynthetic process from tryptophan" BROAD []
 synonym: "de novo NAD biosynthetic process from tryptophan" RELATED []
+synonym: "kynurenine pathway" BROAD []
 xref: MetaCyc:NADSYN-PWY
 xref: MetaCyc:PWY-5653
 is_a: GO:0006568 ! L-tryptophan metabolic process
@@ -220464,6 +220532,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5653
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29050" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29666" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034355
@@ -223232,7 +223301,6 @@
 name: glutathione transport
 namespace: biological_process
 def: "The directed movement of glutathione, the tripeptide glutamylcysteinylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0042939 ! tripeptide transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -231122,7 +231190,6 @@
 def: "The process in which triose phosphate (glyceraldehyde 3-phosphate) is transported across a membrane. Glyceraldehyde 3-phosphate is any organic three carbon compound phosphate ester." [GOC:bf, ISBN:0198506732]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "triose phosphate membrane transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015717 ! triose phosphate transport
 is_a: GO:0055085 ! transmembrane transport
 created_by: bf
@@ -235892,13 +235959,16 @@
 
 [Term]
 id: GO:0035842
-name: old cell tip after activation of bipolar cell growth
+name: obsolete old cell tip after activation of bipolar cell growth
 namespace: cellular_component
-def: "A cell tip which has existed for at least one complete cell cycle, and at which polarized growth occurs, which is part of a cell that has activated bipolar cell growth (i.e. in which new end take-off, NETO, has taken place). For example, in fission yeast the cell end that existed prior to cell division grows immediately after division, and contains a distinctive complement of proteins including actin cytoskeletal structures." [GOC:expert_jd, GOC:mah]
+def: "OBSOLETE. A cell tip which has existed for at least one complete cell cycle, and at which polarized growth occurs, which is part of a cell that has activated bipolar cell growth (i.e. in which new end take-off, NETO, has taken place). For example, in fission yeast the cell end that existed prior to cell division grows immediately after division, and contains a distinctive complement of proteins including actin cytoskeletal structures." [GOC:expert_jd, GOC:mah]
+comment: This term was obsoleted because the parent process, activation of bipolar cell growth, GO:0051519, was obsoleted.
 synonym: "post-NETO old cell end" EXACT [GOC:mah]
 synonym: "post-NETO old cell tip" EXACT [GOC:mah]
 synonym: "post-new end take-off old cell tip" EXACT [GOC:mah]
-is_a: GO:0035840 ! old growing cell tip
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31746" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0035840
 created_by: bf
 creation_date: 2011-05-06T01:37:23Z
 
@@ -236580,7 +236650,7 @@
 synonym: "parathormone secretion" EXACT [PR:000013429]
 synonym: "parathyrin secretion" EXACT [PR:000013429]
 synonym: "PTH secretion" EXACT [PMID:12171519, PR:000013429]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 created_by: bf
 creation_date: 2011-06-22T09:28:54Z
 
@@ -236944,7 +237014,7 @@
 name: steroid hormone secretion
 namespace: biological_process
 def: "The regulated release of any steroid that acts as a hormone into the circulatory system." [GOC:sl]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 created_by: bf
 creation_date: 2011-07-20T01:01:00Z
@@ -244053,10 +244123,14 @@
 
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
 
@@ -245141,7 +245215,7 @@
 synonym: "nitric oxide-cGMP-mediated signaling pathway" EXACT []
 synonym: "nitric oxide-cGMP-mediated signalling pathway" EXACT [GOC:mah]
 synonym: "NO-cGMP signaling pathway" EXACT [PMID:22019632]
-is_a: GO:0007263 ! nitric oxide mediated signal transduction
+is_a: GO:0141124 ! intracellular signaling cassette
 created_by: bf
 creation_date: 2012-01-10T05:32:39Z
 
@@ -248776,9 +248850,9 @@
 name: RNA translocase activity
 namespace: molecular_function
 def: "Generating a movement along a single- or double-stranded RNA molecule, driven by ATP hydrolysis." [GOC:bm, PMID:22713318]
-comment: Note that some gene products that possess DNA translocase activity, such as members of the FtsK/SpoIIIE family, can be fixed in place by interactions with other components of the cell; the relative movement between the protein and DNA bound to it results in movement of the DNA within the cell, often across a membrane.
 is_a: GO:0008186 ! ATP-dependent activity, acting on RNA
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21612" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31772" xsd:anyURI
 created_by: bf
 creation_date: 2012-08-06T13:24:51Z
 
@@ -258409,7 +258483,9 @@
 def: "The chemical reactions and pathways involving any of the vitamin B6 compounds: pyridoxal, pyridoxamine and pyridoxine and the active form, pyridoxal phosphate." [GOC:jl, PMID:30037155, PMID:30671974]
 synonym: "vitamin B6 metabolism" EXACT []
 xref: Reactome:R-HSA-964975 "Vitamin B6 activation to pyridoxal phosphate"
+is_a: GO:0006766 ! vitamin metabolic process
 is_a: GO:0072524 ! pyridine-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31855" xsd:anyURI
 
 [Term]
 id: GO:0042817
@@ -259129,13 +259205,13 @@
 
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
@@ -259447,7 +259523,6 @@
 def: "The directed movement of an alkanesulfonate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Alkanesulfonates are organic esters or salts of sulfonic acid containing an aliphatic hydrocarbon radical." [PMID:31802112]
 synonym: "alkanesulfonate transport" BROAD []
 synonym: "alkanesulphonate transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -259549,7 +259624,6 @@
 namespace: biological_process
 def: "The directed movement of the siderochrome enterobactin, a cyclic trimer of 2, 3 dihydroxybenzoylserine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl]
 synonym: "enterochelin transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0015891 ! siderophore transport
 
@@ -262376,7 +262450,6 @@
 name: daunorubicin transport
 namespace: biological_process
 def: "The directed movement of daunorubicin, an anthracycline antibiotic produced by Streptomyces coeruleorubidus or S. peucetius and used as an antineoplastic into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, GOC:mlg]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
 
@@ -262738,7 +262811,7 @@
 name: sodium-dependent organic anion transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043252
@@ -262746,7 +262819,7 @@
 namespace: biological_process
 def: "The directed, sodium-independent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
 xref: Reactome:R-HSA-879518 "Organic anion transport by SLCO transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043253
@@ -264862,7 +264935,7 @@
 synonym: "oxo acid metabolic process" EXACT []
 synonym: "oxo acid metabolism" EXACT []
 synonym: "oxoacid metabolism" EXACT []
-is_a: GO:0006082 ! organic acid metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0043438
@@ -267743,12 +267816,17 @@
 
 [Term]
 id: GO:0043712
-name: 2-hydroxyisocaproate CoA-transferase activity
+name: (R)-2-hydroxy-4-methylpentanoate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (R)-2-hydroxyisocaproate + isocaproyl-CoA = (R)-2-hydroxyisocaproyl-CoA + isocaproate." [PMID:16957230]
+def: "Catalysis of the reaction: 4-methylpentanoyl-CoA + (2R)-hydroxy-4-methylpentanoate = (R)-2-hydroxy-4-methylpentanoyl-CoA + 4-methylpentanoate." [PMID:16957230, RHEA:49440]
 synonym: "(R)-2-hydroxyisocaproate CoA transferase activity" EXACT []
-synonym: "(R)-2-hydroxyisocaproate CoA-transferase activity" EXACT []
+synonym: "2-hydroxyisocaproate CoA-transferase activity" EXACT []
+synonym: "https://github.com/geneontology/go-ontology/issues/31862" EXACT []
+xref: EC:2.8.3.24
+xref: RHEA:49440
 is_a: GO:0008410 ! CoA-transferase activity
+property_value: skos:exactMatch EC:2.8.3.24
+property_value: skos:exactMatch RHEA:49440
 
 [Term]
 id: GO:0043713
@@ -267863,7 +267941,7 @@
 id: GO:0043721
 name: 4-hydroxybutanoyl-CoA dehydratase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-hydroxybutanoyl-CoA = vinylacetyl-CoA + H2O." [EC:4.2.1.120]
+def: "Catalysis of the reaction: 4-hydroxybutanoyl-CoA = (2E)-butenoyl-CoA + H2O." [RHEA:26530]
 synonym: "4-hydroxybutanoyl-CoA hydro-lyase" EXACT []
 synonym: "4-hydroxybutyryl-CoA dehydratase activity" EXACT []
 synonym: "gamma-hydroxybutanoyl-CoA dehydratase activity" EXACT []
@@ -268663,7 +268741,7 @@
 id: GO:0043785
 name: cinnamoyl-CoA:phenyllactate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (R)-3-phenyllactate + [(2R,3S,4R,5R)-5-(6-amino-9H-purin-9-yl)-4-hydroxy-3-(phosphonatooxy)oxolan-2-yl]methyl {[(3R)-3-hydroxy-2,2-dimethyl-3-({2-[(2-{[(2E)-3-phenylprop-2-enoyl]sulfanyl}ethyl)carbamoyl]ethyl}carbamoyl)propyl phosphonato]oxy}phosphonate = (R)-3-phenyllactoyl-CoA + trans-cinnamate." [EC:2.8.3.17, RHEA:15601]
+def: "Catalysis of the reaction: (E)-cinnamoyl-CoA + (R)-3-phenyllactate = (R)-3-phenyllactoyl-CoA + (E)-cinnamate." [RHEA:15601]
 synonym: "(E)-cinnamoyl-CoA:(R)-phenyllactate CoA-transferase activity" EXACT []
 synonym: "FldA" RELATED []
 xref: EC:2.8.3.17
@@ -268973,7 +269051,7 @@
 name: lyso-ornithine lipid acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: lyso-ornithine lipid + acyl-[acyl-carrier protein] = ornithine lipid + [acyl-carrier protein]." [PMID:15341653]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0043810
@@ -268984,7 +269062,7 @@
 synonym: "ornithine-acyl[acyl carrier protein] N-acyltransferase activity" EXACT []
 xref: EC:2.3.2.30
 xref: RHEA:20633
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0140371 ! ornithine lipid biosynthetic process
 property_value: skos:exactMatch EC:2.3.2.30
 property_value: skos:exactMatch RHEA:20633
@@ -269151,7 +269229,7 @@
 id: GO:0043821
 name: propionyl-CoA:succinate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinate + propionyl-CoA = succinyl-CoA + propionate." [PMID:10769117]
+def: "Catalysis of the reaction: succinate + propionyl-CoA = succinyl-CoA + propionate." [PMID:10769117, RHEA:28010]
 synonym: "propionyl-CoA succinate CoA-transferase activity" EXACT []
 synonym: "propionyl-CoA:succinate CoA transferase activity" EXACT []
 xref: MetaCyc:RXN0-268
@@ -271016,7 +271094,7 @@
 id: GO:0043961
 name: succinyl-CoA:(R)-citramalate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinyl-CoA + (R)-citramalate = succinate + (R)-citramalyl-CoA." [GOC:jl, PMID:17259315]
+def: "Catalysis of the reaction: succinyl-CoA + (R)-citramalate = succinate + (R)-citramalyl-CoA." [PMID:17259315, RHEA:38279]
 synonym: "L-carnitine dehydratase/bile acid-inducible protein F" RELATED []
 synonym: "succinyl-CoA:(R)-citramalate CoA transferase activity" EXACT []
 synonym: "succinyl-CoA:R-citramalate CoA transferase" EXACT []
@@ -272625,10 +272703,14 @@
 id: GO:0044104
 name: 2,5-dioxovalerate dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,5-dioxopentanoate + NAD+ + H2O = 2-oxoglutarate + NADH + H+." [PMID:16835232, PMID:17202142]
+def: "Catalysis of the reaction: 2,5-dioxopentanoate + NAD+ + H2O = 2-oxoglutarate + NADH + 2 H+." [PMID:16835232, PMID:17202142, RHEA:47152]
 synonym: "2,5-dioxopentanoate dehydrogenase (NAD+) activity" EXACT []
 synonym: "2,5-dioxopentanoate:NAD+ 5-oxidoreductase activity" EXACT []
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+xref: MetaCyc:RXN-8775
+xref: RHEA:47152
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
+property_value: skos:exactMatch RHEA:47152
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 created_by: jl
 creation_date: 2009-07-09T04:15:14Z
 
@@ -273385,7 +273467,6 @@
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
 is_a: GO:0003674 ! molecular_function
-relationship: has_part GO:0051082 ! unfolded protein binding
 relationship: part_of GO:0006457 ! protein folding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30552" xsd:anyURI
 created_by: jl
@@ -278889,9 +278970,19 @@
 id: GO:0044688
 name: 7,8-dihydro-D-neopterin 2',3'-cyclic phosphate phosphodiesterase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 7,8-dihydro-D-neopterin 2',3'-cyclic phosphate + H2O = 7,8-dihydroneopterin 3'-phosphate + H+." [GOC:mengo_curators, PMID:19746965]
+def: "Catalysis of the reaction: 7,8-dihydro-D-neopterin 2',3'-cyclic phosphate + H2O = 7,8-dihydroneopterin 3'-phosphate or 7,8-dihydroneopterin 2'-phosphate + H+." [EC:3.1.4.56]
+xref: EC:3.1.4.56
+xref: MetaCyc:RXN-12356
+xref: MetaCyc:RXN-12357 {xref="skos:narrowMatch"}
+xref: RHEA:35799
+xref: RHEA:35803
 is_a: GO:0008081 ! phosphoric diester hydrolase activity
 relationship: part_of GO:2001116 ! methanopterin-containing compound biosynthetic process
+property_value: skos:exactMatch EC:3.1.4.56
+property_value: skos:narrowMatch MetaCyc:RXN-12356
+property_value: skos:narrowMatch RHEA:35799
+property_value: skos:narrowMatch RHEA:35803
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 created_by: jl
 creation_date: 2012-08-15T14:28:30Z
 
@@ -281170,9 +281261,10 @@
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
@@ -281193,18 +281285,16 @@
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
@@ -283622,6 +283712,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 
 [Term]
 id: GO:0045276
@@ -283653,6 +283744,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27727" xsd:anyURI
 
 [Term]
@@ -283964,8 +284056,10 @@
 synonym: "nor-spermidine biosynthesis" EXACT []
 synonym: "nor-spermidine formation" EXACT []
 synonym: "nor-spermidine synthesis" EXACT []
+xref: MetaCyc:PWY-6562
 is_a: GO:0006596 ! polyamine biosynthetic process
 is_a: GO:0046204 ! nor-spermidine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0045313
@@ -284621,7 +284715,7 @@
 namespace: biological_process
 def: "The regulated release of juvenile hormones, the three sesquiterpenoid derivatives that function to maintain the larval state of insects at molting and that may be required for other processes, e.g. oogenesis." [GOC:curators, ISBN:0198547684]
 is_a: GO:0046865 ! terpenoid transport
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 
 [Term]
@@ -294650,6 +294744,10 @@
 synonym: "spermidine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008216 ! spermidine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046204
@@ -294699,6 +294797,10 @@
 synonym: "spermine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008215 ! spermine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046209
@@ -294966,7 +295068,6 @@
 synonym: "2-aminobenzenesulphonate catabolic process" EXACT []
 synonym: "2-aminobenzenesulphonate catabolism" EXACT []
 is_a: GO:0009310 ! amine catabolic process
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
 is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
@@ -295468,8 +295569,8 @@
 synonym: "toluene-4-sulfonate degradation" EXACT []
 synonym: "toluene-4-sulphonate catabolic process" EXACT []
 synonym: "toluene-4-sulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:0072491 ! toluene-containing compound catabolic process
 
 [Term]
@@ -295916,7 +296017,6 @@
 synonym: "alkanesulfonate synthesis" EXACT []
 synonym: "alkanesulphonate biosynthesis" EXACT []
 synonym: "alkanesulphonate biosynthetic process" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 
@@ -295930,7 +296030,6 @@
 synonym: "alkanesulfonate degradation" EXACT []
 synonym: "alkanesulphonate catabolic process" EXACT []
 synonym: "alkanesulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 
@@ -297002,8 +297101,8 @@
 synonym: "carboxylic acid biosynthesis" EXACT []
 synonym: "carboxylic acid formation" EXACT []
 synonym: "carboxylic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 
 [Term]
 id: GO:0046395
@@ -297013,8 +297112,8 @@
 synonym: "carboxylic acid breakdown" EXACT []
 synonym: "carboxylic acid catabolism" EXACT []
 synonym: "carboxylic acid degradation" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 
 [Term]
 id: GO:0046396
@@ -298044,9 +298143,10 @@
 
 [Term]
 id: GO:0046482
-name: para-aminobenzoic acid metabolic process
+name: obsolete para-aminobenzoic acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving para-aminobenzoic acid, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [PMID:11960743]
+def: "OBSOLETE. The chemical reactions and pathways involving para-aminobenzoic acid, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [PMID:11960743]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "4-aminobenzoic acid metabolic process" EXACT []
 synonym: "4-aminobenzoic acid metabolism" EXACT []
 synonym: "p-aminobenzoic acid metabolic process" EXACT []
@@ -298056,9 +298156,8 @@
 synonym: "para-aminobenzoic acid metabolism" EXACT []
 synonym: "vitamin Bx metabolic process" EXACT []
 synonym: "vitamin Bx metabolism" EXACT []
-is_a: GO:0009072 ! aromatic amino acid metabolic process
-is_a: GO:0032787 ! monocarboxylic acid metabolic process
-is_a: GO:0042537 ! benzene-containing compound metabolic process
+is_obsolete: true
+consider: GO:0008153
 
 [Term]
 id: GO:0046483
@@ -298239,12 +298338,13 @@
 
 [Term]
 id: GO:0046501
-name: protoporphyrinogen IX metabolic process
+name: obsolete protoporphyrinogen IX metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving protoporphyrinogen IX, the specific substrate for the enzyme ferrochelatase, which catalyzes the insertion of iron to form protoheme. It is probably also the substrate for chlorophyll formation." [ISBN:0198506732]
-comment: See also the molecular function term 'ferrochelatase activity ; GO:0004325'.
+def: "OBSOLETE. The chemical reactions and pathways involving protoporphyrinogen IX, the specific substrate for the enzyme ferrochelatase, which catalyzes the insertion of iron to form protoheme. It is probably also the substrate for chlorophyll formation." [ISBN:0198506732]
+comment: This term was obsoleted because protoporphyrinogen IX is an intermediate in heme/chlorophyll/uroporphyrinogen biosynthesis.
 synonym: "protoporphyrinogen IX metabolism" EXACT []
-is_a: GO:0006778 ! porphyrin-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31788" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0046502
@@ -300891,18 +300991,15 @@
 
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
 
@@ -303290,7 +303387,6 @@
 name: carboxylic acid transport
 namespace: biological_process
 def: "The directed movement of carboxylic acids into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carboxylic acids are organic acids containing one or more carboxyl (COOH) groups or anions (COO-)." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 
 [Term]
@@ -303387,21 +303483,24 @@
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
@@ -303412,6 +303511,7 @@
 is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:1901569 ! fatty acid derivative catabolic process
 is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
 
 [Term]
 id: GO:0046956
@@ -303534,7 +303634,6 @@
 synonym: "3'-phosphoadenosine 5'-phosphosulphate transport" EXACT []
 synonym: "adenosine 3'-phosphate 5'-phosphosulfate transport" EXACT []
 synonym: "PAPS transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -305328,7 +305427,7 @@
 id: GO:0047077
 name: Photinus-luciferin 4-monooxygenase (ATP-hydrolyzing) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: O2 + ATP + Photinus luciferin = light + diphosphate + AMP + CO2 + oxidized Photinus luciferin." [EC:1.13.12.7, MetaCyc:1.13.12.7-RXN]
+def: "Catalysis of the reaction: O2 + ATP + Photinus luciferin = light + diphosphate + AMP + CO2 + oxidized Photinus luciferin." [EC:1.13.12.7]
 synonym: "firefly luciferase activity" RELATED [EC:1.13.12.7]
 synonym: "firefly luciferin luciferase activity" RELATED [EC:1.13.12.7]
 synonym: "luciferase (firefly luciferin)" RELATED [EC:1.13.12.7]
@@ -305407,9 +305506,9 @@
 
 [Term]
 id: GO:0047081
-name: 3-hydroxy-2-methylpyridinecarboxylate dioxygenase activity
+name: 3-hydroxy-2-methylpyridinecarboxylate dioxygenase [NAD(P)H] activity
 namespace: molecular_function
-def: "Catalysis of the reaction: O2 + NADPH + H+ + 3-hydroxy-2-methylpyridine-5-carboxylate = NADP+ + 2-(acetamidomethylene)succinate." [EC:1.14.13.242, MetaCyc:1.14.12.4-RXN]
+def: "Catalysis of the reaction: O2 + NAD(P)H + H+ + 3-hydroxy-2-methylpyridine-5-carboxylate = NAD(P)+ + 2-(acetamidomethylene)succinate." [EC:1.14.13.242]
 synonym: "2-methyl-3-hydroxypyridine 5-carboxylic acid dioxygenase activity" RELATED [EC:1.14.13.242]
 synonym: "3-hydroxy-2-methylpyridine-5-carboxylate,NADPH:oxygen oxidoreductase (decyclizing)" RELATED [EC:1.14.13.242]
 synonym: "3-hydroxy-3-methylpyridinecarboxylate dioxygenase activity" RELATED [EC:1.14.13.242]
@@ -305417,10 +305516,12 @@
 synonym: "methylhydroxypyridinecarboxylate oxidase activity" RELATED [EC:1.14.13.242]
 xref: EC:1.14.13.242
 xref: MetaCyc:1.14.12.4-RXN
+xref: RHEA:10860
 xref: RHEA:10864
 is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
 property_value: skos:exactMatch EC:1.14.13.242
-property_value: skos:exactMatch RHEA:10864
+property_value: skos:narrowMatch RHEA:10860
+property_value: skos:narrowMatch RHEA:10864
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -305583,7 +305684,6 @@
 xref: KEGG_REACTION:R00448
 xref: MetaCyc:1.14.13.59-RXN
 xref: RHEA:23228
-is_a: GO:0016703 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of one atom of oxygen (internal monooxygenases or internal mixed function oxidases)
 is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.13.59
 property_value: skos:exactMatch RHEA:23228
@@ -306495,7 +306595,6 @@
 xref: Reactome:R-HSA-1482646 "2-acyl LPE is acylated to PE by LPEAT"
 xref: Reactome:R-HSA-1482691 "2-acyl LPS is acylated to PS by LPSAT"
 xref: RHEA:14233
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0042171 ! lysophosphatidic acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.52
 property_value: skos:exactMatch RHEA:14233
@@ -306774,7 +306873,7 @@
 xref: RHEA:37627
 xref: RHEA:37711
 xref: RHEA:37819
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.25
 property_value: skos:exactMatch RHEA:10344
 property_value: skos:narrowMatch RHEA:37627
@@ -306910,7 +307009,7 @@
 xref: RHEA:37755
 xref: RHEA:37759
 xref: RHEA:37763
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.121
 property_value: skos:exactMatch RHEA:16245
 property_value: skos:narrowMatch RHEA:37631
@@ -306930,7 +307029,7 @@
 xref: EC:2.3.1.125
 xref: MetaCyc:2.3.1.125-RXN
 xref: RHEA:21996
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.125
 property_value: skos:exactMatch RHEA:21996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307025,7 +307124,7 @@
 xref: RHEA:55320
 xref: RHEA:56244
 xref: RHEA:56248
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.135
 property_value: skos:exactMatch RHEA:17469
 property_value: skos:narrowMatch RHEA:55320
@@ -307049,7 +307148,6 @@
 xref: KEGG_REACTION:R01944
 xref: MetaCyc:2.3.1.138-RXN
 xref: RHEA:12436
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.138
 property_value: skos:exactMatch RHEA:12436
@@ -307066,7 +307164,7 @@
 xref: EC:2.3.1.141
 xref: MetaCyc:2.3.1.141-RXN
 xref: RHEA:17057
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.141
 property_value: skos:exactMatch RHEA:17057
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307223,7 +307321,7 @@
 xref: RHEA:37859
 xref: RHEA:37863
 xref: RHEA:37867
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.23
 property_value: skos:exactMatch RHEA:12937
 property_value: skos:narrowMatch RHEA:33359
@@ -307357,7 +307455,7 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
 property_value: skos:narrowMatch RHEA:74799
@@ -307380,7 +307478,7 @@
 xref: RHEA:37783
 xref: RHEA:37811
 xref: RHEA:37839
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.63
 property_value: skos:exactMatch RHEA:23992
 property_value: skos:narrowMatch RHEA:37715
@@ -307444,7 +307542,7 @@
 xref: KEGG_REACTION:R04333
 xref: MetaCyc:2.3.1.72-RXN
 xref: RHEA:21180
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.72
 property_value: skos:exactMatch RHEA:21180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307459,7 +307557,7 @@
 xref: EC:2.3.1.73
 xref: MetaCyc:2.3.1.73-RXN
 xref: RHEA:13301
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.73
 property_value: skos:exactMatch RHEA:13301
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307494,7 +307592,7 @@
 xref: RHEA:81803
 xref: RHEA:81807
 xref: RHEA:81811
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.75
 property_value: skos:exactMatch MetaCyc:2.3.1.75-RXN
 property_value: skos:exactMatch RHEA:38443
@@ -307528,7 +307626,7 @@
 xref: RHEA:16897
 xref: RHEA:78195
 xref: RHEA:78199
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.77
 property_value: skos:exactMatch RHEA:16897
 property_value: skos:narrowMatch RHEA:78195
@@ -307566,7 +307664,7 @@
 xref: KEGG_REACTION:R04227
 xref: MetaCyc:2.3.1.83-RXN
 xref: RHEA:19285
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.83
 property_value: skos:exactMatch RHEA:19285
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -310695,7 +310793,7 @@
 id: GO:0047369
 name: succinate-hydroxymethylglutarate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (S)-3-hydroxy-3-methylglutarate + succinyl-CoA = 3-hydroxy-3-methyl-glutaryl-CoA + succinate." [EC:2.8.3.13, MetaCyc:2.8.3.13-RXN]
+def: "Catalysis of the reaction: 3-hydroxy-3-methylglutarate + succinyl-CoA = (3S)-3-hydroxy-3-methylglutaryl-CoA + succinate." [RHEA:12284]
 synonym: "dicarboxyl-CoA:dicarboxylic acid coenzyme A transferase activity" RELATED [EC:2.8.3.13]
 synonym: "hydroxymethylglutarate coenzyme A-transferase activity" RELATED [EC:2.8.3.13]
 synonym: "succinate:(S)-3-hydroxy-3-methylglutarate CoA-transferase activity" RELATED [EC:2.8.3.13]
@@ -310726,7 +310824,7 @@
 id: GO:0047371
 name: butyrate-acetoacetate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetoacetate + butanoyl-CoA = acetoacetyl-CoA + butanoate." [EC:2.8.3.9, RHEA:12961]
+def: "Catalysis of the reaction: acetoacetate + butanoyl-CoA = acetoacetyl-CoA + butanoate." [RHEA:12961]
 synonym: "butanoyl-CoA:acetoacetate CoA-transferase activity" RELATED [EC:2.8.3.9]
 synonym: "butyryl coenzyme A-acetoacetate coenzyme A-transferase activity" RELATED [EC:2.8.3.9]
 synonym: "butyryl-CoA-acetoacetate CoA-transferase activity" RELATED [EC:2.8.3.9]
@@ -311367,9 +311465,10 @@
 
 [Term]
 id: GO:0047407
-name: ADP-ribosyl-[dinitrogen reductase] hydrolase activity
+name: obsolete ADP-ribosyl-[dinitrogen reductase] hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ADP-ribosyl-[dinitrogen reductase] = adenosine diphosphate ribose + [dinitrogen reductase]." [EC:3.2.2.24, MetaCyc:3.2.2.24-RXN]
+def: "OBSOLETE. Catalysis of the reaction: ADP-ribosyl-[dinitrogen reductase] = adenosine diphosphate ribose + [dinitrogen reductase]." [MetaCyc:3.2.2.24-RXN]
+comment: This term was obsoleted because it is beyond the specificity of GO.
 synonym: "ADP-D-ribosyl-dinitrogen reductase ADP-ribosylhydrolase activity" RELATED [EC:3.2.2.24]
 synonym: "ADP-ribosyl glycohydrolase activity" RELATED [EC:3.2.2.24]
 synonym: "ADP-ribosyl-dinitrogen reductase hydrolase activity" RELATED [EC:3.2.2.24]
@@ -311377,13 +311476,10 @@
 synonym: "azoferredoxin-activating enzymes" RELATED [EC:3.2.2.24]
 synonym: "dinitrogenase reductase activating glycohydrolase activity" RELATED [EC:3.2.2.24]
 synonym: "dinitrogenase reductase-activating glycohydrolase activity" RELATED [EC:3.2.2.24]
-xref: EC:3.2.2.24
-xref: MetaCyc:3.2.2.24-RXN
-xref: RHEA:14493
-is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
-property_value: skos:exactMatch EC:3.2.2.24
-property_value: skos:exactMatch RHEA:14493
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0003875
 
 [Term]
 id: GO:0047408
@@ -313502,7 +313598,7 @@
 id: GO:0047533
 name: 2,5-dioxovalerate dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,5-dioxopentanoate + NADP+ + H2O = 2-oxoglutarate + NADPH + H+." [EC:1.2.1.26, MetaCyc:25-DIOXOVALERATE-DEHYDROGENASE-RXN]
+def: "Catalysis of the reaction: 2,5-dioxopentanoate + NADP+ + H2O = 2-oxoglutarate + NADPH + H+." [RHEA:11296]
 synonym: "2,5-dioxopentanoate:NADP+ 5-oxidoreductase activity" RELATED [EC:1.2.1.26]
 synonym: "2-oxoglutarate semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.26]
 synonym: "alpha-ketoglutaric semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.26]
@@ -314164,7 +314260,7 @@
 id: GO:0047569
 name: 3-oxoadipate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinyl-CoA + 3-oxoadipate = succinate + 3-oxoadipyl-CoA." [EC:2.8.3.6, MetaCyc:3-OXOADIPATE-COA-TRANSFERASE-RXN]
+def: "Catalysis of the reaction: 3-oxoadipate + succinyl-CoA = 3-oxoadipyl-CoA + succinate." [RHEA:12048]
 synonym: "3-oxoadipate coenzyme A-transferase activity" RELATED [EC:2.8.3.6]
 synonym: "3-oxoadipate succinyl-CoA transferase activity" RELATED [EC:2.8.3.6]
 synonym: "beta-ketoadipate:succinyl-CoA transferase activity" RELATED [EC:2.8.3.6]
@@ -314547,7 +314643,7 @@
 id: GO:0047591
 name: 5-hydroxypentanoate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-hydroxypentanoate + acetyl-CoA = 5-hydroxy-pentanoyl-CoA + acetate." [EC:2.8.3.14, RHEA:23496]
+def: "Catalysis of the reaction: 5-hydroxypentanoate + acetyl-CoA = 5-hydroxy-pentanoyl-CoA + acetate." [RHEA:23496]
 synonym: "5-hydroxyvalerate CoA-transferase activity" RELATED [EC:2.8.3.14]
 synonym: "5-hydroxyvalerate coenzyme A transferase activity" RELATED [EC:2.8.3.14]
 synonym: "acetyl-CoA:5-hydroxypentanoate CoA-transferase activity" RELATED [EC:2.8.3.14]
@@ -316762,7 +316858,7 @@
 id: GO:0047712
 name: Cypridina-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Cypridina luciferin + O2 = oxidized Cypridina luciferin + CO2 + light." [EC:1.13.12.6, MetaCyc:CYPRIDINA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Cypridina luciferin + O2 = oxidized Cypridina luciferin + CO2 + light." [EC:1.13.12.6]
 synonym: "Cypridina luciferase activity" RELATED [EC:1.13.12.6]
 synonym: "Cypridina-luciferin:oxygen 2-oxidoreductase (decarboxylating)" RELATED [EC:1.13.12.6]
 synonym: "Cypridina-type luciferase activity" RELATED [EC:1.13.12.6]
@@ -317827,7 +317923,7 @@
 id: GO:0047775
 name: citramalate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + citramalate = acetate + (3S)-citramalyl-CoA." [EC:2.8.3.11, MetaCyc:CITRAMALATE-COA-TRANSFERASE-RXN]
+def: "Catalysis of the reaction: citramalate + acetyl-CoA = (3S)-citramalyl-CoA + acetate." [RHEA:17621]
 synonym: "acetyl-CoA:citramalate CoA-transferase activity" RELATED [EC:2.8.3.11]
 xref: EC:2.8.3.11
 xref: MetaCyc:CITRAMALATE-COA-TRANSFERASE-RXN
@@ -319614,7 +319710,7 @@
 xref: EC:2.3.1.123
 xref: MetaCyc:DOLICHOL-O-ACYLTRANSFERASE-RXN
 xref: RHEA:16685
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.123
 property_value: skos:exactMatch RHEA:16685
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -320259,7 +320355,7 @@
 synonym: "mono-beta-D-galactosyldiacylglycerol:mono-beta-D-galactosyldiacylglycerol acyltransferase activity" RELATED [EC:2.3.1.134]
 xref: EC:2.3.1.134
 xref: MetaCyc:GALACTOLIPID-O-ACYLTRANSFERASE-RXN
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.134
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -323861,12 +323957,12 @@
 
 [Term]
 id: GO:0048241
-name: epinephrine transport
+name: obsolete epinephrine transport
 namespace: biological_process
-def: "The directed movement of epinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jid]
-synonym: "adrenaline transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0051937 ! catecholamine transport
+def: "OBSOLETE. The directed movement of epinephrine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jid]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0048242
@@ -323874,7 +323970,6 @@
 namespace: biological_process
 def: "The regulated release of epinephrine by a cell. Epinephrine is a catecholamine hormone secreted by the adrenal medulla and a neurotransmitter, released by certain neurons and active in the central nervous system." [GOC:ef, GOC:jid]
 synonym: "adrenaline secretion" EXACT []
-is_a: GO:0048241 ! epinephrine transport
 is_a: GO:0050432 ! catecholamine secretion
 
 [Term]
@@ -323883,7 +323978,6 @@
 namespace: biological_process
 def: "The regulated release of norepinephrine by a cell. Norepinephrine is a catecholamine and it acts as a hormone and as a neurotransmitter of most of the sympathetic nervous system." [GOC:ef, GOC:jid]
 synonym: "noradrenaline secretion" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -331694,11 +331788,12 @@
 
 [Term]
 id: GO:0050067
-name: lysine 2-monooxygenase activity
+name: L-lysine 2-monooxygenase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-lysine + O2 = 5-aminopentanamide + CO2 + H2O." [EC:1.13.12.2, RHEA:14601]
 synonym: "L-lysine-2-monooxygenase activity" RELATED [EC:1.13.12.2]
 synonym: "L-lysine:oxygen 2-oxidoreductase (decarboxylating)" RELATED [EC:1.13.12.2]
+synonym: "lysine 2-monooxygenase activity" EXACT []
 synonym: "lysine monooxygenase activity" RELATED [EC:1.13.12.2]
 synonym: "lysine oxygenase activity" RELATED [EC:1.13.12.2]
 xref: EC:1.13.12.2
@@ -331869,7 +331964,7 @@
 id: GO:0050078
 name: malonate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + malonate = acetate + malonyl-CoA." [EC:2.8.3.3, RHEA:18817]
+def: "Catalysis of the reaction: acetyl-CoA + malonate = acetate + malonyl-CoA." [RHEA:18817]
 synonym: "acetyl-CoA:malonate CoA-transferase activity" RELATED [EC:2.8.3.3]
 synonym: "malonate coenzyme A-transferase activity" RELATED [EC:2.8.3.3]
 xref: EC:2.8.3.3
@@ -334838,7 +334933,7 @@
 id: GO:0050248
 name: Renilla-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Renilla luciferin + O2 = oxidized Renilla luciferin + CO2 + light." [EC:1.13.12.5, MetaCyc:RENILLA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Renilla luciferin + O2 = oxidized Renilla luciferin + CO2 + light." [EC:1.13.12.5]
 synonym: "aequorin activity" NARROW [EC:1.13.12.5]
 synonym: "luciferase (Renilla luciferin)" RELATED [EC:1.13.12.5]
 synonym: "luciferase activity" BROAD [EC:1.13.12.5]
@@ -334901,7 +334996,7 @@
 xref: RHEA:11488
 xref: RHEA:38175
 xref: RHEA:55284
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0042572 ! retinol metabolic process
 property_value: skos:exactMatch EC:2.3.1.76
 property_value: skos:exactMatch RHEA:11488
@@ -335597,7 +335692,7 @@
 xref: RHEA:37123
 xref: RHEA:45284
 xref: RHEA:64044
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.24
 property_value: skos:exactMatch RHEA:23768
 property_value: skos:narrowMatch RHEA:36687
@@ -335907,7 +336002,7 @@
 id: GO:0050308
 name: sugar-phosphatase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: sugar phosphate + H2O = sugar + phosphate." [EC:3.1.3.23, MetaCyc:SUGAR-PHOSPHATASE-RXN]
+def: "Catalysis of the reaction: sugar phosphate + H2O = sugar + phosphate." [EC:3.1.3.23]
 synonym: "sugar-phosphate phosphatase activity" EXACT []
 synonym: "sugar-phosphate phosphohydrolase activity" EXACT systematic_synonym [EC:3.1.3.23]
 xref: EC:3.1.3.23
@@ -337418,7 +337513,7 @@
 id: GO:0050397
 name: Watasenia-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Watasenia luciferin + O2 = oxidized Watasenia luciferin + CO2 + light." [EC:1.13.12.8, MetaCyc:WATASEMIA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Watasenia luciferin + O2 = oxidized Watasenia luciferin + CO2 + light." [EC:1.13.12.8]
 synonym: "luciferase activity" BROAD [EC:1.13.12.8]
 synonym: "Watasenia-luciferin:oxygen 2-oxidoreductase (decarboxylating)" RELATED [EC:1.13.12.8]
 synonym: "Watasenia-type luciferase activity" RELATED [EC:1.13.12.8]
@@ -338001,8 +338096,9 @@
 name: catecholamine secretion
 namespace: biological_process
 def: "The regulated release of catecholamines by a cell. The catecholamines are a group of physiologically important biogenic amines that possess a catechol (3,4-dihydroxyphenyl) nucleus and are derivatives of 3,4-dihydroxyphenylethylamine." [GOC:ai, GOC:ef]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0032940 ! secretion by cell
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0050433
@@ -341305,7 +341401,6 @@
 xref: EC:2.3.1.155
 xref: MetaCyc:2.3.1.155-RXN
 xref: RHEA:18161
-is_a: GO:0016408 ! C-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.155
 property_value: skos:exactMatch RHEA:18161
@@ -341425,7 +341520,7 @@
 xref: EC:2.3.1.164
 xref: MetaCyc:2.3.1.164-RXN
 xref: RHEA:20720
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.164
 property_value: skos:exactMatch RHEA:20720
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -342342,7 +342437,6 @@
 name: N-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342350,7 +342444,6 @@
 name: O-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342358,7 +342451,6 @@
 name: O-hydroxycinnamoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a hydroxycinnamoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 
 [Term]
@@ -343546,8 +343638,8 @@
 synonym: "teichuronic acid biosynthesis" EXACT []
 synonym: "teichuronic acid formation" EXACT []
 synonym: "teichuronic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
 
 [Term]
@@ -346394,17 +346486,17 @@
 
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
@@ -351145,7 +351237,6 @@
 synonym: "adrenotropin secretion" EXACT []
 synonym: "corticotropic hormone secretion" EXACT []
 is_a: GO:0030072 ! peptide hormone secretion
-is_a: GO:0060986 ! endocrine hormone secretion
 
 [Term]
 id: GO:0051459
@@ -351922,10 +352013,13 @@
 
 [Term]
 id: GO:0051519
-name: activation of bipolar cell growth
+name: obsolete activation of bipolar cell growth
 namespace: biological_process
-def: "Any process that initiates the inactive process of bipolar cell growth, polarized growth from both ends of a cell." [GOC:ai]
-is_a: GO:0051518 ! positive regulation of bipolar cell growth
+def: "OBSOLETE. Any process that initiates the inactive process of bipolar cell growth, polarized growth from both ends of a cell." [GOC:ai]
+comment: This term was obsoleted because it represented the same process as its parent, positive regulation of bipolar cell growth ; GO:0051518.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31746" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0051518
 
 [Term]
 id: GO:0051520
@@ -352850,7 +352944,8 @@
 synonym: "5-hydroxytryptamine uptake" EXACT []
 synonym: "5HT uptake" EXACT []
 synonym: "serotonin import" EXACT [GOC:dph, GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0098810 ! neurotransmitter reuptake
 
 [Term]
@@ -352989,7 +353084,6 @@
 synonym: "noradrenaline uptake" EXACT []
 synonym: "norepinephrine import" EXACT [GOC:dph, GOC:tb]
 synonym: "norepinephrine reuptake" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0090493 ! catecholamine uptake
 
 [Term]
@@ -356624,11 +356718,12 @@
 
 [Term]
 id: GO:0051937
-name: catecholamine transport
+name: obsolete catecholamine transport
 namespace: biological_process
-def: "The directed movement of catecholamines, a group of physiologically important biogenic amines that possess a catechol (3,4-dihydroxyphenyl) nucleus and are derivatives of 3,4-dihydroxyphenylethylamine." [GOC:ai, ISBN:0198506732]
-is_a: GO:0015844 ! monoamine transport
-is_a: GO:0015850 ! organic hydroxy compound transport
+def: "OBSOLETE. The directed movement of catecholamines, a group of physiologically important biogenic amines that possess a catechol (3,4-dihydroxyphenyl) nucleus and are derivatives of 3,4-dihydroxyphenylethylamine." [GOC:ai, ISBN:0198506732]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0051938
@@ -364410,15 +364505,18 @@
 
 [Term]
 id: GO:0052698
-name: ergothioneine metabolic process
+name: obsolete ergothioneine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving ergothioneine, a naturally occurring metabolite of histidine with antioxidant properties." [Wikipedia:Ergothioneine]
+def: "OBSOLETE. The chemical reactions and pathways involving ergothioneine, a naturally occurring metabolite of histidine with antioxidant properties." [Wikipedia:Ergothioneine]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "(2S)-3-(2-mercapto-1H-imidazol-5-yl)-2-(trimethylazaniumyl)propanoate metabolic process" EXACT [CHEBI:4828]
 synonym: "2-mercaptoergothioneine trimethylbetaine metabolic process" EXACT [CHEBI:4828]
 synonym: "2-mercaptoergothioneine trimethylbetaine metabolism" EXACT [CHEBI:4828]
 synonym: "ergothioneine metabolism" EXACT []
-is_a: GO:0000096 ! sulfur amino acid metabolic process
-is_a: GO:0006577 ! amino-acid betaine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0052699
+consider: GO:0052700
 created_by: ai
 creation_date: 2011-08-01T03:52:11Z
 
@@ -364439,7 +364537,6 @@
 synonym: "ergothioneine synthesis" EXACT []
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0006578 ! amino-acid betaine biosynthetic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052703 ! modified histidine biosynthetic process
 created_by: ai
 creation_date: 2011-08-01T03:56:19Z
@@ -364459,7 +364556,6 @@
 synonym: "ergothioneine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006579 ! amino-acid betaine catabolic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052702 ! modified histidine catabolic process
 created_by: ai
 creation_date: 2011-08-01T03:56:22Z
@@ -365825,9 +365921,14 @@
 id: GO:0052797
 name: 4-O-methyl-glucuronoyl methylesterase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: [X]-4-O-methyl-D-glucuronic acid + H2O = [X]-OH + methyl-D-glucuronic acid. This reaction is the hydrolysis of the ester linkage between 4-O-methyl-D-glucuronic acid (MeGlcA) and an alcohol (-OH) group attached to a molecule, denoted here as [X]." [GOC:mengo_curators, PMID:16876163]
+def: "Catalysis of the reaction: a 4-O-methyl-alpha-D-glucuronosyl ester derivative + H2O = 4-O-methyl-alpha-D-glucuronate derivative + an alcohol + H+." [PMID:16876163, RHEA:67452]
 synonym: "glucuronoyl esterase activity" BROAD [PMID:16876163]
+xref: EC:3.1.1.117
+xref: RHEA:67452
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
+property_value: skos:exactMatch EC:3.1.1.117
+property_value: skos:exactMatch RHEA:67452
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 
 [Term]
 id: GO:0052798
@@ -370861,7 +370962,6 @@
 namespace: cellular_component
 def: "The portion of the plasma membrane surrounding a stereocilium." [GOC:dph, GOC:rph]
 is_a: GO:0032589 ! neuron projection membrane
-relationship: part_of GO:0005622 ! intracellular anatomical structure
 relationship: part_of GO:0032420 ! stereocilium
 
 [Term]
@@ -379779,11 +379879,13 @@
 
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
 
@@ -385846,7 +385948,6 @@
 def: "The controlled release of histamine by a cell, in which the histamine acts as a neurotransmitter." [GOC:dph]
 is_a: GO:0001821 ! histamine secretion
 is_a: GO:0007269 ! neurotransmitter secretion
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: dph
@@ -385946,8 +386047,8 @@
 name: tyramine secretion
 namespace: biological_process
 def: "The regulated release of a tyramine by a cell." [GOC:dph]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0061531 ! primary amine secretion
-is_a: GO:7770032 ! tyramine transport
 created_by: dph
 creation_date: 2013-06-25T09:14:07Z
 
@@ -386327,7 +386428,7 @@
 synonym: "autoinducer-1 synthase" RELATED [GOC:dph]
 xref: EC:2.3.1.184
 xref: RHEA:10096
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.184
 property_value: skos:exactMatch RHEA:10096
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -390242,7 +390343,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: propionyl-CoA + lysine in peptide = CoA + N-propionyl-lysine-peptide." [PMID:17267393]
 xref: RHEA:54020
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:54020
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: dph
@@ -391873,7 +391974,6 @@
 def: "Any process that modulates the rate, frequency or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009889 ! regulation of biosynthetic process
 is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0042412 ! taurine biosynthetic process
 relationship: regulates GO:0042412 ! taurine biosynthetic process
@@ -391886,7 +391986,6 @@
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 is_a: GO:0062089 ! regulation of taurine biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0042412 ! taurine biosynthetic process
@@ -392305,7 +392404,7 @@
 id: GO:0062131
 name: 3-butenylglucosinolate 2-hydroxylase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: gluconapin + a reduced electron acceptor + O2 = xi-progoitrin + an oxidized electron acceptor + H2O." [PMID:18945935]
+def: "Catalysis of the reaction: gluconapin + a reduced electron acceptor + O2 = progoitrin + an oxidized electron acceptor + H2O." [PMID:18945935, RHEA:60628]
 synonym: "But-3-enyl Glucosinolate-2-hydroxylase activity" EXACT []
 xref: MetaCyc:RXNQT-4343
 xref: RHEA:60628
@@ -395081,7 +395180,7 @@
 id: GO:0070147
 name: mitochondrial cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
 is_a: GO:0006423 ! cysteinyl-tRNA aminoacylation
 is_a: GO:0070127 ! tRNA aminoacylation for mitochondrial protein translation
 intersection_of: GO:0006423 ! cysteinyl-tRNA aminoacylation
@@ -395231,7 +395330,7 @@
 namespace: biological_process
 def: "The regulated release of adiponectin, a protein hormone, by adipose tissue." [GOC:BHF, GOC:rl]
 is_a: GO:0009306 ! protein secretion
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0070163
@@ -395508,14 +395607,16 @@
 
 [Term]
 id: GO:0070189
-name: kynurenine metabolic process
+name: obsolete kynurenine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving kynurenine, the amino acid 3-(2-aminobenzoyl)-alanine." [CHEBI:28683, GOC:mah, GOC:rph]
+def: "OBSOLETE. The chemical reactions and pathways involving kynurenine, the amino acid 3-(2-aminobenzoyl)-alanine." [CHEBI:28683, GOC:mah, GOC:rph]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "kynurenine metabolism" EXACT []
-is_a: GO:0042180 ! ketone metabolic process
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
-is_a: GO:1901605 ! alpha-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31172" xsd:anyURI
+is_obsolete: true
+consider: GO:0006569
+consider: GO:0006727
+consider: GO:0034354
 
 [Term]
 id: GO:0070190
@@ -401481,7 +401582,7 @@
 name: sodium-dependent organic cation transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:BHF, GOC:mah]
-is_a: GO:0015695 ! organic cation transport
+is_a: GO:0055085 ! transmembrane transport
 created_by: mah
 creation_date: 2009-06-09T03:26:27Z
 
@@ -401639,7 +401740,6 @@
 namespace: biological_process
 def: "The directed movement of cyclic AMP (cAMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic AMP transport" EXACT [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -401653,7 +401753,6 @@
 def: "The directed movement of cyclic GMP (cGMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic GMP transport" EXACT [GOC:mah]
 is_a: GO:0001408 ! guanine nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
 created_by: mah
@@ -402628,7 +402727,6 @@
 namespace: biological_process
 def: "The process in which glycerol-2-phosphate is transported across a membrane. Glycerol-2-phosphate is a phosphoric monoester of glycerol." [GOC:mah]
 synonym: "glycerol-2-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -402932,7 +403030,6 @@
 namespace: biological_process
 def: "The directed movement of dehydroascorbate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dehydroascorbate, 5-(1,2-dihydroxyethyl)furan-2,3,4(5H)-trione, is an oxidized form of vitamin C." [GOC:sl]
 synonym: "dehydroascorbate transport" EXACT [GOC:sl]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 created_by: mah
 creation_date: 2009-07-30T05:24:31Z
@@ -403279,6 +403376,8 @@
 intersection_of: GO:0098590 ! plasma membrane region
 intersection_of: part_of GO:0043332 ! mating projection tip
 relationship: part_of GO:0043332 ! mating projection tip
+relationship: part_of GO:0070250 ! mating projection membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31775" xsd:anyURI
 created_by: mah
 creation_date: 2009-08-19T04:05:58Z
 
@@ -410713,7 +410812,6 @@
 intersection_of: GO:0000165 ! MAPK cascade
 intersection_of: part_of GO:0000747 ! conjugation with cellular fusion
 relationship: part_of GO:0000747 ! conjugation with cellular fusion
-relationship: part_of GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
 created_by: mah
 creation_date: 2010-01-05T01:43:47Z
 
@@ -414312,7 +414410,7 @@
 namespace: biological_process
 def: "The aggregation, arrangement and bonding together of a set of components to form a podosome, an actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell." [GOC:mah, GOC:sl]
 is_a: GO:0065003 ! protein-containing complex assembly
-is_a: GO:0140694 ! membraneless organelle assembly
+is_a: GO:0120031 ! plasma membrane bounded cell projection assembly
 created_by: mah
 creation_date: 2010-09-03T11:00:45Z
 
@@ -414323,7 +414421,7 @@
 def: "Any process that modulates the frequency, rate or extent of podosome assembly." [GOC:mah, GOC:sl]
 comment: Note that the assembly is regulated by several small GTPases of the Rab and Rho families.
 is_a: GO:0043254 ! regulation of protein-containing complex assembly
-is_a: GO:1902115 ! regulation of organelle assembly
+is_a: GO:0120032 ! regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0071800 ! podosome assembly
 relationship: regulates GO:0071800 ! podosome assembly
@@ -414341,7 +414439,7 @@
 synonym: "inhibition of podosome assembly" NARROW [GOC:mah]
 is_a: GO:0031333 ! negative regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902116 ! negative regulation of organelle assembly
+is_a: GO:0120033 ! negative regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0071800 ! podosome assembly
 relationship: negatively_regulates GO:0071800 ! podosome assembly
@@ -414360,7 +414458,7 @@
 synonym: "upregulation of podosome assembly" EXACT [GOC:mah]
 is_a: GO:0031334 ! positive regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902117 ! positive regulation of organelle assembly
+is_a: GO:0120034 ! positive regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0071800 ! podosome assembly
 relationship: positively_regulates GO:0071800 ! podosome assembly
@@ -416412,7 +416510,6 @@
 namespace: biological_process
 def: "The directed movement of a phytochelatin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Phytochelatins are a group of peptides that bind metals (Cd, Zn, Cu, Pb, Hg) in thiolate coordination complexes." [GOC:mah, ISBN:0198506732]
 synonym: "cadystin transport" RELATED [GOC:vw, Wikipedia:Phytochelatin#History]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: mah
 creation_date: 2010-10-25T01:57:55Z
@@ -420147,7 +420244,6 @@
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "UDP-galactose membrane transport" EXACT []
 synonym: "UDP-galactose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: mah
 creation_date: 2010-11-03T02:03:36Z
@@ -428671,7 +428767,7 @@
 name: spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:28Z
 
@@ -428680,7 +428776,7 @@
 name: spermidine:coumaroyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a coumaroyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:59Z
 
@@ -428689,7 +428785,7 @@
 name: spermidine:caffeoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a caffeoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:23Z
 
@@ -428698,7 +428794,7 @@
 name: spermidine:feruloyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a feruloyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:50Z
 
@@ -428819,7 +428915,7 @@
 name: sinapoyl spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on a sinapoyl spermidine molecule resulting in the formation of a disinapoyl spermidine derivative." [PMID:19168716]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-22T03:27:55Z
 
@@ -428891,7 +428987,7 @@
 name: phosphatidylethanolamine-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidylethanolamine + a sterol = a sterol ester + a lysophosphatidylethanolamine." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:39:33Z
 
@@ -428900,7 +428996,7 @@
 name: phosphatidate-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidate + a sterol = a sterol ester + a lysophosphatidate." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:41:42Z
 
@@ -429183,8 +429279,6 @@
 namespace: biological_process
 def: "The directed movement of AMP, adenosine monophosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [PMID:18923018]
 synonym: "adenosine monophosphate transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 created_by: dhl
@@ -429478,7 +429572,7 @@
 id: GO:0080145
 name: intracellular cysteine homeostasis
 namespace: biological_process
-def: "A homeostatic process involved in the maintenance of a steady state level of cysteine within a cell." [PMID:19955263]
+def: "A homeostatic process involved in the maintenance of a steady state level of L-cysteine within a cell." [PMID:19955263]
 synonym: "cellular cysteine homeostasis" EXACT []
 synonym: "cysteine homeostasis" EXACT []
 is_a: GO:0080144 ! intracellular amino acid homeostasis
@@ -431835,7 +431929,6 @@
 name: L-histidine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-histidine across a membrane." [PMID:21307582]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -432249,19 +432342,19 @@
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31306" xsd:anyURI
 is_obsolete: true
+replaced_by: GO:0062038
 created_by: tb
 creation_date: 2009-08-03T10:25:27Z
 
 [Term]
 id: GO:0090029
-name: negative regulation of pheromone-dependent signal transduction involved in conjugation with cellular fusion
+name: obsolete negative regulation of pheromone-dependent signal transduction involved in conjugation with cellular fusion
 namespace: biological_process
-def: "Any process that decreases the frequency, rate or extent of pheromone-dependent signal transduction during conjugation with cellular fusion, a signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion." [GOC:dph, GOC:tb]
-is_a: GO:0009968 ! negative regulation of signal transduction
-is_a: GO:0010969 ! regulation of pheromone-dependent signal transduction involved in conjugation with cellular fusion
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
-relationship: negatively_regulates GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
+def: "OBSOLETE. Any process that decreases the frequency, rate or extent of pheromone-dependent signal transduction during conjugation with cellular fusion, a signal transduction process resulting in the relay, amplification or dampening of a signal generated in response to pheromone exposure in organisms that undergo conjugation with cellular fusion." [GOC:dph, GOC:tb]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0180040
 created_by: tb
 creation_date: 2009-08-03T10:27:04Z
 
@@ -437284,7 +437377,7 @@
 def: "Catalysis of the reaction: an acyl-CoA + sn-glycerol 3-phosphate = CoA + a 2-acyl-sn-glycerol 3-phosphate." [RHEA:33559]
 xref: EC:2.3.1.198
 xref: RHEA:33559
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.198
 property_value: skos:exactMatch RHEA:33559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -437680,7 +437773,8 @@
 name: catecholamine uptake
 namespace: biological_process
 def: "The directed movement of catecholamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2012-10-17T11:06:17Z
 
@@ -437689,7 +437783,6 @@
 name: dopamine uptake
 namespace: biological_process
 def: "The directed movement of dopamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0090493 ! catecholamine uptake
 created_by: tb
 creation_date: 2012-10-17T11:12:09Z
@@ -440792,16 +440885,15 @@
 
 [Term]
 id: GO:0097053
-name: L-kynurenine catabolic process
+name: obsolete L-kynurenine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-kynurenine, the L-enantiomer of the amino acid kynurenine (3-(2-aminobenzoyl)-alanine)." [GOC:yaf]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-kynurenine, the L-enantiomer of the amino acid kynurenine (3-(2-aminobenzoyl)-alanine)." [GOC:yaf]
+comment: This term was obsoleted because there is no evidence that this compound is specifically degraded.
 synonym: "L-kynurenine breakdown" EXACT []
 synonym: "L-kynurenine catabolism" EXACT []
 synonym: "L-kynurenine degradation" EXACT []
-is_a: GO:0042182 ! ketone catabolic process
-is_a: GO:0070189 ! kynurenine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2011-05-24T03:30:58Z
 
@@ -443160,12 +443252,15 @@
 id: GO:0097265
 name: 5(S)-hydroxyeicosatetraenoic acid dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-HETE + NADP+ = 5-oxo-ETE + NADPH + H+." [GOC:mw, PMID:1326548]
+def: "Catalysis of the reaction: 5-hydroxy-(6E,8Z,11Z,14Z)-eicosatetraenoate (5-HETE) + reduced [NADPH-hemoprotein reductase] + O2 = 5,20-dihydroxy-(6E,8Z,11Z,14Z)-eicosatetraenoate (5-oxo-ETE) + oxidized [NADPH-hemoprotein reductase] + H2O + H+." [PMID:1326548, PMID:9675028, RHEA:48656]
 synonym: "5(S)-HETE dehydrogenase activity" EXACT []
 synonym: "5-HETE dehydrogenase activity" EXACT []
 synonym: "5-hydroxy-eicosatetraenoic acid dehydrogenase activity" EXACT []
 xref: Reactome:R-HSA-2161776 "5S-HETE is oxidised to 5-oxoETE by 5-HEDH"
+xref: RHEA:48656
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch RHEA:48656
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 created_by: pr
 creation_date: 2012-03-09T12:46:02Z
 
@@ -447306,9 +447401,8 @@
 def: "The directed movement of L-arginine from outside of a cell, across the plasma membrane and into the cytosol." [GOC:krc, PMID:8195186]
 synonym: "arginine import" BROAD []
 synonym: "L-arginine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: tb
 creation_date: 2012-09-24T14:28:58Z
 
@@ -452547,7 +452641,8 @@
 namespace: cellular_component
 def: "A cell projection supported by an assembly of actin filaments, and which lacks microtubules." [PMID:15661519]
 is_a: GO:0120025 ! plasma membrane bounded cell projection
-relationship: has_part GO:0005884 ! actin filament
+relationship: part_of GO:0015629 ! actin cytoskeleton
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0098859
@@ -458816,7 +458911,7 @@
 id: GO:0102045
 name: 3-chlorobenzoate-3,4-oxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 3-chlorobenzoate + O2 + a reduced electron acceptor = 3-chlorobenzoate-cis-3,4-diol + an oxidized electron acceptor." [GOC:pz, PMID:8285670]
+def: "Catalysis of the reaction: 3-chlorobenzoate + O2 + a reduced electron acceptor = 3-chlorobenzoate-cis-3,4-diol + an oxidized electron acceptor." [PMID:38488372, PMID:8285670]
 xref: MetaCyc:RXN-10422
 is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
 
@@ -459883,11 +459978,15 @@
 
 [Term]
 id: GO:0102157
-name: (R)-sulfopropanediol 2-dehydrogenase activity
+name: sulfopropanediol 3-dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (2R)-3-sulfopropanediol(1-) + NAD = 2-oxo-3-hydroxy-propane-1-sulfonate + NADH + H+." [GOC:pz, PMID:20150239]
-xref: MetaCyc:RXN-11729
+def: "Catalysis of the reaction: (2R)-3-sulfopropanediol + 2 NAD+ + H2O = (2R)-3-sulfolactate + 2 NADH + 3 H+." [PMID:20150239, RHEA:28074]
+xref: EC:1.1.1.308
+xref: MetaCyc:RXN-11727
+xref: RHEA:28074 {status="skos:exactMatch"}
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch EC:1.1.1.308
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 
 [Term]
 id: GO:0102158
@@ -460675,9 +460774,12 @@
 id: GO:0102232
 name: acrolein reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acrolein + NADPH + H+ = propanal + NADP." [GOC:pz, PMID:21169366]
+def: "Catalysis of the reaction: propanal + NADP+ = acrolein + NADPH + H+." [PMID:21169366, RHEA:64716]
 xref: MetaCyc:RXN-12281
+xref: RHEA:64716
 is_a: GO:0016628 ! oxidoreductase activity, acting on the CH-CH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch RHEA:64716
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 
 [Term]
 id: GO:0102233
@@ -461488,7 +461590,7 @@
 id: GO:0102313
 name: 1,8-cineole synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: geranyl diphosphate(3-) + H2O = 1,8-cineole + diphosphoric acid." [GOC:pz, RHEA:32543]
+def: "Catalysis of the reaction: geranyl diphosphate(3-) + H2O = 1,8-cineole + diphosphoric acid." [RHEA:32543]
 xref: EC:4.2.3.108
 xref: MetaCyc:RXN-12980
 xref: RHEA:32543
@@ -462306,9 +462408,14 @@
 id: GO:0102394
 name: 4-hydroxy-L-isoleucine dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (2S,3R,4S)-4-hydroxy-L-isoleucine + NAD = (2S,3R)-2-amino-3-methyl-4-ketopentanoate + NADH + H+." [GOC:pz, PMID:21069315]
+def: "Catalysis of the reaction: L-isoleucine + 2-oxoglutarate + O2 = (4S)-4-hydroxy-L-isoleucine + succinate + CO2." [PMID:21069315, RHEA:41448]
+xref: EC:1.14.11.45
 xref: MetaCyc:RXN-13637
+xref: RHEA:41448
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch EC:1.14.11.45
+property_value: skos:exactMatch RHEA:41448
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 
 [Term]
 id: GO:0102395
@@ -470120,22 +470227,27 @@
 
 [Term]
 id: GO:0106047
-name: polyamine deacetylation
+name: obsolete polyamine deacetylation
 namespace: biological_process
-def: "The modification of acetylpolyamine by the removal of acetyl groups." [PMID:28516954]
-is_a: GO:0006595 ! polyamine metabolic process
-is_a: GO:0098732 ! macromolecule deacylation
+def: "OBSOLETE. The modification of acetylpolyamine by the removal of acetyl groups." [PMID:28516954]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0006598
+consider: GO:0019213
 created_by: hjd
 creation_date: 2017-08-01T18:36:46Z
 
 [Term]
 id: GO:0106048
-name: spermidine deacetylation
+name: obsolete spermidine deacetylation
 namespace: biological_process
-def: "The modification of acetylspermadine by the removal of acetyl groups." [PMID:28516954]
-synonym: "N8-acetylspermidine deacetylation" EXACT []
-is_a: GO:0008216 ! spermidine metabolic process
-is_a: GO:0106047 ! polyamine deacetylation
+def: "OBSOLETE. The modification of acetylspermadine by the removal of acetyl groups." [PMID:28516954]
+comment: The reason for obsoletion is that this term represents a molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31741" xsd:anyURI
+is_obsolete: true
+consider: GO:0046203
+consider: GO:0047611
 created_by: hjd
 creation_date: 2017-08-01T18:39:17Z
 
@@ -470412,7 +470524,7 @@
 name: peptide N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the acetylation of an amino acid residue of a peptide or protein, according to the reaction: succinyl-CoA + peptide = CoA + N-succinylpeptide." [PMID:29211711]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: hjd
 creation_date: 2017-12-15T18:23:58Z
 
@@ -471911,7 +472023,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-hydroxyisobutyryl-CoA + lysine in peptide = CoA + N-2-hydroxyisobutyryl-lysine-peptide." [GOC:sp, PMID:29775581]
 xref: RHEA:24180
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:24180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -471934,7 +472046,7 @@
 def: "Catalysis of the reaction: glutaryl-CoA + L-lysyl-[protein] = CoA + H+ + N6-glutaryl-L-lysyl-[protein]." [GOC:sp, PMID:31542297]
 xref: Reactome:R-HSA-9858590 "DLST transfers glutaryl to CoA"
 xref: RHEA:18009
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:18009
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -472372,7 +472484,7 @@
 xref: RHEA:37767
 xref: RHEA:37771
 xref: RHEA:37775
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n7
 property_value: skos:exactMatch RHEA:32995
 property_value: skos:narrowMatch RHEA:36015
@@ -472410,7 +472522,7 @@
 xref: RHEA:37571
 xref: RHEA:37735
 xref: RHEA:37739
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n6
 property_value: skos:exactMatch RHEA:33191
 property_value: skos:narrowMatch RHEA:37399
@@ -480186,7 +480298,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: L-glutaminyl-[protein] + serotonin = 5-serotonyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:14697203]
 xref: RHEA:66552
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66552
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480212,7 +480324,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: dopamine + L-glutaminyl-[protein] = 5-dopaminyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378, PMID:32273471]
 xref: RHEA:66556
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66556
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480238,7 +480350,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: (R)-noradrenaline + L-glutaminyl-[protein] = 5-(R)-noradrenalinyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378]
 xref: RHEA:66560
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66560
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480251,7 +480363,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: histamine + L-glutaminyl-[protein] = 5-histaminyl-L-glutamyl-[protein]." [GOC:sp, PMID:23022564, PMID:23797785]
 xref: RHEA:66564
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66564
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480267,7 +480379,7 @@
 synonym: "peptide lactyltransferase activity" BROAD []
 synonym: "peptide lactyltransferase activity (CoA-dependent)" BROAD []
 xref: RHEA:61996
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:61996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28015" xsd:anyURI
@@ -481947,7 +482059,7 @@
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
 creation_date: 2026-01-07T15:48:37Z
@@ -482029,7 +482141,6 @@
 is_a: GO:0042219 ! modified amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
-is_a: GO:1903184 ! L-dopa metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-6334
 property_value: skos:narrowMatch MetaCyc:PWY-8110
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
@@ -482640,13 +482751,14 @@
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
 
@@ -482772,7 +482884,7 @@
 def: "Catalysis of the reaction: crotonyl-CoA + lysine in peptide = CoA + N-crotonyl-lysine-peptide." [PMID:25818647]
 synonym: "protein crotonyltransferase activity" RELATED []
 xref: RHEA:53908
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53908
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -482785,7 +482897,7 @@
 def: "Catalysis of the reaction: butyryl-CoA + lysine in peptide = CoA + N-butyryl-lysine-peptide." [PMID:27105113]
 synonym: "protein butyryltransferase activity" RELATED []
 xref: RHEA:53912
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53912
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -484284,7 +484396,7 @@
 xref: RHEA:59800
 xref: RHEA:83531
 xref: RHEA:85279
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:53916
 property_value: skos:narrowMatch RHEA:59764
@@ -485639,24 +485751,31 @@
 
 [Term]
 id: GO:0140292
-name: ADP-ribosylserine hydrolase activity
+name: ADP-ribosylserine-[protein] hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (ADP-D-ribosyl)-L-seryl-[protein] + H2O = L-seryl-[protein] + ADP-ribose." [PMID:28650317, PMID:29234005, RHEA:58256]
+def: "Catalysis of the reaction: O-(ADP-D-ribosyl)-L-seryl-[protein] + H2O = ADP-D-ribose + L-seryl-[protein]." [PMID:28650317, PMID:29234005, RHEA:58256]
+synonym: "ADP-ribosylserine hydrolase activity" EXACT []
 xref: RHEA:58256
 is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:58256
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28476" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
 created_by: pg
 creation_date: 2018-11-22T14:35:39Z
 
 [Term]
 id: GO:0140293
-name: ADP-ribosylglutamate hydrolase activity
+name: ADP-ribosylglutamate-[protein] hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (ADP-D-ribosyl)-L-glutamyl-[protein] + H2O = L-glutamyl-[protein] + ADP-ribose." [PMID:23481255]
+def: "Catalysis of the reaction: 5-O-(ADP-D-ribosyl)-L-glutamyl-[protein] + H2O = L-glutamyl-[protein] + ADP-D-ribose + H+." [PMID:23481255, RHEA:58248]
+synonym: "ADP-ribosylglutamate hydrolase activity" EXACT []
+xref: RHEA:58248
 is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
 is_a: GO:0140096 ! catalytic activity, acting on a protein
+property_value: skos:exactMatch RHEA:58248
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31849" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
 created_by: pg
 creation_date: 2018-11-22T14:36:37Z
 
@@ -486538,7 +486657,6 @@
 name: cyclic-GMP-AMP transmembrane import across plasma membrane
 namespace: biological_process
 def: "The directed movement of cyclic-GMP-AMP from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31126740]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -487051,6 +487169,26 @@
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
+id: GO:0140402
+name: symbiont-mediated disassembly of host stress granules
+namespace: biological_process
+def: "The process in which an organism effects a change that impairs the structure or function of the stress granule of the host organism. The host is defined as the larger of the organisms involved in a symbiotic interaction. Stress granules are dynamic cytoplasmic condensates formed through liquid-liquid phase separation. They act as a critical hub for both cellular stress adaptation and defense against viruses." [PMID:32353859, PMID:39345463]
+is_a: GO:0052008 ! symbiont-mediated disruption of host cellular anatomical structure
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31751" xsd:anyURI
+created_by: pg
+creation_date: 2026-04-07T12:22:21Z
+
+[Term]
 id: GO:0140403
 name: effector-mediated suppression of host innate immune response
 namespace: biological_process
@@ -487163,6 +487301,18 @@
 creation_date: 2020-01-07T16:58:49Z
 
 [Term]
+id: GO:0140411
+name: symbiont-mediated suppression of host stress granule assembly
+namespace: biological_process
+def: "A process in which a symbiont inhibits or disrupts the normal assembly of stress granule of the host organism. The host is defined as the larger of the organisms involved in a symbiotic interaction. Stress granules are dynamic cytoplasmic condensates formed through liquid-liquid phase separation. They act as a critical hub for both cellular stress adaptation and defense against viruses." [PMID:32353859, PMID:39345463]
+synonym: "symbiont-mediated inhibition of host stress granule assembly" EXACT []
+synonym: "symbiont-mediated inhibition of host stress granule formation" EXACT []
+is_a: GO:0044068 ! symbiont-mediated perturbation of host cellular process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31751" xsd:anyURI
+created_by: pg
+creation_date: 2026-04-07T12:38:51Z
+
+[Term]
 id: GO:0140412
 name: zinc:bicarbonate symporter activity
 namespace: molecular_function
@@ -487908,7 +488058,6 @@
 name: 5-aminolevulinic acid import across plasma membrane
 namespace: biological_process
 def: "The directed movement of 5-aminolevulinic acid from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31989647]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015718 ! monocarboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -490858,10 +491007,11 @@
 
 [Term]
 id: GO:0140740
-name: ADP-riboxanase activity
+name: ADP-riboxanase-[protein] activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-arginyl-[protein] + NAD+ = ADP-riboxanated L-argininyl-[protein] + H+ + NH4+ + nicotinamide." [PMID:34671164, RHEA:69500]
 comment: Note that this activity has two steps: a transfer of an ADP-ribose group, followed by the elimination of an ammonia group.
+synonym: "ADP-riboxanase activity" EXACT []
 xref: Reactome:R-HSA-9956624 "OspC3 ADP-riboxanates CASP4"
 xref: RHEA:69500
 xref: RHEA:75883
@@ -490873,6 +491023,7 @@
 property_value: skos:narrowMatch RHEA:75883
 property_value: skos:narrowMatch RHEA:75887
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22480" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
 created_by: pg
 creation_date: 2021-11-30T08:29:49Z
 
@@ -491994,7 +492145,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-beta-L-arabinofuranose from the cytosol to the Golgi apparatus of a cell." [PMID:28373556]
 synonym: "cytosol to Golgi apparatus UDP-beta-L-arabinofuranose transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 is_a: GO:0140820 ! cytosol to Golgi apparatus transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21524" xsd:anyURI
@@ -493462,7 +493612,6 @@
 name: L-phenylalanine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of L-phenylalanine from outside of a cell, across the plasma membrane and into the cytosol." [PMID:11069779]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015823 ! phenylalanine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -496305,7 +496454,7 @@
 name: regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
+is_a: GO:1902531 ! regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496318,8 +496467,8 @@
 name: positive regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:14615391]
-is_a: GO:0010750 ! positive regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902533 ! positive regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496332,8 +496481,8 @@
 name: negative regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that decreases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010751 ! negative regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -501136,14 +501285,16 @@
 
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
 
@@ -502345,9 +502496,11 @@
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
@@ -502445,8 +502598,8 @@
 name: dopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of dopamine neurotransmitters into a synaptic vesicle." [PMID:29666153]
-is_a: GO:0015872 ! dopamine transport
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
+is_a: GO:0015850 ! organic hydroxy compound transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
 creation_date: 2025-12-02T22:02:35Z
@@ -502456,8 +502609,8 @@
 name: tyramine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of tyramine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
-is_a: GO:7770032 ! tyramine transport
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
+is_a: GO:0015850 ! organic hydroxy compound transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
 creation_date: 2025-12-02T23:16:14Z
@@ -502467,7 +502620,7 @@
 name: octopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of octopamine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:7770033 ! octopamine transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
@@ -502976,7 +503129,6 @@
 name: isopentenyl pyrophosphate import into mitochondrion
 namespace: biological_process
 def: "The process in which isopentenyl pyrophosphate is transported across a membrane into the mitochondrion." [GOC:ew, PMID:37813972]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0032365 ! intracellular lipid transport
 is_a: GO:0170036 ! import into the mitochondrion
@@ -509241,16 +509393,13 @@
 
 [Term]
 id: GO:1900237
-name: positive regulation of induction of conjugation with cellular fusion
+name: obsolete positive regulation of induction of conjugation with cellular fusion
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of induction of conjugation with cellular fusion." [GOC:TermGenie]
-synonym: "up regulation of induction of conjugation with cellular fusion" EXACT [GOC:TermGenie]
-synonym: "up-regulation of induction of conjugation with cellular fusion" EXACT [GOC:TermGenie]
-synonym: "upregulation of induction of conjugation with cellular fusion" EXACT [GOC:TermGenie]
-is_a: GO:0031139 ! positive regulation of conjugation with cellular fusion
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0010514 ! induction of conjugation with cellular fusion
-relationship: positively_regulates GO:0010514 ! induction of conjugation with cellular fusion
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of induction of conjugation with cellular fusion." [GOC:TermGenie]
+comment: This term was obsoleted because it is a pre-composed term that should be represented as a GO-CAM model.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31335" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0031139
 created_by: al
 creation_date: 2012-03-26T10:14:16Z
 
@@ -520018,7 +520167,6 @@
 synonym: "deoxycarnitine transport" RELATED [GOC:TermGenie]
 synonym: "gamma-Butyrobetain transport" EXACT [GOC:TermGenie]
 synonym: "gamma-butyrobetaine transport" EXACT [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 created_by: jl
 creation_date: 2012-05-29T02:32:37Z
@@ -520049,7 +520197,6 @@
 synonym: "Adriamycin transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicine transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicinum transport" RELATED [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
@@ -525610,13 +525757,15 @@
 
 [Term]
 id: GO:1901056
-name: trimethylenediamine catabolic process
+name: obsolete trimethylenediamine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of trimethylenediamine." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00010]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of trimethylenediamine." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00010]
+comment: The reason for obsoletion is that this term was made in error.
 synonym: "trimethylenediamine breakdown" EXACT [GOC:TermGenie]
 synonym: "trimethylenediamine catabolism" EXACT [GOC:TermGenie]
 synonym: "trimethylenediamine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0006598 ! polyamine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2012-06-28T04:53:06Z
 
@@ -537077,7 +537226,6 @@
 xref: MetaCyc:PWY-5103
 xref: MetaCyc:PWY-5104
 xref: MetaCyc:PWY-5108
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ILEUSYN-PWY
@@ -542412,7 +542560,6 @@
 name: L-lysine transport
 namespace: biological_process
 def: "The directed movement of a L-lysine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: kmv
 creation_date: 2013-03-27T16:09:06Z
@@ -542422,7 +542569,6 @@
 name: L-histidine transport
 namespace: biological_process
 def: "The directed movement of a L-histidine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015802 ! basic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -549014,7 +549160,6 @@
 name: ceramide 1-phosphate transport
 namespace: biological_process
 def: "The directed movement of a ceramide 1-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:TermGenie, PMID:23863933]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0035627 ! ceramide transport
 created_by: uh
@@ -551452,7 +551597,6 @@
 namespace: biological_process
 def: "The process in which 5'-adenylyl sulfate is transported across a membrane." [GOC:TermGenie, PMID:24296033]
 synonym: "adenosine 5'-phosphosulfate transmembrane transport" EXACT [PMID:24296033]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -555090,7 +555234,6 @@
 synonym: "6-sulfoquinovose(1-) breakdown" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) catabolism" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) degradation" EXACT [GOC:TermGenie]
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
 created_by: dph
@@ -563310,31 +563453,29 @@
 
 [Term]
 id: GO:1903184
-name: L-dopa metabolic process
+name: obsolete L-dopa metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving L-dopa." [GO_REF:0000068, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:8822146]
+def: "OBSOLETE. The chemical reactions and pathways involving L-dopa." [GO_REF:0000068, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:8822146]
+comment: This term was obsoleted because there is no evidence that this process exists; L-dopa metabolism has been used in the literature to mean L-dopa degradation.
 synonym: "L-dopa metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006575 ! modified amino acid metabolic process
-is_a: GO:0009072 ! aromatic amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0120575
 created_by: bf
 creation_date: 2014-07-14T15:06:00Z
 
 [Term]
 id: GO:1903185
-name: L-dopa biosynthetic process
+name: obsolete L-dopa biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-dopa." [GO_REF:0000068, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:8822146]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of L-dopa." [GO_REF:0000068, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:8822146]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "L-dopa anabolism" EXACT [GOC:TermGenie]
 synonym: "L-dopa biosynthesis" EXACT [GOC:TermGenie]
 synonym: "L-dopa formation" EXACT [GOC:TermGenie]
 synonym: "L-dopa synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
-is_a: GO:0042398 ! modified amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
-is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
-is_a: GO:1903184 ! L-dopa metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
+is_obsolete: true
 created_by: bf
 creation_date: 2014-07-14T15:06:06Z
 
@@ -563462,26 +563603,25 @@
 
 [Term]
 id: GO:1903195
-name: regulation of L-dopa biosynthetic process
+name: obsolete regulation of L-dopa biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of L-dopa anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of L-dopa biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of L-dopa formation" EXACT [GOC:TermGenie]
 synonym: "regulation of L-dopa synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-is_a: GO:2000282 ! regulation of amino acid biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1903185 ! L-dopa biosynthetic process
-relationship: regulates GO:1903185 ! L-dopa biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
+is_obsolete: true
 created_by: bf
 creation_date: 2014-07-21T09:12:37Z
 
 [Term]
 id: GO:1903196
-name: negative regulation of L-dopa biosynthetic process
+name: obsolete negative regulation of L-dopa biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of L-dopa anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of L-dopa biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of L-dopa biosynthetic process" EXACT [GOC:TermGenie]
@@ -563506,20 +563646,17 @@
 synonym: "negative regulation of L-dopa biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of L-dopa formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of L-dopa synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0062014 ! negative regulation of small molecule metabolic process
-is_a: GO:1903195 ! regulation of L-dopa biosynthetic process
-is_a: GO:2000283 ! negative regulation of amino acid biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1903185 ! L-dopa biosynthetic process
-relationship: negatively_regulates GO:1903185 ! L-dopa biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
+is_obsolete: true
 created_by: bf
 creation_date: 2014-07-21T09:12:44Z
 
 [Term]
 id: GO:1903197
-name: positive regulation of L-dopa biosynthetic process
+name: obsolete positive regulation of L-dopa biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:16731528]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of L-dopa biosynthetic process." [GO_REF:0000058, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:16731528]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of L-dopa anabolism" NARROW [GOC:TermGenie]
 synonym: "activation of L-dopa biosynthesis" NARROW [GOC:TermGenie]
 synonym: "activation of L-dopa biosynthetic process" NARROW [GOC:TermGenie]
@@ -563544,12 +563681,8 @@
 synonym: "upregulation of L-dopa biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of L-dopa formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of L-dopa synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
-is_a: GO:1903195 ! regulation of L-dopa biosynthetic process
-is_a: GO:2000284 ! positive regulation of amino acid biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1903185 ! L-dopa biosynthetic process
-relationship: positively_regulates GO:1903185 ! L-dopa biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
+is_obsolete: true
 created_by: bf
 creation_date: 2014-07-21T09:12:49Z
 
@@ -564608,8 +564741,8 @@
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 is_a: GO:2000282 ! regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0019240 ! citrulline biosynthetic process
-relationship: regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:34Z
 
@@ -564646,8 +564779,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000283 ! negative regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: negatively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:46Z
 
@@ -564684,8 +564817,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000284 ! positive regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: positively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:52Z
 
@@ -573769,12 +573902,13 @@
 
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
 
@@ -575021,7 +575155,6 @@
 name: L-valine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-valine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:20944394]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015829 ! valine transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: al
@@ -575473,7 +575606,6 @@
 synonym: "isoleucine import" BROAD []
 synonym: "L-isoleucine import" BROAD []
 synonym: "L-isoleucine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903714 ! isoleucine transmembrane transport
@@ -575489,7 +575621,6 @@
 synonym: "L-threonine import" BROAD []
 synonym: "L-threonine import into cell" EXACT []
 synonym: "L-threonine uptake" EXACT [GOC:bf]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015826 ! threonine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -575535,7 +575666,6 @@
 synonym: "asparagine import" BROAD []
 synonym: "L-asparagine import into cell" EXACT []
 is_a: GO:0006867 ! asparagine transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903713 ! asparagine transmembrane transport
@@ -575796,10 +575926,10 @@
 synonym: "L-arginine import" NARROW []
 synonym: "L-arginine transport" BROAD []
 synonym: "L-arginine uptake" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1990822 ! basic amino acid transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22228" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31823" xsd:anyURI
 created_by: vw
 creation_date: 2015-01-20T10:38:15Z
 
@@ -581520,7 +581650,7 @@
 synonym: "protein localisation in microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localisation to microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localization in microvillus" EXACT [GOC:TermGenie]
-is_a: GO:0008104 ! intracellular protein localization
+is_a: GO:1903119 ! protein localization to actin cytoskeleton
 created_by: kmv
 creation_date: 2015-04-01T18:14:41Z
 
@@ -590185,15 +590315,17 @@
 
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
 
@@ -591188,10 +591320,10 @@
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
 
@@ -591204,6 +591336,8 @@
 synonym: "protein localisation to actin fusion focus" EXACT [GOC:TermGenie]
 synonym: "protein localization in actin fusion focus" EXACT [GOC:TermGenie]
 is_a: GO:0015031 ! protein transport
+relationship: part_of GO:0000755 ! cytogamy
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-26T10:36:22Z
 
@@ -598910,6 +599044,7 @@
 synonym: "regulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0010155 ! regulation of proton transport
 is_a: GO:0022898 ! regulation of transmembrane transporter activity
+is_a: GO:0051341 ! regulation of oxidoreductase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0004129 ! cytochrome-c oxidase activity
 relationship: regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -599002,6 +599137,7 @@
 synonym: "upregulation of NADH cytochrome c oxidase" EXACT [GOC:TermGenie]
 synonym: "upregulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0032414 ! positive regulation of ion transmembrane transporter activity
+is_a: GO:0051353 ! positive regulation of oxidoreductase activity
 is_a: GO:1904959 ! regulation of cytochrome-c oxidase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -602559,7 +602695,6 @@
 name: carcinine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of carcinine from outside of a cell, across the plasma membrane and into the cytosol." [GO_REF:0000075, GOC:dph, GOC:TermGenie, PMID:26653853, PMID:26713872]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0098739 ! import across plasma membrane
@@ -606131,7 +606266,6 @@
 synonym: "sphingoid transport" RELATED []
 synonym: "sphingosine transport" NARROW []
 is_a: GO:0006869 ! lipid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2016-07-22T01:40:59Z
@@ -624842,7 +624976,6 @@
 alt_id: GO:0015788
 def: "The process in which UDP-N-acetylglucosamine is transported across a membrane." [PMID:10788474]
 synonym: "UDP-N-acetylglucosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: vw
 creation_date: 2014-11-27T11:56:35Z
@@ -624854,7 +624987,6 @@
 alt_id: GO:0015784
 def: "The process in which GDP-mannose is transported across a membrane." [PMID:9395539]
 synonym: "GDP-mannose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090480 ! purine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: vw
@@ -626604,10 +626736,12 @@
 
 [Term]
 id: GO:1990727
-name: tubulin folding cofactor complex
+name: obsolete tubulin folding cofactor complex
 namespace: cellular_component
-def: "A multimeric protein complex involved in tubulin alpha-beta-subunit folding assembly consisting of beta-tubulin-TFC-D, alpha-tubulin-TFC-E and TFC-C, through which tubulin subunit association and dimer release occur." [GOC:vw, PMID:12445400]
-is_a: GO:0032991 ! protein-containing complex
+def: "OBSOLETE. A multimeric protein complex involved in tubulin alpha-beta-subunit folding assembly consisting of beta-tubulin-TFC-D, alpha-tubulin-TFC-E and TFC-C, through which tubulin subunit association and dimer release occur." [GOC:vw, PMID:12445400]
+comment: This term was obsoleted because it was created by mistake; this is a pathway, not a complex.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31828" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2015-04-08T10:29:43Z
 
@@ -627333,7 +627467,7 @@
 id: GO:1990799
 name: mitochondrial tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:15509579]
+def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:15509579]
 is_a: GO:0002143 ! tRNA wobble position uridine thiolation
 is_a: GO:0070899 ! mitochondrial tRNA wobble uridine modification
 is_a: GO:0070903 ! mitochondrial tRNA thio-modification
@@ -627571,9 +627705,8 @@
 name: L-arginine transmembrane export from vacuole
 namespace: biological_process
 def: "The directed movement of L-arginine out of the vacuole, across the vacuolar membrane." [PMID:26083598]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0032974 ! amino acid transmembrane export from vacuole
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: vw
 creation_date: 2015-08-06T15:06:33Z
 
@@ -627581,13 +627714,14 @@
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
 
@@ -645257,7 +645391,6 @@
 name: N-methylnicotinate transport
 namespace: biological_process
 def: "The directed movement of a N-methylnicotinateacetate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:obol]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015697 ! quaternary ammonium group transport
 created_by: tb
 creation_date: 2011-10-18T05:16:08Z
@@ -648086,20 +648219,18 @@
 
 [Term]
 id: GO:7770032
-name: tyramine transport
+name: obsolete tyramine transport
 namespace: biological_process
-def: "The directed movement of tyramine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Tyramine is a monoamine neurotransmitter occurring predominantly in invertebrates." [PMID:15849736, PMID:32305263, PMID:9870940]
-is_a: GO:0015844 ! monoamine transport
-is_a: GO:0015850 ! organic hydroxy compound transport
+def: "OBSOLETE. The directed movement of tyramine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Tyramine is a monoamine neurotransmitter occurring predominantly in invertebrates." [PMID:15849736, PMID:32305263, PMID:9870940]
+comment: The reason for obsoletion is that this is an unnecessary grouping term and annotations should be made to more mechanism/location specific terms.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
-created_by: dragon-ai-agent
+is_obsolete: true
 
 [Term]
 id: GO:7770033
 name: octopamine transport
 namespace: biological_process
 def: "The directed movement of octopamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Octopamine is a monoamine neurotransmitter occurring predominantly in invertebrates." [PMID:15849736, PMID:32305263, PMID:9870940]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
@@ -648387,6 +648518,75 @@
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
