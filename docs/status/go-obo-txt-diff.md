# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-04-09 06:06:54.124696410 +0000
+++ go.obo	2026-04-09 06:16:09.728937615 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-03-25
+data-version: releases/2026-04-09
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-03-25" xsd:string
+property_value: owl:versionInfo "2026-04-09" xsd:string
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
@@ -9883,7 +9886,6 @@
 name: glycerophosphodiester transmembrane transport
 namespace: biological_process
 def: "The process in which a glycerophosphodiester is transported across a membrane. Glycerophosphodiesters are small molecules composed of glycerol-3-phosphate and an alcohol, for example, glycerophosphoinositol." [GOC:mcc, PMID:12912892]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -13143,8 +13145,9 @@
 synonym: "5-HT secretion" EXACT []
 synonym: "5-hydroxytryptamine secretion" EXACT []
 synonym: "serotonin release" RELATED [GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0023061 ! signal release
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0001821
@@ -16125,8 +16128,8 @@
 def: "An actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell, contain an F-actin-rich core surrounded by a ring structure containing proteins such as vinculin and talin, and have a diameter of 0.5 mm." [PMID:12837608, PMID:15890982]
 comment: Note that podosomes can be distinguished from other F-actin-rich structures or from other matrix contacts. For example, focal adhesions and focal contacts do not display a core structure of F-actin. Unlike focal adhesions, podosome assembly does not require de novo protein synthesis. However, most of the podosome ring components are found in focal adhesions and other cell-matrix contacts. Podosomes are typically found in cells that cross tissue boundaries, recruited to the leading edge of migrating cells, and are often sites of extracellular matrix degradation.
 xref: Wikipedia:Podosome
-is_a: GO:0043232 ! intracellular membraneless organelle
-relationship: part_of GO:0015629 ! actin cytoskeleton
+is_a: GO:0098858 ! actin-based cell projection
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0002103
@@ -16456,7 +16459,7 @@
 id: GO:0002143
 name: tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:16871210]
+def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:16871210]
 comment: In E. coli, the first step of the reaction is reductive elimination of sulfur from L-cysteine by IscS cysteine desulfurase to form an enzyme-bound cysteine-persulfide intermediate. Then, five essential gene products, TusA, TusB, TusC, TusD and TusE, mediate a sulfur relay that delivers the terminal sulfur of persulfide from IscS to MnmA12. The last protein, MnmA catalyzes the transfer of the sulfur from IscS to an ATP activated U34 of the tRNA.
 synonym: "tRNA wobble uridine thiolation" EXACT [GOC:mah]
 synonym: "wobble position s2U biosynthesis" EXACT []
@@ -31376,7 +31379,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003755
@@ -31445,7 +31448,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003762
@@ -35794,7 +35797,7 @@
 xref: RHEA:78903
 xref: RHEA:78907
 xref: UM-BBD_reactionID:r1051
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.16
 property_value: skos:exactMatch RHEA:21564
 property_value: skos:narrowMatch RHEA:34799
@@ -38880,12 +38883,13 @@
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
@@ -39875,7 +39879,7 @@
 xref: KEGG_REACTION:R02375
 xref: MetaCyc:ECDYSONE-O-ACYLTRANSFERASE-RXN
 xref: RHEA:15217
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.139
 property_value: skos:exactMatch RHEA:15217
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -42787,7 +42791,7 @@
 xref: EC:2.3.1.86
 xref: MetaCyc:FATTY-ACYL-COA-SYNTHASE-RXN
 xref: RHEA:22896
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.86
 property_value: skos:exactMatch RHEA:22896
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -43850,7 +43854,7 @@
 xref: RHEA:37199
 xref: RHEA:37203
 xref: RHEA:37463
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.15
 property_value: skos:exactMatch RHEA:15325
 property_value: skos:narrowMatch RHEA:35723
@@ -44112,7 +44116,6 @@
 xref: Reactome:R-HSA-203611 "N-myristoylation of eNOS"
 xref: Reactome:R-HSA-2534087 "NMT1/2 transfer MYS to GNAT1"
 xref: RHEA:15521
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.97
 property_value: skos:exactMatch RHEA:15521
@@ -48645,7 +48648,7 @@
 xref: Reactome:R-HSA-264695 "cholesterol + phosphatidylcholine (lecithin) => cholesterol ester + 2-lysophosphatidylcholine (lysolecithin)"
 xref: RHEA:21204
 xref: RHEA:34087
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.43
 property_value: skos:exactMatch RHEA:21204
 property_value: skos:narrowMatch RHEA:34087
@@ -52977,7 +52980,7 @@
 xref: EC:2.3.1.26
 xref: MetaCyc:RXN-20233
 xref: RHEA:59816
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.26
 property_value: skos:exactMatch MetaCyc:RXN-20233
 property_value: skos:exactMatch RHEA:59816
@@ -65636,7 +65639,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -66468,12 +66470,13 @@
 
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
@@ -70202,7 +70205,7 @@
 id: GO:0006423
 name: cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accetping tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accepting tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
 is_a: GO:0006418 ! tRNA aminoacylation for protein translation
 
 [Term]
@@ -70450,7 +70453,8 @@
 synonym: "binding unfolded ER proteins" EXACT []
 is_obsolete: true
 consider: GO:0005783
-consider: GO:0051082
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0006460
@@ -71162,7 +71166,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving arginine, 2-amino-5-(carbamimidamido)pentanoic acid." [GOC:curators]
 synonym: "arginine metabolism" EXACT []
-xref: Wikipedia:Arginine
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
 [Term]
@@ -71350,7 +71353,6 @@
 synonym: "glutamate metabolism" EXACT []
 synonym: "glutamic acid metabolic process" EXACT []
 synonym: "glutamic acid metabolism" EXACT []
-xref: Wikipedia:Glutamic_acid
 is_a: GO:0043648 ! dicarboxylic acid metabolic process
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
@@ -71579,12 +71581,15 @@
 
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
@@ -71597,7 +71602,6 @@
 xref: MetaCyc:ILEUDEG-PWY
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -71678,7 +71682,6 @@
 synonym: "methionine and threonine metabolic process" BROAD []
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
-xref: UM-BBD_pathwayID:met
 is_a: GO:0000096 ! sulfur amino acid metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
@@ -71886,7 +71889,6 @@
 def: "The chemical reactions and pathways involving tryptophan, the chiral amino acid 2-amino-3-(1H-indol-3-yl)propanoic acid." [ISBN:0198547684]
 synonym: "tryptophan metabolic process" RELATED []
 synonym: "tryptophan metabolism" RELATED []
-xref: Wikipedia:Tryptophan
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
@@ -71940,15 +71942,15 @@
 
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
@@ -71964,7 +71966,6 @@
 xref: MetaCyc:PWY-6120
 xref: MetaCyc:PWY-6134
 xref: MetaCyc:TYRSYN
-is_a: GO:0006570 ! tyrosine metabolic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3461
@@ -71988,7 +71989,7 @@
 xref: MetaCyc:PWY3O-4108
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
-is_a: GO:0006570 ! tyrosine metabolic process
+xref: UM-BBD_pathwayID:tyr
 is_a: GO:0009074 ! aromatic amino acid family catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72002,12 +72003,15 @@
 
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
@@ -72021,7 +72025,6 @@
 xref: MetaCyc:PWY-5057
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72131,8 +72134,10 @@
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
@@ -72151,8 +72156,10 @@
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
@@ -72168,17 +72175,18 @@
 
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
@@ -72224,11 +72232,12 @@
 
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
@@ -72304,11 +72313,14 @@
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
@@ -73802,6 +73814,7 @@
 name: ommochrome biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of ommochromes, any of a large group of natural polycyclic pigments commonly found in the Arthropoda, particularly in the ommatidia of the compound eye." [ISBN:0198506732]
+synonym: "kynurenine pathway" BROAD []
 synonym: "ommochrome anabolism" EXACT []
 synonym: "ommochrome biosynthesis" EXACT []
 synonym: "ommochrome formation" EXACT []
@@ -73809,6 +73822,7 @@
 is_a: GO:0006726 ! eye pigment biosynthetic process
 is_a: GO:0008055 ! ocellus pigment biosynthetic process
 is_a: GO:0046152 ! ommochrome metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0006728
@@ -74421,16 +74435,19 @@
 
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
@@ -74998,11 +75015,12 @@
 
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
@@ -75283,7 +75301,6 @@
 alt_id: GO:0015815
 def: "The directed movement of glutamine, 2-amino-4-carbamoylbutanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "glutamine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -76807,7 +76824,8 @@
 namespace: biological_process
 def: "Completion of folding of alpha- and beta-tubulin; takes place subsequent to chaperonin-mediated partial folding; mediated by a complex of folding cofactors." [PMID:10542094]
 xref: Reactome:R-HSA-389977 "Post-chaperonin tubulin folding pathway"
-is_a: GO:0006457 ! protein folding
+is_a: GO:0007021 ! tubulin complex assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31829" xsd:anyURI
 
 [Term]
 id: GO:0007026
@@ -79402,14 +79420,13 @@
 
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
@@ -83499,7 +83516,6 @@
 xref: Reactome:R-HSA-9636560 "Eis acetylates DUSP16"
 xref: Reactome:R-HSA-9913373 "AAC(6)-Ib acetylates ciprofloxacin"
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016410 ! N-acyltransferase activity
 
 [Term]
 id: GO:0008081
@@ -84110,12 +84126,13 @@
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
 
@@ -84405,17 +84422,18 @@
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
@@ -84599,7 +84617,7 @@
 id: GO:0008153
 name: 4-aminobenzoate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [ISBN:0198506732, MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
+def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
 synonym: "4-aminobenzoic acid biosynthesis" EXACT []
 synonym: "4-aminobenzoic acid biosynthetic process" EXACT []
 synonym: "p-aminobenzoic acid biosynthesis" EXACT []
@@ -84618,7 +84636,7 @@
 xref: MetaCyc:PWY-8281
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
-is_a: GO:0046482 ! para-aminobenzoic acid metabolic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6543
 property_value: skos:narrowMatch MetaCyc:PWY-8276
@@ -87056,9 +87074,10 @@
 
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
@@ -87070,7 +87089,9 @@
 xref: Reactome:R-HSA-422104 "Ghrelin O-acyltransferase octanoylates Proghrelin"
 xref: Reactome:R-HSA-5358343 "HHAT palmitoylates Hh N-terminal fragment"
 xref: Reactome:R-HSA-5483229 "HHAT G287V doesn't palmitoylate Hh-Np"
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0008375
@@ -89012,7 +89033,6 @@
 xref: Reactome:R-HSA-380620 "Reuptake of serotonin from the synapse"
 xref: Reactome:R-HSA-5660706 "Defective SLC6A3 does not cotransport DA, Na+ from extracellular region to cytosol"
 is_a: GO:0022804 ! active transmembrane transporter activity
-relationship: part_of GO:0015844 ! monoamine transport
 
 [Term]
 id: GO:0008506
@@ -92702,7 +92722,7 @@
 xref: EC:2.3.1.40
 xref: MetaCyc:ACYLGPEACYLTRANS-RXN
 xref: RHEA:10304
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.40
 property_value: skos:exactMatch RHEA:10304
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -92722,7 +92742,7 @@
 xref: MetaCyc:RXN-22480
 xref: RHEA:13925
 xref: RHEA:67812
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.129
 property_value: skos:exactMatch RHEA:67812
 property_value: skos:narrowMatch RHEA:13925
@@ -97955,7 +97975,6 @@
 synonym: "valine formation" EXACT []
 synonym: "valine synthesis" EXACT []
 xref: MetaCyc:VALSYN-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009079 ! pyruvate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
 relationship: has_part GO:0003984 ! acetolactate synthase activity
@@ -101651,8 +101670,15 @@
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
@@ -101662,15 +101688,26 @@
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
@@ -101678,9 +101715,11 @@
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
@@ -101700,7 +101739,6 @@
 synonym: "gamma-aminobutyric acid synthesis" EXACT []
 xref: Reactome:R-HSA-888568 "GABA synthesis"
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31732" xsd:anyURI
 
@@ -101726,7 +101764,6 @@
 xref: MetaCyc:PWY-6537
 xref: Reactome:R-HSA-916853 "Degradation of GABA"
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5022
 property_value: skos:narrowMatch MetaCyc:PWY-6473
@@ -114725,38 +114762,33 @@
 
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
@@ -118043,7 +118075,6 @@
 name: dopamine secretion
 namespace: biological_process
 def: "The regulated release of dopamine by a cell. Dopamine is a catecholamine and a precursor of adrenaline and noradrenaline. It acts as a neurotransmitter in the central nervous system but it is also produced peripherally and acts as a hormone." [GOC:ef]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -125032,7 +125063,7 @@
 consider: GO:0009297
 consider: GO:0030674
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0015473
@@ -126840,7 +126871,6 @@
 namespace: biological_process
 def: "A process in which ferric-enterobactin, the iron-bound form of the siderophore enterobactin, is transported into the cell by specific cell surface receptors." [GOC:pg, PMID:23192658]
 synonym: "ferric-enterobactin transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033214 ! siderophore-iron import into cell
 
 [Term]
@@ -126914,10 +126944,13 @@
 
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
@@ -126961,7 +126994,7 @@
 xref: Reactome:R-HSA-1475029 "Reversible hydration of carbon dioxide"
 xref: Reactome:R-HSA-1480926 "O2/CO2 exchange in erythrocytes"
 xref: Reactome:R-HSA-425381 "Bicarbonate transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0006810 ! transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26780" xsd:anyURI
 
 [Term]
@@ -127049,11 +127082,14 @@
 
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
@@ -127349,7 +127385,6 @@
 def: "The directed movement of urate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc]
 synonym: "urate transmembrane transport" EXACT [GOC:mah]
 synonym: "uric acid transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -127449,7 +127484,6 @@
 name: glucose-6-phosphate transport
 namespace: biological_process
 def: "The directed movement of glucose-6-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Glucose-6-phosphate is a monophosphorylated derivative of glucose with the phosphate group attached to C-6." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015712 ! hexose phosphate transport
 
 [Term]
@@ -127614,7 +127648,6 @@
 def: "The directed movement of CMP-N-acetylneuraminate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "CMP-N-acetylneuraminate transport" RELATED []
 synonym: "CMP-sialic acid transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127630,7 +127663,6 @@
 name: UDP-glucose transmembrane transport
 namespace: biological_process
 def: "The process in which UDP-glucose is transported across a membrane." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14450" xsd:anyURI
 
@@ -127651,7 +127683,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-N-acetylgalactosamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-N-acetylgalactosamine is a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-N-acetylgalactosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127660,7 +127691,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-xylose into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-xylose is a substance composed of xylose in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-xylose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127699,7 +127729,6 @@
 namespace: biological_process
 def: "The process in which glycerol-3-phosphate is transported across a membrane. Glycerol-3-phosphate is a phosphoric monoester of glycerol." [GOC:ai]
 synonym: "glycerol-3-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -127802,7 +127831,6 @@
 synonym: "S-adenosyl methionine transport" EXACT []
 synonym: "S-adenosylmethionine transport" EXACT []
 synonym: "SAM transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0072348 ! sulfur compound transport
 
 [Term]
@@ -127892,7 +127920,6 @@
 name: glycine transport
 namespace: biological_process
 def: "The directed movement of glycine, aminoethanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -127936,7 +127963,6 @@
 namespace: biological_process
 def: "The directed movement of L-leucine, 2-amino-4-methylpentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "leucine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015803 ! branched-chain amino acid transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -127949,7 +127975,6 @@
 synonym: "L-methionine transport" NARROW []
 is_a: GO:0000101 ! sulfur amino acid transport
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 
 [Term]
 id: GO:0015822
@@ -127958,7 +127983,6 @@
 def: "The directed movement of ornithine, 2,5-diaminopentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-ornithine transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -127977,7 +128001,6 @@
 namespace: biological_process
 def: "The directed movement of proline, pyrrolidine-2-carboxylic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-proline transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128010,7 +128033,6 @@
 def: "The directed movement of tryptophan, 2-amino-3-(1H-indol-3-yl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tryptophan transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 
 [Term]
@@ -128019,7 +128041,6 @@
 namespace: biological_process
 def: "The directed movement of tyrosine, 2-amino-3-(4-hydroxyphenyl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tyrosine transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128111,7 +128132,6 @@
 name: cadaverine transport
 namespace: biological_process
 def: "The directed movement of cadaverine, 1,5-pentanediamine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -128142,17 +128162,18 @@
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
@@ -128166,7 +128187,6 @@
 name: putrescine transport
 namespace: biological_process
 def: "The directed movement of putrescine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Putrescine is 1,4-diaminobutane, the polyamine formed by decarboxylation of ornithine and the metabolic precursor of spermidine and spermine." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128174,7 +128194,6 @@
 name: spermidine transport
 namespace: biological_process
 def: "The directed movement of spermidine, N-(3-aminopropyl)-1,4-diaminobutane, a polyamine formed by the transfer of a propylamine group from decarboxylated S-adenosylmethionine to putrescine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128313,7 +128332,6 @@
 name: ADP transport
 namespace: biological_process
 def: "The directed movement of ADP, adenosine diphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128322,7 +128340,6 @@
 name: ATP transport
 namespace: biological_process
 def: "The directed movement of ATP, adenosine triphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128349,7 +128366,6 @@
 name: acetylcholine transport
 namespace: biological_process
 def: "The directed movement of acetylcholine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Acetylcholine is an acetic acid ester of the organic base choline and functions as a neurotransmitter, released at the synapses of parasympathetic nerves and at neuromuscular junctions." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901374 ! acetate ester transport
 
@@ -128358,25 +128374,25 @@
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
@@ -128420,7 +128436,6 @@
 namespace: biological_process
 def: "The directed movement of carnitine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carnitine is a compound that participates in the transfer of acyl groups across the inner mitochondrial membrane." [GOC:ai]
 synonym: "vitamin Bt transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -128428,7 +128443,6 @@
 name: coenzyme A transport
 namespace: biological_process
 def: "The directed movement of coenzyme A into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Coenzyme A, 3'-phosphoadenosine-(5')diphospho(4')pantatheine, is an acyl carrier in many acylation and acyl-transfer reactions in which the intermediate is a thiol ester." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128466,7 +128480,6 @@
 synonym: "flavin adenine dinucleotide transport" EXACT []
 synonym: "flavin-adenine dinucleotide transport" EXACT []
 is_a: GO:0006862 ! nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 
 [Term]
 id: GO:0015884
@@ -128518,7 +128531,6 @@
 def: "The directed movement of thiamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Thiamine is vitamin B1, a water soluble vitamin present in fresh vegetables and meats, especially liver." [GOC:ai]
 synonym: "thiamin transport" EXACT []
 synonym: "vitamin B1 transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128649,7 +128661,6 @@
 def: "The directed movement of tetracycline from one side of a membrane to the other. Tetracycline is a broad spectrum antibiotic that blocks binding of aminoacyl tRNA to the ribosomes of both Gram-positive and Gram-negative organisms (and those of organelles)." [GOC:curators]
 synonym: "tetracyclin transport" BROAD []
 synonym: "tetracycline transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -128756,7 +128767,6 @@
 synonym: "fatty acyl CoA transport" EXACT []
 synonym: "fatty acyl coenzyme A transport" EXACT []
 synonym: "fatty acyl-CoA transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:1901337 ! thioester transport
@@ -130103,26 +130113,23 @@
 
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
@@ -133608,7 +133615,7 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the carnitine molecule." [GOC:ai]
 xref: Reactome:R-HSA-200410 "CPT2 converts acylcarnitine to acyl-CoA"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016407
@@ -133627,10 +133634,13 @@
 
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
@@ -133644,13 +133654,16 @@
 
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
@@ -133659,7 +133672,7 @@
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the acylglycerol molecule." [GOC:ai]
 xref: Reactome:R-HSA-1482647 "2-MAG and DAG are transacylated to TAG by PNPLA2/3"
 xref: Reactome:R-HSA-1482654 "2-MAG is transacylated to DAG by PNPLA2/3"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016412
@@ -133676,7 +133689,7 @@
 xref: RHEA:68292
 xref: RHEA:68296
 xref: RHEA:68300
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:68272
 property_value: skos:narrowMatch RHEA:59964
 property_value: skos:narrowMatch RHEA:59972
@@ -133693,7 +133706,6 @@
 name: O-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016407 ! acetyltransferase activity
 
 [Term]
@@ -133704,7 +133716,7 @@
 synonym: "O-octanoyltransferase activity" BROAD []
 xref: EC:2.3.1.273
 xref: RHEA:56868
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.273
 property_value: skos:exactMatch RHEA:56868
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -133727,15 +133739,17 @@
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
@@ -133743,7 +133757,6 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016417 ! S-acyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17828" xsd:anyURI
 
 [Term]
@@ -133751,7 +133764,6 @@
 name: S-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
@@ -134036,14 +134048,12 @@
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
@@ -137215,7 +137225,6 @@
 name: N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137223,7 +137232,6 @@
 name: O-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137231,7 +137239,6 @@
 name: S-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137246,7 +137253,6 @@
 name: O-sinapoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016752 ! sinapoyltransferase activity
 
 [Term]
@@ -141166,7 +141172,7 @@
 id: GO:0017109
 name: glutamate-cysteine ligase complex
 namespace: cellular_component
-def: "An enzyme complex that catalyzes the ligation of glutamate to cysteine, forming glutamylcysteine." [PMID:9675072]
+def: "An enzyme complex that catalyzes the ligation of L-glutamate to L-cysteine, forming gamma-L-glutamyl-L-cysteine." [PMID:9675072]
 synonym: "gamma-glutamylcysteine synthetase complex" EXACT []
 is_a: GO:1902494 ! catalytic complex
 relationship: part_of GO:0005737 ! cytoplasm
@@ -142403,7 +142409,7 @@
 name: peptidyl-lysine N6-palmitoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a palmitoyl group to the N6 nitrogen atom on a lysine residue of a peptide or protein molecule." [GOC:mah, PMID:29074776]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22878" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22968" xsd:anyURI
@@ -152203,6 +152209,7 @@
 xref: UM-BBD_pathwayID:msa
 is_a: GO:0006805 ! xenobiotic metabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0018927
@@ -152834,7 +152841,6 @@
 synonym: "naphthalenesulphonate metabolic process" EXACT []
 synonym: "naphthalenesulphonate metabolism" EXACT []
 xref: UM-BBD_pathwayID:nphs
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -154034,7 +154040,7 @@
 comment: This term has been obsoleted because it represents an unnecessary grouping class and is not consistent with the ontology structure.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22971" xsd:anyURI
 is_obsolete: true
-consider: GO:0016410
+consider: GO:0016747
 
 [Term]
 id: GO:0019107
@@ -155631,15 +155637,15 @@
 
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
 
@@ -155652,7 +155658,6 @@
 synonym: "citrulline catabolism" EXACT []
 synonym: "citrulline degradation" EXACT []
 xref: MetaCyc:CITRULLINE-DEG-PWY
-is_a: GO:0000052 ! citrulline metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
@@ -156345,7 +156350,6 @@
 synonym: "coenzyme M synthesis" EXACT []
 xref: MetaCyc:P261-PWY
 xref: MetaCyc:PWY-6643
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 property_value: skos:narrowMatch MetaCyc:P261-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6643
@@ -157028,8 +157032,8 @@
 synonym: "teichoic acid formation" EXACT []
 synonym: "teichoic acid synthesis" EXACT []
 xref: MetaCyc:TEICHOICACID-PWY
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 is_a: GO:0046374 ! teichoic acid metabolic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
@@ -157051,26 +157055,31 @@
 
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
@@ -157357,13 +157366,16 @@
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
@@ -158575,12 +158587,15 @@
 
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
@@ -158597,7 +158612,6 @@
 xref: MetaCyc:PWY-5155
 xref: MetaCyc:PWY-5760
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3941
 property_value: skos:narrowMatch MetaCyc:PWY-3981
@@ -158618,7 +158632,6 @@
 xref: MetaCyc:PWY-1781
 xref: MetaCyc:PWY-8120
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:BETA-ALA-DEGRADATION-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-1781
@@ -160219,35 +160232,41 @@
 
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
@@ -161127,7 +161146,6 @@
 synonym: "alkanesulphonate metabolic process" EXACT []
 synonym: "alkanesulphonate metabolism" EXACT []
 xref: MetaCyc:ALKANEMONOX-PWY
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -161290,7 +161308,7 @@
 xref: Reactome:R-HSA-158832 "The acetyl group from acetyl-CoA is transferred to NAT2"
 xref: Reactome:R-HSA-174959 "The acetyl group from acetyl-CoA is transferred to NAT1"
 xref: RHEA:63372
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:63372
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18882" xsd:anyURI
@@ -172542,15 +172560,17 @@
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
@@ -173008,8 +173028,9 @@
 synonym: "chaperone regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030189
@@ -173020,8 +173041,9 @@
 synonym: "chaperone activator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030190
@@ -173032,8 +173054,9 @@
 synonym: "chaperone inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030191
@@ -173044,8 +173067,9 @@
 synonym: "Hsp70/Hsc70 protein inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030192
@@ -173056,8 +173080,9 @@
 synonym: "Hsp70/Hsc70 protein regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030193
@@ -173988,7 +174013,7 @@
 xref: MetaCyc:2.3.1.101-RXN
 xref: RHEA:18061
 xref: UM-BBD_reactionID:r0346
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.101
 property_value: skos:exactMatch RHEA:18061
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -181692,7 +181717,6 @@
 synonym: "thiamine pyrophosphate transport" NARROW []
 synonym: "TPP transport" EXACT []
 is_a: GO:0015697 ! quaternary ammonium group transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0071934 ! thiamine transmembrane transport
 
@@ -184348,11 +184372,14 @@
 
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
@@ -185974,11 +186001,13 @@
 
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
@@ -186799,7 +186828,6 @@
 namespace: biological_process
 def: "The directed movement of glycine betaine, N-trimethylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "N-trimethylglycine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -191110,7 +191138,6 @@
 name: pyridoxal transport
 namespace: biological_process
 def: "The directed movement of pyridoxal into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxal, 3-hydroxy-5-(hydroxymethyl)-2-methyl-4-pyridinecarboxaldehyde, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -191119,7 +191146,6 @@
 name: pyridoxal phosphate transport
 namespace: biological_process
 def: "The directed movement of pyridoxal phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore; pyridoxal phosphate is pyridoxal phosphorylated at the hydroxymethyl group of C-5, and is the active form of vitamin B6." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
@@ -191129,7 +191155,6 @@
 name: pyridoxamine transport
 namespace: biological_process
 def: "The directed movement of pyridoxamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxamine, 4-(aminomethyl)-5-(hydroxymethyl)-2-methylpyridin-3-ol, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -194366,7 +194391,7 @@
 synonym: "GPI-inositol acyltransferase" RELATED []
 xref: RHEA:60496
 xref: RHEA:83759
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:60496
 property_value: skos:narrowMatch RHEA:83759
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30693" xsd:anyURI
@@ -194387,7 +194412,6 @@
 name: riboflavin transport
 namespace: biological_process
 def: "The directed movement of riboflavin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Riboflavin (vitamin B2) is a water-soluble B-complex vitamin, converted in the cell to FMN and FAD, cofactors required for the function of flavoproteins." [GOC:rn, PMID:16204239]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -195040,7 +195064,7 @@
 namespace: biological_process
 def: "The regulated release of a gonadotropin, any hormone that stimulates the gonads, especially follicle-stimulating hormone and luteinizing hormone." [GOC:mah, ISBN:0721662544]
 synonym: "gonadotrophin secretion" EXACT []
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032275
@@ -195542,7 +195566,6 @@
 name: alanine transport
 namespace: biological_process
 def: "The directed movement of alanine, 2-aminopropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195554,7 +195577,6 @@
 alt_id: GO:0090478
 def: "The directed movement of L-serine, 2-amino-3-hydroxypropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "serine import" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195617,7 +195639,7 @@
 name: inhibin secretion
 namespace: biological_process
 def: "The regulated release of an inhibin, either of two glycoproteins (designated A and B), secreted by the gonads and present in seminal plasma and follicular fluid, that inhibit pituitary production of follicle-stimulating hormone." [GOC:mah]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032335
@@ -196649,7 +196671,6 @@
 is_a: GO:0043005 ! neuron projection
 is_a: GO:0098858 ! actin-based cell projection
 relationship: part_of GO:0032421 ! stereocilium bundle
-relationship: part_of GO:0043226 ! organelle
 
 [Term]
 id: GO:0032421
@@ -198225,7 +198246,7 @@
 name: O-linoleoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a linoleoyl ((9Z,12Z)-octadeca-9,12-dienoyl) group to an oxygen atom on the acceptor molecule." [GOC:cb]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0032577
@@ -203023,34 +203044,47 @@
 
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
@@ -203808,7 +203842,8 @@
 synonym: "insertion of proteins into the mitochondrial membrane from the inner side" EXACT []
 synonym: "protein insertion into mitochondrial inner membrane from matrix side" EXACT []
 synonym: "protein insertion into mitochondrial membrane from inner side" EXACT []
-is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+is_a: GO:0007007 ! inner mitochondrial membrane organization
+is_a: GO:0051204 ! protein insertion into mitochondrial membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25265" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30453" xsd:anyURI
 
@@ -206254,9 +206289,10 @@
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
@@ -206366,46 +206402,54 @@
 
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
@@ -206909,7 +206953,6 @@
 namespace: biological_process
 def: "The directed movement of myo-inositol hexakisphosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "phytate transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033271 ! myo-inositol phosphate transport
 
 [Term]
@@ -207723,10 +207766,15 @@
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
@@ -208128,59 +208176,65 @@
 
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
@@ -213389,7 +213443,7 @@
 xref: KEGG_REACTION:R03064
 xref: MetaCyc:2.3.1.175-RXN
 xref: RHEA:23860
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.175
 property_value: skos:exactMatch RHEA:23860
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -213408,7 +213462,7 @@
 synonym: "sterol carrier protein-X" RELATED [EC:2.3.1.176]
 xref: MetaCyc:2.3.1.176-RXN
 xref: RHEA:16865
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:broadMatch EC:2.3.1.176
 property_value: skos:exactMatch RHEA:16865
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -219104,7 +219158,6 @@
 def: "The directed movement of ethanolamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Ethanolamine (2-aminoethanol, monoethanolamine) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids, such as phosphatidylethanolamine." [GOC:rn, PMID:3514579]
 synonym: "2-aminoethanol transport" EXACT []
 synonym: "monoethanolamine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 
@@ -219630,8 +219683,10 @@
 synonym: "kynurenic acid biosynthesis" EXACT []
 synonym: "kynurenic acid formation" RELATED []
 synonym: "kynurenic acid synthesis" EXACT []
+synonym: "kynurenine pathway" BROAD []
 is_a: GO:0034275 ! kynurenic acid metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034277
@@ -220061,7 +220116,7 @@
 synonym: "acyl-coenzymeA:ethanol O-acyltransferase activity" NARROW []
 synonym: "AEATase activity" NARROW []
 synonym: "alcohol acyltransferase activity" EXACT []
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0034319
@@ -220456,6 +220511,7 @@
 synonym: "'de novo' NAD biosynthetic process from L-tryptophan" EXACT []
 synonym: "'de novo' NAD biosynthetic process from tryptophan" BROAD []
 synonym: "de novo NAD biosynthetic process from tryptophan" RELATED []
+synonym: "kynurenine pathway" BROAD []
 xref: MetaCyc:NADSYN-PWY
 xref: MetaCyc:PWY-5653
 is_a: GO:0006568 ! L-tryptophan metabolic process
@@ -220464,6 +220520,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5653
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29050" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29666" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034355
@@ -223232,7 +223289,6 @@
 name: glutathione transport
 namespace: biological_process
 def: "The directed movement of glutathione, the tripeptide glutamylcysteinylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0042939 ! tripeptide transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -231122,7 +231178,6 @@
 def: "The process in which triose phosphate (glyceraldehyde 3-phosphate) is transported across a membrane. Glyceraldehyde 3-phosphate is any organic three carbon compound phosphate ester." [GOC:bf, ISBN:0198506732]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "triose phosphate membrane transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015717 ! triose phosphate transport
 is_a: GO:0055085 ! transmembrane transport
 created_by: bf
@@ -235892,13 +235947,16 @@
 
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
 
@@ -236580,7 +236638,7 @@
 synonym: "parathormone secretion" EXACT [PR:000013429]
 synonym: "parathyrin secretion" EXACT [PR:000013429]
 synonym: "PTH secretion" EXACT [PMID:12171519, PR:000013429]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 created_by: bf
 creation_date: 2011-06-22T09:28:54Z
 
@@ -236944,7 +237002,7 @@
 name: steroid hormone secretion
 namespace: biological_process
 def: "The regulated release of any steroid that acts as a hormone into the circulatory system." [GOC:sl]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 created_by: bf
 creation_date: 2011-07-20T01:01:00Z
@@ -244053,10 +244111,14 @@
 
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
 
@@ -245141,7 +245203,7 @@
 synonym: "nitric oxide-cGMP-mediated signaling pathway" EXACT []
 synonym: "nitric oxide-cGMP-mediated signalling pathway" EXACT [GOC:mah]
 synonym: "NO-cGMP signaling pathway" EXACT [PMID:22019632]
-is_a: GO:0007263 ! nitric oxide mediated signal transduction
+is_a: GO:0141124 ! intracellular signaling cassette
 created_by: bf
 creation_date: 2012-01-10T05:32:39Z
 
@@ -248776,9 +248838,9 @@
 name: RNA translocase activity
 namespace: molecular_function
 def: "Generating a movement along a single- or double-stranded RNA molecule, driven by ATP hydrolysis." [GOC:bm, PMID:22713318]
-comment: Note that some gene products that possess DNA translocase activity, such as members of the FtsK/SpoIIIE family, can be fixed in place by interactions with other components of the cell; the relative movement between the protein and DNA bound to it results in movement of the DNA within the cell, often across a membrane.
 is_a: GO:0008186 ! ATP-dependent activity, acting on RNA
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21612" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31772" xsd:anyURI
 created_by: bf
 creation_date: 2012-08-06T13:24:51Z
 
@@ -259129,13 +259191,13 @@
 
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
@@ -259447,7 +259509,6 @@
 def: "The directed movement of an alkanesulfonate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Alkanesulfonates are organic esters or salts of sulfonic acid containing an aliphatic hydrocarbon radical." [PMID:31802112]
 synonym: "alkanesulfonate transport" BROAD []
 synonym: "alkanesulphonate transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -259549,7 +259610,6 @@
 namespace: biological_process
 def: "The directed movement of the siderochrome enterobactin, a cyclic trimer of 2, 3 dihydroxybenzoylserine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl]
 synonym: "enterochelin transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0015891 ! siderophore transport
 
@@ -262376,7 +262436,6 @@
 name: daunorubicin transport
 namespace: biological_process
 def: "The directed movement of daunorubicin, an anthracycline antibiotic produced by Streptomyces coeruleorubidus or S. peucetius and used as an antineoplastic into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, GOC:mlg]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
 
@@ -262738,7 +262797,7 @@
 name: sodium-dependent organic anion transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043252
@@ -262746,7 +262805,7 @@
 namespace: biological_process
 def: "The directed, sodium-independent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
 xref: Reactome:R-HSA-879518 "Organic anion transport by SLCO transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043253
@@ -264862,7 +264921,7 @@
 synonym: "oxo acid metabolic process" EXACT []
 synonym: "oxo acid metabolism" EXACT []
 synonym: "oxoacid metabolism" EXACT []
-is_a: GO:0006082 ! organic acid metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0043438
@@ -268973,7 +269032,7 @@
 name: lyso-ornithine lipid acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: lyso-ornithine lipid + acyl-[acyl-carrier protein] = ornithine lipid + [acyl-carrier protein]." [PMID:15341653]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0043810
@@ -268984,7 +269043,7 @@
 synonym: "ornithine-acyl[acyl carrier protein] N-acyltransferase activity" EXACT []
 xref: EC:2.3.2.30
 xref: RHEA:20633
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0140371 ! ornithine lipid biosynthetic process
 property_value: skos:exactMatch EC:2.3.2.30
 property_value: skos:exactMatch RHEA:20633
@@ -273385,7 +273444,6 @@
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
 is_a: GO:0003674 ! molecular_function
-relationship: has_part GO:0051082 ! unfolded protein binding
 relationship: part_of GO:0006457 ! protein folding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30552" xsd:anyURI
 created_by: jl
@@ -281170,9 +281228,10 @@
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
@@ -281193,18 +281252,16 @@
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
@@ -283622,6 +283679,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 
 [Term]
 id: GO:0045276
@@ -283653,6 +283711,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27727" xsd:anyURI
 
 [Term]
@@ -283964,8 +284023,10 @@
 synonym: "nor-spermidine biosynthesis" EXACT []
 synonym: "nor-spermidine formation" EXACT []
 synonym: "nor-spermidine synthesis" EXACT []
+xref: MetaCyc:PWY-6562
 is_a: GO:0006596 ! polyamine biosynthetic process
 is_a: GO:0046204 ! nor-spermidine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0045313
@@ -284621,7 +284682,7 @@
 namespace: biological_process
 def: "The regulated release of juvenile hormones, the three sesquiterpenoid derivatives that function to maintain the larval state of insects at molting and that may be required for other processes, e.g. oogenesis." [GOC:curators, ISBN:0198547684]
 is_a: GO:0046865 ! terpenoid transport
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 
 [Term]
@@ -294650,6 +294711,10 @@
 synonym: "spermidine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008216 ! spermidine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046204
@@ -294699,6 +294764,10 @@
 synonym: "spermine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008215 ! spermine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046209
@@ -294966,7 +295035,6 @@
 synonym: "2-aminobenzenesulphonate catabolic process" EXACT []
 synonym: "2-aminobenzenesulphonate catabolism" EXACT []
 is_a: GO:0009310 ! amine catabolic process
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
 is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
@@ -295468,8 +295536,8 @@
 synonym: "toluene-4-sulfonate degradation" EXACT []
 synonym: "toluene-4-sulphonate catabolic process" EXACT []
 synonym: "toluene-4-sulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:0072491 ! toluene-containing compound catabolic process
 
 [Term]
@@ -295916,7 +295984,6 @@
 synonym: "alkanesulfonate synthesis" EXACT []
 synonym: "alkanesulphonate biosynthesis" EXACT []
 synonym: "alkanesulphonate biosynthetic process" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 
@@ -295930,7 +295997,6 @@
 synonym: "alkanesulfonate degradation" EXACT []
 synonym: "alkanesulphonate catabolic process" EXACT []
 synonym: "alkanesulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 
@@ -297002,8 +297068,8 @@
 synonym: "carboxylic acid biosynthesis" EXACT []
 synonym: "carboxylic acid formation" EXACT []
 synonym: "carboxylic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 
 [Term]
 id: GO:0046395
@@ -297013,8 +297079,8 @@
 synonym: "carboxylic acid breakdown" EXACT []
 synonym: "carboxylic acid catabolism" EXACT []
 synonym: "carboxylic acid degradation" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 
 [Term]
 id: GO:0046396
@@ -298044,9 +298110,10 @@
 
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
@@ -298056,9 +298123,8 @@
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
@@ -298239,12 +298305,13 @@
 
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
@@ -300891,18 +300958,15 @@
 
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
 
@@ -303290,7 +303354,6 @@
 name: carboxylic acid transport
 namespace: biological_process
 def: "The directed movement of carboxylic acids into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carboxylic acids are organic acids containing one or more carboxyl (COOH) groups or anions (COO-)." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 
 [Term]
@@ -303387,21 +303450,24 @@
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
@@ -303412,6 +303478,7 @@
 is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:1901569 ! fatty acid derivative catabolic process
 is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
 
 [Term]
 id: GO:0046956
@@ -303534,7 +303601,6 @@
 synonym: "3'-phosphoadenosine 5'-phosphosulphate transport" EXACT []
 synonym: "adenosine 3'-phosphate 5'-phosphosulfate transport" EXACT []
 synonym: "PAPS transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -306495,7 +306561,6 @@
 xref: Reactome:R-HSA-1482646 "2-acyl LPE is acylated to PE by LPEAT"
 xref: Reactome:R-HSA-1482691 "2-acyl LPS is acylated to PS by LPSAT"
 xref: RHEA:14233
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0042171 ! lysophosphatidic acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.52
 property_value: skos:exactMatch RHEA:14233
@@ -306774,7 +306839,7 @@
 xref: RHEA:37627
 xref: RHEA:37711
 xref: RHEA:37819
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.25
 property_value: skos:exactMatch RHEA:10344
 property_value: skos:narrowMatch RHEA:37627
@@ -306910,7 +306975,7 @@
 xref: RHEA:37755
 xref: RHEA:37759
 xref: RHEA:37763
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.121
 property_value: skos:exactMatch RHEA:16245
 property_value: skos:narrowMatch RHEA:37631
@@ -306930,7 +306995,7 @@
 xref: EC:2.3.1.125
 xref: MetaCyc:2.3.1.125-RXN
 xref: RHEA:21996
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.125
 property_value: skos:exactMatch RHEA:21996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307025,7 +307090,7 @@
 xref: RHEA:55320
 xref: RHEA:56244
 xref: RHEA:56248
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.135
 property_value: skos:exactMatch RHEA:17469
 property_value: skos:narrowMatch RHEA:55320
@@ -307049,7 +307114,6 @@
 xref: KEGG_REACTION:R01944
 xref: MetaCyc:2.3.1.138-RXN
 xref: RHEA:12436
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.138
 property_value: skos:exactMatch RHEA:12436
@@ -307066,7 +307130,7 @@
 xref: EC:2.3.1.141
 xref: MetaCyc:2.3.1.141-RXN
 xref: RHEA:17057
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.141
 property_value: skos:exactMatch RHEA:17057
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307223,7 +307287,7 @@
 xref: RHEA:37859
 xref: RHEA:37863
 xref: RHEA:37867
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.23
 property_value: skos:exactMatch RHEA:12937
 property_value: skos:narrowMatch RHEA:33359
@@ -307357,7 +307421,7 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
 property_value: skos:narrowMatch RHEA:74799
@@ -307380,7 +307444,7 @@
 xref: RHEA:37783
 xref: RHEA:37811
 xref: RHEA:37839
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.63
 property_value: skos:exactMatch RHEA:23992
 property_value: skos:narrowMatch RHEA:37715
@@ -307444,7 +307508,7 @@
 xref: KEGG_REACTION:R04333
 xref: MetaCyc:2.3.1.72-RXN
 xref: RHEA:21180
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.72
 property_value: skos:exactMatch RHEA:21180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307459,7 +307523,7 @@
 xref: EC:2.3.1.73
 xref: MetaCyc:2.3.1.73-RXN
 xref: RHEA:13301
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.73
 property_value: skos:exactMatch RHEA:13301
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307494,7 +307558,7 @@
 xref: RHEA:81803
 xref: RHEA:81807
 xref: RHEA:81811
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.75
 property_value: skos:exactMatch MetaCyc:2.3.1.75-RXN
 property_value: skos:exactMatch RHEA:38443
@@ -307528,7 +307592,7 @@
 xref: RHEA:16897
 xref: RHEA:78195
 xref: RHEA:78199
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.77
 property_value: skos:exactMatch RHEA:16897
 property_value: skos:narrowMatch RHEA:78195
@@ -307566,7 +307630,7 @@
 xref: KEGG_REACTION:R04227
 xref: MetaCyc:2.3.1.83-RXN
 xref: RHEA:19285
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.83
 property_value: skos:exactMatch RHEA:19285
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -319614,7 +319678,7 @@
 xref: EC:2.3.1.123
 xref: MetaCyc:DOLICHOL-O-ACYLTRANSFERASE-RXN
 xref: RHEA:16685
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.123
 property_value: skos:exactMatch RHEA:16685
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -320259,7 +320323,7 @@
 synonym: "mono-beta-D-galactosyldiacylglycerol:mono-beta-D-galactosyldiacylglycerol acyltransferase activity" RELATED [EC:2.3.1.134]
 xref: EC:2.3.1.134
 xref: MetaCyc:GALACTOLIPID-O-ACYLTRANSFERASE-RXN
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.134
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -323861,12 +323925,12 @@
 
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
@@ -323874,7 +323938,6 @@
 namespace: biological_process
 def: "The regulated release of epinephrine by a cell. Epinephrine is a catecholamine hormone secreted by the adrenal medulla and a neurotransmitter, released by certain neurons and active in the central nervous system." [GOC:ef, GOC:jid]
 synonym: "adrenaline secretion" EXACT []
-is_a: GO:0048241 ! epinephrine transport
 is_a: GO:0050432 ! catecholamine secretion
 
 [Term]
@@ -323883,7 +323946,6 @@
 namespace: biological_process
 def: "The regulated release of norepinephrine by a cell. Norepinephrine is a catecholamine and it acts as a hormone and as a neurotransmitter of most of the sympathetic nervous system." [GOC:ef, GOC:jid]
 synonym: "noradrenaline secretion" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -334901,7 +334963,7 @@
 xref: RHEA:11488
 xref: RHEA:38175
 xref: RHEA:55284
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0042572 ! retinol metabolic process
 property_value: skos:exactMatch EC:2.3.1.76
 property_value: skos:exactMatch RHEA:11488
@@ -335597,7 +335659,7 @@
 xref: RHEA:37123
 xref: RHEA:45284
 xref: RHEA:64044
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.24
 property_value: skos:exactMatch RHEA:23768
 property_value: skos:narrowMatch RHEA:36687
@@ -338001,8 +338063,9 @@
 name: catecholamine secretion
 namespace: biological_process
 def: "The regulated release of catecholamines by a cell. The catecholamines are a group of physiologically important biogenic amines that possess a catechol (3,4-dihydroxyphenyl) nucleus and are derivatives of 3,4-dihydroxyphenylethylamine." [GOC:ai, GOC:ef]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0032940 ! secretion by cell
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0050433
@@ -341305,7 +341368,6 @@
 xref: EC:2.3.1.155
 xref: MetaCyc:2.3.1.155-RXN
 xref: RHEA:18161
-is_a: GO:0016408 ! C-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.155
 property_value: skos:exactMatch RHEA:18161
@@ -341425,7 +341487,7 @@
 xref: EC:2.3.1.164
 xref: MetaCyc:2.3.1.164-RXN
 xref: RHEA:20720
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.164
 property_value: skos:exactMatch RHEA:20720
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -342342,7 +342404,6 @@
 name: N-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342350,7 +342411,6 @@
 name: O-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342358,7 +342418,6 @@
 name: O-hydroxycinnamoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a hydroxycinnamoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 
 [Term]
@@ -343546,8 +343605,8 @@
 synonym: "teichuronic acid biosynthesis" EXACT []
 synonym: "teichuronic acid formation" EXACT []
 synonym: "teichuronic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
 
 [Term]
@@ -346394,17 +346453,17 @@
 
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
@@ -351145,7 +351204,6 @@
 synonym: "adrenotropin secretion" EXACT []
 synonym: "corticotropic hormone secretion" EXACT []
 is_a: GO:0030072 ! peptide hormone secretion
-is_a: GO:0060986 ! endocrine hormone secretion
 
 [Term]
 id: GO:0051459
@@ -351922,10 +351980,13 @@
 
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
@@ -352850,7 +352911,8 @@
 synonym: "5-hydroxytryptamine uptake" EXACT []
 synonym: "5HT uptake" EXACT []
 synonym: "serotonin import" EXACT [GOC:dph, GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0098810 ! neurotransmitter reuptake
 
 [Term]
@@ -352989,7 +353051,6 @@
 synonym: "noradrenaline uptake" EXACT []
 synonym: "norepinephrine import" EXACT [GOC:dph, GOC:tb]
 synonym: "norepinephrine reuptake" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0090493 ! catecholamine uptake
 
 [Term]
@@ -356624,11 +356685,12 @@
 
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
@@ -364410,15 +364472,18 @@
 
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
 
@@ -364439,7 +364504,6 @@
 synonym: "ergothioneine synthesis" EXACT []
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0006578 ! amino-acid betaine biosynthetic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052703 ! modified histidine biosynthetic process
 created_by: ai
 creation_date: 2011-08-01T03:56:19Z
@@ -364459,7 +364523,6 @@
 synonym: "ergothioneine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006579 ! amino-acid betaine catabolic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052702 ! modified histidine catabolic process
 created_by: ai
 creation_date: 2011-08-01T03:56:22Z
@@ -370861,7 +370924,6 @@
 namespace: cellular_component
 def: "The portion of the plasma membrane surrounding a stereocilium." [GOC:dph, GOC:rph]
 is_a: GO:0032589 ! neuron projection membrane
-relationship: part_of GO:0005622 ! intracellular anatomical structure
 relationship: part_of GO:0032420 ! stereocilium
 
 [Term]
@@ -379779,11 +379841,13 @@
 
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
 
@@ -385846,7 +385910,6 @@
 def: "The controlled release of histamine by a cell, in which the histamine acts as a neurotransmitter." [GOC:dph]
 is_a: GO:0001821 ! histamine secretion
 is_a: GO:0007269 ! neurotransmitter secretion
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: dph
@@ -385946,8 +386009,8 @@
 name: tyramine secretion
 namespace: biological_process
 def: "The regulated release of a tyramine by a cell." [GOC:dph]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0061531 ! primary amine secretion
-is_a: GO:7770032 ! tyramine transport
 created_by: dph
 creation_date: 2013-06-25T09:14:07Z
 
@@ -386327,7 +386390,7 @@
 synonym: "autoinducer-1 synthase" RELATED [GOC:dph]
 xref: EC:2.3.1.184
 xref: RHEA:10096
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.184
 property_value: skos:exactMatch RHEA:10096
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -390242,7 +390305,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: propionyl-CoA + lysine in peptide = CoA + N-propionyl-lysine-peptide." [PMID:17267393]
 xref: RHEA:54020
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:54020
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: dph
@@ -391873,7 +391936,6 @@
 def: "Any process that modulates the rate, frequency or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009889 ! regulation of biosynthetic process
 is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0042412 ! taurine biosynthetic process
 relationship: regulates GO:0042412 ! taurine biosynthetic process
@@ -391886,7 +391948,6 @@
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 is_a: GO:0062089 ! regulation of taurine biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0042412 ! taurine biosynthetic process
@@ -395081,7 +395142,7 @@
 id: GO:0070147
 name: mitochondrial cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
 is_a: GO:0006423 ! cysteinyl-tRNA aminoacylation
 is_a: GO:0070127 ! tRNA aminoacylation for mitochondrial protein translation
 intersection_of: GO:0006423 ! cysteinyl-tRNA aminoacylation
@@ -395231,7 +395292,7 @@
 namespace: biological_process
 def: "The regulated release of adiponectin, a protein hormone, by adipose tissue." [GOC:BHF, GOC:rl]
 is_a: GO:0009306 ! protein secretion
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0070163
@@ -395508,14 +395569,16 @@
 
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
@@ -401481,7 +401544,7 @@
 name: sodium-dependent organic cation transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:BHF, GOC:mah]
-is_a: GO:0015695 ! organic cation transport
+is_a: GO:0055085 ! transmembrane transport
 created_by: mah
 creation_date: 2009-06-09T03:26:27Z
 
@@ -401639,7 +401702,6 @@
 namespace: biological_process
 def: "The directed movement of cyclic AMP (cAMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic AMP transport" EXACT [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -401653,7 +401715,6 @@
 def: "The directed movement of cyclic GMP (cGMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic GMP transport" EXACT [GOC:mah]
 is_a: GO:0001408 ! guanine nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
 created_by: mah
@@ -402628,7 +402689,6 @@
 namespace: biological_process
 def: "The process in which glycerol-2-phosphate is transported across a membrane. Glycerol-2-phosphate is a phosphoric monoester of glycerol." [GOC:mah]
 synonym: "glycerol-2-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -402932,7 +402992,6 @@
 namespace: biological_process
 def: "The directed movement of dehydroascorbate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dehydroascorbate, 5-(1,2-dihydroxyethyl)furan-2,3,4(5H)-trione, is an oxidized form of vitamin C." [GOC:sl]
 synonym: "dehydroascorbate transport" EXACT [GOC:sl]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 created_by: mah
 creation_date: 2009-07-30T05:24:31Z
@@ -403279,6 +403338,8 @@
 intersection_of: GO:0098590 ! plasma membrane region
 intersection_of: part_of GO:0043332 ! mating projection tip
 relationship: part_of GO:0043332 ! mating projection tip
+relationship: part_of GO:0070250 ! mating projection membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31775" xsd:anyURI
 created_by: mah
 creation_date: 2009-08-19T04:05:58Z
 
@@ -414312,7 +414373,7 @@
 namespace: biological_process
 def: "The aggregation, arrangement and bonding together of a set of components to form a podosome, an actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell." [GOC:mah, GOC:sl]
 is_a: GO:0065003 ! protein-containing complex assembly
-is_a: GO:0140694 ! membraneless organelle assembly
+is_a: GO:0120031 ! plasma membrane bounded cell projection assembly
 created_by: mah
 creation_date: 2010-09-03T11:00:45Z
 
@@ -414323,7 +414384,7 @@
 def: "Any process that modulates the frequency, rate or extent of podosome assembly." [GOC:mah, GOC:sl]
 comment: Note that the assembly is regulated by several small GTPases of the Rab and Rho families.
 is_a: GO:0043254 ! regulation of protein-containing complex assembly
-is_a: GO:1902115 ! regulation of organelle assembly
+is_a: GO:0120032 ! regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0071800 ! podosome assembly
 relationship: regulates GO:0071800 ! podosome assembly
@@ -414341,7 +414402,7 @@
 synonym: "inhibition of podosome assembly" NARROW [GOC:mah]
 is_a: GO:0031333 ! negative regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902116 ! negative regulation of organelle assembly
+is_a: GO:0120033 ! negative regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0071800 ! podosome assembly
 relationship: negatively_regulates GO:0071800 ! podosome assembly
@@ -414360,7 +414421,7 @@
 synonym: "upregulation of podosome assembly" EXACT [GOC:mah]
 is_a: GO:0031334 ! positive regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902117 ! positive regulation of organelle assembly
+is_a: GO:0120034 ! positive regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0071800 ! podosome assembly
 relationship: positively_regulates GO:0071800 ! podosome assembly
@@ -416412,7 +416473,6 @@
 namespace: biological_process
 def: "The directed movement of a phytochelatin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Phytochelatins are a group of peptides that bind metals (Cd, Zn, Cu, Pb, Hg) in thiolate coordination complexes." [GOC:mah, ISBN:0198506732]
 synonym: "cadystin transport" RELATED [GOC:vw, Wikipedia:Phytochelatin#History]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: mah
 creation_date: 2010-10-25T01:57:55Z
@@ -420147,7 +420207,6 @@
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "UDP-galactose membrane transport" EXACT []
 synonym: "UDP-galactose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: mah
 creation_date: 2010-11-03T02:03:36Z
@@ -428671,7 +428730,7 @@
 name: spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:28Z
 
@@ -428680,7 +428739,7 @@
 name: spermidine:coumaroyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a coumaroyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:59Z
 
@@ -428689,7 +428748,7 @@
 name: spermidine:caffeoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a caffeoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:23Z
 
@@ -428698,7 +428757,7 @@
 name: spermidine:feruloyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a feruloyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:50Z
 
@@ -428819,7 +428878,7 @@
 name: sinapoyl spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on a sinapoyl spermidine molecule resulting in the formation of a disinapoyl spermidine derivative." [PMID:19168716]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-22T03:27:55Z
 
@@ -428891,7 +428950,7 @@
 name: phosphatidylethanolamine-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidylethanolamine + a sterol = a sterol ester + a lysophosphatidylethanolamine." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:39:33Z
 
@@ -428900,7 +428959,7 @@
 name: phosphatidate-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidate + a sterol = a sterol ester + a lysophosphatidate." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:41:42Z
 
@@ -429183,8 +429242,6 @@
 namespace: biological_process
 def: "The directed movement of AMP, adenosine monophosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [PMID:18923018]
 synonym: "adenosine monophosphate transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 created_by: dhl
@@ -429478,7 +429535,7 @@
 id: GO:0080145
 name: intracellular cysteine homeostasis
 namespace: biological_process
-def: "A homeostatic process involved in the maintenance of a steady state level of cysteine within a cell." [PMID:19955263]
+def: "A homeostatic process involved in the maintenance of a steady state level of L-cysteine within a cell." [PMID:19955263]
 synonym: "cellular cysteine homeostasis" EXACT []
 synonym: "cysteine homeostasis" EXACT []
 is_a: GO:0080144 ! intracellular amino acid homeostasis
@@ -431835,7 +431892,6 @@
 name: L-histidine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-histidine across a membrane." [PMID:21307582]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -437284,7 +437340,7 @@
 def: "Catalysis of the reaction: an acyl-CoA + sn-glycerol 3-phosphate = CoA + a 2-acyl-sn-glycerol 3-phosphate." [RHEA:33559]
 xref: EC:2.3.1.198
 xref: RHEA:33559
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.198
 property_value: skos:exactMatch RHEA:33559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -437680,7 +437736,8 @@
 name: catecholamine uptake
 namespace: biological_process
 def: "The directed movement of catecholamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2012-10-17T11:06:17Z
 
@@ -437689,7 +437746,6 @@
 name: dopamine uptake
 namespace: biological_process
 def: "The directed movement of dopamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0090493 ! catecholamine uptake
 created_by: tb
 creation_date: 2012-10-17T11:12:09Z
@@ -440792,16 +440848,15 @@
 
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
 
@@ -447306,9 +447361,8 @@
 def: "The directed movement of L-arginine from outside of a cell, across the plasma membrane and into the cytosol." [GOC:krc, PMID:8195186]
 synonym: "arginine import" BROAD []
 synonym: "L-arginine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: tb
 creation_date: 2012-09-24T14:28:58Z
 
@@ -452547,7 +452601,8 @@
 namespace: cellular_component
 def: "A cell projection supported by an assembly of actin filaments, and which lacks microtubules." [PMID:15661519]
 is_a: GO:0120025 ! plasma membrane bounded cell projection
-relationship: has_part GO:0005884 ! actin filament
+relationship: part_of GO:0015629 ! actin cytoskeleton
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0098859
@@ -470120,22 +470175,27 @@
 
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
 
@@ -470412,7 +470472,7 @@
 name: peptide N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the acetylation of an amino acid residue of a peptide or protein, according to the reaction: succinyl-CoA + peptide = CoA + N-succinylpeptide." [PMID:29211711]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: hjd
 creation_date: 2017-12-15T18:23:58Z
 
@@ -471911,7 +471971,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-hydroxyisobutyryl-CoA + lysine in peptide = CoA + N-2-hydroxyisobutyryl-lysine-peptide." [GOC:sp, PMID:29775581]
 xref: RHEA:24180
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:24180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -471934,7 +471994,7 @@
 def: "Catalysis of the reaction: glutaryl-CoA + L-lysyl-[protein] = CoA + H+ + N6-glutaryl-L-lysyl-[protein]." [GOC:sp, PMID:31542297]
 xref: Reactome:R-HSA-9858590 "DLST transfers glutaryl to CoA"
 xref: RHEA:18009
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:18009
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -472372,7 +472432,7 @@
 xref: RHEA:37767
 xref: RHEA:37771
 xref: RHEA:37775
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n7
 property_value: skos:exactMatch RHEA:32995
 property_value: skos:narrowMatch RHEA:36015
@@ -472410,7 +472470,7 @@
 xref: RHEA:37571
 xref: RHEA:37735
 xref: RHEA:37739
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n6
 property_value: skos:exactMatch RHEA:33191
 property_value: skos:narrowMatch RHEA:37399
@@ -480186,7 +480246,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: L-glutaminyl-[protein] + serotonin = 5-serotonyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:14697203]
 xref: RHEA:66552
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66552
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480212,7 +480272,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: dopamine + L-glutaminyl-[protein] = 5-dopaminyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378, PMID:32273471]
 xref: RHEA:66556
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66556
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480238,7 +480298,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: (R)-noradrenaline + L-glutaminyl-[protein] = 5-(R)-noradrenalinyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378]
 xref: RHEA:66560
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66560
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480251,7 +480311,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: histamine + L-glutaminyl-[protein] = 5-histaminyl-L-glutamyl-[protein]." [GOC:sp, PMID:23022564, PMID:23797785]
 xref: RHEA:66564
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66564
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480267,7 +480327,7 @@
 synonym: "peptide lactyltransferase activity" BROAD []
 synonym: "peptide lactyltransferase activity (CoA-dependent)" BROAD []
 xref: RHEA:61996
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:61996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28015" xsd:anyURI
@@ -481947,7 +482007,7 @@
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
 creation_date: 2026-01-07T15:48:37Z
@@ -482029,7 +482089,6 @@
 is_a: GO:0042219 ! modified amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
-is_a: GO:1903184 ! L-dopa metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-6334
 property_value: skos:narrowMatch MetaCyc:PWY-8110
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
@@ -482640,13 +482699,14 @@
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
 
@@ -482772,7 +482832,7 @@
 def: "Catalysis of the reaction: crotonyl-CoA + lysine in peptide = CoA + N-crotonyl-lysine-peptide." [PMID:25818647]
 synonym: "protein crotonyltransferase activity" RELATED []
 xref: RHEA:53908
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53908
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -482785,7 +482845,7 @@
 def: "Catalysis of the reaction: butyryl-CoA + lysine in peptide = CoA + N-butyryl-lysine-peptide." [PMID:27105113]
 synonym: "protein butyryltransferase activity" RELATED []
 xref: RHEA:53912
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53912
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -484284,7 +484344,7 @@
 xref: RHEA:59800
 xref: RHEA:83531
 xref: RHEA:85279
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:53916
 property_value: skos:narrowMatch RHEA:59764
@@ -486538,7 +486598,6 @@
 name: cyclic-GMP-AMP transmembrane import across plasma membrane
 namespace: biological_process
 def: "The directed movement of cyclic-GMP-AMP from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31126740]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -487051,6 +487110,26 @@
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
@@ -487163,6 +487242,18 @@
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
@@ -487908,7 +487999,6 @@
 name: 5-aminolevulinic acid import across plasma membrane
 namespace: biological_process
 def: "The directed movement of 5-aminolevulinic acid from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31989647]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015718 ! monocarboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -491994,7 +492084,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-beta-L-arabinofuranose from the cytosol to the Golgi apparatus of a cell." [PMID:28373556]
 synonym: "cytosol to Golgi apparatus UDP-beta-L-arabinofuranose transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 is_a: GO:0140820 ! cytosol to Golgi apparatus transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21524" xsd:anyURI
@@ -493462,7 +493551,6 @@
 name: L-phenylalanine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of L-phenylalanine from outside of a cell, across the plasma membrane and into the cytosol." [PMID:11069779]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015823 ! phenylalanine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -496305,7 +496393,7 @@
 name: regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
+is_a: GO:1902531 ! regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496318,8 +496406,8 @@
 name: positive regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:14615391]
-is_a: GO:0010750 ! positive regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902533 ! positive regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496332,8 +496420,8 @@
 name: negative regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that decreases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010751 ! negative regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -501136,14 +501224,16 @@
 
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
 
@@ -502345,9 +502435,11 @@
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
@@ -502445,8 +502537,8 @@
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
@@ -502456,8 +502548,8 @@
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
@@ -502467,7 +502559,7 @@
 name: octopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of octopamine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:7770033 ! octopamine transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
@@ -502976,7 +503068,6 @@
 name: isopentenyl pyrophosphate import into mitochondrion
 namespace: biological_process
 def: "The process in which isopentenyl pyrophosphate is transported across a membrane into the mitochondrion." [GOC:ew, PMID:37813972]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0032365 ! intracellular lipid transport
 is_a: GO:0170036 ! import into the mitochondrion
@@ -520018,7 +520109,6 @@
 synonym: "deoxycarnitine transport" RELATED [GOC:TermGenie]
 synonym: "gamma-Butyrobetain transport" EXACT [GOC:TermGenie]
 synonym: "gamma-butyrobetaine transport" EXACT [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 created_by: jl
 creation_date: 2012-05-29T02:32:37Z
@@ -520049,7 +520139,6 @@
 synonym: "Adriamycin transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicine transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicinum transport" RELATED [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
@@ -525610,13 +525699,15 @@
 
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
 
@@ -537077,7 +537168,6 @@
 xref: MetaCyc:PWY-5103
 xref: MetaCyc:PWY-5104
 xref: MetaCyc:PWY-5108
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ILEUSYN-PWY
@@ -542412,7 +542502,6 @@
 name: L-lysine transport
 namespace: biological_process
 def: "The directed movement of a L-lysine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: kmv
 creation_date: 2013-03-27T16:09:06Z
@@ -542422,7 +542511,6 @@
 name: L-histidine transport
 namespace: biological_process
 def: "The directed movement of a L-histidine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015802 ! basic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -549014,7 +549102,6 @@
 name: ceramide 1-phosphate transport
 namespace: biological_process
 def: "The directed movement of a ceramide 1-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:TermGenie, PMID:23863933]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0035627 ! ceramide transport
 created_by: uh
@@ -551452,7 +551539,6 @@
 namespace: biological_process
 def: "The process in which 5'-adenylyl sulfate is transported across a membrane." [GOC:TermGenie, PMID:24296033]
 synonym: "adenosine 5'-phosphosulfate transmembrane transport" EXACT [PMID:24296033]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -555090,7 +555176,6 @@
 synonym: "6-sulfoquinovose(1-) breakdown" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) catabolism" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) degradation" EXACT [GOC:TermGenie]
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
 created_by: dph
@@ -563310,31 +563395,29 @@
 
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
 
@@ -563462,26 +563545,25 @@
 
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
@@ -563506,20 +563588,17 @@
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
@@ -563544,12 +563623,8 @@
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
 
@@ -564608,8 +564683,8 @@
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 is_a: GO:2000282 ! regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0019240 ! citrulline biosynthetic process
-relationship: regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:34Z
 
@@ -564646,8 +564721,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000283 ! negative regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: negatively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:46Z
 
@@ -564684,8 +564759,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000284 ! positive regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: positively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:52Z
 
@@ -573769,12 +573844,13 @@
 
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
 
@@ -575021,7 +575097,6 @@
 name: L-valine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-valine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:20944394]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015829 ! valine transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: al
@@ -575473,7 +575548,6 @@
 synonym: "isoleucine import" BROAD []
 synonym: "L-isoleucine import" BROAD []
 synonym: "L-isoleucine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903714 ! isoleucine transmembrane transport
@@ -575489,7 +575563,6 @@
 synonym: "L-threonine import" BROAD []
 synonym: "L-threonine import into cell" EXACT []
 synonym: "L-threonine uptake" EXACT [GOC:bf]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015826 ! threonine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -575535,7 +575608,6 @@
 synonym: "asparagine import" BROAD []
 synonym: "L-asparagine import into cell" EXACT []
 is_a: GO:0006867 ! asparagine transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903713 ! asparagine transmembrane transport
@@ -575796,10 +575868,10 @@
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
 
@@ -581520,7 +581592,7 @@
 synonym: "protein localisation in microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localisation to microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localization in microvillus" EXACT [GOC:TermGenie]
-is_a: GO:0008104 ! intracellular protein localization
+is_a: GO:1903119 ! protein localization to actin cytoskeleton
 created_by: kmv
 creation_date: 2015-04-01T18:14:41Z
 
@@ -590185,15 +590257,17 @@
 
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
 
@@ -591188,10 +591262,10 @@
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
 
@@ -591204,6 +591278,8 @@
 synonym: "protein localisation to actin fusion focus" EXACT [GOC:TermGenie]
 synonym: "protein localization in actin fusion focus" EXACT [GOC:TermGenie]
 is_a: GO:0015031 ! protein transport
+relationship: part_of GO:0000755 ! cytogamy
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-26T10:36:22Z
 
@@ -598910,6 +598986,7 @@
 synonym: "regulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0010155 ! regulation of proton transport
 is_a: GO:0022898 ! regulation of transmembrane transporter activity
+is_a: GO:0051341 ! regulation of oxidoreductase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0004129 ! cytochrome-c oxidase activity
 relationship: regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -599002,6 +599079,7 @@
 synonym: "upregulation of NADH cytochrome c oxidase" EXACT [GOC:TermGenie]
 synonym: "upregulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0032414 ! positive regulation of ion transmembrane transporter activity
+is_a: GO:0051353 ! positive regulation of oxidoreductase activity
 is_a: GO:1904959 ! regulation of cytochrome-c oxidase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -602559,7 +602637,6 @@
 name: carcinine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of carcinine from outside of a cell, across the plasma membrane and into the cytosol." [GO_REF:0000075, GOC:dph, GOC:TermGenie, PMID:26653853, PMID:26713872]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0098739 ! import across plasma membrane
@@ -606131,7 +606208,6 @@
 synonym: "sphingoid transport" RELATED []
 synonym: "sphingosine transport" NARROW []
 is_a: GO:0006869 ! lipid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2016-07-22T01:40:59Z
@@ -624842,7 +624918,6 @@
 alt_id: GO:0015788
 def: "The process in which UDP-N-acetylglucosamine is transported across a membrane." [PMID:10788474]
 synonym: "UDP-N-acetylglucosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: vw
 creation_date: 2014-11-27T11:56:35Z
@@ -624854,7 +624929,6 @@
 alt_id: GO:0015784
 def: "The process in which GDP-mannose is transported across a membrane." [PMID:9395539]
 synonym: "GDP-mannose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090480 ! purine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: vw
@@ -626604,10 +626678,12 @@
 
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
 
@@ -627333,7 +627409,7 @@
 id: GO:1990799
 name: mitochondrial tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:15509579]
+def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:15509579]
 is_a: GO:0002143 ! tRNA wobble position uridine thiolation
 is_a: GO:0070899 ! mitochondrial tRNA wobble uridine modification
 is_a: GO:0070903 ! mitochondrial tRNA thio-modification
@@ -627571,9 +627647,8 @@
 name: L-arginine transmembrane export from vacuole
 namespace: biological_process
 def: "The directed movement of L-arginine out of the vacuole, across the vacuolar membrane." [PMID:26083598]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0032974 ! amino acid transmembrane export from vacuole
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: vw
 creation_date: 2015-08-06T15:06:33Z
 
@@ -627581,13 +627656,14 @@
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
 
@@ -645257,7 +645333,6 @@
 name: N-methylnicotinate transport
 namespace: biological_process
 def: "The directed movement of a N-methylnicotinateacetate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:obol]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015697 ! quaternary ammonium group transport
 created_by: tb
 creation_date: 2011-10-18T05:16:08Z
@@ -648086,20 +648161,18 @@
 
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
@@ -648387,6 +648460,75 @@
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
