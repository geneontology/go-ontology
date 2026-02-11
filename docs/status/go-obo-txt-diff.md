# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-02-11 05:59:24.850456291 +0000
+++ go.obo	2026-02-11 06:08:25.253302384 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-01-23
+data-version: releases/2026-02-11
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-01-23" xsd:string
+property_value: owl:versionInfo "2026-02-11" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -490,7 +490,7 @@
 id: GO:0000048
 name: peptidyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: peptidyl-tRNA(1) + aminoacyl-tRNA(2) = tRNA(1) + peptidylaminoacyl-tRNA(2). This reaction is catalyzed by a ribozyme." [PMID:11433365, PMID:9242921]
+def: "Catalysis of the reaction: peptidyl-tRNA(1) + aminoacyl-tRNA(2) = tRNA(1) + peptidylaminoacyl-tRNA(2). This reaction is catalyzed by a ribozyme." [EC:2.3.2.12, PMID:11433365, PMID:9242921]
 xref: EC:2.3.2.12
 xref: MetaCyc:PEPTIDYLTRANSFERASE-RXN
 xref: Reactome:R-HSA-156912 "Peptide transfer from P-site tRNA to the A-site tRNA"
@@ -967,19 +967,20 @@
 id: GO:0000096
 name: sulfur amino acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving amino acids containing sulfur, comprising cysteine, homocysteine, methionine and selenocysteine." [GOC:ai]
+def: "The chemical reactions and pathways involving amino acids containing sulfur." [GOC:curators]
 synonym: "sulfur amino acid metabolism" EXACT []
 synonym: "sulphur amino acid metabolic process" EXACT []
 synonym: "sulphur amino acid metabolism" EXACT []
 xref: Reactome:R-HSA-1614635 "Sulfur amino acid metabolism"
 is_a: GO:0006790 ! sulfur compound metabolic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31500" xsd:anyURI
 
 [Term]
 id: GO:0000097
 name: sulfur amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids containing sulfur, comprising cysteine, methionine and selenocysteine." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the formation of amino acids containing sulfur." [GOC:curators]
 synonym: "sulfur amino acid anabolism" EXACT []
 synonym: "sulfur amino acid biosynthesis" EXACT []
 synonym: "sulfur amino acid formation" EXACT []
@@ -989,12 +990,13 @@
 is_a: GO:0000096 ! sulfur amino acid metabolic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31500" xsd:anyURI
 
 [Term]
 id: GO:0000098
 name: sulfur amino acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of amino acids containing sulfur, comprising cysteine, methionine and selenocysteine." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of amino acids containing sulfur." [GOC:curators]
 synonym: "sulfur amino acid breakdown" EXACT []
 synonym: "sulfur amino acid catabolism" EXACT []
 synonym: "sulfur amino acid degradation" EXACT []
@@ -1004,6 +1006,7 @@
 is_a: GO:0000096 ! sulfur amino acid metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:0046395 ! carboxylic acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31500" xsd:anyURI
 
 [Term]
 id: GO:0000099
@@ -1090,10 +1093,14 @@
 synonym: "histidine formation" EXACT []
 synonym: "histidine synthesis" EXACT []
 xref: MetaCyc:HISTSYN-PWY
+xref: MetaCyc:PWY-5029
 is_a: GO:0006547 ! L-histidine metabolic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:HISTSYN-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-5029
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0000107
@@ -2872,7 +2879,7 @@
 id: GO:0000257
 name: nitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a nitrile + H2O = a carboxylate + NH3. Acts on a wide range of aromatic nitriles including (indole-3-yl)-acetonitrile and some aliphatic nitriles, and on the corresponding acid amides." [EC:3.5.5.1, GOC:kd]
+def: "Catalysis of the reaction: a nitrile + H2O = a carboxylate + NH4+. Acts on a wide range of aromatic nitriles including (indole-3-yl)-acetonitrile and some aliphatic nitriles, and on the corresponding acid amides." [RHEA:21724]
 synonym: "acetonitrilase activity" RELATED [EC:3.5.5.1]
 synonym: "benzonitrilase activity" RELATED [EC:3.5.5.1]
 synonym: "nitrile aminohydrolase activity" RELATED [EC:3.5.5.1]
@@ -7612,7 +7619,6 @@
 def: "Binding to an RNA polymerase II core enzyme, a multisubunit eukaryotic nuclear RNA polymerase typically composed of twelve subunits." [GOC:txnOH]
 synonym: "RNA polymerase II core binding" EXACT []
 synonym: "RNAP II core binding" EXACT []
-is_a: GO:0001099 ! basal RNA polymerase II transcription machinery binding
 is_a: GO:0043175 ! RNA polymerase core enzyme binding
 created_by: krc
 creation_date: 2010-08-11T03:57:27Z
@@ -7631,7 +7637,7 @@
 name: RNA polymerase III general transcription initiation factor activity
 namespace: molecular_function
 alt_id: GO:0001034
-def: "A general transcription initiation factor activity that contributes to transcription start site selection and transcription initiation of genes transcribed by RNA polymerase III. Factors required for RNA polymerase III transcription initiation include TFIIIA, TFIIIB and TFIIIC. RNA polymerase III transcribes genes encoding short RNAs, including tRNAs, 5S rRNA, U6 snRNA, the short ncRNA component of RNases P, the mitochondrial RNA processing (MRP) RNA, the signal recognition particle SRP RNA, and in higher eukaryotes a number of micro and other small RNAs, though there is some variability across species as to whether a given small noncoding RNA is transcribed by RNA polymerase II or RNA polymerase III." [GOC:txnOH-2018, PMID:12381659, PMID:17977614, PMID:20413673, PMID:27068803, Wikipedia:RNA_polymerase_III]
+def: "A general transcription initiation factor activity that contributes to transcription start site selection and transcription initiation of genes transcribed by RNA polymerase III. Factors required for RNA polymerase III transcription initiation include TFIIIA, TFIIIB and TFIIIC. RNA polymerase III transcribes genes encoding short RNAs, including tRNAs, 5S rRNA, U6 snRNA, the short ncRNA component of RNases P, the mitochondrial RNA processing (MRP) RNA, the signal recognition particle SRP RNA, and in higher eukaryotes a number of micro and other small RNAs, though there is some variability across species as to whether a given small noncoding RNA is transcribed by RNA polymerase II or RNA polymerase III." [GOC:txnOH-2018, PMID:12381659, PMID:17977614, PMID:20413673, PMID:27068803, PMID:40762516, Wikipedia:RNA_polymerase_III]
 synonym: "core RNA polymerase III binding transcription factor activity" NARROW []
 synonym: "RNA polymerase III general initiation factor activity" EXACT []
 synonym: "RNA polymerase III transcription factor activity, sequence-specific DNA binding" NARROW []
@@ -7640,6 +7646,7 @@
 is_a: GO:0140223 ! general transcription initiation factor activity
 relationship: part_of GO:0006383 ! transcription by RNA polymerase III
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15789" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15862" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20253" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22622" xsd:anyURI
 created_by: krc
@@ -7747,14 +7754,17 @@
 
 [Term]
 id: GO:0001010
-name: RNA polymerase II sequence-specific DNA-binding transcription factor recruiting activity
+name: obsolete RNA polymerase II sequence-specific DNA-binding transcription factor recruiting activity
 namespace: molecular_function
-def: "The function of binding to a specific DNA sequence and recruiting another transcription factor to the DNA in order to modulate transcription. The recruited factor may bind DNA directly, or may be colocalized via protein-protein interactions." [GOC:txnOH]
+def: "OBSOLETE. The function of binding to a specific DNA sequence and recruiting another transcription factor to the DNA in order to modulate transcription. The recruited factor may bind DNA directly, or may be colocalized via protein-protein interactions." [GOC:txnOH]
+comment: This term was obsoleted because it was not clearly defined.
 synonym: "sequence-specific DNA binding transcription factor recruiting transcription factor activity" EXACT []
 synonym: "transcription factor activity, sequence-specific DNA binding transcription factor recruiting" EXACT []
 synonym: "transcription factor activity, sequence-specific DNA-binding transcription factor recruiting" RELATED []
-is_a: GO:0030674 ! protein-macromolecule adaptor activity
-relationship: has_part GO:0061629 ! RNA polymerase II-specific DNA-binding transcription factor binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31456" xsd:anyURI
+is_obsolete: true
+consider: GO:0003712
+consider: GO:0140463
 created_by: krc
 creation_date: 2010-08-18T06:46:33Z
 
@@ -8393,7 +8403,7 @@
 namespace: molecular_function
 def: "Binding to a basal RNA polymerase II transcription factor, any of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II and defined as a basal or general transcription factor." [GOC:txnOH, PMID:16858867]
 synonym: "RNA polymerase II basal transcription factor binding" EXACT []
-is_a: GO:0001099 ! basal RNA polymerase II transcription machinery binding
+is_a: GO:0000993 ! RNA polymerase II complex binding
 is_a: GO:0140296 ! general transcription initiation factor binding
 created_by: krc
 creation_date: 2010-10-28T02:30:02Z
@@ -8405,7 +8415,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIA complex, one of the complexes involved in formation of the preinitiation complex (PIC) by RNA polymerase II and defined as a basal or general transcription factor." [GOC:krc, PMID:16858867]
 synonym: "TFIIA-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:37:19Z
 
@@ -8425,7 +8434,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIID complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIID-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:48:33Z
 
@@ -8436,7 +8444,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIE complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIIE-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:49:20Z
 
@@ -8447,7 +8454,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIF complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIIF-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:51:20Z
 
@@ -8458,28 +8464,30 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIH complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIIH-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:51:41Z
 
 [Term]
 id: GO:0001098
-name: basal transcription machinery binding
+name: obsolete basal transcription machinery binding
 namespace: molecular_function
-def: "Binding to a component of the basal transcription machinery which is composed of the RNA polymerase core enzyme and the basal transcription factor(s), the minimal set of factors required for formation of the preinitiation complex (PIC) by the RNA polymerase." [GOC:txnOH]
-comment: Note that the definition of basal, or general, transcription factors has typically been done at a small number of well characterized activator-independent promoters. At an activator-dependent promoter, one or more additional factors are generally required in addition to the basal factors.
-is_a: GO:0005515 ! protein binding
+def: "OBSOLETE. Binding to a component of the basal transcription machinery which is composed of the RNA polymerase core enzyme and the basal transcription factor(s), the minimal set of factors required for formation of the preinitiation complex (PIC) by the RNA polymerase." [GOC:txnOH]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16062" xsd:anyURI
+is_obsolete: true
 created_by: krc
 creation_date: 2010-11-24T12:50:49Z
 
 [Term]
 id: GO:0001099
-name: basal RNA polymerase II transcription machinery binding
+name: obsolete basal RNA polymerase II transcription machinery binding
 namespace: molecular_function
-def: "Binding to a component of the basal transcription machinery for RNA polymerase II which is composed of the RNA polymerase II core enzyme, a multisubunit eukaryotic nuclear RNA polymerase typically composed of twelve subunits, and the basal RNA polymerase II transcription factors, the minimal set of factors required for formation of the preinitiation complex (PIC) by the RNA polymerase." [GOC:txnOH]
-comment: Note that the definition of basal, or general, transcription factors has typically been done at a small number of well characterized activator-independent promoters. At an activator-dependent promoter, one or more additional factors are generally required in addition to the basal factors.
+def: "OBSOLETE. Binding to a component of the basal transcription machinery for RNA polymerase II which is composed of the RNA polymerase II core enzyme, a multisubunit eukaryotic nuclear RNA polymerase typically composed of twelve subunits, and the basal RNA polymerase II transcription factors, the minimal set of factors required for formation of the preinitiation complex (PIC) by the RNA polymerase." [GOC:txnOH]
+comment: This term was obsoleted because it is equivalent to RNA polymerase II complex binding ; GO:0000993.
 synonym: "basal RNAP II transcription machinery binding" EXACT []
-is_a: GO:0001098 ! basal transcription machinery binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16062" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0000993
 created_by: krc
 creation_date: 2010-11-24T12:54:33Z
 
@@ -8516,7 +8524,7 @@
 namespace: molecular_function
 def: "Binding to a component of the basal transcription machinery which is composed of a bacterial-type RNA polymerase core enzyme and a sigma factor, the minimal set of factors required for formation of the preinitiation complex (PIC) by a bacterial-type RNA polymerase." [GOC:txnOH]
 synonym: "basal bacterial-type RNA polymerase transcription machinery binding" EXACT []
-is_a: GO:0001098 ! basal transcription machinery binding
+is_a: GO:0070063 ! RNA polymerase binding
 created_by: krc
 creation_date: 2010-11-30T04:26:04Z
 
@@ -8742,14 +8750,15 @@
 
 [Term]
 id: GO:0001139
-name: RNA polymerase II complex recruiting activity
+name: obsolete RNA polymerase II complex recruiting activity
 namespace: molecular_function
-def: "Binding to an RNA polymerase II (Pol II) complex, typically composed of twelve subunits, and with another protein, macromolecule, or complex, permitting those molecules to function in a coordinated way in order to facilitate the aggregation, arrangement and bonding together of proteins on an RNA polymerase II promoter DNA to form the transcriptional preinitiation complex (PIC), the formation of which is a prerequisite for transcription by RNA polymerase." [GOC:txnOH, PMID:16858867]
+def: "OBSOLETE. Binding to an RNA polymerase II (Pol II) complex, typically composed of twelve subunits, and with another protein, macromolecule, or complex, permitting those molecules to function in a coordinated way in order to facilitate the aggregation, arrangement and bonding together of proteins on an RNA polymerase II promoter DNA to form the transcriptional preinitiation complex (PIC), the formation of which is a prerequisite for transcription by RNA polymerase." [GOC:txnOH, PMID:16858867]
+comment: This term was obsoleted because it is now represented by transcription coactivator activity ; GO:0003713.
 synonym: "core RNA polymerase II recruiting transcription factor activity" EXACT []
 synonym: "transcription factor activity, core RNA polymerase II recruiting" RELATED []
-is_a: GO:0000993 ! RNA polymerase II complex binding
-is_a: GO:0030674 ! protein-macromolecule adaptor activity
-relationship: part_of GO:0051123 ! RNA polymerase II preinitiation complex assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31456" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0003713
 created_by: krc
 creation_date: 2011-01-20T05:55:01Z
 
@@ -11355,6 +11364,7 @@
 synonym: "behavioural fear response" EXACT []
 is_a: GO:0002209 ! behavioral defense response
 is_a: GO:0042596 ! fear response
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 
 [Term]
 id: GO:0001664
@@ -11427,7 +11437,6 @@
 synonym: "ATPase stimulator activity" EXACT []
 xref: Reactome:R-HSA-5251955 "HSP40s activate intrinsic ATPase activity of HSP70s in the nucleoplasm"
 xref: Reactome:R-HSA-5251959 "HSP40s activate intrinsic ATPase activity of HSP70s in the cytosol"
-is_a: GO:0060590 ! ATPase regulator activity
 is_a: GO:0140677 ! molecular function activator activity
 relationship: positively_regulates GO:0140657 ! ATP-dependent activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20955" xsd:anyURI
@@ -30886,7 +30895,6 @@
 synonym: "transcription cofactor activity" EXACT []
 synonym: "transcription coreceptor activity" EXACT []
 synonym: "transcriptional co-regulator" EXACT []
-is_a: GO:0030674 ! protein-macromolecule adaptor activity
 is_a: GO:0140110 ! transcription regulator activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15536" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15665" xsd:anyURI
@@ -30897,6 +30905,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20962" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26489" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28926" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31471" xsd:anyURI
 created_by: krc
 creation_date: 2010-11-24T03:02:15Z
 
@@ -31080,7 +31089,7 @@
 name: double-stranded RNA adenosine deaminase activity
 namespace: molecular_function
 alt_id: GO:0003971
-def: "Catalysis of the reaction: adenosine + H2O = inosine + NH3, in a double-stranded RNA molecule." [GOC:mah, RHEA:10120]
+def: "Catalysis of the reaction: adenosine + H2O = inosine + NH4+, in a double-stranded RNA molecule." [GOC:mah, RHEA:10120]
 synonym: "double-stranded RNA specific editase activity" RELATED []
 xref: EC:3.5.4.37
 xref: Reactome:R-HSA-77614 "Deamination at C6 position of adenosine in Editosome (ADAR1)"
@@ -31875,7 +31884,6 @@
 xref: MetaCyc:2.3.2.13-RXN
 xref: Reactome:R-HSA-140851 "fibrin multimer -> fibrin multimer, crosslinked + NH4+"
 xref: Reactome:R-HSA-6810894 "Envoplakin, periplakin, involucrin, SPR binding mediated by TGM1 crosslinking"
-xref: RESID:AA0124
 xref: RHEA:54816
 is_a: GO:0016755 ! aminoacyltransferase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
@@ -32333,7 +32341,7 @@
 id: GO:0003837
 name: beta-ureidopropionase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-carbamoyl-beta-alanine + H2O = beta-alanine + CO2 + NH3." [EC:3.5.1.6]
+def: "Catalysis of the reaction: N-carbamoyl-beta-alanine + H2O = beta-alanine + CO2 + NH4+." [EC:3.5.1.6]
 synonym: "N-carbamoyl-beta-alanine amidohydrolase activity" RELATED [EC:3.5.1.6]
 xref: EC:3.5.1.6
 xref: MetaCyc:BETA-UREIDOPROPIONASE-RXN
@@ -32984,12 +32992,16 @@
 xref: EC:1.2.4.4
 xref: MetaCyc:1.2.4.4-RXN
 xref: RHEA:13457
+xref: RHEA:84639
+xref: RHEA:84643
 is_a: GO:0016624 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, disulfide as acceptor
 property_value: skos:broadMatch EC:1.2.1.25
 property_value: skos:broadMatch MetaCyc:1.2.1.25-RXN
 property_value: skos:exactMatch EC:1.2.4.4
 property_value: skos:exactMatch MetaCyc:1.2.4.4-RXN
 property_value: skos:narrowMatch RHEA:13457
+property_value: skos:narrowMatch RHEA:84639
+property_value: skos:narrowMatch RHEA:84643
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21144" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29951" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30031" xsd:anyURI
@@ -33277,7 +33289,7 @@
 id: GO:0003876
 name: AMP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: AMP + H2O = IMP + NH3." [EC:3.5.4.6]
+def: "Catalysis of the reaction: AMP + H2O = IMP + NH4+." [RHEA:14777]
 synonym: "5-adenylate deaminase activity" RELATED [EC:3.5.4.6]
 synonym: "5-adenylic acid deaminase activity" RELATED [EC:3.5.4.6]
 synonym: "5-AMP deaminase activity" RELATED [EC:3.5.4.6]
@@ -34063,7 +34075,7 @@
 id: GO:0003921
 name: GMP synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + XMP + NH4(+) = AMP + diphosphate + GMP + 2H+." [RHEA:18301]
+def: "Catalysis of the reaction: ATP + XMP + NH4+ = AMP + diphosphate + GMP + 2H+." [RHEA:18301]
 xref: MetaCyc:GMP-SYN-NH3-RXN
 xref: RHEA:18301
 is_a: GO:0016879 ! ligase activity, forming carbon-nitrogen bonds
@@ -34444,7 +34456,7 @@
 id: GO:0003941
 name: L-serine ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-serine = pyruvate + NH3." [EC:4.3.1.17]
+def: "Catalysis of the reaction: L-serine = pyruvate + NH4+." [RHEA:19169]
 synonym: "L-hydroxyaminoacid dehydratase activity" BROAD []
 synonym: "L-serine ammonia-lyase (pyruvate-forming) activity" RELATED [EC:4.3.1.17]
 synonym: "L-serine deaminase activity" EXACT []
@@ -35130,7 +35142,7 @@
 alt_id: GO:0052852
 alt_id: GO:0052853
 alt_id: GO:0052854
-def: "Catalysis of the reaction: (S)-2-hydroxy-acid + O2 = 2-oxo acid + hydrogen peroxide." [RHEA:16789]
+def: "Catalysis of the reaction: (S)-2-hydroxy-acid + O2 = 2-oxo acid + H2O2." [RHEA:16789]
 synonym: "glycolate oxidase activity" RELATED []
 synonym: "hydroxy-acid oxidase A activity" NARROW [EC:1.1.3.15]
 synonym: "hydroxy-acid oxidase B activity" NARROW [EC:1.1.3.15]
@@ -35529,10 +35541,10 @@
 
 [Term]
 id: GO:0003992
-name: N2-acetyl-L-ornithine:2-oxoglutarate 5-aminotransferase activity
+name: N2-acetyl-L-ornithine:2-oxoglutarate 5-transaminase activity
 namespace: molecular_function
 alt_id: GO:0047318
-def: "Catalysis of the reaction: 2-oxoglutarate + N(2)-acetyl-L-ornithine = N-acetyl-L-glutamate 5-semialdehyde + L-glutamate." [EC:2.6.1.11, RHEA:18049]
+def: "Catalysis of the reaction: N(2)-acetyl-L-ornithine + 2-oxoglutarate = N-acetyl-L-glutamate 5-semialdehyde + L-glutamate." [RHEA:18049]
 synonym: "2-N-acetyl-L-ornithine:2-oxoglutarate 5-aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "acetylornithine 5-aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "acetylornithine aminotransferase activity" BROAD []
@@ -35542,6 +35554,7 @@
 synonym: "N(2)-acetylornithine 5-transaminase activity" RELATED [EC:2.6.1.11]
 synonym: "N-acetylornithine aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "N-acetylornithine-delta-transaminase activity" RELATED [EC:2.6.1.11]
+synonym: "N2-acetyl-L-ornithine:2-oxoglutarate 5-aminotransferase activity" EXACT []
 synonym: "N2-acetyl-L-ornithine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "N2-acetylornithine 5-aminotransferase activity" EXACT []
 synonym: "N2-acetylornithine 5-transaminase activity" RELATED [EC:2.6.1.11]
@@ -35554,6 +35567,7 @@
 property_value: skos:exactMatch EC:2.6.1.11
 property_value: skos:exactMatch RHEA:18049
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0003993
@@ -35702,7 +35716,7 @@
 id: GO:0004000
 name: adenosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: adenosine + H2O = inosine + NH3." [RHEA:24408]
+def: "Catalysis of the reaction: adenosine + H2O = inosine + NH4+." [RHEA:24408]
 synonym: "adenosine aminohydrolase activity" RELATED [EC:3.5.4.4]
 synonym: "adenosine deaminase reaction" EXACT []
 xref: MetaCyc:ADENODEAMIN-RXN
@@ -35811,9 +35825,9 @@
 
 [Term]
 id: GO:0004015
-name: adenosylmethionine-8-amino-7-oxononanoate transaminase activity
+name: S-adenosyl-L-methionine:8-amino-7-oxononanoate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 8-amino-7-oxononanoate + S-adenosyl-L-methionine(1+) = 7,8-diaminononanoate + S-adenosyl-4-methylthio-2-oxobutanoate." [EC:2.6.1.62, RHEA:16861]
+def: "Catalysis of the reaction: (8S)-8-amino-7-oxononanoate + S-adenosyl-L-methionine = S-adenosyl-4-methylsulfanyl-2-oxobutanoate + (7R,8S)-7,8-diammoniononanoate." [RHEA:16861]
 synonym: "7,8-diamino-pelargonic acid aminotransferase activity" RELATED [EC:2.6.1.62]
 synonym: "7,8-diaminonanoate transaminase activity" RELATED [EC:2.6.1.62]
 synonym: "7,8-diaminononanoate aminotransferase activity" RELATED [EC:2.6.1.62]
@@ -35824,6 +35838,7 @@
 synonym: "adenosyl methionine-8-amino-7-oxononanoate transaminase activity" EXACT []
 synonym: "adenosylmethionine--8-amino-7-oxononanoate aminotransferase activity" RELATED [EC:2.6.1.62]
 synonym: "adenosylmethionine-8-amino-7-oxononanoate aminotransferase activity" EXACT []
+synonym: "adenosylmethionine-8-amino-7-oxononanoate transaminase activity" EXACT []
 synonym: "DAPA aminotransferase activity" RELATED [EC:2.6.1.62]
 synonym: "DAPA transaminase activity" RELATED [EC:2.6.1.62]
 synonym: "diaminopelargonate synthase activity" RELATED [EC:2.6.1.62]
@@ -35836,6 +35851,7 @@
 property_value: skos:exactMatch EC:2.6.1.62
 property_value: skos:exactMatch RHEA:16861
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004016
@@ -35959,9 +35975,9 @@
 
 [Term]
 id: GO:0004021
-name: L-alanine:2-oxoglutarate aminotransferase activity
+name: L-alanine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-alanine = L-glutamate + pyruvate." [RHEA:19453]
+def: "Catalysis of the reaction: L-alanine + 2-oxoglutarate = pyruvate + L-glutamate." [RHEA:19453]
 comment: Note that this term has a MetaCyc pathway reference as the pathway only has a single step.
 synonym: "alanine aminotransferase activity" BROAD []
 synonym: "alanine transaminase activity" BROAD [EC:2.6.1.2]
@@ -35977,6 +35993,7 @@
 synonym: "L-alanine aminotransferase activity" BROAD [EC:2.6.1.2]
 synonym: "L-alanine transaminase activity" BROAD [EC:2.6.1.2]
 synonym: "L-alanine-alpha-ketoglutarate aminotransferase activity" RELATED [EC:2.6.1.2]
+synonym: "L-alanine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "pyruvate transaminase activity" BROAD [EC:2.6.1.2]
 synonym: "pyruvate-alanine aminotransferase activity" RELATED [EC:2.6.1.2]
 synonym: "pyruvate-glutamate transaminase activity" RELATED [EC:2.6.1.2]
@@ -35988,13 +36005,14 @@
 xref: Reactome:R-HSA-70523 "PXLP-K314-GPT transaminates L-Ala to form PYR"
 xref: Reactome:R-HSA-70524 "PXLP-K314-GPT transaminates PYR to form L-Ala"
 xref: RHEA:19453
-is_a: GO:0047635 ! alanine-oxo-acid transaminase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.2
 property_value: skos:exactMatch KEGG_REACTION:R00258
 property_value: skos:exactMatch MetaCyc:ALANINE-AMINOTRANSFERASE-RXN
 property_value: skos:exactMatch RHEA:19453
 property_value: skos:relatedMatch MetaCyc:ALANINE-SYN2-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004022
@@ -36183,7 +36201,7 @@
 name: aldehyde oxidase activity
 namespace: molecular_function
 alt_id: GO:0050250
-def: "Catalysis of the reaction: an aldehyde + H2O + O2 = a carboxylic acid + hydrogen peroxide." [EC:1.2.3.1]
+def: "Catalysis of the reaction: an aldehyde + O2 + H2O = a carboxylate + H2O2 + H+." [RHEA:16829]
 synonym: "aldehyde:oxygen oxidoreductase activity" RELATED [EC:1.2.3.1]
 synonym: "quinoline oxidase activity" RELATED [EC:1.2.3.1]
 synonym: "retinal oxidase activity" NARROW []
@@ -36377,7 +36395,7 @@
 
 [Term]
 id: GO:0004042
-name: L-glutamate N-acetyltransferase activity
+name: L-glutamate N-acetyltransferase activity, acting on acetyl-CoA as donor
 namespace: molecular_function
 def: "Catalysis of the reaction: L-glutamate + acetyl-CoA = N-acetyl-L-glutamate + CoA + H+." [RHEA:24292]
 synonym: "acetyl-CoA:L-glutamate N-acetyltransferase activity" EXACT []
@@ -36385,6 +36403,7 @@
 synonym: "AGAS" RELATED [EC:2.3.1.1]
 synonym: "amino acid acetyltransferase activity" RELATED [EC:2.3.1.1]
 synonym: "amino-acid N-acetyltransferase activity" BROAD [EC:2.3.1.1]
+synonym: "L-glutamate N-acetyltransferase activity" BROAD []
 synonym: "N-acetylglutamate synthase activity" BROAD [EC:2.3.1.1]
 xref: KEGG_REACTION:R00259
 xref: MetaCyc:N-ACETYLTRANSFER-RXN
@@ -36393,6 +36412,7 @@
 is_a: GO:0140085 ! L-amino-acid N-acetyltransferase activity
 property_value: skos:broadMatch EC:2.3.1.1
 property_value: skos:exactMatch RHEA:24292
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31438" xsd:anyURI
 
 [Term]
 id: GO:0004043
@@ -37014,9 +37034,9 @@
 
 [Term]
 id: GO:0004069
-name: L-aspartate:2-oxoglutarate aminotransferase activity
+name: L-aspartate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-aspartate + 2-oxoglutarate = oxaloacetate + L-glutamate." [EC:2.6.1.1]
+def: "Catalysis of the reaction: L-aspartate + 2-oxoglutarate = oxaloacetate + L-glutamate." [RHEA:21824]
 comment: Note that this term has a MetaCyc pathway reference as the pathway only has a single step.
 synonym: "2-oxoglutarate-glutamate aminotransferase activity" RELATED [EC:2.6.1.1]
 synonym: "AAT" RELATED [EC:2.6.1.1]
@@ -37043,6 +37063,7 @@
 synonym: "L-aspartate-2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.1]
 synonym: "L-aspartate-2-oxoglutarate-transaminase activity" RELATED [EC:2.6.1.1]
 synonym: "L-aspartate-alpha-ketoglutarate transaminase activity" RELATED [EC:2.6.1.1]
+synonym: "L-aspartate:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "L-aspartic aminotransferase activity" BROAD [EC:2.6.1.1]
 synonym: "oxaloacetate transferase activity" RELATED [EC:2.6.1.1]
 synonym: "oxaloacetate-aspartate aminotransferase activity" RELATED [EC:2.6.1.1]
@@ -37055,13 +37076,14 @@
 xref: Reactome:R-HSA-70596 "GOT2 dimer deaminates L-Asp"
 xref: Reactome:R-HSA-70613 "GOT2 transaminates OA and L-Glu"
 xref: RHEA:21824
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.1
 property_value: skos:exactMatch RHEA:21824
 property_value: skos:relatedMatch MetaCyc:ASPARTATE-DEG1-PWY
 property_value: skos:relatedMatch MetaCyc:ASPARTATESYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004070
@@ -37094,7 +37116,7 @@
 id: GO:0004071
 name: aspartate-ammonia ligase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + L-aspartate + NH3 = AMP + diphosphate + L-asparagine." [EC:6.3.1.1]
+def: "Catalysis of the reaction: ATP + L-aspartate + NH4+ = AMP + diphosphate + L-asparagine." [RHEA:11372]
 synonym: "asparagine synthetase activity" RELATED [EC:6.3.1.1]
 synonym: "L-asparagine synthetase activity" RELATED [EC:6.3.1.1]
 synonym: "L-aspartate:ammonia ligase (AMP-forming)" RELATED [EC:6.3.1.1]
@@ -37341,12 +37363,13 @@
 
 [Term]
 id: GO:0004084
-name: branched-chain-amino-acid transaminase activity
+name: branched-chain-amino-acid:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a branched-chain amino acid (L-leucine, L-isoleucine and L-valine) + 2-oxoglutarate = L-glutamate + a 2-oxocarboxylate derived from the branched-chain amino acid." [EC:2.6.1.42]
 synonym: "branched-chain amino acid aminotransferase activity" EXACT []
 synonym: "branched-chain amino acid-glutamate transaminase activity" RELATED [EC:2.6.1.42]
 synonym: "branched-chain aminotransferase activity" RELATED [EC:2.6.1.42]
+synonym: "branched-chain-amino-acid transaminase activity" EXACT []
 synonym: "branched-chain-amino-acid:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.42]
 synonym: "glutamate-branched-chain amino acid transaminase activity" RELATED [EC:2.6.1.42]
 synonym: "L-branched chain amino acid aminotransferase activity" RELATED [EC:2.6.1.42]
@@ -37356,9 +37379,10 @@
 xref: Reactome:R-HSA-508189 "a-ketoisocaproate, a-keto-b-methylvalerate, or a-ketoisovalerate + glutamate <=> leu, ile, or val + alpha-ketoglutarate [BCAT1]"
 xref: Reactome:R-HSA-70723 "leu, ile, or val + alpha-ketoglutarate <=> a-ketoisocaproate, a-keto-b-methylvalerate, or a-ketoisovalerate + glutamate [BCAT1]"
 xref: Reactome:R-HSA-70724 "leu, ile, or val + alpha-ketoglutarate <=> a-ketoisocaproate, a-keto-b-methylvalerate, or a-ketoisovalerate + glutamate [BCAT2]"
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.42
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004085
@@ -37567,7 +37591,7 @@
 namespace: molecular_function
 alt_id: GO:0016952
 alt_id: GO:0016953
-def: "Catalysis of the reaction: 2 hydrogen peroxide = O2 + 2 H2O." [EC:1.11.1.6]
+def: "Catalysis of the reaction: 2 H2O2 = O2 + 2 H2O." [EC:1.11.1.6]
 synonym: "bacterial catalase-peroxidase activity" NARROW []
 synonym: "caperase activity" RELATED [EC:1.11.1.6]
 synonym: "CAT" RELATED [EC:1.11.1.6]
@@ -38222,7 +38246,7 @@
 id: GO:0004130
 name: cytochrome-c peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 ferrocytochrome c + hydrogen peroxide = 2 ferricytochrome c + 2 H2O." [EC:1.11.1.5]
+def: "Catalysis of the reaction: 2 ferrocytochrome c + H2O2 = 2 ferricytochrome c + 2 H2O." [EC:1.11.1.5]
 synonym: "apocytochrome c peroxidase activity" RELATED [EC:1.11.1.5]
 synonym: "cytochrome c peroxidase activity" RELATED [EC:1.11.1.5]
 synonym: "cytochrome c-551 peroxidase activity" RELATED [EC:1.11.1.5]
@@ -38244,7 +38268,7 @@
 id: GO:0004131
 name: cytosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cytosine + H2O = uracil + NH3." [EC:3.5.4.1]
+def: "Catalysis of the reaction: cytosine + H2O = uracil + NH4+." [RHEA:20605]
 synonym: "cytosine aminohydrolase activity" RELATED [EC:3.5.4.1]
 synonym: "isocytosine deaminase activity" RELATED [EC:3.5.4.1]
 xref: EC:3.5.4.1
@@ -38260,7 +38284,7 @@
 id: GO:0004132
 name: dCMP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dCMP + H2O = dUMP + NH3." [EC:3.5.4.12]
+def: "Catalysis of the reaction: dCMP + H2O = dUMP + NH4+." [RHEA:22924]
 synonym: "dCMP aminohydrolase activity" RELATED [EC:3.5.4.12]
 synonym: "deoxy-CMP-deaminase activity" RELATED [EC:3.5.4.12]
 synonym: "deoxycytidine monophosphate deaminase activity" RELATED [EC:3.5.4.12]
@@ -38718,7 +38742,7 @@
 id: GO:0004153
 name: dihydropterin deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 7,8-dihydropterin + H2O = 7,8-dihydrolumazine + NH3." [GOC:jl, PMID:19567870, PMID:38786926]
+def: "Catalysis of the reaction: 7,8-dihydropterin + H2O = 7,8-dihydrolumazine + NH4+." [GOC:jl, PMID:19567870, PMID:38786926]
 xref: MetaCyc:RXN-15261
 is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
 is_a: GO:0019239 ! deaminase activity
@@ -42676,7 +42700,7 @@
 id: GO:0004355
 name: glutamate synthase (NADPH) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 L-glutamate + NADP+ = 2-oxoglutarate + L-glutamine + H+ + NADPH. This is a two-step reaction: (a) L-glutamate + NH3 = L-glutamine + H2O, (b) L-glutamate + NADP+ + H2O = NH3 + 2-oxoglutarate + NADPH + H+." [EC:1.4.1.13, RHEA:15501]
+def: "Catalysis of the reaction: 2 L-glutamate + NADP+ = 2-oxoglutarate + L-glutamine + H+ + NADPH. This is a two-step reaction: (a) L-glutamate + NH4+ = L-glutamine + H2O, (b) L-glutamate + NADP+ + H2O = NH4+ + 2-oxoglutarate + NADPH + H+." [RHEA:15501]
 comment: Note that this term has a MetaCyc pathway reference as the pathway only has a single step.
 synonym: "glutamate (reduced nicotinamide adenine dinucleotide phosphate) synthase activity" RELATED [EC:1.4.1.13]
 synonym: "glutamate synthetase (NADP) activity" RELATED [EC:1.4.1.13]
@@ -42745,24 +42769,24 @@
 name: L-glutamate N-acetyltransferase activity, acting on acetyl-L-ornithine as donor
 namespace: molecular_function
 def: "Catalysis of the reaction: N2-acetyl-L-ornithine + L-glutamate = N-acetyl-L-glutamate + L-ornithine." [RHEA:15349]
-synonym: "2-N-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" RELATED [EC:2.3.1.35]
+synonym: "2-N-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" EXACT [EC:2.3.1.35]
 synonym: "acetyl-L-glutamate:acetyl-L-ornithine transacetylase activity" EXACT []
-synonym: "acetylglutamate synthetase activity" RELATED [EC:2.3.1.35]
-synonym: "acetylglutamate-acetylornithine transacetylase activity" RELATED [EC:2.3.1.35]
-synonym: "acetylglutamic synthetase activity" RELATED [EC:2.3.1.35]
-synonym: "acetylglutamic-acetylornithine transacetylase activity" RELATED [EC:2.3.1.35]
+synonym: "acetylglutamate synthetase activity" BROAD [EC:2.3.1.35]
+synonym: "acetylglutamate-acetylornithine transacetylase activity" EXACT [EC:2.3.1.35]
+synonym: "acetylglutamic synthetase activity" BROAD [EC:2.3.1.35]
+synonym: "acetylglutamic-acetylornithine transacetylase activity" EXACT [EC:2.3.1.35]
 synonym: "acetylornithinase activity" BROAD [EC:2.3.1.35]
-synonym: "acetylornithine glutamate acetyltransferase activity" RELATED [EC:2.3.1.35]
-synonym: "alpha-N-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" RELATED [EC:2.3.1.35]
-synonym: "glutamate acetyltransferase activity" RELATED [EC:2.3.1.35]
+synonym: "acetylornithine glutamate acetyltransferase activity" EXACT [EC:2.3.1.35]
+synonym: "alpha-N-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" EXACT [EC:2.3.1.35]
+synonym: "glutamate acetyltransferase activity" BROAD [EC:2.3.1.35]
 synonym: "glutamate N-acetyltransferase activity" BROAD []
 synonym: "L-glutamate N-acetyltransferase activity" BROAD []
 synonym: "N-acetyl-L-glutamate synthetase activity" BROAD [EC:2.3.1.35]
 synonym: "N-acetylglutamate synthase activity" BROAD [EC:2.3.1.35]
 synonym: "N-acetylglutamate synthetase activity" BROAD [EC:2.3.1.35]
-synonym: "N2-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" RELATED [EC:2.3.1.35]
-synonym: "ornithine acetyltransferase activity" RELATED [EC:2.3.1.35]
-synonym: "ornithine transacetylase activity" RELATED [EC:2.3.1.35]
+synonym: "N2-acetyl-L-ornithine:L-glutamate N-acetyltransferase activity" EXACT [EC:2.3.1.35]
+synonym: "ornithine acetyltransferase activity" BROAD [EC:2.3.1.35]
+synonym: "ornithine transacetylase activity" BROAD [EC:2.3.1.35]
 xref: EC:2.3.1.35
 xref: KEGG_REACTION:R02282
 xref: MetaCyc:GLUTAMATE-N-ACETYLTRANSFERASE-RXN
@@ -42795,9 +42819,9 @@
 
 [Term]
 id: GO:0004360
-name: glutamine-fructose-6-phosphate transaminase (isomerizing) activity
+name: L-glutamine:D-fructose-6-phosphate transaminase (isomerizing) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: beta-D-fructose 6-phosphate + L-glutamine = D-glucosamine 6-phosphate + L-glutamate." [EC:2.6.1.16, RHEA:13237]
+def: "Catalysis of the reaction: D-fructose 6-phosphate + L-glutamine = D-glucosamine 6-phosphate + L-glutamate." [RHEA:13237]
 synonym: "D-fructose-6-phosphate amidotransferase activity" RELATED [EC:2.6.1.16]
 synonym: "GlcN6P synthase activity" RELATED [EC:2.6.1.16]
 synonym: "glucosamine 6-phosphate synthase activity" RELATED [EC:2.6.1.16]
@@ -42805,6 +42829,7 @@
 synonym: "glucosamine-6-phosphate isomerase (glutamine-forming) activity" EXACT []
 synonym: "glucosamine-6-phosphate synthase activity" RELATED [EC:2.6.1.16]
 synonym: "glucosaminephosphate isomerase" BROAD [EC:2.6.1.16]
+synonym: "glutamine-fructose-6-phosphate transaminase (isomerizing) activity" EXACT []
 synonym: "hexosephosphate aminotransferase activity" RELATED [EC:2.6.1.16]
 synonym: "L-glutamine-D-fructose-6-phosphate amidotransferase activity" RELATED [EC:2.6.1.16]
 synonym: "L-glutamine:D-fructose-6-phosphate isomerase (deaminating)" RELATED [EC:2.6.1.16]
@@ -42814,10 +42839,11 @@
 xref: Reactome:R-HSA-4085027 "Defective GFPT1 does not transfer an amino group from L-Gln to F6P to form GlcN6P"
 xref: Reactome:R-HSA-449715 "GFPT1,2 transfer an amino group from L-Gln to F6P to form GlcN6P"
 xref: RHEA:13237
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.16
 property_value: skos:exactMatch RHEA:13237
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004361
@@ -43470,7 +43496,7 @@
 id: GO:0004397
 name: histidine ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-histidine = urocanate + NH3." [EC:4.3.1.3]
+def: "Catalysis of the reaction: L-histidine = trans-urocanate + NH4+." [RHEA:21232]
 synonym: "histidase activity" RELATED [GOC:hjd]
 synonym: "histidinase activity" RELATED [GOC:hjd]
 synonym: "histidine alpha-deaminase activity" RELATED [GOC:hjd]
@@ -43518,13 +43544,14 @@
 
 [Term]
 id: GO:0004400
-name: histidinol-phosphate transaminase activity
+name: L-histidinol-phosphate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-histidinol-phosphate + 2-oxoglutarate = 3-(imidazol-4-yl)-2-oxopropyl phosphate + L-glutamate." [EC:2.6.1.9]
+def: "Catalysis of the reaction: L-histidinol-phosphate + 2-oxoglutarate = 3-(imidazol-4-yl)-2-oxopropyl phosphate + L-glutamate." [RHEA:23744]
 synonym: "glutamic-imidazoleacetol phosphate transaminase activity" RELATED [EC:2.6.1.9]
 synonym: "histidine:imidazoleacetol phosphate transaminase activity" RELATED [EC:2.6.1.9]
 synonym: "histidinol phosphate aminotransferase activity" RELATED [EC:2.6.1.9]
 synonym: "histidinol-phosphate aminotransferase activity" EXACT []
+synonym: "histidinol-phosphate transaminase activity" EXACT []
 synonym: "IAP transaminase activity" RELATED [EC:2.6.1.9]
 synonym: "imidazole acetol-phosphate transaminase activity" RELATED [EC:2.6.1.9]
 synonym: "imidazoleacetol phosphate transaminase activity" RELATED [EC:2.6.1.9]
@@ -43535,10 +43562,11 @@
 xref: EC:2.6.1.9
 xref: MetaCyc:HISTAMINOTRANS-RXN
 xref: RHEA:23744
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.9
 property_value: skos:exactMatch RHEA:23744
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004401
@@ -44317,7 +44345,7 @@
 id: GO:0004447
 name: iodide peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: iodide + H2O2 = iodine + 2 H2O." [RHEA:23336]
+def: "Catalysis of the reactions: (1) 2 iodide + H2O2 + 2 H+ = diiodine + 2 H2O; (2) [thyroglobulin]-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3-iodo-L-tyrosine + 2 H2O; (3) [thyroglobulin]-3-iodo-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3,5-diiodo-L-tyrosine + 2 H2O; (4) 2 [thyroglobulin]-3,5-diiodo-L-tyrosine + H2O2 = [thyroglobulin]-L-thyroxine + [thyroglobulin]-dehydroalanine + 2 H2O; (5) [thyroglobulin]-3-iodo-L-tyrosine + [thyroglobulin]-3,5-diiodo-L-tyrosine + H2O2 = [thyroglobulin]-3,3',5-triiodo-L-thyronine + [thyroglobulin]-dehydroalanine + 2 H2O." [EC:1.11.1.8, PMID:8651700]
 synonym: "iodinase activity" RELATED [EC:1.11.1.8]
 synonym: "thyroid peroxidase activity" RELATED [EC:1.11.1.8]
 synonym: "thyroperoxidase activity" RELATED [EC:1.11.1.8]
@@ -44325,12 +44353,21 @@
 xref: EC:1.11.1.8
 xref: MetaCyc:IODIDE-PEROXIDASE-RXN
 xref: RHEA:23336
+xref: RHEA:48956
+xref: RHEA:48960
+xref: RHEA:48964
+xref: RHEA:48968
 is_a: GO:0140905 ! haloperoxidase activity
 property_value: skos:exactMatch EC:1.11.1.8
-property_value: skos:exactMatch RHEA:23336
+property_value: skos:narrowMatch RHEA:23336
+property_value: skos:narrowMatch RHEA:48956
+property_value: skos:narrowMatch RHEA:48960
+property_value: skos:narrowMatch RHEA:48964
+property_value: skos:narrowMatch RHEA:48968
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21027" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23587" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30597" xsd:anyURI
 
 [Term]
 id: GO:0004448
@@ -44798,7 +44835,7 @@
 
 [Term]
 id: GO:0004468
-name: L-lysine N-acetyltransferase activity, acting on acetyl phosphate as donor
+name: L-lysine N6-acetyltransferase activity, acting on acetyl phosphate as donor
 namespace: molecular_function
 def: "Catalysis of the reaction: acetyl phosphate + L-lysine = phosphate + N6-acetyl-L-lysine." [RHEA:14417]
 synonym: "acetyl-phosphate:L-lysine 6-N-acetyltransferase activity" RELATED [EC:2.3.1.32]
@@ -47048,9 +47085,9 @@
 
 [Term]
 id: GO:0004587
-name: ornithine aminotransferase activity
+name: L-ornithine transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a 2-oxocarboxylate + L-ornithine = an L-alpha-amino acid + L-glutamate 5-semialdehyde." [EC:2.6.1.13]
+def: "Catalysis of the reaction: a 2-oxocarboxylate + L-ornithine = L-glutamate 5-semialdehyde + an L-alpha-amino acid." [RHEA:13877]
 synonym: "GabT" RELATED [EC:2.6.1.13]
 synonym: "L-ornithine 5-aminotransferase activity" RELATED [EC:2.6.1.13]
 synonym: "L-ornithine aminotransferase activity" RELATED [EC:2.6.1.13]
@@ -47058,6 +47095,7 @@
 synonym: "L-ornithine:alpha-ketoglutarate delta-aminotransferase activity" RELATED [EC:2.6.1.13]
 synonym: "OAT" RELATED [EC:2.6.1.13]
 synonym: "ornithine 5-aminotransferase activity" RELATED [EC:2.6.1.13]
+synonym: "ornithine aminotransferase activity" EXACT []
 synonym: "ornithine delta-transaminase activity" RELATED [EC:2.6.1.13]
 synonym: "ornithine ketoacid aminotransferase activity" RELATED [EC:2.6.1.13]
 synonym: "ornithine transaminase activity" RELATED [EC:2.6.1.13]
@@ -47083,6 +47121,7 @@
 property_value: skos:exactMatch RHEA:13877
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25975" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004588
@@ -47398,7 +47437,7 @@
 name: glutathione peroxidase activity
 namespace: molecular_function
 alt_id: GO:0016224
-def: "Catalysis of the reaction: 2 glutathione + hydrogen peroxide = oxidized glutathione + 2 H2O." [EC:1.11.1.9, PMID:36771108]
+def: "Catalysis of the reaction: 2 glutathione + H2O2 = oxidized glutathione + 2 H2O." [EC:1.11.1.9, PMID:36771108]
 synonym: "glutathione:hydrogen-peroxide oxidoreductase activity" RELATED [EC:1.11.1.9]
 synonym: "GSH peroxidase activity" RELATED [EC:1.11.1.9]
 synonym: "non-selenium glutathione peroxidase activity" NARROW []
@@ -47815,14 +47854,16 @@
 id: GO:0004621
 name: GPI anchor phospholipase D activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glycoprotein phosphatidylinositol + H2O = phosphatidate + glycoprotein inositol, by cleavage of the second phosphodiester bond between the phosphate and phospholipid." [PMID:2760042]
+def: "Catalysis of the reaction: glycoprotein phosphatidylinositol + H2O = phosphatidate + glycoprotein inositol, by cleavage of the second phosphodiester bond between the phosphate and phospholipid." [PMID:2760042, RHEA:86263]
 synonym: "glycoprotein phospholipase D activity" BROAD []
 synonym: "glycoprotein-phosphatidylinositol phosphatidohydrolase activity" EXACT []
 synonym: "glycosylphosphatidyl inositol-anchor protein phospholipase D activity" EXACT []
 synonym: "GPI-PLD activity" EXACT []
 xref: Reactome:R-HSA-8940388 "GPLD1 hydrolyses GPI-anchors from proteins"
+xref: RHEA:86263
 is_a: GO:0004630 ! D-type glycerophospholipase activity
 property_value: skos:broadMatch EC:3.1.4.50
+property_value: skos:exactMatch RHEA:86263
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28868" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31078" xsd:anyURI
 
@@ -48364,15 +48405,16 @@
 
 [Term]
 id: GO:0004648
-name: O-phospho-L-serine:2-oxoglutarate aminotransferase activity
+name: O-phospho-L-serine:2-oxoglutarate transaminase activity
 namespace: molecular_function
 alt_id: GO:0004646
-def: "Catalysis of the reaction: O-phospho-L-serine + 2-oxoglutarate = 3-phosphonooxypyruvate + L-glutamate." [EC:2.6.1.52]
+def: "Catalysis of the reaction: O-phospho-L-serine + 2-oxoglutarate = 3-phosphonooxypyruvate + L-glutamate." [RHEA:14329]
 synonym: "3-O-phospho-L-serine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.52]
 synonym: "3-phosphoserine aminotransferase activity" RELATED [EC:2.6.1.52]
 synonym: "3PHP transaminase activity" RELATED [EC:2.6.1.52]
 synonym: "hydroxypyruvic phosphate--glutamic transaminase activity" RELATED [EC:2.6.1.52]
 synonym: "L-phosphoserine aminotransferase activity" RELATED [EC:2.6.1.52]
+synonym: "O-phospho-L-serine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "PdxC" RELATED [EC:2.6.1.52]
 synonym: "phosphohydroxypyruvate transaminase activity" RELATED [EC:2.6.1.52]
 synonym: "phosphohydroxypyruvic--glutamic transaminase activity" RELATED [EC:2.6.1.52]
@@ -48388,6 +48430,7 @@
 property_value: skos:exactMatch EC:2.6.1.52
 property_value: skos:exactMatch RHEA:14329
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004649
@@ -50678,7 +50721,7 @@
 name: protein-lysine 6-oxidase activity
 namespace: molecular_function
 alt_id: GO:0018056
-def: "Catalysis of the reaction: peptidyl-L-lysyl-peptide + H2O + O2 = peptidyl-allysyl-peptide + NH3 + hydrogen peroxide." [EC:1.4.3.13]
+def: "Catalysis of the reaction: L-lysyl-[protein] + O2 + H2O = (S)-2-amino-6-oxohexanoyl-[protein] + H2O2 + NH4+." [RHEA:24544]
 synonym: "lysyl oxidase activity" RELATED [EC:1.4.3.13]
 synonym: "protein-L-lysine:oxygen 6-oxidoreductase (deaminating)" RELATED [EC:1.4.3.13]
 xref: EC:1.4.3.13
@@ -51021,7 +51064,7 @@
 id: GO:0004733
 name: pyridoxamine phosphate oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pyridoxamine 5'-phosphate + H2O + O2 = pyridoxal 5'-phosphate + NH4+ + hydrogen peroxide. This activity can also oxidize pyridoxine 5'-phosphate to pyridoxal 5'-phosphate + hydrogen peroxide." [PMID:11786019]
+def: "Catalysis of the reaction: pyridoxamine 5'-phosphate + H2O + O2 = pyridoxal 5'-phosphate + NH4+ + H2O2. This activity can also oxidize pyridoxine 5'-phosphate to pyridoxal 5'-phosphate + H2O2." [EC:1.4.3.5, PMID:11786019]
 synonym: "PMP oxidase activity" RELATED [EC:1.4.3.5]
 synonym: "pyridoxal 5'-phosphate synthase activity" RELATED [EC:1.4.3.5]
 synonym: "pyridoxamine 5'-phosphate oxidase activity" RELATED [EC:1.4.3.5]
@@ -51034,11 +51077,13 @@
 xref: MetaCyc:PMPOXI-RXN
 xref: Reactome:R-HSA-965019 "2xPNPO:2xFMN oxidizes PDXP to PXLP"
 xref: Reactome:R-HSA-965079 "2xPNPO:2xFMN oxidizes PXAP to PXLP"
+xref: RHEA:15149
 xref: RHEA:15817
 is_a: GO:0016641 ! oxidoreductase activity, acting on the CH-NH2 group of donors, oxygen as acceptor
 relationship: part_of GO:0042823 ! pyridoxal phosphate biosynthetic process
 property_value: skos:exactMatch EC:1.4.3.5
-property_value: skos:exactMatch RHEA:15817
+property_value: skos:narrowMatch RHEA:15149
+property_value: skos:narrowMatch RHEA:15817
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22748" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -51549,13 +51594,14 @@
 
 [Term]
 id: GO:0004760
-name: L-serine-pyruvate transaminase activity
+name: L-serine:pyruvate transaminase activity
 namespace: molecular_function
 alt_id: GO:0004761
 alt_id: GO:0004762
 alt_id: GO:0004763
-def: "Catalysis of the reaction: L-serine + pyruvate = 3-hydroxypyruvate + L-alanine." [EC:2.6.1.51, RHEA:22852]
+def: "Catalysis of the reaction: L-serine + pyruvate = 3-hydroxypyruvate + L-alanine." [RHEA:22852]
 synonym: "hydroxypyruvate:L-alanine transaminase activity" RELATED [EC:2.6.1.51]
+synonym: "L-serine-pyruvate transaminase activity" EXACT []
 synonym: "L-serine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.51]
 synonym: "serine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.51]
 synonym: "serine-pyruvate aminotransferase activity" EXACT []
@@ -51567,10 +51613,11 @@
 xref: KEGG_REACTION:R00585
 xref: MetaCyc:SERINE--PYRUVATE-AMINOTRANSFERASE-RXN
 xref: RHEA:22852
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.51
 property_value: skos:exactMatch RHEA:22852
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004764
@@ -51982,7 +52029,7 @@
 alt_id: GO:0008382
 alt_id: GO:0008383
 alt_id: GO:0016954
-def: "Catalysis of the reaction: 2 superoxide + 2 H+ = O2 + hydrogen peroxide." [EC:1.15.1.1, GOC:vw, PMID:15064408]
+def: "Catalysis of the reaction: 2 superoxide + 2 H+ = O2 + H2O2." [EC:1.15.1.1, GOC:vw, PMID:15064408]
 synonym: "copper, zinc superoxide dismutase activity" NARROW []
 synonym: "Cu,Zn-SOD" RELATED [EC:1.15.1.1]
 synonym: "Cu-Zn superoxide dismutase activity" NARROW [EC:1.15.1.1]
@@ -53155,14 +53202,15 @@
 
 [Term]
 id: GO:0004838
-name: L-tyrosine-2-oxoglutarate transaminase activity
+name: L-tyrosine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-tyrosine + 2-oxoglutarate = 4-hydroxyphenylpyruvate + L-glutamate." [RHEA:15093]
+def: "Catalysis of the reaction: L-tyrosine + 2-oxoglutarate = 3-(4-hydroxyphenyl)pyruvate + L-glutamate." [RHEA:15093]
 synonym: "glutamic phenylpyruvic aminotransferase activity" RELATED [EC:2.6.1.5]
 synonym: "glutamic-hydroxyphenylpyruvic transaminase activity" RELATED [EC:2.6.1.5]
 synonym: "L-phenylalanine 2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.5]
 synonym: "L-tyrosine aminotransferase activity" BROAD [EC:2.6.1.5]
 synonym: "L-tyrosine transaminase activity" BROAD []
+synonym: "L-tyrosine-2-oxoglutarate transaminase activity" EXACT []
 synonym: "L-tyrosine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "phenylalanine aminotransferase activity" RELATED [EC:2.6.1.5]
 synonym: "phenylalanine transaminase activity" RELATED [EC:2.6.1.5]
@@ -53180,10 +53228,11 @@
 xref: Reactome:R-HSA-71155 "TAT deaminates tyrosine"
 xref: RHEA:15093
 xref: UM-BBD_reactionID:r0297
-is_a: GO:0008793 ! aromatic-amino-acid transaminase activity
+is_a: GO:0008793 ! aromatic-amino-acid:2-oxoglutarate transaminase activity
 property_value: skos:broadMatch EC:2.6.1.5
 property_value: skos:exactMatch RHEA:15093
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004839
@@ -53485,7 +53534,7 @@
 id: GO:0004846
 name: urate oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: urate + O2 + H2O = 5-hydroxyisourate + hydrogen peroxide." [EC:1.7.3.3]
+def: "Catalysis of the reaction: urate + O2 + H2O = 5-hydroxyisourate + H2O2." [EC:1.7.3.3]
 synonym: "urate:oxygen oxidoreductase activity" RELATED [EC:1.7.3.3]
 synonym: "uric acid oxidase activity" RELATED [EC:1.7.3.3]
 synonym: "uricase activity" RELATED [EC:1.7.3.3]
@@ -53581,7 +53630,7 @@
 id: GO:0004851
 name: uroporphyrin-III C-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 S-adenosyl-L-methionine + uroporphyrin III = 2 S-adenosyl-L-homocysteine + precorrin-2." [EC:2.1.1.107]
+def: "Catalysis of the reaction: uroporphyrinogen III + 2 S-adenosyl-L-methionine = precorrin-2 + 2 S-adenosyl-L-homocysteine + H+." [RHEA:32459]
 synonym: "adenosylmethionine-uroporphyrinogen III methyltransferase activity" RELATED [EC:2.1.1.107]
 synonym: "CobA" RELATED [EC:2.1.1.107]
 synonym: "CysG" RELATED [EC:2.1.1.107]
@@ -53671,7 +53720,7 @@
 id: GO:0004855
 name: xanthine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: xanthine + H2O + O2 = urate + hydrogen peroxide." [EC:1.17.3.2]
+def: "Catalysis of the reaction: xanthine + H2O + O2 = urate + H2O2." [EC:1.17.3.2]
 synonym: "hypoxanthine-xanthine oxidase activity" BROAD [EC:1.17.3.2]
 synonym: "schardinger enzyme" RELATED [EC:1.17.3.2]
 synonym: "Schardinger enzyme activity" RELATED [EC:1.17.3.2]
@@ -55742,11 +55791,12 @@
 
 [Term]
 id: GO:0005078
-name: MAP-kinase scaffold activity
+name: MAP kinase scaffold activity
 namespace: molecular_function
 def: "The binding activity of a molecule that functions as a physical support for the assembly of a multiprotein mitogen-activated protein kinase (MAPK) complex. Binds multiple kinases of the MAPKKK cascade, and also upstream signaling proteins, permitting those molecules to function in a coordinated way. Bringing together multiple enzymes and their substrates enables the signal to be transduced quickly and efficiently." [PMID:12511654, PMID:15213240, PMID:9405336]
 synonym: "MAP-kinase scaffold protein activity" EXACT []
 is_a: GO:0035591 ! signaling adaptor activity
+is_a: GO:0140378 ! protein complex scaffold activity
 relationship: has_part GO:0051019 ! mitogen-activated protein kinase binding
 relationship: part_of GO:0000165 ! MAPK cascade
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14286" xsd:anyURI
@@ -58096,10 +58146,11 @@
 
 [Term]
 id: GO:0005319
-name: lipid transporter activity
+name: lipid carrier activity
 namespace: molecular_function
-def: "Enables the directed movement of lipids into, out of or within a cell, or between cells." [GOC:ai]
-synonym: "apolipoprotein" RELATED []
+def: "Directly binding to a specific lipid and delivering it either to an acceptor molecule or to a specific location." [GOC:curators]
+synonym: "apolipoprotein" NARROW []
+synonym: "lipid transporter activity" BROAD []
 synonym: "lipophorin" NARROW []
 xref: Reactome:R-HSA-1369028 "ABCAs mediate lipid efflux"
 xref: Reactome:R-HSA-1369052 "ABCAs mediate lipid influx"
@@ -58112,8 +58163,8 @@
 xref: Reactome:R-HSA-6801250 "TRIAP1:PRELID1, PRELID3A transports PA from the outer to the inner mitochondrial membrane"
 xref: Reactome:R-HSA-8848053 "ABCA5 transports CHOL from lysosomal lumen to cytosol"
 xref: Reactome:R-HSA-8866329 "MTTP lipidates APOB-100, forming a pre-VLDL"
-is_a: GO:0005215 ! transporter activity
-relationship: part_of GO:0006869 ! lipid transport
+is_a: GO:0140104 ! molecular carrier activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0005320
@@ -59711,10 +59762,11 @@
 
 [Term]
 id: GO:0005548
-name: phospholipid transporter activity
+name: obsolete phospholipid transporter activity
 namespace: molecular_function
 alt_id: GO:0008497
-def: "Enables the directed movement of phospholipids into, out of or within a cell, or between cells. Phospholipids are a class of lipids containing phosphoric acid as a mono- or diester." [GOC:ai, ISBN:0198506732]
+def: "OBSOLETE. Enables the directed movement of phospholipids into, out of or within a cell, or between cells. Phospholipids are a class of lipids containing phosphoric acid as a mono- or diester." [GOC:ai, ISBN:0198506732]
+comment: This term was obsoleted because it refers to the substrate rather than to the transport mechanism as a primary classification.
 xref: Reactome:R-HSA-216757 "4xPALM-C-p-2S-ABCA1 tetramer transports PL from transport vesicle membrane to plasma membrane"
 xref: Reactome:R-HSA-382553 "ABCA7:Apo1A-mediated phospholipid efflux"
 xref: Reactome:R-HSA-5678706 "ABCB4 transports PC from plasma membrane to extracellular region"
@@ -59722,8 +59774,11 @@
 xref: Reactome:R-HSA-8857662 "ESYT1:ESYT2:ESYT3 transport GPL from plasma membrane to ER membrane"
 xref: Reactome:R-HSA-8865637 "MFSD2A transports LPC from extracellular region to plasma membrane"
 xref: Reactome:R-HSA-8867876 "OSBPL5,8,10 exchange PS with PI4P from ER membrane to plasma membrane"
-is_a: GO:0005319 ! lipid transporter activity
-relationship: part_of GO:0015914 ! phospholipid transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31460" xsd:anyURI
+is_obsolete: true
+consider: GO:0120014
+consider: GO:0170055
 
 [Term]
 id: GO:0005549
@@ -64967,10 +65022,12 @@
 name: alcohol metabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways involving alcohols, any of a class of compounds containing one or more hydroxyl groups attached to a saturated carbon atom." [ISBN:0198506732]
+subset: gocheck_do_not_annotate
 subset: goslim_drosophila
 subset: goslim_pir
 synonym: "alcohol metabolism" EXACT []
 is_a: GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 
 [Term]
 id: GO:0006067
@@ -65817,6 +65874,7 @@
 namespace: biological_process
 alt_id: GO:0055134
 def: "Any cellular metabolic process involving nucleobases, nucleosides, nucleotides and nucleic acids." [GOC:ai]
+subset: gocheck_do_not_annotate
 subset: goslim_pir
 subset: goslim_plant
 synonym: "cellular nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" EXACT []
@@ -65825,6 +65883,7 @@
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" RELATED [GOC:dph, GOC:tb]
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid metabolism" EXACT []
 is_a: GO:0044238 ! primary metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 
 [Term]
 id: GO:0006140
@@ -69152,7 +69211,6 @@
 namespace: biological_process
 def: "The process of introducing a phosphate group on to a protein." [GOC:hb]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid phosphorylation" EXACT [GOC:bf]
 is_a: GO:0016310 ! phosphorylation
 is_a: GO:0036211 ! protein modification process
@@ -69180,7 +69238,6 @@
 namespace: biological_process
 def: "The process of removing one or more phosphoric residues from a protein." [GOC:hb]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid dephosphorylation" EXACT [GOC:bf]
 is_a: GO:0016311 ! dephosphorylation
 is_a: GO:0036211 ! protein modification process
@@ -69455,7 +69512,6 @@
 comment: For non-covalent interactions with a lipid, consider instead the term 'lipid binding ; GO:0008289' and its children.
 subset: gocheck_obsoletion_candidate
 subset: goslim_drosophila
-subset: goslim_yeast
 synonym: "lipid:protein modification" EXACT []
 synonym: "protein amino acid lipidation" EXACT [GOC:bf]
 xref: RESID:AA0059
@@ -69814,20 +69870,23 @@
 synonym: "arginine synthesis" EXACT []
 xref: MetaCyc:ARGSYN-PWY
 xref: MetaCyc:ARGSYNBSUB-PWY
+xref: MetaCyc:PWY-5154
 xref: MetaCyc:PWY-7400
 is_a: GO:0006525 ! arginine metabolic process
 is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ARGSYN-PWY
 property_value: skos:narrowMatch MetaCyc:ARGSYNBSUB-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-5154
 property_value: skos:narrowMatch MetaCyc:PWY-7400
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28686" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0006527
 name: L-arginine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-arginine, 2-amino-5-(carbamimidamido)pentanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-arginine." [GOC:curators]
 synonym: "arginine breakdown" EXACT []
 synonym: "arginine catabolism" EXACT []
 synonym: "arginine degradation" EXACT []
@@ -69863,6 +69922,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8187
 property_value: skos:narrowMatch MetaCyc:PWY0-823
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006528
@@ -69870,7 +69930,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving asparagine, 2-amino-3-carbamoylpropanoic acid." [GOC:go_curators]
 synonym: "asparagine metabolism" EXACT []
-xref: MetaCyc:ASPARAGINESYN-PWY
 is_a: GO:0019752 ! carboxylic acid metabolic process
 
 [Term]
@@ -69891,7 +69950,7 @@
 id: GO:0006530
 name: L-asparagine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-asparagine, 2-amino-3-carbamoylpropanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-asparagine." [GOC:curators]
 synonym: "asparagine breakdown" EXACT []
 synonym: "asparagine catabolism" EXACT []
 synonym: "asparagine degradation" EXACT []
@@ -69903,6 +69962,7 @@
 property_value: skos:narrowMatch MetaCyc:ASPARAGINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-4002
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006531
@@ -69932,7 +69992,7 @@
 id: GO:0006533
 name: L-aspartate catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-aspartate, the anion derived from aspartic acid, 2-aminobutanedioic acid." [GOC:go_curators, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-aspartate." [GOC:curators]
 synonym: "aspartate breakdown" EXACT []
 synonym: "aspartate catabolism" EXACT []
 synonym: "aspartate degradation" EXACT []
@@ -69947,6 +70007,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8291
 property_value: skos:narrowMatch MetaCyc:PWY-8294
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006534
@@ -69962,14 +70023,12 @@
 id: GO:0006535
 name: L-cysteine biosynthetic process from L-serine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of cysteine from L- serine." [MetaCyc:CYSTSYN-PWY]
+def: "The chemical reactions and pathways resulting in the formation of cysteine from L- serine." [GOC:curators]
 synonym: "cysteine anabolism from serine" EXACT []
 synonym: "cysteine formation from serine" EXACT []
 synonym: "cysteine synthesis from serine" EXACT []
-xref: MetaCyc:CYSTSYN-PWY
 is_a: GO:0006563 ! L-serine metabolic process
 is_a: GO:0019344 ! L-cysteine biosynthetic process
-property_value: skos:exactMatch MetaCyc:CYSTSYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
 
 [Term]
@@ -70009,7 +70068,7 @@
 name: L-glutamate catabolic process
 namespace: biological_process
 alt_id: GO:0019459
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate, the anion of 2-aminopentanedioic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate." [GOC:curators]
 synonym: "glutamate breakdown" EXACT []
 synonym: "glutamate catabolism" EXACT []
 synonym: "glutamate deamidation" RELATED []
@@ -70029,13 +70088,14 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5766
 property_value: skos:narrowMatch MetaCyc:PWY0-1305
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006539
 name: obsolete glutamate catabolic process via 2-oxoglutarate
 namespace: biological_process
 def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of glutamate, via the intermediate 2-oxoglutarate." [GOC:go_curators]
-comment: The reason for obsoletion is that this term is equivalent to GO:0019552 glutamate catabolic process via 2-hydroxyglutarate, XREF the same MetaCyc pathway.
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "glutamate breakdown via 2-oxoglutarate" EXACT []
 synonym: "glutamate catabolic process via 2-ketoglutarate" EXACT []
 synonym: "glutamate catabolic process via alpha-ketoglutarate" EXACT []
@@ -70046,7 +70106,6 @@
 synonym: "glutamate degradation via 2-oxoglutarate" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28390" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019552
 
 [Term]
 id: GO:0006540
@@ -70091,9 +70150,7 @@
 synonym: "glutamine biosynthesis" EXACT []
 synonym: "glutamine formation" EXACT []
 synonym: "glutamine synthesis" EXACT []
-xref: MetaCyc:GLNSYN-PWY
 xref: MetaCyc:PWY-6549
-property_value: skos:narrowMatch MetaCyc:GLNSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6549
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31068" xsd:anyURI
 is_obsolete: true
@@ -70103,7 +70160,7 @@
 id: GO:0006543
 name: L-glutamine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamine, 2-amino-4-carbamoylbutanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-glutamine." [GOC:curators]
 synonym: "glutamine breakdown" EXACT []
 synonym: "glutamine catabolism" EXACT []
 synonym: "glutamine degradation" EXACT []
@@ -70116,6 +70173,7 @@
 property_value: skos:narrowMatch MetaCyc:GLUTAMINEFUM-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28154" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006544
@@ -70136,16 +70194,25 @@
 synonym: "glycine formation" EXACT []
 synonym: "glycine synthesis" EXACT []
 xref: MetaCyc:GLYCINE-SYN2-PWY
+xref: MetaCyc:GLYSYN-ALA-PWY
+xref: MetaCyc:GLYSYN-PWY
+xref: MetaCyc:GLYSYN-THR-PWY
+xref: MetaCyc:PWY-8551
 is_a: GO:0006544 ! glycine metabolic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:GLYCINE-SYN2-PWY
+property_value: skos:narrowMatch MetaCyc:GLYSYN-ALA-PWY
+property_value: skos:narrowMatch MetaCyc:GLYSYN-PWY
+property_value: skos:narrowMatch MetaCyc:GLYSYN-THR-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-8551
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0006546
 name: glycine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of glycine, aminoethanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of glycine." [GOC:curators]
 synonym: "glycine breakdown" EXACT []
 synonym: "glycine catabolism" EXACT []
 synonym: "glycine degradation" EXACT []
@@ -70156,6 +70223,7 @@
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-1608
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006547
@@ -70174,7 +70242,7 @@
 id: GO:0006548
 name: L-histidine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-histidine, 2-amino-3-(1H-imidazol-4-yl)propanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-histidine." [GOC:curators]
 synonym: "histidine breakdown" EXACT []
 synonym: "histidine catabolic process" BROAD []
 synonym: "histidine catabolism" EXACT []
@@ -70198,6 +70266,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5030
 property_value: skos:narrowMatch MetaCyc:PWY-5031
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006549
@@ -70212,7 +70281,7 @@
 id: GO:0006550
 name: L-isoleucine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-isoleucine." [GOC:curators]
 synonym: "isoleucine breakdown" EXACT []
 synonym: "isoleucine catabolism" EXACT []
 synonym: "isoleucine degradation" EXACT []
@@ -70226,6 +70295,7 @@
 property_value: skos:narrowMatch MetaCyc:ILEUDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5078
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006551
@@ -70242,7 +70312,7 @@
 id: GO:0006552
 name: L-leucine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-leucine, 2-amino-4-methylpentanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-leucine." [GOC:curators]
 synonym: "L-leucine breakdown" EXACT []
 synonym: "L-leucine catabolism" EXACT []
 synonym: "L-leucine degradation" EXACT []
@@ -70262,6 +70332,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-7767
 property_value: skos:narrowMatch MetaCyc:PWY-8185
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006553
@@ -70346,7 +70417,7 @@
 id: GO:0006559
 name: L-phenylalanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-phenylalanine, 2-amino-3-phenylpropanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-phenylalanine." [GOC:curators]
 synonym: "L-phenylalanine breakdown" EXACT []
 synonym: "L-phenylalanine catabolism" EXACT []
 synonym: "L-phenylalanine degradation" EXACT []
@@ -70367,6 +70438,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-7158
 property_value: skos:narrowMatch MetaCyc:PWY-8014
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006560
@@ -70396,7 +70468,7 @@
 id: GO:0006562
 name: L-proline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-proline (pyrrolidine-2-carboxylic acid), a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-proline." [GOC:curators]
 synonym: "proline breakdown" EXACT []
 synonym: "proline catabolism" EXACT []
 synonym: "proline degradation" EXACT []
@@ -70409,6 +70481,7 @@
 property_value: skos:narrowMatch MetaCyc:PROUT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8186
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006563
@@ -70428,19 +70501,22 @@
 synonym: "L-serine biosynthesis" EXACT []
 synonym: "L-serine formation" EXACT []
 synonym: "L-serine synthesis" EXACT []
+xref: MetaCyc:PWY-8011
 xref: MetaCyc:SERSYN-PWY
 xref: Reactome:R-HSA-977347 "Serine biosynthesis"
 is_a: GO:0006563 ! L-serine metabolic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
-property_value: skos:exactMatch MetaCyc:SERSYN-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-8011
+property_value: skos:narrowMatch MetaCyc:SERSYN-PWY
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0006565
 name: L-serine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-serine to pyruvate and free ammonium." [MetaCyc:SERDEG-PWY]
+def: "The chemical reactions and pathways resulting in the breakdown of L-serine." [GOC:curators]
 synonym: "L-serine breakdown" EXACT []
 synonym: "L-serine catabolism" EXACT []
 synonym: "L-serine degradation" EXACT []
@@ -70450,6 +70526,7 @@
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:exactMatch MetaCyc:SERDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006566
@@ -70466,7 +70543,7 @@
 id: GO:0006567
 name: L-threonine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-threonine (2-amino-3-hydroxybutyric acid), a polar, uncharged, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-threonine." [GOC:curators]
 synonym: "threonine breakdown" EXACT []
 synonym: "threonine catabolism" EXACT []
 synonym: "threonine degradation" EXACT []
@@ -70485,6 +70562,7 @@
 property_value: skos:narrowMatch MetaCyc:THRDLCTCAT-PWY
 property_value: skos:narrowMatch MetaCyc:THREONINE-DEG2-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006568
@@ -70503,7 +70581,7 @@
 id: GO:0006569
 name: L-tryptophan catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-tryptophan, the chiral amino acid 2-amino-3-(1H-indol-3-yl)propanoic acid." [ISBN:0198547684]
+def: "The chemical reactions and pathways resulting in the breakdown of L-tryptophan." [GOC:curators]
 synonym: "tryptophan breakdown" EXACT []
 synonym: "tryptophan catabolic process" RELATED []
 synonym: "tryptophan catabolic process, using tryptophanase" NARROW []
@@ -70543,6 +70621,7 @@
 property_value: skos:narrowMatch MetaCyc:TRYPDEG-PWY
 property_value: skos:narrowMatch MetaCyc:TRYPTOPHAN-DEGRADATION-1
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006570
@@ -70565,16 +70644,25 @@
 synonym: "tyrosine biosynthesis" EXACT []
 synonym: "tyrosine formation" EXACT []
 synonym: "tyrosine synthesis" EXACT []
+xref: MetaCyc:PWY-3461
+xref: MetaCyc:PWY-6120
+xref: MetaCyc:PWY-6134
+xref: MetaCyc:TYRSYN
 is_a: GO:0006570 ! tyrosine metabolic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-3461
+property_value: skos:narrowMatch MetaCyc:PWY-6120
+property_value: skos:narrowMatch MetaCyc:PWY-6134
+property_value: skos:narrowMatch MetaCyc:TYRSYN
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20583" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0006572
 name: L-tyrosine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-tyrosine, an aromatic amino acid, 2-amino-3-(4-hydroxyphenyl)propanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-tyrosine." [GOC:curators]
 synonym: "tyrosine breakdown" EXACT []
 synonym: "tyrosine catabolism" EXACT []
 synonym: "tyrosine degradation" EXACT []
@@ -70594,6 +70682,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY3O-4108
 property_value: skos:narrowMatch MetaCyc:TYRFUMCAT-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006573
@@ -70609,7 +70698,7 @@
 name: L-valine catabolic process
 namespace: biological_process
 alt_id: GO:1990292
-def: "The chemical reactions and pathways resulting in the breakdown of L-valine, 2-amino-3-methylbutanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-valine." [GOC:curators]
 synonym: "valine breakdown" EXACT []
 synonym: "valine catabolism" EXACT []
 synonym: "valine degradation" EXACT []
@@ -70625,6 +70714,7 @@
 property_value: skos:narrowMatch MetaCyc:VALDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31221" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006575
@@ -70826,17 +70916,22 @@
 synonym: "ornithine formation" EXACT []
 synonym: "ornithine synthesis" EXACT []
 xref: MetaCyc:ARGININE-SYN4-PWY
+xref: MetaCyc:GLUTORN-PWY
+xref: MetaCyc:PWY-6922
 is_a: GO:0006591 ! ornithine metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 is_a: GO:1901607 ! alpha-amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ARGININE-SYN4-PWY
+property_value: skos:narrowMatch MetaCyc:GLUTORN-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-6922
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 
 [Term]
 id: GO:0006593
 name: L-ornithine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine, an amino acid only rarely found in proteins, but which is important in living organisms as an intermediate in the reactions of the urea cycle and in arginine biosynthesis." [GOC:jl, ISBN:0192801023]
+def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine." [GOC:curators]
 synonym: "ornithine breakdown" EXACT []
 synonym: "ornithine catabolism" EXACT []
 synonym: "ornithine degradation" EXACT []
@@ -70844,6 +70939,7 @@
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006595
@@ -75572,7 +75668,6 @@
 def: "Any process that reduces the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:jid]
 synonym: "lysosome pH reduction" EXACT [GOC:bf, GOC:rph]
 is_a: GO:0007035 ! vacuolar acidification
-is_a: GO:0035751 ! regulation of lysosomal lumen pH
 
 [Term]
 id: GO:0007043
@@ -82402,20 +82497,22 @@
 
 [Term]
 id: GO:0008110
-name: L-histidine:2-oxoglutarate aminotransferase activity
+name: L-histidine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-histidine = 3-(imidazol-5-yl)pyruvate + L-glutamate." [EC:2.6.1.38, RHEA:16565]
+def: "Catalysis of the reaction: L-histidine + 2-oxoglutarate = 3-(imidazol-5-yl)pyruvate + L-glutamate." [RHEA:16565]
 synonym: "histidine aminotransferase activity" BROAD []
 synonym: "histidine transaminase activity" BROAD [EC:2.6.1.38]
 synonym: "histidine-2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.38]
+synonym: "L-histidine:2-oxoglutarate aminotransferase activity" EXACT []
 xref: EC:2.6.1.38
 xref: KEGG_REACTION:R01161
 xref: MetaCyc:HISTTRANSAM-RXN
 xref: RHEA:16565
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.38
 property_value: skos:exactMatch RHEA:16565
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0008111
@@ -83339,7 +83436,7 @@
 id: GO:0008175
 name: tRNA methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of a methyl group from a donor to a nucleoside residue in a tRNA molecule." [GOC:mah]
+def: "Catalysis of the transfer of a methyl group from a donor to a nucleoside residue in a tRNA molecule. The methyl group can be transfered to the nucleobase or to the ribose group of the nucleoside." [GOC:mah]
 xref: Reactome:R-HSA-6782879 "TYW3 methylates yW-86 yielding yW-72 at nucleotide 37 of tRNA(Phe)"
 xref: Reactome:R-HSA-6782881 "LCMT2 methylates yW-72 yielding yW-58 at nucleotide 37 of tRNA(Phe)"
 xref: Reactome:R-HSA-6782890 "LCMT2 methoxycarbonylates yW-58 yielding yW (wybutosine) at nucleotide 37 of tRNA(Phe)"
@@ -83728,7 +83825,6 @@
 namespace: biological_process
 def: "The addition of an alkyl group to a protein amino acid. Alkyl groups are derived from alkanes by removal of one hydrogen atom." [GOC:ma]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid alkylation" EXACT [GOC:bf]
 is_a: GO:0036211 ! protein modification process
 
@@ -84181,7 +84277,7 @@
 id: GO:0008251
 name: tRNA-specific adenosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: adenosine + H2O = inosine + NH3, in a tRNA molecule." [GOC:mah]
+def: "Catalysis of the reaction: adenosine + H2O = inosine + NH4+, in a tRNA molecule." [GOC:mah]
 synonym: "tRNA-adenosine deaminase activity" EXACT []
 xref: Reactome:R-HSA-6782311 "ADAT2:ADAT3 (hetADAT) deaminates adenosine-34 in tRNAs"
 xref: Reactome:R-HSA-6782336 "ADAT1 deaminates adenosine-37 in tRNA(Ala)"
@@ -85573,7 +85669,7 @@
 name: thioredoxin peroxidase activity
 namespace: molecular_function
 alt_id: GO:0009031
-def: "Catalysis of the reaction: [thioredoxin]-dithiol + hydrogen peroxide = [thioredoxin]-disulfide + H2O." [RHEA:63528]
+def: "Catalysis of the reaction: [thioredoxin]-dithiol + H2O2 = [thioredoxin]-disulfide + H2O." [RHEA:63528]
 synonym: "thiol peroxidase activity" EXACT []
 synonym: "TPx activity" EXACT []
 synonym: "TrxPx activity" EXACT []
@@ -86566,12 +86662,13 @@
 
 [Term]
 id: GO:0008453
-name: alanine-glyoxylate transaminase activity
+name: L-alanine:glyoxylate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-alanine + glyoxylate = pyruvate + glycine." [EC:2.6.1.44]
+def: "Catalysis of the reaction: L-alanine + glyoxylate = pyruvate + glycine." [RHEA:24248]
 synonym: "AGT activity" RELATED [EC:2.6.1.44]
 synonym: "alanine--glyoxylate aminotransferase activity" RELATED [EC:2.6.1.44]
 synonym: "alanine-glyoxylate aminotransferase activity" EXACT []
+synonym: "alanine-glyoxylate transaminase activity" EXACT []
 synonym: "alanine-glyoxylic aminotransferase activity" RELATED [EC:2.6.1.44]
 synonym: "L-alanine-glycine transaminase activity" RELATED [EC:2.6.1.44]
 synonym: "L-alanine:glyoxylate aminotransferase activity" RELATED [EC:2.6.1.44]
@@ -86580,10 +86677,11 @@
 xref: Reactome:R-HSA-389684 "glyoxylate + alanine => glycine + pyruvate [peroxisome]"
 xref: Reactome:R-HSA-904864 "Mitochondrial AGXT2 tetramer transaminates glyoxylate and alanine to glycine and pyruvate"
 xref: RHEA:24248
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.44
 property_value: skos:exactMatch RHEA:24248
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0008454
@@ -87646,11 +87744,15 @@
 
 [Term]
 id: GO:0008525
-name: phosphatidylcholine transporter activity
+name: phosphatidylcholine intramembrane carrier activity
 namespace: molecular_function
-def: "Enables the directed movement of phosphatidylcholine into, out of or within a cell, or between cells. Phosphatidylcholine refers to a class of glycerophospholipids in which the phosphatidyl group is esterified to the hydroxyl group of choline." [GOC:ai, ISBN:0198506732]
+def: "Enables the transport of phosphatidylcholine from a region of a membrane to a different region on the same membrane." [GOC:ai, ISBN:0198506732]
+synonym: "phosphatidylcholine intramembrane transporter activity" BROAD []
 synonym: "phosphatidylcholine transmembrane transporter activity" NARROW [GOC:bf, GOC:vw]
-is_a: GO:0005548 ! phospholipid transporter activity
+synonym: "phosphatidylcholine transporter activity" BROAD []
+is_a: GO:0140303 ! intramembrane lipid carrier activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/10882" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0008526
@@ -88629,11 +88731,13 @@
 synonym: "hypusine synthesis from peptidyl-lysine" EXACT []
 synonym: "hypusinylation" EXACT []
 synonym: "protein hypusination" EXACT []
+xref: MetaCyc:PWY-5905
 xref: Reactome:R-HSA-204626 "Hypusine synthesis from eIF5A-lysine"
 is_a: GO:0018205 ! peptidyl-lysine modification
 is_a: GO:0051604 ! protein maturation
 is_a: GO:1901607 ! alpha-amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 
 [Term]
 id: GO:0008613
@@ -88915,7 +89019,7 @@
 id: GO:0008649
 name: rRNA methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of a methyl group from S-adenosyl-L-methionine to a nucleoside residue in an rRNA molecule." [GOC:mah]
+def: "Catalysis of the transfer of a methyl group from S-adenosyl-L-methionine to a nucleoside residue in an rRNA molecule. The methyl group can be transfered to the nucleobase or to the ribose group of the nucleoside." [GOC:mah]
 is_a: GO:0008173 ! RNA methyltransferase activity
 is_a: GO:0008757 ! S-adenosylmethionine-dependent methyltransferase activity
 is_a: GO:0140102 ! catalytic activity, acting on a rRNA
@@ -88923,9 +89027,10 @@
 
 [Term]
 id: GO:0008650
-name: rRNA (uridine-2'-O-)-methyltransferase activity
+name: rRNA (uridine-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a uridine in rRNA + S-adenosyl-L-methionine = a 2'-O-methyluridine in rRNA + S-adenosyl-L-homocysteine + H+." [RHEA:54152]
+synonym: "rRNA (uridine-2'-O-)-methyltransferase activity" EXACT []
 xref: Reactome:R-HSA-6793127 "MRM2 (FTSJ2) methylates uridine-1369 of 16S rRNA yielding 2'-O-methyluridine"
 xref: RHEA:54152
 is_a: GO:0016436 ! rRNA (uridine) methyltransferase activity
@@ -90050,7 +90155,7 @@
 id: GO:0008718
 name: D-amino-acid dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a D-amino acid + H2O + acceptor = a 2-oxo acid + NH3 + reduced acceptor." [RHEA:18125]
+def: "Catalysis of the reaction: a D-alpha-amino acid + a quinone + H2O = a 2-oxocarboxylate + a quinol + NH4+." [RHEA:18125]
 synonym: "D-amino-acid:(acceptor) oxidoreductase (deaminating)" EXACT []
 synonym: "D-amino-acid:acceptor oxidoreductase (deaminating)" EXACT []
 xref: EC:1.4.5.1
@@ -90100,7 +90205,7 @@
 id: GO:0008721
 name: D-serine ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-serine = pyruvate + NH3." [EC:4.3.1.18]
+def: "Catalysis of the reaction: D-serine = pyruvate + NH4+." [RHEA:13977]
 synonym: "D-hydroxy amino acid dehydratase activity" BROAD [EC:4.3.1.18]
 synonym: "D-hydroxyaminoacid dehydratase activity" RELATED [EC:4.3.1.18]
 synonym: "D-serine ammonia-lyase (pyruvate-forming)" RELATED [EC:4.3.1.18]
@@ -91231,12 +91336,13 @@
 
 [Term]
 id: GO:0008791
-name: arginine N-succinyltransferase activity
+name: L-arginine N-succinyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinyl-CoA + L-arginine = CoA + N2-succinyl-L-arginine." [EC:2.3.1.109]
+def: "Catalysis of the reaction: succinyl-CoA + L-arginine = N2-succinyl-L-arginine + CoA + H+." [RHEA:15185]
 synonym: "AOST activity" RELATED [EC:2.3.1.109]
 synonym: "arginine and ornithine N(2)-succinyltransferase activity" RELATED [EC:2.3.1.109]
 synonym: "arginine and ornithine N2-succinyltransferase activity" RELATED [EC:2.3.1.109]
+synonym: "arginine N-succinyltransferase activity" BROAD []
 synonym: "arginine succinyltransferase activity" RELATED [EC:2.3.1.109]
 synonym: "AST activity" RELATED [EC:2.3.1.109]
 synonym: "AstA" RELATED [EC:2.3.1.109]
@@ -91246,9 +91352,11 @@
 xref: MetaCyc:ARGININE-N-SUCCINYLTRANSFERASE-RXN
 xref: RHEA:15185
 is_a: GO:0016749 ! N-succinyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.109
 property_value: skos:exactMatch RHEA:15185
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0008792
@@ -91270,19 +91378,22 @@
 
 [Term]
 id: GO:0008793
-name: aromatic-amino-acid transaminase activity
+name: aromatic-amino-acid:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: an L-alpha aromatic amino acid + 2-oxoglutarate = an aromatic oxo acid + L-glutamate." [RHEA:17533]
 synonym: "ArAT" RELATED [EC:2.6.1.57]
 synonym: "aromatic amino acid aminotransferase activity" EXACT [EC:2.6.1.57]
 synonym: "aromatic amino acid transferase activity" EXACT []
 synonym: "aromatic aminotransferase activity" EXACT []
+synonym: "aromatic-amino-acid transaminase activity" BROAD []
 synonym: "aromatic-amino-acid:2-oxoglutarate aminotransferase activity" EXACT []
+xref: EC:2.6.1.57
 xref: MetaCyc:2.6.1.57-RXN
 xref: RHEA:17533
-is_a: GO:0008483 ! transaminase activity
-property_value: skos:broadMatch EC:2.6.1.57
+is_a: GO:0140385 ! amino acid transaminase activity
+property_value: skos:exactMatch EC:2.6.1.57
 property_value: skos:exactMatch RHEA:17533
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0008794
@@ -91305,7 +91416,7 @@
 namespace: molecular_function
 alt_id: GO:0008749
 alt_id: GO:0016965
-def: "Catalysis of the reaction: ATP + deamido-NAD+ + NH3 = AMP + diphosphate + NAD+." [EC:6.3.1.5]
+def: "Catalysis of the reaction: deamido-NAD+ + NH4+ + ATP = AMP + diphosphate + NAD+ + H+." [RHEA:21188]
 synonym: "deamido-NAD+:ammonia ligase (AMP-forming)" RELATED [EC:6.3.1.5]
 synonym: "diphosphopyridine nucleotide synthetase activity" RELATED [EC:6.3.1.5]
 synonym: "NAD synthase (AMP-forming)" EXACT []
@@ -91334,7 +91445,7 @@
 id: GO:0008797
 name: aspartate ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-aspartate = fumarate + NH3." [EC:4.3.1.1]
+def: "Catalysis of the reaction: L-aspartate = fumarate + NH4+." [RHEA:16601]
 synonym: "aspartase activity" RELATED [EC:4.3.1.1]
 synonym: "fumaric aminase activity" RELATED [EC:4.3.1.1]
 synonym: "L-aspartase activity" RELATED [EC:4.3.1.1]
@@ -91456,7 +91567,7 @@
 id: GO:0008804
 name: carbamate kinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + NH3 + CO2 = ADP + carbamoyl phosphate." [EC:2.7.2.2]
+def: "Catalysis of the reaction: hydrogencarbonate + NH4+ + ATP = carbamoyl phosphate + ADP + H2O + H+." [RHEA:10152]
 synonym: "ATP:carbamate phosphotransferase activity" RELATED [EC:2.7.2.2]
 synonym: "carbamoyl phosphokinase activity" RELATED [EC:2.7.2.2]
 synonym: "carbamyl phosphokinase activity" RELATED [EC:2.7.2.2]
@@ -91913,7 +92024,7 @@
 id: GO:0008829
 name: dCTP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dCTP + H2O = dUTP + NH3." [EC:3.5.4.13]
+def: "Catalysis of the reaction: dCTP + H2O + H+ = dUTP + NH4+." [RHEA:22680]
 synonym: "5-methyl-dCTP deaminase activity" RELATED [EC:3.5.4.13]
 synonym: "dCTP aminohydrolase activity" RELATED [EC:3.5.4.13]
 synonym: "deoxycytidine triphosphate deaminase activity" RELATED [EC:3.5.4.13]
@@ -92097,7 +92208,7 @@
 id: GO:0008838
 name: diaminopropionate ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,3-diaminopropionate + H2O = pyruvate + 2 NH3." [EC:4.3.1.15]
+def: "Catalysis of the reaction: 2,3-diaminopropanoate + H2O + H+ = pyruvate + 2 NH4+." [EC:4.3.1.15]
 synonym: "2,3-diaminopropionate ammonia-lyase (adding H2O; pyruvate-forming)" RELATED [EC:4.3.1.15]
 synonym: "2,3-diaminopropionate ammonia-lyase activity" RELATED [EC:4.3.1.15]
 synonym: "alpha,beta-diaminopropionate ammonia-lyase activity" RELATED [EC:4.3.1.15]
@@ -92284,7 +92395,7 @@
 id: GO:0008851
 name: ethanolamine ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ethanolamine = acetaldehyde + NH3." [EC:4.3.1.7]
+def: "Catalysis of the reaction: ethanolamine = acetaldehyde + NH4+." [RHEA:15313]
 synonym: "ethanolamine ammonia-lyase (acetaldehyde-forming) activity" RELATED [EC:4.3.1.7]
 synonym: "ethanolamine deaminase activity" RELATED [EC:4.3.1.7]
 xref: EC:4.3.1.7
@@ -92920,15 +93031,17 @@
 xref: MetaCyc:AKBLIG-RXN
 xref: RHEA:20736
 is_a: GO:0016453 ! C-acetyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.29
 property_value: skos:exactMatch RHEA:20736
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0008892
 name: guanine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanine + H2O = xanthine + NH3." [EC:3.5.4.3]
+def: "Catalysis of the reaction: guanine + H2O + H+ = xanthine + NH4+." [RHEA:14665]
 synonym: "GAH activity" RELATED [EC:3.5.4.3]
 synonym: "guanase activity" RELATED [EC:3.5.4.3]
 synonym: "guanine aminase activity" RELATED [EC:3.5.4.3]
@@ -94726,13 +94839,14 @@
 
 [Term]
 id: GO:0009001
-name: serine O-acetyltransferase activity
+name: L-serine O-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-serine + acetyl-CoA = O-acetyl-L-serine + CoA." [RHEA:24560]
 synonym: "acetyl-CoA:L-serine O-acetyltransferase activity" RELATED [EC:2.3.1.30]
 synonym: "L-serine acetyltransferase activity" RELATED [EC:2.3.1.30]
 synonym: "SATase activity" RELATED [EC:2.3.1.30]
 synonym: "serine acetyltransferase activity" RELATED [EC:2.3.1.30]
+synonym: "serine O-acetyltransferase activity" BROAD []
 synonym: "serine transacetylase activity" RELATED [EC:2.3.1.30]
 xref: EC:2.3.1.30
 xref: KEGG_REACTION:R00586
@@ -94740,9 +94854,11 @@
 xref: RHEA:24560
 is_a: GO:0016412 ! serine O-acyltransferase activity
 is_a: GO:0016413 ! O-acetyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.30
 property_value: skos:exactMatch RHEA:24560
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0009002
@@ -95008,12 +95124,13 @@
 
 [Term]
 id: GO:0009016
-name: succinyldiaminopimelate transaminase activity
+name: succinyldiaminopimelate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + N-succinyl-LL-2,6-diaminopimelate = L-2-succinylamino-6-oxopimelate + L-glutamate." [EC:2.6.1.17, RHEA:11960]
+def: "Catalysis of the reaction: N-succinyl-(2S,6S)-2,6-diaminopimelate + 2-oxoglutarate = (S)-2-succinylamino-6-oxoheptanedioate + L-glutamate." [RHEA:11960]
 synonym: "N-succinyl-L-2,6-diaminoheptanedioate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.17]
 synonym: "N-succinyl-L-diaminopimelic glutamic transaminase activity" RELATED [EC:2.6.1.17]
 synonym: "succinyldiaminopimelate aminotransferase activity" EXACT []
+synonym: "succinyldiaminopimelate transaminase activity" EXACT []
 synonym: "succinyldiaminopimelate transferase activity" RELATED [EC:2.6.1.17]
 xref: EC:2.6.1.17
 xref: KEGG_REACTION:R04475
@@ -95023,6 +95140,7 @@
 property_value: skos:exactMatch EC:2.6.1.17
 property_value: skos:exactMatch RHEA:11960
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0009017
@@ -95371,7 +95489,7 @@
 id: GO:0009039
 name: urease activity
 namespace: molecular_function
-def: "Catalysis of the reaction: urea + H2O = CO2 + 2 NH3." [EC:3.5.1.5, RHEA:20557]
+def: "Catalysis of the reaction: urea + 2 H2O + H+ = hydrogencarbonate + 2 NH4+." [RHEA:20557]
 synonym: "urea amidohydrolase activity" RELATED [EC:3.5.1.5]
 xref: EC:3.5.1.5
 xref: MetaCyc:UREASE-RXN
@@ -95409,23 +95527,25 @@
 
 [Term]
 id: GO:0009042
-name: valine-pyruvate transaminase activity
+name: L-valine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-valine + pyruvate = 3-methyl-2-oxobutanoate + L-alanine." [EC:2.6.1.66, RHEA:22912]
+def: "Catalysis of the reaction: L-valine + pyruvate = 3-methyl-2-oxobutanoate + L-alanine." [RHEA:22912]
 synonym: "alanine--valine transaminase activity" RELATED [EC:2.6.1.66]
 synonym: "alanine-oxoisovalerate aminotransferase activity" RELATED [EC:2.6.1.66]
 synonym: "L-valine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.66]
 synonym: "transaminase C activity" NARROW [EC:2.6.1.66]
 synonym: "valine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.66]
 synonym: "valine-pyruvate aminotransferase activity" EXACT []
+synonym: "valine-pyruvate transaminase activity" EXACT []
 xref: EC:2.6.1.66
 xref: KEGG_REACTION:R01215
 xref: MetaCyc:VALINE-PYRUVATE-AMINOTRANSFER-RXN
 xref: RHEA:22912
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.66
 property_value: skos:exactMatch RHEA:22912
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0009044
@@ -95764,16 +95884,15 @@
 id: GO:0009067
 name: aspartate family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids of the aspartate family, comprising asparagine, aspartate, lysine, methionine and threonine." [GOC:ai, MetaCyc:PWY0-781]
+def: "The chemical reactions and pathways resulting in the formation of amino acids of the aspartate family, comprising asparagine, aspartate, lysine, methionine and threonine." [GOC:ai]
 synonym: "aspartate family amino acid anabolism" EXACT []
 synonym: "aspartate family amino acid biosynthesis" EXACT []
 synonym: "aspartate family amino acid formation" EXACT []
 synonym: "aspartate family amino acid synthesis" EXACT []
-xref: MetaCyc:PWY0-781
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
-property_value: skos:exactMatch MetaCyc:PWY0-781
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009068
@@ -95806,14 +95925,9 @@
 synonym: "serine family amino acid biosynthesis" EXACT []
 synonym: "serine family amino acid formation" EXACT []
 synonym: "serine family amino acid synthesis" EXACT []
-xref: MetaCyc:PWY-6292
-xref: MetaCyc:SER-GLYSYN-PWY
-xref: MetaCyc:SULFATE-CYS-PWY
 is_a: GO:1901607 ! alpha-amino acid biosynthetic process
-property_value: skos:narrowMatch MetaCyc:PWY-6292
-property_value: skos:narrowMatch MetaCyc:SER-GLYSYN-PWY
-property_value: skos:narrowMatch MetaCyc:SULFATE-CYS-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009071
@@ -95977,32 +96091,42 @@
 id: GO:0009084
 name: L-glutamine family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids of the glutamine family, comprising arginine, glutamate, glutamine and proline." [GOC:ai, MetaCyc:GLUTAMINE-SYN]
+def: "The chemical reactions and pathways resulting in the formation of amino acids of the glutamine family, comprising arginine, glutamate, glutamine and proline." [GOC:ai]
 synonym: "glutamine family amino acid anabolism" EXACT []
 synonym: "glutamine family amino acid biosynthesis" EXACT []
 synonym: "glutamine family amino acid formation" EXACT []
 synonym: "glutamine family amino acid synthesis" EXACT []
-xref: MetaCyc:GLUTAMINE-SYN
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
-property_value: skos:exactMatch MetaCyc:GLUTAMINE-SYN
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009085
 name: L-lysine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-lysine, 2,6-diaminohexanoic acid." [GOC:go_curators, MetaCyc:LYSINE-SYN]
+def: "The chemical reactions and pathways resulting in the formation of L-lysine, 2,6-diaminohexanoic acid." [GOC:go_curators]
 synonym: "lysine anabolism" EXACT []
 synonym: "lysine biosynthesis" EXACT []
 synonym: "lysine formation" EXACT []
 synonym: "lysine synthesis" EXACT []
-xref: MetaCyc:LYSINE-SYN
+xref: MetaCyc:DAPLYSINESYN-PWY
+xref: MetaCyc:LYSINE-AMINOAD-PWY
+xref: MetaCyc:PWY-2941
+xref: MetaCyc:PWY-2942
+xref: MetaCyc:PWY-3081
+xref: MetaCyc:PWY-5097
 is_a: GO:0006553 ! lysine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
-property_value: skos:exactMatch MetaCyc:LYSINE-SYN
+property_value: skos:narrowMatch MetaCyc:DAPLYSINESYN-PWY
+property_value: skos:narrowMatch MetaCyc:LYSINE-AMINOAD-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-2941
+property_value: skos:narrowMatch MetaCyc:PWY-2942
+property_value: skos:narrowMatch MetaCyc:PWY-3081
+property_value: skos:narrowMatch MetaCyc:PWY-5097
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009086
@@ -96022,7 +96146,7 @@
 id: GO:0009087
 name: L-methionine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-methionine (2-amino-4-(methylthio)butanoic acid), a sulfur-containing, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-methionine." [GOC:curators]
 synonym: "methionine breakdown" EXACT []
 synonym: "methionine catabolism" EXACT []
 synonym: "methionine degradation" EXACT []
@@ -96038,23 +96162,23 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5082
 property_value: skos:narrowMatch MetaCyc:PWY-701
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0009088
 name: L-threonine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-threonine (2-amino-3-hydroxybutyric acid), a polar, uncharged, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732, MetaCyc:THRESYN-PWY]
+def: "The chemical reactions and pathways resulting in the formation of L-threonine (2-amino-3-hydroxybutyric acid), a polar, uncharged, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
 synonym: "threonine anabolism" EXACT []
 synonym: "threonine biosynthesis" EXACT []
 synonym: "threonine formation" EXACT []
 synonym: "threonine synthesis" EXACT []
 xref: MetaCyc:HOMOSER-THRESYN-PWY
-xref: MetaCyc:THRESYN-PWY
 is_a: GO:0006566 ! L-threonine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:HOMOSER-THRESYN-PWY
-property_value: skos:narrowMatch MetaCyc:THRESYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009089
@@ -96089,17 +96213,17 @@
 
 [Term]
 id: GO:0009091
-name: L-homoserine catabolic process
+name: obsolete L-homoserine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of homoserine, alpha-amino-gamma-hydroxybutyric acid." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of homoserine, alpha-amino-gamma-hydroxybutyric acid." [ISBN:0198506732]
+comment: This term was obsoleted because there is no evidence that a specific pathway for L-homoserine degradation exists.
 synonym: "homoserine breakdown" EXACT []
 synonym: "homoserine catabolism" EXACT []
 synonym: "homoserine degradation" EXACT []
-is_a: GO:0009092 ! L-homoserine metabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0009092
@@ -96140,9 +96264,16 @@
 synonym: "phenylalanine biosynthetic process" BROAD []
 synonym: "phenylalanine biosynthetic process, prephenate pathway" RELATED []
 synonym: "phenylalanine biosynthetic process, shikimate pathway" RELATED []
+xref: MetaCyc:PHESYN
+xref: MetaCyc:PWY-3462
+xref: MetaCyc:PWY-7432
 is_a: GO:0006558 ! L-phenylalanine metabolic process
 is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PHESYN
+property_value: skos:narrowMatch MetaCyc:PWY-3462
+property_value: skos:narrowMatch MetaCyc:PWY-7432
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0009095
@@ -96160,17 +96291,17 @@
 
 [Term]
 id: GO:0009097
-name: isoleucine biosynthetic process
+name: obsolete isoleucine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+comment: The reason for obsoletion is that more specific terms were created.
 synonym: "isoleucine anabolism" EXACT []
 synonym: "isoleucine biosynthesis" EXACT []
 synonym: "isoleucine formation" EXACT []
 synonym: "isoleucine synthesis" EXACT []
-xref: MetaCyc:ILEUSYN-PWY
-is_a: GO:0006549 ! isoleucine metabolic process
-is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
-is_a: GO:1901607 ! alpha-amino acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30848" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901705
 
 [Term]
 id: GO:0009098
@@ -96204,7 +96335,7 @@
 relationship: has_part GO:0003984 ! acetolactate synthase activity
 relationship: has_part GO:0004160 ! dihydroxy-acid dehydratase activity
 relationship: has_part GO:0004455 ! ketol-acid reductoisomerase activity
-relationship: has_part GO:0052655 ! L-valine-2-oxoglutarate transaminase activity
+relationship: has_part GO:0052655 ! L-valine:2-oxoglutarate transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28686" xsd:anyURI
 
 [Term]
@@ -98815,7 +98946,7 @@
 id: GO:0009339
 name: glycolate oxidase complex
 namespace: cellular_component
-def: "An enzyme complex that catalyzes the oxidation of 2-hydroxy acid to form 2-oxo acid and hydrogen peroxide (H2O2). The enzyme is a flavoprotein (FMN)." [PMID:4557653, PMID:8606183]
+def: "An enzyme complex that catalyzes the oxidation of 2-hydroxy acid to form 2-oxo acid and H2O2. The enzyme is a flavoprotein (FMN)." [PMID:4557653, PMID:8606183]
 is_a: GO:1990204 ! oxidoreductase complex
 relationship: part_of GO:0005737 ! cytoplasm
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21246" xsd:anyURI
@@ -99256,10 +99387,18 @@
 id: GO:0009389
 name: dimethyl sulfoxide reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dimethyl sulfoxide + H+ = dimethyl sulfide + H2O." [PMID:8658134]
+def: "Catalysis of the reaction: dimethyl sulfide + a menaquinone + H2O = dimethyl sulfoxide + a menaquinol." [PMID:8658134, RHEA:28494]
 synonym: "dimethyl sulphoxide reductase activity" EXACT []
-is_a: GO:0016667 ! oxidoreductase activity, acting on a sulfur group of donors
+synonym: "respiratory dimethylsulfoxide reductase" EXACT [EC:1.8.5.3]
+xref: EC:1.8.5.3
+xref: MetaCyc:DIMESULFREDUCT-RXN
+xref: RHEA:28494
+is_a: GO:0016672 ! oxidoreductase activity, acting on a sulfur group of donors, quinone or similar compound as acceptor
+property_value: skos:exactMatch EC:1.8.5.3
+property_value: skos:exactMatch MetaCyc:DIMESULFREDUCT-RXN
+property_value: skos:exactMatch RHEA:28494
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28261" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
 
 [Term]
 id: GO:0009390
@@ -99918,7 +100057,7 @@
 id: GO:0009450
 name: gamma-aminobutyric acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of gamma-aminobutyric acid (GABA, 4-aminobutyrate), an amino acid which acts as a neurotransmitter in some organisms." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of gamma-aminobutyric acid (GABA)." [GOC:curators]
 comment: See also the biological process term 'neurotransmitter catabolic process ; GO:0042135'.
 synonym: "4-aminobutanoate catabolic process" EXACT []
 synonym: "4-aminobutanoate catabolism" EXACT []
@@ -99944,6 +100083,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-6536
 property_value: skos:narrowMatch MetaCyc:PWY-6537
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0009451
@@ -104318,24 +104458,26 @@
 id: GO:0009897
 name: external side of plasma membrane
 namespace: cellular_component
-def: "The leaflet of the plasma membrane that faces away from the cytoplasm and any proteins embedded or anchored in it or attached to its surface." [GOC:dos, GOC:tb]
+def: "The leaflet of the plasma membrane that faces the extracellular side of the cell, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos, GOC:tb]
 synonym: "external leaflet of plasma membrane" EXACT [GOC:ab]
 synonym: "juxtamembrane" BROAD []
 synonym: "outer surface of cytoplasmic membrane" EXACT []
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0005886 ! plasma membrane
 relationship: part_of GO:0009986 ! cell surface
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0009898
 name: cytoplasmic side of plasma membrane
 namespace: cellular_component
-def: "The leaflet the plasma membrane that faces the cytoplasm and any proteins embedded or anchored in it or attached to its surface." [GOC:dos, GOC:tb]
+def: "The leaflet of the plasma membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos, GOC:tb]
 synonym: "internal leaflet of plasma membrane" EXACT [GOC:ab]
 synonym: "internal side of plasma membrane" EXACT []
 synonym: "juxtamembrane" BROAD []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0005886 ! plasma membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0009899
@@ -104768,10 +104910,13 @@
 
 [Term]
 id: GO:0009940
-name: amino-terminal vacuolar sorting propeptide binding
+name: obsolete amino-terminal vacuolar sorting propeptide binding
 namespace: molecular_function
-def: "Binding to an amino terminal propeptide, which functions as a sorting signal to sort away the soluble vacuolar protein from Golgi to lytic vacuole via clathrin-coated vesicles." [GOC:sm, PMID:10871276]
-is_a: GO:0010209 ! vacuolar sorting signal binding
+def: "OBSOLETE. Binding to an amino terminal propeptide, which functions as a sorting signal to sort away the soluble vacuolar protein from Golgi to lytic vacuole via clathrin-coated vesicles." [GOC:sm, PMID:10871276]
+comment: This term was obsolete because it is out of scope for GO; target regions of interactions are not captured.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31410" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0010209
 
 [Term]
 id: GO:0009941
@@ -105531,11 +105676,12 @@
 id: GO:0010009
 name: cytoplasmic side of endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the endosome membrane that faces the cytoplasm." [GOC:lr]
+def: "The leaflet of the endosome membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:lr]
 synonym: "external leaflet of endosome membrane" EXACT [GOC:ab]
 synonym: "external side of endosome membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0010008 ! endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0010011
@@ -107488,10 +107634,12 @@
 
 [Term]
 id: GO:0010209
-name: vacuolar sorting signal binding
+name: vacuolar sorting signal receptor activity
 namespace: molecular_function
 def: "Binding to a vacuolar sorting signal, a specific peptide sequence that acts as a signal to localize the protein within the vacuole." [GOC:mah]
-is_a: GO:0005048 ! signal sequence binding
+synonym: "vacuolar sorting signal binding" RELATED []
+is_a: GO:0038024 ! cargo receptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31410" xsd:anyURI
 
 [Term]
 id: GO:0010210
@@ -108218,10 +108366,11 @@
 
 [Term]
 id: GO:0010285
-name: L,L-diaminopimelate aminotransferase activity
+name: L,L-diaminopimelate:2-oxoglutarate transaminase activity
 namespace: molecular_function
 alt_id: GO:0043742
-def: "Catalysis of the reaction: 2-oxoglutarate + LL-2,6-diaminopimelate = (S)-2,3,4,5-tetrahydrodipicolinate + L-glutamate + H2O + H+." [EC:2.6.1.83, RHEA:23988]
+def: "Catalysis of the reaction: 2-oxoglutarate + LL-2,6-diaminopimelate = (S)-2,3,4,5-tetrahydrodipicolinate + L-glutamate + H2O + H+." [RHEA:23988]
+synonym: "L,L-diaminopimelate aminotransferase activity" EXACT []
 synonym: "LL-2,6-diaminoheptanedioate:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "LL-DAP aminotransferase activity" RELATED [EC:2.6.1.83]
 synonym: "LL-DAP-AT activity" RELATED [EC:2.6.1.83]
@@ -108235,6 +108384,7 @@
 property_value: skos:exactMatch EC:2.6.1.83
 property_value: skos:exactMatch RHEA:23988
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0010286
@@ -108653,7 +108803,6 @@
 namespace: biological_process
 alt_id: GO:1902534
 def: "The infolding of a membrane." [GOC:tb]
-subset: goslim_yeast
 synonym: "single-organism membrane invagination" RELATED []
 is_a: GO:0061024 ! membrane organization
 created_by: jl
@@ -108669,17 +108818,19 @@
 
 [Term]
 id: GO:0010326
-name: methionine-oxo-acid transaminase activity
+name: L-methionine:oxo-acid transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a 2-oxocarboxylate + L-methionine = 4-methylsulfanyl-2-oxobutanoate + an L-alpha-amino acid." [PMID:17056707, RHEA:31763]
+synonym: "methionine-oxo-acid transaminase activity" EXACT []
 xref: EC:2.6.1.88
 xref: MetaCyc:R15-RXN
 xref: RHEA:31763
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.88
 property_value: skos:exactMatch RHEA:31763
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0010327
@@ -108938,12 +109089,10 @@
 
 [Term]
 id: GO:0010355
-name: obsolete homogentisate farnesyltransferase activity
+name: homogentisate farnesyltransferase activity
 namespace: molecular_function
-def: "OBSOLETE. Catalysis of the reaction: homogentisic acid + farnesyl diphosphate = 2-methyl-6-farnesylplastoquinol." [PMID:16989822]
-comment: The reason for obsoletion is that the data from the paper for which the term was requested can be accurately described using homogentisate solanesyltransferase activity.
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29344" xsd:anyURI
-is_obsolete: true
+def: "Catalysis of the reaction: homogentisic acid + farnesyl diphosphate = 2-methyl-6-farnesylplastoquinol." [PMID:16989822]
+is_a: GO:0010354 ! homogentisate prenyltransferase activity
 
 [Term]
 id: GO:0010356
@@ -110796,23 +110945,27 @@
 name: regulation of macromolecule biosynthetic process
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of the chemical reactions and pathways resulting in the formation of a macromolecule, any molecule of high relative molecular mass, the structure of which essentially comprises the multiple repetition of units derived, actually or conceptually, from molecules of low relative molecular mass." [GOC:dph, GOC:tb]
+subset: gocheck_do_not_annotate
 is_a: GO:0009889 ! regulation of biosynthetic process
 is_a: GO:0060255 ! regulation of macromolecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0009059 ! macromolecule biosynthetic process
 relationship: regulates GO:0009059 ! macromolecule biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31483" xsd:anyURI
 
 [Term]
 id: GO:0010557
 name: positive regulation of macromolecule biosynthetic process
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of the chemical reactions and pathways resulting in the formation of a macromolecule, any molecule of high relative molecular mass, the structure of which essentially comprises the multiple repetition of units derived, actually or conceptually, from molecules of low relative molecular mass." [GOC:dph, GOC:tb]
+subset: gocheck_do_not_annotate
 is_a: GO:0009891 ! positive regulation of biosynthetic process
 is_a: GO:0010556 ! regulation of macromolecule biosynthetic process
 is_a: GO:0010604 ! positive regulation of macromolecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0009059 ! macromolecule biosynthetic process
 relationship: positively_regulates GO:0009059 ! macromolecule biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31483" xsd:anyURI
 
 [Term]
 id: GO:0010558
@@ -114823,10 +114976,13 @@
 
 [Term]
 id: GO:0010944
-name: negative regulation of transcription by competitive promoter binding
+name: obsolete negative regulation of transcription by competitive promoter binding
 namespace: biological_process
-def: "Any process that stops, prevents, or reduces the frequency, rate or extent of DNA-dependent transcription using a mechanism that involves direct competition for interaction with a promoter binding site." [GOC:tb]
-is_a: GO:0045892 ! negative regulation of DNA-templated transcription
+def: "OBSOLETE. Any process that stops, prevents, or reduces the frequency, rate or extent of DNA-dependent transcription using a mechanism that involves direct competition for interaction with a promoter binding site." [GOC:tb]
+comment: This term was obsoleted because it represents a mechanism and is outside the scope of GO.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19894" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0045892
 
 [Term]
 id: GO:0010945
@@ -118453,7 +118609,7 @@
 namespace: molecular_function
 alt_id: GO:0008895
 alt_id: GO:0015037
-def: "Catalysis of the reaction: a protein with reduced sulfide groups = a protein with oxidized disulfide bonds." [PMID:7559385]
+def: "Catalysis of the reaction: a protein with reduced sulfide groups = a protein with oxidized disulfide bonds." [PMID:18331844]
 synonym: "haem lyase disulphide oxidoreductase activity" NARROW []
 synonym: "heme lyase disulfide oxidoreductase activity" NARROW []
 synonym: "peptide disulfide oxidoreductase activity" EXACT []
@@ -118461,7 +118617,6 @@
 synonym: "protein disulfide oxidoreductase activity" EXACT []
 synonym: "protein disulfide-oxidoreductase activity" EXACT []
 synonym: "protein disulphide oxidoreductase activity" EXACT []
-xref: MetaCyc:DISULFOXRED-RXN
 xref: Reactome:R-HSA-1307802 "MIA40:ERV1 (CHCHD4:GFER) oxidizes cysteine residues to cystine disulfide bonds"
 xref: Reactome:R-HSA-264997 "P4HB mediates disulfide bond formation in Proinsulin"
 xref: Reactome:R-HSA-3299753 "CCS transfers Cu to SOD1 and oxidizes cysteine residues in SOD1"
@@ -118469,6 +118624,7 @@
 is_a: GO:0015036 ! disulfide oxidoreductase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20219" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
 
 [Term]
 id: GO:0015036
@@ -120558,7 +120714,6 @@
 def: "Enables the transfer of aminophospholipids from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP. Aminophospholipids contain phosphoric acid as a mono- or diester and an amino (NH2) group." [GOC:pg]
 synonym: "aminophospholipid transmembrane transporter activity" RELATED []
 synonym: "aminophospholipid transporter activity" RELATED []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0140327 ! flippase activity
 relationship: part_of GO:0140331 ! aminophospholipid translocation
 property_value: skos:broadMatch RHEA:66132
@@ -127945,7 +128100,7 @@
 id: GO:0016041
 name: glutamate synthase (ferredoxin) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 L-glutamate + 2 oxidized ferredoxin = L-glutamine + 2-oxoglutarate + 2 reduced ferredoxin + 2 H+. This is a two-step reaction: (a) L-glutamate + NH3 = L-glutamine + H2O, (b) L-glutamate + 2 oxidized ferredoxin + H2O = NH3 + 2-oxoglutarate + 2 reduced ferredoxin + 2 H+." [EC:1.4.7.1]
+def: "Catalysis of the reaction: 2 L-glutamate + 2 oxidized ferredoxin = L-glutamine + 2-oxoglutarate + 2 reduced ferredoxin + 2 H+. This is a two-step reaction: (a) L-glutamate + NH4+ = L-glutamine + H2O, (b) L-glutamate + 2 oxidized ferredoxin + H2O = NH4+ + 2-oxoglutarate + 2 reduced ferredoxin + 2 H+." [EC:1.4.7.1]
 comment: Note that this term has a MetaCyc pathway reference as the pathway only has a single step.
 synonym: "ferredoxin-dependent glutamate synthase activity" RELATED [EC:1.4.7.1]
 synonym: "ferredoxin-glutamate synthase activity" RELATED [EC:1.4.7.1]
@@ -129487,7 +129642,7 @@
 id: GO:0016174
 name: NAD(P)H oxidase H2O2-forming activity
 namespace: molecular_function
-def: "Catalysis of the reaction: NAD(P)H + H+ + O2 = NAD(P)+ + hydrogen peroxide." [EC:1.6.3.1, PMID:10401672, PMID:10601291, PMID:11822874]
+def: "Catalysis of the reaction: NAD(P)H + H+ + O2 = NAD(P)+ + H2O2." [EC:1.6.3.1, PMID:10401672, PMID:10601291, PMID:11822874]
 synonym: "dual oxidase activity" RELATED [EC:1.6.3.1]
 synonym: "NAD(P)H oxidase activity" BROAD []
 synonym: "NAD(P)H:oxygen oxidoreductase activity" RELATED [EC:1.6.3.1]
@@ -129856,13 +130011,13 @@
 id: GO:0016211
 name: ammonia ligase activity
 namespace: molecular_function
-def: "Catalysis of the ligation of ammonia (NH3) to another substance via a carbon-nitrogen bond with concomitant breakage of a diphosphate linkage, usually in a nucleoside triphosphate." [GOC:jl]
+def: "Catalysis of the ligation of ammonia (NH4+) to another substance via a carbon-nitrogen bond with concomitant breakage of a diphosphate linkage, usually in a nucleoside triphosphate." [GOC:jl]
 is_a: GO:0016880 ! acid-ammonia (or amide) ligase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28243" xsd:anyURI
 
 [Term]
 id: GO:0016212
-name: kynurenine-oxoglutarate transaminase activity
+name: L-kynurenine:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-oxoglutarate + L-kynurenine = H2O + kynurenate + L-glutamate. The product 4-(2-aminophenyl)-2,4-dioxobutanoate is converted into kynurenate by a spontaneous reaction. Also acts on 3-hydroxykynurenine to form xanthurenate." [EC:2.6.1.7]
 synonym: "kynurenine 2-oxoglutarate transaminase activity" RELATED [EC:2.6.1.7]
@@ -129870,6 +130025,7 @@
 synonym: "kynurenine transaminase (cyclizing)" RELATED [EC:2.6.1.7]
 synonym: "kynurenine--oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.7]
 synonym: "kynurenine-oxoglutarate aminotransferase activity" EXACT []
+synonym: "kynurenine-oxoglutarate transaminase activity" EXACT []
 synonym: "L-kynurenine aminotransferase activity" RELATED [EC:2.6.1.7]
 synonym: "L-kynurenine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.7]
 xref: EC:2.6.1.7
@@ -129887,6 +130043,7 @@
 property_value: skos:narrowMatch RHEA:65560
 property_value: skos:narrowMatch RHEA:65884
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25811" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0016213
@@ -129987,7 +130144,7 @@
 id: GO:0016223
 name: beta-alanine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-alanine + 2-oxopropanoate = pyruvate + beta-alanine." [RHEA:14077]
+def: "Catalysis of the reaction: L-alanine + 3-oxopropanoate = beta-alanine + pyruvate." [RHEA:14077]
 synonym: "beta-alanine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.18]
 synonym: "beta-alanine-alpha-alanine transaminase activity" RELATED [EC:2.6.1.18]
 synonym: "beta-alanine-pyruvate aminotransferase activity" EXACT []
@@ -129997,7 +130154,7 @@
 xref: MetaCyc:2.6.1.18-RXN
 xref: Reactome:R-HSA-909776 "beta-alanine + pyruvate => 3-oxopropanoate + alanine"
 xref: RHEA:14077
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.18
 property_value: skos:exactMatch RHEA:14077
 
@@ -131713,12 +131870,13 @@
 
 [Term]
 id: GO:0016428
-name: tRNA (cytidine-5-)-methyltransferase activity
+name: tRNA (cytidine-N5)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a cytidine in tRNA + S-adenosyl-L-methionine = a 5-methylcytidine in tRNA + S-adenosyl-L-homocysteine + H+. This modification can occur on seversal residues, including cytidine(34), cytidine(40), cytidine(48), and cytidine(49)." [RHEA:61468]
+def: "Catalysis of the reaction: a cytidine in tRNA + S-adenosyl-L-methionine = a 5-methylcytidine in tRNA + S-adenosyl-L-homocysteine + H+. This modification can occur on several residues, including cytidine(34), cytidine(40), cytidine(48), and cytidine(49)." [RHEA:61468]
 synonym: "S-adenosyl-L-methionine:tRNA (cytosine-5-)-methyltransferase activity" RELATED []
 synonym: "transfer ribonucleate cytosine 5-methyltransferase activity" RELATED []
 synonym: "transfer RNA cytosine 5-methyltransferase activity" RELATED []
+synonym: "tRNA (cytidine-5-)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytosine-5-)-methyltransferase activity" EXACT []
 xref: Reactome:R-HSA-6782388 "NSUN2 methylates cytidine-34, cytidine-48 of unspliced tRNA(Leu)(CAA)"
 xref: Reactome:R-HSA-6782419 "TRDMT1 (DNMT2) methylates cytidine-38 of tRNA(Asp)"
@@ -131730,6 +131888,7 @@
 property_value: skos:exactMatch RHEA:61468
 property_value: skos:relatedMatch EC:2.1.1.202
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24771" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26109" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -134213,7 +134372,7 @@
 id: GO:0016688
 name: L-ascorbate peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-ascorbate + hydrogen peroxide = dehydroascorbate + 2 H2O." [EC:1.11.1.11]
+def: "Catalysis of the reaction: L-ascorbate + H2O2 = dehydroascorbate + 2 H2O." [EC:1.11.1.11]
 synonym: "ascorbate peroxidase activity" RELATED [EC:1.11.1.11]
 synonym: "ascorbic acid peroxidase activity" RELATED [EC:1.11.1.11]
 synonym: "L-ascorbate:hydrogen-peroxide oxidoreductase activity" RELATED [EC:1.11.1.11]
@@ -134231,7 +134390,7 @@
 id: GO:0016689
 name: manganese peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 Mn2+ + 2 H+ + hydrogen peroxide = 2 Mn3+ + 2 H2O." [EC:1.11.1.13]
+def: "Catalysis of the reaction: 2 Mn2+ + 2 H+ + H2O2 = 2 Mn3+ + 2 H2O." [EC:1.11.1.13]
 synonym: "Mn(II):hydrogen-peroxide oxidoreductase activity" RELATED [EC:1.11.1.13]
 synonym: "Mn-dependent (NADH-oxidizing) peroxidase activity" RELATED [EC:1.11.1.13]
 synonym: "Mn-dependent peroxidase activity" RELATED [EC:1.11.1.13]
@@ -136075,7 +136234,7 @@
 id: GO:0016840
 name: carbon-nitrogen lyase activity
 namespace: molecular_function
-def: "Catalysis of the release of ammonia or one of its derivatives, with the formation of a double bond or ring. Enzymes with this activity may catalyze the actual elimination of the ammonia, amine or amide, e.g. CH-CH(-NH-R) = C=CH- + NH2-R. Others, however, catalyze elimination of another component, e.g. water, which is followed by spontaneous reactions that lead to breakage of the C-N bond, e.g. L-serine ammonia-lyase (EC:4.3.1.17), so that the overall reaction is C(-OH)-CH(-NH2) = CH2-CO- + NH3, i.e. an elimination with rearrangement. The sub-subclasses of EC:4.3 are the ammonia-lyases (EC:4.3.1), lyases acting on amides, amidines, etc. (EC:4.3.2), the amine-lyases (EC:4.3.3), and other carbon-nitrogen lyases (EC:4.3.99)." [EC:4.3.-.-]
+def: "Catalysis of the release of ammonia or one of its derivatives, with the formation of a double bond or ring. Enzymes with this activity may catalyze the actual elimination of the ammonia, amine or amide, e.g. CH-CH(-NH-R) = C=CH- + NH2-R. Others, however, catalyze elimination of another component, e.g. water, which is followed by spontaneous reactions that lead to breakage of the C-N bond, e.g. L-serine ammonia-lyase (EC:4.3.1.17), so that the overall reaction is C(-OH)-CH(-NH2) = CH2-CO- + NH4+, i.e. an elimination with rearrangement. The sub-subclasses of EC:4.3 are the ammonia-lyases (EC:4.3.1), lyases acting on amides, amidines, etc. (EC:4.3.2), the amine-lyases (EC:4.3.3), and other carbon-nitrogen lyases (EC:4.3.99)." [EC:4.3.-.-]
 synonym: "other carbon-nitrogen lyase activity" NARROW []
 xref: EC:4.3.-.-
 is_a: GO:0016829 ! lyase activity
@@ -136576,7 +136735,7 @@
 id: GO:0016880
 name: acid-ammonia (or amide) ligase activity
 namespace: molecular_function
-def: "Catalysis of the ligation of an acid to ammonia (NH3) or an amide via a carbon-nitrogen bond, with the concomitant hydrolysis of the diphosphate bond in ATP or a similar triphosphate." [GOC:jl, GOC:mah]
+def: "Catalysis of the ligation of an acid to ammonia (NH4+) or an amide via a carbon-nitrogen bond, with the concomitant hydrolysis of the diphosphate bond in ATP or a similar triphosphate." [GOC:jl, GOC:mah]
 synonym: "amide synthase activity" EXACT []
 xref: EC:6.3.1.-
 is_a: GO:0016879 ! ligase activity, forming carbon-nitrogen bonds
@@ -137613,7 +137772,7 @@
 id: GO:0016990
 name: arginine deiminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-arginine + H2O = L-citrulline + NH3." [EC:3.5.3.6]
+def: "Catalysis of the reaction: L-arginine + H2O = L-citrulline + NH4+." [RHEA:19597]
 synonym: "arginine dihydrolase activity" RELATED [EC:3.5.3.6]
 synonym: "citrulline iminase activity" RELATED [EC:3.5.3.6]
 synonym: "L-arginine deiminase activity" RELATED [EC:3.5.3.6]
@@ -139095,8 +139254,7 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phospholipids from one membrane bilayer leaflet to the other, by an ATP-independent mechanism." [GOC:cjm, PMID:20043909, PMID:20302864]
 comment: Nomenclature note. Scramblases are ATP-independent, non-selective, translocases inducing non-specific transbilayer movements across the membrane. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases).
-is_a: GO:0005548 ! phospholipid transporter activity
-is_a: GO:0140303 ! intramembrane lipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
 relationship: part_of GO:0017121 ! plasma membrane phospholipid scrambling
 
 [Term]
@@ -141677,7 +141835,6 @@
 namespace: biological_process
 def: "The alteration of an amino acid residue in a peptide." [GOC:mah]
 subset: gocheck_do_not_annotate
-subset: goslim_yeast
 is_a: GO:0036211 ! protein modification process
 
 [Term]
@@ -144403,7 +144560,7 @@
 id: GO:0018488
 name: aryl-aldehyde oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an aromatic aldehyde + O2 + H2O = an aromatic acid + hydrogen peroxide." [EC:1.2.3.9]
+def: "Catalysis of the reaction: an aromatic aldehyde + O2 + H2O = an aromatic carboxylate + H2O2 + H+." [RHEA:18569]
 synonym: "aryl-aldehyde:oxygen oxidoreductase activity" RELATED [EC:1.2.3.9]
 xref: EC:1.2.3.9
 xref: MetaCyc:ARYL-ALDEHYDE-OXIDASE-RXN
@@ -144953,7 +145110,7 @@
 id: GO:0018527
 name: cyclohexylamine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cyclohexylamine + O2 + H2O = cyclohexanone + NH3 + hydrogen peroxide." [PMID:18451, RHEA:18433]
+def: "Catalysis of the reaction: cyclohexylamine + O2 + H2O = cyclohexanone + H2O2 + NH4+." [PMID:18451, RHEA:18433]
 synonym: "cyclohexylamine:oxygen oxidoreductase (deaminating)" RELATED [EC:1.4.3.12]
 xref: EC:1.4.3.12
 xref: MetaCyc:CYCLOHEXYLAMINE-OXIDASE-RXN
@@ -145001,7 +145158,7 @@
 xref: MetaCyc:R-6-HYDROXYNICOTINE-OXIDASE-RXN
 xref: RHEA:10012
 xref: UM-BBD_reactionID:r0477
-is_a: GO:0019116 ! hydroxy-nicotine oxidase activity
+is_a: GO:0016647 ! oxidoreductase activity, acting on the CH-NH group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.5.3.6
 property_value: skos:exactMatch RHEA:10012
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -145021,7 +145178,7 @@
 xref: MetaCyc:S-6-HYDROXYNICOTINE-OXIDASE-RXN
 xref: RHEA:11880
 xref: UM-BBD_reactionID:r0478
-is_a: GO:0019116 ! hydroxy-nicotine oxidase activity
+is_a: GO:0016647 ! oxidoreductase activity, acting on the CH-NH group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.5.3.5
 property_value: skos:exactMatch RHEA:11880
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -145207,7 +145364,7 @@
 id: GO:0018549
 name: methanethiol oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: methanethiol + O2 + H2O = formaldehyde + hydrogen sulfide + hydrogen peroxide." [EC:1.8.3.4]
+def: "Catalysis of the reaction: methanethiol + O2 + H2O = hydrogen sulfide + formaldehyde + H2O2 + H+." [RHEA:11812]
 synonym: "(MM)-oxidase activity" RELATED [EC:1.8.3.4]
 synonym: "methanethiol:oxygen oxidoreductase activity" RELATED [EC:1.8.3.4]
 synonym: "methyl mercaptan oxidase activity" RELATED [EC:1.8.3.4]
@@ -145965,7 +146122,7 @@
 id: GO:0018618
 name: anthranilate 1,2-dioxygenase (deaminating, decarboxylating) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: anthranilate + NADPH + H+ + O2 = catechol + CO2 + NADP+ + NH3." [EC:1.14.12.1]
+def: "Catalysis of the reaction: anthranilate + NAD(P)H + O2 + 3 H+ = catechol + NH4+ + CO2 + NAD(P)+." [EC:1.14.12.1]
 synonym: "AntA" RELATED []
 synonym: "AntB" RELATED []
 synonym: "AntC" RELATED []
@@ -147341,12 +147498,18 @@
 
 [Term]
 id: GO:0018719
-name: 6-aminohexanoate transaminase activity
+name: 6-aminohexanoate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-aminohexanoate + alpha-ketoglutarate = glutamate + 6-oxohexanoate." [UM-BBD_reactionID:r0449]
+def: "Catalysis of the reaction: 6-aminohexanoate + 2-oxoglutarate = 6-oxohexanoate + L-glutamate." [RHEA:58200]
+synonym: "6-aminohexanoate aminotransferase activity" EXACT []
+xref: EC:2.6.1.116
 xref: MetaCyc:R562-RXN
+xref: RHEA:58200
 xref: UM-BBD_reactionID:r0449
 is_a: GO:0008483 ! transaminase activity
+property_value: skos:exactMatch EC:2.6.1.116
+property_value: skos:exactMatch RHEA:58200
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0018720
@@ -147681,7 +147844,7 @@
 id: GO:0018750
 name: biuret amidohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: biuret + H2O = urea + CO2 + NH3." [EC:3.5.1.84]
+def: "Catalysis of the reaction: biuret + H2O = urea-1-carboxylate + NH4+." [RHEA:17525]
 xref: EC:3.5.1.84
 xref: RHEA:17525
 xref: UM-BBD_reactionID:r0846
@@ -147725,11 +147888,13 @@
 
 [Term]
 id: GO:0018754
-name: ammelide aminohydrolase activity
+name: obsolete ammelide aminohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ammelide + H2O = cyanuric acid + NH3." [PMID:1991731]
+def: "OBSOLETE. Catalysis of the reaction: ammelide + H2O = cyanuric acid + NH4+." [PMID:1991731]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: MetaCyc:RXN-8017
-is_a: GO:0016813 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amidines
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018755
@@ -147744,21 +147909,26 @@
 id: GO:0018756
 name: ammeline aminohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ammeline + H2O = ammelide + NH3." [PMID:1991731]
+def: "Catalysis of the reaction: ammeline + H2O = ammelide + NH4+. Also converts melamine to ammeline." [EC:3.5.4.45, PMID:1991731]
+xref: EC:3.5.4.45
 xref: MetaCyc:RXN-8016
 xref: RHEA:26201
 is_a: GO:0016813 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amidines
+property_value: skos:exactMatch EC:3.5.4.45
 property_value: skos:exactMatch RHEA:26201
+property_value: skos:relatedMatch RHEA:26197
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0018757
-name: deisopropylhydroxyatrazine aminohydrolase activity
+name: obsolete deisopropylhydroxyatrazine aminohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: deisopropylhydroxyatrazine + H2O = NH3 + 2,4-dihydroxy-6-(N'-ethyl)amino-1,3,5-triazine." [UM-BBD_reactionID:r0121]
+def: "OBSOLETE. Catalysis of the reaction: deisopropylhydroxyatrazine + H2O = NH4+ + 2,4-dihydroxy-6-(N'-ethyl)amino-1,3,5-triazine." [UM-BBD_reactionID:r0121]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: KEGG_REACTION:R05574
 xref: UM-BBD_reactionID:r0121
-is_a: GO:0016813 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amidines
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0018758
@@ -147826,7 +147996,7 @@
 id: GO:0018762
 name: aliphatic nitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: R-CN + H2O = R-COOH + NH3." [EC:3.5.5.7]
+def: "Catalysis of the reaction: an aliphatic nitrile + 2 H2O = a carboxylate + NH4+." [RHEA:46188]
 synonym: "aliphatic nitrile aminohydrolase activity" RELATED [EC:3.5.5.7]
 xref: EC:3.5.5.7
 xref: MetaCyc:3.5.5.7-RXN
@@ -148657,7 +148827,7 @@
 id: GO:0018826
 name: methionine gamma-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-methionine = methanethiol + NH3 + 2-oxobutanoate." [EC:4.4.1.11, RHEA:23800]
+def: "Catalysis of the reaction: L-methionine + H2O = methanethiol + 2-oxobutanoate + NH4+." [RHEA:23800]
 synonym: "L-methioninase activity" RELATED [EC:4.4.1.11]
 synonym: "L-methionine gamma-lyase activity" RELATED [EC:4.4.1.11]
 synonym: "L-methionine methanethiol-lyase (deaminating)" RELATED [EC:4.4.1.11]
@@ -151696,11 +151866,14 @@
 
 [Term]
 id: GO:0019116
-name: hydroxy-nicotine oxidase activity
+name: obsolete hydroxy-nicotine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-hydroxynicotine + H2O + O2 = 1-(6-hydroxypyrid-3-yl)-4-(methylamino)butan-1-one + hydrogen peroxide." [GOC:jl, PMID:16095622]
-is_a: GO:0016647 ! oxidoreductase activity, acting on the CH-NH group of donors, oxygen as acceptor
+def: "OBSOLETE. Catalysis of the reaction: 6-hydroxynicotine + H2O + O2 = 1-(6-hydroxypyrid-3-yl)-4-(methylamino)butan-1-one + hydrogen peroxide." [GOC:jl, PMID:16095622]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+is_obsolete: true
+consider: GO:0018530
+consider: GO:0018531
 
 [Term]
 id: GO:0019117
@@ -152118,7 +152291,7 @@
 id: GO:0019148
 name: D-cysteine desulfhydrase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-cysteine + H2O = sulfide + NH3 + pyruvate." [EC:4.4.1.15]
+def: "Catalysis of the reaction: D-cysteine + H2O = hydrogen sulfide + pyruvate + NH4+ + H+." [RHEA:11268]
 synonym: "D-cysteine lyase activity" RELATED [EC:4.4.1.15]
 synonym: "D-cysteine sulfide-lyase (deaminating)" RELATED [EC:4.4.1.15]
 synonym: "D-cysteine sulfide-lyase (deaminating; pyruvate-forming)" RELATED [EC:4.4.1.15]
@@ -152134,7 +152307,7 @@
 id: GO:0019149
 name: 3-chloro-D-alanine dehydrochlorinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 3-chloro-D-alanine + H2O = pyruvate + chloride + NH3." [EC:4.5.1.2]
+def: "Catalysis of the reaction: 3-chloro-D-alanine + H2O = chloride + pyruvate + NH4+ + H+." [RHEA:18873]
 synonym: "3-chloro-D-alanine chloride-lyase (deaminating)" RELATED [EC:4.5.1.2]
 synonym: "3-chloro-D-alanine chloride-lyase (deaminating; pyruvate-forming)" RELATED [EC:4.5.1.2]
 synonym: "beta-chloro-D-alanine dehydrochlorinase activity" RELATED [EC:4.5.1.2]
@@ -152294,7 +152467,7 @@
 id: GO:0019159
 name: nicotinamide-nucleotide amidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: beta-nicotinamide D-ribonucleotide + H2O = beta-nicotinate D-ribonucleotide + NH3." [EC:3.5.1.42]
+def: "Catalysis of the reaction: beta-nicotinamide D-ribonucleotide + H2O = nicotinate beta-D-ribonucleotide + NH4+." [RHEA:12400]
 synonym: "nicotinamide mononucleotide amidohydrolase activity" RELATED [EC:3.5.1.42]
 synonym: "nicotinamide mononucleotide deamidase activity" RELATED [EC:3.5.1.42]
 synonym: "nicotinamide-D-ribonucleotide amidohydrolase activity" RELATED [EC:3.5.1.42]
@@ -152330,12 +152503,13 @@
 
 [Term]
 id: GO:0019161
-name: diamine transaminase activity
+name: diamine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an alpha,omega-diamine + 2-oxoglutarate = an omega-aminoaldehyde + L-glutamate." [EC:2.6.1.29]
+def: "Catalysis of the reaction: an alpha,omega-diamine + 2-oxoglutarate = an omega-aminoaldehyde + L-glutamate." [RHEA:18217]
 synonym: "amine transaminase activity" RELATED [EC:2.6.1.29]
 synonym: "amine-ketoacid transaminase activity" RELATED [EC:2.6.1.29]
 synonym: "diamine aminotransferase activity" EXACT []
+synonym: "diamine transaminase activity" BROAD []
 synonym: "diamine-ketoglutaric transaminase activity" RELATED [EC:2.6.1.29]
 synonym: "diamine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.29]
 xref: EC:2.6.1.29
@@ -152345,14 +152519,16 @@
 property_value: skos:exactMatch EC:2.6.1.29
 property_value: skos:exactMatch RHEA:18217
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019162
-name: pyridoxamine-oxaloacetate transaminase activity
+name: pyridoxamine:oxaloacetate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: oxaloacetate + pyridoxamine = L-aspartate + pyridoxal." [EC:2.6.1.31, RHEA:10844]
+def: "Catalysis of the reaction: oxaloacetate + pyridoxamine = L-aspartate + pyridoxal." [RHEA:10844]
 synonym: "pyridoxamine--oxaloacetate aminotransferase activity" RELATED [EC:2.6.1.31]
 synonym: "pyridoxamine-oxaloacetate aminotransferase activity" EXACT []
+synonym: "pyridoxamine-oxaloacetate transaminase activity" EXACT []
 synonym: "pyridoxamine:oxaloacetate aminotransferase activity" RELATED [EC:2.6.1.31]
 xref: EC:2.6.1.31
 xref: KEGG_REACTION:R01713
@@ -152362,17 +152538,19 @@
 property_value: skos:exactMatch EC:2.6.1.31
 property_value: skos:exactMatch RHEA:10844
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019163
-name: pyridoxamine-phosphate transaminase activity
+name: pyridoxamine-phosphate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pyridoxamine 5'-phosphate + 2-oxoglutarate = pyridoxal 5'-phosphate + D-glutamate." [EC:2.6.1.54]
+def: "Catalysis of the reaction: pyridoxamine 5'-phosphate + 2-oxoglutarate = pyridoxal 5'-phosphate + D-glutamate." [RHEA:15877]
 synonym: "pyridoxamine 5'-phosphate transaminase activity" RELATED [EC:2.6.1.54]
 synonym: "pyridoxamine 5'-phosphate-alpha-ketoglutarate transaminase activity" RELATED [EC:2.6.1.54]
 synonym: "pyridoxamine phosphate aminotransferase activity" RELATED [EC:2.6.1.54]
 synonym: "pyridoxamine-5'-phosphate:2-oxoglutarate aminotransferase (D-glutamate-forming)" RELATED [EC:2.6.1.54]
 synonym: "pyridoxamine-phosphate aminotransferase activity" EXACT []
+synonym: "pyridoxamine-phosphate transaminase activity" BROAD []
 xref: EC:2.6.1.54
 xref: MetaCyc:PYRDAMPTRANS-RXN
 xref: RHEA:15877
@@ -152380,6 +152558,7 @@
 property_value: skos:exactMatch EC:2.6.1.54
 property_value: skos:exactMatch RHEA:15877
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019164
@@ -152560,10 +152739,11 @@
 
 [Term]
 id: GO:0019179
-name: dTDP-4-amino-4,6-dideoxy-D-glucose transaminase activity
+name: dTDP-4-amino-4,6-dideoxy-D-glucose:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dTDP-4-amino-4,6-dideoxy-D-glucose + 2-oxoglutarate = dTDP-4-dehydro-6-deoxy-D-glucose + L-glutamate." [EC:2.6.1.33]
+def: "Catalysis of the reaction: dTDP-4-amino-4,6-dideoxy-D-glucose + 2-oxoglutarate = dTDP-4-dehydro-6-deoxy-D-glucose + L-glutamate." [RHEA:19085]
 synonym: "dTDP-4-amino-4,6-dideoxy-D-glucose aminotransferase activity" EXACT []
+synonym: "dTDP-4-amino-4,6-dideoxy-D-glucose transaminase activity" EXACT []
 synonym: "dTDP-4-amino-4,6-dideoxy-D-glucose:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.33]
 synonym: "TDP-4-keto-6-deoxy-D-glucose transaminase activity" RELATED [EC:2.6.1.33]
 synonym: "TDP-4-oxo-6-deoxy-D-glucose transaminase activity" RELATED [EC:2.6.1.33]
@@ -152578,14 +152758,16 @@
 property_value: skos:exactMatch EC:2.6.1.33
 property_value: skos:exactMatch RHEA:19085
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019180
-name: dTDP-4-amino-4,6-dideoxygalactose transaminase activity
+name: dTDP-4-amino-4,6-dideoxygalactose:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + dTDP-4-amino-4,6-dideoxy-D-galactose = L-glutamate + dTDP-4-dehydro-6-deoxy-D-galactose." [EC:2.6.1.59, RHEA:10368]
+def: "Catalysis of the reaction: dTDP-4-amino-4,6-dideoxy-alpha-D-galactose + 2-oxoglutarate = dTDP-4-dehydro-6-deoxy-alpha-D-glucose + L-glutamate." [RHEA:10368]
 synonym: "dTDP-4,6-dideoxy-D-galactose:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.59]
 synonym: "dTDP-4-amino-4,6-dideoxygalactose aminotransferase activity" RELATED [EC:2.6.1.59]
+synonym: "dTDP-4-amino-4,6-dideoxygalactose transaminase activity" EXACT []
 synonym: "dTDP-fucosamine aminotransferase activity" EXACT []
 synonym: "thymidine diphosphate 4-keto-6-deoxy-D-glucose transaminase activity" RELATED [EC:2.6.1.59]
 synonym: "thymidine diphosphoaminodideoxygalactose aminotransferase activity" RELATED [EC:2.6.1.59]
@@ -152597,6 +152779,7 @@
 property_value: skos:exactMatch EC:2.6.1.59
 property_value: skos:exactMatch RHEA:10368
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019181
@@ -152902,12 +153085,14 @@
 name: regulation of nucleobase-containing compound metabolic process
 namespace: biological_process
 def: "Any cellular process that modulates the frequency, rate or extent of the chemical reactions and pathways involving nucleobases, nucleosides, nucleotides and nucleic acids." [GOC:go_curators]
+subset: gocheck_do_not_annotate
 synonym: "regulation of nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" RELATED [GOC:dph, GOC:tb]
 synonym: "regulation of nucleobase, nucleoside, nucleotide and nucleic acid metabolism" EXACT []
 is_a: GO:0080090 ! regulation of primary metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0006139 ! nucleobase-containing compound metabolic process
 relationship: regulates GO:0006139 ! nucleobase-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 
 [Term]
 id: GO:0019220
@@ -153068,7 +153253,7 @@
 id: GO:0019239
 name: deaminase activity
 namespace: molecular_function
-def: "Catalysis of the removal of an amino group from a substrate, producing a substituted or nonsubstituted ammonia (NH3/NH2R)." [GOC:jl]
+def: "Catalysis of the removal of an amino group from a substrate, producing a substituted or nonsubstituted ammonia (NH4+/NH2R)." [GOC:jl]
 subset: goslim_pir
 xref: Reactome:R-HSA-74241 "ADA catalyzes the deamination of (deoxy)adenosine"
 xref: Reactome:R-HSA-9014641 "HRSP12 deaminates 2AA to 2OBUTA"
@@ -153094,7 +153279,7 @@
 id: GO:0019241
 name: L-citrulline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-citrulline." [GOC:curators]
 synonym: "citrulline breakdown" EXACT []
 synonym: "citrulline catabolism" EXACT []
 synonym: "citrulline degradation" EXACT []
@@ -153103,6 +153288,7 @@
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019242
@@ -153361,6 +153547,7 @@
 is_a: GO:0006054 ! N-acetylneuraminate metabolic process
 is_a: GO:0046348 ! amino sugar catabolic process
 is_a: GO:0046395 ! carboxylic acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
 
 [Term]
 id: GO:0019263
@@ -153382,10 +153569,8 @@
 synonym: "glycine anabolism from serine" EXACT []
 synonym: "glycine formation from serine" EXACT []
 synonym: "glycine synthesis from serine" EXACT []
-xref: MetaCyc:GLYSYN-PWY
 is_a: GO:0006545 ! glycine biosynthetic process
 is_a: GO:0006563 ! L-serine metabolic process
-property_value: skos:exactMatch MetaCyc:GLYSYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
 
 [Term]
@@ -153396,9 +153581,7 @@
 synonym: "glycine anabolism, by transamination of glyoxylate" EXACT []
 synonym: "glycine formation, by transamination of glyoxylate" EXACT []
 synonym: "glycine synthesis, by transamination of glyoxylate" EXACT []
-xref: MetaCyc:GLYSYN-ALA-PWY
 is_a: GO:0006545 ! glycine biosynthetic process
-property_value: skos:exactMatch MetaCyc:GLYSYN-ALA-PWY
 
 [Term]
 id: GO:0019266
@@ -153408,7 +153591,6 @@
 synonym: "asparagine anabolism from oxaloacetate" EXACT []
 synonym: "asparagine formation from oxaloacetate" EXACT []
 synonym: "asparagine synthesis from oxaloacetate" EXACT []
-xref: MetaCyc:ASPARAGINE-BIOSYNTHESIS
 is_a: GO:0006107 ! oxaloacetate metabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
 is_a: GO:0070981 ! L-asparagine biosynthetic process
@@ -153422,7 +153604,6 @@
 synonym: "asparagine anabolism from cysteine" EXACT []
 synonym: "asparagine formation from cysteine" EXACT []
 synonym: "asparagine synthesis from cysteine" EXACT []
-xref: MetaCyc:ASPSYNII-PWY
 is_a: GO:0046439 ! L-cysteine metabolic process
 is_a: GO:0070981 ! L-asparagine biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31281" xsd:anyURI
@@ -153477,14 +153658,12 @@
 id: GO:0019272
 name: L-alanine biosynthetic process from pyruvate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of alanine from other compounds, including pyruvate." [GOC:go_curators, MetaCyc:ALANINE-SYN2-PWY]
+def: "The chemical reactions and pathways resulting in the formation of alanine from other compounds, including pyruvate." [GOC:go_curators]
 synonym: "L-alanine anabolism from pyruvate" EXACT []
 synonym: "L-alanine formation from pyruvate" EXACT []
 synonym: "L-alanine synthesis from pyruvate" EXACT []
-xref: MetaCyc:ALANINE-SYN2-PWY
 is_a: GO:0006090 ! pyruvate metabolic process
 is_a: GO:0042852 ! L-alanine biosynthetic process
-property_value: skos:exactMatch MetaCyc:ALANINE-SYN2-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
 
 [Term]
@@ -153548,7 +153727,6 @@
 synonym: "L-methionine formation from L-homoserine via cystathionine" EXACT [GOC:mah]
 synonym: "L-methionine synthesis from L-homoserine via cystathionine" EXACT [GOC:mah]
 synonym: "methionine biosynthetic process from L-homoserine via cystathionine" EXACT [GOC:mah]
-xref: MetaCyc:HOMOSER-METSYN-PWY
 is_a: GO:0009092 ! L-homoserine metabolic process
 is_a: GO:0071265 ! L-methionine biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -153559,7 +153737,6 @@
 name: L-methionine biosynthetic process from L-homoserine via O-acetyl-L-homoserine
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of methionine from L-homoserine, via the intermediate O-acetyl-L-homoserine using sulfur from hydrogen sulfide assimilation." [MetaCyc:HSERMETANA-PWY]
-xref: MetaCyc:HSERMETANA-PWY
 is_a: GO:0009092 ! L-homoserine metabolic process
 is_a: GO:0071265 ! L-methionine biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -153570,12 +153747,11 @@
 id: GO:0019281
 name: L-methionine biosynthetic process from homoserine via O-succinyl-L-homoserine and cystathionine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-methionine from other compounds, including homoserine, via the intermediates O-succinyl-L-homoserine and cystathionine." [MetaCyc:MET-SAM-PWY]
+def: "The chemical reactions and pathways resulting in the formation of L-methionine from other compounds, including homoserine, via the intermediates O-succinyl-L-homoserine and cystathionine." [GOC:curators]
 synonym: "L-methionine anabolism from homoserine via O-succinyl-L-homoserine and cystathionine" EXACT [GOC:mah]
 synonym: "L-methionine formation from homoserine via O-succinyl-L-homoserine and cystathionine" EXACT [GOC:mah]
 synonym: "L-methionine synthesis from homoserine via O-succinyl-L-homoserine and cystathionine" EXACT [GOC:mah]
 synonym: "methionine biosynthetic process from homoserine via O-succinyl-L-homoserine and cystathionine" EXACT [GOC:mah]
-xref: MetaCyc:MET-SAM-PWY
 is_a: GO:0019279 ! L-methionine biosynthetic process from L-homoserine via cystathionine
 
 [Term]
@@ -153586,7 +153762,6 @@
 synonym: "L-methionine formation from O-phospho-L-homoserine and cystathionine" EXACT [GOC:mah]
 synonym: "L-methionine synthesis from O-phospho-L-homoserine and cystathionine" EXACT [GOC:mah]
 synonym: "methionine biosynthetic process from O-phospho-L-homoserine and cystathionine" EXACT [GOC:mah]
-xref: MetaCyc:PWY-702
 is_a: GO:0006575 ! modified amino acid metabolic process
 is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0009092 ! L-homoserine metabolic process
@@ -153601,9 +153776,16 @@
 def: "The chemical reactions and pathways resulting in the formation of L-methionine from S-adenosylmethionine." [GOC:go_curators, GOC:vw, PMID:31950558]
 synonym: "L-methionine formation from S-adenosylmethionine" EXACT [GOC:mah]
 synonym: "L-methionine synthesis from S-adenosylmethionine" EXACT [GOC:mah]
+xref: MetaCyc:PWY-7270
+xref: MetaCyc:PWY-7527
+xref: MetaCyc:PWY-7528
 is_a: GO:0071267 ! L-methionine salvage
 relationship: part_of GO:0033353 ! S-adenosylmethionine cycle
+property_value: skos:narrowMatch MetaCyc:PWY-7270
+property_value: skos:narrowMatch MetaCyc:PWY-7527
+property_value: skos:narrowMatch MetaCyc:PWY-7528
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29900" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0019285
@@ -153725,7 +153907,6 @@
 synonym: "L-tyrosine formation from chorismate via 4-hydroxyphenylpyruvate" EXACT []
 synonym: "L-tyrosine synthesis from chorismate via 4-hydroxyphenylpyruvate" EXACT []
 synonym: "tyrosine biosynthetic process from chorismate via 4-hydroxyphenylpyruvate" BROAD []
-xref: MetaCyc:TYRSYN
 is_a: GO:0006571 ! L-tyrosine biosynthetic process
 is_a: GO:0046417 ! chorismate metabolic process
 
@@ -153739,7 +153920,6 @@
 synonym: "tyrosine anabolism, by oxidation of phenylalanine" EXACT []
 synonym: "tyrosine formation, by oxidation of phenylalanine" EXACT []
 synonym: "tyrosine synthesis, by oxidation of phenylalanine" EXACT []
-xref: MetaCyc:PWY-6134
 is_a: GO:0006571 ! L-tyrosine biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20583" xsd:anyURI
 
@@ -154319,13 +154499,11 @@
 id: GO:0019343
 name: L-cysteine biosynthetic process via L-cystathionine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-cysteine, via the intermediate L-cystathionine." [GOC:go_curators, MetaCyc:HOMOCYSDEGR-PWY]
+def: "The chemical reactions and pathways resulting in the formation of L-cysteine, via the intermediate L-cystathionine." [GOC:go_curators]
 synonym: "cysteine anabolism via cystathionine" EXACT []
 synonym: "cysteine formation via cystathionine" EXACT []
 synonym: "cysteine synthesis via cystathionine" EXACT []
-xref: MetaCyc:HOMOCYSDEGR-PWY
 is_a: GO:0019344 ! L-cysteine biosynthetic process
-property_value: skos:exactMatch MetaCyc:HOMOCYSDEGR-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31281" xsd:anyURI
 
 [Term]
@@ -154337,26 +154515,41 @@
 synonym: "cysteine biosynthesis" EXACT []
 synonym: "cysteine formation" EXACT []
 synonym: "cysteine synthesis" EXACT []
+xref: MetaCyc:CYSTSYN-PWY
+xref: MetaCyc:HOMOCYSDEGR-PWY
+xref: MetaCyc:PWY-6308
+xref: MetaCyc:PWY-7289
+xref: MetaCyc:PWY-7870
+xref: MetaCyc:PWY-8009
+xref: MetaCyc:PWY-8010
+xref: MetaCyc:PWY-I9
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0046439 ! L-cysteine metabolic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:CYSTSYN-PWY
+property_value: skos:narrowMatch MetaCyc:HOMOCYSDEGR-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-6308
+property_value: skos:narrowMatch MetaCyc:PWY-7289
+property_value: skos:narrowMatch MetaCyc:PWY-7870
+property_value: skos:narrowMatch MetaCyc:PWY-8009
+property_value: skos:narrowMatch MetaCyc:PWY-8010
+property_value: skos:narrowMatch MetaCyc:PWY-I9
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31281" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0019345
 name: L-cysteine biosynthetic process via S-sulfo-L-cysteine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-cysteine, via the intermediate S-sulfo-L-cysteine." [MetaCyc:PWY-7289]
+def: "The chemical reactions and pathways resulting in the formation of L-cysteine, via the intermediate S-sulfo-L-cysteine." [GOC:curators]
 synonym: "cysteine anabolism via S-sulfo-L-cysteine" EXACT []
 synonym: "cysteine biosynthesis via S-sulpho-L-cysteine" EXACT []
 synonym: "cysteine biosynthetic process via S-sulpho-L-cysteine" EXACT []
 synonym: "cysteine formation via S-sulfo-L-cysteine" EXACT []
 synonym: "cysteine synthesis via S-sulfo-L-cysteine" EXACT []
-xref: MetaCyc:PWY-7289
 is_a: GO:0019344 ! L-cysteine biosynthetic process
-property_value: skos:exactMatch MetaCyc:PWY-7289
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31281" xsd:anyURI
 
 [Term]
@@ -155078,7 +155271,7 @@
 id: GO:0019409
 name: aerobic respiration, using ammonia as electron donor
 namespace: biological_process
-def: "The metabolic process in which ammonia (NH3) is oxidized to nitrite (NO2) in the presence of oxygen; enzymatic reactions convert ammonia to hydrazine, and hydrazine to nitrite." [MetaCyc:AMMOXID-PWY]
+def: "The metabolic process in which ammonia (NH4+) is oxidized to nitrite (NO2) in the presence of oxygen; enzymatic reactions convert ammonia to hydrazine, and hydrazine to nitrite." [MetaCyc:AMMOXID-PWY]
 synonym: "aerobic ammonia oxidation to nitrite via hydrazine" EXACT [GOC:mah]
 synonym: "nitrification" RELATED []
 xref: MetaCyc:AMMOXID-PWY
@@ -155500,21 +155693,21 @@
 
 [Term]
 id: GO:0019447
-name: D-cysteine catabolic process
+name: obsolete D-cysteine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-cysteine, (S)-2-amino-3-mercaptopropanoic acid, which occurs naturally in firefly luciferin." [PMID:11527960]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of D-cysteine, (S)-2-amino-3-mercaptopropanoic acid, which occurs naturally in firefly luciferin." [PMID:11527960]
+comment: This term was obsoleted because there is no evidence that there is a specific pathway to degrade D-cysteine.
 synonym: "D-cysteine breakdown" EXACT []
 synonym: "D-cysteine catabolism" EXACT []
 synonym: "D-cysteine degradation" EXACT []
-is_a: GO:0000098 ! sulfur amino acid catabolic process
-is_a: GO:0006534 ! cysteine metabolic process
-is_a: GO:0019478 ! D-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0019448
 name: L-cysteine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-cysteine, the L-enantiomer of 2-amino-3-mercaptopropanoic acid, i.e. (2R)-2-amino-3-mercaptopropanoic acid." [GOC:jsg, GOC:mah]
+def: "The chemical reactions and pathways resulting in the breakdown of L-cysteine." [GOC:curators]
 synonym: "L-cysteine breakdown" EXACT []
 synonym: "L-cysteine catabolism" EXACT []
 synonym: "L-cysteine degradation" EXACT []
@@ -155529,6 +155722,7 @@
 property_value: skos:narrowMatch MetaCyc:LCYSDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5329
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019449
@@ -155556,14 +155750,15 @@
 
 [Term]
 id: GO:0019451
-name: L-cysteine catabolic process to pyruvate, using cysteine dioxygenase
+name: obsolete L-cysteine catabolic process to pyruvate, using cysteine dioxygenase
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown into pyruvate of L-cystine, catalyzed by the enzyme cysteine dioxygenase (EC:1.13.11.20)." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown into pyruvate of L-cystine, catalyzed by the enzyme cysteine dioxygenase (EC:1.13.11.20)." [GOC:jl]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-cysteine breakdown to pyruvate, using cysteine dioxygenase" EXACT []
 synonym: "L-cysteine degradation to pyruvate, using cysteine dioxygenase" EXACT []
-is_a: GO:0006090 ! pyruvate metabolic process
-is_a: GO:0019448 ! L-cysteine catabolic process
-relationship: has_part GO:0017172 ! cysteine dioxygenase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019448
 
 [Term]
 id: GO:0019452
@@ -155596,34 +155791,40 @@
 
 [Term]
 id: GO:0019454
-name: L-cysteine catabolic process via cystine, using glutathione-cystine transhydrogenase
+name: obsolete L-cysteine catabolic process via cystine, using glutathione-cystine transhydrogenase
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme glutathione-cystine transhydrogenase." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme glutathione-cystine transhydrogenase." [GOC:jl]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-cysteine breakdown via cystine, using glutathione-cystine transhydrogenase" EXACT []
 synonym: "L-cysteine degradation via cystine, using glutathione-cystine transhydrogenase" EXACT []
-is_a: GO:0019448 ! L-cysteine catabolic process
-relationship: has_part GO:0047141 ! glutathione-cystine transhydrogenase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019448
 
 [Term]
 id: GO:0019455
-name: L-cysteine catabolic process via cystine, using cystine reductase
+name: obsolete L-cysteine catabolic process via cystine, using cystine reductase
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme cystine reductase." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme cystine reductase." [GOC:jl]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-cysteine breakdown via cystine, using cystine reductase" EXACT []
 synonym: "L-cysteine degradation via cystine, using cystine reductase" EXACT []
-is_a: GO:0019448 ! L-cysteine catabolic process
-relationship: has_part GO:0050456 ! L-cystine reductase (NADH) activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019448
 
 [Term]
 id: GO:0019456
-name: L-cysteine catabolic process via cystine, using cysteine transaminase
+name: obsolete L-cysteine catabolic process via cystine, using cysteine transaminase
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme cysteine transaminase." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown, via the compound cystine, of L-cysteine, catalyzed by the enzyme cysteine transaminase." [GOC:jl]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-cysteine breakdown via cystine, using cysteine transaminase" EXACT []
 synonym: "L-cysteine degradation via cystine, using cysteine transaminase" EXACT []
-is_a: GO:0019448 ! L-cysteine catabolic process
-relationship: has_part GO:0047801 ! L-cysteine transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22538" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019448
 
 [Term]
 id: GO:0019457
@@ -155722,26 +155923,30 @@
 
 [Term]
 id: GO:0019466
-name: L-ornithine catabolic process via proline
+name: obsolete L-ornithine catabolic process via proline
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine, via the intermediate proline." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-ornithine, via the intermediate proline." [GOC:go_curators]
+comment: This term was obsoleted because it represents a variant pathway of L-ornithine degradation and is out of scope for GO.
 synonym: "ornithine breakdown via proline" EXACT []
 synonym: "ornithine degradation via proline" EXACT []
-xref: MetaCyc:ORN-AMINOPENTANOATE-CAT-PWY
-is_a: GO:0006593 ! L-ornithine catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0006593
 
 [Term]
 id: GO:0019467
-name: L-ornithine catabolic process, by decarboxylation
+name: obsolete L-ornithine catabolic process, by decarboxylation
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine by decarboxylation." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-ornithine by decarboxylation." [GOC:go_curators]
+comment: This term was obsoleted because it represents a variant pathway of L-ornithine degradation and is out of scope for GO.
 synonym: "ornithine breakdown, by decarboxylation" EXACT []
 synonym: "ornithine degradation, by decarboxylation" EXACT []
 xref: MetaCyc:ORNDEG-PWY
-is_a: GO:0006593 ! L-ornithine catabolic process
-relationship: has_part GO:0016831 ! carboxy-lyase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0006593
 
 [Term]
 id: GO:0019468
@@ -155771,7 +155976,7 @@
 id: GO:0019470
 name: trans-4-hydroxy-L-proline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of trans-4-hydroxy-L-proline, C5H9NO3, a derivative of the amino acid proline." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of trans-4-hydroxy-L-proline." [GOC:curators]
 synonym: "4-hydroxyproline breakdown" EXACT []
 synonym: "4-hydroxyproline catabolism" EXACT []
 synonym: "4-hydroxyproline degradation" EXACT []
@@ -155784,6 +155989,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5159
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019471
@@ -155852,20 +156058,21 @@
 
 [Term]
 id: GO:0019476
-name: D-lysine catabolic process
+name: obsolete D-lysine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-lysine, the D-enantiomer of lysine; i.e. (2R)-2,6-diaminohexanoic acid." [GOC:ai, GOC:jsg, GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of D-lysine, the D-enantiomer of lysine; i.e. (2R)-2,6-diaminohexanoic acid." [GOC:ai, GOC:jsg, GOC:mah]
+comment: This term was obsoleted because there is no evidence that there is a specific pathway to degrade D-lysine.
 synonym: "D-lysine breakdown" EXACT []
 synonym: "D-lysine catabolism" EXACT []
 synonym: "D-lysine degradation" EXACT []
-is_a: GO:0006553 ! lysine metabolic process
-is_a: GO:0019478 ! D-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0019477
 name: L-lysine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-lysine, the L-enantiomer of (S)-2,6-diaminohexanoic acid." [GOC:go_curators, GOC:jsg, GOC:mah]
+def: "The chemical reactions and pathways resulting in the breakdown of L-lysine." [GOC:curators]
 synonym: "L-lysine breakdown" EXACT []
 synonym: "L-lysine catabolism" EXACT []
 synonym: "L-lysine degradation" EXACT []
@@ -155889,6 +156096,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY0-461
 property_value: skos:narrowMatch MetaCyc:PWY66-425
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019478
@@ -155952,15 +156160,26 @@
 synonym: "beta-alanine biosynthesis" EXACT []
 synonym: "beta-alanine formation" EXACT []
 synonym: "beta-alanine synthesis" EXACT []
+xref: MetaCyc:PWY-3941
+xref: MetaCyc:PWY-3981
+xref: MetaCyc:PWY-3982
+xref: MetaCyc:PWY-5155
+xref: MetaCyc:PWY-5760
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-3941
+property_value: skos:narrowMatch MetaCyc:PWY-3981
+property_value: skos:narrowMatch MetaCyc:PWY-3982
+property_value: skos:narrowMatch MetaCyc:PWY-5155
+property_value: skos:narrowMatch MetaCyc:PWY-5760
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 
 [Term]
 id: GO:0019484
 name: beta-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine (3-aminopropanoic acid), an achiral amino acid and an isomer of alanine. It occurs free (e.g. in brain) and in combination (e.g. in pantothenate) but it is not a constituent of proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine." [GOC:curators]
 synonym: "beta-alanine breakdown" EXACT []
 synonym: "beta-alanine catabolism" EXACT []
 synonym: "beta-alanine degradation" EXACT []
@@ -155974,25 +156193,31 @@
 property_value: skos:narrowMatch MetaCyc:PWY-1781
 property_value: skos:narrowMatch MetaCyc:PWY-8120
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019485
-name: beta-alanine catabolic process to L-alanine
+name: obsolete beta-alanine catabolic process to L-alanine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine into other compounds, including L-alanine." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of beta-alanine into other compounds, including L-alanine." [GOC:go_curators]
+comment: This term was obsoleted because it represents a variant pathway of beta-alanine degradation and is out of scope for GO.
 synonym: "beta-alanine breakdown to L-alanine" EXACT []
 synonym: "beta-alanine degradation to L-alanine" EXACT []
-is_a: GO:0019484 ! beta-alanine catabolic process
-is_a: GO:0042851 ! L-alanine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019484
 
 [Term]
 id: GO:0019486
-name: beta-alanine catabolic process to mevalonate semialdehyde, by transamination
+name: obsolete beta-alanine catabolic process to mevalonate semialdehyde, by transamination
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine into other compounds, including mevalonate semialdehyde, by transamination." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of beta-alanine into other compounds, including mevalonate semialdehyde, by transamination." [GOC:go_curators]
+comment: This term was obsoleted because it represents a variant pathway of beta-alanine degradation and is out of scope for GO.
 synonym: "beta-alanine breakdown to mevalonate semialdehyde, by transamination" EXACT []
 synonym: "beta-alanine degradation to mevalonate semialdehyde, by transamination" EXACT []
-is_a: GO:0019484 ! beta-alanine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019484
 
 [Term]
 id: GO:0019487
@@ -156185,7 +156410,7 @@
 id: GO:0019504
 name: L-proline betaine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of stachydrine, N-methylproline methylbetaine, the betaine derivative of L-proline." [PMID:10689197, PMID:1804402, PMID:24520058]
+def: "The chemical reactions and pathways resulting in the breakdown of L-proline betaine (stachydrine)." [PMID:10689197, PMID:1804402, PMID:24520058]
 synonym: "stachydrine breakdown" EXACT []
 synonym: "stachydrine catabolic process" EXACT []
 synonym: "stachydrine catabolism" EXACT []
@@ -156200,6 +156425,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8109
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23577" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019505
@@ -156257,15 +156483,11 @@
 id: GO:0019509
 name: L-methionine salvage from methylthioadenosine
 namespace: biological_process
-def: "The generation of L-methionine (2-amino-4-(methylthio)butanoic acid) from methylthioadenosine." [GOC:jl, MetaCyc:PWY-4361, PMID:19946895]
+def: "The generation of L-methionine (2-amino-4-(methylthio)butanoic acid) from methylthioadenosine." [GOC:jl, PMID:19946895]
 synonym: "methionine recycling" NARROW []
 synonym: "methionine regeneration" NARROW []
 synonym: "methionine salvage from methylthioadenosine" EXACT [GOC:mah]
 synonym: "methionine salvage pathway" EXACT []
-xref: MetaCyc:PWY-4361
-xref: MetaCyc:PWY-6753
-xref: MetaCyc:PWY-6754
-xref: MetaCyc:PWY-6756
 xref: Reactome:R-HSA-1237112 "Methionine salvage pathway"
 is_a: GO:0071267 ! L-methionine salvage
 
@@ -156754,29 +156976,28 @@
 
 [Term]
 id: GO:0019552
-name: L-glutamate fermentation via 2-hydroxyglutarate
+name: obsolete L-glutamate fermentation via 2-hydroxyglutarate
 namespace: biological_process
-def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-glutamate, via the intermediate 2-hydroxyglutarate, yielding acetyl-CoA and butanoate. Acetyl-CoA can be further converted into acetate, releasing one ATP molecule." [PMID:17166837]
+def: "OBSOLETE. The anaerobic chemical reactions and pathways resulting in the breakdown of L-glutamate, via the intermediate 2-hydroxyglutarate, yielding acetyl-CoA and butanoate. Acetyl-CoA can be further converted into acetate, releasing one ATP molecule." [PMID:17166837]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-glutamate catabolic process via 2-hydroxyglutarate" EXACT []
-xref: MetaCyc:P162-PWY
-is_a: GO:0006538 ! L-glutamate catabolic process
-is_a: GO:0019665 ! amino acid fermentation
-property_value: skos:narrowMatch MetaCyc:P162-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29511" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0033508
 
 [Term]
 id: GO:0019553
-name: L-glutamate fermentation via L-citramalate
+name: obsolete L-glutamate fermentation via L-citramalate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate, via the intermediate L-citramalate." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-glutamate, via the intermediate L-citramalate." [GOC:go_curators]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "glutamate breakdown via L-citramalate" EXACT []
 synonym: "glutamate degradation via L-citramalate" EXACT []
 synonym: "L-glutamate catabolic process via L-citramalate" EXACT []
-xref: MetaCyc:GLUDEG-II-PWY
-is_a: GO:0006538 ! L-glutamate catabolic process
-is_a: GO:0019665 ! amino acid fermentation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0033508
 
 [Term]
 id: GO:0019554
@@ -158022,7 +158243,7 @@
 id: GO:0019665
 name: amino acid fermentation
 namespace: biological_process
-def: "The anaerobic chemical reactions and pathways resulting in the breakdown of amino acids to ammonia, CO2, H2, acetate and short chain fatty acids, under anoxic conditions." [GOC:curators, GOC:jl]
+def: "The anaerobic chemical reactions and pathways resulting in the breakdown of amino acids to ammonia, CO2, H2, acetate and short chain fatty acids, under anoxic conditions." [PMID:38821505]
 synonym: "anaerobic amino acid catabolic process" EXACT []
 is_a: GO:0006113 ! fermentation
 is_a: GO:0009063 ! amino acid catabolic process
@@ -158042,7 +158263,7 @@
 id: GO:0019667
 name: L-alanine fermentation
 namespace: biological_process
-def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-alanine, yielding acetylCoA. AcetylCoA can be further converted to ATP." [GOC:jl]
+def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-alanine, yielding acetylCoA. AcetylCoA can be further converted to ATP." [GOC:jl, PMID:38821505]
 synonym: "anaerobic L-alanine catabolic process" EXACT []
 xref: MetaCyc:PROPFERM-PWY
 xref: MetaCyc:PWY-8188
@@ -158093,13 +158314,11 @@
 name: obsolete glutamate catabolic process via mesaconate and citramalate
 namespace: biological_process
 def: "OBSOLETE. The anaerobic chemical reactions and pathways resulting in the breakdown of glutamate via the intermediates mesaconate and S-citramalate, yielding energy in the form of ATP." [GOC:rynl]
-comment: The reason for obsoletion is that this term is an unnecessary grouping term.
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "glutamate fermentation via mesaconate and citramalate" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28390" xsd:anyURI
 is_obsolete: true
-consider: GO:0019553
 consider: GO:0033508
-consider: GO:0033509
 
 [Term]
 id: GO:0019672
@@ -160621,12 +160840,9 @@
 alt_id: GO:0030349
 alt_id: GO:0050430
 alt_id: GO:0051535
-def: "Binding to a syntaxin, a SNAP receptor involved in the docking of synaptic vesicles at the presynaptic zone of a synapse." [ISBN:0198506732]
-synonym: "syntaxin-13 binding" NARROW []
-synonym: "syntaxin-2 binding" NARROW []
-synonym: "syntaxin-5 binding" NARROW []
-synonym: "syntaxin-6 binding" NARROW []
+def: "Binding to a syntaxin, a SNAP receptor involved in the docking of vesicles." [ISBN:0198506732]
 is_a: GO:0000149 ! SNARE binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31404" xsd:anyURI
 
 [Term]
 id: GO:0019907
@@ -169870,6 +170086,7 @@
 subset: goslim_generic
 subset: goslim_pombe
 subset: goslim_prokaryote
+subset: goslim_yeast
 synonym: "cellular protein breakdown" EXACT []
 synonym: "cellular protein catabolic process" EXACT []
 synonym: "cellular protein catabolism" EXACT []
@@ -172576,26 +172793,28 @@
 id: GO:0030418
 name: nicotianamine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of nicotianamine, 2(S),3'2(S),3''(S)-N-(N-(3-amino-3-carboxypropyl)-3-amino-3-carboxypropyl)-azetidine-2-carboxylic acid." [GOC:mah, PMID:10069850]
+def: "The chemical reactions and pathways resulting in the formation of nicotianamine." [GOC:curators, PMID:10069850]
 synonym: "nicotianamine anabolism" EXACT []
 synonym: "nicotianamine biosynthesis" EXACT []
 synonym: "nicotianamine formation" EXACT []
 synonym: "nicotianamine synthesis" EXACT []
+xref: MetaCyc:PWY-5957
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0042401 ! biogenic amine biosynthetic process
 is_a: GO:0072351 ! tricarboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 
 [Term]
 id: GO:0030419
-name: nicotianamine catabolic process
+name: obsolete nicotianamine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of nicotianamine, 2(S),3'2(S),3''(S)-N-(N-(3-amino-3-carboxypropyl)-3-amino-3-carboxypropyl)-azetidine-2-carboxylic acid." [GOC:mah, PMID:10069850]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of nicotianamine, 2(S),3'2(S),3''(S)-N-(N-(3-amino-3-carboxypropyl)-3-amino-3-carboxypropyl)-azetidine-2-carboxylic acid." [GOC:mah, PMID:10069850]
+comment: This term was obsoleted because there is no evidence that a specific pathway for nicotianamine degradation exists.
 synonym: "nicotianamine breakdown" EXACT []
 synonym: "nicotianamine catabolism" EXACT []
 synonym: "nicotianamine degradation" EXACT []
-is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0042402 ! biogenic amine catabolic process
-is_a: GO:0072352 ! tricarboxylic acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0030420
@@ -174632,7 +174851,6 @@
 synonym: "D-alanine formation" EXACT []
 synonym: "D-alanine synthesis" EXACT []
 is_a: GO:0006523 ! alanine biosynthetic process
-is_a: GO:0046436 ! D-alanine metabolic process
 is_a: GO:0046437 ! D-amino acid biosynthetic process
 
 [Term]
@@ -175777,7 +175995,7 @@
 id: GO:0030738
 name: tyramine N-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-adenosyl-L-methionine + tyramine = N-methyltyramine + S-adenosyl-L-homocysteine + H+." [EC:2.1.1.27, RHEA:14865]
+def: "Catalysis of the reaction: S-adenosyl-L-methionine + tyramine = N-methyltyramine + S-adenosyl-L-homocysteine + H+." [RHEA:14865]
 synonym: "DIB O-methyltransferase (3,5-diiodo-4-hydroxy-benzoic acid)" RELATED [EC:2.1.1.27]
 synonym: "S-adenosyl-L-methionine:tyramine N-methyltransferase activity" RELATED [EC:2.1.1.27]
 synonym: "S-adenosyl-methionine:tyramine N-methyltransferase activity" RELATED [EC:2.1.1.27]
@@ -175858,9 +176076,10 @@
 
 [Term]
 id: GO:0030743
-name: 23S rRNA (adenosine(1067)-2'-O)-methyltransferase activity
+name: 23S rRNA (adenosine(1067)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: adenosine(1067) in 23S rRNA + S-adenosyl-L-methionine = 2'-O-methyladenosine(1067) in 23S rRNA + H+ + S-adenosyl-L-homocysteine." [EC:2.1.1.230]
+synonym: "23S rRNA (adenosine(1067)-2'-O)-methyltransferase activity" EXACT []
 synonym: "ribosomal ribonucleate adenosine 2'-methyltransferase activity" RELATED [EC:2.1.1.230]
 synonym: "RNA-pentose methylase activity" RELATED []
 synonym: "rRNA adenosine 2'-methylase activity" RELATED [EC:2.1.1.230]
@@ -176329,7 +176548,7 @@
 id: GO:0030772
 name: tryptophan 2-C-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-adenosyl-L-methionine(1+) + L-tryptophan = S-adenosyl-L-homocysteine + L-2-methyltryptophan + H+." [EC:2.1.1.106, RHEA:17321]
+def: "Catalysis of the reaction: L-tryptophan + S-adenosyl-L-methionine = 2-methyl-L-tryptophan + S-adenosyl-L-homocysteine + H+." [RHEA:17321]
 synonym: "S-adenosyl-L-methionine:L-tryptophan 2-C-methyltransferase activity" RELATED [EC:2.1.1.106]
 synonym: "S-adenosylmethionine:tryptophan 2-methyltransferase activity" RELATED [EC:2.1.1.106]
 synonym: "tryptophan 2-methyltransferase activity" RELATED [EC:2.1.1.106]
@@ -180003,12 +180222,14 @@
 name: organelle membrane
 namespace: cellular_component
 def: "A membrane that is one of the two lipid bilayers of an organelle envelope or the outermost membrane of single membrane bound organelle." [GOC:dos, GOC:mah]
+subset: gocheck_do_not_annotate
 synonym: "intracellular membrane" RELATED [NIF_Subcellular:sao830981606]
 xref: NIF_Subcellular:sao830981606
 is_a: GO:0016020 ! membrane
 intersection_of: GO:0016020 ! membrane
 intersection_of: part_of GO:0043227 ! membrane-bounded organelle
 relationship: part_of GO:0043227 ! membrane-bounded organelle
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31446" xsd:anyURI
 
 [Term]
 id: GO:0031091
@@ -181376,24 +181597,26 @@
 id: GO:0031240
 name: external side of cell outer membrane
 namespace: cellular_component
-def: "The side of the outer membrane that is opposite to the side that faces the periplasm of the cell." [GOC:mlg, GOC:mtg_sensu]
+def: "The leaflet of the outer membrane that is opposite to the side that faces the periplasm of the cell, including any protein embedded in, attached to, or peripherally associated with it." [GOC:mlg, GOC:mtg_sensu]
 comment: In GO, 'external side' still refers to part of the membrane and does not refer to components beyond (outside of) the membrane.
 synonym: "external leaflet of cell outer membrane" EXACT [GOC:ab]
 synonym: "external side of outer membrane" RELATED []
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0009279 ! cell outer membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0031241
 name: periplasmic side of cell outer membrane
 namespace: cellular_component
-def: "The side (leaflet) of the outer membrane that faces the periplasm of the cell." [GOC:mlg, GOC:mtg_sensu]
+def: "The leaflet of a outer cell membrane that faces the periplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:mlg, GOC:mtg_sensu]
 comment: In GO, 'internal side' still refers to part of the membrane and does not refer to components beyond (inside of) the membrane.
 synonym: "internal leaflet of cell outer membrane" EXACT [GOC:ab]
 synonym: "internal side of cell outer membrane" EXACT []
 synonym: "internal side of outer membrane" EXACT []
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0009279 ! cell outer membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0031242
@@ -182055,9 +182278,10 @@
 
 [Term]
 id: GO:0031299
-name: taurine-pyruvate aminotransferase activity
+name: taurine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pyruvate + taurine = L-alanine + sulfoacetaldehyde." [PMID:11082195, RHEA:10420]
+def: "Catalysis of the reaction: taurine + pyruvate = sulfoacetaldehyde + L-alanine." [PMID:11082195, RHEA:10420]
+synonym: "taurine-pyruvate aminotransferase activity" EXACT []
 synonym: "taurine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.77]
 synonym: "Tpa" RELATED [EC:2.6.1.77]
 xref: EC:2.6.1.77
@@ -182068,6 +182292,7 @@
 property_value: skos:exactMatch EC:2.6.1.77
 property_value: skos:exactMatch RHEA:10420
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0031300
@@ -183251,7 +183476,6 @@
 name: regulation of protein modification process
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the covalent alteration of one or more amino acid residues within a protein." [GOC:mah, GOC:tb]
-subset: goslim_yeast
 is_a: GO:0051246 ! regulation of protein metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0036211 ! protein modification process
@@ -194344,7 +194568,7 @@
 id: GO:0032473
 name: cytoplasmic side of mitochondrial outer membrane
 namespace: cellular_component
-def: "The external (cytoplasmic) face of the mitochondrial outer membrane." [GOC:mah]
+def: "The leaflet of the mitochondrial outer membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:mah]
 comment: In GO, 'external side' still refers to part of the membrane and does not refer to components beyond (outside of) the membrane.
 synonym: "cytosolic side of mitochondrial outer membrane" EXACT []
 synonym: "external leaflet of mitochondrial outer membrane" EXACT [GOC:ab]
@@ -194352,6 +194576,7 @@
 synonym: "external side of mitochondrial outer membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0005741 ! mitochondrial outer membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0032474
@@ -199397,64 +199622,34 @@
 
 [Term]
 id: GO:0032847
-name: regulation of cellular pH reduction
+name: obsolete regulation of cellular pH reduction
 namespace: biological_process
-def: "Any process that modulates the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
-synonym: "regulation of cell pH reduction" EXACT []
-synonym: "regulation of cellular acidification" EXACT []
-synonym: "regulation of intracellular acidification" RELATED []
-synonym: "regulation of intracellular pH reduction" EXACT []
-synonym: "regulation of reduction of cellular pH" EXACT []
-synonym: "regulation of reduction of pH in cell" EXACT []
-is_a: GO:0050789 ! regulation of biological process
-is_a: GO:0051453 ! regulation of intracellular pH
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0051452 ! intracellular pH reduction
-relationship: regulates GO:0051452 ! intracellular pH reduction
+def: "OBSOLETE. Any process that modulates the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
+comment: This term was obsoleted because it represents 'regulation of regulation', which is redundant with direct pH regulation terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+consider: GO:0051452
+consider: GO:0051454
 
 [Term]
 id: GO:0032848
-name: negative regulation of cellular pH reduction
+name: obsolete negative regulation of cellular pH reduction
 namespace: biological_process
-def: "Any process that stops, prevents, or reduces the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
-synonym: "down regulation of cellular pH reduction" EXACT []
-synonym: "down-regulation of cellular pH reduction" EXACT []
-synonym: "downregulation of cellular pH reduction" EXACT []
-synonym: "inhibition of cellular pH reduction" NARROW []
-synonym: "negative regulation of cell pH reduction" EXACT []
-synonym: "negative regulation of cellular acidification" EXACT []
-synonym: "negative regulation of intracellular acidification" RELATED []
-synonym: "negative regulation of intracellular pH reduction" EXACT []
-synonym: "negative regulation of reduction of cellular pH" EXACT []
-synonym: "negative regulation of reduction of pH in cell" EXACT []
-is_a: GO:0032847 ! regulation of cellular pH reduction
-is_a: GO:0048519 ! negative regulation of biological process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0051452 ! intracellular pH reduction
-relationship: negatively_regulates GO:0051452 ! intracellular pH reduction
+def: "OBSOLETE. Any process that stops, prevents, or reduces the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
+comment: This term was obsoleted because it represents 'regulation of regulation', which is redundant with direct pH regulation terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0051454
 
 [Term]
 id: GO:0032849
-name: positive regulation of cellular pH reduction
+name: obsolete positive regulation of cellular pH reduction
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
-synonym: "activation of cellular pH reduction" NARROW []
-synonym: "positive regulation of cell pH reduction" EXACT []
-synonym: "positive regulation of cellular acidification" EXACT []
-synonym: "positive regulation of intracellular acidification" RELATED []
-synonym: "positive regulation of intracellular pH reduction" EXACT []
-synonym: "positive regulation of reduction of cellular pH" EXACT []
-synonym: "positive regulation of reduction of pH in cell" EXACT []
-synonym: "stimulation of cellular pH reduction" NARROW []
-synonym: "up regulation of cellular pH reduction" EXACT []
-synonym: "up-regulation of cellular pH reduction" EXACT []
-synonym: "upregulation of cellular pH reduction" EXACT []
-is_a: GO:0032847 ! regulation of cellular pH reduction
-is_a: GO:0048518 ! positive regulation of biological process
-is_a: GO:0051452 ! intracellular pH reduction
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0051452 ! intracellular pH reduction
-relationship: positively_regulates GO:0051452 ! intracellular pH reduction
+def: "OBSOLETE. Any process that activates or increases the frequency, rate, or extent of a process that reduces the internal pH of a cell." [GOC:mah]
+comment: This term was obsoleted because it represents 'regulation of regulation', which is redundant with direct pH regulation terms.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0051452
 
 [Term]
 id: GO:0032865
@@ -202130,13 +202325,14 @@
 
 [Term]
 id: GO:0033094
-name: putrescine--2-oxoglutarate transaminase activity
+name: putrescine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: putrescine + 2-oxoglutarate = L-glutamate + 1-pyrroline + H2O. The enzymatic part of the reaction produces 4-aminobutanal that spontaneously cyclizes to form 1-pyrroline." [EC:2.6.1.82, GOC:mlg, RHEA:12268]
+def: "Catalysis of the reaction: putrescine + 2-oxoglutarate = L-glutamate + 1-pyrroline + H2O. The enzymatic part of the reaction produces 4-aminobutanal that spontaneously cyclizes to form 1-pyrroline." [EC:2.6.1.82, RHEA:12268]
 synonym: "butane-1,4-diamine:2-oxoglutarate aminotransferase activity" RELATED []
 synonym: "PAT activity" RELATED []
 synonym: "putrescine aminotransferase activity" BROAD [EC:2.6.1.82]
 synonym: "putrescine transaminase activity" BROAD []
+synonym: "putrescine--2-oxoglutarate transaminase activity" EXACT []
 synonym: "putrescine-alpha-ketoglutarate transaminase activity" RELATED [EC:2.6.1.82]
 synonym: "putrescine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.82]
 synonym: "putrescine:alpha-ketoglutarate aminotransferase activity" RELATED [EC:2.6.1.82]
@@ -202149,6 +202345,7 @@
 property_value: skos:exactMatch RHEA:12268
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25992" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033095
@@ -203164,7 +203361,7 @@
 id: GO:0033196
 name: tryparedoxin peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: tryparedoxin + hydrogen peroxide = tryparedoxin disulfide + H2O." [GOC:mah, PMID:32388269]
+def: "Catalysis of the reaction: tryparedoxin + H2O2 = tryparedoxin disulfide + H2O." [GOC:mah, PMID:32388269]
 synonym: "TXNPx activity" EXACT []
 xref: MetaCyc:1.11.1.15-RXN
 is_a: GO:0004601 ! peroxidase activity
@@ -204829,7 +205026,7 @@
 id: GO:0033355
 name: ascorbate glutathione cycle
 namespace: biological_process
-def: "A cyclic series of interconversions involving L-ascorbate and glutathione that scavenges hydrogen peroxide and reduces it to water, with concomitant oxidation of NADPH." [GOC:mah, MetaCyc:PWY-2261]
+def: "A cyclic series of interconversions involving L-ascorbate and glutathione that scavenges H2O2 and reduces it to water, with concomitant oxidation of NADPH." [GOC:mah, MetaCyc:PWY-2261]
 synonym: "hydrogen peroxide detoxification" RELATED []
 xref: MetaCyc:PWY-2261
 is_a: GO:0006749 ! glutathione metabolic process
@@ -204877,13 +205074,12 @@
 id: GO:0033359
 name: L-lysine biosynthetic process via diaminopimelate and N-succinyl-2-amino-6-ketopimelate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediates diaminopimelate and N-succinyl-2-amino-6-ketopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in four enzymatic steps." [GOC:mah, MetaCyc:DAPLYSINESYN-PWY]
+def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediates diaminopimelate and N-succinyl-2-amino-6-ketopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in four enzymatic steps." [GOC:mah]
 synonym: "lysine anabolism via diaminopimelate and N-succinyl-2-amino-6-ketopimelate" EXACT []
 synonym: "lysine biosynthesis via diaminopimelic acid and N-succinyl-2-amino-6-ketopimelate" EXACT []
 synonym: "lysine biosynthetic process via diaminopimelic acid and N-succinyl-2-amino-6-ketopimelate" EXACT []
 synonym: "lysine formation via diaminopimelate and N-succinyl-2-amino-6-ketopimelate" EXACT []
 synonym: "lysine synthesis via diaminopimelate and N-succinyl-2-amino-6-ketopimelate" EXACT []
-xref: MetaCyc:DAPLYSINESYN-PWY
 is_a: GO:0009089 ! L-lysine biosynthetic process via diaminopimelate
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
@@ -204892,13 +205088,12 @@
 id: GO:0033360
 name: L-lysine biosynthetic process via diaminopimelate and L-2-acetamido-6-oxoheptanedioate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediates diaminopimelate and L-2-acetamido-6-oxoheptanedioate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in four enzymatic steps." [GOC:mah, MetaCyc:PWY-2941]
+def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediates diaminopimelate and L-2-acetamido-6-oxoheptanedioate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in four enzymatic steps." [GOC:mah]
 synonym: "lysine anabolism via diaminopimelate and L-2-acetamido-6-oxoheptanedioate" EXACT []
 synonym: "lysine biosynthesis via diaminopimelic acid and L-2-acetamido-6-oxoheptanedioate" EXACT []
 synonym: "lysine biosynthetic process via diaminopimelic acid and L-2-acetamido-6-oxoheptanedioate" EXACT []
 synonym: "lysine formation via diaminopimelate and L-2-acetamido-6-oxoheptanedioate" EXACT []
 synonym: "lysine synthesis via diaminopimelate and L-2-acetamido-6-oxoheptanedioate" EXACT []
-xref: MetaCyc:PWY-2941
 is_a: GO:0009089 ! L-lysine biosynthetic process via diaminopimelate
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
 
@@ -204906,12 +205101,11 @@
 id: GO:0033361
 name: L-lysine biosynthetic process via diaminopimelate, dehydrogenase pathway
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediate diaminopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in a single enzymatic step." [GOC:mah, GOC:pr, MetaCyc:PWY-2942]
+def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediate diaminopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in a single enzymatic step." [GOC:mah, GOC:pr]
 synonym: "lysine anabolism via diaminopimelate, dehydrogenase pathway" EXACT []
 synonym: "lysine biosynthesis via diaminopimelic acid, dehydrogenase pathway" EXACT []
 synonym: "lysine formation via diaminopimelate, dehydrogenase pathway" EXACT []
 synonym: "lysine synthesis via diaminopimelate, dehydrogenase pathway" EXACT []
-xref: MetaCyc:PWY-2942
 is_a: GO:0009089 ! L-lysine biosynthetic process via diaminopimelate
 relationship: has_part GO:0047850 ! diaminopimelate dehydrogenase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
@@ -204920,15 +205114,14 @@
 id: GO:0033362
 name: L-lysine biosynthetic process via diaminopimelate, diaminopimelate-aminotransferase pathway
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediate diaminopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in two enzymatic steps." [GOC:mah, GOC:pr, MetaCyc:PWY-5097]
+def: "The chemical reactions and pathways resulting in the formation of lysine, via the intermediate diaminopimelate; in this pathway tetrahydrodipicolinate is converted to meso-diaminopimelate in two enzymatic steps." [GOC:mah, GOC:pr]
 synonym: "lysine anabolism via diaminopimelate, diaminopimelate-aminotransferase pathway" EXACT []
 synonym: "lysine biosynthesis via diaminopimelate, diaminopimelate-aminotransferase pathway" EXACT []
 synonym: "lysine formation via diaminopimelate, diaminopimelate-aminotransferase pathway" EXACT []
 synonym: "lysine synthesis via diaminopimelate, diaminopimelate-aminotransferase pathway" EXACT []
-xref: MetaCyc:PWY-5097
 is_a: GO:0009089 ! L-lysine biosynthetic process via diaminopimelate
 relationship: has_part GO:0008837 ! diaminopimelate epimerase activity
-relationship: has_part GO:0010285 ! L,L-diaminopimelate aminotransferase activity
+relationship: has_part GO:0010285 ! L,L-diaminopimelate:2-oxoglutarate transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
 
 [Term]
@@ -205303,7 +205496,6 @@
 synonym: "beta-alanine biosynthesis via 1,3 diaminopropane" EXACT []
 synonym: "beta-alanine formation via 1,3 diaminopropane" EXACT []
 synonym: "beta-alanine synthesis via 1,3 diaminopropane" EXACT []
-xref: MetaCyc:PWY-3981
 is_a: GO:0019483 ! beta-alanine biosynthetic process
 
 [Term]
@@ -205315,7 +205507,6 @@
 synonym: "beta-alanine biosynthesis via 3-hydroxypropionate" EXACT []
 synonym: "beta-alanine formation via 3-hydroxypropionate" EXACT []
 synonym: "beta-alanine synthesis via 3-hydroxypropionate" EXACT []
-xref: MetaCyc:PWY-3941
 is_a: GO:0019483 ! beta-alanine biosynthetic process
 
 [Term]
@@ -205326,7 +205517,6 @@
 synonym: "beta-alanine anabolism via 3-ureidopropionate" EXACT []
 synonym: "beta-alanine formation via 3-ureidopropionate" EXACT []
 synonym: "beta-alanine synthesis via 3-ureidopropionate" EXACT []
-xref: MetaCyc:PWY-3982
 is_a: GO:0019483 ! beta-alanine biosynthetic process
 
 [Term]
@@ -206505,31 +206695,44 @@
 
 [Term]
 id: GO:0033508
-name: L-glutamate catabolic process to pyruvate
+name: L-glutamate fermentation
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate into pyruvate." [MetaCyc:PWY-5087]
+def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-glutamate, yielding energy in the form of ATP." [PMID:38821505]
 synonym: "glutamate breakdown to butyrate" EXACT []
 synonym: "glutamate degradation to butyrate" EXACT []
+synonym: "L-glutamate catabolic process to pyruvate" NARROW []
+synonym: "L-glutamate fermentation to propionate" NARROW []
+synonym: "L-glutamate fermentation to pyruvate" NARROW []
+synonym: "L-glutamate fermentation via 2-hydroxyglutarate" NARROW []
+synonym: "L-glutamate fermentation via L-citramalate" NARROW []
+xref: MetaCyc:GLUDEG-II-PWY
+xref: MetaCyc:P162-PWY
 xref: MetaCyc:PWY-5087
+xref: MetaCyc:PWY-5088
+xref: MetaCyc:PWY-8190
 is_a: GO:0006090 ! pyruvate metabolic process
 is_a: GO:0006538 ! L-glutamate catabolic process
 is_a: GO:0019665 ! amino acid fermentation
+property_value: skos:narrowMatch MetaCyc:GLUDEG-II-PWY
+property_value: skos:narrowMatch MetaCyc:P162-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-5087
+property_value: skos:narrowMatch MetaCyc:PWY-5088
+property_value: skos:narrowMatch MetaCyc:PWY-8190
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31218" xsd:anyURI
 
 [Term]
 id: GO:0033509
-name: L-glutamate fermentation to propionate
+name: obsolete L-glutamate fermentation to propionate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate into other compounds, including propionate." [GOC:mah, MetaCyc:PWY-5088]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-glutamate into other compounds, including propionate." [GOC:mah]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "glutamate breakdown to propionate" EXACT []
 synonym: "glutamate degradation to propionate" EXACT []
 synonym: "L-glutamate catabolic process to propionate" EXACT []
-xref: MetaCyc:PWY-5088
-is_a: GO:0006538 ! L-glutamate catabolic process
-is_a: GO:0019541 ! propionate metabolic process
-is_a: GO:0019665 ! amino acid fermentation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0033508
 
 [Term]
 id: GO:0033510
@@ -206555,34 +206758,40 @@
 
 [Term]
 id: GO:0033512
-name: L-lysine catabolic process to acetyl-CoA via L-saccharopine
+name: obsolete L-lysine catabolic process to acetyl-CoA via L-saccharopine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate L-saccharopine." [GOC:mah, MetaCyc:LYSINE-DEG1-PWY]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate L-saccharopine." [GOC:mah, MetaCyc:LYSINE-DEG1-PWY]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-lysine breakdown to acetyl-CoA via saccharopine" EXACT []
 synonym: "L-lysine degradation to acetyl-CoA via saccharopine" EXACT []
-is_a: GO:0006084 ! acetyl-CoA metabolic process
-is_a: GO:0019477 ! L-lysine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019477
 
 [Term]
 id: GO:0033513
-name: L-lysine catabolic process to acetyl-CoA via 5-aminopentanamide
+name: obsolete L-lysine catabolic process to acetyl-CoA via 5-aminopentanamide
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate 5-aminopentanamide." [GOC:mah, MetaCyc:PWY-5280]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate 5-aminopentanamide." [GOC:mah, MetaCyc:PWY-5280]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-lysine breakdown to acetyl-CoA via 5-aminopentanamide" EXACT []
 synonym: "L-lysine degradation to acetyl-CoA via 5-aminopentanamide" EXACT []
-is_a: GO:0006084 ! acetyl-CoA metabolic process
-is_a: GO:0019477 ! L-lysine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019477
 
 [Term]
 id: GO:0033514
-name: L-lysine catabolic process to acetyl-CoA via L-pipecolate
+name: obsolete L-lysine catabolic process to acetyl-CoA via L-pipecolate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate L-pipecolate." [GOC:mah, MetaCyc:PWY66-425]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of L-lysine into other compounds, including acetyl-CoA, via the intermediate L-pipecolate." [GOC:mah, MetaCyc:PWY66-425]
+comment: This term was obsoleted because it represents a specific instance of a pathway that should be captured as a GO-CAM model.
 synonym: "L-lysine breakdown to acetyl-CoA via L-pipecolate" EXACT []
 synonym: "L-lysine degradation to acetyl-CoA via L-pipecolate" EXACT []
-is_a: GO:0006084 ! acetyl-CoA metabolic process
-is_a: GO:0019477 ! L-lysine catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019477
 
 [Term]
 id: GO:0033515
@@ -207323,7 +207532,6 @@
 synonym: "L-tyrosine formation from chorismate via L-arogenate" EXACT []
 synonym: "L-tyrosine synthesis from chorismate via L-arogenate" EXACT []
 synonym: "tyrosine biosynthetic process from chorismate via L-arogenate" BROAD []
-xref: MetaCyc:PWY-3461
 is_a: GO:0006571 ! L-tyrosine biosynthetic process
 is_a: GO:0009095 ! aromatic amino acid family biosynthetic process, prephenate pathway
 is_a: GO:0046417 ! chorismate metabolic process
@@ -207338,7 +207546,6 @@
 synonym: "L-phenylalanine biosynthesis from chorismate via phenylpyruvate" EXACT []
 synonym: "L-phenylalanine formation from chorismate via phenylpyruvate" EXACT []
 synonym: "L-phenylalanine synthesis from chorismate via phenylpyruvate" EXACT []
-xref: MetaCyc:PHESYN
 is_a: GO:0009094 ! L-phenylalanine biosynthetic process
 is_a: GO:0046417 ! chorismate metabolic process
 
@@ -207351,7 +207558,6 @@
 synonym: "L-phenylalanine biosynthesis from chorismate via L-arogenate" EXACT []
 synonym: "L-phenylalanine formation from chorismate via L-arogenate" EXACT []
 synonym: "L-phenylalanine synthesis from chorismate via L-arogenate" EXACT []
-xref: MetaCyc:PWY-3462
 is_a: GO:0009094 ! L-phenylalanine biosynthetic process
 is_a: GO:0009095 ! aromatic amino acid family biosynthetic process, prephenate pathway
 is_a: GO:0046417 ! chorismate metabolic process
@@ -208758,7 +208964,7 @@
 id: GO:0033713
 name: choline:oxygen 1-oxidoreductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: choline + O2 = betaine aldehyde + hydrogen peroxide." [EC:1.1.3.17, RHEA:13505]
+def: "Catalysis of the reaction: choline + O2 = betaine aldehyde + H2O2." [EC:1.1.3.17, RHEA:13505]
 synonym: "choline oxidase activity" BROAD [EC:1.1.3.17]
 xref: EC:1.1.3.17
 xref: MetaCyc:CHOLINE-OXIDASE-RXN
@@ -208803,7 +209009,7 @@
 id: GO:0033716
 name: nucleoside oxidase (hydrogen peroxide-forming) activity
 namespace: molecular_function
-def: "Catalysis of the reactions: adenosine + 2 O2 = 9-riburonosyladenine + 2 hydrogen peroxide." [EC:1.1.3.39, RHEA:15489]
+def: "Catalysis of the reaction: adenosine + 2 O2 + H2O = 9-riburonosyladenine + 2 H2O2 + H+." [RHEA:15489]
 comment: Two other reactions might be associated with this activity: (1a) adenosine + O2 = 5'-dehydroadenosine + hydrogen peroxide, and (1b) 5'-dehydroadenosine + O2 = 9-riburonosyladenine + hydrogen peroxide.
 synonym: "nucleoside:oxygen 5'-oxidoreductase (hydrogen peroxide-forming) activity" RELATED [EC:1.1.3.39]
 xref: EC:1.1.3.39
@@ -210171,7 +210377,7 @@
 id: GO:0033801
 name: vitexin 2''-O-rhamnoside 7-O-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-adenosyl-L-methionine + vitexin 2''-O-beta-L-rhamnoside = S-adenosyl-L-homocysteine + 7-O-methylvitexin 2''-O-beta-L-rhamnoside." [EC:2.1.1.153]
+def: "Catalysis of the reaction: S-adenosyl-L-methionine + vitexin 2''-O-beta-L-rhamnoside = S-adenosyl-L-homocysteine + 7-O-methylvitexin 2''-O-beta-L-rhamnoside." [RHEA:11432]
 synonym: "S-adenosyl-L-methionine:vitexin-2''-O-beta-L-rhamnoside 7-O-methyltransferase activity" RELATED [EC:2.1.1.153]
 xref: EC:2.1.1.153
 xref: MetaCyc:RXN-4981
@@ -211009,14 +211215,15 @@
 
 [Term]
 id: GO:0033852
-name: thyroid-hormone transaminase activity
+name: thyroid-hormone:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + 3,5,3'-triiodo-L-thyronine = 3,5,3'-triiodothyropyruvate + L-glutamate." [EC:2.6.1.26, RHEA:19133]
+def: "Catalysis of the reaction: 3,3',5-triiodo-L-thyronine + 2-oxoglutarate = 3,5,3'-triiodothyropyruvate + L-glutamate." [RHEA:19133]
 synonym: "3,5-dinitrotyrosine aminotransferase activity" RELATED [EC:2.6.1.26]
 synonym: "3,5-dinitrotyrosine transaminase activity" RELATED [EC:2.6.1.26]
 synonym: "L-3,5,3'-triiodothyronine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.26]
 synonym: "thyroid hormone aminotransferase activity" RELATED [EC:2.6.1.26]
 synonym: "thyroid-hormone aminotransferase activity" RELATED [EC:2.6.1.26]
+synonym: "thyroid-hormone transaminase activity" BROAD []
 xref: EC:2.6.1.26
 xref: KEGG_REACTION:R03952
 xref: MetaCyc:THYROID-HORMONE-AMINOTRANSFERASE-RXN
@@ -211025,12 +211232,14 @@
 property_value: skos:exactMatch EC:2.6.1.26
 property_value: skos:exactMatch RHEA:19133
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033853
-name: aspartate-prephenate aminotransferase activity
+name: L-aspartate:prephenate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-arogenate + oxaloacetate = prephenate + L-aspartate." [RHEA:20445]
+synonym: "aspartate-prephenate aminotransferase activity" EXACT []
 synonym: "L-arogenate:oxaloacetate aminotransferase activity" RELATED [EC:2.6.1.78]
 synonym: "L-aspartate:prephenate aminotransferase activity" RELATED [EC:2.6.1.78]
 synonym: "PAT" RELATED [EC:2.6.1.78]
@@ -211039,16 +211248,18 @@
 xref: EC:2.6.1.78
 xref: MetaCyc:PREPHENATE-ASP-TRANSAMINE-RXN
 xref: RHEA:20445
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.78
 property_value: skos:exactMatch RHEA:20445
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033854
-name: glutamate-prephenate aminotransferase activity
+name: L-glutamate:prephenate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-arogenate = L-glutamate + prephenate." [EC:2.6.1.79, RHEA:22880]
+def: "Catalysis of the reaction: 2-oxoglutarate + L-arogenate = L-glutamate + prephenate." [RHEA:22880]
+synonym: "glutamate-prephenate aminotransferase activity" EXACT []
 synonym: "L-arogenate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.79]
 synonym: "L-glutamate:prephenate aminotransferase activity" RELATED [EC:2.6.1.79]
 synonym: "PAT" RELATED [EC:2.6.1.79]
@@ -211057,20 +211268,22 @@
 xref: KEGG_REACTION:R07276
 xref: MetaCyc:PREPHENATE-TRANSAMINE-RXN
 xref: RHEA:22880
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.79
 property_value: skos:exactMatch RHEA:22880
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033855
-name: nicotianamine aminotransferase activity
+name: nicotianamine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + nicotianamine = 3''-deamino-3''-oxonicotianamine + L-glutamate." [EC:2.6.1.80, RHEA:22104]
+def: "Catalysis of the reaction: nicotianamine + 2-oxoglutarate = 3''-deamino-3''-oxonicotianamine + L-glutamate." [RHEA:22104]
 synonym: "NAAT" RELATED [EC:2.6.1.80]
 synonym: "NAAT-I" RELATED [EC:2.6.1.80]
 synonym: "NAAT-II" RELATED [EC:2.6.1.80]
 synonym: "NAAT-III" RELATED [EC:2.6.1.80]
+synonym: "nicotianamine aminotransferase activity" EXACT []
 synonym: "nicotianamine transaminase activity" RELATED [EC:2.6.1.80]
 synonym: "nicotianamine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.80]
 xref: EC:2.6.1.80
@@ -211081,6 +211294,7 @@
 property_value: skos:exactMatch EC:2.6.1.80
 property_value: skos:exactMatch RHEA:22104
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033856
@@ -216533,16 +216747,15 @@
 
 [Term]
 id: GO:0034269
-name: discadenine catabolic process
+name: obsolete discadenine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of discadenine, (2S)-2-amino-4-{6-[(3-methylbut-2-en-1-yl)amino]-3H-purin-3-yl}butanoic acid." [GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of discadenine, (2S)-2-amino-4-{6-[(3-methylbut-2-en-1-yl)amino]-3H-purin-3-yl}butanoic acid." [GOC:mah]
+comment: This term was obsoleted because there is no evidence that a specific pathway for discadenine degradation exists.
 synonym: "discadenine breakdown" EXACT []
 synonym: "discadenine catabolism" EXACT []
 synonym: "discadenine degradation" EXACT []
-is_a: GO:0009823 ! cytokinin catabolic process
-is_a: GO:0072523 ! purine-containing compound catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0034270
@@ -219379,31 +219592,37 @@
 
 [Term]
 id: GO:0034547
-name: N-cyclopropylmelamine deaminase activity
+name: obsolete N-cyclopropylmelamine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cyromazine + H2O = N-cyclopropylammeline + NH3." [UM-BBD_reactionID:r0825]
+def: "OBSOLETE. Catalysis of the reaction: cyromazine + H2O = N-cyclopropylammeline + NH3." [UM-BBD_reactionID:r0825]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: MetaCyc:RXN-8018
 xref: UM-BBD_reactionID:r0825
-is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0034548
-name: N-cyclopropylammeline deaminase activity
+name: obsolete N-cyclopropylammeline deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-cyclopropylammeline + H2O = N-cyclopropylammelide + NH3." [UM-BBD_reactionID:r0826]
+def: "OBSOLETE. Catalysis of the reaction: N-cyclopropylammeline + H2O = N-cyclopropylammelide + NH3." [UM-BBD_reactionID:r0826]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: MetaCyc:RXN-8019
 xref: UM-BBD_reactionID:r0826
-is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0034549
-name: N-cyclopropylammelide alkylamino hydrolase activity
+name: obsolete N-cyclopropylammelide alkylamino hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-cyclopropylammelide + H2O = cyclopropylamine + cyanuric acid." [UM-BBD_reactionID:r0827]
+def: "OBSOLETE. Catalysis of the reaction: N-cyclopropylammelide + H2O = cyclopropylamine + cyanuric acid." [UM-BBD_reactionID:r0827]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: KEGG_REACTION:R06972
 xref: MetaCyc:RXN-8020
 xref: UM-BBD_reactionID:r0827
-is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0034550
@@ -220411,18 +220630,21 @@
 name: nucleobase-containing compound biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of nucleobases, nucleosides, nucleotides and nucleic acids." [GOC:mah]
+subset: gocheck_do_not_annotate
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid anabolism" EXACT []
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid biosynthesis" EXACT []
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid formation" EXACT []
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid synthesis" NARROW []
 is_a: GO:0006139 ! nucleobase-containing compound metabolic process
 is_a: GO:0009058 ! biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 
 [Term]
 id: GO:0034655
 name: nucleobase-containing compound catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of nucleobases, nucleosides, nucleotides and nucleic acids." [GOC:mah]
+subset: gocheck_do_not_annotate
 subset: goslim_chembl
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid breakdown" EXACT []
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid catabolic process" RELATED [GOC:dph, GOC:tb]
@@ -220430,6 +220652,7 @@
 synonym: "nucleobase, nucleoside, nucleotide and nucleic acid degradation" EXACT []
 is_a: GO:0006139 ! nucleobase-containing compound metabolic process
 is_a: GO:0009056 ! catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 
 [Term]
 id: GO:0034656
@@ -226015,9 +226238,11 @@
 id: GO:0035248
 name: alpha-1,4-N-acetylgalactosaminyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an N-acetyl-beta-D-galactosaminyl derivative + UDP-N-acetyl-alpha-D-galactosamine = an N-acetyl-alpha-D-galactosaminyl-(1->4)-N-acetyl-beta-D-galactosaminyl derivative + UDP + H+." [PMID:15130086]
+def: "Catalysis of the reaction: an N-acetyl-beta-D-galactosaminyl derivative + UDP-N-acetyl-alpha-D-galactosamine = an N-acetyl-alpha-D-galactosaminyl-(1->4)-N-acetyl-beta-D-galactosaminyl derivative + UDP + H+." [PMID:15130086, RHEA:86251]
 synonym: "alpha-1,4-GalNAc transferase activity" EXACT []
+xref: RHEA:86251
 is_a: GO:0008376 ! acetylgalactosaminyltransferase activity
+property_value: skos:exactMatch RHEA:86251
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31147" xsd:anyURI
 
 [Term]
@@ -228806,9 +229031,11 @@
 synonym: "carnosine biosynthesis" EXACT []
 synonym: "carnosine formation" EXACT []
 synonym: "carnosine synthesis" EXACT []
+xref: MetaCyc:PWY66-420
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0035498 ! carnosine metabolic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: bf
 creation_date: 2010-04-29T01:20:56Z
 
@@ -229690,9 +229917,13 @@
 synonym: "histone H4K20me demethylase activity" EXACT []
 xref: Reactome:R-HSA-2172678 "PHF8 demethylates histone H4K20me1"
 xref: RHEA:67804
+xref: RHEA:85907
+xref: RHEA:85911
 is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
 is_a: GO:0141058 ! histone H4 demethylase activity
 property_value: skos:narrowMatch RHEA:67804
+property_value: skos:narrowMatch RHEA:85907
+property_value: skos:narrowMatch RHEA:85911
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21089" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29636" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30578" xsd:anyURI
@@ -231696,11 +231927,14 @@
 
 [Term]
 id: GO:0035751
-name: regulation of lysosomal lumen pH
+name: obsolete regulation of lysosomal lumen pH
 namespace: biological_process
-def: "Any process that modulates the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:rph]
-is_a: GO:0051453 ! regulation of intracellular pH
-relationship: part_of GO:0007040 ! lysosome organization
+def: "OBSOLETE. Any process that modulates the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:rph]
+comment: The reason for obsoletion is that this term was an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+consider: GO:0007042
+consider: GO:0035752
 created_by: bf
 creation_date: 2011-03-23T10:23:41Z
 
@@ -231710,7 +231944,6 @@
 namespace: biological_process
 def: "Any process that increases the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:bf, GOC:rph]
 synonym: "lysosome pH elevation" EXACT [GOC:bf, GOC:rph]
-is_a: GO:0035751 ! regulation of lysosomal lumen pH
 is_a: GO:0051454 ! intracellular pH elevation
 created_by: bf
 creation_date: 2011-03-23T10:24:24Z
@@ -233509,18 +233742,21 @@
 namespace: biological_process
 def: "Any process that results in a change in state or activity of a cell or an organism (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of a lack of contact with other members of the same species." [GOC:bf, PMID:20203532]
 synonym: "response to social isolation" EXACT [PMID:20203532]
-is_a: GO:0006950 ! response to stress
+is_a: GO:0033555 ! multicellular organismal response to stress
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 created_by: bf
 creation_date: 2011-06-22T09:39:57Z
 
 [Term]
 id: GO:0035901
-name: cellular response to isolation stress
+name: obsolete cellular response to isolation stress
 namespace: biological_process
-def: "Any process that results in a change in state or activity of a cell (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of a lack of contact with other members of the same species." [GOC:bf, PMID:20203532]
+def: "OBSOLETE. Any process that results in a change in state or activity of a cell (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of a lack of contact with other members of the same species." [GOC:bf, PMID:20203532]
+comment: This term was obsoleted because it represents the molecular activities involved in response to isolation stress ; GO:0035900.
 synonym: "cellular response to social isolation" EXACT [PMID:20203532]
-is_a: GO:0033554 ! cellular response to stress
-is_a: GO:0035900 ! response to isolation stress
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0035900
 created_by: bf
 creation_date: 2011-06-22T09:43:34Z
 
@@ -235711,7 +235947,7 @@
 id: GO:0036081
 name: extracellular ammonia-gated monoatomic ion channel activity
 namespace: molecular_function
-def: "Enables the transmembrane transfer of an ion by a channel that opens when extracellular ammonia (NH3) has been bound by the channel complex or one of its constituent parts." [GOC:sart, PMID:19135896]
+def: "Enables the transmembrane transfer of an ion by a channel that opens when extracellular ammonia (NH4+) has been bound by the channel complex or one of its constituent parts." [GOC:sart, PMID:19135896]
 synonym: "extracellular ammonia-gated ion channel activity" BROAD []
 synonym: "ionotropic ammonia receptor activity" RELATED [PMID:19135896]
 is_a: GO:0005230 ! extracellular ligand-gated monoatomic ion channel activity
@@ -235793,12 +236029,14 @@
 id: GO:0036088
 name: D-serine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-serine, the D-enantiomer of serine, i.e. (2S)-2-amino-3-hydroxypropanoic acid." [GOC:imk]
+def: "The chemical reactions and pathways resulting in the breakdown of D-serine." [GOC:curators]
 synonym: "D-serine breakdown" EXACT [GOC:bf]
 synonym: "D-serine catabolism" EXACT [GOC:bf]
 synonym: "D-serine degradation" EXACT [GOC:bf]
+xref: MetaCyc:PWY0-1535
 is_a: GO:0019478 ! D-amino acid catabolic process
-is_a: GO:0070178 ! D-serine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 created_by: bf
 creation_date: 2012-01-06T10:58:51Z
 
@@ -239302,7 +239540,7 @@
 id: GO:0036381
 name: pyridoxal 5'-phosphate synthase (glutamine hydrolysing) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-ribose 5-phosphate + D-glyceraldehyde 3-phosphate + L-glutamine = pyridoxal 5'-phosphate + L-glutamate + 3 H2O + phosphate. The reaction occurs in two steps: L-glutamine + H2O = L-glutamate + NH3, and subsequently D-ribose 5-phosphate + D-glyceraldehyde 3-phosphate + NH3 = pyridoxal 5'-phosphate + 4 H2O + phosphate." [EC:4.3.3.6, GOC:rs]
+def: "Catalysis of the reaction: D-ribose 5-phosphate + D-glyceraldehyde 3-phosphate + L-glutamine = pyridoxal 5'-phosphate + L-glutamate + 3 H2O + phosphate. The reaction occurs in two steps: L-glutamine + H2O = L-glutamate + NH4+, and subsequently D-ribose 5-phosphate + D-glyceraldehyde 3-phosphate + NH4+ = pyridoxal 5'-phosphate + 4 H2O + phosphate." [EC:4.3.3.6, GOC:rs]
 synonym: "PdxST activity" RELATED [EC:4.3.3.6]
 synonym: "pyridoxal 5'-phosphate synthase (glutamine hydrolyzing) activity" RELATED [EC:4.3.3.6]
 xref: EC:4.3.3.6
@@ -239471,8 +239709,9 @@
 id: GO:0036393
 name: thiocyanate peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: thiocyanate (SCN-) + hydrogen peroxide (H2O2) = hypothiocyanite (OSCN-) + 2 H2O. Catalyzes the hydrogen peroxide oxidation of thiocyanate." [GOC:pm, PMID:12626341]
+def: "Catalysis of the reaction: thiocyanate + H2O2 + H+ = hypothiocyanous acid + H2O." [GOC:pm, PMID:12626341, RHEA:69416]
 synonym: "lactoperoxidase activity" BROAD [PMID:12626341, Wikipedia:Lactoperoxidase]
+xref: RHEA:69416
 is_a: GO:0004601 ! peroxidase activity
 relationship: part_of GO:0018969 ! thiocyanate metabolic process
 created_by: bf
@@ -247449,7 +247688,6 @@
 namespace: molecular_function
 def: "Binds to and stops, prevents or reduces an ATP hydrolysis activity." [GOC:jl]
 synonym: "adenosinetriphosphatase inhibitor" EXACT []
-is_a: GO:0060590 ! ATPase regulator activity
 is_a: GO:0140678 ! molecular function inhibitor activity
 relationship: negatively_regulates GO:0140657 ! ATP-dependent activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20955" xsd:anyURI
@@ -248690,7 +248928,7 @@
 id: GO:0042170
 name: plastid membrane
 namespace: cellular_component
-def: "Either of the lipid bilayers that surround a plastid and form the plastid envelope." [GOC:mah]
+def: "Any lipid bilayer that surrounds a plastid or is part of the plastid envelope. Primary plastids (in plants, green algae, red algae, and glaucophytes) are surrounded by two membranes; complex plastids derived from secondary endosymbiosis are surrounded by three or four membranes." [GOC:mah, PMID:20124341]
 is_a: GO:0031090 ! organelle membrane
 intersection_of: GO:0016020 ! membrane
 intersection_of: part_of GO:0009536 ! plastid
@@ -249305,15 +249543,15 @@
 
 [Term]
 id: GO:0042217
-name: 1-aminocyclopropane-1-carboxylate catabolic process
+name: obsolete 1-aminocyclopropane-1-carboxylate catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of 1-aminocyclopropane-1-carboxylate, a natural product found in plant tissues. It is a key intermediate in the biosynthesis of ethylene (ethene), a fruit-ripening hormone in plants." [GOC:go_curators]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of 1-aminocyclopropane-1-carboxylate, a natural product found in plant tissues. It is a key intermediate in the biosynthesis of ethylene (ethene), a fruit-ripening hormone in plants." [GOC:go_curators]
+comment: This term was obsoleted because there is no evidence that a specific pathway for 1-aminocyclopropane-1-carboxylate degradation exists.
 synonym: "1-aminocyclopropane-1-carboxylate breakdown" EXACT []
 synonym: "1-aminocyclopropane-1-carboxylate catabolism" EXACT []
 synonym: "1-aminocyclopropane-1-carboxylate degradation" EXACT []
-is_a: GO:0018871 ! 1-aminocyclopropane-1-carboxylate metabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
-is_a: GO:1901606 ! alpha-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0042218
@@ -255578,23 +255816,28 @@
 id: GO:0042852
 name: L-alanine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-alanine, the L-enantiomer of 2-aminopropanoic acid, i.e. (2S)-2-aminopropanoic acid." [GOC:jl, GOC:jsg, GOC:mah, MetaCyc:PWY0-1061]
+def: "The chemical reactions and pathways resulting in the formation of L-alanine, the L-enantiomer of 2-aminopropanoic acid, i.e. (2S)-2-aminopropanoic acid." [GOC:jl, GOC:jsg, GOC:mah]
 synonym: "L-alanine anabolism" EXACT []
 synonym: "L-alanine biosynthesis" EXACT []
 synonym: "L-alanine formation" EXACT []
 synonym: "L-alanine synthesis" EXACT []
-xref: MetaCyc:PWY0-1061
+xref: MetaCyc:ALANINE-SYN2-PWY
+xref: MetaCyc:ALANINE-VALINESYN-PWY
+xref: MetaCyc:PWY0-1021
 is_a: GO:0006523 ! alanine biosynthetic process
 is_a: GO:0009079 ! pyruvate family amino acid biosynthetic process
 is_a: GO:0042851 ! L-alanine metabolic process
-property_value: skos:exactMatch MetaCyc:PWY0-1061
+property_value: skos:narrowMatch MetaCyc:ALANINE-SYN2-PWY
+property_value: skos:narrowMatch MetaCyc:ALANINE-VALINESYN-PWY
+property_value: skos:narrowMatch MetaCyc:PWY0-1021
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 
 [Term]
 id: GO:0042853
 name: L-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-alanine, the L-enantiomer of 2-aminopropanoic acid, i.e. (2S)-2-aminopropanoic acid." [GOC:jl, GOC:jsg, GOC:mah]
+def: "The chemical reactions and pathways resulting in the breakdown of L-alanine." [GOC:curators]
 synonym: "L-alanine breakdown" EXACT []
 synonym: "L-alanine catabolism" EXACT []
 synonym: "L-alanine degradation" EXACT []
@@ -255608,6 +255851,7 @@
 property_value: skos:narrowMatch MetaCyc:ALADEG-PWY
 property_value: skos:narrowMatch MetaCyc:ALANINE-DEG3-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0042854
@@ -262186,7 +262430,7 @@
 xref: Reactome:R-HSA-9856872 "Malate-aspartate shuttle"
 xref: Wikipedia:Malate-aspartate_shuttle
 is_a: GO:0019674 ! NAD+ metabolic process
-relationship: has_part GO:0004069 ! L-aspartate:2-oxoglutarate aminotransferase activity
+relationship: has_part GO:0004069 ! L-aspartate:2-oxoglutarate transaminase activity
 relationship: has_part GO:0030060 ! L-malate dehydrogenase (NAD+) activity
 relationship: has_part GO:1990542 ! mitochondrial transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28982" xsd:anyURI
@@ -262800,7 +263044,6 @@
 namespace: biological_process
 def: "The addition of an acyl group, any group or radical of the form RCO- where R is an organic group, to a protein amino acid." [GOC:jl]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid acylation" EXACT [GOC:bf]
 is_a: GO:0036211 ! protein modification process
 
@@ -264717,10 +264960,12 @@
 
 [Term]
 id: GO:0043730
-name: 5-ureido-4-imidazole carboxylate hydrolase activity
+name: obsolete 5-ureido-4-imidazole carboxylate hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-ureido-4-imidazole carboxylate + H2O = 5-amino-4-imidazole carboxylate + NH3 + CO2." [GOC:jl]
-is_a: GO:0016813 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in linear amidines
+def: "OBSOLETE. Catalysis of the reaction: 5-ureido-4-imidazole carboxylate + H2O = 5-amino-4-imidazole carboxylate + NH3 + CO2." [GOC:jl]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0043731
@@ -265011,12 +265256,16 @@
 xref: EC:2.3.1.168
 xref: MetaCyc:2.3.1.168-RXN
 xref: RHEA:18865
+xref: RHEA:84647
+xref: RHEA:84651
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:broadMatch EC:1.2.1.25
 property_value: skos:broadMatch MetaCyc:1.2.1.25-RXN
 property_value: skos:exactMatch EC:2.3.1.168
 property_value: skos:exactMatch MetaCyc:2.3.1.168-RXN
 property_value: skos:narrowMatch RHEA:18865
+property_value: skos:narrowMatch RHEA:84647
+property_value: skos:narrowMatch RHEA:84651
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17835" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29951" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30031" xsd:anyURI
@@ -265111,12 +265360,16 @@
 
 [Term]
 id: GO:0043760
-name: acetyldiaminopimelate aminotransferase activity
+name: obsolete acetyldiaminopimelate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-acetyl-L-2,6-diaminoheptanedioate + 2-oxoglutarate = N-acetyl-2-L-amino-6-oxoheptanedioate + L-glutamate." [PMID:1906065]
+def: "OBSOLETE. Catalysis of the reaction: N-acetyl-L-2,6-diaminoheptanedioate + 2-oxoglutarate = N-acetyl-2-L-amino-6-oxoheptanedioate + L-glutamate." [PMID:1906065]
+comment: This term was obsoleted because there is no evidence that this reaction exists. This was an alternative succinyldiaminopimelate aminotransferase substrate tested in PMID:1906065.
+synonym: "acetyldiaminopimelate aminotransferase activity" BROAD []
 synonym: "N-acetyl-diaminopimelate aminotransferase activity" EXACT []
 synonym: "N-acetyl-L,L-diaminopimelate aminotransferase activity" EXACT []
-is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
+is_obsolete: true
+consider: GO:0009016
 
 [Term]
 id: GO:0043761
@@ -265558,7 +265811,7 @@
 id: GO:0043799
 name: glycine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reactions: (1) glycine + H2O + O2 = glyoxylate + NH3 + hydrogen peroxide; (2) D-alanine + H2O + O2 = pyruvate + NH3 + hydrogen peroxide; (3) sarcosine + H2O + O2 = glyoxylate + methylamine + hydrogen peroxide; (4) N-ethylglycine + H2O + O2 = glyoxylate + ethylamine + hydrogen peroxide." [EC:1.4.3.19]
+def: "Catalysis of the reactions: (1) glycine + H2O + O2 = glyoxylate + NH4+ + H2O2; (2) D-alanine + H2O + O2 = pyruvate + NH4+ + H2O2; (3) sarcosine + H2O + O2 = glyoxylate + methylamine + H2O2; (4) N-ethylglycine + H2O + O2 = glyoxylate + ethylamine + H2O2." [EC:1.4.3.19]
 synonym: "glycine:oxygen oxidoreductase (deaminating)" EXACT []
 xref: EC:1.4.3.19
 xref: MetaCyc:1.4.3.19-RXN
@@ -265948,9 +266201,9 @@
 
 [Term]
 id: GO:0043825
-name: succinylornithine transaminase activity
+name: succinylornithine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + N(2)-succinyl-L-ornithine = N-succinyl-L-glutamate 5-semialdehyde + L-glutamate." [EC:2.6.1.81, RHEA:16953]
+def: "Catalysis of the reaction: N(2)-succinyl-L-ornithine + 2-oxoglutarate = N-succinyl-L-glutamate 5-semialdehyde + L-glutamate." [RHEA:16953]
 synonym: "2-N-succinyl-L-ornithine:2-oxoglutarate 5-aminotransferase activity" RELATED [EC:2.6.1.81]
 synonym: "AstC" RELATED []
 synonym: "N(2)-succinylornithine 5-aminotransferase activity" RELATED [EC:2.6.1.81]
@@ -265960,6 +266213,7 @@
 synonym: "succinyl ornithine transaminase activity" EXACT []
 synonym: "succinyl-ornithine transaminase activity" RELATED [EC:2.6.1.81]
 synonym: "succinylornithine aminotransferase activity" BROAD [EC:2.6.1.81]
+synonym: "succinylornithine transaminase activity" EXACT []
 xref: EC:2.6.1.81
 xref: KEGG_REACTION:R04217
 xref: MetaCyc:SUCCORNTRANSAM-RXN
@@ -265968,6 +266222,7 @@
 property_value: skos:exactMatch EC:2.6.1.81
 property_value: skos:exactMatch RHEA:16953
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0043826
@@ -266018,7 +266273,7 @@
 id: GO:0043829
 name: tRNA-specific adenosine-37 deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: adenosine-37 + H2O = inosine-37 + NH3, in a tRNA-Ala molecule." [PMID:8915538, PMID:9707437, RHEA:50968]
+def: "Catalysis of the reaction: adenosine-37 + H2O = inosine-37 + NH4+, in a tRNA-Ala molecule." [PMID:8915538, PMID:9707437, RHEA:50968]
 synonym: "TAD1" RELATED []
 synonym: "tRNA(Ala)-A37 deaminase activity" EXACT []
 synonym: "tRNA-specific adenosine deaminase 1" EXACT []
@@ -266314,7 +266569,7 @@
 id: GO:0043852
 name: monomethylamine methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: monomethylamine + a monomethylamine corrinoid protein = a methylated monomethylamine corrinoid protein + NH3." [PMID:9195968]
+def: "Catalysis of the reaction: Co(I)-[methylamine-specific corrinoid protein] + methylamine + H+ = methyl-Co(III)-[methylamine-specific corrinoid protein] + NH4+." [PMID:9195968, RHEA:26059]
 comment: This function is the first step in the pathway of methanogenesis from monomethylamine.
 synonym: "MMAMT" RELATED []
 synonym: "monomethylamine:corrinoid methyltransferase activity" EXACT []
@@ -266644,7 +266899,7 @@
 id: GO:0043877
 name: galactosamine-6-phosphate isomerase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-galactosamine 6-phosphate + H2O = D-tagatose 6-phosphate + NH3." [PMID:10931310]
+def: "Catalysis of the reaction: D-galactosamine 6-phosphate + H2O = D-tagatose 6-phosphate + NH4+." [PMID:10931310]
 comment: This function is part of the pathway of N-acetyl-galactosamine and galactosamine utilization.
 synonym: "AgaI" RELATED []
 synonym: "galactosamine-6-phosphate deaminase activity" EXACT []
@@ -267139,11 +267394,15 @@
 
 [Term]
 id: GO:0043911
-name: D-lysine transaminase activity
+name: D-lysine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-lysine + 2-oxoglutarate = L-glutamate + 6-amino-2-oxohexanoate." [GOC:jl, PMID:17259313]
+def: "Catalysis of the reaction: D-lysine + 2-oxoglutarate = 6-amino-2-oxohexanoate + L-glutamate." [PMID:17259313, RHEA:37587]
 synonym: "D-lysine aminotransferase activity" EXACT []
-is_a: GO:0008483 ! transaminase activity
+synonym: "D-lysine transaminase activity" BROAD []
+xref: RHEA:37587
+is_a: GO:0140385 ! amino acid transaminase activity
+property_value: skos:exactMatch RHEA:37587
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0043912
@@ -267168,21 +267427,27 @@
 
 [Term]
 id: GO:0043914
-name: NADPH:sulfur oxidoreductase activity
+name: NAD(P)H sulfur oxidoreductase (CoA-dependent) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: NADPH + H+ + sulfur = hydrogen sulfide + NADP+." [GOC:jl, PMID:17449625]
+def: "Catalysis of the reaction: hydrogen sulfide + NAD(P)+ = sulfur + NAD(P)H." [EC:1.8.1.18, PMID:17449625]
 synonym: "CoA-dependent NAD(P)H sulfur oxidoreductase activity" EXACT []
 synonym: "coenzyme A-dependent NAD(P)H sulfur oxidoreductase activity" EXACT []
 synonym: "NAD(P)H elemental sulfur oxidoreductase activity" EXACT []
 synonym: "NAD(P)H sulfur oxidoreductase activity" EXACT []
 synonym: "NAD(P)H sulphur oxidoreductase activity" EXACT []
 synonym: "NAD(P)H:sulfur oxidoreductase activity" EXACT []
+synonym: "NADPH:sulfur oxidoreductase activity" NARROW []
 synonym: "NADPH:sulphur oxidoreductase activity" EXACT []
 synonym: "NSR" EXACT []
 xref: EC:1.8.1.18
-is_a: GO:0016667 ! oxidoreductase activity, acting on a sulfur group of donors
+xref: RHEA:36595
+xref: RHEA:36599
+is_a: GO:0016668 ! oxidoreductase activity, acting on a sulfur group of donors, NAD(P) as acceptor
 property_value: skos:exactMatch EC:1.8.1.18
+property_value: skos:narrowMatch RHEA:36595
+property_value: skos:narrowMatch RHEA:36599
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
 
 [Term]
 id: GO:0043915
@@ -270953,11 +271218,13 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving small molecules, any low molecular weight, monomeric, non-encoded molecule." [GOC:curators, GOC:pde, GOC:vw]
 comment: Small molecules in GO include monosaccharides but exclude disaccharides and polysaccharides.
+subset: gocheck_do_not_annotate
 subset: goslim_chembl
 subset: goslim_flybase_ribbon
 subset: goslim_metagenomics
 synonym: "small molecule metabolism" EXACT []
 is_a: GO:0008152 ! metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: jl
 creation_date: 2010-01-26T12:05:20Z
 
@@ -270967,9 +271234,11 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of small molecules, any low molecular weight, monomeric, non-encoded molecule." [GOC:curators, GOC:vw]
 comment: Small molecules in GO include monosaccharides but exclude disaccharides and polysaccharides.
+subset: gocheck_do_not_annotate
 synonym: "small molecule catabolism" EXACT []
 is_a: GO:0009056 ! catabolic process
 is_a: GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: jl
 creation_date: 2010-01-26T12:06:10Z
 
@@ -270979,11 +271248,13 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of small molecules, any low molecular weight, monomeric, non-encoded molecule." [GOC:curators, GOC:pde, GOC:vw]
 comment: Small molecules in GO include monosaccharides but exclude disaccharides and polysaccharides.
+subset: gocheck_do_not_annotate
 subset: goslim_prokaryote
 subset: goslim_prokaryote_ribbon
 synonym: "small molecule biosynthesis" EXACT []
 is_a: GO:0009058 ! biosynthetic process
 is_a: GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: jl
 creation_date: 2010-01-26T12:06:49Z
 
@@ -273876,7 +274147,7 @@
 id: GO:0044540
 name: L-cystine L-cysteine-lyase (deaminating) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-cystine + H2O = pyruvate + NH3 + thiocysteine. Thiocysteine is also known as cysteine persulfide." [RHEA:24927]
+def: "Catalysis of the reaction: L-cystine + H2O = S-sulfanyl-L-cysteine + pyruvate + NH4+." [RHEA:24927]
 xref: EC:4.4.1.35
 xref: KEGG_REACTION:R02408
 xref: RHEA:24927
@@ -280551,15 +280822,16 @@
 
 [Term]
 id: GO:0045303
-name: diaminobutyrate-2-oxoglutarate transaminase activity
+name: L-2,4-diaminobutyrate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-2,4-diaminobutyrate = L-aspartate 4-semialdehyde + L-glutamate." [EC:2.6.1.76, RHEA:11160]
+def: "Catalysis of the reaction: L-2,4-diaminobutanoate + 2-oxoglutarate = L-aspartate 4-semialdehyde + L-glutamate." [RHEA:11160]
 synonym: "2,4-diaminobutyrate 4-aminotransferase activity" RELATED [EC:2.6.1.76]
 synonym: "DAB aminotransferase activity" RELATED [EC:2.6.1.76]
 synonym: "DABA aminotransferase activity" RELATED [EC:2.6.1.76]
 synonym: "diaminibutyric acid aminotransferase activity" RELATED [EC:2.6.1.76]
 synonym: "diaminobutyrate transaminase activity" RELATED [EC:2.6.1.76]
 synonym: "diaminobutyrate--2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.76]
+synonym: "diaminobutyrate-2-oxoglutarate transaminase activity" EXACT []
 synonym: "EctB" RELATED [EC:2.6.1.76]
 synonym: "L-2,4-diaminobutanoate:2-oxoglutarate 4-aminotransferase activity" RELATED [EC:2.6.1.76]
 synonym: "L-2,4-diaminobutyrate:2-ketoglutarate 4-aminotransferase activity" RELATED [EC:2.6.1.76]
@@ -280572,6 +280844,7 @@
 property_value: skos:exactMatch EC:2.6.1.76
 property_value: skos:exactMatch RHEA:11160
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0045304
@@ -281632,7 +281905,7 @@
 id: GO:0045480
 name: galactose oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-galactose + O2 = D-galacto-hexodialdose + hydrogen peroxide." [EC:1.1.3.9]
+def: "Catalysis of the reaction: D-galactose + O2 = D-galacto-hexodialdose + H2O2." [RHEA:24160]
 synonym: "beta-galactose oxidase activity" RELATED [EC:1.1.3.9]
 synonym: "D-galactose oxidase activity" RELATED [EC:1.1.3.9]
 synonym: "D-galactose:oxygen 6-oxidoreductase activity" RELATED [EC:1.1.3.9]
@@ -281696,9 +281969,10 @@
 
 [Term]
 id: GO:0045484
-name: L-lysine 6-transaminase activity
+name: L-lysine:2-oxoglutarate 6-transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-lysine = L-glutamate + allysine." [EC:2.6.1.36, RHEA:21200]
+def: "Catalysis of the reaction: 2-oxoglutarate + L-lysine = L-glutamate + allysine." [RHEA:21200]
+synonym: "L-lysine 6-transaminase activity" EXACT []
 synonym: "L-lysine aminotransferase activity" RELATED [EC:2.6.1.36]
 synonym: "L-lysine transaminase activity" RELATED [EC:2.6.1.36]
 synonym: "L-lysine-alpha-ketoglutarate 6-aminotransferase activity" RELATED [EC:2.6.1.36]
@@ -281712,10 +281986,11 @@
 xref: KEGG_REACTION:R00457
 xref: MetaCyc:L-LYSINE-AMINOTRANSFERASE-RXN
 xref: RHEA:21200
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.36
 property_value: skos:exactMatch RHEA:21200
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0045485
@@ -287883,6 +288158,7 @@
 name: negative regulation of nucleobase-containing compound metabolic process
 namespace: biological_process
 def: "Any cellular process that stops, prevents, or reduces the frequency, rate or extent of the chemical reactions and pathways involving nucleobases, nucleosides, nucleotides and nucleic acids." [GOC:go_curators]
+subset: gocheck_do_not_annotate
 synonym: "down regulation of nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" EXACT []
 synonym: "down-regulation of nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" EXACT []
 synonym: "downregulation of nucleobase, nucleoside, nucleotide and nucleic acid metabolic process" EXACT []
@@ -287894,6 +288170,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0006139 ! nucleobase-containing compound metabolic process
 relationship: negatively_regulates GO:0006139 ! nucleobase-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 
 [Term]
 id: GO:0045935
@@ -290842,23 +291119,27 @@
 name: alcohol catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of alcohols, any of a class of compounds containing one or more hydroxyl groups attached to a saturated carbon atom." [GOC:ai]
+subset: gocheck_do_not_annotate
 synonym: "alcohol breakdown" EXACT []
 synonym: "alcohol catabolism" EXACT []
 synonym: "alcohol degradation" EXACT []
 is_a: GO:0006066 ! alcohol metabolic process
 is_a: GO:0044282 ! small molecule catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 
 [Term]
 id: GO:0046165
 name: alcohol biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of alcohols, any of a class of compounds containing one or more hydroxyl groups attached to a saturated carbon atom." [GOC:ai]
+subset: gocheck_do_not_annotate
 synonym: "alcohol anabolism" EXACT []
 synonym: "alcohol biosynthesis" EXACT []
 synonym: "alcohol formation" EXACT []
 synonym: "alcohol synthesis" EXACT []
 is_a: GO:0006066 ! alcohol metabolic process
 is_a: GO:0044283 ! small molecule biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 
 [Term]
 id: GO:0046166
@@ -294152,12 +294433,15 @@
 
 [Term]
 id: GO:0046436
-name: D-alanine metabolic process
+name: obsolete D-alanine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving D-alanine, the D-enantiomer of the amino acid alanine, i.e. (2R)-2-aminopropanoic acid." [GOC:ai, GOC:jsg]
+def: "OBSOLETE. The chemical reactions and pathways involving D-alanine, the D-enantiomer of the amino acid alanine, i.e. (2R)-2-aminopropanoic acid." [GOC:ai, GOC:jsg]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "D-alanine metabolism" EXACT []
-is_a: GO:0006522 ! alanine metabolic process
-is_a: GO:0046416 ! D-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
+consider: GO:0030632
+consider: GO:0055130
 
 [Term]
 id: GO:0046437
@@ -296437,21 +296721,23 @@
 synonym: "sphingolipid flippase activity" EXACT []
 synonym: "sphingolipid floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
 synonym: "sphingolipid-translocating ATPase activity" RELATED []
-is_a: GO:0046624 ! sphingolipid transporter activity
+is_a: GO:0046624 ! sphingolipid intramembrane carrier activity
 is_a: GO:0140328 ! floppase activity
 relationship: part_of GO:0099039 ! sphingolipid translocation
 property_value: skos:broadMatch RHEA:66132
 
 [Term]
 id: GO:0046624
-name: sphingolipid transporter activity
+name: sphingolipid intramembrane carrier activity
 namespace: molecular_function
 def: "Enables the directed movement of sphingolipids into, out of or within a cell, or between cells. Sphingolipids are a class of lipids containing the long-chain amine diol sphingosine or a closely related base (a sphingoid)." [GOC:ai, ISBN:0198506732]
 subset: gocheck_do_not_annotate
+synonym: "sphingolipid intramembrane transporter activity" BROAD []
 xref: Reactome:R-HSA-9695890 "SPNS2,MFSD2B transport S1P from cytosol to extracellular region"
 xref: Reactome:R-HSA-9843721 "ABCC1,ABCG2 transport C18-S1P to extracellular region"
-is_a: GO:0005319 ! lipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31121" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0046625
@@ -298390,12 +298676,12 @@
 
 [Term]
 id: GO:0046820
-name: 4-amino-4-deoxychorismate synthase activity
+name: aminodeoxychorismate synthase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-glutamine + chorismate = 4-amino-4-deoxychorismate + L-glutamate. It is composed of two enzymatic activities (which may be present on one or two polypeptides); the first is a glutaminase which yields ammonia from glutamine, releasing glutamate. The ammonia is used by the second activity which catalyzes the amination of chorismate to form 4-amino-4-deoxychorismate." [EC:2.6.1.85, RHEA:11672]
 comment: Note that the name 'para-aminobenzoic acid synthase' was initially given to the 'aminodeoxychorismate synthase' activity before the additional 4-amino-4-deoxychorismate lyase activity was discovered. It is the lyase activity that actually produces para-aminobenzoic acid from 4-amino-4-deoxychorismate.
+synonym: "4-amino-4-deoxychorismate synthase activity" EXACT []
 synonym: "ADC synthase activity" RELATED [EC:2.6.1.85]
-synonym: "aminodeoxychorismate synthase activity" RELATED []
 synonym: "chorismate:L-glutamine amido-ligase activity" RELATED [EC:2.6.1.85]
 synonym: "p-aminobenzoate synthetase" RELATED []
 synonym: "PabB activity" RELATED [EC:2.6.1.85]
@@ -298409,6 +298695,7 @@
 property_value: skos:exactMatch EC:2.6.1.85
 property_value: skos:exactMatch RHEA:11672
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0046821
@@ -299488,7 +299775,7 @@
 id: GO:0046912
 name: acyltransferase activity, acyl groups converted into alkyl on transfer
 namespace: molecular_function
-def: "Catalysis of the transfer of an acyl group from one compound (donor) to another (acceptor), with the acyl group being converted into alkyl on transfer." [GOC:jl]
+def: "Catalysis of the transfer of an acyl group from one compound (donor) to another (acceptor), with the acyl group being converted into alkyl on transfer." [EC:2.3.3.-, GOC:jl]
 synonym: "acyltransferase, acyl groups converted into alkyl on transfer" EXACT []
 synonym: "transferase activity, transferring acyl groups, acyl groups converted into alkyl on transfer" EXACT []
 xref: EC:2.3.3.-
@@ -299595,7 +299882,6 @@
 xref: Reactome:R-HSA-5173192 "POFUT2 transfers fucose to TSR domain-containing proteins"
 is_a: GO:0008417 ! fucosyltransferase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
-relationship: part_of GO:0036066 ! protein O-linked glycosylation via fucose
 property_value: skos:exactMatch EC:2.4.1.221
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -303156,7 +303442,7 @@
 id: GO:0047151
 name: tRNA (uracil(54)-C5)-methyltransferase activity, 5,10-methylenetetrahydrofolate-dependent
 namespace: molecular_function
-def: "Catalysis of the reaction: 5,10-methylenetetrahydrofolate + tRNA containing uridine at position 54 + FADH + H+ = tetrahydrofolate + tRNA containing ribothymidine at position 54 + FAD+." [EC:2.1.1.74, MetaCyc:2.1.1.74-RXN]
+def: "Catalysis of the reaction: uridine54 in tRNA + (6R)-5,10-methylene-5,6,7,8-tetrahydrofolate + NAD(P)H + H+ = 5-methyluridine54 in tRNA + (6S)-5,6,7,8-tetrahydrofolate + NAD(P)+." [EC:2.1.1.74]
 synonym: "5,10-methylenetetrahydrofolate:tRNA (uracil-5-)-methyltransferase activity" RELATED [EC:2.1.1.74]
 synonym: "5,10-methylenetetrahydrofolate:tRNA-UPsiC (uracil-5-)-methyl-transferase activity" RELATED [EC:2.1.1.74]
 synonym: "folate-dependent ribothymidyl synthase activity" RELATED [EC:2.1.1.74]
@@ -303167,9 +303453,11 @@
 xref: KEGG_REACTION:R03704
 xref: MetaCyc:2.1.1.74-RXN
 xref: RHEA:16873
+xref: RHEA:62372
 is_a: GO:0016300 ! tRNA (uridine) methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.74
-property_value: skos:exactMatch RHEA:16873
+property_value: skos:narrowMatch RHEA:16873
+property_value: skos:narrowMatch RHEA:62372
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26118" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -303976,7 +304264,7 @@
 id: GO:0047198
 name: L-cysteine-S-conjugate N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-substituted L-cysteine + acetyl-CoA = S-substituted N-acetyl-L-cysteine + CoA + H+." [EC:2.3.1.80, RHEA:19213]
+def: "Catalysis of the reaction: S-substituted L-cysteine + acetyl-CoA = S-substituted N-acetyl-L-cysteine + CoA + H+." [RHEA:19213]
 synonym: "acetyl-CoA:S-substituted L-cysteine N-acetyltransferase activity" RELATED [EC:2.3.1.80]
 synonym: "cysteine-S-conjugate N-acetyltransferase activity" EXACT []
 xref: EC:2.3.1.80
@@ -304008,7 +304296,7 @@
 id: GO:0047200
 name: tetrahydrodipicolinate N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (S)-2,3,4,5-tetrahydrodipicolinate + acetyl-CoA + H2O = L-2-acetamido-6-oxopimelate + CoA." [EC:2.3.1.89, RHEA:13085]
+def: "Catalysis of the reaction: (S)-2,3,4,5-tetrahydrodipicolinate + acetyl-CoA + H2O = L-2-acetamido-6-oxopimelate + CoA." [RHEA:13085]
 synonym: "acetyl-CoA:(S)-2,3,4,5-tetrahydrodipicolinate-2,6-dicarboxylate N2-acetyltransferase activity" RELATED [EC:2.3.1.89]
 synonym: "acetyl-CoA:(S)-2,3,4,5-tetrahydropyridine-2,6-dicarboxylate 2-N-acetyltransferase activity" RELATED [EC:2.3.1.89]
 synonym: "acetyl-CoA:L-2,3,4,5-tetrahydrodipicolinate N2-acetyltransferase activity" RELATED [EC:2.3.1.89]
@@ -305689,39 +305977,41 @@
 id: GO:0047296
 name: homospermidine synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 putrescine = NH3 + sym-homospermidine." [EC:2.5.1.44]
+def: "Catalysis of the reaction: 2 putrescine = sym-homospermidine + NH4+." [RHEA:18645]
 synonym: "putrescine:putrescine 4-aminobutyltransferase (ammonia-forming)" RELATED [EC:2.5.1.44]
-xref: EC:2.5.1.44
 xref: MetaCyc:2.5.1.44-RXN
 xref: RHEA:18645
 is_a: GO:0016765 ! transferase activity, transferring alkyl or aryl (other than methyl) groups
-property_value: skos:exactMatch EC:2.5.1.44
+property_value: skos:broadMatch EC:2.5.1.44
 property_value: skos:exactMatch RHEA:18645
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0047297
-name: asparagine-oxo-acid transaminase activity
+name: L-asparagine:oxo-acid transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a 2-oxo acid + L-asparagine = an amino acid + 2-oxosuccinamate." [RHEA:19813]
+def: "Catalysis of the reaction: L-asparagine + a 2-oxocarboxylate = 2-oxosuccinamate + an L-alpha-amino acid." [RHEA:19813]
 synonym: "asparagine--oxo-acid aminotransferase activity" RELATED [EC:2.6.1.14]
 synonym: "asparagine-keto acid aminotransferase activity" RELATED [EC:2.6.1.14]
 synonym: "asparagine-oxo-acid aminotransferase activity" EXACT []
+synonym: "asparagine-oxo-acid transaminase activity" EXACT []
 synonym: "L-asparagine:2-oxo-acid aminotransferase activity" RELATED [EC:2.6.1.14]
 xref: EC:2.6.1.14
 xref: MetaCyc:2.6.1.14-RXN
 xref: RHEA:19813
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.14
 property_value: skos:exactMatch RHEA:19813
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047298
-name: (S)-3-amino-2-methylpropionate transaminase activity
+name: (S)-3-amino-2-methylpropionate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (S)-3-amino-2-methylpropanoate + 2-oxoglutarate = 2-methyl-3-oxopropanoate + L-glutamate." [EC:2.6.1.22, RHEA:13993]
+def: "Catalysis of the reaction: (S)-3-amino-2-methylpropanoate + 2-oxoglutarate = 2-methyl-3-oxopropanoate + L-glutamate." [RHEA:13993]
 synonym: "(S)-3-amino-2-methylpropanoate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.22]
 synonym: "(S)-3-amino-2-methylpropionate aminotransferase activity" EXACT []
+synonym: "(S)-3-amino-2-methylpropionate transaminase activity" EXACT []
 synonym: "beta-aminobutyric transaminase activity" RELATED [EC:2.6.1.22]
 synonym: "beta-aminoisobutyrate-alpha-ketoglutarate transaminase activity" RELATED [EC:2.6.1.22]
 synonym: "L-3-aminoisobutyrate aminotransferase activity" RELATED [EC:2.6.1.22]
@@ -305736,32 +306026,36 @@
 property_value: skos:exactMatch EC:2.6.1.22
 property_value: skos:exactMatch RHEA:13993
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047299
-name: tryptophan-phenylpyruvate transaminase activity
+name: L-tryptophan:phenylpyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: keto-phenylpyruvate + L-tryptophan = 3-(indol-3-yl)pyruvate + L-phenylalanine." [EC:2.6.1.28, RHEA:13741]
+def: "Catalysis of the reaction: 3-phenylpyruvate + L-tryptophan = indole-3-pyruvate + L-phenylalanine." [RHEA:13741]
 synonym: "L-tryptophan-alpha-ketoisocaproate aminotransferase activity" RELATED [EC:2.6.1.28]
 synonym: "L-tryptophan:phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.28]
 synonym: "tryptophan--phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.28]
 synonym: "tryptophan-phenylpyruvate aminotransferase activity" EXACT []
+synonym: "tryptophan-phenylpyruvate transaminase activity" EXACT []
 xref: EC:2.6.1.28
 xref: KEGG_REACTION:R01376
 xref: MetaCyc:2.6.1.28-RXN
 xref: RHEA:13741
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.28
 property_value: skos:exactMatch RHEA:13741
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047300
-name: pyridoxamine-pyruvate transaminase activity
+name: pyridoxamine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pyridoxamine + pyruvate = L-alanine + pyridoxal." [EC:2.6.1.30, RHEA:12841]
+def: "Catalysis of the reaction: pyridoxamine + pyruvate = L-alanine + pyridoxal." [RHEA:12841]
 synonym: "pyridoxamine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.30]
 synonym: "pyridoxamine-pyruvate aminotransferase activity" EXACT []
+synonym: "pyridoxamine-pyruvate transaminase activity" EXACT []
 synonym: "pyridoxamine-pyruvic transaminase" BROAD [EC:2.6.1.30]
 synonym: "pyridoxamine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.30]
 synonym: "pyridoxamineu-pyruvic transaminase activity" RELATED [EC:2.6.1.30]
@@ -305773,32 +306067,36 @@
 property_value: skos:exactMatch EC:2.6.1.30
 property_value: skos:exactMatch RHEA:12841
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047301
-name: valine-3-methyl-2-oxovalerate transaminase activity
+name: L-valine:3-methyl-2-oxovalerate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (S)-3-methyl-2-oxopentanoate + L-valine = 3-methyl-2-oxobutanoate + L-isoleucine." [EC:2.6.1.32, RHEA:11468]
+def: "Catalysis of the reaction: (S)-3-methyl-2-oxopentanoate + L-valine = 3-methyl-2-oxobutanoate + L-isoleucine." [RHEA:11468]
 synonym: "L-valine:(S)-3-methyl-2-oxopentanoate aminotransferase activity" RELATED [EC:2.6.1.32]
 synonym: "valine--3-methyl-2-oxovalerate aminotransferase activity" RELATED [EC:2.6.1.32]
 synonym: "valine--isoleucine aminotransferase activity" RELATED [EC:2.6.1.32]
 synonym: "valine--isoleucine transaminase activity" RELATED [EC:2.6.1.32]
 synonym: "valine-2-keto-methylvalerate aminotransferase activity" RELATED [EC:2.6.1.32]
 synonym: "valine-3-methyl-2-oxovalerate aminotransferase activity" EXACT []
+synonym: "valine-3-methyl-2-oxovalerate transaminase activity" EXACT []
 xref: EC:2.6.1.32
 xref: KEGG_REACTION:R02200
 xref: MetaCyc:2.6.1.32-RXN
 xref: RHEA:11468
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.32
 property_value: skos:exactMatch RHEA:11468
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047302
-name: UDP-2-acetamido-4-amino-2,4,6-trideoxyglucose transaminase activity
+name: UDP-N-acetylbacillosamine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + UDP-2-acetamido-4-amino-2,4,6-trideoxy-D-glucose = L-glutamate + UDP-2-acetamido-4-dehydro-2,6-dideoxy-beta-D-glucose." [PMID:16286454, RHEA:31663]
+def: "Catalysis of the reaction: UDP-N-acetylbacillosamine + 2-oxoglutarate = UDP-2-acetamido-2,6-dideoxy-alpha-D-xylo-hex-4-ulose + L-glutamate." [PMID:16286454, RHEA:31663]
+synonym: "UDP-2-acetamido-4-amino-2,4,6-trideoxyglucose transaminase activity" BROAD []
 synonym: "UDP-2-acetamido-4-amino-2,4,6-trideoxyglucose:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.34]
 synonym: "UDP-4-amino-2-acetamido-2,4,6-trideoxyglucose aminotransferase activity" EXACT []
 synonym: "UDP-4-amino-2-acetamido-2,4,6-trideoxyglucose transaminase activity" EXACT []
@@ -305811,30 +306109,33 @@
 property_value: skos:exactMatch EC:2.6.1.34
 property_value: skos:exactMatch RHEA:31663
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047303
-name: glycine-oxaloacetate transaminase activity
+name: glycine:oxaloacetate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glycine + oxaloacetate = L-aspartate + glyoxylate." [EC:2.6.1.35, RHEA:17141]
+def: "Catalysis of the reaction: glycine + oxaloacetate = L-aspartate + glyoxylate." [RHEA:17141]
 synonym: "glycine--oxaloacetate aminotransferase activity" RELATED [EC:2.6.1.35]
 synonym: "glycine-oxalacetate aminotransferase activity" RELATED [EC:2.6.1.35]
 synonym: "glycine-oxaloacetate aminotransferase activity" EXACT []
+synonym: "glycine-oxaloacetate transaminase activity" EXACT []
 synonym: "glycine:oxaloacetate aminotransferase activity" RELATED [EC:2.6.1.35]
 xref: EC:2.6.1.35
 xref: KEGG_REACTION:R00373
 xref: MetaCyc:2.6.1.35-RXN
 xref: RHEA:17141
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.35
 property_value: skos:exactMatch RHEA:17141
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047304
-name: 2-aminoethylphosphonate-pyruvate transaminase activity
+name: 2-aminoethylphosphonate:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (2-aminoethyl)phosphonate + pyruvate = L-alanine + phosphonoacetaldehyde." [EC:2.6.1.37, RHEA:17021]
+def: "Catalysis of the reaction: (2-aminoethyl)phosphonate + pyruvate = L-alanine + phosphonoacetaldehyde." [RHEA:17021]
 synonym: "(2-aminoethyl)phosphonate aminotransferase activity" RELATED [EC:2.6.1.37]
 synonym: "(2-aminoethyl)phosphonate transaminase activity" RELATED [EC:2.6.1.37]
 synonym: "(2-aminoethyl)phosphonate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.37]
@@ -305843,6 +306144,7 @@
 synonym: "2-aminoethylphosphonate aminotransferase activity" RELATED [EC:2.6.1.37]
 synonym: "2-aminoethylphosphonate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.37]
 synonym: "2-aminoethylphosphonate-pyruvate aminotransferase activity" EXACT []
+synonym: "2-aminoethylphosphonate-pyruvate transaminase activity" EXACT []
 xref: EC:2.6.1.37
 xref: KEGG_REACTION:R04152
 xref: MetaCyc:2.6.1.37-RXN
@@ -305851,20 +306153,21 @@
 property_value: skos:exactMatch EC:2.6.1.37
 property_value: skos:exactMatch RHEA:17021
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047305
-name: (R)-3-amino-2-methylpropionate-pyruvate transaminase activity
+name: (R)-3-amino-2-methylpropionate:pyruvate transaminase activity
 namespace: molecular_function
 alt_id: GO:0047314
-def: "Catalysis of the reaction: (2R)-3-amino-2-methylpropanoate + pyruvate = 2-methyl-3-oxopropanoate + L-alanine." [EC:2.6.1.40, RHEA:18393]
-comment: Note that this function was EC:2.6.1.61.
+def: "Catalysis of the reaction: (R)-3-amino-2-methylpropanoate + pyruvate = 2-methyl-3-oxopropanoate + L-alanine." [RHEA:18393]
 synonym: "(R)-3-amino-2-methylpropanoate aminotransferase activity" EXACT []
 synonym: "(R)-3-amino-2-methylpropanoate transaminase activity" EXACT []
 synonym: "(R)-3-amino-2-methylpropanoate:pyruvate aminotransferase activity" RELATED [EC:2.6.1.40]
 synonym: "(R)-3-amino-2-methylpropionate transaminase activity" EXACT []
 synonym: "(R)-3-amino-2-methylpropionate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.40]
 synonym: "(R)-3-amino-2-methylpropionate-pyruvate aminotransferase activity" EXACT []
+synonym: "(R)-3-amino-2-methylpropionate-pyruvate transaminase activity" EXACT []
 synonym: "beta-aminoisobutyrate--pyruvate transaminase activity" RELATED [EC:2.6.1.40]
 synonym: "beta-aminoisobutyrate-pyruvate aminotransferase activity" RELATED [EC:2.6.1.40]
 synonym: "D-3-aminoisobutyrate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.40]
@@ -305881,33 +306184,37 @@
 property_value: skos:exactMatch EC:2.6.1.40
 property_value: skos:exactMatch RHEA:18393
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047306
-name: D-methionine-pyruvate transaminase activity
+name: D-methionine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-methionine + pyruvate = 4-methylthio-2-oxobutanoate + L-alanine." [EC:2.6.1.41, RHEA:23836]
+def: "Catalysis of the reaction: D-methionine + pyruvate = 4-methylthio-2-oxobutanoate + L-alanine." [RHEA:23836]
 synonym: "D-methionine aminotransferase activity" RELATED [EC:2.6.1.41]
 synonym: "D-methionine transaminase activity" RELATED [EC:2.6.1.41]
 synonym: "D-methionine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.41]
 synonym: "D-methionine-pyruvate aminotransferase activity" EXACT []
+synonym: "D-methionine-pyruvate transaminase activity" EXACT []
 synonym: "D-methionine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.41]
 xref: EC:2.6.1.41
 xref: KEGG_REACTION:R03001
 xref: MetaCyc:2.6.1.41-RXN
 xref: RHEA:23836
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.41
 property_value: skos:exactMatch RHEA:23836
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047307
-name: diaminobutyrate-pyruvate transaminase activity
+name: L-2,4-diaminobutyrate:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-2,4-diaminobutyrate + pyruvate = L-alanine + L-aspartate 4-semialdehyde." [EC:2.6.1.46, RHEA:12380]
+def: "Catalysis of the reaction: L-2,4-diaminobutyrate + pyruvate = L-alanine + L-aspartate 4-semialdehyde." [RHEA:12380]
 synonym: "diaminobutyrate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.46]
 synonym: "diaminobutyrate-pyruvate aminotransferase activity" EXACT []
+synonym: "diaminobutyrate-pyruvate transaminase activity" EXACT []
 synonym: "L-2,4-diaminobutanoate:pyruvate aminotransferase activity" RELATED [EC:2.6.1.46]
 synonym: "L-diaminobutyric acid transaminase activity" RELATED [EC:2.6.1.46]
 xref: EC:2.6.1.46
@@ -305918,12 +306225,13 @@
 property_value: skos:exactMatch EC:2.6.1.46
 property_value: skos:exactMatch RHEA:12380
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047308
-name: alanine-oxomalonate transaminase activity
+name: L-alanine:oxomalonate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-alanine + oxomalonate = aminomalonate + pyruvate." [EC:2.6.1.47, RHEA:18809]
+def: "Catalysis of the reaction: L-alanine + oxomalonate = aminomalonate + pyruvate." [RHEA:18809]
 synonym: "alanine--oxomalonate aminotransferase activity" RELATED [EC:2.6.1.47]
 synonym: "alanine-ketomalonate (mesoxalate) transaminase activity" RELATED [EC:2.6.1.47]
 synonym: "alanine-oxomalonate aminotransferase activity" EXACT []
@@ -305933,19 +306241,21 @@
 xref: KEGG_REACTION:R02970
 xref: MetaCyc:2.6.1.47-RXN
 xref: RHEA:18809
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.47
 property_value: skos:exactMatch RHEA:18809
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047309
-name: dihydroxyphenylalanine transaminase activity
+name: dihydroxyphenylalanine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-dopa = 3,4-dihydroxyphenylpyruvate + L-glutamate." [EC:2.6.1.49, RHEA:15273]
+def: "Catalysis of the reaction: L-dopa + 2-oxoglutarate = 3-(3,4-dihydroxyphenyl)pyruvate + L-glutamate." [RHEA:15273]
 synonym: "3,4-dihydroxy-L-phenylalanine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.49]
 synonym: "aspartate-DOPP transaminase (ADT)" RELATED [EC:2.6.1.49]
 synonym: "dihydroxyphenylalanine aminotransferase activity" EXACT []
+synonym: "dihydroxyphenylalanine transaminase activity" EXACT []
 synonym: "DOPA aminotransferase activity" RELATED [EC:2.6.1.49]
 synonym: "dopa transaminase activity" RELATED [EC:2.6.1.49]
 synonym: "glutamate-DOPP transaminase (GDT)" RELATED [EC:2.6.1.49]
@@ -305955,19 +306265,20 @@
 xref: KEGG_REACTION:R02077
 xref: MetaCyc:2.6.1.49-RXN
 xref: RHEA:15273
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.49
 property_value: skos:exactMatch RHEA:15273
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
 id: GO:0047310
-name: glutamine-scyllo-inositol transaminase activity
+name: L-glutamine:scyllo-inositol transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,4,6/3,5-pentahydroxycyclohexanone + L-glutamine = 1-amino-1-deoxy-scyllo-inositol + 2-oxoglutaramate." [EC:2.6.1.50, RHEA:22920]
+def: "Catalysis of the reaction: scyllo-inosose + L-glutamine = 1-amino-1-deoxy-scyllo-inositol + 2-oxoglutaramate." [RHEA:22920]
 synonym: "glutamine scyllo-inosose aminotransferase activity" RELATED [EC:2.6.1.50]
 synonym: "glutamine--scyllo-inosose aminotransferase activity" RELATED [EC:2.6.1.50]
 synonym: "glutamine--scyllo-inosose transaminase activity" RELATED [EC:2.6.1.50]
+synonym: "glutamine-scyllo-inositol transaminase activity" EXACT []
 synonym: "glutamine-scyllo-inosose aminotransferase activity" EXACT []
 synonym: "glutamine-scyllo-inosose transaminase activity" EXACT []
 synonym: "L-glutamine-keto-scyllo-inositol aminotransferase activity" RELATED [EC:2.6.1.50]
@@ -305977,17 +306288,19 @@
 xref: KEGG_REACTION:R02781
 xref: MetaCyc:2.6.1.50-RXN
 xref: RHEA:22920
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.50
 property_value: skos:exactMatch RHEA:22920
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047311
-name: 1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol transaminase activity
+name: 1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol + pyruvate = 1D-1-guanidino-1-deoxy-3-dehydro-scyllo-inositol + L-alanine." [EC:2.6.1.56, RHEA:15497]
+def: "Catalysis of the reaction: 1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol + pyruvate = 1D-1-guanidino-1-deoxy-3-dehydro-scyllo-inositol + L-alanine." [RHEA:15497]
 synonym: "1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol aminotransferase activity" EXACT []
+synonym: "1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol transaminase activity" EXACT []
 synonym: "1D-1-guanidino-3-amino-1,3-dideoxy-scyllo-inositol:pyruvate aminotransferase activity" RELATED [EC:2.6.1.56]
 synonym: "guanidinoaminodideoxy-scyllo-inositol-pyruvate aminotransferase activity" RELATED [EC:2.6.1.56]
 synonym: "L-alanine-N-amidino-3-(or 5-)keto-scyllo-inosamine transaminase activity" RELATED [EC:2.6.1.56]
@@ -305999,18 +306312,19 @@
 property_value: skos:exactMatch EC:2.6.1.56
 property_value: skos:exactMatch RHEA:15497
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047312
-name: L-phenylalanine-pyruvate transaminase activity
+name: L-phenylalanine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pyruvate + L-phenylalanine = phenylpyruvate + L-alanine." [RHEA:13053]
+def: "Catalysis of the reaction: L-phenylalanine + pyruvate = 3-phenylpyruvate + L-alanine." [RHEA:13053]
 synonym: "histidine aminotransferase activity" RELATED [GOC:kad]
 synonym: "histidine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.58, GOC:kad]
 synonym: "L-histidine:pyruvate aminotransferase activity" RELATED [GOC:kad]
 synonym: "L-phenylalanine(L-histidine):pyruvate aminotransferase activity" BROAD [EC:2.6.1.58]
+synonym: "L-phenylalanine-pyruvate transaminase activity" EXACT []
 synonym: "L-phenylalanine:pyruvate aminotransferase activity" EXACT []
-synonym: "L-phenylalanine:pyruvate transaminase activity" EXACT [GOC:kad]
 synonym: "phenylalanine (histidine) aminotransferase activity" BROAD [EC:2.6.1.58]
 synonym: "phenylalanine(histidine) aminotransferase activity" BROAD []
 synonym: "phenylalanine(histidine) transaminase activity" BROAD [EC:2.6.1.58]
@@ -306019,33 +306333,37 @@
 xref: MetaCyc:2.6.1.58-RXN
 xref: Reactome:R-HSA-893593 "phenylalanine + pyruvate => 3-(indol-3-yl)pyruvate + alanine"
 xref: RHEA:13053
-is_a: GO:0008793 ! aromatic-amino-acid transaminase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:broadMatch EC:2.6.1.58
 property_value: skos:exactMatch RHEA:13053
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047313
-name: aromatic-amino-acid-glyoxylate transaminase activity
+name: aromatic-amino-acid:glyoxylate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glyoxylate + an aromatic amino acid = L-glycine + an aromatic oxo acid." [EC:2.6.1.60, MetaCyc:2.6.1.60-RXN]
+def: "Catalysis of the reaction: an aromatic L-alpha-amino acid + glyoxylate = an aromatic oxo-acid + glycine." [RHEA:10900]
 synonym: "aromatic-amino-acid--glyoxylate aminotransferase activity" RELATED [EC:2.6.1.60]
 synonym: "aromatic-amino-acid-glyoxylate aminotransferase activity" EXACT []
+synonym: "aromatic-amino-acid-glyoxylate transaminase activity" EXACT []
 synonym: "aromatic-amino-acid:glyoxylate aminotransferase activity" RELATED [EC:2.6.1.60]
 xref: EC:2.6.1.60
 xref: MetaCyc:2.6.1.60-RXN
 xref: RHEA:10900
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.60
 property_value: skos:exactMatch RHEA:10900
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047315
-name: kynurenine-glyoxylate transaminase activity
+name: L-kynurenine:glyoxylate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-kynurenine + glyoxylate = 4-(2-aminophenyl)-2,4-dioxobutanoate + glycine." [EC:2.6.1.63, RHEA:19249]
+def: "Catalysis of the reaction: L-kynurenine + glyoxylate = 4-(2-aminophenyl)-2,4-dioxobutanoate + glycine." [RHEA:19249]
 synonym: "kynurenine--glyoxylate aminotransferase activity" RELATED [EC:2.6.1.63]
 synonym: "kynurenine-glyoxylate aminotransferase activity" EXACT []
+synonym: "kynurenine-glyoxylate transaminase activity" EXACT []
 synonym: "L-kynurenine:glyoxylate aminotransferase (cyclizing)" RELATED [EC:2.6.1.63]
 xref: EC:2.6.1.63
 xref: KEGG_REACTION:R01957
@@ -306055,34 +306373,38 @@
 property_value: skos:exactMatch EC:2.6.1.63
 property_value: skos:exactMatch RHEA:19249
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047316
-name: glutamine-phenylpyruvate transaminase activity
+name: L-glutamine:phenylpyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: keto-phenylpyruvate + L-glutamine = 2-oxoglutaramate + L-phenylalanine." [EC:2.6.1.64, RHEA:17593]
+def: "Catalysis of the reaction: 3-phenylpyruvate + L-glutamine = 2-oxoglutaramate + L-phenylalanine." [RHEA:17593]
 synonym: "glutamine transaminase K activity" RELATED [EC:2.6.1.64]
 synonym: "glutamine--phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.64]
 synonym: "glutamine-phenylpyruvate aminotransferase activity" EXACT []
+synonym: "glutamine-phenylpyruvate transaminase activity" EXACT []
 synonym: "L-glutamine:phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.64]
 xref: EC:2.6.1.64
 xref: KEGG_REACTION:R01375
 xref: MetaCyc:2.6.1.64-RXN
 xref: RHEA:17593
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.64
 property_value: skos:exactMatch RHEA:17593
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047317
-name: N6-acetyl-beta-lysine transaminase activity
+name: N6-acetyl-beta-lysine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + 3-amino-6-acetamidohexanoate = L-glutamate + 3-oxo-6-acetamidohexanoate." [EC:2.6.1.65, MetaCyc:2.6.1.65-RXN]
+def: "Catalysis of the reaction: 2-oxoglutarate + 3-amino-6-acetamidohexanoate = L-glutamate + 3-oxo-6-acetamidohexanoate." [RHEA:16889]
 synonym: "6-acetamido-3-aminohexanoate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.65]
 synonym: "epsilon-acetyl-beta-lysine aminotransferase activity" RELATED [EC:2.6.1.65]
 synonym: "N(6)-acetyl-beta-lysine aminotransferase activity" RELATED [EC:2.6.1.65]
 synonym: "N6-acetyl-beta-lysine aminotransferase activity" EXACT []
+synonym: "N6-acetyl-beta-lysine transaminase activity" EXACT []
 xref: EC:2.6.1.65
 xref: MetaCyc:2.6.1.65-RXN
 xref: RHEA:16889
@@ -306090,29 +306412,33 @@
 property_value: skos:exactMatch EC:2.6.1.65
 property_value: skos:exactMatch RHEA:16889
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047319
-name: aspartate-phenylpyruvate transaminase activity
+name: L-aspartate:phenylpyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: keto-phenylpyruvate + L-aspartate = L-phenylalanine + oxaloacetate." [RHEA:14097]
+def: "Catalysis of the reaction: L-aspartate + 3-phenylpyruvate = oxaloacetate + L-phenylalanine." [RHEA:14097]
 synonym: "aspartate--phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.70]
+synonym: "aspartate-phenylpyruvate transaminase activity" EXACT []
 synonym: "aspartate:phenylpyruvate aminotransferase activity" EXACT []
 synonym: "L-aspartate:phenylpyruvate aminotransferase activity" RELATED [EC:2.6.1.70]
 xref: EC:2.6.1.70
 xref: KEGG_REACTION:R00695
 xref: MetaCyc:2.6.1.70-RXN
 xref: RHEA:14097
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.70
 property_value: skos:exactMatch RHEA:14097
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047320
-name: D-4-hydroxyphenylglycine transaminase activity
+name: D-4-hydroxyphenylglycine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + D-4-hydroxyphenylglycine = 4-hydroxyphenylglyoxylate + L-glutamate." [EC:2.6.1.72, RHEA:15589]
+def: "Catalysis of the reaction: 2-oxoglutarate + D-4-hydroxyphenylglycine = 4-hydroxyphenylglyoxylate + L-glutamate." [RHEA:15589]
 synonym: "D-4-hydroxyphenylglycine aminotransferase activity" EXACT []
+synonym: "D-4-hydroxyphenylglycine transaminase activity" EXACT []
 synonym: "D-4-hydroxyphenylglycine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.72]
 synonym: "D-hydroxyphenylglycine aminotransferase activity" RELATED [EC:2.6.1.72]
 xref: EC:2.6.1.72
@@ -306123,6 +306449,7 @@
 property_value: skos:exactMatch EC:2.6.1.72
 property_value: skos:exactMatch RHEA:15589
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047321
@@ -306299,7 +306626,7 @@
 id: GO:0047329
 name: phosphoramidate-hexose phosphotransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: hexose + phosphoramidate = hexose 1-phosphate + NH3." [EC:2.7.1.62, MetaCyc:2.7.1.62-RXN]
+def: "Catalysis of the reaction: phosphoramidate + a D-hexose + H+ = alpha-D-hexose 1-phosphate + NH4+." [RHEA:10972]
 synonym: "phosphoramidate-hexose transphosphorylase activity" RELATED [EC:2.7.1.62]
 synonym: "phosphoramidate:hexose 1-phosphotransferase activity" RELATED [EC:2.7.1.62]
 synonym: "phosphoramidic-hexose transphosphorylase activity" RELATED [EC:2.7.1.62]
@@ -307767,7 +308094,7 @@
 id: GO:0047411
 name: 2-(acetamidomethylene)succinate hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 H2O + 2-(acetamidomethylene)succinate = CO2 + NH3 + succinate semialdehyde + acetate." [EC:3.5.1.29, MetaCyc:3.5.1.29-RXN]
+def: "Catalysis of the reaction: 2-(acetamidomethylene)succinate + 2 H2O + H+ = succinate semialdehyde + acetate + NH4+ + CO2." [RHEA:10432]
 synonym: "2-(acetamidomethylene)succinate amidohydrolase (deaminating, decarboxylating)" RELATED [EC:3.5.1.29]
 synonym: "alpha-(N-acetylaminomethylene)succinic acid hydrolase activity" RELATED [EC:3.5.1.29]
 xref: EC:3.5.1.29
@@ -307867,7 +308194,7 @@
 id: GO:0047417
 name: N-carbamoyl-D-amino acid hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + N-carbamoyl-D-amino acid = CO2 + NH3 + D-amino acid." [EC:3.5.1.77, MetaCyc:3.5.1.77-RXN]
+def: "Catalysis of the reaction: an N-carbamoyl-D-amino acid + H2O + 2 H+ = a D-alpha-amino acid + NH4+ + CO2." [RHEA:11000]
 synonym: "N-carbamoyl-D-amino acid amidohydrolase activity" RELATED [EC:3.5.1.77]
 xref: EC:3.5.1.77
 xref: MetaCyc:3.5.1.77-RXN
@@ -307974,7 +308301,7 @@
 id: GO:0047424
 name: methylenediurea deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 H2O + methylenediurea = CO2 + 2 NH3 + N-hydroxymethylurea." [EC:3.5.3.21, MetaCyc:3.5.3.21-RXN, RHEA:15929]
+def: "Catalysis of the reaction: methylenediurea + 2 H2O + 2 H+ = N-(hydroxymethyl)urea + 2 NH4+ + CO2." [RHEA:15929]
 synonym: "methylenediurea aminohydrolase activity" RELATED [EC:3.5.3.21]
 synonym: "methylenediurease activity" RELATED [EC:3.5.3.21]
 xref: EC:3.5.3.21
@@ -308007,7 +308334,7 @@
 id: GO:0047426
 name: ricinine nitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + ricinine = NH3 + 3-carboxy-4-methoxy-N-methyl-2-pyridone." [EC:3.5.5.2]
+def: "Catalysis of the reaction: 	ricinine + 2 H2O = 4-methoxy-1-methyl-2-oxo-1,2-dihydropyridine-3-carboxylate + NH4+." [RHEA:22704]
 synonym: "ricinine aminohydrolase activity" RELATED [EC:3.5.5.2]
 xref: EC:3.5.5.2
 xref: MetaCyc:3.5.5.2-RXN
@@ -308037,7 +308364,7 @@
 id: GO:0047428
 name: arylacetonitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 H2O + 4-chlorophenylacetonitrile = 4-chlorophenylacetate + NH3." [EC:3.5.5.5]
+def: "Catalysis of the reaction: 4-chlorophenylacetonitrile + 2 H2O = 4-chlorophenylacetate + NH4+." [RHEA:20657]
 synonym: "arylacetonitrile aminohydrolase activity" RELATED [EC:3.5.5.5]
 xref: EC:3.5.5.5
 xref: MetaCyc:3.5.5.5-RXN
@@ -308379,7 +308706,7 @@
 id: GO:0047447
 name: erythro-3-hydroxyaspartate ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: erythro-3-hydroxy-L-aspartate = NH3 + oxaloacetic acid." [EC:4.3.1.20, MetaCyc:4.3.1.20-RXN]
+def: "Catalysis of the reaction: 3-hydroxy-L-aspartate = oxaloacetate + NH4+." [RHEA:19757]
 synonym: "3-hydroxyaspartate dehydratase activity" BROAD [EC:4.3.1.20]
 synonym: "erythro-3-hydroxy-L(s)-aspartate hydro-lyase (deaminating) activity" RELATED [EC:4.3.1.20]
 synonym: "erythro-3-hydroxy-Ls-aspartate ammonia-lyase (oxaloacetate-forming)" RELATED [EC:4.3.1.20]
@@ -309774,13 +310101,17 @@
 id: GO:0047530
 name: 2,4-diaminopentanoate dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,4-diaminopentanoate + H2O + NAD(P)+ = 2-amino-4-oxopentanoate + NH3 + NAD(P)H + H+." [EC:1.4.1.12, MetaCyc:24-DIAMINOPENTANOATE-DEHYDROGENASE-RXN]
+def: "Catalysis of the reaction: (2R,4S)-2,4-diaminopentanoate + NADP+ + H2O = (2R)-2-amino-4-oxopentanoate + NH4+ + NADPH + H+." [EC:1.4.1.12]
 synonym: "2,4-diaminopentanoate:NAD(P)+ oxidoreductase (deaminating)" RELATED [EC:1.4.1.12]
 synonym: "2,4-diaminopentanoic acid C4 dehydrogenase activity" RELATED [EC:1.4.1.12]
 xref: EC:1.4.1.12
 xref: MetaCyc:24-DIAMINOPENTANOATE-DEHYDROGENASE-RXN
+xref: RHEA:24192
+xref: RHEA:24196
 is_a: GO:0016639 ! oxidoreductase activity, acting on the CH-NH2 group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.4.1.12
+property_value: skos:narrowMatch RHEA:24192
+property_value: skos:narrowMatch RHEA:24196
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -309859,10 +310190,11 @@
 
 [Term]
 id: GO:0047536
-name: 2-aminoadipate transaminase activity
+name: L-2-aminoadipate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-2-aminoadipate = 2-oxoadipate + L-glutamate." [EC:2.6.1.39, RHEA:12601]
+def: "Catalysis of the reaction: L-2-aminoadipate + 2-oxoglutarate = 2-oxoadipate + L-glutamate." [RHEA:12601]
 synonym: "2-aminoadipate aminotransferase activity" EXACT []
+synonym: "2-aminoadipate transaminase activity" EXACT []
 synonym: "2-aminoadipic aminotransferase activity" RELATED [EC:2.6.1.39]
 synonym: "alpha-aminoadipate aminotransferase activity" RELATED [EC:2.6.1.39]
 synonym: "glutamate-alpha-ketoadipate transaminase activity" RELATED [EC:2.6.1.39]
@@ -309878,13 +310210,15 @@
 property_value: skos:exactMatch EC:2.6.1.39
 property_value: skos:exactMatch RHEA:12601
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047537
-name: 2-aminohexanoate transaminase activity
+name: L-2-aminohexanoate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-2-aminohexanoate + 2-oxoglutarate = 2-oxohexanoate + L-glutamate." [EC:2.6.1.67, MetaCyc:2-AMINOHEXANOATE-AMINOTRANSFERASE-RXN]
+def: "Catalysis of the reaction: L-2-aminohexanoate + 2-oxoglutarate = 2-oxohexanoate + L-glutamate." [RHEA:23600]
 synonym: "2-aminohexanoate aminotransferase activity" EXACT []
+synonym: "2-aminohexanoate transaminase activity" EXACT []
 synonym: "L-2-aminohexanoate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.67]
 synonym: "leucine L-norleucine: 2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.67]
 synonym: "norleucine (leucine) aminotransferase activity" RELATED [EC:2.6.1.67]
@@ -309897,6 +310231,7 @@
 property_value: skos:exactMatch EC:2.6.1.67
 property_value: skos:exactMatch RHEA:23600
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047538
@@ -310625,19 +310960,21 @@
 
 [Term]
 id: GO:0047578
-name: 4-hydroxyglutamate transaminase activity
+name: (4S)-4-hydroxy-L-glutamate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-hydroxy-L-glutamate + 2-oxoglutarate = 4-hydroxy-2-oxoglutarate + L-glutamate." [EC:2.6.1.23, MetaCyc:4-HYDROXYGLUTAMATE-AMINOTRANSFERASE-RXN]
+def: "Catalysis of the reaction: (4S)-4-hydroxy-L-glutamate + 2-oxoglutarate = (4R)-4-hydroxy-2-oxoglutarate + L-glutamate." [RHEA:31235]
 synonym: "4-hydroxy-L-glutamate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.23]
 synonym: "4-hydroxyglutamate aminotransferase activity" EXACT []
+synonym: "4-hydroxyglutamate transaminase activity" EXACT []
 xref: EC:2.6.1.23
 xref: MetaCyc:4-HYDROXYGLUTAMATE-AMINOTRANSFERASE-RXN
 xref: Reactome:R-HSA-6784393 "PXLP-K279-GOT2 dimer transaminates 4-OH-L-glutamate to 4-hydroxy-2-oxoglutarate (HOG)"
-xref: RHEA:10480
+xref: RHEA:31235
 is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch EC:2.6.1.23
-property_value: skos:exactMatch RHEA:10480
+property_value: skos:exactMatch RHEA:31235
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047579
@@ -310792,7 +311129,7 @@
 id: GO:0047588
 name: 5-aminopentanamidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-aminopentanamide + H2O = 5-aminopentanoate + NH3." [EC:3.5.1.30, MetaCyc:5-AMINOPENTANAMIDASE-RXN]
+def: "Catalysis of the reaction: 5-aminopentanamide + H2O = 5-aminopentanoate + NH4+." [RHEA:15677]
 synonym: "5-aminonorvaleramidase activity" RELATED [EC:3.5.1.30]
 synonym: "5-aminopentanamide amidohydrolase activity" RELATED [EC:3.5.1.30]
 synonym: "5-aminovaleramidase activity" RELATED [EC:3.5.1.30]
@@ -310806,11 +311143,12 @@
 
 [Term]
 id: GO:0047589
-name: 5-aminovalerate transaminase activity
+name: 5-aminovalerate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + 5-aminopentanoate = 5-oxopentanoate + L-glutamate." [EC:2.6.1.48, RHEA:10212]
+def: "Catalysis of the reaction: 5-aminopentanoate + 2-oxoglutarate = 5-oxopentanoate + L-glutamate." [RHEA:10212]
 synonym: "5-aminopentanoate:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.48]
 synonym: "5-aminovalerate aminotransferase activity" EXACT []
+synonym: "5-aminovalerate transaminase activity" EXACT []
 synonym: "delta-aminovalerate aminotransferase activity" RELATED [EC:2.6.1.48]
 synonym: "delta-aminovalerate transaminase activity" RELATED [EC:2.6.1.48]
 xref: EC:2.6.1.48
@@ -310821,6 +311159,7 @@
 property_value: skos:exactMatch EC:2.6.1.48
 property_value: skos:exactMatch RHEA:10212
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047590
@@ -311393,7 +311732,7 @@
 id: GO:0047623
 name: adenosine-phosphate deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an adenosine-phosphate + H20 = an inosine phosphate + NH3. Catalyzes the deamination of AMP, ADP or ATP." [EC:3.5.4.17]
+def: "Catalysis of the reaction: an adenosine-phosphate + H20 = an inosine phosphate + NH4+. Catalyzes the deamination of AMP, ADP or ATP." [EC:3.5.4.17]
 comment: Consider instead annotating to one of the more specific terms: AMP deaminase activity ; GO:0003876, ADP deaminase activity ; GO:0047629, or ATP deaminase activity ; GO:0047692.
 synonym: "adenine nucleotide deaminase activity" RELATED [EC:3.5.4.17]
 synonym: "adenosine (phosphate) deaminase activity" RELATED [EC:3.5.4.17]
@@ -311485,7 +311824,7 @@
 id: GO:0047629
 name: ADP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ADP + H2O = IDP + NH3." [EC:3.5.4.7, MetaCyc:ADP-DEAMINASE-RXN]
+def: "Catalysis of the reaction: ADP + H2O + H+ = IDP + NH4+." [RHEA:12741]
 synonym: "adenosine diphosphate deaminase activity" RELATED [EC:3.5.4.7]
 synonym: "adenosinepyrophosphate deaminase activity" RELATED [EC:3.5.4.7]
 synonym: "ADP aminohydrolase activity" RELATED [EC:3.5.4.7]
@@ -311539,7 +311878,7 @@
 id: GO:0047632
 name: agmatine deiminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: agmatine + H2O = N-carbamoylputrescine + NH3." [EC:3.5.3.12, MetaCyc:AGMATINE-DEIMINASE-RXN]
+def: "Catalysis of the reaction: agmatine + H2O = N-carbamoylputrescine + NH4+." [RHEA:18037]
 synonym: "agmatine amidinohydrolase" BROAD [EC:3.5.3.12]
 synonym: "agmatine iminohydrolase activity" RELATED [EC:3.5.3.12]
 xref: EC:3.5.3.12
@@ -311588,23 +311927,25 @@
 
 [Term]
 id: GO:0047635
-name: alanine-oxo-acid transaminase activity
+name: L-alanine:oxo-acid transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-alanine + a 2-oxo acid = pyruvate + an L-amino acid." [EC:2.6.1.12, MetaCyc:ALANINE--OXO-ACID-AMINOTRANSFERASE-RXN]
+def: "Catalysis of the reaction: L-alanine + a 2-oxocarboxylate = an L-alpha-amino acid + pyruvate." [RHEA:19953]
 synonym: "alanine--oxo-acid aminotransferase activity" RELATED [EC:2.6.1.12]
 synonym: "alanine-keto acid aminotransferase activity" RELATED [EC:2.6.1.12]
 synonym: "alanine-oxo acid aminotransferase activity" RELATED [EC:2.6.1.12]
 synonym: "alanine-oxo-acid aminotransferase activity" EXACT []
+synonym: "GO Molecular Function help_outline	\nGO:0047635" EXACT []
 synonym: "L-alanine-alpha-keto acid aminotransferase activity" RELATED [EC:2.6.1.12]
 synonym: "L-alanine:2-oxo-acid aminotransferase activity" RELATED [EC:2.6.1.12]
 synonym: "leucine-alanine transaminase activity" RELATED [EC:2.6.1.12]
 xref: EC:2.6.1.12
 xref: MetaCyc:ALANINE--OXO-ACID-AMINOTRANSFERASE-RXN
 xref: RHEA:19953
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.12
 property_value: skos:exactMatch RHEA:19953
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047636
@@ -311883,7 +312224,7 @@
 id: GO:0047652
 name: allantoate deiminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: allantoate + H2O + H+ = CO2 + NH3 + ureidoglycine." [EC:3.5.3.9, MetaCyc:ALLANTOATE-DEIMINASE-RXN]
+def: "Catalysis of the reaction: allantoate + H2O + 2 H+ = (S)-2-ureidoglycine + NH4+ + CO2." [RHEA:27485]
 synonym: "allantoate amidinohydrolase (decarboxylating)" RELATED [EC:3.5.3.9]
 synonym: "allantoate amidohydrolase activity" RELATED [EC:3.5.3.9]
 xref: EC:3.5.3.9
@@ -312081,7 +312422,7 @@
 id: GO:0047664
 name: aminoimidazolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction:4-aminoimidazole + H20 = imidazol-4-one + NH3." [RHEA:22348]
+def: "Catalysis of the reaction: 4-aminoimidazole + H2O + H+ = imidazol-4-one + NH4+." [RHEA:22348]
 synonym: "4-aminoimidazole aminohydrolase activity" RELATED [EC:3.5.4.8]
 synonym: "4-aminoimidazole hydrolase activity" RELATED [EC:3.5.4.8]
 xref: EC:3.5.4.8
@@ -312094,9 +312435,9 @@
 
 [Term]
 id: GO:0047665
-name: aminolevulinate transaminase activity
+name: aminolevulinate:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-aminolevulinate + pyruvate = 4,5-dioxopentanoate + L-alanine." [EC:2.6.1.43, RHEA:12480]
+def: "Catalysis of the reaction: 5-aminolevulinate + pyruvate = 4,5-dioxopentanoate + L-alanine." [RHEA:12480]
 synonym: "4,5-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "4,5-dioxovaleric acid aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "4,5-dioxovaleric acid transaminase activity" RELATED [EC:2.6.1.43]
@@ -312106,7 +312447,7 @@
 synonym: "alanine-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "alanine-gamma,delta-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "alanine:4,5-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
-synonym: "aminolevulinate aminotransferase activity" EXACT []
+synonym: "aminolevulinate aminotransferase activity" BROAD []
 synonym: "aminolevulinic acid transaminase activity" RELATED [EC:2.6.1.43]
 synonym: "dioxovalerate transaminase activity" RELATED [EC:2.6.1.43]
 synonym: "DOVA transaminase activity" RELATED [EC:2.6.1.43]
@@ -312123,6 +312464,7 @@
 property_value: skos:exactMatch EC:2.6.1.43
 property_value: skos:exactMatch RHEA:12480
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047666
@@ -312562,15 +312904,14 @@
 id: GO:0047692
 name: ATP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + H2O = ITP + NH3." [EC:3.5.4.18, MetaCyc:ATP-DEAMINASE-RXN]
+def: "Catalysis of the reaction: ATP + H2O + H+ = ITP + NH4+." [RHEA:13037]
 synonym: "adenosine triphosphate deaminase activity" RELATED [EC:3.5.4.18]
 synonym: "ATP aminohydrolase activity" RELATED [EC:3.5.4.18]
 xref: EC:3.5.4.18
 xref: MetaCyc:ATP-DEAMINASE-RXN
-xref: RHEA:13037
 is_a: GO:0047623 ! adenosine-phosphate deaminase activity
+property_value: skos:broadMatch RHEA:13037
 property_value: skos:exactMatch EC:3.5.4.18
-property_value: skos:exactMatch RHEA:13037
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -312679,7 +313020,7 @@
 id: GO:0047698
 name: beta-alanyl-CoA ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: beta-alanyl-CoA = acryloyl-CoA + NH3." [EC:4.3.1.6, MetaCyc:BETA-ALANYL-COA-AMMONIA-LYASE-RXN]
+def: "Catalysis of the reaction: beta-alanyl-CoA = acryloyl-CoA + NH4+." [RHEA:12416]
 synonym: "b-alanyl-CoA ammonia-lyase activity" EXACT []
 synonym: "beta-alanyl coenzyme A ammonia-lyase activity" RELATED [EC:4.3.1.6]
 synonym: "beta-alanyl-CoA ammonia-lyase (acryloyl-CoA-forming)" RELATED [EC:4.3.1.6]
@@ -312900,7 +313241,7 @@
 id: GO:0047711
 name: blasticidin-S deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: blasticidin S + H2O = deaminohydroxyblasticidin S + NH3." [EC:3.5.4.23, MetaCyc:BLASTICIDIN-S-DEAMINASE-RXN]
+def: "Catalysis of the reaction: blasticidin S + H2O + H+ = deaminohydroxyblasticidin S + NH4+." [RHEA:10148]
 synonym: "blasticidin-S aminohydrolase activity" RELATED [EC:3.5.4.23]
 xref: EC:3.5.4.23
 xref: MetaCyc:BLASTICIDIN-S-DEAMINASE-RXN
@@ -313153,16 +313494,17 @@
 id: GO:0047726
 name: iron-cytochrome-c reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ferrocytochrome c + Fe3+ = ferricytochrome c + Fe2+." [EC:1.9.98.1, MetaCyc:IRON--CYTOCHROME-C-REDUCTASE-RXN]
-synonym: "ferrocytochrome-c:Fe3+ oxidoreductase activity" RELATED [EC:1.9.98.1]
-synonym: "iron-cytochrome c reductase activity" RELATED [EC:1.9.98.1]
-xref: EC:1.9.98.1
+def: "Catalysis of the reaction: Fe3+ + Fe(II)-[cytochrome c] = Fe2+ + Fe(III)-[cytochrome c]." [EC:1.16.2.1, RHEA:15617]
+synonym: "ferrocytochrome-c:Fe3+ oxidoreductase activity" RELATED [EC:1.16.2.1]
+synonym: "iron-cytochrome c reductase activity" RELATED [EC:1.16.2.1]
+xref: EC:1.16.2.1
 xref: MetaCyc:IRON--CYTOCHROME-C-REDUCTASE-RXN
 xref: RHEA:15617
-is_a: GO:0016675 ! oxidoreductase activity, acting on a heme group of donors
-property_value: skos:exactMatch EC:1.9.98.1
+is_a: GO:0016722 ! oxidoreductase activity, acting on metal ions
+property_value: skos:exactMatch EC:1.16.2.1
 property_value: skos:exactMatch RHEA:15617
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31488" xsd:anyURI
 
 [Term]
 id: GO:0047727
@@ -313393,10 +313735,11 @@
 
 [Term]
 id: GO:0047740
-name: cephalosporin-C transaminase activity
+name: cephalosporin-C:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (7R)-7-(5-carboxylato-5-oxopentanamido)deacetylcephalosporanate + D-glutamate = 2-oxoglutarate + cephalosporin C." [EC:2.6.1.74, RHEA:14553]
+def: "Catalysis of the reaction: (7R)-7-(5-carboxylato-5-oxopentanamido)deacetylcephalosporanate + D-glutamate = 2-oxoglutarate + cephalosporin C." [RHEA:14553]
 synonym: "cephalosporin C aminotransferase activity" RELATED [EC:2.6.1.74]
+synonym: "cephalosporin-C transaminase activity" EXACT []
 synonym: "cephalosporin-C:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.74]
 synonym: "L-alanine:cephalosporin-C aminotransferase activity" RELATED [EC:2.6.1.74]
 xref: EC:2.6.1.74
@@ -313407,6 +313750,7 @@
 property_value: skos:exactMatch EC:2.6.1.74
 property_value: skos:exactMatch RHEA:14553
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047741
@@ -314062,7 +314406,7 @@
 id: GO:0047781
 name: citrullinase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + citrulline = NH3 + CO2 + L-ornithine." [EC:3.5.1.20, MetaCyc:CITRULLINASE-RXN]
+def: "Catalysis of the reaction: L-citrulline + H2O + 2 H+ = L-ornithine + NH4+ + CO2." [RHEA:11940]
 synonym: "citrulline hydrolase activity" RELATED [EC:3.5.1.20]
 synonym: "citrulline ureidase activity" RELATED [EC:3.5.1.20]
 synonym: "L-citrulline 5-N-carbamoyldihydrolase activity" RELATED [EC:3.5.1.20]
@@ -314248,7 +314592,7 @@
 id: GO:0047790
 name: creatinine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: creatinine + H2O = N-methylhydantoin + NH3." [EC:3.5.4.21, MetaCyc:CREATININE-DEAMINASE-RXN]
+def: "Catalysis of the reaction: creatinine + H2O + H+ = N-methylhydantoin + NH4+." [RHEA:12681]
 synonym: "creatinine desiminase activity" RELATED [EC:3.5.4.21]
 synonym: "creatinine hydrolase" BROAD [EC:3.5.4.21]
 synonym: "creatinine iminohydrolase activity" RELATED [EC:3.5.4.21]
@@ -314434,28 +314778,31 @@
 
 [Term]
 id: GO:0047801
-name: L-cysteine transaminase activity
+name: L-cysteine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-cysteine + 2-oxoglutarate = mercaptopyruvate + L-glutamate." [RHEA:17441]
+def: "Catalysis of the reaction: L-cysteine + 2-oxoglutarate = 2-oxo-3-sulfanylpropanoate + L-glutamate." [RHEA:17441]
 synonym: "cysteine aminotransferase activity" BROAD []
 synonym: "cysteine transaminase activity" EXACT [EC:2.6.1.3]
+synonym: "L-cysteine transaminase activity" BROAD []
 synonym: "L-cysteine:2-oxoglutarate aminotransferase activity" EXACT []
 xref: EC:2.6.1.3
 xref: MetaCyc:CYSTEINE-AMINOTRANSFERASE-RXN
 xref: Reactome:R-HSA-9012597 "GOT2 dimer transfers amino group from L-Cys to 2OG to form 3MPYR and Glu"
 xref: RHEA:17441
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.3
 property_value: skos:exactMatch RHEA:17441
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047802
-name: cysteine-conjugate transaminase activity
+name: cysteine-conjugate:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + S-(4-bromophenyl)-L-cysteine = (4-bromophenylsulfanyl)pyruvate + L-glutamate." [EC:2.6.1.75, RHEA:13485]
+def: "Catalysis of the reaction: 2-oxoglutarate + S-(4-bromophenyl)-L-cysteine = (4-bromophenylsulfanyl)pyruvate + L-glutamate." [RHEA:13485]
 synonym: "cysteine conjugate aminotransferase activity" RELATED [EC:2.6.1.75]
 synonym: "cysteine-conjugate alpha-ketoglutarate transaminase (CAT-1)" RELATED [EC:2.6.1.75]
+synonym: "cysteine-conjugate transaminase activity" EXACT []
 synonym: "S-(4-bromophenyl)-L-cysteine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.75]
 xref: EC:2.6.1.75
 xref: KEGG_REACTION:R04338
@@ -314465,6 +314812,7 @@
 property_value: skos:exactMatch EC:2.6.1.75
 property_value: skos:exactMatch RHEA:13485
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047803
@@ -314607,11 +314955,12 @@
 
 [Term]
 id: GO:0047810
-name: D-alanine-2-oxoglutarate aminotransferase activity
+name: D-alanine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-alanine + 2-oxoglutarate = pyruvate + D-glutamate." [EC:2.6.1.21]
+def: "Catalysis of the reaction: D-alanine + 2-oxoglutarate = pyruvate + D-glutamate." [RHEA:15869]
 synonym: "D-alanine aminotransferase activity" EXACT []
 synonym: "D-alanine transaminase activity" BROAD [EC:2.6.1.21]
+synonym: "D-alanine-2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "D-alanine-D-glutamate transaminase activity" RELATED [EC:2.6.1.21]
 synonym: "D-amino acid aminotransferase activity" BROAD [EC:2.6.1.21]
 synonym: "D-amino acid transaminase activity" BROAD [EC:2.6.1.21]
@@ -314622,10 +314971,11 @@
 xref: EC:2.6.1.21
 xref: MetaCyc:D-ALANINE-AMINOTRANSFERASE-RXN
 xref: RHEA:15869
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.21
 property_value: skos:exactMatch RHEA:15869
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047811
@@ -314653,10 +315003,11 @@
 xref: EC:2.3.1.36
 xref: MetaCyc:D-AMINO-ACID-N-ACETYLTRANSFERASE-RXN
 xref: RHEA:20704
-is_a: GO:0008080 ! N-acetyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.36
 property_value: skos:exactMatch RHEA:20704
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0047813
@@ -315057,9 +315408,11 @@
 xref: MetaCyc:D-TRYPTOPHAN-N-MALONYLTRANSFERASE-RXN
 xref: RHEA:23320
 is_a: GO:0050735 ! N-malonyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.112
 property_value: skos:exactMatch RHEA:23320
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0047837
@@ -315453,25 +315806,20 @@
 name: diiodophenylpyruvate reductase (NAD+) activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 3-(3,5-diiodo-4-hydroxyphenyl)lactate + NAD+ = 3-(3,5-diiodo-4-hydroxyphenyl)pyruvate + H+ + NADH." [RHEA:20293]
-synonym: "2-oxo acid reductase activity" RELATED [EC:1.1.1.96]
-synonym: "3-(3,5-diiodo-4-hydroxyphenyl)lactate:NAD+ oxidoreductase activity" RELATED [EC:1.1.1.96]
-synonym: "aromatic alpha-keto acid" RELATED [EC:1.1.1.96]
-synonym: "KAR" RELATED [EC:1.1.1.96]
-xref: EC:1.1.1.96
 xref: KEGG_REACTION:R03431
 xref: MetaCyc:DIIODOPHENYLPYRUVATE-REDUCTASE-RXN
 xref: RHEA:20293
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
-property_value: skos:exactMatch EC:1.1.1.96
 property_value: skos:exactMatch RHEA:20293
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30138" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31488" xsd:anyURI
 
 [Term]
 id: GO:0047861
-name: diiodotyrosine transaminase activity
+name: 3,5-diiodo-L-tyrosine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + 3,5-diiodo-L-tyrosine = 3-(3,5-diiodo-4-hydroxyphenyl)pyruvate + L-glutamate." [EC:2.6.1.24, RHEA:19781]
+def: "Catalysis of the reaction: 2-oxoglutarate + 3,5-diiodo-L-tyrosine = 3-(3,5-diiodo-4-hydroxyphenyl)pyruvate + L-glutamate." [RHEA:19781]
 synonym: "3,5-diiodo-L-tyrosine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.24]
 synonym: "diiodotyrosine aminotransferase activity" EXACT []
 synonym: "halogenated tyrosine aminotransferase activity" RELATED [EC:2.6.1.24]
@@ -315484,6 +315832,7 @@
 property_value: skos:exactMatch EC:2.6.1.24
 property_value: skos:exactMatch RHEA:19781
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047862
@@ -315871,7 +316220,7 @@
 id: GO:0047883
 name: ethanolamine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ethanolamine + H2O + O2 = glycolaldehyde + NH3 + H2O2." [RHEA:18581]
+def: "Catalysis of the reaction: ethanolamine + O2 + H2O = glycolaldehyde + H2O2 + NH4+." [RHEA:18581]
 synonym: "ethanolamine:oxygen oxidoreductase (deaminating)" RELATED [EC:1.4.3.8]
 xref: EC:1.4.3.8
 xref: MetaCyc:ETHANOLAMINE-OXIDASE-RXN
@@ -316672,7 +317021,7 @@
 name: glucosaminate ammonia-lyase activity
 namespace: molecular_function
 alt_id: GO:0050443
-def: "Catalysis of the reaction: D-glucosaminate = 2-dehydro-3-deoxy-D-gluconate + NH3." [EC:4.3.1.9]
+def: "Catalysis of the reaction: 2-amino-2-deoxy-D-gluconate = 2-dehydro-3-deoxy-D-gluconate + NH4+." [RHEA:12488]
 comment: Note that this function was EC:4.3.1.21.
 synonym: "2-amino-2-deoxy-D-gluconate ammonia-lyase activity" RELATED [EC:4.3.1.9]
 synonym: "2-amino-2-deoxy-D-gluconate hydro-lyase (deaminating) activity" RELATED [EC:4.3.1.9]
@@ -316933,9 +317282,9 @@
 
 [Term]
 id: GO:0047945
-name: L-glutamine:pyruvate aminotransferase activity
+name: L-glutamine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-glutamine + pyruvate = 2-oxoglutaramate + L-alanine." [EC:2.6.1.15, RHEA:10400]
+def: "Catalysis of the reaction: L-glutamine + pyruvate = 2-oxoglutaramate + L-alanine." [RHEA:10400]
 synonym: "gamma-glutaminyltransferase activity" RELATED [EC:2.6.1.15]
 synonym: "glutaminase II activity" RELATED [EC:2.6.1.15]
 synonym: "glutamine transaminase activity" BROAD [EC:2.6.1.15]
@@ -316948,26 +317297,29 @@
 synonym: "glutamine-oxo acid aminotransferase activity" BROAD [EC:2.6.1.15]
 synonym: "glutamine-pyruvate transaminase activity" BROAD [EC:2.6.1.15]
 synonym: "L-glutamine transaminase L" RELATED [EC:2.6.1.15]
+synonym: "L-glutamine:pyruvate aminotransferase activity" EXACT []
 xref: EC:2.6.1.15
 xref: KEGG_REACTION:R00576
 xref: MetaCyc:GLUTAMINE--PYRUVATE-AMINOTRANSFERASE-RXN
 xref: Reactome:R-HSA-893616 "glutamine + pyruvate => 2-oxoglutaramate + alanine"
 xref: RHEA:10400
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.15
 property_value: skos:exactMatch RHEA:10400
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047946
-name: glutamine N-acyltransferase activity
+name: L-glutamine N-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acyl-CoA + L-glutamine = CoA + N-acyl-L-glutamine." [EC:2.3.1.68, MetaCyc:GLUTAMINE-N-ACYLTRANSFERASE-RXN]
+def: "Catalysis of the reaction: acyl-CoA + L-glutamine = CoA + N-acyl-L-glutamine." [RHEA:18469]
 synonym: "acyl-CoA:L-glutamine N-acyltransferase activity" RELATED [EC:2.3.1.68]
+synonym: "glutamine N-acyltransferase activity" BROAD []
 xref: EC:2.3.1.68
 xref: MetaCyc:GLUTAMINE-N-ACYLTRANSFERASE-RXN
 xref: RHEA:18469
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0140085 ! L-amino-acid N-acetyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.68
 property_value: skos:exactMatch RHEA:18469
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -317020,16 +317372,17 @@
 id: GO:0047950
 name: glutathione oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 glutathione + O2 = glutathione disulfide + H2O2." [EC:1.8.3.3, RHEA:24112]
+def: "Catalysis of the reaction: 2 glutathione + O2 = glutathione disulfide + H2O2." [RHEA:24112]
 synonym: "glutathione:oxygen oxidoreductase activity" RELATED [EC:1.8.3.3]
 xref: EC:1.8.3.3
 xref: KEGG_REACTION:R00120
 xref: MetaCyc:GLUTATHIONE-OXIDASE-RXN
 xref: RHEA:24112
-is_a: GO:0016670 ! oxidoreductase activity, acting on a sulfur group of donors, oxygen as acceptor
+is_a: GO:0016972 ! thiol oxidase activity
 property_value: skos:exactMatch EC:1.8.3.3
 property_value: skos:exactMatch RHEA:24112
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
 
 [Term]
 id: GO:0047951
@@ -317160,29 +317513,31 @@
 
 [Term]
 id: GO:0047958
-name: glycine:2-oxoglutarate aminotransferase activity
+name: glycine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glycine + 2-oxoglutarate = glyoxylate + L-glutamate." [EC:2.6.1.4, MetaCyc:GLYCINE-AMINOTRANSFERASE-RXN]
+def: "Catalysis of the reaction: glycine + 2-oxoglutarate = glyoxylate + L-glutamate." [RHEA:14089]
 synonym: "glutamate-glyoxylate transaminase activity" EXACT []
 synonym: "glutamic-glyoxylic transaminase activity" RELATED [EC:2.6.1.4]
 synonym: "glycine aminotransferase activity" BROAD []
 synonym: "glycine transaminase activity" BROAD [EC:2.6.1.4]
+synonym: "glycine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "glyoxylate-glutamate aminotransferase activity" RELATED [EC:2.6.1.4]
 synonym: "glyoxylate-glutamic transaminase activity" RELATED [EC:2.6.1.4]
 synonym: "L-glutamate:glyoxylate aminotransferase activity" EXACT []
 xref: EC:2.6.1.4
 xref: MetaCyc:GLYCINE-AMINOTRANSFERASE-RXN
 xref: RHEA:14089
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.4
 property_value: skos:exactMatch RHEA:14089
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047959
 name: glycine dehydrogenase (cytochrome) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glycine + H2O + 2 ferricytochrome c = glyoxylate + NH3 + 2 ferrocytochrome c." [EC:1.4.2.1, MetaCyc:GLYCINE-DEHYDROGENASE-CYTOCHROME-RXN]
+def: "Catalysis of the reaction: 2 Fe(III)-[cytochrome c] + glycine + H2O = 2 Fe(II)-[cytochrome c] + glyoxylate + NH4+ + 2 H+." [RHEA:16909]
 synonym: "glycine-cytochrome c reductase activity" RELATED [EC:1.4.2.1]
 synonym: "glycine:ferricytochrome-c oxidoreductase (deaminating)" RELATED [EC:1.4.2.1]
 synonym: "reductase, glycine-cytochrome c" RELATED [EC:1.4.2.1]
@@ -317214,7 +317569,7 @@
 id: GO:0047961
 name: glycine N-acyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acyl-CoA + glycine = CoA + N-acylglycine." [EC:2.3.1.13, MetaCyc:GLYCINE-N-ACYLTRANSFERASE-RXN]
+def: "Catalysis of the reaction: acyl-CoA + glycine = CoA + N-acylglycine." [RHEA:19869]
 synonym: "acyl-CoA:glycine N-acyltransferase activity" RELATED [EC:2.3.1.13]
 synonym: "glycine acyltransferase activity" RELATED [EC:2.3.1.13]
 synonym: "glycine-N-acylase activity" RELATED [EC:2.3.1.13]
@@ -317222,10 +317577,11 @@
 xref: MetaCyc:GLYCINE-N-ACYLTRANSFERASE-RXN
 xref: Reactome:R-HSA-2534040 "Unknown NAT N-acylates Gly in GNAT1"
 xref: RHEA:19869
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.13
 property_value: skos:exactMatch RHEA:19869
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0047962
@@ -317443,7 +317799,7 @@
 id: GO:0047974
 name: guanosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanosine + H2O = xanthosine + NH3." [EC:3.5.4.15, MetaCyc:GUANOSINE-DEAMINASE-RXN]
+def: "Catalysis of the reaction: guanosine + H2O + H+ = xanthosine + NH4+." [RHEA:12861]
 synonym: "guanosine aminase activity" RELATED [EC:3.5.4.15]
 synonym: "guanosine aminohydrolase activity" RELATED [EC:3.5.4.15]
 xref: EC:3.5.4.15
@@ -317564,7 +317920,7 @@
 id: GO:0047981
 name: L-histidine N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-histidine + acetyl-CoA = N(alpha)-acetyl-L-histidine + CoA + H+." [EC:2.3.1.33, RHEA:24596]
+def: "Catalysis of the reaction: L-histidine + acetyl-CoA = N(alpha)-acetyl-L-histidine + CoA + H+." [RHEA:24596]
 synonym: "acetyl-CoA:L-histidine N-acetyltransferase activity" RELATED [EC:2.3.1.33]
 synonym: "acetylhistidine synthetase activity" RELATED [EC:2.3.1.33]
 synonym: "histidine acetyltransferase activity" RELATED [EC:2.3.1.33]
@@ -317582,7 +317938,7 @@
 id: GO:0047982
 name: homocysteine desulfhydrase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-homocysteine + H2O = sulfide + NH3 + 2-oxobutanoate." [EC:4.4.1.2, MetaCyc:HOMOCYSTEINE-DESULFHYDRASE-RXN]
+def: "Catalysis of the reaction: L-homocysteine + H2O = 2-oxobutanoate + hydrogen sulfide + NH4+ + H+." [RHEA:14501]
 synonym: "homocysteine desulfurase activity" RELATED [EC:4.4.1.2]
 synonym: "L-homocysteine hydrogen-sulfide-lyase (deaminating)" RELATED [EC:4.4.1.2]
 synonym: "L-homocysteine hydrogen-sulfide-lyase (deaminating; 2-oxobutanoate-forming)" RELATED [EC:4.4.1.2]
@@ -320154,7 +320510,8 @@
 def: "Any process that results in a change in the behavior of an organism as a result of a pain stimulus. Pain stimuli cause activation of nociceptors, peripheral receptors for pain, include receptors which are sensitive to painful mechanical stimuli, extreme heat or cold, and chemical stimuli." [GOC:jid]
 synonym: "behavioural response to pain" EXACT []
 is_a: GO:0007610 ! behavior
-relationship: part_of GO:0048265 ! response to pain
+is_a: GO:0048265 ! response to pain
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 
 [Term]
 id: GO:0048268
@@ -326576,7 +326933,7 @@
 id: GO:0050001
 name: D-glutaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + L-glutamine = NH3 + D-glutamate." [EC:3.5.1.35, MetaCyc:D-GLUTAMINASE-RXN]
+def: "Catalysis of the reaction: D-glutamine + H2O = D-glutamate + NH4+." [RHEA:22840]
 synonym: "D-glutamine amidohydrolase activity" RELATED [EC:3.5.1.35]
 xref: EC:3.5.1.35
 xref: MetaCyc:D-GLUTAMINASE-RXN
@@ -326979,7 +327336,7 @@
 id: GO:0050025
 name: L-glutamate oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-glutamate + O2 + H2O = 2-oxoglutarate + NH3 + H2O2." [RHEA:20728]
+def: "Catalysis of the reaction: L-glutamate + O2 + H2O = 2-oxoglutarate + H2O2 + NH4+." [RHEA:20728]
 synonym: "glutamate (acceptor) dehydrogenase activity" RELATED [EC:1.4.3.11]
 synonym: "glutamate oxidase activity" RELATED [EC:1.4.3.11]
 synonym: "glutamic acid oxidase activity" RELATED [EC:1.4.3.11]
@@ -327409,7 +327766,7 @@
 id: GO:0050050
 name: L-leucine N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-leucine + acetyl-CoA = N-acetyl-L-leucine + CoA + H+." [EC:2.3.1.66, RHEA:20089]
+def: "Catalysis of the reaction: L-leucine + acetyl-CoA = N-acetyl-L-leucine + CoA + H+." [RHEA:20089]
 synonym: "acetyl-CoA:L-leucine N-acetyltransferase activity" RELATED [EC:2.3.1.66]
 synonym: "leucine acetyltransferase activity" RELATED [EC:2.3.1.66]
 xref: EC:2.3.1.66
@@ -327664,25 +328021,27 @@
 
 [Term]
 id: GO:0050065
-name: lysine-pyruvate 6-transaminase activity
+name: L-lysine:pyruvate 6-transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-lysine + pyruvate = L-alanine + L-allysine." [EC:2.6.1.71, RHEA:19393]
+def: "Catalysis of the reaction: L-lysine + pyruvate = (S)-2-amino-6-oxohexanoate + L-alanine." [RHEA:19393]
 comment: Note that this term has a MetaCyc pathway reference as the pathway only has a single step.
 synonym: "L-lysine:pyruvate aminotransferase activity" RELATED [EC:2.6.1.71]
 synonym: "Lys-AT" RELATED [EC:2.6.1.71]
 synonym: "lysine--pyruvate 6-aminotransferase activity" EXACT []
+synonym: "lysine-pyruvate 6-transaminase activity" EXACT []
 synonym: "lysine-pyruvate aminotransferase activity" RELATED [EC:2.6.1.71]
 xref: EC:2.6.1.71
 xref: KEGG_REACTION:R00453
 xref: MetaCyc:LYSINE--PYRUVATE-6-AMINOTRANSFERASE-RXN
 xref: RHEA:19393
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.71
 property_value: skos:exactMatch KEGG_REACTION:R00453
 property_value: skos:exactMatch MetaCyc:LYSINE--PYRUVATE-6-AMINOTRANSFERASE-RXN
 property_value: skos:exactMatch RHEA:19393
 property_value: skos:relatedMatch MetaCyc:PWY-5324
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050066
@@ -328143,20 +328502,22 @@
 
 [Term]
 id: GO:0050094
-name: methionine-glyoxylate transaminase activity
+name: L-methionine:glyoxylate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-methionine + glyoxylate = 4-methylthio-2-oxobutanoate + glycine." [EC:2.6.1.73, RHEA:22884]
+def: "Catalysis of the reaction: glyoxylate + L-methionine = 4-methylsulfanyl-2-oxobutanoate + glycine." [RHEA:22884]
 synonym: "L-methionine:glyoxylate aminotransferase activity" RELATED [EC:2.6.1.73]
 synonym: "methionine-glyoxylate aminotransferase activity" RELATED [EC:2.6.1.73]
+synonym: "methionine-glyoxylate transaminase activity" EXACT []
 synonym: "MGAT activity" RELATED [EC:2.6.1.73]
 xref: EC:2.6.1.73
 xref: KEGG_REACTION:R00652
 xref: MetaCyc:METHIONINE--GLYOXYLATE-TRANSAMINASE-RXN
 xref: RHEA:22884
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0010326 ! L-methionine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.73
 property_value: skos:exactMatch RHEA:22884
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050095
@@ -328825,9 +329186,11 @@
 xref: MetaCyc:N6-HYDROXYLYSINE-O-ACETYLTRANSFERASE-RXN
 xref: RHEA:22388
 is_a: GO:0016413 ! O-acetyltransferase activity
+is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.102
 property_value: skos:exactMatch RHEA:22388
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
 [Term]
 id: GO:0050134
@@ -328970,7 +329333,7 @@
 id: GO:0050142
 name: nitrogenase (flavodoxin) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6 reduced flavodoxin + 6 H+ + N2 + n ATP = 6 oxidized flavodoxin + 2 NH3 + n ADP + n phosphate." [EC:1.19.6.1, MetaCyc:NITROGENASE-FLAVODOXIN-RXN]
+def: "Catalysis of the reaction: N2 + 4 reduced [flavodoxin] + 16 ATP + 16 H2O = 4 oxidized [flavodoxin] + H2 + 2 NH4+ + 16 ADP + 16 phosphate + 18 H+." [RHEA:15645]
 synonym: "reduced flavodoxin:dinitrogen oxidoreductase (ATP-hydrolysing)" RELATED [EC:1.19.6.1]
 xref: EC:1.19.6.1
 xref: MetaCyc:NITROGENASE-FLAVODOXIN-RXN
@@ -329439,12 +329802,13 @@
 
 [Term]
 id: GO:0050170
-name: peptidyl-glutaminase activity
+name: protein-glutaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: alpha-N-peptidyl-L-glutamine + H2O = alpha-N-peptidyl-L-glutamate + NH3." [EC:3.5.1.43, MetaCyc:PEPTIDYL-GLUTAMINASE-RXN]
+def: "Catalysis of the reaction: [protein]-C-terminal-L-glutamine + H2O = [protein]-C-terminal-L-glutamate + NH4+." [RHEA:10032]
 synonym: "peptideglutaminase activity" RELATED [EC:3.5.1.43]
 synonym: "peptidoglutaminase activity" RELATED [EC:3.5.1.43]
 synonym: "peptidoglutaminase I activity" NARROW [EC:3.5.1.43]
+synonym: "peptidyl-glutaminase activity" EXACT []
 synonym: "peptidyl-L-glutamine amidohydrolase activity" RELATED [EC:3.5.1.43]
 xref: EC:3.5.1.43
 xref: MetaCyc:PEPTIDYL-GLUTAMINASE-RXN
@@ -329456,9 +329820,10 @@
 
 [Term]
 id: GO:0050171
-name: phenol beta-glucosyltransferase activity
+name: obsolete phenol beta-glucosyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: UDP-glucose + a phenol = UDP + an aryl beta-D-glucoside." [EC:2.4.1.35, MetaCyc:PHENOL-BETA-GLUCOSYLTRANSFERASE-RXN]
+def: "OBSOLETE. Catalysis of the reaction: UDP-glucose + a phenol = UDP + an aryl beta-D-glucoside." [EC:2.4.1.35]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 synonym: "phenol b-glucosyltransferase activity" EXACT []
 synonym: "phenol-beta-D-glucosyltransferase activity" RELATED [EC:2.4.1.35]
 synonym: "UDP glucosyltransferase activity" RELATED [EC:2.4.1.35]
@@ -329469,9 +329834,9 @@
 synonym: "uridine diphosphoglucosyltransferase activity" RELATED [EC:2.4.1.35]
 xref: EC:2.4.1.35
 xref: MetaCyc:PHENOL-BETA-GLUCOSYLTRANSFERASE-RXN
-is_a: GO:0035251 ! UDP-glucosyltransferase activity
 property_value: skos:exactMatch EC:2.4.1.35
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0050172
@@ -329544,7 +329909,7 @@
 id: GO:0050176
 name: L-phenylalanine N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-phenylalanine + acetyl-CoA = N-acetyl-L-phenylalanine + CoA + H+." [EC:2.3.1.53, RHEA:17801]
+def: "Catalysis of the reaction: L-phenylalanine + acetyl-CoA = N-acetyl-L-phenylalanine + CoA + H+." [RHEA:17801]
 synonym: "acetyl-CoA-L-phenylalanine alpha-N-acetyltransferase activity" RELATED [EC:2.3.1.53]
 synonym: "acetyl-CoA:L-phenylalanine N-acetyltransferase activity" RELATED [EC:2.3.1.53]
 synonym: "phenylalanine N-acetyltransferase activity" EXACT []
@@ -330197,22 +330562,20 @@
 id: GO:0050212
 name: progesterone 11-alpha-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: AH2 + O2 + progesterone = 11alpha-hydroxyprogesterone + A + H2O." [RHEA:18205]
-synonym: "progesterone 11-alpha-hydroxylase activity" RELATED [EC:1.14.99.14]
+def: "Catalysis of the reaction: AH2 + O2 + progesterone = 11alpha-hydroxyprogesterone + A + H2O." [PMID:39766209, RHEA:86055]
+synonym: "progesterone 11-alpha-hydroxylase activity" RELATED [EC:1.14.14.197]
 synonym: "progesterone 11a-monooxygenase activity" EXACT []
-synonym: "progesterone 11alpha-hydroxylase activity" RELATED [EC:1.14.99.14]
-synonym: "progesterone 11alpha-monooxygenase activity" RELATED [EC:1.14.99.14]
-synonym: "progesterone,hydrogen-donor:oxygen oxidoreductase (11alpha-hydroxylating)" RELATED [EC:1.14.99.14]
-xref: EC:1.14.99.14
+synonym: "progesterone 11alpha-hydroxylase activity" RELATED [EC:1.14.14.197]
+synonym: "progesterone 11alpha-monooxygenase activity" RELATED [EC:1.14.14.197]
+synonym: "progesterone,hydrogen-donor:oxygen oxidoreductase (11alpha-hydroxylating)" RELATED [EC:1.14.14.197]
 xref: KEGG_REACTION:R02214
 xref: MetaCyc:PROGESTERONE-11-ALPHA-MONOOXYGENASE-RXN
-xref: PMID:39766209
-xref: RHEA:18205
+xref: RHEA:86055
 is_a: GO:0050214 ! progesterone monooxygenase activity
-property_value: skos:exactMatch EC:1.14.99.14
-property_value: skos:exactMatch RHEA:18205
+property_value: skos:exactMatch RHEA:86055
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29311" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31423" xsd:anyURI
 
 [Term]
 id: GO:0050213
@@ -330661,7 +331024,7 @@
 id: GO:0050239
 name: pyrithiamine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 1-(4-amino-2-methylpyrimid-5-ylmethyl)-3-(beta-hydroxyethyl)-2-methylpyridinium bromide + H2O = 1-(4-hydroxy-2-methylpyrimid-5-ylmethyl)-3-(beta-hydroxyethyl)-2-methylpyridinium bromide + NH3." [EC:3.5.4.20, MetaCyc:PYRITHIAMIN-DEAMINASE-RXN]
+def: "Catalysis of the reaction: 1-(4-amino-2-methylpyrimid-5-ylmethyl)-3-(2-hydroxyethyl)-2-methylpyridinium + H2O + H+ = 1-(4-hydroxy-2-methylpyrimid-5-ylmethyl)-3-(2-hydroxyethyl)-2-methylpyridinium + NH4+." [RHEA:14537]
 synonym: "1-(4-amino-2-methylpyrimid-5-ylmethyl)-3-(beta-hydroxyethyl)-2-methylpyridinium-bromide aminohydrolase activity" RELATED [EC:3.5.4.20]
 xref: EC:3.5.4.20
 xref: MetaCyc:PYRITHIAMIN-DEAMINASE-RXN
@@ -331347,7 +331710,7 @@
 id: GO:0050279
 name: sepiapterin deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: sepiapterin + H2O = xanthopterin-B2 + NH3." [EC:3.5.4.24, MetaCyc:SEPIAPTERIN-DEAMINASE-RXN]
+def: "Catalysis of the reaction: L-sepiapterin + H2O + H+ = (S)-xanthopterin-B2 + NH4+." [RHEA:14025]
 synonym: "sepiapterin aminohydrolase activity" RELATED [EC:3.5.4.24]
 xref: EC:3.5.4.24
 xref: MetaCyc:SEPIAPTERIN-DEAMINASE-RXN
@@ -331375,19 +331738,21 @@
 
 [Term]
 id: GO:0050281
-name: L-serine-glyoxylate transaminase activity
+name: L-serine:glyoxylate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-serine + glyoxylate = 3-hydroxypyruvate + glycine." [EC:2.6.1.45]
+def: "Catalysis of the reaction: L-serine + glyoxylate = 3-hydroxypyruvate + glycine." [RHEA:19125]
+synonym: "L-serine-glyoxylate transaminase activity" EXACT []
 synonym: "L-serine:glyoxylate aminotransferase activity" RELATED [EC:2.6.1.45]
 synonym: "serine--glyoxylate aminotransferase activity" EXACT []
 synonym: "SGAT activity" RELATED [EC:2.6.1.45]
 xref: EC:2.6.1.45
 xref: MetaCyc:SERINE--GLYOXYLATE-AMINOTRANSFERASE-RXN
 xref: RHEA:19125
-is_a: GO:0008483 ! transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.45
 property_value: skos:exactMatch RHEA:19125
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050282
@@ -331410,7 +331775,7 @@
 id: GO:0050283
 name: serine-sulfate ammonia-lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-serine O-sulfate + H2O = pyruvate + NH3 + sulfate." [EC:4.3.1.10, MetaCyc:SERINE-SULFATE-AMMONIA-LYASE-RXN]
+def: "Catalysis of the reaction: -serine O-sulfate + H2O = sulfate + pyruvate + NH4+ + H+." [RHEA:15605]
 synonym: "(L-SOS)lyase activity" RELATED [EC:4.3.1.10]
 synonym: "L-serine-O-sulfate ammonia-lyase (pyruvate-forming)" RELATED [EC:4.3.1.10]
 synonym: "serine-sulphate ammonia-lyase activity" EXACT []
@@ -332084,13 +332449,14 @@
 
 [Term]
 id: GO:0050322
-name: taurine-2-oxoglutarate transaminase activity
+name: taurine:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: taurine + 2-oxoglutarate = sulfoacetaldehyde + L-glutamate." [PMID:16535664, RHEA:16353]
 synonym: "taurine aminotransferase activity" EXACT []
 synonym: "taurine transaminase activity" EXACT []
 synonym: "taurine--alpha-ketoglutarate aminotransferase activity" RELATED [EC:2.6.1.55]
 synonym: "taurine--glutamate transaminase activity" RELATED [EC:2.6.1.55]
+synonym: "taurine-2-oxoglutarate transaminase activity" EXACT []
 synonym: "taurine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.55]
 xref: EC:2.6.1.55
 xref: MetaCyc:RXN-2301
@@ -332099,6 +332465,7 @@
 property_value: skos:exactMatch EC:2.6.1.55
 property_value: skos:exactMatch RHEA:16353
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050323
@@ -332723,7 +333090,7 @@
 id: GO:0050360
 name: tryptophan 2'-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-tryptophan + O2 = 3-indoleglycolaldehyde + CO2 + NH3." [EC:1.13.99.3, MetaCyc:TRYPTOPHAN-2-DIOXYGENASE-RXN]
+def: "Catalysis of the reaction: L-tryptophan + O2 + H+ = 3-indoleglycolaldehyde + NH4+ + CO2." [RHEA:22620]
 synonym: "indole-3-alkane alpha-hydroxylase activity" RELATED [EC:1.13.99.3]
 synonym: "indolyl-3-alkan alpha-hydroxylase activity" RELATED [EC:1.13.99.3]
 synonym: "L-tryptophan:oxygen 2'-oxidoreductase (side-chain-cleaving)" RELATED [EC:1.13.99.3]
@@ -332760,23 +333127,25 @@
 
 [Term]
 id: GO:0050362
-name: L-tryptophan:2-oxoglutarate aminotransferase activity
+name: L-tryptophan:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-tryptophan + 2-oxoglutarate = indolepyruvate + L-glutamate." [EC:2.6.1.27, MetaCyc:TRYPTOPHAN-AMINOTRANSFERASE-RXN]
+def: "Catalysis of the reaction: L-tryptophan + 2-oxoglutarate = indole-3-pyruvate + L-glutamate." [RHEA:14093]
 synonym: "5-hydroxytryptophan-ketoglutaric transaminase activity" RELATED [EC:2.6.1.27]
 synonym: "hydroxytryptophan aminotransferase activity" RELATED [EC:2.6.1.27]
 synonym: "L-phenylalanine-2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.27]
 synonym: "L-tryptophan aminotransferase activity" BROAD [EC:2.6.1.27]
 synonym: "L-tryptophan transaminase activity" BROAD [EC:2.6.1.27]
+synonym: "L-tryptophan:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "tryptophan aminotransferase activity" EXACT []
 synonym: "tryptophan transaminase activity" BROAD [EC:2.6.1.27]
 xref: EC:2.6.1.27
 xref: MetaCyc:TRYPTOPHAN-AMINOTRANSFERASE-RXN
 xref: RHEA:14093
-is_a: GO:0070529 ! L-tryptophan aminotransferase activity
+is_a: GO:0008793 ! aromatic-amino-acid:2-oxoglutarate transaminase activity
 property_value: skos:exactMatch EC:2.6.1.27
 property_value: skos:exactMatch RHEA:14093
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050363
@@ -333646,7 +334015,7 @@
 id: GO:0050414
 name: formimidoylaspartate deiminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-formimidoyl-L-aspartate + H2O = N-formyl-L-aspartate + NH3." [EC:3.5.3.5, MetaCyc:FORMIMINOASPARTATE-DEIMINASE-RXN]
+def: "Catalysis of the reaction: N-formimidoyl-L-aspartate + H2O = N-formyl-L-aspartate + NH4+." [RHEA:13661]
 synonym: "formiminoaspartate deiminase activity" EXACT []
 synonym: "N-formimidoyl-L-aspartate iminohydrolase activity" RELATED [EC:3.5.3.5]
 xref: EC:3.5.3.5
@@ -333680,7 +334049,7 @@
 id: GO:0050416
 name: formimidoylglutamate deiminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-formimidoyl-L-glutamate + H2O = N-formyl-L-glutamate + NH3." [EC:3.5.3.13, MetaCyc:FORMIMINOGLUTAMATE-DEIMINASE-RXN]
+def: "Catalysis of the reaction: N-formimidoyl-L-glutamate + H2O = N-formyl-L-glutamate + NH4+." [RHEA:22832]
 synonym: "formiminoglutamate deiminase activity" EXACT []
 synonym: "formiminoglutamic iminohydrolase activity" RELATED [EC:3.5.3.13]
 synonym: "N-formimidoyl-L-glutamate iminohydrolase activity" RELATED [EC:3.5.3.13]
@@ -333696,7 +334065,7 @@
 id: GO:0050417
 name: glutamin-(asparagin-)ase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + L-glutamine = NH3 + L-glutamate; and H2O + L-asparagine = NH3 + L-aspartate." [EC:3.5.1.38]
+def: "Catalysis of the reactions: H2O + L-glutamine = NH4 + L-glutamate; and H2O + L-asparagine = NH4 + L-aspartate." [EC:3.5.1.38]
 synonym: "glutaminase-(asparagin-)ase activity" EXACT []
 synonym: "glutaminase-asparaginase activity" RELATED [EC:3.5.1.38]
 synonym: "L-ASNase/L-GLNase activity" RELATED [EC:3.5.1.38]
@@ -333714,7 +334083,7 @@
 id: GO:0050418
 name: hydroxylamine reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: NH3 + H2O + acceptor = hydroxylamine + reduced acceptor." [EC:1.7.99.1]
+def: "Catalysis of the reaction: an acceptor + NH4+ + H2O = hydroxylamine + a reduced acceptor + H+." [RHEA:22052]
 synonym: "ammonia:(acceptor) oxidoreductase activity" RELATED [EC:1.7.99.1]
 synonym: "ammonia:acceptor oxidoreductase activity" RELATED [EC:1.7.99.1]
 synonym: "hydroxylamine (acceptor) reductase activity" RELATED [EC:1.7.99.1]
@@ -335233,7 +335602,7 @@
 id: GO:0050514
 name: homospermidine synthase (spermidine-specific) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: spermidine + putrescine = sym-homospermidine + propane-1,3-diamine." [EC:2.5.1.45]
+def: "Catalysis of the reaction: spermidine + putrescine = sym-homospermidine + propane-1,3-diamine." [RHEA:11236]
 synonym: "spermidine:putrescine 4-aminobutyltransferase (propane-1,3-diamine-forming)" RELATED [EC:2.5.1.45]
 xref: EC:2.5.1.45
 xref: MetaCyc:2.5.1.45-RXN
@@ -336129,7 +336498,7 @@
 id: GO:0050568
 name: protein-glutamine glutaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: protein L-glutamine + H2O = protein L-glutamate + NH3." [EC:3.5.1.44, MetaCyc:CHEBDEAMID-RXN]
+def: "Catalysis of the reaction: L-glutaminyl-[protein] + H2O = L-glutamyl-[protein] + NH4+." [RHEA:16441]
 synonym: "destabilase activity" RELATED [EC:3.5.1.44]
 synonym: "glutaminyl-peptide glutaminase activity" RELATED [EC:3.5.1.44]
 synonym: "glutaminylpeptide glutaminase activity" RELATED [EC:3.5.1.44]
@@ -353031,10 +353400,9 @@
 id: GO:0051975
 name: L-lysine biosynthetic process via alpha-aminoadipate and saccharopine
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-lysine via the intermediates alpha-aminoadipic acid and saccharopine. This pathway is used by yeast and fungi to synthesize the essential amino acid L-lysine, and pathway intermediates are often incorporated into secondary metabolic processes. The pathway proceeds as follows: alpha-ketoglutarate is converted to homocitrate, which is metabolized to 3-carboxyhex-2-enedioate and then homoisocitrate. This is then decarboxylated to form alpha-ketoadipate, which is then converted to alpha-aminoadipate. This is then reduced to form alpha-aminoadipate 6-semialdehyde, which is metabolized to saccharopine and finally L-lysine." [MetaCyc:LYSINE-AMINOAD-PWY]
+def: "The chemical reactions and pathways resulting in the formation of L-lysine via the intermediates alpha-aminoadipic acid and saccharopine. This pathway is used by yeast and fungi to synthesize the essential amino acid L-lysine, and pathway intermediates are often incorporated into secondary metabolic processes. The pathway proceeds as follows: alpha-ketoglutarate is converted to homocitrate, which is metabolized to 3-carboxyhex-2-enedioate and then homoisocitrate. This is then decarboxylated to form alpha-ketoadipate, which is then converted to alpha-aminoadipate. This is then reduced to form alpha-aminoadipate 6-semialdehyde, which is metabolized to saccharopine and finally L-lysine." [GOC:curators]
 synonym: "lysine biosynthesis via aminoadipic acid and saccharopine" EXACT []
 synonym: "lysine biosynthetic process via aminoadipic acid and saccharopine" EXACT []
-xref: MetaCyc:LYSINE-AMINOAD-PWY
 is_a: GO:0019878 ! L-lysine biosynthetic process via aminoadipic acid
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
 
@@ -353042,10 +353410,9 @@
 id: GO:0051976
 name: L-lysine biosynthetic process via alpha-aminoadipate and N2-acetyl-alpha-aminoadipate
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-lysine via the intermediates alpha-aminoadipic acid and N2-acetyl-alpha-aminoadipate. This pathway of prokaryotic lysine biosynthesis via alpha-aminoadipate was discovered in the hyper-thermophilic Gram-negative eubacterium Thermus thermophilus. The pathway proceeds as follows: alpha-ketoglutarate is converted to homocitrate, which is metabolized to 3-carboxyhex-2-enedioate and then homoisocitrate. This is then decarboxylated to form alpha-ketoadipate, which is then converted to alpha-aminoadipate. This undergoes acetylation, to form N2-acetyl-alpha-aminoadipate, and is then phosphorylated to give N2-acetyl-alpha-aminoadipyl-delta-phosphate. This is converted to N2-acetyl-alpha-aminoadipate semialdehyde, which is then converted to N2-acetyl-L-lysine. A final deacetylation reaction produces L-lysine." [MetaCyc:PWY-3081]
+def: "The chemical reactions and pathways resulting in the formation of L-lysine via the intermediates alpha-aminoadipic acid and N2-acetyl-alpha-aminoadipate. This pathway of prokaryotic lysine biosynthesis via alpha-aminoadipate was discovered in the hyper-thermophilic Gram-negative eubacterium Thermus thermophilus. The pathway proceeds as follows: alpha-ketoglutarate is converted to homocitrate, which is metabolized to 3-carboxyhex-2-enedioate and then homoisocitrate. This is then decarboxylated to form alpha-ketoadipate, which is then converted to alpha-aminoadipate. This undergoes acetylation, to form N2-acetyl-alpha-aminoadipate, and is then phosphorylated to give N2-acetyl-alpha-aminoadipyl-delta-phosphate. This is converted to N2-acetyl-alpha-aminoadipate semialdehyde, which is then converted to N2-acetyl-L-lysine. A final deacetylation reaction produces L-lysine." [GOC:curators]
 synonym: "lysine biosynthesis via aminoadipic acid and N2-acetyl-alpha-aminoadipate" EXACT []
 synonym: "lysine biosynthetic process via aminoadipic acid and N2-acetyl-alpha-aminoadipate" EXACT []
-xref: MetaCyc:PWY-3081
 is_a: GO:0019878 ! L-lysine biosynthetic process via aminoadipic acid
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
 
@@ -353063,7 +353430,6 @@
 namespace: molecular_function
 def: "Enables the directed movement of lysophospholipids from one side of a membrane to the other. A lysophospholipid is a phospholipid that lacks one of its fatty acyl chains; it is an intermediate formed during digestion of dietary and biliary phospholipids." [GOC:ai]
 synonym: "lysophospholipid transporter activity" BROAD []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0015370 ! solute:sodium symporter activity
 is_a: GO:0015605 ! organophosphate ester transmembrane transporter activity
 is_a: GO:0170055 ! lipid transmembrane transporter activity
@@ -358685,7 +359051,7 @@
 id: GO:0052595
 name: aliphatic amine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: an aliphatic amine + H2O + O2 = an aldehyde + NH3 + hydrogen peroxide + H+." [MetaCyc:AMINEOXID-RXN]
+def: "Catalysis of the reaction: an aliphatic amine + H2O + O2 = an aldehyde + NH4+ + H2O2 + H+." [MetaCyc:AMINEOXID-RXN]
 synonym: "aliphatic-amine oxidase activity" EXACT []
 synonym: "aliphatic-amine:oxygen oxidoreductase(deaminating) activity" EXACT []
 xref: MetaCyc:AMINEOXID-RXN
@@ -359549,44 +359915,51 @@
 
 [Term]
 id: GO:0052654
-name: L-leucine-2-oxoglutarate transaminase activity
+name: L-leucine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-leucine = 4-methyl-2-oxopentanoate + L-glutamatic acid." [RHEA:18321]
+def: "Catalysis of the reaction:L-leucine + 2-oxoglutarate = 4-methyl-2-oxopentanoate + L-glutamate." [RHEA:18321]
 subset: goslim_chembl
 synonym: "L-leucine aminotransferase activity" EXACT []
+synonym: "L-leucine-2-oxoglutarate transaminase activity" EXACT []
+xref: EC:2.6.1.6
 xref: KEGG_REACTION:R01090
 xref: MetaCyc:BRANCHED-CHAINAMINOTRANSFERLEU-RXN
 xref: RHEA:18321
-is_a: GO:0004084 ! branched-chain-amino-acid transaminase activity
+is_a: GO:0004084 ! branched-chain-amino-acid:2-oxoglutarate transaminase activity
+property_value: skos:exactMatch EC:2.6.1.6
 property_value: skos:exactMatch RHEA:18321
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28176" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0052655
-name: L-valine-2-oxoglutarate transaminase activity
+name: L-valine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-valine = 3-methyl-2-oxobutanoic acid + L-glutamatic acid." [RHEA:24813]
+def: "Catalysis of the reaction: L-valine + 2-oxoglutarate = 3-methyl-2-oxobutanoate + L-glutamate." [RHEA:24813]
 subset: goslim_chembl
 synonym: "L-valine aminotransferase activity" EXACT []
+synonym: "L-valine-2-oxoglutarate transaminase activity" EXACT []
 xref: KEGG_REACTION:R01214
 xref: MetaCyc:BRANCHED-CHAINAMINOTRANSFERVAL-RXN
 xref: RHEA:24813
-is_a: GO:0004084 ! branched-chain-amino-acid transaminase activity
+is_a: GO:0004084 ! branched-chain-amino-acid:2-oxoglutarate transaminase activity
 property_value: skos:exactMatch RHEA:24813
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0052656
-name: L-isoleucine-2-oxoglutarate transaminase activity
+name: L-isoleucine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoglutarate + L-isoleucine = (S)-3-methyl-2-oxopentanoic acid + L-glutamic acid." [RHEA:24801]
+def: "Catalysis of the reaction: L-isoleucine + 2-oxoglutarate = (S)-3-methyl-2-oxopentanoate + L-glutamate." [RHEA:24801]
 subset: goslim_chembl
 synonym: "L-isoleucine aminotransferase activity" EXACT []
+synonym: "L-isoleucine-2-oxoglutarate transaminase activity" EXACT []
 xref: KEGG_REACTION:R02199
 xref: MetaCyc:BRANCHED-CHAINAMINOTRANSFERILEU-RXN
 xref: RHEA:24801
-is_a: GO:0004084 ! branched-chain-amino-acid transaminase activity
+is_a: GO:0004084 ! branched-chain-amino-acid:2-oxoglutarate transaminase activity
 property_value: skos:exactMatch RHEA:24801
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
@@ -360560,7 +360933,7 @@
 id: GO:0052717
 name: tRNA-specific adenosine-34 deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: adenosine-34 + H2O = inosine-34 + NH3, in a tRNA-Ala molecule." [PMID:17875641, RHEA:43168]
+def: "Catalysis of the reaction: adenosine34 in tRNA + H2O + H+ = inosine34 in tRNA + NH4+." [PMID:17875641, RHEA:43168]
 synonym: "tRNA(Ala)-A34 deaminase activity" EXACT []
 xref: EC:3.5.4.33
 xref: RHEA:43168
@@ -360873,12 +361246,13 @@
 
 [Term]
 id: GO:0052735
-name: tRNA (cytidine-3-)-methyltransferase activity
+name: tRNA (cytidine-N3)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a cytidine in tRNA + S-adenosyl-L-methionine = an N3-methylcytidine in tRNA + H+ + S-adenosyl-L-homocysteine." [RHEA:60908]
 synonym: "S-adenosyl-L-methionine:tRNA (cytosine-3-)-methyltransferase activity" EXACT []
 synonym: "S-adenosyl-L-methionine:tRNA cytosine-3-methyltransferase activity" EXACT []
 synonym: "transfer ribonucleate cytosine 3-methyltransferase activity" EXACT []
+synonym: "tRNA (cytidine-3-)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytosine 3)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytosine-3-)-methyltransferase activity" EXACT []
 synonym: "tRNA cytosine 3-methyltransferase activity" EXACT []
@@ -360887,6 +361261,7 @@
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
 property_value: skos:exactMatch RHEA:60908
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25722" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26109" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -361075,7 +361450,7 @@
 id: GO:0052750
 name: versatile peroxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: reactive black 5 + hydrogen peroxide = oxidized reactive black 5 + 2 H2O." [RHEA:22396]
+def: "Catalysis of the reaction: reactive black 5 + H2O2 = oxidized reactive black 5 + 2 H2O." [RHEA:22396]
 synonym: "reactive-black-5:hydrogen-peroxide oxidoreductase activity" BROAD [EC:1.11.1.16]
 xref: EC:1.11.1.16
 xref: KEGG_REACTION:R07612
@@ -361100,15 +361475,12 @@
 
 [Term]
 id: GO:0052752
-name: reduced coenzyme F420:heterodisulfide oxidoreductase activity
+name: obsolete reduced coenzyme F420:heterodisulfide oxidoreductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: reduced coenzyme F420 + CoB-S-S-CoM = coenzyme F420 + CoM-SH + CoB-SH." [GOC:mengo_curators, PMID:9914308]
-synonym: "coenzyme F420-dependent heterodisulfide oxidoreductase activity" EXACT [PMID:9914308]
-synonym: "F420-dependent heterodisulfide oxidoreductase activity" EXACT [PMID:9914308]
-synonym: "F420H2:heterodisulfide oxidoreductase activity" EXACT []
-is_a: GO:0016667 ! oxidoreductase activity, acting on a sulfur group of donors
-created_by: ai
-creation_date: 2011-09-21T04:21:16Z
+def: "OBSOLETE. Catalysis of the reaction: reduced coenzyme F420 + CoB-S-S-CoM = coenzyme F420 + CoM-SH + CoB-SH." [GOC:mengo_curators, PMID:9914308]
+comment: The reason for obsoletion is that this reaction MF has no EC or RHEA xref and no annotations.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0052753
@@ -362565,9 +362937,11 @@
 id: GO:0052868
 name: protein-lysine lysyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: protein-lysine + protein-lysine = protein N6-(lysyl)-L-lysine + protein. This reaction is the addition of lysine group from one protein to a lysine residue in a second protein, producing N6-(lysyl)-L-lysine." [PMID:20729861]
+def: "Catalysis of the reaction: D-beta-lysine + L-lysyl-[protein] + ATP = N6-((3R)-3,6-diaminohexanoyl)-L-lysyl-[protein] + AMP + diphosphate + H+n. This reaction is the addition of lysine group from one protein to a lysine residue in a second protein, producing N6-(lysyl)-L-lysine." [PMID:20729861, RHEA:83435]
+xref: RHEA:83435
 is_a: GO:0016755 ! aminoacyltransferase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31478" xsd:anyURI
 created_by: ai
 creation_date: 2012-01-11T03:05:27Z
 
@@ -364781,15 +365155,18 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of L-proline, an L-enantiomer of a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:ecd]
 synonym: "pyrrolidine-2-carboxylic acid biosynthetic process" BROAD []
+xref: MetaCyc:ORN-AMINOPENTANOATE-CAT-PWY
 xref: MetaCyc:PROSYN-PWY
 xref: MetaCyc:PWY-3341
 xref: MetaCyc:PWY-4281 {status="skos:narrowMatch"}
 xref: MetaCyc:PWY-4981
 is_a: GO:0006560 ! L-proline metabolic process
 is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:ORN-AMINOPENTANOATE-CAT-PWY
 property_value: skos:narrowMatch MetaCyc:PROSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-3341
 property_value: skos:narrowMatch MetaCyc:PWY-4981
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: jid
 creation_date: 2009-10-22T01:59:56Z
 
@@ -364797,10 +365174,13 @@
 id: GO:0055130
 name: D-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-alanine, the D-enantiomer of the amino acid alanine." [GOC:ecd]
+def: "The chemical reactions and pathways resulting in the breakdown of D-alanine." [GOC:curators]
 synonym: "(2R)-2-aminopropanoic acid catabolic process" EXACT []
+xref: MetaCyc:PWY-8448
+is_a: GO:0006522 ! alanine metabolic process
 is_a: GO:0019478 ! D-amino acid catabolic process
-is_a: GO:0046436 ! D-alanine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 created_by: jid
 creation_date: 2009-10-22T02:02:42Z
 
@@ -366191,10 +366571,11 @@
 id: GO:0060138
 name: fetal process involved in parturition
 namespace: biological_process
-def: "A reproductive process occurring in the embryo that results in birth." [GOC:dph]
+def: "A reproductive process occurring in the fetus that results in birth." [GOC:dph]
 is_a: GO:0048609 ! multicellular organismal reproductive process
 relationship: part_of GO:0007567 ! parturition
 relationship: part_of GO:0009792 ! embryo development ending in birth or egg hatching
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31526" xsd:anyURI
 
 [Term]
 id: GO:0060140
@@ -370825,9 +371206,10 @@
 namespace: molecular_function
 def: "Binds to and modulates the activity of an ATP hydrolysis activity." [GOC:dph, GOC:tb]
 synonym: "ATP hydrolysis regulator activity" EXACT []
-is_a: GO:0098772 ! molecular function regulator activity
-relationship: regulates GO:0140657 ! ATP-dependent activity
+is_a: GO:0060589 ! nucleoside-triphosphatase regulator activity
+relationship: regulates GO:0016887 ! ATP hydrolysis activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20955" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31398" xsd:anyURI
 created_by: dph
 creation_date: 2009-05-08T02:49:24Z
 
@@ -381106,12 +381488,14 @@
 
 [Term]
 id: GO:0061502
-name: early endosome to recycling endosome transport
+name: obsolete early endosome to recycling endosome transport
 namespace: biological_process
-def: "The directed movement of substances, in membrane-bounded vesicles, from the early sorting endosomes to the recycling endosomes." [GOC:dph, GOC:kmv, PMID:21474295]
-is_a: GO:0098927 ! vesicle-mediated transport between endosomal compartments
-relationship: occurs_in GO:0005737 ! cytoplasm
+def: "OBSOLETE. The directed movement of substances, in membrane-bounded vesicles, from the early sorting endosomes to the recycling endosomes." [GOC:dph, GOC:kmv, PMID:21474295]
+comment: This term is described by another GO term
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26386" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31240" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0032456
 created_by: dph
 creation_date: 2013-01-04T07:24:56Z
 
@@ -382277,7 +382661,6 @@
 synonym: "N-terminal propionyltransferase activity" EXACT [PMID:23043182]
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
-relationship: part_of GO:0061606 ! N-terminal protein amino acid propionylation
 created_by: dph
 creation_date: 2014-02-11T14:24:35Z
 
@@ -386713,12 +387096,14 @@
 name: regulation of small molecule metabolic process
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of a small molecule metabolic process." [GOC:vw]
+subset: gocheck_do_not_annotate
 synonym: "regulation of small molecule metabolism" EXACT []
 xref: Reactome:R-HSA-9861718 "Regulation of pyruvate metabolism"
 is_a: GO:0019222 ! regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0044281 ! small molecule metabolic process
 relationship: regulates GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: dph
 creation_date: 2018-03-19T14:11:54Z
 
@@ -386727,12 +387112,14 @@
 name: positive regulation of small molecule metabolic process
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of a small molecule metabolic process." [GOC:vw]
+subset: gocheck_do_not_annotate
 synonym: "positive regulation of small molecule metabolism" EXACT []
 is_a: GO:0009893 ! positive regulation of metabolic process
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0044281 ! small molecule metabolic process
 relationship: positively_regulates GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: dph
 creation_date: 2018-03-19T14:25:10Z
 
@@ -386741,12 +387128,14 @@
 name: negative regulation of small molecule metabolic process
 namespace: biological_process
 def: "Any process that stops, prevents or reduces the frequency, rate or extent of a small molecule metabolic process." [GOC:vw]
+subset: gocheck_do_not_annotate
 synonym: "negative regulation of small molecule metabolism" EXACT []
 is_a: GO:0009892 ! negative regulation of metabolic process
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0044281 ! small molecule metabolic process
 relationship: negatively_regulates GO:0044281 ! small molecule metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: dph
 creation_date: 2018-03-19T14:27:23Z
 
@@ -387024,10 +387413,12 @@
 
 [Term]
 id: GO:0062045
-name: L-lysine alpha-aminotransferase activity
+name: L-lysine:pyruvate alpha-transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-lysine + pyruvate= epsilon-amino-alpha-ketocaproic acid (KAC) + alanine." [PMID:27758894, PMID:28330936]
-is_a: GO:0008483 ! transaminase activity
+synonym: "L-lysine alpha-aminotransferase activity" BROAD []
+is_a: GO:0140385 ! amino acid transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dph
 creation_date: 2018-05-11T12:13:57Z
 
@@ -388044,7 +388435,7 @@
 id: GO:0062146
 name: 4-chloro-allylglycine synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-chloro-L-lysine + AH2 + O2 = A + formaldehyde + H2O + L-2-amino-4-chloropent-4-enoate + NH4(+)." [PMID:30867596, RHEA:59888]
+def: "Catalysis of the reaction: 4-chloro-L-lysine + AH2 + O2 = A + formaldehyde + H2O + L-2-amino-4-chloropent-4-enoate + NH4+." [PMID:30867596, RHEA:59888]
 xref: RHEA:59888
 is_a: GO:0016705 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen
 property_value: skos:exactMatch RHEA:59888
@@ -389591,9 +389982,10 @@
 
 [Term]
 id: GO:0070039
-name: rRNA (guanosine-2'-O-)-methyltransferase activity
+name: rRNA (guanosine-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + rRNA = S-adenosyl-L-homocysteine + rRNA containing 2'-O-methylguanosine." [GOC:imk, GOC:mah]
+synonym: "rRNA (guanosine-2'-O-)-methyltransferase activity" EXACT []
 xref: Reactome:R-HSA-6793096 "MRM3 (RNMTL1) methylates guanosine-1370 of 16S rRNA yielding 2'-O-methylguanosine-1370"
 xref: Reactome:R-HSA-6793122 "MRM1 methylates guanosine-1145 of 16S rRNA yielding 2'-O-methylguanosine-1145"
 is_a: GO:0016435 ! rRNA (guanine) methyltransferase activity
@@ -390984,11 +391376,15 @@
 
 [Term]
 id: GO:0070178
-name: D-serine metabolic process
+name: obsolete D-serine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving D-serine, the D-enantiomer of serine, i.e. (2R)-2-amino-3-hydroxypropanoic acid." [CHEBI:16523, GOC:jsg, GOC:mah]
+def: "OBSOLETE. The chemical reactions and pathways involving D-serine, the D-enantiomer of serine, i.e. (2R)-2-amino-3-hydroxypropanoic acid." [CHEBI:16523, GOC:jsg, GOC:mah]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "D-serine metabolism" EXACT []
-is_a: GO:0046416 ! D-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
+consider: GO:0036088
+consider: GO:0070179
 
 [Term]
 id: GO:0070179
@@ -391000,7 +391396,6 @@
 synonym: "D-serine formation" EXACT []
 synonym: "D-serine synthesis" EXACT []
 is_a: GO:0046437 ! D-amino acid biosynthetic process
-is_a: GO:0070178 ! D-serine metabolic process
 
 [Term]
 id: GO:0070180
@@ -391496,10 +391891,11 @@
 id: GO:0070226
 name: sulfur:ferric ion oxidoreductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a perthiol + 4 Fe3+ + 3 H2O = sulfite + a thiol + 4 Fe2+ + 8 H+." [MetaCyc:SULFFEOXIDO-RXN]
+def: "Catalysis of the reaction: S-sulfanylglutathione + 4 Fe3+ + 3 H2O = sulfite + 4 Fe2+ + glutathione + 6 H+." [MetaCyc:SULFFEOXIDO-RXN]
 synonym: "hydrogen sulfide:ferric ion oxidoreductase" EXACT [MetaCyc:SULFFEOXIDO-RXN]
 xref: MetaCyc:SULFFEOXIDO-RXN
 is_a: GO:0016667 ! oxidoreductase activity, acting on a sulfur group of donors
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31518" xsd:anyURI
 
 [Term]
 id: GO:0070227
@@ -392132,7 +392528,7 @@
 id: GO:0070275
 name: aerobic ammonia oxidation to nitrite via pyruvic oxime
 namespace: biological_process
-def: "The metabolic process in which ammonia (NH3) is oxidized to nitrite (NO2) in the presence of oxygen. Hydroxylamine is produced enzymatically, and, in the presence of pyruvate, forms pyruvic oxime in a spontaneous, non-enzymatic reaction; pyruvic oxime is then converted to nitrite." [MetaCyc:PWY-2242]
+def: "The metabolic process in which ammonia (NH4+) is oxidized to nitrite (NO2) in the presence of oxygen. Hydroxylamine is produced enzymatically, and, in the presence of pyruvate, forms pyruvic oxime in a spontaneous, non-enzymatic reaction; pyruvic oxime is then converted to nitrite." [MetaCyc:PWY-2242]
 xref: MetaCyc:PWY-2242
 is_a: GO:0019329 ! ammonia oxidation
 
@@ -394817,10 +395213,14 @@
 
 [Term]
 id: GO:0070529
-name: L-tryptophan aminotransferase activity
+name: obsolete L-tryptophan transaminase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an amino group from L-tryptophan to an acceptor, usually a 2-oxo acid." [GOC:mah]
-is_a: GO:0008483 ! transaminase activity
+def: "OBSOLETE. Catalysis of the transfer of an amino group from L-tryptophan to an acceptor, usually a 2-oxo acid." [GOC:mah]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+synonym: "L-tryptophan aminotransferase activity" EXACT []
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0047299
 
 [Term]
 id: GO:0070530
@@ -394972,10 +395372,14 @@
 
 [Term]
 id: GO:0070548
-name: L-glutamine aminotransferase activity
+name: obsolete L-glutamine transaminase activity
 namespace: molecular_function
-def: "Catalysis of the transfer of an amino group from L-glutamine to an acceptor, usually a 2-oxo acid." [GOC:mah]
-is_a: GO:0008483 ! transaminase activity
+def: "OBSOLETE. Catalysis of the transfer of an amino group from L-glutamine to an acceptor, usually a 2-oxo acid." [GOC:mah]
+comment: This term was obsoleted because it is too general. Consider other glutamine transaminase activity terms.
+synonym: "L-glutamine aminotransferase activity" EXACT []
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
+is_obsolete: true
+consider: GO:0047945
 
 [Term]
 id: GO:0070549
@@ -396609,9 +397013,10 @@
 
 [Term]
 id: GO:0070677
-name: rRNA (cytosine-2'-O-)-methyltransferase activity
+name: rRNA (cytosine-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + rRNA = S-adenosyl-L-homocysteine + rRNA containing 2'-O-methylcytosine." [GOC:mah, PMID:19400805]
+synonym: "rRNA (cytosine-2'-O-)-methyltransferase activity" EXACT []
 is_a: GO:0016434 ! rRNA (cytosine) methyltransferase activity
 is_a: GO:0062105 ! RNA 2'-O-methyltransferase activity
 property_value: skos:broadMatch RHEA:58956
@@ -397678,7 +398083,7 @@
 id: GO:0070773
 name: protein-N-terminal glutamine amidohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: N-terminal L-glutaminyl-[protein] + H2O = N-terminal L-glutamyl-[protein] + NH3. This reaction is the deamidation of an N-terminal glutamine residue of a protein." [PMID:19560421, RHEA:50680]
+def: "Catalysis of the reaction: N-terminal L-glutaminyl-[protein] + H2O = N-terminal L-glutamyl-[protein] + NH4+. This reaction is the deamidation of an N-terminal glutamine residue of a protein." [PMID:19560421, RHEA:50680]
 synonym: "NtQ-amidase activity" EXACT [PMID:19560421]
 xref: EC:3.5.1.122
 xref: RHEA:50680
@@ -400224,8 +400629,13 @@
 synonym: "L-asparagine biosynthesis" EXACT [GOC:mah]
 synonym: "L-asparagine formation" EXACT [GOC:mah]
 synonym: "L-asparagine synthesis" EXACT [GOC:mah]
+xref: MetaCyc:ASPARAGINE-BIOSYNTHESIS
+xref: MetaCyc:ASPARAGINESYN-PWY
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 is_a: GO:0070982 ! L-asparagine metabolic process
+property_value: skos:narrowMatch MetaCyc:ASPARAGINE-BIOSYNTHESIS
+property_value: skos:narrowMatch MetaCyc:ASPARAGINESYN-PWY
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: mah
 creation_date: 2009-10-27T12:59:42Z
 
@@ -403372,6 +403782,7 @@
 is_a: GO:0006555 ! methionine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31068" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: mah
 creation_date: 2009-12-09T04:28:15Z
 
@@ -403384,7 +403795,16 @@
 synonym: "'de novo' L-methionine biosynthesis" EXACT [GOC:mah]
 synonym: "'de novo' L-methionine formation" EXACT [GOC:mah]
 synonym: "'de novo' L-methionine synthesis" EXACT [GOC:mah]
+xref: MetaCyc:HOMOSER-METSYN-PWY
+xref: MetaCyc:HSERMETANA-PWY
+xref: MetaCyc:PWY-702
+xref: MetaCyc:PWY-7977
 is_a: GO:0071265 ! L-methionine biosynthetic process
+property_value: skos:narrowMatch MetaCyc:HOMOSER-METSYN-PWY
+property_value: skos:narrowMatch MetaCyc:HSERMETANA-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-702
+property_value: skos:narrowMatch MetaCyc:PWY-7977
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: mah
 creation_date: 2009-12-09T04:34:41Z
 
@@ -403393,9 +403813,18 @@
 name: L-methionine salvage
 namespace: biological_process
 def: "Any process that generates L-methionine from derivatives of it, without de novo synthesis." [GOC:ecd]
+xref: MetaCyc:ADENOSYLHOMOCYSCAT-PWY
+xref: MetaCyc:PWY-4361
+xref: MetaCyc:PWY-7174
+xref: MetaCyc:PWY-8132
 is_a: GO:0043102 ! amino acid salvage
 is_a: GO:0071265 ! L-methionine biosynthetic process
+property_value: skos:narrowMatch MetaCyc:ADENOSYLHOMOCYSCAT-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-4361
+property_value: skos:narrowMatch MetaCyc:PWY-7174
+property_value: skos:narrowMatch MetaCyc:PWY-8132
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29900" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: mah
 creation_date: 2009-12-09T04:36:49Z
 
@@ -403419,16 +403848,18 @@
 id: GO:0071269
 name: L-homocysteine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of L-homocysteine, the L-enantiomer of 2-amino-4-sulfanylbutanoic acid." [GOC:ecd, GOC:mah]
+def: "The chemical reactions and pathways resulting in the formation of L-homocysteine." [GOC:curators]
 synonym: "L-homocysteine anabolism" EXACT [GOC:mah]
 synonym: "L-homocysteine biosynthesis" EXACT [GOC:mah]
 synonym: "L-homocysteine formation" EXACT [GOC:mah]
 synonym: "L-homocysteine synthesis" EXACT [GOC:mah]
+xref: MetaCyc:PWY-5344
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0050667 ! homocysteine metabolic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: mah
 creation_date: 2009-12-09T05:36:37Z
 
@@ -406389,7 +406820,7 @@
 id: GO:0071522
 name: ureidoglycine aminohydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ureidoglycine + H2O = S-ureidoglycolate + NH3." [MetaCyc:URUR-RXN, PMID:19935661, PMID:20038185]
+def: "Catalysis of the reaction: (S)-2-ureidoglycine + H2O = (S)-ureidoglycolate + NH4+." [PMID:19935661, PMID:20038185, RHEA:25241]
 xref: EC:3.5.3.26
 xref: MetaCyc:URUR-RXN
 xref: RHEA:25241
@@ -406414,15 +406845,17 @@
 id: GO:0071524
 name: pyrrolysine biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of pyrrolysine, N6-{[(2R,3R)-3-methyl-3,4-dihydro-2H-pyrrol-2-yl]carbonyl}-L-lysine." [GOC:dh, PMID:17204561]
+def: "The chemical reactions and pathways resulting in the formation of pyrrolysine." [GOC:curators, PMID:17204561]
 synonym: "monomethylamine methyltransferase cofactor lysine adduct biosynthetic process" EXACT [CHEBI:21860]
 synonym: "pyrrolysine anabolism" EXACT [GOC:mah]
 synonym: "pyrrolysine biosynthesis" EXACT [GOC:mah]
 synonym: "pyrrolysine formation" EXACT [GOC:mah]
 synonym: "pyrrolysine synthesis" EXACT [GOC:mah]
+xref: MetaCyc:PWY-6994
 is_a: GO:0008652 ! amino acid biosynthetic process
 is_a: GO:0042398 ! modified amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: mah
 creation_date: 2010-01-07T02:40:24Z
 
@@ -418059,7 +418492,6 @@
 namespace: molecular_function
 def: "Binds to and modulates the activity of ATP-hydrolyzing DNA topoisomerase. DNA topoisomerase (ATP-hydrolyzing) regulator activity catalyzes a DNA topological transformation by transiently cleaving a pair of complementary DNA strands to form a gate through which a second double-stranded DNA segment is passed, after which the severed strands in the first DNA segment are rejoined; product release is coupled to ATP binding and hydrolysis; changes the linking number in multiples of 2." [GOC:mah]
 is_a: GO:0030234 ! enzyme regulator activity
-is_a: GO:0060590 ! ATPase regulator activity
 relationship: regulates GO:0003918 ! DNA topoisomerase type II (double strand cut, ATP-hydrolyzing) activity
 created_by: mah
 creation_date: 2011-02-09T05:31:50Z
@@ -423306,12 +423738,14 @@
 id: GO:0080002
 name: UDP-glucose:4-aminobenzoate acylglucosyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-aminobenzoate + UDP-alpha-D-glucose = 1-O-(4-aminobenzoyl)-beta-D-glucose + UDP." [PMID:18385129]
+def: "Catalysis of the reaction: 4-aminobenzoate + UDP-alpha-D-glucose = 1-O-(4-aminobenzoyl)-beta-D-glucose + UDP." [PMID:18385129, RHEA:85851]
 synonym: "UDP-glucose:p-aminobenzoate acylglucosyltransferase activity" RELATED []
 synonym: "UDP-glucose:p-aminobenzoate glucosyltransferase activity" RELATED []
 synonym: "UDP-glucose:pABA acylglucosyltransferase activity" RELATED []
 xref: MetaCyc:RXN-6142
+xref: RHEA:85851
 is_a: GO:0035251 ! UDP-glucosyltransferase activity
+property_value: skos:exactMatch RHEA:85851
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28273" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28775" xsd:anyURI
 
@@ -423923,10 +424357,11 @@
 id: GO:0080061
 name: indole-3-acetonitrile nitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: indole-3-acetonitrile + 2 H2O = indole-3-acetic acid + NH3." [RHEA:45776]
+def: "Catalysis of the reaction: (indol-3-yl)acetonitrile + 2 H2O = (indol-3-yl)acetate + NH4+." [RHEA:45776]
 xref: MetaCyc:RXN-1404
 xref: RHEA:45776
 is_a: GO:0000257 ! nitrilase activity
+property_value: skos:broadMatch EC:3.5.5.1
 property_value: skos:exactMatch RHEA:45776
 created_by: dhl
 creation_date: 2009-04-13T03:30:42Z
@@ -424195,10 +424630,12 @@
 name: regulation of primary metabolic process
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the chemical reactions and pathways within a cell or an organism involving those compounds formed as a part of the normal anabolic and catabolic processes. These processes take place in most, if not all, cells of the organism." [PMID:19211694]
+subset: gocheck_do_not_annotate
 is_a: GO:0019222 ! regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0044238 ! primary metabolic process
 relationship: regulates GO:0044238 ! primary metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31498" xsd:anyURI
 created_by: dhl
 creation_date: 2009-04-22T04:30:52Z
 
@@ -424271,40 +424708,48 @@
 
 [Term]
 id: GO:0080097
-name: L-tryptophan:pyruvate aminotransferase activity
+name: L-tryptophan:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-tryptophan + pyruvate = 3-(indol-3-yl)pyruvate + L-alanine." [RHEA:27586]
+def: "Catalysis of the reaction: L-tryptophan + pyruvate = indole-3-pyruvate + L-alanine." [RHEA:27586]
+synonym: "L-tryptophan:pyruvate aminotransferase activity" EXACT []
 xref: EC:2.6.1.99
 xref: MetaCyc:RXN-10139
 xref: RHEA:27586
-is_a: GO:0070529 ! L-tryptophan aminotransferase activity
+is_a: GO:0047635 ! L-alanine:oxo-acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.99
 property_value: skos:exactMatch RHEA:27586
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dhl
 creation_date: 2009-04-23T03:45:23Z
 
 [Term]
 id: GO:0080098
-name: L-tyrosine-pyruvate transaminase activity
+name: L-tyrosine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-tyrosine + pyruvate = (4-hydroxyphenyl)pyruvate + L-alanine." [MetaCyc:RXN3O-4157]
+def: "Catalysis of the reaction: L-tyrosine + pyruvate = 3-(4-hydroxyphenyl)pyruvate + L-alanine." [MetaCyc:RXN3O-4157]
 synonym: "L-tyrosine aminotransferase activity" BROAD []
+synonym: "L-tyrosine-pyruvate transaminase activity" EXACT []
 synonym: "L-tyrosine:pyruvate aminotransferase activity" EXACT []
 xref: MetaCyc:RXN3O-4157
-is_a: GO:0008793 ! aromatic-amino-acid transaminase activity
+is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:broadMatch EC:2.6.1.58
+property_value: skos:exactMatch MetaCyc:RXN3O-4157
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dhl
 creation_date: 2009-04-23T03:47:53Z
 
 [Term]
 id: GO:0080099
-name: L-methionine:2-oxoglutarate aminotransferase activity
+name: L-methionine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-methionine + 2-oxoglutarate = 4-methylthio-2-oxobutyrate + L-glutamate." [PMID:18394996]
-comment: This reaction falls within the larger set of reactions associated with EC:2.6.1.5 (See BRENDA: http://www.brenda-enzymes.org/php/result_flat.php4?ecno=2.6.1.5).
+def: "Catalysis of the reaction: L-methionine + 2-oxoglutarate = 4-methylsulfanyl-2-oxobutanoate + L-glutamate." [PMID:18394996, RHEA:25796]
+synonym: "L-methionine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "L-methionine:alpha-ketoglutarate aminotransferase activity" EXACT []
-is_a: GO:0010326 ! methionine-oxo-acid transaminase activity
+xref: MetaCyc:RXN-14147
+xref: RHEA:25796
+is_a: GO:0010326 ! L-methionine:oxo-acid transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dhl
 creation_date: 2009-04-23T03:51:20Z
 
@@ -424654,20 +425099,21 @@
 
 [Term]
 id: GO:0080130
-name: L-phenylalanine-2-oxoglutarate transaminase activity
+name: L-phenylalanine:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-phenylalanine + 2-oxoglutarate = 3-phenylpyruvate + L-glutamate." [PMID:18394996, RHEA:25152]
+synonym: "L-phenylalanine-2-oxoglutarate transaminase activity" EXACT []
 synonym: "L-phenylalanine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "L-phenylalanine:alpha-ketoglutarate aminotransferase activity" EXACT []
 xref: KEGG_REACTION:R00694
 xref: MetaCyc:RXN-10814
 xref: RHEA:25152
-is_a: GO:0008793 ! aromatic-amino-acid transaminase activity
+is_a: GO:0008793 ! aromatic-amino-acid:2-oxoglutarate transaminase activity
 property_value: skos:broadMatch EC:2.6.1.5
-property_value: skos:broadMatch EC:2.6.1.57
 property_value: skos:exactMatch RHEA:25152
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31139" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dhl
 creation_date: 2009-04-29T03:42:47Z
 
@@ -425125,7 +425571,7 @@
 id: GO:0080170
 name: hydrogen peroxide transmembrane transport
 namespace: biological_process
-def: "The process in which hydrogen peroxide is transported across a membrane." [GOC:tb]
+def: "The process in which H2O2 is transported across a membrane." [GOC:tb]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "hydrogen peroxide membrane transport" EXACT []
 is_a: GO:0055085 ! transmembrane transport
@@ -432941,10 +433387,11 @@
 
 [Term]
 id: GO:0090486
-name: small RNA 2'-O-methyltransferase activity
+name: small RNA 2'-O-ribose methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a methyl group from S-adenosyl-L-methionine to the oxygen atom of a nucleoside residue in a small RNA molecule. Reaction: S-adenosyl-L-methionine + small RNA = S-adenosyl-L-homocysteine + small RNA containing a 3'-terminal 2'-O-methylnucleotide." [GOC:tb, GOC:vw, RHEA:37887]
 synonym: "small RNA 2'-O-methyltransferase" EXACT []
+synonym: "small RNA 2'-O-methyltransferase activity" EXACT []
 xref: EC:2.1.1.386
 xref: RHEA:37887
 is_a: GO:0062105 ! RNA 2'-O-methyltransferase activity
@@ -433644,7 +434091,7 @@
 synonym: "phosphatidylcholine floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
 synonym: "phosphatidylcholine-translocating ATPase activity" BROAD []
 xref: RHEA:38583
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
+is_a: GO:0008525 ! phosphatidylcholine intramembrane carrier activity
 is_a: GO:0140328 ! floppase activity
 property_value: skos:broadMatch RHEA:66132
 property_value: skos:exactMatch RHEA:38583
@@ -433678,7 +434125,6 @@
 synonym: "phosphatidylserine floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
 synonym: "phosphatidylserine-translocating ATPase activity" BROAD []
 xref: RHEA:38567
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0140328 ! floppase activity
 property_value: skos:broadMatch RHEA:66132
 property_value: skos:exactMatch RHEA:38567
@@ -434048,7 +434494,7 @@
 id: GO:0090595
 name: L-lysine N6-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + L-lysine = CoA + H+ + N(6)-acetyl-L-lysine." [RHEA:69476]
+def: "Catalysis of the reaction: acetyl-CoA + L-lysine = CoA + H+ + N6-acetyl-L-lysine." [RHEA:69476]
 synonym: "acetyl-CoA:L-lysine N6-acetyltransferase" EXACT []
 xref: EC:2.3.1.306
 xref: MetaCyc:LYSACET-RXN
@@ -434208,7 +434654,7 @@
 id: GO:0090612
 name: cAMP deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cyclic adenosine monophosphate + H2O = cyclic inosine monophosphate + NH3." [PMID:24074367, RHEA:22908]
+def: "Catalysis of the reaction: 3',5'-cyclic AMP + H2O + H+ = 3',5'-cyclic IMP + NH4+." [PMID:24074367, RHEA:22908]
 synonym: "cyclic adenosine monophosphate deaminase activity" EXACT []
 xref: EC:3.5.4.46
 xref: RHEA:22908
@@ -434225,7 +434671,7 @@
 id: GO:0090613
 name: 5'-deoxyadenosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5'deoxyadenosine + H2O = 5'deoxyinosine + NH3." [PMID:23968233, RHEA:42892]
+def: "Catalysis of the reaction: 5'-deoxyadenosine + H2O + H+ = 5'-deoxyinosine + NH4+." [PMID:23968233, RHEA:42892]
 xref: EC:3.5.4.41
 xref: RHEA:42892
 is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
@@ -434240,7 +434686,7 @@
 id: GO:0090614
 name: 5'-methylthioadenosine deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5'methyl thioadenosine + H2O = 5'methyl thioinosine + NH3." [PMID:23968233, RHEA:25025]
+def: "Catalysis of the reaction: S-methyl-5'-thioadenosine + H2O + H+ = S-methyl-5'-thioinosine + NH4+." [PMID:23968233, RHEA:25025]
 xref: EC:3.5.4.31
 xref: RHEA:25025
 is_a: GO:0016814 ! hydrolase activity, acting on carbon-nitrogen (but not peptide) bonds, in cyclic amidines
@@ -436163,10 +436609,21 @@
 synonym: "L-glutamate biosynthesis" EXACT []
 synonym: "L-glutamate formation" EXACT []
 synonym: "L-glutamate synthesis" EXACT []
+xref: MetaCyc:GLUGLNSYN-PWY
+xref: MetaCyc:GLUTAMATE-SYN2-PWY
+xref: MetaCyc:GLUTSYN-PWY
+xref: MetaCyc:GLUTSYNIII-PWY
+xref: MetaCyc:PWY-4341
 is_a: GO:0006536 ! glutamate metabolic process
 is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
 is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
 property_value: skos:broadMatch MetaCyc:PWY-5505
+property_value: skos:narrowMatch MetaCyc:GLUGLNSYN-PWY
+property_value: skos:narrowMatch MetaCyc:GLUTAMATE-SYN2-PWY
+property_value: skos:narrowMatch MetaCyc:GLUTSYN-PWY
+property_value: skos:narrowMatch MetaCyc:GLUTSYNIII-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-4341
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: pr
 creation_date: 2011-05-24T04:30:38Z
 
@@ -443245,7 +443702,7 @@
 id: GO:0097697
 name: tRNA (5-carboxymethoxyuridine(34)-5-O)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-carboxymethoxyuridine34 in tRNA + S-adenosyl-L-methionine = 5-methoxycarbonylmethoxyuridine34 in tRNA + S-adenosyl-L-homocysteine." [PMID:26681692, RHEA:54080]
+def: "Catalysis of the reaction: 5-carboxymethoxyuridine34 in tRNA + S-adenosyl-L-methionine = 5-methoxycarbonylmethoxyuridine34 in tRNA + S-adenosyl-L-homocysteine. The methylation occurs on the modified base." [PMID:26681692, RHEA:54080]
 synonym: "tRNA 5-carboxymethoxyuridine methyltransferase activity" RELATED []
 xref: RHEA:54080
 is_a: GO:0016300 ! tRNA (uridine) methyltransferase activity
@@ -444697,10 +445154,11 @@
 id: GO:0098538
 name: lumenal side of transport vesicle membrane
 namespace: cellular_component
-def: "The side (leaflet) of the transport vesicle membrane that faces the lumen." [GOC:ab]
+def: "The leaflet of a transport vesicle membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab]
 synonym: "internal side of transport vesicle membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0030658 ! transport vesicle membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-10-24T11:43:55Z
 
@@ -444708,10 +445166,11 @@
 id: GO:0098539
 name: cytoplasmic side of transport vesicle membrane
 namespace: cellular_component
-def: "The side (leaflet) of the transport vesicle membrane that faces the cytoplasm." [GOC:ab]
+def: "The leaflet of the transport vesicle membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab]
 synonym: "external side of transport vesicle membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0030658 ! transport vesicle membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-10-24T11:48:07Z
 
@@ -444719,10 +445178,11 @@
 id: GO:0098540
 name: lumenal side of trans-Golgi network transport vesicle membrane
 namespace: cellular_component
-def: "The side (leaflet) of the trans-Golgi network transport vesicle membrane that faces the lumen." [GOC:ab]
+def: "The leaflet of a trans-Golgi network transport vesicle membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab]
 synonym: "internal side of trans-Golgi network transport vesicle membrane" RELATED []
 is_a: GO:0098538 ! lumenal side of transport vesicle membrane
 relationship: part_of GO:0012510 ! trans-Golgi network transport vesicle membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-10-24T11:55:02Z
 
@@ -444730,10 +445190,11 @@
 id: GO:0098541
 name: cytoplasmic side of trans-Golgi network transport vesicle membrane
 namespace: cellular_component
-def: "The side (leaflet) of the trans-Golgi network transport vesicle membrane that faces the cytoplasm." [GOC:ab]
+def: "The leaflet of the trans-Golgi network transport vesicle membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab]
 synonym: "external side of trans-Golgi network transport vesicle membrane" EXACT []
 is_a: GO:0098539 ! cytoplasmic side of transport vesicle membrane
 relationship: part_of GO:0012510 ! trans-Golgi network transport vesicle membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-10-24T11:56:30Z
 
@@ -444793,9 +445254,10 @@
 id: GO:0098547
 name: lumenal side of Golgi membrane
 namespace: cellular_component
-def: "The side of the Golgi membrane that faces the lumen." [GOC:ab, GOC:dos]
+def: "The leaflet of the Golgi membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0000139 ! Golgi membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T10:44:23Z
 
@@ -444803,9 +445265,10 @@
 id: GO:0098548
 name: cytoplasmic side of Golgi membrane
 namespace: cellular_component
-def: "The side (leaflet) of the Golgi membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the Golgi membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0000139 ! Golgi membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T10:49:33Z
 
@@ -444820,27 +445283,29 @@
 id: GO:0098550
 name: lumenal side of early endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the early endosome membrane that faces the lumen." [GOC:lr]
+def: "The leaflet of the early endosome membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:lr]
 synonym: "internal leaflet of early endosome membrane" EXACT [GOC:ab]
 synonym: "internal side of early endosome membrane" EXACT []
 is_a: GO:0098565 ! lumenal side of endosome membrane
 relationship: part_of GO:0031901 ! early endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098551
 name: lumenal side of late endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the late endosome membrane that faces the lumen." [GOC:lr]
+def: "The leaflet of the late endosomal membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:lr]
 synonym: "internal leaflet of late endosome membrane" EXACT [GOC:ab]
 synonym: "internal side of late endosome membrane" EXACT []
 is_a: GO:0098565 ! lumenal side of endosome membrane
 relationship: part_of GO:0031902 ! late endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098552
 name: side of membrane
 namespace: cellular_component
-def: "A cellular component consisting of one leaflet of a membrane bilayer and any proteins embedded or anchored in it or attached to its surface." [GOC:dos]
+def: "A cellular component consisting of one leaflet of a membrane bilayer and any protein embedded or anchored in it or attached to its surface." [GOC:dos]
 is_a: GO:0110165 ! cellular anatomical structure
 relationship: has_part GO:0097478 ! leaflet of membrane bilayer
 relationship: part_of GO:0016020 ! membrane
@@ -444851,9 +445316,10 @@
 id: GO:0098553
 name: lumenal side of endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the plasma membrane that faces the lumen." [GOC:ab, GOC:dos]
+def: "The leaflet of the endoplasmic reticulum membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0005789 ! endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:08:37Z
 
@@ -444861,9 +445327,10 @@
 id: GO:0098554
 name: cytoplasmic side of endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the plasma membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the endoplasmic reticulum membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0005789 ! endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:09:47Z
 
@@ -444871,9 +445338,10 @@
 id: GO:0098555
 name: lumenal side of rough endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the rough endoplasmic reticulum membrane that faces the lumen." [GOC:ab, GOC:dos]
+def: "The leaflet of the rough endoplasmic reticulum membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098553 ! lumenal side of endoplasmic reticulum membrane
 relationship: part_of GO:0030867 ! rough endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:13:24Z
 
@@ -444881,9 +445349,10 @@
 id: GO:0098556
 name: cytoplasmic side of rough endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the rough endoplasmic reticulum membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the rough endoplasmic reticulum membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098554 ! cytoplasmic side of endoplasmic reticulum membrane
 relationship: part_of GO:0030867 ! rough endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:15:44Z
 
@@ -444891,9 +445360,10 @@
 id: GO:0098557
 name: cytoplasmic side of smooth endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the smooth endoplasmic reticulum membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the smooth endoplasmic reticulum membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098554 ! cytoplasmic side of endoplasmic reticulum membrane
 relationship: part_of GO:0030868 ! smooth endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:17:58Z
 
@@ -444901,9 +445371,10 @@
 id: GO:0098558
 name: lumenal side of smooth endoplasmic reticulum membrane
 namespace: cellular_component
-def: "The side (leaflet) of the smooth endoplasmic reticulum membrane that faces the lumen." [GOC:ab, GOC:dos]
+def: "The leaflet of the smooth endoplasmic reticulum membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0098553 ! lumenal side of endoplasmic reticulum membrane
 relationship: part_of GO:0030868 ! smooth endoplasmic reticulum membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-03T12:19:28Z
 
@@ -444911,23 +445382,25 @@
 id: GO:0098559
 name: cytoplasmic side of early endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the early endosome membrane that faces the cytoplasm." [GOC:lr]
+def: "The leaflet of the early endosome membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:lr]
 comment: In GO, 'external side' still refers to part of the membrane and does not refer to components beyond (outside of) the membrane.
 synonym: "external leaflet of early endosome membrane" EXACT [GOC:ab]
 synonym: "external side of early endosome membrane" EXACT []
 is_a: GO:0010009 ! cytoplasmic side of endosome membrane
 relationship: part_of GO:0031901 ! early endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098560
 name: cytoplasmic side of late endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the late endosome membrane that faces the cytoplasm." [GOC:lr]
+def: "The leaflet of the late endosome membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:lr]
 comment: In GO, 'external side' still refers to part of the membrane and does not refer to components beyond (outside of) the membrane.
 synonym: "external leaflet of late endosome membrane" EXACT [GOC:ab]
 synonym: "external side of late endosome membrane" EXACT []
 is_a: GO:0010009 ! cytoplasmic side of endosome membrane
 relationship: part_of GO:0031902 ! late endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098561
@@ -444941,8 +445414,9 @@
 id: GO:0098562
 name: cytoplasmic side of membrane
 namespace: cellular_component
-def: "The side of a membrane that faces the cytoplasm." [GOC:dos]
+def: "The leaflet of a membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098552 ! side of membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-12T11:21:30Z
 
@@ -444969,11 +445443,12 @@
 id: GO:0098565
 name: lumenal side of endosome membrane
 namespace: cellular_component
-def: "The side (leaflet) of the endosome membrane that faces the lumen." [GOC:dos]
+def: "The leaflet of the endosome membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 synonym: "internal leaflet of endosome membrane" EXACT [GOC:ab]
 synonym: "internal side of endosome membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0010008 ! endosome membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098566
@@ -444987,8 +445462,9 @@
 id: GO:0098567
 name: periplasmic side of plasma membrane
 namespace: cellular_component
-def: "The side (leaflet) of a plasma membrane that faces the periplasm, and all proteins embedded in it or attached to its surface." [GOC:dos]
+def: "The leaflet of the plasma membrane that faces the periplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0009897 ! external side of plasma membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2013-12-19T09:31:30Z
 
@@ -444996,39 +445472,44 @@
 id: GO:0098568
 name: external side of mycolate outer membrane
 namespace: cellular_component
-def: "The side (leaflet) of the mycolate outer membrane that faces the environment and any proteins embedded in it or loosely bound to its surface." [GOC:dos, PMID:18316738, PMID:18567661]
+def: "The leaflet of the mycolate outer membrane that faces the periplasm of the cell, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos, PMID:18316738, PMID:18567661]
 is_a: GO:0031240 ! external side of cell outer membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098569
 name: internal side of mycolate outer membrane
 namespace: cellular_component
-def: "The side of the mycolate outer membrane that faces the cell wall peptidoglycan. It is rich in long-chain mycolic acids (hydroxylated branched-chain fatty acids) that are covalently linked to the cell wall peptidoglycan via an arabinogalactan network." [GOC:dos, PMID:18316738, PMID:18567661]
+def: "The leaflet of the mycolate outer membrane that faces the cell wall peptidoglycan, including any protein embedded in, attached to, or peripherally associated with it. It is rich in long-chain mycolic acids (hydroxylated branched-chain fatty acids) that are covalently linked to the cell wall peptidoglycan via an arabinogalactan network." [GOC:dos, PMID:18316738, PMID:18567661]
 is_a: GO:0098552 ! side of membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098570
 name: stromal side of plastid inner membrane
 namespace: cellular_component
-def: "The side (leaflet) of the plastid inner membrane that faces the stroma, and any proteins embedded in it or loosely bound to its surface." [GOC:dos]
+def: "The leaflet of the plastid inner membrane that faces the stroma, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0009528 ! plastid inner membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098571
 name: lumenal side of plastid thylakoid membrane
 namespace: cellular_component
-def: "The side (leaflet) of the plastid thylakoid membrane that faces the lumen, and any proteins embedded in it or loosely bound to its surface." [GOC:dos]
+def: "The leaflet of a plastid thylakoid membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0055035 ! plastid thylakoid membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098572
 name: stromal side of plastid thylakoid membrane
 namespace: cellular_component
-def: "The side (leaflet) of the plastid thylakoid membrane that faces the stroma, and any proteins embedded in it or loosely bound to its surface." [GOC:dos]
+def: "The leaflet of the plastid thylakoid membrane that faces the stroma, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098552 ! side of membrane
 relationship: part_of GO:0055035 ! plastid thylakoid membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098573
@@ -445045,28 +445526,31 @@
 id: GO:0098574
 name: cytoplasmic side of lysosomal membrane
 namespace: cellular_component
-def: "The side (leaflet) of the lysosomal membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the lysosomal membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 synonym: "external leaflet of lysosomal membrane" EXACT [GOC:dos]
 synonym: "external side of lysosomal membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0005765 ! lysosomal membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098575
 name: lumenal side of lysosomal membrane
 namespace: cellular_component
-def: "The side (leaflet) of the lysosomal membrane that faces the lumen." [GOC:dos]
+def: "The leaflet of the lysosomal membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 synonym: "internal leaflet of lysosomal membrane" EXACT [GOC:ab]
 synonym: "internal side of lysosomal membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0005765 ! lysosomal membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098576
 name: lumenal side of membrane
 namespace: cellular_component
-def: "Any side (leaflet) of a membrane that faces the lumen of an organelle." [GOC:dos]
+def: "The leaflet of an organelle membrane that faces the lumen, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098552 ! side of membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0098577
@@ -445191,9 +445675,10 @@
 id: GO:0098591
 name: external side of apical plasma membrane
 namespace: cellular_component
-def: "The leaflet the apical region of the plasma membrane that faces away from the cytoplasm and any proteins embedded or anchored in it or attached to its surface." [GOC:ab, GOC:dos]
+def: "The leaflet the apical region of the plasma membrane that faces the extracellular side of the cell, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0009897 ! external side of plasma membrane
 relationship: part_of GO:0016324 ! apical plasma membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2014-03-06T12:04:33Z
 
@@ -445201,9 +445686,10 @@
 id: GO:0098592
 name: cytoplasmic side of apical plasma membrane
 namespace: cellular_component
-def: "The side (leaflet) of the apical region of the plasma membrane that faces the cytoplasm." [GOC:ab, GOC:dos]
+def: "The leaflet of the apical region of the plasma membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:ab, GOC:dos]
 is_a: GO:0009898 ! cytoplasmic side of plasma membrane
 relationship: part_of GO:0016324 ! apical plasma membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: dos
 creation_date: 2014-03-06T12:07:32Z
 
@@ -445352,12 +445838,13 @@
 
 [Term]
 id: GO:0098607
-name: methylselenocysteine deselenhydrase activity
+name: obsolete methylselenocysteine deselenhydrase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Se-Methyl-L-selenocysteine + H2O = pyruvic acid + NH3 + Methaneselenol." [PMID:17451884, PMID:20383543]
+def: "OBSOLETE. Catalysis of the reaction: Se-Methyl-L-selenocysteine + H2O = pyruvic acid + NH3 + Methaneselenol." [PMID:17451884, PMID:20383543]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: Reactome:R-HSA-2408539 "MeSec is hydrolysed to MeSeH by PXLP-K212-CTH"
-is_a: GO:0016846 ! carbon-sulfur lyase activity
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30815" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 created_by: dos
 creation_date: 2014-04-16T11:24:12Z
 
@@ -452412,9 +452899,10 @@
 id: GO:0099617
 name: matrix side of mitochondrial inner membrane
 namespace: cellular_component
-def: "The side (leaflet) of the mitochondrial inner membrane that faces the matrix." [GOC:dos]
+def: "The leaflet of a mitochondrial inner membrane that faces the matrix, including any protein embedded in, attached to, or peripherally associated with it." [GOC:dos]
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0005743 ! mitochondrial inner membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 
 [Term]
 id: GO:0099618
@@ -452449,11 +452937,12 @@
 
 [Term]
 id: GO:0099620
-name: UDP-4-amino-4-deoxy-L-arabinose aminotransferase activity
+name: UDP-4-amino-4-deoxy-L-arabinose:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: UDP-4-amino-4-deoxy-beta-L-arabinose + 2-oxoglutarate = UDP-beta-L-threo-pentopyranos-4-ulose + L-glutamate." [PMID:12429098, PMID:12704196, RHEA:24710]
 synonym: "UDP-(beta-L-threo-pentapyranosyl-4''-ulose diphosphate) aminotransferase" EXACT []
 synonym: "UDP-4-amino-4-deoxy-beta-L-arabinose:2-oxoglutarate aminotransferase" EXACT []
+synonym: "UDP-4-amino-4-deoxy-L-arabinose aminotransferase" BROAD []
 synonym: "UDP-4-amino-4-deoxy-L-arabinose---oxoglutarate aminotransferase" EXACT []
 synonym: "UDP-Ara4O aminotransferase" EXACT []
 synonym: "UDP-L-Ara4N transaminase" EXACT []
@@ -452463,6 +452952,7 @@
 property_value: skos:exactMatch EC:2.6.1.87
 property_value: skos:exactMatch RHEA:24710
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0099621
@@ -453997,11 +454487,13 @@
 
 [Term]
 id: GO:0102038
-name: 4-nitrobenzyl alcohol oxidase activity
+name: obsolete 4-nitrobenzyl alcohol oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-nitrobenzyl alcohol + O2 = 4-nitrobenzaldehyde + hydrogen peroxide." [GOC:pz]
+def: "OBSOLETE. Catalysis of the reaction: 4-nitrobenzyl alcohol + O2 = 4-nitrobenzaldehyde + hydrogen peroxide." [GOC:pz]
+comment: This term was obsoleted because there is no evidence that this reaction exists.
 xref: MetaCyc:R362-RXN
-is_a: GO:0016899 ! oxidoreductase activity, acting on the CH-OH group of donors, oxygen as acceptor
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31530" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0102039
@@ -455065,7 +455557,7 @@
 id: GO:0102149
 name: farnesylcysteine lyase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-[(2E,6E)-farnesyl]-L-cysteine + O2 + H2O = (2-trans,6-trans)-farnesal + L-cysteine + hydrogen peroxide." [EC:1.8.3.6, GOC:pz]
+def: "Catalysis of the reaction: S-[(2E,6E)-farnesyl]-L-cysteine + O2 + H2O = (2-trans,6-trans)-farnesal + L-cysteine + H2O2." [EC:1.8.3.6, GOC:pz]
 xref: EC:1.8.3.6
 xref: MetaCyc:RXN-11623
 xref: RHEA:30231
@@ -456723,7 +457215,7 @@
 id: GO:0102317
 name: 4-methylaminobutyrate oxidase (demethylating) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-(methylamino)butyric acid + O2 + H2O = gamma-aminobutyric acid + formaldehyde + hydrogen peroxide." [EC:1.5.3.19, GOC:pz]
+def: "Catalysis of the reaction: 4-(methylamino)butanoate + O2 + H2O = 4-aminobutanoate + formaldehyde + H2O2." [RHEA:33907]
 xref: EC:1.5.3.19
 xref: MetaCyc:RXN-13067
 xref: RHEA:33907
@@ -457134,7 +457626,9 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: mithramycin DK + NADPH + H+ = iso-mithramycin + NADP+. Note that  iso-mithramycin (iso-MTM) is a C2-epimer of mithramycin.  This intermediate appears to be biologically important because it is non-toxic, then exported out of the cell and finally spontaneously epimerized into the toxic mithramycin. This could represent a self-resistance mechanism against MTM toxicity." [PMID:31702856]
 xref: MetaCyc:RXN-13385
+xref: RHEA:85451
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch RHEA:85451
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30329" xsd:anyURI
 
@@ -461382,7 +461876,7 @@
 id: GO:0102778
 name: delta9-tetrahydrocannabinolate synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cannabigerolate + O2 = delta(9)-tetrahydrocannabinolic acid + hydrogen peroxide." [GOC:pz, RHEA:34135]
+def: "Catalysis of the reaction: cannabigerolate + O2 = delta(9)-tetrahydrocannabinolic acid +  H2O2." [RHEA:34135]
 xref: EC:1.21.3.7
 xref: MetaCyc:RXN-7854
 xref: RHEA:34135
@@ -461395,7 +461889,7 @@
 id: GO:0102779
 name: cannabidiolate synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cannabigerolate + O2 = cannabidiolate + hydrogen peroxide." [GOC:pz, RHEA:34411]
+def: "Catalysis of the reaction: cannabigerolate + O2 = cannabidiolate + H2O2." [RHEA:34411]
 xref: EC:1.21.3.8
 xref: MetaCyc:RXN-7855
 xref: RHEA:34411
@@ -462992,9 +463486,10 @@
 
 [Term]
 id: GO:0102933
-name: GDP-4-dehydro-6-deoxy-D-mannose-4-aminotransferase activity
+name: GDP-perosamine synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: GDP-4-amino-4,6-dideoxy-alpha-D-mannose + 2-oxoglutarate = GDP-4-dehydro-6-deoxy-alpha-D-mannose + L-glutamate." [GOC:pz, RHEA:36779]
+def: "Catalysis of the reaction: GDP-alpha-D-perosamine + 2-oxoglutarate = GDP-4-dehydro-alpha-D-rhamnose + L-glutamate." [RHEA:36779]
+synonym: "GDP-4-dehydro-6-deoxy-D-mannose-4-aminotransferase activity" EXACT []
 xref: EC:2.6.1.102
 xref: MetaCyc:RXN-8953
 xref: RHEA:36779
@@ -463002,6 +463497,7 @@
 property_value: skos:exactMatch EC:2.6.1.102
 property_value: skos:exactMatch RHEA:36779
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0102934
@@ -464268,14 +464764,14 @@
 
 [Term]
 id: GO:0103068
-name: leukotriene C4 gamma-glutamyl transferase activity
+name: obsolete leukotriene C4 gamma-glutamyl transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: leukotriene C4 + a standard alpha amino acid = leukotriene D4 + an (gamma-L-glutamyl)-L-amino acid." [GOC:pz, PMID:1676842, PMID:9139674]
+def: "OBSOLETE. Catalysis of the reaction: leukotriene C4 + a standard alpha amino acid = leukotriene D4 + an (gamma-L-glutamyl)-L-amino acid." [GOC:pz, PMID:1676842, PMID:9139674]
 xref: EC:2.3.2.2
-xref: MetaCyc:RXN66-336
-is_a: GO:0016755 ! aminoacyltransferase activity
 property_value: skos:exactMatch EC:2.3.2.2
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31373" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0103069
@@ -465234,15 +465730,13 @@
 
 [Term]
 id: GO:0106045
-name: guanine deglycation, methylglyoxal removal
+name: obsolete guanine deglycation, methylglyoxal removal
 namespace: biological_process
-def: "The removal of methylglyoxal from a glycated guanine, to form lactate and a deglycated guanine." [PMID:28596309]
-is_a: GO:0009438 ! methylglyoxal metabolic process
-is_a: GO:0051595 ! response to methylglyoxal
-is_a: GO:0106044 ! guanine deglycation
-is_a: GO:0140041 ! cellular detoxification of methylglyoxal
-created_by: hjd
-creation_date: 2017-08-01T18:17:28Z
+def: "OBSOLETE. The removal of methylglyoxal from a glycated guanine, to form lactate and a deglycated guanine." [PMID:28596309]
+comment: The reason for obsoletion is that this term represents a molecular function rather than a biological process.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31367" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0036524
 
 [Term]
 id: GO:0106046
@@ -465289,14 +465783,17 @@
 
 [Term]
 id: GO:0106050
-name: tRNA 2'-O-methyltransferase activity
+name: obsolete tRNA 2'-O-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-adenosyl-L-methionine + tRNA = S-adenosyl-L-homocysteine + tRNA containing a 2'-O-nucleotide." [PMID:17242307]
+def: "OBSOLETE. Catalysis of the reaction: S-adenosyl-L-methionine + tRNA = S-adenosyl-L-homocysteine + tRNA containing a 2'-O-nucleotide." [PMID:17242307]
+comment: This term was obsoleted because it is an unnecessray grouping term.
 xref: Reactome:R-HSA-6788668 "TRMT13 2'-O-methylates adenosine-4 in tRNA"
 xref: Reactome:R-HSA-6788684 "TRMT13 2'-O-methylates cytidine-4 in tRNA"
 xref: Reactome:R-HSA-9024159 "FTSJ1 2'-O-methylates cytidine-32 in tRNA(Phe)"
-is_a: GO:0008175 ! tRNA methyltransferase activity
-is_a: GO:0062105 ! RNA 2'-O-methyltransferase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31519" xsd:anyURI
+is_obsolete: true
+consider: GO:0106339
+consider: GO:0106340
 created_by: hjd
 creation_date: 2017-08-11T20:30:31Z
 
@@ -465368,10 +465865,11 @@
 
 [Term]
 id: GO:0106059
-name: tRNA (cytidine(56)-2'-O)-methyltransferase activity
+name: tRNA (cytidine(56)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + cytidine56 in tRNA= S-adenosyl-L-homocysteine + 2'-O-methylcytidine56 in tRNA." [RHEA:42968]
 synonym: "tRNA (cytidine 56-2'-O)-methyltransferase activity" EXACT []
+synonym: "tRNA (cytidine(56)-2'-O)-methyltransferase activity" EXACT []
 xref: EC:2.1.1.206
 xref: MetaCyc:RXN-11869
 xref: RHEA:42968
@@ -466459,13 +466957,16 @@
 
 [Term]
 id: GO:0106162
-name: mRNA N-acetyltransferase activity
+name: mRNA cytidine N-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a cytidine in mRNA + acetyl-CoA + ATP + H2O = ADP + an N(4)-acetylcytidine in mRNA + CoA + H+ + phosphate." [GOC:sp, PMID:30449621, RHEA:58480]
+synonym: "mRNA N-acetyltransferase activity" BROAD []
 xref: RHEA:58480
 is_a: GO:0008080 ! N-acetyltransferase activity
+is_a: GO:0140640 ! catalytic activity, acting on a nucleic acid
 property_value: skos:exactMatch RHEA:58480
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: terms:contributor "https://github.com/geneontology/go-ontology/issues/16755" xsd:anyURI
 created_by: hjd
 creation_date: 2018-12-18T19:19:06Z
 
@@ -466681,9 +467182,10 @@
 id: GO:0106186
 name: cytoplasmic side of plasma membrane, cell tip
 namespace: cellular_component
-def: "The leaflet the plasma membrane at the cell tip that faces the cytoplasm and any proteins embedded or anchored in it or attached to its surface." [GOC:vw, PMID:28292899]
+def: "The leaflet the plasma membrane at the cell tip that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [GOC:vw, PMID:28292899]
 is_a: GO:0009898 ! cytoplasmic side of plasma membrane
 relationship: part_of GO:0031520 ! plasma membrane of cell tip
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: hjd
 creation_date: 2019-05-01T17:48:02Z
 
@@ -468182,7 +468684,7 @@
 id: GO:0106329
 name: L-phenylalaine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + L-phenylalanine + O2 = 3-phenylpyruvate + H2O2 + NH4(+)." [RHEA:61240]
+def: "Catalysis of the reaction: H2O + L-phenylalanine + O2 = 3-phenylpyruvate + H2O2 + NH4+." [RHEA:61240]
 xref: RHEA:61240
 is_a: GO:0001716 ! L-amino-acid oxidase activity
 property_value: skos:exactMatch RHEA:61240
@@ -468256,7 +468758,7 @@
 id: GO:0106335
 name: tRNA (5-carboxymethyluridine(34)-5-O)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-(carboxymethyl)uridine34 in tRNA + S-adenosyl-L-methionine = 5-(2-methoxy-2-oxoethyl)uridine34 in tRNA + S-adenosyl-L-homocysteine." [PMID:20123966, RHEA:43208]
+def: "Catalysis of the reaction: 5-(carboxymethyl)uridine34 in tRNA + S-adenosyl-L-methionine = 5-(2-methoxy-2-oxoethyl)uridine34 in tRNA + S-adenosyl-L-homocysteine. The methylation occurs on the modified base." [PMID:20123966, RHEA:43208]
 xref: EC:2.1.1.229
 xref: RHEA:43208
 is_a: GO:0016300 ! tRNA (uridine) methyltransferase activity
@@ -468280,10 +468782,11 @@
 
 [Term]
 id: GO:0106339
-name: tRNA (cytidine(32)-2'-O)-methyltransferase activity
+name: tRNA (cytidine(32)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: cytidine(32) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(32) in tRNA + S-adenosyl-L-homocysteine + H+." [PMID:25404562, RHEA:42932]
 synonym: "tRNA (cytidine 32-2'-O)-methyltransferase activity" EXACT []
+synonym: "tRNA (cytidine(32)-2'-O)-methyltransferase activity" EXACT []
 xref: MetaCyc:RXN-11866
 xref: RHEA:42932
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
@@ -468302,12 +468805,15 @@
 
 [Term]
 id: GO:0106340
-name: tRNA (guanosine(34)-2'-O)-methyltransferase activity
+name: tRNA (guanosine(34)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanosine(34) in tRNA + S-adenosyl-L-methionine = 2'-O-methylguanosine(34) in tRNA + H+ + S-adenosyl-L-homocysteine." [PMID:31943105]
+def: "Catalysis of the reaction: guanosine(34) in tRNA + S-adenosyl-L-methionine = 2'-O-methylguanosine(34) in tRNA + H+ + S-adenosyl-L-homocysteine." [PMID:31943105, RHEA:85171]
+synonym: "tRNA (guanosine(34)-2'-O)-methyltransferase activity" EXACT []
 xref: Reactome:R-HSA-9024161 "FTSJ1 2'-O-methylates guanosine-34 in tRNA(Phe)"
+xref: RHEA:85171
 is_a: GO:0016423 ! tRNA (guanine) methyltransferase activity
 property_value: skos:broadMatch EC:2.1.1.205
+property_value: skos:exactMatch RHEA:85171
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25257" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26085" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26086" xsd:anyURI
@@ -468389,9 +468895,10 @@
 
 [Term]
 id: GO:0106347
-name: U2 snRNA 2'-O-methyladenosine m6 methyltransferase activity
+name: U2 snRNA (2'-O-methyladenosine-N6)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a 2'-O-methyladenosine in U2 snRNA + S-adenosyl-L-methionine = an N6-methyl-2'-O-methyladenosine in U2 snRNA + S-adenosyl-L-homocysteine + H+." [PMID:31913360, RHEA:62672]
+def: "Catalysis of the reaction: a 2'-O-methyladenosine in U2 snRNA + S-adenosyl-L-methionine = an N6-methyl-2'-O-methyladenosine in U2 snRNA + S-adenosyl-L-homocysteine + H+; methylates the 6th position of adenine residues with a pre-deposited 2'-O-methylation." [PMID:31913360, RHEA:62672]
+synonym: "U2 snRNA (2'-O-methyladenosine) m6 methyltransferase activity" EXACT []
 xref: RHEA:62672
 is_a: GO:0106346 ! snRNA methyltransferase activity
 property_value: skos:exactMatch RHEA:62672
@@ -468401,9 +468908,11 @@
 
 [Term]
 id: GO:0106348
-name: U2 snRNA adenosine m6 methyltransferase activity
+name: U2 snRNA (adenine-N6)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a adenosine in U2 snRNA + S-adenosyl-L-methionine = an N6-methyl-adenosine in U2 snRNA + S-adenosyl-L-homocysteine + H+." [PMID:32637152]
+synonym: "U2 snRNA adenosine m6 methyltransferase activity" EXACT []
+synonym: "U2 snRNA adenosine N6 methyltransferase activity" EXACT []
 is_a: GO:0106346 ! snRNA methyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27392" xsd:anyURI
 created_by: hjd
@@ -469851,11 +470360,14 @@
 
 [Term]
 id: GO:0110035
-name: rDNA spacer replication fork barrier binding, bending
+name: obsolete rDNA spacer replication fork barrier binding, bending
 namespace: molecular_function
-def: "The activity of binding selectively, and in a sequence-specific manner, a replication fork barrier found in rDNA spacers, and distorting the original structure of DNA, typically a straight helix, into a bend, or increasing the bend if the original structure was intrinsically bent due to its sequence." [GOC:al, GOC:vw, PMID:27035982]
-is_a: GO:0043110 ! rDNA spacer replication fork barrier binding
-is_a: GO:0044374 ! sequence-specific DNA binding, bending
+def: "OBSOLETE. The activity of binding selectively, and in a sequence-specific manner, a replication fork barrier found in rDNA spacers, and distorting the original structure of DNA, typically a straight helix, into a bend, or increasing the bend if the original structure was intrinsically bent due to its sequence." [GOC:al, GOC:vw, PMID:27035982]
+comment: This term was obsoleted because it is precomposed.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31529" xsd:anyURI
+is_obsolete: true
+consider: GO:0008301
+consider: GO:0043110
 created_by: kmv
 creation_date: 2017-07-17T21:09:50Z
 
@@ -471502,13 +472014,15 @@
 namespace: molecular_function
 def: "Removes a lipid from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle. This results in intermembrane transfer of lipids." [GOC:krc, PMID:20823909, PMID:24220498, PMID:25797198]
 synonym: "intermembrane lipid transfer activity" EXACT []
-synonym: "lipid carrier activity" EXACT []
+synonym: "lipid carrier activity" BROAD []
 xref: Reactome:R-HSA-9856502 "mito-STARD7 transports Q10 to outer mitochondrial membrane"
 xref: Reactome:R-HSA-9856510 "STARD7 transports Q10 to plasma membrane"
-is_a: GO:0005319 ! lipid transporter activity
+is_a: GO:0005215 ! transporter activity
+is_a: GO:0005319 ! lipid carrier activity
 relationship: part_of GO:0120009 ! intermembrane lipid transfer
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17648" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 created_by: krc
 creation_date: 2017-03-17T03:17:29Z
 
@@ -471519,9 +472033,9 @@
 def: "Removes a phospholipid from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle." [GOC:krc, PMID:20823909, PMID:24220498, PMID:25797198]
 synonym: "intermembrane phospholipid transfer activity" NARROW []
 synonym: "phospholipid carrier activity" EXACT []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0120013 ! lipid transfer activity
 relationship: has_part GO:0005543 ! phospholipid binding
+relationship: part_of GO:0015914 ! phospholipid transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
 created_by: krc
 creation_date: 2017-03-17T03:34:17Z
@@ -471550,7 +472064,6 @@
 def: "Removes a sphingolipid from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle." [GOC:krc, PMID:20823909, PMID:24220498, PMID:25797198]
 synonym: "intermembrane sphingolipid transfer activity" NARROW []
 synonym: "sphingolipid carrier activity" NARROW []
-is_a: GO:0046624 ! sphingolipid transporter activity
 is_a: GO:0120013 ! lipid transfer activity
 relationship: has_part GO:0046625 ! sphingolipid binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
@@ -471582,7 +472095,6 @@
 xref: Reactome:R-HSA-1483087 "PI is exchanged with PC by PITPNB"
 xref: Reactome:R-HSA-1483211 "PC:PITPNB is transported from the Golgi membrane to the ER membrane"
 xref: Reactome:R-HSA-1483219 "PC is exchanged with PI by PITPNB"
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
 is_a: GO:0120014 ! phospholipid transfer activity
 relationship: has_part GO:0031210 ! phosphatidylcholine binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
@@ -471923,9 +472435,10 @@
 
 [Term]
 id: GO:0120048
-name: U6 snRNA (adenine-(43)-N(6))-methyltransferase activity
+name: U6 snRNA (adenine(43)-N6)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: adenosine in U6 snRNA + S-adenosyl-L-methionine = H+ + N(6)-methyladenosine in U6 snRNA + S-adenosyl-L-homocysteine." [PMID:28525753, PMID:32266935, RHEA:52808]
+synonym: "U6 snRNA m(6)A methyltransferase activity" EXACT []
 xref: EC:2.1.1.346
 xref: MetaCyc:RXN-18779
 xref: RHEA:52808
@@ -474366,7 +474879,7 @@
 id: GO:0120242
 name: 2-iminobutanoate deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-iminobutanoate + H2O = 2-oxobutanoate + NH4(+)." [RHEA:39975]
+def: "Catalysis of the reaction: 2-iminobutanoate + H2O = 2-oxobutanoate + NH4+." [RHEA:39975]
 synonym: "2-iminobutanoate/2-iminopropanoate deaminase" BROAD [EC:3.5.99.10]
 xref: KEGG_REACTION:R11098
 xref: MetaCyc:RXN-15123
@@ -474382,7 +474895,7 @@
 id: GO:0120243
 name: 2-iminopropanoate deaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-iminopropanoate + H2O = NH4(+) + pyruvate." [RHEA:40671]
+def: "Catalysis of the reaction: 2-iminopropanoate + H2O = NH4+ + pyruvate." [RHEA:40671]
 synonym: "2-iminobutanoate/2-iminopropanoate deaminase" BROAD [EC:3.5.99.10]
 xref: KEGG_REACTION:R11099
 xref: MetaCyc:RXN-15127
@@ -475114,7 +475627,7 @@
 id: GO:0120294
 name: peptide serotonyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-glutaminyl-[protein] + serotonin = 5-serotonyl-L-glutamyl-[protein] + NH4(+)." [GOC:sp, PMID:14697203]
+def: "Catalysis of the reaction: L-glutaminyl-[protein] + serotonin = 5-serotonyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:14697203]
 xref: RHEA:66552
 is_a: GO:0016410 ! N-acyltransferase activity
 property_value: skos:exactMatch RHEA:66552
@@ -475127,7 +475640,7 @@
 id: GO:0120295
 name: histone serotonyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-glutaminyl-[histone] + serotonin = 5-serotonyl-L-glutamyl-[histone] + NH4(+)." [GOC:sp, PMID:30867594]
+def: "Catalysis of the reaction: L-glutaminyl-[histone] + serotonin = 5-serotonyl-L-glutamyl-[histone] + NH4+." [GOC:sp, PMID:30867594]
 is_a: GO:0120294 ! peptide serotonyltransferase activity
 is_a: GO:0140993 ! histone modifying activity
 property_value: skos:broadMatch RHEA:66552
@@ -475140,7 +475653,7 @@
 id: GO:0120296
 name: peptide dopaminyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dopamine + L-glutaminyl-[protein] = 5-dopaminyl-L-glutamyl-[protein] + NH4(+)." [GOC:sp, PMID:22858378, PMID:32273471]
+def: "Catalysis of the reaction: dopamine + L-glutaminyl-[protein] = 5-dopaminyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378, PMID:32273471]
 xref: RHEA:66556
 is_a: GO:0016410 ! N-acyltransferase activity
 property_value: skos:exactMatch RHEA:66556
@@ -475153,7 +475666,7 @@
 id: GO:0120297
 name: histone dopaminyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dopamine + L-glutaminyl-[histone] = 5-dopaminyl-L-glutamyl-[histone] + NH4(+)." [GOC:sp, PMID:32273471]
+def: "Catalysis of the reaction: dopamine + L-glutaminyl-[histone] = 5-dopaminyl-L-glutamyl-[histone] + NH4+." [GOC:sp, PMID:32273471]
 is_a: GO:0120296 ! peptide dopaminyltransferase activity
 is_a: GO:0140993 ! histone modifying activity
 property_value: skos:broadMatch RHEA:66556
@@ -475166,7 +475679,7 @@
 id: GO:0120298
 name: peptide noradrenalinyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (R)-noradrenaline + L-glutaminyl-[protein] = 5-(R)-noradrenalinyl-L-glutamyl-[protein] + NH4(+)." [GOC:sp, PMID:22858378]
+def: "Catalysis of the reaction: (R)-noradrenaline + L-glutaminyl-[protein] = 5-(R)-noradrenalinyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378]
 xref: RHEA:66560
 is_a: GO:0016410 ! N-acyltransferase activity
 property_value: skos:exactMatch RHEA:66560
@@ -476527,15 +477040,17 @@
 
 [Term]
 id: GO:0120554
-name: 2-aminobutanoate transaminase activity
+name: (2S)-2-aminobutanoate:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: (2S)-2-aminobutanoate + 2-oxoglutarate = 2-oxobutanoate + L-glutamate." [PMID:27827456, RHEA:70223]
+synonym: "2-aminobutanoate transaminase activity" EXACT []
 xref: MetaCyc:RXN-20408
 xref: RHEA:70223
 is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch MetaCyc:RXN-20408
 property_value: skos:exactMatch RHEA:70223
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30260" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: sjm
 creation_date: 2025-05-15T14:38:07Z
 
@@ -477576,7 +478091,7 @@
 id: GO:0140070
 name: hydrogen peroxide channel activity
 namespace: molecular_function
-def: "Enables the energy-independent facilitated diffusion of hydrogen peroxide through a transmembrane aqueous pore or channel." [PMID:23541115, PMID:27256569]
+def: "Enables the energy-independent facilitated diffusion of H2O2 through a transmembrane aqueous pore or channel." [PMID:23541115, PMID:27256569]
 synonym: "hydrogen peroxide transmembrane transporter activity" RELATED []
 is_a: GO:0015267 ! channel activity
 relationship: part_of GO:0080170 ! hydrogen peroxide transmembrane transport
@@ -477757,11 +478272,12 @@
 id: GO:0140085
 name: L-amino-acid N-acetyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + a L-amino acid = CoA + an N-acetyl-L-amino-acid. In some cases acetyl phosphate can be used as a donor." [GOC:pg, RHEA:83863]
+def: "Catalysis of the reaction: acetyl-CoA + a L-amino acid = CoA + an N-acetyl-L-amino-acid. In some cases other acetyl containing molecules can be used as donor." [GOC:pg, RHEA:83863]
 xref: RHEA:83863
-is_a: GO:0008080 ! N-acetyltransferase activity
-property_value: skos:exactMatch RHEA:83863
+is_a: GO:0140379 ! amino acid acyltransferase activity
+property_value: skos:narrowMatch RHEA:83863
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29604" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 created_by: pg
 creation_date: 2025-01-24T10:40:36Z
 
@@ -478875,10 +479391,11 @@
 id: GO:0140178
 name: lumenal side of cis-Golgi network membrane
 namespace: cellular_component
-def: "The membrane leaflet of the cis-Golgi network directly contacts the Golgi lumen and may be involved in glycosylation, cargo sorting, or interactions with resident Golgi proteins." [PMID:1747103, PMID:29802621, PMID:34080016]
+def: "The leaflet of the cis-Golgi network membrane directly contacts the Golgi lumen, including any protein embedded in, attached to, or peripherally associated with it. This is the site where glycosylation, cargo sorting, or interactions with resident Golgi proteins occur." [PMID:1747103, PMID:29802621, PMID:34080016]
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0033106 ! cis-Golgi network membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30389" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: pg
 creation_date: 2025-06-05T08:47:14Z
 
@@ -478886,10 +479403,11 @@
 id: GO:0140179
 name: cytoplasmic side of cis-Golgi network membrane
 namespace: cellular_component
-def: "The leaflet of the membrane bilayer of the cis-Golgi network faces the cytoplasm and is where interactions with cytosolic proteins occur, including those for vesicle tethering, fusion, and Golgi-associated trafficking activities." [PMID:1747103, PMID:23913272, PMID:34080016, PMID:34597626]
+def: "The leaflet of the cis-Golgi network membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it. This is the site of interactions with cytosolic proteins, including those for vesicle tethering, fusion, and Golgi-associated trafficking activities." [PMID:1747103, PMID:23913272, PMID:34080016, PMID:34597626]
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0033106 ! cis-Golgi network membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: pg
 creation_date: 2025-06-05T08:50:47Z
 
@@ -478898,8 +479416,9 @@
 name: centriole scaffold activity
 namespace: molecular_function
 def: "The binding activity of a protein that contributes to the stable formation of a centriole by forming persistent structures, or templates, upon which other centriolar proteins assemble." [PMID:29784964, PMID:32956907, PMID:34702818]
-is_a: GO:0030674 ! protein-macromolecule adaptor activity
+is_a: GO:0140378 ! protein complex scaffold activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30443" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31499" xsd:anyURI
 created_by: pg
 creation_date: 2025-06-11T13:59:35Z
 
@@ -480451,15 +480970,18 @@
 
 [Term]
 id: GO:0140303
-name: intramembrane lipid transporter activity
+name: intramembrane lipid carrier activity
 namespace: molecular_function
 def: "Enables the transport of a lipid from a region of a membrane to a different region on the same membrane." [PMID:16828084]
 synonym: "flippase activity" RELATED []
+synonym: "intramembrane lipid transporter activity" BROAD []
 synonym: "translocase activity" BROAD []
-is_a: GO:0005319 ! lipid transporter activity
+is_a: GO:0005215 ! transporter activity
+is_a: GO:0005319 ! lipid carrier activity
 relationship: part_of GO:0034204 ! lipid translocation
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17648" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19477" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 created_by: pg
 creation_date: 2019-03-01T20:14:09Z
 
@@ -480726,7 +481248,11 @@
 name: lysophospholipase C activity
 namespace: molecular_function
 def: "Hydrolysis of a lysoglycerophospholipid at the first phosphodiester bond between the phosphate and glycerol." [PMID:32917725]
+xref: RHEA:86375
+xref: RHEA:86379
 is_a: GO:0004629 ! C-type glycerophospholipase activity
+property_value: skos:narrowMatch RHEA:86375
+property_value: skos:narrowMatch RHEA:86379
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30949" xsd:anyURI
 created_by: pg
 creation_date: 2025-11-10T12:35:51Z
@@ -480747,12 +481273,13 @@
 
 [Term]
 id: GO:0140326
-name: ATPase-coupled intramembrane lipid transporter activity
+name: ATPase-coupled intramembrane lipid carrier activity
 namespace: molecular_function
 alt_id: GO:0004012
 alt_id: GO:0008557
 def: "Catalysis of the movement of lipids from one membrane leaflet to the other, driven by ATP hydrolysis. This includes flippases and floppases." [PMID:16828084]
 synonym: "aminophospholipid-transporting ATPase" RELATED []
+synonym: "ATPase-coupled intramembrane lipid transporter activity" BROAD []
 synonym: "ATPase-coupled phospholipid transporter activity" RELATED []
 synonym: "ATPase-dependent phospholipid transporter activity" RELATED []
 synonym: "phospholipid flippase activity" NARROW []
@@ -480763,7 +481290,7 @@
 xref: MetaCyc:3.6.3.1-RXN
 xref: Reactome:R-HSA-939763 "P-type ATPases type IV transport external-facing APLs to internal side of the plasma membrane"
 xref: Reactome:R-HSA-947591 "P-type ATPases type IV transport internal-facing APLs to external side of the plasma membrane"
-is_a: GO:0140303 ! intramembrane lipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
 is_a: GO:0140657 ! ATP-dependent activity
 property_value: skos:broadMatch RHEA:66132
 property_value: skos:exactMatch EC:7.6.2.1
@@ -480781,7 +481308,7 @@
 def: "Catalysis of the movement of lipids from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:20043909, PMID:25284293, Wikipedia:Flippase]
 comment: Nomenclature note. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases). Scramblases are ATP-independent, non-selective, inducing non-specific transbilayer movements across the membrane. The direction of the translocation should be taken into account for annotation (from the exoplasmic to the cytosolic leaflet of a membrane).
 synonym: "flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0140326 ! ATPase-coupled intramembrane lipid transporter activity
+is_a: GO:0140326 ! ATPase-coupled intramembrane lipid carrier activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
 creation_date: 2019-04-29T12:51:21Z
@@ -480793,7 +481320,7 @@
 def: "Catalysis of the movement of a lipid from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:20043909, PMID:25284293, Wikipedia:Flippase]
 comment: Nomenclature note. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases). Scramblases are ATP-independent, non-selective, inducing non-specific transbilayer movements across the membrane. The direction of the translocation should be taken into account for annotation (from the cytosolic to the exoplasmic leaflet of a membrane).
 synonym: "floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
-is_a: GO:0140326 ! ATPase-coupled intramembrane lipid transporter activity
+is_a: GO:0140326 ! ATPase-coupled intramembrane lipid carrier activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
 creation_date: 2019-04-29T12:58:53Z
@@ -480849,7 +481376,6 @@
 namespace: molecular_function
 def: "Catalysis of the movement of a glycerophospholipid from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:26212235]
 synonym: "glycerophospholipid flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0140327 ! flippase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -480874,7 +481400,9 @@
 synonym: "glycoprotein phospholipase C activity" EXACT []
 synonym: "glycosylphosphatidyl inositol-anchor protein phospholipase C activity" EXACT []
 synonym: "GPI-PLC activity" EXACT []
+xref: RHEA:86259
 is_a: GO:0004629 ! C-type glycerophospholipase activity
+property_value: skos:narrowMatch RHEA:86259
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28868" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31078" xsd:anyURI
 created_by: pg
@@ -480945,7 +481473,6 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phosphatidylethanolamine from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:10029989]
 synonym: "phosphatidylethanolamine floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0140328 ! floppase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -480987,7 +481514,7 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phosphatidylcholine from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:11870854]
 synonym: "phosphatidylcholine flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
+is_a: GO:0008525 ! phosphatidylcholine intramembrane carrier activity
 is_a: GO:0140333 ! glycerophospholipid flippase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -481063,7 +481590,7 @@
 synonym: "glucosylceramide flippase activity" NARROW []
 synonym: "glycoceramide flippase activity" EXACT []
 synonym: "glycosylceramide flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0046624 ! sphingolipid transporter activity
+is_a: GO:0046624 ! sphingolipid intramembrane carrier activity
 is_a: GO:0140327 ! flippase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -481224,7 +481751,7 @@
 namespace: cellular_component
 def: "A ribonucleoprotein granule located in the cytoplasm and the nucleus. GW-bodies minimally contain the Argonaute2 (Ago2) and TNRC6B proteins, together with specific target RNAs." [PMID:16418578, PMID:26930655, PMID:29576456]
 synonym: "GW-body" EXACT []
-is_a: GO:0036464 ! cytoplasmic ribonucleoprotein granule
+is_a: GO:0035770 ! ribonucleoprotein granule
 created_by: pg
 creation_date: 2019-07-25T19:26:48Z
 
@@ -481297,8 +481824,10 @@
 name: ornithine lipid biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of ornithine lipids, any of a class of phosphorus-free bacterial membrane lipids with an L-ornithine-derived head group." [PMID:22724388]
+xref: MetaCyc:PWY-6818
 is_a: GO:0008652 ! amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31271" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
 created_by: pg
 creation_date: 2026-01-20T12:30:41Z
 
@@ -481368,6 +481897,29 @@
 creation_date: 2026-01-21T10:01:05Z
 
 [Term]
+id: GO:0140378
+name: protein complex scaffold activity
+namespace: molecular_function
+def: "A structural molecule activity of a protein-containing complex component that serves to hold the complex together. Protein complex scaffolds are integral members of complexes." [PMID:41298522]
+synonym: "protein-complex scaffolding activity" EXACT []
+synonym: "protein-containing complex scaffold activity" EXACT []
+is_a: GO:0005198 ! structural molecule activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31444" xsd:anyURI
+created_by: pg
+creation_date: 2026-02-02T08:05:02Z
+
+[Term]
+id: GO:0140379
+name: amino acid acyltransferase activity
+namespace: molecular_function
+def: "Catalysis of the transfer of an acyl group to an acceptor group on a free amino acid, usually using acetyl-CoA as donor." [GOC:curators]
+synonym: "amino acid N-acetyltransferase activity" NARROW []
+is_a: GO:0016746 ! acyltransferase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
+created_by: pg
+creation_date: 2026-02-02T11:14:33Z
+
+[Term]
 id: GO:0140380
 name: psilocybin biosynthetic process
 namespace: biological_process
@@ -481443,6 +481995,35 @@
 creation_date: 2019-11-20T13:25:55Z
 
 [Term]
+id: GO:0140385
+name: amino acid transaminase activity
+namespace: molecular_function
+def: "Transfer of an amino group from an amino acid to an acceptor, usually a 2-oxo acid." [GOC:curators]
+is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
+created_by: pg
+creation_date: 2026-02-02T13:30:09Z
+
+[Term]
+id: GO:0140386
+name: tRNA (cytidine(4)/adenine(4)-2'-O-ribose)-methyltransferase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: cytidine(4) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(4) in tRNA + S-adenosyl-L-homocysteine + H+. Acts on  cytidine(4) on tRNAPro and tRNAGly(GCC), and on adenosine(4) in tRNAHis." [EC:2.1.1.225, PMID:17242307]
+xref: EC:2.1.1.225
+xref: RHEA:32767
+xref: RHEA:43192
+xref: RHEA:43196
+is_a: GO:0016426 ! tRNA (adenine) methyltransferase activity
+is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
+property_value: skos:exactMatch EC:2.1.1.225
+property_value: skos:narrowMatch RHEA:32767
+property_value: skos:narrowMatch RHEA:43192
+property_value: skos:narrowMatch RHEA:43196
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31521" xsd:anyURI
+created_by: pg
+creation_date: 2026-02-06T12:44:45Z
+
+[Term]
 id: GO:0140393
 name: norsolorinic acid ketoreductase activity
 namespace: molecular_function
@@ -485352,7 +485933,7 @@
 id: GO:0140740
 name: ADP-riboxanase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-arginyl-[protein] + NAD+ = ADP-riboxanated L-argininyl-[protein] + H+ + NH4(+) + nicotinamide." [PMID:34671164, RHEA:69500]
+def: "Catalysis of the reaction: L-arginyl-[protein] + NAD+ = ADP-riboxanated L-argininyl-[protein] + H+ + NH4+ + nicotinamide." [PMID:34671164, RHEA:69500]
 comment: Note that this activity has two steps: a transfer of an ADP-ribose group, followed by the elimination of an ammonia group.
 xref: RHEA:69500
 xref: RHEA:75883
@@ -485588,14 +486169,16 @@
 id: GO:0140759
 name: histone H3K56 methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: S-adenosyl-L-methionine + histone H3 L-lysine (position 56) = S-adenosyl-L-homocysteine + histone H3 N6-methyl-L-lysine (position 56). This reaction is the addition of a methyl group to the lysine residue at position 56 of the histone H3 protein." [PMID:23451023, PMID:28743002]
+def: "Catalysis of the reaction: S-adenosyl-L-methionine + histone H3 L-lysine (position 56) = S-adenosyl-L-homocysteine + histone H3 N6-methyl-L-lysine (position 56). This reaction is the addition of a methyl group to the lysine residue at position 56 of the histone H3 protein." [PMID:23451023, PMID:28743002, RHEA:85519]
 comment: Comment: Note that the residue position corresponds to the canonical human H3 histone (UniProtKB:P84243); this residue is conserved across all eukaryotes. Residue 1 is the first residue following removal of the initiating Methionine (Met). Note that each histone is encoded by multiple genes, and sequences may vary across different genes within an organism.
 synonym: "histone H3K56 methylase activity" EXACT []
 synonym: "histone lysine N-methyltransferase activity (H3-K56 specific)" EXACT []
 synonym: "histone methyltransferase activity (H3-K56 specific)" EXACT []
 synonym: "histone-H3K56 methyltransferase activity" EXACT []
+xref: RHEA:85519
 is_a: GO:0016279 ! protein-lysine N-methyltransferase activity
 is_a: GO:0140938 ! histone H3 methyltransferase activity
+property_value: skos:exactMatch RHEA:85519
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22757" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24337" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
@@ -485615,8 +486198,12 @@
 synonym: "histone H3-tri/dimethyl-lysine-56 demethylase activity" EXACT []
 synonym: "histone H3K56me2 demethylase activity" RELATED []
 synonym: "histone H3K56me3 demethylase activity" RELATED []
+xref: RHEA:85927
+xref: RHEA:85931
 is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
 is_a: GO:0141052 ! histone H3 demethylase activity
+property_value: skos:narrowMatch RHEA:85927
+property_value: skos:narrowMatch RHEA:85931
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22757" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29636" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30578" xsd:anyURI
@@ -486533,6 +487120,7 @@
 name: lactoperoxidase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2 a phenolic donor + H2O2 = 2 a phenolic radical donor + 2 H2O." [PMID:19339248, RHEA:56136]
+synonym: "heme peroxidase activity" RELATED []
 synonym: "peroxidase activity" BROAD []
 xref: EC:1.11.1.7
 xref: MetaCyc:PEROXID-RXN
@@ -490117,10 +490705,11 @@
 
 [Term]
 id: GO:0141098
-name: tRNA (cytidine(34)-2'-O)-methyltransferase activity
+name: tRNA (cytidine(34)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: cytidine(34) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(34) in tRNA + H+ + S-adenosyl-L-homocysteine." [PMID:31943105, RHEA:43084]
 synonym: "tRNA (cytidine 34-2'-O)-methyltransferase activity" EXACT []
+synonym: "tRNA (cytidine(34)-2'-O)-methyltransferase activity" EXACT []
 xref: MetaCyc:RXN-11860
 xref: RHEA:43084
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
@@ -490134,9 +490723,10 @@
 
 [Term]
 id: GO:0141100
-name: tRNA (guanine(18)-2'-O)-methyltransferase activity
+name: tRNA (guanine(18)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + guanosine 18 in tRNA= S-adenosyl-L-homocysteine + 2'-O-methylguanosine 18 in tRNA + H+." [PMID:25404562]
+synonym: "tRNA (guanine(18)-2'-O-)-methyltransferase activity" EXACT []
 synonym: "tRNA (guanosine(18)-2'-O)-methyltransferase activity" EXACT []
 xref: EC:2.1.1.34
 xref: MetaCyc:2.1.1.34-RXN
@@ -490151,10 +490741,11 @@
 
 [Term]
 id: GO:0141101
-name: tRNA(Ser) (uridine(44)-2'-O-)-methyltransferase activity
+name: tRNA(Ser) (uridine(44)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: Catalysis of the reaction: S-adenosyl-L-methionine + uridine44 in tRNASer = 2'-O-methyluridine44 in tRNASer + H+ + S-adenosyl-L-homocysteine." [PMID:18025252, RHEA:43100]
 synonym: "tRNA(Ser) (uracil(44)-2'-O-)-methyltransferase activity" EXACT []
+synonym: "tRNA(Ser) (uridine(44)-2'-O-)-methyltransferase activity" EXACT []
 xref: EC:2.1.1.211
 xref: MetaCyc:RXN-12368
 xref: Reactome:R-HSA-6788707 "TRMT44 2'-O-methylates uridine-44 in tRNA(Ser)"
@@ -490169,9 +490760,10 @@
 
 [Term]
 id: GO:0141102
-name: tRNA (5-carboxymethylaminomethyluridine(34)-2'-O)-methyltransferase activity
+name: tRNA (5-carboxymethylaminomethyluridine(34)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 5-carboxymethylaminomethyluridine34 in tRNA(Leu) + S-adenosyl-L-methionine = 5-carboxymethylaminomethyl-2'-O-methyluridine34 in tRNA(Leu) + H+ + S-adenosyl-L-homocysteine." [PMID:20855540, RHEA:43088]
+synonym: "tRNA (5-carboxymethylaminomethyluridine(34)-2'-O)-methyltransferase activity" EXACT []
 synonym: "tRNA (cytidine(34)/5-carboxymethylaminomethyluridine(34)-2'-O)- methyltransferase activity" EXACT []
 xref: RHEA:43088
 is_a: GO:0016300 ! tRNA (uridine) methyltransferase activity
@@ -492485,9 +493077,10 @@
 id: GO:0150103
 name: reactive gliosis
 namespace: biological_process
-def: "A neuroinflammatory response, occurring over several days, during which glial cells undergo nonspecific reactive changes in response to damage to the central nervous system (CNS); typically involves the proliferation or hypertrophy of different types of glial cells." [GOC:aruk, GOC:bc, PMID:24462092]
+def: "A coordinated response of central nervous system (CNS) glial cells-including astrocytes, microglia, and NG2 glia-to injury, infection, or disease, characterized by changes in gene expression, morphology, proliferation, and extracellular matrix production. Reactive gliosis can range from transient glial activation to the formation of a persistent glial scar border." [GOC:aruk, GOC:bc, PMID:20012068, PMID:24267886, PMID:24462092, PMID:27049947]
 synonym: "gliosis" BROAD []
 is_a: GO:0150076 ! neuroinflammatory response
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30886" xsd:anyURI
 created_by: bc
 creation_date: 2019-05-21T12:37:31Z
 
@@ -493982,8 +494575,9 @@
 def: "The binding activity of a molecule that brings together an ubiquitin ligase and an ubiquitin ligase-substrate adaptor, permitting those molecules to function in a coordinated way." [PMID:27664236]
 synonym: "core protein activity for the CUL-RING ubiquitin ligase complex" NARROW []
 synonym: "core protein activity for the Cullin-RING ubiquitin ligase complex" NARROW []
-is_a: GO:0030674 ! protein-macromolecule adaptor activity
+is_a: GO:0140378 ! protein complex scaffold activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24591" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31499" xsd:anyURI
 created_by: rynl
 creation_date: 2022-12-21T22:41:32Z
 
@@ -495564,10 +496158,11 @@
 
 [Term]
 id: GO:0160206
-name: tRNA (cytidine(32)/uridine(32)-2'-O)-methyltransferase activity
+name: tRNA (cytidine(32)/uridine(32)-2'-O-ribose)-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: cytidine(32)/uridine(32) in tRNA + S-adenosyl-L-methionine = 2'-O-methylcytidine(32)/2'-O-methyluridine(32) in tRNA + H+ + S-adenosyl-L-homocysteine." [EC:2.1.1.200]
 synonym: "TrMet(Xm32) activity" EXACT []
+synonym: "tRNA (cytidine(32)/uridine(32)-2'-O)-methyltransferase activity" EXACT []
 xref: EC:2.1.1.200
 xref: RHEA:42936
 is_a: GO:0016300 ! tRNA (uridine) methyltransferase activity
@@ -496358,9 +496953,11 @@
 id: GO:0160272
 name: RNA 2',3'-cyclic phosphatase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a 3'-end 2',3'-cyclophospho-ribonucleotide-RNA + 2 H2O = a 3'-end ribonucleotide-RNA + phosphate + H+." [PMID:32732418]
+def: "Catalysis of the reaction: a 3'-end 2',3'-cyclophospho-ribonucleotide-RNA + 2 H2O = a 3'-end ribonucleotide-RNA + phosphate + H+." [PMID:32732418, RHEA:85011]
+xref: RHEA:85011
 is_a: GO:0016791 ! phosphatase activity
 is_a: GO:0140098 ! catalytic activity, acting on RNA
+property_value: skos:exactMatch RHEA:85011
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28001" xsd:anyURI
 created_by: rynl
 creation_date: 2025-05-28T05:44:27Z
@@ -496369,11 +496966,13 @@
 id: GO:0160273
 name: RNA 2'-phosphatase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H2O + a 3'-end 2'-phospho-ribonucleotide-RNA = a 3'-end ribonucleotide-RNA + phosphate." [PMID:36180430]
+def: "Catalysis of the reaction: H2O + a 3'-end 2'-phospho-ribonucleotide-RNA = a 3'-end ribonucleotide-RNA + phosphate." [PMID:36180430, RHEA:85191]
 synonym: "Ribonucleic acid 2'-phosphatase activity" EXACT []
 synonym: "RNA 2'-Pase activity" EXACT []
+xref: RHEA:85191
 is_a: GO:0016791 ! phosphatase activity
 is_a: GO:0140098 ! catalytic activity, acting on RNA
+property_value: skos:exactMatch RHEA:85191
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28002" xsd:anyURI
 created_by: rynl
 creation_date: 2025-05-28T16:38:49Z
@@ -496420,12 +497019,13 @@
 id: GO:0160277
 name: lumenal side of cis-Golgi cisternae membrane
 namespace: cellular_component
-def: "The membrane leaflet of the cis-Golgi cisternae membrane that faces the Golgi lumen and is involved in glycosylation and lumen-facing cargo recognition." [PMID:23913272, PMID:34597626]
+def: "The leaflet of the cis-Golgi cisternae membrane that faces the Golgi lumen, including any protein embedded in, attached to, or peripherally associated with it. This is the site where glycosylation and lumen-facing cargo recognition occur." [PMID:23913272, PMID:34597626]
 synonym: "lumenal face of cis-Golgi cisternae membrane" EXACT []
 synonym: "lumenal leaflet of cis-Golgi cisternae membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:1990674 ! Golgi cis cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-21T00:29:16Z
 
@@ -496433,12 +497033,13 @@
 id: GO:0160278
 name: cytoplasmic side of cis-Golgi cisternae membrane
 namespace: cellular_component
-def: "The membrane leaflet of the cis-Golgi cisternae membrane that faces the cytoplasm and is the site of interactions with cytosolic proteins, including those involved in vesicle budding, membrane tethering, and lipid or protein trafficking." [PMID:10922460, PMID:34597626, PMID:39331042]
+def: "The leaflet of the cis-Golgi cisternae membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it. This is the site of interactions with cytosolic proteins, including those involved in vesicle budding, membrane tethering, and lipid or protein trafficking." [PMID:10922460, PMID:34597626, PMID:39331042]
 synonym: "cytoplasmic face of cis-Golgi cisternae membrane" EXACT []
 synonym: "cytoplasmic leaflet of cis-Golgi cisternae membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:1990674 ! Golgi cis cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30406" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-22T17:19:30Z
 
@@ -496446,12 +497047,13 @@
 id: GO:0160279
 name: cytoplasmic side of medial-Golgi cisterna membrane
 namespace: cellular_component
-def: "The membrane leaflet of the medial-Golgi cisternae that faces the cytoplasm participates in interactions with cytosolic proteins involved in membrane trafficking, vesicle docking, and cargo sorting." [PMID:28777890, PMID:34597626, PMID:39658747]
+def: "The leaflet of the medial-Golgi cisternae membrane that faces the cytoplasm,including any protein embedded in, attached to, or peripherally associated with it. This is the site of interactions with cytosolic proteins involved in membrane trafficking, vesicle docking, and cargo sorting." [PMID:28777890, PMID:34597626, PMID:39658747]
 synonym: "cytoplasmic face of Golgi medial cisterna membrane" EXACT []
 synonym: "cytoplasmic leaflet of Golgi medial cisterna membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:1990675 ! Golgi medial cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30407" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-22T21:12:40Z
 
@@ -496459,12 +497061,13 @@
 id: GO:0160280
 name: lumenal side of medial-Golgi cisterna membrane
 namespace: cellular_component
-def: "The membrane leaflet of the medial-Golgi cisternae that directly contacts the Golgi lumen, hosts glycosyltransferases and enzymes to modify N-linked oligosaccharides by trimming mannose and adding N-acetylglucosamine." [PMID:28777890, PMID:34597626, PMID:36658747, PMID:39331042]
+def: "The leaflet of the medial-Golgi cisternae membrane that faces the Golgi lumen, including any protein embedded in, attached to, or peripherally associated with it. This is the site where protein glycosylation occur." [PMID:28777890, PMID:34597626, PMID:36658747, PMID:39331042]
 synonym: "lumenal face of medial-Golgi cisterna membrane" EXACT []
 synonym: "lumenal leaflet of Golgi medial cisterna membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:1990675 ! Golgi medial cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30418" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-22T21:36:28Z
 
@@ -496472,13 +497075,14 @@
 id: GO:0160281
 name: cytoplasmic side of trans-Golgi network membrane
 namespace: cellular_component
-def: "The leaflet of the membrane bilayer of the trans-Golgi network faces the cytoplasm and is crucial for lipid and protein sorting and trafficking, as it interacts with cytoplasmic proteins involved in vesicle formation and targeting." [PMID:10922460, PMID:23913272, PMID:34597626]
+def: "The leaflet of the trans-Golgi network membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it. This is the site of interaction where cytoplasmic proteins interact with proteins involved in vesicle formation and targeting." [PMID:10922460, PMID:23913272, PMID:34597626]
 synonym: "cytoplasmic face of trans-Golgi network membrane" EXACT []
 synonym: "cytoplasmic leaflet of trans-Golgi network membrane" EXACT []
 synonym: "cytoplasmic side of trans-Golgi network" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:0032588 ! trans-Golgi network membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30427" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-22T23:41:33Z
 
@@ -496486,13 +497090,14 @@
 id: GO:0160282
 name: lumenal side of trans-Golgi network membrane
 namespace: cellular_component
-def: "The membrane leaflet of the trans-Golgi network membrane that faces the Golgi lumen." [PMID:23913272, PMID:34597626, PMID:38307322]
+def: "The leaflet of the trans-Golgi network membrane that faces the Golgi lumen, including any protein embedded in, attached to, or peripherally associated with it." [PMID:23913272, PMID:34597626, PMID:38307322]
 synonym: "lumenal face of trans-Golgi network membrane" EXACT []
 synonym: "lumenal leaflet of trans-Golgi network membrane" EXACT []
 synonym: "lumenal side of trans-Golgi network" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:0032588 ! trans-Golgi network membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30428" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-23T00:11:57Z
 
@@ -496500,9 +497105,11 @@
 id: GO:0160283
 name: queuine transmembrane transporter activity
 namespace: molecular_function
-def: "Enables the transfer of queuine from one side of a membrane to the other according to the reaction: queuine(out) = queuine(in)." [PMID:40526720]
+def: "Enables the transfer of queuine from one side of a membrane to the other according to the reaction: queuine(out) = queuine(in)." [PMID:40526720, RHEA:85679]
+xref: RHEA:85679
 is_a: GO:0022857 ! transmembrane transporter activity
 relationship: part_of GO:0160284 ! queuine import across plasma membrane
+property_value: skos:exactMatch RHEA:85679
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30470" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-24T17:27:38Z
@@ -496522,9 +497129,11 @@
 id: GO:0160286
 name: queuosine transmembrane transporter activity
 namespace: molecular_function
-def: "Enables the transfer of queuosine from one side of a membrane to the other according to the reaction: queuosine(out) = queuosine(in)." [PMID:40526720]
+def: "Enables the transfer of queuosine from one side of a membrane to the other according to the reaction: queuosine(out) = queuosine(in)." [PMID:40526720, RHEA:85683]
+xref: RHEA:85683
 is_a: GO:0005337 ! nucleoside transmembrane transporter activity
 relationship: part_of GO:0160287 ! queuosine import across plasma membrane
+property_value: skos:exactMatch RHEA:85683
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30470" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-27T00:30:53Z
@@ -496544,13 +497153,14 @@
 id: GO:0160288
 name: cytoplasmic side of trans-Golgi cisterna membrane
 namespace: cellular_component
-def: "The membrane leaflet of the trans-Golgi cisternae that faces the cytoplasm. It is the site of protein and lipid interaction, vesicle formation, and cargo sorting towards post-Golgi destinations such as endosomes, lysosomes, and the plasma membrane." [PMID:23913272, PMID:34597626, PMID:37566051]
+def: "The leaflet of the trans-Golgi cisternae membrane that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it. This is the site where vesicle formation, and cargo sorting towards post-Golgi destinations such as endosomes, lysosomes and the plasma membrane occur." [PMID:23913272, PMID:34597626, PMID:37566051]
 synonym: "cytoplasmic face of Golgi trans cisterna membrane" EXACT []
 synonym: "cytoplasmic leaflet of Golgi trans cisterna membrane" EXACT []
 synonym: "cytoplasmic side of Golgi trans cisternae membrane" EXACT []
 is_a: GO:0098562 ! cytoplasmic side of membrane
 relationship: part_of GO:1990676 ! Golgi trans cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30509" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-27T05:51:59Z
 
@@ -496558,13 +497168,14 @@
 id: GO:0160289
 name: lumenal side of trans-Golgi cisternae membrane
 namespace: cellular_component
-def: "The membrane leaflet of the trans-Golgi cisternae membrane that faces the Golgi lumen. It is involved in the final steps of glycan processing, proteolytic modification, and cargo maturation prior to sorting at the trans-Golgi network." [PMID:34597626, PMID:38307322, PMID:6121819]
+def: "The leaflet of the trans-Golgi cisternae membrane that faces the Golgi lumen, including any protein embedded in, attached to, or peripherally associated with it. This is the site where the final steps of glycan processing, proteolytic modification, and cargo maturation prior to sorting at the trans-Golgi network occur." [PMID:34597626, PMID:38307322, PMID:6121819]
 synonym: "lumenal face of trans-Golgi cisternae membrane" EXACT []
 synonym: "lumenal leaflet of trans-Golgi cisternae membrane" EXACT []
 synonym: "lumenal side of Golgi trans cisternae membrane" EXACT []
 is_a: GO:0098576 ! lumenal side of membrane
 relationship: part_of GO:1990676 ! Golgi trans cisterna membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30510" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: rynl
 creation_date: 2025-06-27T06:11:48Z
 
@@ -496584,10 +497195,12 @@
 id: GO:0160291
 name: phosphatidylinositol-4-phosphate-cholesterol exchange activity
 namespace: molecular_function
-def: "Catalysis of the reaction: a 1,2-diacyl-sn-glycero-3-phospho-(1D-myo-inositol 4-phosphate)(out) + cholesterol(in) = 1,2-diacyl-sn-glycero-3-phospho-(1D-myo-inositol 4-phosphate)(in) + cholesterol(out). This reaction results in the exchange of cholesterol for phosphatidylinositol-4-phosphate (PI(4)P) between membranes." [PMID:24209621, PMID:29596003]
+def: "Catalysis of the reaction: a 1,2-diacyl-sn-glycero-3-phospho-(1D-myo-inositol 4-phosphate)(out) + cholesterol(in) = 1,2-diacyl-sn-glycero-3-phospho-(1D-myo-inositol 4-phosphate)(in) + cholesterol(out). This reaction results in the exchange of cholesterol for phosphatidylinositol-4-phosphate (PI(4)P) between membranes." [PMID:24209621, PMID:29596003, RHEA:84179]
+xref: RHEA:84179
 is_a: GO:0008526 ! phosphatidylinositol transfer activity
 is_a: GO:0120020 ! cholesterol transfer activity
 is_a: GO:7770011 ! lipid exchange activity
+property_value: skos:exactMatch RHEA:84179
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30432" xsd:anyURI
 created_by: rynl
@@ -496663,9 +497276,13 @@
 id: GO:0160298
 name: pyridinol guanylyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + GTP + H+ = guanylylpyridinol + diphosphate." [PMID:24249552]
+def: "Catalysis of the reaction: 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + GTP + H+ = guanylylpyridinol + diphosphate." [PMID:24249552, RHEA:85479]
+xref: EC:2.7.7.109
 xref: KEGG_REACTION:R13518
+xref: RHEA:85479
 is_a: GO:0070568 ! guanylyltransferase activity
+property_value: skos:exactMatch EC:2.7.7.109
+property_value: skos:exactMatch RHEA:85479
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30718" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-21T00:46:39Z
@@ -496685,9 +497302,13 @@
 id: GO:0160301
 name: guanylylpyridinol adenylase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanylylpyridinol + ATP + H+ = guanylylpyridinol-AMP + diphosphate." [PMID:25882909]
+def: "Catalysis of the reaction: guanylylpyridinol + ATP + H+ = guanylylpyridinol-AMP + diphosphate." [PMID:25882909, RHEA:85487]
+xref: EC:2.7.7.110
 xref: KEGG_REACTION:R13520
+xref: RHEA:85487
 is_a: GO:0016779 ! nucleotidyltransferase activity
+property_value: skos:exactMatch EC:2.7.7.110
+property_value: skos:exactMatch RHEA:85487
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30720" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-21T22:49:37Z
@@ -496696,9 +497317,11 @@
 id: GO:0160302
 name: 6-carboxymethyl-5-methyl-4-hydroxypyridin-2-ol 3-C-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-carboxymethyl-5-methyl-4-hydroxypyridin-2-ol + S-adenosyl-L-methionine = 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + S-adenosyl-L-homocysteine + H+." [PMID:27391308]
+def: "Catalysis of the reaction: 6-carboxymethyl-5-methyl-4-hydroxypyridin-2-ol + S-adenosyl-L-methionine = 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + S-adenosyl-L-homocysteine + H+." [PMID:27391308, RHEA:85483]
 xref: KEGG_REACTION:R13499
+xref: RHEA:85483
 is_a: GO:0008168 ! methyltransferase activity
+property_value: skos:exactMatch RHEA:85483
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30721" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-21T23:15:13Z
@@ -496721,9 +497344,11 @@
 id: GO:0160304
 name: 4-vinylphenol methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-vinylphenol + S-adenosyl-L-methionine = 4-vinylanisole + S-adenosyl-L-homocysteine + H+." [PMID:40562929]
+def: "Catalysis of the reaction: 4-vinylphenol + S-adenosyl-L-methionine = 4-vinylanisole + S-adenosyl-L-homocysteine + H+." [PMID:40562929, RHEA:86075]
+xref: RHEA:86075
 is_a: GO:0008171 ! O-methyltransferase activity
 is_a: GO:0008757 ! S-adenosylmethionine-dependent methyltransferase activity
+property_value: skos:exactMatch RHEA:86075
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30708" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-23T00:16:21Z
@@ -496890,17 +497515,13 @@
 
 [Term]
 id: GO:0160320
-name: protein-tyrosine iodotransferase activity
+name: obsolete protein-tyrosine iodotransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: [thyroglobulin]-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3-iodo-L-tyrosine + 2 H2O and [thyroglobulin]-3-iodo-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3,5-diiodo-L-tyrosine + 2 H2O." [PMID:36537574, PMID:8651700]
-xref: RHEA:48956
-xref: RHEA:48960
-is_a: GO:0140905 ! haloperoxidase activity
-property_value: skos:narrowMatch RHEA:48956
-property_value: skos:narrowMatch RHEA:48960
+def: "OBSOLETE. Catalysis of the reaction: [thyroglobulin]-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3-iodo-L-tyrosine + 2 H2O and [thyroglobulin]-3-iodo-L-tyrosine + iodide + H2O2 + H+ = [thyroglobulin]-3,5-diiodo-L-tyrosine + 2 H2O." [PMID:36537574, PMID:8651700]
+comment: The reason for obsoletion is that the reactions covered by this term (RHEA:48956 and RHEA:48960) are now subsumed by the updated GO:0004447 (iodide peroxidase activity), which covers all 5 thyroid peroxidase reactions.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30596" xsd:anyURI
-created_by: rynl
-creation_date: 2026-01-21T23:56:40Z
+is_obsolete: true
+replaced_by: GO:0004447
 
 [Term]
 id: GO:0170001
@@ -497278,7 +497899,6 @@
 def: "Enables the transfer of isopentenyl pyrophosphate from one side of a membrane to the other." [GOC:ew, PMID:37813972]
 synonym: "IPP transmembrane transport activity" EXACT []
 synonym: "isopentenyl diphosphate transmembrane transport activity" EXACT []
-is_a: GO:0005548 ! phospholipid transporter activity
 is_a: GO:0015605 ! organophosphate ester transmembrane transporter activity
 is_a: GO:0170055 ! lipid transmembrane transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26285" xsd:anyURI
@@ -497393,7 +498013,6 @@
 namespace: molecular_function
 def: "Enables the transfer of a lipid from one side of a membrane to the other." [GOC:curators]
 subset: gocheck_do_not_annotate
-is_a: GO:0005319 ! lipid transporter activity
 is_a: GO:0022857 ! transmembrane transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27252" xsd:anyURI
 created_by: ew
@@ -497517,9 +498136,7 @@
 def: "The chemical reactions and pathways resulting in the formation of arginine (2-amino-5-guanidinopentanoic acid) via the intermediate compound N-acetyl-L-citrulline." [PMID:16585758]
 synonym: "arginine biosynthesis via N-acetyl intermediates" EXACT []
 synonym: "arginine biosynthesis, N-acetylated pathway" EXACT []
-xref: MetaCyc:PWY-5154
 is_a: GO:0006526 ! L-arginine biosynthetic process
-property_value: skos:exactMatch MetaCyc:PWY-5154
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29602" xsd:anyURI
 created_by: ew
 creation_date: 2025-03-14T17:04:09Z
@@ -497853,7 +498470,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + U6 snRNA = S-adenosyl-L-homocysteine + U6 containing a 3'-terminal 2'-O-methylnucleotide + H+." [PMID:37403782, RHEA:63088]
 xref: RHEA:63088
-is_a: GO:0090486 ! small RNA 2'-O-methyltransferase activity
+is_a: GO:0090486 ! small RNA 2'-O-ribose methyltransferase activity
 property_value: skos:exactMatch RHEA:63088
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25706" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -507294,12 +507911,14 @@
 name: regulation of alcohol catabolic process
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of alcohol catabolic process within a cell." [GOC:TermGenie]
+subset: gocheck_do_not_annotate
 is_a: GO:0009894 ! regulation of catabolic process
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0046164 ! alcohol catabolic process
 relationship: regulates GO:0046164 ! alcohol catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28908" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: krc
 creation_date: 2012-04-20T10:21:18Z
 
@@ -507308,6 +507927,7 @@
 name: negative regulation of alcohol catabolic process
 namespace: biological_process
 def: "Any process that stops, prevents or reduces the frequency, rate or extent of  alcohol catabolic process within a cell." [GOC:TermGenie]
+subset: gocheck_do_not_annotate
 synonym: "down regulation of cellular alcohol catabolic process" EXACT [GOC:TermGenie]
 synonym: "down-regulation of cellular alcohol catabolic process" EXACT [GOC:TermGenie]
 synonym: "downregulation of cellular alcohol catabolic process" EXACT [GOC:TermGenie]
@@ -507318,6 +507938,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0046164 ! alcohol catabolic process
 relationship: negatively_regulates GO:0046164 ! alcohol catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: krc
 creation_date: 2012-04-20T10:21:28Z
 
@@ -507326,6 +507947,7 @@
 name: positive regulation of alcohol catabolic process
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of alcohol catabolic process within a cell." [GOC:TermGenie]
+subset: gocheck_do_not_annotate
 synonym: "activation of cellular alcohol catabolic process" NARROW [GOC:TermGenie]
 synonym: "up regulation of cellular alcohol catabolic process" EXACT [GOC:TermGenie]
 synonym: "up-regulation of cellular alcohol catabolic process" EXACT [GOC:TermGenie]
@@ -507337,6 +507959,7 @@
 intersection_of: positively_regulates GO:0046164 ! alcohol catabolic process
 relationship: positively_regulates GO:0046164 ! alcohol catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28908" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: krc
 creation_date: 2012-04-20T10:21:46Z
 
@@ -515476,14 +516099,15 @@
 
 [Term]
 id: GO:1900829
-name: D-tyrosine catabolic process
+name: obsolete D-tyrosine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-tyrosine." [GOC:TermGenie, PMID:10766779]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of D-tyrosine." [GOC:TermGenie, PMID:10766779]
+comment: This term was obsoleted because there is no evidence that there is a specific pathway to degrade D-tyrosine.
 synonym: "D-tyrosine breakdown" EXACT [GOC:TermGenie]
 synonym: "D-tyrosine catabolism" EXACT [GOC:TermGenie]
 synonym: "D-tyrosine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0009074 ! aromatic amino acid family catabolic process
-is_a: GO:0019478 ! D-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 created_by: se
 creation_date: 2012-06-06T09:27:24Z
 
@@ -515516,14 +516140,15 @@
 
 [Term]
 id: GO:1900832
-name: D-leucine catabolic process
+name: obsolete D-leucine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-leucine." [GOC:TermGenie, PMID:10918062]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of D-leucine." [GOC:TermGenie, PMID:10918062]
+comment: This term was obsoleted because there is no evidence that there is a specific pathway to degrade D-leucine.
 synonym: "D-leucine breakdown" EXACT [GOC:TermGenie]
 synonym: "D-leucine catabolism" EXACT [GOC:TermGenie]
 synonym: "D-leucine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0019478 ! D-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 created_by: se
 creation_date: 2012-06-06T09:37:40Z
 
@@ -519793,16 +520418,15 @@
 
 [Term]
 id: GO:1901053
-name: sarcosine catabolic process
+name: obsolete sarcosine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of sarcosine." [GOC:TermGenie, GOC:yaf, PMID:17951379]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of sarcosine." [GOC:TermGenie, GOC:yaf, PMID:17951379]
+comment: This term was obsoleted because there is no evidence that a specific pathway for sarcosine degradation exists.
 synonym: "sarcosine breakdown" EXACT [GOC:TermGenie]
 synonym: "sarcosine catabolism" EXACT [GOC:TermGenie]
 synonym: "sarcosine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0042219 ! modified amino acid catabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
-is_a: GO:1901052 ! sarcosine metabolic process
-is_a: GO:1901606 ! alpha-amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+is_obsolete: true
 created_by: yaf
 creation_date: 2012-06-28T04:52:29Z
 
@@ -531282,8 +531906,12 @@
 synonym: "L-glutamine biosynthesis" EXACT [GOC:TermGenie]
 synonym: "L-glutamine formation" EXACT [GOC:TermGenie]
 synonym: "L-glutamine synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:GLNSYN-PWY
 is_a: GO:0006541 ! glutamine metabolic process
 is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+property_value: skos:broadMatch MetaCyc:PWY-5505
+property_value: skos:narrowMatch MetaCyc:GLNSYN-PWY
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: pde
 creation_date: 2012-12-13T23:32:52Z
 
@@ -531296,8 +531924,21 @@
 synonym: "L-isoleucine biosynthesis" EXACT [GOC:TermGenie]
 synonym: "L-isoleucine formation" EXACT [GOC:TermGenie]
 synonym: "L-isoleucine synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:ILEUSYN-PWY
+xref: MetaCyc:PWY-5101
+xref: MetaCyc:PWY-5103
+xref: MetaCyc:PWY-5104
+xref: MetaCyc:PWY-5108
+is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
-is_a: GO:0009097 ! isoleucine biosynthetic process
+is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:ILEUSYN-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-5101
+property_value: skos:narrowMatch MetaCyc:PWY-5103
+property_value: skos:narrowMatch MetaCyc:PWY-5104
+property_value: skos:narrowMatch MetaCyc:PWY-5108
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30848" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
 created_by: pde
 creation_date: 2012-12-13T23:32:56Z
 
@@ -537728,15 +538369,15 @@
 
 [Term]
 id: GO:1902079
-name: D-valine catabolic process
+name: obsolete D-valine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of D-valine." [GOC:TermGenie, PMID:23085840]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of D-valine." [GOC:TermGenie, PMID:23085840]
+comment: This term was obsoleted because there is no evidence that there is a specific pathway to degrade D-valine.
 synonym: "D-valine breakdown" EXACT [GOC:TermGenie]
 synonym: "D-valine catabolism" EXACT [GOC:TermGenie]
 synonym: "D-valine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0009083 ! branched-chain amino acid catabolic process
-is_a: GO:0019478 ! D-amino acid catabolic process
-is_a: GO:1902114 ! D-valine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 created_by: al
 creation_date: 2013-04-23T21:34:29Z
 
@@ -538446,12 +539087,13 @@
 
 [Term]
 id: GO:1902114
-name: D-valine metabolic process
+name: obsolete D-valine metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving D-valine." [GOC:TermGenie, PMID:23085840]
+def: "OBSOLETE. The chemical reactions and pathways involving D-valine." [GOC:TermGenie, PMID:23085840]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "D-valine metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006573 ! valine metabolic process
-is_a: GO:0046416 ! D-amino acid metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31357" xsd:anyURI
+is_obsolete: true
 created_by: al
 creation_date: 2013-05-13T23:27:23Z
 
@@ -548947,8 +549589,7 @@
 synonym: "sulfurated eukaryotic molybdenum cofactor(2-) formation" EXACT [GOC:TermGenie]
 synonym: "sulfurated eukaryotic molybdenum cofactor(2-) synthesis" EXACT [GOC:TermGenie]
 xref: MetaCyc:PWY-5963
-is_a: GO:0006793 ! phosphorus metabolic process
-is_a: GO:0009058 ! biosynthetic process
+is_a: GO:0006777 ! Mo-molybdopterin cofactor biosynthetic process
 relationship: has_part GO:0008265 ! molybdenum cofactor sulfurtransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 created_by: dph
@@ -549009,6 +549650,7 @@
 synonym: "Mo-molybdopterin-cytosine-dinucleotide cofactor biosynthetic process" EXACT []
 xref: MetaCyc:PWY-6476
 is_a: GO:0006777 ! Mo-molybdopterin cofactor biosynthetic process
+is_a: GO:0009165 ! nucleotide biosynthetic process
 relationship: has_part GO:0061602 ! molybdenum cofactor cytidylyltransferase activity
 created_by: dph
 creation_date: 2014-03-06T14:00:43Z
@@ -552035,6 +552677,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0046165 ! alcohol biosynthetic process
 relationship: regulates GO:0046165 ! alcohol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: tt
 creation_date: 2014-04-22T21:55:03Z
 
@@ -552043,6 +552686,7 @@
 name: negative regulation of alcohol biosynthetic process
 namespace: biological_process
 def: "Any process that stops, prevents or reduces the frequency, rate or extent of alcohol biosynthetic process." [GO_REF:0000058, GOC:mengo_curators, GOC:TermGenie, PMID:23332010]
+subset: gocheck_do_not_annotate
 synonym: "down regulation of alcohol anabolism" EXACT [GOC:TermGenie]
 synonym: "down regulation of alcohol biosynthesis" EXACT [GOC:TermGenie]
 synonym: "down regulation of alcohol biosynthetic process" EXACT [GOC:TermGenie]
@@ -552074,6 +552718,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0046165 ! alcohol biosynthetic process
 relationship: negatively_regulates GO:0046165 ! alcohol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: tt
 creation_date: 2014-04-22T21:55:13Z
 
@@ -552082,6 +552727,7 @@
 name: positive regulation of alcohol biosynthetic process
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of alcohol biosynthetic process." [GO_REF:0000058, GOC:mengo_curators, GOC:TermGenie, PMID:23332010]
+subset: gocheck_do_not_annotate
 synonym: "activation of alcohol anabolism" NARROW [GOC:TermGenie]
 synonym: "activation of alcohol biosynthesis" NARROW [GOC:TermGenie]
 synonym: "activation of alcohol biosynthetic process" NARROW [GOC:TermGenie]
@@ -552113,6 +552759,7 @@
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0046165 ! alcohol biosynthetic process
 relationship: positively_regulates GO:0046165 ! alcohol biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31485" xsd:anyURI
 created_by: tt
 creation_date: 2014-04-22T21:55:19Z
 
@@ -552700,31 +553347,25 @@
 
 [Term]
 id: GO:1902954
-name: regulation of early endosome to recycling endosome transport
+name: obsolete regulation of early endosome to recycling endosome transport
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of early endosome to recycling endosome transport." [GO_REF:0000058, GOC:sjp, GOC:TermGenie, PMID:22621900]
-is_a: GO:0032386 ! regulation of intracellular transport
-is_a: GO:0060627 ! regulation of vesicle-mediated transport
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0061502 ! early endosome to recycling endosome transport
-relationship: regulates GO:0061502 ! early endosome to recycling endosome transport
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of early endosome to recycling endosome transport." [GO_REF:0000058, GOC:sjp, GOC:TermGenie, PMID:22621900]
+comment: This term is described by another GO term
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31240" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:2001135
 created_by: sjp
 creation_date: 2014-05-02T09:06:23Z
 
 [Term]
 id: GO:1902955
-name: positive regulation of early endosome to recycling endosome transport
+name: obsolete positive regulation of early endosome to recycling endosome transport
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of early endosome to recycling endosome transport." [GO_REF:0000058, GOC:sjp, GOC:TermGenie, PMID:22621900]
-synonym: "activation of early endosome to recycling endosome transport" NARROW [GOC:TermGenie]
-synonym: "up regulation of early endosome to recycling endosome transport" EXACT [GOC:TermGenie]
-synonym: "up-regulation of early endosome to recycling endosome transport" EXACT [GOC:TermGenie]
-synonym: "upregulation of early endosome to recycling endosome transport" EXACT [GOC:TermGenie]
-is_a: GO:0032388 ! positive regulation of intracellular transport
-is_a: GO:1902954 ! regulation of early endosome to recycling endosome transport
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0061502 ! early endosome to recycling endosome transport
-relationship: positively_regulates GO:0061502 ! early endosome to recycling endosome transport
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of early endosome to recycling endosome transport." [GO_REF:0000058, GOC:sjp, GOC:TermGenie, PMID:22621900]
+comment: This term is described by another GO term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31240" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:2001137
 created_by: sjp
 creation_date: 2014-05-02T09:06:29Z
 
@@ -558015,13 +558656,16 @@
 
 [Term]
 id: GO:1903212
-name: protein localization to mating-type region heterochromatin
+name: obsolete protein localization to mating-type region heterochromatin
 namespace: biological_process
-def: "A process in which a protein is transported to, or maintained in, a location within a mating-type region heterochromatin." [GO_REF:0000087, GOC:TermGenie, PMID:18761674]
+def: "OBSOLETE. A process in which a protein is transported to, or maintained in, a location within a mating-type region heterochromatin." [GO_REF:0000087, GOC:TermGenie, PMID:18761674]
+comment: This term was obsoleted because it represents a precomposed term.
 synonym: "protein localisation in mating-type region heterochromatin" EXACT [GOC:TermGenie]
 synonym: "protein localisation to mating-type region heterochromatin" EXACT [GOC:TermGenie]
 synonym: "protein localization in mating-type region heterochromatin" EXACT [GOC:TermGenie]
-is_a: GO:0097355 ! protein localization to heterochromatin
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31529" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0071168
 created_by: mah
 creation_date: 2014-07-24T09:38:12Z
 
@@ -564778,15 +565422,14 @@
 
 [Term]
 id: GO:1903559
-name: 3-cyano-L-alanine catabolic process
+name: obsolete 3-cyano-L-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of 3-cyano-L-alanine." [GO_REF:0000068, GOC:kmv, GOC:TermGenie, PMID:24100226, PMID:24843024]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of 3-cyano-L-alanine." [GO_REF:0000068, GOC:kmv, GOC:TermGenie, PMID:24100226, PMID:24843024]
+comment: This term was obsoleted because there is no evidence that a specific pathway for 3-cyano-L-alanine degradation exists.
 synonym: "3-cyano-L-alanine breakdown" EXACT [GOC:TermGenie]
 synonym: "3-cyano-L-alanine catabolism" EXACT [GOC:TermGenie]
 synonym: "3-cyano-L-alanine degradation" EXACT [GOC:TermGenie]
-is_a: GO:0050899 ! nitrile catabolic process
-is_a: GO:0170035 ! L-amino acid catabolic process
-is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
+is_obsolete: true
 created_by: kmv
 creation_date: 2014-10-21T17:13:10Z
 
@@ -604651,47 +605294,45 @@
 
 [Term]
 id: GO:1905526
-name: regulation of Golgi lumen acidification
+name: obsolete regulation of Golgi lumen acidification
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
-is_a: GO:0032847 ! regulation of cellular pH reduction
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0061795 ! Golgi lumen acidification
-relationship: regulates GO:0061795 ! Golgi lumen acidification
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
+comment: This term was added in error. Regulating regulation is redundant. Direction is unspecified.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+consider: GO:0061795
 created_by: dph
 creation_date: 2016-10-05T13:16:25Z
 
 [Term]
 id: GO:1905527
-name: negative regulation of Golgi lumen acidification
+name: obsolete negative regulation of Golgi lumen acidification
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
+comment: This term was added in error. Regulating regulation is redundant.
 synonym: "down regulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
 synonym: "down-regulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
 synonym: "downregulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
 synonym: "inhibition of Golgi lumen acidification" NARROW [GOC:TermGenie]
-is_a: GO:0032848 ! negative regulation of cellular pH reduction
-is_a: GO:1905526 ! regulation of Golgi lumen acidification
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0061795 ! Golgi lumen acidification
-relationship: negatively_regulates GO:0061795 ! Golgi lumen acidification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061795
 created_by: dph
 creation_date: 2016-10-05T13:16:33Z
 
 [Term]
 id: GO:1905528
-name: positive regulation of Golgi lumen acidification
+name: obsolete positive regulation of Golgi lumen acidification
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of Golgi lumen acidification." [GO_REF:0000058, GOC:dph, GOC:TermGenie, PMID:23447592]
+comment: This term was added in error. Regulating regulation is redundant.
 synonym: "activation of Golgi lumen acidification" NARROW [GOC:TermGenie]
 synonym: "up regulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
 synonym: "up-regulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
 synonym: "upregulation of Golgi lumen acidification" EXACT [GOC:TermGenie]
-is_a: GO:0032849 ! positive regulation of cellular pH reduction
-is_a: GO:1905526 ! regulation of Golgi lumen acidification
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0061795 ! Golgi lumen acidification
-relationship: positively_regulates GO:0061795 ! Golgi lumen acidification
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29164" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0061795
 created_by: dph
 creation_date: 2016-10-05T13:16:41Z
 
@@ -621301,9 +621942,10 @@
 id: GO:1990780
 name: cytoplasmic side of dendritic spine plasma membrane
 namespace: cellular_component
-def: "The leaflet of the plasma membrane that faces the cytoplasm and any proteins embedded or anchored in it or attached to its surface surrounding a dendritic spine." [PMID:9275233]
+def: "The leaflet of the plasma membrane in the dendritic spine region that faces the cytoplasm, including any protein embedded in, attached to, or peripherally associated with it." [PMID:9275233]
 is_a: GO:0009898 ! cytoplasmic side of plasma membrane
 relationship: part_of GO:0032591 ! dendritic spine membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31515" xsd:anyURI
 created_by: sl
 creation_date: 2015-06-23T18:35:39Z
 
@@ -622461,6 +623103,7 @@
 def: "Catalysis of the reaction: a cytidine in 18S rRNA + acetyl-CoA + ATP + H2O = an N(4)-acetylcytidine in 18S rRNA + ADP + phosphate + CoA + H+." [PMID:25402480, RHEA:51424]
 xref: RHEA:51424
 is_a: GO:0008080 ! N-acetyltransferase activity
+is_a: GO:0140102 ! catalytic activity, acting on a rRNA
 property_value: skos:exactMatch RHEA:51424
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29506" xsd:anyURI
 created_by: al
@@ -622746,7 +623389,8 @@
 name: response to psychosocial stress
 namespace: biological_process
 def: "Any process that results in a change in state or activity of a cell or an organism (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of exposure to aversive or demanding psychological and social conditions that tax or exceed the behavioral resources of the organism." [PMID:22922217, PMID:26458179]
-is_a: GO:0006950 ! response to stress
+is_a: GO:0033555 ! multicellular organismal response to stress
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 created_by: sl
 creation_date: 2015-12-07T20:38:35Z
 
@@ -623091,12 +623735,15 @@
 
 [Term]
 id: GO:1990943
-name: mating type region replication fork barrier binding
+name: obsolete mating type region replication fork barrier binding
 namespace: molecular_function
-def: "Binding to the replication fork barrier found in the mating type region of fission yeast." [PMID:18723894]
+def: "OBSOLETE. Binding to the replication fork barrier found in the mating type region of fission yeast." [PMID:18723894]
+comment: This term was obsoleted because it represents a precomposed term.
 synonym: "RTS1 barrier binding" EXACT []
 synonym: "RTS1 element binding" EXACT []
-is_a: GO:0031634 ! replication fork barrier binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31529" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0031634
 created_by: mah
 creation_date: 2016-04-06T16:08:43Z
 
@@ -641911,8 +642558,10 @@
 id: GO:7770002
 name: sodium:ammonium:chloride symporter activity
 namespace: molecular_function
-def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: Na+(out) + NH4+(out) + Cl-(out) = Na+(in) + NH4+(in) + Cl-(in)." [PMID:12657561]
+def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: Na+(out) + NH4+(out) + Cl-(out) = Na+(in) + NH4+(in) + Cl-(in)." [PMID:12657561, RHEA:85511]
+xref: RHEA:85511
 is_a: GO:0015378 ! sodium:chloride symporter activity
+property_value: skos:exactMatch RHEA:85511
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30468" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-06-19T23:39:51Z
@@ -641993,9 +642642,11 @@
 id: GO:7770009
 name: L-tryptophan conjugated cholate hydrolase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: cholate + L-tryptophan = L-tryptophocholate + H2O." [PMID:40446798]
+def: "Catalysis of the reaction: cholate + L-tryptophan = L-tryptophocholate + H2O." [PMID:40446798, RHEA:85423]
 xref: CHEBI:234456
+xref: RHEA:85423
 is_a: GO:7770003 ! amino acid conjugated cholate hydrolase activity
+property_value: skos:exactMatch RHEA:85423
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30487" xsd:anyURI
 created_by: dragon-ai-agent
 creation_date: 2025-06-25T00:18:58Z
@@ -642313,6 +642964,156 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30887" xsd:anyURI
 created_by: dragon-ai-agent
 
+[Term]
+id: GO:7770038
+name: melanosomal lumen acidification
+namespace: biological_process
+def: "Any process that reduces the pH of the melanosomal lumen, measured by the concentration of the hydrogen ion." [PMID:23205854, PMID:35469906]
+synonym: "melanosome pH reduction" EXACT []
+is_a: GO:0051452 ! intracellular pH reduction
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28838" xsd:anyURI
+created_by: dragon-ai-agent
+
+[Term]
+id: GO:7770039
+name: melanosomal lumen pH elevation
+namespace: biological_process
+def: "Any process that increases the pH of the melanosomal lumen, measured by the concentration of the hydrogen ion." [PMID:11310796, PMID:27140606, PMID:32966160, PMID:35469906]
+synonym: "melanosome pH elevation" EXACT []
+is_a: GO:0051454 ! intracellular pH elevation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28838" xsd:anyURI
+created_by: dragon-ai-agent
+
+[Term]
+id: GO:7770040
+name: epiplastidial membrane
+namespace: cellular_component
+def: "The outermost lipid bilayer surrounding complex plastids in organisms that acquired their plastids through secondary endosymbiosis. This membrane is derived from the host cell's endomembrane system and is continuous with the rough endoplasmic reticulum and the outer nuclear envelope. In some species, the cytoplasmic face may be studded with ribosomes." [PMID:15937721, PMID:27179349, PMID:39383259]
+synonym: "cERM" EXACT []
+synonym: "chloroplast ER membrane" EXACT []
+synonym: "epiplastid rough ER" EXACT []
+synonym: "EpM" EXACT []
+synonym: "EPrER" EXACT []
+is_a: GO:0042170 ! plastid membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31421" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-01-29T01:11:34Z
+
+[Term]
+id: GO:7770041
+name: periplastidial membrane
+namespace: cellular_component
+def: "The lipid bilayer that forms the second outermost membrane of complex plastids in organisms that acquired their plastids through secondary endosymbiosis. The periplastidial membrane is evolutionarily derived from the plasma membrane of the engulfed algal endosymbiont and together with the outer envelope membrane of the plastid defines the periplastidial compartment." [PMID:15937721, PMID:27179349, PMID:39383259]
+synonym: "PPM" EXACT []
+is_a: GO:0042170 ! plastid membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31421" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-01-29T01:11:34Z
+
+[Term]
+id: GO:7770042
+name: bindosome complex
+namespace: cellular_component
+def: "A membrane-associated protein complex found in archaea that consists of sugar binding proteins assembled via a type IV pilin-like assembly system. The complex is located at the cell surface and functions in sugar uptake by facilitating the interaction between solute binding proteins and ABC transporters. The complex forms high molecular mass structures (400-600 kDa) that are integrated within or closely associated with the S-layer." [PMID:21234771, PMID:38877064]
+is_a: GO:0098796 ! membrane protein complex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31422" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-01-29T01:57:42Z
+
+[Term]
+id: GO:7770043
+name: lipid chaperone activity
+namespace: molecular_function
+def: "Binding to a lipid and delivering it to an acceptor protein, including enzymes, nuclear receptors, and other lipid-binding proteins. The lipid may be presented while bound to the chaperone for enzymatic modification or signaling, or fully transferred to the acceptor protein." [PMID:16216074, PMID:18511927, PMID:25847235, PMID:26658141]
+is_a: GO:0005319 ! lipid carrier activity
+relationship: has_part GO:0008289 ! lipid binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31403" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-01-30T01:54:24Z
+
+[Term]
+id: GO:7770044
+name: phycoerythrobilin synthase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: biliverdin IXalpha + 2 reduced ferredoxin + 4 H+ = (3Z)-phycoerythrobilin + 2 oxidized ferredoxin." [PMID:18662988, RHEA:25359]
+xref: EC:1.3.7.6
+xref: RHEA:25359
+is_a: GO:0016636 ! oxidoreductase activity, acting on the CH-CH group of donors, iron-sulfur protein as acceptor
+property_value: skos:exactMatch EC:1.3.7.6
+property_value: skos:exactMatch RHEA:25359
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31443" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-01-30T04:39:58Z
+
+[Term]
+id: GO:7770045
+name: negative regulation of GCN2-mediated signaling
+namespace: biological_process
+def: "Any process that stops, prevents, or reduces the frequency, rate or extent of GCN2-mediated signaling." [PMID:23899355]
+is_a: GO:0080135 ! regulation of cellular response to stress
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
+intersection_of: GO:0065007 ! biological regulation
+intersection_of: negatively_regulates GO:0140469 ! GCN2-mediated signaling
+relationship: negatively_regulates GO:0140469 ! GCN2-mediated signaling
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31453" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-02-04T18:20:09Z
+
+[Term]
+id: GO:7770046
+name: obsolete N6-methyladenosine kinase activity
+namespace: molecular_function
+def: "OBSOLETE. Catalysis of the reaction: ATP + N6-methyladenosine = ADP + H+ + N6-methyl-AMP." [PMID:40840445]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30800" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-02-09T05:59:37Z
+
+[Term]
+id: GO:7770047
+name: obsolete N6,N6-dimethyladenosine kinase activity
+namespace: molecular_function
+def: "OBSOLETE. Catalysis of the reaction: ATP + N6,N6-dimethyladenosine = ADP + H+ + N6,N6-dimethyl-AMP." [PMID:40840445]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30800" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-02-09T05:59:37Z
+
+[Term]
+id: GO:7770048
+name: obsolete N6-isopentenyladenosine kinase activity
+namespace: molecular_function
+def: "OBSOLETE. Catalysis of the reaction: ATP + N6-isopentenyladenosine = ADP + H+ + N6-isopentenyl-AMP." [PMID:40840445]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30800" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-02-09T05:59:37Z
+
+[Term]
+id: GO:7770049
+name: obsolete N6,N6-dimethyl-AMP deaminase activity
+namespace: molecular_function
+def: "OBSOLETE. Catalysis of the reaction: H2O + H+ + N6,N6-dimethyl-AMP = IMP + dimethylamine." [PMID:40840445]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30800" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-02-09T05:59:37Z
+
+[Term]
+id: GO:7770050
+name: obsolete N6-isopentenyl-AMP deaminase activity
+namespace: molecular_function
+def: "OBSOLETE. Catalysis of the reaction: H2O + H+ + N6-isopentenyl-AMP = IMP + dimethylallylamine." [PMID:40840445]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30800" xsd:anyURI
+is_obsolete: true
+created_by: dragon-ai-agent
+creation_date: 2026-02-09T05:59:37Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
