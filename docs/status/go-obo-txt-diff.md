# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-08-10 05:58:43.149508799 +0000
+++ go.obo	2026-08-10 06:10:28.687019026 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-07-26
+data-version: releases/2026-08-10
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-07-26" xsd:string
+property_value: owl:versionInfo "2026-08-10" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -1071,8 +1071,10 @@
 xref: MetaCyc:SO4ASSIM-PWY
 xref: MetaCyc:SULFMETII-PWY
 is_a: GO:0006790 ! sulfur compound metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 property_value: skos:narrowMatch MetaCyc:SO4ASSIM-PWY
 property_value: skos:narrowMatch MetaCyc:SULFMETII-PWY
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
 
 [Term]
 id: GO:0000104
@@ -12201,6 +12203,7 @@
 xref: Reactome:R-HSA-72095 "Internal Methylation of mRNA"
 xref: RHEA:55584
 is_a: GO:0008174 ! mRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.348
 property_value: skos:exactMatch RHEA:55584
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27389" xsd:anyURI
@@ -34490,7 +34493,7 @@
 id: GO:0003919
 name: FMN adenylyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + FMN = diphosphate + FAD." [EC:2.7.7.2, RHEA:17237]
+def: "Catalysis of the reaction: FMN + ATP + H+ = FAD + diphosphate." [RHEA:17237]
 synonym: "adenosine triphosphate-riboflavin mononucleotide transadenylase activity" RELATED [EC:2.7.7.2]
 synonym: "adenosine triphosphate-riboflavine mononucleotide transadenylase activity" RELATED [EC:2.7.7.2]
 synonym: "ATP:FMN adenylyltransferase activity" EXACT []
@@ -34510,6 +34513,7 @@
 property_value: skos:exactMatch EC:2.7.7.2
 property_value: skos:exactMatch RHEA:17237
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32345" xsd:anyURI
 
 [Term]
 id: GO:0003920
@@ -77490,11 +77494,9 @@
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
@@ -88071,24 +88073,24 @@
 
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
@@ -90289,7 +90291,7 @@
 id: GO:0008531
 name: riboflavin kinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + riboflavin = ADP + FMN + 2 H+." [EC:2.7.1.26, RHEA:14357]
+def: "Catalysis of the reaction: riboflavin + ATP = FMN + ADP + H+." [RHEA:14357]
 synonym: "ATP:riboflavin 5'-phosphotransferase activity" RELATED [EC:2.7.1.26]
 synonym: "FK" RELATED [EC:2.7.1.26]
 synonym: "flavokinase activity" RELATED [EC:2.7.1.26]
@@ -90305,6 +90307,7 @@
 property_value: skos:exactMatch EC:2.7.1.26
 property_value: skos:exactMatch RHEA:14357
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32345" xsd:anyURI
 
 [Term]
 id: GO:0008532
@@ -90754,19 +90757,17 @@
 
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
@@ -97323,8 +97324,8 @@
 xref: RHEA:58724
 xref: RHEA:58728
 xref: RHEA:62612
-is_a: GO:0008170 ! N-methyltransferase activity
 is_a: GO:0016433 ! rRNA (adenine) methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch RHEA:58728
 property_value: skos:narrowMatch RHEA:58724
 property_value: skos:narrowMatch RHEA:62612
@@ -100802,19 +100803,20 @@
 
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
@@ -159257,7 +159259,7 @@
 synonym: "dissimilatory sulphate reduction" EXACT []
 xref: MetaCyc:DISSULFRED-PWY
 xref: Wikipedia:Sulfate-reducing_microorganism
-is_a: GO:0000103 ! sulfate assimilation
+is_a: GO:0006790 ! sulfur compound metabolic process
 is_a: GO:0009061 ! anaerobic respiration
 relationship: has_part GO:0018551 ! dissimilatory sulfite reductase (NADH) activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26582" xsd:anyURI
@@ -159772,11 +159774,12 @@
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
@@ -162018,6 +162021,7 @@
 xref: MetaCyc:PWY-1622
 xref: MetaCyc:PWY-1861
 is_a: GO:0046292 ! formaldehyde metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 property_value: skos:narrowMatch MetaCyc:P185-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-1622
 property_value: skos:narrowMatch MetaCyc:PWY-1861
@@ -162409,11 +162413,13 @@
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
@@ -164637,14 +164643,14 @@
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
@@ -188877,12 +188883,12 @@
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
@@ -205354,9 +205360,9 @@
 xref: Reactome:R-HSA-9906955 "MT-ND4 is translated"
 xref: Reactome:R-HSA-9926981 "Bam complex inserts Hbp into outer membrane"
 is_a: GO:0140597 ! protein carrier activity
-relationship: part_of GO:0090150 ! establishment of protein localization to membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16976" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20414" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32404" xsd:anyURI
 
 [Term]
 id: GO:0032978
@@ -209311,7 +209317,7 @@
 id: GO:0033353
 name: L-methionine cycle
 namespace: biological_process
-def: "A cyclic series of interconversions involving S-adenosyl-L-homocysteine, L-homocysteine, L-methionine and S-adenosyl-L-methionine (SAM). Couples utilization of the methyl group of SAM with recycling of the homocysteinyl group and regeneration of L-methionine." [PMID:31950558, PMID:39394448]
+def: "A cyclic series of interconversions involving S-adenosyl-L-homocysteine, L-homocysteine, L-methionine and S-adenosyl-L-methionine (SAM). Couples utilization of the methyl group of SAM with recycling of the homocysteinyl group and regeneration of L-methionine." [PMID:31950558, PMID:32961717, PMID:39394448]
 synonym: "activated methyl cycle" EXACT []
 synonym: "S-adenosylmethionine cycle" EXACT []
 synonym: "SAM cycle" EXACT []
@@ -209319,6 +209325,7 @@
 xref: MetyaCyc:PWY-6151
 is_a: GO:0006555 ! L-methionine metabolic process
 is_a: GO:0006575 ! modified amino acid metabolic process
+is_a: GO:0006730 ! one-carbon metabolic process
 is_a: GO:0046128 ! purine ribonucleoside metabolic process
 is_a: GO:0046500 ! S-adenosylmethionine metabolic process
 is_a: GO:0050667 ! homocysteine metabolic process
@@ -209326,6 +209333,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31318" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31840" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 
 [Term]
 id: GO:0033354
@@ -211302,9 +211310,11 @@
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
@@ -239543,11 +239553,13 @@
 
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
@@ -239558,6 +239570,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-3841
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32289" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32362" xsd:anyURI
 created_by: bf
 creation_date: 2011-09-02T01:35:49Z
 
@@ -240947,7 +240960,6 @@
 name: very long-chain fatty-acyl-CoA catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of very long-chain fatty-acyl-CoAs, any derivative of coenzyme A in which the sulfhydryl group is in a thioester linkage with a very long-chain fatty-acyl group. A very long-chain fatty acid has an aliphatic tail containing more than 22 carbons." [GOC:pm]
-comment: While there is not universal consensus on the lengths of short-, medium-, long- and very-long-chain fatty acids, the GO uses the definitions in ChEBI (see CHEBI:26666, CHEBI:59554, CHEBI:15904 and CHEBI:27283).
 synonym: "very long-chain fatty-acyl-CoA breakdown" EXACT [GOC:bf]
 synonym: "very long-chain fatty-acyl-CoA catabolism" EXACT [GOC:bf]
 synonym: "very long-chain fatty-acyl-CoA degradation" EXACT [GOC:bf]
@@ -246714,6 +246726,7 @@
 synonym: "IL-5-mediated signaling pathway" EXACT [GOC:bf]
 synonym: "interleukin-5-mediated signalling pathway" EXACT [GOC:mah]
 is_a: GO:0019221 ! cytokine-mediated signaling pathway
+relationship: part_of GO:7770103 ! cellular response to interleukin-5
 created_by: bf
 creation_date: 2011-11-03T04:18:21Z
 
@@ -248084,6 +248097,7 @@
 synonym: "granulocyte colony-stimulating factor receptor signaling pathway" EXACT [GOC:nhn]
 synonym: "granulocyte colony-stimulating factor signalling pathway" RELATED [GOC:bf]
 is_a: GO:0019221 ! cytokine-mediated signaling pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32373" xsd:anyURI
 created_by: bf
 creation_date: 2012-05-14T01:30:28Z
 
@@ -253176,6 +253190,7 @@
 xref: MetaCyc:PWY490-3
 is_a: GO:0042126 ! nitrate metabolic process
 is_a: GO:0071941 ! nitrogen cycle metabolic process
+is_a: GO:7770097 ! nutrient assimilation
 relationship: has_part GO:0015112 ! nitrate transmembrane transporter activity
 relationship: has_part GO:0098809 ! nitrite reductase activity
 property_value: skos:narrowMatch MetaCyc:PWY-381
@@ -253184,6 +253199,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27216" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30537" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31634" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32376" xsd:anyURI
 
 [Term]
 id: GO:0042129
@@ -259024,11 +259040,10 @@
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
@@ -278118,66 +278133,81 @@
 
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
 
@@ -278380,38 +278410,47 @@
 
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
 
@@ -279221,28 +279260,33 @@
 
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
 
@@ -279261,13 +279305,16 @@
 
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
 
@@ -279281,7 +279328,6 @@
 synonym: "voltage-dependence of activation shift (to the left)" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29857" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0044562
 created_by: jl
 creation_date: 2012-04-05T04:06:29Z
 
@@ -279294,7 +279340,6 @@
 synonym: "envenomation resulting in occlusion of the pore of voltage-gated potassium channel in other organism" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29857" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0044562
 created_by: jl
 creation_date: 2012-04-05T04:14:24Z
 
@@ -281044,49 +281089,58 @@
 
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
 
@@ -304916,16 +304970,18 @@
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
@@ -350108,7 +350164,6 @@
 synonym: "protein-mitochondrion membrane insertion" EXACT []
 is_a: GO:0007006 ! mitochondrial membrane organization
 is_a: GO:0051205 ! protein insertion into membrane
-is_a: GO:0051649 ! establishment of localization in cell
 is_a: GO:0072594 ! establishment of protein localization to organelle
 relationship: part_of GO:0070585 ! protein localization to mitochondrion
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15800" xsd:anyURI
@@ -358521,7 +358576,7 @@
 id: GO:0051920
 name: peroxiredoxin activity
 namespace: molecular_function
-def: "Catalysis of the reaction: [protein]-dithol + ROOH = [protein]-disulfide + H2O + ROH." [RHEA:10008]
+def: "Catalysis of the reaction: [protein]-dithiol + ROOH = [protein]-disulfide + H2O + ROH." [RHEA:10008]
 comment: Includes redox chemistry as part of the catalytic reaction (2 R'-SH = R'-S-S-R'), where R' refers to peroxiredoxin itself).
 synonym: "PRDX activity" EXACT []
 synonym: "Prx activity" EXACT []
@@ -358529,16 +358584,13 @@
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
@@ -399284,7 +399336,7 @@
 name: inward rectifier potassium channel inhibitor activity
 namespace: molecular_function
 def: "Binds to and stops, prevents, or reduces the activity of an inwardly rectifying potassium channel." [GOC:mah]
-is_a: GO:0019870 ! potassium channel inhibitor activity
+is_a: GO:7770090 ! voltage-gated potassium channel inhibitor activity
 relationship: negatively_regulates GO:0005242 ! inward rectifier potassium channel activity
 
 [Term]
@@ -452278,7 +452330,6 @@
 xref: Reactome:R-HSA-5690046 "PPT2 hydrolyses PALMCoA to PALM"
 xref: Reactome:R-HSA-9027670 "ESTG binding induces ESR depalmitoylation"
 is_a: GO:0016787 ! hydrolase activity
-relationship: part_of GO:0098734 ! macromolecule depalmitoylation
 created_by: dos
 creation_date: 2014-04-11T17:57:36Z
 
@@ -461066,10 +461117,11 @@
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
@@ -475811,6 +475863,7 @@
 synonym: "U2 snRNA adenosine m6 methyltransferase activity" EXACT []
 synonym: "U2 snRNA adenosine N6 methyltransferase activity" EXACT []
 is_a: GO:0106346 ! snRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27392" xsd:anyURI
 created_by: hjd
 creation_date: 2020-12-18T15:12:57Z
@@ -479500,6 +479553,7 @@
 xref: MetaCyc:RXN-18779
 xref: RHEA:52808
 is_a: GO:0106346 ! snRNA methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.346
 property_value: skos:exactMatch RHEA:52808
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/13569" xsd:anyURI
@@ -489129,12 +489183,13 @@
 
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
 
@@ -490818,13 +490873,15 @@
 
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
 
@@ -492215,7 +492272,7 @@
 name: outward rectifier potassium channel inhibitor activity
 namespace: molecular_function
 def: "Binds to and stops, prevents, or reduces the activity of an outwardly rectifying potassium channel." [PMID:28108814]
-is_a: GO:0019870 ! potassium channel inhibitor activity
+is_a: GO:7770090 ! voltage-gated potassium channel inhibitor activity
 relationship: negatively_regulates GO:0015271 ! outward rectifier potassium channel activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21157" xsd:anyURI
 created_by: pg
@@ -494862,17 +494919,26 @@
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
 
@@ -550711,12 +550777,13 @@
 
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
 
@@ -578736,7 +578803,7 @@
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of cristae formation." [GO_REF:0000058, GOC:pad, GOC:PARL, GOC:TermGenie, PMID:19279012]
 comment: AN example of this is PINK1 in human (Q9BXM7) in PMID:19279012 inferred from mutant phenotype
-is_a: GO:0010821 ! regulation of mitochondrion organization
+is_a: GO:0051128 ! regulation of cellular component organization
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0042407 ! cristae formation
 relationship: regulates GO:0042407 ! cristae formation
@@ -578753,7 +578820,7 @@
 synonym: "down-regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "downregulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "inhibition of cristae formation" NARROW [GOC:TermGenie]
-is_a: GO:0010639 ! negative regulation of organelle organization
+is_a: GO:0051129 ! negative regulation of cellular component organization
 is_a: GO:1903850 ! regulation of cristae formation
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0042407 ! cristae formation
@@ -578771,7 +578838,7 @@
 synonym: "up regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "up-regulation of cristae formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of cristae formation" EXACT [GOC:TermGenie]
-is_a: GO:0010638 ! positive regulation of organelle organization
+is_a: GO:0051130 ! positive regulation of cellular component organization
 is_a: GO:1903850 ! regulation of cristae formation
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0042407 ! cristae formation
@@ -650961,8 +651028,8 @@
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + adenosine(37) in tRNA(Val) = S-adenosyl-L-homocysteine + N(6)-methyladenosine(37) in tRNA(Val) + H+." [PMID:19383770, RHEA:43160]
 xref: EC:2.1.1.223
 xref: RHEA:43160
-is_a: GO:0008170 ! N-methyltransferase activity
 is_a: GO:0016426 ! tRNA (adenine) methyltransferase activity
+is_a: GO:7770107 ! RNA (adenine-N6)-methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.223
 property_value: skos:exactMatch RHEA:43160
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31644" xsd:anyURI
@@ -651420,6 +651487,274 @@
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
+is_a: GO:0004601 ! peroxidase activity
+property_value: skos:exactMatch EC:1.11.1.27
+property_value: skos:exactMatch RHEA:62632
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
 [Typedef]
 id: ends_during
 name: ends during
```
