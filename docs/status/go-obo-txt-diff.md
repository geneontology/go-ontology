# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-02-01 05:54:20.944679478 +0000
+++ go.obo	2026-02-01 06:03:23.912514168 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-01-23
+data-version: releases/2026-02-01
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-01-23" xsd:string
+property_value: owl:versionInfo "2026-02-01" xsd:string
 property_value: terms:license http://creativecommons.org/licenses/by/4.0/
 
 [Term]
@@ -7612,7 +7612,6 @@
 def: "Binding to an RNA polymerase II core enzyme, a multisubunit eukaryotic nuclear RNA polymerase typically composed of twelve subunits." [GOC:txnOH]
 synonym: "RNA polymerase II core binding" EXACT []
 synonym: "RNAP II core binding" EXACT []
-is_a: GO:0001099 ! basal RNA polymerase II transcription machinery binding
 is_a: GO:0043175 ! RNA polymerase core enzyme binding
 created_by: krc
 creation_date: 2010-08-11T03:57:27Z
@@ -7631,7 +7630,7 @@
 name: RNA polymerase III general transcription initiation factor activity
 namespace: molecular_function
 alt_id: GO:0001034
-def: "A general transcription initiation factor activity that contributes to transcription start site selection and transcription initiation of genes transcribed by RNA polymerase III. Factors required for RNA polymerase III transcription initiation include TFIIIA, TFIIIB and TFIIIC. RNA polymerase III transcribes genes encoding short RNAs, including tRNAs, 5S rRNA, U6 snRNA, the short ncRNA component of RNases P, the mitochondrial RNA processing (MRP) RNA, the signal recognition particle SRP RNA, and in higher eukaryotes a number of micro and other small RNAs, though there is some variability across species as to whether a given small noncoding RNA is transcribed by RNA polymerase II or RNA polymerase III." [GOC:txnOH-2018, PMID:12381659, PMID:17977614, PMID:20413673, PMID:27068803, Wikipedia:RNA_polymerase_III]
+def: "A general transcription initiation factor activity that contributes to transcription start site selection and transcription initiation of genes transcribed by RNA polymerase III. Factors required for RNA polymerase III transcription initiation include TFIIIA, TFIIIB and TFIIIC. RNA polymerase III transcribes genes encoding short RNAs, including tRNAs, 5S rRNA, U6 snRNA, the short ncRNA component of RNases P, the mitochondrial RNA processing (MRP) RNA, the signal recognition particle SRP RNA, and in higher eukaryotes a number of micro and other small RNAs, though there is some variability across species as to whether a given small noncoding RNA is transcribed by RNA polymerase II or RNA polymerase III." [GOC:txnOH-2018, PMID:12381659, PMID:17977614, PMID:20413673, PMID:27068803, PMID:40762516, Wikipedia:RNA_polymerase_III]
 synonym: "core RNA polymerase III binding transcription factor activity" NARROW []
 synonym: "RNA polymerase III general initiation factor activity" EXACT []
 synonym: "RNA polymerase III transcription factor activity, sequence-specific DNA binding" NARROW []
@@ -7640,6 +7639,7 @@
 is_a: GO:0140223 ! general transcription initiation factor activity
 relationship: part_of GO:0006383 ! transcription by RNA polymerase III
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15789" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/15862" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20253" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22622" xsd:anyURI
 created_by: krc
@@ -7747,14 +7747,17 @@
 
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
 
@@ -8393,7 +8396,7 @@
 namespace: molecular_function
 def: "Binding to a basal RNA polymerase II transcription factor, any of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II and defined as a basal or general transcription factor." [GOC:txnOH, PMID:16858867]
 synonym: "RNA polymerase II basal transcription factor binding" EXACT []
-is_a: GO:0001099 ! basal RNA polymerase II transcription machinery binding
+is_a: GO:0000993 ! RNA polymerase II complex binding
 is_a: GO:0140296 ! general transcription initiation factor binding
 created_by: krc
 creation_date: 2010-10-28T02:30:02Z
@@ -8405,7 +8408,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIA complex, one of the complexes involved in formation of the preinitiation complex (PIC) by RNA polymerase II and defined as a basal or general transcription factor." [GOC:krc, PMID:16858867]
 synonym: "TFIIA-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:37:19Z
 
@@ -8425,7 +8427,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIID complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIID-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:48:33Z
 
@@ -8436,7 +8437,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIE complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIIE-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:49:20Z
 
@@ -8447,7 +8447,6 @@
 def: "Binding to a general RNA polymerase II transcription factor belonging to the TFIIF complex, one of the factors involved in formation of the preinitiation complex (PIC) by RNA polymerase II." [GOC:krc, PMID:16858867]
 synonym: "TFIIF-class transcription factor binding" EXACT []
 is_a: GO:0001091 ! RNA polymerase II general transcription initiation factor binding
-is_a: GO:0044877 ! protein-containing complex binding
 created_by: krc
 creation_date: 2010-10-28T02:51:20Z
 
@@ -8458,28 +8457,30 @@
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
 
@@ -8516,7 +8517,7 @@
 namespace: molecular_function
 def: "Binding to a component of the basal transcription machinery which is composed of a bacterial-type RNA polymerase core enzyme and a sigma factor, the minimal set of factors required for formation of the preinitiation complex (PIC) by a bacterial-type RNA polymerase." [GOC:txnOH]
 synonym: "basal bacterial-type RNA polymerase transcription machinery binding" EXACT []
-is_a: GO:0001098 ! basal transcription machinery binding
+is_a: GO:0070063 ! RNA polymerase binding
 created_by: krc
 creation_date: 2010-11-30T04:26:04Z
 
@@ -8742,14 +8743,15 @@
 
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
 
@@ -11355,6 +11357,7 @@
 synonym: "behavioural fear response" EXACT []
 is_a: GO:0002209 ! behavioral defense response
 is_a: GO:0042596 ! fear response
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 
 [Term]
 id: GO:0001664
@@ -32984,12 +32987,16 @@
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
@@ -35529,10 +35536,10 @@
 
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
@@ -35542,6 +35549,7 @@
 synonym: "N(2)-acetylornithine 5-transaminase activity" RELATED [EC:2.6.1.11]
 synonym: "N-acetylornithine aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "N-acetylornithine-delta-transaminase activity" RELATED [EC:2.6.1.11]
+synonym: "N2-acetyl-L-ornithine:2-oxoglutarate 5-aminotransferase activity" EXACT []
 synonym: "N2-acetyl-L-ornithine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.11]
 synonym: "N2-acetylornithine 5-aminotransferase activity" EXACT []
 synonym: "N2-acetylornithine 5-transaminase activity" RELATED [EC:2.6.1.11]
@@ -35554,6 +35562,7 @@
 property_value: skos:exactMatch EC:2.6.1.11
 property_value: skos:exactMatch RHEA:18049
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0003993
@@ -35811,9 +35820,9 @@
 
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
@@ -35824,6 +35833,7 @@
 synonym: "adenosyl methionine-8-amino-7-oxononanoate transaminase activity" EXACT []
 synonym: "adenosylmethionine--8-amino-7-oxononanoate aminotransferase activity" RELATED [EC:2.6.1.62]
 synonym: "adenosylmethionine-8-amino-7-oxononanoate aminotransferase activity" EXACT []
+synonym: "adenosylmethionine-8-amino-7-oxononanoate transaminase activity" EXACT []
 synonym: "DAPA aminotransferase activity" RELATED [EC:2.6.1.62]
 synonym: "DAPA transaminase activity" RELATED [EC:2.6.1.62]
 synonym: "diaminopelargonate synthase activity" RELATED [EC:2.6.1.62]
@@ -35836,6 +35846,7 @@
 property_value: skos:exactMatch EC:2.6.1.62
 property_value: skos:exactMatch RHEA:16861
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004016
@@ -35959,9 +35970,9 @@
 
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
@@ -35977,6 +35988,7 @@
 synonym: "L-alanine aminotransferase activity" BROAD [EC:2.6.1.2]
 synonym: "L-alanine transaminase activity" BROAD [EC:2.6.1.2]
 synonym: "L-alanine-alpha-ketoglutarate aminotransferase activity" RELATED [EC:2.6.1.2]
+synonym: "L-alanine:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "pyruvate transaminase activity" BROAD [EC:2.6.1.2]
 synonym: "pyruvate-alanine aminotransferase activity" RELATED [EC:2.6.1.2]
 synonym: "pyruvate-glutamate transaminase activity" RELATED [EC:2.6.1.2]
@@ -35988,13 +36000,14 @@
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
@@ -37014,9 +37027,9 @@
 
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
@@ -37043,6 +37056,7 @@
 synonym: "L-aspartate-2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.1]
 synonym: "L-aspartate-2-oxoglutarate-transaminase activity" RELATED [EC:2.6.1.1]
 synonym: "L-aspartate-alpha-ketoglutarate transaminase activity" RELATED [EC:2.6.1.1]
+synonym: "L-aspartate:2-oxoglutarate aminotransferase activity" EXACT []
 synonym: "L-aspartic aminotransferase activity" BROAD [EC:2.6.1.1]
 synonym: "oxaloacetate transferase activity" RELATED [EC:2.6.1.1]
 synonym: "oxaloacetate-aspartate aminotransferase activity" RELATED [EC:2.6.1.1]
@@ -37062,6 +37076,7 @@
 property_value: skos:relatedMatch MetaCyc:ASPARTATESYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28527" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004070
@@ -37341,12 +37356,13 @@
 
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
@@ -37359,6 +37375,7 @@
 is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch EC:2.6.1.42
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004085
@@ -42795,9 +42812,9 @@
 
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
@@ -42805,6 +42822,7 @@
 synonym: "glucosamine-6-phosphate isomerase (glutamine-forming) activity" EXACT []
 synonym: "glucosamine-6-phosphate synthase activity" RELATED [EC:2.6.1.16]
 synonym: "glucosaminephosphate isomerase" BROAD [EC:2.6.1.16]
+synonym: "glutamine-fructose-6-phosphate transaminase (isomerizing) activity" EXACT []
 synonym: "hexosephosphate aminotransferase activity" RELATED [EC:2.6.1.16]
 synonym: "L-glutamine-D-fructose-6-phosphate amidotransferase activity" RELATED [EC:2.6.1.16]
 synonym: "L-glutamine:D-fructose-6-phosphate isomerase (deaminating)" RELATED [EC:2.6.1.16]
@@ -42814,10 +42832,11 @@
 xref: Reactome:R-HSA-4085027 "Defective GFPT1 does not transfer an amino group from L-Gln to F6P to form GlcN6P"
 xref: Reactome:R-HSA-449715 "GFPT1,2 transfer an amino group from L-Gln to F6P to form GlcN6P"
 xref: RHEA:13237
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0008483 ! transaminase activity
 property_value: skos:exactMatch EC:2.6.1.16
 property_value: skos:exactMatch RHEA:13237
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004361
@@ -43518,13 +43537,14 @@
 
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
@@ -43539,6 +43559,7 @@
 property_value: skos:exactMatch EC:2.6.1.9
 property_value: skos:exactMatch RHEA:23744
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004401
@@ -47048,9 +47069,9 @@
 
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
@@ -47058,6 +47079,7 @@
 synonym: "L-ornithine:alpha-ketoglutarate delta-aminotransferase activity" RELATED [EC:2.6.1.13]
 synonym: "OAT" RELATED [EC:2.6.1.13]
 synonym: "ornithine 5-aminotransferase activity" RELATED [EC:2.6.1.13]
+synonym: "ornithine aminotransferase activity" EXACT []
 synonym: "ornithine delta-transaminase activity" RELATED [EC:2.6.1.13]
 synonym: "ornithine ketoacid aminotransferase activity" RELATED [EC:2.6.1.13]
 synonym: "ornithine transaminase activity" RELATED [EC:2.6.1.13]
@@ -47083,6 +47105,7 @@
 property_value: skos:exactMatch RHEA:13877
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25975" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004588
@@ -47815,14 +47838,16 @@
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
 
@@ -48364,15 +48389,16 @@
 
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
@@ -48388,6 +48414,7 @@
 property_value: skos:exactMatch EC:2.6.1.52
 property_value: skos:exactMatch RHEA:14329
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0004649
@@ -51549,13 +51576,14 @@
 
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
@@ -51567,10 +51595,11 @@
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
@@ -53155,14 +53184,15 @@
 
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
@@ -53180,10 +53210,11 @@
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
@@ -58096,10 +58127,11 @@
 
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
@@ -58112,8 +58144,8 @@
 xref: Reactome:R-HSA-6801250 "TRIAP1:PRELID1, PRELID3A transports PA from the outer to the inner mitochondrial membrane"
 xref: Reactome:R-HSA-8848053 "ABCA5 transports CHOL from lysosomal lumen to cytosol"
 xref: Reactome:R-HSA-8866329 "MTTP lipidates APOB-100, forming a pre-VLDL"
-is_a: GO:0005215 ! transporter activity
-relationship: part_of GO:0006869 ! lipid transport
+is_a: GO:0140104 ! molecular carrier activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0005320
@@ -59722,8 +59754,9 @@
 xref: Reactome:R-HSA-8857662 "ESYT1:ESYT2:ESYT3 transport GPL from plasma membrane to ER membrane"
 xref: Reactome:R-HSA-8865637 "MFSD2A transports LPC from extracellular region to plasma membrane"
 xref: Reactome:R-HSA-8867876 "OSBPL5,8,10 exchange PS with PI4P from ER membrane to plasma membrane"
-is_a: GO:0005319 ! lipid transporter activity
+is_a: GO:0005215 ! transporter activity
 relationship: part_of GO:0015914 ! phospholipid transport
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0005549
@@ -69152,7 +69185,6 @@
 namespace: biological_process
 def: "The process of introducing a phosphate group on to a protein." [GOC:hb]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid phosphorylation" EXACT [GOC:bf]
 is_a: GO:0016310 ! phosphorylation
 is_a: GO:0036211 ! protein modification process
@@ -69180,7 +69212,6 @@
 namespace: biological_process
 def: "The process of removing one or more phosphoric residues from a protein." [GOC:hb]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid dephosphorylation" EXACT [GOC:bf]
 is_a: GO:0016311 ! dephosphorylation
 is_a: GO:0036211 ! protein modification process
@@ -69455,7 +69486,6 @@
 comment: For non-covalent interactions with a lipid, consider instead the term 'lipid binding ; GO:0008289' and its children.
 subset: gocheck_obsoletion_candidate
 subset: goslim_drosophila
-subset: goslim_yeast
 synonym: "lipid:protein modification" EXACT []
 synonym: "protein amino acid lipidation" EXACT [GOC:bf]
 xref: RESID:AA0059
@@ -69827,7 +69857,7 @@
 id: GO:0006527
 name: L-arginine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-arginine, 2-amino-5-(carbamimidamido)pentanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-arginine." [GOC:curators]
 synonym: "arginine breakdown" EXACT []
 synonym: "arginine catabolism" EXACT []
 synonym: "arginine degradation" EXACT []
@@ -69863,6 +69893,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8187
 property_value: skos:narrowMatch MetaCyc:PWY0-823
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006528
@@ -69891,7 +69922,7 @@
 id: GO:0006530
 name: L-asparagine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-asparagine, 2-amino-3-carbamoylpropanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-asparagine." [GOC:curators]
 synonym: "asparagine breakdown" EXACT []
 synonym: "asparagine catabolism" EXACT []
 synonym: "asparagine degradation" EXACT []
@@ -69903,6 +69934,7 @@
 property_value: skos:narrowMatch MetaCyc:ASPARAGINE-DEG1-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-4002
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006531
@@ -69932,7 +69964,7 @@
 id: GO:0006533
 name: L-aspartate catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-aspartate, the anion derived from aspartic acid, 2-aminobutanedioic acid." [GOC:go_curators, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-aspartate." [GOC:curators]
 synonym: "aspartate breakdown" EXACT []
 synonym: "aspartate catabolism" EXACT []
 synonym: "aspartate degradation" EXACT []
@@ -69947,6 +69979,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8291
 property_value: skos:narrowMatch MetaCyc:PWY-8294
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006534
@@ -70009,7 +70042,7 @@
 name: L-glutamate catabolic process
 namespace: biological_process
 alt_id: GO:0019459
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate, the anion of 2-aminopentanedioic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-glutamate." [GOC:curators]
 synonym: "glutamate breakdown" EXACT []
 synonym: "glutamate catabolism" EXACT []
 synonym: "glutamate deamidation" RELATED []
@@ -70029,13 +70062,14 @@
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
@@ -70046,7 +70080,6 @@
 synonym: "glutamate degradation via 2-oxoglutarate" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28390" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:0019552
 
 [Term]
 id: GO:0006540
@@ -70103,7 +70136,7 @@
 id: GO:0006543
 name: L-glutamine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-glutamine, 2-amino-4-carbamoylbutanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-glutamine." [GOC:curators]
 synonym: "glutamine breakdown" EXACT []
 synonym: "glutamine catabolism" EXACT []
 synonym: "glutamine degradation" EXACT []
@@ -70116,6 +70149,7 @@
 property_value: skos:narrowMatch MetaCyc:GLUTAMINEFUM-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28154" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006544
@@ -70145,7 +70179,7 @@
 id: GO:0006546
 name: glycine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of glycine, aminoethanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of glycine." [GOC:curators]
 synonym: "glycine breakdown" EXACT []
 synonym: "glycine catabolism" EXACT []
 synonym: "glycine degradation" EXACT []
@@ -70156,6 +70190,7 @@
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-1608
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006547
@@ -70174,7 +70209,7 @@
 id: GO:0006548
 name: L-histidine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-histidine, 2-amino-3-(1H-imidazol-4-yl)propanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-histidine." [GOC:curators]
 synonym: "histidine breakdown" EXACT []
 synonym: "histidine catabolic process" BROAD []
 synonym: "histidine catabolism" EXACT []
@@ -70198,6 +70233,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5030
 property_value: skos:narrowMatch MetaCyc:PWY-5031
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006549
@@ -70212,7 +70248,7 @@
 id: GO:0006550
 name: L-isoleucine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-isoleucine, (2R*,3R*)-2-amino-3-methylpentanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-isoleucine." [GOC:curators]
 synonym: "isoleucine breakdown" EXACT []
 synonym: "isoleucine catabolism" EXACT []
 synonym: "isoleucine degradation" EXACT []
@@ -70226,6 +70262,7 @@
 property_value: skos:narrowMatch MetaCyc:ILEUDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5078
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006551
@@ -70242,7 +70279,7 @@
 id: GO:0006552
 name: L-leucine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-leucine, 2-amino-4-methylpentanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-leucine." [GOC:curators]
 synonym: "L-leucine breakdown" EXACT []
 synonym: "L-leucine catabolism" EXACT []
 synonym: "L-leucine degradation" EXACT []
@@ -70262,6 +70299,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-7767
 property_value: skos:narrowMatch MetaCyc:PWY-8185
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006553
@@ -70346,7 +70384,7 @@
 id: GO:0006559
 name: L-phenylalanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-phenylalanine, 2-amino-3-phenylpropanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-phenylalanine." [GOC:curators]
 synonym: "L-phenylalanine breakdown" EXACT []
 synonym: "L-phenylalanine catabolism" EXACT []
 synonym: "L-phenylalanine degradation" EXACT []
@@ -70367,6 +70405,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-7158
 property_value: skos:narrowMatch MetaCyc:PWY-8014
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006560
@@ -70396,7 +70435,7 @@
 id: GO:0006562
 name: L-proline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-proline (pyrrolidine-2-carboxylic acid), a chiral, cyclic, nonessential alpha-amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-proline." [GOC:curators]
 synonym: "proline breakdown" EXACT []
 synonym: "proline catabolism" EXACT []
 synonym: "proline degradation" EXACT []
@@ -70409,6 +70448,7 @@
 property_value: skos:narrowMatch MetaCyc:PROUT-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-8186
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006563
@@ -70440,7 +70480,7 @@
 id: GO:0006565
 name: L-serine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-serine to pyruvate and free ammonium." [MetaCyc:SERDEG-PWY]
+def: "The chemical reactions and pathways resulting in the breakdown of L-serine." [GOC:curators]
 synonym: "L-serine breakdown" EXACT []
 synonym: "L-serine catabolism" EXACT []
 synonym: "L-serine degradation" EXACT []
@@ -70450,6 +70490,7 @@
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 property_value: skos:exactMatch MetaCyc:SERDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30758" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006566
@@ -70466,7 +70507,7 @@
 id: GO:0006567
 name: L-threonine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-threonine (2-amino-3-hydroxybutyric acid), a polar, uncharged, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-threonine." [GOC:curators]
 synonym: "threonine breakdown" EXACT []
 synonym: "threonine catabolism" EXACT []
 synonym: "threonine degradation" EXACT []
@@ -70485,6 +70526,7 @@
 property_value: skos:narrowMatch MetaCyc:THRDLCTCAT-PWY
 property_value: skos:narrowMatch MetaCyc:THREONINE-DEG2-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006568
@@ -70503,7 +70545,7 @@
 id: GO:0006569
 name: L-tryptophan catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-tryptophan, the chiral amino acid 2-amino-3-(1H-indol-3-yl)propanoic acid." [ISBN:0198547684]
+def: "The chemical reactions and pathways resulting in the breakdown of L-tryptophan." [GOC:curators]
 synonym: "tryptophan breakdown" EXACT []
 synonym: "tryptophan catabolic process" RELATED []
 synonym: "tryptophan catabolic process, using tryptophanase" NARROW []
@@ -70543,6 +70585,7 @@
 property_value: skos:narrowMatch MetaCyc:TRYPDEG-PWY
 property_value: skos:narrowMatch MetaCyc:TRYPTOPHAN-DEGRADATION-1
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006570
@@ -70574,7 +70617,7 @@
 id: GO:0006572
 name: L-tyrosine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-tyrosine, an aromatic amino acid, 2-amino-3-(4-hydroxyphenyl)propanoic acid." [GOC:go_curators]
+def: "The chemical reactions and pathways resulting in the breakdown of L-tyrosine." [GOC:curators]
 synonym: "tyrosine breakdown" EXACT []
 synonym: "tyrosine catabolism" EXACT []
 synonym: "tyrosine degradation" EXACT []
@@ -70594,6 +70637,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY3O-4108
 property_value: skos:narrowMatch MetaCyc:TYRFUMCAT-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006573
@@ -70609,7 +70653,7 @@
 name: L-valine catabolic process
 namespace: biological_process
 alt_id: GO:1990292
-def: "The chemical reactions and pathways resulting in the breakdown of L-valine, 2-amino-3-methylbutanoic acid." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of L-valine." [GOC:curators]
 synonym: "valine breakdown" EXACT []
 synonym: "valine catabolism" EXACT []
 synonym: "valine degradation" EXACT []
@@ -70625,6 +70669,7 @@
 property_value: skos:narrowMatch MetaCyc:VALDEG-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31221" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006575
@@ -70836,7 +70881,7 @@
 id: GO:0006593
 name: L-ornithine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine, an amino acid only rarely found in proteins, but which is important in living organisms as an intermediate in the reactions of the urea cycle and in arginine biosynthesis." [GOC:jl, ISBN:0192801023]
+def: "The chemical reactions and pathways resulting in the breakdown of L-ornithine." [GOC:curators]
 synonym: "ornithine breakdown" EXACT []
 synonym: "ornithine catabolism" EXACT []
 synonym: "ornithine degradation" EXACT []
@@ -70844,6 +70889,7 @@
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0006595
@@ -75572,7 +75618,6 @@
 def: "Any process that reduces the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:jid]
 synonym: "lysosome pH reduction" EXACT [GOC:bf, GOC:rph]
 is_a: GO:0007035 ! vacuolar acidification
-is_a: GO:0035751 ! regulation of lysosomal lumen pH
 
 [Term]
 id: GO:0007043
@@ -82402,12 +82447,13 @@
 
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
@@ -82416,6 +82462,7 @@
 property_value: skos:exactMatch EC:2.6.1.38
 property_value: skos:exactMatch RHEA:16565
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0008111
@@ -83728,7 +83775,6 @@
 namespace: biological_process
 def: "The addition of an alkyl group to a protein amino acid. Alkyl groups are derived from alkanes by removal of one hydrogen atom." [GOC:ma]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid alkylation" EXACT [GOC:bf]
 is_a: GO:0036211 ! protein modification process
 
@@ -86566,12 +86612,13 @@
 
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
@@ -86580,10 +86627,11 @@
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
@@ -87646,11 +87694,16 @@
 
 [Term]
 id: GO:0008525
-name: phosphatidylcholine transporter activity
+name: phosphatidylcholine intramembrane carrier activity
 namespace: molecular_function
-def: "Enables the directed movement of phosphatidylcholine into, out of or within a cell, or between cells. Phosphatidylcholine refers to a class of glycerophospholipids in which the phosphatidyl group is esterified to the hydroxyl group of choline." [GOC:ai, ISBN:0198506732]
+def: "Enables the transport of phosphatidylcholine from a region of a membrane to a different region on the same membrane." [GOC:ai, ISBN:0198506732]
+synonym: "phosphatidylcholine intramembrane transporter activity" BROAD []
 synonym: "phosphatidylcholine transmembrane transporter activity" NARROW [GOC:bf, GOC:vw]
+synonym: "phosphatidylcholine transporter activity" BROAD []
 is_a: GO:0005548 ! phospholipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/10882" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31454" xsd:anyURI
 
 [Term]
 id: GO:0008526
@@ -91270,19 +91323,22 @@
 
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
 is_a: GO:0008483 ! transaminase activity
-property_value: skos:broadMatch EC:2.6.1.57
+property_value: skos:exactMatch EC:2.6.1.57
 property_value: skos:exactMatch RHEA:17533
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0008794
@@ -95008,12 +95064,13 @@
 
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
@@ -95023,6 +95080,7 @@
 property_value: skos:exactMatch EC:2.6.1.17
 property_value: skos:exactMatch RHEA:11960
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0009017
@@ -95409,23 +95467,25 @@
 
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
@@ -96022,7 +96082,7 @@
 id: GO:0009087
 name: L-methionine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-methionine (2-amino-4-(methylthio)butanoic acid), a sulfur-containing, essential amino acid found in peptide linkage in proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-methionine." [GOC:curators]
 synonym: "methionine breakdown" EXACT []
 synonym: "methionine catabolism" EXACT []
 synonym: "methionine degradation" EXACT []
@@ -96038,6 +96098,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5082
 property_value: skos:narrowMatch MetaCyc:PWY-701
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0009088
@@ -96160,17 +96221,17 @@
 
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
@@ -96204,7 +96265,7 @@
 relationship: has_part GO:0003984 ! acetolactate synthase activity
 relationship: has_part GO:0004160 ! dihydroxy-acid dehydratase activity
 relationship: has_part GO:0004455 ! ketol-acid reductoisomerase activity
-relationship: has_part GO:0052655 ! L-valine-2-oxoglutarate transaminase activity
+relationship: has_part GO:0052655 ! L-valine:2-oxoglutarate transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28686" xsd:anyURI
 
 [Term]
@@ -99918,7 +99979,7 @@
 id: GO:0009450
 name: gamma-aminobutyric acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of gamma-aminobutyric acid (GABA, 4-aminobutyrate), an amino acid which acts as a neurotransmitter in some organisms." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of gamma-aminobutyric acid (GABA)." [GOC:curators]
 comment: See also the biological process term 'neurotransmitter catabolic process ; GO:0042135'.
 synonym: "4-aminobutanoate catabolic process" EXACT []
 synonym: "4-aminobutanoate catabolism" EXACT []
@@ -99944,6 +100005,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-6536
 property_value: skos:narrowMatch MetaCyc:PWY-6537
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0009451
@@ -104768,10 +104830,13 @@
 
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
@@ -107488,10 +107553,12 @@
 
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
@@ -108218,10 +108285,11 @@
 
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
@@ -108235,6 +108303,7 @@
 property_value: skos:exactMatch EC:2.6.1.83
 property_value: skos:exactMatch RHEA:23988
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0010286
@@ -108653,7 +108722,6 @@
 namespace: biological_process
 alt_id: GO:1902534
 def: "The infolding of a membrane." [GOC:tb]
-subset: goslim_yeast
 synonym: "single-organism membrane invagination" RELATED []
 is_a: GO:0061024 ! membrane organization
 created_by: jl
@@ -108669,9 +108737,10 @@
 
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
@@ -108680,6 +108749,7 @@
 property_value: skos:exactMatch RHEA:31763
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0010327
@@ -108938,12 +109008,10 @@
 
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
@@ -114823,10 +114891,13 @@
 
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
@@ -129862,7 +129933,7 @@
 
 [Term]
 id: GO:0016212
-name: kynurenine-oxoglutarate transaminase activity
+name: L-kynurenine:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-oxoglutarate + L-kynurenine = H2O + kynurenate + L-glutamate. The product 4-(2-aminophenyl)-2,4-dioxobutanoate is converted into kynurenate by a spontaneous reaction. Also acts on 3-hydroxykynurenine to form xanthurenate." [EC:2.6.1.7]
 synonym: "kynurenine 2-oxoglutarate transaminase activity" RELATED [EC:2.6.1.7]
@@ -129870,6 +129941,7 @@
 synonym: "kynurenine transaminase (cyclizing)" RELATED [EC:2.6.1.7]
 synonym: "kynurenine--oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.7]
 synonym: "kynurenine-oxoglutarate aminotransferase activity" EXACT []
+synonym: "kynurenine-oxoglutarate transaminase activity" EXACT []
 synonym: "L-kynurenine aminotransferase activity" RELATED [EC:2.6.1.7]
 synonym: "L-kynurenine:2-oxoglutarate aminotransferase activity" RELATED [EC:2.6.1.7]
 xref: EC:2.6.1.7
@@ -129887,6 +129959,7 @@
 property_value: skos:narrowMatch RHEA:65560
 property_value: skos:narrowMatch RHEA:65884
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25811" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0016213
@@ -129987,7 +130060,7 @@
 id: GO:0016223
 name: beta-alanine:pyruvate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: L-alanine + 2-oxopropanoate = pyruvate + beta-alanine." [RHEA:14077]
+def: "Catalysis of the reaction: L-alanine + 3-oxopropanoate = beta-alanine + pyruvate." [RHEA:14077]
 synonym: "beta-alanine--pyruvate aminotransferase activity" RELATED [EC:2.6.1.18]
 synonym: "beta-alanine-alpha-alanine transaminase activity" RELATED [EC:2.6.1.18]
 synonym: "beta-alanine-pyruvate aminotransferase activity" EXACT []
@@ -139095,8 +139168,7 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phospholipids from one membrane bilayer leaflet to the other, by an ATP-independent mechanism." [GOC:cjm, PMID:20043909, PMID:20302864]
 comment: Nomenclature note. Scramblases are ATP-independent, non-selective, translocases inducing non-specific transbilayer movements across the membrane. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases).
-is_a: GO:0005548 ! phospholipid transporter activity
-is_a: GO:0140303 ! intramembrane lipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
 relationship: part_of GO:0017121 ! plasma membrane phospholipid scrambling
 
 [Term]
@@ -141677,7 +141749,6 @@
 namespace: biological_process
 def: "The alteration of an amino acid residue in a peptide." [GOC:mah]
 subset: gocheck_do_not_annotate
-subset: goslim_yeast
 is_a: GO:0036211 ! protein modification process
 
 [Term]
@@ -147341,12 +147412,18 @@
 
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
@@ -152330,12 +152407,13 @@
 
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
@@ -152345,14 +152423,16 @@
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
@@ -152362,17 +152442,19 @@
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
@@ -152380,6 +152462,7 @@
 property_value: skos:exactMatch EC:2.6.1.54
 property_value: skos:exactMatch RHEA:15877
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019164
@@ -152560,10 +152643,11 @@
 
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
@@ -152578,14 +152662,16 @@
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
@@ -152597,6 +152683,7 @@
 property_value: skos:exactMatch EC:2.6.1.59
 property_value: skos:exactMatch RHEA:10368
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0019181
@@ -153094,7 +153181,7 @@
 id: GO:0019241
 name: L-citrulline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-citrulline, N5-carbamoyl-L-ornithine, an alpha amino acid not found in proteins." [ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of L-citrulline." [GOC:curators]
 synonym: "citrulline breakdown" EXACT []
 synonym: "citrulline catabolism" EXACT []
 synonym: "citrulline degradation" EXACT []
@@ -153103,6 +153190,7 @@
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019242
@@ -155500,21 +155588,21 @@
 
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
@@ -155529,6 +155617,7 @@
 property_value: skos:narrowMatch MetaCyc:LCYSDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5329
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019449
@@ -155556,14 +155645,15 @@
 
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
@@ -155596,34 +155686,40 @@
 
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
@@ -155771,7 +155867,7 @@
 id: GO:0019470
 name: trans-4-hydroxy-L-proline catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of trans-4-hydroxy-L-proline, C5H9NO3, a derivative of the amino acid proline." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the breakdown of trans-4-hydroxy-L-proline." [GOC:curators]
 synonym: "4-hydroxyproline breakdown" EXACT []
 synonym: "4-hydroxyproline catabolism" EXACT []
 synonym: "4-hydroxyproline degradation" EXACT []
@@ -155784,6 +155880,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5159
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019471
@@ -155852,20 +155949,21 @@
 
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
@@ -155889,6 +155987,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY0-461
 property_value: skos:narrowMatch MetaCyc:PWY66-425
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019478
@@ -155960,7 +156059,7 @@
 id: GO:0019484
 name: beta-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine (3-aminopropanoic acid), an achiral amino acid and an isomer of alanine. It occurs free (e.g. in brain) and in combination (e.g. in pantothenate) but it is not a constituent of proteins." [GOC:jl, ISBN:0198506732]
+def: "The chemical reactions and pathways resulting in the breakdown of beta-alanine." [GOC:curators]
 synonym: "beta-alanine breakdown" EXACT []
 synonym: "beta-alanine catabolism" EXACT []
 synonym: "beta-alanine degradation" EXACT []
@@ -155974,6 +156073,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-1781
 property_value: skos:narrowMatch MetaCyc:PWY-8120
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019485
@@ -156185,7 +156285,7 @@
 id: GO:0019504
 name: L-proline betaine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of stachydrine, N-methylproline methylbetaine, the betaine derivative of L-proline." [PMID:10689197, PMID:1804402, PMID:24520058]
+def: "The chemical reactions and pathways resulting in the breakdown of L-proline betaine (stachydrine)." [PMID:10689197, PMID:1804402, PMID:24520058]
 synonym: "stachydrine breakdown" EXACT []
 synonym: "stachydrine catabolic process" EXACT []
 synonym: "stachydrine catabolism" EXACT []
@@ -156200,6 +156300,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8109
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23577" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31361" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0019505
@@ -156754,29 +156855,28 @@
 
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
@@ -158022,7 +158122,7 @@
 id: GO:0019665
 name: amino acid fermentation
 namespace: biological_process
-def: "The anaerobic chemical reactions and pathways resulting in the breakdown of amino acids to ammonia, CO2, H2, acetate and short chain fatty acids, under anoxic conditions." [GOC:curators, GOC:jl]
+def: "The anaerobic chemical reactions and pathways resulting in the breakdown of amino acids to ammonia, CO2, H2, acetate and short chain fatty acids, under anoxic conditions." [PMID:38821505]
 synonym: "anaerobic amino acid catabolic process" EXACT []
 is_a: GO:0006113 ! fermentation
 is_a: GO:0009063 ! amino acid catabolic process
@@ -158042,7 +158142,7 @@
 id: GO:0019667
 name: L-alanine fermentation
 namespace: biological_process
-def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-alanine, yielding acetylCoA. AcetylCoA can be further converted to ATP." [GOC:jl]
+def: "The anaerobic chemical reactions and pathways resulting in the breakdown of L-alanine, yielding acetylCoA. AcetylCoA can be further converted to ATP." [GOC:jl, PMID:38821505]
 synonym: "anaerobic L-alanine catabolic process" EXACT []
 xref: MetaCyc:PROPFERM-PWY
 xref: MetaCyc:PWY-8188
@@ -158093,13 +158193,11 @@
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
@@ -160621,12 +160719,9 @@
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
@@ -169870,6 +169965,7 @@
 subset: goslim_generic
 subset: goslim_pombe
 subset: goslim_prokaryote
+subset: goslim_yeast
 synonym: "cellular protein breakdown" EXACT []
 synonym: "cellular protein catabolic process" EXACT []
 synonym: "cellular protein catabolism" EXACT []
@@ -174632,7 +174728,6 @@
 synonym: "D-alanine formation" EXACT []
 synonym: "D-alanine synthesis" EXACT []
 is_a: GO:0006523 ! alanine biosynthetic process
-is_a: GO:0046436 ! D-alanine metabolic process
 is_a: GO:0046437 ! D-amino acid biosynthetic process
 
 [Term]
@@ -182055,9 +182150,10 @@
 
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
@@ -182068,6 +182164,7 @@
 property_value: skos:exactMatch EC:2.6.1.77
 property_value: skos:exactMatch RHEA:10420
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0031300
@@ -183251,7 +183348,6 @@
 name: regulation of protein modification process
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of the covalent alteration of one or more amino acid residues within a protein." [GOC:mah, GOC:tb]
-subset: goslim_yeast
 is_a: GO:0051246 ! regulation of protein metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0036211 ! protein modification process
@@ -202130,13 +202226,14 @@
 
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
@@ -202149,6 +202246,7 @@
 property_value: skos:exactMatch RHEA:12268
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25992" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033095
@@ -204928,7 +205026,7 @@
 xref: MetaCyc:PWY-5097
 is_a: GO:0009089 ! L-lysine biosynthetic process via diaminopimelate
 relationship: has_part GO:0008837 ! diaminopimelate epimerase activity
-relationship: has_part GO:0010285 ! L,L-diaminopimelate aminotransferase activity
+relationship: has_part GO:0010285 ! L,L-diaminopimelate:2-oxoglutarate transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30820" xsd:anyURI
 
 [Term]
@@ -206505,31 +206603,44 @@
 
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
@@ -206555,34 +206666,40 @@
 
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
@@ -211009,14 +211126,15 @@
 
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
@@ -211025,12 +211143,14 @@
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
@@ -211043,12 +211163,14 @@
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
@@ -211061,16 +211183,18 @@
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
@@ -211081,6 +211205,7 @@
 property_value: skos:exactMatch EC:2.6.1.80
 property_value: skos:exactMatch RHEA:22104
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0033856
@@ -226015,9 +226140,11 @@
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
@@ -229690,9 +229817,13 @@
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
@@ -231696,11 +231827,14 @@
 
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
 
@@ -231710,7 +231844,6 @@
 namespace: biological_process
 def: "Any process that increases the pH of the lysosomal lumen, measured by the concentration of the hydrogen ion." [GOC:bf, GOC:rph]
 synonym: "lysosome pH elevation" EXACT [GOC:bf, GOC:rph]
-is_a: GO:0035751 ! regulation of lysosomal lumen pH
 is_a: GO:0051454 ! intracellular pH elevation
 created_by: bf
 creation_date: 2011-03-23T10:24:24Z
@@ -233509,18 +233642,21 @@
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
 
@@ -235793,12 +235929,14 @@
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
 
@@ -248690,7 +248828,7 @@
 id: GO:0042170
 name: plastid membrane
 namespace: cellular_component
-def: "Either of the lipid bilayers that surround a plastid and form the plastid envelope." [GOC:mah]
+def: "Any lipid bilayer that surrounds a plastid or is part of the plastid envelope. Primary plastids (in plants, green algae, red algae, and glaucophytes) are surrounded by two membranes; complex plastids derived from secondary endosymbiosis are surrounded by three or four membranes." [GOC:mah, PMID:20124341]
 is_a: GO:0031090 ! organelle membrane
 intersection_of: GO:0016020 ! membrane
 intersection_of: part_of GO:0009536 ! plastid
@@ -255594,7 +255732,7 @@
 id: GO:0042853
 name: L-alanine catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of L-alanine, the L-enantiomer of 2-aminopropanoic acid, i.e. (2S)-2-aminopropanoic acid." [GOC:jl, GOC:jsg, GOC:mah]
+def: "The chemical reactions and pathways resulting in the breakdown of L-alanine." [GOC:curators]
 synonym: "L-alanine breakdown" EXACT []
 synonym: "L-alanine catabolism" EXACT []
 synonym: "L-alanine degradation" EXACT []
@@ -255608,6 +255746,7 @@
 property_value: skos:narrowMatch MetaCyc:ALADEG-PWY
 property_value: skos:narrowMatch MetaCyc:ALANINE-DEG3-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
 
 [Term]
 id: GO:0042854
@@ -262186,7 +262325,7 @@
 xref: Reactome:R-HSA-9856872 "Malate-aspartate shuttle"
 xref: Wikipedia:Malate-aspartate_shuttle
 is_a: GO:0019674 ! NAD+ metabolic process
-relationship: has_part GO:0004069 ! L-aspartate:2-oxoglutarate aminotransferase activity
+relationship: has_part GO:0004069 ! L-aspartate:2-oxoglutarate transaminase activity
 relationship: has_part GO:0030060 ! L-malate dehydrogenase (NAD+) activity
 relationship: has_part GO:1990542 ! mitochondrial transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28982" xsd:anyURI
@@ -262800,7 +262939,6 @@
 namespace: biological_process
 def: "The addition of an acyl group, any group or radical of the form RCO- where R is an organic group, to a protein amino acid." [GOC:jl]
 subset: gocheck_obsoletion_candidate
-subset: goslim_yeast
 synonym: "protein amino acid acylation" EXACT [GOC:bf]
 is_a: GO:0036211 ! protein modification process
 
@@ -265011,12 +265149,16 @@
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
@@ -265111,12 +265253,14 @@
 
 [Term]
 id: GO:0043760
-name: acetyldiaminopimelate aminotransferase activity
+name: acetyldiaminopimelate:2-oxoglutarate transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N-acetyl-L-2,6-diaminoheptanedioate + 2-oxoglutarate = N-acetyl-2-L-amino-6-oxoheptanedioate + L-glutamate." [PMID:1906065]
+synonym: "acetyldiaminopimelate aminotransferase activity" BROAD []
 synonym: "N-acetyl-diaminopimelate aminotransferase activity" EXACT []
 synonym: "N-acetyl-L,L-diaminopimelate aminotransferase activity" EXACT []
 is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0043761
@@ -265948,9 +266092,9 @@
 
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
@@ -265960,6 +266104,7 @@
 synonym: "succinyl ornithine transaminase activity" EXACT []
 synonym: "succinyl-ornithine transaminase activity" RELATED [EC:2.6.1.81]
 synonym: "succinylornithine aminotransferase activity" BROAD [EC:2.6.1.81]
+synonym: "succinylornithine transaminase activity" EXACT []
 xref: EC:2.6.1.81
 xref: KEGG_REACTION:R04217
 xref: MetaCyc:SUCCORNTRANSAM-RXN
@@ -265968,6 +266113,7 @@
 property_value: skos:exactMatch EC:2.6.1.81
 property_value: skos:exactMatch RHEA:16953
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0043826
@@ -267139,11 +267285,15 @@
 
 [Term]
 id: GO:0043911
-name: D-lysine transaminase activity
+name: D-lysine:2-oxoglutarate transaminase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: D-lysine + 2-oxoglutarate = L-glutamate + 6-amino-2-oxohexanoate." [GOC:jl, PMID:17259313]
+def: "Catalysis of the reaction: D-lysine + 2-oxoglutarate = 6-amino-2-oxohexanoate + L-glutamate." [PMID:17259313, RHEA:37587]
 synonym: "D-lysine aminotransferase activity" EXACT []
+synonym: "D-lysine transaminase activity" BROAD []
+xref: RHEA:37587
 is_a: GO:0008483 ! transaminase activity
+property_value: skos:exactMatch RHEA:37587
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0043912
@@ -280551,15 +280701,16 @@
 
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
@@ -280572,6 +280723,7 @@
 property_value: skos:exactMatch EC:2.6.1.76
 property_value: skos:exactMatch RHEA:11160
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0045304
@@ -281696,9 +281848,10 @@
 
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
@@ -281716,6 +281869,7 @@
 property_value: skos:exactMatch EC:2.6.1.36
 property_value: skos:exactMatch RHEA:21200
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0045485
@@ -294152,12 +294306,15 @@
 
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
@@ -296437,21 +296594,23 @@
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
@@ -298390,12 +298549,12 @@
 
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
@@ -298409,6 +298568,7 @@
 property_value: skos:exactMatch EC:2.6.1.85
 property_value: skos:exactMatch RHEA:11672
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0046821
@@ -305701,12 +305861,13 @@
 
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
@@ -305714,14 +305875,16 @@
 is_a: GO:0008483 ! transaminase activity
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
@@ -305736,16 +305899,18 @@
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
@@ -305754,14 +305919,16 @@
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
@@ -305773,18 +305940,20 @@
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
@@ -305793,12 +305962,14 @@
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
@@ -305811,15 +305982,17 @@
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
@@ -305829,12 +306002,13 @@
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
@@ -305843,6 +306017,7 @@
 synonym: "2-aminoethylphosphonate aminotransferase activity" RELATED [EC:2.6.1.37]
 synonym: "2-aminoethylphosphonate--pyruvate aminotransferase activity" RELATED [EC:2.6.1.37]
 synonym: "2-aminoethylphosphonate-pyruvate aminotransferase activity" EXACT []
+synonym: "2-aminoethylphosphonate-pyruvate transaminase activity" EXACT []
 xref: EC:2.6.1.37
 xref: KEGG_REACTION:R04152
 xref: MetaCyc:2.6.1.37-RXN
@@ -305851,20 +306026,21 @@
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
@@ -305881,16 +306057,18 @@
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
@@ -305900,14 +306078,16 @@
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
@@ -305918,12 +306098,13 @@
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
@@ -305937,15 +306118,17 @@
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
@@ -305962,12 +306145,13 @@
 
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
@@ -305977,17 +306161,19 @@
 xref: KEGG_REACTION:R02781
 xref: MetaCyc:2.6.1.50-RXN
 xref: RHEA:22920
-is_a: GO:0070548 ! L-glutamine aminotransferase activity
+is_a: GO:0008483 ! transaminase activity
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
@@ -305999,18 +306185,19 @@
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
@@ -306019,17 +306206,19 @@
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
@@ -306038,14 +306227,16 @@
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
@@ -306055,34 +306246,38 @@
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
+is_a: GO:0008483 ! transaminase activity
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
@@ -306090,13 +306285,15 @@
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
@@ -306106,13 +306303,15 @@
 is_a: GO:0008483 ! transaminase activity
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
@@ -306123,6 +306322,7 @@
 property_value: skos:exactMatch EC:2.6.1.72
 property_value: skos:exactMatch RHEA:15589
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047321
@@ -309859,10 +310059,11 @@
 
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
@@ -309878,13 +310079,15 @@
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
@@ -309897,6 +310100,7 @@
 property_value: skos:exactMatch EC:2.6.1.67
 property_value: skos:exactMatch RHEA:23600
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047538
@@ -310625,19 +310829,21 @@
 
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
@@ -310806,11 +311012,12 @@
 
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
@@ -310821,6 +311028,7 @@
 property_value: skos:exactMatch EC:2.6.1.48
 property_value: skos:exactMatch RHEA:10212
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047590
@@ -311588,13 +311796,14 @@
 
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
@@ -311605,6 +311814,7 @@
 property_value: skos:exactMatch EC:2.6.1.12
 property_value: skos:exactMatch RHEA:19953
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047636
@@ -312094,9 +312304,9 @@
 
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
@@ -312106,7 +312316,7 @@
 synonym: "alanine-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "alanine-gamma,delta-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
 synonym: "alanine:4,5-dioxovalerate aminotransferase activity" RELATED [EC:2.6.1.43]
-synonym: "aminolevulinate aminotransferase activity" EXACT []
+synonym: "aminolevulinate aminotransferase activity" BROAD []
 synonym: "aminolevulinic acid transaminase activity" RELATED [EC:2.6.1.43]
 synonym: "dioxovalerate transaminase activity" RELATED [EC:2.6.1.43]
 synonym: "DOVA transaminase activity" RELATED [EC:2.6.1.43]
@@ -312123,6 +312333,7 @@
 property_value: skos:exactMatch EC:2.6.1.43
 property_value: skos:exactMatch RHEA:12480
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047666
@@ -313393,10 +313604,11 @@
 
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
@@ -313407,6 +313619,7 @@
 property_value: skos:exactMatch EC:2.6.1.74
 property_value: skos:exactMatch RHEA:14553
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047741
@@ -314434,11 +314647,12 @@
 
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
@@ -314448,14 +314662,16 @@
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
@@ -314465,6 +314681,7 @@
 property_value: skos:exactMatch EC:2.6.1.75
 property_value: skos:exactMatch RHEA:13485
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047803
@@ -314607,11 +314824,12 @@
 
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
@@ -314626,6 +314844,7 @@
 property_value: skos:exactMatch EC:2.6.1.21
 property_value: skos:exactMatch RHEA:15869
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047811
@@ -315469,9 +315688,9 @@
 
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
@@ -315484,6 +315703,7 @@
 property_value: skos:exactMatch EC:2.6.1.24
 property_value: skos:exactMatch RHEA:19781
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047862
@@ -316933,9 +317153,9 @@
 
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
@@ -316948,15 +317168,17 @@
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
@@ -317160,13 +317382,14 @@
 
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
@@ -317177,6 +317400,7 @@
 property_value: skos:exactMatch EC:2.6.1.4
 property_value: skos:exactMatch RHEA:14089
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0047959
@@ -320154,7 +320378,8 @@
 def: "Any process that results in a change in the behavior of an organism as a result of a pain stimulus. Pain stimuli cause activation of nociceptors, peripheral receptors for pain, include receptors which are sensitive to painful mechanical stimuli, extreme heat or cold, and chemical stimuli." [GOC:jid]
 synonym: "behavioural response to pain" EXACT []
 is_a: GO:0007610 ! behavior
-relationship: part_of GO:0048265 ! response to pain
+is_a: GO:0048265 ! response to pain
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 
 [Term]
 id: GO:0048268
@@ -327664,13 +327889,14 @@
 
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
@@ -327683,6 +327909,7 @@
 property_value: skos:exactMatch RHEA:19393
 property_value: skos:relatedMatch MetaCyc:PWY-5324
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050066
@@ -328143,20 +328370,22 @@
 
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
@@ -330197,22 +330426,20 @@
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
@@ -331375,9 +331602,10 @@
 
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
@@ -331388,6 +331616,7 @@
 property_value: skos:exactMatch EC:2.6.1.45
 property_value: skos:exactMatch RHEA:19125
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050282
@@ -332084,13 +332313,14 @@
 
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
@@ -332099,6 +332329,7 @@
 property_value: skos:exactMatch EC:2.6.1.55
 property_value: skos:exactMatch RHEA:16353
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0050323
@@ -332760,23 +332991,25 @@
 
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
@@ -359549,44 +359782,51 @@
 
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
 
@@ -364797,10 +365037,13 @@
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
 
@@ -387024,10 +387267,12 @@
 
 [Term]
 id: GO:0062045
-name: L-lysine alpha-aminotransferase activity
+name: L-lysine:pyruvate alpha-transaminase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: L-lysine + pyruvate= epsilon-amino-alpha-ketocaproic acid (KAC) + alanine." [PMID:27758894, PMID:28330936]
+synonym: "L-lysine alpha-aminotransferase activity" BROAD []
 is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 created_by: dph
 creation_date: 2018-05-11T12:13:57Z
 
@@ -390984,11 +391229,15 @@
 
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
@@ -391000,7 +391249,6 @@
 synonym: "D-serine formation" EXACT []
 synonym: "D-serine synthesis" EXACT []
 is_a: GO:0046437 ! D-amino acid biosynthetic process
-is_a: GO:0070178 ! D-serine metabolic process
 
 [Term]
 id: GO:0070180
@@ -394817,10 +395065,12 @@
 
 [Term]
 id: GO:0070529
-name: L-tryptophan aminotransferase activity
+name: L-tryptophan transaminase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of an amino group from L-tryptophan to an acceptor, usually a 2-oxo acid." [GOC:mah]
+synonym: "L-tryptophan aminotransferase activity" EXACT []
 is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0070530
@@ -394972,10 +395222,12 @@
 
 [Term]
 id: GO:0070548
-name: L-glutamine aminotransferase activity
+name: L-glutamine transaminase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of an amino group from L-glutamine to an acceptor, usually a 2-oxo acid." [GOC:mah]
+synonym: "L-glutamine aminotransferase activity" EXACT []
 is_a: GO:0008483 ! transaminase activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0070549
@@ -423306,12 +423558,14 @@
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
 
@@ -424271,40 +424525,48 @@
 
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
+is_a: GO:0008483 ! transaminase activity
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
 
@@ -424654,20 +424916,21 @@
 
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
 
@@ -433644,7 +433907,7 @@
 synonym: "phosphatidylcholine floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
 synonym: "phosphatidylcholine-translocating ATPase activity" BROAD []
 xref: RHEA:38583
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
+is_a: GO:0008525 ! phosphatidylcholine intramembrane carrier activity
 is_a: GO:0140328 ! floppase activity
 property_value: skos:broadMatch RHEA:66132
 property_value: skos:exactMatch RHEA:38583
@@ -452449,11 +452712,12 @@
 
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
@@ -452463,6 +452727,7 @@
 property_value: skos:exactMatch EC:2.6.1.87
 property_value: skos:exactMatch RHEA:24710
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0099621
@@ -457134,7 +457399,9 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: mithramycin DK + NADPH + H+ = iso-mithramycin + NADP+. Note that  iso-mithramycin (iso-MTM) is a C2-epimer of mithramycin.  This intermediate appears to be biologically important because it is non-toxic, then exported out of the cell and finally spontaneously epimerized into the toxic mithramycin. This could represent a self-resistance mechanism against MTM toxicity." [PMID:31702856]
 xref: MetaCyc:RXN-13385
+xref: RHEA:85451
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch RHEA:85451
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30329" xsd:anyURI
 
@@ -462992,9 +463259,10 @@
 
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
@@ -463002,6 +463270,7 @@
 property_value: skos:exactMatch EC:2.6.1.102
 property_value: skos:exactMatch RHEA:36779
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31140" xsd:anyURI
 
 [Term]
 id: GO:0102934
@@ -468304,10 +468573,12 @@
 id: GO:0106340
 name: tRNA (guanosine(34)-2'-O)-methyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanosine(34) in tRNA + S-adenosyl-L-methionine = 2'-O-methylguanosine(34) in tRNA + H+ + S-adenosyl-L-homocysteine." [PMID:31943105]
+def: "Catalysis of the reaction: guanosine(34) in tRNA + S-adenosyl-L-methionine = 2'-O-methylguanosine(34) in tRNA + H+ + S-adenosyl-L-homocysteine." [PMID:31943105, RHEA:85171]
 xref: Reactome:R-HSA-9024161 "FTSJ1 2'-O-methylates guanosine-34 in tRNA(Phe)"
+xref: RHEA:85171
 is_a: GO:0016423 ! tRNA (guanine) methyltransferase activity
 property_value: skos:broadMatch EC:2.1.1.205
+property_value: skos:exactMatch RHEA:85171
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25257" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26085" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26086" xsd:anyURI
@@ -471502,13 +471773,15 @@
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
 
@@ -471550,7 +471823,6 @@
 def: "Removes a sphingolipid from a membrane or a monolayer lipid particle, transports it through the aqueous phase while protected in a hydrophobic pocket, and brings it to an acceptor membrane or lipid particle." [GOC:krc, PMID:20823909, PMID:24220498, PMID:25797198]
 synonym: "intermembrane sphingolipid transfer activity" NARROW []
 synonym: "sphingolipid carrier activity" NARROW []
-is_a: GO:0046624 ! sphingolipid transporter activity
 is_a: GO:0120013 ! lipid transfer activity
 relationship: has_part GO:0046625 ! sphingolipid binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
@@ -471582,7 +471854,6 @@
 xref: Reactome:R-HSA-1483087 "PI is exchanged with PC by PITPNB"
 xref: Reactome:R-HSA-1483211 "PC:PITPNB is transported from the Golgi membrane to the ER membrane"
 xref: Reactome:R-HSA-1483219 "PC is exchanged with PI by PITPNB"
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
 is_a: GO:0120014 ! phospholipid transfer activity
 relationship: has_part GO:0031210 ! phosphatidylcholine binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/12329" xsd:anyURI
@@ -476527,15 +476798,17 @@
 
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
 
@@ -480451,15 +480724,18 @@
 
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
 
@@ -480726,7 +481002,11 @@
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
@@ -480747,12 +481027,13 @@
 
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
@@ -480763,7 +481044,7 @@
 xref: MetaCyc:3.6.3.1-RXN
 xref: Reactome:R-HSA-939763 "P-type ATPases type IV transport external-facing APLs to internal side of the plasma membrane"
 xref: Reactome:R-HSA-947591 "P-type ATPases type IV transport internal-facing APLs to external side of the plasma membrane"
-is_a: GO:0140303 ! intramembrane lipid transporter activity
+is_a: GO:0140303 ! intramembrane lipid carrier activity
 is_a: GO:0140657 ! ATP-dependent activity
 property_value: skos:broadMatch RHEA:66132
 property_value: skos:exactMatch EC:7.6.2.1
@@ -480781,7 +481062,7 @@
 def: "Catalysis of the movement of lipids from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:20043909, PMID:25284293, Wikipedia:Flippase]
 comment: Nomenclature note. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases). Scramblases are ATP-independent, non-selective, inducing non-specific transbilayer movements across the membrane. The direction of the translocation should be taken into account for annotation (from the exoplasmic to the cytosolic leaflet of a membrane).
 synonym: "flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0140326 ! ATPase-coupled intramembrane lipid transporter activity
+is_a: GO:0140326 ! ATPase-coupled intramembrane lipid carrier activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
 creation_date: 2019-04-29T12:51:21Z
@@ -480793,7 +481074,7 @@
 def: "Catalysis of the movement of a lipid from the cytosolic to the exoplasmic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:20043909, PMID:25284293, Wikipedia:Flippase]
 comment: Nomenclature note. Flippases and floppases are ATP-dependent transbilayer lipid translocators. According to an extensively used, though not universal, nomenclature, they catalyze lipid transfer towards the inward monolayer (flippases) or towards the outward monolayer (floppases). Scramblases are ATP-independent, non-selective, inducing non-specific transbilayer movements across the membrane. The direction of the translocation should be taken into account for annotation (from the cytosolic to the exoplasmic leaflet of a membrane).
 synonym: "floppase activity (cytosolic to exoplasmic leaflet)" EXACT []
-is_a: GO:0140326 ! ATPase-coupled intramembrane lipid transporter activity
+is_a: GO:0140326 ! ATPase-coupled intramembrane lipid carrier activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
 creation_date: 2019-04-29T12:58:53Z
@@ -480874,7 +481155,9 @@
 synonym: "glycoprotein phospholipase C activity" EXACT []
 synonym: "glycosylphosphatidyl inositol-anchor protein phospholipase C activity" EXACT []
 synonym: "GPI-PLC activity" EXACT []
+xref: RHEA:86259
 is_a: GO:0004629 ! C-type glycerophospholipase activity
+property_value: skos:narrowMatch RHEA:86259
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28868" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31078" xsd:anyURI
 created_by: pg
@@ -480987,7 +481270,7 @@
 namespace: molecular_function
 def: "Catalysis of the movement of phosphatidylcholine from the exoplasmic to the cytosolic leaflet of a membrane, using energy from the hydrolysis of ATP." [PMID:11870854]
 synonym: "phosphatidylcholine flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0008525 ! phosphatidylcholine transporter activity
+is_a: GO:0008525 ! phosphatidylcholine intramembrane carrier activity
 is_a: GO:0140333 ! glycerophospholipid flippase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -481063,7 +481346,7 @@
 synonym: "glucosylceramide flippase activity" NARROW []
 synonym: "glycoceramide flippase activity" EXACT []
 synonym: "glycosylceramide flippase activity (exoplasmic to cytosolic leaflet)" EXACT []
-is_a: GO:0046624 ! sphingolipid transporter activity
+is_a: GO:0046624 ! sphingolipid intramembrane carrier activity
 is_a: GO:0140327 ! flippase activity
 property_value: skos:broadMatch RHEA:66132
 created_by: pg
@@ -485588,14 +485871,16 @@
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
@@ -485615,8 +485900,12 @@
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
@@ -496358,9 +496647,11 @@
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
@@ -496369,11 +496660,13 @@
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
@@ -496500,9 +496793,11 @@
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
@@ -496522,9 +496817,11 @@
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
@@ -496584,10 +496881,12 @@
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
@@ -496663,9 +496962,11 @@
 id: GO:0160298
 name: pyridinol guanylyltransferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + GTP + H+ = guanylylpyridinol + diphosphate." [PMID:24249552]
+def: "Catalysis of the reaction: 6-carboxymethyl-3,5-dimethyl-4-hydroxypyridin-2-ol + GTP + H+ = guanylylpyridinol + diphosphate." [PMID:24249552, RHEA:85479]
 xref: KEGG_REACTION:R13518
+xref: RHEA:85479
 is_a: GO:0070568 ! guanylyltransferase activity
+property_value: skos:exactMatch RHEA:85479
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30718" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-21T00:46:39Z
@@ -496685,9 +496986,11 @@
 id: GO:0160301
 name: guanylylpyridinol adenylase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: guanylylpyridinol + ATP + H+ = guanylylpyridinol-AMP + diphosphate." [PMID:25882909]
+def: "Catalysis of the reaction: guanylylpyridinol + ATP + H+ = guanylylpyridinol-AMP + diphosphate." [PMID:25882909, RHEA:85487]
 xref: KEGG_REACTION:R13520
+xref: RHEA:85487
 is_a: GO:0016779 ! nucleotidyltransferase activity
+property_value: skos:exactMatch RHEA:85487
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30720" xsd:anyURI
 created_by: rynl
 creation_date: 2025-08-21T22:49:37Z
@@ -496696,9 +496999,11 @@
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
@@ -496721,9 +497026,11 @@
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
@@ -497393,7 +497700,6 @@
 namespace: molecular_function
 def: "Enables the transfer of a lipid from one side of a membrane to the other." [GOC:curators]
 subset: gocheck_do_not_annotate
-is_a: GO:0005319 ! lipid transporter activity
 is_a: GO:0022857 ! transmembrane transporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27252" xsd:anyURI
 created_by: ew
@@ -515476,14 +515782,15 @@
 
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
 
@@ -515516,14 +515823,15 @@
 
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
 
@@ -531296,8 +531604,18 @@
 synonym: "L-isoleucine biosynthesis" EXACT [GOC:TermGenie]
 synonym: "L-isoleucine formation" EXACT [GOC:TermGenie]
 synonym: "L-isoleucine synthesis" EXACT [GOC:TermGenie]
+xref: MetaCyc:PWY-5101
+xref: MetaCyc:PWY-5103
+xref: MetaCyc:PWY-5104
+xref: MetaCyc:PWY-5108
+is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
-is_a: GO:0009097 ! isoleucine biosynthetic process
+is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
+property_value: skos:narrowMatch MetaCyc:PWY-5101
+property_value: skos:narrowMatch MetaCyc:PWY-5103
+property_value: skos:narrowMatch MetaCyc:PWY-5104
+property_value: skos:narrowMatch MetaCyc:PWY-5108
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30848" xsd:anyURI
 created_by: pde
 creation_date: 2012-12-13T23:32:56Z
 
@@ -537728,15 +538046,15 @@
 
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
 
@@ -538446,12 +538764,13 @@
 
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
 
@@ -604651,47 +604970,45 @@
 
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
 
@@ -622746,7 +623063,8 @@
 name: response to psychosocial stress
 namespace: biological_process
 def: "Any process that results in a change in state or activity of a cell or an organism (in terms of movement, secretion, enzyme production, gene expression, etc.) as a result of exposure to aversive or demanding psychological and social conditions that tax or exceed the behavioral resources of the organism." [PMID:22922217, PMID:26458179]
-is_a: GO:0006950 ! response to stress
+is_a: GO:0033555 ! multicellular organismal response to stress
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31407" xsd:anyURI
 created_by: sl
 creation_date: 2015-12-07T20:38:35Z
 
@@ -641911,8 +642229,10 @@
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
@@ -641993,9 +642313,11 @@
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
@@ -642313,6 +642635,87 @@
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
 [Typedef]
 id: ends_during
 name: ends during
```
