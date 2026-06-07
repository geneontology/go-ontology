# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-06-07 06:54:54.103357498 +0000
+++ go.obo	2026-06-07 07:02:32.194855935 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-05-19
+data-version: releases/2026-06-07
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-05-19" xsd:string
+property_value: owl:versionInfo "2026-06-07" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -3072,10 +3072,16 @@
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
 
@@ -9992,6 +9998,7 @@
 def: "The process whose specific outcome is the progression of the skeleton over time, from its formation to the mature structure. The skeleton is the bony framework of the body in vertebrates (endoskeleton) or the hard outer envelope of insects (exoskeleton or dermoskeleton)." [GOC:dph, GOC:jid, GOC:tb]
 synonym: "skeletal development" EXACT []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0001502
@@ -10399,7 +10406,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ovarian follicle over time, from its formation to the mature structure." [https://www.ncbi.nlm.nih.gov/books/NBK279054/]
 synonym: "follicular phase" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0008585 ! female gonad development
 
 [Term]
@@ -10676,7 +10683,7 @@
 name: blood vessel development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a blood vessel over time, from its formation to the mature structure. The blood vessel is the vasculature carrying blood." [GOC:hjd, UBERON:0001981]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001944 ! vasculature development
 
 [Term]
@@ -11414,6 +11421,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the urogenital system over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: has_part GO:0072001 ! renal system development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22178" xsd:anyURI
 
@@ -13245,7 +13253,7 @@
 def: "The process whose specific outcome is the progression of the blastocyst over time, from its formation to the mature structure. The mammalian blastocyst is a hollow ball of cells containing two cell types, the inner cell mass and the trophectoderm. The blastula follows the morula and precedes the gastrula in the developmental sequence." [GOC:dph, ISBN:0124020607, ISBN:0198542771]
 comment: See also the Anatomical Dictionary for Mouse Development ontology terms 'TS5, embryo ; EMAP:23', 'TS5, inner cell mass ; EMAP:24' and 'TS5, trophectoderm; EMAP:28'.
 synonym: "blastula development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001701 ! in utero embryonic development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29162" xsd:anyURI
 
@@ -13928,8 +13936,8 @@
 def: "Maternally driven process whose specific outcome is the progression of the placenta over time, from its formation to the mature structure. The placenta is an organ of metabolic interchange between fetus and mother, partly of embryonic origin and partly of maternal origin." [GOC:add, ISBN:068340007X]
 synonym: "decidua development" RELATED [GOC:dph]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0060135 ! maternal process involved in female pregnancy
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001890 ! placenta development
 
 [Term]
@@ -14539,7 +14547,7 @@
 alt_id: GO:0001943
 def: "The process whose specific outcome is the progression of the hair follicle over time, from its formation to the mature structure. A hair follicle is a tube-like opening in the epidermis where the hair shaft develops and into which the sebaceous glands open." [GOC:dph, UBERON:0002073]
 is_a: GO:0022405 ! hair cycle process
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0098773 ! skin epidermis development
 
 [Term]
@@ -14549,6 +14557,7 @@
 def: "The process whose specific outcome is the progression of the vasculature over time, from its formation to the mature structure. The vasculature is an interconnected tubular multi-tissue structure that contains fluid that is actively transported around the organism." [GOC:dph, UBERON:0002409]
 synonym: "vascular system development" RELATED []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072359 ! circulatory system development
 
 [Term]
@@ -14556,7 +14565,7 @@
 name: lymph vessel development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a lymph vessel over time, from its formation to the mature structure." [GOC:dph, UBERON:0001473]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001944 ! vasculature development
 
 [Term]
@@ -16049,7 +16058,7 @@
 def: "The process whose specific outcome is the progression of the lens over time, from its formation to the mature structure. The lens is a transparent structure in the eye through which light is focused onto the retina. An example of this process is found in Mus musculus." [GOC:dph, ISBN:0582064333]
 synonym: "lens development" EXACT []
 synonym: "lens development in camera-style eye" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 
 [Term]
@@ -16784,6 +16793,7 @@
 def: "The process whose specific outcome is the progression of the larva over time, from its formation to the mature structure. The larva is the early, immature form of an that at birth or hatching is fundamentally unlike its parent and must metamorphose before assuming the adult characters." [GOC:jid, ISBN:0877795088]
 is_a: GO:0007275 ! multicellular organism development
 is_a: GO:0009791 ! post-embryonic development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002165
@@ -16792,6 +16802,7 @@
 def: "The process whose specific outcome is the progression of the instar larva or pupa over time, from its formation to the mature structure. An example of this process is found in Drosophila melanogaster." [GOC:jid, GOC:mtg_sensu]
 is_a: GO:0007275 ! multicellular organism development
 is_a: GO:0009791 ! post-embryonic development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002167
@@ -18740,7 +18751,6 @@
 name: plasma kallikrein-kinin cascade
 namespace: biological_process
 def: "A series of reactions that takes place outside the cell occurring in response to tissue damage and initiated within blood plasma by the action of activated Factor XII (Hageman Factor) on prekallikrein to convert it to plasma kallikrein, and the subsequent reaction of plasma kallikrein with high molecular weight kininogen. The ultimate product of the plasma kallikrein-kinin cascade is bradykinin, an agent known to induce smooth muscle contraction, vasoconstriction, and increased vascular permeability." [GOC:add, ISBN:0721601871, PMID:11842287, PMID:14501145]
-xref: Reactome:R-HSA-9970672 "FXIIa activates plasma kallikrein-kinin system"
 is_a: GO:0002254 ! kinin cascade
 
 [Term]
@@ -20257,6 +20267,7 @@
 subset: goslim_drosophila
 is_a: GO:0002376 ! immune system process
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0002521
@@ -24747,7 +24758,10 @@
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
@@ -27546,7 +27560,7 @@
 name: endocardium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endocardium over time, from its formation to the mature structure. The endocardium is an anatomical structure comprised of an endothelium and an extracellular matrix that forms the innermost layer of tissue of the heart, and lines the heart chambers." [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-01T12:42:27Z
@@ -27685,7 +27699,7 @@
 namespace: biological_process
 def: "The progression of a heart valve over time, from its formation to the mature structure. A heart valve is a structure that restricts the flow of blood to different regions of the heart and forms from an endocardial cushion." [GOC:mtg_heart]
 synonym: "cardiac valve development" EXACT [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-08T10:50:09Z
@@ -28050,7 +28064,7 @@
 name: cardiac chamber development
 namespace: biological_process
 def: "The progression of a cardiac chamber over time, from its formation to the mature structure. A cardiac chamber is an enclosed cavity within the heart." [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: dph
 creation_date: 2009-10-13T09:11:18Z
@@ -28858,7 +28872,7 @@
 namespace: biological_process
 def: "The progression of a cardiac septum over time, from its initial formation to the mature structure." [GOC:mtg_heart]
 synonym: "heart septum development" EXACT [GOC:mtg_heart]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003205 ! cardiac chamber development
 created_by: dph
 creation_date: 2009-10-20T09:45:13Z
@@ -29773,7 +29787,7 @@
 name: brainstem development
 namespace: biological_process
 def: "The progression of the brainstem from its formation to the mature structure. The brainstem is the part of the brain that connects the brain with the spinal cord." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-12-03T10:47:20Z
 
@@ -30315,7 +30329,7 @@
 name: neural retina development
 namespace: biological_process
 def: "The progression of the neural retina over time from its initial formation to the mature structure. The neural retina is the part of the retina that contains neurons and photoreceptor cells." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060041 ! retina development in camera-type eye
 created_by: dph
 creation_date: 2009-12-21T02:15:14Z
@@ -30346,7 +30360,7 @@
 name: anterior rotation of the optic cup
 namespace: biological_process
 def: "A 90 degree-rotation of the optic cup resulting in its alignment with the anterior-posterior body axis." [GOC:ascb_2009, GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2009-12-21T02:49:48Z
@@ -32067,7 +32081,6 @@
 xref: MetaCyc:2.3.2.13-RXN
 xref: Reactome:R-HSA-140851 "fibrin multimer -> fibrin multimer, crosslinked + NH4+"
 xref: Reactome:R-HSA-6810894 "Envoplakin, periplakin, involucrin, SPR binding mediated by TGM1 crosslinking"
-xref: Reactome:R-HSA-9921091 "IIb3:fibrin multimer ->IIb3:fibrin multimer, crosslinked + NH4+"
 xref: RHEA:54816
 is_a: GO:0016755 ! aminoacyltransferase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
@@ -32574,8 +32587,8 @@
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
@@ -33207,13 +33220,13 @@
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
@@ -33862,8 +33875,8 @@
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
@@ -34284,7 +34297,6 @@
 xref: Reactome:R-HSA-5649734 "LIG3 ligates NEIL1,NEIL2-generated single strand break"
 xref: Reactome:R-HSA-5651789 "LIG1 bound to POLB ligates SSB"
 xref: Reactome:R-HSA-5651805 "LIG1 bound to APEX1 and PCNA ligates SSB"
-xref: Reactome:R-HSA-5686663 "Completion of SSA"
 xref: Reactome:R-HSA-5687675 "LIG3 ligates remaining SSBs in MMEJ"
 xref: Reactome:R-HSA-5690997 "Ligation of newly synthesized repair patch to incised DNA in GG-NER"
 xref: Reactome:R-HSA-5693604 "XRCC4:LIG4 ligates DNA DSB ends during NHEJ"
@@ -34503,7 +34515,7 @@
 xref: EC:1.7.1.7
 xref: KEGG_REACTION:R01134
 xref: MetaCyc:GMP-REDUCT-RXN
-xref: Reactome:R-HSA-514604 "GMP + NADPH + 2 H+ => IMP + NADP+ + NH4+ (GMPR,GMPR2)"
+xref: Reactome:R-HSA-514604 "GMP + NADPH + H+ => IMP + NADP+ + NH4+ (GMPR,GMPR2)"
 xref: RHEA:17185
 is_a: GO:0046857 ! oxidoreductase activity, acting on other nitrogenous compounds as donors, with NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.7.1.7
@@ -35552,8 +35564,6 @@
 xref: Reactome:R-HSA-9837511 "Abortive replication of hRSV A"
 xref: Reactome:R-HSA-9922955 "NS5 synthesizes minus strand genome"
 xref: Reactome:R-HSA-9923068 "NS5 synthesizes plus strand genome"
-xref: Reactome:R-HSA-9944255 "CHD6 negatively regulates influenza transcription"
-xref: Reactome:R-HSA-9944257 "CHD6 negatively regulates positive strand RNA synthesis"
 is_a: GO:0034062 ! 5'-3' RNA polymerase activity
 relationship: part_of GO:0001172 ! RNA-templated transcription
 property_value: skos:exactMatch EC:2.7.7.48
@@ -35919,12 +35929,12 @@
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
@@ -36177,13 +36187,13 @@
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
@@ -36895,9 +36905,6 @@
 xref: Reactome:R-HSA-6813749 "ALDH1A1 oxidises GA to DGA"
 xref: Reactome:R-HSA-71691 "acetaldehyde + NAD+ => acetate + NADH + H+ [cytosolic]"
 xref: Reactome:R-HSA-71723 "acetaldehyde + NAD+ => acetate + NADH + H+ [mitochondrial]"
-xref: Reactome:R-HSA-9970035 "Unknown ALDH oxidizes methylimidazolealdehyde"
-xref: Reactome:R-HSA-9971429 "Unknown ALDH oxidizes 10-oxo-DECA"
-xref: Reactome:R-HSA-9971446 "Unknown ALDH oxidizes 3-AAPNAL"
 xref: RHEA:16185
 xref: RHEA:30867
 xref: RHEA:30879
@@ -39236,7 +39243,7 @@
 xref: EC:3.5.4.5
 xref: MetaCyc:CYTIDEAM-RXN
 xref: MetaCyc:CYTIDEAM2-RXN
-xref: Reactome:R-HSA-73608 "deamination of 2'-Deoxycytidine to 2'-Deoxyuridine"
+xref: Reactome:R-HSA-73608 "(deoxy)cytidine + H2O => (deoxy)uridine + NH4+ (CDA)"
 xref: Reactome:R-HSA-83677 "C4 deamination of cytidine"
 xref: Reactome:R-HSA-9817513 "AICDA deaminates cytidine in chromatin containing histone H3.3 and 5-methylcytidine"
 xref: RHEA:13433
@@ -39947,8 +39954,8 @@
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
@@ -40286,7 +40293,7 @@
 xref: EC:3.6.1.23
 xref: KEGG_REACTION:R02100
 xref: MetaCyc:DUTP-PYROP-RXN
-xref: Reactome:R-HSA-73666 "hydrolysis of  2'-deoxyuridine 5'-triphosphate to form  2'-deoxyuridine 5'-phosphate"
+xref: Reactome:R-HSA-73666 "dUTP + H2O => dUMP + pyrophosphate"
 xref: RHEA:10248
 is_a: GO:0047429 ! nucleoside triphosphate diphosphatase activity
 property_value: skos:exactMatch EC:3.6.1.23
@@ -40464,7 +40471,6 @@
 xref: Reactome:R-HSA-9934893 "Proteolysis of K48polyUb-K,p-S-PER1,2,3"
 xref: Reactome:R-HSA-9949676 "The proteasome degrades the alanine-tailed K48-polyUb nascent peptide bound to LTN1:NEMF:TCF25:VCP hexamer"
 xref: Reactome:R-HSA-9954728 "The proteasome degrades the K48-polyubiquitinated alanine-tailed nascent peptide"
-xref: Reactome:R-HSA-9958874 "26S proteasome degrades ubiquitinated RAC1, CDC42"
 is_a: GO:0008233 ! peptidase activity
 property_value: skos:narrowMatch EC:3.4.99.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25813" xsd:anyURI
@@ -40681,7 +40687,7 @@
 xref: EC:3.4.16.6
 xref: MetaCyc:3.4.16.2-RXN
 xref: MetaCyc:3.4.16.5-RXN
-xref: Reactome:R-HSA-9857945 "prekallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1-> kallikrein:kininogen:C1QBP, C1QBP:KRT1, PLAUR:KRT1 (PRCP catalyst)"
+xref: Reactome:R-HSA-158251 "prekallikrein:kininogen:C1q binding protein tetramer -> kallikrein:kininogen:C1q binding protein tetramer"
 is_a: GO:0004180 ! carboxypeptidase activity
 is_a: GO:0070008 ! serine-type exopeptidase activity
 property_value: skos:exactMatch EC:3.4.16.-
@@ -41504,7 +41510,6 @@
 xref: Reactome:R-HSA-9840532 "OMA1 self-cleaves"
 xref: Reactome:R-HSA-9840564 "OMA1 hydrolyzes YME1L1"
 xref: Reactome:R-HSA-9844241 "ADAMTS13 cleaves VWF variant multimer"
-xref: Reactome:R-HSA-9934645 "ADAMTS13 cleaves VWF multimer bound to FVIII"
 is_a: GO:0004175 ! endopeptidase activity
 is_a: GO:0008237 ! metallopeptidase activity
 property_value: skos:exactMatch EC:3.4.24.-
@@ -41982,9 +41987,12 @@
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
@@ -41995,6 +42003,7 @@
 xref: Reactome:R-HSA-158137 "factor VIII:von Willibrand factor multimer -> factor VIIIa + factor VIIIa B A3 acidic polypeptide + von Willibrand factor multimer"
 xref: Reactome:R-HSA-158164 "factor X -> factor Xa + factor X activation peptide (VIIIa:IXa catalyst)"
 xref: Reactome:R-HSA-158300 "factor XI:platelet glycoprotein (GP) Ib:IX:V complex -> factor XIa:platelet glycoprotein (GP) Ib:IX:V complex (XIIa catalyst)"
+xref: Reactome:R-HSA-158311 "kallikrein:kininogen:C1q binding protein tetramer -> kallikrein + activated kininogen:C1q binding protein tetramer + bradykinin"
 xref: Reactome:R-HSA-158313 "factor XII -> factor XIIa"
 xref: Reactome:R-HSA-158333 "factor IX -> factor IXa + factor IX activation peptide (factor XIa catalyst)"
 xref: Reactome:R-HSA-158419 "factor XI:platelet glycoprotein (GP) Ib:IX:V complex -> factor XIa:platelet glycoprotein (GP) Ib:IX:V complex (thrombin catalyst)"
@@ -42128,15 +42137,12 @@
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
@@ -42147,24 +42153,16 @@
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
@@ -42185,17 +42183,7 @@
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
@@ -42701,13 +42689,13 @@
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
@@ -45032,8 +45020,6 @@
 xref: Reactome:R-HSA-427514 "eNoSC deacetylates histone H3"
 xref: Reactome:R-HSA-433672 "NoRC:HDAC:DNMT deacetylates histone H4 and methylates histone H3"
 xref: Reactome:R-HSA-6805650 "MTA2-NuRD complex deacetylates TP53"
-xref: Reactome:R-HSA-9941704 "NuRD deacetylates telomeric nucleosomes"
-xref: Reactome:R-HSA-9944092 "NuRD deacetylates nucleosomes"
 is_a: GO:0033558 ! protein lysine deacetylase activity
 is_a: GO:0140993 ! histone modifying activity
 property_value: skos:broadMatch EC:2.3.1.-
@@ -47036,7 +47022,6 @@
 xref: Reactome:R-HSA-9915992 "Arachidonate is hydroxylated to 17-HETE by CYP(1)"
 xref: Reactome:R-HSA-9915993 "Arachidonate is hydroxylated to 18-HETE by CYP(1)"
 xref: Reactome:R-HSA-9915997 "Arachidonate is epoxidated to 14,15-EET by CYP(5)"
-xref: Reactome:R-HSA-9971246 "Unknown CYP 450 omega-hydroxylates C10 fatty acid"
 is_a: GO:0016491 ! oxidoreductase activity
 property_value: skos:broadMatch EC:1.-.-.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30165" xsd:anyURI
@@ -47568,6 +47553,7 @@
 xref: Reactome:R-HSA-5358518 "MLH1:PMS2 makes single strand incision near 1-2 base mismatch"
 xref: Reactome:R-HSA-5690990 "5'- incision of DNA by ERCC1:ERCC4 in GG-NER"
 xref: Reactome:R-HSA-5693533 "DCLRE1C (ARTEMIS) processes DNA DSB ends"
+xref: Reactome:R-HSA-72180 "Cleavage of mRNA at the 3'-end"
 xref: Reactome:R-HSA-9970193 "CPSF3 cleaves pre-mRNA at distal 3'UTR PAS"
 xref: Reactome:R-HSA-9970282 "U1 snRNP suppresses CPSF3-mediated pre-mRNA cleavage at intronic PAS"
 xref: Reactome:R-HSA-9970294 "CPSF3 cleaves pre-mRNA at proximal 3'UTR PAS"
@@ -47945,8 +47931,7 @@
 xref: Reactome:R-HSA-482621 "(d)NTP + ADP <=> (d)NDP + ATP (NME1,2,3)"
 xref: Reactome:R-HSA-482804 "(d)NDP + ATP <=> (d)NTP + ADP (NME4)"
 xref: Reactome:R-HSA-482812 "(d)NTP + ADP <=> (d)NDP + ATP (NME4)"
-xref: Reactome:R-HSA-6806877 "NME1:NME3 heterohexamer phosphorylates NDPs to NTPs"
-xref: Reactome:R-HSA-9605496 "NME6 phosphorylates (d)NDPs to (d)NTPs"
+xref: Reactome:R-HSA-6806877 "NME1:NME3 heterohexamer, NME2P1 phosphorylate NDPs to NTPs"
 xref: Reactome:R-HSA-9748969 "NME1:2 hexamer phosphorylates 6TdGDP to 6TdGTP"
 xref: Reactome:R-HSA-9748999 "NME1:2 hexamer phosphorylates 6TGDP to 6TGTP"
 xref: Reactome:R-HSA-9755013 "NME1,2 hexamers phosphorylate RBV-DP"
@@ -49562,8 +49547,6 @@
 xref: MetaCyc:PHOSPHOLIPASE-A2-RXN
 xref: MetaCyc:RXN-15065
 xref: MetaCyc:RXN-15067
-xref: Reactome:R-HSA-111881 "Phospho-cPLA2 translocates to membranes when intracellular calcium levels increase"
-xref: Reactome:R-HSA-111883 "PLA2G4A (cPLA2) hydrolyzes phosphatidylcholine"
 xref: Reactome:R-HSA-1482604 "PA is hydrolyzed to 1-acyl LPA by PLA2[1] (OM)"
 xref: Reactome:R-HSA-1482656 "PA is hydrolysed to 1-acyl LPA by PLA2[1]"
 xref: Reactome:R-HSA-1482679 "PA is hydrolysed to 1-acyl LPA by PLA2G2A"
@@ -49589,7 +49572,6 @@
 xref: Reactome:R-HSA-1602417 "PC is hydrolyzed to 1-acyl LPC by PLA2[16]"
 xref: Reactome:R-HSA-1602446 "PA is hydrolyzed to 1-acyl LPA by PLA2[15]"
 xref: Reactome:R-HSA-8848484 "PLA2s hydrolyze phospholipids at the Golgi membrane"
-xref: Reactome:R-HSA-8952251 "PLA2G15 hydrolyses LPC to GPCho and LCFA(-)"
 xref: RHEA:15801
 xref: RHEA:38779
 xref: RHEA:38847
@@ -50659,7 +50641,7 @@
 xref: Reactome:R-HSA-163418 "perilipin + 2 ATP -> phosphorylated perilipin + 2 ADP"
 xref: Reactome:R-HSA-1638803 "Phosphorylation of cohesin by PLK1 at centromeres"
 xref: Reactome:R-HSA-164151 "LKB1 phosphorylates the alpha subunit of AMPK heterotrimer"
-xref: Reactome:R-HSA-165162 "Phosphorylation of TSC2 by AKT (PKB)"
+xref: Reactome:R-HSA-165162 "Phosphorylation of TSC2 by PKB"
 xref: Reactome:R-HSA-165182 "Phosphorylation of complexed TSC2 by PKB"
 xref: Reactome:R-HSA-165692 "Phosphorylation of 4E-BP1 by activated mTORC1"
 xref: Reactome:R-HSA-165718 "mTORC1 phosphorylation of RPS6KB1 (S6K)"
@@ -50705,7 +50687,7 @@
 xref: Reactome:R-HSA-198611 "AKT phosphorylates IKKalpha"
 xref: Reactome:R-HSA-198613 "AKT phosphorylates p21Cip1 and p27Kip1"
 xref: Reactome:R-HSA-198621 "AKT phosphorylates caspase-9"
-xref: Reactome:R-HSA-198640 "mTORC2 phosphorylates AKT at S473"
+xref: Reactome:R-HSA-198640 "TORC2 (mTOR) phosphorylates AKT at S473"
 xref: Reactome:R-HSA-198669 "p38MAPK phosphorylates MSK1"
 xref: Reactome:R-HSA-198731 "ERK1/2 activates ELK1"
 xref: Reactome:R-HSA-198746 "ERK1/2/5 activate RSK1/2/3"
@@ -50807,7 +50789,7 @@
 xref: Reactome:R-HSA-349455 "Phosphorylation of MDM4 by ATM"
 xref: Reactome:R-HSA-374696 "Phosphorylation of L1 by p90rsk"
 xref: Reactome:R-HSA-3769394 "AKT phosphorylates CBY1"
-xref: Reactome:R-HSA-377186 "Activated AKT phosphorylates AKT1S1 (PRAS40)"
+xref: Reactome:R-HSA-377186 "Activated Akt1 phosphorylates AKT1S1 (PRAS40)"
 xref: Reactome:R-HSA-3772435 "WNT signaling stimulates CSNK1-dependent phosphorylation of DVL"
 xref: Reactome:R-HSA-380272 "Plk1-mediated phosphorylation of Nlp"
 xref: Reactome:R-HSA-381091 "IRE1 dimer autophosphorylates"
@@ -50954,7 +50936,7 @@
 xref: Reactome:R-HSA-5693609 "ATM phosphorylates TP53 at S15"
 xref: Reactome:R-HSA-5694441 "CSNK1D phosphorylates SEC23"
 xref: Reactome:R-HSA-6788392 "ATR phosphorylates RPA2, FANCI, FANCD2 and FANCM at ICL-DNA"
-xref: Reactome:R-HSA-6795290 "mTORC2 phosphorylates SGK1"
+xref: Reactome:R-HSA-6795290 "TORC2 complex phosphorylates SGK1"
 xref: Reactome:R-HSA-6795460 "SGK1 phosphorylates MDM2"
 xref: Reactome:R-HSA-6795473 "PDPK1 phosphorylates SGK1"
 xref: Reactome:R-HSA-6798372 "ATM phosphorylates DYRK2"
@@ -51155,7 +51137,6 @@
 xref: Reactome:R-HSA-9943687 "PLK3 phosphorylates CDC25A"
 xref: Reactome:R-HSA-9943736 "Casein kinase I phosphorylates CDC25A"
 xref: Reactome:R-HSA-9954237 "PIM1 phosphorylates GBP1"
-xref: Reactome:R-HSA-9975250 "PGK1 phosphorylates AKT1S1"
 is_a: GO:0004672 ! protein kinase activity
 property_value: skos:exactMatch EC:2.7.11.-
 property_value: skos:exactMatch MetaCyc:PROTEIN-KINASE-RXN
@@ -52271,9 +52252,6 @@
 xref: Reactome:R-HSA-9865196 "p-Y393-ABL1 phosphorylates tyrosine-407 of YAP1"
 xref: Reactome:R-HSA-9931290 "IL6-activated JAK1 phosphorylates CD274"
 xref: Reactome:R-HSA-9934751 "CDH1 is phosphorylated on tyrosine residues"
-xref: Reactome:R-HSA-9958871 "Tyrosine phosphorylation of STAT3 by IL6 receptor"
-xref: Reactome:R-HSA-9958889 "SRC phosphorylates CDH1"
-xref: Reactome:R-HSA-9958892 "SRC promotes RAC1 and CDC42 activation by phosphorylating RAC1 and CDC42 GEFs"
 xref: RHEA:10596
 is_a: GO:0004672 ! protein kinase activity
 property_value: skos:exactMatch EC:2.7.10.-
@@ -52744,8 +52722,8 @@
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
@@ -53428,7 +53406,6 @@
 xref: Reactome:R-HSA-1606288 "SMPD4 hydrolyzes sphingomyelin (ER membrane)"
 xref: Reactome:R-HSA-1640164 "ENPP7 hydrolyzes sphingomyelin"
 xref: Reactome:R-HSA-193706 "Production of ceramide which can activate JNK and other targets"
-xref: Reactome:R-HSA-9769742 "SMPD1 converts sphingomyelin to ceramide"
 xref: RHEA:19253
 xref: RHEA:45324
 xref: RHEA:54284
@@ -53935,7 +53912,7 @@
 xref: MetaCyc:THIOREDOXIN-REDUCT-NADPH-RXN
 xref: Reactome:R-HSA-1222485 "TrxB reactivates TrxA"
 xref: Reactome:R-HSA-3323050 "TXNRD2 catalyzes the reduction of TXN2 by NADPH"
-xref: Reactome:R-HSA-73646 "Regeneration of active (reduced) Thioredoxin"
+xref: Reactome:R-HSA-73646 "thioredoxin, oxidized + NADPH + H+ => thioredoxin, reduced + NADP+"
 xref: Reactome:R-HSA-9617735 "TXN disrupts FOXO4 complex with EP300"
 xref: RHEA:20345
 is_a: GO:0016209 ! antioxidant activity
@@ -54105,7 +54082,7 @@
 xref: EC:2.1.1.45
 xref: KEGG_REACTION:R02101
 xref: MetaCyc:THYMIDYLATESYN-RXN
-xref: Reactome:R-HSA-73605 "conversion of dUMP to dTMP"
+xref: Reactome:R-HSA-73605 "dUMP + N5,N10-methylene tetrahydrofolate => TMP + dihydrofolate"
 xref: RHEA:12104
 is_a: GO:0042083 ! 5,10-methylenetetrahydrofolate-dependent methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.45
@@ -55212,7 +55189,6 @@
 xref: Reactome:R-HSA-9948301 "ZNF598 K63 polyubiquitinates RPS10 (eS10) and RPS20 (uS10) of the 40S ribosomal subunit"
 xref: Reactome:R-HSA-9954721 "NEDD8-K699-CUL2:ELOB:ELOC:RBX1:KLHDC10 K48 polyubiquitinates alanine-tailed nascent peptide"
 xref: Reactome:R-HSA-9955146 "S.flexneri ipaH9.8 ubiquitinates GBPs"
-xref: Reactome:R-HSA-9958873 "Cell-to-cell contact through homophilic cadherin interactions inhibits RAC1/CDC42 ubiquitination"
 xref: Reactome:R-HSA-9970191 "RBBP6 activates CPSF complex"
 is_a: GO:0019787 ! ubiquitin-like protein transferase activity
 
@@ -55687,7 +55663,6 @@
 xref: Reactome:R-HSA-158893 "alpha-2-antiplasmin + plasmin -> alpha-2-antiplasmin:plasmin"
 xref: Reactome:R-HSA-159001 "urokinase plasminogen activator (two-chain):uPAR + plasminogen activator inhibitor 2 (PAI-2) -> PAI-2:urokinase plasminogen activator (two-chain):uPAR"
 xref: Reactome:R-HSA-159005 "urokinase plasminogen activator (two-chain):uPAR + plasminogen activator inhibitor 1 (PAI-1) -> PAI-1:urokinase plasminogen activator (two-chain):uPAR"
-xref: Reactome:R-HSA-9823284 "FXa binds SERPINC1:HS"
 is_a: GO:0004866 ! endopeptidase inhibitor activity
 relationship: negatively_regulates GO:0004252 ! serine-type endopeptidase activity
 
@@ -57367,11 +57342,14 @@
 
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
@@ -57402,6 +57380,7 @@
 namespace: molecular_function
 alt_id: GO:0008262
 def: "Combining with a nuclear export signal (NES) on a cargo to be transported, to mediate transport of a the cargo through the nuclear pore, from the nuclear lumen to the cytoplasm. The cargo can be either a RNA or a protein." [GOC:bf, GOC:mah, GOC:pg, GOC:vw, PMID:11743003, PMID:25802992, PMID:28713609, Wikipedia:Nuclear_transport]
+comment: This term should not be used for direct annotation. Use  either nuclear export signal receptor activity or nuclear import signal receptor activity.
 synonym: "exportin activity" RELATED []
 synonym: "importin-alpha binding" RELATED []
 synonym: "importin-alpha export receptor activity" NARROW [GO:0008262]
@@ -57426,29 +57405,35 @@
 
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
@@ -57894,7 +57879,6 @@
 xref: Reactome:R-HSA-9695853 "FLT3 mutants:GRB2:SOS1-mediated nucleotide exchange on RAS"
 xref: Reactome:R-HSA-9703441 "SOS1-mediated nucleotide exchange of RAS downstream of FLT3 fusion mutants"
 xref: Reactome:R-HSA-9751201 "p-VAV1,2,3 exchange 6TGTP for GDP on RAC1"
-xref: Reactome:R-HSA-9970163 "SRC-phosphorylated RAC1,(CDC42) GEFs activate RAC1,(CDC42)"
 is_a: GO:0030695 ! GTPase regulator activity
 relationship: negatively_regulates GO:0019003 ! GDP binding
 relationship: positively_regulates GO:0005525 ! GTP binding
@@ -60933,7 +60917,7 @@
 namespace: molecular_function
 def: "Enables the transfer of a GDP-fucose from one side of a membrane to the other. GDP-fucose is a substance composed of fucose in glycosidic linkage with guanosine diphosphate." [GOC:ai, GOC:mtg_transport, ISBN:0815340729]
 xref: Reactome:R-HSA-5653596 "Defective SLC35C1 does not transport UDP-Fuc from cytosol to Golgi lumen"
-xref: Reactome:R-HSA-742345 "SLC35C1 transports GDP-Fuc from cytosol to Golgi lumen"
+xref: Reactome:R-HSA-742345 "SLC35C1 transport GDP-Fuc from cytosol to Golgi lumen"
 is_a: GO:0036080 ! purine nucleotide-sugar transmembrane transporter activity
 relationship: part_of GO:0015783 ! GDP-fucose transmembrane transport
 
@@ -61058,7 +61042,6 @@
 synonym: "carnitine:acyl carnitine carrier activity" EXACT []
 synonym: "fatty acyl carnitine carrier" EXACT []
 xref: Reactome:R-HSA-200424 "Exchange of acylcarnitine and carnitine across the inner mitochondrial membrane"
-xref: Reactome:R-HSA-9971094 "SLC25A20 exports excess acyl-CAR"
 is_a: GO:0015226 ! carnitine transmembrane transporter activity
 is_a: GO:0015227 ! O-acyl-L-carnitine transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
@@ -61618,6 +61601,13 @@
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
@@ -66275,7 +66265,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -71288,6 +71277,7 @@
 def: "The addition of a methyl group to a protein amino acid. A methyl group is derived from methane by the removal of a hydrogen atom." [GOC:ai]
 subset: gocheck_obsoletion_candidate
 synonym: "protein amino acid methylation" EXACT [GOC:bf]
+xref: Reactome:R-HSA-8876725 "Protein methylation"
 is_a: GO:0008213 ! protein alkylation
 is_a: GO:0043414 ! macromolecule methylation
 
@@ -72483,6 +72473,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving L-serine, the L-enantiomer of serine, i.e. (2S)-2-amino-3-hydroxypropanoic acid." [GOC:ai, GOC:jsg]
 synonym: "L-serine metabolism" EXACT []
+xref: Reactome:R-HSA-977347 "Serine metabolism"
 is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
@@ -72546,7 +72537,6 @@
 xref: MetaCyc:PWY66-428
 xref: MetaCyc:THRDLCTCAT-PWY
 xref: MetaCyc:THREONINE-DEG2-PWY
-xref: Reactome:R-HSA-8849175 "Threonine catabolism"
 xref: UM-BBD_pathwayID:met
 is_a: GO:0006566 ! L-threonine metabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
@@ -72963,7 +72953,6 @@
 synonym: "polyamine synthesis" EXACT []
 xref: MetaCyc:POLYAMINSYN3-PWY
 xref: MetaCyc:POLYAMSYN-PWY
-xref: Reactome:R-HSA-350562 "Regulation of ornithine decarboxylase (ODC)"
 xref: Reactome:R-HSA-351200 "Interconversion of polyamines"
 is_a: GO:0006595 ! polyamine metabolic process
 is_a: GO:0042401 ! biogenic amine biosynthetic process
@@ -73329,6 +73318,7 @@
 synonym: "protein import into mitochondrion" EXACT []
 synonym: "protein targeting to mitochondria" EXACT []
 synonym: "protein-mitochondrial targeting" EXACT []
+xref: Reactome:R-HSA-1268020 "Mitochondrial protein import"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30349" xsd:anyURI
 is_obsolete: true
 replaced_by: GO:0070585
@@ -75875,12 +75865,13 @@
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
@@ -81372,6 +81363,7 @@
 synonym: "pan-neural process" RELATED []
 xref: Reactome:R-HSA-9675108 "Nervous system development"
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007400
@@ -81533,6 +81525,7 @@
 synonym: "CNS development" EXACT []
 xref: Wikipedia:Neural_development
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81540,7 +81533,7 @@
 name: ventral midline development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ventral midline over time, from its formation to the mature structure. In protostomes (such as insects, snails and worms) as well as deuterostomes (vertebrates), the midline is an embryonic region that functions in patterning of the adjacent nervous tissue. The ventral midline in insects is a cell population extending along the ventral surface of the embryo and is the region from which cells detach to form the ventrally located nerve cords. In vertebrates, the midline is originally located dorsally. During development, it folds inwards and becomes the ventral part of the dorsally located neural tube and is then called the ventral midline, or floor plate." [GOC:bf, GOC:curators, PMID:12075342]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 
 [Term]
@@ -81566,6 +81559,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stomatogastric nervous system over time, from its formation to the mature structure." [GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81574,6 +81568,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the peripheral nervous system over time, from its formation to the mature structure. The peripheral nervous system is one of the two major divisions of the nervous system. Nerves in the PNS connect the central nervous system (CNS) with sensory organs, other organs, muscles, blood vessels and glands." [GOC:curators, UBERON:0000010]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -81860,7 +81855,7 @@
 namespace: biological_process
 def: "The morphogenetic furrow is a dorsoventral indentation which sweeps anteriorly across the eye disc. Ommatidia begin to form along the furrow, resulting in a graded series of ommatidial development across the anterior/posterior axis of the disc." [PMID:3076112, PMID:3937883]
 synonym: "progression of morphogenetic furrow during compound eye morphogenesis" RELATED [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001745 ! compound eye morphogenesis
 
 [Term]
@@ -81993,7 +81988,7 @@
 name: notum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dorsal part of the body over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035220 ! wing disc development
 
 [Term]
@@ -82079,7 +82074,7 @@
 name: analia development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the analia over time, from its formation to the mature structure. The analia is the posterior-most vertral appendage that develops from the genital disc. An example of this process is analia development in Drosophila melanogaster." [GOC:ai, GOC:mtg_sensu]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035215 ! genital disc development
 
 [Term]
@@ -82153,7 +82148,7 @@
 name: anterior midgut development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anterior midgut over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007494 ! midgut development
 
 [Term]
@@ -82161,7 +82156,7 @@
 name: posterior midgut development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the posterior midgut over time, from its formation to the mature structure." [GOC:curators]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007494 ! midgut development
 
 [Term]
@@ -82627,6 +82622,7 @@
 def: "A biological process in which an animal physically develops after birth or hatching, involving a conspicuous and relatively abrupt change in the animal's form or structure. Examples include the change from tadpole to frog, and the change from larva to adult. An example of this is found in Drosophila melanogaster." [GOC:sensu, ISBN:0198506732, ISBN:0721662544]
 xref: Wikipedia:Metamorphosis
 is_a: GO:0007275 ! multicellular organism development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0007553
@@ -83084,6 +83080,7 @@
 comment: See also the biological process term 'blood coagulation, extrinsic pathway ; GO:0007598' and 'blood coagulation, common pathway ; GO:0072377'.
 synonym: "initiation of blood coagulation cascade, contact activation system" EXACT [PMID:18695377]
 synonym: "initiation of blood coagulation cascade, contact pathway" EXACT [PMID:26018600]
+xref: Reactome:R-HSA-140837 "Intrinsic Pathway of Fibrin Clot Formation"
 is_a: GO:0072376 ! protein activation cascade
 relationship: part_of GO:0072378 ! blood coagulation, fibrin clot formation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30501" xsd:anyURI
@@ -83095,6 +83092,7 @@
 def: "A protein activation cascade that initiates blood coagulation, starting with a signal from tissue factor (TF), a cell-surface, integral-membrane protein, which converts Factor IX to IXa, and Factor IXa converts Factor X to Xa. Factor Xa then initiates the common pathway." [GOC:add, GOC:mah, GOC:pde, PMID:26018600]
 comment: See also the biological process term 'blood coagulation, intrinsic pathway ; GO:0007597' and 'blood coagulation, common pathway ; GO:0072377'.
 synonym: "initiation of blood coagulation cascade, tissue factor pathway" EXACT [PMID:26018600]
+xref: Reactome:R-HSA-140834 "Extrinsic Pathway of Fibrin Clot Formation"
 is_a: GO:0072376 ! protein activation cascade
 relationship: part_of GO:0072378 ! blood coagulation, fibrin clot formation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30501" xsd:anyURI
@@ -84218,7 +84216,6 @@
 xref: Reactome:R-HSA-6790987 "NAT10 acetylates cytidine-1337 and cytidine-1842 of 18S rRNA yielding 4-acetylcytidine-1377 and 4-acetylcytidine-1842"
 xref: Reactome:R-HSA-9636560 "Eis acetylates DUSP16"
 xref: Reactome:R-HSA-9913373 "AAC(6)-Ib acetylates ciprofloxacin"
-xref: Reactome:R-HSA-9971629 "Unknown NAT N-acetylates kynurenine"
 is_a: GO:0016407 ! acetyltransferase activity
 
 [Term]
@@ -85240,13 +85237,16 @@
 
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
@@ -86262,7 +86262,7 @@
 xref: Reactome:R-HSA-5684864 "NAPSA, CTSH, PGA3-5 cleave pro-SFTPB"
 xref: Reactome:R-HSA-5685902 "NAPSA, CTSH, PGA3-5 cleave pro-SFTPC"
 xref: Reactome:R-HSA-6803060 "DCD(63-110) is processed to DCD(63-109)"
-xref: Reactome:R-HSA-9935547 "Lysosomal degradation of ubiquitinated CDH1"
+xref: Reactome:R-HSA-9935547 "Lysosomal degradation of ubiqutinated CDH1"
 is_a: GO:0016787 ! hydrolase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch EC:3.4.-.-
@@ -86569,7 +86569,7 @@
 xref: Reactome:R-HSA-109278 "NT5E:Zn2+ hydrolyses AMP,dAMP,GMP, IMP"
 xref: Reactome:R-HSA-109291 "CMP or TMP or UMP + H2O => cytidine, thymidine, or uridine + orthophosphate [NT5E]"
 xref: Reactome:R-HSA-109380 "(d)CMP, TMP, or (d)UMP + H2O => (deoxy)cytidine, thymidine, or (deoxy)uridine + orthophosphate (NT5C1A)"
-xref: Reactome:R-HSA-109387 "(2'-deoxy)purine nucleoside 5'-monophosphate + H2O => (2'-deoxy)purine nucleoside + orthophosphate [NT5C1A]"
+xref: Reactome:R-HSA-109387 "(d)AMP, (d)GMP, or (d)IMP + H2O => (deoxy)adenosine, (deoxy)guanosine, or (deoxy)inosine + orthophosphate (NT5C1A)"
 xref: Reactome:R-HSA-109415 "AMP + H2O => adenosine + orthophosphate [NT5C1B]"
 xref: Reactome:R-HSA-109449 "(d)CMP, TMP, or (d)UMP + H2O => (deoxy)cytidine, thymidine, or (deoxy)uridine + orthophosphate (NT5C3)"
 xref: Reactome:R-HSA-109470 "(d)GMP or (d)IMP + H2O => (d)G or (d)I + orthophosphate (NT5C)"
@@ -89599,7 +89599,6 @@
 synonym: "aminotransferase activity" EXACT []
 xref: EC:2.6.1.-
 xref: Reactome:R-HSA-1237102 "Transamination of MOB to methionine"
-xref: Reactome:R-HSA-9972889 "AADAT transaminates 3HKYN to xanthurenate"
 is_a: GO:0016769 ! transferase activity, transferring nitrogenous groups
 property_value: skos:exactMatch EC:2.6.1.-
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -93198,7 +93197,7 @@
 synonym: "uridine diphosphoacetylglucosamine 2'-epimerase activity" RELATED [EC:5.1.3.14]
 xref: EC:5.1.3.14
 xref: MetaCyc:UDPGLCNACEPIM-RXN
-xref: Reactome:R-HSA-4085021 "GNE hydrolyzes and epimerises UDP-GlcNAc to ManNAc and UDP"
+xref: Reactome:R-HSA-4085021 "GNE hydrolyzes/epimerises UDP-GlcNAc to ManNAc and UDP"
 xref: Reactome:R-HSA-4088338 "Defective GNE does not hydrolyse UDP-GlcNAc"
 xref: RHEA:17213
 is_a: GO:0016857 ! racemase and epimerase activity, acting on carbohydrates and derivatives
@@ -105933,6 +105932,7 @@
 xref: Reactome:R-HSA-5619507 "Activation of HOX genes during differentiation"
 xref: Wikipedia:Embryogenesis
 is_a: GO:0007275 ! multicellular organism development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009791
@@ -105958,7 +105958,8 @@
 def: "The process whose specific outcome is the progression of the embryo over time, from zygote formation to the end of seed dormancy. An example of this process is found in Arabidopsis thaliana." [GOC:curators, GOC:mtg_sensu]
 synonym: "embryogenesis" BROAD []
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009790 ! embryo development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -106919,7 +106920,7 @@
 synonym: "histogenesis" EXACT []
 synonym: "histogenesis and organogenesis" BROAD []
 xref: Wikipedia:Histogenesis
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0009889
@@ -107771,7 +107772,8 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endosperm over time, from its formation to the mature structure. The endosperm is formed during fertilization and provides nutrients to the developing embryo." [GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -109097,7 +109099,8 @@
 def: "The process whose specific outcome is the progression of phloem and/or xylem over time, from formation to the mature structure. An example of this process is found in Arabidopsis thaliana." [GOC:mtg_sensu, GOC:tb]
 synonym: "vascular tissue development" BROAD []
 synonym: "vascular tissue histogenesis" EXACT []
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010088
@@ -109192,6 +109195,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the suspensor over time, from its formation to the mature structure. The suspensor is the extension at the base of the embryo that anchors the embryo in the embryo sac and pushes it into the endosperm." [GOC:tb, ISBN:0471245208]
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010099
@@ -109849,6 +109853,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fruit over time, from its formation to the mature structure. The fruit is a reproductive body of a seed plant." [GOC:sm]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0010155
@@ -110381,6 +110386,7 @@
 def: "The process whose specific outcome is the progression of the seed coat over time, from its formation to the mature structure." [GOC:curators]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048316 ! seed development
 
 [Term]
@@ -110643,15 +110649,13 @@
 
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
@@ -110777,6 +110781,7 @@
 def: "The process whose specific outcome is the progression of the floral nectaries over time, from its formation to the mature structure." [GOC:lr]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
 [Term]
@@ -111491,13 +111496,11 @@
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the chemical reactions and pathways resulting in the formation of isopentenyl diphosphate produced via the methylerythritol (MEP) pathway (mevalonate-independent)." [PMID:16531478]
 synonym: "regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
-is_a: GO:0006109 ! regulation of carbohydrate metabolic process
-is_a: GO:0010565 ! regulation of ketone metabolic process
-is_a: GO:0019747 ! regulation of isoprenoid metabolic process
 is_a: GO:0071071 ! regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
 relationship: regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 
 [Term]
 id: GO:0010323
@@ -111510,12 +111513,11 @@
 synonym: "inhibition of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" NARROW []
 synonym: "negative regulation of isopentenyl diphosphate biosynthetic process, mevalonate-independent pathway" EXACT []
 is_a: GO:0010322 ! regulation of isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
-is_a: GO:0045827 ! negative regulation of isoprenoid metabolic process
-is_a: GO:0045912 ! negative regulation of carbohydrate metabolic process
 is_a: GO:0071072 ! negative regulation of phospholipid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
 relationship: negatively_regulates GO:0019288 ! isopentenyl diphosphate biosynthetic process, methylerythritol 4-phosphate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 
 [Term]
 id: GO:0010324
@@ -112995,7 +112997,8 @@
 name: stele development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stele over time, from its formation to the mature structure. The stele is the central column of primary vascular tissue in the root and any tissue that it surrounds." [GOC:tb]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
 [Term]
@@ -116845,6 +116848,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stipule over time, from its formation to the mature structure. A stipule is one of (usually) a pair of appendages at the bases of leaves in many broad-leaved angiosperms." [GOC:tb]
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048366 ! leaf development
 
 [Term]
@@ -121524,6 +121528,7 @@
 synonym: "protein disulphide oxidoreductase activity" EXACT []
 xref: Reactome:R-HSA-1307802 "MIA40:ERV1 (CHCHD4:GFER) oxidizes cysteine residues to cystine disulfide bonds"
 xref: Reactome:R-HSA-264997 "P4HB mediates disulfide bond formation in Proinsulin"
+xref: Reactome:R-HSA-3299753 "CCS transfers Cu to SOD1 and oxidizes cysteine residues in SOD1"
 xref: Reactome:R-HSA-9817575 "ERO1B oxidizes P4HB"
 is_a: GO:0015036 ! disulfide oxidoreductase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
@@ -123213,7 +123218,6 @@
 synonym: "betaine/GABA:sodium symporter activity" NARROW []
 synonym: "glycine betaine/proline porter activity" NARROW []
 synonym: "proline/glycine/betaine:hydrogen/sodium symporter activity" NARROW []
-xref: Reactome:R-HSA-6797957 "SLC22A4 transports BET from mitochondrial matrix to cytosol"
 is_a: GO:0015651 ! quaternary ammonium group transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 relationship: part_of GO:0015838 ! amino-acid betaine transport
@@ -123381,7 +123385,7 @@
 xref: Reactome:R-HSA-429594 "SLC5A7 cotransports Cho, Cl-, Na+ from extracellular region to cytosol"
 xref: Reactome:R-HSA-444433 "Cho transports from the extracellular space to the cytosol"
 xref: Reactome:R-HSA-5658483 "Defective SLC5A7 does not cotransport Cho, Cl-, Na+ from extracellular region to cytosol"
-xref: Reactome:R-HSA-6797956 "SLC44A1 and SLC44A2 transport Cho from cytosol to mitochondrial matrix"
+xref: Reactome:R-HSA-6797956 "SLC44A1 transports Cho from cytosol to mitochondrial matrix"
 is_a: GO:0022857 ! transmembrane transporter activity
 relationship: part_of GO:0015871 ! choline transport
 
@@ -125938,6 +125942,7 @@
 def: "Primary active carrier-mediated transport of a protein across a membrane, driven by the hydrolysis of the diphosphate bond of inorganic pyrophosphate, ATP, or another nucleoside triphosphate. The transport protein may or may not be transiently phosphorylated, but the substrate is not phosphorylated." [GOC:mtg_transport, ISBN:0815340729]
 synonym: "P-P-bond-hydrolysis-driven protein transmembrane transporter activity" RELATED []
 synonym: "protein translocase activity" EXACT []
+xref: Reactome:R-HSA-1222523 "SodB gets secreted"
 is_a: GO:0008320 ! transmembrane protein transporter activity
 is_a: GO:0042626 ! ATPase-coupled transmembrane transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21271" xsd:anyURI
@@ -128162,6 +128167,7 @@
 namespace: biological_process
 def: "OBSOLETE. The directed movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Organic anions are atoms or small molecules with a negative charge which contain carbon in covalent linkage." [GOC:ai, GOC:krc]
 comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+xref: Reactome:R-HSA-9955298 "SLC-mediated transport of organic anions"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30715" xsd:anyURI
 is_obsolete: true
 replaced_by: GO:0055085
@@ -133424,7 +133430,6 @@
 synonym: "selenocysteine synthesis" EXACT []
 xref: MetaCyc:PWY-6281
 xref: MetaCyc:PWY0-901
-xref: Reactome:R-HSA-2408557 "Selenocysteine synthesis"
 is_a: GO:0042398 ! modified amino acid biosynthetic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
@@ -134243,7 +134248,7 @@
 name: mushroom body development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the mushroom body over time, from its formation to the mature structure. The mushroom body is composed of the prominent neuropil structures of the insect central brain, thought to be crucial for olfactory associated learning. These consist mainly of a bulbous calyx and tightly packaged arrays of thin parallel fibers of the Kenyon cells." [PMID:8790424]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -134712,7 +134717,6 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the carnitine molecule." [GOC:ai]
 xref: Reactome:R-HSA-200410 "CPT2 converts acylcarnitine to acyl-CoA"
-xref: Reactome:R-HSA-9971123 "CRAT transfers ISB to CAR"
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
@@ -135958,7 +135962,6 @@
 def: "A copper chaperone activity that specifically delivers copper to the Cu-Zn superoxide dismutase, to activate superoxide dismutase activity." [GOC:vw, http://link.springer-ny.com/link/service/journals/00335/papers/0011005/00110409.html, PMID:15064408, PMID:9295278]
 comment: See also the molecular function term 'superoxide dismutase activity ; GO:0004784'.
 synonym: "superoxide dismutase copper carrier activity" EXACT []
-xref: Reactome:R-HSA-3299753 "CCS transfers Cu to SOD1 and oxidizes cysteine residues in SOD1"
 is_a: GO:0016531 ! copper chaperone activity
 
 [Term]
@@ -140005,9 +140008,6 @@
 xref: Reactome:R-HSA-9668415 "VPS4 mediates disassembly of ESCRTIII subunits to promote sealing of holes in the nuclear envelope"
 xref: Reactome:R-HSA-9706399 "RHOBTB3 hydrolyzes ATP"
 xref: Reactome:R-HSA-9749350 "ATP-dependent release of CDT1 from the OCCM complex"
-xref: Reactome:R-HSA-9943614 "CHD2-dependent H3.3 deposition at MYOG gene"
-xref: Reactome:R-HSA-9944087 "CHD6-9-dependent ATP hydrolysis"
-xref: Reactome:R-HSA-9944091 "NuRD hydrolyzes ATP to affect nucleosome organization"
 xref: Reactome:R-HSA-9948300 "RQT complex:K63polyUb-80S ribosome dissociates yielding K63polyUb-40S subunit and 60S subunit:peptidyl-tRNA with nascent peptide"
 xref: Reactome:R-HSA-9949632 "VCP hexamer extracts K48 polyubiquitinated alanine-tailed nascent peptide from VCP hexamer:UFD1:NPLOC4:LTN1:NEMF:TCF25:60S ribosome subunit:K48polyUb-nascent peptide"
 xref: Reactome:R-HSA-9955731 "ABCE1:PELO:80S Ribosome:non-stop mRNA:peptidyl-tRNA with elongating peptide dissociates yielding ABCE1:40S ribosomal subunit, PELO, and 60S ribosomal subunit:peptidyl-tRNA with nascent peptide"
@@ -142385,8 +142385,8 @@
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
@@ -142514,9 +142514,6 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phospholipids from one membrane bilayer leaflet to the other, by an ATP-independent mechanism." [GOC:cjm, PMID:20043909, PMID:20302864]
 comment: Nomenclature note. Scramblases are ATP-independent, non-selective, translocases inducing non-specific transbilayer movements across the membrane. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases).
-xref: Reactome:R-HSA-9853809 "ANO6 exposes PS, PE on the platelet membrane"
-xref: Reactome:R-HSA-9853849 "Defective ANO6 does not expose PS, PE on the platelet membrane"
-xref: Reactome:R-HSA-9854657 "ANO5, ANO6 expose PS, PE on endothelial cells"
 is_a: GO:0140303 ! intramembrane lipid carrier activity
 relationship: part_of GO:0017121 ! plasma membrane phospholipid scrambling
 
@@ -156549,7 +156546,7 @@
 xref: Reactome:R-HSA-110138 "AK5,7,8,9 phosphorylates (d)NMPs to (d)NDPs"
 xref: Reactome:R-HSA-73598 "(2'-deoxy)cytidine + ATP => (d)CMP + ADP (DCK)"
 xref: Reactome:R-HSA-73599 "cytidine or uridine + ATP => CMP or UMP + ADP [UCK1]"
-xref: Reactome:R-HSA-73632 "phosphorylation of 2'-Deoxythymidine to dTMP"
+xref: Reactome:R-HSA-73632 "thymidine + ATP => TMP (deoxythymidine 5'-monophosphate) + ADP [TK1]"
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
 is_a: GO:0019205 ! nucleobase-containing compound kinase activity
 relationship: part_of GO:0009165 ! nucleotide biosynthetic process
@@ -160206,6 +160203,7 @@
 synonym: "methionine regeneration" NARROW []
 synonym: "methionine salvage from methylthioadenosine" EXACT [GOC:mah]
 synonym: "methionine salvage pathway" EXACT []
+xref: Reactome:R-HSA-1237112 "Methionine salvage pathway"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 is_obsolete: true
@@ -160318,6 +160316,7 @@
 synonym: "L-threonine catabolism to glycine" EXACT [GOC:bf, GOC:mah]
 synonym: "L-threonine degradation to glycine" EXACT [GOC:bf, GOC:mah]
 synonym: "threonine catabolic process to glycine" BROAD [GOC:bf]
+xref: Reactome:R-HSA-8849175 "Threonine catabolism"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30734" xsd:anyURI
 is_obsolete: true
@@ -163571,8 +163570,6 @@
 xref: Reactome:R-HSA-8956365 "ZBED1 (DREF) SUMOylates CHD3 with SUMO1"
 xref: Reactome:R-HSA-9920126 "UBC9 SUMOylates NS5"
 xref: Reactome:R-HSA-9926476 "UBE2I sumoylates MITF-M"
-xref: Reactome:R-HSA-9940458 "GATAD2B is SUMOylated"
-xref: Reactome:R-HSA-9940470 "GATAD2A is SUMOylated"
 is_a: GO:0019787 ! ubiquitin-like protein transferase activity
 
 [Term]
@@ -165870,7 +165867,7 @@
 name: spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the spinal cord over time, from its formation to the mature structure. The spinal cord primarily conducts sensory and motor nerve impulses between the brain and the peripheral nervous tissues." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 
 [Term]
@@ -165923,7 +165920,7 @@
 name: dorsal spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dorsal region of the spinal cord over time, from its formation to the mature structure. The dorsal region of the mature spinal cord contains neurons that process and relay sensory input." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:11179871]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 
 [Term]
@@ -165931,7 +165928,7 @@
 name: ventral spinal cord development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the ventral region of the spinal cord over time, from its formation to the mature structure. The neurons of the ventral region of the mature spinal cord participate in motor output." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 
 [Term]
@@ -166087,7 +166084,7 @@
 name: diencephalon development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the diencephalon over time, from its formation to the mature structure. The diencephalon is the paired caudal parts of the prosencephalon from which the thalamus, hypothalamus, epithalamus and subthalamus are derived; these regions regulate autonomic, visceral and endocrine function, and process information directed to the cerebral cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -166096,7 +166093,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the telencephalon over time, from its formation to the mature structure. The telencephalon is the paired anteriolateral division of the prosencephalon plus the lamina terminalis from which the olfactory lobes, cerebral cortex, and subcortical nuclei are derived." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
 synonym: "cerebrum development" EXACT [GOC:sl, PMID:22331407]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -166104,7 +166101,7 @@
 name: epithalamus development
 namespace: biological_process
 def: "The progression of the epithalamus over time from its initial formation until its mature state. The epithalamus is the small dorsomedial area of the thalamus including the habenular nuclei and associated fiber bundles, the pineal body, and the epithelial roof of the third ventricle." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -166113,7 +166110,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the subthalamus over time, from its formation to the mature structure. The subthalamus is the anterior part of the diencephalon that lies between the thalamus, hypothalamus, and tegmentum of the mesencephalon, including subthalamic nucleus, zona incerta, the fields of Forel, and the nucleus of ansa lenticularis." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "ventral thalamus development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -166131,7 +166128,7 @@
 def: "The process whose specific outcome is the progression of the ammon gyrus over time, from its formation to the mature structure. The ammon gyrus, often subdivided into the CA1 and CA3 regions, is one of the two interlocking gyri of the hippocampus that is rich in large pyramidal neurons." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "Ammon's horn development" RELATED [GOC:cls]
 synonym: "cornu ammonis development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021766 ! hippocampus development
 
 [Term]
@@ -166139,7 +166136,7 @@
 name: dentate gyrus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the dentate gyrus over time, from its formation to the mature structure. The dentate gyrus is one of two interlocking gyri of the hippocampus. It contains granule cells, which project to the pyramidal cells and interneurons of the CA3 region of the ammon gyrus." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021766 ! hippocampus development
 
 [Term]
@@ -166147,7 +166144,7 @@
 name: pallium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pallium over time, from its formation to the mature structure. The pallium is the roof region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -166155,7 +166152,7 @@
 name: subpallium development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the subpallium over time, from its formation to the mature structure. The subpallium is the base region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:12626695]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -166170,7 +166167,7 @@
 name: rhombomere development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the rhombomere over time, from its formation to the mature structure. Rhombomeres are transverse segments of the developing rhombencephalon. Rhombomeres are lineage restricted, express different genes from one another, and adopt different developmental fates." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -166194,7 +166191,7 @@
 name: pons development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pons over time, from its formation to the mature structure. The pons lies above the medulla and next to the cerebellum. The pons conveys information about movement from the cerebral hemisphere to the cerebellum." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0022037 ! metencephalon development
 
 [Term]
@@ -166202,7 +166199,7 @@
 name: cerebellum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellum over time, from its formation to the mature structure. The cerebellum is the portion of the brain in the back of the head between the cerebrum and the pons. In mice, the cerebellum controls balance for walking and standing, modulates the force and range of movement and is involved in the learning of motor skills." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0022037 ! metencephalon development
 
 [Term]
@@ -166212,7 +166209,7 @@
 def: "The process whose specific outcome is the progression of the medulla oblongata over time, from its formation to the mature structure. The medulla oblongata lies directly above the spinal cord and controls vital autonomic functions such as digestion, breathing and the control of heart rate." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 synonym: "medulla development" RELATED [GOC:cls]
 synonym: "myelencephalon development" RELATED [GOC:cls]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -166595,6 +166592,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the brain ventricular system over time, from its formation to the mature structure. The brain ventricular system consists of four communicating cavities within the brain that are continuous with the central canal of the spinal cord. These cavities include two lateral ventricles, the third ventricle and the fourth ventricle. Cerebrospinal fluid fills the ventricles and is produced by the choroid plexus." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -166602,7 +166600,7 @@
 name: fourth ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the fourth ventricle over time, from its formation to the mature structure. The fourth ventricle is an irregularly shaped cavity in the rhombencephalon, between the medulla oblongata, the pons, and the isthmus in front, and the cerebellum behind. It is continuous with the central canal of the cord below and with the cerebral aqueduct above, and through its lateral and median apertures it communicates with the subarachnoid space." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021591 ! ventricular system development
 relationship: part_of GO:0030902 ! hindbrain development
 
@@ -167301,7 +167299,7 @@
 name: lateral ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the lateral ventricles over time, from the formation to the mature structure. The two lateral ventricles are a cavity in each of the cerebral hemispheres derived from the cavity of the embryonic neural tube. They are separated from each other by the septum pellucidum, and each communicates with the third ventricle by the foramen of Monro, through which also the choroid plexuses of the lateral ventricles become continuous with that of the third ventricle." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 relationship: part_of GO:0021591 ! ventricular system development
 
@@ -167343,7 +167341,7 @@
 name: nerve development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a nerve over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -167368,7 +167366,7 @@
 name: third ventricle development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the third ventricle over time, from its formation to the mature structure. The third ventricle is the narrow cleft inferior to the corpus callosum, within the diencephalon, between the paired thalami. Its floor is formed by the hypothalamus, its anterior wall by the lamina terminalis, and its roof by ependyma, and it communicates with the fourth ventricle by the cerebral aqueduct, and with the lateral ventricles by the interventricular foramina." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021591 ! ventricular system development
 
 [Term]
@@ -167376,7 +167374,7 @@
 name: cerebellar molecular layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar molecular layer nerve over time, from its formation to the mature structure. The molecular layer is the outermost layer of the cerebellar cortex. It contains the parallel fibers of the granule cells, interneurons such as stellate and basket cells, and the dendrites of the underlying Purkinje cells." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167384,7 +167382,7 @@
 name: cerebellar Purkinje cell layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar Purkinje cell layer over time, from its formation to the mature structure. The Purkinje cell layer lies just underneath the molecular layer of the cerebellar cortex. It contains the neuronal cell bodies of the Purkinje cells that are arranged side by side in a single layer. Candelabrum interneurons are vertically oriented between the Purkinje cells. Purkinje neurons are inhibitory and provide the output of the cerebellar cortex through axons that project into the white matter. Extensive dendritic trees from the Purkinje cells extend upward in a single plane into the molecular layer where they synapse with parallel fibers of granule cells." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167392,7 +167390,7 @@
 name: cerebellar granular layer development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar granule layer over time, from its formation to the mature structure. The granular layer is the innermost layer of the cerebellar cortex. This layer contains densely packed small neurons, mostly granule cells. Some Golgi cells are found at the outer border. Granule neurons send parallel fibers to the upper molecular layer, where they synapse with Purkinje cell dendrites. Mossy fibers from the pontine nuclei in the white matter synapse with granule cell axons, Golgi cell axons and unipolar brush interneuron axons at cerebellar glomeruli in the granule cell layer." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021695 ! cerebellar cortex development
 
 [Term]
@@ -167519,7 +167517,7 @@
 name: cerebellar cortex development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cerebellar cortex over time, from its formation to the mature structure. The cerebellar cortex is a thin mantle of gray matter that covers the surface of each cerebral hemisphere. It has a characteristic morphology with convolutions (gyri) and crevices (sulci) that have specific functions. Six layers of nerve cells and the nerve pathways that connect them comprise the cerebellar cortex. Together, these regions are responsible for the processes of conscious thought, perception, emotion and memory as well as advanced motor function." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0838580343]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021549 ! cerebellum development
 
 [Term]
@@ -167782,7 +167780,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the medullary reticular formation over time, from its formation to the mature structure. The medullary reticular formation is a series of brain nuclei located in the medulla oblongata." [GO_REF:0000021, GOC:cjm, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid, https://www.ncbi.nlm.nih.gov/books/NBK556102/, Wikipedia:Rhombencephalon]
 synonym: "rhombencephalic reticular formation development" BROAD []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021550 ! medulla oblongata development
 
 [Term]
@@ -167819,7 +167817,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the intermediate reticular formation over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
 synonym: "intermediate reticular nucleus development" EXACT [http://www.brainspan.org]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021723 ! medullary reticular formation development
 
 [Term]
@@ -167835,7 +167833,7 @@
 name: superior reticular formation development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior reticular formation over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021723 ! medullary reticular formation development
 
 [Term]
@@ -168037,7 +168035,7 @@
 def: "The progression of the striatum over time from its initial formation until its mature state. The striatum is a region of the forebrain consisting of the caudate nucleus, putamen and fundus striati." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 synonym: "neostriatum development" EXACT []
 synonym: "striate nucleus development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021544 ! subpallium development
 
 [Term]
@@ -168071,6 +168069,7 @@
 namespace: biological_process
 def: "The progression of the limbic system over time from its initial formation until its mature state. The limbic system is a collection of structures in the brain involved in emotion, motivation and emotional aspects of memory." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030900 ! forebrain development
 
 [Term]
@@ -168095,7 +168094,7 @@
 name: amygdala development
 namespace: biological_process
 def: "The progression of the amygdala over time from its initial formation until its mature state. The amygdala is an almond-shaped set of neurons in the medial temporal lobe of the brain that play a key role in processing emotions such as fear and pleasure." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168103,7 +168102,7 @@
 name: cingulate gyrus development
 namespace: biological_process
 def: "The progression of the cingulate gyrus over time from its initial formation until its mature state. The cingulate gyrus is a ridge in the cerebral cortex located dorsal to the corpus callosum." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168112,7 +168111,7 @@
 namespace: biological_process
 def: "The progression of the hippocampus over time from its initial formation until its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420, UBERON:0002421]
 synonym: "hippocampal formation development" EXACT [ABA:HPF]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021543 ! pallium development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -168121,7 +168120,7 @@
 name: mammillary body development
 namespace: biological_process
 def: "The progression of the mammillary body over time from its initial formation until its mature state. The mammillary body is a protrusion at the posterior end of the hypothalamus that contains hypothalamic nuclei." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -168141,7 +168140,7 @@
 name: orbitofrontal cortex development
 namespace: biological_process
 def: "The progression of the orbitofrontal cortex over time from its initial formation until its mature state. The orbitofrontal cortex is a cerebral cortex region located in the frontal lobe." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168151,7 +168150,7 @@
 def: "The progression of the parahippocampal gyrus over time from its initial formation until its mature state. The parahippocampal gyrus is a ridge in the cerebral cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
 synonym: "hippocampal gyrus development" EXACT [GOC:dgh]
 xref: Wikipedia:parahippocampal_gyrus
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021761 ! limbic system development
 
 [Term]
@@ -168168,7 +168167,7 @@
 name: olfactory bulb development
 namespace: biological_process
 def: "The progression of the olfactory bulb over time from its initial formation until its mature state. The olfactory bulb coordinates neuronal signaling involved in the perception of smell. It receives input from the sensory neurons and outputs to the olfactory cortex." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:0878937420]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021988 ! olfactory lobe development
 
 [Term]
@@ -168277,6 +168276,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a preganglionic parasympathetic fiber over time, from its formation to the mature structure. A preganglionic parasympathetic fiber is a cholinergic axonal fiber projecting from the CNS to a parasympathetic ganglion." [GO_REF:0000021, GOC:cjm, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007417 ! central nervous system development
 relationship: part_of GO:0048486 ! parasympathetic nervous system development
 
@@ -168376,7 +168376,7 @@
 name: thalamus development
 namespace: biological_process
 def: "The process in which the thalamus changes over time, from its initial formation to its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 
 [Term]
@@ -168952,7 +168952,7 @@
 name: hypothalamus development
 namespace: biological_process
 def: "The progression of the hypothalamus region of the forebrain, from its initial formation to its mature state." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021536 ! diencephalon development
 relationship: part_of GO:0021761 ! limbic system development
 
@@ -169384,8 +169384,8 @@
 name: forebrain-midbrain boundary formation
 namespace: biological_process
 def: "The process whose specific outcome is the creation of the forebrain-midbrain boundary." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, PMID:11262869]
-is_a: GO:0048856 ! anatomical structure development
 is_a: GO:0048859 ! formation of anatomical boundary
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021903 ! rostrocaudal neural tube patterning
 
 [Term]
@@ -170104,7 +170104,7 @@
 synonym: "adenophysis development" EXACT []
 synonym: "anterior pituitary development" EXACT []
 synonym: "anterior pituitary gland development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021983 ! pituitary gland development
 
 [Term]
@@ -170123,7 +170123,7 @@
 name: habenula development
 namespace: biological_process
 def: "The progression of the habenula over time from its initial formation until its mature state. The habenula is the group of nuclei that makes up the stalk of the pineal gland." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid, ISBN:9780721601465]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021538 ! epithalamus development
 
 [Term]
@@ -170133,7 +170133,7 @@
 def: "The progression of the cerebral cortex over time from its initial formation until its mature state. The cerebral cortex is the outer layered region of the telencephalon." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
 synonym: "corticogenesis" NARROW [GOC:bf, PMID:25904839]
 synonym: "neocortex development" RELATED [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021543 ! pallium development
 
 [Term]
@@ -170141,7 +170141,7 @@
 name: olfactory lobe development
 namespace: biological_process
 def: "The progression of the olfactory lobe over time from its initial formation until its mature state. The olfactory lobe is the area of the brain that process the neural inputs for the sense of smell." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -170149,7 +170149,7 @@
 name: olfactory cortex development
 namespace: biological_process
 def: "The progression of the olfactory cortex over time from its initial formation until its mature state. The olfactory cortex is involved in the perception of smell. It receives input from the olfactory bulb and is responsible for the identification of odors." [GO_REF:0000021, GOC:cls, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021988 ! olfactory lobe development
 
 [Term]
@@ -170590,7 +170590,7 @@
 name: metencephalon development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the metencephalon over time, from its formation to the mature structure." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030902 ! hindbrain development
 
 [Term]
@@ -170598,7 +170598,7 @@
 name: corpus callosum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the corpus callosum over time, from its formation to the mature structure. The corpus callosum is a thick bundle of nerve fibers comprising a commissural plate connecting the two cerebral hemispheres. It consists of contralateral axon projections that provide communication between the right and left cerebral hemispheres." [GO_REF:0000021, GOC:cls, GOC:curators, GOC:dgh, GOC:dph, GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021537 ! telencephalon development
 
 [Term]
@@ -171005,6 +171005,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root system over time, from its formation to the mature structure." [GOC:isa_complete]
 is_a: GO:0048731 ! system development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0022623
@@ -171285,15 +171286,6 @@
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
@@ -176304,11 +176296,13 @@
 
 [Term]
 id: GO:0030369
-name: ICAM-3 receptor activity
+name: obsolete ICAM-3 receptor activity
 namespace: molecular_function
-def: "Combining with ICAM-3, intercellular adhesion molecule 3, and transmitting the signal from one side of the membrane to the other to initiate a change in cell activity. ICAM-3, or CD50, are constitutively expressed on monocytes, granulocytes and lymphocytes; on physiological stimulation, they become transiently phosphorylated on serine residues." [GOC:ai, GOC:signaling, ISBN:0198506732, PMID:7515813]
-comment: Note that this term represents an activity and not a gene product. Consider also annotating to the molecular function terms 'cell adhesion molecule binding ; GO:0050839' and 'receptor binding ; GO:0005102' and the biological process term 'cell adhesion ; GO:0007155'.
-is_a: GO:0004888 ! transmembrane signaling receptor activity
+def: "OBSOLETE. Combining with ICAM-3, intercellular adhesion molecule 3, and transmitting the signal from one side of the membrane to the other to initiate a change in cell activity. ICAM-3, or CD50, are constitutively expressed on monocytes, granulocytes and lymphocytes; on physiological stimulation, they become transiently phosphorylated on serine residues." [GOC:ai, GOC:signaling, ISBN:0198506732, PMID:7515813]
+comment: This term was obsoleted because it is more specific than the specificity of any known gene product. ICAM-3 is a ligand of the ITGAL:ITGB2, ITGAD:ITGB2, and CD209 receptors; the receptor activity of these gene products can be more accurately captured by annotating to the parent term GO:0004888 transmembrane signaling receptor activity together with a has_input annotation extension specifying ICAM-3 (PR:000001468).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30560" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0004888
 
 [Term]
 id: GO:0030370
@@ -182369,7 +182363,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the forebrain over time, from its formation to the mature structure. The forebrain is the anterior of the three primary divisions of the developing chordate brain or the corresponding part of the adult brain (in vertebrates, includes especially the cerebral hemispheres, the thalamus, and the hypothalamus and especially in higher vertebrates is the main control center for sensory and associative information processing, visceral functions, and voluntary motor functions)." [PMID:4975589, PMID:4992177]
 synonym: "prosencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182378,7 +182372,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the midbrain over time, from its formation to the mature structure. The midbrain is the middle division of the three primary divisions of the developing chordate brain or the corresponding part of the adult brain (in vertebrates, includes a ventral part containing the cerebral peduncles and a dorsal tectum containing the corpora quadrigemina and that surrounds the aqueduct of Sylvius connecting the third and fourth ventricles)." [PMID:4975589, PMID:4992177]
 synonym: "mesencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182387,7 +182381,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the hindbrain over time, from its formation to the mature structure. The hindbrain is the posterior of the three primary divisions of the developing chordate brain, or the corresponding part of the adult brain (in vertebrates, includes the cerebellum, pons, and medulla oblongata and controls the autonomic functions and equilibrium)." [PMID:4975589, PMID:4992177]
 synonym: "rhombencephalon development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -182520,7 +182514,7 @@
 synonym: "isthmus development" EXACT []
 synonym: "MHB development" EXACT []
 synonym: "midbrain-hindbrain orgainizer development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 relationship: part_of GO:0021903 ! rostrocaudal neural tube patterning
 
@@ -182738,18 +182732,25 @@
 
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
@@ -183028,8 +183029,8 @@
 synonym: "protein dislocation from ER" EXACT [GOC:dph, GOC:krc]
 synonym: "protein retrotranslocation, ER to cytosol" EXACT [GOC:bf]
 synonym: "retrograde protein transport, endoplasmic reticulum to cytosol" EXACT []
-is_a: GO:0032527 ! protein exit from endoplasmic reticulum
-is_a: GO:1903513 ! endoplasmic reticulum to cytosol transport
+is_a: GO:0010496 ! intercellular transport
+is_a: GO:0015031 ! protein transport
 relationship: part_of GO:0036503 ! ERAD pathway
 
 [Term]
@@ -183486,7 +183487,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the endocrine pancreas over time, from its formation to the mature structure. The endocrine pancreas is made up of islet cells that produce insulin, glucagon and somatostatin." [GOC:cvs]
 xref: Reactome:R-HSA-186712 "Regulation of beta-cell development"
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0031016 ! pancreas development
 relationship: part_of GO:0035270 ! endocrine system development
 
@@ -199159,14 +199160,15 @@
 
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
@@ -203628,7 +203630,7 @@
 namespace: biological_process
 def: "The progression of the glomerulus over time from its initial formation until its mature state. The glomerulus is a capillary tuft which forms a close network with the visceral epithelium (podocytes) and the mesangium to form the filtration barrier and is surrounded by Bowman's capsule in nephrons of the vertebrate kidney. The glomerulus is part of the nephron and is restricted to one body segment." [GOC:mah, GOC:mtg_kidney_jan10]
 synonym: "glomerular development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072006 ! nephron development
 
 [Term]
@@ -208888,14 +208890,17 @@
 
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
@@ -210832,7 +210837,7 @@
 name: floor plate development
 namespace: biological_process
 def: "The progression of the floor plate over time from its initial formation until its mature state." [GOC:dh]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021915 ! neural tube development
 
 [Term]
@@ -230795,6 +230800,7 @@
 namespace: biological_process
 def: "Progression of the endocrine system over time, from its formation to a mature structure. The endocrine system is a system of hormones and ductless glands, where the glands release hormones directly into the blood, lymph or other intercellular fluid, and the hormones circulate within the body to affect distant organs. The major glands that make up the human endocrine system are the hypothalamus, pituitary, thyroid, parathryoids, adrenals, pineal body, and the reproductive glands which include the ovaries and testes." [GOC:bf, Wikipedia:Development_of_the_endocrine_system]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0035271
@@ -230811,6 +230817,7 @@
 namespace: biological_process
 def: "Progression of the exocrine system over time, from its formation to a mature structure. The exocrine system is a system of hormones and glands, where the glands secrete straight to a target site via ducts or tubes. The human exocrine system includes the salivary glands, sweat glands and many glands of the digestive system." [GOC:bf, Wikipedia:Exocrine_gland]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0035273
@@ -231022,7 +231029,7 @@
 name: tube development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a tube over time, from its initial formation to a mature structure. Epithelial and endothelial tubes transport gases, liquids and cells from one site to another and form the basic structure of many organs and tissues including lung and trachea, kidney, the mammary gland, the vascular system and the gastrointestinal and urinary-genital tracts." [PMID:12526790]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -235445,6 +235452,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an ovary that produces an ovule over time, from its formation to the mature structure. The ovary is the enlarged basal portion of a carpel and matures into a fruit. An ovule is the multicellular structure that gives rise to and contains the female reproductive cells, and develops into a seed." [GOC:bf, GOC:tb, ISBN:0879015322]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 created_by: bf
 creation_date: 2011-02-04T09:35:05Z
@@ -236896,7 +236904,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the adrenal cortex over time, from its formation to the mature structure. The adrenal cortex is located at the periphery of the adrenal gland and controls glucose and electrolyte metabolism, response to stress and sexual development through the production of different classes of steroid hormones (glucocorticoids, mineralocorticoids and androgens)." [PMID:12185666, PMID:21115154, Wikipedia:Adrenal_cortex]
 synonym: "adrenal gland cortex development" EXACT [MA:0000118]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030325 ! adrenal gland development
 created_by: bf
 creation_date: 2011-04-18T10:25:39Z
@@ -237432,7 +237440,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cloaca over time, from it's formation to the mature structure. The cloaca is the common chamber into which intestinal, genital and urinary canals open in vertebrates." [GOC:dgh, ISBN:0582227089]
 synonym: "cloacal development" EXACT [GOC:bf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001655 ! urogenital system development
 relationship: part_of GO:0048546 ! digestive tract morphogenesis
 created_by: bf
@@ -237845,7 +237853,7 @@
 name: nail development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a nail over time, from its formation to the mature structure. A nail is a horn-like envelope covering the outer end of a finger or toe, and consists of the nail plate, the nail matrix and the nail bed below it, and the grooves surrounding it." [GOC:bf, ISBN:0323025781, UBERON:0001705, Wikipedia:Nail_(anatomy)]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060173 ! limb development
 created_by: bf
 creation_date: 2011-05-31T02:30:34Z
@@ -238181,7 +238189,7 @@
 name: ascending aorta development
 namespace: biological_process
 def: "The progression of the ascending aorta over time, from its initial formation to the mature structure. The ascending aorta is the portion of the aorta in a two-pass circulatory system that lies between the heart and the arch of aorta. In a two-pass circulatory system blood passes twice through the heart to supply the body once." [GOC:bf, GOC:dgh, MA:0002570, UBERON:0001496, Wikipedia:Ascending_aorta]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035904 ! aorta development
 created_by: bf
 creation_date: 2011-06-24T11:02:01Z
@@ -238191,7 +238199,7 @@
 name: descending aorta development
 namespace: biological_process
 def: "The progression of the descending aorta over time, from its initial formation to the mature structure. The descending aorta is the portion of the aorta in a two-pass circulatory system from the arch of aorta to the point where it divides into the common iliac arteries. In a two-pass circulatory system blood passes twice through the heart to supply the body once." [GOC:bf, GOC:dgh, MA:0002571, UBERON:0001514, Wikipedia:Descending_aorta]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035904 ! aorta development
 created_by: bf
 creation_date: 2011-06-24T11:05:22Z
@@ -239287,7 +239295,7 @@
 name: deltoid tuberosity development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the deltoid tuberosity over time, from its formation to the mature structure. The deltoid tuberosity is the region on the shaft of the humerus to which the deltoid muscle attaches. The deltoid tuberosity develops through endochondral ossification in a two-phase process; an initiating tendon-dependent phase, and a muscle-dependent growth phase." [GOC:yaf, PMID:17567668, UBERON:0002498, Wikipedia:Deltoid_tuberosity]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060173 ! limb development
 relationship: part_of GO:0060348 ! bone development
 created_by: bf
@@ -240639,25 +240647,29 @@
 
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
 
@@ -243020,7 +243032,7 @@
 name: atrioventricular canal development
 namespace: biological_process
 def: "The progression of the atrioventricular canal over time, from its formation to the mature structure. The atrioventricular canal is the part of the heart connecting the atrium to the cardiac ventricle." [GOC:BHF, GOC:gr, PMID:14701881, UBERON:0002087, ZFA:0001315]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007507 ! heart development
 created_by: bf
 creation_date: 2012-08-08T09:55:37Z
@@ -243059,7 +243071,7 @@
 name: embryonic heart tube elongation
 namespace: biological_process
 def: "The developmental growth that results in the increase in length of the embryonic heart tube. The embryonic heart tube is an epithelial tube that will give rise to the mature heart." [GOC:BHF, GOC:gr, PMID:15901664]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035050 ! embryonic heart tube development
 created_by: bf
 creation_date: 2012-08-08T13:54:37Z
@@ -246255,15 +246267,12 @@
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
@@ -248520,7 +248529,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the rectal diverticulum over time, from its formation to the mature structure. The rectal diverticulum is an outgrowth of the cloaca and links the pronephric kidney to the exterior." [GOC:mtg_kidney_jan10, PMID:10535314, PMID:18226983, XAO:0001015]
 synonym: "pronephric rectal diverticulum development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T09:48:58Z
@@ -248554,7 +248563,7 @@
 name: pronephric sinus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pronephric sinus over time, from its formation to the mature structure. The pronephric sinus is an ill-defined capillary network that lies between the pronephric tubules." [GOC:mtg_kidney_jan10, PMID:10535314, XAO:0000385]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T09:55:23Z
@@ -248627,7 +248636,7 @@
 name: nephrostome development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the nephrostome over time, from its formation to the mature structure. The nephrostome is the opening of the pronephros into the body cavity." [GOC:mtg_kidney_jan10, PMID:14686690, PMID:15647339, XAO:0000062]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: bf
 creation_date: 2010-07-02T10:08:16Z
@@ -254121,6 +254130,7 @@
 def: "The regrowth of lost or destroyed tissues." [GOC:curators]
 is_a: GO:0031099 ! regeneration
 is_a: GO:0048589 ! developmental growth
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0042247
@@ -255038,7 +255048,7 @@
 synonym: "cuticle biosynthetic process" EXACT []
 synonym: "cuticle formation" EXACT []
 synonym: "cuticle synthesis" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -255925,7 +255935,6 @@
 synonym: "carnitine degradation" EXACT []
 synonym: "vitamin Bt catabolic process" EXACT []
 synonym: "vitamin Bt catabolism" EXACT []
-xref: MetaCyc:
 xref: MetaCyc:CARNMET-PWY
 xref: MetaCyc:PWY-3602
 xref: MetaCyc:PWY-3641
@@ -257897,7 +257906,6 @@
 synonym: "P-P-bond-hydrolysis-driven transmembrane transporter activity" BROAD []
 synonym: "P-P-bond-hydrolysis-driven transporter" BROAD []
 xref: EC:7.2.2.-
-xref: Reactome:R-HSA-1222523 "SodB gets secreted"
 xref: Reactome:R-HSA-1454916 "The ABCC family mediates organic anion transport"
 xref: Reactome:R-HSA-1467457 "ABCA8,B1,B5 transport xenobiotics from cytosol to extracellular region"
 xref: Reactome:R-HSA-2161506 "abacavir [cytosol] + ATP + H2O => abacavir[extracellular] + ADP + phosphate"
@@ -274970,8 +274978,6 @@
 synonym: "chaperone activity" BROAD []
 synonym: "protein binding involved in protein folding" EXACT []
 xref: Reactome:R-HSA-9018785 "RHOBTB2 binds GTP"
-xref: Reactome:R-HSA-9683772 "Trimmed spike protein binds to calnexin"
-xref: Reactome:R-HSA-9694337 "Trimmed spike protein binds to calnexin"
 xref: Reactome:R-HSA-9855212 "SDHA binds to SDHB"
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
@@ -277110,7 +277116,7 @@
 synonym: "envenomation resulting in induction of edema in another organism" EXACT []
 synonym: "envenomation resulting in induction of edema in other organism" EXACT []
 synonym: "envenomation resulting in induction of oedema in other organism" EXACT []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29375" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 created_by: jl
@@ -278010,7 +278016,7 @@
 def: "A process in which an organism alters or subverts mast cell degranulation in another organism via the action of a venom." [GOC:fj, GOC:jl, PMID:21549739]
 synonym: "envenomation resulting in modulation of mast cell degranulation in another organism" EXACT []
 synonym: "envenomation resulting in modulation of mast cell degranulation in other organism" EXACT []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29851" xsd:anyURI
 created_by: jl
 creation_date: 2012-01-19T02:51:51Z
@@ -280020,14 +280026,14 @@
 
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
 
@@ -280525,7 +280531,7 @@
 namespace: biological_process
 def: "The tooth development process in which the teeth enter the mouth and become visible." [Wikipedia:Tooth_eruption]
 xref: Wikipedia:Tooth_eruption
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0042476 ! odontogenesis
 created_by: jl
 creation_date: 2012-08-15T14:58:17Z
@@ -282524,11 +282530,14 @@
 
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
@@ -283041,7 +283050,7 @@
 def: "The process in which a relatively unspecialized T cell acquires the specialized features of a T-helper 1 (Th1) cell. A Th1 cell is a CD4-positive, alpha-beta T cell that has the phenotype T-bet-positive and produces interferon-gamma." [CL:0000545, GOC:ebc]
 comment: Note that immunologists typically use the word 'development' to refer to cells of B or T cell lineages undergoing the process that GO describes as 'cell differentiation'.
 synonym: "T-helper 1 cell development" RELATED [GOC:add]
-xref: Reactome:R-HSA-9942503 "Differentiation of naive CD4+ T cells to T helper 1 cells (Th1 cells)"
+xref: Reactome:R-HSA-9942503 "Differentiation of naive CD+ T cells to T helper 1 cells (Th1 cells)"
 is_a: GO:0002287 ! alpha-beta T cell activation involved in immune response
 is_a: GO:0002292 ! T cell differentiation involved in immune response
 is_a: GO:0042093 ! T-helper cell differentiation
@@ -304667,8 +304676,14 @@
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
@@ -311201,7 +311216,7 @@
 xref: EC:2.6.1.40
 xref: KEGG_REACTION:R02050
 xref: MetaCyc:2.6.1.40-RXN
-xref: Reactome:R-HSA-909780 "(R)-3-amino-2-methylpropanoate + pyruvate => 2-methyl-3-oxopropanoate + L-alanine"
+xref: Reactome:R-HSA-909780 "(R)-3-aminoisobutyric acid + pyruvate => 2-methyl-3-oxopropanoate + alanine"
 xref: RHEA:18393
 is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch EC:2.6.1.40
@@ -314675,6 +314690,8 @@
 comment: This term was made obsolete because it represents information outside the scope of GO.
 synonym: "calcium-dependent cytosolic phospholipase A2 activity" NARROW []
 synonym: "calcium-dependent secreted phospholipase A2 activity" NARROW []
+xref: Reactome:R-HSA-111881 "Phospho-cPLA2 translocates to membranes when intracellular calcium levels increase"
+xref: Reactome:R-HSA-111883 "PLA2G4A (cPLA2) hydrolyzes phosphatidylcholine"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28324" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31061" xsd:anyURI
@@ -314688,6 +314705,7 @@
 def: "OBSOLETE. Catalysis of the reaction: phosphatidylcholine + H2O = 1-acylglycerophosphocholine + a carboxylate. This reaction does not require Ca2+." [PMID:34831185]
 comment: This term was made obsolete because it represents information outside the scope of GO.
 synonym: "calcium-independent cytosolic phospholipase A2 activity" NARROW []
+xref: Reactome:R-HSA-8952251 "PLA2G15 hydrolyses LPC to GPCho and LCFA(-)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28324" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31061" xsd:anyURI
@@ -322951,7 +322969,6 @@
 xref: EC:2.3.1.13
 xref: MetaCyc:GLYCINE-N-ACYLTRANSFERASE-RXN
 xref: Reactome:R-HSA-2534040 "Unknown NAT N-acylates Gly in GNAT1"
-xref: Reactome:R-HSA-9971621 "GLYAT transfers ISB to glycine"
 xref: RHEA:19869
 xref: RHEA:49772
 xref: RHEA:49780
@@ -323003,8 +323020,6 @@
 xref: Reactome:R-HSA-159566 "benzoyl-CoA + glycine => benzoyl glycine (hippuric acid) + Coenzyme A"
 xref: Reactome:R-HSA-159574 "GLYAT-like proteins transfer glycine to ST-CoA to form SUA"
 xref: Reactome:R-HSA-9750001 "GLYAT-like proteins transfer glycine to 2,5-DHB-CoA to form gentisuric acid"
-xref: Reactome:R-HSA-9971063 "GLYAT-like proteins transfer glycine to phenylacetyl-CoA"
-xref: Reactome:R-HSA-9972916 "GLYAT-like proteins transfer glycine to aminobenzoyl-CoA"
 xref: RHEA:18493
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.71
@@ -324061,7 +324076,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the central complex over time, from its formation to the mature structure. The central complex region of the insect brain is thought to be crucial for control of locomotive behavior. Located in the middle of the two protocerebral hemispheres, it comprises four neuropilar regions, the fan-shaped body, the ellipsoid body, the protocerebral bridge and the paired noduli." [PMID:12490252]
 synonym: "central body development" EXACT []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007420 ! brain development
 
 [Term]
@@ -324216,7 +324231,7 @@
 name: compound eye corneal lens development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the corneal lens in the compound eye over time, from its formation to the mature structure. The corneal lens is a chitinous extracellular secretion of the four underlying cone cells and the pigment cells." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048749 ! compound eye development
 
 [Term]
@@ -324650,7 +324665,7 @@
 name: antennal joint development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the antennal joint over time, from its formation to the mature structure. The antennal joint is the joint between antennal segments." [GOC:jid]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007469 ! antennal development
 
 [Term]
@@ -325571,6 +325586,7 @@
 def: "The process whose specific outcome is the progression of the gametophyte over time, from its formation to the mature structure. The gametophyte is the gamete-producing individual or phase in the life cycle having alternation of generations. An example of this process is found in Arabidopsis thaliana." [GOC:jid, PO:0009004]
 synonym: "gametogenesis" BROAD []
 is_a: GO:0007275 ! multicellular organism development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048232
@@ -326051,7 +326067,7 @@
 def: "The process whose specific outcome is the progression of the alveolus over time, from its formation to the mature structure. The alveolus is a sac for holding air in the lungs; formed by the terminal dilation of air passageways." [GOC:mtg_lung, PMID:9751757]
 synonym: "alveolarization" EXACT [PMID:17911382]
 synonym: "alveologenesis" EXACT [GOC:17911382]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030324 ! lung development
 
 [Term]
@@ -326413,6 +326429,7 @@
 def: "The process whose specific outcome is the progression of the seed over time, from its formation to the mature structure. A seed is a propagating organ formed in the sexual reproductive cycle of gymnosperms and angiosperms, consisting of a protective coat enclosing an embryo and food reserves." [GOC:jid, PO:0009010]
 is_a: GO:0009791 ! post-embryonic development
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 
 [Term]
@@ -326950,6 +326967,7 @@
 def: "The process whose specific outcome is the progression of the shoot system over time, from its formation to the mature structure." [GOC:curators]
 synonym: "shoot development" EXACT []
 is_a: GO:0048731 ! system development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048368
@@ -327417,6 +327435,7 @@
 synonym: "collective phyllome structure development" BROAD [GOC:PO_curators, PO:0025023]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0009908 ! flower development
 
 [Term]
@@ -327809,6 +327828,7 @@
 def: "The process whose specific outcome is the progression of the style over time, from its formation to the mature structure. The style is an elongated part of a carpel, or group of fused carpels, and it lies between the ovary and the stigma." [GOC:jid, PO:0009074]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
 [Term]
@@ -327818,6 +327838,7 @@
 def: "The process whose specific outcome is the progression of the stigma over time, from its formation to the mature structure. The stigma is the pollen-receptive surface of a carpel or group of fused carpels, usually sticky." [GOC:jid, PO:0009073]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048440 ! carpel development
 
 [Term]
@@ -327846,6 +327867,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the autonomic nervous system over time, from its formation to the mature structure. The autonomic nervous system is composed of neurons that are not under conscious control, and is comprised of two antagonistic components, the sympathetic and parasympathetic nervous systems. The autonomic nervous system regulates key functions including the activity of the cardiac (heart) muscle, smooth muscles (e.g. of the gut), and glands." [FMA:9905, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007399 ! nervous system development
 
 [Term]
@@ -327854,6 +327876,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the enteric nervous system over time, from its formation to the mature structure. The enteric nervous system is composed of two ganglionated neural plexuses in the gut wall which form one of the three major divisions of the autonomic nervous system. The enteric nervous system innervates the gastrointestinal tract, the pancreas, and the gallbladder. It contains sensory neurons, interneurons, and motor neurons. Thus the circuitry can autonomously sense the tension and the chemical environment in the gut and regulate blood vessel tone, motility, secretions, and fluid transport. The system is itself governed by the central nervous system and receives both parasympathetic and sympathetic innervation." [FMA:66070, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -327862,6 +327885,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the sympathetic nervous system over time, from its formation to the mature structure. The sympathetic nervous system is one of the two divisions of the vertebrate autonomic nervous system (the other being the parasympathetic nervous system). The sympathetic preganglionic neurons have their cell bodies in the thoracic and lumbar regions of the spinal cord and connect to the paravertebral chain of sympathetic ganglia. Innervate heart and blood vessels, sweat glands, viscera and the adrenal medulla. Most sympathetic neurons, but not all, use noradrenaline as a post-ganglionic neurotransmitter." [FMA:9906, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -327870,6 +327894,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the parasympathetic nervous system over time, from its formation to the mature structure. The parasympathetic nervous system is one of the two divisions of the vertebrate autonomic nervous system. Parasympathetic nerves emerge cranially as pre ganglionic fibers from oculomotor, facial, glossopharyngeal and vagus and from the sacral region of the spinal cord. Most neurons are cholinergic and responses are mediated by muscarinic receptors. The parasympathetic system innervates, for example: salivary glands, thoracic and abdominal viscera, bladder and genitalia." [FMA:9907, GOC:jid, GOC:sr]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048483 ! autonomic nervous system development
 
 [Term]
@@ -328092,7 +328117,8 @@
 name: meristem development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the meristem over time, from its formation to the mature structure." [GOC:jid]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 
 [Term]
 id: GO:0048508
@@ -328146,7 +328172,7 @@
 synonym: "development of an organ" EXACT []
 synonym: "organogenesis" EXACT []
 xref: Wikipedia:Organogenesis
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25943" xsd:anyURI
 
 [Term]
@@ -329526,6 +329552,7 @@
 def: "The process whose specific outcome is the progression of the anther over time, from its formation to the mature structure." [GOC:jid, GOC:sm]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 
 [Term]
@@ -329581,6 +329608,7 @@
 synonym: "tapetum development" BROAD [GOC:tb]
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 
 [Term]
@@ -330307,7 +330335,7 @@
 name: anterior cibarial plate development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the anterior cibarial plate over time, from their formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330315,7 +330343,7 @@
 name: clypeus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the clypeus over time, from its formation to the mature structure. The clypeus is the shield-shaped plate on an insect's head." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330323,7 +330351,7 @@
 name: epistomal sclerite development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the epistomal sclerite over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330340,7 +330368,7 @@
 name: labrum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the labrum over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330348,7 +330376,7 @@
 name: posterior cibarial plate development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the posterior cibarial plate over time, from its formation to the mature structure." [GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0035213 ! clypeo-labral disc development
 
 [Term]
@@ -330424,7 +330452,7 @@
 name: appendage development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an appendage over time, from its formation to the mature structure. An appendage is an organ or part that is attached to the trunk of an organism, such as a limb or a branch." [GOC:jid, GOC:rc]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0007275 ! multicellular organism development
 
 [Term]
@@ -331329,6 +331357,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the root cap over time, from its formation to the mature structure. The root cap protects the root meristem from friction as the root grows through the soil. The cap is made up of a group of parenchyma cells which secrete a glycoprotein mucilage as a lubricant." [GOC:tb]
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048364 ! root development
 
 [Term]
@@ -331416,7 +331445,7 @@
 name: inner ear development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inner ear over time, from its formation to the mature structure." [GOC:sr]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043583 ! ear development
 
 [Term]
@@ -331424,7 +331453,7 @@
 name: otolith development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the otolith over time, from its formation to the mature structure." [GOC:sr]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 
 [Term]
@@ -331619,7 +331648,7 @@
 name: neural nucleus development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a neural nucleus from its initial condition to its mature state. A neural nucleus is an anatomical structure consisting of a discrete aggregate of neuronal soma." [GO_REF:0000021]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0048858
@@ -331803,6 +331832,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a sensory system over time from its formation to the mature structure." [GOC:dgh]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0048881
@@ -331860,7 +331890,7 @@
 name: cupula development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cupula over time, from its formation to the mature structure. The cupula is secreted by mantle cells and the ciliary bundles of all of the hair cells of the neuromast are embedded in it. The cupula provides a mechanical linkage between the hair cells and the external hydrodynamic environment. The cupula of superficial neuromasts grows continuously, while the height of the cupula of canal neuromasts is limited by canal diameter." [ISBN:0125296509]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048884 ! neuromast development
 
 [Term]
@@ -335012,7 +335042,6 @@
 xref: EC:1.1.1.66
 xref: KEGG_REACTION:R03886
 xref: MetaCyc:OMEGA-HYDROXYDECANOATE-DEHYDROGENASE-RXN
-xref: Reactome:R-HSA-9971258 "ADH7 dehydrogenates 10-OH-DECA"
 xref: RHEA:20880
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.66
@@ -336733,7 +336762,7 @@
 synonym: "retinyl palmitate hydrolyase activity" RELATED []
 synonym: "retinyl-palmitate palmitohydrolase activity" RELATED []
 xref: MetaCyc:RETINYL-PALMITATE-ESTERASE-RXN
-xref: Reactome:R-HSA-2404133 "A REH hydrolyses atREs to atROL and FAs"
+xref: Reactome:R-HSA-2404133 "A REH hydrolses atREs to atROL and FAs"
 xref: Reactome:R-HSA-8848355 "PNPLA4 hydrolyzes retinyl palmitate"
 xref: Reactome:R-HSA-975593 "PNLIP:CLPS hydrolyses RPALM to atROL and PALM"
 xref: Reactome:R-HSA-975594 "PLB1 hydrolyses RPALM to atROL"
@@ -348222,6 +348251,8 @@
 namespace: molecular_function
 def: "OBSOLETE. Binding to an unfolded protein." [GOC:ai]
 comment: The reason for obsoletion is that this binding term should be replaced by an activity term such as protein folding chaperone (GO:0044183) or unfolded protein holdase activity (GO:0140309).
+xref: Reactome:R-HSA-9683772 "Trimmed spike protein binds to calnexin"
+xref: Reactome:R-HSA-9694337 "Trimmed spike protein binds to calnexin"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21436" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30962" xsd:anyURI
 is_obsolete: true
@@ -355880,6 +355911,7 @@
 synonym: "downregulation of killing of cells of another organism" EXACT []
 synonym: "inhibition of killing of cells of another organism" NARROW []
 synonym: "negative regulation of killing of cells of other organism" EXACT []
+xref: Reactome:R-HSA-9662851 "Anti-inflammatory response favouring Leishmania parasite infection"
 is_a: GO:0031342 ! negative regulation of cell killing
 is_a: GO:0051709 ! regulation of killing of cells of another organism
 intersection_of: GO:0065007 ! biological regulation
@@ -364740,7 +364772,6 @@
 xref: KEGG_REACTION:R02150
 xref: MetaCyc:RXN-9600
 xref: Reactome:R-HSA-5696131 "AOC1 deaminates Hist"
-xref: Reactome:R-HSA-9970023 "AOC1 dimer oxidizes MeHist"
 xref: RHEA:25625
 is_a: GO:0052597 ! diamine oxidase activity
 property_value: skos:exactMatch RHEA:25625
@@ -370633,7 +370664,7 @@
 subset: goslim_yeast
 synonym: "ATP hydrolysis coupled transmembrane transport" NARROW []
 synonym: "membrane transport" EXACT []
-xref: Reactome:R-HSA-382556 "ABC-family protein mediated transport"
+xref: Reactome:R-HSA-382556 "ABC-family proteins mediated transport"
 xref: Reactome:R-HSA-425407 "SLC-mediated transmembrane transport"
 xref: Reactome:R-HSA-5223345 "Miscellaneous transport and binding events"
 is_a: GO:0006810 ! transport
@@ -370969,6 +371000,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the digestive system over time, from its formation to the mature structure. The digestive system is the entire structure in which digestion takes place. Digestion is all of the physical, chemical, and biochemical processes carried out by multicellular organisms to break down ingested nutrients into components that may be easily absorbed and directed into metabolism." [GOC:jid]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0055124
@@ -371222,7 +371254,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the roof of the mouth from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure. The roof of the mouth is the partition that separates the nasal and oral cavities." [GOC:dph, ISBN:0721662544]
 synonym: "palatum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060022
@@ -371230,7 +371262,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the hard palate from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure, whatever form that may be including its natural destruction. The hard palate is the anterior portion of the palate consisting of bone and mucous membranes." [GOC:dph, ISBN:0721662544]
 synonym: "palatum durum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0062009 ! secondary palate development
 
 [Term]
@@ -371240,7 +371272,7 @@
 def: "The biological process whose specific outcome is the progression of the soft palate from an initial condition to its mature state. This process begins with the formation of the structure and ends with the mature structure, whatever form that may be including its natural destruction. The soft palate is the posterior portion of the palate extending from the posterior edge of the hard palate." [GOC:dph, ISBN:0721662544]
 synonym: "palatum molle development" EXACT [ISBN:0721662544]
 synonym: "velum palatum development" EXACT [ISBN:0721662544]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0062009 ! secondary palate development
 
 [Term]
@@ -371361,6 +371393,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the pharyngeal system over time, from its formation to the mature structure. The pharyngeal system is a transient embryonic complex that is specific to vertebrates. It comprises the pharyngeal arches, bulges of tissues of mesoderm and neural crest derivation through which pass nerves and pharyngeal arch arteries. The arches are separated internally by pharyngeal pouches, evaginations of foregut endoderm, and externally by pharyngeal clefts, invaginations of surface ectoderm. The development of the system ends when the structure it contributes to are forming: the thymus, thyroid, parathyroids, maxilla, mandible, aortic arch, cardiac outflow tract, external and middle ear." [GOC:dph]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043009 ! chordate embryonic development
 
 [Term]
@@ -371399,7 +371432,7 @@
 def: "The process whose specific outcome is the progression of the retina over time, from its formation to the mature structure. The retina is the innermost layer or coating at the back of the eyeball, which is sensitive to light and in which the optic nerve terminates." [GOC:bf, GOC:dph, ISBN:0815340729]
 synonym: "retina development in camera-style eye" EXACT []
 synonym: "retinal development" RELATED [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 
 [Term]
@@ -371665,6 +371698,7 @@
 def: "The reproductive developmental process whose specific outcome is the progression of the cervix over time, from its formation to the mature structure." [GOC:dph, GOC:ebc]
 synonym: "Mullerian tract development" RELATED []
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060068
@@ -372695,7 +372729,7 @@
 name: olfactory pit development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of the olfactory pit from an initial condition to its mature state. This process begins with the formation of the olfactory pit, which is an indentation of the olfactory placode, and ends when the pits hollows out to form the nasopharynx." [GOC:dph, ISBN:0124020607]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043584 ! nose development
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22589" xsd:anyURI
 
@@ -373747,7 +373781,6 @@
 synonym: "cilium organization" RELATED [GOC:dph]
 synonym: "microtubule-based flagellum assembly" EXACT []
 xref: Reactome:R-HSA-5617833 "Cilium Assembly"
-xref: Reactome:R-HSA-5620920 "Cargo trafficking to the periciliary membrane"
 is_a: GO:0044782 ! cilium organization
 is_a: GO:0070925 ! organelle assembly
 is_a: GO:0120031 ! plasma membrane bounded cell projection assembly
@@ -374313,7 +374346,7 @@
 name: head development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a head from an initial condition to its mature state. The head is the anterior-most division of the body." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0060323
@@ -374329,7 +374362,7 @@
 name: face development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a face from an initial condition to its mature state. The face is the ventral division of the head." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060322 ! head development
 
 [Term]
@@ -375408,7 +375441,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a lung saccule from an initial condition to its mature state. The lung saccule is the primitive gas exchange portion of the lung composed of type I and type II cells." [GOC:dph, GOC:mtg_lung]
 synonym: "lung saccular development" BROAD [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048286 ! lung alveolus development
 
 [Term]
@@ -375715,7 +375748,7 @@
 name: lung lobe development
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a lung lobe from an initial condition to its mature state. This process begins with the formation of a lung lobe by branching morphogenesis and ends with the mature structure. A lung lobe is one of the rounded projections that compose the lung." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030324 ! lung development
 
 [Term]
@@ -375741,7 +375774,7 @@
 namespace: biological_process
 def: "The biological process whose specific outcome is the progression of a pharynx from an initial condition to its mature state. The pharynx is the part of the digestive system immediately posterior to the mouth." [GOC:dph, GOC:rk]
 synonym: "pharyngeal development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048565 ! digestive tract development
 
 [Term]
@@ -376351,7 +376384,7 @@
 namespace: biological_process
 def: "The progression of a glandular acinus of the prostate gland over time, from its initial formation to the mature structure. The glandular acini are the saclike structures of the gland." [GOC:dph, PMID:18977204]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030850 ! prostate gland development
 
 [Term]
@@ -376510,6 +376543,7 @@
 def: "The progression of the respiratory system over time from its formation to its mature structure. The respiratory system carries out respiratory gaseous exchange." [GOC:dph]
 subset: goslim_drosophila
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2009-04-10T08:55:42Z
 
@@ -377393,7 +377427,7 @@
 name: nipple development
 namespace: biological_process
 def: "The progression of the nipple over time, from its formation to the mature structure. The nipple is a part of the mammary gland that protrudes from the surface ectoderm." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030879 ! mammary gland development
 created_by: dph
 creation_date: 2009-05-18T09:29:38Z
@@ -378492,7 +378526,7 @@
 name: labyrinthine layer development
 namespace: biological_process
 def: "The process in which the labyrinthine layer of the placenta progresses, from its formation to its mature state." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001892 ! embryonic placenta development
 created_by: dph
 creation_date: 2009-06-09T03:27:43Z
@@ -378927,7 +378961,7 @@
 name: mammary gland alveolus development
 namespace: biological_process
 def: "The progression of the mammary gland alveolus over time, from its formation to its mature state. The mammary gland alveolus is a sac-like structure that is found in the mature gland." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061377 ! mammary gland lobule development
 created_by: dph
 creation_date: 2009-06-22T10:52:12Z
@@ -381943,6 +381977,7 @@
 def: "The progression of the hepaticobiliary system over time, from its formation to the mature structure. The hepaticobiliary system is responsible for metabolic and catabolic processing of small molecules absorbed from the blood or gut, hormones and serum proteins, detoxification, storage of glycogen, triglycerides, metals and lipid soluble vitamins and excretion of bile. Included are the synthesis of albumin, blood coagulation factors, complement, and specific binding proteins." [GOC:dph]
 synonym: "hepatobiliary system development" EXACT [GOC:dph]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-01-22T09:11:59Z
 
@@ -382091,7 +382126,7 @@
 name: umbilical cord development
 namespace: biological_process
 def: "The process whose specific outcome is the development of the umbilical cord, from its formation to the mature structure. The umbilical cord is an organ or embryonic origin consisting of the 2 umbilical arteries and the one umbilical vein. The umbilical cord connects the cardiovascular system of the fetus to the mother via the placenta." [GOC:BHF, GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-02-09T09:09:22Z
 
@@ -382109,7 +382144,7 @@
 name: eyelid development in camera-type eye
 namespace: biological_process
 def: "The progression of the eyelid in a camera-type eye from its formation to the mature state. The eyelid is a membranous cover that helps protect and lubricate the eye." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2010-02-09T09:36:11Z
@@ -382141,7 +382176,7 @@
 namespace: biological_process
 def: "The progression of the visceral serous pericardium from its formation to the mature structure. The visceral serous pericardium is the inner layer of the pericardium." [GOC:dph, GOC:yaf]
 synonym: "epicardium development" EXACT [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060039 ! pericardium development
 created_by: dph
 creation_date: 2010-02-09T09:52:49Z
@@ -382162,7 +382197,7 @@
 name: olfactory bulb mitral cell layer development
 namespace: biological_process
 def: "The progression of the olfactory bulb mitral cell layer over time from its initial formation until its mature state. The mitral cell layer is composed of pyramidal neurons whose cell bodies are located between the granule cell layer and the plexiform layer." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021772 ! olfactory bulb development
 created_by: dph
 creation_date: 2010-02-09T03:30:23Z
@@ -382408,7 +382443,7 @@
 name: dermatome development
 namespace: biological_process
 def: "The progression of the dermatome over time, from its initial formation to the mature structure. The dermatome is the portion of a somite that will form skin." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061053 ! somite development
 created_by: dph
 creation_date: 2010-03-02T12:07:37Z
@@ -382418,7 +382453,7 @@
 name: myotome development
 namespace: biological_process
 def: "The progression of the myotome over time, from its formation to the mature structure. The myotome is the portion of the somite that will give rise to muscle." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061053 ! somite development
 created_by: dph
 creation_date: 2010-03-02T12:11:01Z
@@ -382498,7 +382533,7 @@
 namespace: biological_process
 def: "The progression of a muscle structure over time, from its formation to its mature state. Muscle structures are contractile cells, tissues or organs that are found in multicellular organisms." [GOC:dph]
 subset: goslim_drosophila
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2010-03-09T08:55:14Z
 
@@ -382704,7 +382739,7 @@
 name: left horn of sinus venosus development
 namespace: biological_process
 def: "The progression of the left horn of the sinus venosus from its initial formation to the mature structure." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003235 ! sinus venosus development
 created_by: dph
 creation_date: 2010-04-08T02:40:27Z
@@ -382714,7 +382749,7 @@
 name: right horn of sinus venosus development
 namespace: biological_process
 def: "The progression of the right horn of the sinus venosus from its formation to the mature structure." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0003235 ! sinus venosus development
 created_by: dph
 creation_date: 2010-04-08T02:45:10Z
@@ -383524,7 +383559,7 @@
 name: trachea submucosa development
 namespace: biological_process
 def: "The progression of the trachea submucosa over time from its formation to the mature structure. The trachea submucosa is made up of the glands and elastic tissue that lie under the mucosa in the trachea." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0060438 ! trachea development
 created_by: dph
 creation_date: 2010-06-07T09:58:40Z
@@ -384011,7 +384046,7 @@
 name: fungiform papilla development
 namespace: biological_process
 def: "The progression of the fungiform papilla over time, from its formation to the mature structure. The fungiform papilla is a mushroom-shaped papilla of the tongue." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043586 ! tongue development
 created_by: dph
 creation_date: 2010-07-27T12:23:48Z
@@ -385197,7 +385232,7 @@
 name: cornea development in camera-type eye
 namespace: biological_process
 def: "The progression of the cornea over time, from its formation to the mature structure. The cornea is the transparent structure that covers the anterior of the eye." [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0043010 ! camera-type eye development
 created_by: dph
 creation_date: 2010-09-14T02:09:08Z
@@ -385882,7 +385917,7 @@
 namespace: biological_process
 def: "The developmental process pertaining to the progression of the optic chiasm from its initial formation to the mature structure. The process begins when the pathfinding of the axons of the developing optic nerve cause some axons to cross at the midline of the brain and ends when the axons are mature." [GOC:dph]
 synonym: "optic chiasm development" EXACT [GOC:dph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021554 ! optic nerve development
 created_by: dph
 creation_date: 2010-10-13T08:00:29Z
@@ -386027,7 +386062,7 @@
 name: mammillary axonal complex development
 namespace: biological_process
 def: "The progression of the mammillary axonal complex over time, from its formation to the mature structure. The mammillary axonal complex is formed by the axons from the lateral, medial mammillary and the dorsal premammillary nuclei which share a branching pattern. Every neuron gives off one axonal stem that bifurcates into 2 branches. One of the branches is directed dorsally to the thalamus and another caudally to the midbrain." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021767 ! mammillary body development
 created_by: dph
 creation_date: 2010-11-09T08:49:59Z
@@ -386037,7 +386072,7 @@
 name: mammillothalamic axonal tract development
 namespace: biological_process
 def: "The progression of the mammillothalamic axonal tract, from its formation to the mature structure. The mammillothalamic tract is the collection of axons that connects the two major subdivisions of the diencephalon (hypothalamus and thalamus) and closes the diencephalic circuit." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T08:54:43Z
@@ -386047,7 +386082,7 @@
 name: mammillotectal axonal tract development
 namespace: biological_process
 def: "The progression of the mammillotectal tract over time, from its formation to the mature structure. The mammillotectal tract is the collection of axons that connects the ventral diencephalon to the superior colliculus." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T09:01:14Z
@@ -386057,7 +386092,7 @@
 name: mammillotegmental axonal tract development
 namespace: biological_process
 def: "The process in which the mammillotegmental tract progresses over time, from its formation to the mature structure. The mammillotegmental tract is the collection of axons that connects the ventral diencephalon to the tegmentum and pons." [GOC:dph, GOC:yaf, PMID:10662642]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061373 ! mammillary axonal complex development
 created_by: dph
 creation_date: 2010-11-09T09:09:29Z
@@ -386067,7 +386102,7 @@
 name: mammary gland lobule development
 namespace: biological_process
 def: "The progression of the mammary gland lobule over time, from its formation to the mature structure. A mammary gland lobule is a small rounded projection of the mammary gland." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030879 ! mammary gland development
 created_by: dph
 creation_date: 2010-11-09T09:36:29Z
@@ -386077,7 +386112,7 @@
 name: corpora quadrigemina development
 namespace: biological_process
 def: "The progression of the corpora quadrigemina over time, from its formation to the mature structure. The corpora quadrigemina is a part of the midbrain that is made up of the superior and inferior colliculi." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030901 ! midbrain development
 created_by: dph
 creation_date: 2010-11-09T09:45:36Z
@@ -386087,7 +386122,7 @@
 name: inferior colliculus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inferior colliculus over time, from its formation to the mature structure. The inferior colliculus (IC) (Latin, lower hill) is the principal midbrain nucleus of the auditory pathway and receives input from several more peripheral brainstem nuclei in the auditory pathway, as well as inputs from the auditory cortex. The inferior colliculus has three subdivisions: the central nucleus (CIC), a dorsal cortex (DCIC) by which it is surrounded, and an external cortex (ICX) which is located laterally." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061378 ! corpora quadrigemina development
 created_by: dph
 creation_date: 2010-11-09T09:49:24Z
@@ -386097,7 +386132,7 @@
 name: superior colliculus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior colliculus over time, from its formation to the mature structure. The superior colliculus is also known as the optic tectum or simply tectum and is a paired structure that forms a major component of the vertebrate midbrain." [GOC:dph, GOC:yaf]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0061378 ! corpora quadrigemina development
 created_by: dph
 creation_date: 2010-11-09T09:51:00Z
@@ -386977,6 +387012,7 @@
 namespace: biological_process
 def: "The progression of the reproductive system over time from its formation to the mature structure. The reproductive system consists of the organs that function in reproduction." [GOC:dph]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2012-08-22T17:47:53Z
 
@@ -387592,7 +387628,7 @@
 name: central canal development
 namespace: biological_process
 def: "The process whose specific outcome is the formation of the central canal of the spinal cord from its formation to the mature structure. The central canal is a spinal cord structure that is part of the ventricular system and is filled with cerebral-spinal fluid and runs the length of the spinal cord." [GOC:cvs, GOC:dph, PMID:23409159]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021510 ! spinal cord development
 created_by: dph
 creation_date: 2013-04-20T08:18:31Z
@@ -393794,7 +393830,7 @@
 name: stomach development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the stomach over time, from its formation to the mature structure. The stomach is an expanded region of the vertebrate alimentary tract that serves as a food storage compartment and digestive organ." [PMID:11967278]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048565 ! digestive tract development
 created_by: dph
 creation_date: 2018-11-20T18:15:45Z
@@ -394449,9 +394485,9 @@
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
@@ -396711,7 +396747,7 @@
 namespace: biological_process
 def: "The progression of the Kupffer's vesicle over time from its initial formation until its mature state. The Kupffer's vesicle is a small but distinctive epithelial sac containing fluid, located midventrally posterior to the yolk cell or its extension, and transiently present during most of the segmentation period." [GOC:dgh]
 synonym: "KV development" EXACT [GOC:dgh]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 
 [Term]
 id: GO:0070122
@@ -401804,7 +401840,6 @@
 def: "A process in which a protein is transported to, or maintained in, a location within the mitochondrion." [GOC:ecd]
 synonym: "protein localisation in mitochondrion" EXACT [GOC:mah]
 synonym: "protein localization in mitochondrion" EXACT []
-xref: Reactome:R-HSA-1268020 "Mitochondrial protein import"
 is_a: GO:0033365 ! protein localization to organelle
 created_by: mah
 creation_date: 2009-04-24T02:31:18Z
@@ -405114,57 +405149,34 @@
 
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
 
@@ -406533,12 +406545,15 @@
 
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
 
@@ -408138,7 +408153,7 @@
 name: superior temporal gyrus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the superior temporal gyrus over time, from its formation to the mature structure. The superior temporal gyrus is a portion of the cerebral cortex that extends from the lateral sulcus to the superior temporal sulcus." [FMA:61905, GOC:BHF, GOC:mah, PMID:11484000]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0021987 ! cerebral cortex development
 created_by: mah
 creation_date: 2009-11-12T02:19:23Z
@@ -409843,7 +409858,6 @@
 xref: MetaCyc:PWY-7527
 xref: MetaCyc:PWY-7528
 xref: MetaCyc:PWY-8132
-xref: Reactome:R-HSA-1237112 "Methionine salvage pathway"
 is_a: GO:0043102 ! amino acid salvage
 is_a: GO:0071265 ! L-methionine biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ADENOSYLHOMOCYSCAT-PWY
@@ -415444,7 +415458,7 @@
 name: beak development
 namespace: biological_process
 def: "The progression of the beak over time from its initial formation until its mature state. The avian beak is an external anatomical structure, in the head region, that is adapted for feeding self and young, catching prey, probing, etc. It encompasses, but is not restricted to, the maxilla, mandible, maxillary rhamphotheca, mandibular rhamphotheca, nostril, nasal fossa, nasal bones, egg tooth and rictus." [GOC:lp, ISBN:0702008729]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-03-17T03:52:48Z
 
@@ -418442,6 +418456,7 @@
 synonym: "urinary system development" BROAD [GOC:yaf]
 synonym: "urinary tract development" BROAD [GOC:yaf, PMID:17881463]
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-01-25T10:31:00Z
 
@@ -418494,7 +418509,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the nephron over time, from its formation to the mature structure. A nephron is the functional unit of the kidney." [GOC:mtg_kidney_jan10]
 synonym: "nephrogenesis" RELATED [GOC:rph]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T01:37:16Z
@@ -418569,7 +418584,7 @@
 namespace: biological_process
 def: "The progression of the glomus over time from its initial formation until its mature state. The glomus forms from the splanchnic intermediate mesoderm and is the vascularized filtration unit, filtering the blood before it enters the tubules. The glomus is external to the nephron and extends over more than one body segment." [GOC:mtg_kidney_jan10, PMID:10572058, PMID:15647339, PMID:9268568, XAO:0000318]
 synonym: "pronephric glomus development" EXACT [GOC:mtg_kidney_jan10, PMID:15895368]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048793 ! pronephros development
 created_by: mah
 creation_date: 2010-01-25T02:23:19Z
@@ -418602,6 +418617,7 @@
 def: "The process whose specific outcome is the progression of a glomerular parietal epithelial cell over time, from its formation to the mature structure. Glomerular parietal epithelial cells are specialized epithelial cells that form tight junctions as a barrier to protein transport." [GOC:mtg_kidney_jan10]
 synonym: "Bowman's capsule development" EXACT [GOC:mtg_kidney_jan10]
 is_a: GO:0072310 ! glomerular epithelial cell development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072139 ! glomerular parietal epithelial cell differentiation
 created_by: mah
 creation_date: 2010-01-25T02:13:16Z
@@ -418651,7 +418667,7 @@
 name: descending thin limb development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the descending thin limb over time, from its formation to the mature structure. The descending thin limb is a part of the loop of Henle situated just after the proximal straight tubule (S3). It extends to the tip of the loop of Henle." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072070 ! loop of Henle development
 created_by: mah
 creation_date: 2010-01-25T02:37:47Z
@@ -418975,7 +418991,7 @@
 name: juxtaglomerular apparatus development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the juxtaglomerular apparatus over time, from its formation to the mature structure. The juxtaglomerular apparatus is an anatomical structure that lies adjacent to the glomerulus and regulates kidney function." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:52:23Z
@@ -418996,7 +419012,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal inner medulla over time, from its formation to the mature structure. The renal inner medulla is unique to mammalian kidneys and is the innermost region of the mammalian kidney." [GOC:mtg_kidney_jan10]
 synonym: "inner renal medulla development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T03:59:37Z
@@ -419007,7 +419023,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal outer medulla over time, from its formation to the mature structure. The renal outer medulla is the region of the kidney that lies between the renal cortex and the renal inner medulla." [GOC:mtg_kidney_jan10]
 synonym: "outer renal medulla development" EXACT [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:00:42Z
@@ -419017,7 +419033,7 @@
 name: renal cortex development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the renal cortex over time, from its formation to the mature structure. The renal cortex is the outer region of the kidney." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:01:12Z
@@ -419031,7 +419047,7 @@
 synonym: "pyramids development" EXACT [GOC:mah]
 synonym: "renal medulla development" EXACT [GOC:mah]
 synonym: "renal pyramid development" EXACT [GOC:mah]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0001822 ! kidney development
 created_by: mah
 creation_date: 2010-01-25T04:01:36Z
@@ -419041,7 +419057,7 @@
 name: inner stripe development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the inner stripe over time, from its formation to the mature structure. The inner stripe is a deep, centrally located portion of the renal outer medulla and is traversed by thin descending and thick ascending portions of the loops of Henle." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072054 ! renal outer medulla development
 created_by: mah
 creation_date: 2010-01-25T04:01:58Z
@@ -419051,7 +419067,7 @@
 name: outer stripe development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the outer stripe over time, from its formation to the mature structure. The outer stripe is the region of the kidney outer medulla that lies just below the cortex. The proximal straight tubules (S3) characterize this region." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072054 ! renal outer medulla development
 created_by: mah
 creation_date: 2010-01-25T04:02:56Z
@@ -419061,7 +419077,7 @@
 name: cortical collecting duct development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the cortical collecting duct over time, from its formation to the mature structure. The cortical collecting duct is the portion of the collecting duct that resides in the renal cortex." [GOC:mtg_kidney_jan10]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-01-25T04:07:07Z
 
@@ -422383,6 +422399,7 @@
 subset: goslim_drosophila
 synonym: "cardiovascular system development" NARROW []
 is_a: GO:0048731 ! system development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: mah
 creation_date: 2010-11-16T11:27:39Z
 
@@ -422391,7 +422408,7 @@
 name: vascular cord development
 namespace: biological_process
 def: "The progression of the vascular cord over time from its initial formation until its mature state. The vascular cord is the primordial vasculature that will develop into blood vessels by the process of tubulogenesis." [GOC:mah, PMID:7084422, ZFA:0005077]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0072359 ! circulatory system development
 created_by: mah
 creation_date: 2010-11-16T11:46:55Z
@@ -430505,7 +430522,8 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the integument over time, from its formation to the mature structure. Integument is one of the layers of tissue that usually covers the ovule, enveloping the nucellus and forming the micropyle at the apex." [PMID:19054366, PO:0020021]
 is_a: GO:0003006 ! developmental process involved in reproduction
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048481 ! plant ovule development
 created_by: dhl
 creation_date: 2009-04-13T02:58:07Z
@@ -430760,6 +430778,7 @@
 synonym: "filament development" EXACT []
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048443 ! stamen development
 created_by: dhl
 creation_date: 2009-04-22T03:12:03Z
@@ -431686,6 +431705,7 @@
 is_a: GO:0003006 ! developmental process involved in reproduction
 is_a: GO:0022412 ! cellular process involved in reproduction in multicellular organism
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048653 ! anther development
 created_by: dhl
 creation_date: 2010-09-23T05:03:40Z
@@ -435024,7 +435044,7 @@
 name: cochlea development
 namespace: biological_process
 def: "The progression of the cochlea over time from its formation to the mature structure. The cochlea is the snail-shaped portion of the inner ear that is responsible for the detection of sound." [GOC:dph, GOC:tb]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0048839 ! inner ear development
 created_by: tb
 creation_date: 2009-11-18T11:42:15Z
@@ -438317,6 +438337,7 @@
 namespace: biological_process
 def: "OBSOLETE. Any process that modulates the rate, frequency, or extent of the chemical reactions and pathways involving ornithine, an amino acid only rarely found in proteins, but which is important in living organisms as an intermediate in the reactions of the urea cycle and in arginine biosynthesis." [GOC:dph, GOC:jp, GOC:tb]
 comment: The reason for obsoletion is that this term was an unnecessary grouping terms and only 'biosynthetic' or 'catabolic' process should be used.
+xref: Reactome:R-HSA-350562 "Regulation of ornithine decarboxylase (ODC)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31171" xsd:anyURI
 is_obsolete: true
 created_by: tb
@@ -440303,7 +440324,8 @@
 name: plant epidermis development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of the plant epidermis over time, from its formation to the mature structure." [GOC:tb]
-is_a: GO:0009888 ! tissue development
+is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2014-02-27T15:17:37Z
 
@@ -457995,6 +458017,7 @@
 def: "Development of a plant organ, a multi-tissue plant structure that forms a functional unit." [GOC:dos]
 synonym: "development of a plant organ" EXACT []
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0048731 ! system development
 
 [Term]
@@ -464769,7 +464792,6 @@
 def: "Catalysis of the reaction: a (2S)-2-hydroxycarboxylate + NAD+ = a 2-oxocarboxylate + NADH + H+." [RHEA:34555]
 xref: EC:1.1.1.337
 xref: MetaCyc:RXN-13927
-xref: Reactome:R-HSA-9971565 "Unknown enzyme hydrogenates HPP"
 xref: RHEA:10176
 xref: RHEA:15533
 xref: RHEA:34555
@@ -472189,6 +472211,9 @@
 namespace: molecular_function
 def: "OBSOLETE. Catalysis of the reaction: S-adenosyl-L-methionine + tRNA = S-adenosyl-L-homocysteine + tRNA containing a 2'-O-nucleotide." [PMID:17242307]
 comment: This term was obsoleted because it is an unnecessray grouping term.
+xref: Reactome:R-HSA-6788668 "TRMT13 2'-O-methylates adenosine-4 in tRNA"
+xref: Reactome:R-HSA-6788684 "TRMT13 2'-O-methylates cytidine-4 in tRNA"
+xref: Reactome:R-HSA-9024159 "FTSJ1 2'-O-methylates cytidine-32 in tRNA(Phe)"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31519" xsd:anyURI
 is_obsolete: true
 consider: GO:0106339
@@ -475292,7 +475317,7 @@
 def: "The progression of the yolk syncytial layer over time, from its initial formation to the mature structure. The yolk syncytial layer is the peripheral layer of the yolk cell including nuclei and non-yolky cytoplasm." [PMID:29180571]
 comment: The "yolk syncytial layer" structure can be found in Teleostei, Myxini, Chondrichthyes, Lepisosteiformes and Cephalopoda according.
 synonym: "YSL development" RELATED []
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: hjd
 creation_date: 2020-11-05T17:56:43Z
 
@@ -475304,7 +475329,6 @@
 synonym: "tRNA (cytidine 32-2'-O)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytidine(32)-2'-O)-methyltransferase activity" EXACT []
 xref: MetaCyc:RXN-11866
-xref: Reactome:R-HSA-9024159 "FTSJ1 2'-O-methylates cytidine-32 in tRNA(Phe)"
 xref: RHEA:42932
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
 property_value: skos:broadMatch EC:2.1.1.200
@@ -478699,13 +478723,6 @@
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
@@ -488221,6 +488238,9 @@
 comment: Examples of protein carriers include the soluble TIM chaperone complexes of S. cerevisiae Tim9-Tim10 and Tim8-Tim13, that provide a shuttle system between TOM and the membrane insertases TIM22 and SAM and, thus, ensure that precursors are kept in a translocation-competent conformation.
 synonym: "protein carrier activity" RELATED []
 synonym: "protein transport chaperone" RELATED []
+xref: Reactome:R-HSA-2248891 "M6PR transports activated ARSA to the lysosome"
+xref: Reactome:R-HSA-9662747 "iRHOM2 transports ADAM17 from ER to the Golgi-network"
+xref: Reactome:R-HSA-9662818 "iRHOM2 transports ADAM17:Zn2+ from Golgi to the plasma membrane"
 is_a: GO:0005215 ! transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17073" xsd:anyURI
 created_by: pg
@@ -489064,8 +489084,6 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: cytidine(4) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(4) in tRNA + S-adenosyl-L-homocysteine + H+. Acts on  cytidine(4) on tRNAPro and tRNAGly(GCC), and on adenosine(4) in tRNAHis." [EC:2.1.1.225, PMID:17242307]
 xref: EC:2.1.1.225
-xref: Reactome:R-HSA-6788668 "TRMT13 2'-O-methylates adenosine-4 in tRNA"
-xref: Reactome:R-HSA-6788684 "TRMT13 2'-O-methylates cytidine-4 in tRNA"
 xref: RHEA:32767
 xref: RHEA:43192
 xref: RHEA:43196
@@ -489643,6 +489661,16 @@
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
@@ -489742,6 +489770,18 @@
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
 id: GO:0140438
 name: protein stearoylation
 namespace: biological_process
@@ -502314,9 +502354,9 @@
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
@@ -502325,7 +502365,7 @@
 id: GO:0160109
 name: plant gross anatomical part developmental process
 namespace: biological_process
-def: "Any developmental process whose specific outcome is the progression of a gross anatomical part of a plant from an initial immature state, to a later, more mature state." [GOC:pg]
+def: "A developmental process whose specific outcome is the progression of a gross anatomical part of a plant over time from an initial condition to a later condition." [GOC:pg]
 synonym: "plant development" RELATED []
 is_a: GO:0032502 ! developmental process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22994" xsd:anyURI
@@ -516603,8 +516643,8 @@
 is_a: GO:2001210 ! regulation of isopentenyl diphosphate biosynthetic process, mevalonate pathway
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
-relationship: positively_regulates GO:0006720 ! isoprenoid metabolic process
 relationship: positively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: al
 creation_date: 2012-05-02T10:46:46Z
 
@@ -537466,7 +537506,6 @@
 def: "OBSOLETE. The chemical reactions and pathways involving an alpha-amino acid." [GOC:TermGenie]
 comment: The reason for obsoletion is that this term was an unnecessary grouping term and more specific terms were created.
 synonym: "alpha-amino acid metabolism" EXACT [GOC:TermGenie]
-xref: Reactome:R-HSA-977347 "Serine metabolism"
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31993" xsd:anyURI
 is_obsolete: true
 created_by: tb
@@ -544176,34 +544215,34 @@
 
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
@@ -574563,84 +574602,34 @@
 
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
 
@@ -575720,7 +575709,7 @@
 synonym: "intestinum caecum development" RELATED [GOC:TermGenie]
 synonym: "intestinum crassum caecum development" EXACT [GOC:TermGenie]
 synonym: "intestinum crassum cecum development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T12:05:00Z
 
@@ -575732,7 +575721,7 @@
 synonym: "corneal stroma development" EXACT [GOC:TermGenie]
 synonym: "stroma of cornea development" EXACT [GOC:TermGenie]
 synonym: "substantia propria development" RELATED [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T13:12:09Z
 
@@ -575744,7 +575733,7 @@
 synonym: "esophageal development" EXACT [MGI:csmith]
 synonym: "gullet development" EXACT [GOC:TermGenie]
 synonym: "oesophagus development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cls
 creation_date: 2014-12-03T14:41:30Z
 
@@ -578614,6 +578603,7 @@
 def: "The process whose specific outcome is the progression of a palisade mesophyll over time, from its formation to the mature structure." [GO_REF:0000080, GOC:TermGenie, PMID:24663344]
 synonym: "palisade parenchyma development" RELATED [GOC:TermGenie]
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2015-02-04T21:51:44Z
 
@@ -578622,7 +578612,7 @@
 name: extraembryonic membrane development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of an extraembryonic membrane over time, from its formation to the mature structure." [GO_REF:0000094, GOC:TermGenie, ISBN:0073040584]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: cjm
 creation_date: 2015-02-05T00:42:16Z
 
@@ -584457,7 +584447,8 @@
 synonym: "regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070861 ! regulation of protein exit from endoplasmic reticulum
+is_a: GO:0050794 ! regulation of cellular process
+is_a: GO:0051223 ! regulation of protein transport
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0030970 ! retrograde protein transport, ER to cytosol
 relationship: regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -584484,7 +584475,8 @@
 synonym: "negative regulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "negative regulation of protein retrotranslocation from ER" EXACT [GOC:bf]
 synonym: "negative regulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070862 ! negative regulation of protein exit from endoplasmic reticulum
+is_a: GO:0048523 ! negative regulation of cellular process
+is_a: GO:0051224 ! negative regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -584513,7 +584505,8 @@
 synonym: "upregulation of protein dislocation from ER" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, endoplasmic reticulum to cytosol" EXACT [GOC:TermGenie]
 synonym: "upregulation of retrograde protein transport, ER to cytosol" EXACT [GOC:TermGenie]
-is_a: GO:0070863 ! positive regulation of protein exit from endoplasmic reticulum
+is_a: GO:0048522 ! positive regulation of cellular process
+is_a: GO:0051222 ! positive regulation of protein transport
 is_a: GO:1904152 ! regulation of retrograde protein transport, ER to cytosol
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0030970 ! retrograde protein transport, ER to cytosol
@@ -585353,18 +585346,14 @@
 
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
 
@@ -598085,7 +598074,7 @@
 synonym: "serosa development" RELATED [GOC:TermGenie]
 synonym: "tunica serosa development" EXACT [GOC:TermGenie]
 synonym: "wall of serous sac development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: dph
 creation_date: 2015-11-17T19:00:01Z
 
@@ -598094,7 +598083,7 @@
 name: visceral peritoneum development
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a visceral peritoneum over time, from its formation to the mature structure." [GO_REF:0000094, GOC:dph, GOC:TermGenie, PMID:15840053]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:1904820 ! peritoneum development
 created_by: dph
 creation_date: 2015-11-17T19:00:17Z
@@ -598105,7 +598094,7 @@
 namespace: biological_process
 def: "The process whose specific outcome is the progression of a parietal peritoneum over time, from its formation to the mature structure." [GO_REF:0000094, GOC:dph, GOC:TermGenie, PMID:15840053]
 synonym: "peritoneal cavity lining development" EXACT [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:1904820 ! peritoneum development
 created_by: dph
 creation_date: 2015-11-17T19:00:24Z
@@ -599018,7 +599007,7 @@
 synonym: "ventral tegmentum development" EXACT [Wikipedia:Ventral_tegmental_area]
 synonym: "ventromedial mesencephalic tegmentum development" RELATED [GOC:TermGenie]
 synonym: "VTA development" BROAD [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 relationship: part_of GO:0030901 ! midbrain development
 created_by: bf
 creation_date: 2015-12-17T14:44:18Z
@@ -599415,7 +599404,7 @@
 synonym: "craniofacial development" NARROW [PMID:11262227]
 synonym: "cranium development" RELATED [GOC:TermGenie]
 synonym: "osteocranium development" NARROW [GOC:TermGenie]
-is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: bf
 creation_date: 2016-01-07T13:45:06Z
 
@@ -608305,6 +608294,7 @@
 def: "The process whose specific outcome is the progression of a septum over time, from its formation to the mature structure." [GO_REF:0000080, GOC:tb, GOC:TermGenie, PMID:4562349]
 synonym: "dissepiment development" BROAD [GOC:TermGenie]
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 created_by: tb
 creation_date: 2016-07-21T18:25:49Z
 
@@ -621625,6 +621615,7 @@
 def: "The process whose specific outcome is the progression of the fruit replum over time, from its formation to the mature structure. The fruit replum is a portion of fruit placenta tissue that divides a fruit into two or more chambers and develops from a replum." [PMID:23133401, PO:0025267]
 is_a: GO:0009791 ! post-embryonic development
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
 creation_date: 2013-03-12T21:15:15Z
@@ -621636,6 +621627,7 @@
 def: "The process whose specific outcome is the progression of the fruit valve over time, from its formation to the mature structure. The fruit valve is a part of a fruit that splits apart when the fruit dehisces." [PMID:23133401, PO:0000033]
 is_a: GO:0009791 ! post-embryonic development
 is_a: GO:0048856 ! anatomical structure development
+is_a: GO:0160109 ! plant gross anatomical part developmental process
 relationship: part_of GO:0010154 ! fruit development
 created_by: dhl
 creation_date: 2013-03-12T21:21:15Z
@@ -624895,6 +624887,7 @@
 synonym: "penile bone development" EXACT [GOC:sl]
 synonym: "penis bone development" EXACT [GOC:sl]
 is_a: GO:0048608 ! reproductive structure development
+is_a: GO:0160108 ! animal gross anatomical part developmental process
 created_by: sl
 creation_date: 2014-05-01T23:59:13Z
 
@@ -626000,11 +625993,13 @@
 
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
 
@@ -648282,13 +648277,13 @@
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
 
@@ -648302,7 +648297,6 @@
 synonym: "negative regulation of isopentenyl diphosphate anabolism, mevalonate pathway" EXACT [GOC:obol]
 synonym: "negative regulation of isopentenyl diphosphate formation, mevalonate pathway" EXACT [GOC:obol]
 synonym: "negative regulation of isopentenyl diphosphate synthesis, mevalonate pathway" EXACT [GOC:obol]
-is_a: GO:0045827 ! negative regulation of isoprenoid metabolic process
 is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 is_a: GO:0071072 ! negative regulation of phospholipid biosynthetic process
@@ -648310,6 +648304,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
 relationship: negatively_regulates GO:0019287 ! isopentenyl diphosphate biosynthetic process, mevalonate pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: bf
 creation_date: 2011-11-15T10:53:45Z
 
@@ -650760,7 +650755,7 @@
 def: "A process by which an organism causes inflammatory response in another organism via the action of a venom." [PMID:19000915, PMID:32024243]
 synonym: "envenomation resulting in positive regulation of inflammatory response in another organism" EXACT []
 synonym: "venom-mediated inflammation" BROAD []
-is_a: GO:0035738 ! venom-mediated perturbation of biological process
+is_a: GO:0140428 ! venom-mediated perturbation of immune response
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31902" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2026-05-07T07:41:13Z
@@ -650802,12 +650797,18 @@
 
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
 
@@ -650823,6 +650824,54 @@
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
 [Typedef]
 id: ends_during
 name: ends during
```
