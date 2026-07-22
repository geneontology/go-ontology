# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-07-22 06:23:01.042593258 +0000
+++ go.obo	2026-07-22 06:36:31.798265102 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-06-15
+data-version: releases/2026-07-22
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-06-15" xsd:string
+property_value: owl:versionInfo "2026-07-22" xsd:string
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
@@ -2846,7 +2846,7 @@
 name: 3-beta-hydroxysteroid 3-dehydrogenase (NADP+) activity
 namespace: molecular_function
 alt_id: GO:0050576
-def: "Catalysis of the reaction: a 3-betahydroxyl sterol + NADP+ = a 3-oxosterol sterol + NADPH + H+." [EC:1.1.1.270, GOC:mah, PMID:9811880]
+def: "Catalysis of the reaction: a 3-betahydroxyl sterol + NADP+ = a 3-oxosterol sterol + NADPH + H+." [EC:1.1.1.270, PMID:9811880]
 synonym: "3-keto sterol reductase activity" EXACT []
 synonym: "3-keto-steroid reductase activity" EXACT []
 synonym: "3-KSR activity" RELATED [EC:1.1.1.270]
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
@@ -5300,7 +5303,6 @@
 is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015078 ! proton transmembrane transporter activity
 is_a: GO:0015175 ! neutral L-amino acid transmembrane transporter activity
-is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 is_a: GO:0140848 ! amino acid:monoatomic cation antiporter activity
 property_value: skos:exactMatch RHEA:70967
@@ -8387,34 +8389,37 @@
 
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
 
@@ -10610,9 +10615,13 @@
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
@@ -17749,7 +17758,7 @@
 name: follicular dendritic cell activation
 namespace: biological_process
 def: "A change in the morphology or behavior of a follicular dendritic cell resulting from exposure to an activating factor such as a cellular or soluble ligand." [GOC:add, PMID:15606789]
-is_a: GO:0001775 ! cell activation
+is_a: GO:0045321 ! leukocyte activation
 
 [Term]
 id: GO:0002267
@@ -17769,7 +17778,7 @@
 namespace: biological_process
 def: "The process in which a relatively unspecialized precursor cell acquires the specialized features of a follicular dendritic cell." [GOC:add, ISBN:0781735149]
 is_a: GO:0002266 ! follicular dendritic cell activation
-is_a: GO:0030154 ! cell differentiation
+is_a: GO:0097028 ! dendritic cell differentiation
 
 [Term]
 id: GO:0002269
@@ -25759,6 +25768,7 @@
 namespace: biological_process
 def: "The progression of the trabecular meshwork over time, from its formation to the mature structure. The trabecular meshwork is a fenestrated endothelial-like tissue situated at the intersection of the cornea and the iris. The trabecular meshwork provides drainage for the aqueous humor." [PMID:20568247]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: hjd
 creation_date: 2012-04-19T04:50:06Z
@@ -30532,9 +30542,9 @@
 
 [Term]
 id: GO:0003426
-name: obsolete obsolete cytoskeleton polarization involved in growth plate cartilage chondrocyte division
+name: obsolete cytoskeleton polarization involved in growth plate cartilage chondrocyte division
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. A process that is carried out at the cellular level which results in the polarization of cytoskeletal structures in a growth plate cartilage chondrocyte. This process results in the oriented division of the cell." [GOC:ascb_2009, GOC:dph, GOC:tb]
+def: "OBSOLETE. A process that is carried out at the cellular level which results in the polarization of cytoskeletal structures in a growth plate cartilage chondrocyte. This process results in the oriented division of the cell." [GOC:ascb_2009, GOC:dph, GOC:tb]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31306" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31330" xsd:anyURI
@@ -32756,7 +32766,7 @@
 
 [Term]
 id: GO:0003842
-name: L-glutamate gamma-semialdehyde dehydrogenase activity
+name: L-glutamate gamma-semialdehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "L-glutamate 5-semialdehyde + NAD+ + H2O = L-glutamate + NADH + 2 H+." [RHEA:30235]
 comment: (S)-1-pyrroline-5-carboxylate is in spontaneous equilibrium with its tautomer L-glutamate gamma-semialdehyde. The activity can also oxidize other 1-pyrrolines, e.g. oxidation of 3-hydroxy-1-pyrroline-5-carboxylate to 4-hydroxyglutamate, and oxidation of (R)-1-pyrroline-5-carboxylate to D-glutamate.
@@ -32773,11 +32783,12 @@
 xref: Reactome:R-HSA-70679 "ALDH4A1 oxidises L-GluSS to Glu"
 xref: Reactome:R-HSA-9929439 "ALDH4A1 oxidizes 1PYR-3OH-5COOH"
 xref: RHEA:30235
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.88
 property_value: skos:exactMatch RHEA:30235
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23277" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30034" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0003843
@@ -32935,7 +32946,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: a 1-O-alkyl-2-acetyl-sn-glycero-3-phosphocholine + H2O = 1-O-alkyl-sn-glycero-3-phosphocholine + acetate + H+." [RHEA:17777]
 subset: goslim_chembl
-synonym: "1-alkyl-2-acetyl-sn-glycero-3-phosphocholine acetohydrolase activity" RELATED [EC:3.1.1.47]
+synonym: "1-alkyl-2-acetyl-sn-glycero-3-phosphocholine acetohydrolase activity" EXACT [EC:3.1.1.47]
 synonym: "1-alkyl-2-acetyl-sn-glycero-3-phosphocholine acetylhydrolase activity" RELATED [EC:3.1.1.47]
 synonym: "2-acetyl-1-alkylglycerophosphocholine esterase activity" EXACT []
 synonym: "alkylacetyl-GPC:acetylhydrolase activity" RELATED [EC:3.1.1.47]
@@ -32943,6 +32954,7 @@
 synonym: "LDL-associated phospholipase A2" RELATED [EC:3.1.1.47]
 synonym: "LDL-PLA(2) activity" RELATED [EC:3.1.1.47]
 synonym: "LDL-PLA2" RELATED [EC:3.1.1.47]
+synonym: "lipoprotein-associated phospholipase A2 activity" NARROW []
 synonym: "PAF 2-acylhydrolase activity" RELATED [EC:3.1.1.47]
 synonym: "PAF acetylhydrolase activity" RELATED [EC:3.1.1.47]
 synonym: "platelet-activating factor acetylhydrolase activity" RELATED [EC:3.1.1.47]
@@ -32964,6 +32976,7 @@
 property_value: skos:narrowMatch RHEA:41372
 property_value: skos:narrowMatch RHEA:41376
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32286" xsd:anyURI
 
 [Term]
 id: GO:0003848
@@ -34927,7 +34940,7 @@
 
 [Term]
 id: GO:0003942
-name: N-acetyl-gamma-glutamyl-phosphate reductase activity
+name: N-acetyl-gamma-glutamyl-phosphate reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N-acetyl-L-glutamate 5-semialdehyde + NADP+ + phosphate = N-acetyl-5-glutamyl phosphate + NADPH + H+." [RHEA:21588]
 synonym: "N-acetyl-glutamate semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.38]
@@ -35965,6 +35978,7 @@
 xref: RHEA:83083
 xref: RHEA:83095
 xref: RHEA:83099
+xref: RHEA:83127
 xref: RHEA:83135
 xref: RHEA:83219
 xref: RHEA:83251
@@ -35972,6 +35986,8 @@
 xref: RHEA:83367
 xref: RHEA:83383
 xref: RHEA:83399
+xref: RHEA:84311
+xref: RHEA:84391
 xref: RHEA:84447
 xref: RHEA:84451
 xref: RHEA:84455
@@ -35982,7 +35998,11 @@
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
@@ -36015,6 +36035,7 @@
 property_value: skos:narrowMatch RHEA:83083
 property_value: skos:narrowMatch RHEA:83095
 property_value: skos:narrowMatch RHEA:83099
+property_value: skos:narrowMatch RHEA:83127
 property_value: skos:narrowMatch RHEA:83135
 property_value: skos:narrowMatch RHEA:83219
 property_value: skos:narrowMatch RHEA:83251
@@ -36022,6 +36043,8 @@
 property_value: skos:narrowMatch RHEA:83367
 property_value: skos:narrowMatch RHEA:83383
 property_value: skos:narrowMatch RHEA:83399
+property_value: skos:narrowMatch RHEA:84311
+property_value: skos:narrowMatch RHEA:84391
 property_value: skos:narrowMatch RHEA:84447
 property_value: skos:narrowMatch RHEA:84451
 property_value: skos:narrowMatch RHEA:84455
@@ -36032,7 +36055,11 @@
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
@@ -36234,6 +36261,8 @@
 xref: RHEA:66232
 xref: RHEA:66236
 xref: RHEA:67212
+xref: RHEA:86619
+xref: RHEA:86699
 is_a: GO:0016634 ! oxidoreductase activity, acting on the CH-CH group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.3.3.6
 property_value: skos:exactMatch RHEA:38959
@@ -36253,6 +36282,8 @@
 property_value: skos:narrowMatch RHEA:66232
 property_value: skos:narrowMatch RHEA:66236
 property_value: skos:narrowMatch RHEA:67212
+property_value: skos:narrowMatch RHEA:86619
+property_value: skos:narrowMatch RHEA:86699
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -37069,6 +37100,7 @@
 xref: RHEA:12789
 xref: RHEA:37967
 xref: RHEA:59924
+xref: RHEA:59932
 is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
 property_value: skos:broadMatch EC:1.1.1.21
 property_value: skos:broadMatch MetaCyc:ALDEHYDE-REDUCTASE-RXN
@@ -37076,6 +37108,7 @@
 property_value: skos:exactMatch RHEA:12789
 property_value: skos:narrowMatch RHEA:37967
 property_value: skos:narrowMatch RHEA:59924
+property_value: skos:narrowMatch RHEA:59932
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27136" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27881" xsd:anyURI
 
@@ -37394,6 +37427,9 @@
 xref: RHEA:81115
 xref: RHEA:81119
 xref: RHEA:81123
+xref: RHEA:86755
+xref: RHEA:86759
+xref: RHEA:86767
 is_a: GO:0016811 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amides
 property_value: skos:exactMatch EC:3.5.1.14
 property_value: skos:exactMatch RHEA:15565
@@ -37439,6 +37475,9 @@
 property_value: skos:narrowMatch RHEA:81115
 property_value: skos:narrowMatch RHEA:81119
 property_value: skos:narrowMatch RHEA:81123
+property_value: skos:narrowMatch RHEA:86755
+property_value: skos:narrowMatch RHEA:86759
+property_value: skos:narrowMatch RHEA:86767
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -38118,9 +38157,9 @@
 
 [Term]
 id: GO:0004073
-name: aspartate-semialdehyde dehydrogenase activity
+name: aspartate-semialdehyde dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-aspartate 4-semialdehyde + NADP+ + phosphate = 4-phospho-L-aspartate + H+ + NADPH." [EC:1.2.1.11, RHEA:24284]
+def: "Catalysis of the reaction: L-aspartate 4-semialdehyde + NADP+ + phosphate = 4-phospho-L-aspartate + H+ + NADPH." [RHEA:24284]
 synonym: "ASA dehydrogenase activity" RELATED [EC:1.2.1.11]
 synonym: "aspartate semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.11]
 synonym: "aspartic beta-semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.11]
@@ -40149,13 +40188,19 @@
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
@@ -40176,13 +40221,19 @@
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
 
@@ -43908,7 +43959,7 @@
 
 [Term]
 id: GO:0004350
-name: glutamate-5-semialdehyde dehydrogenase activity
+name: glutamate-5-semialdehyde dehydrogenase (NADP+) activity
 namespace: molecular_function
 alt_id: GO:0001513
 def: "Catalysis of the reaction: L-glutamate 5-semialdehyde + NADP+ + phosphate = L-glutamyl 5-phosphate + H+ + NADPH." [EC:1.2.1.41, RHEA:19541]
@@ -44305,7 +44356,7 @@
 xref: Reactome:R-HSA-70449 "GADPH tetramer dehydrogenates GA3P"
 xref: Reactome:R-HSA-70482 "GAPDH tetramers reduce 1,3BPG to GA3P"
 xref: RHEA:10300
-is_a: GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (phosphorylating) activity
+is_a: GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase (phosphorylating, [NAD(P)+] ) activity
 property_value: skos:exactMatch EC:1.2.1.12
 property_value: skos:exactMatch RHEA:10300
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -45634,11 +45685,13 @@
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
@@ -46736,7 +46789,7 @@
 id: GO:0004487
 name: methylenetetrahydrofolate dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5,10-methylenetetrahydrofolate + NAD+ = 5,10-methenyltetrahydrofolate + NADH." [RHEA:22892]
+def: "Catalysis of the reaction: (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NAD+ = (6R)-5,10-methenyltetrahydrofolate + NADH." [RHEA:22892]
 synonym: "5,10-methylenetetrahydrofolate dehydrogenase activity" RELATED [EC:1.5.1.5]
 synonym: "5,10-methylenetetrahydrofolate:NAD+ oxidoreductase" RELATED [EC:1.5.1.15]
 xref: EC:1.5.1.15
@@ -46753,7 +46806,7 @@
 id: GO:0004488
 name: methylenetetrahydrofolate dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5,10-methylenetetrahydrofolate + NADP+ = 5,10-methenyltetrahydrofolate + NADPH." [EC:1.5.1.5, RHEA:22812]
+def: "Catalysis of the reaction: (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NADP+ = (6R)-5,10-methenyltetrahydrofolate + NADPH." [RHEA:22812]
 synonym: "5,10-methylenetetrahydrofolate:NADP oxidoreductase activity" RELATED [EC:1.5.1.5]
 synonym: "5,10-methylenetetrahydrofolate:NADP+ oxidoreductase activity" RELATED [EC:1.5.1.5]
 xref: EC:1.5.1.5
@@ -46772,7 +46825,7 @@
 name: methylenetetrahydrofolate reductase [NAD(P)H] activity
 namespace: molecular_function
 alt_id: GO:0008702
-def: "Catalysis of the reaction: 5-methyltetrahydrofolate + NAD(P)+ = 5,10-methylenetetrahydrofolate + NAD(P)H + H+." [EC:1.5.1.20, PMID:26872964]
+def: "Catalysis of the reaction: (6S)-5-methyl-5,6,7,8-tetrahydrofolate + NAD(P)+ = (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NAD(P)H + H+." [EC:1.5.1.20, PMID:26872964]
 synonym: "5,10-CH(2)-H(4)folate reductase activity" RELATED [EC:1.5.1.20]
 synonym: "5,10-CH2-H4folate reductase activity" RELATED [EC:1.5.1.20]
 synonym: "5,10-methylenetetrahydrofolate reductase (FADH(2)) activity" RELATED [EC:1.5.1.20]
@@ -46803,13 +46856,12 @@
 synonym: "N5,10-methylenetetrahydrofolate reductase activity" RELATED [EC:1.5.1.20]
 synonym: "N5,N10-methylenetetrahydrofolate reductase activity" RELATED [EC:1.5.1.20]
 xref: EC:1.5.1.20
-xref: KEGG_REACTION:R01224
-xref: KEGG_REACTION:R07168
 xref: MetaCyc:1.5.1.20-RXN
 xref: Reactome:R-HSA-200676 "MTHFR dimer reduces 5,10-methylene-THFPG to 5-methyl-THFPG"
 is_a: GO:0016646 ! oxidoreductase activity, acting on the CH-NH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.5.1.20
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32310" xsd:anyURI
 
 [Term]
 id: GO:0004490
@@ -46834,7 +46886,7 @@
 
 [Term]
 id: GO:0004491
-name: methylmalonate-semialdehyde dehydrogenase (acylating, NAD) activity
+name: methylmalonate-semialdehyde dehydrogenase (acylating, NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-methyl-3-oxopropanoate + CoA + NAD+ = propanoyl-CoA + hydrogencarbonate + NADH + H+. Can also use malonate (3-oxopropanoate) as a substrate. The reaction occurs in two steps with the decarboxylation process preceding CoA-binding. Bicarbonate rather than CO2 is released as a final product." [EC:1.2.1.27, PMID:2768248]
 synonym: "methylmalonate-semialdehyde dehydrogenase (acylating) activity" RELATED []
@@ -47058,7 +47110,7 @@
 xref: Reactome:R-HSA-5602186 "Defective CYP27B1 does not hydroxylate CDL"
 xref: RHEA:20573
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.15.18
 property_value: skos:exactMatch RHEA:20573
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -47294,6 +47346,7 @@
 xref: RHEA:46104
 xref: RHEA:84067
 xref: RHEA:84071
+xref: RHEA:86455
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.15.4
@@ -47302,6 +47355,7 @@
 property_value: skos:narrowMatch RHEA:46104
 property_value: skos:narrowMatch RHEA:84067
 property_value: skos:narrowMatch RHEA:84071
+property_value: skos:narrowMatch RHEA:86455
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -47338,6 +47392,8 @@
 xref: RHEA:50244
 xref: RHEA:65760
 xref: RHEA:84243
+xref: RHEA:84247
+xref: RHEA:84251
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.19
@@ -47350,6 +47406,8 @@
 property_value: skos:narrowMatch RHEA:50236
 property_value: skos:narrowMatch RHEA:50244
 property_value: skos:narrowMatch RHEA:84243
+property_value: skos:narrowMatch RHEA:84247
+property_value: skos:narrowMatch RHEA:84251
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27671" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29041" xsd:anyURI
@@ -53638,6 +53696,7 @@
 xref: MetaCyc:SUCCINATE-SEMIALDEHYDE-DEHYDROGENASE-RXN
 xref: Reactome:R-HSA-888548 "ALDH5A1 dehydrogenates SUCCSA to SUCCA"
 xref: RHEA:13217
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 is_a: GO:0009013 ! succinate-semialdehyde dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.2.1.24
 property_value: skos:exactMatch RHEA:13217
@@ -60066,6 +60125,8 @@
 xref: RHEA:45256
 xref: RHEA:45264
 xref: RHEA:71395
+xref: RHEA:86475
+xref: RHEA:86483
 is_a: GO:0015245 ! fatty acid transmembrane transporter activity
 relationship: part_of GO:0015909 ! long-chain fatty acid transport
 property_value: skos:exactMatch RHEA:39283
@@ -60075,6 +60136,8 @@
 property_value: skos:narrowMatch RHEA:45256
 property_value: skos:narrowMatch RHEA:45264
 property_value: skos:narrowMatch RHEA:71395
+property_value: skos:narrowMatch RHEA:86475
+property_value: skos:narrowMatch RHEA:86483
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14793" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26996" xsd:anyURI
@@ -60487,25 +60550,49 @@
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
@@ -61434,6 +61521,7 @@
 xref: Reactome:R-HSA-265682 "KCNJ11 tetramer:ABCC8 tetramer binds 4xATP, closing the channel"
 is_a: GO:0032559 ! adenyl ribonucleotide binding
 is_a: GO:0035639 ! purine ribonucleoside triphosphate binding
+is_a: GO:0043168 ! anion binding
 
 [Term]
 id: GO:0005525
@@ -61443,6 +61531,7 @@
 xref: Reactome:R-HSA-167429 "The receptor:G-protein complex  binds GTP"
 is_a: GO:0032561 ! guanyl ribonucleotide binding
 is_a: GO:0035639 ! purine ribonucleoside triphosphate binding
+is_a: GO:0043168 ! anion binding
 
 [Term]
 id: GO:0005527
@@ -67305,7 +67394,7 @@
 relationship: has_part GO:0004619 ! phosphoglycerate mutase activity
 relationship: has_part GO:0004634 ! phosphopyruvate hydratase activity
 relationship: has_part GO:0004743 ! pyruvate kinase activity
-relationship: has_part GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (phosphorylating) activity
+relationship: has_part GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase (phosphorylating, [NAD(P)+] ) activity
 relationship: part_of GO:0009060 ! aerobic respiration
 property_value: skos:exactMatch MetaCyc:GLYCOLYSIS-VARIANTS
 property_value: skos:narrowMatch MetaCyc:P341-PWY
@@ -68287,6 +68376,7 @@
 synonym: "GTP biosynthesis" EXACT []
 synonym: "GTP formation" EXACT []
 synonym: "GTP synthesis" EXACT []
+is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009152 ! purine ribonucleotide biosynthetic process
 is_a: GO:0009206 ! purine ribonucleoside triphosphate biosynthetic process
 is_a: GO:0046039 ! GTP metabolic process
@@ -68400,6 +68490,7 @@
 synonym: "ITP catabolism" EXACT []
 synonym: "ITP degradation" EXACT []
 synonym: "ITP hydrolysis" EXACT []
+is_a: GO:0009143 ! nucleoside triphosphate catabolic process
 is_a: GO:0009154 ! purine ribonucleotide catabolic process
 is_a: GO:0009207 ! purine ribonucleoside triphosphate catabolic process
 is_a: GO:0046041 ! ITP metabolic process
@@ -68808,6 +68899,7 @@
 synonym: "UTP biosynthesis" EXACT []
 synonym: "UTP formation" EXACT []
 synonym: "UTP synthesis" EXACT []
+is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009209 ! pyrimidine ribonucleoside triphosphate biosynthetic process
 is_a: GO:0009220 ! pyrimidine ribonucleotide biosynthetic process
 is_a: GO:0046051 ! UTP metabolic process
@@ -68963,6 +69055,7 @@
 synonym: "CTP biosynthesis" EXACT []
 synonym: "CTP formation" EXACT []
 synonym: "CTP synthesis" EXACT []
+is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009209 ! pyrimidine ribonucleoside triphosphate biosynthetic process
 is_a: GO:0009220 ! pyrimidine ribonucleotide biosynthetic process
 is_a: GO:0046036 ! CTP metabolic process
@@ -69106,6 +69199,7 @@
 synonym: "CTP catabolism" EXACT []
 synonym: "CTP degradation" EXACT []
 synonym: "CTP hydrolysis" EXACT []
+is_a: GO:0009143 ! nucleoside triphosphate catabolic process
 is_a: GO:0009210 ! pyrimidine ribonucleoside triphosphate catabolic process
 is_a: GO:0009222 ! pyrimidine ribonucleotide catabolic process
 is_a: GO:0046036 ! CTP metabolic process
@@ -71887,7 +71981,7 @@
 xref: MetaCyc:PWY-8187
 xref: MetaCyc:PWY0-823
 is_a: GO:0006525 ! arginine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ARG-GLU-PWY
 property_value: skos:narrowMatch MetaCyc:ARG-PRO-PWY
@@ -71942,7 +72036,7 @@
 synonym: "asparagine degradation" EXACT []
 xref: MetaCyc:ASPARAGINE-DEG1-PWY
 xref: MetaCyc:PWY-4002
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARAGINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-4002
@@ -71985,8 +72079,8 @@
 xref: MetaCyc:PWY-8291
 xref: MetaCyc:PWY-8294
 is_a: GO:0006531 ! aspartate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARTATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8291
@@ -72069,8 +72163,8 @@
 xref: MetaCyc:PWY-5766
 xref: MetaCyc:PWY0-1305
 is_a: GO:0006536 ! glutamate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTDEG-PWY
@@ -72109,7 +72203,6 @@
 xref: MetaCyc:PWY-8346
 is_a: GO:0006105 ! succinate metabolic process
 is_a: GO:0006536 ! glutamate metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:GLUDEG-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8346
@@ -72124,7 +72217,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving glutamine, 2-amino-4-carbamoylbutanoic acid." [GOC:ai]
 synonym: "glutamine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72154,7 +72246,7 @@
 xref: MetaCyc:GLUTAMINDEG-PWY
 xref: MetaCyc:GLUTAMINEFUM-PWY
 is_a: GO:0006541 ! L-glutamine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMINDEG-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTAMINEFUM-PWY
@@ -72241,9 +72333,9 @@
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
@@ -72280,7 +72372,6 @@
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ILEUDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5078
@@ -72296,7 +72387,6 @@
 synonym: "L-leucine metabolism" EXACT []
 synonym: "leucine metabolic process" BROAD []
 is_a: GO:0009081 ! branched-chain amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72317,7 +72407,6 @@
 xref: MetaCyc:PWY-8185
 is_a: GO:0006551 ! L-leucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LEU-DEG2-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5075
@@ -72364,7 +72453,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
 is_a: GO:0000096 ! sulfur amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 
@@ -72431,8 +72519,8 @@
 xref: MetaCyc:PWY-6318
 xref: MetaCyc:PWY-7158
 xref: MetaCyc:PWY-8014
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ANAPHENOXI-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5079
@@ -72449,7 +72537,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving proline (pyrrolidine-2-carboxylic acid), a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
 synonym: "proline metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72479,7 +72566,7 @@
 xref: MetaCyc:PWY-8186
 xref: Reactome:R-HSA-70688 "Proline catabolism"
 is_a: GO:0006560 ! L-proline metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PROUT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8186
@@ -72493,7 +72580,6 @@
 def: "The chemical reactions and pathways involving L-serine, the L-enantiomer of serine, i.e. (2S)-2-amino-3-hydroxypropanoic acid." [GOC:ai, GOC:jsg]
 synonym: "L-serine metabolism" EXACT []
 xref: Reactome:R-HSA-977347 "Serine metabolism"
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72509,7 +72595,6 @@
 xref: MetaCyc:SERSYN-PWY
 is_a: GO:0006563 ! L-serine metabolic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-8011
 property_value: skos:narrowMatch MetaCyc:SERSYN-PWY
@@ -72525,7 +72610,7 @@
 synonym: "L-serine degradation" EXACT []
 xref: MetaCyc:SERDEG-PWY
 is_a: GO:0006563 ! L-serine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:exactMatch MetaCyc:SERDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
@@ -72540,7 +72625,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "threonine metabolism" EXACT []
 xref: UM-BBD_pathwayID:met
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72558,7 +72642,7 @@
 xref: MetaCyc:THREONINE-DEG2-PWY
 xref: UM-BBD_pathwayID:met
 is_a: GO:0006566 ! L-threonine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5436
 property_value: skos:narrowMatch MetaCyc:PWY-5437
@@ -72608,9 +72692,9 @@
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
@@ -72679,8 +72763,8 @@
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
 xref: UM-BBD_pathwayID:tyr
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5151
 property_value: skos:narrowMatch MetaCyc:PWY-7514
@@ -72716,7 +72800,6 @@
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5057
 property_value: skos:narrowMatch MetaCyc:PWY-8183
@@ -72945,7 +73028,7 @@
 synonym: "ornithine catabolism" EXACT []
 synonym: "ornithine degradation" EXACT []
 is_a: GO:0006591 ! ornithine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
@@ -73654,13 +73737,19 @@
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
@@ -74632,13 +74721,15 @@
 
 [Term]
 id: GO:0006735
-name: NADH regeneration
+name: obsolete NADH regeneration
 namespace: biological_process
-def: "A metabolic process that generates a pool of NADH by the reduction of NAD+." [GOC:mah]
+def: "OBSOLETE. A metabolic process that generates a pool of NADH by the reduction of NAD+." [GOC:mah]
+comment: This term was obsoleted because there is no evidence that this process exists; NADH is highly abundant in cells.
 synonym: "NAD (reduced) regeneration" EXACT []
 synonym: "reduced NAD regeneration" EXACT []
 synonym: "reduced nicotinamide adenine dinucleotide regeneration" EXACT []
-is_a: GO:0019674 ! NAD+ metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29818" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0006738
@@ -74686,19 +74777,23 @@
 id: GO:0006740
 name: NADPH regeneration
 namespace: biological_process
-def: "A metabolic process that generates a pool of NADPH by the reduction of NADP+." [GOC:mah]
+def: "A metabolic process that replenishes the cellular or compartmental pool of NADPH by transfer of reducing equivalents from a donor substrate to NADP+, independent of the route or compartment involved." [PMID:33028807, PMID:34074675]
+comment: Covers all routes that regenerate NADPH, including the oxidative branch of the pentose phosphate pathway (consider GO:0009051 for annotation), NADP(+)-dependent isocitrate dehydrogenase and malic enzyme reactions, folate-mediated one-carbon metabolism, and nicotinamide nucleotide transhydrogenase, in any subcellular compartment.
 synonym: "NADP (reduced) regeneration" EXACT []
+synonym: "NADPH replenishment" EXACT []
 synonym: "reduced NADP regeneration" EXACT []
 synonym: "reduced nicotinamide adenine dinucleotide phosphate regeneration" EXACT []
 xref: Reactome:R-HSA-389542 "NADPH regeneration"
 is_a: GO:0006091 ! generation of precursor metabolites and energy
 is_a: GO:0006739 ! NADP+ metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29818" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32298" xsd:anyURI
 
 [Term]
 id: GO:0006741
 name: NADP+ biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of nicotinamide adenine dinucleotide phosphate (NADP+), a coenzyme that interconverts with its reduced form, NADPH, in many redox and biosynthetic reactions." [GOC:mah]
+def: "The chemical reactions and pathways resulting in the formation of nicotinamide adenine dinucleotide phosphate (NADP+) from NAD+. NADP+ is a coenzyme that interconverts with its reduced form, NADPH, in many redox and biosynthetic reactions." [GOC:curators]
 synonym: "NADP (oxidized) biosynthesis" EXACT []
 synonym: "NADP (oxidized) biosynthetic process" EXACT []
 synonym: "NADP (reduced) biosynthesis" EXACT []
@@ -74720,11 +74815,15 @@
 synonym: "reduced NADP biosynthetic process" EXACT []
 synonym: "reduced nicotinamide adenine dinucleotide phosphate biosynthesis" EXACT []
 synonym: "reduced nicotinamide adenine dinucleotide phosphate biosynthetic process" EXACT []
+xref: MetaCyc:PWY-8148
 is_a: GO:0006164 ! purine nucleotide biosynthetic process
 is_a: GO:0006739 ! NADP+ metabolic process
 is_a: GO:0019359 ! nicotinamide nucleotide biosynthetic process
+is_a: GO:0019674 ! NAD+ metabolic process
+property_value: skos:exactMatch MetaCyc:PWY-8148
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29050" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29666" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32206" xsd:anyURI
 
 [Term]
 id: GO:0006742
@@ -74795,12 +74894,14 @@
 
 [Term]
 id: GO:0006746
-name: FADH2 metabolic process
+name: obsolete FADH2 metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving the reduced form of flavin adenine dinucleotide." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving the reduced form of flavin adenine dinucleotide." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "FADH2 metabolism" EXACT []
 synonym: "reduced flavin adenine dinucleotide metabolic process" EXACT [GOC:mah]
-is_a: GO:0072387 ! flavin adenine dinucleotide metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0006747
@@ -74887,6 +74988,7 @@
 synonym: "ATP formation" EXACT []
 synonym: "ATP regeneration" NARROW []
 synonym: "ATP synthesis" EXACT []
+is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009152 ! purine ribonucleotide biosynthetic process
 is_a: GO:0009206 ! purine ribonucleoside triphosphate biosynthetic process
 is_a: GO:0046034 ! ATP metabolic process
@@ -76228,7 +76330,6 @@
 synonym: "rough ER to cis-Golgi vesicle-mediated transport" EXACT []
 xref: Reactome:R-HSA-159763 "Transport of gamma-carboxylated protein precursors from the endoplasmic reticulum to the Golgi apparatus"
 xref: Reactome:R-HSA-199977 "ER to Golgi Anterograde Transport"
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 is_a: GO:0048193 ! Golgi vesicle transport
 relationship: occurs_in GO:0005737 ! cytoplasm
@@ -76310,7 +76411,6 @@
 synonym: "TGN to endosome transport" EXACT []
 synonym: "trans-Golgi to endosome transport" EXACT []
 is_a: GO:0006892 ! post-Golgi vesicle-mediated transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016482 ! cytosolic transport
 
 [Term]
@@ -76321,7 +76421,6 @@
 synonym: "Golgi to vacuole vesicle-mediated transport" EXACT []
 is_a: GO:0006892 ! post-Golgi vesicle-mediated transport
 is_a: GO:0007034 ! vacuolar transport
-is_a: GO:0010496 ! intercellular transport
 
 [Term]
 id: GO:0006897
@@ -76330,19 +76429,19 @@
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
@@ -76353,6 +76452,8 @@
 xref: Reactome:R-HSA-2173782 "Binding and Uptake of Ligands by Scavenger Receptors"
 xref: Wikipedia:Receptor-mediated_endocytosis
 is_a: GO:0006897 ! endocytosis
+is_a: GO:0016192 ! vesicle-mediated transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32256" xsd:anyURI
 
 [Term]
 id: GO:0006900
@@ -80519,7 +80620,7 @@
 namespace: biological_process
 def: "Transfer of constituents synthesized in the ovarian nurse cells to the oocyte, through the ring canals, as the egg chamber is growing. An example of this is found in Drosophila melanogaster." [GOC:mtg_sensu, ISBN:0879694238]
 synonym: "nurse cell to oocyte transport" BROAD []
-is_a: GO:0010496 ! intercellular transport
+is_a: GO:0006810 ! transport
 relationship: part_of GO:0048477 ! oogenesis
 
 [Term]
@@ -80694,49 +80795,57 @@
 
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
@@ -81373,6 +81482,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ectoderm over time, from its formation to the mature structure. In animal embryos, the ectoderm is the outer germ layer of the embryo, formed during gastrulation." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007399
@@ -82136,6 +82246,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endoderm over time, from its formation to the mature structure. The endoderm is the innermost germ layer that develops into the gastrointestinal tract, the lungs and associated tissues." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007493
@@ -82186,6 +82297,7 @@
 def: "The process whose specific outcome is the progression of the mesoderm over time, from its formation to the mature structure. The mesoderm is the middle germ layer that develops into muscle, bone, cartilage, blood and connective tissue." [GOC:dph, GOC:tb]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007499
@@ -82222,6 +82334,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the digestive tract mesoderm over time, from its formation to the mature structure. The digestive tract mesoderm is portion of the middle layer of the three primary germ layers of the embryo which will go on to form part of the digestive tract of the organism." [GOC:ai]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007498 ! mesoderm development
 relationship: part_of GO:0048565 ! digestive tract development
 
@@ -82268,7 +82381,6 @@
 xref: Wikipedia:Heart_development
 is_a: GO:0048513 ! animal organ development
 relationship: part_of GO:0072359 ! circulatory system development
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0007508
@@ -85079,6 +85191,7 @@
 xref: KEGG_REACTION:R01853
 xref: KEGG_REACTION:R02173
 xref: KEGG_REACTION:R02613
+xref: MetaCyc:AMINEOXID-RXN
 xref: MetaCyc:RXN-10817
 xref: MetaCyc:RXN-1401
 xref: MetaCyc:RXN-9597
@@ -85111,13 +85224,14 @@
 xref: RHEA:70283
 xref: RHEA:71015
 xref: RHEA:78367
-is_a: GO:0016641 ! oxidoreductase activity, acting on the CH-NH2 group of donors, oxygen as acceptor
+is_a: GO:0097621 ! monoamine oxidase activity
 property_value: skos:exactMatch EC:1.4.3.21
 property_value: skos:exactMatch KEGG_REACTION:R01853
 property_value: skos:exactMatch MetaCyc:RXN-9597
 property_value: skos:exactMatch RHEA:16153
 property_value: skos:narrowMatch KEGG_REACTION:R02173
 property_value: skos:narrowMatch KEGG_REACTION:R02613
+property_value: skos:narrowMatch MetaCyc:AMINEOXID-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-10817
 property_value: skos:narrowMatch MetaCyc:RXN-1401
 property_value: skos:narrowMatch RHEA:25265
@@ -87498,7 +87612,6 @@
 namespace: biological_process
 def: "The directed movement of substances from endosomes to lysosomes." [GOC:ai, ISBN:0716731363]
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016192 ! vesicle-mediated transport
 
 [Term]
@@ -90354,6 +90467,7 @@
 def: "The process whose specific outcome is the progression of the epidermis over time, from its formation to the mature structure. The epidermis is the outer epithelial layer of an animal, it may be a single layer that produces an extracellular material (e.g. the cuticle of arthropods) or a complex stratified squamous epithelium, as in the case of many vertebrate species." [GOC:curators, UBERON:0001003]
 synonym: "hypodermis development" RELATED [GOC:kmv, GOC:rk]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0008545
@@ -93464,9 +93578,9 @@
 
 [Term]
 id: GO:0008774
-name: acetaldehyde dehydrogenase (acetylating) activity
+name: acetaldehyde dehydrogenase (acetylating, NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetaldehyde + CoA + NAD+ = acetyl-CoA + NADH + H+." [EC:1.2.1.10]
+def: "Catalysis of the reaction: acetaldehyde + CoA + NAD+ = acetyl-CoA + NADH + H+." [RHEA:23288]
 synonym: "acetaldehyde:NAD+ oxidoreductase (CoA-acetylating)" RELATED [EC:1.2.1.10]
 synonym: "acylating acetaldehyde dehydrogenase activity" RELATED [EC:1.2.1.10]
 synonym: "ADA" RELATED [EC:1.2.1.10]
@@ -95339,7 +95453,7 @@
 
 [Term]
 id: GO:0008883
-name: glutamyl-tRNA reductase activity
+name: glutamyl-tRNA reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: (S)-4-amino-5-oxopentanoate + NADP+ + tRNA(Glu) = L-glutamyl-tRNA(Glu) + H+ + NADPH." [EC:1.2.1.70, RHEA:12344]
 synonym: "L-glutamate-semialdehyde: NADP+ oxidoreductase (L-glutamyl-tRNAGlu-forming)" RELATED [EC:1.2.1.70]
@@ -95391,7 +95505,7 @@
 id: GO:0008886
 name: glyceraldehyde-3-phosphate dehydrogenase (NADP+) (non-phosphorylating) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-glyceraldehyde 3-phosphate + H2O + NADP+ = 3-phospho-D-glycerate + 2 H+ + NADPH." [EC:1.2.1.9, RHEA:14669]
+def: "Catalysis of the reaction: D-glyceraldehyde 3-phosphate + H2O + NADP+ = 3-phospho-D-glycerate + 2 H+ + NADPH." [RHEA:14669]
 synonym: "D-glyceraldehyde-3-phosphate:NADP+ oxidoreductase activity" EXACT []
 synonym: "dehydrogenase, glyceraldehyde phosphate (nicotinamide adenine dinucleotide phosphate)" BROAD []
 synonym: "glyceraldehyde 3-phosphate dehydrogenase (NADP)" EXACT []
@@ -95406,7 +95520,8 @@
 xref: KEGG_REACTION:R01058
 xref: MetaCyc:1.2.1.9-RXN
 xref: RHEA:14669
-is_a: GO:0120533 ! glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (non-phosphorylating) activity
+is_a: GO:0033721 ! aldehyde dehydrogenase (NADP+) activity
+is_a: GO:0120533 ! glyceraldehyde-3-phosphate dehydrogenase (non-phosphorylating, [NAD(P)+] ) activity
 property_value: skos:exactMatch EC:1.2.1.9
 property_value: skos:exactMatch RHEA:14669
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28144" xsd:anyURI
@@ -98443,7 +98558,7 @@
 synonym: "aspartate family amino acid biosynthesis" EXACT []
 synonym: "aspartate family amino acid formation" EXACT []
 synonym: "aspartate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98593,7 +98708,7 @@
 synonym: "pyruvate family amino acid biosynthesis" EXACT []
 synonym: "pyruvate family amino acid formation" EXACT []
 synonym: "pyruvate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
@@ -98654,7 +98769,7 @@
 synonym: "glutamine family amino acid biosynthesis" EXACT []
 synonym: "glutamine family amino acid formation" EXACT []
 synonym: "glutamine family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98716,7 +98831,7 @@
 xref: UM-BBD_pathwayID:met
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006555 ! L-methionine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:METHIONINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5082
@@ -98769,8 +98884,8 @@
 synonym: "homoserine formation" EXACT []
 synonym: "homoserine synthesis" EXACT []
 xref: MetaCyc:HOMOSERSYN-PWY
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009092 ! L-homoserine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:exactMatch MetaCyc:HOMOSERSYN-PWY
 
@@ -98794,7 +98909,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving homoserine, alpha-amino-gamma-hydroxybutyric acid, an intermediate in the biosynthesis of cystathionine, threonine and methionine." [ISBN:0198506732]
 synonym: "homoserine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -99340,7 +99454,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving a nucleoside triphosphate, a compound consisting of a nucleobase linked to a deoxyribose or ribose sugar esterified with triphosphate on the sugar." [GOC:curators, ISBN:0198506732]
 synonym: "nucleoside triphosphate metabolism" EXACT []
-is_a: GO:0006753 ! nucleoside phosphate metabolic process
+is_a: GO:0006793 ! phosphorus metabolic process
 
 [Term]
 id: GO:0009142
@@ -99351,8 +99465,8 @@
 synonym: "nucleoside triphosphate biosynthesis" EXACT []
 synonym: "nucleoside triphosphate formation" EXACT []
 synonym: "nucleoside triphosphate synthesis" EXACT []
+is_a: GO:0009058 ! biosynthetic process
 is_a: GO:0009141 ! nucleoside triphosphate metabolic process
-is_a: GO:1901293 ! nucleoside phosphate biosynthetic process
 
 [Term]
 id: GO:0009143
@@ -99362,8 +99476,8 @@
 synonym: "nucleoside triphosphate breakdown" EXACT []
 synonym: "nucleoside triphosphate catabolism" EXACT []
 synonym: "nucleoside triphosphate degradation" EXACT []
+is_a: GO:0009056 ! catabolic process
 is_a: GO:0009141 ! nucleoside triphosphate metabolic process
-is_a: GO:1901292 ! nucleoside phosphate catabolic process
 
 [Term]
 id: GO:0009144
@@ -99371,7 +99485,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving purine nucleoside triphosphate, a compound consisting of a purine base linked to a ribose or deoxyribose sugar esterified with triphosphate on the sugar." [GOC:curators, ISBN:0198506732]
 synonym: "purine nucleoside triphosphate metabolism" EXACT []
-is_a: GO:0009141 ! nucleoside triphosphate metabolic process
+is_a: GO:0006753 ! nucleoside phosphate metabolic process
 
 [Term]
 id: GO:0009145
@@ -99382,8 +99496,8 @@
 synonym: "purine nucleoside triphosphate biosynthesis" EXACT []
 synonym: "purine nucleoside triphosphate formation" EXACT []
 synonym: "purine nucleoside triphosphate synthesis" EXACT []
-is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009144 ! purine nucleoside triphosphate metabolic process
+is_a: GO:1901293 ! nucleoside phosphate biosynthetic process
 
 [Term]
 id: GO:0009146
@@ -99393,8 +99507,8 @@
 synonym: "purine nucleoside triphosphate breakdown" EXACT []
 synonym: "purine nucleoside triphosphate catabolism" EXACT []
 synonym: "purine nucleoside triphosphate degradation" EXACT []
-is_a: GO:0009143 ! nucleoside triphosphate catabolic process
 is_a: GO:0009144 ! purine nucleoside triphosphate metabolic process
+is_a: GO:1901292 ! nucleoside phosphate catabolic process
 
 [Term]
 id: GO:0009147
@@ -99402,7 +99516,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving pyrimidine nucleoside triphosphate, a compound consisting of a pyrimidine base linked to a ribose or deoxyribose sugar esterified with triphosphate on the sugar." [GOC:curators, ISBN:0198506732]
 synonym: "pyrimidine nucleoside triphosphate metabolism" EXACT []
-is_a: GO:0009141 ! nucleoside triphosphate metabolic process
+is_a: GO:0006753 ! nucleoside phosphate metabolic process
 
 [Term]
 id: GO:0009148
@@ -99413,8 +99527,8 @@
 synonym: "pyrimidine nucleoside triphosphate biosynthesis" EXACT []
 synonym: "pyrimidine nucleoside triphosphate formation" EXACT []
 synonym: "pyrimidine nucleoside triphosphate synthesis" EXACT []
-is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009147 ! pyrimidine nucleoside triphosphate metabolic process
+is_a: GO:1901293 ! nucleoside phosphate biosynthetic process
 
 [Term]
 id: GO:0009149
@@ -99424,8 +99538,8 @@
 synonym: "pyrimidine nucleoside triphosphate breakdown" EXACT []
 synonym: "pyrimidine nucleoside triphosphate catabolism" EXACT []
 synonym: "pyrimidine nucleoside triphosphate degradation" EXACT []
-is_a: GO:0009143 ! nucleoside triphosphate catabolic process
 is_a: GO:0009147 ! pyrimidine nucleoside triphosphate metabolic process
+is_a: GO:1901292 ! nucleoside phosphate catabolic process
 
 [Term]
 id: GO:0009150
@@ -99979,7 +100093,7 @@
 synonym: "ribonucleoside triphosphate biosynthesis" EXACT []
 synonym: "ribonucleoside triphosphate formation" EXACT []
 synonym: "ribonucleoside triphosphate synthesis" EXACT []
-is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
+is_a: GO:1901293 ! nucleoside phosphate biosynthetic process
 
 [Term]
 id: GO:0009202
@@ -100001,7 +100115,7 @@
 synonym: "ribonucleoside triphosphate breakdown" EXACT []
 synonym: "ribonucleoside triphosphate catabolism" EXACT []
 synonym: "ribonucleoside triphosphate degradation" EXACT []
-is_a: GO:0009143 ! nucleoside triphosphate catabolic process
+is_a: GO:1901292 ! nucleoside phosphate catabolic process
 
 [Term]
 id: GO:0009204
@@ -100582,7 +100696,6 @@
 synonym: "K antigen formation" EXACT []
 synonym: "K antigen synthesis" EXACT []
 is_a: GO:0000271 ! polysaccharide biosynthetic process
-is_a: GO:0046375 ! K antigen metabolic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
 
 [Term]
@@ -100696,13 +100809,9 @@
 synonym: "10-formyltetrahydrofolate biosynthesis" EXACT []
 synonym: "10-formyltetrahydrofolate formation" EXACT []
 synonym: "10-formyltetrahydrofolate synthesis" EXACT []
-xref: MetaCyc:1CMET2-PWY
-xref: MetaCyc:PWY-3841
 is_a: GO:0009256 ! 10-formyltetrahydrofolate metabolic process
 is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
 is_a: GO:0046654 ! tetrahydrofolate biosynthetic process
-property_value: skos:narrowMatch MetaCyc:1CMET2-PWY
-property_value: skos:narrowMatch MetaCyc:PWY-3841
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
 
 [Term]
@@ -105804,6 +105913,7 @@
 name: photosynthetic electron transport in photosystem I
 namespace: biological_process
 def: "A photosynthetic electron transport chain in which electrons move from the primary electron acceptor (Quinone, X) through a chain of electron transport molecules in the thylakoid membrane until they reach ferredoxin which passes the electron to the ultimate electron acceptor; NADP." [GOC:jid, ISBN:0716731363, ISBN:0816017360]
+synonym: "photosynthetic NADP+ reduction" EXACT []
 is_a: GO:0009767 ! photosynthetic electron transport chain
 
 [Term]
@@ -105832,11 +105942,13 @@
 
 [Term]
 id: GO:0009780
-name: photosynthetic NADP+ reduction
+name: obsolete photosynthetic NADP+ reduction
 namespace: biological_process
-def: "An NADPH regeneration process that contributes to the light reactions of photosynthesis. The light reactions of photosynthesis use energy from photons to generate high-energy electrons. These electrons are used directly to reduce NADP+ to NADPH. NADPH is a relatively stable molecule and can pass on its hydrogen atom to other molecules in chemical reactions." [GOC:jid, ISBN:0716746840, ISBN:0816017360]
-is_a: GO:0006740 ! NADPH regeneration
-relationship: part_of GO:0019684 ! photosynthesis, light reaction
+def: "OBSOLETE. An NADPH regeneration process that contributes to the light reactions of photosynthesis. The light reactions of photosynthesis use energy from photons to generate high-energy electrons. These electrons are used directly to reduce NADP+ to NADPH. NADPH is a relatively stable molecule and can pass on its hydrogen atom to other molecules in chemical reactions." [GOC:jid, ISBN:0716746840, ISBN:0816017360]
+comment: This term was obsoleted because it represents the same process as photosynthetic electron transport in photosystem I ; GO:0009773.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29818" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009773
 
 [Term]
 id: GO:0009781
@@ -105955,7 +106067,6 @@
 xref: Reactome:R-HSA-5619507 "Activation of HOX genes during differentiation"
 xref: Wikipedia:Embryogenesis
 is_a: GO:0007275 ! multicellular organism development
-is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009791
@@ -105973,6 +106084,7 @@
 def: "The process whose specific outcome is the progression of an embryo over time, from zygote formation until the end of the embryonic life stage. The end of the embryonic life stage is organism-specific and may be somewhat arbitrary; for mammals it is usually considered to be birth, for insects the hatching of the first instar larva from the eggshell." [GOC:curators, GOC:isa_complete, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009793
@@ -105981,7 +106093,6 @@
 def: "The process whose specific outcome is the progression of the embryo over time, from zygote formation to the end of seed dormancy. An example of this process is found in Arabidopsis thaliana." [GOC:curators, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -106943,7 +107054,7 @@
 synonym: "histogenesis" EXACT []
 synonym: "histogenesis and organogenesis" BROAD []
 xref: Wikipedia:Histogenesis
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 
 [Term]
 id: GO:0009889
@@ -107795,7 +107906,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endosperm over time, from its formation to the mature structure. The endosperm is formed during fertilization and provides nutrients to the developing embryo." [GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -109122,7 +109232,6 @@
 def: "The process whose specific outcome is the progression of phloem and/or xylem over time, from formation to the mature structure. An example of this process is found in Arabidopsis thaliana." [GOC:mtg_sensu, GOC:tb]
 synonym: "vascular tissue development" BROAD []
 synonym: "vascular tissue histogenesis" EXACT []
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -109217,7 +109326,6 @@
 name: suspensor development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the suspensor over time, from its formation to the mature structure. The suspensor is the extension at the base of the embryo that anchors the embryo in the embryo sac and pushes it into the endosperm." [GOC:tb, ISBN:0471245208]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -110409,7 +110517,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the seed coat over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
@@ -110804,7 +110911,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the floral nectaries over time, from its formation to the mature structure." [GOC:lr]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
@@ -113023,7 +113129,6 @@
 name: stele development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stele over time, from its formation to the mature structure. The stele is the central column of primary vascular tissue in the root and any tissue that it surrounds." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
@@ -113185,8 +113290,8 @@
 synonym: "single organism intercellular transport" RELATED [GOC:TermGenie]
 synonym: "single-organism intercellular transport" RELATED []
 is_a: GO:0006810 ! transport
-is_a: GO:0009987 ! cellular process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31545" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32166" xsd:anyURI
 created_by: jl
 creation_date: 2013-12-19T13:24:56Z
 
@@ -116870,7 +116975,6 @@
 name: stipule development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stipule over time, from its formation to the mature structure. A stipule is one of (usually) a pair of appendages at the bases of leaves in many broad-leaved angiosperms." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048366 ! leaf development
 
@@ -118635,6 +118739,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the morula over time. The morula is a spherical embryonic mass of blastomeres formed before the blastula and resulting from cleavage of the fertilized ovum." [PMID:37935903, PMID:38386558, PMID:39361745]
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29162" xsd:anyURI
 created_by: pg
 creation_date: 2024-11-12T09:13:07Z
@@ -127050,7 +127155,9 @@
 synonym: "N-acetyl-D-glucosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylchitosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylglucosamine permease activity" RELATED []
+xref: RHEA:86427
 is_a: GO:1901505 ! carbohydrate derivative transmembrane transporter activity
+property_value: skos:narrowMatch RHEA:86427
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 
@@ -129804,7 +129911,6 @@
 comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
 synonym: "peroxisomal long-chain fatty acid import" EXACT []
 synonym: "peroxisomal long-chain fatty acid uptake" EXACT [GOC:dph, GOC:tb]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015909 ! long-chain fatty acid transport
 is_a: GO:0015919 ! peroxisomal membrane transport
 is_a: GO:0032365 ! intracellular lipid transport
@@ -130703,7 +130809,7 @@
 
 [Term]
 id: GO:0016002
-name: obsolete obsolete sulfite reductase activity
+name: obsolete sulfite reductase activity
 namespace: molecular_function
 def: "OBSOLETE. Catalysis of the reaction: hydrogen sulfide + acceptor + 3 H2O = sulfite + reduced acceptor." [GOC:curators]
 comment: The reason for obsoletion is that this term was an unnecessary grouping term.
@@ -130884,8 +130990,15 @@
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
@@ -133453,8 +133566,8 @@
 synonym: "selenocysteine synthesis" EXACT []
 xref: MetaCyc:PWY-6281
 xref: MetaCyc:PWY0-901
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0042398 ! modified amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6281
 property_value: skos:narrowMatch MetaCyc:PWY0-901
@@ -133469,8 +133582,8 @@
 synonym: "selenocysteine catabolic process" EXACT []
 synonym: "selenocysteine catabolism" EXACT []
 synonym: "selenocysteine degradation" EXACT []
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 
 [Term]
@@ -136815,9 +136928,9 @@
 
 [Term]
 id: GO:0016621
-name: cinnamoyl-CoA reductase activity
+name: cinnamoyl-CoA reductase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cinnamaldehyde + CoA + NADP+ = cinnamoyl-CoA + NADPH + H+." [EC:1.2.1.44]
+def: "Catalysis of the reaction: (E)-cinnamaldehyde + NADP+ + CoA = (E)-cinnamoyl-CoA + NADPH + H+." [RHEA:10620]
 synonym: "cinnamaldehyde:NADP+ oxidoreductase (CoA-cinnamoylating)" RELATED [EC:1.2.1.44]
 synonym: "cinnamoyl CoA reductase activity" EXACT []
 synonym: "cinnamoyl-CoA:NADPH reductase activity" RELATED [EC:1.2.1.44]
@@ -138872,7 +138985,7 @@
 namespace: molecular_function
 alt_id: GO:0003869
 alt_id: GO:0016302
-def: "Catalysis of the hydrolysis of a phosphoric monoester, releasing a phosphate." [GOC:curators, GOC:pg]
+def: "Catalysis of the hydrolysis of a phosphoric monoester, releasing a phosphate." [GOC:curators]
 subset: goslim_candida
 subset: goslim_chembl
 subset: goslim_drosophila
@@ -142023,7 +142136,7 @@
 
 [Term]
 id: GO:0017084
-name: delta1-pyrroline-5-carboxylate synthetase activity
+name: delta1-pyrroline-5-carboxylate synthetase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: ATP + H+ + L-glutamate + NADPH = ADP + L-glutamate 5-semialdehyde + NADP+ + phosphate." [RHEA:33207]
 synonym: "D1-pyrroline-5-carboxylate synthetase activity" EXACT []
@@ -146940,7 +147053,6 @@
 xref: RESID:AA0029
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -146953,7 +147065,6 @@
 xref: RESID:AA0030
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -147781,7 +147892,7 @@
 
 [Term]
 id: GO:0018478
-name: malonate-semialdehyde dehydrogenase (acetylating) activity
+name: malonate-semialdehyde dehydrogenase (acetylating, [NAD(P)+]) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 3-oxopropanoate + CoA + NAD(P)+ = acetyl-CoA + CO2 + NAD(P)H." [EC:1.2.1.18]
 synonym: "3-oxopropanoate:NAD(P)+ oxidoreductase (decarboxylating, CoA-acetylating)" RELATED [EC:1.2.1.18]
@@ -147790,7 +147901,7 @@
 xref: MetaCyc:RXN-9958
 xref: RHEA:22988
 xref: RHEA:22992
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004030 ! aldehyde dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.2.1.18
 property_value: skos:narrowMatch RHEA:22988
 property_value: skos:narrowMatch RHEA:22992
@@ -147815,41 +147926,41 @@
 
 [Term]
 id: GO:0018480
-name: 5-carboxymethyl-2-hydroxymuconic-semialdehyde dehydrogenase activity
+name: 5-carboxymethyl-2-hydroxymuconic-semialdehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-carboxymethyl-2-hydroxymuconate semialdehyde + H2O + NAD+ = 5-carboxymethyl-2-hydroxymuconate + NADH + H+." [EC:1.2.1.60]
+def: "Catalysis of the reaction: 2-hydroxy-5-carboxymethylmuconate semialdehyde + NAD+ + H2O = (2E,4Z)-5-hydroxypenta-2,4-diene-1,2,5-tricarboxylate + NADH + 2 H+." [RHEA:15681]
 synonym: "5-carboxymethyl-2-hydroxymuconic-semialdehyde:NAD+ oxidoreductase activity" RELATED [EC:1.2.1.60]
 synonym: "carboxymethylhydroxymuconic semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.60]
 xref: EC:1.2.1.60
 xref: MetaCyc:CHMS-DEHYDROGENASE-RXN
 xref: RHEA:15681
 xref: UM-BBD_reactionID:r0365
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.60
 property_value: skos:exactMatch RHEA:15681
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0018481
-name: 4-hydroxymuconic-semialdehyde dehydrogenase activity
+name: 4-hydroxymuconic-semialdehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: <stereo>cis,trans</stereo>-4-hydroxymuconate semialdehyde + H2O + NAD+ = 2 H+ + maleylacetate + NADH." [EC:1.2.1.61, RHEA:22420]
+def: "Catalysis of the reaction: cis,trans-4-hydroxymuconate semialdehyde + NAD+ + H2O = maleylacetate + NADH + 2 H+." [RHEA:22420]
 synonym: "4-hydroxymuconic-semialdehyde:NAD+ oxidoreductase activity" RELATED [EC:1.2.1.61]
 xref: EC:1.2.1.61
 xref: KEGG_REACTION:R05236
 xref: MetaCyc:1.2.1.61-RXN
 xref: RHEA:22420
 xref: UM-BBD_reactionID:r0229
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.61
 property_value: skos:exactMatch RHEA:22420
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0018482
-name: 4-formylbenzenesulfonate dehydrogenase activity
+name: 4-formylbenzenesulfonate dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-formylbenzenesulfonate + H2O + NAD+ = 4-sulfobenzoate + 2 H+ + NADH." [EC:1.2.1.62, RHEA:18833]
+def: "Catalysis of the reaction: 4-formylbenzenesulfonate + NAD+ + H2O = 4-sulfobenzoate + NADH + 2 H+." [RHEA:18833]
 synonym: "4-formylbenzenesulfonate:NAD+ oxidoreductase activity" RELATED [EC:1.2.1.62]
 synonym: "4-formylbenzenesulphonate dehydrogenase activity" EXACT []
 synonym: "toluene-sulfonate aldehyde dehydrogenase activity" EXACT []
@@ -147865,18 +147976,19 @@
 
 [Term]
 id: GO:0018483
-name: 6-oxohexanoate dehydrogenase activity
+name: 6-oxohexanoate dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-oxohexanoate + NADP+ + H2O = adipate + NADPH + H+." [EC:1.2.1.63]
+def: "Catalysis of the reaction: 6-oxohexanoate + NADP+ + H2O = hexanedioate + NADPH + 2 H+." [RHEA:13397]
 synonym: "6-oxohexanoate:NADP+ oxidoreductase activity" RELATED [EC:1.2.1.63]
 xref: EC:1.2.1.63
 xref: MetaCyc:6-OXOHEXANOATE-OXIDATION-RXN
 xref: RHEA:13397
 xref: UM-BBD_reactionID:r0175
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0033721 ! aldehyde dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.2.1.63
 property_value: skos:exactMatch RHEA:13397
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0018484
@@ -148001,20 +148113,19 @@
 
 [Term]
 id: GO:0018491
-name: 2-oxobutyrate synthase activity
+name: obsolete 2-oxobutyrate synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxobutanoate + CoA + oxidized ferredoxin = propanoyl-CoA + CO2 + reduced ferredoxin." [GOC:curators]
+def: "OBSOLETE. Catalysis of the reaction: 2-oxobutanoate + CoA + oxidized ferredoxin = propanoyl-CoA + CO2 + reduced ferredoxin." [GOC:curators]
+comment: This term was obsoleted because it represents a specific substrate of pyruvate synthase activity ; GO:0019164.
 synonym: "2-ketobutyrate synthase activity" EXACT []
 synonym: "2-oxobutanoate:ferredoxin 2-oxidoreductase (CoA-propionylating)" EXACT []
 synonym: "2-oxobutyrate-ferredoxin oxidoreductase activity" EXACT []
 synonym: "alpha-ketobutyrate synthase activity" EXACT []
 synonym: "alpha-ketobutyrate-ferredoxin oxidoreductase activity" EXACT []
-xref: MetaCyc:2-OXOBUTYRATE-SYNTHASE-RXN
-xref: RHEA:32135
-xref: UM-BBD_reactionID:r0358
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
-property_value: skos:exactMatch RHEA:32135
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019164
 
 [Term]
 id: GO:0018492
@@ -151701,11 +151812,13 @@
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
@@ -152057,6 +152170,7 @@
 xref: RHEA:84407
 xref: RHEA:84627
 xref: RHEA:84631
+xref: RHEA:84655
 xref: RHEA:84659
 xref: RHEA:84663
 xref: RHEA:84667
@@ -152114,6 +152228,7 @@
 property_value: skos:narrowMatch RHEA:84407
 property_value: skos:narrowMatch RHEA:84627
 property_value: skos:narrowMatch RHEA:84631
+property_value: skos:narrowMatch RHEA:84655
 property_value: skos:narrowMatch RHEA:84659
 property_value: skos:narrowMatch RHEA:84663
 property_value: skos:narrowMatch RHEA:84667
@@ -152912,22 +153027,23 @@
 
 [Term]
 id: GO:0018876
-name: benzonitrile metabolic process
+name: obsolete benzonitrile metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving benzonitrile. Benzonitrile is used as a solvent and chemical intermediate in the pharmaceutical, dyestuffs and rubber industries. It is highly toxic and harmful in contact with skin." [UM-BBD_pathwayID:bzn]
+def: "OBSOLETE. The chemical reactions and pathways involving benzonitrile. Benzonitrile is used as a solvent and chemical intermediate in the pharmaceutical, dyestuffs and rubber industries. It is highly toxic and harmful in contact with skin." [UM-BBD_pathwayID:bzn]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "benzonitrile metabolism" EXACT []
-xref: UM-BBD_pathwayID:bzn
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0050898 ! nitrile metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018877
-name: beta-1,2,3,4,5,6-hexachlorocyclohexane metabolic process
+name: obsolete beta-1,2,3,4,5,6-hexachlorocyclohexane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving beta-1,2,3,4,5,6-hexachlorocyclohexane, a halogenated organic insecticide that has been used worldwide for agriculture and public health." [UM-BBD_pathwayID:hch]
+def: "OBSOLETE. The chemical reactions and pathways involving beta-1,2,3,4,5,6-hexachlorocyclohexane, a halogenated organic insecticide that has been used worldwide for agriculture and public health." [UM-BBD_pathwayID:hch]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "beta-1,2,3,4,5,6-hexachlorocyclohexane metabolism" EXACT []
-xref: UM-BBD_pathwayID:hch
-is_a: GO:0019497 ! hexachlorocyclohexane metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018878
@@ -152962,15 +153078,13 @@
 
 [Term]
 id: GO:0018881
-name: bromoxynil metabolic process
+name: obsolete bromoxynil metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving bromoxynil, C7H3Br2NO, a dibrominated phenol derivative with a cyano (-CN) group attached. Bromoxynil is used as a herbicide for post-emergent control of annual broadleaf weeds and works by inhibiting photosynthesis in the target plants." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving bromoxynil, C7H3Br2NO, a dibrominated phenol derivative with a cyano (-CN) group attached. Bromoxynil is used as a herbicide for post-emergent control of annual broadleaf weeds and works by inhibiting photosynthesis in the target plants." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "bromoxynil metabolism" EXACT []
-xref: UM-BBD_pathwayID:box
-is_a: GO:0018958 ! phenol-containing compound metabolic process
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0050898 ! nitrile metabolic process
-is_a: GO:0090345 ! organohalogen metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018882
@@ -153018,35 +153132,35 @@
 
 [Term]
 id: GO:0018886
-name: anaerobic carbon tetrachloride metabolic process
+name: obsolete anaerobic carbon tetrachloride metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving carbon tetrachloride, a toxic, carcinogenic compound which is used as a general solvent in industrial degreasing operations, that occur in the absence of oxygen." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving carbon tetrachloride, a toxic, carcinogenic compound which is used as a general solvent in industrial degreasing operations, that occur in the absence of oxygen." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "anaerobic carbon tetrachloride metabolism" EXACT []
-xref: UM-BBD_pathwayID:ctc
-is_a: GO:0018885 ! carbon tetrachloride metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018887
-name: 4-carboxy-4'-sulfoazobenzene metabolic process
+name: obsolete 4-carboxy-4'-sulfoazobenzene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 4-carboxy-4'-sulfoazobenzene, a sulfonated azo compound synthesized by nitro-amine condensation from sulfanilic acid and 4-nitrobenzoic acid." [PMID:9603860]
+def: "OBSOLETE. The chemical reactions and pathways involving 4-carboxy-4'-sulfoazobenzene, a sulfonated azo compound synthesized by nitro-amine condensation from sulfanilic acid and 4-nitrobenzoic acid." [PMID:9603860]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "4-carboxy-4'-sulfoazobenzene metabolism" EXACT []
 synonym: "4-carboxy-4'-sulphoazobenzene metabolic process" EXACT []
 synonym: "4-carboxy-4'-sulphoazobenzene metabolism" EXACT []
-xref: UM-BBD_pathwayID:csab
-is_a: GO:0006790 ! sulfur compound metabolic process
-is_a: GO:0032787 ! monocarboxylic acid metabolic process
-is_a: GO:0042537 ! benzene-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018888
-name: 3-chloroacrylic acid metabolic process
+name: obsolete 3-chloroacrylic acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 3-chloroacrylic acid, ClHC=CHCOOH, a chlorinated derivative of acrylic acid." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving 3-chloroacrylic acid, ClHC=CHCOOH, a chlorinated derivative of acrylic acid." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "3-chloroacrylic acid metabolism" EXACT []
-xref: UM-BBD_pathwayID:caa
-is_a: GO:0032787 ! monocarboxylic acid metabolic process
-is_a: GO:0090345 ! organohalogen metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018889
@@ -153082,16 +153196,15 @@
 
 [Term]
 id: GO:0018892
-name: cyclohexylsulfamate metabolic process
+name: obsolete cyclohexylsulfamate metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving cyclohexylsulfamate, also known as cyclamic acid. Sodium cyclohexylsulfamate (CHS-Na) was a widely used sweetening agent but was banned because of the suspicion of carcinogenicity and metabolic conversion to cyclohexylamine (CHA), a toxic substance. It is now used as a fungicide." [UM-BBD_pathwayID:chs]
+def: "OBSOLETE. The chemical reactions and pathways involving cyclohexylsulfamate, also known as cyclamic acid. Sodium cyclohexylsulfamate (CHS-Na) was a widely used sweetening agent but was banned because of the suspicion of carcinogenicity and metabolic conversion to cyclohexylamine (CHA), a toxic substance. It is now used as a fungicide." [UM-BBD_pathwayID:chs]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cyclohexylsulfamate metabolism" EXACT []
 synonym: "cyclohexylsulphamate metabolic process" EXACT []
 synonym: "cyclohexylsulphamate metabolism" EXACT []
-xref: UM-BBD_pathwayID:chs
-is_a: GO:0006790 ! sulfur compound metabolic process
-is_a: GO:0006805 ! xenobiotic metabolic process
-is_a: GO:0043436 ! oxoacid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018893
@@ -153209,16 +153322,17 @@
 
 [Term]
 id: GO:0018903
-name: 1,3-dichloropropene metabolic process
+name: obsolete 1,3-dichloropropene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving members of the 1,3-dichloropropene family, which includes cis- and trans-1,3-dichloropropene. The 1,3-dichloropropenes are chlorinated hydrocarbons and the major active ingredients of commercial products for control of plant-parasitic nematodes." [UM-BBD_pathwayID:cpr]
+def: "OBSOLETE. The chemical reactions and pathways involving members of the 1,3-dichloropropene family, which includes cis- and trans-1,3-dichloropropene. The 1,3-dichloropropenes are chlorinated hydrocarbons and the major active ingredients of commercial products for control of plant-parasitic nematodes." [UM-BBD_pathwayID:cpr]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "1,3-dichloropropene metabolism" EXACT []
 synonym: "1,3-dichloropropylene metabolic process" EXACT []
 synonym: "1,3-dichloropropylene metabolism" EXACT []
 synonym: "gamma-chloroallylchloride metabolic process" EXACT []
 synonym: "gamma-chloroallylchloride metabolism" EXACT []
-xref: UM-BBD_pathwayID:cpr
-is_a: GO:0042197 ! halogenated hydrocarbon metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018904
@@ -153234,23 +153348,25 @@
 
 [Term]
 id: GO:0018905
-name: dimethyl ether metabolic process
+name: obsolete dimethyl ether metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving dimethyl ether, CH3-O-CH3, the simplest ether. Dimethyl ether, also known wood ether and methyl ether, is a colorless gas that has been used in refrigeration applications." [UM-BBD_pathwayID:dme]
+def: "OBSOLETE. The chemical reactions and pathways involving dimethyl ether, CH3-O-CH3, the simplest ether. Dimethyl ether, also known wood ether and methyl ether, is a colorless gas that has been used in refrigeration applications." [UM-BBD_pathwayID:dme]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "dimethyl ether metabolism" EXACT []
 synonym: "methyl ether metabolic process" EXACT []
 synonym: "methyl ether metabolism" EXACT []
-xref: UM-BBD_pathwayID:dme
-is_a: GO:0006805 ! xenobiotic metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018906
-name: methyl tert-butyl ether metabolic process
+name: obsolete methyl tert-butyl ether metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving methyl tert-butyl ether, 2-methoxy-2-methylpropane. Methyl tert-butyl ether is a synthetic chemical which is mixed with gasoline for use in reformulated gasoline. It was first introduced as an additive for unleaded gasoline in the 1980s. It is also used as a laboratory reagent and a pharmaceutical agent." [UM-BBD_pathwayID:mtb]
+def: "OBSOLETE. The chemical reactions and pathways involving methyl tert-butyl ether, 2-methoxy-2-methylpropane. Methyl tert-butyl ether is a synthetic chemical which is mixed with gasoline for use in reformulated gasoline. It was first introduced as an additive for unleaded gasoline in the 1980s. It is also used as a laboratory reagent and a pharmaceutical agent." [UM-BBD_pathwayID:mtb]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "methyl tert-butyl ether metabolism" EXACT []
-xref: UM-BBD_pathwayID:mtb
-is_a: GO:0006805 ! xenobiotic metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018907
@@ -153366,13 +153482,15 @@
 
 [Term]
 id: GO:0018919
-name: gamma-1,2,3,4,5,6-hexachlorocyclohexane metabolic process
+name: gamma-1,2,3,4,5,6-hexachlorocyclohexane catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving gamma-1,2,3,4,5,6-hexachlorocyclohexane (also known as Lindane), the most common form of hexachlorohexane, a halogenated organic insecticide that has been used worldwide for agriculture and public health." [UM-BBD_pathwayID:ghch]
+def: "The chemical reactions and pathways  resulting in the breakdown of  gamma-1,2,3,4,5,6-hexachlorocyclohexane (also known as Lindane), the most common form of hexachlorohexane, a halogenated organic insecticide that has been used worldwide for agriculture and public health." [MetaCyc:GAMMAHEXCHLORDEG-PWY]
 synonym: "gamma-1,2,3,4,5,6-hexachlorocyclohexane metabolism" EXACT []
 xref: MetaCyc:GAMMAHEXCHLORDEG-PWY
 xref: UM-BBD_pathwayID:ghch
+is_a: GO:0009056 ! catabolic process
 is_a: GO:0019497 ! hexachlorocyclohexane metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 
 [Term]
 id: GO:0018920
@@ -153389,24 +153507,23 @@
 
 [Term]
 id: GO:0018921
-name: 3-hydroxybenzyl alcohol metabolic process
+name: obsolete 3-hydroxybenzyl alcohol metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 3-hydroxybenzyl alcohol, an aromatic compound which is an intermediate in several metabolic pathways, including the biosynthesis of patulin, a toxin and antiviral agent produced by some moulds such as Penicillium patulinum." [UM-BBD_pathwayID:mcr]
+def: "OBSOLETE. The chemical reactions and pathways involving 3-hydroxybenzyl alcohol, an aromatic compound which is an intermediate in several metabolic pathways, including the biosynthesis of patulin, a toxin and antiviral agent produced by some moulds such as Penicillium patulinum." [UM-BBD_pathwayID:mcr]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "3-hydroxybenzyl alcohol metabolism" EXACT []
-xref: UM-BBD_pathwayID:mcr
-is_a: GO:0006066 ! alcohol metabolic process
-is_a: GO:0018958 ! phenol-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018922
-name: iprodione metabolic process
+name: obsolete iprodione metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving prodione, a colorless, odorless crystal. It is used as a dicarboximide contact fungicide to control a wide variety of crop diseases by inhibiting the germination of spores and the growth of the fungal mat (mycelium)." [UM-BBD_pathwayID:ipd]
+def: "OBSOLETE. The chemical reactions and pathways involving prodione, a colorless, odorless crystal. It is used as a dicarboximide contact fungicide to control a wide variety of crop diseases by inhibiting the germination of spores and the growth of the fungal mat (mycelium)." [UM-BBD_pathwayID:ipd]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "iprodione metabolism" EXACT []
-xref: UM-BBD_pathwayID:ipd
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0052803 ! imidazole-containing compound metabolic process
-is_a: GO:0090345 ! organohalogen metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018923
@@ -153447,16 +153564,15 @@
 
 [Term]
 id: GO:0018926
-name: methanesulfonic acid metabolic process
+name: obsolete methanesulfonic acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving methanesulfonic acid, a strong acid produced by the oxidation of dimethyl sulfide." [UM-BBD_pathwayID:msa]
+def: "OBSOLETE. The chemical reactions and pathways involving methanesulfonic acid, a strong acid produced by the oxidation of dimethyl sulfide." [UM-BBD_pathwayID:msa]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "methanesulfonic acid metabolism" EXACT []
 synonym: "methanesulphonic acid metabolic process" EXACT []
 synonym: "methanesulphonic acid metabolism" EXACT []
-xref: UM-BBD_pathwayID:msa
-is_a: GO:0006805 ! xenobiotic metabolic process
-is_a: GO:0019694 ! alkanesulfonate metabolic process
-is_a: GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018927
@@ -153485,13 +153601,13 @@
 
 [Term]
 id: GO:0018929
-name: methyl fluoride metabolic process
+name: obsolete methyl fluoride metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving methyl fluoride, fluorine-substituted methane, a gaseous halogenated hydrocarbon that has been investigated as an inhibitor of methanotrophy and nitrification in soils." [UM-BBD_pathwayID:mf]
+def: "OBSOLETE. The chemical reactions and pathways involving methyl fluoride, fluorine-substituted methane, a gaseous halogenated hydrocarbon that has been investigated as an inhibitor of methanotrophy and nitrification in soils." [UM-BBD_pathwayID:mf]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "methyl fluoride metabolism" EXACT []
-xref: UM-BBD_pathwayID:mf
-is_a: GO:0042197 ! halogenated hydrocarbon metabolic process
-is_a: GO:0090346 ! organofluorine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018930
@@ -153623,12 +153739,13 @@
 
 [Term]
 id: GO:0018944
-name: tri-n-butyltin metabolic process
+name: obsolete tri-n-butyltin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving tri-n-butyltin, an organometallic compound composed of three butyl chains attached to a tin atom. Tri-n-butyltin is used as an antifouling agent in ship bottom paints and can be toxic to many marine organisms." [GOC:ai, UM-BBD_pathwayID:tbt]
+def: "OBSOLETE. The chemical reactions and pathways involving tri-n-butyltin, an organometallic compound composed of three butyl chains attached to a tin atom. Tri-n-butyltin is used as an antifouling agent in ship bottom paints and can be toxic to many marine organisms." [GOC:ai, UM-BBD_pathwayID:tbt]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "tri-n-butyltin metabolism" EXACT []
-xref: UM-BBD_pathwayID:tbt
-is_a: GO:0018942 ! organometal metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018945
@@ -153735,12 +153852,13 @@
 
 [Term]
 id: GO:0018954
-name: pentaerythritol tetranitrate metabolic process
+name: obsolete pentaerythritol tetranitrate metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving pentaerythritol tetranitrate, C(CH2-O-NO2)4, a substance produced for use as an explosive and a vasodilator." [UM-BBD_pathwayID:petn]
+def: "OBSOLETE. The chemical reactions and pathways involving pentaerythritol tetranitrate, C(CH2-O-NO2)4, a substance produced for use as an explosive and a vasodilator." [UM-BBD_pathwayID:petn]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "pentaerythritol tetranitrate metabolism" EXACT []
-xref: UM-BBD_pathwayID:petn
-is_a: GO:0006805 ! xenobiotic metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018955
@@ -153871,14 +153989,13 @@
 
 [Term]
 id: GO:0018966
-name: styrene metabolic process
+name: obsolete styrene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving styrene, an aromatic hydrocarbon liquid soluble in ether and alcohol. When heated, exposed to light or added to a peroxide catalyst, it undergoes polymerization to form polystyrene, a versatile material used in the manufacture of plastics, synthetic rubber, thermal insulation, and packaging. Styrene is a classified mutagen and a suspected carcinogen." [GOC:jl, UM-BBD_pathwayID:sty]
+def: "OBSOLETE. The chemical reactions and pathways involving styrene, an aromatic hydrocarbon liquid soluble in ether and alcohol. When heated, exposed to light or added to a peroxide catalyst, it undergoes polymerization to form polystyrene, a versatile material used in the manufacture of plastics, synthetic rubber, thermal insulation, and packaging. Styrene is a classified mutagen and a suspected carcinogen." [GOC:jl, UM-BBD_pathwayID:sty]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "styrene metabolism" EXACT []
-xref: UM-BBD_pathwayID:sty
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0120252 ! hydrocarbon metabolic process
-is_a: GO:0120254 ! olefinic compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018967
@@ -153922,15 +154039,16 @@
 
 [Term]
 id: GO:0018970
-name: toluene metabolic process
+name: obsolete toluene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving toluene, a volatile monoaromatic hydrocarbon found in crude petroleum and petroleum products such as gasoline and commonly used as a paint thinning agent and in other solvent applications." [GOC:curators]
+def: "OBSOLETE. The chemical reactions and pathways involving toluene, a volatile monoaromatic hydrocarbon found in crude petroleum and petroleum products such as gasoline and commonly used as a paint thinning agent and in other solvent applications." [GOC:curators]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "methylbenzene metabolic process" EXACT []
 synonym: "methylbenzene metabolism" EXACT []
 synonym: "toluene metabolism" EXACT []
-is_a: GO:0042537 ! benzene-containing compound metabolic process
-is_a: GO:0120252 ! hydrocarbon metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018971
@@ -153992,36 +154110,37 @@
 
 [Term]
 id: GO:0018976
-name: 1,2,3-tribromopropane metabolic process
+name: obsolete 1,2,3-tribromopropane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 1,2,3-tribromopropane, a toxic and volatile organic compound commonly used as a nematocide in agriculture." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways involving 1,2,3-tribromopropane, a toxic and volatile organic compound commonly used as a nematocide in agriculture." [GOC:jl]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "1,2,3-tribromopropane metabolism" EXACT []
-xref: UM-BBD_pathwayID:tbp
-is_a: GO:0042197 ! halogenated hydrocarbon metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018977
-name: 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
+name: obsolete 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane (DDT), a chlorinated broad spectrum contact insecticide." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways involving 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane (DDT), a chlorinated broad spectrum contact insecticide." [GOC:jl]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolism" EXACT []
 synonym: "DDT metabolic process" EXACT []
 synonym: "DDT metabolism" EXACT []
-xref: UM-BBD_pathwayID:ddt
-is_a: GO:0017143 ! insecticide metabolic process
-is_a: GO:0042197 ! halogenated hydrocarbon metabolic process
-is_a: GO:0042537 ! benzene-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018978
-name: anaerobic 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
+name: obsolete anaerobic 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane (DDT), a chlorinated, broad spectrum, contact insecticide, in the absence of oxygen." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways involving 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane (DDT), a chlorinated, broad spectrum, contact insecticide, in the absence of oxygen." [GOC:jl]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "anaerobic 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolism" EXACT []
 synonym: "anaerobic DDT metabolic process" EXACT []
 synonym: "anaerobic DDT metabolism" EXACT []
-xref: UM-BBD_pathwayID:ddt2
-is_a: GO:0018977 ! 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018979
@@ -154084,15 +154203,16 @@
 
 [Term]
 id: GO:0018984
-name: naphthalenesulfonate metabolic process
+name: obsolete naphthalenesulfonate metabolic process
 namespace: biological_process
 alt_id: GO:0018932
-def: "The chemical reactions and pathways involving naphthalenesulfonate, sulfonated derivatives of naphthalene." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving naphthalenesulfonate, sulfonated derivatives of naphthalene." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "naphthalenesulfonate metabolism" EXACT []
 synonym: "naphthalenesulphonate metabolic process" EXACT []
 synonym: "naphthalenesulphonate metabolism" EXACT []
-xref: UM-BBD_pathwayID:nphs
-is_a: GO:0006790 ! sulfur compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018985
@@ -155138,51 +155258,60 @@
 
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
@@ -156104,10 +156233,12 @@
 xref: KEGG_REACTION:R01196
 xref: MetaCyc:PYRUFLAVREDUCT-RXN
 xref: RHEA:12765
+xref: RHEA:32135
 is_a: GO:0016625 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, iron-sulfur protein as acceptor
 relationship: part_of GO:0006086 ! pyruvate decarboxylation to acetyl-CoA
 property_value: skos:exactMatch EC:1.2.7.1
 property_value: skos:exactMatch RHEA:12765
+property_value: skos:narrowMatch RHEA:32135
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -158018,12 +158149,13 @@
 
 [Term]
 id: GO:0019330
-name: aldoxime metabolic process
+name: obsolete aldoxime metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving aldoximes, compounds derived by the reaction of an aldose with hydroxylamine, thus containing the aldoxime group -HC=NOH." [GOC:curators]
+def: "OBSOLETE. The chemical reactions and pathways involving aldoximes, compounds derived by the reaction of an aldose with hydroxylamine, thus containing the aldoxime group -HC=NOH." [GOC:curators]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "aldoxime metabolism" EXACT []
-xref: MetaCyc:P345-PWY
-is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0019331
@@ -158219,7 +158351,6 @@
 xref: MetaCyc:PWY-I9
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:CYSTSYN-PWY
 property_value: skos:narrowMatch MetaCyc:HOMOCYSDEGR-PWY
@@ -158258,7 +158389,6 @@
 xref: Reactome:R-HSA-1614603 "Cysteine formation from homocysteine"
 xref: Wikipedia:Transsulfuration_pathway
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -159469,7 +159599,7 @@
 xref: MetaCyc:LCYSDEG-PWY
 xref: MetaCyc:PWY-5329
 is_a: GO:0000098 ! sulfur amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:CYSTEINE-DEG-PWY
 property_value: skos:narrowMatch MetaCyc:LCYSDEG-PWY
@@ -159730,8 +159860,8 @@
 synonym: "4-hydroxyproline degradation" EXACT []
 xref: MetaCyc:HYDROXYPRODEG-PWY
 xref: MetaCyc:PWY-5159
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:HYDROXYPRODEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5159
@@ -159835,7 +159965,7 @@
 xref: MetaCyc:PWY-6328
 xref: MetaCyc:PWY0-461
 xref: MetaCyc:PWY66-425
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LYSDEGII-PWY
 property_value: skos:narrowMatch MetaCyc:LYSINE-DEG1-PWY
@@ -159861,7 +159991,6 @@
 synonym: "D-amino acid catabolism" EXACT []
 synonym: "D-amino acid degradation" EXACT []
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0046416 ! D-amino acid metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 
 [Term]
@@ -160079,10 +160208,13 @@
 
 [Term]
 id: GO:0019496
-name: serine-isocitrate lyase pathway
+name: obsolete serine-isocitrate lyase pathway
 namespace: biological_process
-def: "A one-carbon metabolic process in which acetyl-CoA is produced from formaldehyde and carbon dioxide." [ISBN:0387961534]
-is_a: GO:0006730 ! one-carbon metabolic process
+def: "OBSOLETE. A one-carbon metabolic process in which acetyl-CoA is produced from formaldehyde and carbon dioxide." [ISBN:0387961534]
+comment: The reason for obsoletion is that the data from the paper for which the term was requested can be accurately described using GO:0019649 formaldehyde assimilation.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32288" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019649
 
 [Term]
 id: GO:0019497
@@ -160175,8 +160307,8 @@
 xref: MetaCyc:P561-PWY
 xref: MetaCyc:PWY-8109
 is_a: GO:0006579 ! amino-acid betaine catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009822 ! alkaloid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:P561-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8109
@@ -161293,20 +161425,12 @@
 
 [Term]
 id: GO:0019600
-name: toluene oxidation
+name: obsolete toluene oxidation
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the loss of electrons from one or more atoms in toluene." [GOC:mah]
-xref: MetaCyc:TOLUENE-DEG-2-OH-PWY
-xref: MetaCyc:TOLUENE-DEG-3-OH-PWY
-xref: MetaCyc:TOLUENE-DEG-4-OH-PWY
-xref: MetaCyc:TOLUENE-DEG-CATECHOL-PWY
-xref: MetaCyc:TOLUENE-DEG-DIOL-PWY
-is_a: GO:0018970 ! toluene metabolic process
-property_value: skos:narrowMatch MetaCyc:TOLUENE-DEG-2-OH-PWY
-property_value: skos:narrowMatch MetaCyc:TOLUENE-DEG-3-OH-PWY
-property_value: skos:narrowMatch MetaCyc:TOLUENE-DEG-4-OH-PWY
-property_value: skos:narrowMatch MetaCyc:TOLUENE-DEG-CATECHOL-PWY
-property_value: skos:narrowMatch MetaCyc:TOLUENE-DEG-DIOL-PWY
+def: "OBSOLETE. The chemical reactions and pathways resulting in the loss of electrons from one or more atoms in toluene." [GOC:mah]
+comment: This term was obsoleted because there is no evidence that this process exists.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0019601
@@ -161316,7 +161440,6 @@
 comment: This term was obsoleted because it represents a specific pathway variant, which is out of scope for GO.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31932" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019600
 
 [Term]
 id: GO:0019602
@@ -161326,7 +161449,6 @@
 comment: This term was obsoleted because it represents a specific pathway variant, which is out of scope for GO.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31932" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019600
 
 [Term]
 id: GO:0019603
@@ -161336,7 +161458,6 @@
 comment: This term was obsoleted because it represents a specific pathway variant, which is out of scope for GO.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31932" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019600
 
 [Term]
 id: GO:0019604
@@ -161346,7 +161467,6 @@
 comment: This term was obsoleted because it represents a specific pathway variant, which is out of scope for GO.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31932" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019600
 
 [Term]
 id: GO:0019605
@@ -161637,7 +161757,6 @@
 synonym: "short-chain fatty acid breakdown" EXACT []
 synonym: "short-chain fatty acid catabolism" EXACT []
 synonym: "short-chain fatty acid degradation" EXACT []
-xref: MetaCyc:ACETOACETATE-DEG-PWY
 xref: Reactome:R-HSA-71032 "Propionyl-CoA catabolism"
 is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0046459 ! short-chain fatty acid metabolic process
@@ -161907,9 +162026,11 @@
 namespace: biological_process
 def: "The pathways in which formaldehyde is processed and used as a carbon source for the cell." [GOC:ai]
 xref: MetaCyc:P185-PWY
+xref: MetaCyc:PWY-1622
 xref: MetaCyc:PWY-1861
 is_a: GO:0046292 ! formaldehyde metabolic process
 property_value: skos:narrowMatch MetaCyc:P185-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-1622
 property_value: skos:narrowMatch MetaCyc:PWY-1861
 
 [Term]
@@ -162533,7 +162654,6 @@
 comment: This term was obsoleted because it represents a specific pathway variant, which is out of scope for GO.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31932" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019600
 
 [Term]
 id: GO:0019697
@@ -162664,10 +162784,12 @@
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
@@ -167622,6 +167744,7 @@
 def: "The process in which neuroblasts acquire specialized structural and/or functional features that characterize the mature cerebellar Purkinje cell. Differentiation includes the processes involved in commitment of a neuroblast to a Purkinje cell fate. A Purkinje cell is an inhibitory GABAergic neuron found in the cerebellar cortex that projects to the deep cerebellar nuclei and brain stem." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:15157725]
 is_a: GO:0021533 ! cell differentiation in hindbrain
 is_a: GO:0021953 ! central nervous system neuron differentiation
+is_a: GO:0097154 ! GABAergic neuron differentiation
 relationship: part_of GO:0021694 ! cerebellar Purkinje cell layer formation
 
 [Term]
@@ -167697,6 +167820,7 @@
 def: "The process in which neuroblasts acquire specialized structural and/or functional features that characterize the mature cerebellar stellate cell. Differentiation includes the processes involved in commitment of a neuroblast to a cerebellar stellate cell fate. A cerebellar stellate cell is an inhibitory GABAergic interneuron found in the cerebellar cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:15157725]
 is_a: GO:0021533 ! cell differentiation in hindbrain
 is_a: GO:0021953 ! central nervous system neuron differentiation
+is_a: GO:0097154 ! GABAergic neuron differentiation
 relationship: part_of GO:0021688 ! cerebellar molecular layer formation
 
 [Term]
@@ -169118,6 +169242,7 @@
 namespace: biological_process
 def: "The process in which a neuroblast acquires specialized structural and/or functional features of a Cajal-Retzius cell, one of a transient population of pioneering neurons in the cerebral cortex. These cells are slender bipolar cells of the developing marginal zone. One feature of these cells in mammals is that they express the Reelin gene." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
 is_a: GO:0021895 ! cerebral cortex neuron differentiation
+is_a: GO:1905962 ! glutamatergic neuron differentiation
 
 [Term]
 id: GO:0021871
@@ -169295,7 +169420,7 @@
 name: olfactory bulb interneuron differentiation
 namespace: biological_process
 def: "The process in which a neuroblast acquires specialized features of an interneuron residing in the olfactory bulb." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0021879 ! forebrain neuron differentiation
+is_a: GO:0021953 ! central nervous system neuron differentiation
 relationship: part_of GO:0021772 ! olfactory bulb development
 
 [Term]
@@ -169311,7 +169436,7 @@
 name: olfactory bulb interneuron development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an interneuron residing in the olfactory bulb, from its initial commitment, to the fully functional differentiated cell." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0021884 ! forebrain neuron development
+is_a: GO:0021954 ! central nervous system neuron development
 relationship: part_of GO:0021889 ! olfactory bulb interneuron differentiation
 
 [Term]
@@ -172757,7 +172882,6 @@
 name: cell projection organization
 namespace: biological_process
 def: "A process that is carried out at the cellular level which results in the assembly, arrangement of constituent parts, or disassembly of a prolongation or process extending from a cell, e.g. a flagellum or axon." [GOC:jl, GOC:mah, PMID:16318917]
-subset: gocheck_do_not_annotate
 subset: goslim_prokaryote
 synonym: "cell projection organisation" EXACT []
 synonym: "cell projection organization and biogenesis" RELATED [GOC:mah]
@@ -172765,6 +172889,7 @@
 is_a: GO:0016043 ! cellular component organization
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23013" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26279" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32323" xsd:anyURI
 
 [Term]
 id: GO:0030031
@@ -173433,8 +173558,8 @@
 name: regulation of endocytosis
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of endocytosis." [GOC:curators]
+is_a: GO:0051049 ! regulation of transport
 is_a: GO:0051128 ! regulation of cellular component organization
-is_a: GO:0060627 ! regulation of vesicle-mediated transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0006897 ! endocytosis
 relationship: regulates GO:0006897 ! endocytosis
@@ -175525,6 +175650,7 @@
 def: "The deposition of hydroxyapatite, a form of calcium phosphate with the formula Ca10(PO4)6(OH)2, in bone tissue." [GOC:mah, PMID:22936354]
 synonym: "bone calcification" NARROW []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001503 ! ossification
 
 [Term]
@@ -176171,7 +176297,7 @@
 xref: Reactome:R-HSA-5602147 "Defective CYP2R1 does not 25-hydroxylate vitamin D"
 xref: RHEA:32903
 is_a: GO:0008395 ! steroid hydroxylase activity
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.14.24
 property_value: skos:exactMatch RHEA:32903
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
@@ -178886,7 +179012,7 @@
 synonym: "D-alanine formation" EXACT []
 synonym: "D-alanine synthesis" EXACT []
 is_a: GO:0006523 ! alanine biosynthetic process
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0030633
@@ -179794,7 +179920,7 @@
 synonym: "polar granule organisation" EXACT []
 synonym: "polar granule organization and biogenesis" EXACT [GOC:dph, GOC:tb]
 is_a: GO:0006996 ! organelle organization
-relationship: part_of GO:0007315 ! pole plasm assembly
+relationship: part_of GO:0007315 ! germ plasm assembly
 
 [Term]
 id: GO:0030720
@@ -180001,6 +180127,7 @@
 property_value: skos:exactMatch EC:2.1.1.22
 property_value: skos:exactMatch RHEA:14205
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32271" xsd:anyURI
 
 [Term]
 id: GO:0030736
@@ -180208,11 +180335,15 @@
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
 
@@ -183071,7 +183202,6 @@
 synonym: "protein dislocation from ER" EXACT [GOC:dph, GOC:krc]
 synonym: "protein retrotranslocation, ER to cytosol" EXACT [GOC:bf]
 synonym: "retrograde protein transport, endoplasmic reticulum to cytosol" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015031 ! protein transport
 relationship: part_of GO:0036503 ! ERAD pathway
 
@@ -185391,6 +185521,7 @@
 namespace: biological_process
 def: "The precipitation of calcium carbonate onto the organic matrix of a shell, such as a mollusc shell." [GOC:mah, PMID:15132736]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0031216
@@ -193050,14 +193181,22 @@
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
@@ -203616,9 +203755,9 @@
 
 [Term]
 id: GO:0032832
-name: obsolete obsolete regulation of CD4-positive, CD25-positive, alpha-beta regulatory T cell differentiation involved in immune response
+name: obsolete regulation of CD4-positive, CD25-positive, alpha-beta regulatory T cell differentiation involved in immune response
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of differentiation of CD4-positive, CD25-positive, alpha-beta regulatory T cells as part of an immune response." [GOC:mah]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of differentiation of CD4-positive, CD25-positive, alpha-beta regulatory T cells as part of an immune response." [GOC:mah]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of CD4-positive, CD25-positive, alpha-beta regulatory T cell development involved in immune response" RELATED [GOC:add]
 synonym: "regulation of CD4-positive, CD25-positive, alpha-beta regulatory T cell differentiation during immune response" RELATED [GOC:tb]
@@ -205194,7 +205333,6 @@
 synonym: "amino acid efflux from vacuole" EXACT []
 synonym: "vacuolar amino acid export" EXACT []
 is_a: GO:0003333 ! amino acid transmembrane transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 
 [Term]
@@ -205204,7 +205342,6 @@
 def: "The directed movement of amino acids into the vacuole across the vacuolar membrane." [GOC:mah]
 synonym: "vacuolar amino acid import" EXACT []
 is_a: GO:0003333 ! amino acid transmembrane transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 
 [Term]
@@ -211305,20 +211442,32 @@
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
@@ -213067,11 +213216,12 @@
 xref: KEGG_REACTION:R06166
 xref: MetaCyc:1.1.1.277-RXN
 xref: RHEA:22944
-is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+is_a: GO:0000253 ! 3-beta-hydroxysteroid 3-dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.1.1.277
 property_value: skos:exactMatch RHEA:22944
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29311" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0033704
@@ -213448,7 +213598,7 @@
 
 [Term]
 id: GO:0033722
-name: malonate-semialdehyde dehydrogenase activity
+name: malonate-semialdehyde dehydrogenase [NAD(P)+] activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 3-oxopropanoate + NAD(P)+ + H2O = malonate + NAD(P)H + H+." [EC:1.2.1.15]
 synonym: "3-oxopropanoate:NAD(P)+ oxidoreductase activity" RELATED [EC:1.2.1.15]
@@ -213457,7 +213607,7 @@
 xref: MetaCyc:MALONATE-SEMIALDEHYDE-DEHYDROGENASE-RXN
 xref: RHEA:20041
 xref: RHEA:20045
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004030 ! aldehyde dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.2.1.15
 property_value: skos:narrowMatch RHEA:20041
 property_value: skos:narrowMatch RHEA:20045
@@ -218773,11 +218923,13 @@
 
 [Term]
 id: GO:0034063
-name: stress granule assembly
+name: cytoplasmic stress granule assembly
 namespace: biological_process
-def: "The aggregation, arrangement and bonding together of proteins and RNA molecules to form a stress granule." [GOC:mah, PMID:17392519]
-synonym: "SG assembly" EXACT [PMID:19825938]
+def: "The aggregation, arrangement and bonding together of proteins and RNA molecules to form a cytoplasmic stress granule." [GOC:mah, PMID:17392519]
+synonym: "SG assembly" BROAD [PMID:19825938]
+synonym: "stress granule assembly" BROAD []
 is_a: GO:0140694 ! membraneless organelle assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32317" xsd:anyURI
 
 [Term]
 id: GO:0034064
@@ -221403,7 +221555,6 @@
 def: "The formation of conidia by the conversion of a pre-existing hypha. An arthrospore is produced by the last cell on a hypha breaking off and dispersing. Usually the walls thicken and the cell(s) separates before swelling of each spore. Sometimes further septa form in each cell prior to disarticulation." [GOC:mah]
 synonym: "arthroconidium formation" EXACT []
 is_a: GO:0048315 ! conidium formation
-is_a: GO:0048646 ! anatomical structure formation involved in morphogenesis
 
 [Term]
 id: GO:0034299
@@ -221413,7 +221564,6 @@
 comment: Note that this term should not be confused with the usage of 'blastospore' to mean any yeast-form fungal cell, as in Candida species.
 synonym: "blastoconidium formation" EXACT []
 is_a: GO:0048315 ! conidium formation
-is_a: GO:0048646 ! anatomical structure formation involved in morphogenesis
 
 [Term]
 id: GO:0034300
@@ -222019,7 +222169,6 @@
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:exactMatch MetaCyc:NADSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5653
@@ -223623,6 +223772,7 @@
 def: "The process in which calcium salts are deposited into calcareous tooth structures such as dental enamel, dentin and cementum." [GOC:mah, MP:0002817, MSH:D014074]
 synonym: "tooth calcification" EXACT []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0042476 ! odontogenesis
 
 [Term]
@@ -224724,7 +224874,6 @@
 xref: MetaCyc:PYRIDNUCSYN-PWY
 is_a: GO:0006531 ! aspartate metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-8277
 property_value: skos:narrowMatch MetaCyc:PWY-8352
@@ -226805,13 +226954,13 @@
 
 [Term]
 id: GO:0034832
-name: geranial dehydrogenase activity
+name: geranial dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: (2E)-geranial + H2O + NAD+ = geranate + 2 H+ + NADH." [RHEA:34351]
 xref: EC:1.2.1.86
 xref: MetaCyc:RXN-11970
 xref: RHEA:34351
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.86
 property_value: skos:exactMatch RHEA:34351
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28287" xsd:anyURI
@@ -231073,7 +231222,7 @@
 name: tube development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a tube over time, from its initial formation to a mature structure. Epithelial and endothelial tubes transport gases, liquids and cells from one site to another and form the basic structure of many organs and tissues including lung and trachea, kidney, the mammary gland, the vascular system and the gastrointestinal and urinary-genital tracts." [PMID:12526790]
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -233456,6 +233605,7 @@
 is_a: GO:0035498 ! carnosine metabolic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32271" xsd:anyURI
 created_by: bf
 creation_date: 2010-04-29T01:20:56Z
 
@@ -233485,6 +233635,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud tube that contributes to the morphogenesis of the metanephros." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0003338 ! metanephros morphogenesis
 created_by: bf
@@ -233496,6 +233647,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud that contributes to the morphogenesis of the ureter. The ureter ureteric bud is the initial structure that forms the ureter." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0072197 ! ureter morphogenesis
 created_by: bf
@@ -234895,12 +235047,14 @@
 
 [Term]
 id: GO:0035617
-name: stress granule disassembly
+name: cytoplasmic stress granule disassembly
 namespace: biological_process
-def: "The disaggregation of a stress granule into its constituent protein and RNA parts." [GOC:BHF, PMID:19825938]
-synonym: "SG disassembly" EXACT [PMID:19825938]
+def: "The disaggregation of a cytoplasmic stress granule into its constituent protein and RNA parts." [GOC:BHF, PMID:19825938]
+synonym: "SG disassembly" BROAD [PMID:19825938]
+synonym: "stress granule disassembly" BROAD []
 is_a: GO:0032988 ! protein-RNA complex disassembly
 is_a: GO:1903008 ! organelle disassembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32317" xsd:anyURI
 created_by: bf
 creation_date: 2010-12-03T10:38:57Z
 
@@ -235134,9 +235288,7 @@
 namespace: molecular_function
 def: "Binding to a purine ribonucleoside triphosphate, a compound consisting of a purine base linked to a ribose sugar esterified with triphosphate on the sugar." [GOC:BHF, GOC:ebc, ISBN:0198506732]
 synonym: "purine NTP binding" BROAD [GOC:ebc]
-is_a: GO:0043168 ! anion binding
 is_a: GO:1901265 ! nucleoside phosphate binding
-is_a: GO:1901363 ! heterocyclic compound binding
 created_by: bf
 creation_date: 2011-01-14T02:46:42Z
 
@@ -238488,7 +238640,6 @@
 def: "The process in which a rRNA, ribosomal ribonucleic acid, is transported from the cytosol into the mitochondrial matrix." [GOC:ans, PMID:20691904]
 synonym: "cytoplasmic RNA import into mitochondrion" NARROW [GOC:ans]
 synonym: "nuclear-encoded RNA import into mitochondrion" NARROW [GOC:bf]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0050658 ! RNA transport
 is_a: GO:0055085 ! transmembrane transport
 created_by: bf
@@ -239407,11 +239558,18 @@
 name: tetrahydrofolate interconversion
 namespace: biological_process
 def: "The chemical reactions and pathways by which one-carbon (C1) units are transferred between tetrahydrofolate molecules, to synthesize other tetrahydrofolate molecules." [GOC:yaf, PMID:1825999]
+synonym: "folate cycle" EXACT []
+synonym: "folate transformations" EXACT []
+xref: MetaCyc:1CMET2-PWY
 xref: MetaCyc:PWY-2201
+xref: MetaCyc:PWY-3841
 is_a: GO:0006730 ! one-carbon metabolic process
-is_a: GO:0046653 ! tetrahydrofolate metabolic process
+is_a: GO:0046654 ! tetrahydrofolate biosynthetic process
+property_value: skos:narrowMatch MetaCyc:1CMET2-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-2201
+property_value: skos:narrowMatch MetaCyc:PWY-3841
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32289" xsd:anyURI
 created_by: bf
 creation_date: 2011-09-02T01:35:49Z
 
@@ -242441,6 +242599,7 @@
 xref: MetaCyc:SUCCSEMIALDDEHYDROG-RXN
 xref: RHEA:13213
 is_a: GO:0009013 ! succinate-semialdehyde dehydrogenase [NAD(P)+] activity
+is_a: GO:0033721 ! aldehyde dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.2.1.79
 property_value: skos:exactMatch RHEA:13213
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25781" xsd:anyURI
@@ -242507,7 +242666,6 @@
 namespace: biological_process
 def: "The directed movement of cadmium ions into the vacuole." [GOC:al]
 synonym: "vacuolar cadmium import" RELATED [GOC:bf]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0070574 ! cadmium ion transmembrane transport
 created_by: bf
@@ -243473,6 +243631,7 @@
 synonym: "chitin-based cuticle hardening by biomineralisation" EXACT [GOC:bf]
 is_a: GO:0007593 ! chitin-based cuticle sclerotization
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: bf
 creation_date: 2012-09-11T13:50:04Z
 
@@ -243965,16 +244124,18 @@
 
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
 
@@ -244871,7 +245032,6 @@
 synonym: "mitochondrial calcium ion import" BROAD [GOC:vw]
 synonym: "mitochondrial calcium uptake" EXACT []
 is_a: GO:0006851 ! mitochondrial calcium ion transmembrane transport
-is_a: GO:0010496 ! intercellular transport
 created_by: bf
 creation_date: 2013-10-28T09:32:39Z
 
@@ -249132,10 +249292,11 @@
 
 [Term]
 id: GO:0039527
-name: symbiont-mediated suppression of host TRAF-mediated signal transduction
+name: obsolete symbiont-mediated suppression of host TRAF-mediated signal transduction
 namespace: biological_process
 alt_id: GO:0039547
-def: "A process in which a symbiont interferes with, inhibits or disrupts a TRAF-mediated signal transduction pathway in the host organism. The host is defined as the larger of the organisms involved in a symbiotic interaction." [GOC:bf, GOC:sp, PMID:20335533, PMID:27387501, PMID:28522607, PMID:31311877, PMID:33372174]
+def: "OBSOLETE. A process in which a symbiont interferes with, inhibits or disrupts a TRAF-mediated signal transduction pathway in the host organism. The host is defined as the larger of the organisms involved in a symbiotic interaction." [GOC:bf, GOC:sp, PMID:20335533, PMID:27387501, PMID:28522607, PMID:31311877, PMID:33372174]
+comment: This term was obsoleted because it does not correspond to a specific pathway. Consider symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway via inhibition of TRAF activity ; GO:0140476 and symbiont-mediated suppression of host toll-like receptor signaling pathway via inhibition of TRAF activity ; GO:0140470.
 synonym: "disruption by virus of host TRAF-mediated signal transduction" NARROW []
 synonym: "inhibition of host TRAF-mediated signal transduction by virus" EXACT [GOC:bf]
 synonym: "inhibition of host TRAFs by virus" NARROW []
@@ -249143,8 +249304,11 @@
 synonym: "suppression by virus of host TRAF activity" EXACT []
 synonym: "suppression by virus of host TRAF-mediated signal transduction" EXACT []
 synonym: "suppression by virus of host tumor necrosis factor receptor-associated factor signaling" EXACT [GOC:bf]
-is_a: GO:0052029 ! symbiont-mediated suppression of host signal transduction pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29238" xsd:anyURI
+is_obsolete: true
+consider: GO:0140470
+consider: GO:0140476
 created_by: bf
 creation_date: 2011-06-22T05:30:41Z
 
@@ -249284,7 +249448,7 @@
 
 [Term]
 id: GO:0039537
-name: symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+name: symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 namespace: biological_process
 def: "A process in which a symbiont interferes with, inhibits or disrupts a cytoplasmic pattern recognition receptor signaling pathway. This is a mechanism by which the virus evades the host innate immune response." [GOC:bf, GOC:jl]
 comment: Note that this term should be used when the symbiont directly inhibits a component of a host cytoplasmic receptor signaling pathway. In cases where the symbiont modifies its own molecules (proteins, DNA, RNA, lipids) to avoid recognition by the host, consider annotating to evasion of symbiont recognition by host pattern recognition receptor ; GO:0141141.
@@ -249296,6 +249460,7 @@
 synonym: "suppression by virus of host RLR signaling pathway" RELATED [GOC:bf]
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway" NARROW []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signalling pathway" EXACT [GOC:mah]
+synonym: "symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway" EXACT []
 is_a: GO:0052078 ! symbiont-mediated suppression of host pathogen-associated molecular pattern receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -249319,7 +249484,7 @@
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of host RIG-I activity" NARROW []
 synonym: "symbiont-mediated suppression of host RIG-I signaling pathway" RELATED []
 xref: VZ:856
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21984" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -249383,7 +249548,7 @@
 synonym: "suppression by virus of host mitochondrial antiviral-signaling protein" RELATED []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of MAVS activity" NARROW []
 xref: VZ:704
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21983" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -249412,7 +249577,7 @@
 synonym: "suppression by virus of host IRF3 activity" RELATED []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of IRF3 activity" NARROW []
 xref: VZ:757
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21985" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -249496,7 +249661,7 @@
 synonym: "suppression by virus of host MDA-5 signalling pathway" RELATED []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of host MDA-5 activity" NARROW []
 xref: VZ:603
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21984" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -249535,7 +249700,7 @@
 synonym: "suppression by virus of host IRF7 activity" RELATED []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of IRF7 activity" NARROW []
 xref: VZ:653
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21985" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -251452,7 +251617,7 @@
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of TBK1 activity" NARROW []
 synonym: "symbiont-mediated suppression of host TKB signaling" RELATED []
 xref: VZ:4477
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21970" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -251467,7 +251632,7 @@
 synonym: "suppression by virus of host IKBKE activity" RELATED []
 synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of IKBKE activity" NARROW []
 xref: VZ:4478
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21985" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26686" xsd:anyURI
 created_by: bf
@@ -251504,6 +251669,7 @@
 synonym: "collagen and cuticulin-based cuticle formation" EXACT []
 synonym: "collagen and cuticulin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040003
@@ -251515,6 +251681,7 @@
 synonym: "chitin-based cuticle formation" EXACT []
 synonym: "chitin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040004
@@ -253234,7 +253401,6 @@
 namespace: biological_process
 def: "The directed movement of membrane-bounded vesicles from endosomes back to the trans-Golgi network where they are recycled for further rounds of transport." [GOC:jl, PMID:10873832, PMID:16936697]
 synonym: "retrograde (endosome to Golgi) transport" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016197 ! endosomal transport
 is_a: GO:0016482 ! cytosolic transport
 
@@ -253699,8 +253865,8 @@
 synonym: "1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane degradation" EXACT []
 synonym: "DDT catabolic process" EXACT []
 synonym: "DDT catabolism" EXACT []
-is_a: GO:0018977 ! 1,1,1-trichloro-2,2-bis-(4-chlorophenyl)ethane metabolic process
 is_a: GO:0042205 ! chlorinated hydrocarbon catabolic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0046701 ! insecticide catabolic process
 
 [Term]
@@ -253883,7 +254049,6 @@
 synonym: "toluene catabolism" EXACT []
 synonym: "toluene degradation" EXACT []
 xref: UM-BBD_pathwayID:tol
-is_a: GO:0018970 ! toluene metabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
 is_a: GO:0072491 ! toluene-containing compound catabolic process
 is_a: GO:0120253 ! hydrocarbon catabolic process
@@ -253930,8 +254095,8 @@
 synonym: "styrene catabolism" EXACT []
 synonym: "styrene degradation" EXACT []
 xref: UM-BBD_pathwayID:sty
-is_a: GO:0018966 ! styrene metabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0120253 ! hydrocarbon catabolic process
 is_a: GO:0120256 ! olefinic compound catabolic process
 
@@ -255095,7 +255260,7 @@
 synonym: "cuticle biosynthetic process" EXACT []
 synonym: "cuticle formation" EXACT []
 synonym: "cuticle synthesis" EXACT []
-is_a: GO:0160108 ! animal gross anatomical part developmental process
+is_a: GO:0048856 ! anatomical structure development
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -260428,7 +260593,7 @@
 xref: MetaCyc:ALACAT2-PWY
 xref: MetaCyc:ALADEG-PWY
 xref: MetaCyc:ALANINE-DEG3-PWY
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ALACAT2-PWY
 property_value: skos:narrowMatch MetaCyc:ALADEG-PWY
@@ -266239,8 +266404,8 @@
 synonym: "homocysteine catabolism" EXACT []
 synonym: "homocysteine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
 
@@ -266990,7 +267155,6 @@
 name: endosome to pigment granule transport
 namespace: biological_process
 def: "The directed movement of substances from endosomes to pigment granules." [GOC:jl]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 relationship: part_of GO:0048757 ! pigment granule maturation
 
@@ -268395,29 +268559,31 @@
 
 [Term]
 id: GO:0043611
-name: isoprene metabolic process
+name: obsolete isoprene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving isoprene, C5H8." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways involving isoprene, C5H8." [GOC:jl]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "2-methyl-1,3-butadiene metabolic process" EXACT []
 synonym: "2-methyl-1,3-butadiene metabolism" EXACT []
 synonym: "hemiterpene metabolic process" EXACT []
 synonym: "hemiterpene metabolism" EXACT []
 synonym: "isoprene metabolism" EXACT []
-is_a: GO:0042214 ! terpene metabolic process
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0043612
-name: isoprene biosynthetic process
+name: obsolete isoprene biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of isoprene, C5H8." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of isoprene, C5H8." [GOC:jl, PMID:8690002]
+comment: This term was obsoleted because isoprene is synthesized by the isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway; GO:0019288, see PMID:8690002.
 synonym: "2-methyl-1,3-butadiene biosynthesis" EXACT []
 synonym: "2-methyl-1,3-butadiene biosynthetic process" EXACT []
 synonym: "hemiterpene biosynthesis" EXACT []
 synonym: "hemiterpene biosynthetic process" EXACT []
-is_a: GO:0043611 ! isoprene metabolic process
-is_a: GO:0046246 ! terpene biosynthetic process
-is_a: GO:1900674 ! olefin biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019288
 
 [Term]
 id: GO:0043613
@@ -268428,9 +268594,9 @@
 synonym: "2-methyl-1,3-butadiene catabolism" EXACT []
 synonym: "hemiterpene catabolic process" EXACT []
 synonym: "hemiterpene catabolism" EXACT []
-is_a: GO:0043611 ! isoprene metabolic process
 is_a: GO:0046247 ! terpene catabolic process
 is_a: GO:0120256 ! olefinic compound catabolic process
+is_a: GO:1900673 ! olefin metabolic process
 
 [Term]
 id: GO:0043614
@@ -270468,7 +270634,7 @@
 xref: RHEA:12472
 xref: RHEA:15165
 xref: RHEA:22688
-is_a: GO:0052595 ! aliphatic amine oxidase activity
+is_a: GO:0003884 ! D-amino-acid oxidase activity
 property_value: skos:exactMatch EC:1.4.3.19
 property_value: skos:narrowMatch MetaCyc:1.4.3.19-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-8672
@@ -270828,7 +270994,7 @@
 
 [Term]
 id: GO:0043824
-name: succinylglutamate-semialdehyde dehydrogenase activity
+name: succinylglutamate-semialdehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N-succinyl-L-glutamate 5-semialdehyde + H2O + NAD+ = N-succinyl-L-glutamate + 2 H+ + NADH." [EC:1.2.1.71, RHEA:10812]
 synonym: "AruD" RELATED []
@@ -270842,7 +271008,7 @@
 xref: KEGG_REACTION:R05049
 xref: MetaCyc:SUCCGLUALDDEHYD-RXN
 xref: RHEA:10812
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.71
 property_value: skos:exactMatch RHEA:10812
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -271432,7 +271598,7 @@
 
 [Term]
 id: GO:0043870
-name: N-acetyl-gamma-aminoadipyl-phosphate reductase activity
+name: N-acetyl-gamma-aminoadipyl-phosphate reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N(2)-acetyl-L-aminoadipate-semialdehyde + NADP+ + phosphate = N(2)-acetyl-L-gamma-aminoadipyl phosphate + NADPH." [RHEA:41948]
 comment: This function is part of the prokaryotic alpha-aminoadipate lysine biosynthesis pathway.
@@ -271564,7 +271730,8 @@
 synonym: "non-phosphorylating glyceraldehyde-3-phosphate dehydrogenase (NAD)" EXACT []
 xref: MetaCyc:RXN-3443
 xref: RHEA:42760
-is_a: GO:0120533 ! glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (non-phosphorylating) activity
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
+is_a: GO:0120533 ! glyceraldehyde-3-phosphate dehydrogenase (non-phosphorylating, [NAD(P)+] ) activity
 property_value: skos:exactMatch RHEA:42760
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28144" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -271780,7 +271947,7 @@
 
 [Term]
 id: GO:0043891
-name: glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (phosphorylating) activity
+name: glyceraldehyde-3-phosphate dehydrogenase (phosphorylating, [NAD(P)+] ) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: D-glyceraldehyde 3-phosphate + phosphate + NAD(P)+ = 3-phospho-D-glyceroyl phosphate + NAD(P)H + H+." [EC:1.2.1.59]
 synonym: "D-glyceraldehyde 3-phosphate:NAD(P)+ oxidoreductase (phosphorylating)" EXACT []
@@ -278759,6 +278926,9 @@
 xref: RHEA:78631
 xref: RHEA:78847
 xref: RHEA:83047
+xref: RHEA:83115
+xref: RHEA:85319
+xref: RHEA:85323
 is_a: GO:0003997 ! acyl-CoA oxidase activity
 property_value: skos:exactMatch RHEA:78847
 property_value: skos:narrowMatch RHEA:39119
@@ -278766,6 +278936,9 @@
 property_value: skos:narrowMatch RHEA:40319
 property_value: skos:narrowMatch RHEA:78631
 property_value: skos:narrowMatch RHEA:83047
+property_value: skos:narrowMatch RHEA:83115
+property_value: skos:narrowMatch RHEA:85319
+property_value: skos:narrowMatch RHEA:85323
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24703" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -279312,7 +279485,6 @@
 namespace: biological_process
 def: "The chemical reactions a resulting in the resulting in the breakdown of butyryl-CoA." [GOC:jl]
 synonym: "butyryl-CoA catabolism" EXACT []
-is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0036115 ! fatty-acyl-CoA catabolic process
 created_by: jl
 creation_date: 2012-04-19T04:28:46Z
@@ -281030,7 +281202,6 @@
 name: protein transmembrane import into intracellular organelle
 namespace: biological_process
 def: "The directed movement of proteins into an intracellular organelle, across a membrane." [GOC:jl]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0033365 ! protein localization to organelle
 is_a: GO:0065002 ! intracellular protein transmembrane transport
 is_a: GO:0072594 ! establishment of protein localization to organelle
@@ -281539,7 +281710,6 @@
 name: trans-Golgi network to recycling endosome transport
 namespace: biological_process
 def: "The directed movement of substances, in membrane-bounded vesicles, from the trans-Golgi network to the recycling endosomes." [GOC:lb, PMID:18779367]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016197 ! endosomal transport
 created_by: jl
 creation_date: 2013-08-27T16:04:00Z
@@ -285475,6 +285645,7 @@
 namespace: biological_process
 def: "The precipitation of specific crystal forms of calcium carbonate with extracellular matrix proteins in the otolith organs of the vertebrate inner ear." [GOC:dsf, PMID:15581873]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048840 ! otolith development
 
 [Term]
@@ -285756,7 +285927,6 @@
 namespace: biological_process
 def: "The directed movement of substances from late endosomes to the vacuole. In yeast, after transport to the prevacuolar compartment, endocytic content is delivered to the late endosome and on to the vacuole. This pathway is analogous to endosome to lysosome transport." [PMID:11872141]
 is_a: GO:0007034 ! vacuolar transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016192 ! vesicle-mediated transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29318" xsd:anyURI
 
@@ -286349,14 +286519,17 @@
 
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
@@ -286844,12 +287017,15 @@
 
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
@@ -291741,38 +291917,42 @@
 
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
@@ -294434,6 +294614,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving ATP, adenosine triphosphate, a universally important coenzyme and enzyme regulator." [GOC:curators]
 synonym: "ATP metabolism" EXACT []
+is_a: GO:0009141 ! nucleoside triphosphate metabolic process
 is_a: GO:0009150 ! purine ribonucleotide metabolic process
 is_a: GO:0009205 ! purine ribonucleoside triphosphate metabolic process
 
@@ -294454,6 +294635,7 @@
 def: "The chemical reactions and pathways involving CTP, cytidine triphosphate." [GOC:curators]
 synonym: "CTP deamination" NARROW []
 synonym: "CTP metabolism" EXACT []
+is_a: GO:0009141 ! nucleoside triphosphate metabolic process
 is_a: GO:0009208 ! pyrimidine ribonucleoside triphosphate metabolic process
 is_a: GO:0009218 ! pyrimidine ribonucleotide metabolic process
 
@@ -294484,6 +294666,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving GTP, guanosine triphosphate." [GOC:curators]
 synonym: "GTP metabolism" EXACT []
+is_a: GO:0009141 ! nucleoside triphosphate metabolic process
 is_a: GO:0009150 ! purine ribonucleotide metabolic process
 is_a: GO:0009205 ! purine ribonucleoside triphosphate metabolic process
 
@@ -294502,6 +294685,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving ITP, inosine triphosphate." [GOC:curators]
 synonym: "ITP metabolism" EXACT []
+is_a: GO:0009141 ! nucleoside triphosphate metabolic process
 is_a: GO:0009150 ! purine ribonucleotide metabolic process
 is_a: GO:0009205 ! purine ribonucleoside triphosphate metabolic process
 
@@ -294514,6 +294698,7 @@
 synonym: "ITP biosynthesis" EXACT []
 synonym: "ITP formation" EXACT []
 synonym: "ITP synthesis" EXACT []
+is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009152 ! purine ribonucleotide biosynthetic process
 is_a: GO:0009206 ! purine ribonucleoside triphosphate biosynthetic process
 is_a: GO:0046041 ! ITP metabolic process
@@ -294606,6 +294791,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving UTP, uridine (5'-)triphosphate." [GOC:curators]
 synonym: "UTP metabolism" EXACT []
+is_a: GO:0009141 ! nucleoside triphosphate metabolic process
 is_a: GO:0009208 ! pyrimidine ribonucleoside triphosphate metabolic process
 is_a: GO:0009218 ! pyrimidine ribonucleotide metabolic process
 
@@ -294618,6 +294804,7 @@
 synonym: "UTP catabolism" EXACT []
 synonym: "UTP degradation" EXACT []
 synonym: "UTP hydrolysis" EXACT []
+is_a: GO:0009143 ! nucleoside triphosphate catabolic process
 is_a: GO:0009210 ! pyrimidine ribonucleoside triphosphate catabolic process
 is_a: GO:0009222 ! pyrimidine ribonucleotide catabolic process
 is_a: GO:0046051 ! UTP metabolic process
@@ -296877,7 +297064,6 @@
 synonym: "styrene formation" EXACT []
 synonym: "styrene synthesis" EXACT []
 is_obsolete: true
-replaced_by: GO:0018966
 
 [Term]
 id: GO:0046246
@@ -296961,7 +297147,7 @@
 synonym: "toluene biosynthesis" EXACT []
 synonym: "toluene formation" EXACT []
 synonym: "toluene synthesis" EXACT []
-is_a: GO:0018970 ! toluene metabolic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0120251 ! hydrocarbon biosynthetic process
 
 [Term]
@@ -297652,18 +297838,18 @@
 synonym: "Z-phenylacetaldoxime formation" EXACT []
 synonym: "Z-phenylacetaldoxime synthesis" EXACT []
 is_a: GO:0009058 ! biosynthetic process
-is_a: GO:0019330 ! aldoxime metabolic process
 
 [Term]
 id: GO:0046308
 name: Z-phenylacetaldoxime catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of Z-phenylacetaldoxime, a member of the glucosinolate group of compounds." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of Z-phenylacetaldoxime, a member of the glucosinolate group of compounds." [MetaCyc:P345-PWY]
 synonym: "Z-phenylacetaldoxime breakdown" EXACT []
 synonym: "Z-phenylacetaldoxime catabolism" EXACT []
 synonym: "Z-phenylacetaldoxime degradation" EXACT []
+xref: MetaCyc:P345-PWY
 is_a: GO:0009056 ! catabolic process
-is_a: GO:0019330 ! aldoxime metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 
 [Term]
 id: GO:0046309
@@ -298517,12 +298703,13 @@
 
 [Term]
 id: GO:0046375
-name: K antigen metabolic process
+name: obsolete K antigen metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving K antigen, a capsular polysaccharide antigen carried on the surface of bacterial capsules that masks somatic (O) antigens." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways involving K antigen, a capsular polysaccharide antigen carried on the surface of bacterial capsules that masks somatic (O) antigens." [ISBN:0198506732]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "K antigen metabolism" EXACT []
-is_a: GO:0043170 ! macromolecule metabolic process
-is_a: GO:1901135 ! carbohydrate derivative metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0046376
@@ -298971,11 +299158,13 @@
 
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
@@ -299244,16 +299433,16 @@
 
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
@@ -299418,11 +299607,13 @@
 
 [Term]
 id: GO:0046454
-name: dimethylsilanediol metabolic process
+name: obsolete dimethylsilanediol metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving dimethylsilanediol, the smallest member of the dialkylsilanediols. Dimethylsilanediol is the monomer of polydimethylsiloxane, a compound which can be found in a wide range of industrial and consumer products." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways involving dimethylsilanediol, the smallest member of the dialkylsilanediols. Dimethylsilanediol is the monomer of polydimethylsiloxane, a compound which can be found in a wide range of industrial and consumer products." [GOC:ai]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "dimethylsilanediol metabolism" EXACT []
-is_a: GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0046455
@@ -301222,27 +301413,32 @@
 
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
@@ -301978,9 +302174,15 @@
 synonym: "tetrahydrofolate biosynthesis" EXACT []
 synonym: "tetrahydrofolate formation" EXACT []
 synonym: "tetrahydrofolate synthesis" EXACT []
-xref: MetaCyc:FOLSYN-PWY
+xref: MetaCyc:PWY-6613
+xref: MetaCyc:PWY-6614
+xref: MetaCyc:PWY2DNV-11
 is_a: GO:0009396 ! folic acid-containing compound biosynthetic process
 is_a: GO:0046653 ! tetrahydrofolate metabolic process
+property_value: skos:narrowMatch MetaCyc:PWY-6613
+property_value: skos:narrowMatch MetaCyc:PWY-6614
+property_value: skos:narrowMatch MetaCyc:PWY2DNV-11
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32289" xsd:anyURI
 
 [Term]
 id: GO:0046655
@@ -302450,6 +302652,7 @@
 xref: Wikipedia:Decidualization
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001893 ! maternal placenta development
 
 [Term]
@@ -305305,7 +305508,6 @@
 namespace: biological_process
 def: "The directed movement of substances from the cytosol to the endoplasmic reticulum of a cell." [GOC:ai]
 synonym: "cytosol to ER transport" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -306144,7 +306346,7 @@
 xref: KEGG_REACTION:R04344
 xref: MetaCyc:1.1.1.210-RXN
 xref: RHEA:16297
-is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+is_a: GO:0000253 ! 3-beta-hydroxysteroid 3-dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.1.1.210
 property_value: skos:exactMatch RHEA:16297
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307478,7 +307680,7 @@
 xref: EC:1.2.1.13
 xref: MetaCyc:1.2.1.13-RXN
 xref: RHEA:10296
-is_a: GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (phosphorylating) activity
+is_a: GO:0043891 ! glyceraldehyde-3-phosphate dehydrogenase (phosphorylating, [NAD(P)+] ) activity
 property_value: skos:exactMatch EC:1.2.1.13
 property_value: skos:exactMatch RHEA:10296
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307499,7 +307701,7 @@
 
 [Term]
 id: GO:0047102
-name: aminomuconate-semialdehyde dehydrogenase activity
+name: aminomuconate-semialdehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: H2O + NAD+ + 2-aminomuconate semialdehyde = NADH + 2-amino-muconate." [EC:1.2.1.32, MetaCyc:1.2.1.32-RXN]
 synonym: "2-aminomuconate semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.32]
@@ -307514,7 +307716,7 @@
 xref: Reactome:R-HSA-71239 "2-aminomuconate semialdehyde + NAD+ + H2O => aminomuconate + NADH + H+"
 xref: RHEA:14469
 xref: UM-BBD_reactionID:r1434
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.32
 property_value: skos:exactMatch RHEA:14469
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307557,9 +307759,9 @@
 
 [Term]
 id: GO:0047105
-name: 4-trimethylammoniobutyraldehyde dehydrogenase activity
+name: 4-trimethylammoniobutyraldehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: NAD+ + 4-trimethylammoniobutanal = NADH + 4-trimethylammoniobutanoate." [EC:1.2.1.47, MetaCyc:1.2.1.47-RXN]
+def: "Catalysis of the reaction: 4-(trimethylamino)butanal + NAD+ + H2O = 4-(trimethylamino)butanoate + NADH + 2 H+." [RHEA:17985]
 synonym: "4-N-trimethylaminobutyraldehyde dehydrogenase activity" RELATED [EC:1.2.1.47]
 synonym: "4-trimethylaminobutyraldehyde dehydrogenase activity" RELATED [EC:1.2.1.47]
 synonym: "4-trimethylammoniobutanal:NAD+ 1-oxidoreductase activity" RELATED [EC:1.2.1.47]
@@ -307567,7 +307769,7 @@
 xref: MetaCyc:1.2.1.47-RXN
 xref: Reactome:R-HSA-71260 "ALDH9A1 tetramer dehydrogenates TEABL to form TEABT"
 xref: RHEA:17985
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.47
 property_value: skos:exactMatch RHEA:17985
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307642,7 +307844,7 @@
 
 [Term]
 id: GO:0047110
-name: phenylglyoxylate dehydrogenase (acylating) activity
+name: phenylglyoxylate dehydrogenase (acylating, NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: CoA + NAD+ + phenylglyoxylate = benzoyl-CoA + CO2 + NADH." [RHEA:10372]
 synonym: "phenylglyoxylate:NAD+ oxidoreductase activity" RELATED [EC:1.2.1.58]
@@ -309125,6 +309327,9 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
+xref: RHEA:86879
+xref: RHEA:86891
+xref: RHEA:86895
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
@@ -309133,6 +309338,9 @@
 property_value: skos:narrowMatch RHEA:74807
 property_value: skos:narrowMatch RHEA:74811
 property_value: skos:narrowMatch RHEA:74823
+property_value: skos:narrowMatch RHEA:86879
+property_value: skos:narrowMatch RHEA:86891
+property_value: skos:narrowMatch RHEA:86895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -312551,6 +312759,7 @@
 xref: RHEA:38491
 xref: RHEA:39959
 xref: RHEA:39963
+xref: RHEA:40603
 xref: RHEA:40607
 xref: RHEA:44312
 xref: RHEA:44316
@@ -312584,6 +312793,7 @@
 property_value: skos:narrowMatch RHEA:38491
 property_value: skos:narrowMatch RHEA:39959
 property_value: skos:narrowMatch RHEA:39963
+property_value: skos:narrowMatch RHEA:40603
 property_value: skos:narrowMatch RHEA:40607
 property_value: skos:narrowMatch RHEA:44312
 property_value: skos:narrowMatch RHEA:44316
@@ -314939,7 +315149,7 @@
 id: GO:0047509
 name: (R)-dehydropantoate dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (R)-4-dehydropantoate + H2O + NAD+ = (R)-3,3-dimethylmalate + 2 H+ + NADH." [EC:1.2.1.33, RHEA:19349]
+def: "Catalysis of the reaction: (R)-4-dehydropantoate + NAD+ + H2O = (R)-3,3-dimethylmalate + NADH + 2 H+." [RHEA:19349]
 synonym: "(R)-4-dehydropantoate:NAD+ 4-oxidoreductase activity" RELATED [EC:1.2.1.33]
 synonym: "D-2-hydroxy-3,3-dimethyl-3-formylpropionate:diphosphopyridine nucleotide (DPN+) oxidoreductase activity" RELATED [EC:1.2.1.33]
 synonym: "D-aldopantoate dehydrogenase activity" RELATED [EC:1.2.1.33]
@@ -314947,7 +315157,7 @@
 xref: KEGG_REACTION:R03198
 xref: MetaCyc:R-DEHYDROPANTOATE-DEHYDROGENASE-RXN
 xref: RHEA:19349
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.33
 property_value: skos:exactMatch RHEA:19349
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -315342,10 +315552,11 @@
 xref: EC:1.2.1.26
 xref: MetaCyc:25-DIOXOVALERATE-DEHYDROGENASE-RXN
 xref: RHEA:11296
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0033721 ! aldehyde dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.2.1.26
 property_value: skos:exactMatch RHEA:11296
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0047534
@@ -318039,10 +318250,12 @@
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
@@ -318938,6 +319151,7 @@
 property_value: skos:narrowMatch RHEA:59588
 property_value: skos:narrowMatch RHEA:59592
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29764" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32271" xsd:anyURI
 
 [Term]
 id: GO:0047731
@@ -319454,13 +319668,17 @@
 id: GO:0047759
 name: butanal dehydrogenase [NAD(P)+] activity
 namespace: molecular_function
-def: "Catalysis of the reaction: butanal + CoA + NAD(P)+ = butanoyl-CoA + NAD(P)H + H+." [EC:1.2.1.57, MetaCyc:BUTANAL-DEHYDROGENASE-RXN]
+def: "Catalysis of the reaction: butanal + CoA + NAD(P)+ = butanoyl-CoA + NAD(P)H + H+." [EC:1.2.1.57]
 synonym: "butanal dehydrogenase activity" EXACT []
 synonym: "butanal:NAD(P)+ oxidoreductase (CoA-acylating)" RELATED [EC:1.2.1.57]
 xref: EC:1.2.1.57
 xref: MetaCyc:BUTANAL-DEHYDROGENASE-RXN
+xref: RHEA:22968
+xref: RHEA:22972
 is_a: GO:0004030 ! aldehyde dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.2.1.57
+property_value: skos:narrowMatch RHEA:22968
+property_value: skos:narrowMatch RHEA:22972
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30270" xsd:anyURI
 
@@ -320527,10 +320745,11 @@
 
 [Term]
 id: GO:0047819
-name: D-glutamate(D-aspartate) oxidase activity
+name: D-glutamate/D-aspartate oxidase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: D-glutamate + H2O + O2 = 2-oxoglutarate + NH3 + H2O2, and D-aspartate + H2O + O2 = oxaloacetate + NH3 + H2O2." [EC:1.4.3.15]
 comment: For the individual reactions, see instead 'D-glutamate oxidase activity ;GO:0047821' and 'D-aspartate oxidase activity ; GO:0008445'.
+synonym: "D-glutamate(D-aspartate) oxidase activity" EXACT []
 synonym: "D-glutamate(D-aspartate):oxygen oxidoreductase (deaminating)" RELATED [EC:1.4.3.15]
 synonym: "D-glutamic-aspartic oxidase activity" RELATED [EC:1.4.3.15]
 synonym: "D-monoaminodicarboxylic acid oxidase activity" RELATED [EC:1.4.3.15]
@@ -321546,6 +321765,10 @@
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
@@ -321555,6 +321778,10 @@
 property_value: skos:narrowMatch RHEA:65552
 property_value: skos:narrowMatch RHEA:65556
 property_value: skos:narrowMatch RHEA:77675
+property_value: skos:narrowMatch RHEA:86911
+property_value: skos:narrowMatch RHEA:86915
+property_value: skos:narrowMatch RHEA:86919
+property_value: skos:narrowMatch RHEA:86923
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -321676,7 +321903,7 @@
 xref: EC:1.4.3.8
 xref: MetaCyc:ETHANOLAMINE-OXIDASE-RXN
 xref: RHEA:18581
-is_a: GO:0052595 ! aliphatic amine oxidase activity
+is_a: GO:0008131 ! primary methylamine oxidase activity
 property_value: skos:exactMatch EC:1.4.3.8
 property_value: skos:exactMatch RHEA:18581
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -323179,9 +323406,9 @@
 
 [Term]
 id: GO:0047968
-name: glyoxylate dehydrogenase (acylating) activity
+name: glyoxylate dehydrogenase (acylating, NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: CoA + glyoxylate + NADP+ = H+ + NADPH + oxalyl-CoA." [EC:1.2.1.17, RHEA:21024]
+def: "Catalysis of the reaction: CoA + glyoxylate + NADP+ = H+ + NADPH + oxalyl-CoA." [RHEA:21024]
 synonym: "glyoxylate:NADP+ oxidoreductase (CoA-oxalylating)" RELATED [EC:1.2.1.17]
 xref: EC:1.2.1.17
 xref: KEGG_REACTION:R00468
@@ -323628,18 +323855,20 @@
 
 [Term]
 id: GO:0047996
-name: hydroxyphytanate oxidase activity
+name: (2S)-2-hydroxyphytanate oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (2S)-2-hydroxyphytanate + O2 = 2-oxophytanate + H2O2." [EC:1.1.3.27, RHEA:21680]
+def: "Catalysis of the reaction: (2S)-2-hydroxyphytanate + O2 = 2-oxophytanate + H2O2." [RHEA:21680]
+synonym: "hydroxyphytanate oxidase activity" EXACT []
 synonym: "L-2-hydroxyphytanate:oxygen 2-oxidoreductase" BROAD [EC:1.1.3.27]
 xref: EC:1.1.3.27
 xref: KEGG_REACTION:R07151
 xref: MetaCyc:HYDROXYPHYTANATE-OXIDASE-RXN
 xref: RHEA:21680
-is_a: GO:0016899 ! oxidoreductase activity, acting on the CH-OH group of donors, oxygen as acceptor
+is_a: GO:0003973 ! (S)-2-hydroxy-acid oxidase activity
 property_value: skos:exactMatch EC:1.1.3.27
 property_value: skos:exactMatch RHEA:21680
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0047997
@@ -323712,7 +323941,7 @@
 
 [Term]
 id: GO:0048001
-name: erythrose-4-phosphate dehydrogenase activity
+name: erythrose-4-phosphate dehydrogenase (NAD+) activity
 namespace: molecular_function
 alt_id: GO:0033724
 def: "Catalysis of the reaction: D-erythrose 4-phosphate + H2O + NAD+ = 4-phospho-D-erythronate + 2 H+ + NADH." [EC:1.2.1.72, RHEA:12056]
@@ -325830,7 +326059,6 @@
 synonym: "mitochondrial iron ion transmembrane transport" RELATED []
 synonym: "mitochondrial iron ion transport" RELATED []
 synonym: "mitochondrial iron transport" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034755 ! iron ion transmembrane transport
 created_by: al
 creation_date: 2016-02-10T11:24:22Z
@@ -325910,6 +326138,7 @@
 def: "Any process that modulates the frequency, rate or extent of receptor mediated endocytosis, the uptake of external materials by cells, utilizing receptors to ensure specificity of transport." [GOC:curators, GOC:tb]
 synonym: "regulation of receptor mediated endocytosis" EXACT [GOC:tb]
 is_a: GO:0030100 ! regulation of endocytosis
+is_a: GO:0060627 ! regulation of vesicle-mediated transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0006898 ! receptor-mediated endocytosis
 relationship: regulates GO:0006898 ! receptor-mediated endocytosis
@@ -326482,7 +326711,7 @@
 synonym: "conidia biosynthesis" RELATED []
 synonym: "conidia formation" EXACT []
 is_a: GO:0030436 ! asexual sporulation
-relationship: part_of GO:0061794 ! conidium development
+is_a: GO:0048646 ! anatomical structure formation involved in morphogenesis
 
 [Term]
 id: GO:0048316
@@ -327220,6 +327449,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the mesectoderm over time, from its formation to the mature structure. In animal embryos, mesectoderm development processes give rise to both mesoderm and ectoderm tissues." [GOC:jid]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007398 ! ectoderm development
 relationship: part_of GO:0007498 ! mesoderm development
 
@@ -327496,7 +327726,6 @@
 comment: Consider instead annotating to one of the more specific child terms, or to 'floral organ development ; GO:0048438' or one of its child terms.
 synonym: "collective phyllome structure development" BROAD [GOC:PO_curators, PO:0025023]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
@@ -327889,7 +328118,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the style over time, from its formation to the mature structure. The style is an elongated part of a carpel, or group of fused carpels, and it lies between the ovary and the stigma." [GOC:jid, PO:0009074]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
@@ -327899,7 +328127,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stigma over time, from its formation to the mature structure. The stigma is the pollen-receptive surface of a carpel or group of fused carpels, usually sticky." [GOC:jid, PO:0009073]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
@@ -328179,7 +328406,6 @@
 name: meristem development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the meristem over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
@@ -328759,6 +328985,7 @@
 synonym: "intestinal development" NARROW []
 synonym: "intestine development" NARROW []
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0055123 ! digestive system development
 
 [Term]
@@ -329613,7 +329840,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anther over time, from its formation to the mature structure." [GOC:jid, GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 
@@ -329669,7 +329895,6 @@
 synonym: "tapetal layer development" BROAD [GOC:tb]
 synonym: "tapetum development" BROAD [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 
@@ -331418,7 +331643,6 @@
 name: root cap development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root cap over time, from its formation to the mature structure. The root cap protects the root meristem from friction as the root grows through the soil. The cap is made up of a group of parenchyma cells which secrete a glycoprotein mucilage as a lubricant." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
@@ -331911,6 +332135,7 @@
 def: "The process whose specific outcome is the progression of the lateral line over time, from its formation to the mature structure. The lateral line consists of small sensory patches (neuromasts) located superficially on the skin or just under the skin in fluid-filled canals on the head and body of all fishes and most amphibians. The lateral line develops from cranial ectodermal placodes situated behind the ear and between the eye and ear." [ISBN:0125296509]
 synonym: "LL development" EXACT []
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048925 ! lateral line system development
 
 [Term]
@@ -333506,7 +333731,7 @@
 
 [Term]
 id: GO:0050062
-name: long-chain-fatty-acyl-CoA reductase activity
+name: long-chain-fatty-acyl-CoA reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a long-chain fatty aldehyde + CoA + NADP+ = a long-chain fatty acyl-CoA + NADPH." [RHEA:15437]
 comment: Together with GO:0047474, forms a fatty acid reductase system which produces the substrate of GO:0047646, thus being part of the bacterial luciferase system.
@@ -336708,19 +336933,17 @@
 
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
@@ -342792,7 +343015,7 @@
 
 [Term]
 id: GO:0050608
-name: vanillin dehydrogenase activity
+name: vanillin dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: H2O + NAD+ + vanillin = 2 H+ + NADH + vanillate." [EC:1.2.1.67, RHEA:13309]
 synonym: "vanillin:NAD+ oxidoreductase activity" RELATED [EC:1.2.1.67]
@@ -345943,7 +346166,6 @@
 def: "The movement of an organism or part of an organism using mechanoreceptors, the nervous system, striated muscle and/or the skeletal system." [GOC:dph]
 is_a: GO:0050879 ! multicellular organismal movement
 is_a: GO:0050905 ! neuromuscular process
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0050882
@@ -346819,9 +347041,6 @@
 synonym: "perception of environment using reflected sound waves" EXACT []
 xref: Wikipedia:Echolocation
 is_a: GO:0050877 ! nervous system process
-property_value: RO:0002175 NCBITaxon:687454
-property_value: RO:0002175 NCBITaxon:9397
-property_value: RO:0002175 NCBITaxon:9722
 
 [Term]
 id: GO:0050960
@@ -349488,7 +349707,6 @@
 synonym: "nucleus export" EXACT []
 synonym: "substance nuclear export" EXACT []
 is_a: GO:0006913 ! nucleocytoplasmic transport
-is_a: GO:0010496 ! intercellular transport
 
 [Term]
 id: GO:0051169
@@ -349509,7 +349727,6 @@
 synonym: "nuclear import" EXACT []
 synonym: "nuclear translocation" EXACT []
 is_a: GO:0006913 ! nucleocytoplasmic transport
-is_a: GO:0010496 ! intercellular transport
 created_by: jl
 creation_date: 2013-12-19T15:26:34Z
 
@@ -349971,7 +350188,6 @@
 synonym: "release of stored calcium ion (Ca2+)" BROAD []
 synonym: "release of stored calcium ion (Ca2+) into cytoplasm" BROAD []
 synonym: "release of stored calcium ion (Ca2+) into cytosol" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0097553 ! calcium ion transmembrane import into cytosol
 
 [Term]
@@ -350708,7 +350924,7 @@
 
 [Term]
 id: GO:0051269
-name: alpha-ketoester reductase (NADPH) activity
+name: alpha-ketoester reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: alpha-ketoester + H+ + NADPH = (R)-hydroxy ester + NADP+." [PMID:15564669, RHEA:80767]
 xref: RHEA:80767
@@ -356530,6 +356746,7 @@
 xref: RHEA:47468
 xref: RHEA:84515
 xref: RHEA:84543
+xref: RHEA:84779
 is_a: GO:0016863 ! intramolecular oxidoreductase activity, transposing C=C bonds
 property_value: skos:exactMatch EC:5.3.3.21
 property_value: skos:exactMatch RHEA:45240
@@ -356538,6 +356755,7 @@
 property_value: skos:narrowMatch RHEA:47468
 property_value: skos:narrowMatch RHEA:84515
 property_value: skos:narrowMatch RHEA:84543
+property_value: skos:narrowMatch RHEA:84779
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -364782,16 +365000,15 @@
 
 [Term]
 id: GO:0052595
-name: aliphatic amine oxidase activity
+name: obsolete aliphatic amine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an aliphatic amine + H2O + O2 = an aldehyde + NH4+ + H2O2 + H+." [MetaCyc:AMINEOXID-RXN]
+def: "OBSOLETE. Catalysis of the reaction: an aliphatic amine + H2O + O2 = an aldehyde + NH4+ + H2O2 + H+." [MetaCyc:AMINEOXID-RXN]
+comment: This term was obsoleted because it represents the same reaction as primary methylamine oxidase activity ; GO:0008131.
 synonym: "aliphatic-amine oxidase activity" EXACT []
 synonym: "aliphatic-amine:oxygen oxidoreductase(deaminating) activity" EXACT []
-xref: MetaCyc:AMINEOXID-RXN
-is_a: GO:0016641 ! oxidoreductase activity, acting on the CH-NH2 group of donors, oxygen as acceptor
-is_a: GO:0030058 ! aliphatic amine dehydrogenase activity
-property_value: skos:broadMatch EC:1.4.3.21
-property_value: skos:broadMatch RHEA:16153
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008131
 
 [Term]
 id: GO:0052596
@@ -368140,10 +368357,12 @@
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
@@ -370913,7 +371132,6 @@
 name: Golgi to secretory granule transport
 namespace: biological_process
 def: "The directed movement of proteins from the Golgi to a secretory granule. The secretory granule is a membrane-bounded particle, usually protein, formed in the granular endoplasmic reticulum and the Golgi complex." [GOC:curators]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 
 [Term]
@@ -371753,6 +371971,7 @@
 synonym: "Mullerian tract development" RELATED []
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060067
@@ -374074,9 +374293,13 @@
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
@@ -375496,6 +375719,7 @@
 def: "The process whose specific outcome is the progression of an epithelium over time, from its formation to the mature structure. An epithelium is a tissue that covers the internal or external surfaces of an anatomical structure." [GOC:dph, GOC:mtg_lung]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060430
@@ -376038,6 +376262,7 @@
 def: "The process whose specific outcome is the progression of a mesenchymal tissue over time, from its formation to the mature structure. A mesenchymal tissue is made up of loosely packed stellate cells." [GOC:dph]
 synonym: "mesenchymal development" EXACT [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048513 ! animal organ development
 
 [Term]
@@ -376291,7 +376516,8 @@
 synonym: "granular pneumocyte differentiation" RELATED [GOC:dph, ISBN:0721662544]
 synonym: "great alveolar cell differentiation" EXACT [GOC:dph, ISBN:0721662544]
 synonym: "large alveolar cell differentiation" RELATED [GOC:dph, ISBN:0721662544]
-is_a: GO:0061140 ! lung secretory cell differentiation
+is_a: GO:0002065 ! columnar/cuboidal epithelial cell differentiation
+is_a: GO:0060487 ! lung epithelial cell differentiation
 
 [Term]
 id: GO:0060511
@@ -376566,6 +376792,7 @@
 namespace: biological_process
 def: "The progression of muscle tissue over time, from its initial formation to its mature state. Muscle tissue is a contractile tissue made up of actin and myosin fibers." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-04-10T08:05:37Z
 
@@ -378599,6 +378826,7 @@
 namespace: biological_process
 def: "The process in which the spongiotrophoblast layer of the placenta progresses from its formation to its mature state." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001892 ! embryonic placenta development
 created_by: dph
 creation_date: 2009-06-09T03:33:40Z
@@ -380473,6 +380701,7 @@
 namespace: biological_process
 def: "The progression of the semicircular canal from its initial formation to the mature structure." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 created_by: dph
 creation_date: 2009-08-13T09:36:37Z
@@ -382053,6 +382282,7 @@
 synonym: "EHBD development" BROAD [PMID:20614624]
 synonym: "extrahepatic bile duct development" BROAD [PMID:20614624]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061008 ! hepaticobiliary system development
 created_by: dph
 creation_date: 2010-01-22T09:17:13Z
@@ -384208,6 +384438,7 @@
 synonym: "Mullerian duct development" EXACT [GOC:dph]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-07-30T10:54:47Z
 
@@ -386579,30 +386810,34 @@
 
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
 
@@ -386968,6 +387203,7 @@
 namespace: biological_process
 def: "The progression of a connective tissue over time, from its formation to the mature structure." [GOC:BHF]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-03-22T12:53:41Z
 
@@ -386976,7 +387212,7 @@
 name: olfactory bulb tufted cell development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an olfactory bulb tufted cell over time, from initial commitment of the cell to a specific fate, to the fully functional differentiated cell." [GOC:dph]
-is_a: GO:0021884 ! forebrain neuron development
+is_a: GO:0021954 ! central nervous system neuron development
 relationship: part_of GO:0021772 ! olfactory bulb development
 created_by: dph
 creation_date: 2012-05-15T12:30:21Z
@@ -387074,7 +387310,6 @@
 namespace: biological_process
 def: "The progression of the reproductive system over time from its formation to the mature structure. The reproductive system consists of the organs that function in reproduction." [GOC:dph]
 is_a: GO:0048731 ! system development
-is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-08-22T17:47:53Z
 
@@ -387189,6 +387424,7 @@
 def: "The process in which a relatively unspecialized T cell acquires specialized features of a mature T follicular helper cell." [GOC:dph, PMID:21572431]
 synonym: "T-helper follicular cell differentiation" EXACT [GOC:dph]
 is_a: GO:0042093 ! T-helper cell differentiation
+is_a: GO:0160083 ! exhausted T cell differentiation
 created_by: dph
 creation_date: 2012-11-02T09:01:48Z
 
@@ -387973,6 +388209,7 @@
 synonym: "ganglia development" RELATED [GOC:dph]
 synonym: "gangliogenesis" NARROW [GOC:BHF, GOC:rl]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 created_by: dph
 creation_date: 2013-07-10T08:36:12Z
@@ -390973,10 +391210,13 @@
 
 [Term]
 id: GO:0061794
-name: conidium development
+name: obsolete conidium development
 namespace: biological_process
-def: "The process whose specific outcome is the progression of conidium over time, from its formation to the mature structure. Conidia are non-motile spores produced via mitotic asexual reproduction in higher fungi; they are haploid cells genetically identical to their haploid parent. They are produced by conversion of hyphal elements, or are borne on sporogenous cells on or within specialized structures termed conidiophores, and participate in dispersal of the fungus." [GOC:di, GOC:dph]
-is_a: GO:0048468 ! cell development
+def: "OBSOLETE. The process whose specific outcome is the progression of conidium over time, from its formation to the mature structure. Conidia are non-motile spores produced via mitotic asexual reproduction in higher fungi; they are haploid cells genetically identical to their haploid parent. They are produced by conversion of hyphal elements, or are borne on sporogenous cells on or within specialized structures termed conidiophores, and participate in dispersal of the fungus." [GOC:di, GOC:dph]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term. Its only child, conidium formation (GO:0048315), is the term annotators should use.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32315" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0048315
 created_by: dph
 creation_date: 2016-09-17T09:53:51Z
 
@@ -393195,39 +393435,45 @@
 
 [Term]
 id: GO:0062028
-name: regulation of stress granule assembly
+name: regulation of cytoplasmic stress granule assembly
 namespace: biological_process
-def: "Any process that modulates the rate, frequency or extent of stress granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a stress granule." [PMID:20180778]
+def: "Any process that modulates the rate, frequency or extent of cytoplasmic stress granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a cytoplasmic stress granule." [PMID:20180778]
+synonym: "regulation of stress granule assembly" BROAD []
 is_a: GO:1902115 ! regulation of organelle assembly
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0034063 ! stress granule assembly
-relationship: regulates GO:0034063 ! stress granule assembly
+intersection_of: regulates GO:0034063 ! cytoplasmic stress granule assembly
+relationship: regulates GO:0034063 ! cytoplasmic stress granule assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32317" xsd:anyURI
 created_by: dph
 creation_date: 2018-04-16T19:12:41Z
 
 [Term]
 id: GO:0062029
-name: positive regulation of stress granule assembly
+name: positive regulation of cytoplasmic stress granule assembly
 namespace: biological_process
-def: "Any process that starts or increases the rate, frequency or extent of stress-granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a stress granule." [PMID:20180778]
-is_a: GO:0062028 ! regulation of stress granule assembly
+def: "Any process that starts or increases the rate, frequency or extent of cytoplasmic stress granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a cytoplasmic stress granule." [PMID:20180778]
+synonym: "positive regulation of stress granule assembly" BROAD []
+is_a: GO:0062028 ! regulation of cytoplasmic stress granule assembly
 is_a: GO:1902117 ! positive regulation of organelle assembly
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0034063 ! stress granule assembly
-relationship: positively_regulates GO:0034063 ! stress granule assembly
+intersection_of: positively_regulates GO:0034063 ! cytoplasmic stress granule assembly
+relationship: positively_regulates GO:0034063 ! cytoplasmic stress granule assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32317" xsd:anyURI
 created_by: dph
 creation_date: 2018-04-16T19:17:10Z
 
 [Term]
 id: GO:0062030
-name: negative regulation of stress granule assembly
+name: negative regulation of cytoplasmic stress granule assembly
 namespace: biological_process
-def: "Any process that stops or decreases the rate, frequency or extent of stress-granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a stress granule." [PMID:20180778]
-is_a: GO:0062028 ! regulation of stress granule assembly
+def: "Any process that stops or decreases the rate, frequency or extent of cytoplasmic stress granule assembly, the aggregation, arrangement and bonding together of proteins and RNA molecules to form a cytoplasmic stress granule." [PMID:20180778]
+synonym: "negative regulation of stress granule assembly" BROAD []
+is_a: GO:0062028 ! regulation of cytoplasmic stress granule assembly
 is_a: GO:1902116 ! negative regulation of organelle assembly
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0034063 ! stress granule assembly
-relationship: negatively_regulates GO:0034063 ! stress granule assembly
+intersection_of: negatively_regulates GO:0034063 ! cytoplasmic stress granule assembly
+relationship: negatively_regulates GO:0034063 ! cytoplasmic stress granule assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32317" xsd:anyURI
 created_by: dph
 creation_date: 2018-04-16T19:19:32Z
 
@@ -394402,7 +394648,7 @@
 name: L-beta-ethynylserine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-beta-ethynylserine. L-beta-ethynylserine is an antibiotic produced by Streptomyces bacteria." [PMID:3082841, PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -394413,7 +394659,7 @@
 name: L-propargylglycine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-propargylglycine (Pra). L-propargylglycine is an antibiotic produced by Streptomyces bacteria." [PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -397410,7 +397656,8 @@
 synonym: "D-serine biosynthesis" EXACT []
 synonym: "D-serine formation" EXACT []
 synonym: "D-serine synthesis" EXACT []
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0070180
@@ -401237,6 +401484,8 @@
 xref: RHEA:11388
 xref: RHEA:42200
 xref: RHEA:84079
+xref: RHEA:86411
+xref: RHEA:86451
 xref: Wikipedia:11beta-hydroxysteroid_dehydrogenase
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.146
@@ -401244,6 +401493,8 @@
 property_value: skos:exactMatch RHEA:11388
 property_value: skos:narrowMatch RHEA:42200
 property_value: skos:narrowMatch RHEA:84079
+property_value: skos:narrowMatch RHEA:86411
+property_value: skos:narrowMatch RHEA:86451
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28173" xsd:anyURI
 
@@ -402015,14 +402266,16 @@
 
 [Term]
 id: GO:0070595
-name: (1->3)-alpha-glucan metabolic process
+name: obsolete (1->3)-alpha-glucan metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds." [GOC:mah]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "1,3-alpha-glucan metabolic process" EXACT [GOC:mah]
 synonym: "1,3-alpha-glucan metabolism" EXACT [GOC:mah]
 synonym: "alpha-1,3 glucan metabolic process" EXACT [GOC:mah]
 synonym: "alpha-1,3 glucan metabolism" EXACT [GOC:mah]
-is_a: GO:0030978 ! alpha-glucan metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-04-28T03:35:03Z
 
@@ -402042,21 +402295,21 @@
 synonym: "alpha-1,3 glucan formation" EXACT [GOC:mah]
 synonym: "alpha-1,3 glucan synthesis" EXACT [GOC:mah]
 is_a: GO:0030979 ! alpha-glucan biosynthetic process
-is_a: GO:0070595 ! (1->3)-alpha-glucan metabolic process
 created_by: mah
 creation_date: 2009-04-28T03:39:24Z
 
 [Term]
 id: GO:0070597
-name: cell wall (1->3)-alpha-glucan metabolic process
+name: obsolete cell wall (1->3)-alpha-glucan metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds, found in the walls of cells." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds, found in the walls of cells." [GOC:mah]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "cell wall 1,3-alpha-glucan metabolic process" EXACT [GOC:mah]
 synonym: "cell wall 1,3-alpha-glucan metabolism" EXACT [GOC:mah]
 synonym: "cell wall alpha-1,3 glucan metabolic process" EXACT [GOC:mah]
 synonym: "cell wall alpha-1,3 glucan metabolism" EXACT [GOC:mah]
-is_a: GO:0010383 ! cell wall polysaccharide metabolic process
-is_a: GO:0070595 ! (1->3)-alpha-glucan metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-04-28T04:03:00Z
 
@@ -402077,21 +402330,20 @@
 synonym: "cell wall alpha-1,3-glucan synthesis" EXACT [GOC:mah]
 is_a: GO:0070592 ! cell wall polysaccharide biosynthetic process
 is_a: GO:0070596 ! (1->3)-alpha-glucan biosynthetic process
-is_a: GO:0070597 ! cell wall (1->3)-alpha-glucan metabolic process
 created_by: mah
 creation_date: 2009-04-28T04:04:59Z
 
 [Term]
 id: GO:0070599
-name: fungal-type cell wall (1->3)-alpha-glucan metabolic process
+name: obsolete fungal-type cell wall (1->3)-alpha-glucan metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds, found in the walls of ascospores." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways involving (1->3)-alpha-D-glucans, compounds composed of glucose residues linked by (1->3)-alpha-D-glucosidic bonds, found in the walls of ascospores." [GOC:mah]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "ascospore wall 1,3-alpha-glucan metabolic process" EXACT [GOC:mah]
 synonym: "ascospore wall 1,3-alpha-glucan metabolism" EXACT [GOC:mah]
 synonym: "ascospore wall alpha-1,3 glucan metabolic process" EXACT [GOC:mah]
 synonym: "ascospore wall alpha-1,3 glucan metabolism" EXACT [GOC:mah]
-is_a: GO:0070597 ! cell wall (1->3)-alpha-glucan metabolic process
-is_a: GO:0071966 ! fungal-type cell wall polysaccharide metabolic process
+is_obsolete: true
 created_by: mah
 creation_date: 2009-04-28T04:07:23Z
 
@@ -402112,7 +402364,6 @@
 synonym: "fungal-type cell wall alpha-1,3-glucan synthesis" EXACT [GOC:mah]
 is_a: GO:0051278 ! fungal-type cell wall polysaccharide biosynthetic process
 is_a: GO:0070598 ! cell wall (1->3)-alpha-glucan biosynthetic process
-is_a: GO:0070599 ! fungal-type cell wall (1->3)-alpha-glucan metabolic process
 created_by: mah
 creation_date: 2009-04-28T04:09:48Z
 
@@ -402512,15 +402763,17 @@
 
 [Term]
 id: GO:0070629
-name: (1->4)-alpha-glucan metabolic process
+name: obsolete (1->4)-alpha-glucan metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (1->4)-alpha-glucans, compounds composed of glucose residues linked by (1->4)-alpha-D-glucosidic bonds." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways involving (1->4)-alpha-glucans, compounds composed of glucose residues linked by (1->4)-alpha-D-glucosidic bonds." [GOC:mah]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "(1->4)-alpha-D-glucan metabolism" EXACT [GOC:mah]
 synonym: "1,4-alpha-D-glucan metabolism" EXACT [GOC:mah]
 synonym: "1,4-alpha-glucan metabolism" EXACT [GOC:mah]
 synonym: "alpha-1,4 glucan metabolic process" EXACT [GOC:mah]
 synonym: "alpha-1,4 glucan metabolism" EXACT [GOC:mah]
-is_a: GO:0030978 ! alpha-glucan metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-05-01T04:45:42Z
 
@@ -402544,7 +402797,6 @@
 synonym: "alpha-1,4 glucan formation" EXACT [GOC:mah]
 synonym: "alpha-1,4 glucan synthesis" EXACT [GOC:mah]
 is_a: GO:0030979 ! alpha-glucan biosynthetic process
-is_a: GO:0070629 ! (1->4)-alpha-glucan metabolic process
 created_by: mah
 creation_date: 2009-05-01T04:46:34Z
 
@@ -409963,7 +410215,6 @@
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: mah
@@ -418447,7 +418698,6 @@
 def: "The directed movement of phytochelatins into the vacuole. Phytochelatins are a group of peptides that bind metals (Cd, Zn, Cu, Pb, Hg) in thiolate coordination complexes." [GOC:mah, ISBN:0198506732]
 synonym: "cadystin import into vacuole" RELATED [GOC:vw, Wikipedia:Phytochelatin#History]
 synonym: "phytochelatin transport into vacuole" EXACT [GOC:vw]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0071994 ! phytochelatin transmembrane transport
 created_by: mah
@@ -418459,7 +418709,6 @@
 namespace: biological_process
 def: "The directed movement of glutathione into the vacuole across the vacuolar membrane." [GOC:mah]
 synonym: "glutathione transport into vacuole" EXACT [GOC:vw]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0034775 ! glutathione transmembrane transport
 created_by: mah
@@ -418813,6 +419062,7 @@
 def: "The process whose specific outcome is the progression of the S1 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S1 portion is the initial portion of the proximal convoluted tubule and is responsible for avid reabsorption of water and solutes." [GOC:mtg_kidney_jan10, MA:0002612]
 synonym: "S1 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:55:57Z
@@ -418824,6 +419074,7 @@
 def: "The process whose specific outcome is the progression of the S2 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S2 portion of the tubule is involved in reabsorption of water and sodium chloride." [GOC:mtg_kidney_jan10, MA:0002613]
 synonym: "S2 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:56:36Z
@@ -418973,6 +419224,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a collecting duct over time, from its formation to the mature structure. The collecting duct responds to vasopressin and aldosterone to regulate water, electrolyte and acid-base balance. It is the final common path through which urine flows before entering the ureter and then emptying into the bladder." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:18:06Z
@@ -419200,6 +419452,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the long descending thin limb bend over time, from its formation to the mature structure. The long descending thin limb bend is a part of the descending thin limb of a long nephron that lies beyond the prebend segment." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072064 ! long descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:13:38Z
@@ -419210,6 +419463,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the prebend segment over time, from its formation to the mature structure. The prebend segment is a part of the descending thin limb that lies before the bend and exhibits permeabilities characteristic of the ascending limb, especially negligible water permeability." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072022 ! descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:14:02Z
@@ -421826,9 +422080,9 @@
 
 [Term]
 id: GO:0072304
-name: obsolete obsolete regulation of mesenchymal cell apoptotic process involved in metanephric nephron morphogenesis
+name: obsolete regulation of mesenchymal cell apoptotic process involved in metanephric nephron morphogenesis
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the occurrence or rate of mesenchymal stem cell death by apoptotic process that contributes to the shaping of the nephron in the metanephros." [GOC:mtg_apoptosis, GOC:mtg_kidney_jan10]
+def: "OBSOLETE. Any process that modulates the occurrence or rate of mesenchymal stem cell death by apoptotic process that contributes to the shaping of the nephron in the metanephros." [GOC:mtg_apoptosis, GOC:mtg_kidney_jan10]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of mesenchymal stem cell apoptosis involved in metanephric nephron morphogenesis" NARROW []
 synonym: "regulation of mesenchymal stem cell apoptotic process involved in metanephric nephron morphogenesis" EXACT []
@@ -422001,10 +422255,11 @@
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
 
@@ -423893,6 +424148,7 @@
 def: "The reproductive developmental process whose specific outcome is the progression of the seminiferous tubule over time, from its formation to the mature structure. Seminiferous tubules are ducts located in the testicles, and are the specific location of meiosis, and the subsequent creation of gametes, namely spermatozoa." [GOC:BHF, GOC:mah, UBERON:0001343]
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0008584 ! male gonad development
 created_by: mah
 creation_date: 2011-01-04T12:50:36Z
@@ -424591,6 +424847,7 @@
 synonym: "clathrin-mediated endocytosis" EXACT []
 synonym: "CME" EXACT [PMID:20074057]
 is_a: GO:0006898 ! receptor-mediated endocytosis
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32256" xsd:anyURI
 created_by: mah
 creation_date: 2011-02-08T03:59:18Z
 
@@ -424603,6 +424860,8 @@
 synonym: "caveolae-mediated endocytosis" EXACT [GOC:mah]
 synonym: "caveolin-dependent endocytosis" EXACT [GOC:BHF]
 is_a: GO:0006897 ! endocytosis
+is_a: GO:0016192 ! vesicle-mediated transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32256" xsd:anyURI
 created_by: mah
 creation_date: 2011-02-08T04:08:33Z
 
@@ -430057,7 +430316,7 @@
 
 [Term]
 id: GO:0080019
-name: alcohol-forming very long-chain fatty acyl-CoA reductase activity
+name: alcohol-forming very long-chain fatty acyl-CoA reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a very long-chain fatty acyl-CoA + 2 NADPH + 2 H+ = a very long-chain primary fatty alcohol + 2 NADP+ + CoA." [PMID:16980563, RHEA:81751]
 comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
@@ -430165,6 +430424,14 @@
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
@@ -430214,6 +430481,14 @@
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
@@ -430584,7 +430859,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the integument over time, from its formation to the mature structure. Integument is one of the layers of tissue that usually covers the ovule, enveloping the nucellus and forming the micropyle at the apex." [PMID:19054366, PO:0020021]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048481 ! plant ovule development
 created_by: dhl
@@ -430839,7 +431113,6 @@
 def: "The process whose specific outcome is the progression of the filament over time, from its formation to the mature structure. Filament is the stalk of a stamen." [PMID:19139039, PO:0009067]
 synonym: "filament development" EXACT []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 created_by: dhl
@@ -431719,7 +431992,6 @@
 namespace: biological_process
 def: "The directed movement of auxins from endoplasmic reticulum to cytosol." [PMID:19506555]
 synonym: "intracellular auxin transport" BROAD []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:0060918 ! auxin transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22948" xsd:anyURI
@@ -431766,7 +432038,6 @@
 def: "The process whose specific outcome is the progression of the stomium over time, from its formation to the mature structure. A stomium is a fissure or pore in the anther lobe through which the pollen is released." [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0022412 ! cellular process involved in reproduction in multicellular organism
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 created_by: dhl
@@ -433822,7 +434093,6 @@
 name: L-aspartate transmembrane export from vacuole
 namespace: biological_process
 def: "The directed movement of L-aspartate out of the vacuole, across the vacuolar membrane." [PMID:21307582]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0034487 ! vacuolar amino acid transmembrane transport
 is_a: GO:0070778 ! L-aspartate transmembrane transport
@@ -434029,6 +434299,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the hypoblast over time, from its formation to the mature structure. The hypoblast is a tissue formed from the inner cell mass that lies beneath the epiblast." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: tb
 creation_date: 2009-07-29T10:25:54Z
 
@@ -435213,7 +435484,7 @@
 name: regulation of COPII vesicle uncoating
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of COPII vesicle uncoating, the process in which COPII vesicle coat proteins are disassembled, and released." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0090112 ! COPII vesicle uncoating
 relationship: regulates GO:0090112 ! COPII vesicle uncoating
@@ -435323,7 +435594,6 @@
 def: "The directed movement of cholesterol, cholest-5-en-3-beta-ol, or cholesterol-containing compounds, from the lysosome to the endoplasmic reticulum." [GOC:mah]
 synonym: "lysosome to endoplasmic reticulum cholesterol transport" EXACT [GOC:mah]
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016192 ! vesicle-mediated transport
 is_a: GO:0032367 ! intracellular cholesterol transport
 relationship: occurs_in GO:0005737 ! cytoplasm
@@ -438471,7 +438741,6 @@
 name: oligopeptide export from mitochondrion
 namespace: biological_process
 def: "The process in which an oligopeptide is transported out of the mitochondrial matrix. Oligopeptides are molecules that contain a small number (2 to 20) of amino-acid residues connected by peptide linkages." [PMID:11251115]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0035672 ! oligopeptide transmembrane transport
 created_by: tb
 creation_date: 2010-08-27T04:38:18Z
@@ -438935,7 +439204,6 @@
 name: molybdate ion export from vacuole
 namespace: biological_process
 def: "The directed movement of molybdate ions out of the vacuole." [GOC:tb]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015689 ! molybdate ion transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 created_by: tb
@@ -439271,16 +439539,18 @@
 
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
 
@@ -439405,7 +439675,6 @@
 def: "The directed movement of ornithine into the vacuole across the vacuolar membrane." [GOC:tb]
 synonym: "vacuolar ornithine import" RELATED [GOC:tb]
 is_a: GO:0003333 ! amino acid transmembrane transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015822 ! ornithine transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:1905039 ! carboxylic acid transmembrane transport
@@ -440386,7 +440655,6 @@
 name: plant epidermis development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the plant epidermis over time, from its formation to the mature structure." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2014-02-27T15:17:37Z
@@ -445467,11 +445735,13 @@
 
 [Term]
 id: GO:0097287
-name: 7-cyano-7-deazaguanine metabolic process
+name: obsolete 7-cyano-7-deazaguanine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving the Q nucleoside precursor 7-cyano-7-deazaguanine, also known as 2-amino-4-oxo-4,7-dihydro-3H-pyrrolo[2,3-d]pyrimidine-5-carbonitrile or preQo." [GOC:yaf, PMID:364423]
+def: "OBSOLETE. The chemical reactions and pathways involving the Q nucleoside precursor 7-cyano-7-deazaguanine, also known as 2-amino-4-oxo-4,7-dihydro-3H-pyrrolo[2,3-d]pyrimidine-5-carbonitrile or preQo." [GOC:yaf, PMID:364423]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "7-cyano-7-deazaguanine metabolism" EXACT []
-is_a: GO:0050898 ! nitrile metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2012-04-25T10:50:50Z
 
@@ -445485,7 +445755,6 @@
 synonym: "7-cyano-7-deazaguanine formation" EXACT []
 synonym: "7-cyano-7-deazaguanine synthesis" EXACT []
 is_a: GO:0080028 ! nitrile biosynthetic process
-is_a: GO:0097287 ! 7-cyano-7-deazaguanine metabolic process
 created_by: pr
 creation_date: 2012-04-25T10:53:47Z
 
@@ -446303,7 +446572,7 @@
 id: GO:0097365
 name: obsolete stretch-activated, monoatomic cation-selective, calcium channel activity involved in regulation of cardiac muscle cell action potential
 namespace: molecular_function
-def: "OBSOLETE. OBSOLETE. Enables the transmembrane transfer of a calcium ion by a channel that opens in response to a mechanical stress in the form of stretching, and contributing to the regulation of action potential in a cardiac muscle cell." [GOC:BHF, GOC:mtg_cardiac_conduct_nov11, PMID:21290758]
+def: "OBSOLETE. Enables the transmembrane transfer of a calcium ion by a channel that opens in response to a mechanical stress in the form of stretching, and contributing to the regulation of action potential in a cardiac muscle cell." [GOC:BHF, GOC:mtg_cardiac_conduct_nov11, PMID:21290758]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "stretch-activated, cation-selective, calcium channel activity involved in regulation of cardiac muscle cell action potential" BROAD []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31205" xsd:anyURI
@@ -446708,7 +446977,6 @@
 subset: goslim_synapse
 synonym: "synaptic vesicle lumen pH reduction" EXACT []
 synonym: "synaptic vesicle proton loading" EXACT syngo_official_label []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0051649 ! establishment of localization in cell
 is_a: GO:0070050 ! neuron cellular homeostasis
 is_a: GO:1902600 ! proton transmembrane transport
@@ -450246,6 +450514,7 @@
 synonym: "ameboid sperm movement" EXACT []
 synonym: "amoeboid sperm movement" EXACT []
 is_a: GO:0097722 ! sperm motility
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32337" xsd:anyURI
 created_by: pr
 creation_date: 2016-09-01T12:02:19Z
 
@@ -453033,9 +453302,9 @@
 
 [Term]
 id: GO:0098697
-name: obsolete obsolete ryanodine-sensitive calcium-release channel activity involved in regulation of postsynaptic cytosolic calcium levels
+name: obsolete ryanodine-sensitive calcium-release channel activity involved in regulation of postsynaptic cytosolic calcium levels
 namespace: molecular_function
-def: "OBSOLETE. OBSOLETE. Any ryanodine-sensitive calcium-release channel activity that is involved in regulation of postsynaptic cytosolic calcium ion concentration." [GOC:dos]
+def: "OBSOLETE. Any ryanodine-sensitive calcium-release channel activity that is involved in regulation of postsynaptic cytosolic calcium ion concentration." [GOC:dos]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31205" xsd:anyURI
 is_obsolete: true
@@ -453082,7 +453351,6 @@
 synonym: "neurotransmitter uptake into synaptic vesicle" EXACT [PMID:15217342]
 synonym: "synaptic vesicle neurotransmitter loading" EXACT syngo_official_label []
 is_a: GO:0006836 ! neurotransmitter transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0051649 ! establishment of localization in cell
 relationship: part_of GO:0099504 ! synaptic vesicle cycle
 
@@ -454853,6 +455121,7 @@
 def: "A receptor-mediated endocytosis process that results in the internalization of a neurotransmitter receptor from the postsynaptic membrane endocytic zone into an endocytic vesicle." [GOC:dos]
 subset: goslim_synapse
 synonym: "postsynaptic neurotransmitter receptor endocytosis" EXACT syngo_official_label []
+is_a: GO:0099003 ! vesicle-mediated transport in synapse
 is_a: GO:0099072 ! regulation of postsynaptic membrane neurotransmitter receptor levels
 is_a: GO:0099590 ! neurotransmitter receptor internalization
 is_a: GO:0140239 ! postsynaptic endocytosis
@@ -454883,7 +455152,6 @@
 def: "The directed movement of neurotransmitter receptor from the postsynaptic endosome to the postsynaptic membrane in transport vesicles." [GOC:dos]
 subset: goslim_synapse
 synonym: "postsynaptic neurotransmitter receptor endosomal trafficking" BROAD []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0098969 ! neurotransmitter receptor transport to postsynaptic membrane
 is_a: GO:0099639 ! neurotransmitter receptor transport, endosome to plasma membrane
 
@@ -455331,7 +455599,6 @@
 name: vesicle-mediated transport between endosomal compartments
 namespace: biological_process
 def: "A cellular transport process in which transported substances are moved in membrane-bounded vesicles between endosomal compartments, e.g, between early endosome and sorting endosome." [GOC:dos, PMID:10930469]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016197 ! endosomal transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26386" xsd:anyURI
 
@@ -456794,7 +457061,6 @@
 synonym: "mitochondrion to lysosome transport" EXACT []
 is_a: GO:0006839 ! mitochondrial transport
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0099075 ! mitochondrion-derived vesicle mediated transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26246" xsd:anyURI
 
@@ -456812,7 +457078,6 @@
 namespace: biological_process
 def: "Vesicle-mediated transport of cargo from the mitochondrion to the peroxisome, mediated by a mitochondrion-derived vesicle." [GOC:bc, GOC:pad, GOC:PARL-UCL, PMID:20619655]
 synonym: "mitochondrion to peroxisome transport" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0099075 ! mitochondrion-derived vesicle mediated transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26246" xsd:anyURI
 
@@ -457879,7 +458144,6 @@
 subset: goslim_synapse
 synonym: "zinc import into synaptic vesicle" EXACT []
 synonym: "Zn2+ import into synaptic vesicle" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0062111 ! zinc ion import into organelle
 
 [Term]
@@ -458078,7 +458342,6 @@
 namespace: biological_process
 def: "Development of a plant organ, a multi-tissue plant structure that forms a functional unit." [GOC:dos]
 synonym: "development of a plant organ" EXACT []
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048731 ! system development
 
@@ -461878,14 +462141,15 @@
 id: GO:0102149
 name: farnesylcysteine lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-[(2E,6E)-farnesyl]-L-cysteine + O2 + H2O = (2-trans,6-trans)-farnesal + L-cysteine + H2O2." [EC:1.8.3.6, GOC:pz]
+def: "Catalysis of the reaction: S-[(2E,6E)-farnesyl]-L-cysteine + O2 + H2O = (2-trans,6-trans)-farnesal + L-cysteine + H2O2." [EC:1.8.3.6]
 xref: EC:1.8.3.6
 xref: MetaCyc:RXN-11623
 xref: RHEA:30231
-is_a: GO:0016670 ! oxidoreductase activity, acting on a sulfur group of donors, oxygen as acceptor
+is_a: GO:0001735 ! prenylcysteine oxidase activity
 property_value: skos:exactMatch EC:1.8.3.6
 property_value: skos:exactMatch RHEA:30231
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0102150
@@ -461977,6 +462241,7 @@
 xref: RHEA:45812
 xref: RHEA:79187
 xref: RHEA:83119
+xref: RHEA:84379
 is_a: GO:0080023 ! (2E)-enoyl-CoA hydratase activity
 property_value: skos:exactMatch EC:4.2.1.134
 property_value: skos:exactMatch RHEA:45812
@@ -461987,6 +462252,7 @@
 property_value: skos:narrowMatch RHEA:39271
 property_value: skos:narrowMatch RHEA:79187
 property_value: skos:narrowMatch RHEA:83119
+property_value: skos:narrowMatch RHEA:84379
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24738" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25805" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -462073,10 +462339,11 @@
 xref: EC:2.3.1.195
 xref: MetaCyc:RXN-11852
 xref: RHEA:28254
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+is_a: GO:0004026 ! alcohol O-acetyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.195
 property_value: skos:exactMatch RHEA:28254
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
 [Term]
 id: GO:0102166
@@ -468637,11 +468904,11 @@
 id: GO:0102810
 name: glutarate-semialdehyde dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-oxopentanoate + NADP + H2O = glutarate + NADPH + 2 H+." [GOC:pz, RHEA:57832]
+def: "Catalysis of the reaction: 5-oxopentanoate + NADP + H2O = glutarate + NADPH + 2 H+." [RHEA:57832]
 xref: EC:1.2.1.20
 xref: MetaCyc:RXN-8182
 xref: RHEA:57832
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0033721 ! aldehyde dehydrogenase (NADP+) activity
 property_value: skos:exactMatch EC:1.2.1.20
 property_value: skos:exactMatch RHEA:57832
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25447" xsd:anyURI
@@ -470207,7 +470474,7 @@
 
 [Term]
 id: GO:0102965
-name: alcohol-forming long-chain fatty acyl-CoA reductase activity
+name: alcohol-forming long-chain fatty acyl-CoA reductase (NADP+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a long-chain fatty acyl-CoA + 2 H+ + 2 NADPH = a long-chain primary fatty alcohol + CoA + 2 NADP+. A long-chain fatty acid has an aliphatic tail containing 13 to 22 carbons." [GOC:pz, RHEA:52716]
 comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
@@ -470451,13 +470718,13 @@
 
 [Term]
 id: GO:0102984
-name: sulfoacetaldehyde dehydrogenase activity
+name: sulfoacetaldehyde dehydrogenase (NAD+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: sulfonatoacetaldehyde + H2O + NAD = sulfonatoacetate + NADH + 2 H+." [EC:1.2.1.73, GOC:pz]
+def: "Catalysis of the reaction: sulfoacetaldehyde + NAD+ + H2O = sulfoacetate + NADH + 2 H+." [RHEA:25637]
 xref: EC:1.2.1.73
 xref: MetaCyc:RXN-9592
 xref: RHEA:25637
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch EC:1.2.1.73
 property_value: skos:exactMatch RHEA:25637
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -472420,13 +472687,14 @@
 
 [Term]
 id: GO:0106064
-name: regulation of cobalamin metabolic process
+name: regulation of cobalamin catabolic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of the chemical reactions and pathways involving cobalamin (vitamin B12), a water-soluble vitamin characterized by possession of a corrin nucleus containing a cobalt atom." [PMID:29056341]
+def: "Any process that modulates the frequency, rate or extent of cobalamin (vitamin B12) catabolic process." [PMID:29056341]
 is_a: GO:1901401 ! regulation of tetrapyrrole metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0009235 ! cobalamin metabolic process
 relationship: regulates GO:0009235 ! cobalamin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: hjd
 creation_date: 2017-10-27T17:33:05Z
 
@@ -473011,27 +473279,29 @@
 
 [Term]
 id: GO:0106121
-name: positive regulation of cobalamin metabolic process
+name: positive regulation of cobalamin catabolic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of a cobalamin metabolic process." [PMID:29056341]
+def: "Any process that activates or increases the frequency, rate or extent of a cobalamin (vitamin B12) catabolic process." [PMID:29056341]
 is_a: GO:0009893 ! positive regulation of metabolic process
-is_a: GO:0106064 ! regulation of cobalamin metabolic process
+is_a: GO:0106064 ! regulation of cobalamin catabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0009235 ! cobalamin metabolic process
 relationship: positively_regulates GO:0009235 ! cobalamin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: hjd
 creation_date: 2018-05-01T18:07:12Z
 
 [Term]
 id: GO:0106122
-name: negative regulation of cobalamin metabolic process
+name: negative regulation of cobalamin catabolic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of a cobalamin metabolic process." [PMID:29056341]
+def: "Any process that stops, prevents or reduces the frequency, rate or extent of a cobalamin (vitamin B12) catabolic process." [PMID:29056341]
 is_a: GO:0009892 ! negative regulation of metabolic process
-is_a: GO:0106064 ! regulation of cobalamin metabolic process
+is_a: GO:0106064 ! regulation of cobalamin catabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0009235 ! cobalamin metabolic process
 relationship: negatively_regulates GO:0009235 ! cobalamin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: hjd
 creation_date: 2018-05-01T18:12:48Z
 
@@ -473461,8 +473731,8 @@
 is_a: GO:0008080 ! N-acetyltransferase activity
 is_a: GO:0140640 ! catalytic activity, acting on a nucleic acid
 property_value: skos:exactMatch RHEA:58480
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16755" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
-property_value: terms:contributor "https://github.com/geneontology/go-ontology/issues/16755" xsd:anyURI
 created_by: hjd
 creation_date: 2018-12-18T19:19:06Z
 
@@ -475083,6 +475353,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: (6S)-5-methyl-5,6,7,8-tetrahydrofolate + NAD+ = (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NADH + H+." [RHEA:19821]
 xref: EC:1.5.1.54
+xref: KEGG_REACTION:R07168
 xref: MetaCyc:RXN-22438
 xref: RHEA:19821
 is_a: GO:0004489 ! methylenetetrahydrofolate reductase [NAD(P)H] activity
@@ -475090,6 +475361,7 @@
 property_value: skos:exactMatch RHEA:19821
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27535" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32310" xsd:anyURI
 created_by: hjd
 creation_date: 2020-09-23T14:20:07Z
 
@@ -475099,6 +475371,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: (6S)-5-methyl-5,6,7,8-tetrahydrofolate + NADP+ = (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NADPH + H+." [RHEA:19817]
 xref: EC:1.5.1.53
+xref: KEGG_REACTION:R01224
 xref: MetaCyc:RXN-21991
 xref: RHEA:19817
 is_a: GO:0004489 ! methylenetetrahydrofolate reductase [NAD(P)H] activity
@@ -475106,6 +475379,7 @@
 property_value: skos:exactMatch RHEA:19817
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27535" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32310" xsd:anyURI
 created_by: hjd
 creation_date: 2020-09-23T14:20:27Z
 
@@ -475796,10 +476070,12 @@
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
@@ -475861,7 +476137,7 @@
 
 [Term]
 id: GO:0106373
-name: 3-deoxyglucosone dehydrogenase activity
+name: 3-deoxyglucosone dehydrogenase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 3-deoxyglucosone + H2O + NAD+ = 2-dehydro-3-deoxy-D-gluconate + 2 H+ + NADH." [PMID:17175089, RHEA:67244]
 xref: RHEA:67244
@@ -476020,6 +476296,29 @@
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
@@ -476040,6 +476339,29 @@
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
@@ -476115,42 +476437,34 @@
 
 [Term]
 id: GO:0106393
-name: regulation of palmitic acid catabolic process
+name: obsolete regulation of palmitic acid catabolic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
-is_a: GO:0019217 ! regulation of fatty acid metabolic process
-is_a: GO:0050994 ! regulation of lipid catabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900534 ! palmitic acid catabolic process
-relationship: regulates GO:1900534 ! palmitic acid catabolic process
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: hjd
 creation_date: 2021-10-08T15:17:05Z
 
 [Term]
 id: GO:0106394
-name: negative regulation of palmitic acid catabolic process
+name: obsolete negative regulation of palmitic acid catabolic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
-is_a: GO:0045922 ! negative regulation of fatty acid metabolic process
-is_a: GO:0050995 ! negative regulation of lipid catabolic process
-is_a: GO:0106393 ! regulation of palmitic acid catabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900534 ! palmitic acid catabolic process
-relationship: negatively_regulates GO:1900534 ! palmitic acid catabolic process
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: hjd
 creation_date: 2021-10-08T15:25:47Z
 
 [Term]
 id: GO:0106395
-name: positive regulation of palmitic acid catabolic process
+name: obsolete positive regulation of palmitic acid catabolic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
-is_a: GO:0045923 ! positive regulation of fatty acid metabolic process
-is_a: GO:0050996 ! positive regulation of lipid catabolic process
-is_a: GO:0106393 ! regulation of palmitic acid catabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900534 ! palmitic acid catabolic process
-relationship: positively_regulates GO:1900534 ! palmitic acid catabolic process
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of a palmitic acid catabolic process." [PMID:14677856]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: hjd
 creation_date: 2021-10-08T15:30:08Z
 
@@ -478301,7 +478615,6 @@
 name: L-glutamate import into mitochondrion
 namespace: biological_process
 def: "The process in which L-glutamate is transported from the cytosol into the mitochondrial matrix." [GOC:vw, PMID:30297026]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015813 ! L-glutamate transmembrane transport
 created_by: kmv
 creation_date: 2019-04-24T19:13:46Z
@@ -483509,6 +483822,19 @@
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
@@ -483518,6 +483844,19 @@
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
@@ -483680,7 +484019,7 @@
 
 [Term]
 id: GO:0120533
-name: glyceraldehyde-3-phosphate dehydrogenase [NAD(P)+] (non-phosphorylating) activity
+name: glyceraldehyde-3-phosphate dehydrogenase (non-phosphorylating, [NAD(P)+] ) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: D-glyceraldehyde 3-phosphate + NAD(P)+ + H2O = (2R)-3-phosphoglycerate + NAD(P)H + 2 H+." [EC:1.2.1.90]
 synonym: "GAPN activity" BROAD [EC:1.2.1.90]
@@ -484229,7 +484568,8 @@
 id: GO:0120571
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
+def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460, RHEA:86675]
+xref: RHEA:86675
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
@@ -484308,9 +484648,9 @@
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
@@ -486076,7 +486416,6 @@
 name: copper ion export from vacuole
 namespace: biological_process
 def: "The directed movement of copper ions out of the vacuole across the vacuolar membrane." [GOC:vw, PMID:12244050]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0035434 ! copper ion transmembrane transport
 created_by: pg
@@ -486087,7 +486426,6 @@
 name: calcium ion import into vacuole
 namespace: biological_process
 def: "The directed movement of calcium cations into the vacuole across the vacuolar membrane." [GOC:vw, PMID:8628289]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0070588 ! calcium ion transmembrane transport
 created_by: pg
@@ -486098,7 +486436,6 @@
 name: zinc ion export from vacuole
 namespace: biological_process
 def: "The directed movement of zinc ions from inside the vacuole across the vacuolar membrane and into the cytosol." [GOC:vw, PMC:PMC203372]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0071577 ! zinc ion transmembrane transport
 created_by: pg
@@ -486355,6 +486692,7 @@
 xref: RHEA:69028
 xref: RHEA:84155
 xref: RHEA:84199
+xref: RHEA:84203
 xref: RHEA:85551
 xref: RHEA:85559
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
@@ -486369,6 +486707,7 @@
 property_value: skos:narrowMatch RHEA:69028
 property_value: skos:narrowMatch RHEA:84155
 property_value: skos:narrowMatch RHEA:84199
+property_value: skos:narrowMatch RHEA:84203
 property_value: skos:narrowMatch RHEA:85551
 property_value: skos:narrowMatch RHEA:85559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29921" xsd:anyURI
@@ -487248,7 +487587,6 @@
 subset: goslim_synapse
 is_a: GO:0006897 ! endocytosis
 is_a: GO:0051649 ! establishment of localization in cell
-is_a: GO:0099003 ! vesicle-mediated transport in synapse
 intersection_of: GO:0006897 ! endocytosis
 intersection_of: occurs_in GO:0098793 ! presynapse
 relationship: occurs_in GO:0098793 ! presynapse
@@ -487265,7 +487603,6 @@
 subset: goslim_synapse
 is_a: GO:0006897 ! endocytosis
 is_a: GO:0051649 ! establishment of localization in cell
-is_a: GO:0099003 ! vesicle-mediated transport in synapse
 intersection_of: GO:0006897 ! endocytosis
 intersection_of: occurs_in GO:0098794 ! postsynapse
 relationship: occurs_in GO:0098794 ! postsynapse
@@ -488184,7 +488521,7 @@
 id: GO:0140309
 name: unfolded protein holdase activity
 namespace: molecular_function
-def: "A protein carrier activity that binds to a protein in an unfolded state and escorts it to an acceptor molecule or to a specific location. The unfolded protein carrier prevents aggregation of the target protein while it's being delivers to its final destination." [PMID:39488384]
+def: "A protein carrier activity that binds to a protein in an unfolded state and escorts it to an acceptor molecule or to a specific location. The unfolded protein carrier prevents aggregation of the target protein while its being delivers to its final destination." [PMID:39488384]
 comment: Note that an holdase binds an unfolded protein and keeps it unfolded, unlike a protein folding chaperone, which binds an unfolded protein to fold it.
 synonym: "holdase" EXACT []
 synonym: "holdase-carrier chaperone" EXACT []
@@ -488807,7 +489144,6 @@
 name: heme export from vacuole to cytoplasm
 namespace: biological_process
 def: "The directed movement of heme from inside the vacuole across the vacuolar membrane and into the cytosol." [PMID:28193844]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0035351 ! heme transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17407" xsd:anyURI
@@ -489074,7 +489410,6 @@
 is_a: GO:0042435 ! indole-containing compound biosynthetic process
 is_a: GO:0043386 ! mycotoxin biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 relationship: has_part GO:0036469 ! L-tryptophan decarboxylase activity
 relationship: has_part GO:0140381 ! 4-hydroxytryptamine 4-phosphate methyltransferase activity
@@ -489388,8 +489723,10 @@
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
@@ -490199,7 +490536,6 @@
 name: iron-sulfur cluster export from the mitochondrion
 namespace: biological_process
 def: "The directed movement of iron sulfur clusters from inside the mitochondrion into the cytosol by crossing the inner mitochondrial membrane." [PMID:31040179]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:1902497 ! iron-sulfur cluster transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19504" xsd:anyURI
 created_by: pg
@@ -490245,6 +490581,16 @@
 creation_date: 2020-05-26T08:47:25Z
 
 [Term]
+id: GO:0140470
+name: symbiont-mediated suppression of host toll-like receptor signaling pathway via inhibition of TRAF activity
+namespace: biological_process
+def: "A process in which a symbiont interferes with, inhibits or disrupt a toll-like receptor signaling pathway in the host organism by reducing the activity of host TRAF." [PMID:17349955, PMID:32983084, PMID:36845015]
+is_a: GO:0039722 ! symbiont-mediated suppression of host toll-like receptor signaling pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32257" xsd:anyURI
+created_by: pg
+creation_date: 2026-06-30T12:56:30Z
+
+[Term]
 id: GO:0140471
 name: positive regulation of transepithelial migration of symbiont in host
 namespace: biological_process
@@ -490314,6 +490660,19 @@
 creation_date: 2020-06-23T15:54:56Z
 
 [Term]
+id: GO:0140476
+name: symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway via inhibition of TRAF activity
+namespace: biological_process
+def: "A process in which a symbiont interferes with, inhibits or disrupts a cytoplasmic pattern recognition receptor signaling pathway by reducing the activity of host TRAF activity." [PMID:36814922, PMID:36845015]
+synonym: "inhibition of host TRAF by virus" RELATED []
+synonym: "suppression by virus of host TRAF activity" RELATED []
+synonym: "suppression by virus of host viral-induced cytoplasmic pattern recognition receptor signaling pathway via inhibition of TRAF activity" NARROW []
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32257" xsd:anyURI
+created_by: pg
+creation_date: 2026-06-30T13:02:54Z
+
+[Term]
 id: GO:0140479
 name: obsolete ergothioneine biosynthesis from histidine via hercynylcysteine sulfoxide synthase
 namespace: biological_process
@@ -491956,7 +492315,6 @@
 name: copper import into the mitochondrion
 namespace: biological_process
 def: "The process in which copper is transported from the cytosol into the mitochondrial matrix." [PMID:32979421]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0035434 ! copper ion transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21294" xsd:anyURI
 created_by: pg
@@ -494461,7 +494819,6 @@
 name: cytosol to Golgi apparatus transport
 namespace: biological_process
 def: "The directed movement of substances from the cytosol into the Golgi apparatus of a cell." [PMID:28373556]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0055085 ! transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21524" xsd:anyURI
 created_by: pg
@@ -495807,7 +496164,6 @@
 name: zinc ion import into secretory vesicle
 namespace: biological_process
 def: "The directed import of zinc(2+) from the cytosol, across an organelle membrane, into a secretory vesicle." [PMID:19496757]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0062111 ! zinc ion import into organelle
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23879" xsd:anyURI
 created_by: pg
@@ -495829,7 +496185,6 @@
 namespace: biological_process
 def: "The directed import of zinc(2+) from the cytosol, across an organelle membrane, into a lysosome." [PMID:25808614]
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0062111 ! zinc ion import into organelle
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23907" xsd:anyURI
@@ -495841,7 +496196,6 @@
 name: zinc ion import into mitochondrion
 namespace: biological_process
 def: "The directed import of zinc(2+) from the cytosol, across an organelle membrane, into a mitochondrion." [PMID:21289295]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0062111 ! zinc ion import into organelle
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23890" xsd:anyURI
 created_by: pg
@@ -497184,7 +497538,6 @@
 namespace: biological_process
 def: "The directed import of purine nucleotide from the cytosol, across the lysosomal membrane, into the lysosome." [PMID:18375752, PMID:23876310]
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0072530 ! purine-containing compound transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25075" xsd:anyURI
@@ -497193,10 +497546,11 @@
 
 [Term]
 id: GO:0141014
-name: ribosome hibernation
+name: cytosolic ribosome hibernation
 namespace: biological_process
 def: "A cellular process that results in the silencing of ribosomes in quiescent cells. Quiescence takes place when cells encounter unfavorable conditions and cease to grow in bacteria and yeast. It also takes place in some specialized cells in higher eukaryotes, such as eggs. Ribosomes in a hibernation state are kept silent via association with proteins with inhibitory and protective functions." [PMID:28468753, PMID:30177741, PMID:36653451]
-is_a: GO:0017148 ! negative regulation of translation
+synonym: "ribosome hibernation" EXACT []
+is_a: GO:2000766 ! negative regulation of cytoplasmic translation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25082" xsd:anyURI
 created_by: pg
 creation_date: 2023-03-07T09:56:14Z
@@ -497825,7 +498179,7 @@
 synonym: "disruption of host cGAS-STING signal transduction" EXACT []
 synonym: "disruption of host cGAS-STING signaling" EXACT []
 synonym: "suppression of host cGAS-STING" EXACT []
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25581" xsd:anyURI
 created_by: pg
 creation_date: 2023-06-28T10:48:25Z
@@ -497929,7 +498283,7 @@
 namespace: biological_process
 def: "A process in which a symbiont interferes with, inhibits or stops an inflammasome-mediated signal transduction pathway in the host organism by interfering with its normal execution. The host is defined as the larger of the organisms involved in a symbiotic interaction." [PMID:26687278, PMID:27214553, PMID:29061850, PMID:34324582, PMID:36227980]
 synonym: "perturbation of host inflammasome-mediated signal transduction" BROAD []
-is_a: GO:0039537 ! symbiont-mediated suppression of cytoplasmic pattern recognition receptor signaling pathway
+is_a: GO:0039537 ! symbiont-mediated suppression of host cytoplasmic pattern recognition receptor signaling pathway
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25685" xsd:anyURI
 created_by: pg
 creation_date: 2023-07-10T14:20:22Z
@@ -499674,6 +500028,7 @@
 is_a: GO:0046907 ! intracellular transport
 is_a: GO:0048488 ! synaptic vesicle endocytosis
 is_a: GO:0072583 ! clathrin-dependent endocytosis
+is_a: GO:0099003 ! vesicle-mediated transport in synapse
 relationship: part_of GO:0036466 ! synaptic vesicle recycling via endosome
 created_by: bc
 creation_date: 2017-12-01T10:11:35Z
@@ -501351,7 +501706,6 @@
 name: glutathione import into mitochondrion
 namespace: biological_process
 def: "The process in which glutathione is transported from the cytosol into the mitochondrial matrix." [PMID:34707288]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034775 ! glutathione transmembrane transport
 created_by: rynl
 creation_date: 2021-11-11T22:53:16Z
@@ -502468,7 +502822,7 @@
 namespace: biological_process
 def: "A developmental process whose specific outcome is the progression of a gross anatomical part of a plant over time from an initial condition to a later condition." [GOC:pg]
 synonym: "plant development" RELATED []
-is_a: GO:0032502 ! developmental process
+is_a: GO:0048856 ! anatomical structure development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22994" xsd:anyURI
 created_by: rynl
 creation_date: 2023-09-18T20:55:06Z
@@ -504774,11 +505128,14 @@
 
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
 
@@ -505343,47 +505700,48 @@
 
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
 
@@ -505392,7 +505750,6 @@
 name: import into the mitochondrion
 namespace: biological_process
 def: "The directed movement of substances from the cytosol into the mitochondrion." [GOC:ew]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:1990542 ! mitochondrial transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26201" xsd:anyURI
 created_by: ew
@@ -505403,7 +505760,6 @@
 name: export from the mitochondrion
 namespace: biological_process
 def: "The directed movement of substances from the mitochondrion to the cytosol." [GOC:ew]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:1990542 ! mitochondrial transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26201" xsd:anyURI
 created_by: ew
@@ -505709,7 +506065,6 @@
 def: "The directed movement of a solute from the lysosomal lumen across the lysosomal membrane and into the cytosol." [PMID:26631267]
 synonym: "export from lysosome lumen to cytosol" EXACT []
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20070" xsd:anyURI
 created_by: ew
@@ -505883,9 +506238,10 @@
 def: "Catalysis of the reaction: S-adenosyl-L-homocysteine(out) + S-adenosyl-L-methionine(in) = S-adenosyl-L-homocysteine(in) + S-adenosyl-L-methionine(out)." [PMID:14674884, PMID:34375635]
 xref: RHEA:75479
 is_a: GO:0000095 ! S-adenosyl-L-methionine transmembrane transporter activity
-is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
+is_a: GO:0015171 ! amino acid transmembrane transporter activity
 is_a: GO:0015211 ! purine nucleoside transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 property_value: skos:exactMatch RHEA:75479
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24887" xsd:anyURI
@@ -506371,7 +506727,6 @@
 name: polyphosphate import into vacuole
 namespace: biological_process
 def: "The directed movement of polyphosphate into the vacuole across the vacuolar membrane." [PMID:37066886]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015698 ! inorganic anion transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27870" xsd:anyURI
@@ -511193,9 +511548,9 @@
 
 [Term]
 id: GO:1900214
-name: obsolete obsolete regulation of apoptotic process involved in metanephric collecting duct development
+name: obsolete regulation of apoptotic process involved in metanephric collecting duct development
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of apoptotic process involved in metanephric collecting duct development." [GOC:mtg_kidney_jan10, GOC:TermGenie, GOC:yaf, PMID:17314325]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of apoptotic process involved in metanephric collecting duct development." [GOC:mtg_kidney_jan10, GOC:TermGenie, GOC:yaf, PMID:17314325]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of apoptosis of metanephric collecting duct development" NARROW [GOC:TermGenie]
 synonym: "regulation of apoptotic cell death of metanephric collecting duct development" EXACT [GOC:TermGenie]
@@ -511325,9 +511680,9 @@
 
 [Term]
 id: GO:1900217
-name: obsolete obsolete regulation of apoptotic process involved in metanephric nephron tubule development
+name: obsolete regulation of apoptotic process involved in metanephric nephron tubule development
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of apoptotic process involved in metanephric nephron tubule development." [GOC:mtg_kidney_jan10, GOC:TermGenie, GOC:yaf, PMID:17314325]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of apoptotic process involved in metanephric nephron tubule development." [GOC:mtg_kidney_jan10, GOC:TermGenie, GOC:yaf, PMID:17314325]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of apoptosis of metanephric nephron tubule development" NARROW [GOC:TermGenie]
 synonym: "regulation of apoptotic cell death of metanephric nephron tubule development" EXACT [GOC:TermGenie]
@@ -517675,10 +518030,12 @@
 
 [Term]
 id: GO:1900534
-name: palmitic acid catabolic process
+name: obsolete palmitic acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of palmitic acid." [GOC:TermGenie]
-is_a: GO:0042758 ! long-chain fatty acid catabolic process
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of palmitic acid." [GOC:TermGenie]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: tb
 creation_date: 2012-05-09T07:04:56Z
 
@@ -518204,43 +518561,42 @@
 
 [Term]
 id: GO:1900570
-name: diorcinol metabolic process
+name: obsolete diorcinol metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving diorcinol." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving diorcinol." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "diorcinol metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0018958 ! phenol-containing compound metabolic process
-is_a: GO:0019748 ! secondary metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-15T06:35:01Z
 
 [Term]
 id: GO:1900571
-name: diorcinol catabolic process
+name: obsolete diorcinol catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of diorcinol." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of diorcinol." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "diorcinol breakdown" EXACT [GOC:TermGenie]
 synonym: "diorcinol catabolism" EXACT [GOC:TermGenie]
 synonym: "diorcinol degradation" EXACT [GOC:TermGenie]
-is_a: GO:0019336 ! phenol-containing compound catabolic process
-is_a: GO:0090487 ! secondary metabolite catabolic process
-is_a: GO:1900570 ! diorcinol metabolic process
-is_a: GO:1901502 ! ether catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-15T06:35:22Z
 
 [Term]
 id: GO:1900572
-name: diorcinol biosynthetic process
+name: obsolete diorcinol biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of diorcinol." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of diorcinol." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "diorcinol anabolism" EXACT [GOC:TermGenie]
 synonym: "diorcinol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "diorcinol formation" EXACT [GOC:TermGenie]
 synonym: "diorcinol synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0044550 ! secondary metabolite biosynthetic process
-is_a: GO:0046189 ! phenol-containing compound biosynthetic process
-is_a: GO:1900570 ! diorcinol metabolic process
-is_a: GO:1901503 ! ether biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-15T06:35:29Z
 
@@ -519089,11 +519445,13 @@
 
 [Term]
 id: GO:1900629
-name: methanophenazine metabolic process
+name: obsolete methanophenazine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving methanophenazine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving methanophenazine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "methanophenazine metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-21T06:12:07Z
 
@@ -519107,17 +519465,18 @@
 synonym: "methanophenazine formation" EXACT [GOC:TermGenie]
 synonym: "methanophenazine synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0009058 ! biosynthetic process
-is_a: GO:1900629 ! methanophenazine metabolic process
 created_by: tt
 creation_date: 2012-05-21T06:12:30Z
 
 [Term]
 id: GO:1900631
-name: tridecane metabolic process
+name: obsolete tridecane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving tridecane." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving tridecane." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "tridecane metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0120252 ! hydrocarbon metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-21T06:41:16Z
 
@@ -519131,17 +519490,18 @@
 synonym: "tridecane formation" EXACT [GOC:TermGenie]
 synonym: "tridecane synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0043447 ! alkane biosynthetic process
-is_a: GO:1900631 ! tridecane metabolic process
 created_by: tt
 creation_date: 2012-05-21T06:41:37Z
 
 [Term]
 id: GO:1900633
-name: pentadecane metabolic process
+name: obsolete pentadecane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving pentadecane." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving pentadecane." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "pentadecane metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0120252 ! hydrocarbon metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-21T06:51:34Z
 
@@ -519155,17 +519515,18 @@
 synonym: "pentadecane formation" EXACT [GOC:TermGenie]
 synonym: "pentadecane synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0043447 ! alkane biosynthetic process
-is_a: GO:1900633 ! pentadecane metabolic process
 created_by: tt
 creation_date: 2012-05-21T06:51:57Z
 
 [Term]
 id: GO:1900635
-name: heptadecane metabolic process
+name: obsolete heptadecane metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving heptadecane." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving heptadecane." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "heptadecane metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0120252 ! hydrocarbon metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-21T07:05:01Z
 
@@ -519173,13 +519534,14 @@
 id: GO:1900636
 name: heptadecane biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of heptadecane." [GOC:mengo_curators, GOC:TermGenie]
+def: "The chemical reactions and pathways resulting in the formation of heptadecane." [GOC:mengo_curators, GOC:TermGenie, MetaCyc:PWY-6622]
 synonym: "heptadecane anabolism" EXACT [GOC:TermGenie]
 synonym: "heptadecane biosynthesis" EXACT [GOC:TermGenie]
 synonym: "heptadecane formation" EXACT [GOC:TermGenie]
 synonym: "heptadecane synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:PWY-6622
 is_a: GO:0043447 ! alkane biosynthetic process
-is_a: GO:1900635 ! heptadecane metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: tt
 creation_date: 2012-05-21T07:05:21Z
 
@@ -519723,25 +520085,25 @@
 
 [Term]
 id: GO:1900655
-name: regulation of diorcinol biosynthetic process
+name: obsolete regulation of diorcinol biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of diorcinol anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of diorcinol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of diorcinol formation" EXACT [GOC:TermGenie]
 synonym: "regulation of diorcinol synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900376 ! regulation of secondary metabolite biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900572 ! diorcinol biosynthetic process
-relationship: regulates GO:1900572 ! diorcinol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-22T04:08:40Z
 
 [Term]
 id: GO:1900656
-name: negative regulation of diorcinol biosynthetic process
+name: obsolete negative regulation of diorcinol biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of diorcinol anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of diorcinol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of diorcinol biosynthetic process" EXACT [GOC:TermGenie]
@@ -519766,19 +520128,17 @@
 synonym: "negative regulation of diorcinol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of diorcinol formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of diorcinol synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900377 ! negative regulation of secondary metabolite biosynthetic process
-is_a: GO:1900655 ! regulation of diorcinol biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900572 ! diorcinol biosynthetic process
-relationship: negatively_regulates GO:1900572 ! diorcinol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-22T04:09:01Z
 
 [Term]
 id: GO:1900657
-name: positive regulation of diorcinol biosynthetic process
+name: obsolete positive regulation of diorcinol biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of diorcinol biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of diorcinol anabolism" EXACT [GOC:TermGenie]
 synonym: "activation of diorcinol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "activation of diorcinol biosynthetic process" NARROW [GOC:TermGenie]
@@ -519803,11 +520163,8 @@
 synonym: "upregulation of diorcinol biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of diorcinol formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of diorcinol synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900378 ! positive regulation of secondary metabolite biosynthetic process
-is_a: GO:1900655 ! regulation of diorcinol biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900572 ! diorcinol biosynthetic process
-relationship: positively_regulates GO:1900572 ! diorcinol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-05-22T04:09:08Z
 
@@ -520503,26 +520860,29 @@
 
 [Term]
 id: GO:1900681
-name: octadecene metabolic process
+name: obsolete octadecene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving octadecene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving octadecene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "octadecene metabolism" EXACT [GOC:TermGenie]
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-22T04:28:28Z
 
 [Term]
 id: GO:1900682
-name: octadecene biosynthetic process
+name: obsolete octadecene biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of octadecene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of octadecene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "1-octadecene biosynthetic process" EXACT [GOC:mengo_curators]
 synonym: "octadecene anabolism" EXACT [GOC:TermGenie]
 synonym: "octadecene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "octadecene formation" EXACT [GOC:TermGenie]
 synonym: "octadecene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0043450 ! alkene biosynthetic process
-is_a: GO:1900681 ! octadecene metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-22T04:28:49Z
 
@@ -523104,43 +523464,42 @@
 
 [Term]
 id: GO:1900797
-name: cordyol C metabolic process
+name: obsolete cordyol C metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving cordyol C." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving cordyol C." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cordyol C metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0009712 ! catechol-containing compound metabolic process
-is_a: GO:0019748 ! secondary metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-04T09:47:48Z
 
 [Term]
 id: GO:1900798
-name: cordyol C catabolic process
+name: obsolete cordyol C catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of cordyol C." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of cordyol C." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cordyol C breakdown" EXACT [GOC:TermGenie]
 synonym: "cordyol C catabolism" EXACT [GOC:TermGenie]
 synonym: "cordyol C degradation" EXACT [GOC:TermGenie]
-is_a: GO:0019614 ! catechol-containing compound catabolic process
-is_a: GO:0090487 ! secondary metabolite catabolic process
-is_a: GO:1900797 ! cordyol C metabolic process
-is_a: GO:1901502 ! ether catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-04T09:48:10Z
 
 [Term]
 id: GO:1900799
-name: cordyol C biosynthetic process
+name: obsolete cordyol C biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of cordyol C." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of cordyol C." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cordyol C anabolism" EXACT [GOC:TermGenie]
 synonym: "cordyol C biosynthesis" EXACT [GOC:TermGenie]
 synonym: "cordyol C formation" EXACT [GOC:TermGenie]
 synonym: "cordyol C synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0009713 ! catechol-containing compound biosynthetic process
-is_a: GO:0044550 ! secondary metabolite biosynthetic process
-is_a: GO:1900797 ! cordyol C metabolic process
-is_a: GO:1901503 ! ether biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-04T09:48:17Z
 
@@ -524156,46 +524515,41 @@
 
 [Term]
 id: GO:1900861
-name: regulation of cordyol C biosynthetic process
+name: obsolete regulation of cordyol C biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
-is_a: GO:1900376 ! regulation of secondary metabolite biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900799 ! cordyol C biosynthetic process
-relationship: regulates GO:1900799 ! cordyol C biosynthetic process
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-07T01:56:16Z
 
 [Term]
 id: GO:1900862
-name: negative regulation of cordyol C biosynthetic process
+name: obsolete negative regulation of cordyol C biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "down-regulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "downregulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
-is_a: GO:1900377 ! negative regulation of secondary metabolite biosynthetic process
-is_a: GO:1900861 ! regulation of cordyol C biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900799 ! cordyol C biosynthetic process
-relationship: negatively_regulates GO:1900799 ! cordyol C biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-07T01:56:38Z
 
 [Term]
 id: GO:1900863
-name: positive regulation of cordyol C biosynthetic process
+name: obsolete positive regulation of cordyol C biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of cordyol C biosynthetic process." [GOC:di, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of cordyol C biosynthetic process" NARROW [GOC:TermGenie]
 synonym: "up regulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "up-regulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of cordyol C biosynthetic process" EXACT [GOC:TermGenie]
-is_a: GO:1900378 ! positive regulation of secondary metabolite biosynthetic process
-is_a: GO:1900861 ! regulation of cordyol C biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900799 ! cordyol C biosynthetic process
-relationship: positively_regulates GO:1900799 ! cordyol C biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: di
 creation_date: 2012-06-07T01:56:46Z
 
@@ -524237,13 +524591,13 @@
 
 [Term]
 id: GO:1900867
-name: sarcinapterin metabolic process
+name: obsolete sarcinapterin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving sarcinapterin." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving sarcinapterin." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "sarcinapterin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0019637 ! organophosphate metabolic process
-is_a: GO:0042558 ! pteridine-containing compound metabolic process
-is_a: GO:0072350 ! tricarboxylic acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-12T04:34:10Z
 
@@ -524257,35 +524611,34 @@
 synonym: "sarcinapterin formation" EXACT [GOC:TermGenie]
 synonym: "sarcinapterin synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0072351 ! tricarboxylic acid biosynthetic process
-is_a: GO:1900867 ! sarcinapterin metabolic process
 is_a: GO:2001116 ! methanopterin-containing compound biosynthetic process
 created_by: tt
 creation_date: 2012-06-12T04:34:33Z
 
 [Term]
 id: GO:1900869
-name: tatiopterin metabolic process
+name: obsolete tatiopterin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving tatiopterin." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving tatiopterin." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "tatiopterin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006793 ! phosphorus metabolic process
-is_a: GO:0019752 ! carboxylic acid metabolic process
-is_a: GO:0042558 ! pteridine-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-12T04:43:57Z
 
 [Term]
 id: GO:1900870
-name: tatiopterin biosynthetic process
+name: obsolete tatiopterin biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of tatiopterin." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of tatiopterin." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "tatiopterin anabolism" EXACT [GOC:TermGenie]
 synonym: "tatiopterin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "tatiopterin formation" EXACT [GOC:TermGenie]
 synonym: "tatiopterin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0042559 ! pteridine-containing compound biosynthetic process
-is_a: GO:0046394 ! carboxylic acid biosynthetic process
-is_a: GO:1900869 ! tatiopterin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-12T04:44:19Z
 
@@ -524355,11 +524708,13 @@
 
 [Term]
 id: GO:1900876
-name: nonadec-1-ene metabolic process
+name: obsolete nonadec-1-ene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving nonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving nonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "nonadec-1-ene metabolism" EXACT [GOC:TermGenie]
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T01:52:09Z
 
@@ -524373,79 +524728,87 @@
 synonym: "nonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "nonadec-1-ene synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0043450 ! alkene biosynthetic process
-is_a: GO:1900876 ! nonadec-1-ene metabolic process
 created_by: tt
 creation_date: 2012-06-13T01:52:37Z
 
 [Term]
 id: GO:1900878
-name: (Z)-nonadeca-1,14-diene metabolic process
+name: obsolete (Z)-nonadeca-1,14-diene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (Z)-nonadeca-1,14-diene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving (Z)-nonadeca-1,14-diene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "(Z)-nonadeca-1,14-diene metabolism" EXACT [GOC:TermGenie]
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:09:18Z
 
 [Term]
 id: GO:1900879
-name: (Z)-nonadeca-1,14-diene biosynthetic process
+name: obsolete (Z)-nonadeca-1,14-diene biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of (Z)-nonadeca-1,14-diene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of (Z)-nonadeca-1,14-diene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "(Z)-nonadeca-1,14-diene anabolism" EXACT [GOC:TermGenie]
 synonym: "(Z)-nonadeca-1,14-diene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "(Z)-nonadeca-1,14-diene formation" EXACT [GOC:TermGenie]
 synonym: "(Z)-nonadeca-1,14-diene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900674 ! olefin biosynthetic process
-is_a: GO:1900878 ! (Z)-nonadeca-1,14-diene metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:09:39Z
 
 [Term]
 id: GO:1900880
-name: 18-methylnonadec-1-ene metabolic process
+name: obsolete 18-methylnonadec-1-ene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 18-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving 18-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "18-methylnonadec-1-ene metabolism" EXACT [GOC:TermGenie]
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:26:28Z
 
 [Term]
 id: GO:1900881
-name: 18-methylnonadec-1-ene biosynthetic process
+name: obsolete 18-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 18-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of 18-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "18-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "18-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "18-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "18-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0043450 ! alkene biosynthetic process
-is_a: GO:1900880 ! 18-methylnonadec-1-ene metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:26:55Z
 
 [Term]
 id: GO:1900882
-name: 17-methylnonadec-1-ene metabolic process
+name: obsolete 17-methylnonadec-1-ene metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving 17-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving 17-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "17-methylnonadec-1-ene metabolism" EXACT [GOC:TermGenie]
-is_a: GO:1900673 ! olefin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:35:37Z
 
 [Term]
 id: GO:1900883
-name: 17-methylnonadec-1-ene biosynthetic process
+name: obsolete 17-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 17-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of 17-methylnonadec-1-ene." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "17-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "17-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "17-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "17-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0043450 ! alkene biosynthetic process
-is_a: GO:1900882 ! 17-methylnonadec-1-ene metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T02:35:59Z
 
@@ -525183,26 +525546,26 @@
 
 [Term]
 id: GO:1900914
-name: regulation of octadecene biosynthetic process
+name: obsolete regulation of octadecene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of 1-octadecene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "regulation of octadecene anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of octadecene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of octadecene formation" EXACT [GOC:TermGenie]
 synonym: "regulation of octadecene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900682 ! octadecene biosynthetic process
-relationship: regulates GO:1900682 ! octadecene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T04:24:24Z
 
 [Term]
 id: GO:1900915
-name: negative regulation of octadecene biosynthetic process
+name: obsolete negative regulation of octadecene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of 1-octadecene biosynthetic process" RELATED [GOC:TermGenie]
 synonym: "down regulation of octadecene anabolism" RELATED [GOC:TermGenie]
 synonym: "down regulation of octadecene biosynthesis" RELATED [GOC:TermGenie]
@@ -525232,19 +525595,17 @@
 synonym: "negative regulation of octadecene biosynthesis" RELATED [GOC:TermGenie]
 synonym: "negative regulation of octadecene formation" RELATED [GOC:TermGenie]
 synonym: "negative regulation of octadecene synthesis" RELATED [GOC:TermGenie]
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900914 ! regulation of octadecene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900682 ! octadecene biosynthetic process
-relationship: negatively_regulates GO:1900682 ! octadecene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T04:24:47Z
 
 [Term]
 id: GO:1900916
-name: positive regulation of octadecene biosynthetic process
+name: obsolete positive regulation of octadecene biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of octadecene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of 1-octadecene biosynthetic process" RELATED [GOC:TermGenie]
 synonym: "activation of octadecene anabolism" RELATED [GOC:TermGenie]
 synonym: "activation of octadecene biosynthesis" RELATED [GOC:TermGenie]
@@ -525274,11 +525635,8 @@
 synonym: "upregulation of octadecene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of octadecene formation" RELATED [GOC:TermGenie]
 synonym: "upregulation of octadecene synthesis" RELATED [GOC:TermGenie]
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900914 ! regulation of octadecene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900682 ! octadecene biosynthetic process
-relationship: positively_regulates GO:1900682 ! octadecene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-13T04:24:55Z
 
@@ -525571,25 +525929,25 @@
 
 [Term]
 id: GO:1900935
-name: regulation of nonadec-1-ene biosynthetic process
+name: obsolete regulation of nonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of nonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of nonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of nonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "regulation of nonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900877 ! nonadec-1-ene biosynthetic process
-relationship: regulates GO:1900877 ! nonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:13:34Z
 
 [Term]
 id: GO:1900936
-name: negative regulation of nonadec-1-ene biosynthetic process
+name: obsolete negative regulation of nonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of nonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of nonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of nonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
@@ -525614,19 +525972,17 @@
 synonym: "negative regulation of nonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of nonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of nonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900935 ! regulation of nonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900877 ! nonadec-1-ene biosynthetic process
-relationship: negatively_regulates GO:1900877 ! nonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:13:56Z
 
 [Term]
 id: GO:1900937
-name: positive regulation of nonadec-1-ene biosynthetic process
+name: obsolete positive regulation of nonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of nonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of nonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "activation of nonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "activation of nonadec-1-ene biosynthetic process" NARROW [GOC:TermGenie]
@@ -525651,11 +526007,8 @@
 synonym: "upregulation of nonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of nonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of nonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900935 ! regulation of nonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900877 ! nonadec-1-ene biosynthetic process
-relationship: positively_regulates GO:1900877 ! nonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:14:04Z
 
@@ -525713,25 +526066,25 @@
 
 [Term]
 id: GO:1900941
-name: regulation of (Z)-nonadeca-1,14-diene biosynthetic process
+name: obsolete regulation of (Z)-nonadeca-1,14-diene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of (Z)-nonadeca-1,14-diene anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of (Z)-nonadeca-1,14-diene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of (Z)-nonadeca-1,14-diene formation" EXACT [GOC:TermGenie]
 synonym: "regulation of (Z)-nonadeca-1,14-diene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
-relationship: regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:17:32Z
 
 [Term]
 id: GO:1900942
-name: negative regulation of (Z)-nonadeca-1,14-diene biosynthetic process
+name: obsolete negative regulation of (Z)-nonadeca-1,14-diene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of (Z)-nonadeca-1,14-diene anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of (Z)-nonadeca-1,14-diene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of (Z)-nonadeca-1,14-diene biosynthetic process" EXACT [GOC:TermGenie]
@@ -525756,19 +526109,17 @@
 synonym: "negative regulation of (Z)-nonadeca-1,14-diene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of (Z)-nonadeca-1,14-diene formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of (Z)-nonadeca-1,14-diene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900941 ! regulation of (Z)-nonadeca-1,14-diene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
-relationship: negatively_regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:17:54Z
 
 [Term]
 id: GO:1900943
-name: positive regulation of (Z)-nonadeca-1,14-diene biosynthetic process
+name: obsolete positive regulation of (Z)-nonadeca-1,14-diene biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of (Z)-nonadeca-1,14-diene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of (Z)-nonadeca-1,14-diene anabolism" NARROW [GOC:TermGenie]
 synonym: "activation of (Z)-nonadeca-1,14-diene biosynthesis" NARROW [GOC:TermGenie]
 synonym: "activation of (Z)-nonadeca-1,14-diene biosynthetic process" NARROW [GOC:TermGenie]
@@ -525793,11 +526144,8 @@
 synonym: "upregulation of (Z)-nonadeca-1,14-diene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of (Z)-nonadeca-1,14-diene formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of (Z)-nonadeca-1,14-diene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900941 ! regulation of (Z)-nonadeca-1,14-diene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
-relationship: positively_regulates GO:1900879 ! (Z)-nonadeca-1,14-diene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:18:01Z
 
@@ -525899,27 +526247,26 @@
 
 [Term]
 id: GO:1900947
-name: regulation of isoprene biosynthetic process
+name: obsolete regulation of isoprene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of isoprene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of isoprene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it represents the same process as regulation of isopentenyl diphosphate biosynthetic process, \nmethylerythritol 4-phosphate pathway ; GO:0010322.
 synonym: "regulation of 2-methyl-1,3-butadiene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of 2-methyl-1,3-butadiene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "regulation of hemiterpene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of hemiterpene biosynthetic process" EXACT [GOC:TermGenie]
-is_a: GO:0019747 ! regulation of isoprenoid metabolic process
-is_a: GO:0046890 ! regulation of lipid biosynthetic process
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0043612 ! isoprene biosynthetic process
-relationship: regulates GO:0043612 ! isoprene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0010322
 created_by: tt
 creation_date: 2012-06-14T03:21:26Z
 
 [Term]
 id: GO:1900948
-name: negative regulation of isoprene biosynthetic process
+name: obsolete negative regulation of isoprene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of isoprene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of isoprene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it represents the same process as negative regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway ; GO:0010323.
 synonym: "down regulation of 2-methyl-1,3-butadiene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of 2-methyl-1,3-butadiene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "down regulation of hemiterpene biosynthesis" EXACT [GOC:TermGenie]
@@ -525944,19 +526291,15 @@
 synonym: "negative regulation of 2-methyl-1,3-butadiene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "negative regulation of hemiterpene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of hemiterpene biosynthetic process" EXACT [GOC:TermGenie]
-is_a: GO:0045827 ! negative regulation of isoprenoid metabolic process
-is_a: GO:0051055 ! negative regulation of lipid biosynthetic process
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900947 ! regulation of isoprene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0043612 ! isoprene biosynthetic process
-relationship: negatively_regulates GO:0043612 ! isoprene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0010323
 created_by: tt
 creation_date: 2012-06-14T03:21:47Z
 
 [Term]
 id: GO:1900949
-name: positive regulation of isoprene biosynthetic process
+name: positive regulation of isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of isoprene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
 synonym: "activation of 2-methyl-1,3-butadiene biosynthesis" NARROW [GOC:TermGenie]
@@ -525983,36 +526326,36 @@
 synonym: "upregulation of hemiterpene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "upregulation of hemiterpene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of isoprene biosynthetic process" EXACT [GOC:TermGenie]
-is_a: GO:0046889 ! positive regulation of lipid biosynthetic process
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900947 ! regulation of isoprene biosynthetic process
+is_a: GO:0010322 ! regulation of isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+is_a: GO:0071073 ! positive regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0043612 ! isoprene biosynthetic process
-relationship: positively_regulates GO:0043612 ! isoprene biosynthetic process
+intersection_of: positively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+relationship: positively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: tt
 creation_date: 2012-06-14T03:21:54Z
 
 [Term]
 id: GO:1900950
-name: regulation of 18-methylnonadec-1-ene biosynthetic process
+name: obsolete regulation of 18-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of 18-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of 18-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of 18-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "regulation of 18-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
-relationship: regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:23:34Z
 
 [Term]
 id: GO:1900951
-name: negative regulation of 18-methylnonadec-1-ene biosynthetic process
+name: obsolete negative regulation of 18-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of 18-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of 18-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of 18-methylnonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
@@ -526037,19 +526380,17 @@
 synonym: "negative regulation of 18-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of 18-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of 18-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900950 ! regulation of 18-methylnonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
-relationship: negatively_regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:23:55Z
 
 [Term]
 id: GO:1900952
-name: positive regulation of 18-methylnonadec-1-ene biosynthetic process
+name: obsolete positive regulation of 18-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of 18-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of 18-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "activation of 18-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "activation of 18-methylnonadec-1-ene biosynthetic process" NARROW [GOC:TermGenie]
@@ -526074,11 +526415,8 @@
 synonym: "upregulation of 18-methylnonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of 18-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of 18-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900950 ! regulation of 18-methylnonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
-relationship: positively_regulates GO:1900881 ! 18-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:24:02Z
 
@@ -526136,25 +526474,25 @@
 
 [Term]
 id: GO:1900956
-name: regulation of 17-methylnonadec-1-ene biosynthetic process
+name: obsolete regulation of 17-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of 17-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of 17-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of 17-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "regulation of 17-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900911 ! regulation of olefin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
-relationship: regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:27:18Z
 
 [Term]
 id: GO:1900957
-name: negative regulation of 17-methylnonadec-1-ene biosynthetic process
+name: obsolete negative regulation of 17-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of 17-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of 17-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of 17-methylnonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
@@ -526179,19 +526517,17 @@
 synonym: "negative regulation of 17-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of 17-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of 17-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900912 ! negative regulation of olefin biosynthetic process
-is_a: GO:1900956 ! regulation of 17-methylnonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
-relationship: negatively_regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:27:39Z
 
 [Term]
 id: GO:1900958
-name: positive regulation of 17-methylnonadec-1-ene biosynthetic process
+name: obsolete positive regulation of 17-methylnonadec-1-ene biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of 17-methylnonadec-1-ene biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of 17-methylnonadec-1-ene anabolism" EXACT [GOC:TermGenie]
 synonym: "activation of 17-methylnonadec-1-ene biosynthesis" EXACT [GOC:TermGenie]
 synonym: "activation of 17-methylnonadec-1-ene biosynthetic process" NARROW [GOC:TermGenie]
@@ -526216,11 +526552,8 @@
 synonym: "upregulation of 17-methylnonadec-1-ene biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of 17-methylnonadec-1-ene formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of 17-methylnonadec-1-ene synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1900913 ! positive regulation of olefin biosynthetic process
-is_a: GO:1900956 ! regulation of 17-methylnonadec-1-ene biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
-relationship: positively_regulates GO:1900883 ! 17-methylnonadec-1-ene biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T03:27:46Z
 
@@ -526568,27 +526901,25 @@
 
 [Term]
 id: GO:1900974
-name: regulation of tatiopterin biosynthetic process
+name: obsolete regulation of tatiopterin biosynthetic process
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "regulation of tatiopterin anabolism" EXACT [GOC:TermGenie]
 synonym: "regulation of tatiopterin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "regulation of tatiopterin formation" EXACT [GOC:TermGenie]
 synonym: "regulation of tatiopterin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0009889 ! regulation of biosynthetic process
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:1900870 ! tatiopterin biosynthetic process
-relationship: regulates GO:1900870 ! tatiopterin biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T04:01:42Z
 
 [Term]
 id: GO:1900975
-name: negative regulation of tatiopterin biosynthetic process
+name: obsolete negative regulation of tatiopterin biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "down regulation of tatiopterin anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of tatiopterin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of tatiopterin biosynthetic process" EXACT [GOC:TermGenie]
@@ -526613,21 +526944,17 @@
 synonym: "negative regulation of tatiopterin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tatiopterin formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tatiopterin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0009890 ! negative regulation of biosynthetic process
-is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
-is_a: GO:0062014 ! negative regulation of small molecule metabolic process
-is_a: GO:1900974 ! regulation of tatiopterin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:1900870 ! tatiopterin biosynthetic process
-relationship: negatively_regulates GO:1900870 ! tatiopterin biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T04:02:06Z
 
 [Term]
 id: GO:1900976
-name: positive regulation of tatiopterin biosynthetic process
+name: obsolete positive regulation of tatiopterin biosynthetic process
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of tatiopterin biosynthetic process." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "activation of tatiopterin anabolism" EXACT [GOC:TermGenie]
 synonym: "activation of tatiopterin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "activation of tatiopterin biosynthetic process" NARROW [GOC:TermGenie]
@@ -526652,13 +526979,8 @@
 synonym: "upregulation of tatiopterin biosynthetic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of tatiopterin formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of tatiopterin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
-is_a: GO:1900974 ! regulation of tatiopterin biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:1900870 ! tatiopterin biosynthetic process
-relationship: positively_regulates GO:1900870 ! tatiopterin biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-06-14T04:02:14Z
 
@@ -529216,24 +529538,27 @@
 
 [Term]
 id: GO:1901128
-name: gentamycin metabolic process
+name: obsolete gentamycin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving gentamycin." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00967]
+def: "OBSOLETE. The chemical reactions and pathways involving gentamycin." [GOC:TermGenie, GOC:yaf]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "gentamycin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2012-07-11T03:26:25Z
 
 [Term]
 id: GO:1901129
-name: gentamycin catabolic process
+name: obsolete gentamycin catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of gentamycin." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00967]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of gentamycin." [GOC:TermGenie, GOC:yaf]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "gentamycin breakdown" EXACT [GOC:TermGenie]
 synonym: "gentamycin catabolism" EXACT [GOC:TermGenie]
 synonym: "gentamycin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0009056 ! catabolic process
-is_a: GO:1901128 ! gentamycin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2012-07-11T03:26:51Z
 
@@ -529241,13 +529566,14 @@
 id: GO:1901130
 name: gentamycin biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of gentamycin." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00967]
+def: "The chemical reactions and pathways resulting in the formation of gentamycin." [GOC:TermGenie, MetaCyc:PWY-7025]
 synonym: "gentamycin anabolism" EXACT [GOC:TermGenie]
 synonym: "gentamycin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "gentamycin formation" EXACT [GOC:TermGenie]
 synonym: "gentamycin synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:PWY-7025
 is_a: GO:0009058 ! biosynthetic process
-is_a: GO:1901128 ! gentamycin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: yaf
 creation_date: 2012-07-11T03:26:59Z
 
@@ -531778,13 +532104,13 @@
 
 [Term]
 id: GO:1901266
-name: cephalosporin C metabolic process
+name: obsolete cephalosporin C metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving cephalosporin C." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00172]
+def: "OBSOLETE. The chemical reactions and pathways involving cephalosporin C." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00172]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cephalosporin C metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006790 ! sulfur compound metabolic process
-is_a: GO:0019752 ! carboxylic acid metabolic process
-is_a: GO:0072338 ! lactam metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2012-08-17T14:25:59Z
 
@@ -531799,7 +532125,6 @@
 is_a: GO:0030655 ! beta-lactam antibiotic catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:0046395 ! carboxylic acid catabolic process
-is_a: GO:1901266 ! cephalosporin C metabolic process
 created_by: yaf
 creation_date: 2012-08-17T14:26:19Z
 
@@ -531814,7 +532139,6 @@
 synonym: "cephalosporin C synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0043646 ! cephalosporin biosynthetic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
-is_a: GO:1901266 ! cephalosporin C metabolic process
 created_by: yaf
 creation_date: 2012-08-17T14:26:31Z
 
@@ -535064,11 +535388,13 @@
 
 [Term]
 id: GO:1901440
-name: poly(hydroxyalkanoate) metabolic process
+name: obsolete poly(hydroxyalkanoate) metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving poly(hydroxyalkanoate)." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving poly(hydroxyalkanoate)." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "poly(hydroxyalkanoate) metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-10-02T01:47:26Z
 
@@ -535076,13 +535402,14 @@
 id: GO:1901441
 name: poly(hydroxyalkanoate) biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of poly(hydroxyalkanoate)." [GOC:mengo_curators, GOC:TermGenie]
+def: "The chemical reactions and pathways resulting in the formation of poly(hydroxyalkanoate)." [GOC:mengo_curators, GOC:TermGenie, MetaCyc:PWY-6657]
 synonym: "poly(hydroxyalkanoate) anabolism" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyalkanoate) biosynthesis" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyalkanoate) formation" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyalkanoate) synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:PWY-6657
 is_a: GO:0009058 ! biosynthetic process
-is_a: GO:1901440 ! poly(hydroxyalkanoate) metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: tt
 creation_date: 2012-10-02T01:48:33Z
 
@@ -538255,6 +538582,7 @@
 def: "Binding to XTP." [GOC:TermGenie]
 is_a: GO:0032555 ! purine ribonucleotide binding
 is_a: GO:0035639 ! purine ribonucleoside triphosphate binding
+is_a: GO:0043168 ! anion binding
 created_by: tb
 creation_date: 2012-11-15T22:56:35Z
 
@@ -538265,6 +538593,7 @@
 def: "Binding to ITP." [GOC:TermGenie]
 is_a: GO:0032555 ! purine ribonucleotide binding
 is_a: GO:0035639 ! purine ribonucleoside triphosphate binding
+is_a: GO:0043168 ! anion binding
 created_by: tb
 creation_date: 2012-11-15T22:56:39Z
 
@@ -539516,12 +539845,14 @@
 
 [Term]
 id: GO:1901709
-name: (+)-larreatricin metabolic process
+name: (+)-larreatricin biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (+)-larreatricin." [GOC:TermGenie, PMID:12960376]
+def: "The chemical reactions and pathways resulting in the formation of (+)-larreatricin." [GOC:TermGenie, PMID:12960376, PMID:30113748]
+synonym: "(+)-larreatricin metabolic process" BROAD []
 synonym: "(+)-larreatricin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0009806 ! lignan metabolic process
-is_a: GO:0018958 ! phenol-containing compound metabolic process
+is_a: GO:0009807 ! lignan biosynthetic process
+is_a: GO:0046189 ! phenol-containing compound biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: ms
 creation_date: 2012-12-19T14:44:29Z
 
@@ -540478,38 +540809,43 @@
 
 [Term]
 id: GO:1901764
-name: phosphinothricin metabolic process
+name: obsolete phosphinothricin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving phosphinothricin." [GOC:TermGenie, GOC:yaf]
+def: "OBSOLETE. The chemical reactions and pathways involving phosphinothricin." [GOC:TermGenie, GOC:yaf]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "phosphinothricin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2013-01-15T10:02:37Z
 
 [Term]
 id: GO:1901765
-name: phosphinothricin catabolic process
+name: obsolete obsolete phosphinothricin catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of phosphinothricin." [GOC:TermGenie, GOC:yaf]
+def: "OBSOLETE. OBSOLETE. The chemical reactions and pathways resulting in the breakdown of phosphinothricin." [GOC:TermGenie, GOC:yaf]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "phosphinothricin breakdown" EXACT [GOC:TermGenie]
 synonym: "phosphinothricin catabolism" EXACT [GOC:TermGenie]
 synonym: "phosphinothricin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0009056 ! catabolic process
-is_a: GO:1901764 ! phosphinothricin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2013-01-15T10:02:42Z
 
 [Term]
 id: GO:1901766
-name: phosphinothricin biosynthetic process
+name: L-phosphinothricin biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of phosphinothricin." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00168]
+def: "The chemical reactions and pathways resulting in the formation of phosphinothricin." [GOC:TermGenie, MetaCyc:PWY-6322, PMID:7938785]
 synonym: "phosphinothricin anabolism" EXACT [GOC:TermGenie]
 synonym: "phosphinothricin biosynthesis" EXACT [GOC:TermGenie]
+synonym: "phosphinothricin biosynthetic process" EXACT []
 synonym: "phosphinothricin formation" EXACT [GOC:TermGenie]
 synonym: "phosphinothricin synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:PWY-6322
 is_a: GO:0009058 ! biosynthetic process
-is_a: GO:1901764 ! phosphinothricin metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: yaf
 creation_date: 2013-01-15T10:02:46Z
 
@@ -543760,7 +544096,6 @@
 namespace: biological_process
 def: "The directed movement of substances from endoplasmic reticulum to chloroplast." [GOC:TermGenie, PMID:18689504]
 synonym: "ER to chloroplast transport" EXACT [GOC:TermGenie]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 created_by: tb
 creation_date: 2013-02-20T23:48:52Z
@@ -545493,13 +545828,17 @@
 
 [Term]
 id: GO:1902056
-name: (25S)-Delta(7)-dafachronate metabolic process
+name: (25S)-Delta(7)-dafachronate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving (25S)-Delta(7)-dafachronate." [GOC:TermGenie, PMID:22505847]
-synonym: "(25S)-Delta(7)-dafachronate metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0008202 ! steroid metabolic process
-is_a: GO:0019752 ! carboxylic acid metabolic process
-is_a: GO:0042180 ! ketone metabolic process
+def: "The chemical reactions and pathways resulting in the formation of (25S)-Delta(7)-dafachronate." [GOC:TermGenie, PMID:22505847]
+synonym: "(25S)-Delta(7)-dafachronate biosynthesis" EXACT []
+synonym: "(25S)-Delta(7)-dafachronate synthesis" EXACT [GOC:TermGenie]
+synonym: "dafachronic acid biosynthesis" EXACT []
+synonym: "dafachronic acid synthesis" EXACT []
+is_a: GO:0042181 ! ketone biosynthetic process
+is_a: GO:0046394 ! carboxylic acid biosynthetic process
+is_a: GO:0120178 ! steroid hormone biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
 created_by: ab
 creation_date: 2013-04-13T09:05:27Z
 
@@ -548441,7 +548780,7 @@
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthesis" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid formation" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31371" xsd:anyURI
@@ -550388,7 +550727,6 @@
 namespace: biological_process
 def: "The directed movement of fructose from vacuole to cytoplasm." [GOC:TermGenie, PMID:23583552]
 synonym: "fructose transport from vacuole to cytoplasm" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0015755 ! fructose transmembrane transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 created_by: tb
@@ -550885,9 +551223,9 @@
 
 [Term]
 id: GO:1902366
-name: obsolete obsolete regulation of Notch signaling pathway involved in somitogenesis
+name: obsolete regulation of Notch signaling pathway involved in somitogenesis
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of Notch signaling pathway involved in somitogenesis." [GOC:dph, GOC:TermGenie, PMID:21795391]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of Notch signaling pathway involved in somitogenesis." [GOC:dph, GOC:TermGenie, PMID:21795391]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of N signaling pathway involved in formation of mesodermal clusters" EXACT [GOC:TermGenie]
 synonym: "regulation of N signaling pathway involved in somitogenesis" EXACT [GOC:TermGenie]
@@ -557418,7 +557756,6 @@
 comment: an example of this is snapin in mouse (Q9Z266) in PMID:20920792 inferred from mutant phenotype
 synonym: "prevacuolar compartment to lysosome transport" BROAD [GOC:TermGenie]
 is_a: GO:0007041 ! lysosomal transport
-is_a: GO:0010496 ! intercellular transport
 created_by: pad
 creation_date: 2014-03-17T16:32:36Z
 
@@ -569680,7 +570017,7 @@
 def: "Any process that modulates the frequency, rate or extent of synaptic vesicle uncoating." [GO_REF:0000058, GOC:pad, GOC:PARL, GOC:TermGenie, PMID:21563316]
 synonym: "regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0016191 ! synaptic vesicle uncoating
 relationship: regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569706,8 +570043,8 @@
 synonym: "inhibition of synaptic vesicle uncoating" NARROW [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
+is_a: GO:0043242 ! negative regulation of protein-containing complex disassembly
 is_a: GO:1900243 ! negative regulation of synaptic vesicle endocytosis
-is_a: GO:1901880 ! negative regulation of protein depolymerization
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569734,7 +570071,7 @@
 synonym: "upregulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle uncoating" EXACT [GOC:TermGenie]
-is_a: GO:1901881 ! positive regulation of protein depolymerization
+is_a: GO:0043243 ! positive regulation of protein-containing complex disassembly
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -570267,7 +570604,7 @@
 namespace: biological_process
 def: "The directed movement of flavonoid from endoplasmic reticulum to plant-type vacuole." [GO_REF:0000078, GOC:tb, GOC:TermGenie, PMID:25116949]
 synonym: "flavonoid accumulation in vacuole" RELATED []
-is_a: GO:0010496 ! intercellular transport
+is_a: GO:0006810 ! transport
 created_by: tb
 creation_date: 2014-09-05T00:35:34Z
 
@@ -572042,7 +572379,6 @@
 namespace: biological_process
 def: "The directed movement of substances from endoplasmic reticulum to cytosol." [GO_REF:0000076, GOC:BHF, GOC:mtg_cardiac_conduct_nov11, GOC:rl, GOC:TermGenie, PMID:16402920]
 synonym: "ER to cytosol transport" EXACT [GOC:TermGenie]
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0046907 ! intracellular transport
 created_by: rl
 creation_date: 2014-10-02T11:24:34Z
@@ -578707,7 +579043,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a palisade mesophyll over time, from its formation to the mature structure." [GO_REF:0000080, GOC:TermGenie, PMID:24663344]
 synonym: "palisade parenchyma development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2015-02-04T21:51:44Z
@@ -580993,12 +581328,13 @@
 
 [Term]
 id: GO:1903964
-name: monounsaturated fatty acid metabolic process
+name: obsolete monounsaturated fatty acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving monounsaturated fatty acid." [GO_REF:0000068, GOC:hjd, GOC:TermGenie, PMID:16443825]
-comment: For example, stearoyl-coenzyme A desaturase (Scd) catalyzes the desaturation of saturated fatty acids to monounsaturated fatty acids in mammals and yeast.
+def: "OBSOLETE. The chemical reactions and pathways involving monounsaturated fatty acid." [GO_REF:0000068, GOC:hjd, GOC:TermGenie, PMID:16443825]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
 synonym: "monounsaturated fatty acid metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006631 ! fatty acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2015-02-25T20:35:48Z
 
@@ -581011,7 +581347,6 @@
 synonym: "monounsaturated fatty acid catabolism" EXACT [GOC:TermGenie]
 synonym: "monounsaturated fatty acid degradation" EXACT [GOC:TermGenie]
 is_a: GO:0009062 ! fatty acid catabolic process
-is_a: GO:1903964 ! monounsaturated fatty acid metabolic process
 created_by: pr
 creation_date: 2015-02-25T20:35:58Z
 
@@ -581026,7 +581361,6 @@
 synonym: "monounsaturated fatty acid formation" EXACT [GOC:TermGenie]
 synonym: "monounsaturated fatty acid synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0006633 ! fatty acid biosynthetic process
-is_a: GO:1903964 ! monounsaturated fatty acid metabolic process
 created_by: pr
 creation_date: 2015-02-25T20:36:07Z
 
@@ -584552,7 +584886,6 @@
 synonym: "regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0050794 ! regulation of cellular process
 is_a: GO:0051223 ! regulation of protein transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -584580,7 +584913,6 @@
 synonym: "negative regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "negative regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "negative regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0048523 ! negative regulation of cellular process
 is_a: GO:0051224 ! negative regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
@@ -584610,7 +584942,6 @@
 synonym: "upregulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, ER to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0048522 ! positive regulation of cellular process
 is_a: GO:0051222 ! positive regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
@@ -600806,7 +601137,6 @@
 namespace: biological_process
 def: "The process in which folic acid is transported from the cytosol into the mitochondrial matrix." [GO_REF:0000075, GOC:BHF, GOC:rph, GOC:TermGenie, PMID:15140890]
 synonym: "folic acid import into mitochondrion" RELATED []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0098838 ! folate transmembrane transport
 created_by: rph
 creation_date: 2016-02-03T12:10:14Z
@@ -601310,7 +601640,6 @@
 def: "The vesicle-mediated and directed movement of substances from plastid to vacuole." [GO_REF:0000076, GOC:TermGenie, PMID:25281689]
 synonym: "plastid to vacuolar carboxypeptidase Y vesicle-mediated transport" RELATED [GOC:TermGenie]
 is_a: GO:0007034 ! vacuolar transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0016192 ! vesicle-mediated transport
 is_a: GO:0016482 ! cytosolic transport
 created_by: tb
@@ -602335,7 +602664,6 @@
 alt_id: GO:0007037
 def: "The directed movement of phosphate ions from the cytosol across the vacuolar membrane and into the vacuolar lumen." [GO_REF:0000078, GOC:TermGenie, PMID:26554016]
 synonym: "vacuolar phosphate transport" BROAD []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0034486 ! vacuolar transmembrane transport
 is_a: GO:0035435 ! phosphate ion transmembrane transport
 created_by: tb
@@ -603683,6 +604011,7 @@
 def: "The process whose specific outcome is the progression of cardiac jelly over time, from its formation to the mature structure. The cardiac jelly is an acellular gelatinous matrix secreted by the myocardium and plays a central role in the septation of the heart." [GO_REF:0000094, GOC:BHF, GOC:rl, GOC:TermGenie, PMID:10645959, PMID:16314491, PMID:19703439]
 synonym: "heart cardiac jelly development" EXACT [GOC:TermGenie]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: rl
 creation_date: 2016-03-23T13:17:59Z
@@ -607529,9 +607858,9 @@
 
 [Term]
 id: GO:1905282
-name: obsolete obsolete regulation of epidermal growth factor receptor signaling pathway involved in heart process
+name: obsolete regulation of epidermal growth factor receptor signaling pathway involved in heart process
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of epidermal growth factor receptor signaling pathway involved in heart process." [GO_REF:0000058, GOC:bc, GOC:BHF, GOC:BHF_miRNA, GOC:TermGenie, PMID:23069713]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of epidermal growth factor receptor signaling pathway involved in heart process." [GO_REF:0000058, GOC:bc, GOC:BHF, GOC:BHF_miRNA, GOC:TermGenie, PMID:23069713]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of EGF receptor signaling pathway involved in cardiac process" RELATED [GOC:TermGenie]
 synonym: "regulation of EGF receptor signaling pathway involved in heart process" EXACT [GOC:TermGenie]
@@ -608398,7 +608727,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a septum over time, from its formation to the mature structure." [GO_REF:0000080, GOC:tb, GOC:TermGenie, PMID:4562349]
 synonym: "dissepiment development" BROAD [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2016-07-21T18:25:49Z
@@ -609218,7 +609546,6 @@
 namespace: cellular_component
 def: "A protein complex which is capable of beta-N-acetylhexosaminidase activity." [GO_REF:0000088, GOC:bhm, GOC:TermGenie, PMID:6458607]
 comment: An example of this is HEXB in human (UniProt symbol P07686) in PMID:6458607 (inferred from direct assay).
-synonym: "HEX A complex" NARROW []
 synonym: "HEX B complex" NARROW []
 synonym: "HEX S complex" NARROW []
 is_a: GO:1902494 ! catalytic complex
@@ -614253,11 +614580,12 @@
 
 [Term]
 id: GO:1905594
-name: resveratrol binding
+name: obsolete resveratrol binding
 namespace: molecular_function
-def: "Binding to resveratrol." [GO_REF:0000067, GOC:TermGenie, PMID:18254726]
-comment: (5-(aziridin-1-yl)-2,4-dinitrobenzamide
-is_a: GO:0005488 ! binding
+def: "OBSOLETE. Binding to resveratrol." [GO_REF:0000067, GOC:TermGenie, PMID:18254726]
+comment: The reason for obsoletion is that binding to resveratrol is not an evolved molecular function.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32321" xsd:anyURI
+is_obsolete: true
 created_by: pga
 creation_date: 2016-10-25T15:23:37Z
 
@@ -619296,6 +619624,7 @@
 def: "The process whose specific outcome is the progression of an epididymis over time, from its formation to the mature structure." [GO_REF:0000094, GOC:TermGenie, PMID:12388089]
 synonym: "epididymus development" EXACT [GOC:TermGenie]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: sl
 creation_date: 2017-01-27T00:00:33Z
 
@@ -620470,9 +620799,9 @@
 
 [Term]
 id: GO:1905930
-name: obsolete obsolete regulation of vascular associated smooth muscle cell differentiation involved in phenotypic switching
+name: obsolete regulation of vascular associated smooth muscle cell differentiation involved in phenotypic switching
 namespace: biological_process
-def: "OBSOLETE. OBSOLETE. Any process that modulates the frequency, rate or extent of vascular smooth muscle cell differentiation involved in phenotypic switching." [GO_REF:0000058, GOC:BHF, GOC:BHF_miRNA, GOC:rph, GOC:TermGenie, PMID:25089138]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of vascular smooth muscle cell differentiation involved in phenotypic switching." [GO_REF:0000058, GOC:BHF, GOC:BHF_miRNA, GOC:rph, GOC:TermGenie, PMID:25089138]
 comment: This term was obsoleted because it is a pre-composed term that should be captured as a GO-CAM model.
 synonym: "regulation of vascular associated smooth muscle cell differentiation involved in phenotypic dimorphism" RELATED [GOC:TermGenie]
 synonym: "regulation of vascular smooth muscle cell differentiation involved in phenotypic dimorphism" RELATED [GOC:TermGenie]
@@ -621719,7 +622048,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit replum over time, from its formation to the mature structure. The fruit replum is a portion of fruit placenta tissue that divides a fruit into two or more chambers and develops from a replum." [PMID:23133401, PO:0025267]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
@@ -621731,7 +622059,6 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit valve over time, from its formation to the mature structure. The fruit valve is a part of a fruit that splits apart when the fruit dehisces." [PMID:23133401, PO:0000033]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
@@ -626244,11 +626571,13 @@
 
 [Term]
 id: GO:1990486
-name: anaerobic fatty acid catabolic process
+name: obsolete anaerobic fatty acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of a fatty acid in the absence of oxygen. A fatty acid is any of the aliphatic monocarboxylic acids that can be liberated by hydrolysis from naturally occurring fats and oils. Fatty acids are predominantly straight-chain acids of 4 to 24 carbon atoms, which may be saturated or unsaturated; branched fatty acids and hydroxy fatty acids also occur, and very long chain acids of over 30 carbons are found in waxes." [GOC:mengo_curators, PMID:17329794]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of a fatty acid in the absence of oxygen. A fatty acid is any of the aliphatic monocarboxylic acids that can be liberated by hydrolysis from naturally occurring fats and oils. Fatty acids are predominantly straight-chain acids of 4 to 24 carbon atoms, which may be saturated or unsaturated; branched fatty acids and hydroxy fatty acids also occur, and very long chain acids of over 30 carbons are found in waxes." [GOC:mengo_curators, PMID:17329794]
+comment: This term was obsoleted because it represents a specific substrate, which is out of scope for GO.
 synonym: "anaerobic fatty acid degradation" EXACT []
-is_a: GO:0009062 ! fatty acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32227" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2014-09-20T17:25:48Z
 
@@ -626606,7 +626935,6 @@
 def: "The process in which a pyrimidine nucleotide is transported across the mitochondrial inner membrane, into the mitochondrial matrix." [PMID:16194150]
 synonym: "mitochondrial pyrimidine nucleotide import" EXACT []
 is_a: GO:0006864 ! pyrimidine nucleotide transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0072531 ! pyrimidine-containing compound transmembrane transport
 is_a: GO:1901679 ! nucleotide transmembrane transport
 created_by: vw
@@ -627626,7 +627954,6 @@
 namespace: biological_process
 def: "The directed movement of magnesium ions out of mitochondrial matrix into the cytosol by means of some agent such as a transporter or pore." [PMID:25585246]
 synonym: "magnesium ion efflux from mitochondrion" EXACT []
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0045016 ! mitochondrial magnesium ion transmembrane transport
 created_by: mcc
 creation_date: 2015-01-21T22:06:42Z
@@ -644252,12 +644579,13 @@
 
 [Term]
 id: GO:2000889
-name: cellodextrin metabolic process
+name: obsolete cellodextrin metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving a cellodextrin." [GOC:obol]
+def: "OBSOLETE. The chemical reactions and pathways involving a cellodextrin." [GOC:obol]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cellodextrin metabolism" EXACT [GOC:obol]
-is_a: GO:0009311 ! oligosaccharide metabolic process
-is_a: GO:0044042 ! glucan metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: jl
 creation_date: 2011-07-28T01:00:04Z
 
@@ -644269,7 +644597,6 @@
 synonym: "cellodextrin catabolism" EXACT [GOC:obol]
 is_a: GO:0009313 ! oligosaccharide catabolic process
 is_a: GO:1901027 ! dextrin catabolic process
-is_a: GO:2000889 ! cellodextrin metabolic process
 created_by: jl
 creation_date: 2011-07-28T01:05:21Z
 
@@ -644296,11 +644623,13 @@
 
 [Term]
 id: GO:2000893
-name: cellotriose metabolic process
+name: obsolete cellotriose metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving a cellotriose." [GOC:mengo_curators]
+def: "OBSOLETE. The chemical reactions and pathways involving a cellotriose." [GOC:mengo_curators]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "cellotriose metabolism" EXACT [GOC:obol]
-is_a: GO:0009311 ! oligosaccharide metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: jl
 creation_date: 2011-07-28T02:02:44Z
 
@@ -644311,7 +644640,6 @@
 def: "The chemical reactions and pathways resulting in the breakdown of a cellotriose." [GOC:mengo_curators]
 synonym: "cellotriose catabolism" EXACT [GOC:obol]
 is_a: GO:0009313 ! oligosaccharide catabolic process
-is_a: GO:2000893 ! cellotriose metabolic process
 created_by: jl
 creation_date: 2011-07-28T02:02:47Z
 
@@ -647275,11 +647603,13 @@
 
 [Term]
 id: GO:2001122
-name: maltoheptaose metabolic process
+name: obsolete maltoheptaose metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving a maltoheptaose." [GOC:mengo_curators]
+def: "OBSOLETE. The chemical reactions and pathways involving a maltoheptaose." [GOC:mengo_curators]
+comment: This term was obsoleted because there is no evidence that this process exists.
 synonym: "maltoheptaose metabolism" EXACT [GOC:obol]
-is_a: GO:0009311 ! oligosaccharide metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32295" xsd:anyURI
+is_obsolete: true
 created_by: jl
 creation_date: 2011-10-11T02:41:26Z
 
@@ -647290,7 +647620,6 @@
 def: "The chemical reactions and pathways resulting in the breakdown of a maltoheptaose." [GOC:mengo_curators]
 synonym: "maltoheptaose catabolism" EXACT [GOC:obol]
 is_a: GO:0009313 ! oligosaccharide catabolic process
-is_a: GO:2001122 ! maltoheptaose metabolic process
 created_by: jl
 creation_date: 2011-10-11T02:41:29Z
 
@@ -649528,6 +649857,7 @@
 synonym: "regulation of caveolae-mediated endocytosis" EXACT [GOC:obol]
 synonym: "regulation of caveolin-dependent endocytosis" EXACT [GOC:obol]
 is_a: GO:0030100 ! regulation of endocytosis
+is_a: GO:0060627 ! regulation of vesicle-mediated transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0072584 ! caveolin-mediated endocytosis
 relationship: regulates GO:0072584 ! caveolin-mediated endocytosis
@@ -650246,6 +650576,7 @@
 def: "The process in which relatively unspecialized cells acquire specialized structural and/or functional features of an intestinal enterochromaffin enteroendocrine cell. Enterochromaffin enteroendocrine cells are found in the gastrointestinal mucosa and secrete serotonin and some neurotransmitters including enkephalins and substance P." [PMID:37883554]
 synonym: "type EC enteroendocrine cell differentiation" EXACT []
 is_a: GO:0035883 ! enteroendocrine cell differentiation
+is_a: GO:0061101 ! neuroendocrine cell differentiation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30979" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-10-31T00:00:00Z
@@ -650256,6 +650587,7 @@
 namespace: biological_process
 def: "The process in which relatively unspecialized cells acquire specialized structural and/or functional features of an intestinal type G enteroendocrine cell. Intestinal type G enteroendocrine cells are found in the stomach and duodenum and are responsible for the secretion of gastrin and enkephalin." [PMID:37883554]
 is_a: GO:0035883 ! enteroendocrine cell differentiation
+is_a: GO:0061101 ! neuroendocrine cell differentiation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30979" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-10-31T00:00:00Z
@@ -650267,6 +650599,7 @@
 def: "The process in which relatively unspecialized cells acquire specialized structural and/or functional features of an intestinal type I enteroendocrine cell. Intestinal type I enteroendocrine cells are found in the duodenum and jejunum and secrete cholecystokinin." [GOC:TermGenie, PMID:37883554]
 synonym: "CCK cell differentiation" EXACT []
 is_a: GO:0035883 ! enteroendocrine cell differentiation
+is_a: GO:0060575 ! intestinal epithelial cell differentiation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30979" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-10-31T00:00:00Z
@@ -650277,6 +650610,7 @@
 namespace: biological_process
 def: "The process in which relatively unspecialized cells acquire specialized structural and/or functional features of an intestinal type L enteroendocrine cell. Intestinal type L enteroendocrine cells are found in ileum and large intestine and secrete glucagon-like peptides." [PMID:37883554]
 is_a: GO:0035883 ! enteroendocrine cell differentiation
+is_a: GO:0060575 ! intestinal epithelial cell differentiation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30979" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-10-31T00:00:00Z
@@ -650287,6 +650621,7 @@
 namespace: biological_process
 def: "The process in which relatively unspecialized cells acquire specialized structural and/or functional features of an intestinal type N enteroendocrine cell. Intestinal type N enteroendocrine cells are found in the ileum and jejunum and secrete neurotensin." [PMID:37883554]
 is_a: GO:0035883 ! enteroendocrine cell differentiation
+is_a: GO:0060575 ! intestinal epithelial cell differentiation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30979" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-10-31T00:00:00Z
@@ -650307,7 +650642,9 @@
 name: N(6),N(6),N(6)-trimethyl-L-lysine transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of N(6),N(6),N(6)-trimethyl-L-lysine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
+xref: RHEA:86419
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
+property_value: skos:exactMatch RHEA:86419
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650317,8 +650654,10 @@
 namespace: molecular_function
 def: "Enables the transfer of dimethylarginine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
 xref: RHEA:75047
+xref: RHEA:86423
 is_a: GO:0022857 ! transmembrane transporter activity
 property_value: skos:narrowMatch RHEA:75047
+property_value: skos:narrowMatch RHEA:86423
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650702,7 +651041,6 @@
 synonym: "MIM pathway" NARROW []
 synonym: "MTCH pathway" NARROW []
 is_a: GO:0006886 ! intracellular protein transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0045040 ! protein insertion into mitochondrial outer membrane
 is_a: GO:0070585 ! protein localization to mitochondrion
 is_a: GO:0072657 ! protein localization to membrane
@@ -650755,7 +651093,6 @@
 def: "The import of beta barrel proteins from the cytosol and their insertion into the mitochondrial outer membrane." [PMID:36931257]
 synonym: "TOM-SAM pathway" EXACT []
 is_a: GO:0006886 ! intracellular protein transport
-is_a: GO:0010496 ! intercellular transport
 is_a: GO:0045040 ! protein insertion into mitochondrial outer membrane
 is_a: GO:0070585 ! protein localization to mitochondrion
 is_a: GO:0072657 ! protein localization to membrane
@@ -650977,6 +651314,98 @@
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
+[Term]
+id: GO:7770085
+name: protocatechuate 3,4-dioxygenase complex
+namespace: cellular_component
+def: "A protein complex which is capable of protocatechuate 3,4-dioxygenase activity. It consists of an alpha subunit (PcaG) and a beta subunit (PcaH), with the non-heme iron active site formed at the alpha-beta interface." [PMID:25558786]
+synonym: "PcaGH complex" NARROW [PMID:25558786]
+synonym: "PcaHG complex" NARROW [PMID:25558786]
+synonym: "protocatechuate 3,4-oxygenase complex" RELATED []
+is_a: GO:1990204 ! oxidoreductase complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32320" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-07-16T16:34:38Z
+
+[Term]
+id: GO:7770086
+name: resveratrol dioxygenase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: trans-resveratrol + O2 = 3,5-dihydroxybenzaldehyde + 4-hydroxybenzaldehyde." [PMID:28493664, RHEA:73735]
+synonym: "resveratrol alpha,beta-dioxygenase activity" RELATED []
+synonym: "resveratrol cleavage oxygenase activity" RELATED []
+xref: RHEA:73735
+is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
+property_value: skos:exactMatch RHEA:73735
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32321" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-07-16T20:45:19Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
