# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-06-25 06:46:46.736526425 +0000
+++ go.obo	2026-06-25 07:01:55.017017046 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-05-19
+data-version: releases/2026-06-25
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-05-19" xsd:string
+property_value: owl:versionInfo "2026-06-25" xsd:string
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
@@ -3072,10 +3074,16 @@
 namespace: molecular_function
 alt_id: GO:0005051
 def: "Binding to a peroxisomal targeting sequence, a short stretch of amino acids found in a protein that acts as a signal to localize the protein to the peroxisome." [PMID:20659419]
+synonym: "peroxisome matrix targeting signal-1 binding" NARROW []
+synonym: "peroxisome matrix targeting signal-1 receptor activity" NARROW []
+synonym: "peroxisome matrix targeting signal-2 binding" NARROW []
+synonym: "peroxisome matrix targeting signal-2 receptor activity" NARROW []
+synonym: "peroxisome membrane targeting sequence binding" NARROW []
+synonym: "peroxisome membrane targeting sequence receptor activity" NARROW []
 synonym: "peroxisome targeting sequence binding" NARROW []
 synonym: "peroxisome targeting signal receptor" NARROW []
-synonym: "PTS binding" EXACT []
-synonym: "PTS receptor" NARROW []
+synonym: "PTS binding" NARROW []
+synonym: "PTS receptor" EXACT []
 is_a: GO:0005048 ! signal sequence receptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
 
@@ -4649,28 +4657,29 @@
 
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
@@ -4698,13 +4707,13 @@
 
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
@@ -8381,34 +8390,37 @@
 
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
 
@@ -9992,6 +10004,7 @@
 def: "The process whose specific outcome is the progression of the skeleton over time, from its formation to the mature structure. The skeleton is the bony framework of the body in vertebrates (endoskeleton) or the hard outer envelope of insects (exoskeleton or dermoskeleton)." [GOC:dph, GOC:jid, GOC:tb]
 synonym: "skeletal development" EXACT []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0001502
@@ -10399,7 +10412,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ovarian follicle over time, from its formation to the mature structure." [https://www.ncbi.nlm.nih.gov/books/NBK279054/]
 synonym: "follicular phase" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0008585 ! female gonad development
 
 [Term]
@@ -10603,9 +10616,13 @@
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
@@ -10676,7 +10693,7 @@
 name: blood vessel development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a blood vessel over time, from its formation to the mature structure. The blood vessel is the vasculature carrying blood." [GOC:hjd, UBERON:0001981]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001944 ! vasculature development
 
 [Term]
@@ -11414,6 +11431,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the urogenital system over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: has_part GO:0072001 ! renal system development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22178" xsd:anyURI
 
@@ -13245,7 +13263,7 @@
 def: "The process whose specific outcome is the progression of the blastocyst over time, from its formation to the mature structure. The mammalian blastocyst is a hollow ball of cells containing two cell types, the inner cell mass and the trophectoderm. The blastula follows the morula and precedes the gastrula in the developmental sequence." [GOC:dph, ISBN:0124020607, ISBN:0198542771]
 comment: See also the Anatomical Dictionary for Mouse Development ontology terms 'TS5, embryo ; EMAP:23', 'TS5, inner cell mass ; EMAP:24' and 'TS5, trophectoderm; EMAP:28'.
 synonym: "blastula development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001701 ! in utero embryonic development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29162" xsd:anyURI
 
@@ -13928,8 +13946,8 @@
 def: "Maternally driven process whose specific outcome is the progression of the placenta over time, from its formation to the mature structure. The placenta is an organ of metabolic interchange between fetus and mother, partly of embryonic origin and partly of maternal origin." [GOC:add, ISBN:068340007X]
 synonym: "decidua development" RELATED [GOC:dph]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0060135 ! maternal process involved in female pregnancy
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001890 ! placenta development
 
 [Term]
@@ -14539,7 +14557,7 @@
 alt_id: GO:0001943
 def: "The process whose specific outcome is the progression of the hair follicle over time, from its formation to the mature structure. A hair follicle is a tube-like opening in the epidermis where the hair shaft develops and into which the sebaceous glands open." [GOC:dph, UBERON:0002073]
 is_a: GO:0022405 ! hair cycle process
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0098773 ! skin epidermis development
 
 [Term]
@@ -14549,6 +14567,7 @@
 def: "The process whose specific outcome is the progression of the vasculature over time, from its formation to the mature structure. The vasculature is an interconnected tubular multi-tissue structure that contains fluid that is actively transported around the organism." [GOC:dph, UBERON:0002409]
 synonym: "vascular system development" RELATED []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072359 ! circulatory system development
 
 [Term]
@@ -14556,7 +14575,7 @@
 name: lymph vessel development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a lymph vessel over time, from its formation to the mature structure." [GOC:dph, UBERON:0001473]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001944 ! vasculature development
 
 [Term]
@@ -16049,7 +16068,7 @@
 def: "The process whose specific outcome is the progression of the lens over time, from its formation to the mature structure. The lens is a transparent structure in the eye through which light is focused onto the retina. An example of this process is found in Mus musculus." [GOC:dph, ISBN:0582064333]
 synonym: "lens development" EXACT []
 synonym: "lens development in camera-style eye" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 
 [Term]
@@ -16597,32 +16616,31 @@
 
 [Term]
 id: GO:0002149
-name: hypochlorous acid biosynthetic process
+name: obsolete hypochlorous acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of hypochlorous acid." [GOC:add, PMID:10085024, PMID:176150]
-comment: Note that this reaction is catalyzed by myeloperoxidase in neutrophils.
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of hypochlorous acid." [GOC:add, PMID:10085024, PMID:176150]
+comment: The reason for obsoletion is that this BP term represents a MF term.
 synonym: "HClO biosynthetic process" EXACT []
 synonym: "HOCl biosynthetic process" EXACT []
 synonym: "hypochlorite biosynthetic process" RELATED []
 synonym: "hypochlorous acid biosynthesis" EXACT []
-is_a: GO:0043436 ! oxoacid metabolic process
-is_a: GO:0044283 ! small molecule biosynthetic process
-is_a: GO:1903409 ! reactive oxygen species biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22891" xsd:anyURI
+is_obsolete: true
 created_by: hjd
 creation_date: 2009-10-13T10:32:35Z
 
 [Term]
 id: GO:0002150
-name: hypochlorous acid catabolic process
+name: obsolete hypochlorous acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of hypochlorous acid." [GOC:add]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of hypochlorous acid." [GOC:add]
+comment: The reason for obsoletion is that this BP term represents a MF term.
 synonym: "HClO catabolic process" EXACT []
 synonym: "HOCl catabolic process" EXACT []
 synonym: "hypochlorite catabolic process" RELATED []
 synonym: "hypochlorous acid catabolism" EXACT []
-is_a: GO:0043436 ! oxoacid metabolic process
-is_a: GO:0044282 ! small molecule catabolic process
-is_a: GO:0072593 ! reactive oxygen species metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22891" xsd:anyURI
+is_obsolete: true
 created_by: hjd
 creation_date: 2009-10-13T10:36:09Z
 
@@ -16784,6 +16802,7 @@
 def: "The process whose specific outcome is the progression of the larva over time, from its formation to the mature structure. The larva is the early, immature form of an that at birth or hatching is fundamentally unlike its parent and must metamorphose before assuming the adult characters." [GOC:jid, ISBN:0877795088]
 is_a: GO:0007275 ! multicellular organism development
 is_a: GO:0009791 ! post-embryonic development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002165
@@ -16792,6 +16811,7 @@
 def: "The process whose specific outcome is the progression of the instar larva or pupa over time, from its formation to the mature structure. An example of this process is found in Drosophila melanogaster." [GOC:jid, GOC:mtg_sensu]
 is_a: GO:0007275 ! multicellular organism development
 is_a: GO:0009791 ! post-embryonic development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002167
@@ -18740,7 +18760,6 @@
 name: plasma kallikrein-kinin cascade
 namespace: biological_process
 def: "A series of reactions that takes place outside the cell occurring in response to tissue damage and initiated within blood plasma by the action of activated Factor XII (Hageman Factor) on prekallikrein to convert it to plasma kallikrein, and the subsequent reaction of plasma kallikrein with high molecular weight kininogen. The ultimate product of the plasma kallikrein-kinin cascade is bradykinin, an agent known to induce smooth muscle contraction, vasoconstriction, and increased vascular permeability." [GOC:add, ISBN:0721601871, PMID:11842287, PMID:14501145]
-xref: Reactome:R-HSA-9970672 "FXIIa activates plasma kallikrein-kinin system"
 is_a: GO:0002254 ! kinin cascade
 
 [Term]
@@ -20257,6 +20276,7 @@
 subset: goslim_drosophila
 is_a: GO:0002376 ! immune system process
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002521
@@ -24747,7 +24767,10 @@
 synonym: "down-regulation of inflammatory response to antigenic stimulus" EXACT []
 synonym: "downregulation of inflammatory response to antigenic stimulus" EXACT []
 synonym: "inhibition of inflammatory response to antigenic stimulus" NARROW []
-xref: Reactome:R-HSA-9662851 "Anti-inflammatory response favouring Leishmania parasite infection"
+xref: Reactome:R-HSA-9660821 "ADORA2B mediated anti-inflammatory cytokines production"
+xref: Reactome:R-HSA-9662834 "CD163 mediating an anti-inflammatory response"
+xref: Reactome:R-HSA-9664323 "FCGR3A-mediated IL10 synthesis"
+xref: Reactome:R-HSA-9664535 "LTC4-CYSLTR mediated IL4 production"
 is_a: GO:0002861 ! regulation of inflammatory response to antigenic stimulus
 is_a: GO:0050728 ! negative regulation of inflammatory response
 is_a: GO:0050777 ! negative regulation of immune response
@@ -25746,6 +25769,7 @@
 namespace: biological_process
 def: "The progression of the trabecular meshwork over time, from its formation to the mature structure. The trabecular meshwork is a fenestrated endothelial-like tissue situated at the intersection of the cornea and the iris. The trabecular meshwork provides drainage for the aqueous humor." [PMID:20568247]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: hjd
 creation_date: 2012-04-19T04:50:06Z
@@ -27546,7 +27570,7 @@
 name: endocardium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endocardium over time, from its formation to the mature structure. The endocardium is an anatomical structure comprised of an endothelium and an extracellular matrix that forms the innermost layer of tissue of the heart, and lines the heart chambers." [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-01T12:42:27Z
@@ -27685,7 +27709,7 @@
 namespace: biological_process
 def: "The progression of a heart valve over time, from its formation to the mature structure. A heart valve is a structure that restricts the flow of blood to different regions of the heart and forms from an endocardial cushion." [GOC:mtg_heart]
 synonym: "cardiac valve development" EXACT [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-08T10:50:09Z
@@ -28050,7 +28074,7 @@
 name: cardiac chamber development
 namespace: biological_process
 def: "The progression of a cardiac chamber over time, from its formation to the mature structure. A cardiac chamber is an enclosed cavity within the heart." [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-13T09:11:18Z
@@ -28858,7 +28882,7 @@
 namespace: biological_process
 def: "The progression of a cardiac septum over time, from its initial formation to the mature structure." [GOC:mtg_heart]
 synonym: "heart septum development" EXACT [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003205 ! cardiac chamber development
 created_by: dph
 creation_date: 2009-10-20T09:45:13Z
@@ -29773,7 +29797,7 @@
 name: brainstem development
 namespace: biological_process
 def: "The progression of the brainstem from its formation to the mature structure. The brainstem is the part of the brain that connects the brain with the spinal cord." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-12-03T10:47:20Z
 
@@ -30315,7 +30339,7 @@
 name: neural retina development
 namespace: biological_process
 def: "The progression of the neural retina over time from its initial formation to the mature structure. The neural retina is the part of the retina that contains neurons and photoreceptor cells." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060041 ! retina development in camera-type eye
 created_by: dph
 creation_date: 2009-12-21T02:15:14Z
@@ -30346,7 +30370,7 @@
 name: anterior rotation of the optic cup
 namespace: biological_process
 def: "A 90 degree-rotation of the optic cup resulting in its alignment with the anterior-posterior body axis." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2009-12-21T02:49:48Z
@@ -32067,7 +32091,6 @@
 xref: MetaCyc:2.3.2.13-RXN
 xref: Reactome:R-HSA-140851 "fibrin multimer -> fibrin multimer, crosslinked + NH4+"
 xref: Reactome:R-HSA-6810894 "Envoplakin, periplakin, involucrin, SPR binding mediated by TGM1 crosslinking"
-xref: Reactome:R-HSA-9921091 "IIb3:fibrin multimer ->IIb3:fibrin multimer, crosslinked + NH4+"
 xref: RHEA:54816
 is_a: GO:0016755 ! aminoacyltransferase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
@@ -32574,8 +32597,8 @@
 synonym: "N-carbamoyl-beta-alanine amidohydrolase activity" RELATED [EC:3.5.1.6]
 xref: EC:3.5.1.6
 xref: MetaCyc:BETA-UREIDOPROPIONASE-RXN
-xref: Reactome:R-HSA-73591 "conversion of 3-ureidopropionate to beta-alanine"
-xref: Reactome:R-HSA-73620 "conversion of 3-Ureidoiosbutyrate to 3-Aminoisobutyrate"
+xref: Reactome:R-HSA-73591 "beta-ureidopropionate + H2O => beta-alanine + NH4+ + CO2"
+xref: Reactome:R-HSA-73620 "beta-ureidoisobutyrate + H2O => 3-aminoisobutyrate + NH4+ + CO2"
 xref: RHEA:11184
 is_a: GO:0016811 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amides
 property_value: skos:exactMatch EC:3.5.1.6
@@ -33207,13 +33230,13 @@
 xref: Reactome:R-HSA-508369 "alpha-methylacetoacetyl-CoA + NADH + H+ <=> alpha-methyl-beta-hydroxybutyryl-CoA + NAD+"
 xref: Reactome:R-HSA-6809264 "EHHADH dehydrogenates 3-hydroxyhexacosanoyl-CoA"
 xref: Reactome:R-HSA-70837 "alpha-methyl-beta-hydroxybutyryl-CoA + NAD+ <=> alpha-methylacetoacetyl-CoA + NADH + H+"
-xref: Reactome:R-HSA-77254 "(S)-3-Hydroxydodecanoyl-CoA+NAD => 3-Oxododecanoyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77283 "(S)-3-Hydroxytetradecanoyl-CoA+NAD => 3-Oxotetradecanoyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77303 "(S)-3-Hydroxyhexadecanoyl-CoA+NAD => 3-Oxopalmitoyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77312 "(S)-Hydroxybutanoyl-CoA+NAD => Acetoacetyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77323 "(S)-Hydroxyhexanoyl-CoA+NAD => 3-Oxohexanoyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77331 "(S)-Hydroxyoctanoyl-CoA+NAD => 3-Oxooctanoyl-CoA+NADH+H"
-xref: Reactome:R-HSA-77342 "(S)-Hydroxydecanoyl-CoA+NAD => 3-Oxodecanoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77254 "(S)-3-Hydroxydodecanoyl-CoA+NAD<=>3-Oxododecanoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77283 "(S)-3-Hydroxytetradecanoyl-CoA+NAD<=>3-Oxotetradecanoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77303 "(S)-3-Hydroxyhexadecanoyl-CoA+NAD<=>3-Oxopalmitoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77312 "(S)-Hydroxybutanoyl-CoA+NAD<=>Acetoacetyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77323 "(S)-Hydroxyhexanoyl-CoA+NAD<=>3-Oxohexanoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77331 "(S)-Hydroxyoctanoyl-CoA+NAD<=>3-Oxooctanoyl-CoA+NADH+H"
+xref: Reactome:R-HSA-77342 "(S)-Hydroxydecanoyl-CoA+NAD<=>3-Oxodecanoyl-CoA+NADH+H"
 xref: RHEA:22432
 xref: RHEA:30799
 xref: RHEA:31143
@@ -33659,7 +33682,7 @@
 synonym: "protein ADP-ribosylarginine hydrolase activity" RELATED [EC:3.2.2.19]
 synonym: "protein-nomega-(ADP-D-ribosyl)-L-arginine ADP-ribosylhydrolase activity" RELATED [EC:3.2.2.19]
 xref: EC:3.2.2.19
-xref: MetaCyc:3.2.2.24-RXN {xref="skos:narrowMatch"}
+xref: MetaCyc:3.2.2.24-RXN
 xref: MetaCyc:ADP-RIBOSYLARGININE-HYDROLASE-RXN
 xref: MetaCyc:RXN-8732
 xref: RHEA:14493
@@ -33668,6 +33691,7 @@
 is_a: GO:0016799 ! hydrolase activity, hydrolyzing N-glycosyl compounds
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch EC:3.2.2.19
+property_value: skos:narrowMatch MetaCyc:3.2.2.24-RXN
 property_value: skos:narrowMatch MetaCyc:ADP-RIBOSYLARGININE-HYDROLASE-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-8732
 property_value: skos:narrowMatch RHEA:14493
@@ -33862,8 +33886,8 @@
 synonym: "UTP:ammonia ligase (ADP-forming)" RELATED [EC:6.3.4.2]
 xref: EC:6.3.4.2
 xref: MetaCyc:CTPSYN-RXN
-xref: Reactome:R-HSA-504054 "Amination of uridine 5'-triphosphate (UTP) to form cytidine 5'-triphosphate (CTPS2)"
-xref: Reactome:R-HSA-73647 "Amination of uridine 5'-triphosphate (UTP) to form cytidine 5'-triphosphate (CTPS)"
+xref: Reactome:R-HSA-504054 "UTP + glutamine + ATP + H2O => CTP + glutamate + ADP + orthophosphate [CTPS2]"
+xref: Reactome:R-HSA-73647 "UTP + glutamine + ATP + H2O => CTP + glutamate + ADP + orthophosphate [CTPS]"
 xref: RHEA:26426
 is_a: GO:0016879 ! ligase activity, forming carbon-nitrogen bonds
 property_value: skos:exactMatch EC:6.3.4.2
@@ -34284,7 +34308,6 @@
 xref: Reactome:R-HSA-5649734 "LIG3 ligates NEIL1,NEIL2-generated single strand break"
 xref: Reactome:R-HSA-5651789 "LIG1 bound to POLB ligates SSB"
 xref: Reactome:R-HSA-5651805 "LIG1 bound to APEX1 and PCNA ligates SSB"
-xref: Reactome:R-HSA-5686663 "Completion of SSA"
 xref: Reactome:R-HSA-5687675 "LIG3 ligates remaining SSBs in MMEJ"
 xref: Reactome:R-HSA-5690997 "Ligation of newly synthesized repair patch to incised DNA in GG-NER"
 xref: Reactome:R-HSA-5693604 "XRCC4:LIG4 ligates DNA DSB ends during NHEJ"
@@ -34503,7 +34526,7 @@
 xref: EC:1.7.1.7
 xref: KEGG_REACTION:R01134
 xref: MetaCyc:GMP-REDUCT-RXN
-xref: Reactome:R-HSA-514604 "GMP + NADPH + 2 H+ => IMP + NADP+ + NH4+ (GMPR,GMPR2)"
+xref: Reactome:R-HSA-514604 "GMP + NADPH + H+ => IMP + NADP+ + NH4+ (GMPR,GMPR2)"
 xref: RHEA:17185
 is_a: GO:0046857 ! oxidoreductase activity, acting on other nitrogenous compounds as donors, with NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.7.1.7
@@ -35552,8 +35575,6 @@
 xref: Reactome:R-HSA-9837511 "Abortive replication of hRSV A"
 xref: Reactome:R-HSA-9922955 "NS5 synthesizes minus strand genome"
 xref: Reactome:R-HSA-9923068 "NS5 synthesizes plus strand genome"
-xref: Reactome:R-HSA-9944255 "CHD6 negatively regulates influenza transcription"
-xref: Reactome:R-HSA-9944257 "CHD6 negatively regulates positive strand RNA synthesis"
 is_a: GO:0034062 ! 5'-3' RNA polymerase activity
 relationship: part_of GO:0001172 ! RNA-templated transcription
 property_value: skos:exactMatch EC:2.7.7.48
@@ -35919,12 +35940,12 @@
 xref: EC:2.3.1.16
 xref: MetaCyc:KETOACYLCOATHIOL-RXN
 xref: Reactome:R-HSA-390250 "3-ketohexacosanoyl-CoA + CoASH => tetracosanoyl-CoA + acetyl-CoA"
-xref: Reactome:R-HSA-77271 "3-Oxotetradecanoyl-CoA+CoA-SH => Lauroyl-CoA + acetyl-CoA"
-xref: Reactome:R-HSA-77304 "3-Oxopalmitoyl-CoA+CoA-SH => myristoyl-CoA+acetyl-CoA"
-xref: Reactome:R-HSA-77309 "3-Oxododecanoyl-CoA+CoA-SH => Decanoyl-CoA + acetyl-CoA"
-xref: Reactome:R-HSA-77321 "3-Oxohexanoyl-CoA+CoA-SH => Butanoyl-CoA + acetyl-CoA"
-xref: Reactome:R-HSA-77329 "3-Oxooctanoyl-CoA+CoA-SH => Hexanoyl-CoA + acetyl-CoA"
-xref: Reactome:R-HSA-77340 "3-Oxodecanoyl-CoA+CoA-SH => Octanoyl-CoA + acetyl-CoA"
+xref: Reactome:R-HSA-77271 "3-Oxotetradecanoyl-CoA+CoA-SH<=>Lauroyl-CoA"
+xref: Reactome:R-HSA-77304 "3-Oxopalmitoyl-CoA+CoA-SH<=>myristoyl-CoA"
+xref: Reactome:R-HSA-77309 "3-Oxododecanoyl-CoA+CoA-SH<=>Decanoyl-CoA"
+xref: Reactome:R-HSA-77321 "3-Oxohexanoyl-CoA+CoA-SH<=>Butanoyl-CoA"
+xref: Reactome:R-HSA-77329 "3-Oxooctanoyl-CoA+CoA-SH<=>Hexanoyl-CoA"
+xref: Reactome:R-HSA-77340 "3-Oxodecanoyl-CoA+CoA-SH<=>Octanoyl-CoA"
 xref: Reactome:R-HSA-8874745 "ACAA2 tetramer transfers acyl group from Ac-CoA to acyl-CoA forming 3OA-CoA and CoA-SH"
 xref: RHEA:21564
 xref: RHEA:31087
@@ -35955,6 +35976,7 @@
 xref: RHEA:83083
 xref: RHEA:83095
 xref: RHEA:83099
+xref: RHEA:83127
 xref: RHEA:83135
 xref: RHEA:83219
 xref: RHEA:83251
@@ -35962,6 +35984,8 @@
 xref: RHEA:83367
 xref: RHEA:83383
 xref: RHEA:83399
+xref: RHEA:84311
+xref: RHEA:84391
 xref: RHEA:84447
 xref: RHEA:84451
 xref: RHEA:84455
@@ -35972,7 +35996,11 @@
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
@@ -36005,6 +36033,7 @@
 property_value: skos:narrowMatch RHEA:83083
 property_value: skos:narrowMatch RHEA:83095
 property_value: skos:narrowMatch RHEA:83099
+property_value: skos:narrowMatch RHEA:83127
 property_value: skos:narrowMatch RHEA:83135
 property_value: skos:narrowMatch RHEA:83219
 property_value: skos:narrowMatch RHEA:83251
@@ -36012,6 +36041,8 @@
 property_value: skos:narrowMatch RHEA:83367
 property_value: skos:narrowMatch RHEA:83383
 property_value: skos:narrowMatch RHEA:83399
+property_value: skos:narrowMatch RHEA:84311
+property_value: skos:narrowMatch RHEA:84391
 property_value: skos:narrowMatch RHEA:84447
 property_value: skos:narrowMatch RHEA:84451
 property_value: skos:narrowMatch RHEA:84455
@@ -36022,7 +36053,11 @@
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
@@ -36177,13 +36212,13 @@
 xref: Reactome:R-HSA-5695989 "ACAD11 dehydrogenates BH-CoA"
 xref: Reactome:R-HSA-70800 "alpha-methylbutyryl-CoA + FAD => tiglyl-CoA + FADH2"
 xref: Reactome:R-HSA-70859 "isobutyryl-CoA + FAD => methacrylyl-CoA + FADH2"
-xref: Reactome:R-HSA-77263 "lauroyl-CoA+FAD => 2-trans-Dodecenoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77274 "myristoyl-CoA+FAD => trans-tetradec-2-enoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77299 "palmitoyl-CoA+FAD => trans-Hexadec-2-enoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77319 "Butanoyl-CoA+FAD => Crotonoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77327 "Hexanoyl-CoA+FAD => trans-Hex-2-enoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77338 "Octanoyl-CoA+FAD => trans-Oct-2-enoyl-CoA+FADH2"
-xref: Reactome:R-HSA-77345 "Decanoyl-CoA+FAD => trans-Dec-2-enoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77263 "lauroyl-CoA+FAD<=>2-trans-Dodecenoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77274 "myristoyl-CoA+FAD<=>trans-Tetradec-2-enoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77299 "palmitoyl-CoA+FAD<=>trans-Hexadec-2-enoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77319 "Butanoyl-CoA+FAD<=>Crotonoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77327 "Hexanoyl-CoA+FAD<=>trans-Hex-2-enoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77338 "Octanoyl-CoA+FAD<=>trans-Oct-2-enoyl-CoA+FADH2"
+xref: Reactome:R-HSA-77345 "Decanoyl-CoA+FAD<=>trans-Dec-2-enoyl-CoA+FADH2"
 xref: RHEA:44704
 is_a: GO:0052890 ! oxidoreductase activity, acting on the CH-CH group of donors, with a flavin as acceptor
 property_value: skos:exactMatch MetaCyc:ACYLCOADEHYDROG-RXN
@@ -36224,6 +36259,8 @@
 xref: RHEA:66232
 xref: RHEA:66236
 xref: RHEA:67212
+xref: RHEA:86619
+xref: RHEA:86699
 is_a: GO:0016634 ! oxidoreductase activity, acting on the CH-CH group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.3.3.6
 property_value: skos:exactMatch RHEA:38959
@@ -36243,6 +36280,8 @@
 property_value: skos:narrowMatch RHEA:66232
 property_value: skos:narrowMatch RHEA:66236
 property_value: skos:narrowMatch RHEA:67212
+property_value: skos:narrowMatch RHEA:86619
+property_value: skos:narrowMatch RHEA:86699
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -36623,12 +36662,14 @@
 xref: RHEA:16317
 xref: RHEA:16821
 xref: RHEA:23552
+xref: RHEA:25225
 xref: RHEA:30027
 xref: RHEA:32343
 xref: RHEA:34347
 xref: RHEA:35463
 xref: RHEA:35615
 xref: RHEA:37167
+xref: RHEA:37963
 xref: RHEA:38215
 xref: RHEA:41984
 xref: RHEA:42012
@@ -36694,12 +36735,14 @@
 property_value: skos:narrowMatch RHEA:16317
 property_value: skos:narrowMatch RHEA:16821
 property_value: skos:narrowMatch RHEA:23552
+property_value: skos:narrowMatch RHEA:25225
 property_value: skos:narrowMatch RHEA:30027
 property_value: skos:narrowMatch RHEA:32343
 property_value: skos:narrowMatch RHEA:34347
 property_value: skos:narrowMatch RHEA:35463
 property_value: skos:narrowMatch RHEA:35615
 property_value: skos:narrowMatch RHEA:37167
+property_value: skos:narrowMatch RHEA:37963
 property_value: skos:narrowMatch RHEA:38215
 property_value: skos:narrowMatch RHEA:41984
 property_value: skos:narrowMatch RHEA:42012
@@ -36895,9 +36938,6 @@
 xref: Reactome:R-HSA-6813749 "ALDH1A1 oxidises GA to DGA"
 xref: Reactome:R-HSA-71691 "acetaldehyde + NAD+ => acetate + NADH + H+ [cytosolic]"
 xref: Reactome:R-HSA-71723 "acetaldehyde + NAD+ => acetate + NADH + H+ [mitochondrial]"
-xref: Reactome:R-HSA-9970035 "Unknown ALDH oxidizes methylimidazolealdehyde"
-xref: Reactome:R-HSA-9971429 "Unknown ALDH oxidizes 10-oxo-DECA"
-xref: Reactome:R-HSA-9971446 "Unknown ALDH oxidizes 3-AAPNAL"
 xref: RHEA:16185
 xref: RHEA:30867
 xref: RHEA:30879
@@ -37056,13 +37096,17 @@
 xref: Reactome:R-HSA-5652172 "AKR1B1 reduces Glc to D-sorbitol"
 xref: Reactome:R-HSA-9931850 "AKR1B1 reduces galactose to galactitol"
 xref: RHEA:12789
+xref: RHEA:37967
 xref: RHEA:59924
+xref: RHEA:59932
 is_a: GO:0008106 ! alcohol dehydrogenase (NADP+) activity
 property_value: skos:broadMatch EC:1.1.1.21
 property_value: skos:broadMatch MetaCyc:ALDEHYDE-REDUCTASE-RXN
 property_value: skos:exactMatch KEGG_REACTION:R02820
 property_value: skos:exactMatch RHEA:12789
+property_value: skos:narrowMatch RHEA:37967
 property_value: skos:narrowMatch RHEA:59924
+property_value: skos:narrowMatch RHEA:59932
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27136" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27881" xsd:anyURI
 
@@ -37339,6 +37383,7 @@
 xref: Reactome:R-HSA-9638046 "ACY3:Zn2+ dimer hydrolyses mercapturic acids"
 xref: Reactome:R-HSA-9753944 "ACY1:Zn2+ dimer deacetylates NAC to L-Cys"
 xref: RHEA:15565
+xref: RHEA:28598
 xref: RHEA:36855
 xref: RHEA:47124
 xref: RHEA:49796
@@ -37380,9 +37425,13 @@
 xref: RHEA:81115
 xref: RHEA:81119
 xref: RHEA:81123
+xref: RHEA:86755
+xref: RHEA:86759
+xref: RHEA:86767
 is_a: GO:0016811 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amides
 property_value: skos:exactMatch EC:3.5.1.14
 property_value: skos:exactMatch RHEA:15565
+property_value: skos:narrowMatch RHEA:28598
 property_value: skos:narrowMatch RHEA:36855
 property_value: skos:narrowMatch RHEA:47124
 property_value: skos:narrowMatch RHEA:49796
@@ -37424,6 +37473,9 @@
 property_value: skos:narrowMatch RHEA:81115
 property_value: skos:narrowMatch RHEA:81119
 property_value: skos:narrowMatch RHEA:81123
+property_value: skos:narrowMatch RHEA:86755
+property_value: skos:narrowMatch RHEA:86759
+property_value: skos:narrowMatch RHEA:86767
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -39236,7 +39288,7 @@
 xref: EC:3.5.4.5
 xref: MetaCyc:CYTIDEAM-RXN
 xref: MetaCyc:CYTIDEAM2-RXN
-xref: Reactome:R-HSA-73608 "deamination of 2'-Deoxycytidine to 2'-Deoxyuridine"
+xref: Reactome:R-HSA-73608 "(deoxy)cytidine + H2O => (deoxy)uridine + NH4+ (CDA)"
 xref: Reactome:R-HSA-83677 "C4 deamination of cytidine"
 xref: Reactome:R-HSA-9817513 "AICDA deaminates cytidine in chromatin containing histone H3.3 and 5-methylcytidine"
 xref: RHEA:13433
@@ -39947,8 +39999,8 @@
 synonym: "pyrimidine hydrase activity" RELATED [EC:3.5.2.2]
 xref: EC:3.5.2.2
 xref: MetaCyc:DIHYDROPYRIMIDINASE-RXN
-xref: Reactome:R-HSA-73589 "conversion of 5,6-dihydrouracil to 3-ureidopropionate"
-xref: Reactome:R-HSA-73618 "conversion of 5,6-Dihydrothymine to 3-Ureidoisobutyrate"
+xref: Reactome:R-HSA-73589 "5,6-dihydrouracil + H2O => beta-ureidopropionate"
+xref: Reactome:R-HSA-73618 "5,6-dihydrothymine + H2O => beta-ureidoisobutyrate"
 xref: RHEA:16121
 is_a: GO:0016812 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amides
 property_value: skos:exactMatch EC:3.5.2.2
@@ -40134,13 +40186,19 @@
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
@@ -40161,13 +40219,19 @@
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
 
@@ -40286,7 +40350,7 @@
 xref: EC:3.6.1.23
 xref: KEGG_REACTION:R02100
 xref: MetaCyc:DUTP-PYROP-RXN
-xref: Reactome:R-HSA-73666 "hydrolysis of  2'-deoxyuridine 5'-triphosphate to form  2'-deoxyuridine 5'-phosphate"
+xref: Reactome:R-HSA-73666 "dUTP + H2O => dUMP + pyrophosphate"
 xref: RHEA:10248
 is_a: GO:0047429 ! nucleoside triphosphate diphosphatase activity
 property_value: skos:exactMatch EC:3.6.1.23
@@ -40464,7 +40528,6 @@
 xref: Reactome:R-HSA-9934893 "Proteolysis of K48polyUb-K,p-S-PER1,2,3"
 xref: Reactome:R-HSA-9949676 "The proteasome degrades the alanine-tailed K48-polyUb nascent peptide bound to LTN1:NEMF:TCF25:VCP hexamer"
 xref: Reactome:R-HSA-9954728 "The proteasome degrades the K48-polyubiquitinated alanine-tailed nascent peptide"
-xref: Reactome:R-HSA-9958874 "26S proteasome degrades ubiquitinated RAC1, CDC42"
 is_a: GO:0008233 ! peptidase activity
 property_value: skos:narrowMatch EC:3.4.99.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25813" xsd:anyURI
@@ -40681,7 +40744,7 @@
 xref: EC:3.4.16.6
 xref: MetaCyc:3.4.16.2-RXN
 xref: MetaCyc:3.4.16.5-RXN
-xref: Reactome:R-HSA-9857945 "prekallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1-> kallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1 (PRCP catalyst)"
+xref: Reactome:R-HSA-158251 "prekallikrein:kininogen:C1q binding protein tetramer -> kallikrein:kininogen:C1q binding protein tetramer"
 is_a: GO:0004180 ! carboxypeptidase activity
 is_a: GO:0070008 ! serine-type exopeptidase activity
 property_value: skos:exactMatch EC:3.4.16.-
@@ -41504,7 +41567,6 @@
 xref: Reactome:R-HSA-9840532 "OMA1 self-cleaves"
 xref: Reactome:R-HSA-9840564 "OMA1 hydrolyzes YME1L1"
 xref: Reactome:R-HSA-9844241 "ADAMTS13 cleaves VWF variant multimer"
-xref: Reactome:R-HSA-9934645 "ADAMTS13 cleaves VWF multimer bound to FVIII"
 is_a: GO:0004175 ! endopeptidase activity
 is_a: GO:0008237 ! metallopeptidase activity
 property_value: skos:exactMatch EC:3.4.24.-
@@ -41982,9 +42044,12 @@
 xref: Reactome:R-HSA-140664 "prothrombin -> activated thrombin (factor IIa) + thrombin activation peptide (prothrombinase catalyst)"
 xref: Reactome:R-HSA-140696 "factor V -> factor Va + factor V activation peptide (thrombin catalyst)"
 xref: Reactome:R-HSA-140700 "prothrombin -> activated thrombin (factor IIa) + thrombin activation peptide (Xa catalyst)"
+xref: Reactome:R-HSA-140736 "factor X -> factor Xa + factor X activation peptide (TF:F7a catalyst)"
 xref: Reactome:R-HSA-140769 "factor VII -> factor VIIa"
+xref: Reactome:R-HSA-140777 "factor X -> factor Xa + factor X activation peptide (TF:F7 catalyst)"
+xref: Reactome:R-HSA-140823 "factor IX -> factor IXa + factor IX activation peptide (TF:F7a catalyst)"
 xref: Reactome:R-HSA-140840 "fibrinogen -> fibrin monomer + 2 fibrinopeptide A + 2 fibrinopeptide B"
-xref: Reactome:R-HSA-140870 "thrombin:antithrombin III:heparan sulfate -> thrombin:cleaved antithrombin III:heparan sulfate"
+xref: Reactome:R-HSA-140870 "thrombin:antithrombin III:heparin -> thrombin:cleaved antithrombin III:heparin"
 xref: Reactome:R-HSA-141026 "Activated protein C cleaves factor Va to factor Vi intermediate form"
 xref: Reactome:R-HSA-141040 "Activated thrombin:thrombomodulin cleaves PROCR:Protein C to PROCR:Activated protein C"
 xref: Reactome:R-HSA-1454843 "E-cadherin degradation by MMP3, MMP7 and plasmin"
@@ -41995,6 +42060,7 @@
 xref: Reactome:R-HSA-158137 "factor VIII:von Willibrand factor multimer -> factor VIIIa + factor VIIIa B A3 acidic polypeptide + von Willibrand factor multimer"
 xref: Reactome:R-HSA-158164 "factor X -> factor Xa + factor X activation peptide (VIIIa:IXa catalyst)"
 xref: Reactome:R-HSA-158300 "factor XI:platelet glycoprotein (GP) Ib:IX:V complex -> factor XIa:platelet glycoprotein (GP) Ib:IX:V complex (XIIa catalyst)"
+xref: Reactome:R-HSA-158311 "kallikrein:kininogen:C1q binding protein tetramer -> kallikrein + activated kininogen:C1q binding protein tetramer + bradykinin"
 xref: Reactome:R-HSA-158313 "factor XII -> factor XIIa"
 xref: Reactome:R-HSA-158333 "factor IX -> factor IXa + factor IX activation peptide (factor XIa catalyst)"
 xref: Reactome:R-HSA-158419 "factor XI:platelet glycoprotein (GP) Ib:IX:V complex -> factor XIa:platelet glycoprotein (GP) Ib:IX:V complex (thrombin catalyst)"
@@ -42128,15 +42194,12 @@
 xref: Reactome:R-HSA-9033530 "TYSND1 cleaves HSD17B4"
 xref: Reactome:R-HSA-9653249 "Cleavage of factor XII variant by activated thrombin"
 xref: Reactome:R-HSA-9655046 "Cleavage of FXII variant by KLKB1"
-xref: Reactome:R-HSA-9655840 "FXIIa is cleaved to -FXIIa"
-xref: Reactome:R-HSA-9655850 "prekallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1-> kallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1 (FXIIa catalyst)"
 xref: Reactome:R-HSA-9662786 "FURIN cleaves ADAM17"
 xref: Reactome:R-HSA-9666383 "F8 variant is not cleaved by thrombin"
 xref: Reactome:R-HSA-9668253 "Hyperactivation of factor X by FVIIIa:FIXa R384L"
 xref: Reactome:R-HSA-9668365 "FVIIIa variant:FIXa does not convert FX to the active FXa"
 xref: Reactome:R-HSA-9670874 "FIXa variant:FVIIIa does not convert FX to the active FXa"
 xref: Reactome:R-HSA-9673223 "FIX(29-461) variant is not activated (factor XIa catalyst)"
-xref: Reactome:R-HSA-9678434 "factor X -> factor Xa + factor X activation peptide (emicizumab:FIXa catalyst)"
 xref: Reactome:R-HSA-9686710 "Cleavage of S protein into S1:S2"
 xref: Reactome:R-HSA-9686731 "TMPRSS2 Mediated SARS-CoV-1 Spike Protein Cleavage and Endocytosis"
 xref: Reactome:R-HSA-9694287 "Cleavage of S protein into S1:S2"
@@ -42147,24 +42210,16 @@
 xref: Reactome:R-HSA-9710106 "ELANE cleaves GSDMD"
 xref: Reactome:R-HSA-9710263 "GZMB cleaves GSDME"
 xref: Reactome:R-HSA-976743 "Factor I inactivates plasma Factor H-bound C3b"
-xref: Reactome:R-HSA-9769737 "factor V -> factor Va intermediate + factor V activation peptide (FXa catalyst)"
 xref: Reactome:R-HSA-9769949 "FURIN Mediated SARS-CoV-2 Spike Protein Cleavage"
 xref: Reactome:R-HSA-9770187 "S2 Cleavage by TMPRSS2 Exposes S2' Initiating Cell-Cell Fusion"
 xref: Reactome:R-HSA-977371 "Factor I inactivates Factor H-boundC3b"
 xref: Reactome:R-HSA-977615 "Factor I inactivates MCP/CR1-bound C4b/C3b"
 xref: Reactome:R-HSA-9816275 "CDH1 is proteolytically cleaved in Golgi"
-xref: Reactome:R-HSA-9822513 "TF:FVII+FX -> TF:FVII:FXa + FX activation peptide (TF:F7 catalyst)"
-xref: Reactome:R-HSA-9822514 "TF:FVIIa+FX -> TF:FVIIa:FXa + FX activation peptide (TF:F7a catalyst)"
-xref: Reactome:R-HSA-9822522 "factor VIII -> factor VIIIa + factor VIII B chain+ factor VIII A3 acidic polypeptide +VWF multimer (TF:FVIIa:FXa catalyst)"
 xref: Reactome:R-HSA-9829030 "Nascent F signal peptide is cleaved at ER membrane"
 xref: Reactome:R-HSA-9829200 "F0 is cleaved, releasing F1, F2, F(110-136)"
 xref: Reactome:R-HSA-9830805 "Nascent sG localizes to ER lumen, gets glycosylated"
 xref: Reactome:R-HSA-9830882 "Nascent G signal peptide is cleaved at ER membrane"
 xref: Reactome:R-HSA-9839367 "TGFBR3_mem cleavage by MMPs"
-xref: Reactome:R-HSA-9855735 "factor XII:polyanionic activator -> factor XIIa + polyanionic activator (autocatalysis)"
-xref: Reactome:R-HSA-9857814 "prekallikrein:kininogen:cell surface receptor:factor XII -> factor XIIa + prekallikrein:kininogen:cell surface receptor (FXII autocatalysis on the cell surface)"
-xref: Reactome:R-HSA-9909046 "kallikrein:kininogen:cell surface receptor:factor XII -> kallikrein:kininogen:cell surface receptor + factor XIIa (kallikrein catalyst)"
-xref: Reactome:R-HSA-9909048 "prekallikrein:kininogen:cell surface receptor:factor XII -> kallikrein:kininogen:cell surface receptor:factor XII (FXII catalyst)"
 xref: Reactome:R-HSA-9911236 "ELANE cleaves NOTCH2NLA"
 xref: Reactome:R-HSA-9911383 "LepB cleaves prepro-STa"
 xref: Reactome:R-HSA-9912368 "LepB cleaves pre-EltA"
@@ -42185,17 +42240,7 @@
 xref: Reactome:R-HSA-9926936 "EspC(54-1018) cleaves hemoglobin"
 xref: Reactome:R-HSA-9926963 "Hbp cis-autocleaves"
 xref: Reactome:R-HSA-9927009 "Hbp(53-1100) cleaves hemoglobin"
-xref: Reactome:R-HSA-9929051 "TF:FVIIa+FIX -> TF:FVIIa:FIXa + FIX activation peptide (TF:F7a catalyst)"
-xref: Reactome:R-HSA-9929060 "TF:FVII:FXa ->TF:FVIIa:FXa (FXa catalyst)"
-xref: Reactome:R-HSA-9930440 "F5 R334T, I387T is not cleaved by activated protein C"
-xref: Reactome:R-HSA-9930452 "F5 R534Q, A540V is not cleaved by activated protein C"
-xref: Reactome:R-HSA-9930790 "factor V -> factor Va intermediate + factor V activation peptide (thrombin catalyst)"
-xref: Reactome:R-HSA-9930792 "factor Va intermediate  -> factor Va"
 xref: Reactome:R-HSA-9932162 "Removal of CDH1 signal peptide"
-xref: Reactome:R-HSA-9936430 "factor XI:kininogen:GPIb:IX:V complex -> factor XIa:kininogen:GPIb:IX:V complex (XIIa catalyst)"
-xref: Reactome:R-HSA-9936467 "factor IX -> factor IXa + factor IX activation peptide (kallikrein catalyst)"
-xref: Reactome:R-HSA-9936906 "factor XII:-amyloid:Zn2+-> factor XIIa + -amyloid:Zn2+ (autocatalysis)"
-xref: Reactome:R-HSA-9938539 "kallikrein:kininogen:cell surface receptor -> kallikrein + cleaved kininogen:cell surface receptor + bradykinin"
 xref: Reactome:R-HSA-9947496 "ACOT2 cleaves NS345"
 is_a: GO:0004175 ! endopeptidase activity
 is_a: GO:0008236 ! serine-type peptidase activity
@@ -42701,13 +42746,13 @@
 xref: EC:4.2.1.17
 xref: Reactome:R-HSA-70830 "tiglyl-CoA + H2O <=> alpha-methyl-beta-hydroxybutyryl-CoA"
 xref: Reactome:R-HSA-70870 "ECHS1 hydrates methacrylyl-CoA"
-xref: Reactome:R-HSA-77256 "2-trans-Dodecenoyl-CoA+H2O =>( S)-3-Hydroxydodecanoyl-CoA"
-xref: Reactome:R-HSA-77277 "trans-Tetradec-2-enoyl-CoA+H2O => (S)-3-Hydroxytetradecanoyl-CoA"
-xref: Reactome:R-HSA-77301 "trans-Hexadec-2-enoyl-CoA+H2O => (S)-3-Hydroxyhexadecanoyl-CoA"
-xref: Reactome:R-HSA-77314 "Crotonoyl-CoA+H2O => (S)-3-Hydroxybutanoyl-CoA"
+xref: Reactome:R-HSA-77256 "2-trans-Dodecenoyl-CoA+H2O<=>(S)-3-Hydroxydodecanoyl-CoA"
+xref: Reactome:R-HSA-77277 "trans-Tetradec-2-enoyl-CoA+H2O<=>(S)-3-Hydroxytetradecanoyl-CoA"
+xref: Reactome:R-HSA-77301 "trans-Hexadec-2-enoyl-CoA+H2O<=>(S)-3-Hydroxyhexadecanoyl-CoA"
+xref: Reactome:R-HSA-77314 "Crotonoyl-CoA+H2O<=>(S)-3-Hydroxybutanoyl-CoA"
 xref: Reactome:R-HSA-77325 "trans-Hex-2-enoyl-CoA+H2O<=>(S)-Hydroxyhexanoyl-CoA"
-xref: Reactome:R-HSA-77333 "trans-Oct-2-enoyl-CoA+H2O => (S)-Hydroxyoctanoyl-CoA"
-xref: Reactome:R-HSA-77344 "trans-Dec-2-enoyl-CoA+H2O => (S)-Hydroxydecanoyl-CoA"
+xref: Reactome:R-HSA-77333 "trans-Oct-2-enoyl-CoA+H2O<=>(S)-Hydroxyoctanoyl-CoA"
+xref: Reactome:R-HSA-77344 "trans-Dec-2-enoyl-CoA+H2O<=>(S)-Hydroxydecanoyl-CoA"
 xref: Reactome:R-HSA-9916717 "ECHS1 mutants don't synthesize beta-hydroxyisobutyryl-CoA"
 xref: RHEA:20724
 is_a: GO:0016836 ! hydro-lyase activity
@@ -45032,8 +45077,6 @@
 xref: Reactome:R-HSA-427514 "eNoSC deacetylates histone H3"
 xref: Reactome:R-HSA-433672 "NoRC:HDAC:DNMT deacetylates histone H4 and methylates histone H3"
 xref: Reactome:R-HSA-6805650 "MTA2-NuRD complex deacetylates TP53"
-xref: Reactome:R-HSA-9941704 "NuRD deacetylates telomeric nucleosomes"
-xref: Reactome:R-HSA-9944092 "NuRD deacetylates nucleosomes"
 is_a: GO:0033558 ! protein lysine deacetylase activity
 is_a: GO:0140993 ! histone modifying activity
 property_value: skos:broadMatch EC:2.3.1.-
@@ -45640,11 +45683,13 @@
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
@@ -47036,7 +47081,6 @@
 xref: Reactome:R-HSA-9915992 "Arachidonate is hydroxylated to 17-HETE by CYP(1)"
 xref: Reactome:R-HSA-9915993 "Arachidonate is hydroxylated to 18-HETE by CYP(1)"
 xref: Reactome:R-HSA-9915997 "Arachidonate is epoxidated to 14,15-EET by CYP(5)"
-xref: Reactome:R-HSA-9971246 "Unknown CYP 450 omega-hydroxylates C10 fatty acid"
 is_a: GO:0016491 ! oxidoreductase activity
 property_value: skos:broadMatch EC:1.-.-.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30165" xsd:anyURI
@@ -47065,7 +47109,7 @@
 xref: Reactome:R-HSA-5602186 "Defective CYP27B1 does not hydroxylate CDL"
 xref: RHEA:20573
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.15.18
 property_value: skos:exactMatch RHEA:20573
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -47301,6 +47345,7 @@
 xref: RHEA:46104
 xref: RHEA:84067
 xref: RHEA:84071
+xref: RHEA:86455
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.15.4
@@ -47309,6 +47354,7 @@
 property_value: skos:narrowMatch RHEA:46104
 property_value: skos:narrowMatch RHEA:84067
 property_value: skos:narrowMatch RHEA:84071
+property_value: skos:narrowMatch RHEA:86455
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -47345,6 +47391,8 @@
 xref: RHEA:50244
 xref: RHEA:65760
 xref: RHEA:84243
+xref: RHEA:84247
+xref: RHEA:84251
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.19
@@ -47357,6 +47405,8 @@
 property_value: skos:narrowMatch RHEA:50236
 property_value: skos:narrowMatch RHEA:50244
 property_value: skos:narrowMatch RHEA:84243
+property_value: skos:narrowMatch RHEA:84247
+property_value: skos:narrowMatch RHEA:84251
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27671" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29041" xsd:anyURI
@@ -47568,6 +47618,7 @@
 xref: Reactome:R-HSA-5358518 "MLH1:PMS2 makes single strand incision near 1-2 base mismatch"
 xref: Reactome:R-HSA-5690990 "5'- incision of DNA by ERCC1:ERCC4 in GG-NER"
 xref: Reactome:R-HSA-5693533 "DCLRE1C (ARTEMIS) processes DNA DSB ends"
+xref: Reactome:R-HSA-72180 "Cleavage of mRNA at the 3'-end"
 xref: Reactome:R-HSA-9970193 "CPSF3 cleaves pre-mRNA at distal 3'UTR PAS"
 xref: Reactome:R-HSA-9970282 "U1 snRNP suppresses CPSF3-mediated pre-mRNA cleavage at intronic PAS"
 xref: Reactome:R-HSA-9970294 "CPSF3 cleaves pre-mRNA at proximal 3'UTR PAS"
@@ -47945,8 +47996,7 @@
 xref: Reactome:R-HSA-482621 "(d)NTP + ADP <=> (d)NDP + ATP (NME1,2,3)"
 xref: Reactome:R-HSA-482804 "(d)NDP + ATP <=> (d)NTP + ADP (NME4)"
 xref: Reactome:R-HSA-482812 "(d)NTP + ADP <=> (d)NDP + ATP (NME4)"
-xref: Reactome:R-HSA-6806877 "NME1:NME3 heterohexamer phosphorylates NDPs to NTPs"
-xref: Reactome:R-HSA-9605496 "NME6 phosphorylates (d)NDPs to (d)NTPs"
+xref: Reactome:R-HSA-6806877 "NME1:NME3 heterohexamer, NME2P1 phosphorylate NDPs to NTPs"
 xref: Reactome:R-HSA-9748969 "NME1:2 hexamer phosphorylates 6TdGDP to 6TdGTP"
 xref: Reactome:R-HSA-9748999 "NME1:2 hexamer phosphorylates 6TGDP to 6TGTP"
 xref: Reactome:R-HSA-9755013 "NME1,2 hexamers phosphorylate RBV-DP"
@@ -49562,8 +49612,6 @@
 xref: MetaCyc:PHOSPHOLIPASE-A2-RXN
 xref: MetaCyc:RXN-15065
 xref: MetaCyc:RXN-15067
-xref: Reactome:R-HSA-111881 "Phospho-cPLA2 translocates to membranes when intracellular calcium levels increase"
-xref: Reactome:R-HSA-111883 "PLA2G4A (cPLA2) hydrolyzes phosphatidylcholine"
 xref: Reactome:R-HSA-1482604 "PA is hydrolyzed to 1-acyl LPA by PLA2[1] (OM)"
 xref: Reactome:R-HSA-1482656 "PA is hydrolysed to 1-acyl LPA by PLA2[1]"
 xref: Reactome:R-HSA-1482679 "PA is hydrolysed to 1-acyl LPA by PLA2G2A"
@@ -49589,7 +49637,6 @@
 xref: Reactome:R-HSA-1602417 "PC is hydrolyzed to 1-acyl LPC by PLA2[16]"
 xref: Reactome:R-HSA-1602446 "PA is hydrolyzed to 1-acyl LPA by PLA2[15]"
 xref: Reactome:R-HSA-8848484 "PLA2s hydrolyze phospholipids at the Golgi membrane"
-xref: Reactome:R-HSA-8952251 "PLA2G15 hydrolyses LPC to GPCho and LCFA(-)"
 xref: RHEA:15801
 xref: RHEA:38779
 xref: RHEA:38847
@@ -49606,6 +49653,7 @@
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
 property_value: skos:exactMatch EC:3.1.1.4
 property_value: skos:narrowMatch MetaCyc:RXN-15065
+property_value: skos:narrowMatch MetaCyc:RXN-15067
 property_value: skos:narrowMatch RHEA:15801
 property_value: skos:narrowMatch RHEA:38779
 property_value: skos:narrowMatch RHEA:38847
@@ -50659,7 +50707,7 @@
 xref: Reactome:R-HSA-163418 "perilipin + 2 ATP -> phosphorylated perilipin + 2 ADP"
 xref: Reactome:R-HSA-1638803 "Phosphorylation of cohesin by PLK1 at centromeres"
 xref: Reactome:R-HSA-164151 "LKB1 phosphorylates the alpha subunit of AMPK heterotrimer"
-xref: Reactome:R-HSA-165162 "Phosphorylation of TSC2 by AKT (PKB)"
+xref: Reactome:R-HSA-165162 "Phosphorylation of TSC2 by PKB"
 xref: Reactome:R-HSA-165182 "Phosphorylation of complexed TSC2 by PKB"
 xref: Reactome:R-HSA-165692 "Phosphorylation of 4E-BP1 by activated mTORC1"
 xref: Reactome:R-HSA-165718 "mTORC1 phosphorylation of RPS6KB1 (S6K)"
@@ -50705,7 +50753,7 @@
 xref: Reactome:R-HSA-198611 "AKT phosphorylates IKKalpha"
 xref: Reactome:R-HSA-198613 "AKT phosphorylates p21Cip1 and p27Kip1"
 xref: Reactome:R-HSA-198621 "AKT phosphorylates caspase-9"
-xref: Reactome:R-HSA-198640 "mTORC2 phosphorylates AKT at S473"
+xref: Reactome:R-HSA-198640 "TORC2 (mTOR) phosphorylates AKT at S473"
 xref: Reactome:R-HSA-198669 "p38MAPK phosphorylates MSK1"
 xref: Reactome:R-HSA-198731 "ERK1/2 activates ELK1"
 xref: Reactome:R-HSA-198746 "ERK1/2/5 activate RSK1/2/3"
@@ -50807,7 +50855,7 @@
 xref: Reactome:R-HSA-349455 "Phosphorylation of MDM4 by ATM"
 xref: Reactome:R-HSA-374696 "Phosphorylation of L1 by p90rsk"
 xref: Reactome:R-HSA-3769394 "AKT phosphorylates CBY1"
-xref: Reactome:R-HSA-377186 "Activated AKT phosphorylates AKT1S1 (PRAS40)"
+xref: Reactome:R-HSA-377186 "Activated Akt1 phosphorylates AKT1S1 (PRAS40)"
 xref: Reactome:R-HSA-3772435 "WNT signaling stimulates CSNK1-dependent phosphorylation of DVL"
 xref: Reactome:R-HSA-380272 "Plk1-mediated phosphorylation of Nlp"
 xref: Reactome:R-HSA-381091 "IRE1 dimer autophosphorylates"
@@ -50954,7 +51002,7 @@
 xref: Reactome:R-HSA-5693609 "ATM phosphorylates TP53 at S15"
 xref: Reactome:R-HSA-5694441 "CSNK1D phosphorylates SEC23"
 xref: Reactome:R-HSA-6788392 "ATR phosphorylates RPA2, FANCI, FANCD2 and FANCM at ICL-DNA"
-xref: Reactome:R-HSA-6795290 "mTORC2 phosphorylates SGK1"
+xref: Reactome:R-HSA-6795290 "TORC2 complex phosphorylates SGK1"
 xref: Reactome:R-HSA-6795460 "SGK1 phosphorylates MDM2"
 xref: Reactome:R-HSA-6795473 "PDPK1 phosphorylates SGK1"
 xref: Reactome:R-HSA-6798372 "ATM phosphorylates DYRK2"
@@ -51155,7 +51203,6 @@
 xref: Reactome:R-HSA-9943687 "PLK3 phosphorylates CDC25A"
 xref: Reactome:R-HSA-9943736 "Casein kinase I phosphorylates CDC25A"
 xref: Reactome:R-HSA-9954237 "PIM1 phosphorylates GBP1"
-xref: Reactome:R-HSA-9975250 "PGK1 phosphorylates AKT1S1"
 is_a: GO:0004672 ! protein kinase activity
 property_value: skos:exactMatch EC:2.7.11.-
 property_value: skos:exactMatch MetaCyc:PROTEIN-KINASE-RXN
@@ -52271,9 +52318,6 @@
 xref: Reactome:R-HSA-9865196 "p-Y393-ABL1 phosphorylates tyrosine-407 of YAP1"
 xref: Reactome:R-HSA-9931290 "IL6-activated JAK1 phosphorylates CD274"
 xref: Reactome:R-HSA-9934751 "CDH1 is phosphorylated on tyrosine residues"
-xref: Reactome:R-HSA-9958871 "Tyrosine phosphorylation of STAT3 by IL6 receptor"
-xref: Reactome:R-HSA-9958889 "SRC phosphorylates CDH1"
-xref: Reactome:R-HSA-9958892 "SRC promotes RAC1 and CDC42 activation by phosphorylating RAC1 and CDC42 GEFs"
 xref: RHEA:10596
 is_a: GO:0004672 ! protein kinase activity
 property_value: skos:exactMatch EC:2.7.10.-
@@ -52744,8 +52788,8 @@
 synonym: "purine-nucleoside:phosphate ribosyltransferase activity" RELATED [EC:2.4.2.1]
 xref: EC:2.4.2.1
 xref: MetaCyc:PNP-RXN
-xref: Reactome:R-HSA-112033 "PNP catalyzes the conversion of hypoxanthine and (deoxy)ribose-1-phosphate to (deoxy)inosine"
-xref: Reactome:R-HSA-112034 "PNP catalyzes the conversion of guanine and (deoxy)ribose-1-phosphate to (deoxy)guanosine"
+xref: Reactome:R-HSA-112033 "PNP catalyzes the conversion of hypoxanthine and (deoxy)ribose to (deoxy)inosine"
+xref: Reactome:R-HSA-112034 "PNP catalyzes the conversion of guanine and (deoxy)ribose to (deoxy)guanosine"
 xref: Reactome:R-HSA-74242 "PNP catalyzes the conversion of (deoxy)inosine to hypoxanthine and (deoxy)ribose"
 xref: Reactome:R-HSA-74249 "PNP catalyzes the conversion of (deoxy)guanosine to guanine and (deoxy)ribose"
 xref: Reactome:R-HSA-9735775 "Defective PNP does not convert (deoxy)inosine to hypoxanthine and (deoxy)ribose"
@@ -53428,7 +53472,6 @@
 xref: Reactome:R-HSA-1606288 "SMPD4 hydrolyzes sphingomyelin (ER membrane)"
 xref: Reactome:R-HSA-1640164 "ENPP7 hydrolyzes sphingomyelin"
 xref: Reactome:R-HSA-193706 "Production of ceramide which can activate JNK and other targets"
-xref: Reactome:R-HSA-9769742 "SMPD1 converts sphingomyelin to ceramide"
 xref: RHEA:19253
 xref: RHEA:45324
 xref: RHEA:54284
@@ -53935,7 +53978,7 @@
 xref: MetaCyc:THIOREDOXIN-REDUCT-NADPH-RXN
 xref: Reactome:R-HSA-1222485 "TrxB reactivates TrxA"
 xref: Reactome:R-HSA-3323050 "TXNRD2 catalyzes the reduction of TXN2 by NADPH"
-xref: Reactome:R-HSA-73646 "Regeneration of active (reduced) Thioredoxin"
+xref: Reactome:R-HSA-73646 "thioredoxin, oxidized + NADPH + H+ => thioredoxin, reduced + NADP+"
 xref: Reactome:R-HSA-9617735 "TXN disrupts FOXO4 complex with EP300"
 xref: RHEA:20345
 is_a: GO:0016209 ! antioxidant activity
@@ -54105,7 +54148,7 @@
 xref: EC:2.1.1.45
 xref: KEGG_REACTION:R02101
 xref: MetaCyc:THYMIDYLATESYN-RXN
-xref: Reactome:R-HSA-73605 "conversion of dUMP to dTMP"
+xref: Reactome:R-HSA-73605 "dUMP + N5,N10-methylene tetrahydrofolate => TMP + dihydrofolate"
 xref: RHEA:12104
 is_a: GO:0042083 ! 5,10-methylenetetrahydrofolate-dependent methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.45
@@ -54290,7 +54333,12 @@
 xref: RHEA:40047
 xref: RHEA:40055
 xref: RHEA:40475
+xref: RHEA:40611
+xref: RHEA:40615
+xref: RHEA:40619
+xref: RHEA:40623
 xref: RHEA:40627
+xref: RHEA:40631
 xref: RHEA:43732
 xref: RHEA:44864
 xref: RHEA:47864
@@ -54328,7 +54376,12 @@
 property_value: skos:narrowMatch RHEA:40047
 property_value: skos:narrowMatch RHEA:40055
 property_value: skos:narrowMatch RHEA:40475
+property_value: skos:narrowMatch RHEA:40611
+property_value: skos:narrowMatch RHEA:40615
+property_value: skos:narrowMatch RHEA:40619
+property_value: skos:narrowMatch RHEA:40623
 property_value: skos:narrowMatch RHEA:40627
+property_value: skos:narrowMatch RHEA:40631
 property_value: skos:narrowMatch RHEA:43732
 property_value: skos:narrowMatch RHEA:44864
 property_value: skos:narrowMatch RHEA:47864
@@ -55212,7 +55265,6 @@
 xref: Reactome:R-HSA-9948301 "ZNF598 K63 polyubiquitinates RPS10 (eS10) and RPS20 (uS10) of the 40S ribosomal subunit"
 xref: Reactome:R-HSA-9954721 "NEDD8-K699-CUL2:ELOB:ELOC:RBX1:KLHDC10 K48 polyubiquitinates alanine-tailed nascent peptide"
 xref: Reactome:R-HSA-9955146 "S.flexneri ipaH9.8 ubiquitinates GBPs"
-xref: Reactome:R-HSA-9958873 "Cell-to-cell contact through homophilic cadherin interactions inhibits RAC1/CDC42 ubiquitination"
 xref: Reactome:R-HSA-9970191 "RBBP6 activates CPSF complex"
 is_a: GO:0019787 ! ubiquitin-like protein transferase activity
 
@@ -55687,7 +55739,6 @@
 xref: Reactome:R-HSA-158893 "alpha-2-antiplasmin + plasmin -> alpha-2-antiplasmin:plasmin"
 xref: Reactome:R-HSA-159001 "urokinase plasminogen activator (two-chain):uPAR + plasminogen activator inhibitor 2 (PAI-2) -> PAI-2:urokinase plasminogen activator (two-chain):uPAR"
 xref: Reactome:R-HSA-159005 "urokinase plasminogen activator (two-chain):uPAR + plasminogen activator inhibitor 1 (PAI-1) -> PAI-1:urokinase plasminogen activator (two-chain):uPAR"
-xref: Reactome:R-HSA-9823284 "FXa binds SERPINC1:HS"
 is_a: GO:0004866 ! endopeptidase inhibitor activity
 relationship: negatively_regulates GO:0004252 ! serine-type endopeptidase activity
 
@@ -57367,11 +57418,14 @@
 
 [Term]
 id: GO:0005046
-name: KDEL sequence binding
+name: obsolete KDEL sequence binding
 namespace: molecular_function
-def: "Binding to a KDEL sequence, the C terminus tetrapeptide sequence Lys-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [GOC:ai]
+def: "OBSOLETE. Binding to a KDEL sequence, the C terminus tetrapeptide sequence Lys-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [GOC:ai]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "KDEL receptor activity" NARROW []
-is_a: GO:0046923 ! ER lumen protein retrieval receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046923
 
 [Term]
 id: GO:0005047
@@ -57402,6 +57456,7 @@
 namespace: molecular_function
 alt_id: GO:0008262
 def: "Combining with a nuclear export signal (NES) on a cargo to be transported, to mediate transport of a the cargo through the nuclear pore, from the nuclear lumen to the cytoplasm. The cargo can be either a RNA or a protein." [GOC:bf, GOC:mah, GOC:pg, GOC:vw, PMID:11743003, PMID:25802992, PMID:28713609, Wikipedia:Nuclear_transport]
+comment: This term should not be used for direct annotation. Use  either nuclear export signal receptor activity or nuclear import signal receptor activity.
 synonym: "exportin activity" RELATED []
 synonym: "importin-alpha binding" RELATED []
 synonym: "importin-alpha export receptor activity" NARROW [GO:0008262]
@@ -57426,29 +57481,35 @@
 
 [Term]
 id: GO:0005052
-name: peroxisome matrix targeting signal-1 binding
+name: obsolete peroxisome matrix targeting signal-1 binding
 namespace: molecular_function
-def: "Binding to a type 1 peroxisome targeting signal, a tripeptide with the consensus sequence (S/A/C)-(K/R/H)-L." [GOC:mah, PMID:11687502]
+def: "OBSOLETE. Binding to a type 1 peroxisome targeting signal, a tripeptide with the consensus sequence (S/A/C)-(K/R/H)-L." [GOC:mah, PMID:11687502]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "peroxisomal targeting signal 1 (PTS1) binding" EXACT [PMID:14709540]
 synonym: "peroxisome targeting signal-1 binding" EXACT []
 synonym: "peroxisome targeting signal-1 receptor" NARROW []
 synonym: "PEX5" NARROW []
 synonym: "PTS1 binding" EXACT [PMID:14709540]
 synonym: "PTS1 receptor" NARROW []
-is_a: GO:0000268 ! peroxisome signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000268
 
 [Term]
 id: GO:0005053
-name: peroxisome matrix targeting signal-2 binding
+name: obsolete peroxisome matrix targeting signal-2 binding
 namespace: molecular_function
-def: "Binding to a type 2 peroxisome targeting signal, a nonapeptide with a broad consensus sequence of (R/K)-(L/V/I)-(XXXXX)-(H/Q)-(L/A/F)." [GOC:mah, PMID:11687502]
+def: "OBSOLETE. Binding to a type 2 peroxisome targeting signal, a nonapeptide with a broad consensus sequence of (R/K)-(L/V/I)-(XXXXX)-(H/Q)-(L/A/F)." [GOC:mah, PMID:11687502]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "peroxisomal targeting signal 2 (PTS2) binding" EXACT [PMID:14709540]
 synonym: "peroxisome targeting signal-2 binding" EXACT []
 synonym: "peroxisome targeting signal-2 receptor" NARROW []
 synonym: "PEX7" NARROW []
 synonym: "PTS2 binding" EXACT [PMID:14709540]
 synonym: "PTS2 receptor" EXACT []
-is_a: GO:0000268 ! peroxisome signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000268
 
 [Term]
 id: GO:0005054
@@ -57894,7 +57955,6 @@
 xref: Reactome:R-HSA-9695853 "FLT3 mutants:GRB2:SOS1-mediated nucleotide exchange on RAS"
 xref: Reactome:R-HSA-9703441 "SOS1-mediated nucleotide exchange of RAS downstream of FLT3 fusion mutants"
 xref: Reactome:R-HSA-9751201 "p-VAV1,2,3 exchange 6TGTP for GDP on RAC1"
-xref: Reactome:R-HSA-9970163 "SRC-phosphorylated RAC1,(CDC42) GEFs activate RAC1,(CDC42)"
 is_a: GO:0030695 ! GTPase regulator activity
 relationship: negatively_regulates GO:0019003 ! GDP binding
 relationship: positively_regulates GO:0005525 ! GTP binding
@@ -60063,6 +60123,8 @@
 xref: RHEA:45256
 xref: RHEA:45264
 xref: RHEA:71395
+xref: RHEA:86475
+xref: RHEA:86483
 is_a: GO:0015245 ! fatty acid transmembrane transporter activity
 relationship: part_of GO:0015909 ! long-chain fatty acid transport
 property_value: skos:exactMatch RHEA:39283
@@ -60072,6 +60134,8 @@
 property_value: skos:narrowMatch RHEA:45256
 property_value: skos:narrowMatch RHEA:45264
 property_value: skos:narrowMatch RHEA:71395
+property_value: skos:narrowMatch RHEA:86475
+property_value: skos:narrowMatch RHEA:86483
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14793" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26996" xsd:anyURI
@@ -60484,25 +60548,49 @@
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
@@ -60933,7 +61021,7 @@
 namespace: molecular_function
 def: "Enables the transfer of a GDP-fucose from one side of a membrane to the other. GDP-fucose is a substance composed of fucose in glycosidic linkage with guanosine diphosphate." [GOC:ai, GOC:mtg_transport, ISBN:0815340729]
 xref: Reactome:R-HSA-5653596 "Defective SLC35C1 does not transport UDP-Fuc from cytosol to Golgi lumen"
-xref: Reactome:R-HSA-742345 "SLC35C1 transports GDP-Fuc from cytosol to Golgi lumen"
+xref: Reactome:R-HSA-742345 "SLC35C1 transport GDP-Fuc from cytosol to Golgi lumen"
 is_a: GO:0036080 ! purine nucleotide-sugar transmembrane transporter activity
 relationship: part_of GO:0015783 ! GDP-fucose transmembrane transport
 
@@ -61058,7 +61146,6 @@
 synonym: "carnitine:acyl carnitine carrier activity" EXACT []
 synonym: "fatty acyl carnitine carrier" EXACT []
 xref: Reactome:R-HSA-200424 "Exchange of acylcarnitine and carnitine across the inner mitochondrial membrane"
-xref: Reactome:R-HSA-9971094 "SLC25A20 exports excess acyl-CAR"
 is_a: GO:0015226 ! carnitine transmembrane transporter activity
 is_a: GO:0015227 ! O-acyl-L-carnitine transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
@@ -61618,6 +61705,13 @@
 alt_id: GO:0008497
 def: "OBSOLETE. Enables the directed movement of phospholipids into, out of or within a cell, or between cells. Phospholipids are a class of lipids containing phosphoric acid as a mono- or diester." [GOC:ai, ISBN:0198506732]
 comment: This term was obsoleted because it refers to the substrate rather than to the transport mechanism as a primary classification.
+xref: Reactome:R-HSA-216757 "4xPALM-C-p-2S-ABCA1 tetramer transports PL from transport vesicle membrane to plasma membrane"
+xref: Reactome:R-HSA-382553 "ABCA7:Apo1A-mediated phospholipid efflux"
+xref: Reactome:R-HSA-5678706 "ABCB4 transports PC from plasma membrane to extracellular region"
+xref: Reactome:R-HSA-5678749 "Defective ABCB4 does not transport PC from plasma membrane to extracellular region"
+xref: Reactome:R-HSA-8857662 "ESYT1:ESYT2:ESYT3 transport GPL from plasma membrane to ER membrane"
+xref: Reactome:R-HSA-8865637 "MFSD2A transports LPC from extracellular region to plasma membrane"
+xref: Reactome:R-HSA-8867876 "OSBPL5,8,10 exchange PS with PI4P from ER membrane to plasma membrane"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31460" xsd:anyURI
 is_obsolete: true
@@ -66275,7 +66369,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -71288,6 +71381,7 @@
 def: "The addition of a methyl group to a protein amino acid. A methyl group is derived from methane by the removal of a hydrogen atom." [GOC:ai]
 subset: gocheck_obsoletion_candidate
 synonym: "protein amino acid methylation" EXACT [GOC:bf]
+xref: Reactome:R-HSA-8876725 "Protein methylation"
 is_a: GO:0008213 ! protein alkylation
 is_a: GO:0043414 ! macromolecule methylation
 
@@ -71878,7 +71972,7 @@
 xref: MetaCyc:PWY-8187
 xref: MetaCyc:PWY0-823
 is_a: GO:0006525 ! arginine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ARG-GLU-PWY
 property_value: skos:narrowMatch MetaCyc:ARG-PRO-PWY
@@ -71933,7 +72027,7 @@
 synonym: "asparagine degradation" EXACT []
 xref: MetaCyc:ASPARAGINE-DEG1-PWY
 xref: MetaCyc:PWY-4002
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARAGINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-4002
@@ -71976,8 +72070,8 @@
 xref: MetaCyc:PWY-8291
 xref: MetaCyc:PWY-8294
 is_a: GO:0006531 ! aspartate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ASPARTATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8291
@@ -72060,8 +72154,8 @@
 xref: MetaCyc:PWY-5766
 xref: MetaCyc:PWY0-1305
 is_a: GO:0006536 ! glutamate metabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMATE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTDEG-PWY
@@ -72100,7 +72194,6 @@
 xref: MetaCyc:PWY-8346
 is_a: GO:0006105 ! succinate metabolic process
 is_a: GO:0006536 ! glutamate metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:GLUDEG-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8346
@@ -72115,7 +72208,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving glutamine, 2-amino-4-carbamoylbutanoic acid." [GOC:ai]
 synonym: "glutamine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72145,7 +72237,7 @@
 xref: MetaCyc:GLUTAMINDEG-PWY
 xref: MetaCyc:GLUTAMINEFUM-PWY
 is_a: GO:0006541 ! L-glutamine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GLUTAMINDEG-PWY
 property_value: skos:narrowMatch MetaCyc:GLUTAMINEFUM-PWY
@@ -72232,9 +72324,9 @@
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
@@ -72271,7 +72363,6 @@
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ILEUDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5078
@@ -72287,7 +72378,6 @@
 synonym: "L-leucine metabolism" EXACT []
 synonym: "leucine metabolic process" BROAD []
 is_a: GO:0009081 ! branched-chain amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72308,7 +72398,6 @@
 xref: MetaCyc:PWY-8185
 is_a: GO:0006551 ! L-leucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LEU-DEG2-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5075
@@ -72355,7 +72444,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
 is_a: GO:0000096 ! sulfur amino acid metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 
@@ -72422,8 +72510,8 @@
 xref: MetaCyc:PWY-6318
 xref: MetaCyc:PWY-7158
 xref: MetaCyc:PWY-8014
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ANAPHENOXI-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5079
@@ -72440,7 +72528,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving proline (pyrrolidine-2-carboxylic acid), a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
 synonym: "proline metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72470,7 +72557,7 @@
 xref: MetaCyc:PWY-8186
 xref: Reactome:R-HSA-70688 "Proline catabolism"
 is_a: GO:0006560 ! L-proline metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PROUT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8186
@@ -72483,7 +72570,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving L-serine, the L-enantiomer of serine, i.e. (2S)-2-amino-3-hydroxypropanoic acid." [GOC:ai, GOC:jsg]
 synonym: "L-serine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
+xref: Reactome:R-HSA-977347 "Serine metabolism"
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72499,7 +72586,6 @@
 xref: MetaCyc:SERSYN-PWY
 is_a: GO:0006563 ! L-serine metabolic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-8011
 property_value: skos:narrowMatch MetaCyc:SERSYN-PWY
@@ -72515,7 +72601,7 @@
 synonym: "L-serine degradation" EXACT []
 xref: MetaCyc:SERDEG-PWY
 is_a: GO:0006563 ! L-serine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:exactMatch MetaCyc:SERDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
@@ -72530,7 +72616,6 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "threonine metabolism" EXACT []
 xref: UM-BBD_pathwayID:met
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
@@ -72546,10 +72631,9 @@
 xref: MetaCyc:PWY66-428
 xref: MetaCyc:THRDLCTCAT-PWY
 xref: MetaCyc:THREONINE-DEG2-PWY
-xref: Reactome:R-HSA-8849175 "Threonine catabolism"
 xref: UM-BBD_pathwayID:met
 is_a: GO:0006566 ! L-threonine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5436
 property_value: skos:narrowMatch MetaCyc:PWY-5437
@@ -72599,9 +72683,9 @@
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
@@ -72670,8 +72754,8 @@
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
 xref: UM-BBD_pathwayID:tyr
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009074 ! aromatic amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5151
 property_value: skos:narrowMatch MetaCyc:PWY-7514
@@ -72707,7 +72791,6 @@
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-5057
 property_value: skos:narrowMatch MetaCyc:PWY-8183
@@ -72936,7 +73019,7 @@
 synonym: "ornithine catabolism" EXACT []
 synonym: "ornithine degradation" EXACT []
 is_a: GO:0006591 ! ornithine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
@@ -72963,7 +73046,6 @@
 synonym: "polyamine synthesis" EXACT []
 xref: MetaCyc:POLYAMINSYN3-PWY
 xref: MetaCyc:POLYAMSYN-PWY
-xref: Reactome:R-HSA-350562 "Regulation of ornithine decarboxylase (ODC)"
 xref: Reactome:R-HSA-351200 "Interconversion of polyamines"
 is_a: GO:0006595 ! polyamine metabolic process
 is_a: GO:0042401 ! biogenic amine biosynthetic process
@@ -73329,6 +73411,7 @@
 synonym: "protein import into mitochondrion" EXACT []
 synonym: "protein targeting to mitochondria" EXACT []
 synonym: "protein-mitochondrial targeting" EXACT []
+xref: Reactome:R-HSA-1268020 "Mitochondrial protein import"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30349" xsd:anyURI
 is_obsolete: true
 replaced_by: GO:0070585
@@ -73758,9 +73841,10 @@
 xref: Reactome:R-HSA-1660514 "Synthesis of PIPs at the Golgi membrane"
 xref: Reactome:R-HSA-1660516 "Synthesis of PIPs at the early endosome membrane"
 xref: Reactome:R-HSA-1660517 "Synthesis of PIPs at the late endosome membrane"
-is_a: GO:0009058 ! biosynthetic process
+is_a: GO:0046474 ! glycerophospholipid biosynthetic process
 is_a: GO:0046488 ! phosphatidylinositol metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31854" xsd:anyURI
 
 [Term]
 id: GO:0006662
@@ -75875,12 +75959,13 @@
 namespace: biological_process
 def: "The transfer of acyl groups to and from acyl-CoA molecules to form O-acylcarnitine, which can exchange across the mitochondrial inner membrane with unacylated carnitine." [ISBN:0198547684]
 comment: See also the cellular component term 'mitochondrial inner membrane ; GO:0005743'.
+xref: MetaCyc:PWY-6111
 xref: Reactome:R-HSA-200425 "Carnitine shuttle"
-xref: Wikipedia:Carnitine#Role_in_fatty_acid_metabolism
 is_a: GO:0015909 ! long-chain fatty acid transport
 is_a: GO:0032365 ! intracellular lipid transport
 is_a: GO:1902001 ! fatty acid transmembrane transport
 is_a: GO:1990542 ! mitochondrial transmembrane transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32167" xsd:anyURI
 
 [Term]
 id: GO:0006854
@@ -80683,49 +80768,57 @@
 
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
@@ -81362,6 +81455,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ectoderm over time, from its formation to the mature structure. In animal embryos, the ectoderm is the outer germ layer of the embryo, formed during gastrulation." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007399
@@ -81372,6 +81466,7 @@
 synonym: "pan-neural process" RELATED []
 xref: Reactome:R-HSA-9675108 "Nervous system development"
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007400
@@ -81533,6 +81628,7 @@
 synonym: "CNS development" EXACT []
 xref: Wikipedia:Neural_development
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81540,7 +81636,7 @@
 name: ventral midline development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ventral midline over time, from its formation to the mature structure. In protostomes (such as insects, snails and worms) as well as deuterostomes (vertebrates), the midline is an embryonic region that functions in patterning of the adjacent nervous tissue. The ventral midline in insects is a cell population extending along the ventral surface of the embryo and is the region from which cells detach to form the ventrally located nerve cords. In vertebrates, the midline is originally located dorsally. During development, it folds inwards and becomes the ventral part of the dorsally located neural tube and is then called the ventral midline, or floor plate." [GOC:bf, GOC:curators, PMID:12075342]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 
 [Term]
@@ -81566,6 +81662,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stomatogastric nervous system over time, from its formation to the mature structure." [GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81574,6 +81671,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the peripheral nervous system over time, from its formation to the mature structure. The peripheral nervous system is one of the two major divisions of the nervous system. Nerves in the PNS connect the central nervous system (CNS) with sensory organs, other organs, muscles, blood vessels and glands." [GOC:curators, UBERON:0000010]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81860,7 +81958,7 @@
 namespace: biological_process
 def: "The morphogenetic furrow is a dorsoventral indentation which sweeps anteriorly across the eye disc. Ommatidia begin to form along the furrow, resulting in a graded series of ommatidial development across the anterior/posterior axis of the disc." [PMID:3076112, PMID:3937883]
 synonym: "progression of morphogenetic furrow during compound eye morphogenesis" RELATED [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001745 ! compound eye morphogenesis
 
 [Term]
@@ -81993,7 +82091,7 @@
 name: notum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dorsal part of the body over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035220 ! wing disc development
 
 [Term]
@@ -82079,7 +82177,7 @@
 name: analia development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the analia over time, from its formation to the mature structure. The analia is the posterior-most vertral appendage that develops from the genital disc. An example of this process is analia development in Drosophila melanogaster." [GOC:ai, GOC:mtg_sensu]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035215 ! genital disc development
 
 [Term]
@@ -82121,6 +82219,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endoderm over time, from its formation to the mature structure. The endoderm is the innermost germ layer that develops into the gastrointestinal tract, the lungs and associated tissues." [GOC:dph, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007493
@@ -82153,7 +82252,7 @@
 name: anterior midgut development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anterior midgut over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007494 ! midgut development
 
 [Term]
@@ -82161,7 +82260,7 @@
 name: posterior midgut development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the posterior midgut over time, from its formation to the mature structure." [GOC:curators]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007494 ! midgut development
 
 [Term]
@@ -82171,6 +82270,7 @@
 def: "The process whose specific outcome is the progression of the mesoderm over time, from its formation to the mature structure. The mesoderm is the middle germ layer that develops into muscle, bone, cartilage, blood and connective tissue." [GOC:dph, GOC:tb]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007499
@@ -82207,6 +82307,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the digestive tract mesoderm over time, from its formation to the mature structure. The digestive tract mesoderm is portion of the middle layer of the three primary germ layers of the embryo which will go on to form part of the digestive tract of the organism." [GOC:ai]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007498 ! mesoderm development
 relationship: part_of GO:0048565 ! digestive tract development
 
@@ -82253,7 +82354,6 @@
 xref: Wikipedia:Heart_development
 is_a: GO:0048513 ! animal organ development
 relationship: part_of GO:0072359 ! circulatory system development
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0007508
@@ -82627,6 +82727,7 @@
 def: "A biological process in which an animal physically develops after birth or hatching, involving a conspicuous and relatively abrupt change in the animal's form or structure. Examples include the change from tadpole to frog, and the change from larva to adult. An example of this is found in Drosophila melanogaster." [GOC:sensu, ISBN:0198506732, ISBN:0721662544]
 xref: Wikipedia:Metamorphosis
 is_a: GO:0007275 ! multicellular organism development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007553
@@ -83084,6 +83185,7 @@
 comment: See also the biological process term 'blood coagulation, extrinsic pathway ; GO:0007598' and 'blood coagulation, common pathway ; GO:0072377'.
 synonym: "initiation of blood coagulation cascade, contact activation system" EXACT [PMID:18695377]
 synonym: "initiation of blood coagulation cascade, contact pathway" EXACT [PMID:26018600]
+xref: Reactome:R-HSA-140837 "Intrinsic Pathway of Fibrin Clot Formation"
 is_a: GO:0072376 ! protein activation cascade
 relationship: part_of GO:0072378 ! blood coagulation, fibrin clot formation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30501" xsd:anyURI
@@ -83095,6 +83197,7 @@
 def: "A protein activation cascade that initiates blood coagulation, starting with a signal from tissue factor (TF), a cell-surface, integral-membrane protein, which converts Factor IX to IXa, and Factor IXa converts Factor X to Xa. Factor Xa then initiates the common pathway." [GOC:add, GOC:mah, GOC:pde, PMID:26018600]
 comment: See also the biological process term 'blood coagulation, intrinsic pathway ; GO:0007597' and 'blood coagulation, common pathway ; GO:0072377'.
 synonym: "initiation of blood coagulation cascade, tissue factor pathway" EXACT [PMID:26018600]
+xref: Reactome:R-HSA-140834 "Extrinsic Pathway of Fibrin Clot Formation"
 is_a: GO:0072376 ! protein activation cascade
 relationship: part_of GO:0072378 ! blood coagulation, fibrin clot formation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30501" xsd:anyURI
@@ -84218,7 +84321,6 @@
 xref: Reactome:R-HSA-6790987 "NAT10 acetylates cytidine-1337 and cytidine-1842 of 18S rRNA yielding 4-acetylcytidine-1377 and 4-acetylcytidine-1842"
 xref: Reactome:R-HSA-9636560 "Eis acetylates DUSP16"
 xref: Reactome:R-HSA-9913373 "AAC(6)-Ib acetylates ciprofloxacin"
-xref: Reactome:R-HSA-9971629 "Unknown NAT N-acetylates kynurenine"
 is_a: GO:0016407 ! acetyltransferase activity
 
 [Term]
@@ -85240,13 +85342,16 @@
 
 [Term]
 id: GO:0008139
-name: nuclear localization sequence binding
+name: obsolete nuclear localization sequence binding
 namespace: molecular_function
-def: "Binding to a nuclear localization sequence, a specific peptide sequence that acts as a signal to localize the protein within the nucleus." [GOC:ai]
+def: "OBSOLETE. Binding to a nuclear localization sequence, a specific peptide sequence that acts as a signal to localize the protein within the nucleus." [GOC:ai]
+comment: This term was obsoleted because it represents the same activity as nucleocytoplasmic carrier activity ; GO:0140142.
 synonym: "NLS binding" EXACT []
 synonym: "nuclear localisation sequence binding" EXACT [GOC:mah]
 synonym: "nuclear localization signal binding" EXACT []
-is_a: GO:0005048 ! signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0140142
 
 [Term]
 id: GO:0008140
@@ -86262,7 +86367,7 @@
 xref: Reactome:R-HSA-5684864 "NAPSA, CTSH, PGA3-5 cleave pro-SFTPB"
 xref: Reactome:R-HSA-5685902 "NAPSA, CTSH, PGA3-5 cleave pro-SFTPC"
 xref: Reactome:R-HSA-6803060 "DCD(63-110) is processed to DCD(63-109)"
-xref: Reactome:R-HSA-9935547 "Lysosomal degradation of ubiquitinated CDH1"
+xref: Reactome:R-HSA-9935547 "Lysosomal degradation of ubiqutinated CDH1"
 is_a: GO:0016787 ! hydrolase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch EC:3.4.-.-
@@ -86569,7 +86674,7 @@
 xref: Reactome:R-HSA-109278 "NT5E:Zn2+ hydrolyses AMP,dAMP,GMP, IMP"
 xref: Reactome:R-HSA-109291 "CMP or TMP or UMP + H2O => cytidine, thymidine, or uridine + orthophosphate [NT5E]"
 xref: Reactome:R-HSA-109380 "(d)CMP, TMP, or (d)UMP + H2O => (deoxy)cytidine, thymidine, or (deoxy)uridine + orthophosphate (NT5C1A)"
-xref: Reactome:R-HSA-109387 "(2'-deoxy)purine nucleoside 5'-monophosphate + H2O => (2'-deoxy)purine nucleoside + orthophosphate [NT5C1A]"
+xref: Reactome:R-HSA-109387 "(d)AMP, (d)GMP, or (d)IMP + H2O => (deoxy)adenosine, (deoxy)guanosine, or (deoxy)inosine + orthophosphate (NT5C1A)"
 xref: Reactome:R-HSA-109415 "AMP + H2O => adenosine + orthophosphate [NT5C1B]"
 xref: Reactome:R-HSA-109449 "(d)CMP, TMP, or (d)UMP + H2O => (deoxy)cytidine, thymidine, or (deoxy)uridine + orthophosphate (NT5C3)"
 xref: Reactome:R-HSA-109470 "(d)GMP or (d)IMP + H2O => (d)G or (d)I + orthophosphate (NT5C)"
@@ -89599,7 +89704,6 @@
 synonym: "aminotransferase activity" EXACT []
 xref: EC:2.6.1.-
 xref: Reactome:R-HSA-1237102 "Transamination of MOB to methionine"
-xref: Reactome:R-HSA-9972889 "AADAT transaminates 3HKYN to xanthurenate"
 is_a: GO:0016769 ! transferase activity, transferring nitrogenous groups
 property_value: skos:exactMatch EC:2.6.1.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -90335,6 +90439,7 @@
 def: "The process whose specific outcome is the progression of the epidermis over time, from its formation to the mature structure. The epidermis is the outer epithelial layer of an animal, it may be a single layer that produces an extracellular material (e.g. the cuticle of arthropods) or a complex stratified squamous epithelium, as in the case of many vertebrate species." [GOC:curators, UBERON:0001003]
 synonym: "hypodermis development" RELATED [GOC:kmv, GOC:rk]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0008545
@@ -93198,7 +93303,7 @@
 synonym: "uridine diphosphoacetylglucosamine 2'-epimerase activity" RELATED [EC:5.1.3.14]
 xref: EC:5.1.3.14
 xref: MetaCyc:UDPGLCNACEPIM-RXN
-xref: Reactome:R-HSA-4085021 "GNE hydrolyzes and epimerises UDP-GlcNAc to ManNAc and UDP"
+xref: Reactome:R-HSA-4085021 "GNE hydrolyzes/epimerises UDP-GlcNAc to ManNAc and UDP"
 xref: Reactome:R-HSA-4088338 "Defective GNE does not hydrolyse UDP-GlcNAc"
 xref: RHEA:17213
 is_a: GO:0016857 ! racemase and epimerase activity, acting on carbohydrates and derivatives
@@ -96817,6 +96922,7 @@
 xref: RHEA:41167
 xref: RHEA:41171
 xref: RHEA:41207
+xref: RHEA:41320
 xref: RHEA:42212
 xref: RHEA:43968
 xref: RHEA:44408
@@ -96855,6 +96961,7 @@
 property_value: skos:narrowMatch RHEA:41167
 property_value: skos:narrowMatch RHEA:41171
 property_value: skos:narrowMatch RHEA:41207
+property_value: skos:narrowMatch RHEA:41320
 property_value: skos:narrowMatch RHEA:42212
 property_value: skos:narrowMatch RHEA:43968
 property_value: skos:narrowMatch RHEA:44408
@@ -98422,7 +98529,7 @@
 synonym: "aspartate family amino acid biosynthesis" EXACT []
 synonym: "aspartate family amino acid formation" EXACT []
 synonym: "aspartate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98572,7 +98679,7 @@
 synonym: "pyruvate family amino acid biosynthesis" EXACT []
 synonym: "pyruvate family amino acid formation" EXACT []
 synonym: "pyruvate family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
@@ -98633,7 +98740,7 @@
 synonym: "glutamine family amino acid biosynthesis" EXACT []
 synonym: "glutamine family amino acid formation" EXACT []
 synonym: "glutamine family amino acid synthesis" EXACT []
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -98695,7 +98802,7 @@
 xref: UM-BBD_pathwayID:met
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006555 ! L-methionine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:METHIONINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5082
@@ -98748,8 +98855,8 @@
 synonym: "homoserine formation" EXACT []
 synonym: "homoserine synthesis" EXACT []
 xref: MetaCyc:HOMOSERSYN-PWY
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0009092 ! L-homoserine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:exactMatch MetaCyc:HOMOSERSYN-PWY
 
@@ -98773,7 +98880,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving homoserine, alpha-amino-gamma-hydroxybutyric acid, an intermediate in the biosynthesis of cystathionine, threonine and methionine." [ISBN:0198506732]
 synonym: "homoserine metabolism" EXACT []
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -101060,11 +101166,12 @@
 synonym: "GDP-mannose biosynthesis" EXACT []
 synonym: "GDP-mannose formation" EXACT []
 synonym: "GDP-mannose synthesis" EXACT []
-xref: MetaCyc:PWY-5659 {status="skos:exactMatch"}
+xref: MetaCyc:PWY-5659
 xref: Reactome:R-HSA-446205 "Synthesis of GDP-mannose"
 is_a: GO:0009226 ! nucleotide-sugar biosynthetic process
 is_a: GO:0019673 ! GDP-mannose metabolic process
 relationship: has_part GO:0004615 ! phosphomannomutase activity
+property_value: skos:exactMatch MetaCyc:PWY-5659
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23283" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27107" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28953" xsd:anyURI
@@ -103746,12 +103853,12 @@
 namespace: biological_process
 def: "The union of gametes of opposite sexes during the process of sexual reproduction to form a zygote. It involves the fusion of the gametic nuclei (karyogamy) and cytoplasm (plasmogamy)." [GOC:tb, ISBN:0198506732]
 synonym: "cell-cell fusion" RELATED []
-synonym: "https://github.com/geneontology/go-ontology/issues/31270" RELATED []
 synonym: "syngamy" EXACT []
 xref: Wikipedia:Fertilisation
 is_a: GO:0022414 ! reproductive process
 relationship: part_of GO:0019953 ! sexual reproduction
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20176" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31270" xsd:anyURI
 
 [Term]
 id: GO:0009567
@@ -105950,6 +106057,7 @@
 def: "The process whose specific outcome is the progression of an embryo over time, from zygote formation until the end of the embryonic life stage. The end of the embryonic life stage is organism-specific and may be somewhat arbitrary; for mammals it is usually considered to be birth, for insects the hatching of the first instar larva from the eggshell." [GOC:curators, GOC:isa_complete, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009793
@@ -105958,7 +106066,7 @@
 def: "The process whose specific outcome is the progression of the embryo over time, from zygote formation to the end of seed dormancy. An example of this process is found in Arabidopsis thaliana." [GOC:curators, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009790 ! embryo development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -107771,7 +107879,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endosperm over time, from its formation to the mature structure. The endosperm is formed during fertilization and provides nutrients to the developing embryo." [GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -109097,7 +109205,7 @@
 def: "The process whose specific outcome is the progression of phloem and/or xylem over time, from formation to the mature structure. An example of this process is found in Arabidopsis thaliana." [GOC:mtg_sensu, GOC:tb]
 synonym: "vascular tissue development" BROAD []
 synonym: "vascular tissue histogenesis" EXACT []
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010088
@@ -109191,7 +109299,7 @@
 name: suspensor development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the suspensor over time, from its formation to the mature structure. The suspensor is the extension at the base of the embryo that anchors the embryo in the embryo sac and pushes it into the endosperm." [GOC:tb, ISBN:0471245208]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010099
@@ -109708,19 +109816,20 @@
 
 [Term]
 id: GO:0010142
-name: farnesyl diphosphate biosynthetic process, mevalonate pathway
+name: obsolete farnesyl diphosphate biosynthetic process, mevalonate pathway
 namespace: biological_process
-def: "The pathway that converts acetate, in the form of acetyl-CoA, to farnesyl diphosphate (FPP) through a series of mevalonate intermediates. Farnesyl diphosphate is an important substrate for other essential pathways, such as biosynthesis of sterols." [GOC:pz, MetaCyc:PWY-922]
+def: "OBSOLETE. The pathway that converts acetate, in the form of acetyl-CoA, to farnesyl diphosphate (FPP) through a series of mevalonate intermediates. Farnesyl diphosphate is an important substrate for other essential pathways, such as biosynthesis of sterols." [GOC:pz]
+comment: This term was obsoleted because it is represented by isopentenyl diphosphate biosynthetic process, mevalonate pathway ; GO:0019287 or trans, trans-farnesyl diphosphate biosynthetic process ; GO:0045337.
 synonym: "Ac-MVA pathway" NARROW [PMID:14517367]
 synonym: "acetate-mevalonate pathway" NARROW [PMID:14517367]
 synonym: "farnesyl diphosphate anabolism, mevalonate pathway" EXACT []
 synonym: "farnesyl diphosphate formation, mevalonate pathway" EXACT []
 synonym: "farnesyl diphosphate synthesis, mevalonate pathway" EXACT []
 synonym: "isoprenoid pathway" EXACT []
-is_a: GO:0008654 ! phospholipid biosynthetic process
-is_a: GO:0016114 ! terpenoid biosynthetic process
-is_a: GO:0045338 ! farnesyl diphosphate metabolic process
-is_a: GO:1902767 ! isoprenoid biosynthetic process via mevalonate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32082" xsd:anyURI
+is_obsolete: true
+consider: GO:0019287
+consider: GO:0045337
 
 [Term]
 id: GO:0010143
@@ -109849,6 +109958,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit over time, from its formation to the mature structure. The fruit is a reproductive body of a seed plant." [GOC:sm]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010155
@@ -110380,7 +110490,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the seed coat over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -110643,15 +110753,13 @@
 
 [Term]
 id: GO:0010241
-name: ent-kaurene oxidation to kaurenoic acid
+name: obsolete ent-kaurene oxidation to kaurenoic acid
 namespace: biological_process
-def: "The three successive oxidations of the 4-methyl group of ent-kaurene to form ent-kaur-16-en-19-oate, kaurenoic acid. This process may be carried out entirely by the enzyme ent-kaurene oxidase." [GOC:tb]
-comment: Note that this term was in molecular function but was moved to biological process as it represents three successive reactions.
-synonym: "ent-kaurene oxidation to ent-kaur-16-en-19-oate" EXACT []
-synonym: "ent-kaurene oxidation to ent-kaurenoate" EXACT []
-synonym: "ent-kaurene oxidation to kaurenoic acid by ent-kaurene oxidase" EXACT []
-is_a: GO:0033331 ! ent-kaurene metabolic process
-relationship: has_part GO:0052615 ! ent-kaurene oxidase activity
+def: "OBSOLETE. The three successive oxidations of the 4-methyl group of ent-kaurene to form ent-kaur-16-en-19-oate, kaurenoic acid. This process may be carried out entirely by the enzyme ent-kaurene oxidase." [GOC:tb]
+comment: The reason for obsoletion is that the data from the paper for which the term was requested can be accurately described using GO:0009686 gibberellin biosynthetic process.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32078" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0009686
 
 [Term]
 id: GO:0010242
@@ -110776,7 +110884,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the floral nectaries over time, from its formation to the mature structure." [GOC:lr]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
 [Term]
@@ -111487,35 +111595,34 @@
 
 [Term]
 id: GO:0010322
-name: regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+name: regulation of isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of isopentenyl diphosphate produced via the methylerythritol (MEP) pathway (mevalonate-independent)." [PMID:16531478]
+synonym: "regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway" EXACT []
 synonym: "regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
-is_a: GO:0006109 ! regulation of carbohydrate metabolic process
-is_a: GO:0010565 ! regulation of ketone metabolic process
-is_a: GO:0019747 ! regulation of isoprenoid metabolic process
 is_a: GO:0071071 ! regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
-relationship: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+intersection_of: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+relationship: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32082" xsd:anyURI
 
 [Term]
 id: GO:0010323
-name: negative regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+name: negative regulation of isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
 namespace: biological_process
 def: "Any process that stops, prevents, or reduces the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of isopentenyl diphosphate produced via the methylerythritol (MEP) pathway (mevalonate-independent)." [PMID:16531478]
 synonym: "down regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
 synonym: "down-regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
 synonym: "downregulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
 synonym: "inhibition of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" NARROW []
+synonym: "negative regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway" EXACT []
 synonym: "negative regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
-is_a: GO:0010322 ! regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
-is_a: GO:0045827 ! negative regulation of isoprenoid metabolic process
-is_a: GO:0045912 ! negative regulation of carbohydrate metabolic process
+is_a: GO:0010322 ! regulation of isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
 is_a: GO:0071072 ! negative regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
-relationship: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+intersection_of: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+relationship: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 
 [Term]
 id: GO:0010324
@@ -112995,7 +113102,7 @@
 name: stele development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stele over time, from its formation to the mature structure. The stele is the central column of primary vascular tissue in the root and any tissue that it surrounds." [GOC:tb]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
 [Term]
@@ -113293,8 +113400,7 @@
 name: regulation of phosphatidylinositol biosynthetic process
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of phosphatidylinositol." [GOC:dph, GOC:tb, GOC:vw]
-is_a: GO:0009889 ! regulation of biosynthetic process
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
+is_a: GO:0071071 ! regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0006661 ! phosphatidylinositol biosynthetic process
 relationship: regulates GO:0006661 ! phosphatidylinositol biosynthetic process
@@ -113304,9 +113410,8 @@
 name: negative regulation of phosphatidylinositol biosynthetic process
 namespace: biological_process
 def: "Any process that decreases the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of phosphatidylinositol." [GOC:dph, GOC:tb, GOC:vw]
-is_a: GO:0009890 ! negative regulation of biosynthetic process
 is_a: GO:0010511 ! regulation of phosphatidylinositol biosynthetic process
-is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
+is_a: GO:0071072 ! negative regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0006661 ! phosphatidylinositol biosynthetic process
 relationship: negatively_regulates GO:0006661 ! phosphatidylinositol biosynthetic process
@@ -113316,9 +113421,8 @@
 name: positive regulation of phosphatidylinositol biosynthetic process
 namespace: biological_process
 def: "Any process that increases the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of phosphatidylinositol." [GOC:dph, GOC:tb, GOC:vw]
-is_a: GO:0009891 ! positive regulation of biosynthetic process
 is_a: GO:0010511 ! regulation of phosphatidylinositol biosynthetic process
-is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
+is_a: GO:0071073 ! positive regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0006661 ! phosphatidylinositol biosynthetic process
 relationship: positively_regulates GO:0006661 ! phosphatidylinositol biosynthetic process
@@ -116844,7 +116948,7 @@
 name: stipule development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stipule over time, from its formation to the mature structure. A stipule is one of (usually) a pair of appendages at the bases of leaves in many broad-leaved angiosperms." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048366 ! leaf development
 
 [Term]
@@ -118608,6 +118712,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the morula over time. The morula is a spherical embryonic mass of blastomeres formed before the blastula and resulting from cleavage of the fertilized ovum." [PMID:37935903, PMID:38386558, PMID:39361745]
 is_a: GO:0009790 ! embryo development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29162" xsd:anyURI
 created_by: pg
 creation_date: 2024-11-12T09:13:07Z
@@ -121524,6 +121629,7 @@
 synonym: "protein disulphide oxidoreductase activity" EXACT []
 xref: Reactome:R-HSA-1307802 "MIA40:ERV1 (CHCHD4:GFER) oxidizes cysteine residues to cystine disulfide bonds"
 xref: Reactome:R-HSA-264997 "P4HB mediates disulfide bond formation in Proinsulin"
+xref: Reactome:R-HSA-3299753 "CCS transfers Cu to SOD1 and oxidizes cysteine residues in SOD1"
 xref: Reactome:R-HSA-9817575 "ERO1B oxidizes P4HB"
 is_a: GO:0015036 ! disulfide oxidoreductase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
@@ -123213,7 +123319,6 @@
 synonym: "betaine/GABA:sodium symporter activity" NARROW []
 synonym: "glycine betaine/proline porter activity" NARROW []
 synonym: "proline/glycine/betaine:hydrogen/sodium symporter activity" NARROW []
-xref: Reactome:R-HSA-6797957 "SLC22A4 transports BET from mitochondrial matrix to cytosol"
 is_a: GO:0015651 ! quaternary ammonium group transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 relationship: part_of GO:0015838 ! amino-acid betaine transport
@@ -123381,7 +123486,7 @@
 xref: Reactome:R-HSA-429594 "SLC5A7 cotransports Cho, Cl-, Na+ from extracellular region to cytosol"
 xref: Reactome:R-HSA-444433 "Cho transports from the extracellular space to the cytosol"
 xref: Reactome:R-HSA-5658483 "Defective SLC5A7 does not cotransport Cho, Cl-, Na+ from extracellular region to cytosol"
-xref: Reactome:R-HSA-6797956 "SLC44A1 and SLC44A2 transport Cho from cytosol to mitochondrial matrix"
+xref: Reactome:R-HSA-6797956 "SLC44A1 transports Cho from cytosol to mitochondrial matrix"
 is_a: GO:0022857 ! transmembrane transporter activity
 relationship: part_of GO:0015871 ! choline transport
 
@@ -125938,6 +126043,7 @@
 def: "Primary active carrier-mediated transport of a protein across a membrane, driven by the hydrolysis of the diphosphate bond of inorganic pyrophosphate, ATP, or another nucleoside triphosphate. The transport protein may or may not be transiently phosphorylated, but the substrate is not phosphorylated." [GOC:mtg_transport, ISBN:0815340729]
 synonym: "P-P-bond-hydrolysis-driven protein transmembrane transporter activity" RELATED []
 synonym: "protein translocase activity" EXACT []
+xref: Reactome:R-HSA-1222523 "SodB gets secreted"
 is_a: GO:0008320 ! transmembrane protein transporter activity
 is_a: GO:0042626 ! ATPase-coupled transmembrane transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21271" xsd:anyURI
@@ -127022,7 +127128,9 @@
 synonym: "N-acetyl-D-glucosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylchitosamine transmembrane transporter activity" EXACT []
 synonym: "N-acetylglucosamine permease activity" RELATED []
+xref: RHEA:86427
 is_a: GO:1901505 ! carbohydrate derivative transmembrane transporter activity
+property_value: skos:narrowMatch RHEA:86427
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 
@@ -128162,6 +128270,7 @@
 namespace: biological_process
 def: "OBSOLETE. The directed movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic anions are atoms or small molecules with a negative charge which contain carbon in covalent linkage." [GOC:ai, GOC:krc]
 comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+xref: Reactome:R-HSA-9955298 "SLC-mediated transport of organic anions"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30715" xsd:anyURI
 is_obsolete: true
 replaced_by: GO:0055085
@@ -133424,9 +133533,8 @@
 synonym: "selenocysteine synthesis" EXACT []
 xref: MetaCyc:PWY-6281
 xref: MetaCyc:PWY0-901
-xref: Reactome:R-HSA-2408557 "Selenocysteine synthesis"
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0042398 ! modified amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6281
 property_value: skos:narrowMatch MetaCyc:PWY0-901
@@ -133441,8 +133549,8 @@
 synonym: "selenocysteine catabolic process" EXACT []
 synonym: "selenocysteine catabolism" EXACT []
 synonym: "selenocysteine degradation" EXACT []
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 
 [Term]
@@ -134243,7 +134351,7 @@
 name: mushroom body development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the mushroom body over time, from its formation to the mature structure. The mushroom body is composed of the prominent neuropil structures of the insect central brain, thought to be crucial for olfactory associated learning. These consist mainly of a bulbous calyx and tightly packaged arrays of thin parallel fibers of the Kenyon cells." [PMID:8790424]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -134712,7 +134820,6 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the carnitine molecule." [GOC:ai]
 xref: Reactome:R-HSA-200410 "CPT2 converts acylcarnitine to acyl-CoA"
-xref: Reactome:R-HSA-9971123 "CRAT transfers ISB to CAR"
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
@@ -135727,9 +135834,11 @@
 xref: RHEA:82931
 xref: RHEA:82999
 xref: RHEA:83031
+xref: RHEA:83075
 xref: RHEA:83079
 xref: RHEA:83139
 xref: RHEA:83215
+xref: RHEA:83327
 xref: RHEA:83363
 xref: RHEA:83379
 xref: RHEA:83395
@@ -135755,9 +135864,11 @@
 property_value: skos:narrowMatch RHEA:82931
 property_value: skos:narrowMatch RHEA:82999
 property_value: skos:narrowMatch RHEA:83031
+property_value: skos:narrowMatch RHEA:83075
 property_value: skos:narrowMatch RHEA:83079
 property_value: skos:narrowMatch RHEA:83139
 property_value: skos:narrowMatch RHEA:83215
+property_value: skos:narrowMatch RHEA:83327
 property_value: skos:narrowMatch RHEA:83363
 property_value: skos:narrowMatch RHEA:83379
 property_value: skos:narrowMatch RHEA:83395
@@ -135958,7 +136069,6 @@
 def: "A copper chaperone activity that specifically delivers copper to the Cu-Zn superoxide dismutase, to activate superoxide dismutase activity." [GOC:vw, http://link.springer-ny.com/link/service/journals/00335/papers/0011005/00110409.html, PMID:15064408, PMID:9295278]
 comment: See also the molecular function term 'superoxide dismutase activity ; GO:0004784'.
 synonym: "superoxide dismutase copper carrier activity" EXACT []
-xref: Reactome:R-HSA-3299753 "CCS transfers Cu to SOD1 and oxidizes cysteine residues in SOD1"
 is_a: GO:0016531 ! copper chaperone activity
 
 [Term]
@@ -140005,9 +140115,6 @@
 xref: Reactome:R-HSA-9668415 "VPS4 mediates disassembly of ESCRTIII subunits to promote sealing of holes in the nuclear envelope"
 xref: Reactome:R-HSA-9706399 "RHOBTB3 hydrolyzes ATP"
 xref: Reactome:R-HSA-9749350 "ATP-dependent release of CDT1 from the OCCM complex"
-xref: Reactome:R-HSA-9943614 "CHD2-dependent H3.3 deposition at MYOG gene"
-xref: Reactome:R-HSA-9944087 "CHD6-9-dependent ATP hydrolysis"
-xref: Reactome:R-HSA-9944091 "NuRD hydrolyzes ATP to affect nucleosome organization"
 xref: Reactome:R-HSA-9948300 "RQT complex:K63polyUb-80S ribosome dissociates yielding K63polyUb-40S subunit and 60S subunit:peptidyl-tRNA with nascent peptide"
 xref: Reactome:R-HSA-9949632 "VCP hexamer extracts K48 polyubiquitinated alanine-tailed nascent peptide from VCP hexamer:UFD1:NPLOC4:LTN1:NEMF:TCF25:60S ribosome subunit:K48polyUb-nascent peptide"
 xref: Reactome:R-HSA-9955731 "ABCE1:PELO:80S Ribosome:non-stop mRNA:peptidyl-tRNA with elongating peptide dissociates yielding ABCE1:40S ribosomal subunit, PELO, and 60S ribosomal subunit:peptidyl-tRNA with nascent peptide"
@@ -142385,8 +142492,8 @@
 synonym: "hydropyrimidine dehydrogenase activity" RELATED [EC:1.3.1.2]
 xref: EC:1.3.1.2
 xref: MetaCyc:1.3.1.2-RXN
-xref: Reactome:R-HSA-73585 "reduction of uracil to form dihydrouracil"
-xref: Reactome:R-HSA-73616 "reduction of thymine to form 5,6-Dihydrothymine"
+xref: Reactome:R-HSA-73585 "uracil + NADPH + H+ => 5,6-dihydrouracil + NADP+"
+xref: Reactome:R-HSA-73616 "thymine + NADPH + H+ => 5,6-dihydrothymine + NADP+"
 xref: RHEA:18093
 is_a: GO:0016628 ! oxidoreductase activity, acting on the CH-CH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.3.1.2
@@ -142514,9 +142621,6 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phospholipids from one membrane bilayer leaflet to the other, by an ATP-independent mechanism." [GOC:cjm, PMID:20043909, PMID:20302864]
 comment: Nomenclature note. Scramblases are ATP-independent, non-selective, translocases inducing non-specific transbilayer movements across the membrane. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases).
-xref: Reactome:R-HSA-9853809 "ANO6 exposes PS, PE on the platelet membrane"
-xref: Reactome:R-HSA-9853849 "Defective ANO6 does not expose PS, PE on the platelet membrane"
-xref: Reactome:R-HSA-9854657 "ANO5, ANO6 expose PS, PE on endothelial cells"
 is_a: GO:0140303 ! intramembrane lipid carrier activity
 relationship: part_of GO:0017121 ! plasma membrane phospholipid scrambling
 
@@ -146916,7 +147020,6 @@
 xref: RESID:AA0029
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -146929,7 +147032,6 @@
 xref: RESID:AA0030
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0019511 ! peptidyl-proline hydroxylation
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170041 ! non-proteinogenic amino acid metabolic process
 
 [Term]
@@ -151677,11 +151779,13 @@
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
@@ -152033,6 +152137,7 @@
 xref: RHEA:84407
 xref: RHEA:84627
 xref: RHEA:84631
+xref: RHEA:84655
 xref: RHEA:84659
 xref: RHEA:84663
 xref: RHEA:84667
@@ -152090,6 +152195,7 @@
 property_value: skos:narrowMatch RHEA:84407
 property_value: skos:narrowMatch RHEA:84627
 property_value: skos:narrowMatch RHEA:84631
+property_value: skos:narrowMatch RHEA:84655
 property_value: skos:narrowMatch RHEA:84659
 property_value: skos:narrowMatch RHEA:84663
 property_value: skos:narrowMatch RHEA:84667
@@ -155114,51 +155220,60 @@
 
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
@@ -156549,7 +156664,7 @@
 xref: Reactome:R-HSA-110138 "AK5,7,8,9 phosphorylates (d)NMPs to (d)NDPs"
 xref: Reactome:R-HSA-73598 "(2'-deoxy)cytidine + ATP => (d)CMP + ADP (DCK)"
 xref: Reactome:R-HSA-73599 "cytidine or uridine + ATP => CMP or UMP + ADP [UCK1]"
-xref: Reactome:R-HSA-73632 "phosphorylation of 2'-Deoxythymidine to dTMP"
+xref: Reactome:R-HSA-73632 "thymidine + ATP => TMP (deoxythymidine 5'-monophosphate) + ADP [TK1]"
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
 is_a: GO:0019205 ! nucleobase-containing compound kinase activity
 relationship: part_of GO:0009165 ! nucleotide biosynthetic process
@@ -157462,17 +157577,26 @@
 synonym: "isopentenyl diphosphate biosynthetic process via mevalonate" EXACT [GOC:pr]
 synonym: "isopentenyl diphosphate formation, mevalonate pathway" EXACT []
 synonym: "isopentenyl diphosphate synthesis, mevalonate pathway" EXACT []
+synonym: "mevalonate pathway" EXACT []
+synonym: "MVA pathway" EXACT []
+xref: MetaCyc:PWY-6174
+xref: MetaCyc:PWY-7524
+xref: MetaCyc:PWY-8125
 xref: MetaCyc:PWY-922
 is_a: GO:0006084 ! acetyl-CoA metabolic process
 is_a: GO:0009240 ! isopentenyl diphosphate biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-6174
+property_value: skos:narrowMatch MetaCyc:PWY-7524
+property_value: skos:narrowMatch MetaCyc:PWY-8125
+property_value: skos:narrowMatch MetaCyc:PWY-922
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32082" xsd:anyURI
 
 [Term]
 id: GO:0019288
-name: isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+name: isopentenyl diphosphate biosynthetic process, methylerythritol phosphate pathway
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of isopentenyl diphosphate by the mevalonate-independent pathway. Isopentenyl diphosphate (IPP) is the fundamental unit in isoprenoid biosynthesis and is biosynthesized from pyruvate and glyceraldehyde 3-phosphate via intermediates, including 1-deoxy-D-xylulose 5-phosphate." [GOC:curators, MetaCyc:NONMEVIPP-PWY, PMID:18948055]
+def: "The chemical reactions and pathways resulting in the formation of isopentenyl diphosphate by the methylerythritol phosphate pathway, also known as the mevalonate-independent pathway. Isopentenyl diphosphate (IPP) is the fundamental unit in isoprenoid biosynthesis and is produced from pyruvate and glyceraldehyde 3-phosphate via intermediates, including methylerythritol 4-phosphate." [MetaCyc:NONMEVIPP-PWY, PMID:18948055]
 synonym: "isopentenyl diphosphate anabolism, mevalonate-independent pathway" EXACT []
 synonym: "isopentenyl diphosphate biosynthesis, mevalonate-independent" EXACT []
 synonym: "isopentenyl diphosphate biosynthesis, non-mevalonate pathway" EXACT []
@@ -157483,12 +157607,18 @@
 synonym: "isopentenyl diphosphate biosynthetic process, non-mevalonate pathway" EXACT []
 synonym: "isopentenyl diphosphate formation, mevalonate-independent pathway" EXACT []
 synonym: "isopentenyl diphosphate synthesis, mevalonate-independent pathway" EXACT []
+synonym: "MEP pathway" EXACT []
+synonym: "methylerythritol phosphate pathway" EXACT []
 synonym: "mevalonate-independent isopentenyl diphosphate biosynthesis" EXACT []
 synonym: "mevalonate-independent isopentenyl diphosphate biosynthetic process" EXACT []
 synonym: "non-MVA pathway" EXACT []
 xref: MetaCyc:NONMEVIPP-PWY
+xref: MetaCyc:PWY-7560
 is_a: GO:0009240 ! isopentenyl diphosphate biosynthetic process
 is_a: GO:0019682 ! glyceraldehyde-3-phosphate metabolic process
+property_value: skos:narrowMatch MetaCyc:NONMEVIPP-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-7560
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32082" xsd:anyURI
 
 [Term]
 id: GO:0019289
@@ -158180,7 +158310,6 @@
 xref: MetaCyc:PWY-I9
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:CYSTSYN-PWY
 property_value: skos:narrowMatch MetaCyc:HOMOCYSDEGR-PWY
@@ -158219,7 +158348,6 @@
 xref: Reactome:R-HSA-1614603 "Cysteine formation from homocysteine"
 xref: Wikipedia:Transsulfuration_pathway
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
@@ -159430,7 +159558,7 @@
 xref: MetaCyc:LCYSDEG-PWY
 xref: MetaCyc:PWY-5329
 is_a: GO:0000098 ! sulfur amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:CYSTEINE-DEG-PWY
 property_value: skos:narrowMatch MetaCyc:LCYSDEG-PWY
@@ -159691,8 +159819,8 @@
 synonym: "4-hydroxyproline degradation" EXACT []
 xref: MetaCyc:HYDROXYPRODEG-PWY
 xref: MetaCyc:PWY-5159
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:HYDROXYPRODEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5159
@@ -159796,7 +159924,7 @@
 xref: MetaCyc:PWY-6328
 xref: MetaCyc:PWY0-461
 xref: MetaCyc:PWY66-425
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:LYSDEGII-PWY
 property_value: skos:narrowMatch MetaCyc:LYSINE-DEG1-PWY
@@ -159822,7 +159950,6 @@
 synonym: "D-amino acid catabolism" EXACT []
 synonym: "D-amino acid degradation" EXACT []
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0046416 ! D-amino acid metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 
 [Term]
@@ -160136,8 +160263,8 @@
 xref: MetaCyc:P561-PWY
 xref: MetaCyc:PWY-8109
 is_a: GO:0006579 ! amino-acid betaine catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0009822 ! alkaloid catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:P561-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8109
@@ -160206,6 +160333,7 @@
 synonym: "methionine regeneration" NARROW []
 synonym: "methionine salvage from methylthioadenosine" EXACT [GOC:mah]
 synonym: "methionine salvage pathway" EXACT []
+xref: Reactome:R-HSA-1237112 "Methionine salvage pathway"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 is_obsolete: true
@@ -160318,6 +160446,7 @@
 synonym: "L-threonine catabolism to glycine" EXACT [GOC:bf, GOC:mah]
 synonym: "L-threonine degradation to glycine" EXACT [GOC:bf, GOC:mah]
 synonym: "threonine catabolic process to glycine" BROAD [GOC:bf]
+xref: Reactome:R-HSA-8849175 "Threonine catabolism"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30734" xsd:anyURI
 is_obsolete: true
@@ -160960,9 +161089,10 @@
 synonym: "L-arabinose breakdown" EXACT []
 synonym: "L-arabinose catabolism" EXACT []
 synonym: "L-arabinose degradation" EXACT []
-xref: MetaCyc:ARABCAT-PWY {status="skos:narrowMatch"}
+xref: MetaCyc:ARABCAT-PWY
 is_a: GO:0019568 ! arabinose catabolic process
 is_a: GO:0046373 ! L-arabinose metabolic process
+property_value: skos:narrowMatch MetaCyc:ARABCAT-PWY
 
 [Term]
 id: GO:0019573
@@ -161595,7 +161725,6 @@
 synonym: "short-chain fatty acid breakdown" EXACT []
 synonym: "short-chain fatty acid catabolism" EXACT []
 synonym: "short-chain fatty acid degradation" EXACT []
-xref: MetaCyc:ACETOACETATE-DEG-PWY
 xref: Reactome:R-HSA-71032 "Propionyl-CoA catabolism"
 is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0046459 ! short-chain fatty acid metabolic process
@@ -161874,7 +162003,6 @@
 id: GO:0019650
 name: obsolete pyruvate fermentation to butanediol
 namespace: biological_process
-alt_id: GO:0030646
 def: "OBSOLETE. The anaerobic chemical reactions and pathways resulting in the breakdown of pyruvate into butanediol; effected by some members of the Enterobacteriaceae, e.g. Enterobacter, Erwinia, Klebsiella, and Serratia." [GOC:dph, GOC:nr, ISBN:0198506732]
 comment: The reason for obsoletion is that this term is equivalent to butanediol biosynthetic process.
 synonym: "butanediol fermentation" EXACT []
@@ -162623,10 +162751,12 @@
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
@@ -163571,8 +163701,6 @@
 xref: Reactome:R-HSA-8956365 "ZBED1 (DREF) SUMOylates CHD3 with SUMO1"
 xref: Reactome:R-HSA-9920126 "UBC9 SUMOylates NS5"
 xref: Reactome:R-HSA-9926476 "UBE2I sumoylates MITF-M"
-xref: Reactome:R-HSA-9940458 "GATAD2B is SUMOylated"
-xref: Reactome:R-HSA-9940470 "GATAD2A is SUMOylated"
 is_a: GO:0019787 ! ubiquitin-like protein transferase activity
 
 [Term]
@@ -165870,7 +165998,7 @@
 name: spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the spinal cord over time, from its formation to the mature structure. The spinal cord primarily conducts sensory and motor nerve impulses between the brain and the peripheral nervous tissues." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 
 [Term]
@@ -165923,7 +166051,7 @@
 name: dorsal spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dorsal region of the spinal cord over time, from its formation to the mature structure. The dorsal region of the mature spinal cord contains neurons that process and relay sensory input." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:11179871]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 
 [Term]
@@ -165931,7 +166059,7 @@
 name: ventral spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ventral region of the spinal cord over time, from its formation to the mature structure. The neurons of the ventral region of the mature spinal cord participate in motor output." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 
 [Term]
@@ -166087,7 +166215,7 @@
 name: diencephalon development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the diencephalon over time, from its formation to the mature structure. The diencephalon is the paired caudal parts of the prosencephalon from which the thalamus, hypothalamus, epithalamus and subthalamus are derived; these regions regulate autonomic, visceral and endocrine function, and process information directed to the cerebral cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -166096,7 +166224,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the telencephalon over time, from its formation to the mature structure. The telencephalon is the paired anteriolateral division of the prosencephalon plus the lamina terminalis from which the olfactory lobes, cerebral cortex, and subcortical nuclei are derived." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
 synonym: "cerebrum development" EXACT [GOC:sl, PMID:22331407]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -166104,7 +166232,7 @@
 name: epithalamus development
 namespace: biological_process
 def: "The progression of the epithalamus over time from its initial formation until its mature state. The epithalamus is the small dorsomedial area of the thalamus including the habenular nuclei and associated fiber bundles, the pineal body, and the epithelial roof of the third ventricle." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -166113,7 +166241,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the subthalamus over time, from its formation to the mature structure. The subthalamus is the anterior part of the diencephalon that lies between the thalamus, hypothalamus, and tegmentum of the mesencephalon, including subthalamic nucleus, zona incerta, the fields of Forel, and the nucleus of ansa lenticularis." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "ventral thalamus development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -166131,7 +166259,7 @@
 def: "The process whose specific outcome is the progression of the ammon gyrus over time, from its formation to the mature structure. The ammon gyrus, often subdivided into the CA1 and CA3 regions, is one of the two interlocking gyri of the hippocampus that is rich in large pyramidal neurons." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "Ammon's horn development" RELATED [GOC:cls]
 synonym: "cornu ammonis development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021766 ! hippocampus development
 
 [Term]
@@ -166139,7 +166267,7 @@
 name: dentate gyrus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dentate gyrus over time, from its formation to the mature structure. The dentate gyrus is one of two interlocking gyri of the hippocampus. It contains granule cells, which project to the pyramidal cells and interneurons of the CA3 region of the ammon gyrus." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021766 ! hippocampus development
 
 [Term]
@@ -166147,7 +166275,7 @@
 name: pallium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pallium over time, from its formation to the mature structure. The pallium is the roof region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -166155,7 +166283,7 @@
 name: subpallium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the subpallium over time, from its formation to the mature structure. The subpallium is the base region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -166170,7 +166298,7 @@
 name: rhombomere development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the rhombomere over time, from its formation to the mature structure. Rhombomeres are transverse segments of the developing rhombencephalon. Rhombomeres are lineage restricted, express different genes from one another, and adopt different developmental fates." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -166194,7 +166322,7 @@
 name: pons development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pons over time, from its formation to the mature structure. The pons lies above the medulla and next to the cerebellum. The pons conveys information about movement from the cerebral hemisphere to the cerebellum." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0022037 ! metencephalon development
 
 [Term]
@@ -166202,7 +166330,7 @@
 name: cerebellum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellum over time, from its formation to the mature structure. The cerebellum is the portion of the brain in the back of the head between the cerebrum and the pons. In mice, the cerebellum controls balance for walking and standing, modulates the force and range of movement and is involved in the learning of motor skills." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0022037 ! metencephalon development
 
 [Term]
@@ -166212,7 +166340,7 @@
 def: "The process whose specific outcome is the progression of the medulla oblongata over time, from its formation to the mature structure. The medulla oblongata lies directly above the spinal cord and controls vital autonomic functions such as digestion, breathing and the control of heart rate." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "medulla development" RELATED [GOC:cls]
 synonym: "myelencephalon development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -166595,6 +166723,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the brain ventricular system over time, from its formation to the mature structure. The brain ventricular system consists of four communicating cavities within the brain that are continuous with the central canal of the spinal cord. These cavities include two lateral ventricles, the third ventricle and the fourth ventricle. Cerebrospinal fluid fills the ventricles and is produced by the choroid plexus." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -166602,7 +166731,7 @@
 name: fourth ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fourth ventricle over time, from its formation to the mature structure. The fourth ventricle is an irregularly shaped cavity in the rhombencephalon, between the medulla oblongata, the pons, and the isthmus in front, and the cerebellum behind. It is continuous with the central canal of the cord below and with the cerebral aqueduct above, and through its lateral and median apertures it communicates with the subarachnoid space." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021591 ! ventricular system development
 relationship: part_of GO:0030902 ! hindbrain development
 
@@ -167301,7 +167430,7 @@
 name: lateral ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the lateral ventricles over time, from the formation to the mature structure. The two lateral ventricles are a cavity in each of the cerebral hemispheres derived from the cavity of the embryonic neural tube. They are separated from each other by the septum pellucidum, and each communicates with the third ventricle by the foramen of Monro, through which also the choroid plexuses of the lateral ventricles become continuous with that of the third ventricle." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 relationship: part_of GO:0021591 ! ventricular system development
 
@@ -167343,7 +167472,7 @@
 name: nerve development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a nerve over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -167368,7 +167497,7 @@
 name: third ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the third ventricle over time, from its formation to the mature structure. The third ventricle is the narrow cleft inferior to the corpus callosum, within the diencephalon, between the paired thalami. Its floor is formed by the hypothalamus, its anterior wall by the lamina terminalis, and its roof by ependyma, and it communicates with the fourth ventricle by the cerebral aqueduct, and with the lateral ventricles by the interventricular foramina." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021591 ! ventricular system development
 
 [Term]
@@ -167376,7 +167505,7 @@
 name: cerebellar molecular layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar molecular layer nerve over time, from its formation to the mature structure. The molecular layer is the outermost layer of the cerebellar cortex. It contains the parallel fibers of the granule cells, interneurons such as stellate and basket cells, and the dendrites of the underlying Purkinje cells." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167384,7 +167513,7 @@
 name: cerebellar Purkinje cell layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar Purkinje cell layer over time, from its formation to the mature structure. The Purkinje cell layer lies just underneath the molecular layer of the cerebellar cortex. It contains the neuronal cell bodies of the Purkinje cells that are arranged side by side in a single layer. Candelabrum interneurons are vertically oriented between the Purkinje cells. Purkinje neurons are inhibitory and provide the output of the cerebellar cortex through axons that project into the white matter. Extensive dendritic trees from the Purkinje cells extend upward in a single plane into the molecular layer where they synapse with parallel fibers of granule cells." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167392,7 +167521,7 @@
 name: cerebellar granular layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar granule layer over time, from its formation to the mature structure. The granular layer is the innermost layer of the cerebellar cortex. This layer contains densely packed small neurons, mostly granule cells. Some Golgi cells are found at the outer border. Granule neurons send parallel fibers to the upper molecular layer, where they synapse with Purkinje cell dendrites. Mossy fibers from the pontine nuclei in the white matter synapse with granule cell axons, Golgi cell axons and unipolar brush interneuron axons at cerebellar glomeruli in the granule cell layer." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167519,7 +167648,7 @@
 name: cerebellar cortex development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar cortex over time, from its formation to the mature structure. The cerebellar cortex is a thin mantle of gray matter that covers the surface of each cerebral hemisphere. It has a characteristic morphology with convolutions (gyri) and crevices (sulci) that have specific functions. Six layers of nerve cells and the nerve pathways that connect them comprise the cerebellar cortex. Together, these regions are responsible for the processes of conscious thought, perception, emotion and memory as well as advanced motor function." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021549 ! cerebellum development
 
 [Term]
@@ -167782,7 +167911,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the medullary reticular formation over time, from its formation to the mature structure. The medullary reticular formation is a series of brain nuclei located in the medulla oblongata." [GO_REF:0000021, GOC:cjm, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid, https://www.ncbi.nlm.nih.gov/books/NBK556102/, Wikipedia:Rhombencephalon]
 synonym: "rhombencephalic reticular formation development" BROAD []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021550 ! medulla oblongata development
 
 [Term]
@@ -167819,7 +167948,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the intermediate reticular formation over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
 synonym: "intermediate reticular nucleus development" EXACT [http://www.brainspan.org]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021723 ! medullary reticular formation development
 
 [Term]
@@ -167835,7 +167964,7 @@
 name: superior reticular formation development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior reticular formation over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021723 ! medullary reticular formation development
 
 [Term]
@@ -168037,7 +168166,7 @@
 def: "The progression of the striatum over time from its initial formation until its mature state. The striatum is a region of the forebrain consisting of the caudate nucleus, putamen and fundus striati." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 synonym: "neostriatum development" EXACT []
 synonym: "striate nucleus development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021544 ! subpallium development
 
 [Term]
@@ -168071,6 +168200,7 @@
 namespace: biological_process
 def: "The progression of the limbic system over time from its initial formation until its mature state. The limbic system is a collection of structures in the brain involved in emotion, motivation and emotional aspects of memory." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -168095,7 +168225,7 @@
 name: amygdala development
 namespace: biological_process
 def: "The progression of the amygdala over time from its initial formation until its mature state. The amygdala is an almond-shaped set of neurons in the medial temporal lobe of the brain that play a key role in processing emotions such as fear and pleasure." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168103,7 +168233,7 @@
 name: cingulate gyrus development
 namespace: biological_process
 def: "The progression of the cingulate gyrus over time from its initial formation until its mature state. The cingulate gyrus is a ridge in the cerebral cortex located dorsal to the corpus callosum." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168112,7 +168242,7 @@
 namespace: biological_process
 def: "The progression of the hippocampus over time from its initial formation until its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420, UBERON:0002421]
 synonym: "hippocampal formation development" EXACT [ABA:HPF]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021543 ! pallium development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -168121,7 +168251,7 @@
 name: mammillary body development
 namespace: biological_process
 def: "The progression of the mammillary body over time from its initial formation until its mature state. The mammillary body is a protrusion at the posterior end of the hypothalamus that contains hypothalamic nuclei." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -168141,7 +168271,7 @@
 name: orbitofrontal cortex development
 namespace: biological_process
 def: "The progression of the orbitofrontal cortex over time from its initial formation until its mature state. The orbitofrontal cortex is a cerebral cortex region located in the frontal lobe." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168151,7 +168281,7 @@
 def: "The progression of the parahippocampal gyrus over time from its initial formation until its mature state. The parahippocampal gyrus is a ridge in the cerebral cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 synonym: "hippocampal gyrus development" EXACT [GOC:dgh]
 xref: Wikipedia:parahippocampal_gyrus
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168168,7 +168298,7 @@
 name: olfactory bulb development
 namespace: biological_process
 def: "The progression of the olfactory bulb over time from its initial formation until its mature state. The olfactory bulb coordinates neuronal signaling involved in the perception of smell. It receives input from the sensory neurons and outputs to the olfactory cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021988 ! olfactory lobe development
 
 [Term]
@@ -168277,6 +168407,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a preganglionic parasympathetic fiber over time, from its formation to the mature structure. A preganglionic parasympathetic fiber is a cholinergic axonal fiber projecting from the CNS to a parasympathetic ganglion." [GO_REF:0000021, GOC:cjm, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 relationship: part_of GO:0048486 ! parasympathetic nervous system development
 
@@ -168376,7 +168507,7 @@
 name: thalamus development
 namespace: biological_process
 def: "The process in which the thalamus changes over time, from its initial formation to its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -168952,7 +169083,7 @@
 name: hypothalamus development
 namespace: biological_process
 def: "The progression of the hypothalamus region of the forebrain, from its initial formation to its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -169384,8 +169515,8 @@
 name: forebrain-midbrain boundary formation
 namespace: biological_process
 def: "The process whose specific outcome is the creation of the forebrain-midbrain boundary." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:11262869]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0048859 ! formation of anatomical boundary
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021903 ! rostrocaudal neural tube patterning
 
 [Term]
@@ -170104,7 +170235,7 @@
 synonym: "adenophysis development" EXACT []
 synonym: "anterior pituitary development" EXACT []
 synonym: "anterior pituitary gland development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021983 ! pituitary gland development
 
 [Term]
@@ -170123,7 +170254,7 @@
 name: habenula development
 namespace: biological_process
 def: "The progression of the habenula over time from its initial formation until its mature state. The habenula is the group of nuclei that makes up the stalk of the pineal gland." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:9780721601465]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021538 ! epithalamus development
 
 [Term]
@@ -170133,7 +170264,7 @@
 def: "The progression of the cerebral cortex over time from its initial formation until its mature state. The cerebral cortex is the outer layered region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
 synonym: "corticogenesis" NARROW [GOC:bf, PMID:25904839]
 synonym: "neocortex development" RELATED [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021543 ! pallium development
 
 [Term]
@@ -170141,7 +170272,7 @@
 name: olfactory lobe development
 namespace: biological_process
 def: "The progression of the olfactory lobe over time from its initial formation until its mature state. The olfactory lobe is the area of the brain that process the neural inputs for the sense of smell." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -170149,7 +170280,7 @@
 name: olfactory cortex development
 namespace: biological_process
 def: "The progression of the olfactory cortex over time from its initial formation until its mature state. The olfactory cortex is involved in the perception of smell. It receives input from the olfactory bulb and is responsible for the identification of odors." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021988 ! olfactory lobe development
 
 [Term]
@@ -170590,7 +170721,7 @@
 name: metencephalon development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the metencephalon over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -170598,7 +170729,7 @@
 name: corpus callosum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the corpus callosum over time, from its formation to the mature structure. The corpus callosum is a thick bundle of nerve fibers comprising a commissural plate connecting the two cerebral hemispheres. It consists of contralateral axon projections that provide communication between the right and left cerebral hemispheres." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -171005,6 +171136,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root system over time, from its formation to the mature structure." [GOC:isa_complete]
 is_a: GO:0048731 ! system development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0022623
@@ -171285,15 +171417,6 @@
 name: narrow pore channel activity
 namespace: molecular_function
 def: "Enables the transport of a solute across a membrane via a narrow pore channel that may be gated or ungated." [GOC:mtg_transport, ISBN:0815340729]
-xref: Reactome:R-HSA-1855161 "I(1,3,4,5,6)P5 transports from the nucleus to the cytosol"
-xref: Reactome:R-HSA-1855168 "I(1,3,4,5)P4 transports from the cytosol to the nucleus"
-xref: Reactome:R-HSA-1855173 "5-PP-IP4 transports from the nucleus to the cytosol"
-xref: Reactome:R-HSA-1855188 "IP6 transports from the cytosol to the nucleus"
-xref: Reactome:R-HSA-1855190 "I(1,4,5)P3 transports from the cytosol to the nucleus"
-xref: Reactome:R-HSA-1855201 "I(1,3,4,6)P4 transports from the cytosol to the nucleus"
-xref: Reactome:R-HSA-1855203 "5-PP-IP5 transports from the nucleus to the cytosol"
-xref: Reactome:R-HSA-1855212 "1/3-PP-IP5 transports from the cytosol to the nucleus"
-xref: Reactome:R-HSA-1855220 "(PP)2-IP4 transports from the nucleus to the cytosol"
 is_a: GO:0015267 ! channel activity
 
 [Term]
@@ -175491,6 +175614,7 @@
 def: "The deposition of hydroxyapatite, a form of calcium phosphate with the formula Ca10(PO4)6(OH)2, in bone tissue." [GOC:mah, PMID:22936354]
 synonym: "bone calcification" NARROW []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001503 ! ossification
 
 [Term]
@@ -176137,7 +176261,7 @@
 xref: Reactome:R-HSA-5602147 "Defective CYP2R1 does not 25-hydroxylate vitamin D"
 xref: RHEA:32903
 is_a: GO:0008395 ! steroid hydroxylase activity
-relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+relationship: part_of GO:1901755 ! vitamin D3 biosynthetic process
 property_value: skos:exactMatch EC:1.14.14.24
 property_value: skos:exactMatch RHEA:32903
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
@@ -176304,11 +176428,13 @@
 
 [Term]
 id: GO:0030369
-name: ICAM-3 receptor activity
+name: obsolete ICAM-3 receptor activity
 namespace: molecular_function
-def: "Combining with ICAM-3, intercellular adhesion molecule 3, and transmitting the signal from one side of the membrane to the other to initiate a change in cell activity. ICAM-3, or CD50, are constitutively expressed on monocytes, granulocytes and lymphocytes; on physiological stimulation, they become transiently phosphorylated on serine residues." [GOC:ai, GOC:signaling, ISBN:0198506732, PMID:7515813]
-comment: Note that this term represents an activity and not a gene product. Consider also annotating to the molecular function terms 'cell adhesion molecule binding ; GO:0050839' and 'receptor binding ; GO:0005102' and the biological process term 'cell adhesion ; GO:0007155'.
-is_a: GO:0004888 ! transmembrane signaling receptor activity
+def: "OBSOLETE. Combining with ICAM-3, intercellular adhesion molecule 3, and transmitting the signal from one side of the membrane to the other to initiate a change in cell activity. ICAM-3, or CD50, are constitutively expressed on monocytes, granulocytes and lymphocytes; on physiological stimulation, they become transiently phosphorylated on serine residues." [GOC:ai, GOC:signaling, ISBN:0198506732, PMID:7515813]
+comment: This term was obsoleted because it is more specific than the specificity of any known gene product. ICAM-3 is a ligand of the ITGAL:ITGB2, ITGAD:ITGB2, and CD209 receptors.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30560" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0004888
 
 [Term]
 id: GO:0030370
@@ -178850,7 +178976,7 @@
 synonym: "D-alanine formation" EXACT []
 synonym: "D-alanine synthesis" EXACT []
 is_a: GO:0006523 ! alanine biosynthetic process
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0030633
@@ -179758,7 +179884,7 @@
 synonym: "polar granule organisation" EXACT []
 synonym: "polar granule organization and biogenesis" EXACT [GOC:dph, GOC:tb]
 is_a: GO:0006996 ! organelle organization
-relationship: part_of GO:0007315 ! pole plasm assembly
+relationship: part_of GO:0007315 ! germ plasm assembly
 
 [Term]
 id: GO:0030720
@@ -180172,11 +180298,15 @@
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
 
@@ -182369,7 +182499,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the forebrain over time, from its formation to the mature structure. The forebrain is the anterior of the three primary divisions of the developing chordate brain or the corresponding part of the adult brain (in vertebrates, includes especially the cerebral hemispheres, the thalamus, and the hypothalamus and especially in higher vertebrates is the main control center for sensory and associative information processing, visceral functions, and voluntary motor functions)." [PMID:4975589, PMID:4992177]
 synonym: "prosencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182378,7 +182508,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the midbrain over time, from its formation to the mature structure. The midbrain is the middle division of the three primary divisions of the developing chordate brain or the corresponding part of the adult brain (in vertebrates, includes a ventral part containing the cerebral peduncles and a dorsal tectum containing the corpora quadrigemina and that surrounds the aqueduct of Sylvius connecting the third and fourth ventricles)." [PMID:4975589, PMID:4992177]
 synonym: "mesencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182387,7 +182517,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the hindbrain over time, from its formation to the mature structure. The hindbrain is the posterior of the three primary divisions of the developing chordate brain, or the corresponding part of the adult brain (in vertebrates, includes the cerebellum, pons, and medulla oblongata and controls the autonomic functions and equilibrium)." [PMID:4975589, PMID:4992177]
 synonym: "rhombencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182520,7 +182650,7 @@
 synonym: "isthmus development" EXACT []
 synonym: "MHB development" EXACT []
 synonym: "midbrain-hindbrain orgainizer development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 relationship: part_of GO:0021903 ! rostrocaudal neural tube patterning
 
@@ -182738,18 +182868,25 @@
 
 [Term]
 id: GO:0030943
-name: mitochondrion targeting sequence binding
+name: obsolete mitochondrion targeting sequence binding
 namespace: molecular_function
-def: "Binding to a mitochondrion targeting sequence, a specific peptide sequence that acts as a signal to localize the protein within the mitochondrion." [GOC:mah]
+def: "OBSOLETE. Binding to a mitochondrion targeting sequence, a specific peptide sequence that acts as a signal to localize the protein within the mitochondrion." [GOC:mah]
+comment: This term was obsoleted in favor of more specific molecular functions.
 synonym: "mitochondrial targeting sequence binding" EXACT []
-is_a: GO:0005048 ! signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32142" xsd:anyURI
+is_obsolete: true
+consider: GO:0008320
+consider: GO:0140436
 
 [Term]
 id: GO:0030944
-name: DDEL sequence binding
+name: obsolete DDEL sequence binding
 namespace: molecular_function
-def: "Binding to a KDEL sequence, the C terminus tetrapeptide sequence Asp-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [GOC:mah]
-is_a: GO:0046923 ! ER lumen protein retrieval receptor activity
+def: "OBSOLETE. Binding to a KDEL sequence, the C terminus tetrapeptide sequence Asp-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [GOC:mah]
+comment: This term was obsoleted because it represents a specific substrate.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046923
 
 [Term]
 id: GO:0030945
@@ -183028,8 +183165,8 @@
 synonym: "protein dislocation from ER" EXACT [GOC:dph, GOC:krc]
 synonym: "protein retrotranslocation, ER to cytosol" EXACT [GOC:bf]
 synonym: "retrograde protein transport, endoplasmic reticulum to cytosol" EXACT []
-is_a: GO:0032527 ! protein exit from endoplasmic reticulum
-is_a: GO:1903513 ! endoplasmic reticulum to cytosol transport
+is_a: GO:0010496 ! intercellular transport
+is_a: GO:0015031 ! protein transport
 relationship: part_of GO:0036503 ! ERAD pathway
 
 [Term]
@@ -183486,7 +183623,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endocrine pancreas over time, from its formation to the mature structure. The endocrine pancreas is made up of islet cells that produce insulin, glucagon and somatostatin." [GOC:cvs]
 xref: Reactome:R-HSA-186712 "Regulation of beta-cell development"
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0031016 ! pancreas development
 relationship: part_of GO:0035270 ! endocrine system development
 
@@ -185035,9 +185172,10 @@
 synonym: "phosphatidylinositol degradation" EXACT []
 synonym: "PtdIns catabolic process" EXACT []
 synonym: "PtdIns catabolism" EXACT []
-is_a: GO:0009056 ! catabolic process
+is_a: GO:0046475 ! glycerophospholipid catabolic process
 is_a: GO:0046488 ! phosphatidylinositol metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31854" xsd:anyURI
 
 [Term]
 id: GO:0031162
@@ -185347,6 +185485,7 @@
 namespace: biological_process
 def: "The precipitation of calcium carbonate onto the organic matrix of a shell, such as a mollusc shell." [GOC:mah, PMID:15132736]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0031216
@@ -193006,14 +193145,22 @@
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
@@ -199159,14 +199306,15 @@
 
 [Term]
 id: GO:0032527
-name: protein exit from endoplasmic reticulum
+name: obsolete protein exit from endoplasmic reticulum
 namespace: biological_process
-def: "The directed movement of proteins from the endoplasmic reticulum." [GOC:rb]
-synonym: "protein exit from ER" EXACT []
-synonym: "protein export from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "protein export from ER" EXACT [GOC:mah]
-is_a: GO:0006886 ! intracellular protein transport
-relationship: occurs_in GO:0005737 ! cytoplasm
+def: "OBSOLETE. The directed movement of proteins from the endoplasmic reticulum." [GOC:rb]
+comment: The reason for obsoletion is that this term conflated multiple distinct processes (retrograde transport from ER to cytosol, transmembrane transport of small molecules, and COPII-vesicle-mediated trafficking) and was used inconsistently. For COPII-vesicle-mediated forward transport from the ER, consider GO:0090114 'COPII-coated vesicle budding' or GO:0006888 'endoplasmic reticulum to Golgi vesicle-mediated transport'. For retrograde transport of misfolded proteins from ER to cytosol, consider GO:0030970 'retrograde protein transport, ER to cytosol'.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
+consider: GO:0006888
+consider: GO:0030970
+consider: GO:0090114
 
 [Term]
 id: GO:0032528
@@ -203628,7 +203776,7 @@
 namespace: biological_process
 def: "The progression of the glomerulus over time from its initial formation until its mature state. The glomerulus is a capillary tuft which forms a close network with the visceral epithelium (podocytes) and the mesangium to form the filtration barrier and is surrounded by Bowman's capsule in nephrons of the vertebrate kidney. The glomerulus is part of the nephron and is restricted to one body segment." [GOC:mah, GOC:mtg_kidney_jan10]
 synonym: "glomerular development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072006 ! nephron development
 
 [Term]
@@ -208888,14 +209036,17 @@
 
 [Term]
 id: GO:0033328
-name: peroxisome membrane targeting sequence binding
+name: obsolete peroxisome membrane targeting sequence binding
 namespace: molecular_function
-def: "Binding to a peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane." [GOC:rb, PMID:15133130, PMID:17020786]
+def: "OBSOLETE. Binding to a peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane." [GOC:rb, PMID:15133130, PMID:17020786]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "mPTS binding" EXACT []
 synonym: "peroxisomal membrane protein (PMP) targeting signal (mPTS) binding" EXACT [PMID:14709540]
 synonym: "PMP targeting signal (mPTS) binding" EXACT [PMID:14709540]
 synonym: "PMP targeting signal binding" EXACT [PMID:14709540]
-is_a: GO:0000268 ! peroxisome signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000268
 
 [Term]
 id: GO:0033329
@@ -210832,7 +210983,7 @@
 name: floor plate development
 namespace: biological_process
 def: "The progression of the floor plate over time from its initial formation until its mature state." [GOC:dh]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021915 ! neural tube development
 
 [Term]
@@ -211257,20 +211408,32 @@
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
@@ -218902,6 +219065,7 @@
 id: GO:0034079
 name: butanediol biosynthetic process
 namespace: biological_process
+alt_id: GO:0030646
 def: "The chemical reactions and pathways resulting in the formation of butanediol; the biologically relevant isomer is 2,3-butanediol." [GOC:mah, MetaCyc:P125-PWY]
 synonym: "butanediol anabolism" EXACT []
 synonym: "butanediol biosynthesis" EXACT []
@@ -221970,7 +222134,6 @@
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:exactMatch MetaCyc:NADSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5653
@@ -223574,6 +223737,7 @@
 def: "The process in which calcium salts are deposited into calcareous tooth structures such as dental enamel, dentin and cementum." [GOC:mah, MP:0002817, MSH:D014074]
 synonym: "tooth calcification" EXACT []
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0042476 ! odontogenesis
 
 [Term]
@@ -224675,7 +224839,6 @@
 xref: MetaCyc:PYRIDNUCSYN-PWY
 is_a: GO:0006531 ! aspartate metabolic process
 is_a: GO:0009435 ! NAD+ biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-8277
 property_value: skos:narrowMatch MetaCyc:PWY-8352
@@ -230795,6 +230958,7 @@
 namespace: biological_process
 def: "Progression of the endocrine system over time, from its formation to a mature structure. The endocrine system is a system of hormones and ductless glands, where the glands release hormones directly into the blood, lymph or other intercellular fluid, and the hormones circulate within the body to affect distant organs. The major glands that make up the human endocrine system are the hypothalamus, pituitary, thyroid, parathryoids, adrenals, pineal body, and the reproductive glands which include the ovaries and testes." [GOC:bf, Wikipedia:Development_of_the_endocrine_system]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0035271
@@ -230811,6 +230975,7 @@
 namespace: biological_process
 def: "Progression of the exocrine system over time, from its formation to a mature structure. The exocrine system is a system of hormones and glands, where the glands secrete straight to a target site via ducts or tubes. The human exocrine system includes the salivary glands, sweat glands and many glands of the digestive system." [GOC:bf, Wikipedia:Exocrine_gland]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0035273
@@ -233434,6 +233599,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud tube that contributes to the morphogenesis of the metanephros." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0003338 ! metanephros morphogenesis
 created_by: bf
@@ -233445,6 +233611,7 @@
 namespace: biological_process
 def: "The development of the portion of the ureteric bud that contributes to the morphogenesis of the ureter. The ureter ureteric bud is the initial structure that forms the ureter." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001657 ! ureteric bud development
 relationship: part_of GO:0072197 ! ureter morphogenesis
 created_by: bf
@@ -235445,6 +235612,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an ovary that produces an ovule over time, from its formation to the mature structure. The ovary is the enlarged basal portion of a carpel and matures into a fruit. An ovule is the multicellular structure that gives rise to and contains the female reproductive cells, and develops into a seed." [GOC:bf, GOC:tb, ISBN:0879015322]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 created_by: bf
 creation_date: 2011-02-04T09:35:05Z
@@ -236896,7 +237064,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the adrenal cortex over time, from its formation to the mature structure. The adrenal cortex is located at the periphery of the adrenal gland and controls glucose and electrolyte metabolism, response to stress and sexual development through the production of different classes of steroid hormones (glucocorticoids, mineralocorticoids and androgens)." [PMID:12185666, PMID:21115154, Wikipedia:Adrenal_cortex]
 synonym: "adrenal gland cortex development" EXACT [MA:0000118]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030325 ! adrenal gland development
 created_by: bf
 creation_date: 2011-04-18T10:25:39Z
@@ -237432,7 +237600,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cloaca over time, from it's formation to the mature structure. The cloaca is the common chamber into which intestinal, genital and urinary canals open in vertebrates." [GOC:dgh, ISBN:0582227089]
 synonym: "cloacal development" EXACT [GOC:bf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001655 ! urogenital system development
 relationship: part_of GO:0048546 ! digestive tract morphogenesis
 created_by: bf
@@ -237845,7 +238013,7 @@
 name: nail development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a nail over time, from its formation to the mature structure. A nail is a horn-like envelope covering the outer end of a finger or toe, and consists of the nail plate, the nail matrix and the nail bed below it, and the grooves surrounding it." [GOC:bf, ISBN:0323025781, UBERON:0001705, Wikipedia:Nail_(anatomy)]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060173 ! limb development
 created_by: bf
 creation_date: 2011-05-31T02:30:34Z
@@ -238181,7 +238349,7 @@
 name: ascending aorta development
 namespace: biological_process
 def: "The progression of the ascending aorta over time, from its initial formation to the mature structure. The ascending aorta is the portion of the aorta in a two-pass circulatory system that lies between the heart and the arch of aorta. In a two-pass circulatory system blood passes twice through the heart to supply the body once." [GOC:bf, GOC:dgh, MA:0002570, UBERON:0001496, Wikipedia:Ascending_aorta]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035904 ! aorta development
 created_by: bf
 creation_date: 2011-06-24T11:02:01Z
@@ -238191,7 +238359,7 @@
 name: descending aorta development
 namespace: biological_process
 def: "The progression of the descending aorta over time, from its initial formation to the mature structure. The descending aorta is the portion of the aorta in a two-pass circulatory system from the arch of aorta to the point where it divides into the common iliac arteries. In a two-pass circulatory system blood passes twice through the heart to supply the body once." [GOC:bf, GOC:dgh, MA:0002571, UBERON:0001514, Wikipedia:Descending_aorta]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035904 ! aorta development
 created_by: bf
 creation_date: 2011-06-24T11:05:22Z
@@ -239287,7 +239455,7 @@
 name: deltoid tuberosity development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the deltoid tuberosity over time, from its formation to the mature structure. The deltoid tuberosity is the region on the shaft of the humerus to which the deltoid muscle attaches. The deltoid tuberosity develops through endochondral ossification in a two-phase process; an initiating tendon-dependent phase, and a muscle-dependent growth phase." [GOC:yaf, PMID:17567668, UBERON:0002498, Wikipedia:Deltoid_tuberosity]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060173 ! limb development
 relationship: part_of GO:0060348 ! bone development
 created_by: bf
@@ -240639,25 +240807,29 @@
 
 [Term]
 id: GO:0036105
-name: peroxisome membrane class-1 targeting sequence binding
+name: obsolete peroxisome membrane class-1 targeting sequence binding
 namespace: molecular_function
-def: "Binding to a class I peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane in a PEX19-dependent manner." [GOC:pm, PMID:14709540, PMID:17020786]
-comment: Currently identified mPTSs vary greatly in length, and cannot be distinguished by primary structure analysis, suggesting that the peroxisomal sorting information is not contained within a specific amino acid sequence. There do however appear to be two classes of mPTSs: class 1 mPTSs that are bound by PEX19 and imported in a PEX19-dependent manner, and class 2 mPTSs that are not bound by PEX19 and mediate protein import independently of PEX19. The two classes cannot be defined based on their amino acid sequence.
+def: "OBSOLETE. Binding to a class I peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane in a PEX19-dependent manner." [GOC:pm, PMID:14709540, PMID:17020786]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "class 1 mPTS binding" EXACT [PMID:14709540]
 synonym: "PEX19-dependent mPTS binding" RELATED [PMID:14709540]
-is_a: GO:0033328 ! peroxisome membrane targeting sequence binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000268
 created_by: bf
 creation_date: 2012-01-27T02:02:22Z
 
 [Term]
 id: GO:0036106
-name: peroxisome membrane class-2 targeting sequence binding
+name: obsolete peroxisome membrane class-2 targeting sequence binding
 namespace: molecular_function
-def: "Binding to a class II peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane in a PEX19-independent manner." [GOC:pm, PMID:14709540, PMID:17020786]
-comment: Currently identified mPTSs vary greatly in length, and cannot be distinguished by primary structure analysis, suggesting that the peroxisomal sorting information is not contained within a specific amino acid sequence. There do however appear to be two classes of mPTSs: class 1 mPTSs that are bound by PEX19 and imported in a PEX19-dependent manner, and class 2 mPTSs that are not bound by PEX19 and mediate protein import independently of PEX19. The two classes cannot be defined based on their amino acid sequence.
+def: "OBSOLETE. Binding to a class II peroxisomal membrane targeting sequence, any of several sequences of amino acids within a protein that can act as a signal for the localization of the protein into the peroxisome membrane in a PEX19-independent manner." [GOC:pm, PMID:14709540, PMID:17020786]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "class 2 mPTS binding" EXACT [PMID:14709540]
 synonym: "PEX19-independent mPTS binding" RELATED [PMID:14709540]
-is_a: GO:0033328 ! peroxisome membrane targeting sequence binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000268
 created_by: bf
 creation_date: 2012-01-27T02:02:22Z
 
@@ -243020,7 +243192,7 @@
 name: atrioventricular canal development
 namespace: biological_process
 def: "The progression of the atrioventricular canal over time, from its formation to the mature structure. The atrioventricular canal is the part of the heart connecting the atrium to the cardiac ventricle." [GOC:BHF, GOC:gr, PMID:14701881, UBERON:0002087, ZFA:0001315]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: bf
 creation_date: 2012-08-08T09:55:37Z
@@ -243059,7 +243231,7 @@
 name: embryonic heart tube elongation
 namespace: biological_process
 def: "The developmental growth that results in the increase in length of the embryonic heart tube. The embryonic heart tube is an epithelial tube that will give rise to the mature heart." [GOC:BHF, GOC:gr, PMID:15901664]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035050 ! embryonic heart tube development
 created_by: bf
 creation_date: 2012-08-08T13:54:37Z
@@ -243417,6 +243589,7 @@
 synonym: "chitin-based cuticle hardening by biomineralisation" EXACT [GOC:bf]
 is_a: GO:0007593 ! chitin-based cuticle sclerotization
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: bf
 creation_date: 2012-09-11T13:50:04Z
 
@@ -243752,12 +243925,16 @@
 
 [Term]
 id: GO:0036368
-name: cone photoresponse recovery
+name: photoresponse recovery
 namespace: biological_process
-def: "The processes required for a cone photoreceptor to recover, following light activation, so that it can respond to a subsequent light stimulus. Cone recovery requires the shutoff of active participants in the phototransduction cascade, including the visual pigment and downstream signal transducers." [GOC:gap, PMID:16039565, PMID:22802362]
+def: "The processes required for a photoreceptor to recover, following light activation, so that it can respond to a subsequent light stimulus. Photoreceptor recovery requires the shutoff of active participants in the phototransduction cascade, including the visual pigment and downstream signal transducers." [PMID:16039565, PMID:22802362]
+synonym: "cone photoresponse recovery" NARROW []
 synonym: "cone phototransduction termination" RELATED [GOC:bf]
-synonym: "cone response recovery" EXACT [PMID:12732716]
+synonym: "cone response recovery" NARROW [PMID:12732716]
+synonym: "rod photoresponse recovery" NARROW []
+synonym: "rod response recovery" NARROW []
 is_a: GO:0009416 ! response to light stimulus
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32182" xsd:anyURI
 created_by: bf
 creation_date: 2012-09-26T14:35:20Z
 
@@ -243905,17 +244082,18 @@
 
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
-is_a: GO:0042368 ! vitamin D biosynthetic process
-is_a: GO:0046173 ! polyol biosynthetic process
-is_a: GO:0070640 ! vitamin D3 metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32077" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901755
 created_by: bf
 creation_date: 2013-05-15T11:46:08Z
 
@@ -246255,15 +246433,12 @@
 synonym: "transport receptor activity" BROAD [GOC:signaling]
 xref: Reactome:R-HSA-203716 "eNOS:Caveolin-1 complex binds to Nostrin"
 xref: Reactome:R-HSA-2160915 "Receptor-mediated uptake of HA"
-xref: Reactome:R-HSA-2248891 "M6PR transports activated ARSA to the lysosome"
 xref: Reactome:R-HSA-3000103 "CUBN:AMN binds CBLIF:RCbl"
 xref: Reactome:R-HSA-3000112 "CD320-mediated TCN2:RCbl uptake and delivery to lysosome"
 xref: Reactome:R-HSA-3000122 "CD320 binds extracellular TCN2:RCbl"
 xref: Reactome:R-HSA-3000137 "CUBN:AMN-mediated CBLIF:RCbl uptake and delivery to lysosome"
 xref: Reactome:R-HSA-350168 "LRP2-mediated uptake of extracellular CUBN:GC:25(OH)D"
 xref: Reactome:R-HSA-350186 "CUBN binds GC:25(OH)D"
-xref: Reactome:R-HSA-9662747 "iRHOM2 transports ADAM17 from ER to the Golgi-network"
-xref: Reactome:R-HSA-9662818 "iRHOM2 transports ADAM17:Zn2+ from Golgi to the plasma membrane"
 xref: Reactome:R-HSA-9759202 "LRP2-mediated TCN2:RCbl uptake and delivery to lysosome"
 xref: Reactome:R-HSA-9759209 "LRP2 binds extracellular TCN2:RCbl"
 is_a: GO:0003674 ! molecular_function
@@ -248520,7 +248695,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the rectal diverticulum over time, from its formation to the mature structure. The rectal diverticulum is an outgrowth of the cloaca and links the pronephric kidney to the exterior." [GOC:mtg_kidney_jan10, PMID:10535314, PMID:18226983, XAO:0001015]
 synonym: "pronephric rectal diverticulum development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T09:48:58Z
@@ -248554,7 +248729,7 @@
 name: pronephric sinus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pronephric sinus over time, from its formation to the mature structure. The pronephric sinus is an ill-defined capillary network that lies between the pronephric tubules." [GOC:mtg_kidney_jan10, PMID:10535314, XAO:0000385]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T09:55:23Z
@@ -248627,7 +248802,7 @@
 name: nephrostome development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the nephrostome over time, from its formation to the mature structure. The nephrostome is the opening of the pronephros into the body cavity." [GOC:mtg_kidney_jan10, PMID:14686690, PMID:15647339, XAO:0000062]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T10:08:16Z
@@ -251448,6 +251623,7 @@
 synonym: "collagen and cuticulin-based cuticle formation" EXACT []
 synonym: "collagen and cuticulin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040003
@@ -251459,6 +251635,7 @@
 synonym: "chitin-based cuticle formation" EXACT []
 synonym: "chitin-based cuticle synthesis" EXACT []
 is_a: GO:0042335 ! cuticle development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0040004
@@ -254121,6 +254298,7 @@
 def: "The regrowth of lost or destroyed tissues." [GOC:curators]
 is_a: GO:0031099 ! regeneration
 is_a: GO:0048589 ! developmental growth
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0042247
@@ -255925,7 +256103,6 @@
 synonym: "carnitine degradation" EXACT []
 synonym: "vitamin Bt catabolic process" EXACT []
 synonym: "vitamin Bt catabolism" EXACT []
-xref: MetaCyc:
 xref: MetaCyc:CARNMET-PWY
 xref: MetaCyc:PWY-3602
 xref: MetaCyc:PWY-3641
@@ -257897,7 +258074,6 @@
 synonym: "P-P-bond-hydrolysis-driven transmembrane transporter activity" BROAD []
 synonym: "P-P-bond-hydrolysis-driven transporter" BROAD []
 xref: EC:7.2.2.-
-xref: Reactome:R-HSA-1222523 "SodB gets secreted"
 xref: Reactome:R-HSA-1454916 "The ABCC family mediates organic anion transport"
 xref: Reactome:R-HSA-1467457 "ABCA8,B1,B5 transport xenobiotics from cytosol to extracellular region"
 xref: Reactome:R-HSA-2161506 "abacavir [cytosol] + ATP + H2O => abacavir[extracellular] + ADP + phosphate"
@@ -260373,7 +260549,7 @@
 xref: MetaCyc:ALACAT2-PWY
 xref: MetaCyc:ALADEG-PWY
 xref: MetaCyc:ALANINE-DEG3-PWY
-is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:ALACAT2-PWY
 property_value: skos:narrowMatch MetaCyc:ALADEG-PWY
@@ -266184,8 +266360,8 @@
 synonym: "homocysteine catabolism" EXACT []
 synonym: "homocysteine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
+is_a: GO:0009063 ! amino acid catabolic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
 
@@ -274970,8 +275146,6 @@
 synonym: "chaperone activity" BROAD []
 synonym: "protein binding involved in protein folding" EXACT []
 xref: Reactome:R-HSA-9018785 "RHOBTB2 binds GTP"
-xref: Reactome:R-HSA-9683772 "Trimmed spike protein binds to calnexin"
-xref: Reactome:R-HSA-9694337 "Trimmed spike protein binds to calnexin"
 xref: Reactome:R-HSA-9855212 "SDHA binds to SDHB"
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
@@ -277110,7 +277284,7 @@
 synonym: "envenomation resulting in induction of edema in another organism" EXACT []
 synonym: "envenomation resulting in induction of edema in other organism" EXACT []
 synonym: "envenomation resulting in induction of oedema in other organism" EXACT []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 created_by: jl
@@ -278010,7 +278184,7 @@
 def: "A process in which an organism alters or subverts mast cell degranulation in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21549739]
 synonym: "envenomation resulting in modulation of mast cell degranulation in another organism" EXACT []
 synonym: "envenomation resulting in modulation of mast cell degranulation in other organism" EXACT []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 created_by: jl
 creation_date: 2012-01-19T02:51:51Z
@@ -278115,9 +278289,11 @@
 synonym: "envenomation resulting in modulation of conduction of nerve impulse in other organism" EXACT [GOC:dph]
 synonym: "envenomation resulting in modulation of transmission of nerve impulse in another organism" EXACT []
 synonym: "envenomation resulting in modulation of transmission of nerve impulse in other organism" EXACT []
+synonym: "venom-mediated perturbation of neuronal signaling" BROAD []
 is_a: GO:0140136 ! venom-mediated perturbation of nervous system process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32180" xsd:anyURI
 created_by: jl
 creation_date: 2012-01-26T05:01:54Z
 
@@ -278704,6 +278880,9 @@
 xref: RHEA:78631
 xref: RHEA:78847
 xref: RHEA:83047
+xref: RHEA:83115
+xref: RHEA:85319
+xref: RHEA:85323
 is_a: GO:0003997 ! acyl-CoA oxidase activity
 property_value: skos:exactMatch RHEA:78847
 property_value: skos:narrowMatch RHEA:39119
@@ -278711,6 +278890,9 @@
 property_value: skos:narrowMatch RHEA:40319
 property_value: skos:narrowMatch RHEA:78631
 property_value: skos:narrowMatch RHEA:83047
+property_value: skos:narrowMatch RHEA:83115
+property_value: skos:narrowMatch RHEA:85319
+property_value: skos:narrowMatch RHEA:85323
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24703" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28733" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -279257,7 +279439,6 @@
 namespace: biological_process
 def: "The chemical reactions a resulting in the resulting in the breakdown of butyryl-CoA." [GOC:jl]
 synonym: "butyryl-CoA catabolism" EXACT []
-is_a: GO:0009062 ! fatty acid catabolic process
 is_a: GO:0036115 ! fatty-acyl-CoA catabolic process
 created_by: jl
 creation_date: 2012-04-19T04:28:46Z
@@ -280020,14 +280201,14 @@
 
 [Term]
 id: GO:0044646
-name: obsolete envenomation resulting in modulation of complement activation in another organism
+name: venom-mediated perturbation of complement activation
 namespace: biological_process
-def: "OBSOLETE. A process that begins with venom being forced into an organism by the bite or sting of another organism, and ends with the resultant modulation of complement activation in the bitten/stung organism." [GOC:fj, GOC:jl, PMID:20837040]
-comment: This term was obsoleted because it is too specific.
+def: "A process in which an organism activates or inhibits the complement system in another organism via the action of a venom." [GOC:fj, PMID:20417224, PMID:20837040, PMID:27846429, PMID:35622591]
 synonym: "envenomation resulting in modulation of complement activation in other organism" EXACT []
 synonym: "envenomation resulting in regulation of complement activation in other organism" EXACT []
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26389" xsd:anyURI
-is_obsolete: true
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32070" xsd:anyURI
 created_by: jl
 creation_date: 2012-07-11T12:49:28Z
 
@@ -280489,13 +280670,14 @@
 def: "Catalysis of the reaction: 7,8-dihydro-D-neopterin 2',3'-cyclic phosphate + H2O = 7,8-dihydroneopterin 3'-phosphate or 7,8-dihydroneopterin 2'-phosphate + H+." [EC:3.1.4.56]
 xref: EC:3.1.4.56
 xref: MetaCyc:RXN-12356
-xref: MetaCyc:RXN-12357 {xref="skos:narrowMatch"}
+xref: MetaCyc:RXN-12357
 xref: RHEA:35799
 xref: RHEA:35803
 is_a: GO:0008081 ! phosphoric diester hydrolase activity
 relationship: part_of GO:2001116 ! methanopterin-containing compound biosynthetic process
 property_value: skos:exactMatch EC:3.1.4.56
 property_value: skos:narrowMatch MetaCyc:RXN-12356
+property_value: skos:narrowMatch MetaCyc:RXN-12357
 property_value: skos:narrowMatch RHEA:35799
 property_value: skos:narrowMatch RHEA:35803
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
@@ -280525,7 +280707,7 @@
 namespace: biological_process
 def: "The tooth development process in which the teeth enter the mouth and become visible." [Wikipedia:Tooth_eruption]
 xref: Wikipedia:Tooth_eruption
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0042476 ! odontogenesis
 created_by: jl
 creation_date: 2012-08-15T14:58:17Z
@@ -282524,11 +282706,14 @@
 
 [Term]
 id: GO:0045015
-name: HDEL sequence binding
+name: obsolete HDEL sequence binding
 namespace: molecular_function
-def: "Binding to a HDEL sequence, the C terminus tetrapeptide sequence His-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [PMID:1327759]
+def: "OBSOLETE. Binding to a HDEL sequence, the C terminus tetrapeptide sequence His-Asp-Glu-Leu found in proteins that are to be retained in the endoplasmic reticulum." [PMID:1327759]
+comment: This term was obsoleted because it represents a specific substrate.
 synonym: "HDEL receptor activity" NARROW []
-is_a: GO:0046923 ! ER lumen protein retrieval receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046923
 
 [Term]
 id: GO:0045016
@@ -283041,7 +283226,7 @@
 def: "The process in which a relatively unspecialized T cell acquires the specialized features of a T-helper 1 (Th1) cell. A Th1 cell is a CD4-positive, alpha-beta T cell that has the phenotype T-bet-positive and produces interferon-gamma." [CL:0000545, GOC:ebc]
 comment: Note that immunologists typically use the word 'development' to refer to cells of B or T cell lineages undergoing the process that GO describes as 'cell differentiation'.
 synonym: "T-helper 1 cell development" RELATED [GOC:add]
-xref: Reactome:R-HSA-9942503 "Differentiation of naive CD4+ T cells to T helper 1 cells (Th1 cells)"
+xref: Reactome:R-HSA-9942503 "Differentiation of naive CD+ T cells to T helper 1 cells (Th1 cells)"
 is_a: GO:0002287 ! alpha-beta T cell activation involved in immune response
 is_a: GO:0002292 ! T cell differentiation involved in immune response
 is_a: GO:0042093 ! T-helper cell differentiation
@@ -285416,6 +285601,7 @@
 namespace: biological_process
 def: "The precipitation of specific crystal forms of calcium carbonate with extracellular matrix proteins in the otolith organs of the vertebrate inner ear." [GOC:dsf, PMID:15581873]
 is_a: GO:0031214 ! biomineral tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048840 ! otolith development
 
 [Term]
@@ -286290,14 +286476,17 @@
 
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
@@ -286785,12 +286974,15 @@
 
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
@@ -291682,38 +291874,42 @@
 
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
@@ -298912,11 +299108,13 @@
 
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
@@ -299185,16 +299383,16 @@
 
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
@@ -299774,8 +299972,9 @@
 synonym: "phosphoinositide metabolism" EXACT []
 synonym: "PtdIns metabolic process" EXACT []
 synonym: "PtdIns metabolism" EXACT []
-is_a: GO:0006793 ! phosphorus metabolic process
+is_a: GO:0006650 ! glycerophospholipid metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31854" xsd:anyURI
 
 [Term]
 id: GO:0046490
@@ -301162,27 +301361,32 @@
 
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
@@ -302390,6 +302594,7 @@
 xref: Wikipedia:Decidualization
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001893 ! maternal placenta development
 
 [Term]
@@ -304667,8 +304872,14 @@
 name: ER lumen protein retrieval receptor activity
 namespace: molecular_function
 def: "Binding to an endoplasmic reticulum (ER) retention sequence, a short stretch of amino acids found in a protein that acts as a signal to retain the protein within the ER." [GOC:ai]
+synonym: "DDEL sequence binding" NARROW []
+synonym: "DDEL signal sequence receptor activity" NARROW []
 synonym: "endoplasmic reticulum retention sequence binding" EXACT []
 synonym: "ER retention sequence binding" NARROW []
+synonym: "HDEL sequence binding" NARROW []
+synonym: "HDEL signal sequence receptor activity" NARROW []
+synonym: "KDEL sequence binding" NARROW []
+synonym: "KDEL signal sequence receptor activity" NARROW []
 is_a: GO:0005048 ! signal sequence receptor activity
 
 [Term]
@@ -306433,7 +306644,7 @@
 synonym: "NADP-dependent testosterone-17beta-oxidoreductase activity" RELATED [EC:1.1.1.64]
 synonym: "testosterone 17-beta-dehydrogenase (NADP+) activity" RELATED []
 synonym: "testosterone 17beta-dehydrogenase (NADP+)" RELATED [EC:1.1.1.64]
-xref: EC:1.1.1.64 {status="skos:exactMatch"}
+xref: EC:1.1.1.64
 xref: KEGG_REACTION:R01838
 xref: MetaCyc:1.1.1.64-RXN
 xref: Reactome:R-HSA-193064 "HSD17B3-like proteins reducde ANDST to TEST"
@@ -308044,6 +308255,7 @@
 xref: RHEA:13109
 xref: RHEA:13113
 is_a: GO:0046857 ! oxidoreductase activity, acting on other nitrogenous compounds as donors, with NAD or NADP as acceptor
+property_value: skos:exactMatch EC:1.7.1.12
 property_value: skos:narrowMatch RHEA:13109
 property_value: skos:narrowMatch RHEA:13113
 
@@ -309058,6 +309270,9 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
+xref: RHEA:86879
+xref: RHEA:86891
+xref: RHEA:86895
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
@@ -309066,6 +309281,9 @@
 property_value: skos:narrowMatch RHEA:74807
 property_value: skos:narrowMatch RHEA:74811
 property_value: skos:narrowMatch RHEA:74823
+property_value: skos:narrowMatch RHEA:86879
+property_value: skos:narrowMatch RHEA:86891
+property_value: skos:narrowMatch RHEA:86895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -311201,7 +311419,7 @@
 xref: EC:2.6.1.40
 xref: KEGG_REACTION:R02050
 xref: MetaCyc:2.6.1.40-RXN
-xref: Reactome:R-HSA-909780 "(R)-3-amino-2-methylpropanoate + pyruvate => 2-methyl-3-oxopropanoate + L-alanine"
+xref: Reactome:R-HSA-909780 "(R)-3-aminoisobutyric acid + pyruvate => 2-methyl-3-oxopropanoate + alanine"
 xref: RHEA:18393
 is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch EC:2.6.1.40
@@ -312476,19 +312694,25 @@
 xref: Reactome:R-HSA-426043 "2-AG hydrolysis to arachidonate by MAGL"
 xref: Reactome:R-HSA-5694462 "ABHD6,12 hydrolyse 3AG"
 xref: RHEA:15245
+xref: RHEA:26132
 xref: RHEA:32875
 xref: RHEA:34019
 xref: RHEA:38363
 xref: RHEA:38487
 xref: RHEA:38491
 xref: RHEA:39959
+xref: RHEA:39963
+xref: RHEA:40603
 xref: RHEA:40607
 xref: RHEA:44312
 xref: RHEA:44316
 xref: RHEA:44320
+xref: RHEA:44328
 xref: RHEA:44688
 xref: RHEA:44728
+xref: RHEA:44732
 xref: RHEA:47072
+xref: RHEA:48428
 xref: RHEA:58040
 xref: RHEA:58076
 xref: RHEA:58080
@@ -312504,19 +312728,25 @@
 property_value: skos:exactMatch EC:3.1.1.23
 property_value: skos:exactMatch MetaCyc:RXN-19280
 property_value: skos:exactMatch RHEA:15245
+property_value: skos:narrowMatch RHEA:26132
 property_value: skos:narrowMatch RHEA:32875
 property_value: skos:narrowMatch RHEA:34019
 property_value: skos:narrowMatch RHEA:38363
 property_value: skos:narrowMatch RHEA:38487
 property_value: skos:narrowMatch RHEA:38491
 property_value: skos:narrowMatch RHEA:39959
+property_value: skos:narrowMatch RHEA:39963
+property_value: skos:narrowMatch RHEA:40603
 property_value: skos:narrowMatch RHEA:40607
 property_value: skos:narrowMatch RHEA:44312
 property_value: skos:narrowMatch RHEA:44316
 property_value: skos:narrowMatch RHEA:44320
+property_value: skos:narrowMatch RHEA:44328
 property_value: skos:narrowMatch RHEA:44688
 property_value: skos:narrowMatch RHEA:44728
+property_value: skos:narrowMatch RHEA:44732
 property_value: skos:narrowMatch RHEA:47072
+property_value: skos:narrowMatch RHEA:48428
 property_value: skos:narrowMatch RHEA:58040
 property_value: skos:narrowMatch RHEA:58076
 property_value: skos:narrowMatch RHEA:58080
@@ -314675,6 +314905,8 @@
 comment: This term was made obsolete because it represents information outside the scope of GO.
 synonym: "calcium-dependent cytosolic phospholipase A2 activity" NARROW []
 synonym: "calcium-dependent secreted phospholipase A2 activity" NARROW []
+xref: Reactome:R-HSA-111881 "Phospho-cPLA2 translocates to membranes when intracellular calcium levels increase"
+xref: Reactome:R-HSA-111883 "PLA2G4A (cPLA2) hydrolyzes phosphatidylcholine"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28324" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31061" xsd:anyURI
@@ -314688,6 +314920,7 @@
 def: "OBSOLETE. Catalysis of the reaction: phosphatidylcholine + H2O = 1-acylglycerophosphocholine + a carboxylate. This reaction does not require Ca2+." [PMID:34831185]
 comment: This term was made obsolete because it represents information outside the scope of GO.
 synonym: "calcium-independent cytosolic phospholipase A2 activity" NARROW []
+xref: Reactome:R-HSA-8952251 "PLA2G15 hydrolyses LPC to GPCho and LCFA(-)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28324" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31061" xsd:anyURI
@@ -317959,10 +318192,12 @@
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
@@ -321466,6 +321701,10 @@
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
@@ -321475,6 +321714,10 @@
 property_value: skos:narrowMatch RHEA:65552
 property_value: skos:narrowMatch RHEA:65556
 property_value: skos:narrowMatch RHEA:77675
+property_value: skos:narrowMatch RHEA:86911
+property_value: skos:narrowMatch RHEA:86915
+property_value: skos:narrowMatch RHEA:86919
+property_value: skos:narrowMatch RHEA:86923
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -322951,7 +323194,6 @@
 xref: EC:2.3.1.13
 xref: MetaCyc:GLYCINE-N-ACYLTRANSFERASE-RXN
 xref: Reactome:R-HSA-2534040 "Unknown NAT N-acylates Gly in GNAT1"
-xref: Reactome:R-HSA-9971621 "GLYAT transfers ISB to glycine"
 xref: RHEA:19869
 xref: RHEA:49772
 xref: RHEA:49780
@@ -323003,8 +323245,6 @@
 xref: Reactome:R-HSA-159566 "benzoyl-CoA + glycine => benzoyl glycine (hippuric acid) + Coenzyme A"
 xref: Reactome:R-HSA-159574 "GLYAT-like proteins transfer glycine to ST-CoA to form SUA"
 xref: Reactome:R-HSA-9750001 "GLYAT-like proteins transfer glycine to 2,5-DHB-CoA to form gentisuric acid"
-xref: Reactome:R-HSA-9971063 "GLYAT-like proteins transfer glycine to phenylacetyl-CoA"
-xref: Reactome:R-HSA-9972916 "GLYAT-like proteins transfer glycine to aminobenzoyl-CoA"
 xref: RHEA:18493
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.71
@@ -324061,7 +324301,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the central complex over time, from its formation to the mature structure. The central complex region of the insect brain is thought to be crucial for control of locomotive behavior. Located in the middle of the two protocerebral hemispheres, it comprises four neuropilar regions, the fan-shaped body, the ellipsoid body, the protocerebral bridge and the paired noduli." [PMID:12490252]
 synonym: "central body development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -324216,7 +324456,7 @@
 name: compound eye corneal lens development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the corneal lens in the compound eye over time, from its formation to the mature structure. The corneal lens is a chitinous extracellular secretion of the four underlying cone cells and the pigment cells." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048749 ! compound eye development
 
 [Term]
@@ -324650,7 +324890,7 @@
 name: antennal joint development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the antennal joint over time, from its formation to the mature structure. The antennal joint is the joint between antennal segments." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007469 ! antennal development
 
 [Term]
@@ -325571,6 +325811,7 @@
 def: "The process whose specific outcome is the progression of the gametophyte over time, from its formation to the mature structure. The gametophyte is the gamete-producing individual or phase in the life cycle having alternation of generations. An example of this process is found in Arabidopsis thaliana." [GOC:jid, PO:0009004]
 synonym: "gametogenesis" BROAD []
 is_a: GO:0007275 ! multicellular organism development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048232
@@ -326051,7 +326292,7 @@
 def: "The process whose specific outcome is the progression of the alveolus over time, from its formation to the mature structure. The alveolus is a sac for holding air in the lungs; formed by the terminal dilation of air passageways." [GOC:mtg_lung, PMID:9751757]
 synonym: "alveolarization" EXACT [PMID:17911382]
 synonym: "alveologenesis" EXACT [GOC:17911382]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030324 ! lung development
 
 [Term]
@@ -326413,6 +326654,7 @@
 def: "The process whose specific outcome is the progression of the seed over time, from its formation to the mature structure. A seed is a propagating organ formed in the sexual reproductive cycle of gymnosperms and angiosperms, consisting of a protective coat enclosing an embryo and food reserves." [GOC:jid, PO:0009010]
 is_a: GO:0009791 ! post-embryonic development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 
 [Term]
@@ -326950,6 +327192,7 @@
 def: "The process whose specific outcome is the progression of the shoot system over time, from its formation to the mature structure." [GOC:curators]
 synonym: "shoot development" EXACT []
 is_a: GO:0048731 ! system development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048368
@@ -327140,6 +327383,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the mesectoderm over time, from its formation to the mature structure. In animal embryos, mesectoderm development processes give rise to both mesoderm and ectoderm tissues." [GOC:jid]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007398 ! ectoderm development
 relationship: part_of GO:0007498 ! mesoderm development
 
@@ -327416,7 +327660,7 @@
 comment: Consider instead annotating to one of the more specific child terms, or to 'floral organ development ; GO:0048438' or one of its child terms.
 synonym: "collective phyllome structure development" BROAD [GOC:PO_curators, PO:0025023]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
 [Term]
@@ -327808,7 +328052,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the style over time, from its formation to the mature structure. The style is an elongated part of a carpel, or group of fused carpels, and it lies between the ovary and the stigma." [GOC:jid, PO:0009074]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
 [Term]
@@ -327817,7 +328061,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stigma over time, from its formation to the mature structure. The stigma is the pollen-receptive surface of a carpel or group of fused carpels, usually sticky." [GOC:jid, PO:0009073]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
 [Term]
@@ -327846,6 +328090,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the autonomic nervous system over time, from its formation to the mature structure. The autonomic nervous system is composed of neurons that are not under conscious control, and is comprised of two antagonistic components, the sympathetic and parasympathetic nervous systems. The autonomic nervous system regulates key functions including the activity of the cardiac (heart) muscle, smooth muscles (e.g. of the gut), and glands." [FMA:9905, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -327854,6 +328099,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the enteric nervous system over time, from its formation to the mature structure. The enteric nervous system is composed of two ganglionated neural plexuses in the gut wall which form one of the three major divisions of the autonomic nervous system. The enteric nervous system innervates the gastrointestinal tract, the pancreas, and the gallbladder. It contains sensory neurons, interneurons, and motor neurons. Thus the circuitry can autonomously sense the tension and the chemical environment in the gut and regulate blood vessel tone, motility, secretions, and fluid transport. The system is itself governed by the central nervous system and receives both parasympathetic and sympathetic innervation." [FMA:66070, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -327862,6 +328108,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the sympathetic nervous system over time, from its formation to the mature structure. The sympathetic nervous system is one of the two divisions of the vertebrate autonomic nervous system (the other being the parasympathetic nervous system). The sympathetic preganglionic neurons have their cell bodies in the thoracic and lumbar regions of the spinal cord and connect to the paravertebral chain of sympathetic ganglia. Innervate heart and blood vessels, sweat glands, viscera and the adrenal medulla. Most sympathetic neurons, but not all, use noradrenaline as a post-ganglionic neurotransmitter." [FMA:9906, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -327870,6 +328117,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the parasympathetic nervous system over time, from its formation to the mature structure. The parasympathetic nervous system is one of the two divisions of the vertebrate autonomic nervous system. Parasympathetic nerves emerge cranially as pre ganglionic fibers from oculomotor, facial, glossopharyngeal and vagus and from the sacral region of the spinal cord. Most neurons are cholinergic and responses are mediated by muscarinic receptors. The parasympathetic system innervates, for example: salivary glands, thoracic and abdominal viscera, bladder and genitalia." [FMA:9907, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -328092,7 +328340,7 @@
 name: meristem development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the meristem over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048508
@@ -328146,7 +328394,7 @@
 synonym: "development of an organ" EXACT []
 synonym: "organogenesis" EXACT []
 xref: Wikipedia:Organogenesis
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25943" xsd:anyURI
 
 [Term]
@@ -328671,6 +328919,7 @@
 synonym: "intestinal development" NARROW []
 synonym: "intestine development" NARROW []
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0055123 ! digestive system development
 
 [Term]
@@ -329525,7 +329774,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anther over time, from its formation to the mature structure." [GOC:jid, GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 
 [Term]
@@ -329580,7 +329829,7 @@
 synonym: "tapetal layer development" BROAD [GOC:tb]
 synonym: "tapetum development" BROAD [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 
 [Term]
@@ -330307,7 +330556,7 @@
 name: anterior cibarial plate development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anterior cibarial plate over time, from their formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330315,7 +330564,7 @@
 name: clypeus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the clypeus over time, from its formation to the mature structure. The clypeus is the shield-shaped plate on an insect's head." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330323,7 +330572,7 @@
 name: epistomal sclerite development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the epistomal sclerite over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330340,7 +330589,7 @@
 name: labrum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the labrum over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330348,7 +330597,7 @@
 name: posterior cibarial plate development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the posterior cibarial plate over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330424,7 +330673,7 @@
 name: appendage development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an appendage over time, from its formation to the mature structure. An appendage is an organ or part that is attached to the trunk of an organism, such as a limb or a branch." [GOC:jid, GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -331328,7 +331577,7 @@
 name: root cap development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root cap over time, from its formation to the mature structure. The root cap protects the root meristem from friction as the root grows through the soil. The cap is made up of a group of parenchyma cells which secrete a glycoprotein mucilage as a lubricant." [GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
 [Term]
@@ -331416,7 +331665,7 @@
 name: inner ear development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inner ear over time, from its formation to the mature structure." [GOC:sr]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043583 ! ear development
 
 [Term]
@@ -331424,7 +331673,7 @@
 name: otolith development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the otolith over time, from its formation to the mature structure." [GOC:sr]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 
 [Term]
@@ -331619,7 +331868,7 @@
 name: neural nucleus development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a neural nucleus from its initial condition to its mature state. A neural nucleus is an anatomical structure consisting of a discrete aggregate of neuronal soma." [GO_REF:0000021]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0048858
@@ -331803,6 +332052,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a sensory system over time from its formation to the mature structure." [GOC:dgh]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0048881
@@ -331819,6 +332069,7 @@
 def: "The process whose specific outcome is the progression of the lateral line over time, from its formation to the mature structure. The lateral line consists of small sensory patches (neuromasts) located superficially on the skin or just under the skin in fluid-filled canals on the head and body of all fishes and most amphibians. The lateral line develops from cranial ectodermal placodes situated behind the ear and between the eye and ear." [ISBN:0125296509]
 synonym: "LL development" EXACT []
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048925 ! lateral line system development
 
 [Term]
@@ -331860,7 +332111,7 @@
 name: cupula development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cupula over time, from its formation to the mature structure. The cupula is secreted by mantle cells and the ciliary bundles of all of the hair cells of the neuromast are embedded in it. The cupula provides a mechanical linkage between the hair cells and the external hydrodynamic environment. The cupula of superficial neuromasts grows continuously, while the height of the cupula of canal neuromasts is limited by canal diameter." [ISBN:0125296509]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048884 ! neuromast development
 
 [Term]
@@ -333598,7 +333849,7 @@
 id: GO:0050073
 name: macrolide 2'-kinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + oleandomycin = ADP + 2 H+ + oleandomycin 2'-O-phosphate." [EC:2.7.1.136, RHEA:18333]
+def: "Catalysis of the reaction: ATP + a macrolide = ADP + 2 H+ + a macrolide-2'-O-phosphate. Substrates include oleandomycin, erythromycin, spiramycin and other macrolide antibiotics." [EC:2.7.1.136]
 synonym: "ATP:macrolide 2'-O-phosphotransferase activity" RELATED [EC:2.7.1.136]
 xref: EC:2.7.1.136
 xref: KEGG_REACTION:R03780
@@ -333607,8 +333858,9 @@
 is_a: GO:0016301 ! kinase activity
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
 property_value: skos:exactMatch EC:2.7.1.136
-property_value: skos:exactMatch RHEA:18333
+property_value: skos:narrowMatch RHEA:18333
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32136" xsd:anyURI
 
 [Term]
 id: GO:0050074
@@ -335012,7 +335264,6 @@
 xref: EC:1.1.1.66
 xref: KEGG_REACTION:R03886
 xref: MetaCyc:OMEGA-HYDROXYDECANOATE-DEHYDROGENASE-RXN
-xref: Reactome:R-HSA-9971258 "ADH7 dehydrogenates 10-OH-DECA"
 xref: RHEA:20880
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.66
@@ -336616,19 +336867,17 @@
 
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
@@ -336733,7 +336982,7 @@
 synonym: "retinyl palmitate hydrolyase activity" RELATED []
 synonym: "retinyl-palmitate palmitohydrolase activity" RELATED []
 xref: MetaCyc:RETINYL-PALMITATE-ESTERASE-RXN
-xref: Reactome:R-HSA-2404133 "A REH hydrolyses atREs to atROL and FAs"
+xref: Reactome:R-HSA-2404133 "A REH hydrolses atREs to atROL and FAs"
 xref: Reactome:R-HSA-8848355 "PNPLA4 hydrolyzes retinyl palmitate"
 xref: Reactome:R-HSA-975593 "PNLIP:CLPS hydrolyses RPALM to atROL and PALM"
 xref: Reactome:R-HSA-975594 "PLB1 hydrolyses RPALM to atROL"
@@ -345851,7 +346100,6 @@
 def: "The movement of an organism or part of an organism using mechanoreceptors, the nervous system, striated muscle and/or the skeletal system." [GOC:dph]
 is_a: GO:0050879 ! multicellular organismal movement
 is_a: GO:0050905 ! neuromuscular process
-property_value: RO:0002175 NCBITaxon:7227
 
 [Term]
 id: GO:0050882
@@ -346727,9 +346975,6 @@
 synonym: "perception of environment using reflected sound waves" EXACT []
 xref: Wikipedia:Echolocation
 is_a: GO:0050877 ! nervous system process
-property_value: RO:0002175 NCBITaxon:687454
-property_value: RO:0002175 NCBITaxon:9397
-property_value: RO:0002175 NCBITaxon:9722
 
 [Term]
 id: GO:0050960
@@ -348222,6 +348467,8 @@
 namespace: molecular_function
 def: "OBSOLETE. Binding to an unfolded protein." [GOC:ai]
 comment: The reason for obsoletion is that this binding term should be replaced by an activity term such as protein folding chaperone (GO:0044183) or unfolded protein holdase activity (GO:0140309).
+xref: Reactome:R-HSA-9683772 "Trimmed spike protein binds to calnexin"
+xref: Reactome:R-HSA-9694337 "Trimmed spike protein binds to calnexin"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21436" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30962" xsd:anyURI
 is_obsolete: true
@@ -355880,6 +356127,7 @@
 synonym: "downregulation of killing of cells of another organism" EXACT []
 synonym: "inhibition of killing of cells of another organism" NARROW []
 synonym: "negative regulation of killing of cells of other organism" EXACT []
+xref: Reactome:R-HSA-9662851 "Anti-inflammatory response favouring Leishmania parasite infection"
 is_a: GO:0031342 ! negative regulation of cell killing
 is_a: GO:0051709 ! regulation of killing of cells of another organism
 intersection_of: GO:0065007 ! biological regulation
@@ -356435,6 +356683,7 @@
 xref: RHEA:47468
 xref: RHEA:84515
 xref: RHEA:84543
+xref: RHEA:84779
 is_a: GO:0016863 ! intramolecular oxidoreductase activity, transposing C=C bonds
 property_value: skos:exactMatch EC:5.3.3.21
 property_value: skos:exactMatch RHEA:45240
@@ -356443,6 +356692,7 @@
 property_value: skos:narrowMatch RHEA:47468
 property_value: skos:narrowMatch RHEA:84515
 property_value: skos:narrowMatch RHEA:84543
+property_value: skos:narrowMatch RHEA:84779
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -364740,7 +364990,6 @@
 xref: KEGG_REACTION:R02150
 xref: MetaCyc:RXN-9600
 xref: Reactome:R-HSA-5696131 "AOC1 deaminates Hist"
-xref: Reactome:R-HSA-9970023 "AOC1 dimer oxidizes MeHist"
 xref: RHEA:25625
 is_a: GO:0052597 ! diamine oxidase activity
 property_value: skos:exactMatch RHEA:25625
@@ -368046,10 +368295,12 @@
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
@@ -370633,7 +370884,7 @@
 subset: goslim_yeast
 synonym: "ATP hydrolysis coupled transmembrane transport" NARROW []
 synonym: "membrane transport" EXACT []
-xref: Reactome:R-HSA-382556 "ABC-family protein mediated transport"
+xref: Reactome:R-HSA-382556 "ABC-family proteins mediated transport"
 xref: Reactome:R-HSA-425407 "SLC-mediated transmembrane transport"
 xref: Reactome:R-HSA-5223345 "Miscellaneous transport and binding events"
 is_a: GO:0006810 ! transport
@@ -370969,6 +371220,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the digestive system over time, from its formation to the mature structure. The digestive system is the entire structure in which digestion takes place. Digestion is all of the physical, chemical, and biochemical processes carried out by multicellular organisms to break down ingested nutrients into components that may be easily absorbed and directed into metabolism." [GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0055124
@@ -371222,7 +371474,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the roof of the mouth from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure. The roof of the mouth is the partition that separates the nasal and oral cavities." [GOC:dph, ISBN:0721662544]
 synonym: "palatum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060022
@@ -371230,7 +371482,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the hard palate from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure, whatever form that may be including its natural destruction. The hard palate is the anterior portion of the palate consisting of bone and mucous membranes." [GOC:dph, ISBN:0721662544]
 synonym: "palatum durum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0062009 ! secondary palate development
 
 [Term]
@@ -371240,7 +371492,7 @@
 def: "The biological process whose specific outcome is the progression of the soft palate from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure, whatever form that may be including its natural destruction. The soft palate is the posterior portion of the palate extending from the posterior edge of the hard palate." [GOC:dph, ISBN:0721662544]
 synonym: "palatum molle development" EXACT [ISBN:0721662544]
 synonym: "velum palatum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0062009 ! secondary palate development
 
 [Term]
@@ -371361,6 +371613,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pharyngeal system over time, from its formation to the mature structure. The pharyngeal system is a transient embryonic complex that is specific to vertebrates. It comprises the pharyngeal arches, bulges of tissues of mesoderm and neural crest derivation through which pass nerves and pharyngeal arch arteries. The arches are separated internally by pharyngeal pouches, evaginations of foregut endoderm, and externally by pharyngeal clefts, invaginations of surface ectoderm. The development of the system ends when the structure it contributes to are forming: the thymus, thyroid, parathyroids, maxilla, mandible, aortic arch, cardiac outflow tract, external and middle ear." [GOC:dph]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043009 ! chordate embryonic development
 
 [Term]
@@ -371399,7 +371652,7 @@
 def: "The process whose specific outcome is the progression of the retina over time, from its formation to the mature structure. The retina is the innermost layer or coating at the back of the eyeball, which is sensitive to light and in which the optic nerve terminates." [GOC:bf, GOC:dph, ISBN:0815340729]
 synonym: "retina development in camera-style eye" EXACT []
 synonym: "retinal development" RELATED [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 
 [Term]
@@ -371657,6 +371910,7 @@
 synonym: "Mullerian tract development" RELATED []
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060067
@@ -371665,6 +371919,7 @@
 def: "The reproductive developmental process whose specific outcome is the progression of the cervix over time, from its formation to the mature structure." [GOC:dph, GOC:ebc]
 synonym: "Mullerian tract development" RELATED []
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060068
@@ -372695,7 +372950,7 @@
 name: olfactory pit development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the olfactory pit from an initial condition to its mature state. This process begins with the formation of the olfactory pit, which is an indentation of the olfactory placode, and ends when the pits hollows out to form the nasopharynx." [GOC:dph, ISBN:0124020607]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043584 ! nose development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22589" xsd:anyURI
 
@@ -373747,7 +374002,6 @@
 synonym: "cilium organization" RELATED [GOC:dph]
 synonym: "microtubule-based flagellum assembly" EXACT []
 xref: Reactome:R-HSA-5617833 "Cilium Assembly"
-xref: Reactome:R-HSA-5620920 "Cargo trafficking to the periciliary membrane"
 is_a: GO:0044782 ! cilium organization
 is_a: GO:0070925 ! organelle assembly
 is_a: GO:0120031 ! plasma membrane bounded cell projection assembly
@@ -373978,9 +374232,13 @@
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
@@ -374102,10 +374360,9 @@
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the chemical reaction involving the removal of one or more phosphate groups from a phosphatidylinositol." [GOC:dph, GOC:tb]
 synonym: "regulation of phosphoinositide dephosphorylation" EXACT []
-is_a: GO:0019216 ! regulation of lipid metabolic process
 is_a: GO:0035303 ! regulation of dephosphorylation
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
 is_a: GO:0060255 ! regulation of macromolecule metabolic process
+is_a: GO:1903725 ! regulation of phospholipid metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0046856 ! phosphatidylinositol dephosphorylation
 relationship: regulates GO:0046856 ! phosphatidylinositol dephosphorylation
@@ -374313,7 +374570,7 @@
 name: head development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a head from an initial condition to its mature state. The head is the anterior-most division of the body." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060323
@@ -374329,7 +374586,7 @@
 name: face development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a face from an initial condition to its mature state. The face is the ventral division of the head." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060322 ! head development
 
 [Term]
@@ -375401,6 +375658,7 @@
 def: "The process whose specific outcome is the progression of an epithelium over time, from its formation to the mature structure. An epithelium is a tissue that covers the internal or external surfaces of an anatomical structure." [GOC:dph, GOC:mtg_lung]
 subset: goslim_drosophila
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060430
@@ -375408,7 +375666,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a lung saccule from an initial condition to its mature state. The lung saccule is the primitive gas exchange portion of the lung composed of type I and type II cells." [GOC:dph, GOC:mtg_lung]
 synonym: "lung saccular development" BROAD [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048286 ! lung alveolus development
 
 [Term]
@@ -375715,7 +375973,7 @@
 name: lung lobe development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a lung lobe from an initial condition to its mature state. This process begins with the formation of a lung lobe by branching morphogenesis and ends with the mature structure. A lung lobe is one of the rounded projections that compose the lung." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030324 ! lung development
 
 [Term]
@@ -375741,7 +375999,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a pharynx from an initial condition to its mature state. The pharynx is the part of the digestive system immediately posterior to the mouth." [GOC:dph, GOC:rk]
 synonym: "pharyngeal development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048565 ! digestive tract development
 
 [Term]
@@ -375943,6 +376201,7 @@
 def: "The process whose specific outcome is the progression of a mesenchymal tissue over time, from its formation to the mature structure. A mesenchymal tissue is made up of loosely packed stellate cells." [GOC:dph]
 synonym: "mesenchymal development" EXACT [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048513 ! animal organ development
 
 [Term]
@@ -376351,7 +376610,7 @@
 namespace: biological_process
 def: "The progression of a glandular acinus of the prostate gland over time, from its initial formation to the mature structure. The glandular acini are the saclike structures of the gland." [GOC:dph, PMID:18977204]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030850 ! prostate gland development
 
 [Term]
@@ -376471,6 +376730,7 @@
 namespace: biological_process
 def: "The progression of muscle tissue over time, from its initial formation to its mature state. Muscle tissue is a contractile tissue made up of actin and myosin fibers." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-04-10T08:05:37Z
 
@@ -376510,6 +376770,7 @@
 def: "The progression of the respiratory system over time from its formation to its mature structure. The respiratory system carries out respiratory gaseous exchange." [GOC:dph]
 subset: goslim_drosophila
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-04-10T08:55:42Z
 
@@ -377393,7 +377654,7 @@
 name: nipple development
 namespace: biological_process
 def: "The progression of the nipple over time, from its formation to the mature structure. The nipple is a part of the mammary gland that protrudes from the surface ectoderm." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030879 ! mammary gland development
 created_by: dph
 creation_date: 2009-05-18T09:29:38Z
@@ -378492,7 +378753,7 @@
 name: labyrinthine layer development
 namespace: biological_process
 def: "The process in which the labyrinthine layer of the placenta progresses, from its formation to its mature state." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001892 ! embryonic placenta development
 created_by: dph
 creation_date: 2009-06-09T03:27:43Z
@@ -378503,6 +378764,7 @@
 namespace: biological_process
 def: "The process in which the spongiotrophoblast layer of the placenta progresses from its formation to its mature state." [GOC:dph]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001892 ! embryonic placenta development
 created_by: dph
 creation_date: 2009-06-09T03:33:40Z
@@ -378927,7 +379189,7 @@
 name: mammary gland alveolus development
 namespace: biological_process
 def: "The progression of the mammary gland alveolus over time, from its formation to its mature state. The mammary gland alveolus is a sac-like structure that is found in the mature gland." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061377 ! mammary gland lobule development
 created_by: dph
 creation_date: 2009-06-22T10:52:12Z
@@ -380377,6 +380639,7 @@
 namespace: biological_process
 def: "The progression of the semicircular canal from its initial formation to the mature structure." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 created_by: dph
 creation_date: 2009-08-13T09:36:37Z
@@ -381943,6 +382206,7 @@
 def: "The progression of the hepaticobiliary system over time, from its formation to the mature structure. The hepaticobiliary system is responsible for metabolic and catabolic processing of small molecules absorbed from the blood or gut, hormones and serum proteins, detoxification, storage of glycogen, triglycerides, metals and lipid soluble vitamins and excretion of bile. Included are the synthesis of albumin, blood coagulation factors, complement, and specific binding proteins." [GOC:dph]
 synonym: "hepatobiliary system development" EXACT [GOC:dph]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-01-22T09:11:59Z
 
@@ -381956,6 +382220,7 @@
 synonym: "EHBD development" BROAD [PMID:20614624]
 synonym: "extrahepatic bile duct development" BROAD [PMID:20614624]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061008 ! hepaticobiliary system development
 created_by: dph
 creation_date: 2010-01-22T09:17:13Z
@@ -382091,7 +382356,7 @@
 name: umbilical cord development
 namespace: biological_process
 def: "The process whose specific outcome is the development of the umbilical cord, from its formation to the mature structure. The umbilical cord is an organ or embryonic origin consisting of the 2 umbilical arteries and the one umbilical vein. The umbilical cord connects the cardiovascular system of the fetus to the mother via the placenta." [GOC:BHF, GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-02-09T09:09:22Z
 
@@ -382109,7 +382374,7 @@
 name: eyelid development in camera-type eye
 namespace: biological_process
 def: "The progression of the eyelid in a camera-type eye from its formation to the mature state. The eyelid is a membranous cover that helps protect and lubricate the eye." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2010-02-09T09:36:11Z
@@ -382141,7 +382406,7 @@
 namespace: biological_process
 def: "The progression of the visceral serous pericardium from its formation to the mature structure. The visceral serous pericardium is the inner layer of the pericardium." [GOC:dph, GOC:yaf]
 synonym: "epicardium development" EXACT [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060039 ! pericardium development
 created_by: dph
 creation_date: 2010-02-09T09:52:49Z
@@ -382162,7 +382427,7 @@
 name: olfactory bulb mitral cell layer development
 namespace: biological_process
 def: "The progression of the olfactory bulb mitral cell layer over time from its initial formation until its mature state. The mitral cell layer is composed of pyramidal neurons whose cell bodies are located between the granule cell layer and the plexiform layer." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021772 ! olfactory bulb development
 created_by: dph
 creation_date: 2010-02-09T03:30:23Z
@@ -382408,7 +382673,7 @@
 name: dermatome development
 namespace: biological_process
 def: "The progression of the dermatome over time, from its initial formation to the mature structure. The dermatome is the portion of a somite that will form skin." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061053 ! somite development
 created_by: dph
 creation_date: 2010-03-02T12:07:37Z
@@ -382418,7 +382683,7 @@
 name: myotome development
 namespace: biological_process
 def: "The progression of the myotome over time, from its formation to the mature structure. The myotome is the portion of the somite that will give rise to muscle." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061053 ! somite development
 created_by: dph
 creation_date: 2010-03-02T12:11:01Z
@@ -382498,7 +382763,7 @@
 namespace: biological_process
 def: "The progression of a muscle structure over time, from its formation to its mature state. Muscle structures are contractile cells, tissues or organs that are found in multicellular organisms." [GOC:dph]
 subset: goslim_drosophila
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-03-09T08:55:14Z
 
@@ -382704,7 +382969,7 @@
 name: left horn of sinus venosus development
 namespace: biological_process
 def: "The progression of the left horn of the sinus venosus from its initial formation to the mature structure." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003235 ! sinus venosus development
 created_by: dph
 creation_date: 2010-04-08T02:40:27Z
@@ -382714,7 +382979,7 @@
 name: right horn of sinus venosus development
 namespace: biological_process
 def: "The progression of the right horn of the sinus venosus from its formation to the mature structure." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003235 ! sinus venosus development
 created_by: dph
 creation_date: 2010-04-08T02:45:10Z
@@ -383524,7 +383789,7 @@
 name: trachea submucosa development
 namespace: biological_process
 def: "The progression of the trachea submucosa over time from its formation to the mature structure. The trachea submucosa is made up of the glands and elastic tissue that lie under the mucosa in the trachea." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060438 ! trachea development
 created_by: dph
 creation_date: 2010-06-07T09:58:40Z
@@ -384011,7 +384276,7 @@
 name: fungiform papilla development
 namespace: biological_process
 def: "The progression of the fungiform papilla over time, from its formation to the mature structure. The fungiform papilla is a mushroom-shaped papilla of the tongue." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043586 ! tongue development
 created_by: dph
 creation_date: 2010-07-27T12:23:48Z
@@ -384111,6 +384376,7 @@
 synonym: "Mullerian duct development" EXACT [GOC:dph]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-07-30T10:54:47Z
 
@@ -385197,7 +385463,7 @@
 name: cornea development in camera-type eye
 namespace: biological_process
 def: "The progression of the cornea over time, from its formation to the mature structure. The cornea is the transparent structure that covers the anterior of the eye." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2010-09-14T02:09:08Z
@@ -385882,7 +386148,7 @@
 namespace: biological_process
 def: "The developmental process pertaining to the progression of the optic chiasm from its initial formation to the mature structure. The process begins when the pathfinding of the axons of the developing optic nerve cause some axons to cross at the midline of the brain and ends when the axons are mature." [GOC:dph]
 synonym: "optic chiasm development" EXACT [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021554 ! optic nerve development
 created_by: dph
 creation_date: 2010-10-13T08:00:29Z
@@ -386027,7 +386293,7 @@
 name: mammillary axonal complex development
 namespace: biological_process
 def: "The progression of the mammillary axonal complex over time, from its formation to the mature structure. The mammillary axonal complex is formed by the axons from the lateral, medial mammillary and the dorsal premammillary nuclei which share a branching pattern. Every neuron gives off one axonal stem that bifurcates into 2 branches. One of the branches is directed dorsally to the thalamus and another caudally to the midbrain." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021767 ! mammillary body development
 created_by: dph
 creation_date: 2010-11-09T08:49:59Z
@@ -386037,7 +386303,7 @@
 name: mammillothalamic axonal tract development
 namespace: biological_process
 def: "The progression of the mammillothalamic axonal tract, from its formation to the mature structure. The mammillothalamic tract is the collection of axons that connects the two major subdivisions of the diencephalon (hypothalamus and thalamus) and closes the diencephalic circuit." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T08:54:43Z
@@ -386047,7 +386313,7 @@
 name: mammillotectal axonal tract development
 namespace: biological_process
 def: "The progression of the mammillotectal tract over time, from its formation to the mature structure. The mammillotectal tract is the collection of axons that connects the ventral diencephalon to the superior colliculus." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T09:01:14Z
@@ -386057,7 +386323,7 @@
 name: mammillotegmental axonal tract development
 namespace: biological_process
 def: "The process in which the mammillotegmental tract progresses over time, from its formation to the mature structure. The mammillotegmental tract is the collection of axons that connects the ventral diencephalon to the tegmentum and pons." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T09:09:29Z
@@ -386067,7 +386333,7 @@
 name: mammary gland lobule development
 namespace: biological_process
 def: "The progression of the mammary gland lobule over time, from its formation to the mature structure. A mammary gland lobule is a small rounded projection of the mammary gland." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030879 ! mammary gland development
 created_by: dph
 creation_date: 2010-11-09T09:36:29Z
@@ -386077,7 +386343,7 @@
 name: corpora quadrigemina development
 namespace: biological_process
 def: "The progression of the corpora quadrigemina over time, from its formation to the mature structure. The corpora quadrigemina is a part of the midbrain that is made up of the superior and inferior colliculi." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030901 ! midbrain development
 created_by: dph
 creation_date: 2010-11-09T09:45:36Z
@@ -386087,7 +386353,7 @@
 name: inferior colliculus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inferior colliculus over time, from its formation to the mature structure. The inferior colliculus (IC) (Latin, lower hill) is the principal midbrain nucleus of the auditory pathway and receives input from several more peripheral brainstem nuclei in the auditory pathway, as well as inputs from the auditory cortex. The inferior colliculus has three subdivisions: the central nucleus (CIC), a dorsal cortex (DCIC) by which it is surrounded, and an external cortex (ICX) which is located laterally." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061378 ! corpora quadrigemina development
 created_by: dph
 creation_date: 2010-11-09T09:49:24Z
@@ -386097,7 +386363,7 @@
 name: superior colliculus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior colliculus over time, from its formation to the mature structure. The superior colliculus is also known as the optic tectum or simply tectum and is a paired structure that forms a major component of the vertebrate midbrain." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061378 ! corpora quadrigemina development
 created_by: dph
 creation_date: 2010-11-09T09:51:00Z
@@ -386482,30 +386748,34 @@
 
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
 
@@ -386871,6 +387141,7 @@
 namespace: biological_process
 def: "The progression of a connective tissue over time, from its formation to the mature structure." [GOC:BHF]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-03-22T12:53:41Z
 
@@ -387592,7 +387863,7 @@
 name: central canal development
 namespace: biological_process
 def: "The process whose specific outcome is the formation of the central canal of the spinal cord from its formation to the mature structure. The central canal is a spinal cord structure that is part of the ventricular system and is filled with cerebral-spinal fluid and runs the length of the spinal cord." [GOC:cvs, GOC:dph, PMID:23409159]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 created_by: dph
 creation_date: 2013-04-20T08:18:31Z
@@ -387875,6 +388146,7 @@
 synonym: "ganglia development" RELATED [GOC:dph]
 synonym: "gangliogenesis" NARROW [GOC:BHF, GOC:rl]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 created_by: dph
 creation_date: 2013-07-10T08:36:12Z
@@ -393794,7 +394066,7 @@
 name: stomach development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stomach over time, from its formation to the mature structure. The stomach is an expanded region of the vertebrate alimentary tract that serves as a food storage compartment and digestive organ." [PMID:11967278]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048565 ! digestive tract development
 created_by: dph
 creation_date: 2018-11-20T18:15:45Z
@@ -394304,7 +394576,7 @@
 name: L-beta-ethynylserine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-beta-ethynylserine. L-beta-ethynylserine is an antibiotic produced by Streptomyces bacteria." [PMID:3082841, PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -394315,7 +394587,7 @@
 name: L-propargylglycine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-propargylglycine (Pra). L-propargylglycine is an antibiotic produced by Streptomyces bacteria." [PMID:30867596]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17763" xsd:anyURI
 created_by: dph
@@ -394449,9 +394721,9 @@
 synonym: "MAPDA" EXACT [PMID:29884623]
 synonym: "N6-mAMP deaminase activity" EXACT []
 synonym: "N6-methyl-AMP/dAMP aminohydrolase" EXACT [PMID:21755941]
-xref: Reactome:R-HSA-2161187 "MAPDA hydrolyzes N6-methyl-AMP to IMP and methylamine"
+xref: Reactome:R-HSA-2161187 "ADAL1 hydrolyzes N6-methyl-AMP to IMP and methylamine"
 xref: Reactome:R-HSA-2161195 "abacavir monophosphate + H2O => carbovir monophosphate + cyclopropylamine"
-xref: Reactome:R-HSA-9731661 "MAPDA hydrolyzes N6-methyl-dAMP to dIMP and methylamine"
+xref: Reactome:R-HSA-9731661 "ADAL1 hydrolyzes N6-methyl-dAMP to dIMP and methylamine"
 xref: RHEA:16001
 is_a: GO:0019239 ! deaminase activity
 property_value: skos:exactMatch RHEA:16001
@@ -396711,7 +396983,7 @@
 namespace: biological_process
 def: "The progression of the Kupffer's vesicle over time from its initial formation until its mature state. The Kupffer's vesicle is a small but distinctive epithelial sac containing fluid, located midventrally posterior to the yolk cell or its extension, and transiently present during most of the segmentation period." [GOC:dgh]
 synonym: "KV development" EXACT [GOC:dgh]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0070122
@@ -397312,7 +397584,8 @@
 synonym: "D-serine biosynthesis" EXACT []
 synonym: "D-serine formation" EXACT []
 synonym: "D-serine synthesis" EXACT []
-is_a: GO:0046437 ! D-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
+is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 
 [Term]
 id: GO:0070180
@@ -401139,6 +401412,8 @@
 xref: RHEA:11388
 xref: RHEA:42200
 xref: RHEA:84079
+xref: RHEA:86411
+xref: RHEA:86451
 xref: Wikipedia:11beta-hydroxysteroid_dehydrogenase
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.146
@@ -401146,6 +401421,8 @@
 property_value: skos:exactMatch RHEA:11388
 property_value: skos:narrowMatch RHEA:42200
 property_value: skos:narrowMatch RHEA:84079
+property_value: skos:narrowMatch RHEA:86411
+property_value: skos:narrowMatch RHEA:86451
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28173" xsd:anyURI
 
@@ -401804,7 +402081,6 @@
 def: "A process in which a protein is transported to, or maintained in, a location within the mitochondrion." [GOC:ecd]
 synonym: "protein localisation in mitochondrion" EXACT [GOC:mah]
 synonym: "protein localization in mitochondrion" EXACT []
-xref: Reactome:R-HSA-1268020 "Mitochondrial protein import"
 is_a: GO:0033365 ! protein localization to organelle
 created_by: mah
 creation_date: 2009-04-24T02:31:18Z
@@ -405114,57 +405390,34 @@
 
 [Term]
 id: GO:0070861
-name: regulation of protein exit from endoplasmic reticulum
+name: obsolete regulation of protein exit from endoplasmic reticulum
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of the directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
-synonym: "regulation of protein exit from ER" EXACT [GOC:mah]
-synonym: "regulation of protein export from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "regulation of protein export from ER" EXACT [GOC:mah]
-is_a: GO:0033157 ! regulation of intracellular protein transport
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0032527 ! protein exit from endoplasmic reticulum
-relationship: regulates GO:0032527 ! protein exit from endoplasmic reticulum
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of the directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
+comment: The reason for obsoletion is that the parent term GO:0032527 'protein exit from endoplasmic reticulum' was obsoleted because it conflated multiple distinct processes. For regulation of COPII-vesicle-mediated forward transport from the ER, consider GO:0060627 'regulation of vesicle-mediated transport' or descendants.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-08-17T03:39:18Z
 
 [Term]
 id: GO:0070862
-name: negative regulation of protein exit from endoplasmic reticulum
+name: obsolete negative regulation of protein exit from endoplasmic reticulum
 namespace: biological_process
-def: "Any process that stops, prevents, or reduces the frequency, rate or extent of the directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
-synonym: "down regulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "down-regulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "downregulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "inhibition of protein exit from endoplasmic reticulum" NARROW [GOC:mah]
-synonym: "negative regulation of protein exit from ER" EXACT [GOC:mah]
-synonym: "negative regulation of protein export from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "negative regulation of protein export from ER" EXACT [GOC:mah]
-is_a: GO:0070861 ! regulation of protein exit from endoplasmic reticulum
-is_a: GO:0090317 ! negative regulation of intracellular protein transport
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0032527 ! protein exit from endoplasmic reticulum
-relationship: negatively_regulates GO:0032527 ! protein exit from endoplasmic reticulum
+def: "OBSOLETE. Any process that stops, prevents, or reduces the frequency, rate or extent of the directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
+comment: The reason for obsoletion is that the parent term GO:0032527 'protein exit from endoplasmic reticulum' was obsoleted because it conflated multiple distinct processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-08-17T03:45:56Z
 
 [Term]
 id: GO:0070863
-name: positive regulation of protein exit from endoplasmic reticulum
+name: obsolete positive regulation of protein exit from endoplasmic reticulum
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
-synonym: "activation of protein exit from endoplasmic reticulum" NARROW [GOC:mah]
-synonym: "positive regulation of protein exit from ER" EXACT [GOC:mah]
-synonym: "positive regulation of protein export from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "positive regulation of protein export from ER" EXACT [GOC:mah]
-synonym: "stimulation of protein exit from endoplasmic reticulum" NARROW [GOC:mah]
-synonym: "up regulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "up-regulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-synonym: "upregulation of protein exit from endoplasmic reticulum" EXACT [GOC:mah]
-is_a: GO:0070861 ! regulation of protein exit from endoplasmic reticulum
-is_a: GO:0090316 ! positive regulation of intracellular protein transport
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0032527 ! protein exit from endoplasmic reticulum
-relationship: positively_regulates GO:0032527 ! protein exit from endoplasmic reticulum
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of directed movement of proteins from the endoplasmic reticulum." [GOC:mah]
+comment: The reason for obsoletion is that the parent term GO:0032527 'protein exit from endoplasmic reticulum' was obsoleted because it conflated multiple distinct processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
 created_by: mah
 creation_date: 2009-08-17T03:50:04Z
 
@@ -406533,12 +406786,15 @@
 
 [Term]
 id: GO:0070973
-name: protein localization to endoplasmic reticulum exit site
+name: obsolete protein localization to endoplasmic reticulum exit site
 namespace: biological_process
-def: "A process in which a protein is transported to, or maintained in, a location at an endoplasmic reticulum exit site." [GOC:mah]
-synonym: "protein localisation to endoplasmic reticulum exit site" EXACT [GOC:mah]
-synonym: "protein localization to ER exit site" EXACT [GOC:mah]
-is_a: GO:0070972 ! protein localization to endoplasmic reticulum
+def: "OBSOLETE. A process in which a protein is transported to, or maintained in, a location at an endoplasmic reticulum exit site." [GOC:mah]
+comment: The reason for obsoletion is that this term conflated multiple distinct processes and curators used it inconsistently. Suggested replacements depend on the specific biological context, e.g. GO:0048208 'COPII vesicle coat assembly', GO:0006888 'endoplasmic reticulum to Golgi vesicle-mediated transport', or descendants of GO:0034976 'response to endoplasmic reticulum stress' for quality-control contexts.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
+consider: GO:0006888
+consider: GO:0034976
+consider: GO:0048208
 created_by: mah
 creation_date: 2009-10-02T12:45:41Z
 
@@ -408138,7 +408394,7 @@
 name: superior temporal gyrus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior temporal gyrus over time, from its formation to the mature structure. The superior temporal gyrus is a portion of the cerebral cortex that extends from the lateral sulcus to the superior temporal sulcus." [FMA:61905, GOC:BHF, GOC:mah, PMID:11484000]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021987 ! cerebral cortex development
 created_by: mah
 creation_date: 2009-11-12T02:19:23Z
@@ -409843,7 +410099,6 @@
 xref: MetaCyc:PWY-7527
 xref: MetaCyc:PWY-7528
 xref: MetaCyc:PWY-8132
-xref: Reactome:R-HSA-1237112 "Methionine salvage pathway"
 is_a: GO:0043102 ! amino acid salvage
 is_a: GO:0071265 ! L-methionine biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ADENOSYLHOMOCYSCAT-PWY
@@ -409887,7 +410142,6 @@
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0050667 ! homocysteine metabolic process
-is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: mah
@@ -415444,7 +415698,7 @@
 name: beak development
 namespace: biological_process
 def: "The progression of the beak over time from its initial formation until its mature state. The avian beak is an external anatomical structure, in the head region, that is adapted for feeding self and young, catching prey, probing, etc. It encompasses, but is not restricted to, the maxilla, mandible, maxillary rhamphotheca, mandibular rhamphotheca, nostril, nasal fossa, nasal bones, egg tooth and rictus." [GOC:lp, ISBN:0702008729]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-03-17T03:52:48Z
 
@@ -418442,6 +418696,7 @@
 synonym: "urinary system development" BROAD [GOC:yaf]
 synonym: "urinary tract development" BROAD [GOC:yaf, PMID:17881463]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-01-25T10:31:00Z
 
@@ -418494,7 +418749,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the nephron over time, from its formation to the mature structure. A nephron is the functional unit of the kidney." [GOC:mtg_kidney_jan10]
 synonym: "nephrogenesis" RELATED [GOC:rph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T01:37:16Z
@@ -418569,7 +418824,7 @@
 namespace: biological_process
 def: "The progression of the glomus over time from its initial formation until its mature state. The glomus forms from the splanchnic intermediate mesoderm and is the vascularized filtration unit, filtering the blood before it enters the tubules. The glomus is external to the nephron and extends over more than one body segment." [GOC:mtg_kidney_jan10, PMID:10572058, PMID:15647339, PMID:9268568, XAO:0000318]
 synonym: "pronephric glomus development" EXACT [GOC:mtg_kidney_jan10, PMID:15895368]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: mah
 creation_date: 2010-01-25T02:23:19Z
@@ -418602,6 +418857,7 @@
 def: "The process whose specific outcome is the progression of a glomerular parietal epithelial cell over time, from its formation to the mature structure. Glomerular parietal epithelial cells are specialized epithelial cells that form tight junctions as a barrier to protein transport." [GOC:mtg_kidney_jan10]
 synonym: "Bowman's capsule development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0072310 ! glomerular epithelial cell development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072139 ! glomerular parietal epithelial cell differentiation
 created_by: mah
 creation_date: 2010-01-25T02:13:16Z
@@ -418651,7 +418907,7 @@
 name: descending thin limb development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the descending thin limb over time, from its formation to the mature structure. The descending thin limb is a part of the loop of Henle situated just after the proximal straight tubule (S3). It extends to the tip of the loop of Henle." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072070 ! loop of Henle development
 created_by: mah
 creation_date: 2010-01-25T02:37:47Z
@@ -418735,6 +418991,7 @@
 def: "The process whose specific outcome is the progression of the S1 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S1 portion is the initial portion of the proximal convoluted tubule and is responsible for avid reabsorption of water and solutes." [GOC:mtg_kidney_jan10, MA:0002612]
 synonym: "S1 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:55:57Z
@@ -418746,6 +419003,7 @@
 def: "The process whose specific outcome is the progression of the S2 portion of the proximal convoluted tubule over time, from its formation to the mature structure. The S2 portion of the tubule is involved in reabsorption of water and sodium chloride." [GOC:mtg_kidney_jan10, MA:0002613]
 synonym: "S2 development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072019 ! proximal convoluted tubule development
 created_by: mah
 creation_date: 2010-01-25T02:56:36Z
@@ -418895,6 +419153,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a collecting duct over time, from its formation to the mature structure. The collecting duct responds to vasopressin and aldosterone to regulate water, electrolyte and acid-base balance. It is the final common path through which urine flows before entering the ureter and then emptying into the bladder." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:18:06Z
@@ -418975,7 +419234,7 @@
 name: juxtaglomerular apparatus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the juxtaglomerular apparatus over time, from its formation to the mature structure. The juxtaglomerular apparatus is an anatomical structure that lies adjacent to the glomerulus and regulates kidney function." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:52:23Z
@@ -418996,7 +419255,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal inner medulla over time, from its formation to the mature structure. The renal inner medulla is unique to mammalian kidneys and is the innermost region of the mammalian kidney." [GOC:mtg_kidney_jan10]
 synonym: "inner renal medulla development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:59:37Z
@@ -419007,7 +419266,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal outer medulla over time, from its formation to the mature structure. The renal outer medulla is the region of the kidney that lies between the renal cortex and the renal inner medulla." [GOC:mtg_kidney_jan10]
 synonym: "outer renal medulla development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:00:42Z
@@ -419017,7 +419276,7 @@
 name: renal cortex development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal cortex over time, from its formation to the mature structure. The renal cortex is the outer region of the kidney." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:01:12Z
@@ -419031,7 +419290,7 @@
 synonym: "pyramids development" EXACT [GOC:mah]
 synonym: "renal medulla development" EXACT [GOC:mah]
 synonym: "renal pyramid development" EXACT [GOC:mah]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:01:36Z
@@ -419041,7 +419300,7 @@
 name: inner stripe development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inner stripe over time, from its formation to the mature structure. The inner stripe is a deep, centrally located portion of the renal outer medulla and is traversed by thin descending and thick ascending portions of the loops of Henle." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072054 ! renal outer medulla development
 created_by: mah
 creation_date: 2010-01-25T04:01:58Z
@@ -419051,7 +419310,7 @@
 name: outer stripe development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the outer stripe over time, from its formation to the mature structure. The outer stripe is the region of the kidney outer medulla that lies just below the cortex. The proximal straight tubules (S3) characterize this region." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072054 ! renal outer medulla development
 created_by: mah
 creation_date: 2010-01-25T04:02:56Z
@@ -419061,7 +419320,7 @@
 name: cortical collecting duct development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cortical collecting duct over time, from its formation to the mature structure. The cortical collecting duct is the portion of the collecting duct that resides in the renal cortex." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-01-25T04:07:07Z
 
@@ -419122,6 +419381,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the long descending thin limb bend over time, from its formation to the mature structure. The long descending thin limb bend is a part of the descending thin limb of a long nephron that lies beyond the prebend segment." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072064 ! long descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:13:38Z
@@ -419132,6 +419392,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the prebend segment over time, from its formation to the mature structure. The prebend segment is a part of the descending thin limb that lies before the bend and exhibits permeabilities characteristic of the ascending limb, especially negligible water permeability." [GOC:mtg_kidney_jan10]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072022 ! descending thin limb development
 created_by: mah
 creation_date: 2010-01-25T04:14:02Z
@@ -421923,10 +422184,11 @@
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
 
@@ -422383,6 +422645,7 @@
 subset: goslim_drosophila
 synonym: "cardiovascular system development" NARROW []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-11-16T11:27:39Z
 
@@ -422391,7 +422654,7 @@
 name: vascular cord development
 namespace: biological_process
 def: "The progression of the vascular cord over time from its initial formation until its mature state. The vascular cord is the primordial vasculature that will develop into blood vessels by the process of tubulogenesis." [GOC:mah, PMID:7084422, ZFA:0005077]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072359 ! circulatory system development
 created_by: mah
 creation_date: 2010-11-16T11:46:55Z
@@ -423814,6 +424077,7 @@
 def: "The reproductive developmental process whose specific outcome is the progression of the seminiferous tubule over time, from its formation to the mature structure. Seminiferous tubules are ducts located in the testicles, and are the specific location of meiosis, and the subsequent creation of gametes, namely spermatozoa." [GOC:BHF, GOC:mah, UBERON:0001343]
 is_a: GO:0035295 ! tube development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0008584 ! male gonad development
 created_by: mah
 creation_date: 2011-01-04T12:50:36Z
@@ -430086,6 +430350,14 @@
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
@@ -430135,6 +430407,14 @@
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
@@ -430505,7 +430785,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the integument over time, from its formation to the mature structure. Integument is one of the layers of tissue that usually covers the ovule, enveloping the nucellus and forming the micropyle at the apex." [PMID:19054366, PO:0020021]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048481 ! plant ovule development
 created_by: dhl
 creation_date: 2009-04-13T02:58:07Z
@@ -430759,7 +431039,7 @@
 def: "The process whose specific outcome is the progression of the filament over time, from its formation to the mature structure. Filament is the stalk of a stamen." [PMID:19139039, PO:0009067]
 synonym: "filament development" EXACT []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 created_by: dhl
 creation_date: 2009-04-22T03:12:03Z
@@ -431685,7 +431965,7 @@
 def: "The process whose specific outcome is the progression of the stomium over time, from its formation to the mature structure. A stomium is a fissure or pore in the anther lobe through which the pollen is released." [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0022412 ! cellular process involved in reproduction in multicellular organism
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 created_by: dhl
 creation_date: 2010-09-23T05:03:40Z
@@ -433947,6 +434227,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the hypoblast over time, from its formation to the mature structure. The hypoblast is a tissue formed from the inner cell mass that lies beneath the epiblast." [GOC:dph, GOC:sdb_2009, GOC:tb]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: tb
 creation_date: 2009-07-29T10:25:54Z
 
@@ -435024,7 +435305,7 @@
 name: cochlea development
 namespace: biological_process
 def: "The progression of the cochlea over time from its formation to the mature structure. The cochlea is the snail-shaped portion of the inner ear that is responsible for the detection of sound." [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 created_by: tb
 creation_date: 2009-11-18T11:42:15Z
@@ -435131,7 +435412,7 @@
 name: regulation of COPII vesicle uncoating
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of COPII vesicle uncoating, the process in which COPII vesicle coat proteins are disassembled, and released." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0090112 ! COPII vesicle uncoating
 relationship: regulates GO:0090112 ! COPII vesicle uncoating
@@ -438317,6 +438598,7 @@
 namespace: biological_process
 def: "OBSOLETE. Any process that modulates the rate, frequency, or extent of the chemical reactions and pathways involving ornithine, an amino acid only rarely found in proteins, but which is important in living organisms as an intermediate in the reactions of the urea cycle and in arginine biosynthesis." [GOC:dph, GOC:jp, GOC:tb]
 comment: The reason for obsoletion is that this term was an unnecessary grouping terms and only 'biosynthetic' or 'catabolic' process should be used.
+xref: Reactome:R-HSA-350562 "Regulation of ornithine decarboxylase (ODC)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31171" xsd:anyURI
 is_obsolete: true
 created_by: tb
@@ -439188,16 +439470,18 @@
 
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
 
@@ -440303,7 +440587,7 @@
 name: plant epidermis development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the plant epidermis over time, from its formation to the mature structure." [GOC:tb]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2014-02-27T15:17:37Z
 
@@ -457994,7 +458278,7 @@
 namespace: biological_process
 def: "Development of a plant organ, a multi-tissue plant structure that forms a functional unit." [GOC:dos]
 synonym: "development of a plant organ" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048731 ! system development
 
 [Term]
@@ -461870,9 +462154,10 @@
 def: "Catalysis of the reaction: (2R)-3-sulfopropanediol + 2 NAD+ + H2O = (2R)-3-sulfolactate + 2 NADH + 3 H+." [PMID:20150239, RHEA:28074]
 xref: EC:1.1.1.308
 xref: MetaCyc:RXN-11727
-xref: RHEA:28074 {status="skos:exactMatch"}
+xref: RHEA:28074
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.308
+property_value: skos:exactMatch RHEA:28074
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
 
 [Term]
@@ -461891,6 +462176,7 @@
 xref: RHEA:45812
 xref: RHEA:79187
 xref: RHEA:83119
+xref: RHEA:84379
 is_a: GO:0080023 ! (2E)-enoyl-CoA hydratase activity
 property_value: skos:exactMatch EC:4.2.1.134
 property_value: skos:exactMatch RHEA:45812
@@ -461901,6 +462187,7 @@
 property_value: skos:narrowMatch RHEA:39271
 property_value: skos:narrowMatch RHEA:79187
 property_value: skos:narrowMatch RHEA:83119
+property_value: skos:narrowMatch RHEA:84379
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24738" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25805" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -464769,7 +465056,6 @@
 def: "Catalysis of the reaction: a (2S)-2-hydroxycarboxylate + NAD+ = a 2-oxocarboxylate + NADH + H+." [RHEA:34555]
 xref: EC:1.1.1.337
 xref: MetaCyc:RXN-13927
-xref: Reactome:R-HSA-9971565 "Unknown enzyme hydrogenates HPP"
 xref: RHEA:10176
 xref: RHEA:15533
 xref: RHEA:34555
@@ -472189,6 +472475,9 @@
 namespace: molecular_function
 def: "OBSOLETE. Catalysis of the reaction: S-adenosyl-L-methionine + tRNA = S-adenosyl-L-homocysteine + tRNA containing a 2'-O-nucleotide." [PMID:17242307]
 comment: This term was obsoleted because it is an unnecessray grouping term.
+xref: Reactome:R-HSA-6788668 "TRMT13 2'-O-methylates adenosine-4 in tRNA"
+xref: Reactome:R-HSA-6788684 "TRMT13 2'-O-methylates cytidine-4 in tRNA"
+xref: Reactome:R-HSA-9024159 "FTSJ1 2'-O-methylates cytidine-32 in tRNA(Phe)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31519" xsd:anyURI
 is_obsolete: true
 consider: GO:0106339
@@ -475292,7 +475581,7 @@
 def: "The progression of the yolk syncytial layer over time, from its initial formation to the mature structure. The yolk syncytial layer is the peripheral layer of the yolk cell including nuclei and non-yolky cytoplasm." [PMID:29180571]
 comment: The "yolk syncytial layer" structure can be found in Teleostei, Myxini, Chondrichthyes, Lepisosteiformes and Cephalopoda according.
 synonym: "YSL development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: hjd
 creation_date: 2020-11-05T17:56:43Z
 
@@ -475304,7 +475593,6 @@
 synonym: "tRNA (cytidine 32-2'-O)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytidine(32)-2'-O)-methyltransferase activity" EXACT []
 xref: MetaCyc:RXN-11866
-xref: Reactome:R-HSA-9024159 "FTSJ1 2'-O-methylates cytidine-32 in tRNA(Phe)"
 xref: RHEA:42932
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
 property_value: skos:broadMatch EC:2.1.1.200
@@ -475709,10 +475997,12 @@
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
@@ -475933,6 +476223,29 @@
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
@@ -475953,6 +476266,29 @@
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
@@ -478699,13 +479035,6 @@
 def: "Removes a phospholipid from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle." [GOC:krc, PMID:20823909, PMID:24220498, PMID:25797198]
 synonym: "intermembrane phospholipid transfer activity" NARROW []
 synonym: "phospholipid carrier activity" EXACT []
-xref: Reactome:R-HSA-216757 "4xPALM-C-p-2S-ABCA1 tetramer transports PL from transport vesicle membrane to plasma membrane"
-xref: Reactome:R-HSA-382553 "ABCA7:Apo1A-mediated phospholipid efflux"
-xref: Reactome:R-HSA-5678706 "ABCB4 transports PC from plasma membrane to extracellular region"
-xref: Reactome:R-HSA-5678749 "Defective ABCB4 does not transport PC from plasma membrane to extracellular region"
-xref: Reactome:R-HSA-8857662 "ESYT1:ESYT2:ESYT3 transport GPL from plasma membrane to ER membrane"
-xref: Reactome:R-HSA-8865637 "MFSD2A transports LPC from extracellular region to plasma membrane"
-xref: Reactome:R-HSA-8867876 "OSBPL5,8,10 exchange PS with PI4P from ER membrane to plasma membrane"
 is_a: GO:0120013 ! lipid transfer activity
 relationship: has_part GO:0005543 ! phospholipid binding
 relationship: part_of GO:0015914 ! phospholipid transport
@@ -483429,6 +483758,19 @@
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
@@ -483438,6 +483780,19 @@
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
@@ -483979,8 +484334,12 @@
 synonym: "phosphatidylethanolamine lysophospholipase A1-type activity" EXACT []
 synonym: "phosphatidylethanolamine lysophospholipase activity" BROAD []
 xref: RHEA:32967
+xref: RHEA:40891
+xref: RHEA:40895
 is_a: GO:0120558 ! lysophospholipase A1 activity
 property_value: skos:exactMatch RHEA:32967
+property_value: skos:narrowMatch RHEA:40891
+property_value: skos:narrowMatch RHEA:40895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30258" xsd:anyURI
 created_by: sjm
 creation_date: 2025-05-23T13:15:13Z
@@ -483995,10 +484354,14 @@
 synonym: "phosphatidylserine-specific phospholipase A1" RELATED [EC:3.1.1.111]
 xref: MetaCyc:RXN-20544
 xref: RHEA:32979
+xref: RHEA:40499
+xref: RHEA:44552
 xref: RHEA:51184
 is_a: GO:0120558 ! lysophospholipase A1 activity
 property_value: skos:broadMatch EC:3.1.1.111
 property_value: skos:exactMatch RHEA:32979
+property_value: skos:narrowMatch RHEA:40499
+property_value: skos:narrowMatch RHEA:44552
 property_value: skos:narrowMatch RHEA:51184
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30258" xsd:anyURI
 created_by: sjm
@@ -484141,7 +484504,8 @@
 id: GO:0120571
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
+def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460, RHEA:86675]
+xref: RHEA:86675
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
@@ -484220,9 +484584,9 @@
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
@@ -486267,6 +486631,7 @@
 xref: RHEA:69028
 xref: RHEA:84155
 xref: RHEA:84199
+xref: RHEA:84203
 xref: RHEA:85551
 xref: RHEA:85559
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
@@ -486281,6 +486646,7 @@
 property_value: skos:narrowMatch RHEA:69028
 property_value: skos:narrowMatch RHEA:84155
 property_value: skos:narrowMatch RHEA:84199
+property_value: skos:narrowMatch RHEA:84203
 property_value: skos:narrowMatch RHEA:85551
 property_value: skos:narrowMatch RHEA:85559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29921" xsd:anyURI
@@ -488221,6 +488587,9 @@
 comment: Examples of protein carriers include the soluble TIM chaperone complexes of S. cerevisiae Tim9-Tim10 and Tim8-Tim13, that provide a shuttle system between TOM and the membrane insertases TIM22 and SAM and, thus, ensure that precursors are kept in a translocation-competent conformation.
 synonym: "protein carrier activity" RELATED []
 synonym: "protein transport chaperone" RELATED []
+xref: Reactome:R-HSA-2248891 "M6PR transports activated ARSA to the lysosome"
+xref: Reactome:R-HSA-9662747 "iRHOM2 transports ADAM17 from ER to the Golgi-network"
+xref: Reactome:R-HSA-9662818 "iRHOM2 transports ADAM17:Zn2+ from Golgi to the plasma membrane"
 is_a: GO:0005215 ! transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17073" xsd:anyURI
 created_by: pg
@@ -488983,7 +489352,6 @@
 is_a: GO:0042435 ! indole-containing compound biosynthetic process
 is_a: GO:0043386 ! mycotoxin biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
-is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 relationship: has_part GO:0036469 ! L-tryptophan decarboxylase activity
 relationship: has_part GO:0140381 ! 4-hydroxytryptamine 4-phosphate methyltransferase activity
@@ -489064,8 +489432,6 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: cytidine(4) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(4) in tRNA + S-adenosyl-L-homocysteine + H+. Acts on  cytidine(4) on tRNAPro and tRNAGly(GCC), and on adenosine(4) in tRNAHis." [EC:2.1.1.225, PMID:17242307]
 xref: EC:2.1.1.225
-xref: Reactome:R-HSA-6788668 "TRMT13 2'-O-methylates adenosine-4 in tRNA"
-xref: Reactome:R-HSA-6788684 "TRMT13 2'-O-methylates cytidine-4 in tRNA"
 xref: RHEA:32767
 xref: RHEA:43192
 xref: RHEA:43196
@@ -489299,8 +489665,10 @@
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
@@ -489643,6 +490011,16 @@
 creation_date: 2026-05-11T07:09:55Z
 
 [Term]
+id: GO:0140428
+name: venom-mediated perturbation of immune response
+namespace: biological_process
+def: "A process in which an organism induces an immune response in another organism via the action of a venom." [PMID:35622591]
+is_a: GO:0035738 ! venom-mediated perturbation of biological process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32081" xsd:anyURI
+created_by: pg
+creation_date: 2026-05-27T12:03:10Z
+
+[Term]
 id: GO:0140429
 name: positive regulation of mitotic sister chromatid biorientation
 namespace: biological_process
@@ -489742,6 +490120,28 @@
 creation_date: 2020-02-24T13:27:15Z
 
 [Term]
+id: GO:0140436
+name: mitochondrial signal sequence receptor activity
+namespace: molecular_function
+def: "Binding to a mitochondrial targeting sequence, a short stretch of amino acids found in a protein that acts as a signal to localize the protein to the mitochondrion." [PMID:20729931]
+synonym: "mitochondrial signal sequence binding" NARROW []
+is_a: GO:0005048 ! signal sequence receptor activity
+relationship: part_of GO:7770058 ! mitochondrial protein import pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32142" xsd:anyURI
+created_by: pg
+creation_date: 2026-05-28T07:29:34Z
+
+[Term]
+id: GO:0140437
+name: venom-mediated disruption of chemical synaptic transmission
+namespace: biological_process
+def: "A process in which an organism alters or subverts the synaptic transmission in another organism via the action of a venom." [PMID:12507705, PMID:16549768, PMID:19481459, PMID:26048991, PMID:26221036]
+is_a: GO:0044487 ! venom-mediated perturbation of transmission of nerve impulse
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32180" xsd:anyURI
+created_by: pg
+creation_date: 2026-06-12T11:38:03Z
+
+[Term]
 id: GO:0140438
 name: protein stearoylation
 namespace: biological_process
@@ -489920,6 +490320,16 @@
 creation_date: 2020-04-15T08:52:26Z
 
 [Term]
+id: GO:0140452
+name: venom-mediated perturbation of cholinergic synaptic transmission
+namespace: biological_process
+def: "A process in which an organism alters or subverts the synaptic transmission mediated by the neurotransmitter acetylcholine in another organism via the action of a venom." [PMID:11091135, PMID:28623170, PMID:34204855]
+is_a: GO:0044487 ! venom-mediated perturbation of transmission of nerve impulse
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32180" xsd:anyURI
+created_by: pg
+creation_date: 2026-06-12T11:38:36Z
+
+[Term]
 id: GO:0140453
 name: protein aggregate center
 namespace: cellular_component
@@ -490054,6 +490464,16 @@
 creation_date: 2020-05-13T05:13:24Z
 
 [Term]
+id: GO:0140465
+name: venom-mediated disruption of neuromuscular synaptic transmission
+namespace: biological_process
+def: "A process in which an organism alters or subverts the synaptic transmission at the neuromuscular junction in another organism via the action of a venom." [PMID:11091135, PMID:28623170, PMID:34204855]
+is_a: GO:0140437 ! venom-mediated disruption of chemical synaptic transmission
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32180" xsd:anyURI
+created_by: pg
+creation_date: 2026-06-12T11:38:48Z
+
+[Term]
 id: GO:0140466
 name: iron-sulfur cluster export from the mitochondrion
 namespace: biological_process
@@ -502314,9 +502734,9 @@
 id: GO:0160108
 name: animal gross anatomical part developmental process
 namespace: biological_process
-def: "Any developmental process whose specific outcome is the progression of a gross anatomical part of an animal from an initial immature state, to a later, more mature state." [GOC:pg]
+def: "A developmental process whose specific outcome is the progression of a gross anatomical part of an animal over time from an initial condition to a later condition." [GOC:pg]
 synonym: "animal development" RELATED []
-is_a: GO:0032502 ! developmental process
+is_a: GO:0048856 ! anatomical structure development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22994" xsd:anyURI
 created_by: rynl
 creation_date: 2023-09-18T20:43:55Z
@@ -502325,9 +502745,9 @@
 id: GO:0160109
 name: plant gross anatomical part developmental process
 namespace: biological_process
-def: "Any developmental process whose specific outcome is the progression of a gross anatomical part of a plant from an initial immature state, to a later, more mature state." [GOC:pg]
+def: "A developmental process whose specific outcome is the progression of a gross anatomical part of a plant over time from an initial condition to a later condition." [GOC:pg]
 synonym: "plant development" RELATED []
-is_a: GO:0032502 ! developmental process
+is_a: GO:0048856 ! anatomical structure development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22994" xsd:anyURI
 created_by: rynl
 creation_date: 2023-09-18T20:55:06Z
@@ -505202,47 +505622,48 @@
 
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
 
@@ -516603,8 +517024,8 @@
 is_a: GO:2001210 ! regulation of isopentenyl diphosphate biosynthetic process, mevalonate pathway
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
-relationship: positively_regulates GO:0006720 ! isoprenoid metabolic process
 relationship: positively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: al
 creation_date: 2012-05-02T10:46:46Z
 
@@ -537466,7 +537887,6 @@
 def: "OBSOLETE. The chemical reactions and pathways involving an alpha-amino acid." [GOC:TermGenie]
 comment: The reason for obsoletion is that this term was an unnecessary grouping term and more specific terms were created.
 synonym: "alpha-amino acid metabolism" EXACT [GOC:TermGenie]
-xref: Reactome:R-HSA-977347 "Serine metabolism"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31993" xsd:anyURI
 is_obsolete: true
 created_by: tb
@@ -540210,7 +540630,7 @@
 id: GO:1901755
 name: vitamin D3 biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of vitamin D3." [GOC:TermGenie, GOC:yaf, Unipathway:UPA00955]
+def: "The chemical reactions and pathways resulting in the formation of vitamin D3." [GOC:TermGenie, GOC:yaf, MetaCyc:PWY-6076, Unipathway:UPA00955]
 synonym: "calciol anabolism" EXACT [GOC:TermGenie]
 synonym: "calciol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "calciol biosynthetic process" EXACT [GOC:pr]
@@ -540222,10 +540642,10 @@
 synonym: "vitamin D3 biosynthesis" EXACT [GOC:yaf]
 synonym: "vitamin D3 formation" EXACT [GOC:yaf]
 synonym: "vitamin D3 synthesis" EXACT [GOC:yaf]
+xref: MetaCyc:PWY-6076
 is_a: GO:0042368 ! vitamin D biosynthetic process
-is_a: GO:0070640 ! vitamin D3 metabolic process
-is_a: GO:0120178 ! steroid hormone biosynthetic process
-is_a: GO:1902653 ! secondary alcohol biosynthetic process
+is_a: GO:0046173 ! polyol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32077" xsd:anyURI
 created_by: yaf
 creation_date: 2013-01-14T11:11:09Z
 
@@ -544176,34 +544596,34 @@
 
 [Term]
 id: GO:1901997
-name: negative regulation of indoleacetic acid biosynthetic process
+name: negative regulation of auxin biosynthetic process
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of indoleacetic acid biosynthetic process via tryptophan." [GOC:TermGenie, PMID:23377040]
-synonym: "down regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down regulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down regulation of indoleacetic acid biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down regulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down regulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down-regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down-regulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down-regulation of indoleacetic acid biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down-regulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
-synonym: "down-regulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
-synonym: "downregulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "downregulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
-synonym: "downregulation of indoleacetic acid biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "downregulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
-synonym: "downregulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
-synonym: "inhibition of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "inhibition of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
-synonym: "inhibition of indoleacetic acid biosynthetic process via tryptophan" NARROW [GOC:TermGenie]
-synonym: "inhibition of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
-synonym: "inhibition of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
-synonym: "negative regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
-synonym: "negative regulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
-synonym: "negative regulation of indoleacetic acid biosynthetic process via tryptophan" NARROW []
-synonym: "negative regulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
-synonym: "negative regulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
+def: "Any process that stops, prevents or reduces the frequency, rate or extent of auxin biosynthetic process." [GOC:TermGenie, PMID:23377040]
+synonym: "down regulation of IAA biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "down regulation of indoleacetic acid anabolism" EXACT [GOC:TermGenie]
+synonym: "down regulation of indoleacetic acid biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "down regulation of indoleacetic acid formation" EXACT [GOC:TermGenie]
+synonym: "down regulation of indoleacetic acid synthesis" EXACT [GOC:TermGenie]
+synonym: "down-regulation of IAA biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "down-regulation of indoleacetic acid anabolism" EXACT [GOC:TermGenie]
+synonym: "down-regulation of indoleacetic acid biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "down-regulation of indoleacetic acid formation" EXACT [GOC:TermGenie]
+synonym: "down-regulation of indoleacetic acid synthesis" EXACT [GOC:TermGenie]
+synonym: "downregulation of IAA biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "downregulation of indoleacetic acid anabolism" EXACT [GOC:TermGenie]
+synonym: "downregulation of indoleacetic acid biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "downregulation of indoleacetic acid formation" EXACT [GOC:TermGenie]
+synonym: "downregulation of indoleacetic acid synthesis" EXACT [GOC:TermGenie]
+synonym: "inhibition of IAA biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "inhibition of indoleacetic acid anabolism" EXACT [GOC:TermGenie]
+synonym: "inhibition of indoleacetic acid biosynthetic process" NARROW [GOC:TermGenie]
+synonym: "inhibition of indoleacetic acid formation" EXACT [GOC:TermGenie]
+synonym: "inhibition of indoleacetic acid synthesis" EXACT [GOC:TermGenie]
+synonym: "negative regulation of IAA biosynthetic process" EXACT [GOC:TermGenie]
+synonym: "negative regulation of indoleacetic acid anabolism" EXACT [GOC:TermGenie]
+synonym: "negative regulation of indoleacetic acid biosynthetic process" NARROW []
+synonym: "negative regulation of indoleacetic acid formation" EXACT [GOC:TermGenie]
+synonym: "negative regulation of indoleacetic acid synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0010600 ! regulation of auxin biosynthetic process
 is_a: GO:0032353 ! negative regulation of hormone biosynthetic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
@@ -548301,7 +548721,7 @@
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthesis" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid formation" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0170034 ! L-amino acid biosynthetic process
+is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31371" xsd:anyURI
@@ -557109,14 +557529,18 @@
 
 [Term]
 id: GO:1902767
-name: isoprenoid biosynthetic process via mevalonate
+name: obsolete isoprenoid biosynthetic process via mevalonate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of isoprenoid via mevalonate." [GO_REF:0000092, GOC:mengo_curators, GOC:TermGenie, PMID:11078528]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of isoprenoid via mevalonate." [GO_REF:0000092, GOC:mengo_curators, GOC:TermGenie, PMID:11078528]
+comment: This term was obsoleted because it is represented by isopentenyl diphosphate biosynthetic process, mevalonate pathway ; GO:0019287 or trans, trans-farnesyl diphosphate biosynthetic process ; GO:0045337.
 synonym: "isoprenoid anabolism via mevalonate" EXACT [GOC:TermGenie]
 synonym: "isoprenoid biosynthesis via mevalonate" EXACT [GOC:TermGenie]
 synonym: "isoprenoid formation via mevalonate" EXACT [GOC:TermGenie]
 synonym: "isoprenoid synthesis via mevalonate" EXACT [GOC:TermGenie]
-is_a: GO:0008299 ! isoprenoid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32082" xsd:anyURI
+is_obsolete: true
+consider: GO:0019287
+consider: GO:0045337
 created_by: tt
 creation_date: 2014-03-10T23:45:10Z
 
@@ -569536,7 +569960,7 @@
 def: "Any process that modulates the frequency, rate or extent of synaptic vesicle uncoating." [GO_REF:0000058, GOC:pad, GOC:PARL, GOC:TermGenie, PMID:21563316]
 synonym: "regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
-is_a: GO:1901879 ! regulation of protein depolymerization
+is_a: GO:0043244 ! regulation of protein-containing complex disassembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0016191 ! synaptic vesicle uncoating
 relationship: regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569562,8 +569986,8 @@
 synonym: "inhibition of synaptic vesicle uncoating" NARROW [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "negative regulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
+is_a: GO:0043242 ! negative regulation of protein-containing complex disassembly
 is_a: GO:1900243 ! negative regulation of synaptic vesicle endocytosis
-is_a: GO:1901880 ! negative regulation of protein depolymerization
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -569590,7 +570014,7 @@
 synonym: "upregulation of synaptic vesicle coat depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle coat protein depolymerization" EXACT [GOC:TermGenie]
 synonym: "upregulation of synaptic vesicle uncoating" EXACT [GOC:TermGenie]
-is_a: GO:1901881 ! positive regulation of protein depolymerization
+is_a: GO:0043243 ! positive regulation of protein-containing complex disassembly
 is_a: GO:1903388 ! regulation of synaptic vesicle uncoating
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0016191 ! synaptic vesicle uncoating
@@ -574563,84 +574987,34 @@
 
 [Term]
 id: GO:1903636
-name: regulation of protein insertion into mitochondrial outer membrane
+name: obsolete regulation of protein insertion into mitochondrial outer membrane
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
-synonym: "regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "regulation of protein import into mitochondrial outer membrane" EXACT []
-synonym: "regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-is_a: GO:0010821 ! regulation of mitochondrion organization
-is_a: GO:0060341 ! regulation of cellular localization
-is_a: GO:0070201 ! regulation of establishment of protein localization
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
-relationship: regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
+comment: The reason for obsoletion is that this term was added in error. It is the regulation parent of GO:0045040 (protein insertion into mitochondrial outer membrane), which is being obsoleted as part of the restructuring of mitochondrial protein import (see https://github.com/geneontology/go-ontology/issues/31711).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32102" xsd:anyURI
+is_obsolete: true
 created_by: pga
 creation_date: 2014-11-20T15:54:44Z
 
 [Term]
 id: GO:1903637
-name: negative regulation of protein insertion into mitochondrial outer membrane
+name: obsolete negative regulation of protein insertion into mitochondrial outer membrane
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
-synonym: "down regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "down regulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "down regulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "down regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "down-regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "down-regulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "down-regulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "down-regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "downregulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "downregulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "downregulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "downregulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "inhibition of mitochondrial outer membrane protein import" NARROW [GOC:TermGenie]
-synonym: "inhibition of protein import into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "inhibition of protein insertion into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "inhibition of protein transport into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "negative regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "negative regulation of protein import into mitochondrial outer membrane" EXACT []
-synonym: "negative regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-is_a: GO:0010639 ! negative regulation of organelle organization
-is_a: GO:1903636 ! regulation of protein insertion into mitochondrial outer membrane
-is_a: GO:1904950 ! negative regulation of establishment of protein localization
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
-relationship: negatively_regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
+comment: The reason for obsoletion is that this term was added in error. It is the negative regulation child of GO:1903636, regulating GO:0045040 (protein insertion into mitochondrial outer membrane), which is being obsoleted as part of the restructuring of mitochondrial protein import (see https://github.com/geneontology/go-ontology/issues/31711).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32102" xsd:anyURI
+is_obsolete: true
 created_by: pga
 creation_date: 2014-11-20T15:54:53Z
 
 [Term]
 id: GO:1903638
-name: positive regulation of protein insertion into mitochondrial outer membrane
+name: obsolete positive regulation of protein insertion into mitochondrial outer membrane
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
-synonym: "activation of mitochondrial outer membrane protein import" NARROW [GOC:TermGenie]
-synonym: "activation of protein import into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "activation of protein insertion into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "activation of protein transport into mitochondrial outer membrane" NARROW [GOC:TermGenie]
-synonym: "positive regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "positive regulation of protein import into mitochondrial outer membrane" EXACT []
-synonym: "positive regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "up regulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up regulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up-regulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "up-regulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up-regulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "up-regulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "upregulation of mitochondrial outer membrane protein import" EXACT [GOC:TermGenie]
-synonym: "upregulation of protein import into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "upregulation of protein insertion into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-synonym: "upregulation of protein transport into mitochondrial outer membrane" EXACT [GOC:TermGenie]
-is_a: GO:0010638 ! positive regulation of organelle organization
-is_a: GO:1903636 ! regulation of protein insertion into mitochondrial outer membrane
-is_a: GO:1904951 ! positive regulation of establishment of protein localization
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
-relationship: positively_regulates GO:0045040 ! protein insertion into mitochondrial outer membrane
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of protein insertion into mitochondrial outer membrane." [GO_REF:0000058, GOC:TermGenie, PMID:16374546]
+comment: The reason for obsoletion is that this term was added in error. It is the positive regulation child of GO:1903636, regulating GO:0045040 (protein insertion into mitochondrial outer membrane), which is being obsoleted as part of the restructuring of mitochondrial protein import (see https://github.com/geneontology/go-ontology/issues/31711).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32102" xsd:anyURI
+is_obsolete: true
 created_by: pga
 creation_date: 2014-11-20T15:55:01Z
 
@@ -575720,7 +576094,7 @@
 synonym: "intestinum caecum development" RELATED [GOC:TermGenie]
 synonym: "intestinum crassum caecum development" EXACT [GOC:TermGenie]
 synonym: "intestinum crassum cecum development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T12:05:00Z
 
@@ -575732,7 +576106,7 @@
 synonym: "corneal stroma development" EXACT [GOC:TermGenie]
 synonym: "stroma of cornea development" EXACT [GOC:TermGenie]
 synonym: "substantia propria development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T13:12:09Z
 
@@ -575744,7 +576118,7 @@
 synonym: "esophageal development" EXACT [MGI:csmith]
 synonym: "gullet development" EXACT [GOC:TermGenie]
 synonym: "oesophagus development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T14:41:30Z
 
@@ -578613,7 +578987,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a palisade mesophyll over time, from its formation to the mature structure." [GO_REF:0000080, GOC:TermGenie, PMID:24663344]
 synonym: "palisade parenchyma development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2015-02-04T21:51:44Z
 
@@ -578622,7 +578996,7 @@
 name: extraembryonic membrane development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an extraembryonic membrane over time, from its formation to the mature structure." [GO_REF:0000094, GOC:TermGenie, ISBN:0073040584]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cjm
 creation_date: 2015-02-05T00:42:16Z
 
@@ -584457,7 +584831,8 @@
 synonym: "regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070861 ! regulation of protein exit from endoplasmic reticulum
+is_a: GO:0050794 ! regulation of cellular process
+is_a: GO:0051223 ! regulation of protein transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0030970 ! retrograde protein transport, ER to cytosol
 relationship: regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -584484,7 +584859,8 @@
 synonym: "negative regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "negative regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "negative regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070862 ! negative regulation of protein exit from endoplasmic reticulum
+is_a: GO:0048523 ! negative regulation of cellular process
+is_a: GO:0051224 ! negative regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -584513,7 +584889,8 @@
 synonym: "upregulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, ER to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070863 ! positive regulation of protein exit from endoplasmic reticulum
+is_a: GO:0048522 ! positive regulation of cellular process
+is_a: GO:0051222 ! positive regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -585353,18 +585730,14 @@
 
 [Term]
 id: GO:1904211
-name: membrane protein proteolysis involved in retrograde protein transport, ER to cytosol
+name: obsolete membrane protein proteolysis involved in retrograde protein transport, ER to cytosol
 namespace: biological_process
-def: "Any membrane protein proteolysis that is involved in retrograde protein transport, ER to cytosol." [GO_REF:0000060, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:22795130]
-synonym: "intramembrane cleavage of ERAD substrate" BROAD [PMID:22795130]
-synonym: "intramembrane proteolysis involved in ERAD" EXACT [PMID:22795130]
-synonym: "membrane protein proteolysis involved in protein dislocation from ER" EXACT [GOC:TermGenie]
-synonym: "membrane protein proteolysis involved in protein retrotranslocation, ER to cytosol" EXACT [GOC:TermGenie]
-synonym: "membrane protein proteolysis involved in retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0033619 ! membrane protein proteolysis
-intersection_of: GO:0033619 ! membrane protein proteolysis
-intersection_of: part_of GO:0030970 ! retrograde protein transport, ER to cytosol
-relationship: part_of GO:0030970 ! retrograde protein transport, ER to cytosol
+def: "OBSOLETE. Any membrane protein proteolysis that is involved in retrograde protein transport, ER to cytosol." [GO_REF:0000060, GOC:bf, GOC:PARL, GOC:TermGenie, PMID:22795130]
+comment: The reason for obsoletion is that this term was obsoleted alongside GO:0032527 'protein exit from endoplasmic reticulum' as part of the cleanup of ambiguous ER-exit terms. Consider GO:0033619 'membrane protein proteolysis' or GO:0030970 'retrograde protein transport, ER to cytosol'.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19122" xsd:anyURI
+is_obsolete: true
+consider: GO:0030970
+consider: GO:0033619
 created_by: bf
 creation_date: 2015-05-14T15:26:44Z
 
@@ -598085,7 +598458,7 @@
 synonym: "serosa development" RELATED [GOC:TermGenie]
 synonym: "tunica serosa development" EXACT [GOC:TermGenie]
 synonym: "wall of serous sac development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2015-11-17T19:00:01Z
 
@@ -598094,7 +598467,7 @@
 name: visceral peritoneum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a visceral peritoneum over time, from its formation to the mature structure." [GO_REF:0000094, GOC:dph, GOC:TermGenie, PMID:15840053]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:1904820 ! peritoneum development
 created_by: dph
 creation_date: 2015-11-17T19:00:17Z
@@ -598105,7 +598478,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a parietal peritoneum over time, from its formation to the mature structure." [GO_REF:0000094, GOC:dph, GOC:TermGenie, PMID:15840053]
 synonym: "peritoneal cavity lining development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:1904820 ! peritoneum development
 created_by: dph
 creation_date: 2015-11-17T19:00:24Z
@@ -599018,7 +599391,7 @@
 synonym: "ventral tegmentum development" EXACT [Wikipedia:Ventral_tegmental_area]
 synonym: "ventromedial mesencephalic tegmentum development" RELATED [GOC:TermGenie]
 synonym: "VTA development" BROAD [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030901 ! midbrain development
 created_by: bf
 creation_date: 2015-12-17T14:44:18Z
@@ -599415,7 +599788,7 @@
 synonym: "craniofacial development" NARROW [PMID:11262227]
 synonym: "cranium development" RELATED [GOC:TermGenie]
 synonym: "osteocranium development" NARROW [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: bf
 creation_date: 2016-01-07T13:45:06Z
 
@@ -603589,6 +603962,7 @@
 def: "The process whose specific outcome is the progression of cardiac jelly over time, from its formation to the mature structure. The cardiac jelly is an acellular gelatinous matrix secreted by the myocardium and plays a central role in the septation of the heart." [GO_REF:0000094, GOC:BHF, GOC:rl, GOC:TermGenie, PMID:10645959, PMID:16314491, PMID:19703439]
 synonym: "heart cardiac jelly development" EXACT [GOC:TermGenie]
 is_a: GO:0009888 ! tissue development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: rl
 creation_date: 2016-03-23T13:17:59Z
@@ -608304,7 +608678,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a septum over time, from its formation to the mature structure." [GO_REF:0000080, GOC:tb, GOC:TermGenie, PMID:4562349]
 synonym: "dissepiment development" BROAD [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2016-07-21T18:25:49Z
 
@@ -609123,7 +609497,6 @@
 namespace: cellular_component
 def: "A protein complex which is capable of beta-N-acetylhexosaminidase activity." [GO_REF:0000088, GOC:bhm, GOC:TermGenie, PMID:6458607]
 comment: An example of this is HEXB in human (UniProt symbol P07686) in PMID:6458607 (inferred from direct assay).
-synonym: "HEX A complex" NARROW []
 synonym: "HEX B complex" NARROW []
 synonym: "HEX S complex" NARROW []
 is_a: GO:1902494 ! catalytic complex
@@ -619201,6 +619574,7 @@
 def: "The process whose specific outcome is the progression of an epididymis over time, from its formation to the mature structure." [GO_REF:0000094, GOC:TermGenie, PMID:12388089]
 synonym: "epididymus development" EXACT [GOC:TermGenie]
 is_a: GO:0035295 ! tube development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: sl
 creation_date: 2017-01-27T00:00:33Z
 
@@ -621624,7 +621998,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit replum over time, from its formation to the mature structure. The fruit replum is a portion of fruit placenta tissue that divides a fruit into two or more chambers and develops from a replum." [PMID:23133401, PO:0025267]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
 creation_date: 2013-03-12T21:15:15Z
@@ -621635,7 +622009,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit valve over time, from its formation to the mature structure. The fruit valve is a part of a fruit that splits apart when the fruit dehisces." [PMID:23133401, PO:0000033]
 is_a: GO:0009791 ! post-embryonic development
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
 creation_date: 2013-03-12T21:21:15Z
@@ -624895,6 +625269,7 @@
 synonym: "penile bone development" EXACT [GOC:sl]
 synonym: "penis bone development" EXACT [GOC:sl]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: sl
 creation_date: 2014-05-01T23:59:13Z
 
@@ -626000,11 +626375,13 @@
 
 [Term]
 id: GO:1990473
-name: ciliary targeting signal binding
+name: obsolete ciliary targeting signal binding
 namespace: molecular_function
-def: "Binding to a ciliary targeting sequence, a specific peptide sequence that acts as a signal to localize a membrane protein to the ciliary membrane." [GOC:krc, PMID:18256283, PMID:19575670, PMID:20603001, PMID:20697559]
+def: "OBSOLETE. Binding to a ciliary targeting sequence, a specific peptide sequence that acts as a signal to localize a membrane protein to the ciliary membrane." [GOC:krc, PMID:18256283, PMID:19575670, PMID:20603001, PMID:20697559]
+comment: This term was obsoleted because there is no evidence that a specific ciliary receptor exists; proteins are recruited to the cilium by interacting proteins but not via a signal sequence.
 synonym: "CTS binding" EXACT []
-is_a: GO:0005048 ! signal sequence receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31419" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2014-09-02T08:22:03Z
 
@@ -648282,13 +648659,13 @@
 synonym: "regulation of isopentenyl diphosphate formation, mevalonate pathway" EXACT [GOC:obol]
 synonym: "regulation of isopentenyl diphosphate synthesis, mevalonate pathway" EXACT [GOC:obol]
 is_a: GO:0019219 ! regulation of nucleobase-containing compound metabolic process
-is_a: GO:0019747 ! regulation of isoprenoid metabolic process
 is_a: GO:0042762 ! regulation of sulfur metabolic process
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 is_a: GO:0071071 ! regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
 relationship: regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: bf
 creation_date: 2011-11-15T10:53:42Z
 
@@ -648302,7 +648679,6 @@
 synonym: "negative regulation of isopentenyl diphosphate anabolism, mevalonate pathway" EXACT [GOC:obol]
 synonym: "negative regulation of isopentenyl diphosphate formation, mevalonate pathway" EXACT [GOC:obol]
 synonym: "negative regulation of isopentenyl diphosphate synthesis, mevalonate pathway" EXACT [GOC:obol]
-is_a: GO:0045827 ! negative regulation of isoprenoid metabolic process
 is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 is_a: GO:0071072 ! negative regulation of phospholipid biosynthetic process
@@ -648310,6 +648686,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
 relationship: negatively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: bf
 creation_date: 2011-11-15T10:53:45Z
 
@@ -650207,7 +650584,9 @@
 name: N(6),N(6),N(6)-trimethyl-L-lysine transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of N(6),N(6),N(6)-trimethyl-L-lysine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
+xref: RHEA:86419
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
+property_value: skos:exactMatch RHEA:86419
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650217,8 +650596,10 @@
 namespace: molecular_function
 def: "Enables the transfer of dimethylarginine from one side of a membrane to the other." [PMID:41075780, PMID:41075794]
 xref: RHEA:75047
+xref: RHEA:86423
 is_a: GO:0022857 ! transmembrane transporter activity
 property_value: skos:narrowMatch RHEA:75047
+property_value: skos:narrowMatch RHEA:86423
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30986" xsd:anyURI
 created_by: dragon-ai-agent
 
@@ -650760,7 +651141,7 @@
 def: "A process by which an organism causes inflammatory response in another organism via the action of a venom." [PMID:19000915, PMID:32024243]
 synonym: "envenomation resulting in positive regulation of inflammatory response in another organism" EXACT []
 synonym: "venom-mediated inflammation" BROAD []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31902" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2026-05-07T07:41:13Z
@@ -650802,12 +651183,18 @@
 
 [Term]
 id: GO:7770075
-name: venom-mediated leukocyte infiltration
+name: venom-mediated leukocyte migration
 namespace: biological_process
-def: "A venom-mediated activation of inflammatory response that triggers leucocyte infiltration in another organism." [PMID:19000915, PMID:26072684, PMID:32024243]
+def: "A venom-mediated activation of inflammatory response that triggers leukocyte migration in another organism." [PMID:19000915, PMID:26072684, PMID:32024243]
 synonym: "envenomation resulting in positive regulation of leukocyte migration involved in inflammatory response in another organism" EXACT []
+synonym: "venom-mediated granulocyte migration" NARROW []
+synonym: "venom-mediated leukocyte infiltration" NARROW []
+synonym: "venom-mediated mononuclear leukocyte migration" NARROW []
+synonym: "venom-mediated neutrophil migration" NARROW []
+synonym: "venom-mediated polymorphonuclear leukocyte migration" NARROW []
 is_a: GO:7770071 ! venom-mediated activation of inflammatory response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31902" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32097" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2026-05-07T13:33:49Z
 
@@ -650823,6 +651210,98 @@
 created_by: dragon-ai-agent
 creation_date: 2026-05-07T13:33:49Z
 
+[Term]
+id: GO:7770077
+name: negative regulation of PKR/eIFalpha signaling
+namespace: biological_process
+def: "Any process that stops, prevents or reduces the frequency, rate or extent of PKR/eIFalpha signaling." [PMID:19733181, PMID:29395325]
+synonym: "down regulation of PKR/eIFalpha signaling" EXACT []
+synonym: "down-regulation of PKR/eIFalpha signaling" EXACT []
+synonym: "downregulation of PKR/eIFalpha signaling" EXACT []
+synonym: "negative regulation of EIF2AK2 signal transduction" EXACT []
+synonym: "negative regulation of PKR signal transduction" EXACT []
+is_a: GO:0080135 ! regulation of cellular response to stress
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
+intersection_of: GO:0065007 ! biological regulation
+intersection_of: negatively_regulates GO:0039585 ! PKR/eIFalpha signaling
+relationship: negatively_regulates GO:0039585 ! PKR/eIFalpha signaling
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32127" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-05-21T09:17:29Z
+
+[Term]
+id: GO:7770078
+name: obsolete regulation of cytogamy
+namespace: biological_process
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of cytogamy." [PMID:27798845]
+comment: This term was created as a grouping parent for positive regulation of cytogamy (GO:7770079), but the GO does not automatically generate regulation triads. The parent term is unnecessary as there is no curation use case.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32085" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-05-22T09:23:32Z
+
+[Term]
+id: GO:7770079
+name: positive regulation of cytogamy
+namespace: biological_process
+def: "Any process that activates or increases the frequency, rate or extent of cytogamy." [PMID:27798845]
+synonym: "up regulation of cytogamy" EXACT []
+synonym: "up-regulation of cytogamy" EXACT []
+synonym: "upregulation of cytogamy" EXACT []
+is_a: GO:0048522 ! positive regulation of cellular process
+is_a: GO:2000243 ! positive regulation of reproductive process
+intersection_of: GO:0065007 ! biological regulation
+intersection_of: positively_regulates GO:0000755 ! cytogamy
+relationship: part_of GO:0031139 ! positive regulation of conjugation with cellular fusion
+relationship: positively_regulates GO:0000755 ! cytogamy
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32085" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-05-22T09:23:32Z
+
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
 [Typedef]
 id: ends_during
 name: ends during
```
