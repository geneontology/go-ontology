# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-06-27 06:38:51.949720942 +0000
+++ go.obo	2026-06-27 06:54:34.133661432 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-06-15
+data-version: releases/2026-06-27
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-06-15" xsd:string
+property_value: owl:versionInfo "2026-06-27" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -1109,9 +1109,9 @@
 synonym: "histidine synthesis" EXACT []
 xref: MetaCyc:HISTSYN-PWY
 xref: MetaCyc:PWY-5029
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 is_a: GO:0052803 ! imidazole-containing compound metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:HISTSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5029
@@ -2948,6 +2948,7 @@
 xref: RHEA:21724
 xref: RHEA:40775
 xref: RHEA:45784
+xref: RHEA:86867
 xref: UM-BBD_reactionID:r0377
 xref: UM-BBD_reactionID:r0701
 is_a: GO:0016815 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in nitriles
@@ -2955,6 +2956,7 @@
 property_value: skos:exactMatch RHEA:21724
 property_value: skos:narrowMatch RHEA:40775
 property_value: skos:narrowMatch RHEA:45784
+property_value: skos:narrowMatch RHEA:86867
 
 [Term]
 id: GO:0000258
@@ -4655,28 +4657,29 @@
 
 [Term]
 id: GO:0000433
-name: carbon catabolite repression of transcription from RNA polymerase II promoter by glucose
+name: obsolete carbon catabolite repression of transcription from RNA polymerase II promoter by glucose
 namespace: biological_process
-def: "A transcription regulation process in which the presence of glucose leads to a decrease in the frequency, rate, or extent of transcription of specific RNA polymerase II-transcribed genes involved in the metabolism of other carbon sources. Carbon catabolite repression is a mechanism of genetic regulation which the accumulation of catabolites of one substance in the cell represses the formation of enzymes that contribute to the catabolism of other substances." [GOC:krc]
+def: "OBSOLETE. A transcription regulation process in which the presence of glucose leads to a decrease in the frequency, rate, or extent of transcription of specific RNA polymerase II-transcribed genes involved in the metabolism of other carbon sources. Carbon catabolite repression is a mechanism of genetic regulation which the accumulation of catabolites of one substance in the cell represses the formation of enzymes that contribute to the catabolism of other substances." [GOC:krc]
+comment: The reason for obsoletion is that this term represents a GO-CAM model.
 synonym: "down regulation of transcription from RNA polymerase II promoter by glucose" EXACT []
 synonym: "down-regulation of transcription from RNA polymerase II promoter by glucose" EXACT []
 synonym: "downregulation of transcription from RNA polymerase II promoter by glucose" EXACT []
 synonym: "inhibition of transcription from RNA polymerase II promoter by glucose" NARROW []
-is_a: GO:0045014 ! carbon catabolite repression of transcription by glucose
-is_a: GO:0061987 ! negative regulation of transcription from RNA polymerase II promoter by glucose
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000434
-name: carbon catabolite repression of transcription from RNA polymerase II promoter by galactose
+name: obsolete carbon catabolite repression of transcription from RNA polymerase II promoter by galactose
 namespace: biological_process
-def: "Any process involving galactose that stops, prevents or reduces the rate of transcription from an RNA polymerase II promoter." [GOC:krc]
+def: "OBSOLETE. Any process involving galactose that stops, prevents or reduces the rate of transcription from an RNA polymerase II promoter." [GOC:krc]
+comment: The reason for obsoletion is that this represents a GO-CAM model.
 synonym: "down regulation of transcription from RNA polymerase II promoter by galactose" EXACT []
 synonym: "down-regulation of transcription from RNA polymerase II promoter by galactose" EXACT []
 synonym: "downregulation of transcription from RNA polymerase II promoter by galactose" EXACT []
 synonym: "inhibition of transcription from RNA polymerase II promoter by galactose" NARROW []
-is_a: GO:0000410 ! carbon catabolite repression of transcription by galactose
-is_a: GO:0000431 ! regulation of transcription from RNA polymerase II promoter by galactose
-is_a: GO:0000437 ! carbon catabolite repression of transcription from RNA polymerase II promoter
+property_value: term_tracker_item "The reason for obsoletion is that these terms represent GO-CAM models." xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000435
@@ -4704,13 +4707,13 @@
 
 [Term]
 id: GO:0000437
-name: carbon catabolite repression of transcription from RNA polymerase II promoter
+name: obsolete carbon catabolite repression of transcription from RNA polymerase II promoter
 namespace: biological_process
-def: "A transcription regulation process in which the presence of one carbon source leads to a decrease in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:krc]
+def: "OBSOLETE. A transcription regulation process in which the presence of one carbon source leads to a decrease in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:krc]
+comment: The reason for obsoletion is that this represents a GO-CAM model.
 synonym: "negative regulation of transcription from RNA polymerase II promoter by carbon catabolites" EXACT [GOC:mah]
-is_a: GO:0000122 ! negative regulation of transcription by RNA polymerase II
-is_a: GO:0000429 ! carbon catabolite regulation of transcription from RNA polymerase II promoter
-is_a: GO:0045013 ! carbon catabolite repression of transcription
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000438
@@ -8387,34 +8390,37 @@
 
 [Term]
 id: GO:0001079
-name: nitrogen catabolite regulation of transcription from RNA polymerase II promoter
+name: obsolete nitrogen catabolite regulation of transcription from RNA polymerase II promoter
 namespace: biological_process
-def: "A transcription regulation process in which the presence of one nitrogen source leads to the modulation of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+def: "OBSOLETE. A transcription regulation process in which the presence of one nitrogen source leads to the modulation of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+comment: The reason for obsoletion is that this represents a GO-CAM.
 synonym: "regulation of transcription from RNA polymerase II promoter by nitrogen catabolites" EXACT [GOC:mah]
-is_a: GO:0006357 ! regulation of transcription by RNA polymerase II
-is_a: GO:0090293 ! nitrogen catabolite regulation of transcription
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 created_by: krc
 creation_date: 2010-10-27T03:29:01Z
 
 [Term]
 id: GO:0001080
-name: nitrogen catabolite activation of transcription from RNA polymerase II promoter
+name: obsolete nitrogen catabolite activation of transcription from RNA polymerase II promoter
 namespace: biological_process
-def: "A transcription regulation process in which the presence of one nitrogen source leads to an increase in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+def: "OBSOLETE. A transcription regulation process in which the presence of one nitrogen source leads to an increase in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+comment: The reason for obsoletion is that this represents a GO-CAM.
 synonym: "positive regulation of transcription from RNA polymerase II promoter by nitrogen catabolites" EXACT [GOC:mah]
-is_a: GO:0001079 ! nitrogen catabolite regulation of transcription from RNA polymerase II promoter
-is_a: GO:0090294 ! nitrogen catabolite activation of transcription
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 created_by: krc
 creation_date: 2010-10-27T03:32:34Z
 
 [Term]
 id: GO:0001081
-name: nitrogen catabolite repression of transcription from RNA polymerase II promoter
+name: obsolete nitrogen catabolite repression of transcription from RNA polymerase II promoter
 namespace: biological_process
-def: "A transcription regulation process in which the presence of one nitrogen source leads to a decrease in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+def: "OBSOLETE. A transcription regulation process in which the presence of one nitrogen source leads to a decrease in the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other nitrogen sources." [GOC:mah, GOC:txnOH, PMID:19104072]
+comment: The reason for obsoletion is that this represents a GO-CAM.
 synonym: "negative regulation of transcription from RNA polymerase II promoter by nitrogen catabolites" EXACT [GOC:mah]
-is_a: GO:0001079 ! nitrogen catabolite regulation of transcription from RNA polymerase II promoter
-is_a: GO:0090295 ! nitrogen catabolite repression of transcription
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 created_by: krc
 creation_date: 2010-10-27T03:38:05Z
 
@@ -10610,9 +10616,13 @@
 namespace: biological_process
 def: "A metabolic pathway by which 3-methyl branched fatty acids are degraded. These compounds are not degraded by the normal peroxisomal beta-oxidation pathway, because the 3-methyl blocks the dehydrogenation of the hydroxyl group by hydroxyacyl-CoA dehydrogenase. The 3-methyl branched fatty acid is converted in several steps to pristenic acid, which can then feed into the beta-oxidative pathway." [PMID:10198260]
 xref: MetaCyc:PWY-2501
+xref: MetaCyc:PWY66-387
 xref: Reactome:R-HSA-389599 "Alpha-oxidation of phytanate"
 is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0019395 ! fatty acid oxidation
+property_value: skos:narrowMatch MetaCyc:PWY-2501
+property_value: skos:narrowMatch MetaCyc:PWY66-387
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
 
 [Term]
 id: GO:0001562
@@ -25759,6 +25769,7 @@
 namespace: biological_process
 def: "The progression of the trabecular meshwork over time, from its formation to the mature structure. The trabecular meshwork is a fenestrated endothelial-like tissue situated at the intersection of the cornea and the iris. The trabecular meshwork provides drainage for the aqueous humor." [PMID:20568247]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: hjd
 creation_date: 2012-04-19T04:50:06Z
@@ -35965,6 +35976,7 @@
 xref: RHEA:83083
 xref: RHEA:83095
 xref: RHEA:83099
+xref: RHEA:83127
 xref: RHEA:83135
 xref: RHEA:83219
 xref: RHEA:83251
@@ -35972,6 +35984,8 @@
 xref: RHEA:83367
 xref: RHEA:83383
 xref: RHEA:83399
+xref: RHEA:84311
+xref: RHEA:84391
 xref: RHEA:84447
 xref: RHEA:84451
 xref: RHEA:84455
@@ -35982,7 +35996,11 @@
 xref: RHEA:84707
 xref: RHEA:84711
 xref: RHEA:84715
+xref: RHEA:84835
 xref: RHEA:84839
+xref: RHEA:84903
+xref: RHEA:85327
+xref: RHEA:85331
 xref: UM-BBD_reactionID:r1051
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.16
@@ -36015,6 +36033,7 @@
 property_value: skos:narrowMatch RHEA:83083
 property_value: skos:narrowMatch RHEA:83095
 property_value: skos:narrowMatch RHEA:83099
+property_value: skos:narrowMatch RHEA:83127
 property_value: skos:narrowMatch RHEA:83135
 property_value: skos:narrowMatch RHEA:83219
 property_value: skos:narrowMatch RHEA:83251
@@ -36022,6 +36041,8 @@
 property_value: skos:narrowMatch RHEA:83367
 property_value: skos:narrowMatch RHEA:83383
 property_value: skos:narrowMatch RHEA:83399
+property_value: skos:narrowMatch RHEA:84311
+property_value: skos:narrowMatch RHEA:84391
 property_value: skos:narrowMatch RHEA:84447
 property_value: skos:narrowMatch RHEA:84451
 property_value: skos:narrowMatch RHEA:84455
@@ -36032,7 +36053,11 @@
 property_value: skos:narrowMatch RHEA:84707
 property_value: skos:narrowMatch RHEA:84711
 property_value: skos:narrowMatch RHEA:84715
+property_value: skos:narrowMatch RHEA:84835
 property_value: skos:narrowMatch RHEA:84839
+property_value: skos:narrowMatch RHEA:84903
+property_value: skos:narrowMatch RHEA:85327
+property_value: skos:narrowMatch RHEA:85331
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -36234,6 +36259,8 @@
 xref: RHEA:66232
 xref: RHEA:66236
 xref: RHEA:67212
+xref: RHEA:86619
+xref: RHEA:86699
 is_a: GO:0016634 ! oxidoreductase activity, acting on the CH-CH group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.3.3.6
 property_value: skos:exactMatch RHEA:38959
@@ -36253,6 +36280,8 @@
 property_value: skos:narrowMatch RHEA:66232
 property_value: skos:narrowMatch RHEA:66236
 property_value: skos:narrowMatch RHEA:67212
+property_value: skos:narrowMatch RHEA:86619
+property_value: skos:narrowMatch RHEA:86699
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -37069,6 +37098,7 @@
 xref: RHEA:12789
 xref: RHEA:37967
 xref: RHEA:59924
+xref: RHEA:59932
 is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
 property_value: skos:broadMatch EC:1.1.1.21
 property_value: skos:broadMatch MetaCyc:ALDEHYDE-REDUCTASE-RXN
@@ -37076,6 +37106,7 @@
 property_value: skos:exactMatch RHEA:12789
 property_value: skos:narrowMatch RHEA:37967
 property_value: skos:narrowMatch RHEA:59924
+property_value: skos:narrowMatch RHEA:59932
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27136" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27881" xsd:anyURI
 
@@ -37394,6 +37425,9 @@
 xref: RHEA:81115
 xref: RHEA:81119
 xref: RHEA:81123
+xref: RHEA:86755
+xref: RHEA:86759
+xref: RHEA:86767
 is_a: GO:0016811 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amides
 property_value: skos:exactMatch EC:3.5.1.14
 property_value: skos:exactMatch RHEA:15565
@@ -37439,6 +37473,9 @@
 property_value: skos:narrowMatch RHEA:81115
 property_value: skos:narrowMatch RHEA:81119
 property_value: skos:narrowMatch RHEA:81123
+property_value: skos:narrowMatch RHEA:86755
+property_value: skos:narrowMatch RHEA:86759
+property_value: skos:narrowMatch RHEA:86767
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -40149,13 +40186,19 @@
 xref: RHEA:49932
 xref: RHEA:77195
 xref: RHEA:83231
+xref: RHEA:84219
 xref: RHEA:84487
 xref: RHEA:84491
+xref: RHEA:84495
+xref: RHEA:84503
 xref: RHEA:84547
 xref: RHEA:84555
 xref: RHEA:84559
 xref: RHEA:84563
+xref: RHEA:84783
 xref: RHEA:84843
+xref: RHEA:84851
+xref: RHEA:84855
 is_a: GO:0016863 ! intramolecular oxidoreductase activity, transposing C=C bonds
 property_value: skos:exactMatch EC:5.3.3.8
 property_value: skos:exactMatch RHEA:45900
@@ -40176,13 +40219,19 @@
 property_value: skos:narrowMatch RHEA:49932
 property_value: skos:narrowMatch RHEA:77195
 property_value: skos:narrowMatch RHEA:83231
+property_value: skos:narrowMatch RHEA:84219
 property_value: skos:narrowMatch RHEA:84487
 property_value: skos:narrowMatch RHEA:84491
+property_value: skos:narrowMatch RHEA:84495
+property_value: skos:narrowMatch RHEA:84503
 property_value: skos:narrowMatch RHEA:84547
 property_value: skos:narrowMatch RHEA:84555
 property_value: skos:narrowMatch RHEA:84559
 property_value: skos:narrowMatch RHEA:84563
+property_value: skos:narrowMatch RHEA:84783
 property_value: skos:narrowMatch RHEA:84843
+property_value: skos:narrowMatch RHEA:84851
+property_value: skos:narrowMatch RHEA:84855
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21637" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -45634,11 +45683,13 @@
 xref: Reactome:R-HSA-8868648 "SYNJ hydrolyze PI(4,5)P2 to PI(4)P"
 xref: RHEA:22764
 xref: RHEA:43576
+xref: RHEA:86551
 is_a: GO:0034595 ! phosphatidylinositol phosphate 5-phosphatase activity
 is_a: GO:0106019 ! phosphatidylinositol-4,5-bisphosphate phosphatase activity
 property_value: skos:exactMatch EC:3.1.3.36
 property_value: skos:exactMatch RHEA:22764
 property_value: skos:narrowMatch RHEA:43576
+property_value: skos:narrowMatch RHEA:86551
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -47058,7 +47109,7 @@
 xref: Reactome:R-HSA-5602186 "Defective CYP27B1 does not hydroxylate CDL"
 xref: RHEA:20573
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.15.18
 property_value: skos:exactMatch RHEA:20573
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -47294,6 +47345,7 @@
 xref: RHEA:46104
 xref: RHEA:84067
 xref: RHEA:84071
+xref: RHEA:86455
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.15.4
@@ -47302,6 +47354,7 @@
 property_value: skos:narrowMatch RHEA:46104
 property_value: skos:narrowMatch RHEA:84067
 property_value: skos:narrowMatch RHEA:84071
+property_value: skos:narrowMatch RHEA:86455
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -47338,6 +47391,8 @@
 xref: RHEA:50244
 xref: RHEA:65760
 xref: RHEA:84243
+xref: RHEA:84247
+xref: RHEA:84251
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.19
@@ -47350,6 +47405,8 @@
 property_value: skos:narrowMatch RHEA:50236
 property_value: skos:narrowMatch RHEA:50244
 property_value: skos:narrowMatch RHEA:84243
+property_value: skos:narrowMatch RHEA:84247
+property_value: skos:narrowMatch RHEA:84251
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27671" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29041" xsd:anyURI
@@ -60066,6 +60123,8 @@
 xref: RHEA:45256
 xref: RHEA:45264
 xref: RHEA:71395
+xref: RHEA:86475
+xref: RHEA:86483
 is_a: GO:0015245 ! fatty acid transmembrane transporter activity
 relationship: part_of GO:0015909 ! long-chain fatty acid transport
 property_value: skos:exactMatch RHEA:39283
@@ -60075,6 +60134,8 @@
 property_value: skos:narrowMatch RHEA:45256
 property_value: skos:narrowMatch RHEA:45264
 property_value: skos:narrowMatch RHEA:71395
+property_value: skos:narrowMatch RHEA:86475
+property_value: skos:narrowMatch RHEA:86483
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14793" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26996" xsd:anyURI
@@ -60487,25 +60548,49 @@
 id: GO:0005366
 name: myo-inositol:proton symporter activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: myo-inositol(out) + H+(out) = myo-inositol(in) + H+(in)." [TC:2.A.1.1.8]
+def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: myo-inositol(out) + H+(out) = myo-inositol(in) + H+(in)." [RHEA:60364]
 synonym: "hydrogen/myo-inositol transporter activity" BROAD []
 synonym: "myo-inositol:hydrogen symporter activity" EXACT []
 xref: Reactome:R-HSA-429101 "HMIT co-transports myo-inositol with a proton"
 xref: RHEA:60364
+xref: TC:2.A.1.1.20
+xref: TC:2.A.1.1.25
+xref: TC:2.A.1.1.26
+xref: TC:2.A.1.1.27
+xref: TC:2.A.1.1.62
+xref: TC:2.A.1.1.63
+xref: TC:2.A.1.1.8
 is_a: GO:0005365 ! myo-inositol transmembrane transporter activity
 is_a: GO:0015295 ! solute:proton symporter activity
 property_value: skos:exactMatch RHEA:60364
+property_value: skos:narrowMatch TC:2.A.1.1.20
+property_value: skos:narrowMatch TC:2.A.1.1.25
+property_value: skos:narrowMatch TC:2.A.1.1.26
+property_value: skos:narrowMatch TC:2.A.1.1.27
+property_value: skos:narrowMatch TC:2.A.1.1.62
+property_value: skos:narrowMatch TC:2.A.1.1.63
+property_value: skos:narrowMatch TC:2.A.1.1.8
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32214" xsd:anyURI
 
 [Term]
 id: GO:0005367
 name: myo-inositol:sodium symporter activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: myo-inositol(out) + Na+(out) = myo-inositol(in) + Na+(in)." [TC:2.A.21.4.-]
+def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: myo-inositol(out) + Na+(out) = myo-inositol(in) + Na+(in)." [RHEA:72987]
 synonym: "myo-inositol-sodium cotransporter activity" BROAD []
 xref: Reactome:R-HSA-429663 "SLC5A3 (SMIT1) transports myo-inositol (Ins) with Na+ from extracellular region to cytosol"
+xref: RHEA:72987
+xref: TC:2.A.21.3.14
+xref: TC:2.A.21.3.5
+xref: TC:2.A.21.3.6
 is_a: GO:0005365 ! myo-inositol transmembrane transporter activity
 is_a: GO:0015370 ! solute:sodium symporter activity
+property_value: skos:exactMatch RHEA:72987
+property_value: skos:narrowMatch TC:2.A.21.3.14
+property_value: skos:narrowMatch TC:2.A.21.3.5
+property_value: skos:narrowMatch TC:2.A.21.3.6
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32214" xsd:anyURI
 
 [Term]
 id: GO:0005368
@@ -71887,7 +71972,7 @@
 xref: MetaCyc:PWY-8187
 xref: MetaCyc:PWY0-823
 is_a: GO:0006525 ! arginine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ARG-GLU-PWY
 property_value: skos:narrowMatch MetaCyc:ARG-PRO-PWY
@@ -71942,7 +72027,7 @@
 synonym: "asparagine degradation" EXACT []
 xref: MetaCyc:ASPARAGINE-DEG1-PWY
 xref: MetaCyc:PWY-4002
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARAGINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-4002
@@ -71985,8 +72070,8 @@
 xref: MetaCyc:PWY-8291
 xref: MetaCyc:PWY-8294
 is_a: GO:0006531 ! aspartate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARTATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8291
@@ -72069,8 +72154,8 @@
 xref: MetaCyc:PWY-5766
 xref: MetaCyc:PWY0-1305
 is_a: GO:0006536 ! glutamate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTDEG-PWY
@@ -72109,7 +72194,6 @@
 xref: MetaCyc:PWY-8346
 is_a: GO:0006105 ! succinate metabolic process
 is_a: GO:0006536 ! glutamate metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:GLUDEG-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8346
@@ -72124,7 +72208,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving glutamine, 2-amino-4-carbamoylbutanoic acid." [GOC:ai]
 synonym: "glutamine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72154,7 +72237,7 @@
 xref: MetaCyc:GLUTAMINDEG-PWY
 xref: MetaCyc:GLUTAMINEFUM-PWY
 is_a: GO:0006541 ! L-glutamine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMINDEG-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTAMINEFUM-PWY
@@ -72241,9 +72324,9 @@
 xref: MetaCyc:PWY-5030
 xref: MetaCyc:PWY-5031
 xref: Reactome:R-HSA-70921 "Histidine catabolism"
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
 is_a: GO:0052805 ! imidazole-containing compound catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:HISDEG-PWY
 property_value: skos:narrowMatch MetaCyc:HISHP-PWY
@@ -72280,7 +72363,6 @@
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ILEUDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5078
@@ -72296,7 +72378,6 @@
 synonym: "L-leucine metabolism" EXACT []
 synonym: "leucine metabolic process" BROAD []
 is_a: GO:0009081 ! branched-chain amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72317,7 +72398,6 @@
 xref: MetaCyc:PWY-8185
 is_a: GO:0006551 ! L-leucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LEU-DEG2-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5075
@@ -72364,7 +72444,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
 is_a: GO:0000096 ! sulfur amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 
@@ -72431,8 +72510,8 @@
 xref: MetaCyc:PWY-6318
 xref: MetaCyc:PWY-7158
 xref: MetaCyc:PWY-8014
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ANAPHENOXI-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5079
@@ -72449,7 +72528,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving proline (pyrrolidine-2-carboxylic acid), a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
 synonym: "proline metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72479,7 +72557,7 @@
 xref: MetaCyc:PWY-8186
 xref: Reactome:R-HSA-70688 "Proline catabolism"
 is_a: GO:0006560 ! L-proline metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PROUT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8186
@@ -72493,7 +72571,6 @@
 def: "The chemical reactions and pathways involving L-serine, the L-enantiomer of serine, i.e. (2S)-2-amino-3-hydroxypropanoic acid." [GOC:ai, GOC:jsg]
 synonym: "L-serine metabolism" EXACT []
 xref: Reactome:R-HSA-977347 "Serine metabolism"
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72509,7 +72586,6 @@
 xref: MetaCyc:SERSYN-PWY
 is_a: GO:0006563 ! L-serine metabolic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-8011
 property_value: skos:narrowMatch MetaCyc:SERSYN-PWY
@@ -72525,7 +72601,7 @@
 synonym: "L-serine degradation" EXACT []
 xref: MetaCyc:SERDEG-PWY
 is_a: GO:0006563 ! L-serine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:exactMatch MetaCyc:SERDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
@@ -72540,7 +72616,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "threonine metabolism" EXACT []
 xref: UM-BBD_pathwayID:met
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72558,7 +72633,7 @@
 xref: MetaCyc:THREONINE-DEG2-PWY
 xref: UM-BBD_pathwayID:met
 is_a: GO:0006566 ! L-threonine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5436
 property_value: skos:narrowMatch MetaCyc:PWY-5437
@@ -72608,9 +72683,9 @@
 xref: MetaCyc:TRYPDEG-PWY
 xref: MetaCyc:TRYPTOPHAN-DEGRADATION-1
 xref: Reactome:R-HSA-71240 "Tryptophan catabolism"
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
 is_a: GO:0042436 ! indole-containing compound catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-3162
 property_value: skos:narrowMatch MetaCyc:PWY-3181
@@ -72679,8 +72754,8 @@
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
 xref: UM-BBD_pathwayID:tyr
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5151
 property_value: skos:narrowMatch MetaCyc:PWY-7514
@@ -72716,7 +72791,6 @@
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5057
 property_value: skos:narrowMatch MetaCyc:PWY-8183
@@ -72945,7 +73019,7 @@
 synonym: "ornithine catabolism" EXACT []
 synonym: "ornithine degradation" EXACT []
 is_a: GO:0006591 ! ornithine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
@@ -73654,13 +73728,19 @@
 name: phosphatidic acid biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of phosphatidic acid, any derivative of glycerol phosphate in which both the remaining hydroxyl groups of the glycerol moiety are esterified with fatty acids." [ISBN:0198506732]
+synonym: "phosphatidate biosynthesis" EXACT []
 synonym: "phosphatidic acid anabolism" EXACT []
 synonym: "phosphatidic acid biosynthesis" EXACT []
 synonym: "phosphatidic acid formation" EXACT []
 synonym: "phosphatidic acid synthesis" EXACT []
+xref: MetaCyc:PWY-7039
+xref: MetaCyc:PWY-7411
 xref: Reactome:R-HSA-1483166 "Synthesis of PA"
 is_a: GO:0046473 ! phosphatidic acid metabolic process
 is_a: GO:0046474 ! glycerophospholipid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-7039
+property_value: skos:narrowMatch MetaCyc:PWY-7411
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32250" xsd:anyURI
 
 [Term]
 id: GO:0006655
@@ -76330,19 +76410,19 @@
 alt_id: GO:0016193
 alt_id: GO:0016196
 alt_id: GO:0098701
-def: "A vesicle-mediated transport process in which cells take up external materials or membrane constituents by the invagination of a part of the plasma membrane to form a new membrane-bounded vesicle." [GOC:mah, ISBN:0198506732, ISBN:0716731363, Wikipedia:Endocytosis]
+def: "A cellular process in which cells take up external materials or membrane constituents by the invagination of a part of the plasma membrane to form a new membrane-bounded vesicle." [GOC:mah, ISBN:0198506732, ISBN:0716731363, Wikipedia:Endocytosis]
 subset: goslim_yeast
 synonym: "endocytic import into cell" EXACT []
 synonym: "nonselective vesicle endocytosis" RELATED []
 synonym: "plasma membrane invagination" NARROW []
 synonym: "vesicle endocytosis" EXACT []
 xref: Wikipedia:Endocytosis
-is_a: GO:0016192 ! vesicle-mediated transport
 is_a: GO:0098657 ! import into cell
 relationship: has_part GO:0006900 ! vesicle budding from membrane
 relationship: has_part GO:0010324 ! membrane invagination
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24907" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25268" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30667" xsd:anyURI
 
 [Term]
 id: GO:0006898
@@ -80694,49 +80774,57 @@
 
 [Term]
 id: GO:0007315
-name: pole plasm assembly
+name: germ plasm assembly
 namespace: biological_process
 alt_id: GO:0048113
-def: "Establishment of the specialized cytoplasm found at the poles of the egg. An example of this is found in Drosophila melanogaster." [GOC:mtg_sensu]
+def: "The aggregation, arrangement and bonding together of a set of components to form the germ plasm, the differentiated cytoplasm associated with an oocyte, egg or early embryo that will be inherited by the cells that will give rise to the germ line." [GOC:mtg_sensu]
+synonym: "pole plasm assembly" RELATED []
 is_a: GO:0007028 ! cytoplasm organization
 is_a: GO:0022607 ! cellular component assembly
 relationship: part_of GO:0007314 ! oocyte anterior/posterior axis specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0007316
-name: pole plasm RNA localization
+name: germ plasm RNA localization
 namespace: biological_process
 alt_id: GO:0048116
-def: "Any process in which RNA is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [GOC:ai]
-synonym: "establishment and maintenance of pole plasm RNA localization" EXACT []
-synonym: "oocyte pole plasm RNA localization" EXACT []
-synonym: "pole plasm RNA localisation" EXACT [GOC:mah]
+def: "Any process in which RNA is transported to, or maintained in, the germ plasm." [GOC:ai]
+synonym: "establishment and maintenance of germ plasm RNA localization" EXACT []
+synonym: "germ plasm RNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm RNA localization" RELATED []
+synonym: "pole plasm RNA localization" RELATED []
 is_a: GO:0006403 ! RNA localization
-relationship: part_of GO:0007315 ! pole plasm assembly
+relationship: part_of GO:0007315 ! germ plasm assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0007317
-name: regulation of pole plasm oskar mRNA localization
+name: regulation of germ plasm oskar mRNA localization
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of the process in which oskar mRNA is transported to, or maintained in, the oocyte pole plasm." [GOC:hb]
-synonym: "regulation of oocyte pole plasm oskar mRNA localization" EXACT []
-synonym: "regulation of pole plasm oskar mRNA localisation" EXACT [GOC:mah]
+def: "Any process that modulates the frequency, rate or extent of the process in which oskar mRNA is transported to, or maintained in, the germ plasm." [GOC:hb]
+synonym: "regulation of germ plasm oskar mRNA localisation" EXACT [GOC:mah]
+synonym: "regulation of oocyte pole plasm oskar mRNA localization" RELATED []
+synonym: "regulation of pole plasm oskar mRNA localization" RELATED []
 is_a: GO:1904580 ! regulation of intracellular mRNA localization
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0045451 ! pole plasm oskar mRNA localization
-relationship: regulates GO:0045451 ! pole plasm oskar mRNA localization
+intersection_of: regulates GO:0045451 ! germ plasm oskar mRNA localization
+relationship: regulates GO:0045451 ! germ plasm oskar mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0007318
-name: pole plasm protein localization
+name: germ plasm protein localization
 namespace: biological_process
 alt_id: GO:0048115
-def: "Any process in which a protein is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [GOC:ai]
-synonym: "establishment and maintenance of pole plasm protein localization" EXACT []
-synonym: "oocyte pole plasm protein localization" EXACT []
-synonym: "pole plasm protein localisation" EXACT [GOC:mah]
+def: "Any process in which a protein is transported to, or maintained in, the germ plasm." [GOC:ai]
+synonym: "establishment and maintenance of germ plasm protein localization" EXACT []
+synonym: "germ plasm protein localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm protein localization" RELATED []
+synonym: "pole plasm protein localization" RELATED []
 is_a: GO:0008104 ! intracellular protein localization
-relationship: part_of GO:0007315 ! pole plasm assembly
+relationship: part_of GO:0007315 ! germ plasm assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0007319
@@ -81373,6 +81461,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ectoderm over time, from its formation to the mature structure. In animal embryos, the ectoderm is the outer germ layer of the embryo, formed during gastrulation." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007399
@@ -82136,6 +82225,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endoderm over time, from its formation to the mature structure. The endoderm is the innermost germ layer that develops into the gastrointestinal tract, the lungs and associated tissues." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007493
@@ -82186,6 +82276,7 @@
 def: "The process whose specific outcome is the progression of the mesoderm over time, from its formation to the mature structure. The mesoderm is the middle germ layer that develops into muscle, bone, cartilage, blood and connective tissue." [GOC:dph, GOC:tb]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007499
@@ -82222,6 +82313,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the digestive tract mesoderm over time, from its formation to the mature structure. The digestive tract mesoderm is portion of the middle layer of the three primary germ layers of the embryo which will go on to form part of the digestive tract of the organism." [GOC:ai]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007498 ! mesoderm development
 relationship: part_of GO:0048565 ! digestive tract development
 
@@ -82268,7 +82360,6 @@
 xref: Wikipedia:Heart_development
 is_a: GO:0048513 ! animal organ development
 relationship: part_of GO:0072359 ! circulatory system development
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0007508
@@ -90354,6 +90445,7 @@
 def: "The process whose specific outcome is the progression of the epidermis over time, from its formation to the mature structure. The epidermis is the outer epithelial layer of an animal, it may be a single layer that produces an extracellular material (e.g. the cuticle of arthropods) or a complex stratified squamous epithelium, as in the case of many vertebrate species." [GOC:curators, UBERON:0001003]
 synonym: "hypodermis development" RELATED [GOC:kmv, GOC:rk]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0008545
@@ -98443,7 +98535,7 @@
 synonym: "aspartate family amino acid biosynthesis" EXACT []
 synonym: "aspartate family amino acid formation" EXACT []
 synonym: "aspartate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98593,7 +98685,7 @@
 synonym: "pyruvate family amino acid biosynthesis" EXACT []
 synonym: "pyruvate family amino acid formation" EXACT []
 synonym: "pyruvate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
@@ -98654,7 +98746,7 @@
 synonym: "glutamine family amino acid biosynthesis" EXACT []
 synonym: "glutamine family amino acid formation" EXACT []
 synonym: "glutamine family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98716,7 +98808,7 @@
 xref: UM-BBD_pathwayID:met
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006555 ! L-methionine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:METHIONINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5082
@@ -98769,8 +98861,8 @@
 synonym: "homoserine formation" EXACT []
 synonym: "homoserine synthesis" EXACT []
 xref: MetaCyc:HOMOSERSYN-PWY
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009092 ! L-homoserine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:exactMatch MetaCyc:HOMOSERSYN-PWY
 
@@ -98794,7 +98886,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving homoserine, alpha-amino-gamma-hydroxybutyric acid, an intermediate in the biosynthesis of cystathionine, threonine and methionine." [ISBN:0198506732]
 synonym: "homoserine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -105955,7 +106046,6 @@
 xref: Reactome:R-HSA-5619507 "Activation of HOX genes during differentiation"
 xref: Wikipedia:Embryogenesis
 is_a: GO:0007275 ! multicellular organism development
-is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009791
@@ -105973,6 +106063,7 @@
 def: "The process whose specific outcome is the progression of an embryo over time, from zygote formation until the end of the embryonic life stage. The end of the embryonic life stage is organism-specific and may be somewhat arbitrary; for mammals it is usually considered to be birth, for insects the hatching of the first instar larva from the eggshell." [GOC:curators, GOC:isa_complete, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009793
@@ -105981,7 +106072,6 @@
 def: "The process whose specific outcome is the progression of the embryo over time, from zygote formation to the end of seed dormancy. An example of this process is found in Arabidopsis thaliana." [GOC:curators, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -106943,7 +107033,7 @@
 synonym: "histogenesis" EXACT []
 synonym: "histogenesis and organogenesis" BROAD []
 xref: Wikipedia:Histogenesis
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 
 [Term]
 id: GO:0009889
@@ -107795,7 +107885,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endosperm over time, from its formation to the mature structure. The endosperm is formed during fertilization and provides nutrients to the developing embryo." [GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -109122,7 +109211,6 @@
 def: "The process whose specific outcome is the progression of phloem and/or xylem over time, from formation to the mature structure. An example of this process is found in Arabidopsis thaliana." [GOC:mtg_sensu, GOC:tb]
 synonym: "vascular tissue development" BROAD []
 synonym: "vascular tissue histogenesis" EXACT []
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -109217,7 +109305,6 @@
 name: suspensor development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the suspensor over time, from its formation to the mature structure. The suspensor is the extension at the base of the embryo that anchors the embryo in the embryo sac and pushes it into the endosperm." [GOC:tb, ISBN:0471245208]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -110409,7 +110496,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the seed coat over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -110804,7 +110890,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the floral nectaries over time, from its formation to the mature structure." [GOC:lr]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
@@ -113023,7 +113108,6 @@
 name: stele development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stele over time, from its formation to the mature structure. The stele is the central column of primary vascular tissue in the root and any tissue that it surrounds." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
@@ -116870,7 +116954,6 @@
 name: stipule development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stipule over time, from its formation to the mature structure. A stipule is one of (usually) a pair of appendages at the bases of leaves in many broad-leaved angiosperms." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048366 ! leaf development
 
@@ -118635,6 +118718,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the morula over time. The morula is a spherical embryonic mass of blastomeres formed before the blastula and resulting from cleavage of the fertilized ovum." [PMID:37935903, PMID:38386558, PMID:39361745]
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29162" xsd:anyURI
 created_by: pg
 creation_date: 2024-11-12T09:13:07Z
@@ -127050,7 +127134,9 @@
 synonym: "N-acetyl-D-glucosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylchitosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylglucosamine permease activity" RELATED []
+xref: RHEA:86427
 is_a: GO:1901505 ! carbohydrate derivative transmembrane transporter activity
+property_value: skos:narrowMatch RHEA:86427
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 
@@ -130884,8 +130970,15 @@
 synonym: "CDP-diacylglycerol biosynthesis" EXACT []
 synonym: "CDP-diacylglycerol formation" EXACT []
 synonym: "CDP-diacylglycerol synthesis" EXACT []
+xref: MetaCyc:PWY-5667
+xref: MetaCyc:PWY-5981
+xref: MetaCyc:PWY0-1319
 is_a: GO:0046341 ! CDP-diacylglycerol metabolic process
 is_a: GO:0046474 ! glycerophospholipid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-5667
+property_value: skos:narrowMatch MetaCyc:PWY-5981
+property_value: skos:narrowMatch MetaCyc:PWY0-1319
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32250" xsd:anyURI
 
 [Term]
 id: GO:0016025
@@ -133453,8 +133546,8 @@
 synonym: "selenocysteine synthesis" EXACT []
 xref: MetaCyc:PWY-6281
 xref: MetaCyc:PWY0-901
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0042398 ! modified amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6281
 property_value: skos:narrowMatch MetaCyc:PWY0-901
@@ -133469,8 +133562,8 @@
 synonym: "selenocysteine catabolic process" EXACT []
 synonym: "selenocysteine catabolism" EXACT []
 synonym: "selenocysteine degradation" EXACT []
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 
 [Term]
@@ -146940,7 +147033,6 @@
 xref: RESID:AA0029
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -146953,7 +147045,6 @@
 xref: RESID:AA0030
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -151701,11 +151792,13 @@
 xref: MetaCyc:HALOALKANE-DEHALOGENASE-RXN
 xref: RHEA:19081
 xref: RHEA:25185
+xref: RHEA:67720
 xref: UM-BBD_enzymeID:r0001
 is_a: GO:0019120 ! hydrolase activity, acting on halide bonds, in C-halide compounds
 property_value: skos:exactMatch EC:3.8.1.5
 property_value: skos:exactMatch RHEA:19081
 property_value: skos:narrowMatch RHEA:25185
+property_value: skos:narrowMatch RHEA:67720
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -152057,6 +152150,7 @@
 xref: RHEA:84407
 xref: RHEA:84627
 xref: RHEA:84631
+xref: RHEA:84655
 xref: RHEA:84659
 xref: RHEA:84663
 xref: RHEA:84667
@@ -152114,6 +152208,7 @@
 property_value: skos:narrowMatch RHEA:84407
 property_value: skos:narrowMatch RHEA:84627
 property_value: skos:narrowMatch RHEA:84631
+property_value: skos:narrowMatch RHEA:84655
 property_value: skos:narrowMatch RHEA:84659
 property_value: skos:narrowMatch RHEA:84663
 property_value: skos:narrowMatch RHEA:84667
@@ -155138,51 +155233,60 @@
 
 [Term]
 id: GO:0019094
-name: pole plasm mRNA localization
+name: germ plasm mRNA localization
 namespace: biological_process
 alt_id: GO:0048120
-def: "Any process in which mRNA is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [GOC:ai]
-synonym: "establishment and maintenance of mRNA localization in pole plasm" EXACT []
-synonym: "establishment and maintenance of pole plasm mRNA localization" EXACT []
-synonym: "oocyte pole plasm mRNA localization" EXACT []
+def: "Any process in which mRNA is transported to, or maintained in, the germ plasm." [GOC:ai]
+synonym: "establishment and maintenance of germ plasm mRNA localization" EXACT []
+synonym: "establishment and maintenance of mRNA localization in pole plasm" RELATED []
+synonym: "establishment and maintenance of pole plasm mRNA localization" RELATED []
+synonym: "germ plasm mRNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm mRNA localization" RELATED []
 synonym: "pole granule RNA localization" BROAD []
-synonym: "pole plasm mRNA localisation" EXACT [GOC:mah]
-is_a: GO:0007316 ! pole plasm RNA localization
+synonym: "pole plasm mRNA localization" RELATED []
+is_a: GO:0007316 ! germ plasm RNA localization
 is_a: GO:0060811 ! intracellular mRNA localization involved in anterior/posterior axis specification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0019095
-name: pole plasm mitochondrial rRNA localization
+name: germ plasm mitochondrial rRNA localization
 namespace: biological_process
 alt_id: GO:0048117
-def: "Any process in which mitochondrial ribosomal RNA is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [ISBN:0879694238]
-synonym: "establishment and maintenance of mitochondrial rRNA localization in pole plasm" EXACT []
-synonym: "oocyte pole plasm mitochondrial rRNA localization" EXACT []
-synonym: "pole plasm mitochondrial rRNA localisation" EXACT [GOC:mah]
-is_a: GO:0007316 ! pole plasm RNA localization
+def: "Any process in which mitochondrial ribosomal RNA is transported to, or maintained in, the germ plasm." [ISBN:0879694238]
+synonym: "establishment and maintenance of mitochondrial rRNA localization in pole plasm" RELATED []
+synonym: "germ plasm mitochondrial rRNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm mitochondrial rRNA localization" RELATED []
+synonym: "pole plasm mitochondrial rRNA localization" RELATED []
+is_a: GO:0007316 ! germ plasm RNA localization
 is_a: GO:0019093 ! mitochondrial RNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0019096
-name: pole plasm mitochondrial lrRNA localization
+name: germ plasm mitochondrial lrRNA localization
 namespace: biological_process
 alt_id: GO:0048118
-def: "Any process in which mitochondrial large ribosomal RNA is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [ISBN:0879694238]
-synonym: "establishment and maintenance of mitochondrial lrRNA localization in pole plasm" EXACT []
-synonym: "oocyte pole plasm mitochondrial lrRNA localization" EXACT []
-synonym: "pole plasm mitochondrial lrRNA localisation" EXACT [GOC:mah]
-is_a: GO:0019095 ! pole plasm mitochondrial rRNA localization
+def: "Any process in which mitochondrial large ribosomal RNA is transported to, or maintained in, the germ plasm." [ISBN:0879694238]
+synonym: "establishment and maintenance of mitochondrial lrRNA localization in pole plasm" RELATED []
+synonym: "germ plasm mitochondrial lrRNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm mitochondrial lrRNA localization" RELATED []
+synonym: "pole plasm mitochondrial lrRNA localization" RELATED []
+is_a: GO:0019095 ! germ plasm mitochondrial rRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0019097
-name: pole plasm mitochondrial srRNA localization
+name: germ plasm mitochondrial srRNA localization
 namespace: biological_process
 alt_id: GO:0048119
-def: "Any process in which mitochondrial small ribosomal RNA is transported to, or maintained in, the oocyte pole plasm. An example of this is found in Drosophila melanogaster." [ISBN:0879694238]
-synonym: "establishment and maintenance of mitochondrial localization in pole plasm" EXACT []
-synonym: "oocyte pole plasm mitochondrial srRNA localization" EXACT []
-synonym: "pole plasm mitochondrial srRNA localisation" EXACT [GOC:mah]
-is_a: GO:0019095 ! pole plasm mitochondrial rRNA localization
+def: "Any process in which mitochondrial small ribosomal RNA is transported to, or maintained in, the germ plasm." [ISBN:0879694238]
+synonym: "establishment and maintenance of mitochondrial localization in pole plasm" RELATED []
+synonym: "germ plasm mitochondrial srRNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm mitochondrial srRNA localization" RELATED []
+synonym: "pole plasm mitochondrial srRNA localization" RELATED []
+is_a: GO:0019095 ! germ plasm mitochondrial rRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0019098
@@ -158219,7 +158323,6 @@
 xref: MetaCyc:PWY-I9
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:CYSTSYN-PWY
 property_value: skos:narrowMatch MetaCyc:HOMOCYSDEGR-PWY
@@ -158258,7 +158361,6 @@
 xref: Reactome:R-HSA-1614603 "Cysteine formation from homocysteine"
 xref: Wikipedia:Transsulfuration_pathway
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -159469,7 +159571,7 @@
 xref: MetaCyc:LCYSDEG-PWY
 xref: MetaCyc:PWY-5329
 is_a: GO:0000098 ! sulfur amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:CYSTEINE-DEG-PWY
 property_value: skos:narrowMatch MetaCyc:LCYSDEG-PWY
@@ -159730,8 +159832,8 @@
 synonym: "4-hydroxyproline degradation" EXACT []
 xref: MetaCyc:HYDROXYPRODEG-PWY
 xref: MetaCyc:PWY-5159
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:HYDROXYPRODEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5159
@@ -159835,7 +159937,7 @@
 xref: MetaCyc:PWY-6328
 xref: MetaCyc:PWY0-461
 xref: MetaCyc:PWY66-425
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LYSDEGII-PWY
 property_value: skos:narrowMatch MetaCyc:LYSINE-DEG1-PWY
@@ -159861,7 +159963,6 @@
 synonym: "D-amino acid catabolism" EXACT []
 synonym: "D-amino acid degradation" EXACT []
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0046416 ! D-amino acid metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 
 [Term]
@@ -160175,8 +160276,8 @@
 xref: MetaCyc:P561-PWY
 xref: MetaCyc:PWY-8109
 is_a: GO:0006579 ! amino-acid betaine catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009822 ! alkaloid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:P561-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8109
@@ -161637,7 +161738,6 @@
 synonym: "short-chain fatty acid breakdown" EXACT []
 synonym: "short-chain fatty acid catabolism" EXACT []
 synonym: "short-chain fatty acid degradation" EXACT []
-xref: MetaCyc:ACETOACETATE-DEG-PWY
 xref: Reactome:R-HSA-71032 "Propionyl-CoA catabolism"
 is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0046459 ! short-chain fatty acid metabolic process
@@ -162664,10 +162764,12 @@
 xref: Reactome:R-HSA-9829047 "F0 is palmitoylated"
 xref: Reactome:R-HSA-9830875 "G is palmitoylated"
 xref: RHEA:36683
+xref: RHEA:67388
 is_a: GO:0016409 ! palmitoyltransferase activity
 is_a: GO:0019707 ! protein-cysteine S-acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.225
 property_value: skos:exactMatch RHEA:36683
+property_value: skos:narrowMatch RHEA:67388
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -173433,8 +173535,8 @@
 name: regulation of endocytosis
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of endocytosis." [GOC:curators]
+is_a: GO:0051049 ! regulation of transport
 is_a: GO:0051128 ! regulation of cellular component organization
-is_a: GO:0060627 ! regulation of vesicle-mediated transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0006897 ! endocytosis
 relationship: regulates GO:0006897 ! endocytosis
@@ -175525,6 +175627,7 @@
 def: "The deposition of hydroxyapatite, a form of calcium phosphate with the formula Ca10(PO4)6(OH)2, in bone tissue." [GOC:mah, PMID:22936354]
 synonym: "bone calcification" NARROW []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001503 ! ossification
 
 [Term]
@@ -176171,7 +176274,7 @@
 xref: Reactome:R-HSA-5602147 "Defective CYP2R1 does not 25-hydroxylate vitamin D"
 xref: RHEA:32903
 is_a: GO:0008395 ! steroid hydroxylase activity
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.14.24
 property_value: skos:exactMatch RHEA:32903
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
@@ -178886,7 +178989,7 @@
 synonym: "D-alanine formation" EXACT []
 synonym: "D-alanine synthesis" EXACT []
 is_a: GO:0006523 ! alanine biosynthetic process
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0030633
@@ -179794,7 +179897,7 @@
 synonym: "polar granule organisation" EXACT []
 synonym: "polar granule organization and biogenesis" EXACT [GOC:dph, GOC:tb]
 is_a: GO:0006996 ! organelle organization
-relationship: part_of GO:0007315 ! pole plasm assembly
+relationship: part_of GO:0007315 ! germ plasm assembly
 
 [Term]
 id: GO:0030720
@@ -180208,11 +180311,15 @@
 xref: RHEA:23136
 xref: RHEA:53924
 xref: RHEA:53928
+xref: RHEA:74203
+xref: RHEA:74207
 is_a: GO:0008757 ! S-adenosylmethionine-dependent methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.49
 property_value: skos:narrowMatch RHEA:23136
 property_value: skos:narrowMatch RHEA:53924
 property_value: skos:narrowMatch RHEA:53928
+property_value: skos:narrowMatch RHEA:74203
+property_value: skos:narrowMatch RHEA:74207
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -185391,6 +185498,7 @@
 namespace: biological_process
 def: "The precipitation of calcium carbonate onto the organic matrix of a shell, such as a mollusc shell." [GOC:mah, PMID:15132736]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0031216
@@ -193050,14 +193158,22 @@
 xref: RHEA:33639
 xref: RHEA:43748
 xref: RHEA:54536
+xref: RHEA:83103
+xref: RHEA:83107
 xref: RHEA:83111
 xref: RHEA:83403
+xref: RHEA:85311
+xref: RHEA:85315
 is_a: GO:0120515 ! fatty acid-CoA ligase activity
 property_value: skos:exactMatch RHEA:54536
 property_value: skos:narrowMatch RHEA:33639
 property_value: skos:narrowMatch RHEA:43748
+property_value: skos:narrowMatch RHEA:83103
+property_value: skos:narrowMatch RHEA:83107
 property_value: skos:narrowMatch RHEA:83111
 property_value: skos:narrowMatch RHEA:83403
+property_value: skos:narrowMatch RHEA:85311
+property_value: skos:narrowMatch RHEA:85315
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26439" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -211305,20 +211421,32 @@
 name: fatty acid beta-oxidation using acyl-CoA dehydrogenase
 namespace: biological_process
 def: "A fatty acid beta-oxidation pathway in which the initial step of each oxidation cycle, which converts an acyl-CoA to a trans-2-enoyl-CoA, is catalyzed by acyl-CoA dehydrogenase; the electrons removed by oxidation pass through the respiratory chain to oxygen and leave H2O as the product. Fatty acid beta-oxidation begins with the addition of coenzyme A to a fatty acid, and ends when only two or three carbons remain (as acetyl-CoA or propionyl-CoA respectively)." [GOC:mah, MetaCyc:FAO-PWY]
+synonym: "mitochondrial fatty acid beta-oxidation" NARROW []
 xref: MetaCyc:FAO-PWY
+xref: MetaCyc:PWY-8181
 is_a: GO:0006635 ! fatty acid beta-oxidation
 relationship: has_part GO:0003995 ! acyl-CoA dehydrogenase activity
+property_value: skos:narrowMatch MetaCyc:FAO-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-8181
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
 
 [Term]
 id: GO:0033540
 name: fatty acid beta-oxidation using acyl-CoA oxidase
 namespace: biological_process
 def: "A fatty acid beta-oxidation pathway in which the initial step, which converts an acyl-CoA to a trans-2-enoyl-CoA, is catalyzed by acyl-CoA oxidase; the electrons removed by oxidation pass directly to oxygen and produce hydrogen peroxide, which is cleaved by peroxisomal catalases. Fatty acid beta-oxidation begins with the addition of coenzyme A to a fatty acid, and ends when only two or three carbons remain (as acetyl-CoA or propionyl-CoA respectively)." [GOC:mah, MetaCyc:PWY-5136]
+synonym: "peroxisomal fatty acid beta-oxidation" NARROW []
 xref: MetaCyc:PWY-5136
+xref: MetaCyc:PWY-7288
+xref: MetaCyc:PWY66-391
 xref: Reactome:R-HSA-389887 "Beta-oxidation of pristanoyl-CoA"
 xref: Reactome:R-HSA-390247 "Beta-oxidation of very long chain fatty acids"
 is_a: GO:0006635 ! fatty acid beta-oxidation
+property_value: skos:narrowMatch MetaCyc:PWY-5136
+property_value: skos:narrowMatch MetaCyc:PWY-7288
+property_value: skos:narrowMatch MetaCyc:PWY66-391
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
 
 [Term]
 id: GO:0033541
@@ -222019,7 +222147,6 @@
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:exactMatch MetaCyc:NADSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5653
@@ -223623,6 +223750,7 @@
 def: "The process in which calcium salts are deposited into calcareous tooth structures such as dental enamel, dentin and cementum." [GOC:mah, MP:0002817, MSH:D014074]
 synonym: "tooth calcification" EXACT []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0042476 ! odontogenesis
 
 [Term]
@@ -224724,7 +224852,6 @@
 xref: MetaCyc:PYRIDNUCSYN-PWY
 is_a: GO:0006531 ! aspartate metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-8277
 property_value: skos:narrowMatch MetaCyc:PWY-8352
@@ -231073,7 +231200,7 @@
 name: tube development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a tube over time, from its initial formation to a mature structure. Epithelial and endothelial tubes transport gases, liquids and cells from one site to another and form the basic structure of many organs and tissues including lung and trachea, kidney, the mammary gland, the vascular system and the gastrointestinal and urinary-genital tracts." [PMID:12526790]
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -233485,6 +233612,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud tube that contributes to the morphogenesis of the metanephros." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0003338 ! metanephros morphogenesis
 created_by: bf
@@ -233496,6 +233624,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud that contributes to the morphogenesis of the ureter. The ureter ureteric bud is the initial structure that forms the ureter." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0072197 ! ureter morphogenesis
 created_by: bf
@@ -243473,6 +243602,7 @@
 synonym: "chitin-based cuticle hardening by biomineralisation" EXACT [GOC:bf]
 is_a: GO:0007593 ! chitin-based cuticle sclerotization
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: bf
 creation_date: 2012-09-11T13:50:04Z
 
@@ -243965,16 +244095,18 @@
 
 [Term]
 id: GO:0036378
-name: calcitriol biosynthetic process from calciol
+name: obsolete calcitriol biosynthetic process from calciol
 namespace: biological_process
-def: "Conversion of vitamin D3 from its largely inactive form (calciol, also called cholecalciferol) into a hormonally active form (calcitriol). Conversion requires 25-hydroxylation of calciol in the liver to form calcidiol, and subsequent 1,alpha-hydroxylation of calcidiol in the kidney to form calcitriol." [GOC:BHF, GOC:rl, PMID:17426122, PMID:20511049]
+def: "OBSOLETE. Conversion of vitamin D3 from its largely inactive form (calciol, also called cholecalciferol) into a hormonally active form (calcitriol). Conversion requires 25-hydroxylation of calciol in the liver to form calcidiol, and subsequent 1,alpha-hydroxylation of calcidiol in the kidney to form calcitriol." [GOC:BHF, GOC:rl, PMID:17426122, PMID:20511049]
+comment: The reason for obsoletion is that this term was added in error.
 synonym: "1alpha,25(OH)2D3 biosynthesis" BROAD [CHEBI:17823]
 synonym: "1alpha,25-dihydroxycholecalciferol biosynthesis" BROAD [CHEBI:17823]
 synonym: "1alpha,25-dihydroxyvitamin D3 biosynthesis" BROAD [CHEBI:17823]
 synonym: "calcitriol biosynthesis from calciol" EXACT [GOC:bf]
 synonym: "vitamin D3 activation" EXACT [GOC:bf, PMID:20506379]
-is_a: GO:0070640 ! vitamin D3 metabolic process
-is_a: GO:1901755 ! vitamin D3 biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32077" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901755
 created_by: bf
 creation_date: 2013-05-15T11:46:08Z
 
@@ -251504,6 +251636,7 @@
 synonym: "collagen and cuticulin-based cuticle formation" EXACT []
 synonym: "collagen and cuticulin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040003
@@ -251515,6 +251648,7 @@
 synonym: "chitin-based cuticle formation" EXACT []
 synonym: "chitin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040004
@@ -255095,7 +255229,7 @@
 synonym: "cuticle biosynthetic process" EXACT []
 synonym: "cuticle formation" EXACT []
 synonym: "cuticle synthesis" EXACT []
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -260428,7 +260562,7 @@
 xref: MetaCyc:ALACAT2-PWY
 xref: MetaCyc:ALADEG-PWY
 xref: MetaCyc:ALANINE-DEG3-PWY
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ALACAT2-PWY
 property_value: skos:narrowMatch MetaCyc:ALADEG-PWY
@@ -266239,8 +266373,8 @@
 synonym: "homocysteine catabolism" EXACT []
 synonym: "homocysteine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
 
@@ -273960,7 +274094,7 @@
 synonym: "modulation by symbiont of host receptor-mediated endocytosis" EXACT []
 synonym: "modulation of host receptor-mediated endocytosis by symbiont" EXACT []
 synonym: "regulation by symbiont of host receptor-mediated endocytosis" EXACT []
-is_a: GO:1990215 ! symbiont-mediated perturbation of host vesicle-mediated transport
+is_a: GO:0044003 ! symbiont-mediated perturbation of host process
 
 [Term]
 id: GO:0044078
@@ -278759,6 +278893,9 @@
 xref: RHEA:78631
 xref: RHEA:78847
 xref: RHEA:83047
+xref: RHEA:83115
+xref: RHEA:85319
+xref: RHEA:85323
 is_a: GO:0003997 ! acyl-CoA oxidase activity
 property_value: skos:exactMatch RHEA:78847
 property_value: skos:narrowMatch RHEA:39119
@@ -278766,6 +278903,9 @@
 property_value: skos:narrowMatch RHEA:40319
 property_value: skos:narrowMatch RHEA:78631
 property_value: skos:narrowMatch RHEA:83047
+property_value: skos:narrowMatch RHEA:83115
+property_value: skos:narrowMatch RHEA:85319
+property_value: skos:narrowMatch RHEA:85323
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24703" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -279312,7 +279452,6 @@
 namespace: biological_process
 def: "The chemical reactions a resulting in the resulting in the breakdown of butyryl-CoA." [GOC:jl]
 synonym: "butyryl-CoA catabolism" EXACT []
-is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0036115 ! fatty-acyl-CoA catabolic process
 created_by: jl
 creation_date: 2012-04-19T04:28:46Z
@@ -285475,6 +285614,7 @@
 namespace: biological_process
 def: "The precipitation of specific crystal forms of calcium carbonate with extracellular matrix proteins in the otolith organs of the vertebrate inner ear." [GOC:dsf, PMID:15581873]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048840 ! otolith development
 
 [Term]
@@ -286349,14 +286489,17 @@
 
 [Term]
 id: GO:0045451
-name: pole plasm oskar mRNA localization
+name: germ plasm oskar mRNA localization
 namespace: biological_process
-def: "Any process in which oskar mRNA is transported to, or maintained in, the oocyte pole plasm." [GOC:curators]
-synonym: "establishment and maintenance of oskar mRNA localization in pole plasm" EXACT []
-synonym: "establishment and maintenance of pole plasm oskar mRNA localization" EXACT []
-synonym: "oocyte pole plasm oskar mRNA localization" EXACT []
-synonym: "pole plasm oskar mRNA localisation" EXACT [GOC:mah]
-is_a: GO:0019094 ! pole plasm mRNA localization
+def: "Any process in which oskar mRNA is transported to, or maintained in, the germ plasm." [GOC:curators]
+synonym: "establishment and maintenance of germ plasm oskar mRNA localization" EXACT []
+synonym: "establishment and maintenance of oskar mRNA localization in pole plasm" RELATED []
+synonym: "establishment and maintenance of pole plasm oskar mRNA localization" RELATED []
+synonym: "germ plasm oskar mRNA localisation" EXACT [GOC:mah]
+synonym: "oocyte pole plasm oskar mRNA localization" RELATED []
+synonym: "pole plasm oskar mRNA localization" RELATED []
+is_a: GO:0019094 ! germ plasm mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0045453
@@ -286844,12 +286987,15 @@
 
 [Term]
 id: GO:0045495
-name: pole plasm
+name: obsolete pole plasm
 namespace: cellular_component
-def: "Differentiated cytoplasm associated with a pole (animal, vegetal, anterior, or posterior) of an oocyte, egg or early embryo." [GOC:kmv, PMID:17113380]
+def: "OBSOLETE. Differentiated cytoplasm associated with a pole (animal, vegetal, anterior, or posterior) of an oocyte, egg or early embryo." [GOC:kmv, PMID:17113380]
+comment: The reason for obsoletion is that the term is not clearly defined and usage has been inconsistent. Pole plasm has been used as a near-synonym of germ plasm, but germ plasm is not always localised to a pole of the egg/oocyte (for example, in zebrafish (PMID:16168720) the germ plasm is localised to the cleavage furrow rather than to a pole). All experimental annotations to this term can be expressed using GO:0060293 germ plasm.
 synonym: "germ plasm" NARROW []
 synonym: "polar plasm" EXACT []
-is_a: GO:0005737 ! cytoplasm
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0060293
 
 [Term]
 id: GO:0045496
@@ -291741,38 +291887,42 @@
 
 [Term]
 id: GO:0045855
-name: negative regulation of pole plasm oskar mRNA localization
+name: negative regulation of germ plasm oskar mRNA localization
 namespace: biological_process
-def: "Any process that stops, prevents, or reduces the frequency, rate or extent of a process in which oskar mRNA is transported to, or maintained in, the oocyte pole plasm." [GOC:curators]
-synonym: "down regulation of pole plasm oskar mRNA localization" EXACT []
-synonym: "down-regulation of pole plasm oskar mRNA localization" EXACT []
-synonym: "downregulation of pole plasm oskar mRNA localization" EXACT []
-synonym: "inhibition of pole plasm oskar mRNA localization" NARROW []
-synonym: "negative regulation of oocyte pole plasm oskar mRNA localization" EXACT []
-synonym: "negative regulation of pole plasm oskar mRNA localisation" EXACT [GOC:mah]
-is_a: GO:0007317 ! regulation of pole plasm oskar mRNA localization
+def: "Any process that stops, prevents, or reduces the frequency, rate or extent of a process in which oskar mRNA is transported to, or maintained in, the germ plasm." [GOC:curators]
+synonym: "down regulation of germ plasm oskar mRNA localization" EXACT []
+synonym: "down-regulation of germ plasm oskar mRNA localization" EXACT []
+synonym: "downregulation of germ plasm oskar mRNA localization" EXACT []
+synonym: "inhibition of germ plasm oskar mRNA localization" NARROW []
+synonym: "negative regulation of germ plasm oskar mRNA localisation" EXACT [GOC:mah]
+synonym: "negative regulation of oocyte pole plasm oskar mRNA localization" RELATED []
+synonym: "negative regulation of pole plasm oskar mRNA localization" RELATED []
+is_a: GO:0007317 ! regulation of germ plasm oskar mRNA localization
 is_a: GO:1904581 ! negative regulation of intracellular mRNA localization
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0045451 ! pole plasm oskar mRNA localization
-relationship: negatively_regulates GO:0045451 ! pole plasm oskar mRNA localization
+intersection_of: negatively_regulates GO:0045451 ! germ plasm oskar mRNA localization
+relationship: negatively_regulates GO:0045451 ! germ plasm oskar mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0045856
-name: positive regulation of pole plasm oskar mRNA localization
+name: positive regulation of germ plasm oskar mRNA localization
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of the process in which oskar mRNA is transported to, or maintained in, the oocyte pole plasm." [GOC:curators]
-synonym: "activation of pole plasm oskar mRNA localization" NARROW []
-synonym: "positive regulation of oocyte pole plasm oskar mRNA localization" EXACT []
-synonym: "positive regulation of pole plasm oskar mRNA localisation" EXACT [GOC:mah]
-synonym: "stimulation of pole plasm oskar mRNA localization" NARROW []
-synonym: "up regulation of pole plasm oskar mRNA localization" EXACT []
-synonym: "up-regulation of pole plasm oskar mRNA localization" EXACT []
-synonym: "upregulation of pole plasm oskar mRNA localization" EXACT []
-is_a: GO:0007317 ! regulation of pole plasm oskar mRNA localization
+def: "Any process that activates or increases the frequency, rate or extent of the process in which oskar mRNA is transported to, or maintained in, the germ plasm." [GOC:curators]
+synonym: "activation of germ plasm oskar mRNA localization" NARROW []
+synonym: "positive regulation of germ plasm oskar mRNA localisation" EXACT [GOC:mah]
+synonym: "positive regulation of oocyte pole plasm oskar mRNA localization" RELATED []
+synonym: "positive regulation of pole plasm oskar mRNA localization" RELATED []
+synonym: "stimulation of germ plasm oskar mRNA localization" NARROW []
+synonym: "up regulation of germ plasm oskar mRNA localization" EXACT []
+synonym: "up-regulation of germ plasm oskar mRNA localization" EXACT []
+synonym: "upregulation of germ plasm oskar mRNA localization" EXACT []
+is_a: GO:0007317 ! regulation of germ plasm oskar mRNA localization
 is_a: GO:1904582 ! positive regulation of intracellular mRNA localization
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0045451 ! pole plasm oskar mRNA localization
-relationship: positively_regulates GO:0045451 ! pole plasm oskar mRNA localization
+intersection_of: positively_regulates GO:0045451 ! germ plasm oskar mRNA localization
+relationship: positively_regulates GO:0045451 ! germ plasm oskar mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0045857
@@ -298971,11 +299121,13 @@
 
 [Term]
 id: GO:0046416
-name: D-amino acid metabolic process
+name: obsolete D-amino acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving D-amino acids, the D-enantiomers of amino acids." [GOC:ai, GOC:jsg]
+def: "OBSOLETE. The chemical reactions and pathways involving D-amino acids, the D-enantiomers of amino acids." [GOC:ai, GOC:jsg]
+comment: The reason for obsoletion is that this is an unnecessary grouping term.
 synonym: "D-amino acid metabolism" EXACT []
-is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32062" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0046417
@@ -299244,16 +299396,16 @@
 
 [Term]
 id: GO:0046437
-name: D-amino acid biosynthetic process
+name: obsolete D-amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of D-amino acids, the D-enantiomers of amino acids." [GOC:ai, GOC:jsg]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of D-amino acids, the D-enantiomers of amino acids." [GOC:ai, GOC:jsg]
+comment: The reason for obsoletion is that this is an unnecessary grouping term.
 synonym: "D-amino acid anabolism" EXACT []
 synonym: "D-amino acid biosynthesis" EXACT []
 synonym: "D-amino acid formation" EXACT []
 synonym: "D-amino acid synthesis" EXACT []
-is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0046416 ! D-amino acid metabolic process
-is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32062" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0046438
@@ -301222,27 +301374,32 @@
 
 [Term]
 id: GO:0046594
-name: maintenance of pole plasm mRNA location
+name: maintenance of germ plasm mRNA location
 namespace: biological_process
 alt_id: GO:0048122
-def: "The process of maintaining mRNA in a specific location in the oocyte pole plasm. An example of this process is found in Drosophila melanogaster." [GOC:bf, GOC:dph, GOC:tb]
-synonym: "maintenance of oocyte pole plasm mRNA localization" EXACT []
+def: "The process of maintaining mRNA in a specific location in the germ plasm." [GOC:bf, GOC:dph, GOC:tb]
+synonym: "maintenance of germ plasm mRNA localization" EXACT []
+synonym: "maintenance of oocyte pole plasm mRNA localization" RELATED []
 synonym: "maintenance of pole plasm mRNA localization" RELATED [GOC:dph, GOC:tb]
+synonym: "maintenance of pole plasm mRNA location" RELATED []
 is_a: GO:0051237 ! maintenance of RNA location
 is_a: GO:0051651 ! maintenance of location in cell
-relationship: part_of GO:0019094 ! pole plasm mRNA localization
+relationship: part_of GO:0019094 ! germ plasm mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0046595
-name: establishment of pole plasm mRNA localization
+name: establishment of germ plasm mRNA localization
 namespace: biological_process
 alt_id: GO:0048121
-def: "Any process that results in the directed movement of mRNA to the oocyte pole plasm." [GOC:bf]
-synonym: "establishment of oocyte pole plasm mRNA localization" EXACT []
-synonym: "establishment of pole plasm mRNA localisation" EXACT [GOC:mah]
+def: "Any process that results in the directed movement of mRNA to the germ plasm." [GOC:bf]
+synonym: "establishment of germ plasm mRNA localisation" EXACT [GOC:mah]
+synonym: "establishment of oocyte pole plasm mRNA localization" RELATED []
+synonym: "establishment of pole plasm mRNA localization" RELATED []
 is_a: GO:0051236 ! establishment of RNA localization
 is_a: GO:0051649 ! establishment of localization in cell
-relationship: part_of GO:0019094 ! pole plasm mRNA localization
+relationship: part_of GO:0019094 ! germ plasm mRNA localization
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0046596
@@ -302450,6 +302607,7 @@
 xref: Wikipedia:Decidualization
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001893 ! maternal placenta development
 
 [Term]
@@ -309125,6 +309283,9 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
+xref: RHEA:86879
+xref: RHEA:86891
+xref: RHEA:86895
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
@@ -309133,6 +309294,9 @@
 property_value: skos:narrowMatch RHEA:74807
 property_value: skos:narrowMatch RHEA:74811
 property_value: skos:narrowMatch RHEA:74823
+property_value: skos:narrowMatch RHEA:86879
+property_value: skos:narrowMatch RHEA:86891
+property_value: skos:narrowMatch RHEA:86895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -312551,6 +312715,7 @@
 xref: RHEA:38491
 xref: RHEA:39959
 xref: RHEA:39963
+xref: RHEA:40603
 xref: RHEA:40607
 xref: RHEA:44312
 xref: RHEA:44316
@@ -312584,6 +312749,7 @@
 property_value: skos:narrowMatch RHEA:38491
 property_value: skos:narrowMatch RHEA:39959
 property_value: skos:narrowMatch RHEA:39963
+property_value: skos:narrowMatch RHEA:40603
 property_value: skos:narrowMatch RHEA:40607
 property_value: skos:narrowMatch RHEA:44312
 property_value: skos:narrowMatch RHEA:44316
@@ -318039,10 +318205,12 @@
 xref: MetaCyc:ARYL-ALCOHOL-DEHYDROGENASE-NADP+-RXN
 xref: RHEA:17761
 xref: RHEA:58776
+xref: RHEA:59944
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.91
 property_value: skos:exactMatch RHEA:17761
 property_value: skos:narrowMatch RHEA:58776
+property_value: skos:narrowMatch RHEA:59944
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -321546,6 +321714,10 @@
 xref: RHEA:65552
 xref: RHEA:65556
 xref: RHEA:77675
+xref: RHEA:86911
+xref: RHEA:86915
+xref: RHEA:86919
+xref: RHEA:86923
 is_a: GO:0004553 ! hydrolase activity, hydrolyzing O-glycosyl compounds
 property_value: skos:exactMatch EC:3.2.1.123
 property_value: skos:exactMatch RHEA:22288
@@ -321555,6 +321727,10 @@
 property_value: skos:narrowMatch RHEA:65552
 property_value: skos:narrowMatch RHEA:65556
 property_value: skos:narrowMatch RHEA:77675
+property_value: skos:narrowMatch RHEA:86911
+property_value: skos:narrowMatch RHEA:86915
+property_value: skos:narrowMatch RHEA:86919
+property_value: skos:narrowMatch RHEA:86923
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -327220,6 +327396,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the mesectoderm over time, from its formation to the mature structure. In animal embryos, mesectoderm development processes give rise to both mesoderm and ectoderm tissues." [GOC:jid]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007398 ! ectoderm development
 relationship: part_of GO:0007498 ! mesoderm development
 
@@ -327496,7 +327673,6 @@
 comment: Consider instead annotating to one of the more specific child terms, or to 'floral organ development ; GO:0048438' or one of its child terms.
 synonym: "collective phyllome structure development" BROAD [GOC:PO_curators, PO:0025023]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
@@ -327889,7 +328065,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the style over time, from its formation to the mature structure. The style is an elongated part of a carpel, or group of fused carpels, and it lies between the ovary and the stigma." [GOC:jid, PO:0009074]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
@@ -327899,7 +328074,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stigma over time, from its formation to the mature structure. The stigma is the pollen-receptive surface of a carpel or group of fused carpels, usually sticky." [GOC:jid, PO:0009073]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
@@ -328179,7 +328353,6 @@
 name: meristem development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the meristem over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -328759,6 +328932,7 @@
 synonym: "intestinal development" NARROW []
 synonym: "intestine development" NARROW []
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0055123 ! digestive system development
 
 [Term]
@@ -329613,7 +329787,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anther over time, from its formation to the mature structure." [GOC:jid, GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 
@@ -329669,7 +329842,6 @@
 synonym: "tapetal layer development" BROAD [GOC:tb]
 synonym: "tapetum development" BROAD [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 
@@ -331418,7 +331590,6 @@
 name: root cap development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root cap over time, from its formation to the mature structure. The root cap protects the root meristem from friction as the root grows through the soil. The cap is made up of a group of parenchyma cells which secrete a glycoprotein mucilage as a lubricant." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
@@ -331911,6 +332082,7 @@
 def: "The process whose specific outcome is the progression of the lateral line over time, from its formation to the mature structure. The lateral line consists of small sensory patches (neuromasts) located superficially on the skin or just under the skin in fluid-filled canals on the head and body of all fishes and most amphibians. The lateral line develops from cranial ectodermal placodes situated behind the ear and between the eye and ear." [ISBN:0125296509]
 synonym: "LL development" EXACT []
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048925 ! lateral line system development
 
 [Term]
@@ -336708,19 +336880,17 @@
 
 [Term]
 id: GO:0050246
-name: questin monooxygenase (NADPH) activity
+name: obsolete questin monooxygenase (NADPH) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADPH + O2 + questin = demethylsulochrin + NADP+." [RHEA:10836]
-synonym: "questin oxygenase activity" RELATED [EC:1.14.13.43]
-synonym: "questin,NADPH:oxygen oxidoreductase (hydroxylating, anthraquinone-ring-opening)" RELATED [EC:1.14.13.43]
-xref: EC:1.14.13.43
-xref: KEGG_REACTION:R02417
-xref: MetaCyc:QUESTIN-MONOOXYGENASE-RXN
-xref: RHEA:10836
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
-property_value: skos:exactMatch EC:1.14.13.43
-property_value: skos:exactMatch RHEA:10836
+def: "OBSOLETE. Catalysis of the reaction: H+ + NADPH + O2 + questin = demethylsulochrin + NADP+." [PMID:34586791]
+comment: This term was made obsolete because the underlying reaction was reclassified. What was previously modeled as a single NADPH-dependent monooxygenase step (EC 1.14.13.43, RHEA:10836) is now known to proceed by a two-enzyme mechanism: NADPH-dependent reduction of questin to questin hydroquinone (EC 1.1.1.443, RHEA:86147), followed by O2-dependent anthraquinone-ring-opening dioxygenation of questin hydroquinone to demethylsulochrin (EC 1.13.11.96, RHEA:86143).
+synonym: "questin oxygenase activity" RELATED []
+synonym: "questin,NADPH:oxygen oxidoreductase (hydroxylating, anthraquinone-ring-opening)" RELATED []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32207" xsd:anyURI
+is_obsolete: true
+consider: GO:7770080
+consider: GO:7770081
 
 [Term]
 id: GO:0050247
@@ -345943,7 +346113,6 @@
 def: "The movement of an organism or part of an organism using mechanoreceptors, the nervous system, striated muscle and/or the skeletal system." [GOC:dph]
 is_a: GO:0050879 ! multicellular organismal movement
 is_a: GO:0050905 ! neuromuscular process
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0050882
@@ -346819,9 +346988,6 @@
 synonym: "perception of environment using reflected sound waves" EXACT []
 xref: Wikipedia:Echolocation
 is_a: GO:0050877 ! nervous system process
-property_value: RO:0002175 NCBITaxon:687454
-property_value: RO:0002175 NCBITaxon:9397
-property_value: RO:0002175 NCBITaxon:9722
 
 [Term]
 id: GO:0050960
@@ -356530,6 +356696,7 @@
 xref: RHEA:47468
 xref: RHEA:84515
 xref: RHEA:84543
+xref: RHEA:84779
 is_a: GO:0016863 ! intramolecular oxidoreductase activity, transposing C=C bonds
 property_value: skos:exactMatch EC:5.3.3.21
 property_value: skos:exactMatch RHEA:45240
@@ -356538,6 +356705,7 @@
 property_value: skos:narrowMatch RHEA:47468
 property_value: skos:narrowMatch RHEA:84515
 property_value: skos:narrowMatch RHEA:84543
+property_value: skos:narrowMatch RHEA:84779
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -368140,10 +368308,12 @@
 xref: RHEA:40787
 xref: RHEA:40791
 xref: RHEA:67072
+xref: RHEA:83411
 is_a: GO:0047617 ! fatty acyl-CoA hydrolase activity
 property_value: skos:exactMatch RHEA:67072
 property_value: skos:narrowMatch RHEA:40787
 property_value: skos:narrowMatch RHEA:40791
+property_value: skos:narrowMatch RHEA:83411
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26441" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -371753,6 +371923,7 @@
 synonym: "Mullerian tract development" RELATED []
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060067
@@ -374074,9 +374245,13 @@
 id: GO:0060293
 name: germ plasm
 namespace: cellular_component
-def: "Differentiated cytoplasm associated with a pole of an oocyte, egg or early embryo that will be inherited by the cells that will give rise to the germ line." [GOC:dph]
+def: "Differentiated cytoplasm associated with an oocyte, egg or early embryo that will be inherited by the cells that will give rise to the germ line." [GOC:dph, PMID:16168720]
+comment: Note that germ plasm is not necessarily localised to a pole of the egg/oocyte. For example, in zebrafish the germ plasm is localised to the cleavage furrow (PMID:16168720).
+synonym: "polar plasm" RELATED []
+synonym: "pole plasm" RELATED []
 xref: Wikipedia:Germ_plasm
-is_a: GO:0045495 ! pole plasm
+is_a: GO:0005737 ! cytoplasm
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32233" xsd:anyURI
 
 [Term]
 id: GO:0060294
@@ -375496,6 +375671,7 @@
 def: "The process whose specific outcome is the progression of an epithelium over time, from its formation to the mature structure. An epithelium is a tissue that covers the internal or external surfaces of an anatomical structure." [GOC:dph, GOC:mtg_lung]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060430
@@ -376038,6 +376214,7 @@
 def: "The process whose specific outcome is the progression of a mesenchymal tissue over time, from its formation to the mature structure. A mesenchymal tissue is made up of loosely packed stellate cells." [GOC:dph]
 synonym: "mesenchymal development" EXACT [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048513 ! animal organ development
 
 [Term]
@@ -376566,6 +376743,7 @@
 namespace: biological_process
 def: "The progression of muscle tissue over time, from its initial formation to its mature state. Muscle tissue is a contractile tissue made up of actin and myosin fibers." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-04-10T08:05:37Z
 
@@ -378599,6 +378777,7 @@
 namespace: biological_process
 def: "The process in which the spongiotrophoblast layer of the placenta progresses from its formation to its mature state." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001892 ! embryonic placenta development
 created_by: dph
 creation_date: 2009-06-09T03:33:40Z
@@ -380473,6 +380652,7 @@
 namespace: biological_process
 def: "The progression of the semicircular canal from its initial formation to the mature structure." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 created_by: dph
 creation_date: 2009-08-13T09:36:37Z
@@ -382053,6 +382233,7 @@
 synonym: "EHBD development" BROAD [PMID:20614624]
 synonym: "extrahepatic bile duct development" BROAD [PMID:20614624]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061008 ! hepaticobiliary system development
 created_by: dph
 creation_date: 2010-01-22T09:17:13Z
@@ -384208,6 +384389,7 @@
 synonym: "Mullerian duct development" EXACT [GOC:dph]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-07-30T10:54:47Z
 
@@ -386579,30 +386761,34 @@
 
 [Term]
 id: GO:0061413
-name: regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
+name: obsolete regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
 namespace: biological_process
-def: "A transcription regulation process in which the presence of a nonfermentable carbon source leads to the modulation of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
-is_a: GO:0000429 ! carbon catabolite regulation of transcription from RNA polymerase II promoter
+def: "OBSOLETE. A transcription regulation process in which the presence of a nonfermentable carbon source leads to the modulation of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
+comment: The reason for obsoletion is that this represents a GO-CAM.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 created_by: dph
 creation_date: 2012-01-23T11:13:06Z
 
 [Term]
 id: GO:0061414
-name: positive regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
+name: obsolete positive regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
 namespace: biological_process
-def: "A transcription regulation process in which the presence of a nonfermentable carbon source leads to an increase of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
-is_a: GO:0000436 ! carbon catabolite activation of transcription from RNA polymerase II promoter
-is_a: GO:0061413 ! regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
+def: "OBSOLETE. A transcription regulation process in which the presence of a nonfermentable carbon source leads to an increase of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
+comment: The reason for obsoletion is that this represents a GO-CAM.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21442" xsd:anyURI
+is_obsolete: true
 created_by: dph
 creation_date: 2012-01-23T11:31:27Z
 
 [Term]
 id: GO:0061415
-name: negative regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
+name: obsolete negative regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
 namespace: biological_process
-def: "A transcription regulation process in which the presence of a nonfermentable carbon source leads to a decrease of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
-is_a: GO:0000437 ! carbon catabolite repression of transcription from RNA polymerase II promoter
-is_a: GO:0061413 ! regulation of transcription from RNA polymerase II promoter by a nonfermentable carbon source
+def: "OBSOLETE. A transcription regulation process in which the presence of a nonfermentable carbon source leads to a decrease of the frequency, rate, or extent of transcription, from an RNA polymerase II promoter, of specific genes involved in the metabolism of other carbon sources." [GOC:dph, PMID:19686338]
+comment: The reason for obsoletion is that this represents a GO-CAM model.
+property_value: term_tracker_item "The reason for obsoletion is that these terms represent GO-CAM models." xsd:anyURI
+is_obsolete: true
 created_by: dph
 creation_date: 2012-01-23T11:33:08Z
 
@@ -386968,6 +387154,7 @@
 namespace: biological_process
 def: "The progression of a connective tissue over time, from its formation to the mature structure." [GOC:BHF]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-03-22T12:53:41Z
 
@@ -387074,7 +387261,6 @@
 namespace: biological_process
 def: "The progression of the reproductive system over time from its formation to the mature structure. The reproductive system consists of the organs that function in reproduction." [GOC:dph]
 is_a: GO:0048731 ! system development
-is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-08-22T17:47:53Z
 
@@ -387973,6 +388159,7 @@
 synonym: "ganglia development" RELATED [GOC:dph]
 synonym: "gangliogenesis" NARROW [GOC:BHF, GOC:rl]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 created_by: dph
 creation_date: 2013-07-10T08:36:12Z
@@ -394402,7 +394589,7 @@
 name: L-beta-ethynylserine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-beta-ethynylserine. L-beta-ethynylserine is an antibiotic produced by Streptomyces bacteria." [PMID:3082841, PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -394413,7 +394600,7 @@
 name: L-propargylglycine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-propargylglycine (Pra). L-propargylglycine is an antibiotic produced by Streptomyces bacteria." [PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -397410,7 +397597,8 @@
 synonym: "D-serine biosynthesis" EXACT []
 synonym: "D-serine formation" EXACT []
 synonym: "D-serine synthesis" EXACT []
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0070180
@@ -401237,6 +401425,8 @@
 xref: RHEA:11388
 xref: RHEA:42200
 xref: RHEA:84079
+xref: RHEA:86411
+xref: RHEA:86451
 xref: Wikipedia:11beta-hydroxysteroid_dehydrogenase
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.146
@@ -401244,6 +401434,8 @@
 property_value: skos:exactMatch RHEA:11388
 property_value: skos:narrowMatch RHEA:42200
 property_value: skos:narrowMatch RHEA:84079
+property_value: skos:narrowMatch RHEA:86411
+property_value: skos:narrowMatch RHEA:86451
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28173" xsd:anyURI
 
@@ -409963,7 +410155,6 @@
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: mah
@@ -418813,6 +419004,7 @@
 def: "The process whose specific outcome is the progression of the S1 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S1 portion is the initial portion of the proximal convoluted tubule and is responsible for avid reabsorption of water and solutes." [GOC:mtg_kidney_jan10, MA:0002612]
 synonym: "S1 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:55:57Z
@@ -418824,6 +419016,7 @@
 def: "The process whose specific outcome is the progression of the S2 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S2 portion of the tubule is involved in reabsorption of water and sodium chloride." [GOC:mtg_kidney_jan10, MA:0002613]
 synonym: "S2 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:56:36Z
@@ -418973,6 +419166,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a collecting duct over time, from its formation to the mature structure. The collecting duct responds to vasopressin and aldosterone to regulate water, electrolyte and acid-base balance. It is the final common path through which urine flows before entering the ureter and then emptying into the bladder." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:18:06Z
@@ -419200,6 +419394,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the long descending thin limb bend over time, from its formation to the mature structure. The long descending thin limb bend is a part of the descending thin limb of a long nephron that lies beyond the prebend segment." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072064 ! long descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:13:38Z
@@ -419210,6 +419405,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the prebend segment over time, from its formation to the mature structure. The prebend segment is a part of the descending thin limb that lies before the bend and exhibits permeabilities characteristic of the ascending limb, especially negligible water permeability." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072022 ! descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:14:02Z
@@ -422001,10 +422197,11 @@
 id: GO:0072319
 name: vesicle uncoating
 namespace: biological_process
-def: "A protein depolymerization process that results in the disassembly of vesicle coat proteins." [GOC:mah]
+def: "The disaggregation of a vesicle coat into its constituent components, resulting in removal of the protein coat from a transport vesicle. Uncoating occurs after vesicle budding and can be coupled to vesicle docking and fusion with the target membrane." [GOC:mah, PMID:20706600]
 synonym: "vesicle coat disassembly" EXACT [GOC:mah]
-is_a: GO:0051261 ! protein depolymerization
+is_a: GO:0032984 ! protein-containing complex disassembly
 relationship: part_of GO:0016192 ! vesicle-mediated transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32179" xsd:anyURI
 created_by: mah
 creation_date: 2010-10-26T12:09:21Z
 
@@ -423893,6 +424090,7 @@
 def: "The reproductive developmental process whose specific outcome is the progression of the seminiferous tubule over time, from its formation to the mature structure. Seminiferous tubules are ducts located in the testicles, and are the specific location of meiosis, and the subsequent creation of gametes, namely spermatozoa." [GOC:BHF, GOC:mah, UBERON:0001343]
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0008584 ! male gonad development
 created_by: mah
 creation_date: 2011-01-04T12:50:36Z
@@ -430165,6 +430363,14 @@
 xref: RHEA:78863
 xref: RHEA:78867
 xref: RHEA:78931
+xref: RHEA:84807
+xref: RHEA:84811
+xref: RHEA:84823
+xref: RHEA:84915
+xref: RHEA:84919
+xref: RHEA:86491
+xref: RHEA:86587
+xref: RHEA:86595
 is_a: GO:0018812 ! 3-hydroxyacyl-CoA dehydratase activity
 property_value: skos:exactMatch EC:4.2.1.119
 property_value: skos:exactMatch MetaCyc:RXN-7699
@@ -430214,6 +430420,14 @@
 property_value: skos:narrowMatch RHEA:78863
 property_value: skos:narrowMatch RHEA:78867
 property_value: skos:narrowMatch RHEA:78931
+property_value: skos:narrowMatch RHEA:84807
+property_value: skos:narrowMatch RHEA:84811
+property_value: skos:narrowMatch RHEA:84823
+property_value: skos:narrowMatch RHEA:84915
+property_value: skos:narrowMatch RHEA:84919
+property_value: skos:narrowMatch RHEA:86491
+property_value: skos:narrowMatch RHEA:86587
+property_value: skos:narrowMatch RHEA:86595
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24738" xsd:anyURI
 
 [Term]
@@ -430584,7 +430798,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the integument over time, from its formation to the mature structure. Integument is one of the layers of tissue that usually covers the ovule, enveloping the nucellus and forming the micropyle at the apex." [PMID:19054366, PO:0020021]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048481 ! plant ovule development
 created_by: dhl
@@ -430839,7 +431052,6 @@
 def: "The process whose specific outcome is the progression of the filament over time, from its formation to the mature structure. Filament is the stalk of a stamen." [PMID:19139039, PO:0009067]
 synonym: "filament development" EXACT []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 created_by: dhl
@@ -431766,7 +431978,6 @@
 def: "The process whose specific outcome is the progression of the stomium over time, from its formation to the mature structure. A stomium is a fissure or pore in the anther lobe through which the pollen is released." [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0022412 ! cellular process involved in reproduction in multicellular organism
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 created_by: dhl
@@ -434029,6 +434240,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the hypoblast over time, from its formation to the mature structure. The hypoblast is a tissue formed from the inner cell mass that lies beneath the epiblast." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: tb
 creation_date: 2009-07-29T10:25:54Z
 
@@ -435213,7 +435425,7 @@
 name: regulation of COPII vesicle uncoating
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of COPII vesicle uncoating, the process in which COPII vesicle coat proteins are disassembled, and released." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0090112 ! COPII vesicle uncoating
 relationship: regulates GO:0090112 ! COPII vesicle uncoating
@@ -439271,16 +439483,18 @@
 
 [Term]
 id: GO:0090443
-name: FAR/SIN/STRIPAK complex
+name: FAR/SIP/STRIPAK complex
 namespace: cellular_component
 def: "A conserved protein phosphatase type 2A complex which contains a protein phosphatase type 2A, a protein phosphatase regulatory subunit, a striatin, an FHA domain protein and other subunits (at least six proteins). In fission yeast this complex negatively regulate the septation initiation network at the spindle pole body." [GOC:vw, PMID:21561862, PMID:22119525]
 synonym: "FAR complex" RELATED [GOC:vw]
+synonym: "FAR/SIN/STRIPAK complex" RELATED []
 synonym: "SIN inhibitory phosphatase (SIP) complex" EXACT []
 synonym: "SIN inhibitory phosphatase complex" EXACT []
 synonym: "SIP complex" EXACT [PMID:22119525]
 synonym: "striatin interacting phosphatase and kinase complex" EXACT [GOC:vw]
 synonym: "STRIPAK signalling complex" RELATED [GOC:vw]
 is_a: GO:0032991 ! protein-containing complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32223" xsd:anyURI
 created_by: tb
 creation_date: 2012-08-23T14:20:39Z
 
@@ -440386,7 +440600,6 @@
 name: plant epidermis development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the plant epidermis over time, from its formation to the mature structure." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2014-02-27T15:17:37Z
@@ -458078,7 +458291,6 @@
 namespace: biological_process
 def: "Development of a plant organ, a multi-tissue plant structure that forms a functional unit." [GOC:dos]
 synonym: "development of a plant organ" EXACT []
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048731 ! system development
 
@@ -461977,6 +462189,7 @@
 xref: RHEA:45812
 xref: RHEA:79187
 xref: RHEA:83119
+xref: RHEA:84379
 is_a: GO:0080023 ! (2E)-enoyl-CoA hydratase activity
 property_value: skos:exactMatch EC:4.2.1.134
 property_value: skos:exactMatch RHEA:45812
@@ -461987,6 +462200,7 @@
 property_value: skos:narrowMatch RHEA:39271
 property_value: skos:narrowMatch RHEA:79187
 property_value: skos:narrowMatch RHEA:83119
+property_value: skos:narrowMatch RHEA:84379
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24738" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25805" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -475796,10 +476010,12 @@
 def: "Catalysis of the reaction: a 2'-deoxyribonucleoside 5'-phosphate + dTTP = a 2'-deoxyribonucleoside 5'-diphosphate + dTDP." [PMID:20497505, RHEA:62132]
 xref: RHEA:62132
 xref: RHEA:62152
+xref: RHEA:62156
 is_a: GO:0016776 ! phosphotransferase activity, phosphate group as acceptor
 is_a: GO:0019205 ! nucleobase-containing compound kinase activity
 property_value: skos:exactMatch RHEA:62132
 property_value: skos:narrowMatch RHEA:62152
+property_value: skos:narrowMatch RHEA:62156
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
 creation_date: 2021-03-11T20:09:34Z
@@ -476020,6 +476236,29 @@
 xref: RHEA:78879
 xref: RHEA:78935
 xref: RHEA:79191
+xref: RHEA:83123
+xref: RHEA:84307
+xref: RHEA:84383
+xref: RHEA:84387
+xref: RHEA:84795
+xref: RHEA:84803
+xref: RHEA:84815
+xref: RHEA:84831
+xref: RHEA:84867
+xref: RHEA:84871
+xref: RHEA:84875
+xref: RHEA:85335
+xref: RHEA:85339
+xref: RHEA:86171
+xref: RHEA:86175
+xref: RHEA:86179
+xref: RHEA:86183
+xref: RHEA:86187
+xref: RHEA:86191
+xref: RHEA:86195
+xref: RHEA:86199
+xref: RHEA:86203
+xref: RHEA:86207
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.n12
 property_value: skos:exactMatch RHEA:32711
@@ -476040,6 +476279,29 @@
 property_value: skos:narrowMatch RHEA:78879
 property_value: skos:narrowMatch RHEA:78935
 property_value: skos:narrowMatch RHEA:79191
+property_value: skos:narrowMatch RHEA:83123
+property_value: skos:narrowMatch RHEA:84307
+property_value: skos:narrowMatch RHEA:84383
+property_value: skos:narrowMatch RHEA:84387
+property_value: skos:narrowMatch RHEA:84795
+property_value: skos:narrowMatch RHEA:84803
+property_value: skos:narrowMatch RHEA:84815
+property_value: skos:narrowMatch RHEA:84831
+property_value: skos:narrowMatch RHEA:84867
+property_value: skos:narrowMatch RHEA:84871
+property_value: skos:narrowMatch RHEA:84875
+property_value: skos:narrowMatch RHEA:85335
+property_value: skos:narrowMatch RHEA:85339
+property_value: skos:narrowMatch RHEA:86171
+property_value: skos:narrowMatch RHEA:86175
+property_value: skos:narrowMatch RHEA:86179
+property_value: skos:narrowMatch RHEA:86183
+property_value: skos:narrowMatch RHEA:86187
+property_value: skos:narrowMatch RHEA:86191
+property_value: skos:narrowMatch RHEA:86195
+property_value: skos:narrowMatch RHEA:86199
+property_value: skos:narrowMatch RHEA:86203
+property_value: skos:narrowMatch RHEA:86207
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27180" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30577" xsd:anyURI
 created_by: hjd
@@ -483509,6 +483771,19 @@
 xref: RHEA:78587
 xref: RHEA:78851
 xref: RHEA:83059
+xref: RHEA:84211
+xref: RHEA:84723
+xref: RHEA:84727
+xref: RHEA:84731
+xref: RHEA:84735
+xref: RHEA:84859
+xref: RHEA:84907
+xref: RHEA:84911
+xref: RHEA:86107
+xref: RHEA:86155
+xref: RHEA:86167
+xref: RHEA:86487
+xref: RHEA:86591
 is_a: GO:0003997 ! acyl-CoA oxidase activity
 property_value: skos:exactMatch RHEA:78851
 property_value: skos:narrowMatch RHEA:38971
@@ -483518,6 +483793,19 @@
 property_value: skos:narrowMatch RHEA:78571
 property_value: skos:narrowMatch RHEA:78587
 property_value: skos:narrowMatch RHEA:83059
+property_value: skos:narrowMatch RHEA:84211
+property_value: skos:narrowMatch RHEA:84723
+property_value: skos:narrowMatch RHEA:84727
+property_value: skos:narrowMatch RHEA:84731
+property_value: skos:narrowMatch RHEA:84735
+property_value: skos:narrowMatch RHEA:84859
+property_value: skos:narrowMatch RHEA:84907
+property_value: skos:narrowMatch RHEA:84911
+property_value: skos:narrowMatch RHEA:86107
+property_value: skos:narrowMatch RHEA:86155
+property_value: skos:narrowMatch RHEA:86167
+property_value: skos:narrowMatch RHEA:86487
+property_value: skos:narrowMatch RHEA:86591
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: sjm
@@ -484229,7 +484517,8 @@
 id: GO:0120571
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
+def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460, RHEA:86675]
+xref: RHEA:86675
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
@@ -484308,9 +484597,9 @@
 def: "The chemical reactions and pathways resulting in the breakdown of L-dopa." [MetaCyc:PWY-6334, MetaCyc:PWY-8110]
 xref: MetaCyc:PWY-6334
 xref: MetaCyc:PWY-8110
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-6334
 property_value: skos:narrowMatch MetaCyc:PWY-8110
@@ -486355,6 +486644,7 @@
 xref: RHEA:69028
 xref: RHEA:84155
 xref: RHEA:84199
+xref: RHEA:84203
 xref: RHEA:85551
 xref: RHEA:85559
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
@@ -486369,6 +486659,7 @@
 property_value: skos:narrowMatch RHEA:69028
 property_value: skos:narrowMatch RHEA:84155
 property_value: skos:narrowMatch RHEA:84199
+property_value: skos:narrowMatch RHEA:84203
 property_value: skos:narrowMatch RHEA:85551
 property_value: skos:narrowMatch RHEA:85559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29921" xsd:anyURI
@@ -487248,7 +487539,6 @@
 subset: goslim_synapse
 is_a: GO:0006897 ! endocytosis
 is_a: GO:0051649 ! establishment of localization in cell
-is_a: GO:0099003 ! vesicle-mediated transport in synapse
 intersection_of: GO:0006897 ! endocytosis
 intersection_of: occurs_in GO:0098793 ! presynapse
 relationship: occurs_in GO:0098793 ! presynapse
@@ -487265,7 +487555,6 @@
 subset: goslim_synapse
 is_a: GO:0006897 ! endocytosis
 is_a: GO:0051649 ! establishment of localization in cell
-is_a: GO:0099003 ! vesicle-mediated transport in synapse
 intersection_of: GO:0006897 ! endocytosis
 intersection_of: occurs_in GO:0098794 ! postsynapse
 relationship: occurs_in GO:0098794 ! postsynapse
@@ -489074,7 +489363,6 @@
 is_a: GO:0042435 ! indole-containing compound biosynthetic process
 is_a: GO:0043386 ! mycotoxin biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 relationship: has_part GO:0036469 ! L-tryptophan decarboxylase activity
 relationship: has_part GO:0140381 ! 4-hydroxytryptamine 4-phosphate methyltransferase activity
@@ -489388,8 +489676,10 @@
 id: GO:0140401
 name: 4-phosphoerythronate phosphatase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-phospho-D-erythronate + H2O = D-erythronate + phosphate." [PMID:27294321]
+def: "Catalysis of the reaction: 4-phospho-D-erythronate + H2O = D-erythronate + phosphate." [PMID:27294321, RHEA:86555]
+xref: RHEA:86555
 is_a: GO:0016791 ! phosphatase activity
+property_value: skos:exactMatch RHEA:86555
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31118" xsd:anyURI
 created_by: pg
 creation_date: 2026-04-02T12:52:47Z
@@ -502468,7 +502758,7 @@
 namespace: biological_process
 def: "A developmental process whose specific outcome is the progression of a gross anatomical part of a plant over time from an initial condition to a later condition." [GOC:pg]
 synonym: "plant development" RELATED []
-is_a: GO:0032502 ! developmental process
+is_a: GO:0048856 ! anatomical structure development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22994" xsd:anyURI
 created_by: rynl
 creation_date: 2023-09-18T20:55:06Z
@@ -504774,11 +505064,14 @@
 
 [Term]
 id: GO:0160294
-name: clathrin- and caveolae-independent endocytosis
+name: obsolete clathrin- and caveolae-independent endocytosis
 namespace: biological_process
-def: "An endocytosis process that internalizes cargo via small, non-coated vesicles (~40-80 nm) without relying on clathrin or caveolin and can be dynamin-dependent or dynamin-independent." [PMID:15668298, PMID:31976201]
-is_a: GO:0006897 ! endocytosis
+def: "OBSOLETE. An endocytosis process that internalizes cargo via small, non-coated vesicles (~40-80 nm) without relying on clathrin or caveolin and can be dynamin-dependent or dynamin-independent." [PMID:15668298, PMID:31976201]
+comment: The reason for obsoletion is that this term is defined by what it lacks (clathrin and caveolin) rather than by its own machinery, and groups mechanistically distinct endocytosis routes that do not constitute a single coherent process.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30667" xsd:anyURI
+is_obsolete: true
+consider: GO:7770083
+consider: GO:7770084
 created_by: rynl
 creation_date: 2025-08-04T16:38:59Z
 
@@ -505343,47 +505636,48 @@
 
 [Term]
 id: GO:0170033
-name: L-amino acid metabolic process
+name: obsolete L-amino acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving an L-amino acid." [GOC:edw]
+def: "OBSOLETE. The chemical reactions and pathways involving an L-amino acid." [GOC:edw]
+comment: The reason for obsoletion is that this is an unnecessary grouping term.
 synonym: "L-alpha-amino acid metabolism" EXACT []
 synonym: "L-amino acid metabolism" EXACT []
 xref: Reactome:R-HSA-8963693 "Aspartate and asparagine metabolism"
 xref: Reactome:R-HSA-8964539 "Glutamate and glutamine metabolism"
-is_a: GO:0006520 ! amino acid metabolic process
-is_a: GO:0019752 ! carboxylic acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23268" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32062" xsd:anyURI
+is_obsolete: true
 created_by: ew
 creation_date: 2023-11-20T23:41:23Z
 
 [Term]
 id: GO:0170034
-name: L-amino acid biosynthetic process
+name: obsolete L-amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-amino acids, the L-enantiomers of amino acids." [GOC:edw]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of L-amino acids, the L-enantiomers of amino acids." [GOC:edw]
+comment: The reason for obsoletion is that this is an unnecessary grouping term.
 synonym: "L-amino acid anabolism" EXACT []
 synonym: "L-amino acid biosynthesis" EXACT []
 synonym: "L-amino acid formation" EXACT []
 synonym: "L-amino acid synthesis" EXACT []
-is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0046394 ! carboxylic acid biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23268" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32062" xsd:anyURI
+is_obsolete: true
 created_by: ew
 creation_date: 2023-11-20T23:42:06Z
 
 [Term]
 id: GO:0170035
-name: L-amino acid catabolic process
+name: obsolete L-amino acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of an L-amino acid." [GOC:edw]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of an L-amino acid." [GOC:edw]
+comment: The reason for obsoletion is that this is an unnecessary grouping term.
 synonym: "L-amino acid breakdown" EXACT []
 synonym: "L-amino acid catabolism" EXACT []
 synonym: "L-amino acid degradation" EXACT []
-is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0046395 ! carboxylic acid catabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23268" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32062" xsd:anyURI
+is_obsolete: true
 created_by: ew
 creation_date: 2023-11-21T00:55:07Z
 
@@ -548441,7 +548735,7 @@
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthesis" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid formation" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31371" xsd:anyURI
@@ -569680,7 +569974,7 @@
 def: "Any process that modulates the frequency, rate or extent of synaptic vesicle uncoating." [GO_REF:0000058, GOC:pad, GOC:PARL, GOC:TermGenie, PMID:21563316]
 synonym: "regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0016191 ! synaptic vesicle uncoating
 relationship: regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569706,8 +570000,8 @@
 synonym: "inhibition of synaptic vesicle uncoating" NARROW [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
+is_a: GO:0043242 ! negative regulation of protein-containing complex disassembly
 is_a: GO:1900243 ! negative regulation of synaptic vesicle endocytosis
-is_a: GO:1901880 ! negative regulation of protein depolymerization
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569734,7 +570028,7 @@
 synonym: "upregulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle uncoating" EXACT [GOC:TermGenie]
-is_a: GO:1901881 ! positive regulation of protein depolymerization
+is_a: GO:0043243 ! positive regulation of protein-containing complex disassembly
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -578707,7 +579001,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a palisade mesophyll over time, from its formation to the mature structure." [GO_REF:0000080, GOC:TermGenie, PMID:24663344]
 synonym: "palisade parenchyma development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2015-02-04T21:51:44Z
@@ -603683,6 +603976,7 @@
 def: "The process whose specific outcome is the progression of cardiac jelly over time, from its formation to the mature structure. The cardiac jelly is an acellular gelatinous matrix secreted by the myocardium and plays a central role in the septation of the heart." [GO_REF:0000094, GOC:BHF, GOC:rl, GOC:TermGenie, PMID:10645959, PMID:16314491, PMID:19703439]
 synonym: "heart cardiac jelly development" EXACT [GOC:TermGenie]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: rl
 creation_date: 2016-03-23T13:17:59Z
@@ -608398,7 +608692,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a septum over time, from its formation to the mature structure." [GO_REF:0000080, GOC:tb, GOC:TermGenie, PMID:4562349]
 synonym: "dissepiment development" BROAD [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2016-07-21T18:25:49Z
@@ -609218,7 +609511,6 @@
 namespace: cellular_component
 def: "A protein complex which is capable of beta-N-acetylhexosaminidase activity." [GO_REF:0000088, GOC:bhm, GOC:TermGenie, PMID:6458607]
 comment: An example of this is HEXB in human (UniProt symbol P07686) in PMID:6458607 (inferred from direct assay).
-synonym: "HEX A complex" NARROW []
 synonym: "HEX B complex" NARROW []
 synonym: "HEX S complex" NARROW []
 is_a: GO:1902494 ! catalytic complex
@@ -619296,6 +619588,7 @@
 def: "The process whose specific outcome is the progression of an epididymis over time, from its formation to the mature structure." [GO_REF:0000094, GOC:TermGenie, PMID:12388089]
 synonym: "epididymus development" EXACT [GOC:TermGenie]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: sl
 creation_date: 2017-01-27T00:00:33Z
 
@@ -621719,7 +622012,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit replum over time, from its formation to the mature structure. The fruit replum is a portion of fruit placenta tissue that divides a fruit into two or more chambers and develops from a replum." [PMID:23133401, PO:0025267]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
@@ -621731,7 +622023,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit valve over time, from its formation to the mature structure. The fruit valve is a part of a fruit that splits apart when the fruit dehisces." [PMID:23133401, PO:0000033]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
@@ -650307,7 +650598,9 @@
 name: N(6),N(6),N(6)-trimethyl-L-lysine transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of N(6),N(6),N(6)-trimethyl-L-lysine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
+xref: RHEA:86419
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
+property_value: skos:exactMatch RHEA:86419
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650317,8 +650610,10 @@
 namespace: molecular_function
 def: "Enables the transfer of dimethylarginine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
 xref: RHEA:75047
+xref: RHEA:86423
 is_a: GO:0022857 ! transmembrane transporter activity
 property_value: skos:narrowMatch RHEA:75047
+property_value: skos:narrowMatch RHEA:86423
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650977,6 +651272,71 @@
 created_by: dragon-ai-agent
 creation_date: 2026-05-22T09:23:32Z
 
+[Term]
+id: GO:7770080
+name: questin reductase (NADPH) activity
+namespace: molecular_function
+def: "Catalysis of the reaction: questin hydroquinone + NADP+ = questin + NADPH + 2 H+." [PMID:34586791, RHEA:86147]
+synonym: "questin reductase activity" BROAD []
+xref: EC:1.1.1.443
+xref: RHEA:86147
+is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch EC:1.1.1.443
+property_value: skos:exactMatch RHEA:86147
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32207" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-06-16T14:35:50Z
+
+[Term]
+id: GO:7770081
+name: questin hydroquinone dioxygenase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: questin hydroquinone + O2 = demethylsulochrin + 2 H+." [PMID:34586791, RHEA:86143]
+synonym: "anthraquinone-ring-opening dioxygenase activity" RELATED []
+xref: EC:1.13.11.96
+xref: RHEA:86143
+is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
+property_value: skos:exactMatch EC:1.13.11.96
+property_value: skos:exactMatch RHEA:86143
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32207" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-06-16T14:35:50Z
+
+[Term]
+id: GO:7770082
+name: beta-hexosaminidase A complex
+namespace: cellular_component
+def: "A beta-N-acetylhexosaminidase complex composed of an alpha subunit and a beta subunit. In humans the subunits are encoded by HEXA and HEXB. In association with the GM2 activator protein, the complex degrades GM2 ganglioside within the lysosome." [PMID:15485660, PMID:16698036]
+synonym: "beta-hexosaminidase heterodimer" NARROW []
+synonym: "Hex A complex" EXACT []
+synonym: "hexosaminidase A complex" EXACT []
+synonym: "lysosomal beta-hexosaminidase A complex" EXACT []
+is_a: GO:1905379 ! beta-N-acetylhexosaminidase complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32235" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-06-23T17:39:17Z
+
+[Term]
+id: GO:7770083
+name: fast endophilin-mediated endocytosis
+namespace: biological_process
+def: "An endocytosis process in which plasma membrane cargo is internalized through endophilin-enriched, clathrin-uncoated invaginations." [PMID:25517094]
+synonym: "FEME" EXACT []
+is_a: GO:0006897 ! endocytosis
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30667" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-06-25T20:44:10Z
+
+[Term]
+id: GO:7770084
+name: CLIC/GEEC-mediated endocytosis
+namespace: biological_process
+def: "An endocytosis process in which clathrin-uncoated carriers (CLICs) internalize plasma membrane cargo and deliver it to GPI-enriched early endosomal compartments (GEECs)." [PMID:19036340, PMID:22177561]
+is_a: GO:0006897 ! endocytosis
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30667" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-06-25T20:44:10Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
