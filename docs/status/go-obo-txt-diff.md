# Textual diff for go.obo

```diff
--- go-lastrelease.obo	2026-04-29 06:23:52.886541788 +0000
+++ go.obo	2026-04-29 06:32:40.437458852 +0000
@@ -1,5 +1,5 @@
 format-version: 1.2
-data-version: releases/2026-03-25
+data-version: releases/2026-04-29
 subsetdef: chebi_ph7_3 "Rhea list of ChEBI terms representing the major species at pH 7.3."
 subsetdef: gocheck_do_not_annotate "Term not to be used for direct annotation"
 subsetdef: gocheck_obsoletion_candidate "Terms planned for obsoletion"
@@ -44,7 +44,7 @@
 property_value: has_ontology_root_term GO:0003674
 property_value: has_ontology_root_term GO:0005575
 property_value: has_ontology_root_term GO:0008150
-property_value: owl:versionInfo "2026-03-25" xsd:string
+property_value: owl:versionInfo "2026-04-29" xsd:string
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
@@ -1102,7 +1105,7 @@
 synonym: "histidine synthesis" EXACT []
 xref: MetaCyc:HISTSYN-PWY
 xref: MetaCyc:PWY-5029
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 is_a: GO:0052803 ! imidazole-containing compound metabolic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
@@ -1466,12 +1469,16 @@
 xref: Reactome:R-HSA-75883 "DHRS7B reduces GO3P to HXDG3P"
 xref: RHEA:17341
 xref: RHEA:36175
+xref: RHEA:40939
+xref: RHEA:66452
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.101
 property_value: skos:exactMatch MetaCyc:ACYLGLYCERONE-PHOSPHATE-REDUCTASE-RXN
 property_value: skos:exactMatch RHEA:17341
 property_value: skos:narrowMatch MetaCyc:RXN-15046
 property_value: skos:narrowMatch RHEA:36175
+property_value: skos:narrowMatch RHEA:40939
+property_value: skos:narrowMatch RHEA:66452
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 
@@ -1501,12 +1508,13 @@
 id: GO:0000145
 name: exocyst
 namespace: cellular_component
-def: "A protein complex peripherally associated with the plasma membrane that determines where vesicles dock and fuse. At least eight complex components are conserved between yeast and mammals." [GOC:cilia, PMID:15292201, PMID:27243008, PMID:9700152]
+def: "A vesicle tethering complex peripherally associated with the plasma membrane that determines where vesicles dock and fuse. At least eight complex components are conserved between yeast and mammals." [GOC:cilia, PMID:15292201, PMID:27243008, PMID:9700152]
 synonym: "exocyst complex" EXACT []
 synonym: "Sec6/8 complex" EXACT []
 xref: Wikipedia:Exocyst
 is_a: GO:0099023 ! vesicle tethering complex
 relationship: part_of GO:0005938 ! cell cortex
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31922" xsd:anyURI
 
 [Term]
 id: GO:0000146
@@ -1732,7 +1740,7 @@
 synonym: "tryptophan synthesis" RELATED []
 xref: MetaCyc:TRPSYN-PWY
 is_a: GO:0006568 ! L-tryptophan metabolic process
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 is_a: GO:0046219 ! indolalkylamine biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 
@@ -1819,7 +1827,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "inactivation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0000175
@@ -2816,10 +2824,18 @@
 xref: Reactome:R-HSA-194718 "4-carboxycholesta-8(9),24-dien-3beta-ol is decarboxylated and oxidized to form cholesta-8(9),24-dien-3-one (zymosterone)"
 xref: Reactome:R-HSA-9945787 "NSDHL decarboxylates 4a-carboxy-5a-cholest-8-ene-3b-ol to 5a-cholest-8-en-3-one"
 xref: Reactome:R-HSA-9945822 "NSDHL decarboxylates 4a-carboxy-4b-methyl-5a-cholest-8-en-3b-ol to 4a-methyl-5a-cholest-8-en-3b-ol"
+xref: RHEA:20673
+xref: RHEA:33447
 xref: RHEA:34771
+xref: RHEA:60088
+xref: RHEA:60096
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.170
+property_value: skos:narrowMatch RHEA:20673
+property_value: skos:narrowMatch RHEA:33447
 property_value: skos:narrowMatch RHEA:34771
+property_value: skos:narrowMatch RHEA:60088
+property_value: skos:narrowMatch RHEA:60096
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20597" xsd:anyURI
 
 [Term]
@@ -3356,12 +3372,13 @@
 id: GO:0000293
 name: ferric-chelate reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 Fe3+-siderophore + electron donor = 2 Fe2+-siderophore + electron acceptor." [PMID:33559753]
+def: "Catalysis of the reaction: 2 Fe3+-chelate + electron donor = 2 Fe2+-chelate + electron acceptor." [PMID:33559753]
 synonym: "ferric chelate reductase activity" EXACT []
 synonym: "iron chelate reductase activity" EXACT []
-is_a: GO:0016722 ! oxidoreductase activity, acting on metal ions
+is_a: GO:7770068 ! ferric iron reductase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21029" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26726" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27593" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30815" xsd:anyURI
 
 [Term]
@@ -5264,6 +5281,7 @@
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: 3-sulfino-L-alanine (cysteinesulfinate) (out) + H+(in) + L-glutamate(in) = 3-sulfino-L-alanine(in) + H+(out) + L-glutamate(out)." [PMID:11566871, RHEA:70967]
 xref: RHEA:70967
 is_a: GO:0000099 ! sulfur amino acid transmembrane transporter activity
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015078 ! proton transmembrane transporter activity
 is_a: GO:0015175 ! neutral L-amino acid transmembrane transporter activity
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
@@ -5818,14 +5836,15 @@
 
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
@@ -6075,6 +6094,14 @@
 xref: MetaCyc:RXN4FS-2
 xref: RHEA:32735
 xref: RHEA:32739
+xref: RHEA:46112
+xref: RHEA:70623
+xref: RHEA:70743
+xref: RHEA:70747
+xref: RHEA:70755
+xref: RHEA:70759
+xref: RHEA:70767
+xref: RHEA:70771
 is_a: GO:0008170 ! N-methyltransferase activity
 is_a: GO:0008757 ! S-adenosylmethionine-dependent methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.71
@@ -6084,6 +6111,14 @@
 property_value: skos:narrowMatch MetaCyc:RXN4FS-2
 property_value: skos:narrowMatch RHEA:32735
 property_value: skos:narrowMatch RHEA:32739
+property_value: skos:narrowMatch RHEA:46112
+property_value: skos:narrowMatch RHEA:70623
+property_value: skos:narrowMatch RHEA:70743
+property_value: skos:narrowMatch RHEA:70747
+property_value: skos:narrowMatch RHEA:70755
+property_value: skos:narrowMatch RHEA:70759
+property_value: skos:narrowMatch RHEA:70767
+property_value: skos:narrowMatch RHEA:70771
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
 [Term]
@@ -7172,36 +7207,46 @@
 
 [Term]
 id: GO:0000947
-name: amino acid catabolic process to alcohol via Ehrlich pathway
+name: obsolete amino acid catabolic process to alcohol via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of amino acids to produce alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
-is_a: GO:0000955 ! amino acid catabolic process via Ehrlich pathway
-is_a: GO:0046165 ! alcohol biosynthetic process
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of amino acids to produce alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000948
-name: amino acid catabolic process to carboxylic acid via Ehrlich pathway
+name: obsolete amino acid catabolic process to carboxylic acid via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
-is_a: GO:0000955 ! amino acid catabolic process via Ehrlich pathway
-is_a: GO:0046394 ! carboxylic acid biosynthetic process
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000949
-name: aromatic amino acid family catabolic process to alcohol via Ehrlich pathway
+name: obsolete aromatic amino acid family catabolic process to alcohol via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of aromatic amino acids to produce aromatic alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When an aromatic family amino acid, phenylalanine, tyrosine, or tryptophan, is used as the substrate, 2-phenylethanol, 4-hydroxyphenylethanol, or tryptophol, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
-is_a: GO:0000947 ! amino acid catabolic process to alcohol via Ehrlich pathway
-is_a: GO:0009074 ! aromatic amino acid family catabolic process
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of aromatic amino acids to produce aromatic alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When an aromatic family amino acid, phenylalanine, tyrosine, or tryptophan, is used as the substrate, 2-phenylethanol, 4-hydroxyphenylethanol, or tryptophol, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
+consider: GO:0006559
+consider: GO:0006569
+consider: GO:0006572
 
 [Term]
 id: GO:0000950
-name: branched-chain amino acid catabolic process to alcohol via Ehrlich pathway
+name: obsolete branched-chain amino acid catabolic process to alcohol via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of branched chain amino acids to produce branched chain alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When a branched chain family amino acid, leucine, isoleucine, or valine, is used as the substrate, 3-methylbutanol, 2-methylbutanol, or 2-methylpropanol, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of branched chain amino acids to produce branched chain alcohols with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When a branched chain family amino acid, leucine, isoleucine, or valine, is used as the substrate, 3-methylbutanol, 2-methylbutanol, or 2-methylpropanol, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives may be produced instead of alcohols." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
 synonym: "branched chain family amino acid catabolic process to alcohol via Ehrlich pathway" EXACT [GOC:krc]
-is_a: GO:0000947 ! amino acid catabolic process to alcohol via Ehrlich pathway
-is_a: GO:0009083 ! branched-chain amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
+consider: GO:0006550
+consider: GO:0006552
+consider: GO:0006574
 
 [Term]
 id: GO:0000951
@@ -7215,20 +7260,28 @@
 
 [Term]
 id: GO:0000952
-name: aromatic amino acid family catabolic process to carboxylic acid via Ehrlich pathway
+name: obsolete aromatic amino acid family catabolic process to carboxylic acid via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When an aromatic family amino acid, phenylalanine, tyrosine, or tryptophan, is used as the substrate, 2-phenylethanoate, 4-hydroxyphenylethanoate, or 2-(Indol-3-yl)-ethanoate, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
-is_a: GO:0000948 ! amino acid catabolic process to carboxylic acid via Ehrlich pathway
-is_a: GO:0009074 ! aromatic amino acid family catabolic process
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When an aromatic family amino acid, phenylalanine, tyrosine, or tryptophan, is used as the substrate, 2-phenylethanoate, 4-hydroxyphenylethanoate, or 2-(Indol-3-yl)-ethanoate, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
+consider: GO:0006559
+consider: GO:0006569
+consider: GO:0006572
 
 [Term]
 id: GO:0000953
-name: branched-chain amino acid catabolic process to carboxylic acid via Ehrlich pathway
+name: obsolete branched-chain amino acid catabolic process to carboxylic acid via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When a branched chain family amino acid, leucine, isoleucine, or valine, is used as the substrate, 3-methylbutanoate, 2-methylbutanoate, or 2-methylpropanoate, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of amino acids to produce carboxylic acids with one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. When a branched chain family amino acid, leucine, isoleucine, or valine, is used as the substrate, 3-methylbutanoate, 2-methylbutanoate, or 2-methylpropanoate, respectively, is produced. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of carboxylic acids, sometimes collectively referred to as fusel acids. Depending on the redox state of the cells, alcohol derivatives may be produced instead of carboxylic acids." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
 synonym: "branched chain family amino acid catabolic process to carboxylic acid via Ehrlich pathway" EXACT [GOC:krc]
-is_a: GO:0000948 ! amino acid catabolic process to carboxylic acid via Ehrlich pathway
-is_a: GO:0009083 ! branched-chain amino acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
+consider: GO:0006550
+consider: GO:0006552
+consider: GO:0006574
 
 [Term]
 id: GO:0000954
@@ -7242,10 +7295,12 @@
 
 [Term]
 id: GO:0000955
-name: amino acid catabolic process via Ehrlich pathway
+name: obsolete amino acid catabolic process via Ehrlich pathway
 namespace: biological_process
-def: "The chemical reactions and pathways involving the catabolism of amino acids to produce alcohols or carboxylic acids containing one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives, sometimes referred to as fusel acids, may be produced instead of alcohols." [GOC:krc, PMID:18281432]
-is_a: GO:0009063 ! amino acid catabolic process
+def: "OBSOLETE. The chemical reactions and pathways involving the catabolism of amino acids to produce alcohols or carboxylic acids containing one carbon less than the starting amino acid. In S. cerevisiae, this is known to occur for leucine, isoleucine, valine, methionine, phenylalanine, tyrosine, or tryptophan. Often referred to as the Ehrlich pathway, these reactions generally occur during fermentation to produce a variety of alcohols, often collectively referred to as fusel alcohols. Depending on the redox state of the cells, carboxylic acid derivatives, sometimes referred to as fusel acids, may be produced instead of alcohols." [GOC:krc, PMID:18281432]
+comment: This term was obsoleted because it represents multiple specific pathways. Consider specific amino acid catabolic processes.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0000956
@@ -9883,7 +9938,6 @@
 name: glycerophosphodiester transmembrane transport
 namespace: biological_process
 def: "The process in which a glycerophosphodiester is transported across a membrane. Glycerophosphodiesters are small molecules composed of glycerol-3-phosphate and an alcohol, for example, glycerophosphoinositol." [GOC:mcc, PMID:12912892]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -13143,8 +13197,9 @@
 synonym: "5-HT secretion" EXACT []
 synonym: "5-hydroxytryptamine secretion" EXACT []
 synonym: "serotonin release" RELATED [GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0023061 ! signal release
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0001821
@@ -16125,8 +16180,8 @@
 def: "An actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell, contain an F-actin-rich core surrounded by a ring structure containing proteins such as vinculin and talin, and have a diameter of 0.5 mm." [PMID:12837608, PMID:15890982]
 comment: Note that podosomes can be distinguished from other F-actin-rich structures or from other matrix contacts. For example, focal adhesions and focal contacts do not display a core structure of F-actin. Unlike focal adhesions, podosome assembly does not require de novo protein synthesis. However, most of the podosome ring components are found in focal adhesions and other cell-matrix contacts. Podosomes are typically found in cells that cross tissue boundaries, recruited to the leading edge of migrating cells, and are often sites of extracellular matrix degradation.
 xref: Wikipedia:Podosome
-is_a: GO:0043232 ! intracellular membraneless organelle
-relationship: part_of GO:0015629 ! actin cytoskeleton
+is_a: GO:0098858 ! actin-based cell projection
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0002103
@@ -16456,7 +16511,7 @@
 id: GO:0002143
 name: tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:16871210]
+def: "The process in which a uridine residue at position 34 in the anticodon of a tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:16871210]
 comment: In E. coli, the first step of the reaction is reductive elimination of sulfur from L-cysteine by IscS cysteine desulfurase to form an enzyme-bound cysteine-persulfide intermediate. Then, five essential gene products, TusA, TusB, TusC, TusD and TusE, mediate a sulfur relay that delivers the terminal sulfur of persulfide from IscS to MnmA12. The last protein, MnmA catalyzes the transfer of the sulfur from IscS to an ATP activated U34 of the tRNA.
 synonym: "tRNA wobble uridine thiolation" EXACT [GOC:mah]
 synonym: "wobble position s2U biosynthesis" EXACT []
@@ -31376,7 +31431,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003755
@@ -31445,7 +31500,7 @@
 is_obsolete: true
 consider: GO:0006457
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0003762
@@ -32283,17 +32338,25 @@
 xref: Reactome:R-HSA-422454 "Polysialylation of NCAM1"
 xref: Reactome:R-HSA-9845587 "ST8SIA5 transfers Neu5Ac to gangliosides"
 xref: RHEA:19313
+xref: RHEA:41760
+xref: RHEA:41768
+xref: RHEA:41772
 xref: RHEA:48288
 xref: RHEA:48912
 xref: RHEA:48924
+xref: RHEA:48928
 xref: RHEA:48932
 xref: RHEA:77387
 is_a: GO:0008373 ! sialyltransferase activity
 property_value: skos:exactMatch EC:2.4.3.8
 property_value: skos:exactMatch RHEA:19313
+property_value: skos:narrowMatch RHEA:41760
+property_value: skos:narrowMatch RHEA:41768
+property_value: skos:narrowMatch RHEA:41772
 property_value: skos:narrowMatch RHEA:48288
 property_value: skos:narrowMatch RHEA:48912
 property_value: skos:narrowMatch RHEA:48924
+property_value: skos:narrowMatch RHEA:48928
 property_value: skos:narrowMatch RHEA:48932
 property_value: skos:narrowMatch RHEA:77387
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -32459,6 +32522,7 @@
 xref: RHEA:56268
 xref: RHEA:82903
 xref: RHEA:82947
+xref: RHEA:82983
 is_a: GO:0008373 ! sialyltransferase activity
 property_value: skos:exactMatch EC:2.4.3.1
 property_value: skos:exactMatch RHEA:52104
@@ -32467,6 +32531,7 @@
 property_value: skos:narrowMatch RHEA:56268
 property_value: skos:narrowMatch RHEA:82903
 property_value: skos:narrowMatch RHEA:82947
+property_value: skos:narrowMatch RHEA:82983
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -32602,10 +32667,15 @@
 xref: RHEA:33187
 xref: RHEA:33315
 xref: RHEA:33319
+xref: RHEA:35903
+xref: RHEA:35907
 xref: RHEA:35911
 xref: RHEA:35915
+xref: RHEA:37131
 xref: RHEA:37135
 xref: RHEA:37139
+xref: RHEA:37143
+xref: RHEA:37147
 xref: RHEA:37151
 xref: RHEA:37155
 xref: RHEA:37159
@@ -32619,10 +32689,14 @@
 xref: RHEA:37427
 xref: RHEA:37435
 xref: RHEA:37439
+xref: RHEA:37443
 xref: RHEA:37451
+xref: RHEA:37455
 xref: RHEA:37595
 xref: RHEA:37603
 xref: RHEA:37607
+xref: RHEA:42588
+xref: RHEA:55304
 is_a: GO:0016411 ! acylglycerol O-acyltransferase activity
 is_a: GO:0042171 ! lysophosphatidic acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.51
@@ -32630,10 +32704,15 @@
 property_value: skos:narrowMatch RHEA:33187
 property_value: skos:narrowMatch RHEA:33315
 property_value: skos:narrowMatch RHEA:33319
+property_value: skos:narrowMatch RHEA:35903
+property_value: skos:narrowMatch RHEA:35907
 property_value: skos:narrowMatch RHEA:35911
 property_value: skos:narrowMatch RHEA:35915
+property_value: skos:narrowMatch RHEA:37131
 property_value: skos:narrowMatch RHEA:37135
 property_value: skos:narrowMatch RHEA:37139
+property_value: skos:narrowMatch RHEA:37143
+property_value: skos:narrowMatch RHEA:37147
 property_value: skos:narrowMatch RHEA:37151
 property_value: skos:narrowMatch RHEA:37155
 property_value: skos:narrowMatch RHEA:37159
@@ -32647,10 +32726,14 @@
 property_value: skos:narrowMatch RHEA:37427
 property_value: skos:narrowMatch RHEA:37435
 property_value: skos:narrowMatch RHEA:37439
+property_value: skos:narrowMatch RHEA:37443
 property_value: skos:narrowMatch RHEA:37451
+property_value: skos:narrowMatch RHEA:37455
 property_value: skos:narrowMatch RHEA:37595
 property_value: skos:narrowMatch RHEA:37603
 property_value: skos:narrowMatch RHEA:37607
+property_value: skos:narrowMatch RHEA:42588
+property_value: skos:narrowMatch RHEA:55304
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -32781,6 +32864,16 @@
 xref: Reactome:R-HSA-6800334 "MOGAT1,2,3 transfer acyl group from acyl-CoA to 2-acylglycerol to form DAG"
 xref: RHEA:16741
 xref: RHEA:32947
+xref: RHEA:37911
+xref: RHEA:38051
+xref: RHEA:38059
+xref: RHEA:38063
+xref: RHEA:38067
+xref: RHEA:38071
+xref: RHEA:38075
+xref: RHEA:38079
+xref: RHEA:38083
+xref: RHEA:38087
 xref: RHEA:38467
 xref: RHEA:39951
 xref: RHEA:77271
@@ -32796,6 +32889,16 @@
 property_value: skos:exactMatch EC:2.3.1.22
 property_value: skos:exactMatch RHEA:16741
 property_value: skos:narrowMatch RHEA:32947
+property_value: skos:narrowMatch RHEA:37911
+property_value: skos:narrowMatch RHEA:38051
+property_value: skos:narrowMatch RHEA:38059
+property_value: skos:narrowMatch RHEA:38063
+property_value: skos:narrowMatch RHEA:38067
+property_value: skos:narrowMatch RHEA:38071
+property_value: skos:narrowMatch RHEA:38075
+property_value: skos:narrowMatch RHEA:38079
+property_value: skos:narrowMatch RHEA:38083
+property_value: skos:narrowMatch RHEA:38087
 property_value: skos:narrowMatch RHEA:38467
 property_value: skos:narrowMatch RHEA:39951
 property_value: skos:narrowMatch RHEA:77271
@@ -32935,11 +33038,13 @@
 xref: Reactome:R-HSA-6785933 "UGT8 transfers Gal from UDP-Gal to CERA"
 xref: RHEA:10856
 xref: RHEA:13093
+xref: RHEA:43400
 xref: RHEA:44896
 is_a: GO:0035250 ! UDP-galactosyltransferase activity
 property_value: skos:exactMatch EC:2.4.1.47
 property_value: skos:exactMatch RHEA:13093
 property_value: skos:narrowMatch RHEA:10856
+property_value: skos:narrowMatch RHEA:43400
 property_value: skos:narrowMatch RHEA:44896
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27410" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27679" xsd:anyURI
@@ -32986,11 +33091,13 @@
 xref: MetaCyc:2-METHYLACYL-COA-DEHYDROGENASE-RXN
 xref: RHEA:43780
 xref: RHEA:44180
+xref: RHEA:48256
 is_a: GO:0016937 ! short-chain fatty acyl-CoA dehydrogenase activity
 property_value: skos:exactMatch EC:1.3.8.5
 property_value: skos:narrowMatch MetaCyc:2-METHYLACYL-COA-DEHYDROGENASE-RXN
 property_value: skos:narrowMatch RHEA:43780
 property_value: skos:narrowMatch RHEA:44180
+property_value: skos:narrowMatch RHEA:48256
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23472" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23497" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26437" xsd:anyURI
@@ -33025,10 +33132,12 @@
 xref: Reactome:R-HSA-196372 "17-Hydroxypregnenolone is dehydrogenated to form pregn-5-ene-3,20-dione-17-ol"
 xref: RHEA:24076
 xref: RHEA:43932
+xref: RHEA:56932
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.145
 property_value: skos:narrowMatch RHEA:24076
 property_value: skos:narrowMatch RHEA:43932
+property_value: skos:narrowMatch RHEA:56932
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28011" xsd:anyURI
 
 [Term]
@@ -33100,18 +33209,36 @@
 xref: Reactome:R-HSA-77331 "(S)-Hydroxyoctanoyl-CoA+NAD<=>3-Oxooctanoyl-CoA+NADH+H"
 xref: Reactome:R-HSA-77342 "(S)-Hydroxydecanoyl-CoA+NAD<=>3-Oxodecanoyl-CoA+NADH+H"
 xref: RHEA:22432
+xref: RHEA:30799
+xref: RHEA:31143
+xref: RHEA:31179
+xref: RHEA:31187
+xref: RHEA:31195
 xref: RHEA:34851
 xref: RHEA:40211
 xref: RHEA:78919
 xref: RHEA:78923
+xref: RHEA:83003
+xref: RHEA:84419
+xref: RHEA:84683
+xref: RHEA:84687
 xref: UM-BBD_reactionID:r1063
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.35
 property_value: skos:exactMatch RHEA:22432
+property_value: skos:narrowMatch RHEA:30799
+property_value: skos:narrowMatch RHEA:31143
+property_value: skos:narrowMatch RHEA:31179
+property_value: skos:narrowMatch RHEA:31187
+property_value: skos:narrowMatch RHEA:31195
 property_value: skos:narrowMatch RHEA:34851
 property_value: skos:narrowMatch RHEA:40211
 property_value: skos:narrowMatch RHEA:78919
 property_value: skos:narrowMatch RHEA:78923
+property_value: skos:narrowMatch RHEA:83003
+property_value: skos:narrowMatch RHEA:84419
+property_value: skos:narrowMatch RHEA:84683
+property_value: skos:narrowMatch RHEA:84687
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30577" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31581" xsd:anyURI
 
@@ -33513,11 +33640,12 @@
 
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
@@ -33525,8 +33653,10 @@
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
@@ -33534,9 +33664,11 @@
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
@@ -35786,24 +35918,102 @@
 xref: Reactome:R-HSA-77340 "3-Oxodecanoyl-CoA+CoA-SH<=>Octanoyl-CoA"
 xref: Reactome:R-HSA-8874745 "ACAA2 tetramer transfers acyl group from Ac-CoA to acyl-CoA forming 3OA-CoA and CoA-SH"
 xref: RHEA:21564
+xref: RHEA:31087
+xref: RHEA:31091
+xref: RHEA:31111
+xref: RHEA:31183
+xref: RHEA:31203
 xref: RHEA:34799
+xref: RHEA:35279
+xref: RHEA:39131
+xref: RHEA:39147
 xref: RHEA:46312
+xref: RHEA:47400
+xref: RHEA:47444
+xref: RHEA:47460
 xref: RHEA:67224
+xref: RHEA:78567
+xref: RHEA:78583
+xref: RHEA:78599
+xref: RHEA:78639
 xref: RHEA:78895
 xref: RHEA:78899
 xref: RHEA:78903
 xref: RHEA:78907
+xref: RHEA:82935
+xref: RHEA:82943
+xref: RHEA:83007
+xref: RHEA:83083
+xref: RHEA:83095
+xref: RHEA:83099
+xref: RHEA:83135
+xref: RHEA:83219
+xref: RHEA:83251
+xref: RHEA:83331
+xref: RHEA:83367
+xref: RHEA:83383
+xref: RHEA:83399
+xref: RHEA:84447
+xref: RHEA:84451
+xref: RHEA:84455
+xref: RHEA:84459
+xref: RHEA:84695
+xref: RHEA:84699
+xref: RHEA:84703
+xref: RHEA:84707
+xref: RHEA:84711
+xref: RHEA:84715
+xref: RHEA:84839
 xref: UM-BBD_reactionID:r1051
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.16
 property_value: skos:exactMatch RHEA:21564
+property_value: skos:narrowMatch RHEA:31087
+property_value: skos:narrowMatch RHEA:31091
+property_value: skos:narrowMatch RHEA:31111
+property_value: skos:narrowMatch RHEA:31183
+property_value: skos:narrowMatch RHEA:31203
 property_value: skos:narrowMatch RHEA:34799
+property_value: skos:narrowMatch RHEA:35279
+property_value: skos:narrowMatch RHEA:39131
+property_value: skos:narrowMatch RHEA:39147
 property_value: skos:narrowMatch RHEA:46312
+property_value: skos:narrowMatch RHEA:47400
+property_value: skos:narrowMatch RHEA:47444
+property_value: skos:narrowMatch RHEA:47460
 property_value: skos:narrowMatch RHEA:67224
+property_value: skos:narrowMatch RHEA:78567
+property_value: skos:narrowMatch RHEA:78583
+property_value: skos:narrowMatch RHEA:78599
+property_value: skos:narrowMatch RHEA:78639
 property_value: skos:narrowMatch RHEA:78895
 property_value: skos:narrowMatch RHEA:78899
 property_value: skos:narrowMatch RHEA:78903
 property_value: skos:narrowMatch RHEA:78907
+property_value: skos:narrowMatch RHEA:82935
+property_value: skos:narrowMatch RHEA:82943
+property_value: skos:narrowMatch RHEA:83007
+property_value: skos:narrowMatch RHEA:83083
+property_value: skos:narrowMatch RHEA:83095
+property_value: skos:narrowMatch RHEA:83099
+property_value: skos:narrowMatch RHEA:83135
+property_value: skos:narrowMatch RHEA:83219
+property_value: skos:narrowMatch RHEA:83251
+property_value: skos:narrowMatch RHEA:83331
+property_value: skos:narrowMatch RHEA:83367
+property_value: skos:narrowMatch RHEA:83383
+property_value: skos:narrowMatch RHEA:83399
+property_value: skos:narrowMatch RHEA:84447
+property_value: skos:narrowMatch RHEA:84451
+property_value: skos:narrowMatch RHEA:84455
+property_value: skos:narrowMatch RHEA:84459
+property_value: skos:narrowMatch RHEA:84695
+property_value: skos:narrowMatch RHEA:84699
+property_value: skos:narrowMatch RHEA:84703
+property_value: skos:narrowMatch RHEA:84707
+property_value: skos:narrowMatch RHEA:84711
+property_value: skos:narrowMatch RHEA:84715
+property_value: skos:narrowMatch RHEA:84839
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -36397,12 +36607,142 @@
 xref: Reactome:R-HSA-71707 "ethanol + NAD+ => acetaldehyde + NADH + H+"
 xref: RHEA:10736
 xref: RHEA:10740
+xref: RHEA:12216
+xref: RHEA:12785
+xref: RHEA:13221
+xref: RHEA:15757
+xref: RHEA:16317
+xref: RHEA:16821
+xref: RHEA:23552
+xref: RHEA:30027
+xref: RHEA:32343
+xref: RHEA:34347
+xref: RHEA:35463
+xref: RHEA:35615
+xref: RHEA:37167
+xref: RHEA:38215
+xref: RHEA:41984
+xref: RHEA:42012
+xref: RHEA:42016
+xref: RHEA:42020
+xref: RHEA:42052
+xref: RHEA:42056
+xref: RHEA:42060
+xref: RHEA:42184
+xref: RHEA:42188
+xref: RHEA:43924
+xref: RHEA:45120
+xref: RHEA:48728
+xref: RHEA:48748
+xref: RHEA:48756
+xref: RHEA:48760
+xref: RHEA:50704
+xref: RHEA:55936
+xref: RHEA:58848
+xref: RHEA:60632
+xref: RHEA:60668
+xref: RHEA:60672
+xref: RHEA:60676
+xref: RHEA:60712
+xref: RHEA:60972
+xref: RHEA:60976
+xref: RHEA:60980
+xref: RHEA:60984
+xref: RHEA:60988
+xref: RHEA:62064
+xref: RHEA:62392
+xref: RHEA:63260
+xref: RHEA:63740
+xref: RHEA:64060
+xref: RHEA:64068
+xref: RHEA:64516
+xref: RHEA:64560
+xref: RHEA:64692
+xref: RHEA:64700
+xref: RHEA:64704
+xref: RHEA:68108
+xref: RHEA:70231
+xref: RHEA:75115
+xref: RHEA:75419
+xref: RHEA:75423
+xref: RHEA:79419
+xref: RHEA:80735
+xref: RHEA:81603
+xref: RHEA:86103
+xref: RHEA:86111
+xref: RHEA:86115
+xref: RHEA:86119
 is_a: GO:0018455 ! alcohol dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.1.1.1
 property_value: skos:narrowMatch MetaCyc:ALCOHOL-DEHYDROG-GENERIC-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-12448
 property_value: skos:narrowMatch RHEA:10736
 property_value: skos:narrowMatch RHEA:10740
+property_value: skos:narrowMatch RHEA:12216
+property_value: skos:narrowMatch RHEA:12785
+property_value: skos:narrowMatch RHEA:13221
+property_value: skos:narrowMatch RHEA:15757
+property_value: skos:narrowMatch RHEA:16317
+property_value: skos:narrowMatch RHEA:16821
+property_value: skos:narrowMatch RHEA:23552
+property_value: skos:narrowMatch RHEA:30027
+property_value: skos:narrowMatch RHEA:32343
+property_value: skos:narrowMatch RHEA:34347
+property_value: skos:narrowMatch RHEA:35463
+property_value: skos:narrowMatch RHEA:35615
+property_value: skos:narrowMatch RHEA:37167
+property_value: skos:narrowMatch RHEA:38215
+property_value: skos:narrowMatch RHEA:41984
+property_value: skos:narrowMatch RHEA:42012
+property_value: skos:narrowMatch RHEA:42016
+property_value: skos:narrowMatch RHEA:42020
+property_value: skos:narrowMatch RHEA:42052
+property_value: skos:narrowMatch RHEA:42056
+property_value: skos:narrowMatch RHEA:42060
+property_value: skos:narrowMatch RHEA:42184
+property_value: skos:narrowMatch RHEA:42188
+property_value: skos:narrowMatch RHEA:43924
+property_value: skos:narrowMatch RHEA:45120
+property_value: skos:narrowMatch RHEA:48728
+property_value: skos:narrowMatch RHEA:48748
+property_value: skos:narrowMatch RHEA:48756
+property_value: skos:narrowMatch RHEA:48760
+property_value: skos:narrowMatch RHEA:50704
+property_value: skos:narrowMatch RHEA:55936
+property_value: skos:narrowMatch RHEA:58848
+property_value: skos:narrowMatch RHEA:60632
+property_value: skos:narrowMatch RHEA:60668
+property_value: skos:narrowMatch RHEA:60672
+property_value: skos:narrowMatch RHEA:60676
+property_value: skos:narrowMatch RHEA:60712
+property_value: skos:narrowMatch RHEA:60972
+property_value: skos:narrowMatch RHEA:60976
+property_value: skos:narrowMatch RHEA:60980
+property_value: skos:narrowMatch RHEA:60984
+property_value: skos:narrowMatch RHEA:60988
+property_value: skos:narrowMatch RHEA:62064
+property_value: skos:narrowMatch RHEA:62392
+property_value: skos:narrowMatch RHEA:63260
+property_value: skos:narrowMatch RHEA:63740
+property_value: skos:narrowMatch RHEA:64060
+property_value: skos:narrowMatch RHEA:64068
+property_value: skos:narrowMatch RHEA:64516
+property_value: skos:narrowMatch RHEA:64560
+property_value: skos:narrowMatch RHEA:64692
+property_value: skos:narrowMatch RHEA:64700
+property_value: skos:narrowMatch RHEA:64704
+property_value: skos:narrowMatch RHEA:68108
+property_value: skos:narrowMatch RHEA:70231
+property_value: skos:narrowMatch RHEA:75115
+property_value: skos:narrowMatch RHEA:75419
+property_value: skos:narrowMatch RHEA:75423
+property_value: skos:narrowMatch RHEA:79419
+property_value: skos:narrowMatch RHEA:80735
+property_value: skos:narrowMatch RHEA:81603
+property_value: skos:narrowMatch RHEA:86103
+property_value: skos:narrowMatch RHEA:86111
+property_value: skos:narrowMatch RHEA:86115
+property_value: skos:narrowMatch RHEA:86119
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28532" xsd:anyURI
 
 [Term]
@@ -36563,7 +36903,6 @@
 xref: RHEA:42340
 xref: RHEA:42384
 xref: RHEA:45764
-xref: RHEA:47152
 xref: RHEA:47932
 xref: RHEA:59432
 xref: RHEA:60688
@@ -36604,7 +36943,6 @@
 property_value: skos:narrowMatch RHEA:42340
 property_value: skos:narrowMatch RHEA:42384
 property_value: skos:narrowMatch RHEA:45764
-property_value: skos:narrowMatch RHEA:47152
 property_value: skos:narrowMatch RHEA:47932
 property_value: skos:narrowMatch RHEA:59432
 property_value: skos:narrowMatch RHEA:60688
@@ -36990,8 +37328,40 @@
 xref: Reactome:R-HSA-9753944 "ACY1:Zn2+ dimer deacetylates NAC to L-Cys"
 xref: RHEA:15565
 xref: RHEA:36855
+xref: RHEA:47124
+xref: RHEA:49796
+xref: RHEA:51300
+xref: RHEA:51312
+xref: RHEA:51316
+xref: RHEA:51352
+xref: RHEA:51356
+xref: RHEA:51360
+xref: RHEA:51444
+xref: RHEA:51456
+xref: RHEA:51460
 xref: RHEA:52628
 xref: RHEA:54184
+xref: RHEA:54188
+xref: RHEA:64108
+xref: RHEA:64112
+xref: RHEA:64116
+xref: RHEA:64120
+xref: RHEA:64124
+xref: RHEA:64128
+xref: RHEA:64132
+xref: RHEA:64136
+xref: RHEA:64140
+xref: RHEA:64144
+xref: RHEA:64156
+xref: RHEA:64176
+xref: RHEA:64180
+xref: RHEA:64184
+xref: RHEA:64188
+xref: RHEA:64192
+xref: RHEA:64196
+xref: RHEA:64200
+xref: RHEA:64208
+xref: RHEA:64212
 xref: RHEA:67368
 xref: RHEA:67440
 xref: RHEA:75515
@@ -37002,8 +37372,40 @@
 property_value: skos:exactMatch EC:3.5.1.14
 property_value: skos:exactMatch RHEA:15565
 property_value: skos:narrowMatch RHEA:36855
+property_value: skos:narrowMatch RHEA:47124
+property_value: skos:narrowMatch RHEA:49796
+property_value: skos:narrowMatch RHEA:51300
+property_value: skos:narrowMatch RHEA:51312
+property_value: skos:narrowMatch RHEA:51316
+property_value: skos:narrowMatch RHEA:51352
+property_value: skos:narrowMatch RHEA:51356
+property_value: skos:narrowMatch RHEA:51360
+property_value: skos:narrowMatch RHEA:51444
+property_value: skos:narrowMatch RHEA:51456
+property_value: skos:narrowMatch RHEA:51460
 property_value: skos:narrowMatch RHEA:52628
 property_value: skos:narrowMatch RHEA:54184
+property_value: skos:narrowMatch RHEA:54188
+property_value: skos:narrowMatch RHEA:64108
+property_value: skos:narrowMatch RHEA:64112
+property_value: skos:narrowMatch RHEA:64116
+property_value: skos:narrowMatch RHEA:64120
+property_value: skos:narrowMatch RHEA:64124
+property_value: skos:narrowMatch RHEA:64128
+property_value: skos:narrowMatch RHEA:64132
+property_value: skos:narrowMatch RHEA:64136
+property_value: skos:narrowMatch RHEA:64140
+property_value: skos:narrowMatch RHEA:64144
+property_value: skos:narrowMatch RHEA:64156
+property_value: skos:narrowMatch RHEA:64176
+property_value: skos:narrowMatch RHEA:64180
+property_value: skos:narrowMatch RHEA:64184
+property_value: skos:narrowMatch RHEA:64188
+property_value: skos:narrowMatch RHEA:64192
+property_value: skos:narrowMatch RHEA:64196
+property_value: skos:narrowMatch RHEA:64200
+property_value: skos:narrowMatch RHEA:64208
+property_value: skos:narrowMatch RHEA:64212
 property_value: skos:narrowMatch RHEA:67368
 property_value: skos:narrowMatch RHEA:67440
 property_value: skos:narrowMatch RHEA:75515
@@ -38075,6 +38477,7 @@
 xref: RHEA:18941
 xref: RHEA:19257
 xref: RHEA:25960
+xref: RHEA:25964
 xref: RHEA:31891
 xref: RHEA:32339
 xref: RHEA:32619
@@ -38086,6 +38489,8 @@
 xref: RHEA:47540
 xref: RHEA:53820
 xref: RHEA:62068
+xref: RHEA:62072
+xref: RHEA:62080
 xref: RHEA:62216
 xref: RHEA:62268
 xref: RHEA:63476
@@ -38120,6 +38525,7 @@
 property_value: skos:narrowMatch RHEA:16817
 property_value: skos:narrowMatch RHEA:18941
 property_value: skos:narrowMatch RHEA:25960
+property_value: skos:narrowMatch RHEA:25964
 property_value: skos:narrowMatch RHEA:31891
 property_value: skos:narrowMatch RHEA:32339
 property_value: skos:narrowMatch RHEA:32619
@@ -38131,6 +38537,8 @@
 property_value: skos:narrowMatch RHEA:47540
 property_value: skos:narrowMatch RHEA:53820
 property_value: skos:narrowMatch RHEA:62068
+property_value: skos:narrowMatch RHEA:62072
+property_value: skos:narrowMatch RHEA:62080
 property_value: skos:narrowMatch RHEA:62216
 property_value: skos:narrowMatch RHEA:62268
 property_value: skos:narrowMatch RHEA:63476
@@ -38880,12 +39288,13 @@
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
@@ -39482,11 +39891,15 @@
 xref: Reactome:R-HSA-71130 "q-dihydrobiopterin + NADH + H+ => tetrahydrobiopterin + NAD+"
 xref: RHEA:17865
 xref: RHEA:17869
+xref: RHEA:32247
+xref: RHEA:32251
 is_a: GO:0016646 ! oxidoreductase activity, acting on the CH-NH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.5.1.34
 property_value: skos:exactMatch MetaCyc:1.5.1.34-RXN
 property_value: skos:narrowMatch RHEA:17865
 property_value: skos:narrowMatch RHEA:17869
+property_value: skos:narrowMatch RHEA:32247
+property_value: skos:narrowMatch RHEA:32251
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29460" xsd:anyURI
 
 [Term]
@@ -39700,10 +40113,25 @@
 xref: RHEA:23716
 xref: RHEA:29847
 xref: RHEA:45228
+xref: RHEA:45736
 xref: RHEA:45748
+xref: RHEA:45752
 xref: RHEA:45900
 xref: RHEA:46044
+xref: RHEA:46068
+xref: RHEA:47464
+xref: RHEA:47476
+xref: RHEA:49852
+xref: RHEA:49932
 xref: RHEA:77195
+xref: RHEA:83231
+xref: RHEA:84487
+xref: RHEA:84491
+xref: RHEA:84547
+xref: RHEA:84555
+xref: RHEA:84559
+xref: RHEA:84563
+xref: RHEA:84843
 is_a: GO:0016863 ! intramolecular oxidoreductase activity, transposing C=C bonds
 property_value: skos:exactMatch EC:5.3.3.8
 property_value: skos:exactMatch RHEA:45900
@@ -39713,9 +40141,24 @@
 property_value: skos:narrowMatch RHEA:23716
 property_value: skos:narrowMatch RHEA:29847
 property_value: skos:narrowMatch RHEA:45228
+property_value: skos:narrowMatch RHEA:45736
 property_value: skos:narrowMatch RHEA:45748
+property_value: skos:narrowMatch RHEA:45752
 property_value: skos:narrowMatch RHEA:46044
+property_value: skos:narrowMatch RHEA:46068
+property_value: skos:narrowMatch RHEA:47464
+property_value: skos:narrowMatch RHEA:47476
+property_value: skos:narrowMatch RHEA:49852
+property_value: skos:narrowMatch RHEA:49932
 property_value: skos:narrowMatch RHEA:77195
+property_value: skos:narrowMatch RHEA:83231
+property_value: skos:narrowMatch RHEA:84487
+property_value: skos:narrowMatch RHEA:84491
+property_value: skos:narrowMatch RHEA:84547
+property_value: skos:narrowMatch RHEA:84555
+property_value: skos:narrowMatch RHEA:84559
+property_value: skos:narrowMatch RHEA:84563
+property_value: skos:narrowMatch RHEA:84843
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21637" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -39875,7 +40318,7 @@
 xref: KEGG_REACTION:R02375
 xref: MetaCyc:ECDYSONE-O-ACYLTRANSFERASE-RXN
 xref: RHEA:15217
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.139
 property_value: skos:exactMatch RHEA:15217
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -42285,6 +42728,17 @@
 xref: RHEA:44044
 xref: RHEA:44048
 xref: RHEA:45352
+xref: RHEA:53972
+xref: RHEA:53976
+xref: RHEA:53980
+xref: RHEA:53984
+xref: RHEA:53992
+xref: RHEA:53996
+xref: RHEA:54000
+xref: RHEA:54004
+xref: RHEA:54008
+xref: RHEA:54012
+xref: RHEA:54016
 xref: RHEA:56584
 xref: RHEA:80591
 xref: RHEA:80779
@@ -42303,6 +42757,17 @@
 property_value: skos:narrowMatch RHEA:44044
 property_value: skos:narrowMatch RHEA:44048
 property_value: skos:narrowMatch RHEA:45352
+property_value: skos:narrowMatch RHEA:53972
+property_value: skos:narrowMatch RHEA:53976
+property_value: skos:narrowMatch RHEA:53980
+property_value: skos:narrowMatch RHEA:53984
+property_value: skos:narrowMatch RHEA:53992
+property_value: skos:narrowMatch RHEA:53996
+property_value: skos:narrowMatch RHEA:54000
+property_value: skos:narrowMatch RHEA:54004
+property_value: skos:narrowMatch RHEA:54008
+property_value: skos:narrowMatch RHEA:54012
+property_value: skos:narrowMatch RHEA:54016
 property_value: skos:narrowMatch RHEA:56584
 property_value: skos:narrowMatch RHEA:80591
 property_value: skos:narrowMatch RHEA:80779
@@ -42787,7 +43252,7 @@
 xref: EC:2.3.1.86
 xref: MetaCyc:FATTY-ACYL-COA-SYNTHASE-RXN
 xref: RHEA:22896
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.86
 property_value: skos:exactMatch RHEA:22896
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -43850,7 +44315,7 @@
 xref: RHEA:37199
 xref: RHEA:37203
 xref: RHEA:37463
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.15
 property_value: skos:exactMatch RHEA:15325
 property_value: skos:narrowMatch RHEA:35723
@@ -43877,13 +44342,17 @@
 xref: MetaCyc:RXN-15745
 xref: Reactome:R-HSA-188467 "Gly-3-P+FAD->DHAP+FADH2 (catalyzed by mitochondrial Gly-Phos dehydrogenase)"
 xref: RHEA:18977
+xref: RHEA:28751
 xref: RHEA:28755
 xref: RHEA:29219
+xref: RHEA:29223
 is_a: GO:0016901 ! oxidoreductase activity, acting on the CH-OH group of donors, quinone or similar compound as acceptor
 property_value: skos:exactMatch EC:1.1.5.3
 property_value: skos:exactMatch RHEA:18977
+property_value: skos:narrowMatch RHEA:28751
 property_value: skos:narrowMatch RHEA:28755
 property_value: skos:narrowMatch RHEA:29219
+property_value: skos:narrowMatch RHEA:29223
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25984" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -44112,7 +44581,6 @@
 xref: Reactome:R-HSA-203611 "N-myristoylation of eNOS"
 xref: Reactome:R-HSA-2534087 "NMT1/2 transfer MYS to GNAT1"
 xref: RHEA:15521
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.97
 property_value: skos:exactMatch RHEA:15521
@@ -46163,10 +46631,16 @@
 xref: Reactome:R-HSA-9694721 "nsp16 acts as a cap 2'-O-methyltransferase to modify SARS-CoV-2 gRNA (plus strand)"
 xref: Reactome:R-HSA-9834003 "L protein acts as a cap 2'-O-methyltransferase to modify RSV mRNAs"
 xref: Reactome:R-HSA-9923097 "NS5 acts as a cap 2'-O-methyltransferase to methylate 5 m7GpppA of DENV genomic +ssRNA"
+xref: RHEA:19617
+xref: RHEA:60860
+xref: RHEA:60864
 xref: RHEA:67020
 is_a: GO:0008171 ! O-methyltransferase activity
 is_a: GO:0008173 ! RNA methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.57
+property_value: skos:narrowMatch RHEA:19617
+property_value: skos:narrowMatch RHEA:60860
+property_value: skos:narrowMatch RHEA:60864
 property_value: skos:narrowMatch RHEA:67020
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27387" xsd:anyURI
 
@@ -46347,10 +46821,14 @@
 xref: Reactome:R-HSA-70893 "methylmalonate semialdehyde + NAD+ + CoA + H2O => propionyl-CoA + HCO3- + NADH + H+"
 xref: RHEA:20804
 xref: RHEA:76615
+xref: RHEA:76623
+xref: RHEA:76627
 is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.2.1.27
 property_value: skos:narrowMatch RHEA:20804
 property_value: skos:narrowMatch RHEA:76615
+property_value: skos:narrowMatch RHEA:76623
+property_value: skos:narrowMatch RHEA:76627
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25638" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30853" xsd:anyURI
@@ -46555,11 +47033,12 @@
 xref: Reactome:R-HSA-209868 "CYP27B1 hydroxylates 25(OH)D to 1,25(OH)2D"
 xref: Reactome:R-HSA-5602186 "Defective CYP27B1 does not hydroxylate CDL"
 xref: RHEA:20573
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
 property_value: skos:exactMatch EC:1.14.15.18
 property_value: skos:exactMatch RHEA:20573
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0004499
@@ -46759,10 +47238,11 @@
 xref: MetaCyc:SQUALENE-MONOOXYGENASE-RXN
 xref: Reactome:R-HSA-191299 "Squalene is oxidized to its epoxide"
 xref: RHEA:25282
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.17
 property_value: skos:exactMatch RHEA:25282
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0004507
@@ -48419,6 +48899,8 @@
 xref: RHEA:50512
 xref: RHEA:50516
 xref: RHEA:57320
+xref: RHEA:57324
+xref: RHEA:57328
 xref: RHEA:75243
 xref: RHEA:75247
 is_a: GO:0034212 ! protein N-acetyltransferase activity
@@ -48428,6 +48910,8 @@
 property_value: skos:narrowMatch RHEA:50512
 property_value: skos:narrowMatch RHEA:50516
 property_value: skos:narrowMatch RHEA:57320
+property_value: skos:narrowMatch RHEA:57324
+property_value: skos:narrowMatch RHEA:57328
 property_value: skos:narrowMatch RHEA:75243
 property_value: skos:narrowMatch RHEA:75247
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24761" xsd:anyURI
@@ -48645,10 +49129,30 @@
 xref: Reactome:R-HSA-264695 "cholesterol + phosphatidylcholine (lecithin) => cholesterol ester + 2-lysophosphatidylcholine (lysolecithin)"
 xref: RHEA:21204
 xref: RHEA:34087
-is_a: GO:0008374 ! O-acyltransferase activity
+xref: RHEA:53448
+xref: RHEA:53452
+xref: RHEA:53456
+xref: RHEA:53460
+xref: RHEA:53464
+xref: RHEA:53468
+xref: RHEA:53472
+xref: RHEA:53476
+xref: RHEA:53516
+xref: RHEA:53520
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.43
 property_value: skos:exactMatch RHEA:21204
 property_value: skos:narrowMatch RHEA:34087
+property_value: skos:narrowMatch RHEA:53448
+property_value: skos:narrowMatch RHEA:53452
+property_value: skos:narrowMatch RHEA:53456
+property_value: skos:narrowMatch RHEA:53460
+property_value: skos:narrowMatch RHEA:53464
+property_value: skos:narrowMatch RHEA:53468
+property_value: skos:narrowMatch RHEA:53472
+property_value: skos:narrowMatch RHEA:53476
+property_value: skos:narrowMatch RHEA:53516
+property_value: skos:narrowMatch RHEA:53520
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -49053,11 +49557,33 @@
 xref: Reactome:R-HSA-1602446 "PA is hydrolyzed to 1-acyl LPA by PLA2[15]"
 xref: Reactome:R-HSA-8848484 "PLA2s hydrolyze phospholipids at the Golgi membrane"
 xref: RHEA:15801
+xref: RHEA:38779
+xref: RHEA:38847
+xref: RHEA:40427
+xref: RHEA:40519
+xref: RHEA:40643
+xref: RHEA:40651
+xref: RHEA:40811
+xref: RHEA:41223
+xref: RHEA:53500
+xref: RHEA:56428
+xref: RHEA:62036
 is_a: GO:0004620 ! glycerophospholipase activity
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
 property_value: skos:exactMatch EC:3.1.1.4
 property_value: skos:narrowMatch MetaCyc:RXN-15065
 property_value: skos:narrowMatch RHEA:15801
+property_value: skos:narrowMatch RHEA:38779
+property_value: skos:narrowMatch RHEA:38847
+property_value: skos:narrowMatch RHEA:40427
+property_value: skos:narrowMatch RHEA:40519
+property_value: skos:narrowMatch RHEA:40643
+property_value: skos:narrowMatch RHEA:40651
+property_value: skos:narrowMatch RHEA:40811
+property_value: skos:narrowMatch RHEA:41223
+property_value: skos:narrowMatch RHEA:53500
+property_value: skos:narrowMatch RHEA:56428
+property_value: skos:narrowMatch RHEA:62036
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21259" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30258" xsd:anyURI
@@ -49159,10 +49685,14 @@
 xref: Reactome:R-HSA-1483182 "PC is hydrolyzed to PA and choline by PLD1/2"
 xref: Reactome:R-HSA-2029471 "Hydrolysis of PC to PA by PLD"
 xref: RHEA:14445
+xref: RHEA:41412
+xref: RHEA:41416
 is_a: GO:0004620 ! glycerophospholipase activity
 is_a: GO:0008081 ! phosphoric diester hydrolase activity
 property_value: skos:exactMatch EC:3.1.4.4
 property_value: skos:narrowMatch RHEA:14445
+property_value: skos:narrowMatch RHEA:41412
+property_value: skos:narrowMatch RHEA:41416
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31049" xsd:anyURI
 
@@ -51867,11 +52397,12 @@
 xref: Reactome:R-HSA-2129375 "Elastin cross-linking by lysyl oxidase"
 xref: Reactome:R-HSA-2395340 "Formation of hydroxyallysine by LOX"
 xref: RHEA:24544
-is_a: GO:0052597 ! diamine oxidase activity
+is_a: GO:0016641 ! oxidoreductase activity, acting on the CH-NH2 group of donors, oxygen as acceptor
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch EC:1.4.3.13
 property_value: skos:exactMatch RHEA:24544
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31964" xsd:anyURI
 
 [Term]
 id: GO:0004721
@@ -51983,12 +52514,16 @@
 xref: Reactome:R-HSA-9865238 "PP2A dephosphorylates serine-715 of PDE4D5 in p-S715-PDE4D5:integrin alpha5:integrin beta1:fibronectin"
 xref: Reactome:R-HSA-9912527 "H139Hfs13* PPM1K does not dephosphorylate BCKDH"
 xref: Reactome:R-HSA-9970190 "PP1 dephosphorylates RNA Pol II"
+xref: RHEA:12849
 xref: RHEA:20629
 xref: RHEA:47004
+xref: RHEA:53988
 is_a: GO:0004721 ! phosphoprotein phosphatase activity
 property_value: skos:exactMatch EC:3.1.3.16
+property_value: skos:narrowMatch RHEA:12849
 property_value: skos:narrowMatch RHEA:20629
 property_value: skos:narrowMatch RHEA:47004
+property_value: skos:narrowMatch RHEA:53988
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22458" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25787" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -52109,9 +52644,10 @@
 
 [Term]
 id: GO:0004729
-name: oxygen-dependent protoporphyrinogen oxidase activity
+name: protoporphyrinogen oxidase activity, oxygen as acceptor
 namespace: molecular_function
 def: "Catalysis of the reaction: 3 O2 + protoporphyrinogen IX = 3 H2O2 + protoporphyrin IX." [RHEA:25576]
+synonym: "oxygen-dependent protoporphyrinogen oxidase activity" EXACT []
 synonym: "protoporphyrinogen-IX:oxygen oxidoreductase activity" RELATED [EC:1.3.3.4]
 xref: EC:1.3.3.4
 xref: KEGG_REACTION:R03222
@@ -52125,6 +52661,7 @@
 property_value: skos:exactMatch MetaCyc:PROTOPORGENOXI-RXN
 property_value: skos:exactMatch RHEA:25576
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28776" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31965" xsd:anyURI
 
 [Term]
 id: GO:0004730
@@ -52955,6 +53492,7 @@
 xref: RHEA:10100
 xref: RHEA:33543
 xref: RHEA:33547
+xref: RHEA:33875
 xref: RHEA:36403
 is_a: GO:0016298 ! lipase activity
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
@@ -52963,6 +53501,7 @@
 property_value: skos:exactMatch RHEA:10100
 property_value: skos:narrowMatch RHEA:33543
 property_value: skos:narrowMatch RHEA:33547
+property_value: skos:narrowMatch RHEA:33875
 property_value: skos:narrowMatch RHEA:36403
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 
@@ -52977,7 +53516,7 @@
 xref: EC:2.3.1.26
 xref: MetaCyc:RXN-20233
 xref: RHEA:59816
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.26
 property_value: skos:exactMatch MetaCyc:RXN-20233
 property_value: skos:exactMatch RHEA:59816
@@ -53127,7 +53666,7 @@
 id: GO:0004781
 name: sulfate adenylyltransferase (ATP) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: ATP + H+ + sulfate = adenosine 5'-phosphosulfate + diphosphate." [EC:2.7.7.4]
+def: "Catalysis of the reaction: sulfate + ATP + H+ = adenosine 5'-phosphosulfate + diphosphate." [RHEA:18133]
 synonym: "adenosine-5'-triphosphate sulfurylase activity" RELATED [EC:2.7.7.4]
 synonym: "adenosinetriphosphate sulfurylase activity" RELATED [EC:2.7.7.4]
 synonym: "adenylylsulfate pyrophosphorylase activity" RELATED [EC:2.7.7.4]
@@ -53690,30 +54229,64 @@
 xref: Reactome:R-HSA-8848338 "PNPLA4 hydrolyzes TAG"
 xref: Reactome:R-HSA-8848339 "PNPLA5 hydrolyzes TAG"
 xref: RHEA:12044
+xref: RHEA:33271
 xref: RHEA:35667
+xref: RHEA:38379
+xref: RHEA:38387
+xref: RHEA:38391
+xref: RHEA:38395
+xref: RHEA:38403
+xref: RHEA:38411
+xref: RHEA:38419
+xref: RHEA:38423
 xref: RHEA:38495
+xref: RHEA:38499
 xref: RHEA:38575
+xref: RHEA:39931
+xref: RHEA:40047
+xref: RHEA:40055
 xref: RHEA:40475
+xref: RHEA:43732
+xref: RHEA:44864
 xref: RHEA:47864
 xref: RHEA:48024
 xref: RHEA:48028
 xref: RHEA:59020
 xref: RHEA:59024
+xref: RHEA:63432
+xref: RHEA:63436
 is_a: GO:0016298 ! lipase activity
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
 property_value: skos:broadMatch EC:3.1.1.79
 property_value: skos:exactMatch EC:3.1.1.3
 property_value: skos:exactMatch MetaCyc:RXN-19278
 property_value: skos:exactMatch RHEA:12044
+property_value: skos:narrowMatch RHEA:33271
 property_value: skos:narrowMatch RHEA:35667
+property_value: skos:narrowMatch RHEA:38379
+property_value: skos:narrowMatch RHEA:38387
+property_value: skos:narrowMatch RHEA:38391
+property_value: skos:narrowMatch RHEA:38395
+property_value: skos:narrowMatch RHEA:38403
+property_value: skos:narrowMatch RHEA:38411
+property_value: skos:narrowMatch RHEA:38419
+property_value: skos:narrowMatch RHEA:38423
 property_value: skos:narrowMatch RHEA:38495
+property_value: skos:narrowMatch RHEA:38499
 property_value: skos:narrowMatch RHEA:38575
+property_value: skos:narrowMatch RHEA:39931
+property_value: skos:narrowMatch RHEA:40047
+property_value: skos:narrowMatch RHEA:40055
 property_value: skos:narrowMatch RHEA:40475
+property_value: skos:narrowMatch RHEA:43732
+property_value: skos:narrowMatch RHEA:44864
 property_value: skos:narrowMatch RHEA:47864
 property_value: skos:narrowMatch RHEA:48024
 property_value: skos:narrowMatch RHEA:48028
 property_value: skos:narrowMatch RHEA:59020
 property_value: skos:narrowMatch RHEA:59024
+property_value: skos:narrowMatch RHEA:63432
+property_value: skos:narrowMatch RHEA:63436
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28176" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 
@@ -54917,15 +55490,15 @@
 synonym: "xanthine:O2 oxidoreductase activity" RELATED [EC:1.17.3.2]
 synonym: "xanthine:oxygen oxidoreductase activity" RELATED [EC:1.17.3.2]
 synonym: "xanthine:xanthine oxidase activity" RELATED [EC:1.17.3.2]
-xref: EC:1.17.3.2
 xref: MetaCyc:XANTHINE-OXIDASE-RXN
 xref: Reactome:R-HSA-74258 "XDH oxidizes xanthine to form urate"
 xref: Reactome:R-HSA-9748991 "XDH oxidises 6MP to 6TU"
 xref: RHEA:21132
 is_a: GO:0016727 ! oxidoreductase activity, acting on CH or CH2 groups, oxygen as acceptor
-property_value: skos:exactMatch EC:1.17.3.2
+property_value: skos:broadMatch EC:1.17.3.2
 property_value: skos:exactMatch RHEA:21132
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
 
 [Term]
 id: GO:0004856
@@ -55980,10 +56553,10 @@
 def: "Catalysis of the transmembrane transfer of an ion by a channel that opens when glutamate has been bound by the channel complex or one of its constituent parts." [ISBN:0198506732]
 comment: Note that this term represents an activity and not a gene product. Consider also annotating to the molecular function terms 'glutamate-gated ion channel activity ; GO:0005234' and 'cation channel activity ; GO:0005261'.
 synonym: "ionotropic glutamate receptor activity" EXACT []
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0008066 ! glutamate receptor activity
 is_a: GO:0015171 ! amino acid transmembrane transporter activity
 is_a: GO:0022824 ! transmitter-gated monoatomic ion channel activity
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 relationship: part_of GO:0035235 ! ionotropic glutamate receptor signaling pathway
 
 [Term]
@@ -59235,7 +59808,7 @@
 name: creatine transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of creatine from one side of a membrane to the other. Creatine is a compound synthesized from the amino acids arginine, glycine, and methionine that occurs in muscle." [GOC:ai]
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 relationship: part_of GO:0015881 ! creatine transmembrane transport
 
@@ -59247,7 +59820,7 @@
 synonym: "sodium/chloride-dependent creatine transporter" BROAD []
 xref: Reactome:R-HSA-200396 "Creatine transport across the plasma membrane"
 is_a: GO:0005308 ! creatine transmembrane transporter activity
-is_a: GO:0005343 ! organic acid:sodium symporter activity
+is_a: GO:0140161 ! monocarboxylate:sodium symporter activity
 
 [Term]
 id: GO:0005310
@@ -59290,6 +59863,7 @@
 xref: Reactome:R-HSA-210444 "L-Glutamate loading of synaptic vesicle"
 xref: Reactome:R-HSA-428052 "SLC17A6,7,8 exchange cytosolic L-Glu for synaptic vesicle H+"
 xref: Reactome:R-HSA-5624256 "Defective SLC17A8 does not exchange cytosolic L-Glu for synaptic vesicle H+"
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015172 ! acidic amino acid transmembrane transporter activity
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
 relationship: part_of GO:0015813 ! L-glutamate transmembrane transport
@@ -59503,9 +60077,10 @@
 xref: RHEA:70731
 xref: TC:2.A.22.3.2
 is_a: GO:0005283 ! amino acid:sodium symporter activity
+is_a: GO:0005343 ! organic acid:sodium symporter activity
 is_a: GO:0015185 ! gamma-aminobutyric acid transmembrane transporter activity
+is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
 is_a: GO:0015378 ! sodium:chloride symporter activity
-is_a: GO:0140161 ! monocarboxylate:sodium symporter activity
 property_value: skos:narrowMatch RHEA:70687
 property_value: skos:narrowMatch RHEA:70731
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23299" xsd:anyURI
@@ -59898,8 +60473,8 @@
 alt_id: GO:0005370
 def: "Enables the transfer of tricarboxylate from one side of a membrane to the other, up its concentration gradient. The transporter binds the solute and undergoes a series of conformational changes. Transport works equally well in either direction and is driven by a chemiosmotic source of energy. Secondary active transporters include symporters and antiporters." [GOC:mtg_transport, ISBN:0815340729]
 synonym: "tricarboxylate carrier activity" EXACT []
+is_a: GO:0015142 ! tricarboxylic acid transmembrane transporter activity
 is_a: GO:0015291 ! secondary active transmembrane transporter activity
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 
 [Term]
 id: GO:0005372
@@ -60482,7 +61057,6 @@
 synonym: "vesicle targeting" EXACT []
 is_obsolete: true
 consider: GO:0006903
-consider: GO:0016080
 
 [Term]
 id: GO:0005483
@@ -61237,7 +61811,7 @@
 name: extracellular region
 namespace: cellular_component
 def: "The space external to the outermost structure of a cell. For cells without external protective or external encapsulating structures this refers to space outside of the plasma membrane. This term covers the host cell environment outside an intracellular parasite." [GOC:curators]
-comment: Note that this term is intended to annotate gene products that are not attached to the cell surface. For gene products from multicellular organisms which are secreted from a cell but retained within the organism (i.e. released into the interstitial fluid or blood), consider the cellular component term 'extracellular space ; GO:0005615'.
+comment: Note that this term is intended to annotate gene products that are not attached to the cell surface. For gene products at the cell surface, consider annotating to external side of plasma membrane ; GO:0009897.
 subset: goslim_agr
 subset: goslim_candida
 subset: goslim_chembl
@@ -61256,6 +61830,7 @@
 synonym: "extracellular" EXACT []
 xref: Wikipedia:Extracellular
 is_a: GO:0110165 ! cellular anatomical structure
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31545" xsd:anyURI
 
 [Term]
 id: GO:0005577
@@ -64136,13 +64711,13 @@
 
 [Term]
 id: GO:0005870
-name: actin capping protein of dynactin complex
+name: obsolete actin capping protein of dynactin complex
 namespace: cellular_component
-def: "A heterodimer consisting of alpha and beta subunits that binds to and caps the barbed ends of actin filaments, nucleates the polymerization of actin monomers but does not sever actin filaments, and which is a part of the dynactin complex." [GOC:jl, PMID:18221362, PMID:18544499]
-is_a: GO:0008290 ! F-actin capping protein complex
-intersection_of: GO:0008290 ! F-actin capping protein complex
-intersection_of: part_of GO:0005869 ! dynactin complex
-relationship: part_of GO:0005869 ! dynactin complex
+def: "OBSOLETE. A heterodimer consisting of alpha and beta subunits that binds to and caps the barbed ends of actin filaments, nucleates the polymerization of actin monomers but does not sever actin filaments, and which is a part of the dynactin complex." [GOC:jl, PMID:18221362, PMID:18544499]
+comment: This term was obsoleted because it is redundant with GO:0008290 (F-actin capping protein complex). Annotations can be migrated to the replacement term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31956" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0008290
 
 [Term]
 id: GO:0005871
@@ -65526,7 +66101,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving fructose 6-phosphate, also known as F6P. The D-enantiomer is an important intermediate in glycolysis, gluconeogenesis, and fructose metabolism." [ISBN:0198506732]
 synonym: "fructose 6-phosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -65536,7 +66110,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving fructose 2,6-bisphosphate. The D enantiomer is an important regulator of the glycolytic and gluconeogenic pathways. It inhibits fructose 1,6-bisphosphatase and activates phosphofructokinase." [ISBN:0198506732]
 synonym: "fructose 2,6-bisphosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -65636,7 +66209,6 @@
 synonym: "5-phosphoribosyl-1-pyrophosphate biosynthetic process" EXACT []
 synonym: "PRPP biosynthetic process" EXACT []
 xref: MetaCyc:PWY0-662
-xref: Reactome:R-HSA-73843 "5-Phosphoribose 1-diphosphate biosynthesis"
 is_a: GO:0046390 ! ribose phosphate biosynthetic process
 is_a: GO:0046391 ! 5-phosphoribose 1-diphosphate metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY0-662
@@ -65959,39 +66531,42 @@
 
 [Term]
 id: GO:0006041
-name: glucosamine metabolic process
+name: D-glucosamine metabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways involving glucosamine (2-amino-2-deoxyglucopyranose), an aminodeoxysugar that occurs in combined form in chitin." [GOC:jl, ISBN:0198506732]
 synonym: "chitosamine metabolic process" EXACT []
 synonym: "chitosamine metabolism" EXACT []
+synonym: "glucosamine metabolic process" EXACT []
 synonym: "glucosamine metabolism" EXACT []
 is_a: GO:0006040 ! amino sugar metabolic process
 
 [Term]
 id: GO:0006042
-name: glucosamine biosynthetic process
+name: D-glucosamine biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of glucosamine (2-amino-2-deoxyglucopyranose), an aminodeoxysugar that occurs in combined form in chitin." [GOC:jl, ISBN:0198506732]
 synonym: "chitosamine biosynthesis" EXACT []
 synonym: "chitosamine biosynthetic process" EXACT []
 synonym: "glucosamine anabolism" EXACT []
 synonym: "glucosamine biosynthesis" EXACT []
+synonym: "glucosamine biosynthetic process" EXACT []
 synonym: "glucosamine formation" EXACT []
 synonym: "glucosamine synthesis" EXACT []
-is_a: GO:0006041 ! glucosamine metabolic process
+is_a: GO:0006041 ! D-glucosamine metabolic process
 is_a: GO:1901073 ! glucosamine-containing compound biosynthetic process
 
 [Term]
 id: GO:0006043
-name: glucosamine catabolic process
+name: D-glucosamine catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of glucosamine (2-amino-2-deoxyglucopyranose), an aminodeoxysugar that occurs in combined form in chitin." [GOC:jl, ISBN:0198506732]
 synonym: "chitosamine catabolic process" EXACT []
 synonym: "chitosamine catabolism" EXACT []
 synonym: "glucosamine breakdown" EXACT []
+synonym: "glucosamine catabolic process" EXACT []
 synonym: "glucosamine catabolism" EXACT []
 synonym: "glucosamine degradation" EXACT []
-is_a: GO:0006041 ! glucosamine metabolic process
+is_a: GO:0006041 ! D-glucosamine metabolic process
 is_a: GO:1901072 ! glucosamine-containing compound catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 
@@ -66468,12 +67043,13 @@
 
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
@@ -67521,6 +68097,7 @@
 synonym: "dADP synthesis" EXACT []
 is_a: GO:0009153 ! purine deoxyribonucleotide biosynthetic process
 is_a: GO:0009183 ! purine deoxyribonucleoside diphosphate biosynthetic process
+is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0046056 ! dADP metabolic process
 
 [Term]
@@ -67541,6 +68118,7 @@
 synonym: "dATP formation" EXACT []
 synonym: "dATP synthesis" EXACT []
 is_a: GO:0009153 ! purine deoxyribonucleotide biosynthetic process
+is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009216 ! purine deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0046060 ! dATP metabolic process
 
@@ -67657,6 +68235,7 @@
 synonym: "dGDP synthesis" EXACT []
 is_a: GO:0009153 ! purine deoxyribonucleotide biosynthetic process
 is_a: GO:0009183 ! purine deoxyribonucleoside diphosphate biosynthetic process
+is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0046066 ! dGDP metabolic process
 
 [Term]
@@ -67859,6 +68438,7 @@
 synonym: "dGTP catabolism" EXACT []
 synonym: "dGTP degradation" EXACT []
 is_a: GO:0009155 ! purine deoxyribonucleotide catabolic process
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009217 ! purine deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0046070 ! dGTP metabolic process
 
@@ -68128,6 +68708,7 @@
 synonym: "dUDP biosynthesis" EXACT []
 synonym: "dUDP formation" EXACT []
 synonym: "dUDP synthesis" EXACT []
+is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0009197 ! pyrimidine deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0009221 ! pyrimidine deoxyribonucleotide biosynthetic process
 is_a: GO:0046077 ! dUDP metabolic process
@@ -68154,6 +68735,7 @@
 synonym: "dUTP biosynthesis" EXACT []
 synonym: "dUTP formation" EXACT []
 synonym: "dUTP synthesis" EXACT []
+is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009212 ! pyrimidine deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009221 ! pyrimidine deoxyribonucleotide biosynthetic process
 is_a: GO:0046080 ! dUTP metabolic process
@@ -68232,6 +68814,7 @@
 synonym: "dTTP biosynthesis" EXACT []
 synonym: "dTTP formation" EXACT []
 synonym: "dTTP synthesis" EXACT []
+is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009212 ! pyrimidine deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009221 ! pyrimidine deoxyribonucleotide biosynthetic process
 is_a: GO:0046075 ! dTTP metabolic process
@@ -68280,6 +68863,7 @@
 synonym: "dCDP biosynthesis" EXACT []
 synonym: "dCDP formation" EXACT []
 synonym: "dCDP synthesis" EXACT []
+is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0009197 ! pyrimidine deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0009221 ! pyrimidine deoxyribonucleotide biosynthetic process
 is_a: GO:0046062 ! dCDP metabolic process
@@ -68306,6 +68890,7 @@
 synonym: "dCTP biosynthesis" EXACT []
 synonym: "dCTP formation" EXACT []
 synonym: "dCTP synthesis" EXACT []
+is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009212 ! pyrimidine deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009221 ! pyrimidine deoxyribonucleotide biosynthetic process
 is_a: GO:0046065 ! dCTP metabolic process
@@ -68398,6 +68983,7 @@
 synonym: "dCDP breakdown" EXACT []
 synonym: "dCDP catabolism" EXACT []
 synonym: "dCDP degradation" EXACT []
+is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0009198 ! pyrimidine deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0009223 ! pyrimidine deoxyribonucleotide catabolic process
 is_a: GO:0046062 ! dCDP metabolic process
@@ -68420,6 +69006,7 @@
 synonym: "dCTP breakdown" EXACT []
 synonym: "dCTP catabolism" EXACT []
 synonym: "dCTP degradation" EXACT []
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009213 ! pyrimidine deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009223 ! pyrimidine deoxyribonucleotide catabolic process
 is_a: GO:0046065 ! dCTP metabolic process
@@ -68467,6 +69054,7 @@
 synonym: "dUDP breakdown" EXACT []
 synonym: "dUDP catabolism" EXACT []
 synonym: "dUDP degradation" EXACT []
+is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0009198 ! pyrimidine deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0009223 ! pyrimidine deoxyribonucleotide catabolic process
 is_a: GO:0046077 ! dUDP metabolic process
@@ -70202,7 +70790,7 @@
 id: GO:0006423
 name: cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accetping tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA, catalyzed by cysteinyl-tRNA synthetase. A cysteinyl-tRNA synthetase is a class-I synthetase. The activated amino acid is transferred to the 2'-OH group of a cysteine-accepting tRNA. The 2'-O-aminoacyl-tRNA will ultimately migrate to the 3' position via transesterification." [GOC:mcc, ISBN:0716730510]
 is_a: GO:0006418 ! tRNA aminoacylation for protein translation
 
 [Term]
@@ -70450,7 +71038,8 @@
 synonym: "binding unfolded ER proteins" EXACT []
 is_obsolete: true
 consider: GO:0005783
-consider: GO:0051082
+consider: GO:0044183
+consider: GO:0140309
 
 [Term]
 id: GO:0006460
@@ -71162,7 +71751,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving arginine, 2-amino-5-(carbamimidamido)pentanoic acid." [GOC:curators]
 synonym: "arginine metabolism" EXACT []
-xref: Wikipedia:Arginine
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
 [Term]
@@ -71179,7 +71767,7 @@
 xref: MetaCyc:PWY-5154
 xref: MetaCyc:PWY-7400
 is_a: GO:0006525 ! arginine metabolic process
-is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+is_a: GO:0009084 ! glutamate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ARGSYN-PWY
 property_value: skos:narrowMatch MetaCyc:ARGSYNBSUB-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5154
@@ -71350,7 +71938,6 @@
 synonym: "glutamate metabolism" EXACT []
 synonym: "glutamic acid metabolic process" EXACT []
 synonym: "glutamic acid metabolism" EXACT []
-xref: Wikipedia:Glutamic_acid
 is_a: GO:0043648 ! dicarboxylic acid metabolic process
 is_a: GO:1901605 ! alpha-amino acid metabolic process
 
@@ -71579,12 +72166,15 @@
 
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
@@ -71594,10 +72184,11 @@
 synonym: "isoleucine breakdown" EXACT []
 synonym: "isoleucine catabolism" EXACT []
 synonym: "isoleucine degradation" EXACT []
+synonym: "L-isoleucine catabolic process via Ehrlich pathway" NARROW []
+synonym: "L-isoleucine degradation via Ehrlich pathway" NARROW []
 xref: MetaCyc:ILEUDEG-PWY
 xref: MetaCyc:PWY-5078
 xref: MetaCyx:PWY-8184
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -71605,6 +72196,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5078
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
 [Term]
 id: GO:0006551
@@ -71625,6 +72217,8 @@
 synonym: "L-leucine breakdown" EXACT []
 synonym: "L-leucine catabolism" EXACT []
 synonym: "L-leucine degradation" EXACT []
+synonym: "L-leucine degradation via Ehrlich pathway" NARROW []
+synonym: "L-methionine catabolic process via Ehrlich pathway" NARROW []
 synonym: "leucine catabolic process" BROAD []
 xref: MetaCyc:LEU-DEG2-PWY
 xref: MetaCyc:PWY-5075
@@ -71642,6 +72236,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8185
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
 [Term]
 id: GO:0006553
@@ -71678,7 +72273,6 @@
 synonym: "methionine and threonine metabolic process" BROAD []
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "methionine metabolism" EXACT []
-xref: UM-BBD_pathwayID:met
 is_a: GO:0000096 ! sulfur amino acid metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
 is_a: GO:0170039 ! proteinogenic amino acid metabolic process
@@ -71734,8 +72328,10 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of L-phenylalanine." [GOC:curators]
 synonym: "L-phenylalanine breakdown" EXACT []
+synonym: "L-phenylalanine catabolic process via Ehrlich pathway" NARROW []
 synonym: "L-phenylalanine catabolism" EXACT []
 synonym: "L-phenylalanine degradation" EXACT []
+synonym: "L-phenylalanine degradation via Ehrlich pathway" NARROW []
 synonym: "phenylalanine catabolic process" BROAD []
 synonym: "phenylalanine catabolism" BROAD []
 xref: MetaCyc:ANAPHENOXI-PWY
@@ -71754,6 +72350,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-8014
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
 [Term]
 id: GO:0006560
@@ -71852,7 +72449,8 @@
 synonym: "methionine and threonine metabolism" BROAD []
 synonym: "threonine metabolism" EXACT []
 xref: UM-BBD_pathwayID:met
-is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0170033 ! L-amino acid metabolic process
+is_a: GO:0170039 ! proteinogenic amino acid metabolic process
 
 [Term]
 id: GO:0006567
@@ -71886,7 +72484,6 @@
 def: "The chemical reactions and pathways involving tryptophan, the chiral amino acid 2-amino-3-(1H-indol-3-yl)propanoic acid." [ISBN:0198547684]
 synonym: "tryptophan metabolic process" RELATED []
 synonym: "tryptophan metabolism" RELATED []
-xref: Wikipedia:Tryptophan
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0042430 ! indole-containing compound metabolic process
 is_a: GO:0170033 ! L-amino acid metabolic process
@@ -71897,6 +72494,8 @@
 name: L-tryptophan catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of L-tryptophan." [GOC:curators]
+synonym: "L-tryptophan catabolic process via Ehrlich pathway" NARROW []
+synonym: "L-tryptophan degradation via Ehrlich pathway" NARROW []
 synonym: "tryptophan breakdown" EXACT []
 synonym: "tryptophan catabolic process" RELATED []
 synonym: "tryptophan catabolic process, using tryptophanase" NARROW []
@@ -71937,18 +72536,19 @@
 property_value: skos:narrowMatch MetaCyc:TRYPTOPHAN-DEGRADATION-1
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
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
@@ -71964,8 +72564,7 @@
 xref: MetaCyc:PWY-6120
 xref: MetaCyc:PWY-6134
 xref: MetaCyc:TYRSYN
-is_a: GO:0006570 ! tyrosine metabolic process
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3461
 property_value: skos:narrowMatch MetaCyc:PWY-6120
@@ -71988,7 +72587,7 @@
 xref: MetaCyc:PWY3O-4108
 xref: MetaCyc:TYRFUMCAT-PWY
 xref: Reactome:R-HSA-8963684 "Tyrosine catabolism"
-is_a: GO:0006570 ! tyrosine metabolic process
+xref: UM-BBD_pathwayID:tyr
 is_a: GO:0009074 ! aromatic amino acid family catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72002,12 +72601,15 @@
 
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
@@ -72018,10 +72620,10 @@
 synonym: "valine breakdown" EXACT []
 synonym: "valine catabolism" EXACT []
 synonym: "valine degradation" EXACT []
+synonym: "valine degradation via Ehrlich pathway" NARROW []
 xref: MetaCyc:PWY-5057
 xref: MetaCyc:PWY-8183
 xref: MetaCyc:VALDEG-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009083 ! branched-chain amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170040 ! proteinogenic amino acid catabolic process
@@ -72031,6 +72633,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30047" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31221" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
 [Term]
 id: GO:0006575
@@ -72131,8 +72734,10 @@
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
@@ -72151,8 +72756,10 @@
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
@@ -72168,17 +72775,18 @@
 
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
@@ -72224,11 +72832,12 @@
 
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
@@ -72304,11 +72913,14 @@
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
@@ -72363,7 +72975,6 @@
 def: "The chemical reactions and pathways involving phosphocreatine, a phosphagen of creatine present in high concentration in striated muscle which is synthesized and broken down by creatine phosphokinase to buffer ATP concentration. It acts as an immediate energy reserve for muscle." [PMID:16371597]
 synonym: "phosphocreatine metabolism" EXACT []
 is_a: GO:0006575 ! modified amino acid metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 
 [Term]
@@ -72865,7 +73476,6 @@
 xref: Reactome:R-HSA-1483152 "Hydrolysis of LPE"
 xref: Reactome:R-HSA-1483257 "Phospholipid metabolism"
 is_a: GO:0006629 ! lipid metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28908" xsd:anyURI
 
@@ -73802,6 +74412,7 @@
 name: ommochrome biosynthetic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of ommochromes, any of a large group of natural polycyclic pigments commonly found in the Arthropoda, particularly in the ommatidia of the compound eye." [ISBN:0198506732]
+synonym: "kynurenine pathway" BROAD []
 synonym: "ommochrome anabolism" EXACT []
 synonym: "ommochrome biosynthesis" EXACT []
 synonym: "ommochrome formation" EXACT []
@@ -73809,6 +74420,7 @@
 is_a: GO:0006726 ! eye pigment biosynthetic process
 is_a: GO:0008055 ! ocellus pigment biosynthetic process
 is_a: GO:0046152 ! ommochrome metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0006728
@@ -74147,7 +74759,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving any phosphorylated nucleoside." [GOC:mah]
 synonym: "nucleoside phosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0055086 ! nucleobase-containing small molecule metabolic process
 
@@ -74421,16 +75032,19 @@
 
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
@@ -74599,7 +75213,7 @@
 def: "The chemical reactions and pathways involving the phosphate group, the anion or salt of any phosphoric acid." [GOC:ai]
 synonym: "phosphate metabolic process" RELATED []
 synonym: "phosphate metabolism" EXACT []
-is_a: GO:0006793 ! phosphorus metabolic process
+is_a: GO:0008152 ! metabolic process
 
 [Term]
 id: GO:0006797
@@ -74998,11 +75612,12 @@
 
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
@@ -75283,7 +75898,6 @@
 alt_id: GO:0015815
 def: "The directed movement of glutamine, 2-amino-4-carbamoylbutanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "glutamine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -76807,7 +77421,8 @@
 namespace: biological_process
 def: "Completion of folding of alpha- and beta-tubulin; takes place subsequent to chaperonin-mediated partial folding; mediated by a complex of folding cofactors." [PMID:10542094]
 xref: Reactome:R-HSA-389977 "Post-chaperonin tubulin folding pathway"
-is_a: GO:0006457 ! protein folding
+is_a: GO:0007021 ! tubulin complex assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31829" xsd:anyURI
 
 [Term]
 id: GO:0007026
@@ -79194,7 +79809,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "MAPKKK cascade (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007245
@@ -79204,7 +79819,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKKK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007246
@@ -79214,7 +79829,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007247
@@ -79224,7 +79839,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-consider: GO:0000750
+consider: GO:0071507
 
 [Term]
 id: GO:0007248
@@ -79234,7 +79849,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "nuclear translocation of MAPK (mating sensu Saccharomyces)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0007249
@@ -79402,14 +80017,13 @@
 
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
@@ -83499,7 +84113,6 @@
 xref: Reactome:R-HSA-9636560 "Eis acetylates DUSP16"
 xref: Reactome:R-HSA-9913373 "AAC(6)-Ib acetylates ciprofloxacin"
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016410 ! N-acyltransferase activity
 
 [Term]
 id: GO:0008081
@@ -83624,14 +84237,15 @@
 
 [Term]
 id: GO:0008093
-name: cytoskeletal anchor activity
+name: cytoskeletal adaptor activity
 namespace: molecular_function
 def: "The binding activity of a protein that brings together a cytoskeletal protein (either a microtubule or actin filament, spindle pole body, or protein directly bound to them) and one or more other molecules, permitting them to function in a coordinated way." [GOC:mtg_MIT_16mar07, PMID:30323238]
-synonym: "cytoskeletal adaptor activity" EXACT []
+synonym: "cytoskeletal anchor activity" NARROW []
 is_a: GO:0030674 ! protein-macromolecule adaptor activity
 relationship: has_part GO:0008092 ! cytoskeletal protein binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17668" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19119" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19185" xsd:anyURI
 
 [Term]
 id: GO:0008094
@@ -83749,10 +84363,84 @@
 xref: Reactome:R-HSA-9027600 "Dehydrogenase dehydrogenates 17-HDPAn-3 to 17-oxo-DPAn-3"
 xref: Reactome:R-HSA-9937340 "DHRSX reduces dolichal to dolichol"
 xref: RHEA:15937
+xref: RHEA:20193
+xref: RHEA:38111
+xref: RHEA:54916
+xref: RHEA:54920
+xref: RHEA:58328
+xref: RHEA:58332
+xref: RHEA:58336
+xref: RHEA:58364
+xref: RHEA:58368
+xref: RHEA:58372
+xref: RHEA:58376
+xref: RHEA:58380
+xref: RHEA:58384
+xref: RHEA:58400
+xref: RHEA:58404
+xref: RHEA:58408
+xref: RHEA:58420
+xref: RHEA:58424
+xref: RHEA:58428
+xref: RHEA:58432
+xref: RHEA:58436
+xref: RHEA:58668
+xref: RHEA:59448
+xref: RHEA:59452
+xref: RHEA:59456
+xref: RHEA:59460
+xref: RHEA:59464
+xref: RHEA:59928
+xref: RHEA:63496
+xref: RHEA:64708
+xref: RHEA:64712
+xref: RHEA:66448
+xref: RHEA:76611
+xref: RHEA:80723
+xref: RHEA:84055
+xref: RHEA:84059
+xref: RHEA:84063
 is_a: GO:0018455 ! alcohol dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.1.1.2
 property_value: skos:narrowMatch MetaCyc:ALCOHOL-DEHYDROGENASE-NADPORNOP+-RXN
 property_value: skos:narrowMatch RHEA:15937
+property_value: skos:narrowMatch RHEA:20193
+property_value: skos:narrowMatch RHEA:38111
+property_value: skos:narrowMatch RHEA:54916
+property_value: skos:narrowMatch RHEA:54920
+property_value: skos:narrowMatch RHEA:58328
+property_value: skos:narrowMatch RHEA:58332
+property_value: skos:narrowMatch RHEA:58336
+property_value: skos:narrowMatch RHEA:58364
+property_value: skos:narrowMatch RHEA:58368
+property_value: skos:narrowMatch RHEA:58372
+property_value: skos:narrowMatch RHEA:58376
+property_value: skos:narrowMatch RHEA:58380
+property_value: skos:narrowMatch RHEA:58384
+property_value: skos:narrowMatch RHEA:58400
+property_value: skos:narrowMatch RHEA:58404
+property_value: skos:narrowMatch RHEA:58408
+property_value: skos:narrowMatch RHEA:58420
+property_value: skos:narrowMatch RHEA:58424
+property_value: skos:narrowMatch RHEA:58428
+property_value: skos:narrowMatch RHEA:58432
+property_value: skos:narrowMatch RHEA:58436
+property_value: skos:narrowMatch RHEA:58668
+property_value: skos:narrowMatch RHEA:59448
+property_value: skos:narrowMatch RHEA:59452
+property_value: skos:narrowMatch RHEA:59456
+property_value: skos:narrowMatch RHEA:59460
+property_value: skos:narrowMatch RHEA:59464
+property_value: skos:narrowMatch RHEA:59928
+property_value: skos:narrowMatch RHEA:63496
+property_value: skos:narrowMatch RHEA:64708
+property_value: skos:narrowMatch RHEA:64712
+property_value: skos:narrowMatch RHEA:66448
+property_value: skos:narrowMatch RHEA:76611
+property_value: skos:narrowMatch RHEA:80723
+property_value: skos:narrowMatch RHEA:84055
+property_value: skos:narrowMatch RHEA:84059
+property_value: skos:narrowMatch RHEA:84063
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28183" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28532" xsd:anyURI
 
@@ -83790,11 +84478,13 @@
 xref: Reactome:R-HSA-9036987 "FUT2 transfers Fuc to Type 1 chains to form H antigen-sec"
 xref: Reactome:R-HSA-9603982 "FUT2 transfers Fuc to LeA to form LeB"
 xref: Reactome:R-HSA-9603983 "FUT2 transfers Fuc to LeX to form LeY"
+xref: RHEA:32175
 xref: RHEA:48792
 xref: RHEA:50664
 is_a: GO:0031127 ! alpha-(1,2)-fucosyltransferase activity
 property_value: skos:exactMatch EC:2.4.1.69
 property_value: skos:exactMatch RHEA:50664
+property_value: skos:narrowMatch RHEA:32175
 property_value: skos:narrowMatch RHEA:48792
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -84021,15 +84711,19 @@
 synonym: "neolactotetraosylceramide alpha-2,3-sialyltransferase activity" NARROW [EC:2.4.3.6]
 xref: EC:2.4.3.6
 xref: MetaCyc:2.4.99.6-RXN
+xref: RHEA:18913
 xref: RHEA:52316
 xref: RHEA:56264
 xref: RHEA:65432
+xref: RHEA:80751
 xref: RHEA:80755
 is_a: GO:0008373 ! sialyltransferase activity
 property_value: skos:exactMatch EC:2.4.3.6
 property_value: skos:exactMatch RHEA:52316
+property_value: skos:narrowMatch RHEA:18913
 property_value: skos:narrowMatch RHEA:56264
 property_value: skos:narrowMatch RHEA:65432
+property_value: skos:narrowMatch RHEA:80751
 property_value: skos:narrowMatch RHEA:80755
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -84110,12 +84804,13 @@
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
 
@@ -84405,17 +85100,18 @@
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
@@ -84599,7 +85295,7 @@
 id: GO:0008153
 name: 4-aminobenzoate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [ISBN:0198506732, MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
+def: "The chemical reactions and pathways resulting in the formation of 4-aminobenzoate, an intermediate in the synthesis of folic acid, a compound which some organisms, e.g. prokaryotes, eukaryotic microbes, and plants, can synthesize de novo. Others, notably mammals, cannot. In yeast, it is present as a factor in the B complex of vitamins." [MetaCyc:PWY-6543, PMID:11377864, PMID:11960743]
 synonym: "4-aminobenzoic acid biosynthesis" EXACT []
 synonym: "4-aminobenzoic acid biosynthetic process" EXACT []
 synonym: "p-aminobenzoic acid biosynthesis" EXACT []
@@ -84617,8 +85313,8 @@
 xref: MetaCyc:PWY-8276
 xref: MetaCyc:PWY-8281
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
-is_a: GO:0046482 ! para-aminobenzoic acid metabolic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
+is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-6543
 property_value: skos:narrowMatch MetaCyc:PWY-8276
@@ -84894,6 +85590,8 @@
 xref: Reactome:R-HSA-70994 "SDH complex dehydrogenates succinate"
 xref: RHEA:13713
 xref: RHEA:27834
+xref: RHEA:29215
+xref: RHEA:33863
 xref: RHEA:40523
 xref: RHEA:75711
 is_a: GO:0000104 ! succinate dehydrogenase activity
@@ -84902,6 +85600,8 @@
 property_value: skos:exactMatch RHEA:40523
 property_value: skos:narrowMatch RHEA:13713
 property_value: skos:narrowMatch RHEA:27834
+property_value: skos:narrowMatch RHEA:29215
+property_value: skos:narrowMatch RHEA:33863
 property_value: skos:narrowMatch RHEA:75711
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26087" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27915" xsd:anyURI
@@ -87056,9 +87756,10 @@
 
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
@@ -87070,7 +87771,9 @@
 xref: Reactome:R-HSA-422104 "Ghrelin O-acyltransferase octanoylates Proghrelin"
 xref: Reactome:R-HSA-5358343 "HHAT palmitoylates Hh N-terminal fragment"
 xref: Reactome:R-HSA-5483229 "HHAT G287V doesn't palmitoylate Hh-Np"
-is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31814" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016747
 
 [Term]
 id: GO:0008375
@@ -87422,7 +88125,7 @@
 xref: RHEA:45960
 xref: RHEA:54028
 xref: RHEA:75439
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 is_a: GO:0032451 ! demethylase activity
 property_value: skos:exactMatch EC:1.14.14.154
 property_value: skos:exactMatch RHEA:54028
@@ -87432,6 +88135,7 @@
 property_value: skos:narrowMatch RHEA:75439
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22523" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0008399
@@ -87556,12 +88260,15 @@
 
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
@@ -89012,7 +89719,6 @@
 xref: Reactome:R-HSA-380620 "Reuptake of serotonin from the synapse"
 xref: Reactome:R-HSA-5660706 "Defective SLC6A3 does not cotransport DA, Na+ from extracellular region to cytosol"
 is_a: GO:0022804 ! active transmembrane transporter activity
-relationship: part_of GO:0015844 ! monoamine transport
 
 [Term]
 id: GO:0008506
@@ -89049,8 +89755,9 @@
 xref: Reactome:R-HSA-194121 "SLC10A1 co-transport bile salts and Na+ from extracellular region to cytosol"
 xref: Reactome:R-HSA-194187 "SLC10A2 transports bile salts and acids and Na+ from extracellular region to cytosol"
 xref: Reactome:R-HSA-433089 "SOAT can transport taurolithocholate-3-sulphate"
+is_a: GO:0005343 ! organic acid:sodium symporter activity
 is_a: GO:0015125 ! bile acid transmembrane transporter activity
-is_a: GO:0140161 ! monocarboxylate:sodium symporter activity
+is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
 
 [Term]
 id: GO:0008509
@@ -89169,7 +89876,7 @@
 xref: Reactome:R-HSA-200652 "SLC19A1 transports 5-methyl-THF from extracellular region to cytosol"
 xref: Reactome:R-HSA-200680 "SLC25A32 transports THF from cytosol to mitochondrial matrix"
 xref: Reactome:R-HSA-200720 "SLC25A32 transports THF from mitochondrial matrix to cytosol"
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 is_a: GO:0090482 ! vitamin transmembrane transporter activity
 relationship: part_of GO:0015884 ! folic acid transport
@@ -90258,11 +90965,11 @@
 synonym: "protein hypusination" EXACT []
 xref: MetaCyc:PWY-5905
 xref: Reactome:R-HSA-204626 "Hypusine synthesis from eIF5A-lysine"
-is_a: GO:0018205 ! peptidyl-lysine modification
+is_a: GO:0009058 ! biosynthetic process
 is_a: GO:0051604 ! protein maturation
-is_a: GO:1901607 ! alpha-amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31510" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31884" xsd:anyURI
 
 [Term]
 id: GO:0008613
@@ -90558,6 +91265,7 @@
 synonym: "rRNA (uridine-2'-O-)-methyltransferase activity" EXACT []
 xref: Reactome:R-HSA-6793127 "MRM2 (FTSJ2) methylates uridine-1369 of 16S rRNA yielding 2'-O-methyluridine"
 xref: RHEA:42720
+xref: RHEA:42728
 xref: RHEA:43092
 xref: RHEA:47760
 xref: RHEA:47764
@@ -90566,6 +91274,7 @@
 is_a: GO:0062105 ! RNA 2'-O-methyltransferase activity
 property_value: skos:exactMatch RHEA:54152
 property_value: skos:narrowMatch RHEA:42720
+property_value: skos:narrowMatch RHEA:42728
 property_value: skos:narrowMatch RHEA:43092
 property_value: skos:narrowMatch RHEA:47760
 property_value: skos:narrowMatch RHEA:47764
@@ -90860,12 +91569,16 @@
 xref: MetaCyc:RXN-20995
 xref: RHEA:12136
 xref: RHEA:45232
+xref: RHEA:53296
+xref: RHEA:53708
 is_a: GO:0016628 ! oxidoreductase activity, acting on the CH-CH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.3.1.34
 property_value: skos:narrowMatch MetaCyc:RXN-20994
 property_value: skos:narrowMatch MetaCyc:RXN-20995
 property_value: skos:narrowMatch RHEA:12136
 property_value: skos:narrowMatch RHEA:45232
+property_value: skos:narrowMatch RHEA:53296
+property_value: skos:narrowMatch RHEA:53708
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 
 [Term]
@@ -91330,7 +92043,7 @@
 id: GO:0008695
 name: 3-phenylpropionate dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 3-phenylpropionate + NADH + H+ + O2 = NAD+ + cis-3-(3-carboxyethyl)-3,5-cyclohexadiene-1,2-diol." [UM-BBD_enzymeID:e0307]
+def: "Catalysis of the reaction: 3-phenylpropanoate + NADH + O2 + H+ = 3-(cis-5,6-dihydroxycyclohexa-1,3-dien-1-yl)propanoate + NAD+." [RHEA:20357]
 synonym: "3-phenylpropanoate dioxygenase activity" RELATED [EC:1.14.12.19]
 synonym: "3-phenylpropanoate,NADH:oxygen oxidoreductase (2,3-hydroxylating) activity" RELATED [EC:1.14.12.19]
 synonym: "Hca dioxygenase activity" RELATED [EC:1.14.12.19]
@@ -91716,6 +92429,7 @@
 xref: EC:1.4.5.1
 xref: MetaCyc:RXN-11193
 xref: RHEA:18125
+xref: RHEA:30091
 xref: RHEA:37219
 xref: RHEA:37255
 xref: RHEA:43572
@@ -91725,6 +92439,7 @@
 property_value: skos:exactMatch RHEA:18125
 property_value: skos:narrowMatch EC:1.4.5.1
 property_value: skos:narrowMatch MetaCyc:RXN-11193
+property_value: skos:narrowMatch RHEA:30091
 property_value: skos:narrowMatch RHEA:37219
 property_value: skos:narrowMatch RHEA:37255
 property_value: skos:narrowMatch RHEA:43572
@@ -92247,6 +92962,7 @@
 xref: RHEA:61980
 xref: RHEA:63492
 xref: RHEA:83239
+xref: RHEA:83247
 is_a: GO:0003955 ! NAD(P)H dehydrogenase (quinone) activity
 is_a: GO:0003959 ! NADPH dehydrogenase activity
 property_value: skos:exactMatch EC:1.6.5.10
@@ -92257,6 +92973,7 @@
 property_value: skos:narrowMatch RHEA:61980
 property_value: skos:narrowMatch RHEA:63492
 property_value: skos:narrowMatch RHEA:83239
+property_value: skos:narrowMatch RHEA:83247
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 
 [Term]
@@ -92381,7 +93098,7 @@
 id: GO:0008762
 name: UDP-N-acetylmuramate dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: UDP-N-acetylmuramate + NADP+ = UDP-N-acetyl-3-O-(1-carboxyvinyl)-D-glucosamine + NADPH + H+." [EC:1.3.1.98]
+def: "Catalysis of the reaction: UDP-N-acetyl-alpha-D-muramate + NADP+ = UDP-N-acetyl-3-O-(1-carboxyvinyl)-alpha-D-glucosamine + NADPH + H+." [RHEA:12248]
 synonym: "MurB reductase" RELATED [EC:1.3.1.98]
 synonym: "UDP-GlcNAc-enoylpyruvate reductase activity" RELATED [EC:1.3.1.98]
 synonym: "UDP-N-acetylenolpyruvoylglucosamine reductase activity" RELATED [EC:1.3.1.98]
@@ -92393,10 +93110,11 @@
 xref: EC:1.3.1.98
 xref: MetaCyc:UDPNACETYLMURAMATEDEHYDROG-RXN
 xref: RHEA:12248
-is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+is_a: GO:0016628 ! oxidoreductase activity, acting on the CH-CH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.3.1.98
 property_value: skos:exactMatch RHEA:12248
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0008763
@@ -92635,7 +93353,7 @@
 id: GO:0008775
 name: acetate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acyl-CoA + acetate = a fatty acid anion + acetyl-CoA." [EC:2.8.3.8]
+def: "Catalysis of the reaction: an acyl-CoA + acetate = a carboxylate + acetyl-CoA." [RHEA:13381]
 synonym: "acetate coenzyme A-transferase activity" RELATED [EC:2.8.3.8]
 synonym: "acetyl-CoA:acetoacetate CoA transferase activity" RELATED [EC:2.8.3.8]
 synonym: "acyl-CoA:acetate CoA-transferase activity" RELATED [EC:2.8.3.8]
@@ -92702,7 +93420,7 @@
 xref: EC:2.3.1.40
 xref: MetaCyc:ACYLGPEACYLTRANS-RXN
 xref: RHEA:10304
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.40
 property_value: skos:exactMatch RHEA:10304
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -92722,7 +93440,7 @@
 xref: MetaCyc:RXN-22480
 xref: RHEA:13925
 xref: RHEA:67812
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.129
 property_value: skos:exactMatch RHEA:67812
 property_value: skos:narrowMatch RHEA:13925
@@ -93166,27 +93884,29 @@
 
 [Term]
 id: GO:0008805
-name: carbon-monoxide oxygenase activity
+name: aerobic carbon monoxide dehydrogenase activity
 namespace: molecular_function
 alt_id: GO:0018999
 alt_id: GO:0047767
-def: "Catalysis of the reaction: CO + H2O + ferrocytochrome b-561 = CO2 + 2 H+ + 2 ferricytochrome b-561." [GOC:curators, RHEA:48880]
+def: "Catalysis of the reaction: CO + a quinone + H2O = a quinol + CO2." [RHEA:48880]
 synonym: "carbon monoxide oxidase activity" RELATED []
 synonym: "carbon monoxide oxygenase (cytochrome b-561) activity" NARROW []
 synonym: "carbon monoxide oxygenase activity" EXACT []
 synonym: "carbon monoxide,water:cytochrome b-561 oxidoreductase activity" RELATED []
 synonym: "carbon monoxide:methylene blue oxidoreductase activity" NARROW []
 synonym: "carbon-monoxide dehydrogenase (cytochrome b-561)" RELATED []
+synonym: "carbon-monoxide oxygenase activity" BROAD []
 synonym: "cytochrome b561" NARROW []
 xref: EC:1.2.5.3
 xref: MetaCyc:RXN-21452
 xref: RHEA:48880
 xref: UM-BBD_reactionID:r0650
 xref: Wikipedia:Carbon-monoxide_dehydrogenase_(cytochrome_b-561)
-is_a: GO:0016622 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, cytochrome as acceptor
+is_a: GO:0052738 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, with a quinone or similar compound as acceptor
 property_value: skos:exactMatch EC:1.2.5.3
 property_value: skos:exactMatch RHEA:48880
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31984" xsd:anyURI
 
 [Term]
 id: GO:0008806
@@ -93343,7 +94063,7 @@
 id: GO:0008814
 name: citrate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + citrate = acetate + (3S)-citryl-CoA." [EC:2.8.3.10]
+def: "Catalysis of the reaction: acetyl-CoA + citrate = acetate + (3S)-citryl-CoA." [RHEA:19405]
 synonym: "acetyl-CoA:citrate CoA-transferase activity" RELATED [EC:2.8.3.10]
 xref: EC:2.8.3.10
 xref: MetaCyc:CITTRANS-RXN
@@ -93821,11 +94541,12 @@
 xref: MetaCyc:RXN-14014
 xref: RHEA:35323
 xref: RHEA:35331
-is_a: GO:0016628 ! oxidoreductase activity, acting on the CH-CH group of donors, NAD or NADP as acceptor
+is_a: GO:0016726 ! oxidoreductase activity, acting on CH or CH2 groups, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.17.1.8
 property_value: skos:narrowMatch RHEA:35323
 property_value: skos:narrowMatch RHEA:35331
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27695" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0008840
@@ -94137,11 +94858,12 @@
 xref: MetaCyc:1.2.1.2-RXN
 xref: RHEA:15985
 xref: UM-BBD_reactionID:r0103
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0016726 ! oxidoreductase activity, acting on CH or CH2 groups, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.17.1.9
 property_value: skos:exactMatch RHEA:15985
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28183" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0008864
@@ -95186,12 +95908,14 @@
 xref: MetaCyc:ACYLACPSYNTH-RXN
 xref: RHEA:10696
 xref: RHEA:45588
+xref: RHEA:59164
 xref: RHEA:63628
 xref: RHEA:64888
 is_a: GO:0015645 ! fatty acid ligase activity
 property_value: skos:exactMatch EC:6.2.1.20
 property_value: skos:exactMatch RHEA:45588
 property_value: skos:narrowMatch RHEA:10696
+property_value: skos:narrowMatch RHEA:59164
 property_value: skos:narrowMatch RHEA:63628
 property_value: skos:narrowMatch RHEA:64888
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26445" xsd:anyURI
@@ -95226,6 +95950,7 @@
 xref: MetaCyc:MALATE-DEHYDROGENASE-ACCEPTOR-RXN
 xref: MetaCyc:RXNI-3
 xref: RHEA:29083
+xref: RHEA:29087
 xref: RHEA:30095
 xref: RHEA:46012
 is_a: GO:0016615 ! malate dehydrogenase activity
@@ -95235,6 +95960,7 @@
 property_value: skos:exactMatch RHEA:46012
 property_value: skos:narrowMatch MetaCyc:RXNI-3
 property_value: skos:narrowMatch RHEA:29083
+property_value: skos:narrowMatch RHEA:29087
 property_value: skos:narrowMatch RHEA:30095
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
@@ -95511,7 +96237,7 @@
 
 [Term]
 id: GO:0008941
-name: nitric oxide dioxygenase NAD(P)H activity
+name: nitric oxide dioxygenase [NAD(P)H] activity
 namespace: molecular_function
 def: "Catalysis of the reaction: 2 NO + 2 O2 + NAD(P)H + H+ = 2 nitrate + NAD(P)+." [EC:1.14.12.17]
 comment: Note that this activity is similar to nitric oxide dioxygenase activity, heme protein ; GO:0141118, but GO:0141118 uses a heme protein as the electron donor.
@@ -95815,10 +96541,12 @@
 xref: Reactome:R-HSA-1483197 "PTPMT1 dephosphorylates PGP to PG"
 xref: RHEA:16725
 xref: RHEA:33752
+xref: RHEA:42305
 is_a: GO:0016791 ! phosphatase activity
 property_value: skos:exactMatch EC:3.1.3.27
 property_value: skos:exactMatch RHEA:16725
 property_value: skos:narrowMatch RHEA:33752
+property_value: skos:narrowMatch RHEA:42305
 
 [Term]
 id: GO:0008963
@@ -95958,22 +96686,76 @@
 xref: Reactome:R-HSA-8869425 "PLA1A hydrolyses PS to 2-acyl LPS"
 xref: RHEA:18689
 xref: RHEA:35263
+xref: RHEA:38783
+xref: RHEA:38787
+xref: RHEA:40487
+xref: RHEA:41167
+xref: RHEA:41171
+xref: RHEA:41207
 xref: RHEA:42212
+xref: RHEA:43968
 xref: RHEA:44408
 xref: RHEA:44648
+xref: RHEA:53496
+xref: RHEA:56448
 xref: RHEA:62032
+xref: RHEA:62044
+xref: RHEA:62464
+xref: RHEA:62480
+xref: RHEA:62484
+xref: RHEA:62488
+xref: RHEA:66708
 xref: RHEA:67424
 xref: RHEA:67428
+xref: RHEA:73967
+xref: RHEA:73971
+xref: RHEA:73975
+xref: RHEA:74103
+xref: RHEA:74159
+xref: RHEA:74163
+xref: RHEA:74247
+xref: RHEA:74251
+xref: RHEA:76971
+xref: RHEA:76975
+xref: RHEA:76979
+xref: RHEA:76983
 is_a: GO:0140322 ! A1-type glycerophospholipase activity
 property_value: skos:exactMatch EC:3.1.1.32
 property_value: skos:exactMatch RHEA:67424
 property_value: skos:narrowMatch RHEA:18689
 property_value: skos:narrowMatch RHEA:35263
+property_value: skos:narrowMatch RHEA:38783
+property_value: skos:narrowMatch RHEA:38787
+property_value: skos:narrowMatch RHEA:40487
+property_value: skos:narrowMatch RHEA:41167
+property_value: skos:narrowMatch RHEA:41171
+property_value: skos:narrowMatch RHEA:41207
 property_value: skos:narrowMatch RHEA:42212
+property_value: skos:narrowMatch RHEA:43968
 property_value: skos:narrowMatch RHEA:44408
 property_value: skos:narrowMatch RHEA:44648
+property_value: skos:narrowMatch RHEA:53496
+property_value: skos:narrowMatch RHEA:56448
 property_value: skos:narrowMatch RHEA:62032
+property_value: skos:narrowMatch RHEA:62044
+property_value: skos:narrowMatch RHEA:62464
+property_value: skos:narrowMatch RHEA:62480
+property_value: skos:narrowMatch RHEA:62484
+property_value: skos:narrowMatch RHEA:62488
+property_value: skos:narrowMatch RHEA:66708
 property_value: skos:narrowMatch RHEA:67428
+property_value: skos:narrowMatch RHEA:73967
+property_value: skos:narrowMatch RHEA:73971
+property_value: skos:narrowMatch RHEA:73975
+property_value: skos:narrowMatch RHEA:74103
+property_value: skos:narrowMatch RHEA:74159
+property_value: skos:narrowMatch RHEA:74163
+property_value: skos:narrowMatch RHEA:74247
+property_value: skos:narrowMatch RHEA:74251
+property_value: skos:narrowMatch RHEA:76971
+property_value: skos:narrowMatch RHEA:76975
+property_value: skos:narrowMatch RHEA:76979
+property_value: skos:narrowMatch RHEA:76983
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 
 [Term]
@@ -97510,7 +98292,7 @@
 id: GO:0009067
 name: aspartate family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids of the aspartate family, comprising asparagine, aspartate, lysine, methionine and threonine." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the formation of L-aspartate or any of the amino acids synthesised from it (L-asparagine, L-lysine, L-methionine, L-threonine and L-isoleucine)." [GOC:curators]
 synonym: "aspartate family amino acid anabolism" EXACT []
 synonym: "aspartate family amino acid biosynthesis" EXACT []
 synonym: "aspartate family amino acid formation" EXACT []
@@ -97519,6 +98301,7 @@
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
 [Term]
 id: GO:0009068
@@ -97546,7 +98329,7 @@
 id: GO:0009070
 name: serine family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids of the serine family, comprising cysteine, glycine, homoserine, selenocysteine and serine." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the formation of an amino acid derived from 3-phosphoglycerate (L-serine, glycine, L-cysteine and L-homocysteine)." [GOC:curators]
 synonym: "serine family amino acid anabolism" EXACT []
 synonym: "serine family amino acid biosynthesis" EXACT []
 synonym: "serine family amino acid formation" EXACT []
@@ -97554,6 +98337,7 @@
 is_a: GO:1901607 ! alpha-amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
 [Term]
 id: GO:0009071
@@ -97580,10 +98364,10 @@
 
 [Term]
 id: GO:0009073
-name: aromatic amino acid family biosynthetic process
+name: aromatic amino acid biosynthetic process
 namespace: biological_process
 alt_id: GO:0016089
-def: "The chemical reactions and pathways resulting in the formation of aromatic amino acid family, amino acids with aromatic ring (phenylalanine, tyrosine, tryptophan)." [GOC:curators]
+def: "The chemical reactions and pathways resulting in the formation of an amino acid whose structure includes an aromatic ring." [GOC:curators]
 synonym: "aromatic amino acid family anabolism" EXACT []
 synonym: "aromatic amino acid family biosynthesis" EXACT []
 synonym: "aromatic amino acid family biosynthetic process, shikimate pathway" RELATED []
@@ -97592,6 +98376,7 @@
 xref: MetaCyc:COMPLETE-ARO-PWY
 is_a: GO:0009072 ! aromatic amino acid metabolic process
 is_a: GO:0046394 ! carboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
 [Term]
 id: GO:0009074
@@ -97655,13 +98440,14 @@
 id: GO:0009079
 name: pyruvate family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of any amino acid that requires pyruvate for its synthesis, e.g. alanine." [GOC:jl]
+def: "The chemical reactions and pathways resulting in the formation of an L-amino acid derived from pyruvate (L-alanine, L-valine, and L-leucine)." [GOC:curators]
 synonym: "pyruvate family amino acid anabolism" EXACT []
 synonym: "pyruvate family amino acid biosynthesis" EXACT []
 synonym: "pyruvate family amino acid formation" EXACT []
 synonym: "pyruvate family amino acid synthesis" EXACT []
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
 [Term]
 id: GO:0009080
@@ -97713,9 +98499,9 @@
 
 [Term]
 id: GO:0009084
-name: L-glutamine family amino acid biosynthetic process
+name: glutamate family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of amino acids of the glutamine family, comprising arginine, glutamate, glutamine and proline." [GOC:ai]
+def: "The chemical reactions and pathways resulting in the formation of L-glutamate or any of the amino acids synthesised from it (L-glutamine, L-proline and L-arginine)." [GOC:curators]
 synonym: "glutamine family amino acid anabolism" EXACT []
 synonym: "glutamine family amino acid biosynthesis" EXACT []
 synonym: "glutamine family amino acid formation" EXACT []
@@ -97724,6 +98510,7 @@
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 
 [Term]
 id: GO:0009085
@@ -97770,6 +98557,8 @@
 name: L-methionine catabolic process
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of L-methionine." [GOC:curators]
+synonym: "L-methionine catabolic process via Ehrlich pathway" NARROW []
+synonym: "L-methionine degradation via Ehrlich pathway" NARROW []
 synonym: "methionine breakdown" EXACT []
 synonym: "methionine catabolism" EXACT []
 synonym: "methionine degradation" EXACT []
@@ -97786,6 +98575,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-701
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31405" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31839" xsd:anyURI
 
 [Term]
 id: GO:0009088
@@ -97831,7 +98621,6 @@
 synonym: "homoserine formation" EXACT []
 synonym: "homoserine synthesis" EXACT []
 xref: MetaCyc:HOMOSERSYN-PWY
-is_a: GO:0009070 ! serine family amino acid biosynthetic process
 is_a: GO:0009092 ! L-homoserine metabolic process
 is_a: GO:0170034 ! L-amino acid biosynthetic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
@@ -97894,7 +98683,7 @@
 xref: MetaCyc:PWY-3462
 xref: MetaCyc:PWY-7432
 is_a: GO:0006558 ! L-phenylalanine metabolic process
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 is_a: GO:1902223 ! erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PHESYN
 property_value: skos:narrowMatch MetaCyc:PWY-3462
@@ -97903,7 +98692,7 @@
 
 [Term]
 id: GO:0009095
-name: aromatic amino acid family biosynthetic process, prephenate pathway
+name: aromatic amino acid biosynthetic process, prephenate pathway
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of phenylalanine and tyrosine from other compounds, including chorismate, via the intermediate prephenate." [GOC:mah, ISBN:0471331309, MetaCyc:PWY-3481]
 synonym: "aromatic amino acid family anabolism, prephenate pathway" EXACT []
@@ -97912,7 +98701,7 @@
 synonym: "aromatic amino acid family formation, prephenate pathway" EXACT []
 synonym: "aromatic amino acid family synthesis, prephenate pathway" EXACT []
 xref: MetaCyc:PWY-3481
-is_a: GO:0009073 ! aromatic amino acid family biosynthetic process
+is_a: GO:0009073 ! aromatic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31091" xsd:anyURI
 
 [Term]
@@ -97955,13 +98744,8 @@
 synonym: "valine formation" EXACT []
 synonym: "valine synthesis" EXACT []
 xref: MetaCyc:VALSYN-PWY
-is_a: GO:0006573 ! valine metabolic process
 is_a: GO:0009079 ! pyruvate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
-relationship: has_part GO:0003984 ! acetolactate synthase activity
-relationship: has_part GO:0004160 ! dihydroxy-acid dehydratase activity
-relationship: has_part GO:0004455 ! ketol-acid reductoisomerase activity
-relationship: has_part GO:0052655 ! L-valine:2-oxoglutarate transaminase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28686" xsd:anyURI
 
 [Term]
@@ -98863,7 +99647,6 @@
 synonym: "purine deoxyribonucleoside diphosphate synthesis" EXACT []
 is_a: GO:0009136 ! purine nucleoside diphosphate biosynthetic process
 is_a: GO:0009182 ! purine deoxyribonucleoside diphosphate metabolic process
-is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 
 [Term]
 id: GO:0009184
@@ -98875,7 +99658,6 @@
 synonym: "purine deoxyribonucleoside diphosphate degradation" EXACT []
 is_a: GO:0009137 ! purine nucleoside diphosphate catabolic process
 is_a: GO:0009182 ! purine deoxyribonucleoside diphosphate metabolic process
-is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 
 [Term]
 id: GO:0009185
@@ -98924,7 +99706,8 @@
 synonym: "deoxyribonucleoside diphosphate biosynthesis" EXACT []
 synonym: "deoxyribonucleoside diphosphate formation" EXACT []
 synonym: "deoxyribonucleoside diphosphate synthesis" EXACT []
-is_a: GO:0009133 ! nucleoside diphosphate biosynthetic process
+is_a: GO:0006793 ! phosphorus metabolic process
+is_a: GO:0009058 ! biosynthetic process
 
 [Term]
 id: GO:0009190
@@ -98957,7 +99740,8 @@
 synonym: "deoxyribonucleoside diphosphate breakdown" EXACT []
 synonym: "deoxyribonucleoside diphosphate catabolism" EXACT []
 synonym: "deoxyribonucleoside diphosphate degradation" EXACT []
-is_a: GO:0009134 ! nucleoside diphosphate catabolic process
+is_a: GO:0006793 ! phosphorus metabolic process
+is_a: GO:0009056 ! catabolic process
 
 [Term]
 id: GO:0009193
@@ -99011,7 +99795,6 @@
 synonym: "pyrimidine deoxyribonucleoside diphosphate formation" EXACT []
 synonym: "pyrimidine deoxyribonucleoside diphosphate synthesis" EXACT []
 is_a: GO:0009139 ! pyrimidine nucleoside diphosphate biosynthetic process
-is_a: GO:0009189 ! deoxyribonucleoside diphosphate biosynthetic process
 is_a: GO:0009196 ! pyrimidine deoxyribonucleoside diphosphate metabolic process
 
 [Term]
@@ -99023,7 +99806,6 @@
 synonym: "pyrimidine deoxyribonucleoside diphosphate catabolism" EXACT []
 synonym: "pyrimidine deoxyribonucleoside diphosphate degradation" EXACT []
 is_a: GO:0009140 ! pyrimidine nucleoside diphosphate catabolic process
-is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0009196 ! pyrimidine deoxyribonucleoside diphosphate metabolic process
 
 [Term]
@@ -99042,7 +99824,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving a deoxyribonucleoside triphosphate, a compound consisting of a nucleobase linked to a deoxyribose sugar esterified with triphosphate on the sugar." [GOC:curators, ISBN:0198506732]
 synonym: "deoxyribonucleoside triphosphate metabolism" EXACT []
-is_a: GO:0009141 ! nucleoside triphosphate metabolic process
+is_a: GO:0009394 ! 2'-deoxyribonucleotide metabolic process
 
 [Term]
 id: GO:0009201
@@ -99064,8 +99846,8 @@
 synonym: "deoxyribonucleoside triphosphate biosynthesis" EXACT []
 synonym: "deoxyribonucleoside triphosphate formation" EXACT []
 synonym: "deoxyribonucleoside triphosphate synthesis" EXACT []
-is_a: GO:0009142 ! nucleoside triphosphate biosynthetic process
 is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
+is_a: GO:0009265 ! 2'-deoxyribonucleotide biosynthetic process
 
 [Term]
 id: GO:0009203
@@ -99085,8 +99867,9 @@
 synonym: "deoxyribonucleoside triphosphate breakdown" EXACT []
 synonym: "deoxyribonucleoside triphosphate catabolism" EXACT []
 synonym: "deoxyribonucleoside triphosphate degradation" EXACT []
-is_a: GO:0009143 ! nucleoside triphosphate catabolic process
+is_a: GO:0009166 ! nucleotide catabolic process
 is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
+is_a: GO:0046386 ! deoxyribose phosphate catabolic process
 
 [Term]
 id: GO:0009205
@@ -99203,7 +99986,6 @@
 def: "The chemical reactions and pathways involving purine deoxyribonucleoside triphosphate, a compound consisting of a purine base linked to a deoxyribose sugar esterified with triphosphate on the sugar." [GOC:curators, ISBN:0198506732]
 synonym: "purine deoxyribonucleoside triphosphate metabolism" EXACT []
 is_a: GO:0009144 ! purine nucleoside triphosphate metabolic process
-is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 
 [Term]
 id: GO:0009216
@@ -99215,7 +99997,6 @@
 synonym: "purine deoxyribonucleoside triphosphate formation" EXACT []
 synonym: "purine deoxyribonucleoside triphosphate synthesis" EXACT []
 is_a: GO:0009145 ! purine nucleoside triphosphate biosynthetic process
-is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009215 ! purine deoxyribonucleoside triphosphate metabolic process
 
 [Term]
@@ -99227,7 +100008,6 @@
 synonym: "purine deoxyribonucleoside triphosphate catabolism" EXACT []
 synonym: "purine deoxyribonucleoside triphosphate degradation" EXACT []
 is_a: GO:0009146 ! purine nucleoside triphosphate catabolic process
-is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009215 ! purine deoxyribonucleoside triphosphate metabolic process
 
 [Term]
@@ -101651,8 +102431,15 @@
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
@@ -101662,15 +102449,26 @@
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
@@ -101678,9 +102476,11 @@
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
@@ -101700,7 +102500,6 @@
 synonym: "gamma-aminobutyric acid synthesis" EXACT []
 xref: Reactome:R-HSA-888568 "GABA synthesis"
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31732" xsd:anyURI
 
@@ -101719,6 +102518,7 @@
 synonym: "gamma-aminobutyric acid catabolic process" EXACT []
 synonym: "gamma-aminobutyric acid catabolism" EXACT []
 synonym: "gamma-aminobutyric acid degradation" EXACT []
+xref: MetaCyc:4AMINOBUTMETAB-PWY
 xref: MetaCyc:PWY-5022
 xref: MetaCyc:PWY-6473
 xref: MetaCyc:PWY-6535
@@ -101726,8 +102526,8 @@
 xref: MetaCyc:PWY-6537
 xref: Reactome:R-HSA-916853 "Degradation of GABA"
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0009448 ! GABA metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
+property_value: skos:narrowMatch MetaCyc:4AMINOBUTMETAB-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-5022
 property_value: skos:narrowMatch MetaCyc:PWY-6473
 property_value: skos:narrowMatch MetaCyc:PWY-6535
@@ -109705,19 +110505,19 @@
 id: GO:0010242
 name: oxygen evolving activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2 H2O = O2 + 4 H+ + 4 e-. The evolution of oxygen from oxidizing water is carried out by the oxygen evolving complex in photosystem II of plants. P680+, the photochemically oxidized reaction-center chlorophyll of PSII, is a strong biological oxidant. The reduction potential of P680+ is more positive than that of water, and thus it can oxidize water to give O2 and H+ ions. The oxygen escapes as a gas while the H+ ions remain in solution inside the thylakoid vesicle." [GOC:kd, GOC:syr, PMID:17091926, PMID:7948862]
+def: "Catalysis of the reaction: 2 a plastoquinone + 4 hnu + 2 H2O = 2 a plastoquinol + O2. The evolution of oxygen from oxidizing water is carried out by the oxygen evolving complex in photosystem II of plants." [PMID:17091926, PMID:7948862, RHEA:36359]
 synonym: "photosynthetic water oxidation" EXACT []
 xref: EC:1.10.3.9
 xref: MetaCyc:PSII-RXN
 xref: RHEA:30247
 xref: RHEA:36359
-is_a: GO:0016491 ! oxidoreductase activity
+is_a: GO:0016682 ! oxidoreductase activity, acting on diphenols and related substances as donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.10.3.9
 property_value: skos:exactMatch MetaCyc:PSII-RXN
 property_value: skos:exactMatch RHEA:36359
 property_value: skos:narrowMatch RHEA:30247
-property_value: skos:relatedMatch MetaCyc:RXN0-5265
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31592" xsd:anyURI
 
 [Term]
 id: GO:0010243
@@ -110034,12 +110834,13 @@
 synonym: "chlorophyllide-a oxygenation activity" RELATED [EC:1.14.13.122]
 xref: EC:1.14.13.122
 xref: RHEA:30359
-is_a: GO:0016703 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of one atom of oxygen (internal monooxygenases or internal mixed function oxidases)
+is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.13.122
 property_value: skos:exactMatch RHEA:30359
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27410" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27676" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0010278
@@ -110254,10 +111055,11 @@
 xref: KEGG_REACTION:R07202
 xref: MetaCyc:1.14.13.93-RXN
 xref: RHEA:12897
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.137
 property_value: skos:exactMatch RHEA:12897
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0010296
@@ -110448,6 +111250,7 @@
 name: phosphatidylinositol-5-phosphate binding
 namespace: molecular_function
 def: "Binding to phosphatidylinositol-5-phosphate, a derivative of phosphatidylinositol in which the inositol ring is phosphorylated at the 5' position." [GOC:bf, GOC:tair_curators]
+is_a: GO:0043168 ! anion binding
 is_a: GO:1901981 ! phosphatidylinositol phosphate binding
 
 [Term]
@@ -110580,10 +111383,12 @@
 xref: EC:2.6.1.88
 xref: MetaCyc:R15-RXN
 xref: RHEA:31763
+xref: RHEA:47084
 xref: RHEA:47800
 is_a: GO:0140385 ! amino acid transaminase activity
 property_value: skos:exactMatch EC:2.6.1.88
 property_value: skos:exactMatch RHEA:31763
+property_value: skos:narrowMatch RHEA:47084
 property_value: skos:narrowMatch RHEA:47800
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -111122,11 +111927,13 @@
 
 [Term]
 id: GO:0010381
-name: peroxisome-chloroplast membrane tethering
+name: obsolete peroxisome-chloroplast membrane tethering
 namespace: biological_process
-def: "The attachment of a peroxisome to a chloroplast via molecular tethers that physically bridge their respective membranes and attach them to each other. The tethering may facilitate exchange of metabolites between the organelles." [PMID:17215364]
-synonym: "attachment of peroxisome to chloroplast" EXACT []
-is_a: GO:0140056 ! organelle localization by membrane tethering
+def: "OBSOLETE. The attachment of a peroxisome to a chloroplast via molecular tethers that physically bridge their respective membranes and attach them to each other. The tethering may facilitate exchange of metabolites between the organelles." [PMID:17215364]
+comment: This term was made obsolete because it represents a molecular function rather than a biological process.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31877" xsd:anyURI
+is_obsolete: true
+consider: GO:7770065
 
 [Term]
 id: GO:0010383
@@ -112356,20 +113163,23 @@
 
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
@@ -114725,38 +115535,33 @@
 
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
@@ -116497,9 +117302,9 @@
 namespace: biological_process
 def: "Any process that decreases the rate, frequency or extent of inositol phosphate biosynthesis. Inositol phosphate biosynthetic processes are the chemical reactions and pathways resulting in the formation of an inositol phosphate, 1,2,3,4,5,6-cyclohexanehexol, with one or more phosphate groups attached." [GOC:dph, GOC:tb]
 synonym: "negative regulation of inositol phosphate biosynthesis" EXACT [GOC:dph, GOC:tb]
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0010919 ! regulation of inositol phosphate biosynthetic process
 is_a: GO:0045912 ! negative regulation of carbohydrate metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
 is_a: GO:1902931 ! negative regulation of alcohol biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0032958 ! inositol phosphate biosynthetic process
@@ -116765,13 +117570,55 @@
 xref: Reactome:R-HSA-6809354 "NUDT7 hydrolyses CoA-SH to 3',5'-ADP and PPANT"
 xref: Reactome:R-HSA-6810474 "NUDT19 hydrolyses acyl-CoA to 3',5'-ADP and acyl-PPANT"
 xref: Reactome:R-HSA-9837354 "NUDT8 hydrolyzes CoA-SH to PPANT"
+xref: RHEA:49976
+xref: RHEA:49980
+xref: RHEA:50016
+xref: RHEA:50020
+xref: RHEA:50024
+xref: RHEA:50028
+xref: RHEA:50032
+xref: RHEA:50036
+xref: RHEA:50040
 xref: RHEA:50044
 xref: RHEA:64988
+xref: RHEA:64992
+xref: RHEA:65564
+xref: RHEA:65568
+xref: RHEA:67464
+xref: RHEA:67468
+xref: RHEA:67472
+xref: RHEA:67524
+xref: RHEA:67528
+xref: RHEA:67532
+xref: RHEA:67536
+xref: RHEA:67540
+xref: RHEA:67544
 is_a: GO:0016462 ! pyrophosphatase activity
 property_value: skos:narrowMatch EC:3.6.1.77
 property_value: skos:narrowMatch MetaCyc:RXN-10811
+property_value: skos:narrowMatch RHEA:49976
+property_value: skos:narrowMatch RHEA:49980
+property_value: skos:narrowMatch RHEA:50016
+property_value: skos:narrowMatch RHEA:50020
+property_value: skos:narrowMatch RHEA:50024
+property_value: skos:narrowMatch RHEA:50028
+property_value: skos:narrowMatch RHEA:50032
+property_value: skos:narrowMatch RHEA:50036
+property_value: skos:narrowMatch RHEA:50040
 property_value: skos:narrowMatch RHEA:50044
 property_value: skos:narrowMatch RHEA:64988
+property_value: skos:narrowMatch RHEA:64992
+property_value: skos:narrowMatch RHEA:65564
+property_value: skos:narrowMatch RHEA:65568
+property_value: skos:narrowMatch RHEA:67464
+property_value: skos:narrowMatch RHEA:67468
+property_value: skos:narrowMatch RHEA:67472
+property_value: skos:narrowMatch RHEA:67524
+property_value: skos:narrowMatch RHEA:67528
+property_value: skos:narrowMatch RHEA:67532
+property_value: skos:narrowMatch RHEA:67536
+property_value: skos:narrowMatch RHEA:67540
+property_value: skos:narrowMatch RHEA:67544
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24569" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28938" xsd:anyURI
@@ -117061,14 +117908,13 @@
 
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
 
@@ -118043,7 +118889,6 @@
 name: dopamine secretion
 namespace: biological_process
 def: "The regulated release of dopamine by a cell. Dopamine is a catecholamine and a precursor of adrenaline and noradrenaline. It acts as a neurotransmitter in the central nervous system but it is also produced peripherally and acts as a hormone." [GOC:ef]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -120242,13 +121087,66 @@
 xref: Reactome:R-HSA-9756183 "UGT1A3 lactonizes 4-OH-ATV to 4-OH-ATVL"
 xref: Reactome:R-HSA-9758661 "UGT2B7,2B17,1A3 glucuronidates PRED metabolites"
 xref: RHEA:21032
+xref: RHEA:30631
+xref: RHEA:31483
+xref: RHEA:52448
+xref: RHEA:52452
+xref: RHEA:52456
+xref: RHEA:52460
+xref: RHEA:52464
+xref: RHEA:52468
+xref: RHEA:52472
+xref: RHEA:52476
+xref: RHEA:52880
+xref: RHEA:52916
+xref: RHEA:52920
+xref: RHEA:52924
+xref: RHEA:52940
+xref: RHEA:52944
+xref: RHEA:52948
+xref: RHEA:52952
+xref: RHEA:52956
+xref: RHEA:52960
+xref: RHEA:52964
+xref: RHEA:52968
+xref: RHEA:53000
+xref: RHEA:53004
+xref: RHEA:53028
+xref: RHEA:53032
+xref: RHEA:53036
+xref: RHEA:53040
+xref: RHEA:53048
+xref: RHEA:53052
+xref: RHEA:53060
+xref: RHEA:53064
+xref: RHEA:53068
+xref: RHEA:53072
+xref: RHEA:53080
+xref: RHEA:53388
+xref: RHEA:55768
+xref: RHEA:55776
+xref: RHEA:55780
+xref: RHEA:55784
+xref: RHEA:55836
+xref: RHEA:55840
+xref: RHEA:55844
+xref: RHEA:56160
+xref: RHEA:56508
+xref: RHEA:63588
+xref: RHEA:63612
 xref: RHEA:63616
 xref: RHEA:63692
+xref: RHEA:63696
+xref: RHEA:63700
+xref: RHEA:63704
 xref: RHEA:63716
 xref: RHEA:63720
+xref: RHEA:63724
 xref: RHEA:63728
+xref: RHEA:63732
 xref: RHEA:63744
 xref: RHEA:63748
+xref: RHEA:74563
 xref: RHEA:75099
 xref: RHEA:79067
 xref: RHEA:79071
@@ -120257,13 +121155,66 @@
 is_a: GO:0016758 ! hexosyltransferase activity
 property_value: skos:exactMatch EC:2.4.1.17
 property_value: skos:exactMatch RHEA:21032
+property_value: skos:narrowMatch RHEA:30631
+property_value: skos:narrowMatch RHEA:31483
+property_value: skos:narrowMatch RHEA:52448
+property_value: skos:narrowMatch RHEA:52452
+property_value: skos:narrowMatch RHEA:52456
+property_value: skos:narrowMatch RHEA:52460
+property_value: skos:narrowMatch RHEA:52464
+property_value: skos:narrowMatch RHEA:52468
+property_value: skos:narrowMatch RHEA:52472
+property_value: skos:narrowMatch RHEA:52476
+property_value: skos:narrowMatch RHEA:52880
+property_value: skos:narrowMatch RHEA:52916
+property_value: skos:narrowMatch RHEA:52920
+property_value: skos:narrowMatch RHEA:52924
+property_value: skos:narrowMatch RHEA:52940
+property_value: skos:narrowMatch RHEA:52944
+property_value: skos:narrowMatch RHEA:52948
+property_value: skos:narrowMatch RHEA:52952
+property_value: skos:narrowMatch RHEA:52956
+property_value: skos:narrowMatch RHEA:52960
+property_value: skos:narrowMatch RHEA:52964
+property_value: skos:narrowMatch RHEA:52968
+property_value: skos:narrowMatch RHEA:53000
+property_value: skos:narrowMatch RHEA:53004
+property_value: skos:narrowMatch RHEA:53028
+property_value: skos:narrowMatch RHEA:53032
+property_value: skos:narrowMatch RHEA:53036
+property_value: skos:narrowMatch RHEA:53040
+property_value: skos:narrowMatch RHEA:53048
+property_value: skos:narrowMatch RHEA:53052
+property_value: skos:narrowMatch RHEA:53060
+property_value: skos:narrowMatch RHEA:53064
+property_value: skos:narrowMatch RHEA:53068
+property_value: skos:narrowMatch RHEA:53072
+property_value: skos:narrowMatch RHEA:53080
+property_value: skos:narrowMatch RHEA:53388
+property_value: skos:narrowMatch RHEA:55768
+property_value: skos:narrowMatch RHEA:55776
+property_value: skos:narrowMatch RHEA:55780
+property_value: skos:narrowMatch RHEA:55784
+property_value: skos:narrowMatch RHEA:55836
+property_value: skos:narrowMatch RHEA:55840
+property_value: skos:narrowMatch RHEA:55844
+property_value: skos:narrowMatch RHEA:56160
+property_value: skos:narrowMatch RHEA:56508
+property_value: skos:narrowMatch RHEA:63588
+property_value: skos:narrowMatch RHEA:63612
 property_value: skos:narrowMatch RHEA:63616
 property_value: skos:narrowMatch RHEA:63692
+property_value: skos:narrowMatch RHEA:63696
+property_value: skos:narrowMatch RHEA:63700
+property_value: skos:narrowMatch RHEA:63704
 property_value: skos:narrowMatch RHEA:63716
 property_value: skos:narrowMatch RHEA:63720
+property_value: skos:narrowMatch RHEA:63724
 property_value: skos:narrowMatch RHEA:63728
+property_value: skos:narrowMatch RHEA:63732
 property_value: skos:narrowMatch RHEA:63744
 property_value: skos:narrowMatch RHEA:63748
+property_value: skos:narrowMatch RHEA:74563
 property_value: skos:narrowMatch RHEA:75099
 property_value: skos:narrowMatch RHEA:79067
 property_value: skos:narrowMatch RHEA:79071
@@ -121336,7 +122287,7 @@
 name: allantoate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of allantoate from one side of a membrane to the other. Allantoate is the end product of purine metabolism in mammals and some fish, formed form allantoin. It is widely distributed in plants as an important source of stored nitrogen." [GOC:ai, ISBN:0198547684]
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015719 ! allantoate transport
 
 [Term]
@@ -121350,7 +122301,7 @@
 xref: Reactome:R-HSA-5661184 "Defective SLCO1B1 does not transport BIL from extracellular region (blood) to cytosol (hepatocyte)"
 xref: Reactome:R-HSA-5661198 "Defective SLCO1B3 does not transport BIL from extracellular region (blood) to cytosol (hepatocyte)"
 xref: Reactome:R-HSA-9733964 "SLC51A:SLC51B transports bile salts from cytosol to extracellular region"
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 is_a: GO:0170055 ! lipid transmembrane transporter activity
 relationship: part_of GO:0015721 ! bile acid and bile salt transport
 
@@ -121379,6 +122330,7 @@
 namespace: molecular_function
 def: "Enables the transfer of gluconate from one side of a membrane to the other. Gluconate is the aldonic acid derived from glucose." [GOC:ai, ISBN:0198506732]
 synonym: "L-idonate/D-gluconate:hydrogen symporter activity" NARROW []
+is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0042879 ! aldonate transmembrane transporter activity
 relationship: part_of GO:0035429 ! gluconate transmembrane transport
 
@@ -121401,7 +122353,7 @@
 namespace: molecular_function
 def: "Enables the transfer of mevalonate from one side of a membrane to the other. Mevalonate is the anion of mevalonic acid; its (R)-enantiomer is a strategic intermediate derived from hydroxymethylglutaryl-CoA in the biosynthesis of polyprenyl compounds." [GOC:ai, ISBN:0198506732]
 synonym: "monocarboxylate (lactate, pyruvate, mevalonate) uptake/efflux porter activity" RELATED []
-is_a: GO:0022857 ! transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015728 ! mevalonate transport
 
 [Term]
@@ -121409,7 +122361,6 @@
 name: oxaloacetate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of oxaloacetate, the anion of oxobutanedioic acid, from one side of a membrane to the other." [GOC:ai]
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 relationship: part_of GO:1902356 ! oxaloacetate(2-) transmembrane transport
 
@@ -121430,7 +122381,7 @@
 name: uronic acid transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of uronic acid from one side of a membrane to the other. Uronic acids are any monocarboxylic acid formally derived by oxidizing to a carboxyl group the terminal hydroxymethylene group of either an aldose with four or more carbon atoms in the molecule, or of any glycoside derived from such an aldose." [GOC:ai]
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015735 ! uronic acid transmembrane transport
 
 [Term]
@@ -121440,8 +122391,8 @@
 alt_id: GO:0015163
 def: "Enables the transfer of hexuronates from one side of a membrane to the other. A hexuronate is any monocarboxylic acid derived from a hexose by oxidation of C-6." [GOC:ai, GOC:mtg_transport, ISBN:0198506732, ISBN:0815340729]
 synonym: "hexuronide transmembrane transporter activity" EXACT []
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015145 ! monosaccharide transmembrane transporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015736 ! hexuronate transmembrane transport
 relationship: part_of GO:0015778 ! hexuronide transmembrane transport
 
@@ -121482,7 +122433,6 @@
 namespace: molecular_function
 def: "Enables the transfer of fumarate from one side of a membrane to the other. Fumarate is a key intermediate in metabolism and is formed in the TCA cycle from succinate and converted into malate." [GOC:ai]
 synonym: "dicarboxylate (succinate/fumarate/malate) antiporter activity" RELATED []
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 relationship: part_of GO:0015741 ! fumarate transport
 
@@ -121502,7 +122452,6 @@
 namespace: molecular_function
 def: "Enables the transfer of malate from one side of a membrane to the other. Malate is a chiral hydroxydicarboxylic acid, hydroxybutanedioic acid. The (+) enantiomer is an important intermediate in metabolism as a component of both the TCA cycle and the glyoxylate cycle." [GOC:ai]
 synonym: "dicarboxylate (succinate/fumarate/malate) antiporter activity" RELATED []
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 relationship: part_of GO:0071423 ! malate transmembrane transport
 
@@ -121512,7 +122461,6 @@
 namespace: molecular_function
 def: "Enables the transfer of succinate, the dianion of ethane dicarboxylic acid, from one side of a membrane to the other." [ISBN:0198506732]
 synonym: "dicarboxylate (succinate/fumarate/malate) antiporter activity" RELATED []
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 relationship: part_of GO:0071422 ! succinate transmembrane transport
 
@@ -121926,7 +122874,6 @@
 synonym: "glutamate/aspartate porter activity" NARROW []
 synonym: "glutamate/aspartate:sodium symporter activity" NARROW []
 synonym: "L-aspartate transporter activity" BROAD []
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015172 ! acidic amino acid transmembrane transporter activity
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
@@ -121954,8 +122901,8 @@
 synonym: "4-aminobutyrate transporter activity" EXACT []
 synonym: "betaine/GABA:sodium symporter activity" NARROW []
 synonym: "GABA transporter activity" EXACT []
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015171 ! amino acid transmembrane transporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015812 ! gamma-aminobutyric acid transport
 
 [Term]
@@ -122395,7 +123342,7 @@
 namespace: molecular_function
 def: "Enables the transfer of 5-formyltetrahydrofolate, the formylated derivative of tetrahydrofolate, from one side of a membrane to the other." [GOC:ai]
 synonym: "5-formyltetrahydrofolate transporter activity" EXACT []
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 relationship: part_of GO:0015885 ! 5-formyltetrahydrofolate transport
 
@@ -122422,7 +123369,7 @@
 def: "Enables the directed movement of pantothenate across a membrane. Pantothenate is the anion of pantothenic acid, the amide of beta-alanine and pantoic acid; it is a B complex vitamin that is a constituent of coenzyme A and is distributed ubiquitously in foods." [GOC:ai, ISBN:0721662544]
 synonym: "pantothenate transporter activity" BROAD [GOC:mah]
 synonym: "vitamin B5 transmembrane transporter activity" EXACT []
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 is_a: GO:0090482 ! vitamin transmembrane transporter activity
 relationship: part_of GO:0015887 ! pantothenate transmembrane transport
@@ -123167,6 +124114,7 @@
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: phosphate(out) + H+(out) = phosphate(in) + H+(in)." [TC:2.A.1.9.-]
 synonym: "phosphate ion carrier activity" EXACT []
 synonym: "phosphate:hydrogen symporter activity" EXACT []
+is_a: GO:0005315 ! phosphate transmembrane transporter activity
 is_a: GO:0015295 ! solute:proton symporter activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14221" xsd:anyURI
 
@@ -123532,8 +124480,8 @@
 namespace: molecular_function
 def: "Catalysis of the movement of a monocarboxylate, any compound containing a single carboxyl group (COOH or COO-), by uniport, symport or antiport across a membrane by a carrier-mediated mechanism." [GOC:bf, GOC:jl]
 synonym: "monocarboxylate porter activity" RELATED []
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015291 ! secondary active transmembrane transporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 
 [Term]
 id: GO:0015356
@@ -124531,7 +125479,7 @@
 xref: RHEA:50048
 xref: TC:3.A.1.207.2
 is_a: GO:0015125 ! bile acid transmembrane transporter activity
-is_a: GO:0033285 ! ATPase-coupled monocarboxylic acid transmembrane transporter activity
+is_a: GO:0033284 ! ATPase-coupled carboxylic acid transmembrane transporter activity
 is_a: GO:0034040 ! ATPase-coupled lipid transmembrane transporter activity
 is_a: GO:0140359 ! ABC-type transporter activity
 property_value: skos:exactMatch RHEA:50048
@@ -124601,7 +125549,7 @@
 synonym: "capsular-polysaccharide-transporting ATPase activity" EXACT []
 xref: EC:7.6.2.12
 xref: MetaCyc:3.6.3.38-RXN
-is_a: GO:0033284 ! ATPase-coupled carboxylic acid transmembrane transporter activity
+is_a: GO:0033285 ! ATPase-coupled monocarboxylic acid transmembrane transporter activity
 is_a: GO:0140359 ! ABC-type transporter activity
 relationship: part_of GO:0015776 ! capsular polysaccharide transport
 property_value: skos:exactMatch EC:7.6.2.12
@@ -125032,7 +125980,7 @@
 consider: GO:0009297
 consider: GO:0030674
 consider: GO:0044183
-consider: GO:0051082
+consider: GO:0140309
 
 [Term]
 id: GO:0015473
@@ -125276,9 +126224,8 @@
 name: pantothenate:sodium symporter activity
 namespace: molecular_function
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: pantothenate(out) + Na+(out) = pantothenate(in) + Na+(in)." [TC:2.A.21.1.1]
-is_a: GO:0005343 ! organic acid:sodium symporter activity
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
+is_a: GO:0140161 ! monocarboxylate:sodium symporter activity
 relationship: part_of GO:0098719 ! sodium ion import across plasma membrane
 
 [Term]
@@ -125318,8 +126265,7 @@
 xref: MetaCyc:TRANS-RXN-122
 xref: RHEA:29031
 is_a: GO:0005283 ! amino acid:sodium symporter activity
-is_a: GO:0005343 ! organic acid:sodium symporter activity
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0017153 ! sodium:dicarboxylate symporter activity
 property_value: skos:exactMatch RHEA:29031
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26941" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -125787,7 +126733,6 @@
 name: tartrate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of tartrate from one side of a membrane to the other. Tartrate is the anion of 2,3-dihydroxybutanedioic acid, one of the aldaric acids. The L(+) enantiomer occurs widely in plants, especially in grape juice, and in fungi and bacteria." [GOC:ai]
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 is_a: GO:0042876 ! aldarate transmembrane transporter activity
@@ -125798,7 +126743,7 @@
 name: C4-dicarboxylate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of C4-dicarboxylate from one side of a membrane to the other." [GOC:krc]
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 relationship: part_of GO:0015740 ! C4-dicarboxylate transport
 
 [Term]
@@ -125890,7 +126835,6 @@
 namespace: molecular_function
 def: "Enables the transfer of L-idonate from one side of a membrane to the other. L-idonate is an aldonic acid derived from L-idose, an aldohexose which is epimeric with D-glucose." [GOC:ai]
 synonym: "L-idonate/D-gluconate:hydrogen symporter activity" NARROW []
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0042879 ! aldonate transmembrane transporter activity
 relationship: part_of GO:0015726 ! L-idonate transmembrane transport
@@ -126553,6 +127497,7 @@
 xref: MetaCyc:TRANS-RXN-113
 xref: RHEA:29943
 is_a: GO:0005351 ! carbohydrate:proton symporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015145 ! monosaccharide transmembrane transporter activity
 is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
 relationship: part_of GO:0046411 ! 2-keto-3-deoxygluconate transmembrane transport
@@ -126840,7 +127785,6 @@
 namespace: biological_process
 def: "A process in which ferric-enterobactin, the iron-bound form of the siderophore enterobactin, is transported into the cell by specific cell surface receptors." [GOC:pg, PMID:23192658]
 synonym: "ferric-enterobactin transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033214 ! siderophore-iron import into cell
 
 [Term]
@@ -126914,10 +127858,13 @@
 
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
@@ -126961,7 +127908,7 @@
 xref: Reactome:R-HSA-1475029 "Reversible hydration of carbon dioxide"
 xref: Reactome:R-HSA-1480926 "O2/CO2 exchange in erythrocytes"
 xref: Reactome:R-HSA-425381 "Bicarbonate transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0006810 ! transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26780" xsd:anyURI
 
 [Term]
@@ -127049,11 +127996,14 @@
 
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
@@ -127191,7 +128141,8 @@
 name: mevalonate transport
 namespace: biological_process
 def: "The directed movement of mevalonate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc]
-is_a: GO:0006810 ! transport
+is_a: GO:0015718 ! monocarboxylic acid transport
+is_a: GO:0015850 ! organic hydroxy compound transport
 
 [Term]
 id: GO:0015729
@@ -127349,7 +128300,6 @@
 def: "The directed movement of urate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc]
 synonym: "urate transmembrane transport" EXACT [GOC:mah]
 synonym: "uric acid transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -127449,7 +128399,6 @@
 name: glucose-6-phosphate transport
 namespace: biological_process
 def: "The directed movement of glucose-6-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Glucose-6-phosphate is a monophosphorylated derivative of glucose with the phosphate group attached to C-6." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015712 ! hexose phosphate transport
 
 [Term]
@@ -127614,7 +128563,6 @@
 def: "The directed movement of CMP-N-acetylneuraminate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "CMP-N-acetylneuraminate transport" RELATED []
 synonym: "CMP-sialic acid transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127630,7 +128578,6 @@
 name: UDP-glucose transmembrane transport
 namespace: biological_process
 def: "The process in which UDP-glucose is transported across a membrane." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/14450" xsd:anyURI
 
@@ -127651,7 +128598,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-N-acetylgalactosamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-N-acetylgalactosamine is a substance composed of N-acetylgalactosamine, a common structural unit of oligosaccharides, in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-N-acetylgalactosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127660,7 +128606,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-xylose into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. UDP-xylose is a substance composed of xylose in glycosidic linkage with uridine diphosphate." [GOC:ai]
 synonym: "UDP-xylose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 
 [Term]
@@ -127699,7 +128644,6 @@
 namespace: biological_process
 def: "The process in which glycerol-3-phosphate is transported across a membrane. Glycerol-3-phosphate is a phosphoric monoester of glycerol." [GOC:ai]
 synonym: "glycerol-3-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -127802,7 +128746,6 @@
 synonym: "S-adenosyl methionine transport" EXACT []
 synonym: "S-adenosylmethionine transport" EXACT []
 synonym: "SAM transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0072348 ! sulfur compound transport
 
 [Term]
@@ -127892,7 +128835,6 @@
 name: glycine transport
 namespace: biological_process
 def: "The directed movement of glycine, aminoethanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -127936,7 +128878,6 @@
 namespace: biological_process
 def: "The directed movement of L-leucine, 2-amino-4-methylpentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "leucine transport" BROAD []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015803 ! branched-chain amino acid transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -127949,7 +128890,6 @@
 synonym: "L-methionine transport" NARROW []
 is_a: GO:0000101 ! sulfur amino acid transport
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 
 [Term]
 id: GO:0015822
@@ -127958,7 +128898,6 @@
 def: "The directed movement of ornithine, 2,5-diaminopentanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-ornithine transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -127977,7 +128916,6 @@
 namespace: biological_process
 def: "The directed movement of proline, pyrrolidine-2-carboxylic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-proline transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128010,7 +128948,6 @@
 def: "The directed movement of tryptophan, 2-amino-3-(1H-indol-3-yl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tryptophan transport" NARROW []
 is_a: GO:0006865 ! amino acid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 
 [Term]
@@ -128019,7 +128956,6 @@
 namespace: biological_process
 def: "The directed movement of tyrosine, 2-amino-3-(4-hydroxyphenyl)propanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
 synonym: "L-tyrosine transport" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 
@@ -128111,7 +129047,6 @@
 name: cadaverine transport
 namespace: biological_process
 def: "The directed movement of cadaverine, 1,5-pentanediamine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
@@ -128142,17 +129077,18 @@
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
@@ -128166,7 +129102,6 @@
 name: putrescine transport
 namespace: biological_process
 def: "The directed movement of putrescine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Putrescine is 1,4-diaminobutane, the polyamine formed by decarboxylation of ornithine and the metabolic precursor of spermidine and spermine." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128174,7 +129109,6 @@
 name: spermidine transport
 namespace: biological_process
 def: "The directed movement of spermidine, N-(3-aminopropyl)-1,4-diaminobutane, a polyamine formed by the transfer of a propylamine group from decarboxylated S-adenosylmethionine to putrescine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:krc, ISBN:0198506732]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015846 ! polyamine transport
 
 [Term]
@@ -128313,7 +129247,6 @@
 name: ADP transport
 namespace: biological_process
 def: "The directed movement of ADP, adenosine diphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128322,7 +129255,6 @@
 name: ATP transport
 namespace: biological_process
 def: "The directed movement of ATP, adenosine triphosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 
@@ -128349,7 +129281,6 @@
 name: acetylcholine transport
 namespace: biological_process
 def: "The directed movement of acetylcholine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Acetylcholine is an acetic acid ester of the organic base choline and functions as a neurotransmitter, released at the synapses of parasympathetic nerves and at neuromuscular junctions." [GOC:ai]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901374 ! acetate ester transport
 
@@ -128358,25 +129289,25 @@
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
@@ -128420,7 +129351,6 @@
 namespace: biological_process
 def: "The directed movement of carnitine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carnitine is a compound that participates in the transfer of acyl groups across the inner mitochondrial membrane." [GOC:ai]
 synonym: "vitamin Bt transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -128428,7 +129358,6 @@
 name: coenzyme A transport
 namespace: biological_process
 def: "The directed movement of coenzyme A into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Coenzyme A, 3'-phosphoadenosine-(5')diphospho(4')pantatheine, is an acyl carrier in many acylation and acyl-transfer reactions in which the intermediate is a thiol ester." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128466,7 +129395,6 @@
 synonym: "flavin adenine dinucleotide transport" EXACT []
 synonym: "flavin-adenine dinucleotide transport" EXACT []
 is_a: GO:0006862 ! nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 
 [Term]
 id: GO:0015884
@@ -128518,7 +129446,6 @@
 def: "The directed movement of thiamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Thiamine is vitamin B1, a water soluble vitamin present in fresh vegetables and meats, especially liver." [GOC:ai]
 synonym: "thiamin transport" EXACT []
 synonym: "vitamin B1 transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -128649,7 +129576,6 @@
 def: "The directed movement of tetracycline from one side of a membrane to the other. Tetracycline is a broad spectrum antibiotic that blocks binding of aminoacyl tRNA to the ribosomes of both Gram-positive and Gram-negative organisms (and those of organelles)." [GOC:curators]
 synonym: "tetracyclin transport" BROAD []
 synonym: "tetracycline transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0055085 ! transmembrane transport
 
@@ -128756,7 +129682,6 @@
 synonym: "fatty acyl CoA transport" EXACT []
 synonym: "fatty acyl coenzyme A transport" EXACT []
 synonym: "fatty acyl-CoA transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015931 ! nucleobase-containing compound transport
 is_a: GO:1901337 ! thioester transport
@@ -130103,26 +131028,23 @@
 
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
@@ -130397,12 +131319,13 @@
 
 [Term]
 id: GO:0016080
-name: synaptic vesicle targeting
+name: obsolete synaptic vesicle targeting
 namespace: biological_process
-def: "The process in which synaptic vesicles are directed to specific destination membranes, mediated by molecules at the vesicle membrane and target membrane surfaces." [GOC:mah]
-is_a: GO:0006903 ! vesicle targeting
-is_a: GO:0140029 ! exocytic process
-relationship: part_of GO:0016079 ! synaptic vesicle exocytosis
+def: "OBSOLETE. The process in which synaptic vesicles are directed to specific destination membranes, mediated by molecules at the vesicle membrane and target membrane surfaces." [GOC:mah]
+comment: This term was made obsolete because the meaning of the term is ambiguous and usage has been inconsistent. The process it intended to describe is encompassed by the parent term synaptic vesicle exocytosis.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31864" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0016079
 
 [Term]
 id: GO:0016081
@@ -132359,7 +133282,9 @@
 synonym: "selenocysteine catabolic process" EXACT []
 synonym: "selenocysteine catabolism" EXACT []
 synonym: "selenocysteine degradation" EXACT []
-is_a: GO:1901606 ! alpha-amino acid catabolic process
+is_a: GO:0042219 ! modified amino acid catabolic process
+is_a: GO:0170035 ! L-amino acid catabolic process
+is_a: GO:0170040 ! proteinogenic amino acid catabolic process
 
 [Term]
 id: GO:0016262
@@ -132601,12 +133526,18 @@
 xref: Reactome:R-HSA-8932413 "METTL10 transfers 3xCH3 from 3xAdoMet to EEF1A1"
 xref: Reactome:R-HSA-9844111 "EHMT1,EHMT2 trimethylates lysine-16 of ATF7IP"
 xref: Reactome:R-HSA-9854315 "CSKMT methylates Citrate Synthase"
+xref: RHEA:51000
 xref: RHEA:51736
 xref: RHEA:54192
+xref: RHEA:55544
+xref: RHEA:67108
 is_a: GO:0008276 ! protein methyltransferase activity
 is_a: GO:0016278 ! lysine N-methyltransferase activity
+property_value: skos:narrowMatch RHEA:51000
 property_value: skos:narrowMatch RHEA:51736
 property_value: skos:narrowMatch RHEA:54192
+property_value: skos:narrowMatch RHEA:55544
+property_value: skos:narrowMatch RHEA:67108
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29483" xsd:anyURI
 
 [Term]
@@ -132706,7 +133637,13 @@
 xref: RHEA:19741
 xref: RHEA:28542
 xref: RHEA:31511
+xref: RHEA:38291
 xref: RHEA:40219
+xref: RHEA:40575
+xref: RHEA:40583
+xref: RHEA:40587
+xref: RHEA:40591
+xref: RHEA:40595
 xref: RHEA:45716
 xref: RHEA:46224
 xref: RHEA:49444
@@ -132725,7 +133662,13 @@
 property_value: skos:narrowMatch RHEA:19741
 property_value: skos:narrowMatch RHEA:28542
 property_value: skos:narrowMatch RHEA:31511
+property_value: skos:narrowMatch RHEA:38291
 property_value: skos:narrowMatch RHEA:40219
+property_value: skos:narrowMatch RHEA:40575
+property_value: skos:narrowMatch RHEA:40583
+property_value: skos:narrowMatch RHEA:40587
+property_value: skos:narrowMatch RHEA:40591
+property_value: skos:narrowMatch RHEA:40595
 property_value: skos:narrowMatch RHEA:45716
 property_value: skos:narrowMatch RHEA:46224
 property_value: skos:narrowMatch RHEA:49444
@@ -133608,7 +134551,7 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the carnitine molecule." [GOC:ai]
 xref: Reactome:R-HSA-200410 "CPT2 converts acylcarnitine to acyl-CoA"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016407
@@ -133627,10 +134570,13 @@
 
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
@@ -133644,13 +134590,16 @@
 
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
@@ -133659,7 +134608,7 @@
 def: "Catalysis of the transfer of an acyl group to an oxygen atom on the acylglycerol molecule." [GOC:ai]
 xref: Reactome:R-HSA-1482647 "2-MAG and DAG are transacylated to TAG by PNPLA2/3"
 xref: Reactome:R-HSA-1482654 "2-MAG is transacylated to DAG by PNPLA2/3"
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0016412
@@ -133676,7 +134625,7 @@
 xref: RHEA:68292
 xref: RHEA:68296
 xref: RHEA:68300
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:68272
 property_value: skos:narrowMatch RHEA:59964
 property_value: skos:narrowMatch RHEA:59972
@@ -133693,7 +134642,6 @@
 name: O-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016407 ! acetyltransferase activity
 
 [Term]
@@ -133704,7 +134652,7 @@
 synonym: "O-octanoyltransferase activity" BROAD []
 xref: EC:2.3.1.273
 xref: RHEA:56868
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.273
 property_value: skos:exactMatch RHEA:56868
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -133727,15 +134675,17 @@
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
@@ -133743,7 +134693,6 @@
 namespace: molecular_function
 def: "Catalysis of the transfer of an acetyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
 is_a: GO:0016407 ! acetyltransferase activity
-is_a: GO:0016417 ! S-acyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17828" xsd:anyURI
 
 [Term]
@@ -133751,7 +134700,6 @@
 name: S-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
@@ -133830,6 +134778,7 @@
 xref: Reactome:R-HSA-6785409 "NSUN2 methylates cytidine-48 and cytidine-49 of tRNA(Asp)(GUC)"
 xref: Reactome:R-HSA-6785438 "NSUN2 methylates cytidine-40, cytidine-48, cytidine-49, cytidine-50 of tRNA(GLY)(GCC)"
 xref: Reactome:R-HSA-8932765 "NSUN6 methylates cytidine-72 in tRNA(Cys) and tRNA(Thr)"
+xref: RHEA:21124
 xref: RHEA:42940
 xref: RHEA:42944
 xref: RHEA:42948
@@ -133838,16 +134787,19 @@
 xref: RHEA:51160
 xref: RHEA:51164
 xref: RHEA:51172
+xref: RHEA:51176
 xref: RHEA:51180
 xref: RHEA:53076
 xref: RHEA:54136
 xref: RHEA:54140
 xref: RHEA:61468
 xref: RHEA:61488
+xref: RHEA:61584
 xref: RHEA:61988
 is_a: GO:0016427 ! tRNA (cytidine) methyltransferase activity
 property_value: skos:exactMatch RHEA:61468
 property_value: skos:narrowMatch EC:2.1.1.202
+property_value: skos:narrowMatch RHEA:21124
 property_value: skos:narrowMatch RHEA:42940
 property_value: skos:narrowMatch RHEA:42944
 property_value: skos:narrowMatch RHEA:42948
@@ -133856,11 +134808,13 @@
 property_value: skos:narrowMatch RHEA:51160
 property_value: skos:narrowMatch RHEA:51164
 property_value: skos:narrowMatch RHEA:51172
+property_value: skos:narrowMatch RHEA:51176
 property_value: skos:narrowMatch RHEA:51180
 property_value: skos:narrowMatch RHEA:53076
 property_value: skos:narrowMatch RHEA:54136
 property_value: skos:narrowMatch RHEA:54140
 property_value: skos:narrowMatch RHEA:61488
+property_value: skos:narrowMatch RHEA:61584
 property_value: skos:narrowMatch RHEA:61988
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24771" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26109" xsd:anyURI
@@ -134036,14 +134990,12 @@
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
@@ -136732,10 +137684,11 @@
 xref: EC:1.14.14.91
 xref: MetaCyc:TRANS-CINNAMATE-4-MONOOXYGENASE-RXN
 xref: RHEA:10608
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.91
 property_value: skos:exactMatch RHEA:10608
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0016711
@@ -136754,7 +137707,7 @@
 xref: RHEA:61112
 xref: RHEA:61124
 xref: RHEA:79895
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.82
 property_value: skos:exactMatch RHEA:16337
 property_value: skos:narrowMatch RHEA:61096
@@ -136762,6 +137715,7 @@
 property_value: skos:narrowMatch RHEA:61124
 property_value: skos:narrowMatch RHEA:79895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0016712
@@ -136788,12 +137742,22 @@
 xref: Reactome:R-HSA-194678 "CYP51A1 demethylates LAN"
 xref: Reactome:R-HSA-211966 "CYP2D6 4-hydroxylates debrisoquine"
 xref: RHEA:17149
+xref: RHEA:51984
+xref: RHEA:68160
+xref: RHEA:75847
+xref: RHEA:75863
+xref: RHEA:76419
 is_a: GO:0004497 ! monooxygenase activity
 is_a: GO:0016705 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen
 property_value: skos:exactMatch EC:1.14.14.-
 property_value: skos:narrowMatch EC:1.14.14.1
 property_value: skos:narrowMatch MetaCyc:UNSPECIFIC-MONOOXYGENASE-RXN
 property_value: skos:narrowMatch RHEA:17149
+property_value: skos:narrowMatch RHEA:51984
+property_value: skos:narrowMatch RHEA:68160
+property_value: skos:narrowMatch RHEA:75847
+property_value: skos:narrowMatch RHEA:75863
+property_value: skos:narrowMatch RHEA:76419
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28295" xsd:anyURI
 created_by: mah
 
@@ -137215,7 +138179,6 @@
 name: N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137223,7 +138186,6 @@
 name: O-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137231,7 +138193,6 @@
 name: S-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a succinyl group to a sulfur atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016417 ! S-acyltransferase activity
 is_a: GO:0016748 ! succinyltransferase activity
 
 [Term]
@@ -137246,7 +138207,6 @@
 name: O-sinapoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016752 ! sinapoyltransferase activity
 
 [Term]
@@ -140611,12 +141571,14 @@
 xref: Reactome:R-HSA-5693925 "FUT3 transfers L-fucose to Gal1,3GlcNAc"
 xref: Reactome:R-HSA-9603986 "FUT3 transfers Fuc to Type 1 chains to form LeA"
 xref: RHEA:23628
+xref: RHEA:48328
 xref: RHEA:48824
 xref: RHEA:62844
 xref: RHEA:62848
 is_a: GO:0008417 ! fucosyltransferase activity
 property_value: skos:exactMatch EC:2.4.1.65
 property_value: skos:exactMatch RHEA:23628
+property_value: skos:narrowMatch RHEA:48328
 property_value: skos:narrowMatch RHEA:48824
 property_value: skos:narrowMatch RHEA:62844
 property_value: skos:narrowMatch RHEA:62848
@@ -141166,7 +142128,7 @@
 id: GO:0017109
 name: glutamate-cysteine ligase complex
 namespace: cellular_component
-def: "An enzyme complex that catalyzes the ligation of glutamate to cysteine, forming glutamylcysteine." [PMID:9675072]
+def: "An enzyme complex that catalyzes the ligation of L-glutamate to L-cysteine, forming gamma-L-glutamyl-L-cysteine." [PMID:9675072]
 synonym: "gamma-glutamylcysteine synthetase complex" EXACT []
 is_a: GO:1902494 ! catalytic complex
 relationship: part_of GO:0005737 ! cytoplasm
@@ -141589,12 +142551,20 @@
 xref: MetaCyc:RXN0-1281
 xref: Reactome:R-HSA-6782296 "DUS2:EPRS reduces uridine to dihydrouridine in tRNAs"
 xref: RHEA:23624
+xref: RHEA:53336
+xref: RHEA:53340
+xref: RHEA:53360
+xref: RHEA:53364
 xref: RHEA:54452
 is_a: GO:0106413 ! RNA dihydrouridine synthase activity
 is_a: GO:0140101 ! catalytic activity, acting on a tRNA
 relationship: part_of GO:0002943 ! tRNA dihydrouridine synthesis
 property_value: skos:narrowMatch MetaCyc:RXN0-1281
 property_value: skos:narrowMatch RHEA:23624
+property_value: skos:narrowMatch RHEA:53336
+property_value: skos:narrowMatch RHEA:53340
+property_value: skos:narrowMatch RHEA:53360
+property_value: skos:narrowMatch RHEA:53364
 property_value: skos:narrowMatch RHEA:54452
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25790" xsd:anyURI
 
@@ -142403,7 +143373,7 @@
 name: peptidyl-lysine N6-palmitoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a palmitoyl group to the N6 nitrogen atom on a lysine residue of a peptide or protein molecule." [GOC:mah, PMID:29074776]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22878" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22968" xsd:anyURI
@@ -147306,7 +148276,7 @@
 id: GO:0018525
 name: 4-hydroxybenzoyl-CoA reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: benzoyl-CoA + oxidized ferredoxin + H2O = 4-hydroxybenzoyl-CoA + reduced ferredoxin." [RHEA:29603]
+def: "Catalysis of the reaction: oxidized 2[4Fe-4S]-[ferredoxin] + benzoyl-CoA + H2O = 4-hydroxybenzoyl-CoA + reduced 2[4Fe-4S]-[ferredoxin] + 2 H+." [RHEA:29603]
 synonym: "4-hydroxybenzoyl-coA reductase (dehydroxylating) activity" RELATED []
 synonym: "4-hydroxybenzoyl-coA:(acceptor) oxidoreductase activity" RELATED []
 xref: EC:1.1.7.1
@@ -147314,10 +148284,11 @@
 xref: MetaCyc:OHBENZCOARED-RXN
 xref: RHEA:29603
 xref: UM-BBD_reactionID:r0158
-is_a: GO:0016636 ! oxidoreductase activity, acting on the CH-CH group of donors, iron-sulfur protein as acceptor
+is_a: GO:0016614 ! oxidoreductase activity, acting on CH-OH group of donors
 property_value: skos:exactMatch EC:1.1.7.1
 property_value: skos:exactMatch RHEA:29603
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0018526
@@ -147639,12 +148610,11 @@
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
@@ -147804,10 +148774,11 @@
 xref: MetaCyc:RXN-664
 xref: RHEA:42344
 xref: UM-BBD_reactionID:r0395
-is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
+is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
 property_value: skos:exactMatch EC:1.14.12.25
 property_value: skos:exactMatch RHEA:42344
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0018571
@@ -147956,17 +148927,14 @@
 
 [Term]
 id: GO:0018581
-name: hydroxyquinol 1,2-dioxygenase activity
+name: obsolete hydroxyquinol 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: benzene-1,2,4-triol + O2 = 3-hydroxy-cis,cis-muconate + 2 H+." [RHEA:19441]
-xref: MetaCyc:RXN-17556
-xref: RHEA:19441
-xref: UM-BBD_reactionID:r0232
-is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
-property_value: skos:broadMatch EC:1.13.11.37
-property_value: skos:exactMatch RHEA:19441
+def: "OBSOLETE. Catalysis of the reaction: benzene-1,2,4-triol + O2 = 3-hydroxy-cis,cis-muconate + 2 H+." [RHEA:19441]
+comment: The reason for obsoletion is that this term described a sub-reaction of the complete two-step reaction represented by GO:0047074. The second step (non-enzymatic conversion of 3-hydroxy-cis,cis-muconate to maleylacetate) is not catalyzed separately, so this term is equivalent to GO:0047074 hydroxyquinol 1,2-dioxygenase activity.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25870" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0047074
 
 [Term]
 id: GO:0018582
@@ -148267,7 +149235,7 @@
 id: GO:0018610
 name: dibenzofuran 4,4a-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: dibenzofuran + NADH + H+ + O2 = 2,2',3-trihydroxybiphenyl + NAD+." [MetaCyc:R606-RXN, RHEA:42460]
+def: "Catalysis of the reaction: dibenzofuran + NADH + H+ + O2 = 2,2',3-trihydroxybiphenyl + NAD+." [RHEA:42460]
 xref: MetaCyc:R606-RXN
 xref: RHEA:42460
 xref: UM-BBD_enzymeID:r0026
@@ -148356,16 +149324,20 @@
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
@@ -148383,7 +149355,7 @@
 id: GO:0018620
 name: phthalate 4,5-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + phthalate = cis-4,5-dihydroxycyclohexa-2,6-diene-1,2-dicarboxylate + NAD+." [EC:1.14.12.7, RHEA:17489]
+def: "Catalysis of the reaction: phthalate + NADH + O2 + H+ = cis-4,5-dihydroxycyclohexa-2,6-diene-1,2-dicarboxylate + NAD+." [RHEA:17489]
 synonym: "PDO activity" RELATED [EC:1.14.12.7]
 synonym: "phthalate dioxygenase activity" BROAD [EC:1.14.12.7]
 synonym: "phthalate,NADH:oxygen oxidoreductase (4,5-hydroxylating)" RELATED [EC:1.14.12.7]
@@ -148401,7 +149373,7 @@
 id: GO:0018621
 name: 4-sulfobenzoate 3,4-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-sulfobenzoate + H+ + NADH + O2 = 3,4-dihydroxybenzoate + NAD+ + sulfite." [EC:1.14.12.8, RHEA:13937]
+def: "Catalysis of the reaction: 4-sulfobenzoate + H+ + NADH + O2 = 3,4-dihydroxybenzoate + NAD+ + sulfite." [RHEA:13937]
 synonym: "4-sulfobenzoate 3,4-dioxygenase system" RELATED [EC:1.14.12.8]
 synonym: "4-sulfobenzoate dioxygenase activity" RELATED [EC:1.14.12.8]
 synonym: "4-sulfobenzoate,NADH:oxygen oxidoreductase (3,4-hydroxylating, sulfite-forming)" RELATED [EC:1.14.12.8]
@@ -148420,7 +149392,7 @@
 id: GO:0018622
 name: 4-chlorophenylacetate 3,4-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-chlorophenylacetate + NADH + O2 = 3,4-dihydroxyphenylacetate + chloride + NAD+." [EC:1.14.12.9, RHEA:14689]
+def: "Catalysis of the reaction: 4-chlorophenylacetate + NADH + O2 = 3,4-dihydroxyphenylacetate + chloride + NAD+." [RHEA:14689]
 synonym: "4-chlorophenylacetate,NADH:oxygen oxidoreductase (3,4-hydroxylating, dechlorinating)" RELATED [EC:1.14.12.9]
 xref: EC:1.14.12.9
 xref: KEGG_REACTION:R03306
@@ -148436,7 +149408,7 @@
 id: GO:0018623
 name: benzoate 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: benzoate + NADH + H+ + O2 = catechol + CO2 + NAD+." [EC:1.14.12.10]
+def: "Catalysis of the reaction: benzoate + NADH + O2 + H+ = (1R,6S)-1,6-dihydroxycyclohexa-2,4-diene-1-carboxylate + NAD+." [RHEA:12633]
 synonym: "benzoate dioxygenase activity" RELATED [EC:1.14.12.10]
 synonym: "benzoate hydroxylase activity" RELATED [EC:1.14.12.10]
 synonym: "benzoate,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.10]
@@ -148455,7 +149427,7 @@
 id: GO:0018624
 name: toluene dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + toluene = (1S,2R)-3-methylcyclohexa-3,5-diene-1,2-diol + NAD+." [EC:1.14.12.11, RHEA:16737]
+def: "Catalysis of the reaction: toluene + NADH + O2 + H+ = (1S,2R)-3-methylcyclohexa-3,5-diene-1,2-diol + NAD+." [RHEA:16737]
 synonym: "toluene 1,2-dioxygenase activity" RELATED [EC:1.14.12.11]
 synonym: "toluene 2,3-dioxygenase activity" RELATED [EC:1.14.12.11]
 synonym: "toluene,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.11]
@@ -148509,7 +149481,7 @@
 name: 2-aminobenzenesulfonate 2,3-dioxygenase activity
 namespace: molecular_function
 alt_id: GO:0018605
-def: "Catalysis of the reaction: 2-aminobenzenesulfonate + 2 H+ + NADH + O2 = 2,3-dihydroxybenzenesulfonate + NAD+ + NH4. 2,3-dihydroxybenzenesulfonate is also known as 3-sulfocatechol." [EC:1.14.12.14, RHEA:23468]
+def: "Catalysis of the reaction: 2-aminobenzenesulfonate + 2 H+ + NADH + O2 = 2,3-dihydroxybenzenesulfonate + NAD+ + NH4. 2,3-dihydroxybenzenesulfonate is also known as 3-sulfocatechol." [RHEA:23468]
 synonym: "2-aminobenzenesulfonate dioxygenase activity" EXACT []
 synonym: "2-aminobenzenesulfonate,NADH:oxygen oxidoreductase (2,3-hydroxylating, ammonia-forming)" RELATED [EC:1.14.12.14]
 synonym: "2-aminobenzenesulphonate 2,3-dioxygenase activity" EXACT []
@@ -148529,7 +149501,7 @@
 id: GO:0018628
 name: terephthalate 1,2-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + NADH + O2 + terephthalate = (3S,4R)-3,4-dihydroxycyclohexa-1,5-diene-1,4-dicarboxylate + NAD+." [EC:1.14.12.15, RHEA:10312]
+def: "Catalysis of the reaction: terephthalate + NADH + O2 + H+ = (3S,4R)-3,4-dihydroxycyclohexa-1,5-diene-1,4-dicarboxylate + NAD+." [RHEA:10312]
 synonym: "1,4-dicarboxybenzoate 1,2-dioxygenase activity" RELATED [EC:1.14.12.15]
 synonym: "benzene-1,4-dicarboxylate 1,2-dioxygenase activity" RELATED [EC:1.14.12.15]
 synonym: "benzene-1,4-dicarboxylate,NADH:oxygen oxidoreductase (1,2-hydroxylating)" RELATED [EC:1.14.12.15]
@@ -148547,7 +149519,7 @@
 id: GO:0018629
 name: 2-hydroxyquinoline 5,6-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: quinolin-2-ol + NADH + H+ + O2 = 2,5,6-trihydroxy-5,6-dihydroquinoline + NAD+." [EC:1.14.12.16]
+def: "Catalysis of the reaction: quinolin-2-ol + NADH + O2 + H+ = 5,6-dihydroquinoline-2,5,6-triol + NAD+." [RHEA:10976]
 synonym: "2-oxo-1,2-dihydroquinoline 5,6-dioxygenase activity" EXACT []
 synonym: "quinolin-2(1H)-one 5,6-dioxygenase activity" RELATED [EC:1.14.12.16]
 synonym: "quinolin-2-ol 5,6-dioxygenase activity" RELATED [EC:1.14.12.16]
@@ -149015,10 +149987,11 @@
 xref: MetaCyc:BENZOATE-4-MONOOXYGENASE-RXN
 xref: RHEA:18033
 xref: UM-BBD_reactionID:r0623
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.92
 property_value: skos:exactMatch RHEA:18033
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0018665
@@ -149399,7 +150372,7 @@
 id: GO:0018687
 name: biphenyl 2,3-dioxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: biphenyl + NADH + H+ + O2 = (2R,3S)-3-phenylcyclohexa-3,5-diene-1,2-diol + NAD+. This reaction requires Fe2+." [EC:1.14.12.18]
+def: "Catalysis of the reaction: biphenyl + NADH + H+ + O2 = (2R,3S)-3-phenylcyclohexa-3,5-diene-1,2-diol + NAD+. This reaction requires Fe2+." [RHEA:18165]
 synonym: "biphenyl dioxygenase activity" RELATED [EC:1.14.12.18]
 synonym: "biphenyl,NADH:oxygen oxidoreductase (2,3-hydroxylating)" RELATED [EC:1.14.12.18]
 xref: EC:1.14.12.18
@@ -149818,7 +150791,7 @@
 id: GO:0018729
 name: propionate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + propanoate = acetate + propanoyl-CoA." [EC:2.8.3.1]
+def: "Catalysis of the reaction: acetyl-CoA + propanoate = acetate + propanoyl-CoA." [RHEA:23520]
 synonym: "acetyl-CoA:propanoate CoA-transferase activity" RELATED [EC:2.8.3.1]
 synonym: "propionate coenzyme A-transferase activity" RELATED [EC:2.8.3.1]
 synonym: "propionate-CoA:lactoyl-CoA transferase activity" RELATED [EC:2.8.3.1]
@@ -149837,7 +150810,7 @@
 id: GO:0018730
 name: glutaconate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + (E)-glutaconate = acetate + glutaconyl-1-CoA." [EC:2.8.3.12]
+def: "Catalysis of the reaction: trans-glutaconate + acetyl-CoA = (2E)-glutaconyl-CoA + acetate." [RHEA:23208]
 synonym: "acetyl-CoA:(E)-glutaconate CoA-transferase activity" RELATED [EC:2.8.3.12]
 xref: EC:2.8.3.12
 xref: MetaCyc:GLUTACONATE-COA-TRANSFERASE-RXN
@@ -150844,27 +151817,115 @@
 xref: Reactome:R-HSA-6809263 "EHHADH hydrates trans-2,3-dehydrohexacosanoyl-CoA"
 xref: Reactome:R-HSA-8957389 "RPP14 (HTD2) dehydrates 3HA-CoA to t2E-CoA"
 xref: RHEA:16105
+xref: RHEA:30547
+xref: RHEA:31075
+xref: RHEA:31163
+xref: RHEA:31171
+xref: RHEA:31191
+xref: RHEA:31199
 xref: RHEA:33767
 xref: RHEA:35347
 xref: RHEA:35355
 xref: RHEA:35359
+xref: RHEA:39123
+xref: RHEA:39139
+xref: RHEA:40187
+xref: RHEA:40207
+xref: RHEA:45992
 xref: RHEA:46348
 xref: RHEA:46352
+xref: RHEA:47424
+xref: RHEA:47436
+xref: RHEA:47452
 xref: RHEA:52664
 xref: RHEA:71647
+xref: RHEA:72579
+xref: RHEA:76647
+xref: RHEA:78559
+xref: RHEA:78575
+xref: RHEA:78591
+xref: RHEA:78603
+xref: RHEA:78911
+xref: RHEA:78915
+xref: RHEA:82923
+xref: RHEA:82959
+xref: RHEA:82995
+xref: RHEA:83027
+xref: RHEA:83063
+xref: RHEA:83067
+xref: RHEA:83147
+xref: RHEA:83211
+xref: RHEA:83323
+xref: RHEA:83359
+xref: RHEA:83375
+xref: RHEA:83391
+xref: RHEA:84395
+xref: RHEA:84399
+xref: RHEA:84403
+xref: RHEA:84407
+xref: RHEA:84627
+xref: RHEA:84631
+xref: RHEA:84659
+xref: RHEA:84663
+xref: RHEA:84667
+xref: RHEA:85127
 is_a: GO:0004300 ! enoyl-CoA hydratase activity
 property_value: skos:exactMatch RHEA:33767
 property_value: skos:narrowMatch EC:4.2.1.150
 property_value: skos:narrowMatch EC:4.2.1.74
 property_value: skos:narrowMatch MetaCyc:ENOYL-COA-HYDRAT-RXN
 property_value: skos:narrowMatch RHEA:16105
+property_value: skos:narrowMatch RHEA:30547
+property_value: skos:narrowMatch RHEA:31075
+property_value: skos:narrowMatch RHEA:31163
+property_value: skos:narrowMatch RHEA:31171
+property_value: skos:narrowMatch RHEA:31191
+property_value: skos:narrowMatch RHEA:31199
 property_value: skos:narrowMatch RHEA:35347
 property_value: skos:narrowMatch RHEA:35355
 property_value: skos:narrowMatch RHEA:35359
+property_value: skos:narrowMatch RHEA:39123
+property_value: skos:narrowMatch RHEA:39139
+property_value: skos:narrowMatch RHEA:40187
+property_value: skos:narrowMatch RHEA:40207
+property_value: skos:narrowMatch RHEA:45992
 property_value: skos:narrowMatch RHEA:46348
 property_value: skos:narrowMatch RHEA:46352
+property_value: skos:narrowMatch RHEA:47424
+property_value: skos:narrowMatch RHEA:47436
+property_value: skos:narrowMatch RHEA:47452
 property_value: skos:narrowMatch RHEA:52664
 property_value: skos:narrowMatch RHEA:71647
+property_value: skos:narrowMatch RHEA:72579
+property_value: skos:narrowMatch RHEA:76647
+property_value: skos:narrowMatch RHEA:78559
+property_value: skos:narrowMatch RHEA:78575
+property_value: skos:narrowMatch RHEA:78591
+property_value: skos:narrowMatch RHEA:78603
+property_value: skos:narrowMatch RHEA:78911
+property_value: skos:narrowMatch RHEA:78915
+property_value: skos:narrowMatch RHEA:82923
+property_value: skos:narrowMatch RHEA:82959
+property_value: skos:narrowMatch RHEA:82995
+property_value: skos:narrowMatch RHEA:83027
+property_value: skos:narrowMatch RHEA:83063
+property_value: skos:narrowMatch RHEA:83067
+property_value: skos:narrowMatch RHEA:83147
+property_value: skos:narrowMatch RHEA:83211
+property_value: skos:narrowMatch RHEA:83323
+property_value: skos:narrowMatch RHEA:83359
+property_value: skos:narrowMatch RHEA:83375
+property_value: skos:narrowMatch RHEA:83391
+property_value: skos:narrowMatch RHEA:84395
+property_value: skos:narrowMatch RHEA:84399
+property_value: skos:narrowMatch RHEA:84403
+property_value: skos:narrowMatch RHEA:84407
+property_value: skos:narrowMatch RHEA:84627
+property_value: skos:narrowMatch RHEA:84631
+property_value: skos:narrowMatch RHEA:84659
+property_value: skos:narrowMatch RHEA:84663
+property_value: skos:narrowMatch RHEA:84667
+property_value: skos:narrowMatch RHEA:85127
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24738" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28557" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29788" xsd:anyURI
@@ -152203,6 +153264,7 @@
 xref: UM-BBD_pathwayID:msa
 is_a: GO:0006805 ! xenobiotic metabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0018927
@@ -152588,8 +153650,8 @@
 synonym: "phthalic acid metabolic process" EXACT []
 synonym: "phthalic acid metabolism" EXACT []
 xref: UM-BBD_pathwayID:pth
-is_a: GO:0019752 ! carboxylic acid metabolic process
 is_a: GO:0042537 ! benzene-containing compound metabolic process
+is_a: GO:0043648 ! dicarboxylic acid metabolic process
 
 [Term]
 id: GO:0018964
@@ -152834,7 +153896,6 @@
 synonym: "naphthalenesulphonate metabolic process" EXACT []
 synonym: "naphthalenesulphonate metabolism" EXACT []
 xref: UM-BBD_pathwayID:nphs
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -154034,7 +155095,7 @@
 comment: This term has been obsoleted because it represents an unnecessary grouping class and is not consistent with the ontology structure.
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22971" xsd:anyURI
 is_obsolete: true
-consider: GO:0016410
+consider: GO:0016747
 
 [Term]
 id: GO:0019107
@@ -155631,15 +156692,15 @@
 
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
 
@@ -155652,7 +156713,6 @@
 synonym: "citrulline catabolism" EXACT []
 synonym: "citrulline degradation" EXACT []
 xref: MetaCyc:CITRULLINE-DEG-PWY
-is_a: GO:0000052 ! citrulline metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 is_a: GO:1901606 ! alpha-amino acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30202" xsd:anyURI
@@ -155840,7 +156900,6 @@
 synonym: "glucose 1-phosphate metabolism" EXACT []
 synonym: "glucose 1-phosphate utilization" RELATED [GOC:mah]
 xref: MetaCyc:GLUCOSE1PMETAB-PWY
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -156345,7 +157404,6 @@
 synonym: "coenzyme M synthesis" EXACT []
 xref: MetaCyc:P261-PWY
 xref: MetaCyc:PWY-6643
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 property_value: skos:narrowMatch MetaCyc:P261-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6643
@@ -156864,7 +157922,6 @@
 synonym: "parathion degradation" EXACT []
 xref: MetaCyc:PARATHION-DEGRADATION-PWY
 xref: UM-BBD_pathwayID:pthn
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28523" xsd:anyURI
@@ -157028,8 +158085,8 @@
 synonym: "teichoic acid formation" EXACT []
 synonym: "teichoic acid synthesis" EXACT []
 xref: MetaCyc:TEICHOICACID-PWY
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 is_a: GO:0046374 ! teichoic acid metabolic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
@@ -157051,26 +158108,31 @@
 
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
@@ -157357,13 +158419,16 @@
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
@@ -157502,14 +158567,17 @@
 
 [Term]
 id: GO:0019393
-name: glucarate biosynthetic process
+name: obsolete glucarate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of glucarate, the anion of glucaric acid." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of glucarate, the anion of glucaric acid." [ISBN:0198506732]
+comment: This term was obsoleted because it represents the same process as D-glucarate biosynthetic process ; GO:0042837.
 synonym: "glucarate anabolism" EXACT []
 synonym: "glucarate biosynthesis" EXACT []
 synonym: "glucarate formation" EXACT []
 synonym: "glucarate synthesis" EXACT []
-is_a: GO:0019578 ! aldaric acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0042837
 
 [Term]
 id: GO:0019394
@@ -157788,10 +158856,19 @@
 name: sulfide oxidation
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the conversion of sulfide to elemental sulfur in a higher oxidation state, or to sulfite or sulfate." [MetaCyc:Sulfide-Oxidation]
+synonym: "hydrogen sulfide catabolic process" EXACT []
 synonym: "sulphide oxidation" EXACT []
-xref: MetaCyc:Sulfide-Oxidation
+xref: MetaCyc:P222-PWY
+xref: MetaCyc:PWY-5274
+xref: MetaCyc:PWY-5285
+xref: MetaCyc:PWY-7927
 is_a: GO:0006790 ! sulfur compound metabolic process
+property_value: skos:narrowMatch MetaCyc:P222-PWY
+property_value: skos:narrowMatch MetaCyc:PWY-5274
+property_value: skos:narrowMatch MetaCyc:PWY-5285
+property_value: skos:narrowMatch MetaCyc:PWY-7927
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31842" xsd:anyURI
 
 [Term]
 id: GO:0019419
@@ -158575,12 +159652,15 @@
 
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
@@ -158597,7 +159677,6 @@
 xref: MetaCyc:PWY-5155
 xref: MetaCyc:PWY-5760
 is_a: GO:0008652 ! amino acid biosynthetic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170043 ! non-proteinogenic amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:PWY-3941
 property_value: skos:narrowMatch MetaCyc:PWY-3981
@@ -158618,7 +159697,6 @@
 xref: MetaCyc:PWY-1781
 xref: MetaCyc:PWY-8120
 is_a: GO:0009063 ! amino acid catabolic process
-is_a: GO:0019482 ! beta-alanine metabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
 property_value: skos:narrowMatch MetaCyc:BETA-ALA-DEGRADATION-I-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-1781
@@ -159090,7 +160168,7 @@
 synonym: "keto-D-gluconate catabolism" EXACT []
 synonym: "keto-D-gluconate degradation" EXACT []
 xref: MetaCyc:DHGLUCONATE-PYR-CAT-PWY
-is_a: GO:0046181 ! ketogluconate catabolic process
+is_a: GO:0046176 ! aldonic acid catabolic process
 
 [Term]
 id: GO:0019525
@@ -159739,7 +160817,7 @@
 synonym: "aldaric acid biosynthesis" EXACT []
 synonym: "aldaric acid formation" EXACT []
 synonym: "aldaric acid synthesis" EXACT []
-is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
+is_a: GO:0046394 ! carboxylic acid biosynthetic process
 
 [Term]
 id: GO:0019579
@@ -159749,7 +160827,7 @@
 synonym: "aldaric acid breakdown" EXACT []
 synonym: "aldaric acid catabolism" EXACT []
 synonym: "aldaric acid degradation" EXACT []
-is_a: GO:0043649 ! dicarboxylic acid catabolic process
+is_a: GO:0046395 ! carboxylic acid catabolic process
 
 [Term]
 id: GO:0019580
@@ -159778,14 +160856,17 @@
 
 [Term]
 id: GO:0019584
-name: galactonate catabolic process
+name: obsolete galactonate catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of galactonate, the anion of galactonic acid." [GOC:ai]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of galactonate, the anion of galactonic acid." [GOC:ai]
+comment: This term was obsoleted because it is an unnecessary grouing term.
 synonym: "galactonate breakdown" EXACT []
 synonym: "galactonate catabolism" EXACT []
 synonym: "galactonate degradation" EXACT []
-is_a: GO:0046176 ! aldonic acid catabolic process
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31978" xsd:anyURI
+is_obsolete: true
+consider: GO:0034194
+consider: GO:0034195
 
 [Term]
 id: GO:0019585
@@ -160219,35 +161300,41 @@
 
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
@@ -160756,7 +161843,6 @@
 is_a: GO:0006089 ! lactate metabolic process
 is_a: GO:0006103 ! 2-oxoglutarate metabolic process
 is_a: GO:0006105 ! succinate metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0015942 ! formate metabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 is_a: GO:0072329 ! monocarboxylic acid catabolic process
@@ -161013,7 +162099,6 @@
 synonym: "glyceraldehyde 3-phosphate metabolism" EXACT []
 synonym: "glyceraldehyde-3-phosphate metabolism" EXACT []
 is_a: GO:0006081 ! aldehyde metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -161114,7 +162199,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving ribose phosphate, any phosphorylated ribose sugar." [GOC:ai]
 synonym: "ribose phosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -161127,7 +162211,6 @@
 synonym: "alkanesulphonate metabolic process" EXACT []
 synonym: "alkanesulphonate metabolism" EXACT []
 xref: MetaCyc:ALKANEMONOX-PWY
-is_a: GO:0006082 ! organic acid metabolic process
 is_a: GO:0006790 ! sulfur compound metabolic process
 
 [Term]
@@ -161290,7 +162373,7 @@
 xref: Reactome:R-HSA-158832 "The acetyl group from acetyl-CoA is transferred to NAT2"
 xref: Reactome:R-HSA-174959 "The acetyl group from acetyl-CoA is transferred to NAT1"
 xref: RHEA:63372
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:63372
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18882" xsd:anyURI
@@ -172542,15 +173625,17 @@
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
@@ -173008,8 +174093,9 @@
 synonym: "chaperone regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030189
@@ -173020,8 +174106,9 @@
 synonym: "chaperone activator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030190
@@ -173032,8 +174119,9 @@
 synonym: "chaperone inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030191
@@ -173044,8 +174132,9 @@
 synonym: "Hsp70/Hsc70 protein inhibitor activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030192
@@ -173056,8 +174145,9 @@
 synonym: "Hsp70/Hsc70 protein regulator activity" EXACT []
 is_obsolete: true
 consider: GO:0006457
-consider: GO:0051082
+consider: GO:0044183
 consider: GO:0051787
+consider: GO:0140309
 
 [Term]
 id: GO:0030193
@@ -173988,7 +175078,7 @@
 xref: MetaCyc:2.3.1.101-RXN
 xref: RHEA:18061
 xref: UM-BBD_reactionID:r0346
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.101
 property_value: skos:exactMatch RHEA:18061
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -174755,17 +175845,21 @@
 
 [Term]
 id: GO:0030343
-name: vitamin D3 25-hydroxylase activity
+name: vitamin D 25-hydroxylase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: calciol (vitamin D3) + reduced [NADPH--hemoprotein reductase] + O2 = calcidiol + oxidized [NADPH--hemoprotein reductase] + H2O + H+." [RHEA:32903]
 synonym: "cholecalciferol 25-hydroxylase activity" EXACT []
+synonym: "vitamin D3 25-hydroxylase activity" EXACT []
+xref: EC:1.14.14.24
 xref: MetaCyc:RXN-9829
 xref: Reactome:R-HSA-209845 "CYP2R1 25-hydroxylates VD3 to 25(OH)D"
 xref: Reactome:R-HSA-5602147 "Defective CYP2R1 does not 25-hydroxylate vitamin D"
 xref: RHEA:32903
 is_a: GO:0008395 ! steroid hydroxylase activity
 relationship: part_of GO:0036378 ! calcitriol biosynthetic process from calciol
+property_value: skos:exactMatch EC:1.14.14.24
 property_value: skos:exactMatch RHEA:32903
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
 
 [Term]
 id: GO:0030345
@@ -175098,7 +176192,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving fructose 1,6-bisphosphate, also known as FBP. The D enantiomer is a metabolic intermediate in glycolysis and gluconeogenesis." [ISBN:0198506732]
 synonym: "fructose 1,6-bisphosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -175785,7 +176878,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "MAPKKK cascade (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030456
@@ -175795,7 +176888,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030457
@@ -175805,7 +176898,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030458
@@ -175815,7 +176908,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "activation of MAPKKK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030459
@@ -175825,7 +176918,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "inactivation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030460
@@ -175835,7 +176928,7 @@
 comment: This term was made obsolete because it is a gene product specific term.
 synonym: "nuclear translocation of MAPK (mating sensu Fungi)" EXACT []
 is_obsolete: true
-replaced_by: GO:0000750
+replaced_by: GO:0071507
 
 [Term]
 id: GO:0030463
@@ -177892,12 +178985,11 @@
 name: protein-macromolecule adaptor activity
 namespace: molecular_function
 def: "An adaptor activity that brings together two or more macromolecules in contact, permitting those molecules to function in a coordinated way. The adaptor can bring together two proteins, or a protein and another macromolecule such as a lipid or a nucleic acid." [GOC:bf, GOC:mah, GOC:vw]
+comment: Note that protein complex scaffolds should use GO:0140378 protein complex scaffold activity.
 subset: goslim_chembl
 subset: goslim_yeast
 synonym: "protein binding, bridging" EXACT []
-synonym: "protein complex scaffold activity" BROAD []
 synonym: "protein recruiting activity" RELATED []
-synonym: "protein-containing complex scaffold activity" BROAD []
 synonym: "protein-protein adaptor" NARROW []
 xref: Reactome:R-HSA-3780997 "PPP1R3C binds to glycogen:GYG2:GYS2"
 xref: Reactome:R-HSA-3781001 "EPM2A dimer binds PPP1R3C:phosphoglycogen-GYG1 complex"
@@ -177910,6 +179002,7 @@
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/18655" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19409" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22925" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31444" xsd:anyURI
 
 [Term]
 id: GO:0030677
@@ -181692,7 +182785,6 @@
 synonym: "thiamine pyrophosphate transport" NARROW []
 synonym: "TPP transport" EXACT []
 is_a: GO:0015697 ! quaternary ammonium group transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0071934 ! thiamine transmembrane transport
 
@@ -183404,7 +184496,7 @@
 name: induction of conjugation upon nutrient starvation
 namespace: biological_process
 def: "The process in which a cell initiates conjugation with cellular fusion upon starvation for one or more nutrients." [GOC:mah]
-is_a: GO:0010514 ! induction of conjugation with cellular fusion
+is_a: GO:0031139 ! positive regulation of conjugation with cellular fusion
 
 [Term]
 id: GO:0031141
@@ -184348,11 +185440,14 @@
 
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
@@ -185974,11 +187069,13 @@
 
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
@@ -186799,7 +187896,6 @@
 namespace: biological_process
 def: "The directed movement of glycine betaine, N-trimethylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "N-trimethylglycine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 
 [Term]
@@ -191110,7 +192206,6 @@
 name: pyridoxal transport
 namespace: biological_process
 def: "The directed movement of pyridoxal into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxal, 3-hydroxy-5-(hydroxymethyl)-2-methyl-4-pyridinecarboxaldehyde, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -191119,7 +192214,6 @@
 name: pyridoxal phosphate transport
 namespace: biological_process
 def: "The directed movement of pyridoxal phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore; pyridoxal phosphate is pyridoxal phosphorylated at the hydroxymethyl group of C-5, and is the active form of vitamin B6." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
@@ -191129,7 +192223,6 @@
 name: pyridoxamine transport
 namespace: biological_process
 def: "The directed movement of pyridoxamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Pyridoxamine, 4-(aminomethyl)-5-(hydroxymethyl)-2-methylpyridin-3-ol, is one of the vitamin B6 compounds. Pyridoxal, pyridoxamine and pyridoxine are collectively known as vitamin B6, and are efficiently converted to the biologically active form of vitamin B6, pyridoxal phosphate." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0031919 ! vitamin B6 transport
 
@@ -192064,13 +193157,13 @@
 
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
@@ -194366,7 +195459,7 @@
 synonym: "GPI-inositol acyltransferase" RELATED []
 xref: RHEA:60496
 xref: RHEA:83759
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:60496
 property_value: skos:narrowMatch RHEA:83759
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30693" xsd:anyURI
@@ -194387,7 +195480,6 @@
 name: riboflavin transport
 namespace: biological_process
 def: "The directed movement of riboflavin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Riboflavin (vitamin B2) is a water-soluble B-complex vitamin, converted in the cell to FMN and FAD, cofactors required for the function of flavoproteins." [GOC:rn, PMID:16204239]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 is_a: GO:0071705 ! nitrogen compound transport
 
@@ -195040,7 +196132,7 @@
 namespace: biological_process
 def: "The regulated release of a gonadotropin, any hormone that stimulates the gonads, especially follicle-stimulating hormone and luteinizing hormone." [GOC:mah, ISBN:0721662544]
 synonym: "gonadotrophin secretion" EXACT []
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032275
@@ -195542,7 +196634,6 @@
 name: alanine transport
 namespace: biological_process
 def: "The directed movement of alanine, 2-aminopropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195554,7 +196645,6 @@
 alt_id: GO:0090478
 def: "The directed movement of L-serine, 2-amino-3-hydroxypropanoic acid, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "serine import" NARROW []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015804 ! neutral amino acid transport
 is_a: GO:0046942 ! carboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
@@ -195617,7 +196707,7 @@
 name: inhibin secretion
 namespace: biological_process
 def: "The regulated release of an inhibin, either of two glycoproteins (designated A and B), secreted by the gonads and present in seminal plasma and follicular fluid, that inhibit pituitary production of follicle-stimulating hormone." [GOC:mah]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0032335
@@ -196649,7 +197739,6 @@
 is_a: GO:0043005 ! neuron projection
 is_a: GO:0098858 ! actin-based cell projection
 relationship: part_of GO:0032421 ! stereocilium bundle
-relationship: part_of GO:0043226 ! organelle
 
 [Term]
 id: GO:0032421
@@ -196876,14 +197965,15 @@
 id: GO:0032441
 name: pheophorbide a oxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: pheophorbide a + reduced ferredoxin + 2 O2 = red chlorophyll catabolite + oxidized ferredoxin + H2O." [PMID:14657372]
+def: "Catalysis of the reaction: pheophorbide a + 2 reduced [2Fe-2S]-[ferredoxin] + O2 + 2 H(+) = red chlorophyll catabolite + 2 oxidized [2Fe-2S]-[ferredoxin]." [PMID:14657372, RHEA:48140]
 xref: EC:1.14.15.17
 xref: MetaCyc:RXN-7740
 xref: RHEA:48140
-is_a: GO:0016730 ! oxidoreductase activity, acting on iron-sulfur proteins as donors
+is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.15.17
 property_value: skos:exactMatch RHEA:48140
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0032442
@@ -198225,7 +199315,7 @@
 name: O-linoleoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a linoleoyl ((9Z,12Z)-octadeca-9,12-dienoyl) group to an oxygen atom on the acceptor molecule." [GOC:cb]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0032577
@@ -203023,34 +204113,47 @@
 
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
@@ -203808,7 +204911,8 @@
 synonym: "insertion of proteins into the mitochondrial membrane from the inner side" EXACT []
 synonym: "protein insertion into mitochondrial inner membrane from matrix side" EXACT []
 synonym: "protein insertion into mitochondrial membrane from inner side" EXACT []
-is_a: GO:0045039 ! protein insertion into mitochondrial inner membrane
+is_a: GO:0007007 ! inner mitochondrial membrane organization
+is_a: GO:0051204 ! protein insertion into mitochondrial membrane
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25265" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30453" xsd:anyURI
 
@@ -206254,9 +207358,10 @@
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
@@ -206366,46 +207471,54 @@
 
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
@@ -206909,7 +208022,6 @@
 namespace: biological_process
 def: "The directed movement of myo-inositol hexakisphosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
 synonym: "phytate transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0033271 ! myo-inositol phosphate transport
 
 [Term]
@@ -207723,10 +208835,15 @@
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
@@ -208128,59 +209245,65 @@
 
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
@@ -209340,7 +210463,6 @@
 synonym: "Leloir Pathway" EXACT [PMID:14741191]
 xref: MetaCyc:PWY-6317
 xref: Reactome:R-HSA-70370 "Galactose catabolism"
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019388 ! galactose catabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
@@ -210524,7 +211646,7 @@
 id: GO:0033608
 name: formyl-CoA transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: formyl-CoA + oxalate = formate + oxalyl-CoA." [EC:2.8.3.16, RHEA:16545]
+def: "Catalysis of the reaction: formyl-CoA + oxalate = formate + oxalyl-CoA." [RHEA:16545]
 synonym: "formyl-CoA oxalate CoA-transferase activity" RELATED [EC:2.8.3.16]
 synonym: "formyl-CoA:oxalate CoA-transferase activity" RELATED [EC:2.8.3.16]
 synonym: "formyl-coenzyme A transferase activity" RELATED [EC:2.8.3.16]
@@ -211782,10 +212904,11 @@
 xref: EC:1.1.99.3
 xref: MetaCyc:GLUCONATE-2-DEHYDROGENASE-RXN
 xref: RHEA:12769
-is_a: GO:0008875 ! gluconate dehydrogenase activity
+is_a: GO:0016614 ! oxidoreductase activity, acting on CH-OH group of donors
 property_value: skos:exactMatch EC:1.1.99.3
 property_value: skos:exactMatch RHEA:12769
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0033718
@@ -211858,13 +212981,22 @@
 xref: EC:1.2.1.4
 xref: MetaCyc:ALDEHYDE-DEHYDROGENASE-NADP+-RXN
 xref: RHEA:11888
+xref: RHEA:27918
 xref: RHEA:28410
 xref: RHEA:30803
 xref: RHEA:34215
 xref: RHEA:47928
+xref: RHEA:59428
+xref: RHEA:59904
+xref: RHEA:59908
+xref: RHEA:59912
+xref: RHEA:59916
 xref: RHEA:60680
 xref: RHEA:60684
+xref: RHEA:60692
 xref: RHEA:60716
+xref: RHEA:60720
+xref: RHEA:60724
 xref: RHEA:60728
 xref: RHEA:60732
 xref: RHEA:60736
@@ -211873,19 +213005,34 @@
 xref: RHEA:68412
 xref: RHEA:72535
 xref: RHEA:72539
+xref: RHEA:76651
+xref: RHEA:76659
+xref: RHEA:76663
 xref: RHEA:76671
+xref: RHEA:76967
+xref: RHEA:80815
+xref: RHEA:80819
 xref: RHEA:80823
 xref: RHEA:81423
 is_a: GO:0004030 ! aldehyde dehydrogenase [NAD(P)+] activity
 property_value: skos:exactMatch EC:1.2.1.4
 property_value: skos:exactMatch RHEA:11888
+property_value: skos:narrowMatch RHEA:27918
 property_value: skos:narrowMatch RHEA:28410
 property_value: skos:narrowMatch RHEA:30803
 property_value: skos:narrowMatch RHEA:34215
 property_value: skos:narrowMatch RHEA:47928
+property_value: skos:narrowMatch RHEA:59428
+property_value: skos:narrowMatch RHEA:59904
+property_value: skos:narrowMatch RHEA:59908
+property_value: skos:narrowMatch RHEA:59912
+property_value: skos:narrowMatch RHEA:59916
 property_value: skos:narrowMatch RHEA:60680
 property_value: skos:narrowMatch RHEA:60684
+property_value: skos:narrowMatch RHEA:60692
 property_value: skos:narrowMatch RHEA:60716
+property_value: skos:narrowMatch RHEA:60720
+property_value: skos:narrowMatch RHEA:60724
 property_value: skos:narrowMatch RHEA:60728
 property_value: skos:narrowMatch RHEA:60732
 property_value: skos:narrowMatch RHEA:60736
@@ -211894,7 +213041,13 @@
 property_value: skos:narrowMatch RHEA:68412
 property_value: skos:narrowMatch RHEA:72535
 property_value: skos:narrowMatch RHEA:72539
+property_value: skos:narrowMatch RHEA:76651
+property_value: skos:narrowMatch RHEA:76659
+property_value: skos:narrowMatch RHEA:76663
 property_value: skos:narrowMatch RHEA:76671
+property_value: skos:narrowMatch RHEA:76967
+property_value: skos:narrowMatch RHEA:80815
+property_value: skos:narrowMatch RHEA:80819
 property_value: skos:narrowMatch RHEA:80823
 property_value: skos:narrowMatch RHEA:81423
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29544" xsd:anyURI
@@ -212480,12 +213633,13 @@
 xref: MetaCyc:RXN-8000
 xref: RHEA:10448
 xref: RHEA:32755
-is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
+is_a: GO:0050498 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, with 2-oxoglutarate as one donor, and the other dehydrogenated
 relationship: part_of GO:0051553 ! flavone biosynthetic process
 property_value: skos:exactMatch EC:1.14.20.5
 property_value: skos:exactMatch RHEA:10448
 property_value: skos:narrowMatch RHEA:32755
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0033760
@@ -212690,7 +213844,7 @@
 xref: RHEA:61104
 xref: RHEA:61108
 xref: RHEA:61120
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.81
 property_value: skos:exactMatch MetaCyc:RXN-13192
 property_value: skos:exactMatch RHEA:55448
@@ -212698,6 +213852,7 @@
 property_value: skos:narrowMatch RHEA:61108
 property_value: skos:narrowMatch RHEA:61120
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0033773
@@ -212740,10 +213895,11 @@
 xref: KEGG_REACTION:R05828
 xref: MetaCyc:1.14.13.91-RXN
 xref: RHEA:14237
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.136
 property_value: skos:exactMatch RHEA:14237
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0033776
@@ -212775,10 +213931,11 @@
 xref: KEGG_REACTION:R07203
 xref: MetaCyc:1.14.13.94-RXN
 xref: RHEA:18857
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.138
 property_value: skos:exactMatch RHEA:18857
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0033778
@@ -212839,10 +213996,11 @@
 xref: MetaCyc:1.14.13.98-RXN
 xref: Reactome:R-HSA-192061 "CYP46A1 24-hydroxylates CHOL"
 xref: RHEA:22716
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.25
 property_value: skos:exactMatch RHEA:22716
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0033782
@@ -213115,12 +214273,14 @@
 xref: KEGG_REACTION:R07229
 xref: MetaCyc:RXN0-2101
 xref: RHEA:14029
+xref: RHEA:34939
 xref: RHEA:51636
 xref: RHEA:80603
 xref: UM-BBD_reactionID:r0828
 is_a: GO:0016491 ! oxidoreductase activity
 property_value: skos:exactMatch EC:1.97.1.9
 property_value: skos:exactMatch RHEA:14029
+property_value: skos:narrowMatch RHEA:34939
 property_value: skos:narrowMatch RHEA:51636
 property_value: skos:narrowMatch RHEA:80603
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -213389,7 +214549,7 @@
 xref: KEGG_REACTION:R03064
 xref: MetaCyc:2.3.1.175-RXN
 xref: RHEA:23860
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.175
 property_value: skos:exactMatch RHEA:23860
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -213408,7 +214568,7 @@
 synonym: "sterol carrier protein-X" RELATED [EC:2.3.1.176]
 xref: MetaCyc:2.3.1.176-RXN
 xref: RHEA:16865
-is_a: GO:0016408 ! C-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:broadMatch EC:2.3.1.176
 property_value: skos:exactMatch RHEA:16865
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
@@ -214403,7 +215563,7 @@
 name: succinyl-CoA:(R)-benzylsuccinate CoA-transferase activity
 namespace: molecular_function
 alt_id: GO:0018728
-def: "Catalysis of the reaction: (R)-2-benzylsuccinate + succinyl-CoA = (R)-2-benzylsuccinyl-CoA + succinate." [EC:2.8.3.15, RHEA:16469]
+def: "Catalysis of the reaction: (R)-2-benzylsuccinate + succinyl-CoA = (R)-2-benzylsuccinyl-CoA + succinate." [RHEA:16469]
 synonym: "benzylsuccinate CoA-transferase activity" RELATED [EC:2.8.3.15]
 synonym: "succinyl-CoA:(R)-2-benzylsuccinate CoA-transferase activity" RELATED [EC:2.8.3.15]
 synonym: "succinyl-CoA:benzylsuccinate CoA-transferase activity" EXACT []
@@ -218725,7 +219885,7 @@
 synonym: "D-galactonate degradation" EXACT []
 xref: MetaCyc:GALACTCAT-PWY
 is_a: GO:0016052 ! carbohydrate catabolic process
-is_a: GO:0019584 ! galactonate catabolic process
+is_a: GO:0046176 ! aldonic acid catabolic process
 
 [Term]
 id: GO:0034195
@@ -218736,7 +219896,7 @@
 synonym: "L-galactonate catabolism" EXACT []
 synonym: "L-galactonate degradation" EXACT []
 is_a: GO:0016052 ! carbohydrate catabolic process
-is_a: GO:0019584 ! galactonate catabolic process
+is_a: GO:0046176 ! aldonic acid catabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28388" xsd:anyURI
 
 [Term]
@@ -219104,7 +220264,6 @@
 def: "The directed movement of ethanolamine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Ethanolamine (2-aminoethanol, monoethanolamine) is an amino alcohol that occurs widely in living organisms as a constituent of certain types of phospholipids, such as phosphatidylethanolamine." [GOC:rn, PMID:3514579]
 synonym: "2-aminoethanol transport" EXACT []
 synonym: "monoethanolamine transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015837 ! amine transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 
@@ -219630,8 +220789,10 @@
 synonym: "kynurenic acid biosynthesis" EXACT []
 synonym: "kynurenic acid formation" RELATED []
 synonym: "kynurenic acid synthesis" EXACT []
+synonym: "kynurenine pathway" BROAD []
 is_a: GO:0034275 ! kynurenic acid metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034277
@@ -220061,7 +221222,7 @@
 synonym: "acyl-coenzymeA:ethanol O-acyltransferase activity" NARROW []
 synonym: "AEATase activity" NARROW []
 synonym: "alcohol acyltransferase activity" EXACT []
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0034319
@@ -220444,9 +221605,11 @@
 namespace: molecular_function
 def: "Catalysis of the removal of a 5' terminal diphosphate from the 5'-triphosphate end of an mRNA, leaving a 5'-monophosphate end." [GOC:jh2, PMID:17612492, PMID:18202662]
 synonym: "RNA pyrophosphohydrolase activity" BROAD []
+is_a: GO:0004651 ! polynucleotide 5'-phosphatase activity
 is_a: GO:0016462 ! pyrophosphatase activity
 is_a: GO:0140098 ! catalytic activity, acting on RNA
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23401" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31924" xsd:anyURI
 
 [Term]
 id: GO:0034354
@@ -220456,6 +221619,7 @@
 synonym: "'de novo' NAD biosynthetic process from L-tryptophan" EXACT []
 synonym: "'de novo' NAD biosynthetic process from tryptophan" BROAD []
 synonym: "de novo NAD biosynthetic process from tryptophan" RELATED []
+synonym: "kynurenine pathway" BROAD []
 xref: MetaCyc:NADSYN-PWY
 xref: MetaCyc:PWY-5653
 is_a: GO:0006568 ! L-tryptophan metabolic process
@@ -220464,6 +221628,7 @@
 property_value: skos:narrowMatch MetaCyc:PWY-5653
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29050" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29666" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31588" xsd:anyURI
 
 [Term]
 id: GO:0034355
@@ -222830,7 +223995,6 @@
 def: "Enables the transfer of L-hydroxyproline from one side of a membrane to the other." [GOC:mah, PMID:14502423]
 synonym: "4-hydroxyproline transmembrane transporter activity" BROAD []
 xref: Reactome:R-HSA-6784213 "Unknown hydroxyproline carrier transports cytosolic HPRO into the mitochondrial matrix"
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015179 ! L-amino acid transmembrane transporter activity
 is_a: GO:0072349 ! modified amino acid transmembrane transporter activity
 relationship: part_of GO:0034589 ! hydroxyproline transport
@@ -223232,7 +224396,6 @@
 name: glutathione transport
 namespace: biological_process
 def: "The directed movement of glutathione, the tripeptide glutamylcysteinylglycine, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0042939 ! tripeptide transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -229604,7 +230767,7 @@
 name: regulation of dephosphorylation
 namespace: biological_process
 def: "Any process that modulates the frequency, rate or extent of removal of phosphate groups from a molecule." [GOC:bf]
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
+is_a: GO:0019222 ! regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0016311 ! dephosphorylation
 relationship: regulates GO:0016311 ! dephosphorylation
@@ -231012,6 +232175,7 @@
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "gluconate membrane transport" EXACT []
 synonym: "gluconate transport" RELATED []
+is_a: GO:0034219 ! carbohydrate transmembrane transport
 is_a: GO:0042873 ! aldonate transmembrane transport
 created_by: bf
 creation_date: 2010-04-08T10:33:46Z
@@ -231122,7 +232286,6 @@
 def: "The process in which triose phosphate (glyceraldehyde 3-phosphate) is transported across a membrane. Glyceraldehyde 3-phosphate is any organic three carbon compound phosphate ester." [GOC:bf, ISBN:0198506732]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "triose phosphate membrane transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015717 ! triose phosphate transport
 is_a: GO:0055085 ! transmembrane transport
 created_by: bf
@@ -233981,6 +235144,7 @@
 def: "The process in which a tricarboxylic acid is transported across a membrane." [GOC:vw]
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "tricarboxylic acid membrane transport" EXACT []
+is_a: GO:0006842 ! tricarboxylic acid transport
 is_a: GO:1905039 ! carboxylic acid transmembrane transport
 created_by: bf
 creation_date: 2011-02-08T02:37:31Z
@@ -235892,13 +237056,16 @@
 
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
 
@@ -236148,6 +237315,7 @@
 synonym: "dITP catabolism" EXACT [GOC:bf]
 synonym: "dITP degradation" EXACT [GOC:bf]
 is_a: GO:0009155 ! purine deoxyribonucleotide catabolic process
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009217 ! purine deoxyribonucleoside triphosphate catabolic process
 created_by: bf
 creation_date: 2011-05-25T02:55:21Z
@@ -236580,7 +237748,7 @@
 synonym: "parathormone secretion" EXACT [PR:000013429]
 synonym: "parathyrin secretion" EXACT [PR:000013429]
 synonym: "PTH secretion" EXACT [PMID:12171519, PR:000013429]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 created_by: bf
 creation_date: 2011-06-22T09:28:54Z
 
@@ -236944,7 +238112,7 @@
 name: steroid hormone secretion
 namespace: biological_process
 def: "The regulated release of any steroid that acts as a hormone into the circulatory system." [GOC:sl]
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 created_by: bf
 creation_date: 2011-07-20T01:01:00Z
@@ -240161,10 +241329,11 @@
 xref: KEGG_REACTION:R06351
 xref: MetaCyc:RXN-8507
 xref: RHEA:26217
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.144
 property_value: skos:exactMatch RHEA:26217
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-19T10:57:05Z
 
@@ -240304,10 +241473,11 @@
 xref: EC:1.14.15.29
 xref: KEGG_REACTION:R09859
 xref: RHEA:51564
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016713 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced iron-sulfur protein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.15.29
 property_value: skos:exactMatch RHEA:51564
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-20T02:03:05Z
 
@@ -240337,10 +241507,11 @@
 xref: EC:1.14.14.76
 xref: KEGG_REACTION:R09861
 xref: RHEA:56336
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.76
 property_value: skos:exactMatch RHEA:56336
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-20T02:21:33Z
 
@@ -240353,10 +241524,11 @@
 xref: EC:1.14.14.112
 xref: KEGG_REACTION:R09866
 xref: RHEA:31967
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.112
 property_value: skos:exactMatch RHEA:31967
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-20T02:34:13Z
 
@@ -240384,10 +241556,11 @@
 xref: KEGG_REACTION:R06354
 xref: MetaCyc:RXN-12799
 xref: RHEA:26221
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.145
 property_value: skos:exactMatch RHEA:26221
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-24T02:37:15Z
 
@@ -240456,11 +241629,12 @@
 xref: KEGG_REACTION:R09865
 xref: MetaCyc:RXN-15437
 xref: RHEA:31951
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.111
 property_value: skos:exactMatch RHEA:31951
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21412" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: bf
 creation_date: 2012-04-25T11:11:55Z
 
@@ -242661,12 +243835,14 @@
 xref: KEGG_REACTION:R09494
 xref: MetaCyc:FORMATEDEHYDROG-RXN
 xref: RHEA:29063
+xref: RHEA:29067
 xref: RHEA:29071
 xref: RHEA:48592
 is_a: GO:0033695 ! oxidoreductase activity, acting on CH or CH2 groups, quinone or similar compound as acceptor
 property_value: skos:exactMatch EC:1.17.5.3
 property_value: skos:exactMatch RHEA:48592
 property_value: skos:narrowMatch RHEA:29063
+property_value: skos:narrowMatch RHEA:29067
 property_value: skos:narrowMatch RHEA:29071
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21412" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -243260,11 +244436,14 @@
 name: 2-dehydropantolactone reductase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: (R)-pantolactone + NADP+ = 2-dehydropantolactone + NADPH + H+." [RHEA:18981]
+xref: EC:1.1.1.358
 xref: KEGG_REACTION:R03155
 xref: RHEA:18981
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+property_value: skos:exactMatch EC:1.1.1.358
 property_value: skos:exactMatch RHEA:18981
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
 created_by: bf
 creation_date: 2013-09-30T16:26:27Z
 
@@ -244053,10 +245232,14 @@
 
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
 
@@ -245141,7 +246324,7 @@
 synonym: "nitric oxide-cGMP-mediated signaling pathway" EXACT []
 synonym: "nitric oxide-cGMP-mediated signalling pathway" EXACT [GOC:mah]
 synonym: "NO-cGMP signaling pathway" EXACT [PMID:22019632]
-is_a: GO:0007263 ! nitric oxide mediated signal transduction
+is_a: GO:0141124 ! intracellular signaling cassette
 created_by: bf
 creation_date: 2012-01-10T05:32:39Z
 
@@ -248776,9 +249959,9 @@
 name: RNA translocase activity
 namespace: molecular_function
 def: "Generating a movement along a single- or double-stranded RNA molecule, driven by ATP hydrolysis." [GOC:bm, PMID:22713318]
-comment: Note that some gene products that possess DNA translocase activity, such as members of the FtsK/SpoIIIE family, can be fixed in place by interactions with other components of the cell; the relative movement between the protein and DNA bound to it results in movement of the DNA within the cell, often across a membrane.
 is_a: GO:0008186 ! ATP-dependent activity, acting on RNA
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21612" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31772" xsd:anyURI
 created_by: bf
 creation_date: 2012-08-06T13:24:51Z
 
@@ -250781,9 +251964,15 @@
 xref: Reactome:R-HSA-5216234 "PRMT5:pT5-WDR77 methylates arginine-4 of histone H2A (H2AR3)"
 xref: Reactome:R-HSA-9822583 "METTL23 dimethylates histone H3.3 arginine-17 (arginine-18 in the preprotein)"
 xref: RHEA:10024
+xref: RHEA:60312
+xref: RHEA:67112
+xref: RHEA:67808
 is_a: GO:0008276 ! protein methyltransferase activity
 is_a: GO:0140993 ! histone modifying activity
 property_value: skos:narrowMatch RHEA:10024
+property_value: skos:narrowMatch RHEA:60312
+property_value: skos:narrowMatch RHEA:67112
+property_value: skos:narrowMatch RHEA:67808
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22588" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24397" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29483" xsd:anyURI
@@ -253372,7 +254561,7 @@
 def: "Any process that modulates the frequency, rate or extent of addition of phosphate groups into a molecule." [GOC:jl]
 comment: Note that this term is in the subset of terms that should not be used for direct gene product annotation. Instead, select a child term or, if no appropriate child term exists, please request a new term. Direct annotations to this term may be amended during annotation QC.
 subset: gocheck_obsoletion_candidate
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
+is_a: GO:0019222 ! regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0016310 ! phosphorylation
 relationship: regulates GO:0016310 ! phosphorylation
@@ -253730,7 +254919,6 @@
 synonym: "thiamine pyrophosphate metabolism" EXACT []
 synonym: "TPP metabolic process" EXACT []
 synonym: "TPP metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0042723 ! thiamine-containing compound metabolic process
 
@@ -254177,7 +255365,6 @@
 synonym: "phosphagen biosynthesis" EXACT []
 synonym: "phosphagen formation" EXACT []
 synonym: "phosphagen synthesis" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0042398 ! modified amino acid biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
 
@@ -254189,7 +255376,6 @@
 synonym: "phosphagen breakdown" EXACT []
 synonym: "phosphagen catabolism" EXACT []
 synonym: "phosphagen degradation" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0042219 ! modified amino acid catabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 
@@ -256260,7 +257446,7 @@
 synonym: "PHB metabolic process" EXACT []
 synonym: "PHB metabolism" EXACT []
 synonym: "poly-hydroxybutyrate metabolism" EXACT []
-is_a: GO:1901440 ! poly(hydroxyalkanoate) metabolic process
+is_a: GO:0008152 ! metabolic process
 
 [Term]
 id: GO:0042619
@@ -256273,8 +257459,8 @@
 synonym: "poly-hydroxybutyrate biosynthesis" EXACT []
 synonym: "poly-hydroxybutyrate formation" EXACT []
 synonym: "poly-hydroxybutyrate synthesis" EXACT []
+is_a: GO:0009058 ! biosynthetic process
 is_a: GO:0042618 ! poly-hydroxybutyrate metabolic process
-is_a: GO:1901441 ! poly(hydroxyalkanoate) biosynthetic process
 
 [Term]
 id: GO:0042620
@@ -258409,7 +259595,9 @@
 def: "The chemical reactions and pathways involving any of the vitamin B6 compounds: pyridoxal, pyridoxamine and pyridoxine and the active form, pyridoxal phosphate." [GOC:jl, PMID:30037155, PMID:30671974]
 synonym: "vitamin B6 metabolism" EXACT []
 xref: Reactome:R-HSA-964975 "Vitamin B6 activation to pyridoxal phosphate"
+is_a: GO:0006766 ! vitamin metabolic process
 is_a: GO:0072524 ! pyridine-containing compound metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31855" xsd:anyURI
 
 [Term]
 id: GO:0042817
@@ -258476,7 +259664,6 @@
 synonym: "active vitamin B6 metabolism" EXACT []
 synonym: "pyridoxal phosphate metabolism" EXACT []
 is_a: GO:0006081 ! aldehyde metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0042816 ! vitamin B6 metabolic process
 
@@ -258577,7 +259764,7 @@
 synonym: "saccharate metabolic process" EXACT []
 synonym: "saccharate metabolism" EXACT []
 is_a: GO:0005975 ! carbohydrate metabolic process
-is_a: GO:0043648 ! dicarboxylic acid metabolic process
+is_a: GO:0019752 ! carboxylic acid metabolic process
 
 [Term]
 id: GO:0042837
@@ -258591,7 +259778,7 @@
 synonym: "saccharate biosynthesis" EXACT []
 synonym: "saccharate biosynthetic process" EXACT []
 is_a: GO:0016051 ! carbohydrate biosynthetic process
-is_a: GO:0019393 ! glucarate biosynthetic process
+is_a: GO:0019578 ! aldaric acid biosynthetic process
 is_a: GO:0042836 ! D-glucarate metabolic process
 
 [Term]
@@ -259034,7 +260221,6 @@
 namespace: biological_process
 def: "The process in which aldarate is transported across a lipid bilayer, from one side of a membrane to the other." [GOC:curators]
 synonym: "aldarate transport" RELATED []
-is_a: GO:0006835 ! dicarboxylic acid transport
 is_a: GO:1905039 ! carboxylic acid transmembrane transport
 
 [Term]
@@ -259085,7 +260271,6 @@
 name: D-glucarate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of D-glucarate, the D-enantiomer of glucarate, from one side of a membrane to the other." [GOC:jl, GOC:jsg, GOC:mah, GOC:mtg_transport, ISBN:0198506732, ISBN:0815340729]
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0042876 ! aldarate transmembrane transporter activity
 relationship: part_of GO:0042870 ! D-glucarate transmembrane transport
@@ -259095,7 +260280,7 @@
 name: aldonate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of aldonate from one side of a membrane to the other." [GOC:jl, GOC:mtg_transport, ISBN:0815340729]
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 relationship: part_of GO:0042873 ! aldonate transmembrane transport
 
 [Term]
@@ -259129,13 +260314,13 @@
 
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
@@ -259447,7 +260632,6 @@
 def: "The directed movement of an alkanesulfonate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Alkanesulfonates are organic esters or salts of sulfonic acid containing an aliphatic hydrocarbon radical." [PMID:31802112]
 synonym: "alkanesulfonate transport" BROAD []
 synonym: "alkanesulphonate transport" BROAD []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -259508,8 +260692,8 @@
 namespace: molecular_function
 def: "Enables the directed movement of benzoate, the anion of benzoic acid (benzenecarboxylic acid) from one side of a membrane to the other." [GOC:jl, ISBN:0721662544]
 synonym: "benzoate transporter activity" RELATED []
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0042910 ! xenobiotic transmembrane transporter activity
-is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 relationship: part_of GO:0042919 ! benzoate transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27521" xsd:anyURI
 
@@ -259549,7 +260733,6 @@
 namespace: biological_process
 def: "The directed movement of the siderochrome enterobactin, a cyclic trimer of 2, 3 dihydroxybenzoylserine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl]
 synonym: "enterochelin transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0015891 ! siderophore transport
 
@@ -259581,9 +260764,9 @@
 namespace: molecular_function
 def: "Enables the directed movement of the siderophore chrysobactin (alpha-N-(2,3-dihydroxybenzoyl)-D-lysyl-L-serine) from one side of a membrane to the other." [GOC:jl, PMID:8837459]
 synonym: "chrysobactin transporter activity" RELATED []
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015343 ! siderophore-iron transmembrane transporter activity
 is_a: GO:0015665 ! alcohol transmembrane transporter activity
+is_a: GO:0046943 ! carboxylic acid transmembrane transporter activity
 is_a: GO:0071916 ! dipeptide transmembrane transporter activity
 relationship: part_of GO:0042932 ! chrysobactin transport
 
@@ -262376,7 +263559,6 @@
 name: daunorubicin transport
 namespace: biological_process
 def: "The directed movement of daunorubicin, an anthracycline antibiotic produced by Streptomyces coeruleorubidus or S. peucetius and used as an antineoplastic into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:jl, GOC:mlg]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
 
@@ -262738,7 +263920,7 @@
 name: sodium-dependent organic anion transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043252
@@ -262746,7 +263928,7 @@
 namespace: biological_process
 def: "The directed, sodium-independent, movement of organic anions into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:curators]
 xref: Reactome:R-HSA-879518 "Organic anion transport by SLCO transporters"
-is_a: GO:0015711 ! organic anion transport
+is_a: GO:0055085 ! transmembrane transport
 
 [Term]
 id: GO:0043253
@@ -264862,13 +266044,14 @@
 synonym: "oxo acid metabolic process" EXACT []
 synonym: "oxo acid metabolism" EXACT []
 synonym: "oxoacid metabolism" EXACT []
-is_a: GO:0006082 ! organic acid metabolic process
+is_a: GO:0044281 ! small molecule metabolic process
 
 [Term]
 id: GO:0043438
-name: acetoacetic acid metabolic process
+name: obsolete acetoacetic acid metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving acetoacetic acid, 3-oxobutanoic acid; the empirical formula is C4H6O3 or CH3COCH2COOH." [Wikipedia:Acetoacetic_acid]
+def: "OBSOLETE. The chemical reactions and pathways involving acetoacetic acid, 3-oxobutanoic acid; the empirical formula is C4H6O3 or CH3COCH2COOH." [Wikipedia:Acetoacetic_acid]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "3-oxobutanoate metabolic process" EXACT []
 synonym: "3-oxobutanoate metabolism" EXACT []
 synonym: "3-oxobutanoic acid metabolic process" EXACT []
@@ -264882,33 +266065,35 @@
 synonym: "beta-ketobutyric acid metabolism" EXACT []
 synonym: "diacetic acid metabolic process" EXACT []
 synonym: "diacetic acid metabolism" EXACT []
-is_a: GO:0046459 ! short-chain fatty acid metabolic process
-is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0043441
-name: acetoacetic acid biosynthetic process
+name: obsolete acetoacetic acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of acetoacetic acid, a beta-keto acid of the keto acid group, empirical formula is C4H6O3 or CH3COCH2COOH." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of acetoacetic acid, a beta-keto acid of the keto acid group, empirical formula is C4H6O3 or CH3COCH2COOH." [GOC:jl]
+comment: This term was obsoleted because it represents a specific substrate of ketone body biosynthetic process ; GO:0046951.
 synonym: "acetoacetic acid anabolism" EXACT []
 synonym: "acetoacetic acid biosynthesis" EXACT []
 synonym: "acetoacetic acid formation" EXACT []
 synonym: "acetoacetic acid synthesis" EXACT []
-is_a: GO:0043438 ! acetoacetic acid metabolic process
-is_a: GO:0046951 ! ketone body biosynthetic process
-is_a: GO:0051790 ! short-chain fatty acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046951
 
 [Term]
 id: GO:0043442
-name: acetoacetic acid catabolic process
+name: obsolete acetoacetic acid catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of acetoacetic acid, a beta-keto acid of the keto acid group, empirical formula is C4H6O3 or CH3COCH2COOH." [GOC:jl]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of acetoacetic acid, a beta-keto acid of the keto acid group, empirical formula is C4H6O3 or CH3COCH2COOH." [GOC:jl]
+comment: This term was obsoleted because it represents a specific substrate of \nketone body catabolic process ;  GO:0046952.
 synonym: "acetoacetic acid breakdown" EXACT []
 synonym: "acetoacetic acid catabolism" EXACT []
 synonym: "acetoacetic acid degradation" EXACT []
-is_a: GO:0019626 ! short-chain fatty acid catabolic process
-is_a: GO:0043438 ! acetoacetic acid metabolic process
-is_a: GO:0046952 ! ketone body catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046952
 
 [Term]
 id: GO:0043443
@@ -266071,7 +267256,6 @@
 synonym: "Moco metabolic process" EXACT []
 synonym: "Moco metabolism" EXACT []
 synonym: "molybdopterin cofactor metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0051189 ! prosthetic group metabolic process
 
@@ -267149,7 +268333,6 @@
 synonym: "myo-inositol phosphate metabolic process" NARROW []
 synonym: "myo-inositol phosphate metabolism" NARROW []
 xref: Reactome:R-HSA-1483249 "Inositol phosphate metabolism"
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0019751 ! polyol metabolic process
 
@@ -267743,19 +268926,27 @@
 
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
-name: (R)-2-hydroxyisocaproate dehydrogenase activity
+name: obsolete (R)-2-hydroxyisocaproate dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2-oxoisocaproate + NADH + H+ = (R)-2-hydroxyisocaproate + NAD+." [GOC:jl, PMID:16957230]
-is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+def: "OBSOLETE. Catalysis of the reaction: 2-oxoisocaproate + NADH + H+ = (R)-2-hydroxyisocaproate + NAD+." [GOC:jl, PMID:16957230]
+comment: The reason for obsoletion is that this term is equivalent to GO:0140175 (2R)-2-hydroxyacid dehydrogenase (NAD+) activity. "(R)-2-hydroxyisocaproate dehydrogenase" is a synonym of EC:1.1.1.345 (D-2-hydroxyacid dehydrogenase (NAD+)), which is the exact match xref of GO:0140175. The reaction catalyzed (involving (R)-2-hydroxy-4-methylpentanoate / 2-oxoisocaproate, RHEA:10052) is a narrowMatch instance of the more general reaction in GO:0140175.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31966" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0140175
 
 [Term]
 id: GO:0043714
@@ -267863,7 +269054,7 @@
 id: GO:0043721
 name: 4-hydroxybutanoyl-CoA dehydratase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 4-hydroxybutanoyl-CoA = vinylacetyl-CoA + H2O." [EC:4.2.1.120]
+def: "Catalysis of the reaction: 4-hydroxybutanoyl-CoA = (2E)-butenoyl-CoA + H2O." [RHEA:26530]
 synonym: "4-hydroxybutanoyl-CoA hydro-lyase" EXACT []
 synonym: "4-hydroxybutyryl-CoA dehydratase activity" EXACT []
 synonym: "gamma-hydroxybutanoyl-CoA dehydratase activity" EXACT []
@@ -268482,14 +269673,30 @@
 xref: MetaCyc:RXN-11046
 xref: MetaCyc:RXN-9191
 xref: RHEA:26466
+xref: RHEA:30063
+xref: RHEA:33255
 xref: RHEA:42640
+xref: RHEA:44776
+xref: RHEA:44780
+xref: RHEA:44784
+xref: RHEA:44788
+xref: RHEA:44792
+xref: RHEA:44796
 is_a: GO:0008168 ! methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.163
 property_value: skos:exactMatch MetaCyc:RXN-11046
 property_value: skos:narrowMatch MetaCyc:ADOMET-DMK-METHYLTRANSFER-RXN
 property_value: skos:narrowMatch MetaCyc:RXN-9191
 property_value: skos:narrowMatch RHEA:26466
+property_value: skos:narrowMatch RHEA:30063
+property_value: skos:narrowMatch RHEA:33255
 property_value: skos:narrowMatch RHEA:42640
+property_value: skos:narrowMatch RHEA:44776
+property_value: skos:narrowMatch RHEA:44780
+property_value: skos:narrowMatch RHEA:44784
+property_value: skos:narrowMatch RHEA:44788
+property_value: skos:narrowMatch RHEA:44792
+property_value: skos:narrowMatch RHEA:44796
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
 
@@ -268663,7 +269870,7 @@
 id: GO:0043785
 name: cinnamoyl-CoA:phenyllactate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (R)-3-phenyllactate + [(2R,3S,4R,5R)-5-(6-amino-9H-purin-9-yl)-4-hydroxy-3-(phosphonatooxy)oxolan-2-yl]methyl {[(3R)-3-hydroxy-2,2-dimethyl-3-({2-[(2-{[(2E)-3-phenylprop-2-enoyl]sulfanyl}ethyl)carbamoyl]ethyl}carbamoyl)propyl phosphonato]oxy}phosphonate = (R)-3-phenyllactoyl-CoA + trans-cinnamate." [EC:2.8.3.17, RHEA:15601]
+def: "Catalysis of the reaction: (E)-cinnamoyl-CoA + (R)-3-phenyllactate = (R)-3-phenyllactoyl-CoA + (E)-cinnamate." [RHEA:15601]
 synonym: "(E)-cinnamoyl-CoA:(R)-phenyllactate CoA-transferase activity" EXACT []
 synonym: "FldA" RELATED []
 xref: EC:2.8.3.17
@@ -268973,7 +270180,7 @@
 name: lyso-ornithine lipid acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: lyso-ornithine lipid + acyl-[acyl-carrier protein] = ornithine lipid + [acyl-carrier protein]." [PMID:15341653]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 
 [Term]
 id: GO:0043810
@@ -268984,7 +270191,7 @@
 synonym: "ornithine-acyl[acyl carrier protein] N-acyltransferase activity" EXACT []
 xref: EC:2.3.2.30
 xref: RHEA:20633
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0140371 ! ornithine lipid biosynthetic process
 property_value: skos:exactMatch EC:2.3.2.30
 property_value: skos:exactMatch RHEA:20633
@@ -269151,7 +270358,7 @@
 id: GO:0043821
 name: propionyl-CoA:succinate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinate + propionyl-CoA = succinyl-CoA + propionate." [PMID:10769117]
+def: "Catalysis of the reaction: succinate + propionyl-CoA = succinyl-CoA + propionate." [PMID:10769117, RHEA:28010]
 synonym: "propionyl-CoA succinate CoA-transferase activity" EXACT []
 synonym: "propionyl-CoA:succinate CoA transferase activity" EXACT []
 xref: MetaCyc:RXN0-268
@@ -270030,7 +271237,7 @@
 id: GO:0043885
 name: anaerobic carbon-monoxide dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: CO + H2O + oxidized ferredoxin = CO2 + reduced ferredoxin." [RHEA:21040]
+def: "Catalysis of the reaction: CO + 2 oxidized [2Fe-2S]-[ferredoxin] + H2O = 2 reduced [2Fe-2S]-[ferredoxin] + CO2 + 2 H+." [RHEA:21040]
 synonym: "carbon monoxide dehydrogenase (ferredoxin) activity" EXACT []
 synonym: "carbon monoxide dehydrogenase activity" BROAD []
 synonym: "carbon-monoxide dehydrogenase (ferredoxin) activity" EXACT []
@@ -270050,6 +271257,7 @@
 property_value: skos:exactMatch RHEA:21040
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25872" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31984" xsd:anyURI
 
 [Term]
 id: GO:0043886
@@ -271016,7 +272224,7 @@
 id: GO:0043961
 name: succinyl-CoA:(R)-citramalate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinyl-CoA + (R)-citramalate = succinate + (R)-citramalyl-CoA." [GOC:jl, PMID:17259315]
+def: "Catalysis of the reaction: succinyl-CoA + (R)-citramalate = succinate + (R)-citramalyl-CoA." [PMID:17259315, RHEA:38279]
 synonym: "L-carnitine dehydratase/bile acid-inducible protein F" RELATED []
 synonym: "succinyl-CoA:(R)-citramalate CoA transferase activity" EXACT []
 synonym: "succinyl-CoA:R-citramalate CoA transferase" EXACT []
@@ -272625,10 +273833,14 @@
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
 
@@ -273385,7 +274597,6 @@
 xref: Reactome:R-HSA-9865893 "MT-CYB is translated"
 xref: Reactome:R-HSA-9866253 "apo-UQCRFS1 binds LYRM7"
 is_a: GO:0003674 ! molecular_function
-relationship: has_part GO:0051082 ! unfolded protein binding
 relationship: part_of GO:0006457 ! protein folding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30552" xsd:anyURI
 created_by: jl
@@ -278831,14 +280042,15 @@
 id: GO:0044684
 name: dihydromethanopterin reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 7,8-dihydromethanopterin + NADPH = 5,6,7,8-tetrahydromethanopterin + NADP." [GOC:mengo_curators, PMID:15028691]
+def: "Catalysis of the reaction: 5,6,7,8-tetrahydromethanopterin + acceptor = 7,8-dihydromethanopterin + reduced acceptor." [PMID:15028691, RHEA:42804]
 xref: EC:1.5.99.15
 xref: RHEA:42804
-is_a: GO:0016646 ! oxidoreductase activity, acting on the CH-NH group of donors, NAD or NADP as acceptor
+is_a: GO:0016645 ! oxidoreductase activity, acting on the CH-NH group of donors
 relationship: part_of GO:2001118 ! tetrahydromethanopterin biosynthetic process
 property_value: skos:exactMatch EC:1.5.99.15
 property_value: skos:exactMatch RHEA:42804
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 created_by: jl
 creation_date: 2012-08-15T13:57:55Z
 
@@ -278889,9 +280101,19 @@
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
 
@@ -280999,11 +282221,12 @@
 id: GO:0045022
 name: early endosome to late endosome transport
 namespace: biological_process
-def: "The directed movement of substances, in membrane-bounded vesicles, from the early sorting endosomes to the late sorting endosomes; transport occurs along microtubules and can be experimentally blocked with microtubule-depolymerizing drugs." [ISBN:0815316194, PMID:29980602]
+def: "The directed movement of substances, in membrane-bounded vesicles, from the early sorting endosomes to the late sorting endosomes." [ISBN:0815316194, PMID:29980602]
 synonym: "endosome maturation" RELATED [PMID:21878991, PMID:29980602]
 is_a: GO:0098927 ! vesicle-mediated transport between endosomal compartments
 relationship: occurs_in GO:0005737 ! cytoplasm
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26386" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31923" xsd:anyURI
 
 [Term]
 id: GO:0045023
@@ -281170,9 +282393,10 @@
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
@@ -281193,18 +282417,16 @@
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
@@ -283622,6 +284844,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 
 [Term]
 id: GO:0045276
@@ -283653,6 +284876,7 @@
 is_a: GO:0070069 ! cytochrome complex
 is_a: GO:0098803 ! respiratory chain complex
 is_a: GO:1902495 ! transmembrane transporter complex
+is_a: GO:1990204 ! oxidoreductase complex
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27727" xsd:anyURI
 
 [Term]
@@ -283964,8 +285188,10 @@
 synonym: "nor-spermidine biosynthesis" EXACT []
 synonym: "nor-spermidine formation" EXACT []
 synonym: "nor-spermidine synthesis" EXACT []
+xref: MetaCyc:PWY-6562
 is_a: GO:0006596 ! polyamine biosynthetic process
 is_a: GO:0046204 ! nor-spermidine metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0045313
@@ -284496,7 +285722,7 @@
 xref: RHEA:61132
 xref: RHEA:61136
 xref: RHEA:61140
-is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
+is_a: GO:0050498 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, with 2-oxoglutarate as one donor, and the other dehydrogenated
 relationship: part_of GO:0051555 ! flavonol biosynthetic process
 property_value: skos:exactMatch EC:1.14.20.6
 property_value: skos:exactMatch RHEA:21088
@@ -284504,6 +285730,7 @@
 property_value: skos:narrowMatch RHEA:61136
 property_value: skos:narrowMatch RHEA:61140
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0045433
@@ -284621,7 +285848,7 @@
 namespace: biological_process
 def: "The regulated release of juvenile hormones, the three sesquiterpenoid derivatives that function to maintain the larval state of insects at molting and that may be required for other processes, e.g. oogenesis." [GOC:curators, ISBN:0198547684]
 is_a: GO:0046865 ! terpenoid transport
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 is_a: GO:0140353 ! lipid export from cell
 
 [Term]
@@ -285563,10 +286790,13 @@
 
 [Term]
 id: GO:0045550
-name: geranylgeranyl reductase activity
+name: obsolete geranylgeranyl reductase activity
 namespace: molecular_function
-def: "Catalysis of the formation of phytyl group from the stepwise reduction of a geranylgeranyl group." [PMID:9492312]
-is_a: GO:0016491 ! oxidoreductase activity
+def: "OBSOLETE. Catalysis of the formation of phytyl group from the stepwise reduction of a geranylgeranyl group." [PMID:9492312]
+comment: This term was obsoleted because it lacked a proper enzyme cross-reference and is equivalent to GO:0102067 'geranylgeranyl diphosphate reductase activity' (EC:1.3.1.83, RHEA:26229), which describes the same reaction (PMID:9492312: reduction of geranylgeranyl diphosphate to phytyl diphosphate, also acting on geranylgeranyl-chlorophyll a).
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31963" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0102067
 
 [Term]
 id: GO:0045551
@@ -291251,7 +292481,7 @@
 synonym: "downregulation of phosphate metabolic process" EXACT []
 synonym: "inhibition of phosphate metabolic process" NARROW []
 synonym: "negative regulation of phosphate metabolism" EXACT []
-is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
+is_a: GO:0009892 ! negative regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0006796 ! phosphate-containing compound metabolic process
 relationship: negatively_regulates GO:0006796 ! phosphate-containing compound metabolic process
@@ -291267,7 +292497,7 @@
 synonym: "up regulation of phosphate metabolic process" EXACT []
 synonym: "up-regulation of phosphate metabolic process" EXACT []
 synonym: "upregulation of phosphate metabolic process" EXACT []
-is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
+is_a: GO:0009893 ! positive regulation of metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0006796 ! phosphate-containing compound metabolic process
 relationship: positively_regulates GO:0006796 ! phosphate-containing compound metabolic process
@@ -291963,8 +293193,8 @@
 synonym: "inhibition of nucleotide metabolic process" NARROW []
 synonym: "negative regulation of nucleotide metabolism" EXACT []
 is_a: GO:0006140 ! regulation of nucleotide metabolic process
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0009117 ! nucleotide metabolic process
@@ -291982,7 +293212,7 @@
 synonym: "up-regulation of nucleotide metabolic process" EXACT []
 synonym: "upregulation of nucleotide metabolic process" EXACT []
 is_a: GO:0006140 ! regulation of nucleotide metabolic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0009117 ! nucleotide metabolic process
@@ -292985,6 +294215,7 @@
 synonym: "dADP degradation" EXACT []
 is_a: GO:0009155 ! purine deoxyribonucleotide catabolic process
 is_a: GO:0009184 ! purine deoxyribonucleoside diphosphate catabolic process
+is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0046056 ! dADP metabolic process
 
 [Term]
@@ -293024,6 +294255,7 @@
 def: "The chemical reactions and pathways involving dATP, deoxyadenosine triphosphate (2'-deoxyadenosine 5'-triphosphate)." [GOC:curators]
 synonym: "dATP metabolism" EXACT []
 is_a: GO:0009151 ! purine deoxyribonucleotide metabolic process
+is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009215 ! purine deoxyribonucleoside triphosphate metabolic process
 
 [Term]
@@ -293035,6 +294267,7 @@
 synonym: "dATP catabolism" EXACT []
 synonym: "dATP degradation" EXACT []
 is_a: GO:0009155 ! purine deoxyribonucleotide catabolic process
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009217 ! purine deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0046060 ! dATP metabolic process
 
@@ -293075,6 +294308,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving dCTP, deoxycytidine triphosphate." [GOC:curators]
 synonym: "dCTP metabolism" EXACT []
+is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009211 ! pyrimidine deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009219 ! pyrimidine deoxyribonucleotide metabolic process
 
@@ -293097,6 +294331,7 @@
 synonym: "dGDP degradation" EXACT []
 is_a: GO:0009155 ! purine deoxyribonucleotide catabolic process
 is_a: GO:0009184 ! purine deoxyribonucleoside diphosphate catabolic process
+is_a: GO:0009192 ! deoxyribonucleoside diphosphate catabolic process
 is_a: GO:0046066 ! dGDP metabolic process
 
 [Term]
@@ -293127,6 +294362,7 @@
 def: "The chemical reactions and pathways involving dGTP, guanosine triphosphate." [GOC:curators]
 synonym: "dGTP metabolism" EXACT []
 is_a: GO:0009151 ! purine deoxyribonucleotide metabolic process
+is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009215 ! purine deoxyribonucleoside triphosphate metabolic process
 
 [Term]
@@ -293139,6 +294375,7 @@
 synonym: "dGTP formation" EXACT []
 synonym: "dGTP synthesis" EXACT []
 is_a: GO:0009153 ! purine deoxyribonucleotide biosynthetic process
+is_a: GO:0009202 ! deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0009216 ! purine deoxyribonucleoside triphosphate biosynthetic process
 is_a: GO:0046070 ! dGTP metabolic process
 
@@ -293178,6 +294415,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving dTTP, deoxyribosylthymine triphosphate." [GOC:curators]
 synonym: "dTTP metabolism" EXACT []
+is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009211 ! pyrimidine deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009219 ! pyrimidine deoxyribonucleotide metabolic process
 
@@ -293189,6 +294427,7 @@
 synonym: "dTTP breakdown" EXACT []
 synonym: "dTTP catabolism" EXACT []
 synonym: "dTTP degradation" EXACT []
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009213 ! pyrimidine deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009223 ! pyrimidine deoxyribonucleotide catabolic process
 is_a: GO:0046075 ! dTTP metabolic process
@@ -293229,6 +294468,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving dUTP, deoxyuridine (5'-)triphosphate." [GOC:curators]
 synonym: "dUTP metabolism" EXACT []
+is_a: GO:0009200 ! deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009211 ! pyrimidine deoxyribonucleoside triphosphate metabolic process
 is_a: GO:0009219 ! pyrimidine deoxyribonucleotide metabolic process
 
@@ -293240,6 +294480,7 @@
 synonym: "dUTP breakdown" EXACT []
 synonym: "dUTP catabolism" EXACT []
 synonym: "dUTP degradation" EXACT []
+is_a: GO:0009204 ! deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009213 ! pyrimidine deoxyribonucleoside triphosphate catabolic process
 is_a: GO:0009223 ! pyrimidine deoxyribonucleotide catabolic process
 is_a: GO:0046080 ! dUTP metabolic process
@@ -294368,28 +295609,34 @@
 synonym: "keto-D-gluconate biosynthesis" EXACT []
 synonym: "keto-D-gluconate formation" EXACT []
 synonym: "keto-D-gluconate synthesis" EXACT []
-is_a: GO:0046180 ! ketogluconate biosynthetic process
+is_a: GO:0046175 ! aldonic acid biosynthetic process
 
 [Term]
 id: GO:0046180
-name: ketogluconate biosynthetic process
+name: obsolete ketogluconate biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of ketogluconate, the anion of ketogluconic acid, an aldonic acid derived from glucose containing a ketonic carbonyl group." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the formation of ketogluconate, the anion of ketogluconic acid, an aldonic acid derived from glucose containing a ketonic carbonyl group." [ISBN:0198506732]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "ketogluconate anabolism" EXACT []
 synonym: "ketogluconate biosynthesis" EXACT []
 synonym: "ketogluconate formation" EXACT []
 synonym: "ketogluconate synthesis" EXACT []
-is_a: GO:0046175 ! aldonic acid biosynthetic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31978" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0046179
 
 [Term]
 id: GO:0046181
-name: ketogluconate catabolic process
+name: obsolete ketogluconate catabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the breakdown of ketogluconate, the anion of ketogluconic acid, an aldonic acid derived from glucose containing a ketonic carbonyl group." [ISBN:0198506732]
+def: "OBSOLETE. The chemical reactions and pathways resulting in the breakdown of ketogluconate, the anion of ketogluconic acid, an aldonic acid derived from glucose containing a ketonic carbonyl group." [ISBN:0198506732]
+comment: This term was obsoleted because it represents an unnecessary grouping term.
 synonym: "ketogluconate breakdown" EXACT []
 synonym: "ketogluconate catabolism" EXACT []
 synonym: "ketogluconate degradation" EXACT []
-is_a: GO:0046176 ! aldonic acid catabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31978" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019524
 
 [Term]
 id: GO:0046182
@@ -294650,6 +295897,10 @@
 synonym: "spermidine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008216 ! spermidine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046204
@@ -294699,6 +295950,10 @@
 synonym: "spermine degradation" EXACT []
 is_a: GO:0006598 ! polyamine catabolic process
 is_a: GO:0008215 ! spermine metabolic process
+property_value: skos:broadMatch MetaCyc:PWY-6117
+property_value: skos:broadMatch MetaCyc:PWY-6440
+property_value: skos:broadMatch MetaCyc:PWY-6441
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31766" xsd:anyURI
 
 [Term]
 id: GO:0046209
@@ -294966,7 +296221,6 @@
 synonym: "2-aminobenzenesulphonate catabolic process" EXACT []
 synonym: "2-aminobenzenesulphonate catabolism" EXACT []
 is_a: GO:0009310 ! amine catabolic process
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
 is_a: GO:0042537 ! benzene-containing compound metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
@@ -295083,7 +296337,7 @@
 synonym: "phthalate degradation" EXACT []
 is_a: GO:0018963 ! phthalate metabolic process
 is_a: GO:0042178 ! xenobiotic catabolic process
-is_a: GO:0046395 ! carboxylic acid catabolic process
+is_a: GO:0043649 ! dicarboxylic acid catabolic process
 
 [Term]
 id: GO:0046240
@@ -295468,8 +296722,8 @@
 synonym: "toluene-4-sulfonate degradation" EXACT []
 synonym: "toluene-4-sulphonate catabolic process" EXACT []
 synonym: "toluene-4-sulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:0072491 ! toluene-containing compound catabolic process
 
 [Term]
@@ -295916,7 +297170,6 @@
 synonym: "alkanesulfonate synthesis" EXACT []
 synonym: "alkanesulphonate biosynthesis" EXACT []
 synonym: "alkanesulphonate biosynthetic process" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044272 ! sulfur compound biosynthetic process
 
@@ -295930,7 +297183,6 @@
 synonym: "alkanesulfonate degradation" EXACT []
 synonym: "alkanesulphonate catabolic process" EXACT []
 synonym: "alkanesulphonate catabolism" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 
@@ -296597,6 +297849,7 @@
 is_a: GO:0016051 ! carbohydrate biosynthetic process
 is_a: GO:0019578 ! aldaric acid biosynthetic process
 is_a: GO:0019580 ! galactarate metabolic process
+is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 
 [Term]
@@ -296912,7 +298165,6 @@
 synonym: "deoxyribose phosphate biosynthesis" EXACT []
 synonym: "deoxyribose phosphate formation" EXACT []
 synonym: "deoxyribose phosphate synthesis" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
 
@@ -296924,7 +298176,6 @@
 synonym: "deoxyribose phosphate breakdown" EXACT []
 synonym: "deoxyribose phosphate catabolism" EXACT []
 synonym: "deoxyribose phosphate degradation" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
 
@@ -296988,6 +298239,7 @@
 is_a: GO:0016052 ! carbohydrate catabolic process
 is_a: GO:0019579 ! aldaric acid catabolic process
 is_a: GO:0019580 ! galactarate metabolic process
+is_a: GO:0043649 ! dicarboxylic acid catabolic process
 property_value: skos:narrowMatch MetaCyc:GALACTARDEG-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-6497
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
@@ -297002,8 +298254,8 @@
 synonym: "carboxylic acid biosynthesis" EXACT []
 synonym: "carboxylic acid formation" EXACT []
 synonym: "carboxylic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 
 [Term]
 id: GO:0046395
@@ -297013,8 +298265,8 @@
 synonym: "carboxylic acid breakdown" EXACT []
 synonym: "carboxylic acid catabolism" EXACT []
 synonym: "carboxylic acid degradation" EXACT []
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0019752 ! carboxylic acid metabolic process
+is_a: GO:0044282 ! small molecule catabolic process
 
 [Term]
 id: GO:0046396
@@ -298044,9 +299296,10 @@
 
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
@@ -298056,9 +299309,8 @@
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
@@ -298239,12 +299491,13 @@
 
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
@@ -300891,18 +302144,15 @@
 
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
 
@@ -303290,7 +304540,6 @@
 name: carboxylic acid transport
 namespace: biological_process
 def: "The directed movement of carboxylic acids into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Carboxylic acids are organic acids containing one or more carboxyl (COOH) groups or anions (COO-)." [GOC:ai]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015849 ! organic acid transport
 
 [Term]
@@ -303381,27 +304630,30 @@
 synonym: "cellular ketone body metabolism" EXACT []
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29021" xsd:anyURI
 is_obsolete: true
-replaced_by: GO:1902224
+consider: GO:0046951
+consider: GO:0046952
 
 [Term]
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
-is_a: GO:1902224 ! ketone body metabolic process
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
@@ -303411,7 +304663,7 @@
 xref: Reactome:R-HSA-77108 "Utilization of Ketone Bodies"
 is_a: GO:0044282 ! small molecule catabolic process
 is_a: GO:1901569 ! fatty acid derivative catabolic process
-is_a: GO:1902224 ! ketone body metabolic process
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
 
 [Term]
 id: GO:0046956
@@ -303534,7 +304786,6 @@
 synonym: "3'-phosphoadenosine 5'-phosphosulphate transport" EXACT []
 synonym: "adenosine 3'-phosphate 5'-phosphosulfate transport" EXACT []
 synonym: "PAPS transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -305295,9 +306546,10 @@
 
 [Term]
 id: GO:0047074
-name: 4-hydroxycatechol 1,2-dioxygenase activity
+name: hydroxyquinol 1,2-dioxygenase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: benzene-1,2,4-triol + O2 = maleylacetate + 2 H+." [RHEA:35595]
+synonym: "4-hydroxycatechol 1,2-dioxygenase activity" EXACT []
 xref: EC:1.13.11.37
 xref: MetaCyc:RXN-10137
 xref: RHEA:35595
@@ -305328,7 +306580,7 @@
 id: GO:0047077
 name: Photinus-luciferin 4-monooxygenase (ATP-hydrolyzing) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: O2 + ATP + Photinus luciferin = light + diphosphate + AMP + CO2 + oxidized Photinus luciferin." [EC:1.13.12.7, MetaCyc:1.13.12.7-RXN]
+def: "Catalysis of the reaction: O2 + ATP + Photinus luciferin = light + diphosphate + AMP + CO2 + oxidized Photinus luciferin." [EC:1.13.12.7]
 synonym: "firefly luciferase activity" RELATED [EC:1.13.12.7]
 synonym: "firefly luciferin luciferase activity" RELATED [EC:1.13.12.7]
 synonym: "luciferase (firefly luciferin)" RELATED [EC:1.13.12.7]
@@ -305407,21 +306659,25 @@
 
 [Term]
 id: GO:0047081
-name: 3-hydroxy-2-methylpyridinecarboxylate dioxygenase activity
+name: 3-hydroxy-2-methylpyridine-5-carboxylate monooxygenase [NAD(P)H] activity
 namespace: molecular_function
-def: "Catalysis of the reaction: O2 + NADPH + H+ + 3-hydroxy-2-methylpyridine-5-carboxylate = NADP+ + 2-(acetamidomethylene)succinate." [EC:1.14.13.242, MetaCyc:1.14.12.4-RXN]
+def: "Catalysis of the reaction: 3-hydroxy-2-methylpyridine-5-carboxylate + NAD(P)H + O2 = 2-(acetamidomethylene)succinate + NAD(P)+." [EC:1.14.13.242]
 synonym: "2-methyl-3-hydroxypyridine 5-carboxylic acid dioxygenase activity" RELATED [EC:1.14.13.242]
 synonym: "3-hydroxy-2-methylpyridine-5-carboxylate,NADPH:oxygen oxidoreductase (decyclizing)" RELATED [EC:1.14.13.242]
+synonym: "3-hydroxy-2-methylpyridinecarboxylate dioxygenase [NAD(P)H] activity" RELATED []
 synonym: "3-hydroxy-3-methylpyridinecarboxylate dioxygenase activity" RELATED [EC:1.14.13.242]
 synonym: "methylhydroxypyridine carboxylate dioxygenase activity" RELATED [EC:1.14.13.242]
 synonym: "methylhydroxypyridinecarboxylate oxidase activity" RELATED [EC:1.14.13.242]
 xref: EC:1.14.13.242
 xref: MetaCyc:1.14.12.4-RXN
+xref: RHEA:10860
 xref: RHEA:10864
-is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
+is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.13.242
-property_value: skos:exactMatch RHEA:10864
+property_value: skos:narrowMatch RHEA:10860
+property_value: skos:narrowMatch RHEA:10864
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0047082
@@ -305435,10 +306691,11 @@
 xref: KEGG_REACTION:R03452
 xref: MetaCyc:RXN-4505
 xref: RHEA:15321
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.93
 property_value: skos:exactMatch RHEA:15321
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047083
@@ -305451,10 +306708,11 @@
 xref: EC:1.14.14.96
 xref: MetaCyc:1.14.13.36-RXN
 xref: RHEA:16265
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.96
 property_value: skos:exactMatch RHEA:16265
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047084
@@ -305468,10 +306726,11 @@
 xref: EC:1.14.14.97
 xref: MetaCyc:1.14.13.37-RXN
 xref: RHEA:23684
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.97
 property_value: skos:exactMatch RHEA:23684
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047085
@@ -305515,10 +306774,11 @@
 xref: KEGG_REACTION:R04699
 xref: MetaCyc:1.14.13.55-RXN
 xref: RHEA:22644
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.98
 property_value: skos:exactMatch RHEA:22644
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047088
@@ -305531,10 +306791,11 @@
 xref: KEGG_REACTION:R04702
 xref: MetaCyc:1.14.13.56-RXN
 xref: RHEA:10528
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.100
 property_value: skos:exactMatch RHEA:10528
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047089
@@ -305547,10 +306808,11 @@
 xref: KEGG_REACTION:R04708
 xref: MetaCyc:1.14.13.57-RXN
 xref: RHEA:10156
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.101
 property_value: skos:exactMatch RHEA:10156
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047090
@@ -305583,7 +306845,6 @@
 xref: KEGG_REACTION:R00448
 xref: MetaCyc:1.14.13.59-RXN
 xref: RHEA:23228
-is_a: GO:0016703 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of one atom of oxygen (internal monooxygenases or internal mixed function oxidases)
 is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.13.59
 property_value: skos:exactMatch RHEA:23228
@@ -305929,10 +307190,11 @@
 xref: EC:1.17.2.3
 xref: MetaCyc:1.2.2.3-RXN
 xref: RHEA:15189
-is_a: GO:0016622 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, cytochrome as acceptor
+is_a: GO:0016725 ! oxidoreductase activity, acting on CH or CH2 groups
 property_value: skos:exactMatch EC:1.17.2.3
 property_value: skos:exactMatch RHEA:15189
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0047112
@@ -306495,7 +307757,6 @@
 xref: Reactome:R-HSA-1482646 "2-acyl LPE is acylated to PE by LPEAT"
 xref: Reactome:R-HSA-1482691 "2-acyl LPS is acylated to PS by LPSAT"
 xref: RHEA:14233
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0042171 ! lysophosphatidic acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.52
 property_value: skos:exactMatch RHEA:14233
@@ -306774,7 +308035,7 @@
 xref: RHEA:37627
 xref: RHEA:37711
 xref: RHEA:37819
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.25
 property_value: skos:exactMatch RHEA:10344
 property_value: skos:narrowMatch RHEA:37627
@@ -306910,7 +308171,7 @@
 xref: RHEA:37755
 xref: RHEA:37759
 xref: RHEA:37763
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.121
 property_value: skos:exactMatch RHEA:16245
 property_value: skos:narrowMatch RHEA:37631
@@ -306930,7 +308191,7 @@
 xref: EC:2.3.1.125
 xref: MetaCyc:2.3.1.125-RXN
 xref: RHEA:21996
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.125
 property_value: skos:exactMatch RHEA:21996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307025,7 +308286,7 @@
 xref: RHEA:55320
 xref: RHEA:56244
 xref: RHEA:56248
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.135
 property_value: skos:exactMatch RHEA:17469
 property_value: skos:narrowMatch RHEA:55320
@@ -307049,7 +308310,6 @@
 xref: KEGG_REACTION:R01944
 xref: MetaCyc:2.3.1.138-RXN
 xref: RHEA:12436
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.138
 property_value: skos:exactMatch RHEA:12436
@@ -307066,7 +308326,7 @@
 xref: EC:2.3.1.141
 xref: MetaCyc:2.3.1.141-RXN
 xref: RHEA:17057
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.141
 property_value: skos:exactMatch RHEA:17057
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307211,30 +308471,62 @@
 xref: Reactome:R-HSA-1482794 "CL and 1-acyl LPC are converted to MLCL and PC by TAZ (IM) (Reversible)"
 xref: RHEA:12937
 xref: RHEA:33359
+xref: RHEA:35983
 xref: RHEA:35987
+xref: RHEA:35991
+xref: RHEA:35995
+xref: RHEA:35999
+xref: RHEA:37383
+xref: RHEA:37387
+xref: RHEA:37391
+xref: RHEA:37395
 xref: RHEA:37475
+xref: RHEA:37479
+xref: RHEA:37483
+xref: RHEA:37487
+xref: RHEA:37511
 xref: RHEA:37515
+xref: RHEA:37519
+xref: RHEA:37527
 xref: RHEA:37559
 xref: RHEA:37563
+xref: RHEA:37655
 xref: RHEA:37703
 xref: RHEA:37707
 xref: RHEA:37803
+xref: RHEA:37843
 xref: RHEA:37855
 xref: RHEA:37859
 xref: RHEA:37863
 xref: RHEA:37867
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.23
 property_value: skos:exactMatch RHEA:12937
 property_value: skos:narrowMatch RHEA:33359
+property_value: skos:narrowMatch RHEA:35983
 property_value: skos:narrowMatch RHEA:35987
+property_value: skos:narrowMatch RHEA:35991
+property_value: skos:narrowMatch RHEA:35995
+property_value: skos:narrowMatch RHEA:35999
+property_value: skos:narrowMatch RHEA:37383
+property_value: skos:narrowMatch RHEA:37387
+property_value: skos:narrowMatch RHEA:37391
+property_value: skos:narrowMatch RHEA:37395
 property_value: skos:narrowMatch RHEA:37475
+property_value: skos:narrowMatch RHEA:37479
+property_value: skos:narrowMatch RHEA:37483
+property_value: skos:narrowMatch RHEA:37487
+property_value: skos:narrowMatch RHEA:37511
 property_value: skos:narrowMatch RHEA:37515
+property_value: skos:narrowMatch RHEA:37519
+property_value: skos:narrowMatch RHEA:37527
 property_value: skos:narrowMatch RHEA:37559
 property_value: skos:narrowMatch RHEA:37563
+property_value: skos:narrowMatch RHEA:37655
 property_value: skos:narrowMatch RHEA:37703
 property_value: skos:narrowMatch RHEA:37707
 property_value: skos:narrowMatch RHEA:37803
+property_value: skos:narrowMatch RHEA:37843
 property_value: skos:narrowMatch RHEA:37855
 property_value: skos:narrowMatch RHEA:37859
 property_value: skos:narrowMatch RHEA:37863
@@ -307357,7 +308649,7 @@
 xref: RHEA:74807
 xref: RHEA:74811
 xref: RHEA:74823
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.62
 property_value: skos:exactMatch RHEA:10332
 property_value: skos:narrowMatch RHEA:74799
@@ -307377,14 +308669,18 @@
 xref: MetaCyc:2.3.1.63-RXN
 xref: RHEA:23992
 xref: RHEA:37715
+xref: RHEA:37747
 xref: RHEA:37783
+xref: RHEA:37787
 xref: RHEA:37811
 xref: RHEA:37839
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.63
 property_value: skos:exactMatch RHEA:23992
 property_value: skos:narrowMatch RHEA:37715
+property_value: skos:narrowMatch RHEA:37747
 property_value: skos:narrowMatch RHEA:37783
+property_value: skos:narrowMatch RHEA:37787
 property_value: skos:narrowMatch RHEA:37811
 property_value: skos:narrowMatch RHEA:37839
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307444,7 +308740,7 @@
 xref: KEGG_REACTION:R04333
 xref: MetaCyc:2.3.1.72-RXN
 xref: RHEA:21180
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.72
 property_value: skos:exactMatch RHEA:21180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307459,7 +308755,7 @@
 xref: EC:2.3.1.73
 xref: MetaCyc:2.3.1.73-RXN
 xref: RHEA:13301
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.73
 property_value: skos:exactMatch RHEA:13301
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -307494,7 +308790,7 @@
 xref: RHEA:81803
 xref: RHEA:81807
 xref: RHEA:81811
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.75
 property_value: skos:exactMatch MetaCyc:2.3.1.75-RXN
 property_value: skos:exactMatch RHEA:38443
@@ -307528,7 +308824,7 @@
 xref: RHEA:16897
 xref: RHEA:78195
 xref: RHEA:78199
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.77
 property_value: skos:exactMatch RHEA:16897
 property_value: skos:narrowMatch RHEA:78195
@@ -307566,7 +308862,7 @@
 xref: KEGG_REACTION:R04227
 xref: MetaCyc:2.3.1.83-RXN
 xref: RHEA:19285
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.83
 property_value: skos:exactMatch RHEA:19285
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -309171,20 +310467,24 @@
 xref: KEGG_REACTION:R04635
 xref: MetaCyc:2.4.99.7-RXN
 xref: Reactome:R-HSA-981809 "ST6GALNAC3/4 transfers sialic acid to the sialyl T antigen to form the disialyl T antigen"
+xref: RHEA:41968
 xref: RHEA:48316
 xref: RHEA:53896
 xref: RHEA:56088
 xref: RHEA:65280
 xref: RHEA:65284
 xref: RHEA:65288
+xref: RHEA:77679
 is_a: GO:0008373 ! sialyltransferase activity
 property_value: skos:exactMatch EC:2.4.3.7
 property_value: skos:exactMatch RHEA:53896
+property_value: skos:narrowMatch RHEA:41968
 property_value: skos:narrowMatch RHEA:48316
 property_value: skos:narrowMatch RHEA:56088
 property_value: skos:narrowMatch RHEA:65280
 property_value: skos:narrowMatch RHEA:65284
 property_value: skos:narrowMatch RHEA:65288
+property_value: skos:narrowMatch RHEA:77679
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -310695,7 +311995,7 @@
 id: GO:0047369
 name: succinate-hydroxymethylglutarate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (S)-3-hydroxy-3-methylglutarate + succinyl-CoA = 3-hydroxy-3-methyl-glutaryl-CoA + succinate." [EC:2.8.3.13, MetaCyc:2.8.3.13-RXN]
+def: "Catalysis of the reaction: 3-hydroxy-3-methylglutarate + succinyl-CoA = (3S)-3-hydroxy-3-methylglutaryl-CoA + succinate." [RHEA:12284]
 synonym: "dicarboxyl-CoA:dicarboxylic acid coenzyme A transferase activity" RELATED [EC:2.8.3.13]
 synonym: "hydroxymethylglutarate coenzyme A-transferase activity" RELATED [EC:2.8.3.13]
 synonym: "succinate:(S)-3-hydroxy-3-methylglutarate CoA-transferase activity" RELATED [EC:2.8.3.13]
@@ -310726,7 +312026,7 @@
 id: GO:0047371
 name: butyrate-acetoacetate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetoacetate + butanoyl-CoA = acetoacetyl-CoA + butanoate." [EC:2.8.3.9, RHEA:12961]
+def: "Catalysis of the reaction: acetoacetate + butanoyl-CoA = acetoacetyl-CoA + butanoate." [RHEA:12961]
 synonym: "butanoyl-CoA:acetoacetate CoA-transferase activity" RELATED [EC:2.8.3.9]
 synonym: "butyryl coenzyme A-acetoacetate coenzyme A-transferase activity" RELATED [EC:2.8.3.9]
 synonym: "butyryl-CoA-acetoacetate CoA-transferase activity" RELATED [EC:2.8.3.9]
@@ -310767,16 +312067,56 @@
 xref: Reactome:R-HSA-426043 "2-AG hydrolysis to arachidonate by MAGL"
 xref: Reactome:R-HSA-5694462 "ABHD6,12 hydrolyse 3AG"
 xref: RHEA:15245
+xref: RHEA:32875
 xref: RHEA:34019
+xref: RHEA:38363
+xref: RHEA:38487
+xref: RHEA:38491
+xref: RHEA:39959
+xref: RHEA:40607
+xref: RHEA:44312
+xref: RHEA:44316
+xref: RHEA:44320
 xref: RHEA:44688
+xref: RHEA:44728
+xref: RHEA:47072
+xref: RHEA:58040
+xref: RHEA:58076
+xref: RHEA:58080
+xref: RHEA:58084
+xref: RHEA:58088
+xref: RHEA:58092
+xref: RHEA:58096
+xref: RHEA:58100
+xref: RHEA:78151
 is_a: GO:0016298 ! lipase activity
 is_a: GO:0052689 ! carboxylic ester hydrolase activity
 property_value: skos:broadMatch EC:3.1.1.79
 property_value: skos:exactMatch EC:3.1.1.23
 property_value: skos:exactMatch MetaCyc:RXN-19280
 property_value: skos:exactMatch RHEA:15245
+property_value: skos:narrowMatch RHEA:32875
 property_value: skos:narrowMatch RHEA:34019
+property_value: skos:narrowMatch RHEA:38363
+property_value: skos:narrowMatch RHEA:38487
+property_value: skos:narrowMatch RHEA:38491
+property_value: skos:narrowMatch RHEA:39959
+property_value: skos:narrowMatch RHEA:40607
+property_value: skos:narrowMatch RHEA:44312
+property_value: skos:narrowMatch RHEA:44316
+property_value: skos:narrowMatch RHEA:44320
 property_value: skos:narrowMatch RHEA:44688
+property_value: skos:narrowMatch RHEA:44728
+property_value: skos:narrowMatch RHEA:47072
+property_value: skos:narrowMatch RHEA:58040
+property_value: skos:narrowMatch RHEA:58076
+property_value: skos:narrowMatch RHEA:58080
+property_value: skos:narrowMatch RHEA:58084
+property_value: skos:narrowMatch RHEA:58088
+property_value: skos:narrowMatch RHEA:58092
+property_value: skos:narrowMatch RHEA:58096
+property_value: skos:narrowMatch RHEA:58100
+property_value: skos:narrowMatch RHEA:78151
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 
 [Term]
@@ -311367,9 +312707,10 @@
 
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
@@ -311377,13 +312718,10 @@
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
@@ -311683,7 +313021,7 @@
 id: GO:0047426
 name: ricinine nitrilase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 	ricinine + 2 H2O = 4-methoxy-1-methyl-2-oxo-1,2-dihydropyridine-3-carboxylate + NH4+." [RHEA:22704]
+def: "Catalysis of the reaction: ricinine + 2 H2O = 4-methoxy-1-methyl-2-oxo-1,2-dihydropyridine-3-carboxylate + NH4+." [RHEA:22704]
 synonym: "ricinine aminohydrolase activity" RELATED [EC:3.5.5.2]
 xref: EC:3.5.5.2
 xref: MetaCyc:3.5.5.2-RXN
@@ -311737,11 +313075,21 @@
 xref: MetaCyc:NUCLEOTIDE-PYROPHOSPHATASE-RXN
 xref: Reactome:R-HSA-9755030 "ITPA dimer dephosphorylates RBV-TP to RBV-MP"
 xref: RHEA:23996
+xref: RHEA:27762
 xref: RHEA:44644
+xref: RHEA:58732
+xref: RHEA:58736
+xref: RHEA:58740
+xref: RHEA:58744
 is_a: GO:0016462 ! pyrophosphatase activity
 property_value: skos:exactMatch EC:3.6.1.9
 property_value: skos:narrowMatch RHEA:23996
+property_value: skos:narrowMatch RHEA:27762
 property_value: skos:narrowMatch RHEA:44644
+property_value: skos:narrowMatch RHEA:58732
+property_value: skos:narrowMatch RHEA:58736
+property_value: skos:narrowMatch RHEA:58740
+property_value: skos:narrowMatch RHEA:58744
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23401" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27991" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -312438,16 +313786,15 @@
 
 [Term]
 id: GO:0047468
-name: phosphoglucomutase (glucose-cofactor) activity
+name: obsolete phosphoglucomutase (glucose-cofactor) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: glucose-1-phosphate = glucose-6-phosphate; using D-glucose as a cofactor." [EC:5.4.2.5]
-synonym: "alpha-D-glucose 1,6-phosphomutase (glucose-cofactor)" RELATED [EC:5.4.2.5]
-synonym: "glucose-1-phosphate phosphotransferase activity" RELATED [EC:5.4.2.5]
+def: "OBSOLETE. Catalysis of the reaction: glucose-1-phosphate = glucose-6-phosphate; using D-glucose as a cofactor." [EC:5.4.2.5]
+comment: The reason for obsoletion is that this activity (EC:5.4.2.5) is not known to be catalyzed by any gene product. RHEA:23536, which is shared between EC:5.4.2.2 and EC:5.4.2.5, actually represents the EC:5.4.2.2 mechanism (alpha-D-glucose 1,6-bisphosphate-dependent) and remains as the exactMatch xref on the parent term GO:0004614 (phosphoglucomutase activity). EC:5.4.2.5 is retained on this obsolete term as the valid external reference.
 xref: EC:5.4.2.5
 xref: MetaCyc:RXN-16999
-is_a: GO:0004614 ! phosphoglucomutase activity
 property_value: skos:exactMatch EC:5.4.2.5
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31927" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0047469
@@ -313502,7 +314849,7 @@
 id: GO:0047533
 name: 2,5-dioxovalerate dehydrogenase (NADP+) activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 2,5-dioxopentanoate + NADP+ + H2O = 2-oxoglutarate + NADPH + H+." [EC:1.2.1.26, MetaCyc:25-DIOXOVALERATE-DEHYDROGENASE-RXN]
+def: "Catalysis of the reaction: 2,5-dioxopentanoate + NADP+ + H2O = 2-oxoglutarate + NADPH + H+." [RHEA:11296]
 synonym: "2,5-dioxopentanoate:NADP+ 5-oxidoreductase activity" RELATED [EC:1.2.1.26]
 synonym: "2-oxoglutarate semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.26]
 synonym: "alpha-ketoglutaric semialdehyde dehydrogenase activity" RELATED [EC:1.2.1.26]
@@ -314164,7 +315511,7 @@
 id: GO:0047569
 name: 3-oxoadipate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: succinyl-CoA + 3-oxoadipate = succinate + 3-oxoadipyl-CoA." [EC:2.8.3.6, MetaCyc:3-OXOADIPATE-COA-TRANSFERASE-RXN]
+def: "Catalysis of the reaction: 3-oxoadipate + succinyl-CoA = 3-oxoadipyl-CoA + succinate." [RHEA:12048]
 synonym: "3-oxoadipate coenzyme A-transferase activity" RELATED [EC:2.8.3.6]
 synonym: "3-oxoadipate succinyl-CoA transferase activity" RELATED [EC:2.8.3.6]
 synonym: "beta-ketoadipate:succinyl-CoA transferase activity" RELATED [EC:2.8.3.6]
@@ -314547,7 +315894,7 @@
 id: GO:0047591
 name: 5-hydroxypentanoate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 5-hydroxypentanoate + acetyl-CoA = 5-hydroxy-pentanoyl-CoA + acetate." [EC:2.8.3.14, RHEA:23496]
+def: "Catalysis of the reaction: 5-hydroxypentanoate + acetyl-CoA = 5-hydroxy-pentanoyl-CoA + acetate." [RHEA:23496]
 synonym: "5-hydroxyvalerate CoA-transferase activity" RELATED [EC:2.8.3.14]
 synonym: "5-hydroxyvalerate coenzyme A transferase activity" RELATED [EC:2.8.3.14]
 synonym: "acetyl-CoA:5-hydroxypentanoate CoA-transferase activity" RELATED [EC:2.8.3.14]
@@ -314605,10 +315952,11 @@
 xref: KEGG_REACTION:R03737
 xref: MetaCyc:6-BETA-HYDROXYHYOSCYAMINE-EPOXIDASE-RXN
 xref: RHEA:12797
-is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
+is_a: GO:0050498 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, with 2-oxoglutarate as one donor, and the other dehydrogenated
 property_value: skos:exactMatch EC:1.14.20.13
 property_value: skos:exactMatch RHEA:12797
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0047595
@@ -315055,12 +316403,22 @@
 xref: RHEA:19293
 xref: RHEA:33747
 xref: RHEA:39847
+xref: RHEA:41079
+xref: RHEA:43308
+xref: RHEA:43316
+xref: RHEA:43328
+xref: RHEA:63328
 is_a: GO:0016301 ! kinase activity
 is_a: GO:0016773 ! phosphotransferase activity, alcohol group as acceptor
 property_value: skos:exactMatch EC:2.7.1.94
 property_value: skos:exactMatch RHEA:19293
 property_value: skos:narrowMatch RHEA:33747
 property_value: skos:narrowMatch RHEA:39847
+property_value: skos:narrowMatch RHEA:41079
+property_value: skos:narrowMatch RHEA:43308
+property_value: skos:narrowMatch RHEA:43316
+property_value: skos:narrowMatch RHEA:43328
+property_value: skos:narrowMatch RHEA:63328
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -315520,6 +316878,8 @@
 xref: MetaCyc:ALKAN-1-OL-DEHYDROGENASE-ACCEPTOR-RXN
 xref: RHEA:14685
 xref: RHEA:17085
+xref: RHEA:27538
+xref: RHEA:27542
 xref: RHEA:33567
 xref: RHEA:33571
 xref: RHEA:48076
@@ -315532,6 +316892,8 @@
 property_value: skos:exactMatch EC:1.1.99.20
 property_value: skos:exactMatch RHEA:14685
 property_value: skos:narrowMatch RHEA:17085
+property_value: skos:narrowMatch RHEA:27538
+property_value: skos:narrowMatch RHEA:27542
 property_value: skos:narrowMatch RHEA:33567
 property_value: skos:narrowMatch RHEA:33571
 property_value: skos:narrowMatch RHEA:48076
@@ -316762,7 +318124,7 @@
 id: GO:0047712
 name: Cypridina-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Cypridina luciferin + O2 = oxidized Cypridina luciferin + CO2 + light." [EC:1.13.12.6, MetaCyc:CYPRIDINA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Cypridina luciferin + O2 = oxidized Cypridina luciferin + CO2 + light." [EC:1.13.12.6]
 synonym: "Cypridina luciferase activity" RELATED [EC:1.13.12.6]
 synonym: "Cypridina-luciferin:oxygen 2-oxidoreductase (decarboxylating)" RELATED [EC:1.13.12.6]
 synonym: "Cypridina-type luciferase activity" RELATED [EC:1.13.12.6]
@@ -317827,7 +319189,7 @@
 id: GO:0047775
 name: citramalate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + citramalate = acetate + (3S)-citramalyl-CoA." [EC:2.8.3.11, MetaCyc:CITRAMALATE-COA-TRANSFERASE-RXN]
+def: "Catalysis of the reaction: citramalate + acetyl-CoA = (3S)-citramalyl-CoA + acetate." [RHEA:17621]
 synonym: "acetyl-CoA:citramalate CoA-transferase activity" RELATED [EC:2.8.3.11]
 xref: EC:2.8.3.11
 xref: MetaCyc:CITRAMALATE-COA-TRANSFERASE-RXN
@@ -318411,6 +319773,7 @@
 xref: RHEA:64748
 xref: RHEA:64752
 xref: RHEA:64756
+xref: RHEA:64760
 is_a: GO:0016846 ! carbon-sulfur lyase activity
 property_value: skos:exactMatch EC:4.4.1.13
 property_value: skos:exactMatch MetaCyc:RXN-6763
@@ -318423,6 +319786,7 @@
 property_value: skos:narrowMatch RHEA:64748
 property_value: skos:narrowMatch RHEA:64752
 property_value: skos:narrowMatch RHEA:64756
+property_value: skos:narrowMatch RHEA:64760
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27410" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27673" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
@@ -319614,7 +320978,7 @@
 xref: EC:2.3.1.123
 xref: MetaCyc:DOLICHOL-O-ACYLTRANSFERASE-RXN
 xref: RHEA:16685
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.123
 property_value: skos:exactMatch RHEA:16685
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -319695,6 +321059,7 @@
 xref: RHEA:65548
 xref: RHEA:65552
 xref: RHEA:65556
+xref: RHEA:77675
 is_a: GO:0004553 ! hydrolase activity, hydrolyzing O-glycosyl compounds
 property_value: skos:exactMatch EC:3.2.1.123
 property_value: skos:exactMatch RHEA:22288
@@ -319703,6 +321068,7 @@
 property_value: skos:narrowMatch RHEA:65548
 property_value: skos:narrowMatch RHEA:65552
 property_value: skos:narrowMatch RHEA:65556
+property_value: skos:narrowMatch RHEA:77675
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
 [Term]
@@ -320105,10 +321471,11 @@
 xref: KEGG_REACTION:R00134
 xref: MetaCyc:FORMATE-DEHYDROGENASE-NADP+-RXN
 xref: RHEA:12000
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0016726 ! oxidoreductase activity, acting on CH or CH2 groups, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.17.1.10
 property_value: skos:exactMatch RHEA:12000
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0047900
@@ -320259,7 +321626,7 @@
 synonym: "mono-beta-D-galactosyldiacylglycerol:mono-beta-D-galactosyldiacylglycerol acyltransferase activity" RELATED [EC:2.3.1.134]
 xref: EC:2.3.1.134
 xref: MetaCyc:GALACTOLIPID-O-ACYLTRANSFERASE-RXN
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.134
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 
@@ -321107,10 +322474,11 @@
 xref: EC:1.14.14.89
 xref: MetaCyc:ISOFLAVONE-2-HYDROXYLASE-RXN
 xref: RHEA:12388
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.89
 property_value: skos:exactMatch RHEA:12388
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0047958
@@ -321178,13 +322546,39 @@
 xref: MetaCyc:GLYCINE-N-ACYLTRANSFERASE-RXN
 xref: Reactome:R-HSA-2534040 "Unknown NAT N-acylates Gly in GNAT1"
 xref: RHEA:19869
+xref: RHEA:49772
+xref: RHEA:49780
 xref: RHEA:49788
+xref: RHEA:49792
+xref: RHEA:51272
+xref: RHEA:51364
+xref: RHEA:51368
+xref: RHEA:51372
+xref: RHEA:58536
+xref: RHEA:64240
 xref: RHEA:64244
+xref: RHEA:64248
+xref: RHEA:64252
+xref: RHEA:64256
+xref: RHEA:64260
 is_a: GO:0140379 ! amino acid acyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.13
 property_value: skos:exactMatch RHEA:19869
+property_value: skos:narrowMatch RHEA:49772
+property_value: skos:narrowMatch RHEA:49780
 property_value: skos:narrowMatch RHEA:49788
+property_value: skos:narrowMatch RHEA:49792
+property_value: skos:narrowMatch RHEA:51272
+property_value: skos:narrowMatch RHEA:51364
+property_value: skos:narrowMatch RHEA:51368
+property_value: skos:narrowMatch RHEA:51372
+property_value: skos:narrowMatch RHEA:58536
+property_value: skos:narrowMatch RHEA:64240
 property_value: skos:narrowMatch RHEA:64244
+property_value: skos:narrowMatch RHEA:64248
+property_value: skos:narrowMatch RHEA:64252
+property_value: skos:narrowMatch RHEA:64256
+property_value: skos:narrowMatch RHEA:64260
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
 
@@ -321824,10 +323218,11 @@
 xref: EC:1.14.14.88
 xref: MetaCyc:RXN-3762
 xref: RHEA:22960
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.88
 property_value: skos:exactMatch RHEA:22960
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0048001
@@ -323861,12 +325256,12 @@
 
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
@@ -323874,7 +325269,6 @@
 namespace: biological_process
 def: "The regulated release of epinephrine by a cell. Epinephrine is a catecholamine hormone secreted by the adrenal medulla and a neurotransmitter, released by certain neurons and active in the central nervous system." [GOC:ef, GOC:jid]
 synonym: "adrenaline secretion" EXACT []
-is_a: GO:0048241 ! epinephrine transport
 is_a: GO:0050432 ! catecholamine secretion
 
 [Term]
@@ -323883,7 +325277,6 @@
 namespace: biological_process
 def: "The regulated release of norepinephrine by a cell. Norepinephrine is a catecholamine and it acts as a hormone and as a neurotransmitter of most of the sympathetic nervous system." [GOC:ef, GOC:jid]
 synonym: "noradrenaline secretion" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0023061 ! signal release
 is_a: GO:0050432 ! catecholamine secretion
 
@@ -330844,9 +332237,19 @@
 xref: EC:1.4.1.5
 xref: MetaCyc:L-AMINO-ACID-DEHYDROGENASE-RXN
 xref: RHEA:10396
+xref: RHEA:32959
+xref: RHEA:37035
+xref: RHEA:37259
+xref: RHEA:47632
+xref: RHEA:65196
 is_a: GO:0016639 ! oxidoreductase activity, acting on the CH-NH2 group of donors, NAD or NADP as acceptor
 property_value: skos:narrowMatch EC:1.4.1.5
 property_value: skos:narrowMatch RHEA:10396
+property_value: skos:narrowMatch RHEA:32959
+property_value: skos:narrowMatch RHEA:37035
+property_value: skos:narrowMatch RHEA:37259
+property_value: skos:narrowMatch RHEA:47632
+property_value: skos:narrowMatch RHEA:65196
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30646" xsd:anyURI
 
@@ -331694,11 +333097,12 @@
 
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
@@ -331869,7 +333273,7 @@
 id: GO:0050078
 name: malonate CoA-transferase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: acetyl-CoA + malonate = acetate + malonyl-CoA." [EC:2.8.3.3, RHEA:18817]
+def: "Catalysis of the reaction: acetyl-CoA + malonate = acetate + malonyl-CoA." [RHEA:18817]
 synonym: "acetyl-CoA:malonate CoA-transferase activity" RELATED [EC:2.8.3.3]
 synonym: "malonate coenzyme A-transferase activity" RELATED [EC:2.8.3.3]
 xref: EC:2.8.3.3
@@ -332884,6 +334288,7 @@
 xref: RHEA:74075
 xref: RHEA:74079
 xref: RHEA:83235
+xref: RHEA:83243
 is_a: GO:0003954 ! NADH dehydrogenase activity
 is_a: GO:0003955 ! NAD(P)H dehydrogenase (quinone) activity
 property_value: skos:exactMatch EC:1.6.5.9
@@ -332894,6 +334299,7 @@
 property_value: skos:narrowMatch RHEA:74075
 property_value: skos:narrowMatch RHEA:74079
 property_value: skos:narrowMatch RHEA:83235
+property_value: skos:narrowMatch RHEA:83243
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25784" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27410" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30272" xsd:anyURI
@@ -334139,6 +335545,7 @@
 xref: EC:1.14.19.77
 xref: MetaCyc:RXN-17732
 xref: RHEA:22956
+xref: RHEA:61956
 xref: RHEA:61960
 xref: RHEA:61964
 xref: RHEA:61968
@@ -334146,6 +335553,7 @@
 is_a: GO:0016717 ! oxidoreductase activity, acting on paired donors, with oxidation of a pair of donors resulting in the reduction of molecular oxygen to two molecules of water
 property_value: skos:exactMatch EC:1.14.19.77
 property_value: skos:exactMatch RHEA:22956
+property_value: skos:narrowMatch RHEA:61956
 property_value: skos:narrowMatch RHEA:61960
 property_value: skos:narrowMatch RHEA:61964
 property_value: skos:narrowMatch RHEA:61968
@@ -334838,7 +336246,7 @@
 id: GO:0050248
 name: Renilla-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Renilla luciferin + O2 = oxidized Renilla luciferin + CO2 + light." [EC:1.13.12.5, MetaCyc:RENILLA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Renilla luciferin + O2 = oxidized Renilla luciferin + CO2 + light." [EC:1.13.12.5]
 synonym: "aequorin activity" NARROW [EC:1.13.12.5]
 synonym: "luciferase (Renilla luciferin)" RELATED [EC:1.13.12.5]
 synonym: "luciferase activity" BROAD [EC:1.13.12.5]
@@ -334901,7 +336309,7 @@
 xref: RHEA:11488
 xref: RHEA:38175
 xref: RHEA:55284
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 relationship: part_of GO:0042572 ! retinol metabolic process
 property_value: skos:exactMatch EC:2.3.1.76
 property_value: skos:exactMatch RHEA:11488
@@ -335593,15 +337001,17 @@
 xref: RHEA:23768
 xref: RHEA:36687
 xref: RHEA:36691
+xref: RHEA:37111
 xref: RHEA:37115
 xref: RHEA:37123
 xref: RHEA:45284
 xref: RHEA:64044
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.24
 property_value: skos:exactMatch RHEA:23768
 property_value: skos:narrowMatch RHEA:36687
 property_value: skos:narrowMatch RHEA:36691
+property_value: skos:narrowMatch RHEA:37111
 property_value: skos:narrowMatch RHEA:37115
 property_value: skos:narrowMatch RHEA:37123
 property_value: skos:narrowMatch RHEA:45284
@@ -335907,7 +337317,7 @@
 id: GO:0050308
 name: sugar-phosphatase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: sugar phosphate + H2O = sugar + phosphate." [EC:3.1.3.23, MetaCyc:SUGAR-PHOSPHATASE-RXN]
+def: "Catalysis of the reaction: sugar phosphate + H2O = sugar + phosphate." [EC:3.1.3.23]
 synonym: "sugar-phosphate phosphatase activity" EXACT []
 synonym: "sugar-phosphate phosphohydrolase activity" EXACT systematic_synonym [EC:3.1.3.23]
 xref: EC:3.1.3.23
@@ -337418,7 +338828,7 @@
 id: GO:0050397
 name: Watasenia-luciferin 2-monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: Watasenia luciferin + O2 = oxidized Watasenia luciferin + CO2 + light." [EC:1.13.12.8, MetaCyc:WATASEMIA-LUCIFERIN-2-MONOOXYGENASE-RXN]
+def: "Catalysis of the reaction: Watasenia luciferin + O2 = oxidized Watasenia luciferin + CO2 + light." [EC:1.13.12.8]
 synonym: "luciferase activity" BROAD [EC:1.13.12.8]
 synonym: "Watasenia-luciferin:oxygen 2-oxidoreductase (decarboxylating)" RELATED [EC:1.13.12.8]
 synonym: "Watasenia-type luciferase activity" RELATED [EC:1.13.12.8]
@@ -338001,8 +339411,9 @@
 name: catecholamine secretion
 namespace: biological_process
 def: "The regulated release of catecholamines by a cell. The catecholamines are a group of physiologically important biogenic amines that possess a catechol (3,4-dihydroxyphenyl) nucleus and are derivatives of 3,4-dihydroxyphenylethylamine." [GOC:ai, GOC:ef]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0032940 ! secretion by cell
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0071705 ! nitrogen compound transport
 
 [Term]
 id: GO:0050433
@@ -340560,10 +341971,11 @@
 xref: KEGG_REACTION:R08889
 xref: MetaCyc:1.13.12.12-RXN
 xref: RHEA:26023
-is_a: GO:0016703 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of one atom of oxygen (internal monooxygenases or internal mixed function oxidases)
+is_a: GO:0016702 ! oxidoreductase activity, acting on single donors with incorporation of molecular oxygen, incorporation of two atoms of oxygen
 property_value: skos:exactMatch EC:1.13.11.67
 property_value: skos:exactMatch RHEA:26023
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0050589
@@ -340577,9 +341989,10 @@
 synonym: "leucocyanidin,2-oxoglutarate:oxygen oxidoreductase activity" RELATED [EC:1.14.20.4]
 xref: EC:1.14.20.4
 xref: MetaCyc:RXN-602
-is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
+is_a: GO:0050498 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, with 2-oxoglutarate as one donor, and the other dehydrogenated
 property_value: skos:exactMatch EC:1.14.20.4
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0050590
@@ -340613,10 +342026,11 @@
 xref: KEGG_REACTION:R05727
 xref: MetaCyc:1.14.13.67-RXN
 xref: RHEA:20149
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.55
 property_value: skos:exactMatch RHEA:20149
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050592
@@ -340634,10 +342048,11 @@
 xref: KEGG_REACTION:R05728
 xref: MetaCyc:1.14.13.68-RXN
 xref: RHEA:18401
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.37
 property_value: skos:exactMatch RHEA:18401
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050593
@@ -340652,10 +342067,11 @@
 xref: KEGG_REACTION:R05732
 xref: MetaCyc:1.14.13.71-RXN
 xref: RHEA:16649
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.102
 property_value: skos:exactMatch RHEA:16649
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050594
@@ -340667,10 +342083,11 @@
 xref: KEGG_REACTION:R05855
 xref: MetaCyc:1.14.13.73-RXN
 xref: RHEA:14133
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.103
 property_value: skos:exactMatch RHEA:14133
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050595
@@ -340695,10 +342112,11 @@
 xref: KEGG_REACTION:R05877
 xref: MetaCyc:1.14.13.75-RXN
 xref: RHEA:17257
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.104
 property_value: skos:exactMatch RHEA:17257
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050597
@@ -340713,10 +342131,11 @@
 xref: KEGG_REACTION:R06309
 xref: MetaCyc:1.14.13.76-RXN
 xref: RHEA:15241
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.105
 property_value: skos:exactMatch RHEA:15241
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050598
@@ -340730,10 +342149,11 @@
 xref: KEGG_REACTION:R06308
 xref: MetaCyc:1.14.13.77-RXN
 xref: RHEA:18949
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.106
 property_value: skos:exactMatch RHEA:18949
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0050599
@@ -340857,18 +342277,20 @@
 
 [Term]
 id: GO:0050607
-name: mycothiol-dependent formaldehyde dehydrogenase activity
+name: S-(hydroxymethyl)mycothiol dehydrogenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: formaldehyde + mycothiol + NAD+ = S-formylmycothiol + NADH + H+." [EC:1.1.1.306]
+def: "Catalysis of the reaction: S-(hydroxymethyl)mycothiol + NAD+ = S-formylmycothiol + NADH + H+." [RHEA:28502]
 synonym: "formaldehyde:NAD+ oxidoreductase (mycothiol-formylating)" EXACT []
+synonym: "mycothiol-dependent formaldehyde dehydrogenase activity" EXACT []
 synonym: "NAD/factor-dependent formaldehyde dehydrogenase activity" RELATED [EC:1.1.1.306]
 xref: EC:1.1.1.306
 xref: MetaCyc:1.2.1.66-RXN
 xref: RHEA:28502
-is_a: GO:0016620 ! oxidoreductase activity, acting on the aldehyde or oxo group of donors, NAD or NADP as acceptor
+is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.306
 property_value: skos:exactMatch RHEA:28502
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0050608
@@ -341011,15 +342433,16 @@
 id: GO:0050616
 name: secologanin synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: loganin + NADPH + H+ + O2 = secologanin + NADP+ + 2 H2O." [EC:1.14.19.62, MetaCyc:1.3.3.9-RXN]
+def: "Catalysis of the reaction: loganin + reduced [NADPH--hemoprotein reductase] + O2 = secologanin + oxidized [NADPH--hemoprotein reductase] + 2 H2O + H+." [RHEA:20585]
 synonym: "loganin:oxygen oxidoreductase (ring-cleaving)" RELATED [EC:1.14.19.62]
 xref: EC:1.14.19.62
 xref: MetaCyc:1.3.3.9-RXN
 xref: RHEA:20585
-is_a: GO:0016634 ! oxidoreductase activity, acting on the CH-CH group of donors, oxygen as acceptor
+is_a: GO:0016717 ! oxidoreductase activity, acting on paired donors, with oxidation of a pair of donors resulting in the reduction of molecular oxygen to two molecules of water
 property_value: skos:exactMatch EC:1.14.19.62
 property_value: skos:exactMatch RHEA:20585
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0050617
@@ -341305,7 +342728,6 @@
 xref: EC:2.3.1.155
 xref: MetaCyc:2.3.1.155-RXN
 xref: RHEA:18161
-is_a: GO:0016408 ! C-acyltransferase activity
 is_a: GO:0019107 ! myristoyltransferase activity
 property_value: skos:exactMatch EC:2.3.1.155
 property_value: skos:exactMatch RHEA:18161
@@ -341425,7 +342847,7 @@
 xref: EC:2.3.1.164
 xref: MetaCyc:2.3.1.164-RXN
 xref: RHEA:20720
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.164
 property_value: skos:exactMatch RHEA:20720
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -342342,7 +343764,6 @@
 name: N-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to a nitrogen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0016410 ! N-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342350,7 +343771,6 @@
 name: O-malonyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a malonyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0016420 ! malonyltransferase activity
 
 [Term]
@@ -342358,7 +343778,6 @@
 name: O-hydroxycinnamoyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a hydroxycinnamoyl group to an oxygen atom on the acceptor molecule." [GOC:ai]
-is_a: GO:0008374 ! O-acyltransferase activity
 is_a: GO:0050734 ! hydroxycinnamoyltransferase activity
 
 [Term]
@@ -343546,8 +344965,8 @@
 synonym: "teichuronic acid biosynthesis" EXACT []
 synonym: "teichuronic acid formation" EXACT []
 synonym: "teichuronic acid synthesis" EXACT []
-is_a: GO:0016053 ! organic acid biosynthetic process
 is_a: GO:0044038 ! cell wall macromolecule biosynthetic process
+is_a: GO:0044283 ! small molecule biosynthetic process
 relationship: part_of GO:0009273 ! peptidoglycan-based cell wall biogenesis
 
 [Term]
@@ -346394,17 +347813,17 @@
 
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
@@ -347431,7 +348850,6 @@
 def: "The chemical reactions and pathways involving glucose 6-phosphate, a monophosphorylated derivative of glucose with the phosphate group attached to C-6." [GOC:ai]
 synonym: "glucose 6-phosphate metabolism" EXACT []
 synonym: "glucose 6-phosphate utilization" RELATED [GOC:mah]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 
@@ -347556,7 +348974,6 @@
 synonym: "xylulose 5-phosphate metabolism" EXACT []
 synonym: "xylulose-5-phosphate metabolic process" EXACT []
 synonym: "xylulose-5-phosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28597" xsd:anyURI
@@ -351145,7 +352562,6 @@
 synonym: "adrenotropin secretion" EXACT []
 synonym: "corticotropic hormone secretion" EXACT []
 is_a: GO:0030072 ! peptide hormone secretion
-is_a: GO:0060986 ! endocrine hormone secretion
 
 [Term]
 id: GO:0051459
@@ -351922,10 +353338,13 @@
 
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
@@ -352850,7 +354269,8 @@
 synonym: "5-hydroxytryptamine uptake" EXACT []
 synonym: "5HT uptake" EXACT []
 synonym: "serotonin import" EXACT [GOC:dph, GOC:tb]
-is_a: GO:0006837 ! serotonin transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0098810 ! neurotransmitter reuptake
 
 [Term]
@@ -352989,7 +354409,6 @@
 synonym: "noradrenaline uptake" EXACT []
 synonym: "norepinephrine import" EXACT [GOC:dph, GOC:tb]
 synonym: "norepinephrine reuptake" EXACT []
-is_a: GO:0015874 ! norepinephrine transport
 is_a: GO:0090493 ! catecholamine uptake
 
 [Term]
@@ -356624,11 +358043,12 @@
 
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
@@ -362902,10 +364322,10 @@
 xref: Reactome:R-HSA-5696131 "AOC1 deaminates Hist"
 xref: RHEA:25625
 is_a: GO:0052597 ! diamine oxidase activity
-property_value: skos:broadMatch EC:1.4.3.22
 property_value: skos:exactMatch RHEA:25625
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31964" xsd:anyURI
 
 [Term]
 id: GO:0052599
@@ -363609,7 +365029,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving alditol phosphates, any phosphorylated polyhydric alcohol derived from the acyclic form of a monosaccharide by reduction of its aldehyde or keto group to an alcoholic group." [PMID:30240188]
 synonym: "alditol phosphate metabolism" EXACT []
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 created_by: ai
@@ -363927,6 +365346,7 @@
 xref: MetaCyc:RXN-11045
 xref: RHEA:20976
 xref: RHEA:26490
+xref: RHEA:50772
 is_a: GO:0016663 ! oxidoreductase activity, acting on other nitrogenous compounds as donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.7.3.1
 property_value: skos:narrowMatch KEGG_REACTION:R00799
@@ -363935,6 +365355,7 @@
 property_value: skos:narrowMatch MetaCyc:RXN-11045
 property_value: skos:narrowMatch RHEA:20976
 property_value: skos:narrowMatch RHEA:26490
+property_value: skos:narrowMatch RHEA:50772
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 creation_date: 2010-10-11T10:50:59Z
 
@@ -364410,15 +365831,18 @@
 
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
 
@@ -364439,7 +365863,6 @@
 synonym: "ergothioneine synthesis" EXACT []
 is_a: GO:0000097 ! sulfur amino acid biosynthetic process
 is_a: GO:0006578 ! amino-acid betaine biosynthetic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052703 ! modified histidine biosynthetic process
 created_by: ai
 creation_date: 2011-08-01T03:56:19Z
@@ -364459,7 +365882,6 @@
 synonym: "ergothioneine degradation" EXACT []
 is_a: GO:0000098 ! sulfur amino acid catabolic process
 is_a: GO:0006579 ! amino-acid betaine catabolic process
-is_a: GO:0052698 ! ergothioneine metabolic process
 is_a: GO:0052702 ! modified histidine catabolic process
 created_by: ai
 creation_date: 2011-08-01T03:56:22Z
@@ -365825,9 +367247,14 @@
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
@@ -366639,7 +368066,6 @@
 xref: Reactome:R-HSA-9927945 "YqjH reduces FeEnt"
 xref: RHEA:28795
 is_a: GO:0000293 ! ferric-chelate reductase activity
-is_a: GO:0016723 ! oxidoreductase activity, acting on metal ions, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.16.1.9
 property_value: skos:exactMatch RHEA:28795
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21029" xsd:anyURI
@@ -367203,9 +368629,41 @@
 xref: MetaCyc:RXN-11731
 xref: RHEA:56588
 xref: RHEA:56592
+xref: RHEA:77395
+xref: RHEA:77399
+xref: RHEA:77403
+xref: RHEA:77407
+xref: RHEA:77411
+xref: RHEA:77415
+xref: RHEA:77419
+xref: RHEA:77423
+xref: RHEA:77471
+xref: RHEA:77479
+xref: RHEA:77483
+xref: RHEA:77487
+xref: RHEA:77491
+xref: RHEA:77523
+xref: RHEA:77527
+xref: RHEA:77531
 is_a: GO:0047606 ! (S)-hydroxynitrile lyase activity
 property_value: skos:narrowMatch RHEA:56588
 property_value: skos:narrowMatch RHEA:56592
+property_value: skos:narrowMatch RHEA:77395
+property_value: skos:narrowMatch RHEA:77399
+property_value: skos:narrowMatch RHEA:77403
+property_value: skos:narrowMatch RHEA:77407
+property_value: skos:narrowMatch RHEA:77411
+property_value: skos:narrowMatch RHEA:77415
+property_value: skos:narrowMatch RHEA:77419
+property_value: skos:narrowMatch RHEA:77423
+property_value: skos:narrowMatch RHEA:77471
+property_value: skos:narrowMatch RHEA:77479
+property_value: skos:narrowMatch RHEA:77483
+property_value: skos:narrowMatch RHEA:77487
+property_value: skos:narrowMatch RHEA:77491
+property_value: skos:narrowMatch RHEA:77523
+property_value: skos:narrowMatch RHEA:77527
+property_value: skos:narrowMatch RHEA:77531
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/16166" xsd:anyURI
 
 [Term]
@@ -369128,7 +370586,7 @@
 xref: MetaCyc:PWY-4281
 xref: MetaCyc:PWY-4981
 is_a: GO:0006560 ! L-proline metabolic process
-is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+is_a: GO:0009084 ! glutamate family amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ORN-AMINOPENTANOATE-CAT-PWY
 property_value: skos:narrowMatch MetaCyc:PROSYN-PWY
 property_value: skos:narrowMatch MetaCyc:PWY-3341
@@ -370861,7 +372319,6 @@
 namespace: cellular_component
 def: "The portion of the plasma membrane surrounding a stereocilium." [GOC:dph, GOC:rph]
 is_a: GO:0032589 ! neuron projection membrane
-relationship: part_of GO:0005622 ! intracellular anatomical structure
 relationship: part_of GO:0032420 ! stereocilium
 
 [Term]
@@ -371861,7 +373318,7 @@
 relationship: has_part GO:0035735 ! intraciliary transport involved in cilium assembly
 relationship: has_part GO:0061512 ! protein localization to cilium
 relationship: has_part GO:0097711 ! ciliary basal body-plasma membrane docking
-relationship: has_part GO:0097712 ! vesicle targeting, trans-Golgi to periciliary membrane compartment
+relationship: has_part GO:0097712 ! trans-Golgi to periciliary membrane compartment transport
 relationship: has_part GO:1905349 ! ciliary transition zone assembly
 
 [Term]
@@ -372211,6 +373668,7 @@
 synonym: "regulation of phosphoinositide dephosphorylation" EXACT []
 is_a: GO:0019216 ! regulation of lipid metabolic process
 is_a: GO:0035303 ! regulation of dephosphorylation
+is_a: GO:0051174 ! regulation of phosphorus metabolic process
 is_a: GO:0060255 ! regulation of macromolecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0046856 ! phosphatidylinositol dephosphorylation
@@ -374749,7 +376207,7 @@
 name: positive regulation of fructose 1,6-bisphosphate metabolic process
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of fructose 1,6-bisphosphate metabolism. Fructose 1,6-bisphosphate metabolism is the chemical reactions and pathways involving fructose 1,6-bisphosphate, also known as FBP. The D enantiomer is a metabolic intermediate in glycolysis and gluconeogenesis." [GOC:BHF, GOC:dph, GOC:tb]
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0030388 ! fructose 1,6-bisphosphate metabolic process
 relationship: positively_regulates GO:0030388 ! fructose 1,6-bisphosphate metabolic process
@@ -376832,9 +378290,9 @@
 name: positive regulation of inositol phosphate biosynthetic process
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of inositol phosphate biosynthesis. Inositol phosphate biosynthetic processes are the chemical reactions and pathways resulting in the formation of an inositol phosphate, 1,2,3,4,5,6-cyclohexanehexol, with one or more phosphate groups attached." [GOC:dph, GOC:tb]
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0010919 ! regulation of inositol phosphate biosynthetic process
 is_a: GO:0045913 ! positive regulation of carbohydrate metabolic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
 is_a: GO:1902932 ! positive regulation of alcohol biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0032958 ! inositol phosphate biosynthetic process
@@ -379779,11 +381237,13 @@
 
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
 
@@ -385846,7 +387306,6 @@
 def: "The controlled release of histamine by a cell, in which the histamine acts as a neurotransmitter." [GOC:dph]
 is_a: GO:0001821 ! histamine secretion
 is_a: GO:0007269 ! neurotransmitter secretion
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: dph
@@ -385946,8 +387405,8 @@
 name: tyramine secretion
 namespace: biological_process
 def: "The regulated release of a tyramine by a cell." [GOC:dph]
+is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0061531 ! primary amine secretion
-is_a: GO:7770032 ! tyramine transport
 created_by: dph
 creation_date: 2013-06-25T09:14:07Z
 
@@ -386327,7 +387786,7 @@
 synonym: "autoinducer-1 synthase" RELATED [GOC:dph]
 xref: EC:2.3.1.184
 xref: RHEA:10096
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.184
 property_value: skos:exactMatch RHEA:10096
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -386688,7 +388147,6 @@
 synonym: "glycerol metabolism to glycerone phosphate" EXACT [GOC:dph]
 synonym: "glycerol to DHAP metabolic process" EXACT [GOC:dph]
 synonym: "glycerol to dihydroxyacetone phosphate metabolic process" EXACT [GOC:dph]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019563 ! glycerol catabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0034308 ! primary alcohol metabolic process
@@ -388141,7 +389599,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the breakdown of 6-sulfoquinovose(1-) resulting in the formation of glycerone phosphate (DHAP) and 3-sulfolactaldehyde (SLA)." [GOC:dph, PMID:24463506]
 is_a: GO:0006081 ! aldehyde metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0019694 ! alkanesulfonate metabolic process
 is_a: GO:0034308 ! primary alcohol metabolic process
@@ -389603,16 +391060,18 @@
 
 [Term]
 id: GO:0061852
-name: retrograde transporter complex, Golgi to ER
+name: retrograde cargo receptor complex, Golgi to ER
 namespace: cellular_component
-def: "Transporter complex that recognises, binds and returns endoplasmic reticulum (ER) resident proteins that have trafficked to Golgi compartments. Targets proteins lacking the HDEL motif recognised by COPI-coated vesicles." [GOC:bhm, PMID:16093310]
+def: "Cargo receptor complex that recognizes, binds and returns endoplasmic reticulum (ER) resident proteins that have trafficked to Golgi compartments. Targets proteins lacking the HDEL motif recognised by COPI-coated vesicles." [GOC:bhm, PMID:16093310]
 comment: An example of this is ERV41 in Saccharomyces cerevisiae (Q04651) in PMID:16093310 (inferred from direct assay).
 synonym: "ERV41-ERV46 retrograde receptor complex" NARROW []
+synonym: "retrograde cargo receptor complex, Golgi to endoplasmic reticulum" EXACT []
 synonym: "retrograde receptor complex, Golgi to endoplasmic reticulum" EXACT []
 synonym: "retrograde receptor complex, Golgi to ER" EXACT []
-synonym: "retrograde transporter complex, Golgi to endoplasmic reticulum" EXACT []
-is_a: GO:1990351 ! transporter complex
+synonym: "retrograde transporter complex, Golgi to ER" BROAD []
+is_a: GO:0062137 ! cargo receptor complex
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24444" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31935" xsd:anyURI
 created_by: dph
 creation_date: 2017-02-28T13:56:56Z
 
@@ -390242,7 +391701,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: propionyl-CoA + lysine in peptide = CoA + N-propionyl-lysine-peptide." [PMID:17267393]
 xref: RHEA:54020
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:54020
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: dph
@@ -391873,7 +393332,6 @@
 def: "Any process that modulates the rate, frequency or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009889 ! regulation of biosynthetic process
 is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0042412 ! taurine biosynthetic process
 relationship: regulates GO:0042412 ! taurine biosynthetic process
@@ -391886,7 +393344,6 @@
 namespace: biological_process
 def: "Any process that activates or increases the frequency, rate or extent of taurine biosynthesis." [GOC:BHF, PMID:18648510, PMID:24911144]
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 is_a: GO:0062089 ! regulation of taurine biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0042412 ! taurine biosynthetic process
@@ -391935,11 +393392,13 @@
 
 [Term]
 id: GO:0062095
-name: endoplasmic reticulum-peroxisome tethering
+name: obsolete endoplasmic reticulum-peroxisome tethering
 namespace: biological_process
-def: "The attachment of an endoplasmic reticulum membrane to a peroxisome via molecular tethers that physically bridge the two membranes and attach them to each other." [PMID:28463579]
-is_a: GO:0060151 ! peroxisome localization
-is_a: GO:0140056 ! organelle localization by membrane tethering
+def: "OBSOLETE. The attachment of an endoplasmic reticulum membrane to a peroxisome via molecular tethers that physically bridge the two membranes and attach them to each other." [PMID:28463579]
+comment: The reason for obsoletion is that this term represents a molecular function rather than a biological process.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31879" xsd:anyURI
+is_obsolete: true
+consider: GO:0160229
 created_by: dph
 creation_date: 2018-11-21T13:28:50Z
 
@@ -392017,11 +393476,13 @@
 xref: Reactome:R-HSA-9631355 "ASPH:Fe2+ hydroxylates an aspartate residue of F9"
 xref: RHEA:11508
 xref: RHEA:54276
+xref: RHEA:54280
 is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch EC:1.14.11.16
 property_value: skos:exactMatch RHEA:11508
 property_value: skos:narrowMatch RHEA:54276
+property_value: skos:narrowMatch RHEA:54280
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17842" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: dph
@@ -392051,18 +393512,38 @@
 name: RNA 2'-O-methyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: S-adenosyl-L-methionine + RNA = S-adenosyl-L-homocysteine + RNA containing 2'-O-methylribonucleotide." [PMID:30626973, RHEA:58956]
+xref: RHEA:24140
 xref: RHEA:42724
+xref: RHEA:42788
+xref: RHEA:42924
+xref: RHEA:43200
+xref: RHEA:43204
+xref: RHEA:47756
+xref: RHEA:47768
+xref: RHEA:47772
+xref: RHEA:47776
 xref: RHEA:48628
 xref: RHEA:56884
 xref: RHEA:58956
 xref: RHEA:65380
+xref: RHEA:73759
 is_a: GO:0008171 ! O-methyltransferase activity
 is_a: GO:0008173 ! RNA methyltransferase activity
 property_value: skos:exactMatch RHEA:58956
+property_value: skos:narrowMatch RHEA:24140
 property_value: skos:narrowMatch RHEA:42724
+property_value: skos:narrowMatch RHEA:42788
+property_value: skos:narrowMatch RHEA:42924
+property_value: skos:narrowMatch RHEA:43200
+property_value: skos:narrowMatch RHEA:43204
+property_value: skos:narrowMatch RHEA:47756
+property_value: skos:narrowMatch RHEA:47768
+property_value: skos:narrowMatch RHEA:47772
+property_value: skos:narrowMatch RHEA:47776
 property_value: skos:narrowMatch RHEA:48628
 property_value: skos:narrowMatch RHEA:56884
 property_value: skos:narrowMatch RHEA:65380
+property_value: skos:narrowMatch RHEA:73759
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: dph
 creation_date: 2019-01-23T14:23:00Z
@@ -392305,7 +393786,7 @@
 id: GO:0062131
 name: 3-butenylglucosinolate 2-hydroxylase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: gluconapin + a reduced electron acceptor + O2 = xi-progoitrin + an oxidized electron acceptor + H2O." [PMID:18945935]
+def: "Catalysis of the reaction: gluconapin + a reduced electron acceptor + O2 = progoitrin + an oxidized electron acceptor + H2O." [PMID:18945935, RHEA:60628]
 synonym: "But-3-enyl Glucosinolate-2-hydroxylase activity" EXACT []
 xref: MetaCyc:RXNQT-4343
 xref: RHEA:60628
@@ -393728,12 +395209,14 @@
 
 [Term]
 id: GO:0070007
-name: obsolete glutamic-type endopeptidase activity
+name: glutamic-type endopeptidase activity
 namespace: molecular_function
-def: "OBSOLETE. Catalysis of the hydrolysis of internal peptide bonds in a polypeptide chain by a mechanism involving a glutamate/glutamine catalytic dyad." [GOC:mah, https://www.ebi.ac.uk/merops/about/glossary.shtml#CATTYPE, https://www.ebi.ac.uk/merops/about/glossary.shtml#ENDOPEPTIDASE]
-comment: This term was obsoleted because it represents a specific substrate.
+def: "Catalysis of the hydrolysis of internal peptide bonds in a polypeptide chain by a mechanism involving a glutamate/glutamine catalytic dyad." [GOC:mah, https://www.ebi.ac.uk/merops/about/glossary.shtml#CATTYPE, https://www.ebi.ac.uk/merops/about/glossary.shtml#ENDOPEPTIDASE]
+comment: Unobsoleted, since similar terms exist.
+is_a: GO:0004175 ! endopeptidase activity
+is_a: GO:0070002 ! glutamic-type peptidase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31581" xsd:anyURI
-is_obsolete: true
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31893" xsd:anyURI
 
 [Term]
 id: GO:0070008
@@ -395081,7 +396564,7 @@
 id: GO:0070147
 name: mitochondrial cysteinyl-tRNA aminoacylation
 namespace: biological_process
-def: "The process of coupling cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
+def: "The process of coupling L-cysteine to cysteinyl-tRNA in a mitochondrion, catalyzed by cysteinyl-tRNA synthetase. In tRNA aminoacylation, the amino acid is first activated by linkage to AMP and then transferred to either the 2'- or the 3'-hydroxyl group of the 3'-adenosine residue of the tRNA." [GOC:mah, GOC:mcc]
 is_a: GO:0006423 ! cysteinyl-tRNA aminoacylation
 is_a: GO:0070127 ! tRNA aminoacylation for mitochondrial protein translation
 intersection_of: GO:0006423 ! cysteinyl-tRNA aminoacylation
@@ -395231,7 +396714,7 @@
 namespace: biological_process
 def: "The regulated release of adiponectin, a protein hormone, by adipose tissue." [GOC:BHF, GOC:rl]
 is_a: GO:0009306 ! protein secretion
-is_a: GO:0060986 ! endocrine hormone secretion
+is_a: GO:0046879 ! hormone secretion
 
 [Term]
 id: GO:0070163
@@ -395508,14 +396991,16 @@
 
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
@@ -395854,30 +397339,34 @@
 id: GO:0070221
 name: sulfide oxidation, using sulfide:quinone oxidoreductase
 namespace: biological_process
-def: "A sulfide oxidation process that proceeds via the reaction catalyzed by sulfide:quinone oxidoreductase." [MetaCyc:P222-PWY]
-synonym: "sulfide oxidation, using sulfide-quinone reductase" EXACT [GOC:mah, MetaCyc:P222-PWY]
+def: "A sulfide oxidation process that proceeds via the reaction catalyzed by sulfide:quinone oxidoreductase." [GOC:ew]
+synonym: "sulfide oxidation, using sulfide-quinone reductase" EXACT [GOC:mah]
 synonym: "sulphide oxidation, using sulfide:quinone oxidoreductase" EXACT [GOC:mah]
-xref: MetaCyc:P222-PWY
 xref: Reactome:R-HSA-1614517 "Sulfide oxidation to sulfate"
 is_a: GO:0019418 ! sulfide oxidation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31842" xsd:anyURI
 
 [Term]
 id: GO:0070222
-name: sulfide oxidation, using sulfide dehydrogenase
+name: obsolete sulfide oxidation, using sulfide dehydrogenase
 namespace: biological_process
-def: "A sulfide oxidation process that proceeds via the reaction catalyzed by sulfide dehydrogenase." [MetaCyc:PWY-5274]
+def: "OBSOLETE. A sulfide oxidation process that proceeds via the reaction catalyzed by sulfide dehydrogenase." [GOC:ew]
+comment: The reason for obsoletion is that these terms represent a GO-CAM model.
 synonym: "sulphide oxidation, using sulfide dehydrogenase" EXACT [GOC:mah]
-xref: MetaCyc:PWY-5274
-is_a: GO:0019418 ! sulfide oxidation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31842" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019418
 
 [Term]
 id: GO:0070223
-name: sulfide oxidation, using sulfur dioxygenase
+name: obsolete sulfide oxidation, using sulfur dioxygenase
 namespace: biological_process
-def: "A sulfide oxidation process that proceeds via the reaction catalyzed by sulfur dioxygenase." [MetaCyc:PWY-5285]
+def: "OBSOLETE. A sulfide oxidation process that proceeds via the reaction catalyzed by sulfur dioxygenase." [GOC:ew]
+comment: The reason for obsoletion is that these terms represent a GO-CAM model.
 synonym: "sulphide oxidation, using sulfur dioxygenase" EXACT [GOC:mah]
-xref: MetaCyc:PWY-5285
-is_a: GO:0019418 ! sulfide oxidation
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31842" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0019418
 
 [Term]
 id: GO:0070224
@@ -396688,10 +398177,13 @@
 xref: MetaCyc:RXN-12116
 xref: Reactome:R-HSA-2466831 "A2PE hydrolyses to A2E"
 xref: RHEA:33159
+xref: RHEA:45528
 xref: RHEA:45532
 xref: RHEA:45536
+xref: RHEA:45540
 xref: RHEA:45552
 xref: RHEA:45556
+xref: RHEA:45596
 xref: RHEA:45608
 xref: RHEA:45612
 xref: RHEA:45616
@@ -396701,10 +398193,13 @@
 is_a: GO:0004630 ! D-type glycerophospholipase activity
 property_value: skos:exactMatch EC:3.1.4.54
 property_value: skos:exactMatch RHEA:33159
+property_value: skos:narrowMatch RHEA:45528
 property_value: skos:narrowMatch RHEA:45532
 property_value: skos:narrowMatch RHEA:45536
+property_value: skos:narrowMatch RHEA:45540
 property_value: skos:narrowMatch RHEA:45552
 property_value: skos:narrowMatch RHEA:45556
+property_value: skos:narrowMatch RHEA:45596
 property_value: skos:narrowMatch RHEA:45608
 property_value: skos:narrowMatch RHEA:45612
 property_value: skos:narrowMatch RHEA:45616
@@ -397980,7 +399475,6 @@
 def: "The chemical reactions and pathways involving carbamoyl phosphate, an intermediate in the urea cycle and other nitrogen compound metabolic pathways." [CHEBI:17672, GOC:mah, GOC:rph]
 synonym: "carbamoyl phosphate metabolism" EXACT [GOC:mah]
 xref: UM-BBD_pathwayID:bzn
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 
 [Term]
@@ -400361,7 +401855,7 @@
 synonym: "negative regulation of thiamine diphosphate formation" EXACT [GOC:mah]
 synonym: "negative regulation of thiamine diphosphate synthesis" EXACT [GOC:mah]
 is_a: GO:0009890 ! negative regulation of biosynthetic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0046137 ! negative regulation of vitamin metabolic process
 is_a: GO:0070616 ! regulation of thiamine diphosphate biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
@@ -401051,7 +402545,7 @@
 id: GO:0070675
 name: hypoxanthine oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: hypoxanthine + H2O + O2 = xanthine + H2O2." [GOC:mah, GOC:pde]
+def: "Catalysis of the reaction: hypoxanthine + H2O + O2 = xanthine + H2O2." [RHEA:68012]
 synonym: "hypoxanthine-xanthine oxidase activity" BROAD [EC:1.17.3.2]
 synonym: "hypoxanthine:O2 oxidoreductase activity" RELATED [EC:1.17.3.2]
 synonym: "hypoxanthine:oxygen oxidoreductase activity" RELATED [EC:1.17.3.2]
@@ -401059,7 +402553,11 @@
 synonym: "Schardinger enzyme activity" RELATED [EC:1.17.3.2]
 synonym: "xanthine oxidoreductase activity" BROAD [EC:1.17.3.2]
 xref: Reactome:R-HSA-74247 "XDH oxidizes hypoxanthine to form xanthine"
+xref: RHEA:68012
 is_a: GO:0016727 ! oxidoreductase activity, acting on CH or CH2 groups, oxygen as acceptor
+property_value: skos:broadMatch EC:1.17.3.2
+property_value: skos:exactMatch RHEA:68012
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31962" xsd:anyURI
 created_by: mah
 creation_date: 2009-05-29T01:12:55Z
 
@@ -401481,7 +402979,7 @@
 name: sodium-dependent organic cation transport
 namespace: biological_process
 def: "The directed, sodium-dependent, movement of organic cations into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:BHF, GOC:mah]
-is_a: GO:0015695 ! organic cation transport
+is_a: GO:0055085 ! transmembrane transport
 created_by: mah
 creation_date: 2009-06-09T03:26:27Z
 
@@ -401639,7 +403137,6 @@
 namespace: biological_process
 def: "The directed movement of cyclic AMP (cAMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic AMP transport" EXACT [GOC:mah]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -401653,7 +403150,6 @@
 def: "The directed movement of cyclic GMP (cGMP), into, out of or within a cell." [GOC:mah, ISBN:0198506732]
 synonym: "cyclic GMP transport" EXACT [GOC:mah]
 is_a: GO:0001408 ! guanine nucleotide transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
 created_by: mah
@@ -402628,7 +404124,6 @@
 namespace: biological_process
 def: "The process in which glycerol-2-phosphate is transported across a membrane. Glycerol-2-phosphate is a phosphoric monoester of glycerol." [GOC:mah]
 synonym: "glycerol-2-phosphate transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015748 ! organophosphate ester transport
 is_a: GO:0055085 ! transmembrane transport
 is_a: GO:1901264 ! carbohydrate derivative transport
@@ -402717,26 +404212,35 @@
 id: GO:0070818
 name: protoporphyrinogen oxidase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: protoporphyrinogen IX + acceptor = protoporphyrin IX + reduced acceptor." [GOC:mah, PMID:19583219]
+def: "Catalysis of the reaction: protoporphyrinogen IX + 3 acceptor = protoporphyrin IX + 3 reduced acceptor." [PMID:19583219, RHEA:62000]
 synonym: "protoporphyrinogen IX oxidase activity" RELATED [EC:1.3.3.4]
 synonym: "protoporphyrinogen-IX oxidase activity" RELATED [EC:1.3.3.4]
 synonym: "protoporphyrinogenase activity" RELATED [EC:1.3.3.4]
+xref: RHEA:62000
 is_a: GO:0016627 ! oxidoreductase activity, acting on the CH-CH group of donors
+property_value: skos:exactMatch RHEA:62000
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28776" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31965" xsd:anyURI
 created_by: mah
 creation_date: 2009-07-20T02:41:12Z
 
 [Term]
 id: GO:0070819
-name: menaquinone-dependent protoporphyrinogen oxidase activity
+name: protoporphyrinogen oxidase activity, quinone as acceptor
 namespace: molecular_function
-def: "Catalysis of the reaction: protoporphyrinogen IX + menaquinone = protoporphyrin IX + reduced menaquinone." [GOC:mah, PMID:19583219]
-synonym: "protoporphyrinogen-IX:menaquinone oxidoreductase activity" EXACT [GOC:mah]
+def: "Catalysis of the reaction: protoporphyrinogen IX + 3 a quinone = protoporphyrin IX + 3 a quinol." [PMID:19583219, RHEA:65032]
+synonym: "menaquinone-dependent protoporphyrinogen oxidase activity" NARROW []
+synonym: "protoporphyrinogen-IX:menaquinone oxidoreductase activity" NARROW [GOC:mah]
+synonym: "quinone-dependent protoporphyrinogen oxidase activity" EXACT []
+xref: EC:1.3.5.3
+xref: RHEA:65032
 is_a: GO:0016635 ! oxidoreductase activity, acting on the CH-CH group of donors, quinone or related compound as acceptor
 is_a: GO:0070818 ! protoporphyrinogen oxidase activity
-property_value: skos:broadMatch EC:1.3.3.4
+property_value: skos:exactMatch EC:1.3.5.3
+property_value: skos:exactMatch RHEA:65032
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24056" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28520" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31965" xsd:anyURI
 created_by: mah
 creation_date: 2009-07-20T02:46:06Z
 
@@ -402932,7 +404436,6 @@
 namespace: biological_process
 def: "The directed movement of dehydroascorbate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Dehydroascorbate, 5-(1,2-dihydroxyethyl)furan-2,3,4(5H)-trione, is an oxidized form of vitamin C." [GOC:sl]
 synonym: "dehydroascorbate transport" EXACT [GOC:sl]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0051180 ! vitamin transport
 created_by: mah
 creation_date: 2009-07-30T05:24:31Z
@@ -403279,6 +404782,8 @@
 intersection_of: GO:0098590 ! plasma membrane region
 intersection_of: part_of GO:0043332 ! mating projection tip
 relationship: part_of GO:0043332 ! mating projection tip
+relationship: part_of GO:0070250 ! mating projection membrane
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31775" xsd:anyURI
 created_by: mah
 creation_date: 2009-08-19T04:05:58Z
 
@@ -403749,7 +405254,6 @@
 synonym: "aspartate-alanine antiporter activity" EXACT [GOC:mah]
 synonym: "aspartate/alanine antiporter activity" EXACT [GOC:mah]
 xref: RHEA:33139
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 is_a: GO:0022858 ! alanine transmembrane transporter activity
@@ -403793,6 +405297,7 @@
 synonym: "glutamate-gamma-aminobutyric acid antiporter activity" EXACT [GOC:mah]
 synonym: "glutamate/gamma-aminobutyric acid antiporter activity" EXACT [GOC:mah]
 synonym: "glutamate: GABA antiporter activity" EXACT [GOC:dh]
+is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015185 ! gamma-aminobutyric acid transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
 is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
@@ -410713,7 +412218,6 @@
 intersection_of: GO:0000165 ! MAPK cascade
 intersection_of: part_of GO:0000747 ! conjugation with cellular fusion
 relationship: part_of GO:0000747 ! conjugation with cellular fusion
-relationship: part_of GO:0000750 ! pheromone-dependent signal transduction involved in conjugation with cellular fusion
 created_by: mah
 creation_date: 2010-01-05T01:43:47Z
 
@@ -414312,7 +415816,7 @@
 namespace: biological_process
 def: "The aggregation, arrangement and bonding together of a set of components to form a podosome, an actin-rich adhesion structure characterized by formation upon cell substrate contact and localization at the substrate-attached part of the cell." [GOC:mah, GOC:sl]
 is_a: GO:0065003 ! protein-containing complex assembly
-is_a: GO:0140694 ! membraneless organelle assembly
+is_a: GO:0120031 ! plasma membrane bounded cell projection assembly
 created_by: mah
 creation_date: 2010-09-03T11:00:45Z
 
@@ -414323,7 +415827,7 @@
 def: "Any process that modulates the frequency, rate or extent of podosome assembly." [GOC:mah, GOC:sl]
 comment: Note that the assembly is regulated by several small GTPases of the Rab and Rho families.
 is_a: GO:0043254 ! regulation of protein-containing complex assembly
-is_a: GO:1902115 ! regulation of organelle assembly
+is_a: GO:0120032 ! regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0071800 ! podosome assembly
 relationship: regulates GO:0071800 ! podosome assembly
@@ -414341,7 +415845,7 @@
 synonym: "inhibition of podosome assembly" NARROW [GOC:mah]
 is_a: GO:0031333 ! negative regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902116 ! negative regulation of organelle assembly
+is_a: GO:0120033 ! negative regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0071800 ! podosome assembly
 relationship: negatively_regulates GO:0071800 ! podosome assembly
@@ -414360,7 +415864,7 @@
 synonym: "upregulation of podosome assembly" EXACT [GOC:mah]
 is_a: GO:0031334 ! positive regulation of protein-containing complex assembly
 is_a: GO:0071801 ! regulation of podosome assembly
-is_a: GO:1902117 ! positive regulation of organelle assembly
+is_a: GO:0120034 ! positive regulation of plasma membrane bounded cell projection assembly
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0071800 ! podosome assembly
 relationship: positively_regulates GO:0071800 ! podosome assembly
@@ -416412,7 +417916,6 @@
 namespace: biological_process
 def: "The directed movement of a phytochelatin into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore. Phytochelatins are a group of peptides that bind metals (Cd, Zn, Cu, Pb, Hg) in thiolate coordination complexes." [GOC:mah, ISBN:0198506732]
 synonym: "cadystin transport" RELATED [GOC:vw, Wikipedia:Phytochelatin#History]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: mah
 creation_date: 2010-10-25T01:57:55Z
@@ -419980,6 +421483,8 @@
 synonym: "clathrin-coat uncoating" EXACT [GOC:rb]
 synonym: "clathrin-coated vesicle uncoating" EXACT [GOC:mah]
 is_a: GO:0072319 ! vesicle uncoating
+relationship: part_of GO:0072583 ! clathrin-dependent endocytosis
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31981" xsd:anyURI
 created_by: mah
 creation_date: 2010-10-26T12:03:37Z
 
@@ -420147,7 +421652,6 @@
 comment: Note that this term is not intended for use in annotating lateral movement within membranes.
 synonym: "UDP-galactose membrane transport" EXACT []
 synonym: "UDP-galactose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: mah
 creation_date: 2010-11-03T02:03:36Z
@@ -428106,7 +429610,15 @@
 xref: EC:4.2.1.119
 xref: MetaCyc:RXN-7699
 xref: RHEA:26526
+xref: RHEA:39155
+xref: RHEA:39159
+xref: RHEA:39175
+xref: RHEA:39187
+xref: RHEA:39247
+xref: RHEA:39259
 xref: RHEA:39303
+xref: RHEA:39315
+xref: RHEA:39327
 xref: RHEA:39343
 xref: RHEA:39351
 xref: RHEA:39363
@@ -428116,6 +429628,8 @@
 xref: RHEA:39411
 xref: RHEA:39423
 xref: RHEA:39439
+xref: RHEA:39451
+xref: RHEA:39463
 xref: RHEA:39475
 xref: RHEA:39487
 xref: RHEA:39499
@@ -428132,10 +429646,12 @@
 xref: RHEA:39639
 xref: RHEA:39687
 xref: RHEA:39699
+xref: RHEA:44024
 xref: RHEA:46720
 xref: RHEA:67216
 xref: RHEA:67228
 xref: RHEA:72575
+xref: RHEA:78643
 xref: RHEA:78863
 xref: RHEA:78867
 xref: RHEA:78931
@@ -428143,7 +429659,15 @@
 property_value: skos:exactMatch EC:4.2.1.119
 property_value: skos:exactMatch MetaCyc:RXN-7699
 property_value: skos:exactMatch RHEA:26526
+property_value: skos:narrowMatch RHEA:39155
+property_value: skos:narrowMatch RHEA:39159
+property_value: skos:narrowMatch RHEA:39175
+property_value: skos:narrowMatch RHEA:39187
+property_value: skos:narrowMatch RHEA:39247
+property_value: skos:narrowMatch RHEA:39259
 property_value: skos:narrowMatch RHEA:39303
+property_value: skos:narrowMatch RHEA:39315
+property_value: skos:narrowMatch RHEA:39327
 property_value: skos:narrowMatch RHEA:39343
 property_value: skos:narrowMatch RHEA:39351
 property_value: skos:narrowMatch RHEA:39363
@@ -428153,6 +429677,8 @@
 property_value: skos:narrowMatch RHEA:39411
 property_value: skos:narrowMatch RHEA:39423
 property_value: skos:narrowMatch RHEA:39439
+property_value: skos:narrowMatch RHEA:39451
+property_value: skos:narrowMatch RHEA:39463
 property_value: skos:narrowMatch RHEA:39475
 property_value: skos:narrowMatch RHEA:39487
 property_value: skos:narrowMatch RHEA:39499
@@ -428169,10 +429695,12 @@
 property_value: skos:narrowMatch RHEA:39639
 property_value: skos:narrowMatch RHEA:39687
 property_value: skos:narrowMatch RHEA:39699
+property_value: skos:narrowMatch RHEA:44024
 property_value: skos:narrowMatch RHEA:46720
 property_value: skos:narrowMatch RHEA:67216
 property_value: skos:narrowMatch RHEA:67228
 property_value: skos:narrowMatch RHEA:72575
+property_value: skos:narrowMatch RHEA:78643
 property_value: skos:narrowMatch RHEA:78863
 property_value: skos:narrowMatch RHEA:78867
 property_value: skos:narrowMatch RHEA:78931
@@ -428671,7 +430199,7 @@
 name: spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:28Z
 
@@ -428680,7 +430208,7 @@
 name: spermidine:coumaroyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a coumaroyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:16:59Z
 
@@ -428689,7 +430217,7 @@
 name: spermidine:caffeoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a caffeoyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:23Z
 
@@ -428698,7 +430226,7 @@
 name: spermidine:feruloyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a feruloyl group to a nitrogen atom on the spermidine molecule." [PMID:19077165]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-13T04:17:50Z
 
@@ -428819,7 +430347,7 @@
 name: sinapoyl spermidine:sinapoyl CoA N-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the transfer of a sinapoyl group to a nitrogen atom on a sinapoyl spermidine molecule resulting in the formation of a disinapoyl spermidine derivative." [PMID:19168716]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-22T03:27:55Z
 
@@ -428891,7 +430419,7 @@
 name: phosphatidylethanolamine-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidylethanolamine + a sterol = a sterol ester + a lysophosphatidylethanolamine." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:39:33Z
 
@@ -428900,7 +430428,7 @@
 name: phosphatidate-sterol O-acyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: a phosphatidate + a sterol = a sterol ester + a lysophosphatidate." [PMID:16020547]
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: dhl
 creation_date: 2009-04-23T03:41:42Z
 
@@ -429183,8 +430711,6 @@
 namespace: biological_process
 def: "The directed movement of AMP, adenosine monophosphate, into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [PMID:18923018]
 synonym: "adenosine monophosphate transport" EXACT []
-is_a: GO:0015695 ! organic cation transport
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 created_by: dhl
@@ -429478,7 +431004,7 @@
 id: GO:0080145
 name: intracellular cysteine homeostasis
 namespace: biological_process
-def: "A homeostatic process involved in the maintenance of a steady state level of cysteine within a cell." [PMID:19955263]
+def: "A homeostatic process involved in the maintenance of a steady state level of L-cysteine within a cell." [PMID:19955263]
 synonym: "cellular cysteine homeostasis" EXACT []
 synonym: "cysteine homeostasis" EXACT []
 is_a: GO:0080144 ! intracellular amino acid homeostasis
@@ -431835,7 +433361,6 @@
 name: L-histidine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-histidine across a membrane." [PMID:21307582]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -432249,19 +433774,19 @@
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
 
@@ -437284,7 +438809,7 @@
 def: "Catalysis of the reaction: an acyl-CoA + sn-glycerol 3-phosphate = CoA + a 2-acyl-sn-glycerol 3-phosphate." [RHEA:33559]
 xref: EC:2.3.1.198
 xref: RHEA:33559
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.198
 property_value: skos:exactMatch RHEA:33559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -437680,7 +439205,8 @@
 name: catecholamine uptake
 namespace: biological_process
 def: "The directed movement of catecholamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0051937 ! catecholamine transport
+is_a: GO:0015850 ! organic hydroxy compound transport
+is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2012-10-17T11:06:17Z
 
@@ -437689,7 +439215,6 @@
 name: dopamine uptake
 namespace: biological_process
 def: "The directed movement of dopamine into a cell." [GOC:dph, GOC:tb]
-is_a: GO:0015872 ! dopamine transport
 is_a: GO:0090493 ! catecholamine uptake
 created_by: tb
 creation_date: 2012-10-17T11:12:09Z
@@ -440792,16 +442317,15 @@
 
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
 
@@ -440820,7 +442344,7 @@
 xref: MetaCyc:GLUTSYNIII-PWY
 xref: MetaCyc:PWY-4341
 is_a: GO:0006536 ! glutamate metabolic process
-is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+is_a: GO:0009084 ! glutamate family amino acid biosynthetic process
 is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
 property_value: skos:broadMatch MetaCyc:PWY-5505
 property_value: skos:narrowMatch MetaCyc:GLUGLNSYN-PWY
@@ -443160,12 +444684,15 @@
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
 
@@ -447105,9 +448632,11 @@
 synonym: "amine:oxygen oxidoreductase (deaminating) activity" EXACT []
 xref: EC:1.4.3.4
 xref: RHEA:26414
+xref: RHEA:51168
 is_a: GO:0016641 ! oxidoreductase activity, acting on the CH-NH2 group of donors, oxygen as acceptor
 property_value: skos:exactMatch EC:1.4.3.4
 property_value: skos:narrowMatch RHEA:26414
+property_value: skos:narrowMatch RHEA:51168
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22282" xsd:anyURI
 created_by: pr
 creation_date: 2014-07-30T10:23:57Z
@@ -447306,9 +448835,8 @@
 def: "The directed movement of L-arginine from outside of a cell, across the plasma membrane and into the cytosol." [GOC:krc, PMID:8195186]
 synonym: "arginine import" BROAD []
 synonym: "L-arginine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: tb
 creation_date: 2012-09-24T14:28:58Z
 
@@ -448066,11 +449594,13 @@
 
 [Term]
 id: GO:0097712
-name: vesicle targeting, trans-Golgi to periciliary membrane compartment
+name: trans-Golgi to periciliary membrane compartment transport
 namespace: biological_process
-def: "The process in which vesicles formed at the trans-Golgi network are directed to the plasma membrane surrounding the base of the cilium, including the ciliary pocket, mediated by molecules at the vesicle membrane and target membrane surfaces." [GOC:cilia, PMID:20106869, PMID:23351793, PMID:24814148, PMID:26485645]
-is_a: GO:0048199 ! vesicle targeting, to, from or within Golgi
+def: "The directed movement of substances from the trans-Golgi network to the periciliary membrane compartment, the specialized region of the plasma membrane surrounding the base of the cilium including the ciliary pocket, via vesicle-mediated transport." [PMID:20106869, PMID:23351793, PMID:24814148, PMID:26485645]
+synonym: "vesicle targeting, trans-Golgi to periciliary membrane compartment" RELATED []
+is_a: GO:0006893 ! Golgi to plasma membrane transport
 relationship: part_of GO:0060271 ! cilium assembly
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31865" xsd:anyURI
 created_by: pr
 creation_date: 2016-08-05T16:16:28Z
 
@@ -452547,7 +454077,8 @@
 namespace: cellular_component
 def: "A cell projection supported by an assembly of actin filaments, and which lacks microtubules." [PMID:15661519]
 is_a: GO:0120025 ! plasma membrane bounded cell projection
-relationship: has_part GO:0005884 ! actin filament
+relationship: part_of GO:0015629 ! actin cytoskeleton
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20443" xsd:anyURI
 
 [Term]
 id: GO:0098859
@@ -452757,14 +454288,12 @@
 
 [Term]
 id: GO:0098881
-name: exocytic insertion of neurotransmitter receptor to plasma membrane
+name: obsolete exocytic insertion of neurotransmitter receptor to plasma membrane
 namespace: biological_process
-def: "The exocytic fusion of neurotransmitter receptor-containing vesicles with plasma membrane, resulting in the integration of neurotransmitter receptors into the plasma membrane. This process includes tethering and docking steps that prepare vesicles for fusion." [GOC:aruk, GOC:bc, PMID:19503082]
-subset: goslim_synapse
-synonym: "neurotransmitter receptor insertion" EXACT []
-is_a: GO:0006904 ! vesicle docking involved in exocytosis
-is_a: GO:0090522 ! vesicle tethering involved in exocytosis
-relationship: part_of GO:0098877 ! neurotransmitter receptor transport to plasma membrane
+def: "OBSOLETE. The exocytic fusion of neurotransmitter receptor-containing vesicles with plasma membrane, resulting in the integration of neurotransmitter receptors into the plasma membrane. This process includes tethering and docking steps that prepare vesicles for fusion." [GOC:aruk, GOC:bc, PMID:19503082]
+comment: The reason for obsoletion is that the meaning of the term is ambiguous. It was placed under both tethering and docking involved in exocytosis, but it is unclear which part of exocytosis it refers to, and it has not been used.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31869" xsd:anyURI
+is_obsolete: true
 
 [Term]
 id: GO:0098882
@@ -458474,10 +460003,11 @@
 xref: EC:1.14.14.39
 xref: MetaCyc:1.14.13.117-RXN
 xref: RHEA:28602
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.39
 property_value: skos:exactMatch RHEA:28602
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102002
@@ -458487,10 +460017,11 @@
 xref: EC:1.14.14.38
 xref: MetaCyc:1.14.13.118-RXN
 xref: RHEA:28606
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.38
 property_value: skos:exactMatch RHEA:28606
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102003
@@ -458816,7 +460347,7 @@
 id: GO:0102045
 name: 3-chlorobenzoate-3,4-oxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 3-chlorobenzoate + O2 + a reduced electron acceptor = 3-chlorobenzoate-cis-3,4-diol + an oxidized electron acceptor." [GOC:pz, PMID:8285670]
+def: "Catalysis of the reaction: 3-chlorobenzoate + O2 + a reduced electron acceptor = 3-chlorobenzoate-cis-3,4-diol + an oxidized electron acceptor." [PMID:38488372, PMID:8285670]
 xref: MetaCyc:RXN-10422
 is_a: GO:0016708 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of two atoms of oxygen into one donor
 
@@ -459051,7 +460582,7 @@
 id: GO:0102067
 name: geranylgeranyl diphosphate reductase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (E)-3,7,11,15-tetramethylhexadec-2-en-1-yl diphosphate + 3 NADP = 2-trans,6-trans,10-trans-geranylgeranyl diphosphate + 3 NADPH + 3 H+." [EC:1.3.1.83, GOC:pz]
+def: "Catalysis of the reaction: phytyl diphosphate + 3 NADP+ = geranylgeranyl diphosphate + 3 NADPH + 3 H+. This enzyme also catalyzes the reduction of geranylgeranyl-chlorophyll a into phytyl-chlorophyll a." [EC:1.3.1.83, PMID:9492312, RHEA:26229]
 xref: EC:1.3.1.83
 xref: MetaCyc:RXN-10625
 xref: RHEA:26229
@@ -459068,10 +460599,11 @@
 xref: EC:1.14.14.113
 xref: MetaCyc:RXN-10628
 xref: RHEA:32491
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.113
 property_value: skos:exactMatch RHEA:32491
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102069
@@ -459883,11 +461415,15 @@
 
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
@@ -460066,10 +461602,11 @@
 xref: EC:1.14.14.149
 xref: MetaCyc:RXN-11908
 xref: RHEA:28226
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.149
 property_value: skos:exactMatch RHEA:28226
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102171
@@ -460125,12 +461662,14 @@
 xref: RHEA:34775
 xref: RHEA:59016
 xref: RHEA:60084
+xref: RHEA:60092
 is_a: GO:0000252 ! 3-beta-hydroxysteroid dehydrogenase [NAD(P)+]/C4-decarboxylase activity
 property_value: skos:exactMatch EC:1.1.1.418
 property_value: skos:exactMatch RHEA:34775
 property_value: skos:narrowMatch RHEA:20669
 property_value: skos:narrowMatch RHEA:59016
 property_value: skos:narrowMatch RHEA:60084
+property_value: skos:narrowMatch RHEA:60092
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29311" xsd:anyURI
 
 [Term]
@@ -460145,16 +461684,18 @@
 
 [Term]
 id: GO:0102177
-name: 24-methylenelophenol methyl oxidase activity
+name: 4alpha-monomethylsterol monooxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: 24-methylenelophenol + O2 + NADH + H+ = 4alpha-hydroxymethyl-ergosta-7,24(241)-dien-3beta-ol + NAD + H2O." [GOC:pz, PMID:11707264, RHEA:58872]
+def: "Catalysis of the reaction: 24-methylidenelophenol + 6 Fe(II)-[cytochrome b5] + 3 O2 + 5 H+ = 4alpha-carboxy-ergosta-7,24(24(1))-dien-3beta-ol + 6 Fe(III)-[cytochrome b5] + 4 H2O." [PMID:11707264, RHEA:58868]
+synonym: "24-methylenelophenol methyl oxidase activity" EXACT []
 xref: EC:1.14.18.11
-xref: MetaCyc:RXN-11930
-xref: RHEA:58872
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+xref: MetaCyc:RXN-19724
+xref: RHEA:58868
+is_a: GO:0016716 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, another compound as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.18.11
-property_value: skos:exactMatch RHEA:58872
+property_value: skos:exactMatch RHEA:58868
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31985" xsd:anyURI
 
 [Term]
 id: GO:0102178
@@ -460675,9 +462216,12 @@
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
@@ -461214,12 +462758,13 @@
 xref: EC:1.14.14.152
 xref: MetaCyc:RXN-12680
 xref: RHEA:31711
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.152
 property_value: skos:exactMatch MetaCyc:RXN-12680
 property_value: skos:exactMatch RHEA:31711
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28526" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102290
@@ -461488,7 +463033,7 @@
 id: GO:0102313
 name: 1,8-cineole synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: geranyl diphosphate(3-) + H2O = 1,8-cineole + diphosphoric acid." [GOC:pz, RHEA:32543]
+def: "Catalysis of the reaction: geranyl diphosphate(3-) + H2O = 1,8-cineole + diphosphoric acid." [RHEA:32543]
 xref: EC:4.2.3.108
 xref: MetaCyc:RXN-12980
 xref: RHEA:32543
@@ -461544,10 +463089,11 @@
 xref: EC:1.14.14.56
 xref: MetaCyc:RXN-4342
 xref: RHEA:32895
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.56
 property_value: skos:exactMatch RHEA:32895
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102321
@@ -462099,10 +463645,11 @@
 xref: EC:1.14.14.115
 xref: MetaCyc:RXN-13506
 xref: RHEA:35499
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.115
 property_value: skos:exactMatch RHEA:35499
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102376
@@ -462304,11 +463851,18 @@
 
 [Term]
 id: GO:0102394
-name: 4-hydroxy-L-isoleucine dehydrogenase activity
+name: L-isoleucine 4-hydroxylase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: (2S,3R,4S)-4-hydroxy-L-isoleucine + NAD = (2S,3R)-2-amino-3-methyl-4-ketopentanoate + NADH + H+." [GOC:pz, PMID:21069315]
+def: "Catalysis of the reaction: L-isoleucine + 2-oxoglutarate + O2 = (4S)-4-hydroxy-L-isoleucine + succinate + CO2." [PMID:21069315, RHEA:41448]
+synonym: "4-hydroxy-L-isoleucine dehydrogenase activity" RELATED []
+xref: EC:1.14.11.45
 xref: MetaCyc:RXN-13637
-is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
+xref: RHEA:41448
+is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
+property_value: skos:exactMatch EC:1.14.11.45
+property_value: skos:exactMatch RHEA:41448
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31862" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0102395
@@ -463979,10 +465533,11 @@
 xref: EC:1.14.14.120
 xref: MetaCyc:RXN-14975
 xref: RHEA:38579
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.120
 property_value: skos:exactMatch RHEA:38579
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102557
@@ -463992,10 +465547,11 @@
 xref: EC:1.14.14.121
 xref: MetaCyc:RXN-14978
 xref: RHEA:22272
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.121
 property_value: skos:exactMatch RHEA:22272
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102559
@@ -464337,10 +465893,11 @@
 xref: EC:1.14.14.70
 xref: MetaCyc:RXN-15379
 xref: RHEA:41464
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.70
 property_value: skos:exactMatch RHEA:41464
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102597
@@ -464350,10 +465907,11 @@
 xref: EC:1.14.14.122
 xref: MetaCyc:RXN-15381
 xref: RHEA:41468
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.122
 property_value: skos:exactMatch RHEA:41468
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102598
@@ -464363,10 +465921,11 @@
 xref: EC:1.14.14.123
 xref: MetaCyc:RXN-15382
 xref: RHEA:41472
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.123
 property_value: skos:exactMatch RHEA:41472
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102599
@@ -465093,11 +466652,15 @@
 synonym: "fatty aldehyde dehydrogenase activity" EXACT []
 xref: MetaCyc:RXN-4142
 xref: RHEA:44008
+xref: RHEA:44016
 xref: RHEA:49832
+xref: RHEA:69092
 xref: RHEA:69771
 is_a: GO:0004029 ! aldehyde dehydrogenase (NAD+) activity
 property_value: skos:exactMatch RHEA:49832
 property_value: skos:narrowMatch RHEA:44008
+property_value: skos:narrowMatch RHEA:44016
+property_value: skos:narrowMatch RHEA:69092
 property_value: skos:narrowMatch RHEA:69771
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28142" xsd:anyURI
 
@@ -465197,10 +466760,11 @@
 xref: EC:1.14.14.40
 xref: MetaCyc:RXN-4602
 xref: RHEA:33263
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.40
 property_value: skos:exactMatch RHEA:33263
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102685
@@ -465533,14 +467097,15 @@
 id: GO:0102717
 name: DIBOA-glucoside oxygenase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: DIBOA-beta-D-glucoside + O2 + 2-oxoglutarate = TRIBOA-beta-D-glucoside + succinate + carbon dioxide." [EC:1.14.11.59, GOC:pz]
+def: "Catalysis of the reaction: DIBOA beta-D-glucoside + 2-oxoglutarate + O2 = TRIBOA beta-D-glucoside + succinate + CO2." [RHEA:32115]
 xref: EC:1.14.11.59
 xref: MetaCyc:RXN-6685
 xref: RHEA:32115
-is_a: GO:0050498 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, with 2-oxoglutarate as one donor, and the other dehydrogenated
+is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
 property_value: skos:exactMatch EC:1.14.11.59
 property_value: skos:exactMatch RHEA:32115
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0102718
@@ -466140,6 +467705,9 @@
 xref: EC:1.14.18.5
 xref: MetaCyc:RXN-14250
 xref: Reactome:R-HSA-428260 "DEGS2 oxygenates dihydroceramide"
+xref: RHEA:33599
+xref: RHEA:33679
+xref: RHEA:43116
 xref: RHEA:46364
 xref: RHEA:55476
 xref: RHEA:55808
@@ -466147,6 +467715,9 @@
 is_a: GO:0016716 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, another compound as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.18.5
 property_value: skos:exactMatch RHEA:55808
+property_value: skos:narrowMatch RHEA:33599
+property_value: skos:narrowMatch RHEA:33679
+property_value: skos:narrowMatch RHEA:43116
 property_value: skos:narrowMatch RHEA:46364
 property_value: skos:narrowMatch RHEA:55476
 property_value: skos:narrowMatch RHEA:81475
@@ -466548,10 +468119,11 @@
 xref: EC:1.14.14.83
 xref: MetaCyc:RXN-8197
 xref: RHEA:32495
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.83
 property_value: skos:exactMatch RHEA:32495
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102812
@@ -467206,10 +468778,11 @@
 xref: EC:1.14.14.141
 xref: MetaCyc:RXN-8386
 xref: RHEA:19281
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.141
 property_value: skos:exactMatch RHEA:19281
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102877
@@ -467619,19 +469192,20 @@
 id: GO:0102915
 name: piperitol synthase activity
 namespace: molecular_function
-def: "Catalysis of the reaction: H+ + (+)-pinoresinol + NADPH + O2 = (+)-piperitol + NADP + 2 H2O." [EC:1.14.19.74, PMID:16785429]
+def: "Catalysis of the reaction: (+)-pinoresinol + reduced [NADPH--hemoprotein reductase] + O2 = (+)-piperitol + oxidized [NADPH--hemoprotein reductase] + 2 H2O + H+. Also catalyzes the synthesis of (+)-sesamin from (+)-piperitol." [EC:1.14.19.74, PMID:16785429]
 xref: EC:1.14.19.74
 xref: MetaCyc:RXN-8695
 xref: MetaCyc:RXN-8696
 xref: RHEA:56776
 xref: RHEA:56780
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016717 ! oxidoreductase activity, acting on paired donors, with oxidation of a pair of donors resulting in the reduction of molecular oxygen to two molecules of water
 property_value: skos:exactMatch EC:1.14.19.74
 property_value: skos:narrowMatch MetaCyc:RXN-8695
 property_value: skos:narrowMatch MetaCyc:RXN-8696
 property_value: skos:narrowMatch RHEA:56776
 property_value: skos:narrowMatch RHEA:56780
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 
 [Term]
 id: GO:0102916
@@ -467844,10 +469418,11 @@
 xref: EC:1.14.14.150
 xref: MetaCyc:RXN-8971
 xref: RHEA:28230
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.150
 property_value: skos:exactMatch RHEA:28230
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102935
@@ -468479,6 +470054,9 @@
 xref: MetaCyc:RXN-9667
 xref: RHEA:46408
 xref: RHEA:46412
+xref: RHEA:66512
+xref: RHEA:66516
+xref: RHEA:66520
 is_a: GO:0016717 ! oxidoreductase activity, acting on paired donors, with oxidation of a pair of donors resulting in the reduction of molecular oxygen to two molecules of water
 property_value: skos:exactMatch EC:1.14.19.35
 property_value: skos:exactMatch MetaCyc:RXN-9667
@@ -468495,6 +470073,9 @@
 property_value: skos:narrowMatch MetaCyc:RXN-8366
 property_value: skos:narrowMatch RHEA:46408
 property_value: skos:narrowMatch RHEA:46412
+property_value: skos:narrowMatch RHEA:66512
+property_value: skos:narrowMatch RHEA:66516
+property_value: skos:narrowMatch RHEA:66520
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28070" xsd:anyURI
 
 [Term]
@@ -468505,10 +470086,11 @@
 xref: EC:1.14.14.148
 xref: MetaCyc:RXN-9689
 xref: RHEA:27481
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.148
 property_value: skos:exactMatch RHEA:27481
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 
 [Term]
 id: GO:0102996
@@ -469666,7 +471248,7 @@
 synonym: "membrane-cytoskeletal protein anchor activity" BROAD []
 synonym: "membrane-cytoskeletal protein tether activity" BROAD []
 synonym: "microtubule cortical anchor activity" NARROW []
-is_a: GO:0008093 ! cytoskeletal anchor activity
+is_a: GO:0008093 ! cytoskeletal adaptor activity
 is_a: GO:0043495 ! protein-membrane adaptor activity
 relationship: has_part GO:0008289 ! lipid binding
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/17668" xsd:anyURI
@@ -470120,22 +471702,27 @@
 
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
 
@@ -470412,7 +471999,7 @@
 name: peptide N-succinyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the acetylation of an amino acid residue of a peptide or protein, according to the reaction: succinyl-CoA + peptide = CoA + N-succinylpeptide." [PMID:29211711]
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 created_by: hjd
 creation_date: 2017-12-15T18:23:58Z
 
@@ -471123,10 +472710,11 @@
 def: "Catalyzes the reaction fraxetin+ NAD(P)H + 02= sideretin + NAD(P)(+) + H20." [GOC:lr, PMID:29581584, RHEA:57844]
 xref: EC:1.14.14.164
 xref: RHEA:57844
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.164
 property_value: skos:exactMatch RHEA:57844
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: hjd
 creation_date: 2018-09-07T18:24:41Z
 
@@ -471134,13 +472722,14 @@
 id: GO:0106145
 name: scopoletin 8-hydroxylase activity
 namespace: molecular_function
-def: "Catalyzes of the reaction: scopoletin + 2-oxoglutarate+O2=fraxetin +succinate+ CO2)." [GOC:lr, PMID:29361149, PMID:29581584, RHEA:57848]
+def: "Catalysis of the reaction: scopoletin + 2-oxoglutarate + O2 = fraxetin + succinate + CO2." [PMID:29361149, PMID:29581584, RHEA:57848]
 xref: EC:1.14.11.60
 xref: RHEA:57848
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016706 ! 2-oxoglutarate-dependent dioxygenase activity
 property_value: skos:exactMatch EC:1.14.11.60
 property_value: skos:exactMatch RHEA:57848
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31969" xsd:anyURI
 created_by: hjd
 creation_date: 2018-09-07T18:28:16Z
 
@@ -471178,10 +472767,11 @@
 def: "Catalysis of the reaction: indole-3-carbonyl nitrile + NADPH +O2=4-hydroxyindole-3- carbonyl nitrile + NADP+ + H20." [GOC:lr, PMID:26352477, RHEA:57864]
 xref: EC:1.14.14.165
 xref: RHEA:57864
-is_a: GO:0016709 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, NAD(P)H as one donor, and incorporation of one atom of oxygen
+is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.165
 property_value: skos:exactMatch RHEA:57864
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31967" xsd:anyURI
 created_by: hjd
 creation_date: 2018-09-10T19:44:15Z
 
@@ -471911,7 +473501,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: 2-hydroxyisobutyryl-CoA + lysine in peptide = CoA + N-2-hydroxyisobutyryl-lysine-peptide." [GOC:sp, PMID:29775581]
 xref: RHEA:24180
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:24180
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -471934,7 +473524,7 @@
 def: "Catalysis of the reaction: glutaryl-CoA + L-lysyl-[protein] = CoA + H+ + N6-glutaryl-L-lysyl-[protein]." [GOC:sp, PMID:31542297]
 xref: Reactome:R-HSA-9858590 "DLST transfers glutaryl to CoA"
 xref: RHEA:18009
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:18009
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -472017,9 +473607,11 @@
 def: "Catalysis of the reaction: ceramide-1-phosphate + H2O = ceramide+ phosphate." [GOC:lb, PMID:10359651]
 xref: RHEA:33743
 xref: RHEA:50888
+xref: RHEA:62040
 is_a: GO:0042577 ! lipid phosphatase activity
 property_value: skos:exactMatch RHEA:50888
 property_value: skos:narrowMatch RHEA:33743
+property_value: skos:narrowMatch RHEA:62040
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
 creation_date: 2019-11-21T20:40:39Z
@@ -472361,6 +473953,7 @@
 xref: RHEA:36015
 xref: RHEA:36019
 xref: RHEA:36023
+xref: RHEA:37419
 xref: RHEA:37495
 xref: RHEA:37499
 xref: RHEA:37503
@@ -472372,12 +473965,15 @@
 xref: RHEA:37767
 xref: RHEA:37771
 xref: RHEA:37775
-is_a: GO:0008374 ! O-acyltransferase activity
+xref: RHEA:64204
+xref: RHEA:64228
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n7
 property_value: skos:exactMatch RHEA:32995
 property_value: skos:narrowMatch RHEA:36015
 property_value: skos:narrowMatch RHEA:36019
 property_value: skos:narrowMatch RHEA:36023
+property_value: skos:narrowMatch RHEA:37419
 property_value: skos:narrowMatch RHEA:37495
 property_value: skos:narrowMatch RHEA:37499
 property_value: skos:narrowMatch RHEA:37503
@@ -472389,6 +473985,8 @@
 property_value: skos:narrowMatch RHEA:37767
 property_value: skos:narrowMatch RHEA:37771
 property_value: skos:narrowMatch RHEA:37775
+property_value: skos:narrowMatch RHEA:64204
+property_value: skos:narrowMatch RHEA:64228
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27226" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -472401,22 +473999,30 @@
 def: "Catalysis of the reaction:a 1-acyl-sn-glycero-3-phospho-L-serine + an acyl-CoA = a 1,2-diacyl-sn-glycero-3-phospho-L-serine + CoA." [PMID:18287005, RHEA:33191]
 xref: EC:2.3.1.n6
 xref: RHEA:33191
+xref: RHEA:37375
+xref: RHEA:37379
 xref: RHEA:37399
 xref: RHEA:37403
+xref: RHEA:37407
 xref: RHEA:37415
 xref: RHEA:37531
+xref: RHEA:37535
 xref: RHEA:37539
 xref: RHEA:37567
 xref: RHEA:37571
 xref: RHEA:37735
 xref: RHEA:37739
-is_a: GO:0008374 ! O-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.n6
 property_value: skos:exactMatch RHEA:33191
+property_value: skos:narrowMatch RHEA:37375
+property_value: skos:narrowMatch RHEA:37379
 property_value: skos:narrowMatch RHEA:37399
 property_value: skos:narrowMatch RHEA:37403
+property_value: skos:narrowMatch RHEA:37407
 property_value: skos:narrowMatch RHEA:37415
 property_value: skos:narrowMatch RHEA:37531
+property_value: skos:narrowMatch RHEA:37535
 property_value: skos:narrowMatch RHEA:37539
 property_value: skos:narrowMatch RHEA:37567
 property_value: skos:narrowMatch RHEA:37571
@@ -472609,8 +474215,8 @@
 synonym: "negative regulation of UDP-N-acetylglucosamine formation" RELATED []
 synonym: "negative regulation of UDP-N-acetylglucosamine synthesis" RELATED []
 is_a: GO:0009890 ! negative regulation of biosynthetic process
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 is_a: GO:0106278 ! regulation of UDP-N-acetylglucosamine biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
@@ -472630,7 +474236,7 @@
 synonym: "positive regulation of UDP-N-acetylglucosamine biosynthesis" RELATED []
 synonym: "positive regulation of UDP-N-acetylglucosamine synthesis" RELATED []
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 is_a: GO:0106278 ! regulation of UDP-N-acetylglucosamine biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
@@ -473298,15 +474904,39 @@
 def: "Catalysis of the reaction: an N-(omega-hydroxy-ultra-long chain fatty acyl)-sphingoid base + a (9Z,12Z)-octadecadienoyl-containing triacyl-sn-glycerol = an N-[omega-(9Z,12Z-octadecadienoyloxy)-O-ultra-long chain fatty acyl]-sphingoid base + a diacylglycerol." [PMID:28248318, RHEA:61528]
 xref: EC:2.3.1.296
 xref: MetaCyc:RXN-20362
+xref: RHEA:55264
 xref: RHEA:61528
+xref: RHEA:65648
+xref: RHEA:65652
+xref: RHEA:65668
+xref: RHEA:65672
+xref: RHEA:65676
+xref: RHEA:65680
+xref: RHEA:65684
+xref: RHEA:65688
 xref: RHEA:65692
+xref: RHEA:65696
+xref: RHEA:78007
+xref: RHEA:78011
 xref: RHEA:78115
 xref: RHEA:78119
 is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch EC:2.3.1.296
 property_value: skos:exactMatch MetaCyc:RXN-20362
 property_value: skos:exactMatch RHEA:61528
+property_value: skos:narrowMatch RHEA:55264
+property_value: skos:narrowMatch RHEA:65648
+property_value: skos:narrowMatch RHEA:65652
+property_value: skos:narrowMatch RHEA:65668
+property_value: skos:narrowMatch RHEA:65672
+property_value: skos:narrowMatch RHEA:65676
+property_value: skos:narrowMatch RHEA:65680
+property_value: skos:narrowMatch RHEA:65684
+property_value: skos:narrowMatch RHEA:65688
 property_value: skos:narrowMatch RHEA:65692
+property_value: skos:narrowMatch RHEA:65696
+property_value: skos:narrowMatch RHEA:78007
+property_value: skos:narrowMatch RHEA:78011
 property_value: skos:narrowMatch RHEA:78115
 property_value: skos:narrowMatch RHEA:78119
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30910" xsd:anyURI
@@ -473493,11 +475123,13 @@
 xref: RHEA:25375
 xref: RHEA:25379
 xref: RHEA:67444
+xref: RHEA:67448
 is_a: GO:0016832 ! aldehyde-lyase activity
 property_value: skos:exactMatch EC:4.1.2.63
 property_value: skos:narrowMatch RHEA:25375
 property_value: skos:narrowMatch RHEA:25379
 property_value: skos:narrowMatch RHEA:67444
+property_value: skos:narrowMatch RHEA:67448
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20787" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23412" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25060" xsd:anyURI
@@ -473842,21 +475474,43 @@
 xref: EC:1.1.1.n12
 xref: MetaCyc:RXN66-485
 xref: RHEA:32711
+xref: RHEA:40191
+xref: RHEA:40243
+xref: RHEA:45832
 xref: RHEA:67220
 xref: RHEA:67232
+xref: RHEA:78563
+xref: RHEA:78579
+xref: RHEA:78595
+xref: RHEA:78607
+xref: RHEA:78635
+xref: RHEA:78667
+xref: RHEA:78671
 xref: RHEA:78871
 xref: RHEA:78875
 xref: RHEA:78879
 xref: RHEA:78935
+xref: RHEA:79191
 is_a: GO:0016616 ! oxidoreductase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.1.1.n12
 property_value: skos:exactMatch RHEA:32711
+property_value: skos:narrowMatch RHEA:40191
+property_value: skos:narrowMatch RHEA:40243
+property_value: skos:narrowMatch RHEA:45832
 property_value: skos:narrowMatch RHEA:67220
 property_value: skos:narrowMatch RHEA:67232
+property_value: skos:narrowMatch RHEA:78563
+property_value: skos:narrowMatch RHEA:78579
+property_value: skos:narrowMatch RHEA:78595
+property_value: skos:narrowMatch RHEA:78607
+property_value: skos:narrowMatch RHEA:78635
+property_value: skos:narrowMatch RHEA:78667
+property_value: skos:narrowMatch RHEA:78671
 property_value: skos:narrowMatch RHEA:78871
 property_value: skos:narrowMatch RHEA:78875
 property_value: skos:narrowMatch RHEA:78879
 property_value: skos:narrowMatch RHEA:78935
+property_value: skos:narrowMatch RHEA:79191
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27180" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30577" xsd:anyURI
 created_by: hjd
@@ -473879,6 +475533,7 @@
 def: "Catalysis of the reaction: N1-methylpseudouridine in small subunit rRNA + S-adenosyl-L-methionine = H+ + N1-methyl-N3-[(3S)-3-amino-3-carboxypropyl]pseudouridine in small subunit rRNA + S-methyl-5'-thioadenosine." [PMID:27084949, RHEA:63296]
 synonym: "18S rRNA aminocarboxypropyltransferase activity" NARROW []
 xref: EC:2.5.1.157
+xref: RHEA:31479
 xref: RHEA:63292
 xref: RHEA:63296
 xref: RHEA:63300
@@ -473886,6 +475541,7 @@
 is_a: GO:0140102 ! catalytic activity, acting on a rRNA
 property_value: skos:exactMatch EC:2.5.1.157
 property_value: skos:exactMatch RHEA:63296
+property_value: skos:narrowMatch RHEA:31479
 property_value: skos:narrowMatch RHEA:63292
 property_value: skos:narrowMatch RHEA:63300
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29843" xsd:anyURI
@@ -474343,15 +475999,19 @@
 namespace: molecular_function
 def: "(S)-dihydroorotate + a quinone = orotate + a quinol." [RHEA:30187]
 xref: EC:1.3.5.2
+xref: RHEA:28687
 xref: RHEA:28691
 xref: RHEA:29195
+xref: RHEA:29199
 xref: RHEA:30187
 is_a: GO:0004152 ! dihydroorotate dehydrogenase activity
 is_a: GO:0016635 ! oxidoreductase activity, acting on the CH-CH group of donors, quinone or related compound as acceptor
 property_value: skos:exactMatch EC:1.3.5.2
 property_value: skos:exactMatch RHEA:30187
+property_value: skos:narrowMatch RHEA:28687
 property_value: skos:narrowMatch RHEA:28691
 property_value: skos:narrowMatch RHEA:29195
+property_value: skos:narrowMatch RHEA:29199
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23786" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: hjd
@@ -474434,6 +476094,15 @@
 xref: RHEA:21164
 xref: RHEA:31779
 xref: RHEA:38555
+xref: RHEA:47348
+xref: RHEA:47352
+xref: RHEA:47356
+xref: RHEA:47360
+xref: RHEA:47364
+xref: RHEA:47388
+xref: RHEA:47392
+xref: RHEA:50136
+xref: RHEA:50144
 xref: RHEA:50148
 xref: RHEA:59388
 xref: RHEA:63052
@@ -474442,6 +476111,15 @@
 property_value: skos:exactMatch RHEA:21164
 property_value: skos:narrowMatch RHEA:31779
 property_value: skos:narrowMatch RHEA:38555
+property_value: skos:narrowMatch RHEA:47348
+property_value: skos:narrowMatch RHEA:47352
+property_value: skos:narrowMatch RHEA:47356
+property_value: skos:narrowMatch RHEA:47360
+property_value: skos:narrowMatch RHEA:47364
+property_value: skos:narrowMatch RHEA:47388
+property_value: skos:narrowMatch RHEA:47392
+property_value: skos:narrowMatch RHEA:50136
+property_value: skos:narrowMatch RHEA:50144
 property_value: skos:narrowMatch RHEA:50148
 property_value: skos:narrowMatch RHEA:59388
 property_value: skos:narrowMatch RHEA:63052
@@ -474475,9 +476153,11 @@
 def: "Catalytic reaction: ATP + L-glutamate + L-glutamyl-[protein] = ADP + H+ + L-gamma-glutamyl-L-glutamyl-[protein] + phosphate." [PMID:32747782, RHEA:60144]
 xref: RHEA:60144
 xref: RHEA:69192
+xref: RHEA:69196
 is_a: GO:0070739 ! protein-glutamic acid ligase activity
 property_value: skos:exactMatch RHEA:60144
 property_value: skos:narrowMatch RHEA:69192
+property_value: skos:narrowMatch RHEA:69196
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21309" xsd:anyURI
 created_by: hjd
 creation_date: 2022-10-21T21:11:47Z
@@ -474489,9 +476169,11 @@
 def: "Catalytic reaction :(L-glutamyl)n-L-gamma-glutamyl-L-glutamyl-[protein] + ATP + L-glutamate = (L-glutamyl)n+1-L-gamma-glutamyl-L-glutamyl-[protein] + ADP + H+ + phosphate." [PMID:32747782, RHEA:60148]
 xref: RHEA:60148
 xref: RHEA:69208
+xref: RHEA:69212
 is_a: GO:0070739 ! protein-glutamic acid ligase activity
 property_value: skos:exactMatch RHEA:60148
 property_value: skos:narrowMatch RHEA:69208
+property_value: skos:narrowMatch RHEA:69212
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21309" xsd:anyURI
 created_by: hjd
 creation_date: 2022-10-21T21:15:15Z
@@ -475669,6 +477351,7 @@
 comment: In S. cerevisiae, this complex is formed by RAI1 and RAT1; in H. sapiens it is formed by Twi12, Xrn2 and Tan1.
 synonym: "TXT complex" EXACT [PMID:23084833]
 is_a: GO:0140513 ! nuclear protein-containing complex
+is_a: GO:1903293 ! phosphatase complex
 is_a: GO:1905354 ! exoribonuclease complex
 created_by: kmv
 creation_date: 2018-03-16T18:55:17Z
@@ -480186,7 +481869,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: L-glutaminyl-[protein] + serotonin = 5-serotonyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:14697203]
 xref: RHEA:66552
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66552
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480212,7 +481895,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: dopamine + L-glutaminyl-[protein] = 5-dopaminyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378, PMID:32273471]
 xref: RHEA:66556
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66556
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480238,7 +481921,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: (R)-noradrenaline + L-glutaminyl-[protein] = 5-(R)-noradrenalinyl-L-glutamyl-[protein] + NH4+." [GOC:sp, PMID:22858378]
 xref: RHEA:66560
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66560
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480251,7 +481934,7 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: histamine + L-glutaminyl-[protein] = 5-histaminyl-L-glutamyl-[protein]." [GOC:sp, PMID:23022564, PMID:23797785]
 xref: RHEA:66564
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:66564
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
@@ -480267,7 +481950,7 @@
 synonym: "peptide lactyltransferase activity" BROAD []
 synonym: "peptide lactyltransferase activity (CoA-dependent)" BROAD []
 xref: RHEA:61996
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:61996
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20685" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28015" xsd:anyURI
@@ -480863,11 +482546,13 @@
 def: "Catalysis of the reaction: an (omega-1)-ethyl fatty acid + O2 + reduced [NADPH--hemoprotein reductase] = an (omega-1)-hydroxy fatty acid + H+ + H2O + oxidized [NADPH--hemoprotein reductase]." [RHEA:44548]
 xref: RHEA:39751
 xref: RHEA:39759
+xref: RHEA:41724
 xref: RHEA:44548
 is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch RHEA:44548
 property_value: skos:narrowMatch RHEA:39751
 property_value: skos:narrowMatch RHEA:39759
+property_value: skos:narrowMatch RHEA:41724
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24661" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: sjm
@@ -481042,11 +482727,13 @@
 xref: MetaCyc:BUTYRATE--COA-LIGASE-RXN
 xref: RHEA:38883
 xref: RHEA:44004
+xref: RHEA:44196
 is_a: GO:0015645 ! fatty acid ligase activity
 is_a: GO:0016405 ! CoA-ligase activity
 property_value: skos:exactMatch MetaCyc:BUTYRATE--COA-LIGASE-RXN
 property_value: skos:exactMatch RHEA:38883
 property_value: skos:narrowMatch RHEA:44004
+property_value: skos:narrowMatch RHEA:44196
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28199" xsd:anyURI
 created_by: sjm
 creation_date: 2024-06-25T12:17:07Z
@@ -481057,17 +482744,57 @@
 namespace: molecular_function
 def: "Catalysis of the reaction: a diacylglycerol + H2O = a fatty acid + a monoacylglycerol + H+." [RHEA:32731]
 xref: MetaCyc:RXN-19279
+xref: RHEA:18761
 xref: RHEA:32731
+xref: RHEA:33275
+xref: RHEA:35663
+xref: RHEA:38383
+xref: RHEA:38455
+xref: RHEA:38483
+xref: RHEA:38511
+xref: RHEA:38595
+xref: RHEA:38651
+xref: RHEA:38659
+xref: RHEA:39935
+xref: RHEA:39939
+xref: RHEA:40967
+xref: RHEA:41219
+xref: RHEA:42604
+xref: RHEA:44176
 xref: RHEA:44444
+xref: RHEA:44712
+xref: RHEA:44876
 xref: RHEA:47868
+xref: RHEA:48596
 xref: RHEA:78019
+xref: RHEA:78147
 is_a: GO:0016298 ! lipase activity
 property_value: skos:broadMatch EC:3.1.1.79
 property_value: skos:exactMatch MetaCyc:RXN-19279
 property_value: skos:exactMatch RHEA:32731
+property_value: skos:narrowMatch RHEA:18761
+property_value: skos:narrowMatch RHEA:33275
+property_value: skos:narrowMatch RHEA:35663
+property_value: skos:narrowMatch RHEA:38383
+property_value: skos:narrowMatch RHEA:38455
+property_value: skos:narrowMatch RHEA:38483
+property_value: skos:narrowMatch RHEA:38511
+property_value: skos:narrowMatch RHEA:38595
+property_value: skos:narrowMatch RHEA:38651
+property_value: skos:narrowMatch RHEA:38659
+property_value: skos:narrowMatch RHEA:39935
+property_value: skos:narrowMatch RHEA:39939
+property_value: skos:narrowMatch RHEA:40967
+property_value: skos:narrowMatch RHEA:41219
+property_value: skos:narrowMatch RHEA:42604
+property_value: skos:narrowMatch RHEA:44176
 property_value: skos:narrowMatch RHEA:44444
+property_value: skos:narrowMatch RHEA:44712
+property_value: skos:narrowMatch RHEA:44876
 property_value: skos:narrowMatch RHEA:47868
+property_value: skos:narrowMatch RHEA:48596
 property_value: skos:narrowMatch RHEA:78019
+property_value: skos:narrowMatch RHEA:78147
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28339" xsd:anyURI
 created_by: sjm
 creation_date: 2024-06-28T12:36:24Z
@@ -481329,10 +483056,18 @@
 xref: EC:4.2.1.170
 xref: RHEA:50632
 xref: RHEA:50636
+xref: RHEA:50648
+xref: RHEA:50652
+xref: RHEA:50656
+xref: RHEA:50660
 is_a: GO:0016836 ! hydro-lyase activity
 property_value: skos:exactMatch EC:4.2.1.170
 property_value: skos:narrowMatch RHEA:50632
 property_value: skos:narrowMatch RHEA:50636
+property_value: skos:narrowMatch RHEA:50648
+property_value: skos:narrowMatch RHEA:50652
+property_value: skos:narrowMatch RHEA:50656
+property_value: skos:narrowMatch RHEA:50660
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28776" xsd:anyURI
 created_by: sjm
 creation_date: 2024-09-05T08:00:08Z
@@ -481657,11 +483392,13 @@
 synonym: "mRNA (nucleoside-2'-O-)-methyltransferase activity" RELATED [EC:2.1.1.296]
 xref: EC:2.1.1.296
 xref: MetaCyc:RXN-14928
+xref: RHEA:53044
 xref: RHEA:67024
 is_a: GO:0008171 ! O-methyltransferase activity
 is_a: GO:0008173 ! RNA methyltransferase activity
 property_value: skos:exactMatch EC:2.1.1.296
 property_value: skos:narrowMatch MetaCyc:RXN-14928
+property_value: skos:narrowMatch RHEA:53044
 property_value: skos:narrowMatch RHEA:67024
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27387" xsd:anyURI
 created_by: sjm
@@ -481947,7 +483684,7 @@
 name: dihydrolipoyllysine-residue glutaryltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: N6-[(R)-dihydrolipoyl]-L-lysyl-[protein] + glutaryl-CoA = CoA + N6-[(R)-S8-glutaryldihydrolipoyl]-L-lysyl-[protein]." [PMID:29191460]
-is_a: GO:0016417 ! S-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31280" xsd:anyURI
 created_by: sjm
 creation_date: 2026-01-07T15:48:37Z
@@ -482029,7 +483766,6 @@
 is_a: GO:0042219 ! modified amino acid catabolic process
 is_a: GO:0170035 ! L-amino acid catabolic process
 is_a: GO:0170044 ! non-proteinogenic amino acid catabolic process
-is_a: GO:1903184 ! L-dopa metabolic process
 property_value: skos:narrowMatch MetaCyc:PWY-6334
 property_value: skos:narrowMatch MetaCyc:PWY-8110
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31703" xsd:anyURI
@@ -482145,7 +483881,6 @@
 name: D-aspartate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of D-aspartate from one side of a membrane to the other." [GO_REF:0000070, PMID:7914198]
-is_a: GO:0005310 ! dicarboxylic acid transmembrane transporter activity
 is_a: GO:0015556 ! C4-dicarboxylate transmembrane transporter activity
 is_a: GO:0042943 ! D-amino acid transmembrane transporter activity
 relationship: part_of GO:0070777 ! D-aspartate transmembrane transport
@@ -482309,18 +484044,13 @@
 
 [Term]
 id: GO:0140025
-name: contractile vacuole tethering involved in discharge
+name: obsolete contractile vacuole tethering involved in discharge
 namespace: biological_process
-def: "The initial, indirect interaction between a contractile vacuole membrane and a site of discharge in the plasma membrane. This interaction is mediated by tethering factors (or complexes), which interact with both membranes. Interaction can occur via direct binding to membrane phospholipids or membrane proteins, or via binding to vesicle coat proteins. This process is distinct from and prior to docking and fusion." [PMID:22323285]
-synonym: "contractile vacuole tethering to plasma membrane" NARROW []
-is_a: GO:0006903 ! vesicle targeting
-is_a: GO:0090522 ! vesicle tethering involved in exocytosis
-intersection_of: GO:0006903 ! vesicle targeting
-intersection_of: part_of GO:0070177 ! contractile vacuole discharge
-relationship: part_of GO:0070177 ! contractile vacuole discharge
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/13407" xsd:anyURI
-created_by: pg
-creation_date: 2017-05-02T09:50:10Z
+def: "OBSOLETE. The initial, indirect interaction between a contractile vacuole membrane and a site of discharge in the plasma membrane. This interaction is mediated by tethering factors (or complexes), which interact with both membranes. Interaction can occur via direct binding to membrane phospholipids or membrane proteins, or via binding to vesicle coat proteins. This process is distinct from and prior to docking and fusion." [PMID:22323285]
+comment: Obsoleted because this term describes a molecular function (tethering activity) rather than a biological process. Replaced by the molecular_function term GO:7770067 contractile vacuole-plasma membrane tether activity.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31870" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:7770067
 
 [Term]
 id: GO:0140026
@@ -482640,13 +484370,14 @@
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
 
@@ -482687,10 +484418,12 @@
 
 [Term]
 id: GO:0140057
-name: vacuole-mitochondria membrane tethering
+name: obsolete vacuole-mitochondria membrane tethering
 namespace: biological_process
-def: "The attachment of a mitochondrial membrane to a vacuolar membrane via molecular tethers that physically bridge their respective membranes and attach them to each other. The tethering may facilitate exchange of metabolites between the organelles." [PMID:27875684]
-is_a: GO:0140056 ! organelle localization by membrane tethering
+def: "OBSOLETE. The attachment of a mitochondrial membrane to a vacuolar membrane via molecular tethers that physically bridge their respective membranes and attach them to each other. The tethering may facilitate exchange of metabolites between the organelles." [PMID:27875684]
+comment: The reason for obsoletion is that this term was added in error.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31876" xsd:anyURI
+is_obsolete: true
 created_by: pg
 creation_date: 2017-06-27T10:31:12Z
 
@@ -482772,7 +484505,7 @@
 def: "Catalysis of the reaction: crotonyl-CoA + lysine in peptide = CoA + N-crotonyl-lysine-peptide." [PMID:25818647]
 synonym: "protein crotonyltransferase activity" RELATED []
 xref: RHEA:53908
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53908
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -482785,7 +484518,7 @@
 def: "Catalysis of the reaction: butyryl-CoA + lysine in peptide = CoA + N-butyryl-lysine-peptide." [PMID:27105113]
 synonym: "protein butyryltransferase activity" RELATED []
 xref: RHEA:53912
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 property_value: skos:exactMatch RHEA:53912
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -483021,8 +484754,14 @@
 name: L-amino-acid N-acetyltransferase activity
 namespace: molecular_function
 def: "Catalysis of the reaction: acetyl-CoA + a L-amino acid = CoA + an N-acetyl-L-amino-acid. In some cases other acetyl containing molecules can be used as donor." [GOC:pg, RHEA:83863]
+xref: RHEA:47656
+xref: RHEA:47660
+xref: RHEA:52680
 xref: RHEA:83863
 is_a: GO:0140379 ! amino acid acyltransferase activity
+property_value: skos:narrowMatch RHEA:47656
+property_value: skos:narrowMatch RHEA:47660
+property_value: skos:narrowMatch RHEA:52680
 property_value: skos:narrowMatch RHEA:83863
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29604" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31474" xsd:anyURI
@@ -483938,7 +485677,7 @@
 namespace: molecular_function
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: monocarboxylate(out) + Na+(out) = monocarboxylate(in) + Na+(in)." [GOC:ln, PMID:15322102]
 is_a: GO:0005343 ! organic acid:sodium symporter activity
-is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 created_by: pg
 creation_date: 2018-02-05T10:33:55Z
 
@@ -484041,6 +485780,13 @@
 xref: EC:1.1.1.50
 xref: RHEA:34779
 xref: RHEA:34783
+xref: RHEA:42116
+xref: RHEA:69016
+xref: RHEA:69028
+xref: RHEA:84155
+xref: RHEA:84199
+xref: RHEA:85551
+xref: RHEA:85559
 is_a: GO:0033764 ! steroid dehydrogenase activity, acting on the CH-OH group of donors, NAD or NADP as acceptor
 property_value: skos:broadMatch MetaCyc:1.1.1.209-RXN
 property_value: skos:exactMatch EC:1.1.1.357
@@ -484048,6 +485794,13 @@
 property_value: skos:narrowMatch EC:1.1.1.50
 property_value: skos:narrowMatch RHEA:34779
 property_value: skos:narrowMatch RHEA:34783
+property_value: skos:narrowMatch RHEA:42116
+property_value: skos:narrowMatch RHEA:69016
+property_value: skos:narrowMatch RHEA:69028
+property_value: skos:narrowMatch RHEA:84155
+property_value: skos:narrowMatch RHEA:84199
+property_value: skos:narrowMatch RHEA:85551
+property_value: skos:narrowMatch RHEA:85559
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29921" xsd:anyURI
 created_by: pg
 creation_date: 2025-04-09T15:19:24Z
@@ -484171,7 +485924,7 @@
 id: GO:0140177
 name: membrane-membrane adaptor activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together two membranes, either via membrane lipid binding or by interacting with a membrane protein, to establish or maintain the localization of the protein, protein complex or organelle." [GOC:curators]
+def: "The binding activity of a molecule that brings together two membranes, either via membrane lipid binding or by interacting with a membrane protein, to establish or maintain the localization of the protein, protein complex, vesicle or organelle." [GOC:curators]
 is_a: GO:0060090 ! molecular adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24964" xsd:anyURI
 created_by: pg
@@ -484284,7 +486037,7 @@
 xref: RHEA:59800
 xref: RHEA:83531
 xref: RHEA:85279
-is_a: GO:0016410 ! N-acyltransferase activity
+is_a: GO:0016747 ! acyltransferase activity, transferring groups other than amino-acyl groups
 is_a: GO:0140096 ! catalytic activity, acting on a protein
 property_value: skos:exactMatch RHEA:53916
 property_value: skos:narrowMatch RHEA:59764
@@ -485340,7 +487093,7 @@
 namespace: biological_process
 def: "The directed movement of gluconate from outside of a cell, across the plasma membrane and into the cytosol." [PMID:10735857]
 is_a: GO:0035429 ! gluconate transmembrane transport
-is_a: GO:0098739 ! import across plasma membrane
+is_a: GO:0098704 ! carbohydrate import across plasma membrane
 created_by: pg
 creation_date: 2018-10-01T08:47:35Z
 
@@ -485639,24 +487392,31 @@
 
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
 
@@ -486056,11 +487816,15 @@
 name: lysophospholipase C activity
 namespace: molecular_function
 def: "Hydrolysis of a lysoglycerophospholipid at the first phosphodiester bond between the phosphate and glycerol." [PMID:32917725]
+xref: RHEA:86371
 xref: RHEA:86375
 xref: RHEA:86379
+xref: RHEA:86383
 is_a: GO:0004629 ! C-type glycerophospholipase activity
+property_value: skos:narrowMatch RHEA:86371
 property_value: skos:narrowMatch RHEA:86375
 property_value: skos:narrowMatch RHEA:86379
+property_value: skos:narrowMatch RHEA:86383
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30949" xsd:anyURI
 created_by: pg
 creation_date: 2025-11-10T12:35:51Z
@@ -486538,7 +488302,6 @@
 name: cyclic-GMP-AMP transmembrane import across plasma membrane
 namespace: biological_process
 def: "The directed movement of cyclic-GMP-AMP from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31126740]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0070729 ! cyclic nucleotide transport
@@ -486737,7 +488500,6 @@
 def: "The chemical reactions and pathways resulting in the formation of psilocybin, a psychotropic tryptamine-derived natural product." [MetaCyc:PWY-7936, PMID:28763571]
 xref: MetaCyc:PWY-7936
 is_a: GO:0006568 ! L-tryptophan metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0035835 ! indole alkaloid biosynthetic process
 is_a: GO:0042435 ! indole-containing compound biosynthetic process
 is_a: GO:0043386 ! mycotoxin biosynthetic process
@@ -486880,7 +488642,7 @@
 namespace: biological_process
 def: "Any process that increases the rate, frequency, or extent of acetyl-CoA biosynthetic process." [PMID:41730913]
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0050812 ! regulation of acyl-CoA biosynthetic process
 is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
@@ -486896,8 +488658,8 @@
 namespace: biological_process
 def: "Any process that stops, prevents or reduces the frequency, rate or extent of acetyl-CoA biosynthetic process." [PMID:39019872]
 is_a: GO:0009890 ! negative regulation of biosynthetic process
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
 is_a: GO:0050812 ! regulation of acyl-CoA biosynthetic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 intersection_of: GO:0065007 ! biological regulation
@@ -487051,6 +488813,26 @@
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
@@ -487163,6 +488945,18 @@
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
@@ -487481,13 +489275,14 @@
 id: GO:0140443
 name: mitochondrion-plasma membrane adaptor activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together a mitochondrion and a plasma membrane either via membrane lipid binding or by interacting with a mitochondrial outer membrane protein, to establish or maintain the localization of the mitochondrion." [PMID:31582398]
+def: "The binding activity of a molecule that brings together a mitochondrial outer membrane and a plasma membrane either via membrane lipid binding or by interacting with a mitochondrial outer membrane protein, to establish or maintain the localization of the mitochondrion." [PMID:31582398]
 synonym: "mitochondrion plasma membrane adaptor activity" EXACT []
 synonym: "mitochondrion plasma membrane tether activity" EXACT []
 synonym: "plasma membrane-mitochondrion adaptor activity" EXACT []
 synonym: "plasma membrane-mitochondrion tether activity" EXACT []
-is_a: GO:0043495 ! protein-membrane adaptor activity
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19090" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: pg
 creation_date: 2020-03-24T13:11:20Z
 
@@ -487823,7 +489618,7 @@
 id: GO:0140474
 name: mitochondrion-endoplasmic reticulum membrane tether activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together a mitochondrion and an ER membrane either via membrane lipid binding or by interacting with a mitochondrial outer membrane protein, to establish or maintain the localization of the mitochondrion." [PMID:19556461, PMID:27875684]
+def: "The binding activity of a molecule that brings together a mitochondrial outer membrane and an ER membrane either via membrane lipid binding or by interacting with a mitochondrial outer membrane protein, to establish or maintain the localization of the mitochondrion." [PMID:19556461, PMID:27875684]
 synonym: "endoplasmic reticulum-mitochondrion membrane adaptor activity" EXACT []
 synonym: "endoplasmic reticulum-mitochondrion membrane tether activity" EXACT []
 synonym: "ER-mitochondrion membrane adaptor activity" EXACT []
@@ -487833,6 +489628,7 @@
 synonym: "mitochondrion-ER membrane tether activity" EXACT []
 is_a: GO:0170009 ! endoplasmic reticulum-organelle membrane tether activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19634" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: pg
 creation_date: 2020-06-22T07:01:14Z
 
@@ -487841,7 +489637,7 @@
 name: spindle pole body anchor activity
 namespace: molecular_function
 def: "The binding activity of a protein that brings together the spindle pole body and one or more other molecules, permitting them to function in a coordinated way." [PMID:19942852]
-is_a: GO:0008093 ! cytoskeletal anchor activity
+is_a: GO:0008093 ! cytoskeletal adaptor activity
 created_by: pg
 creation_date: 2020-06-23T15:54:56Z
 
@@ -487908,7 +489704,6 @@
 name: 5-aminolevulinic acid import across plasma membrane
 namespace: biological_process
 def: "The directed movement of 5-aminolevulinic acid from outside of a cell, across the plasma membrane and into the cytosol." [PMID:31989647]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015718 ! monocarboxylic acid transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -488163,13 +489958,14 @@
 id: GO:0140506
 name: endoplasmic reticulum-autophagosome adaptor activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together an ER membrane and an autophagosome during reticulophagy." [PMID:32735772]
+def: "The binding activity of a molecule that brings together an ER membrane and an autophagosome membrane during reticulophagy." [PMID:32735772]
 synonym: "autophagosome-endoplasmic reticulum anchor" EXACT []
 synonym: "autophagosome-ER anchor" EXACT []
 synonym: "ER- autophagosome anchor" EXACT []
 is_a: GO:0160183 ! autophagosome-membrane adaptor activity
 is_a: GO:0170009 ! endoplasmic reticulum-organelle membrane tether activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19873" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: pg
 creation_date: 2020-08-27T11:04:43Z
 
@@ -488847,10 +490643,11 @@
 id: GO:0140580
 name: mitochondrion autophagosome adaptor activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together a mitochondrial membrane and an autophagosome during mitophagy." [PMID:33138913]
+def: "The binding activity of a molecule that brings together a mitochondrial membrane and an autophagosome membrane during mitophagy." [PMID:33138913]
 synonym: "mitophagy receptor" EXACT []
 is_a: GO:0160183 ! autophagosome-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/20668" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: pg
 creation_date: 2021-01-18T11:03:49Z
 
@@ -489051,7 +490848,7 @@
 id: GO:0140597
 name: protein carrier activity
 namespace: molecular_function
-def: "Binding to and carrying a protein to an acceptor molecule or to a specific location by moving along with the target protein." [PMID:7628437]
+def: "Directly binding to a protein and delivering it either to an acceptor molecule or to a specific location." [PMID:7628437]
 synonym: "protein carrier chaperone" EXACT []
 synonym: "protein chaperone" BROAD []
 is_a: GO:0140104 ! molecular carrier activity
@@ -489270,7 +491067,6 @@
 xref: MetaCyc:FERRIC-CHELATE-REDUCTASE-RXN
 xref: RHEA:15061
 is_a: GO:0000293 ! ferric-chelate reductase activity
-is_a: GO:0016723 ! oxidoreductase activity, acting on metal ions, NAD or NADP as acceptor
 property_value: skos:exactMatch EC:1.16.1.7
 property_value: skos:exactMatch RHEA:15061
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21029" xsd:anyURI
@@ -490858,10 +492654,11 @@
 
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
@@ -490873,6 +492670,7 @@
 property_value: skos:narrowMatch RHEA:75883
 property_value: skos:narrowMatch RHEA:75887
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22480" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31850" xsd:anyURI
 created_by: pg
 creation_date: 2021-11-30T08:29:49Z
 
@@ -491863,6 +493661,7 @@
 def: "Enables the transfer of a solute or solutes from one side of a membrane to the other according to the reaction: orotate(out) + anion (in) = orotate (in) + anion (out)." [PMID:21350910, PMID:35144162]
 synonym: "orotate:anion antiporter activity" BROAD []
 synonym: "orotate:organic anion antiporter activity" NARROW []
+is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0008509 ! monoatomic anion transmembrane transporter activity
 is_a: GO:0015297 ! antiporter activity
 is_a: GO:0015355 ! secondary active monocarboxylate transmembrane transporter activity
@@ -491954,16 +493753,22 @@
 xref: EC:3.6.1.74
 xref: MetaCyc:POLYNUCLEOTIDE-5-PHOSPHATASE-RXN
 xref: RHEA:11008
+xref: RHEA:60828
+xref: RHEA:60832
 xref: RHEA:67004
+is_a: GO:0004651 ! polynucleotide 5'-phosphatase activity
 is_a: GO:0016462 ! pyrophosphatase activity
 is_a: GO:0140098 ! catalytic activity, acting on RNA
 property_value: skos:exactMatch EC:3.6.1.74
 property_value: skos:exactMatch RHEA:67004
 property_value: skos:narrowMatch RHEA:11008
+property_value: skos:narrowMatch RHEA:60828
+property_value: skos:narrowMatch RHEA:60832
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23319" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25810" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/26929" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31924" xsd:anyURI
 created_by: pg
 creation_date: 2022-05-16T06:01:07Z
 
@@ -491994,7 +493799,6 @@
 namespace: biological_process
 def: "The directed movement of UDP-beta-L-arabinofuranose from the cytosol to the Golgi apparatus of a cell." [PMID:28373556]
 synonym: "cytosol to Golgi apparatus UDP-beta-L-arabinofuranose transport" EXACT []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 is_a: GO:0140820 ! cytosol to Golgi apparatus transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/21524" xsd:anyURI
@@ -493462,7 +495266,6 @@
 name: L-phenylalanine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of L-phenylalanine from outside of a cell, across the plasma membrane and into the cytosol." [PMID:11069779]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015823 ! phenylalanine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
@@ -493550,10 +495353,14 @@
 synonym: "m(7)GpppX diphosphatase activity" EXACT [EC:3.6.1.59]
 synonym: "m(7)GpppX pyrophosphatase activity" EXACT [EC:3.6.1.59]
 xref: EC:3.6.1.59
+xref: RHEA:37099
+xref: RHEA:37103
 xref: RHEA:65384
 xref: RHEA:65388
 is_a: GO:0016462 ! pyrophosphatase activity
 property_value: skos:exactMatch EC:3.6.1.59
+property_value: skos:narrowMatch RHEA:37099
+property_value: skos:narrowMatch RHEA:37103
 property_value: skos:narrowMatch RHEA:65384
 property_value: skos:narrowMatch RHEA:65388
 created_by: pg
@@ -493567,11 +495374,15 @@
 synonym: "m(7)GpppN-mRNA hydrolase activity" EXACT []
 xref: EC:3.6.1.62
 xref: RHEA:37371
+xref: RHEA:60868
+xref: RHEA:60872
 xref: RHEA:67484
 is_a: GO:0016462 ! pyrophosphatase activity
 property_value: skos:exactMatch EC:3.6.1.62
 property_value: skos:exactMatch RHEA:67484
 property_value: skos:narrowMatch RHEA:37371
+property_value: skos:narrowMatch RHEA:60868
+property_value: skos:narrowMatch RHEA:60872
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/23290" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/30193" xsd:anyURI
 created_by: pg
@@ -496305,7 +498116,7 @@
 name: regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that modulates the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010749 ! regulation of nitric oxide mediated signal transduction
+is_a: GO:1902531 ! regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496318,8 +498129,8 @@
 name: positive regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that increases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:14615391]
-is_a: GO:0010750 ! positive regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902533 ! positive regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: positively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -496332,8 +498143,8 @@
 name: negative regulation of nitric oxide-cGMP mediated signal transduction
 namespace: biological_process
 def: "Any process that decreases the rate, frequency or extent of nitric oxide-cGMP mediated signal transduction." [PMID:35931019]
-is_a: GO:0010751 ! negative regulation of nitric oxide mediated signal transduction
 is_a: GO:0141149 ! regulation of nitric oxide-cGMP mediated signal transduction
+is_a: GO:1902532 ! negative regulation of intracellular signal transduction
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
 relationship: negatively_regulates GO:0038060 ! nitric oxide-cGMP-mediated signaling
@@ -500877,13 +502688,17 @@
 synonym: "quinol-nitrate oxidoreductase activity" RELATED [EC:1.7.5.1]
 xref: EC:1.7.5.1
 xref: RHEA:29119
+xref: RHEA:29123
 xref: RHEA:29127
+xref: RHEA:29131
 xref: RHEA:56144
 is_a: GO:0008940 ! nitrate reductase activity
 property_value: skos:exactMatch EC:1.7.5.1
 property_value: skos:exactMatch RHEA:56144
 property_value: skos:narrowMatch RHEA:29119
+property_value: skos:narrowMatch RHEA:29123
 property_value: skos:narrowMatch RHEA:29127
+property_value: skos:narrowMatch RHEA:29131
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27675" xsd:anyURI
 created_by: rynl
 creation_date: 2024-04-24T22:45:01Z
@@ -500892,11 +502707,12 @@
 id: GO:0160183
 name: autophagosome-membrane adaptor activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together a target membrane and an autophagosome during autophagy." [PMID:30544615, PMID:36635405]
-is_a: GO:0043495 ! protein-membrane adaptor activity
+def: "The binding activity of a molecule that brings together a target membrane and an autophagosome membrane during autophagy." [PMID:30544615, PMID:36635405]
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 is_a: GO:0160247 ! autophagy cargo adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27704" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28285" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: rynl
 creation_date: 2024-04-25T00:20:20Z
 
@@ -500970,9 +502786,10 @@
 id: GO:0160190
 name: peroxisome-mitochondrion membrane tether activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together the peroxisome and the mitochondrial outer membrane, establishing the localization of the peroxisome close to the mitochondrion." [PMID:29720625, PMID:38669296]
-is_a: GO:0043495 ! protein-membrane adaptor activity
+def: "The binding activity of a molecule that brings together the peroxisome membrane and the mitochondrial outer membrane, establishing the localization of the peroxisome close to the mitochondrion." [PMID:29720625, PMID:38669296]
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28255" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: rynl
 creation_date: 2024-06-24T22:53:31Z
 
@@ -500986,18 +502803,30 @@
 xref: MetaCyc:RXN-22825
 xref: MetaCyc:RXN-22826
 xref: MetaCyc:RXN-22827
+xref: RHEA:69831
+xref: RHEA:69835
+xref: RHEA:69839
+xref: RHEA:69871
+xref: RHEA:70003
 xref: RHEA:70059
 xref: RHEA:70063
 xref: RHEA:70067
+xref: RHEA:70071
 is_a: GO:0008395 ! steroid hydroxylase activity
 is_a: GO:0016712 ! oxidoreductase activity, acting on paired donors, with incorporation or reduction of molecular oxygen, reduced flavin or flavoprotein as one donor, and incorporation of one atom of oxygen
 property_value: skos:exactMatch EC:1.14.14.178
 property_value: skos:narrowMatch MetaCyc:RXN-22825
 property_value: skos:narrowMatch MetaCyc:RXN-22826
 property_value: skos:narrowMatch MetaCyc:RXN-22827
+property_value: skos:narrowMatch RHEA:69831
+property_value: skos:narrowMatch RHEA:69835
+property_value: skos:narrowMatch RHEA:69839
+property_value: skos:narrowMatch RHEA:69871
+property_value: skos:narrowMatch RHEA:70003
 property_value: skos:narrowMatch RHEA:70059
 property_value: skos:narrowMatch RHEA:70063
 property_value: skos:narrowMatch RHEA:70067
+property_value: skos:narrowMatch RHEA:70071
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28221" xsd:anyURI
 created_by: rynl
 creation_date: 2024-06-27T00:40:39Z
@@ -501136,14 +502965,16 @@
 
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
 
@@ -501154,8 +502985,9 @@
 def: "The binding activity of a molecule that brings together two mitochondrion membranes via membrane lipid binding or by interacting with a mitochondrial outer membrane protein, to establish or maintain the localization of the mitochondrion." [PMID:38843396]
 synonym: "mitochondrion membrane tether activity" RELATED []
 synonym: "mitochondrion outer membrane tether activity" RELATED []
-is_a: GO:0043495 ! protein-membrane adaptor activity
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28694" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: rynl
 creation_date: 2024-08-15T17:06:16Z
 
@@ -501280,8 +503112,9 @@
 name: endoplasmic reticulum-plasma membrane adaptor activity
 namespace: molecular_function
 def: "The binding activity of a molecule that brings together a plasma membrane with an endoplasmic reticulum membrane, via membrane lipid binding, to establish membrane contact sites and mediate exchange and communication." [PMID:23041194, PMID:39239853]
-is_a: GO:0043495 ! protein-membrane adaptor activity
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/28899" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: rynl
 creation_date: 2024-09-12T20:22:40Z
 
@@ -501478,9 +503311,10 @@
 id: GO:0160229
 name: peroxisome-endoplasmic reticulum membrane tether activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together a peroxisome and an ER membrane, either via membrane lipid binding or by interacting with a membrane protein." [PMID:39271061]
+def: "The binding activity of a molecule that brings together a peroxisome membrane and an ER membrane, either via membrane lipid binding or by interacting with a membrane protein." [PMID:39271061]
 is_a: GO:0170009 ! endoplasmic reticulum-organelle membrane tether activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29432" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: rynl
 creation_date: 2024-12-17T01:17:43Z
 
@@ -502345,9 +504179,11 @@
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
@@ -502445,8 +504281,8 @@
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
@@ -502456,8 +504292,8 @@
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
@@ -502467,7 +504303,7 @@
 name: octopamine loading into synaptic vesicle
 namespace: biological_process
 def: "The active transport of octopamine neurotransmitters into a synaptic vesicle." [PMID:15849736, PMID:9870940]
-is_a: GO:0098700 ! neurotransmitter loading into synaptic vesicle
+is_a: GO:0015842 ! aminergic neurotransmitter loading into synaptic vesicle
 is_a: GO:7770033 ! octopamine transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31143" xsd:anyURI
 created_by: rynl
@@ -502584,6 +504420,17 @@
 replaced_by: GO:0004447
 
 [Term]
+id: GO:0160321
+name: vesicle docking activity
+namespace: molecular_function
+def: "The binding activity of a protein that directly mediates the stable attachment of a transport vesicle to a target membrane, bringing the two membranes into close apposition." [PMID:28237810]
+comment: Vesicle docking activity succeeds vesicle tethering activity and precedes fusogenic activity in the vesicle membrane fusion pathway.
+is_a: GO:0140177 ! membrane-membrane adaptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31880" xsd:anyURI
+created_by: rynl
+creation_date: 2026-04-17T21:35:33Z
+
+[Term]
 id: GO:0170001
 name: ergothioneine transmembrane transporter activity
 namespace: molecular_function
@@ -502663,7 +504510,7 @@
 name: mRNA phosphatase activator activity
 namespace: molecular_function
 def: "Binds to and increases the activity of mRNA phosphatase." [PMID:22323607]
-is_a: GO:0008047 ! enzyme activator activity
+is_a: GO:0019211 ! phosphatase activator activity
 relationship: positively_regulates GO:0140818 ! mRNA 5'-triphosphate monophosphatase activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/24720" xsd:anyURI
 created_by: ew
@@ -502674,8 +504521,9 @@
 name: endoplasmic reticulum-organelle membrane tether activity
 namespace: molecular_function
 def: "The binding activity of a molecule that brings together two membranes, either via membrane lipid binding or by interacting with a membrane protein, to establish or maintain membrane contact sites and mediate organelle exchange and communication." [PMID:29858488]
-is_a: GO:0043495 ! protein-membrane adaptor activity
+is_a: GO:0140177 ! membrane-membrane adaptor activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25429" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: ew
 creation_date: 2023-06-29T16:28:28Z
 
@@ -502751,9 +504599,10 @@
 id: GO:0170016
 name: endoplasmic reticulum-endosome tether activity
 namespace: molecular_function
-def: "The binding activity of a molecule that brings together an endosome and an ER membrane either via membrane lipid binding or by interacting with an endosome protein, to establish and facilitate organelle exchange." [PMID:33124732]
+def: "The binding activity of a molecule that brings together an endosome membrane and an ER membrane either via membrane lipid binding or by interacting with an endosome protein, to establish and facilitate organelle exchange." [PMID:33124732]
 is_a: GO:0170009 ! endoplasmic reticulum-organelle membrane tether activity
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/25429" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31866" xsd:anyURI
 created_by: ew
 creation_date: 2023-06-29T16:31:41Z
 
@@ -502976,7 +504825,6 @@
 name: isopentenyl pyrophosphate import into mitochondrion
 namespace: biological_process
 def: "The process in which isopentenyl pyrophosphate is transported across a membrane into the mitochondrion." [GOC:ew, PMID:37813972]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0032365 ! intracellular lipid transport
 is_a: GO:0170036 ! import into the mitochondrion
@@ -509241,16 +511089,13 @@
 
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
 
@@ -511150,53 +512995,42 @@
 
 [Term]
 id: GO:1900318
-name: regulation of methane biosynthetic process from dimethylamine
+name: obsolete regulation of methane biosynthetic process from dimethylamine
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0033238 ! regulation of amine metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001129 ! methane biosynthetic process from dimethylamine
-relationship: regulates GO:2001129 ! methane biosynthetic process from dimethylamine
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:43:21Z
 
 [Term]
 id: GO:1900319
-name: negative regulation of methane biosynthetic process from dimethylamine
+name: obsolete negative regulation of methane biosynthetic process from dimethylamine
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from dimethylamine" NARROW [GOC:TermGenie]
-is_a: GO:0033239 ! negative regulation of amine metabolic process
-is_a: GO:1900318 ! regulation of methane biosynthetic process from dimethylamine
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001129 ! methane biosynthetic process from dimethylamine
-relationship: negatively_regulates GO:2001129 ! methane biosynthetic process from dimethylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:43:31Z
 
 [Term]
 id: GO:1900320
-name: positive regulation of methane biosynthetic process from dimethylamine
+name: obsolete positive regulation of methane biosynthetic process from dimethylamine
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from dimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from dimethylamine" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from dimethylamine" EXACT [GOC:TermGenie]
-is_a: GO:0033240 ! positive regulation of amine metabolic process
-is_a: GO:1900318 ! regulation of methane biosynthetic process from dimethylamine
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001129 ! methane biosynthetic process from dimethylamine
-relationship: positively_regulates GO:2001129 ! methane biosynthetic process from dimethylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:43:40Z
 
@@ -511340,360 +513174,288 @@
 
 [Term]
 id: GO:1900330
-name: regulation of methane biosynthetic process from trimethylamine
+name: obsolete regulation of methane biosynthetic process from trimethylamine
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0033238 ! regulation of amine metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001130 ! methane biosynthetic process from trimethylamine
-relationship: regulates GO:2001130 ! methane biosynthetic process from trimethylamine
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:53:03Z
 
 [Term]
 id: GO:1900331
-name: negative regulation of methane biosynthetic process from trimethylamine
+name: obsolete negative regulation of methane biosynthetic process from trimethylamine
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from trimethylamine" NARROW [GOC:TermGenie]
-is_a: GO:0033239 ! negative regulation of amine metabolic process
-is_a: GO:1900330 ! regulation of methane biosynthetic process from trimethylamine
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001130 ! methane biosynthetic process from trimethylamine
-relationship: negatively_regulates GO:2001130 ! methane biosynthetic process from trimethylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:53:12Z
 
 [Term]
 id: GO:1900332
-name: positive regulation of methane biosynthetic process from trimethylamine
+name: obsolete positive regulation of methane biosynthetic process from trimethylamine
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from trimethylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from trimethylamine" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from trimethylamine" EXACT [GOC:TermGenie]
-is_a: GO:0033240 ! positive regulation of amine metabolic process
-is_a: GO:1900330 ! regulation of methane biosynthetic process from trimethylamine
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001130 ! methane biosynthetic process from trimethylamine
-relationship: positively_regulates GO:2001130 ! methane biosynthetic process from trimethylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:53:20Z
 
 [Term]
 id: GO:1900333
-name: regulation of methane biosynthetic process from 3-(methylthio)propionic acid
+name: obsolete regulation of methane biosynthetic process from 3-(methylthio)propionic acid
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0019217 ! regulation of fatty acid metabolic process
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
-relationship: regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:56:13Z
 
 [Term]
 id: GO:1900334
-name: negative regulation of methane biosynthetic process from 3-(methylthio)propionic acid
+name: obsolete negative regulation of methane biosynthetic process from 3-(methylthio)propionic acid
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from 3-(methylthio)propionic acid" NARROW [GOC:TermGenie]
-is_a: GO:0045922 ! negative regulation of fatty acid metabolic process
-is_a: GO:1900333 ! regulation of methane biosynthetic process from 3-(methylthio)propionic acid
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
-relationship: negatively_regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:56:23Z
 
 [Term]
 id: GO:1900335
-name: positive regulation of methane biosynthetic process from 3-(methylthio)propionic acid
+name: obsolete positive regulation of methane biosynthetic process from 3-(methylthio)propionic acid
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from 3-(methylthio)propionic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from 3-(methylthio)propionic acid" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from 3-(methylthio)propionic acid" EXACT [GOC:TermGenie]
-is_a: GO:0045923 ! positive regulation of fatty acid metabolic process
-is_a: GO:1900333 ! regulation of methane biosynthetic process from 3-(methylthio)propionic acid
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
-relationship: positively_regulates GO:2001132 ! methane biosynthetic process from 3-(methylthio)propionic acid
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T01:56:31Z
 
 [Term]
 id: GO:1900336
-name: regulation of methane biosynthetic process from carbon monoxide
+name: obsolete regulation of methane biosynthetic process from carbon monoxide
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
-relationship: regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:03:15Z
 
 [Term]
 id: GO:1900337
-name: negative regulation of methane biosynthetic process from carbon monoxide
+name: obsolete negative regulation of methane biosynthetic process from carbon monoxide
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from carbon monoxide" NARROW [GOC:TermGenie]
-is_a: GO:1900336 ! regulation of methane biosynthetic process from carbon monoxide
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
-relationship: negatively_regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:03:24Z
 
 [Term]
 id: GO:1900338
-name: positive regulation of methane biosynthetic process from carbon monoxide
+name: obsolete positive regulation of methane biosynthetic process from carbon monoxide
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from carbon monoxide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from carbon monoxide" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from carbon monoxide" EXACT [GOC:TermGenie]
-is_a: GO:1900336 ! regulation of methane biosynthetic process from carbon monoxide
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
-relationship: positively_regulates GO:2001134 ! methane biosynthetic process from carbon monoxide
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:03:33Z
 
 [Term]
 id: GO:1900339
-name: regulation of methane biosynthetic process from formic acid
+name: obsolete regulation of methane biosynthetic process from formic acid
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0010565 ! regulation of ketone metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001127 ! methane biosynthetic process from formic acid
-relationship: regulates GO:2001127 ! methane biosynthetic process from formic acid
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:04:53Z
 
 [Term]
 id: GO:1900340
-name: negative regulation of methane biosynthetic process from formic acid
+name: obsolete negative regulation of methane biosynthetic process from formic acid
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from formic acid" NARROW [GOC:TermGenie]
-is_a: GO:0062014 ! negative regulation of small molecule metabolic process
-is_a: GO:1900339 ! regulation of methane biosynthetic process from formic acid
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001127 ! methane biosynthetic process from formic acid
-relationship: negatively_regulates GO:2001127 ! methane biosynthetic process from formic acid
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:05:03Z
 
 [Term]
 id: GO:1900341
-name: positive regulation of methane biosynthetic process from formic acid
+name: obsolete positive regulation of methane biosynthetic process from formic acid
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from formic acid." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from formic acid" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from formic acid" EXACT [GOC:TermGenie]
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
-is_a: GO:1900339 ! regulation of methane biosynthetic process from formic acid
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001127 ! methane biosynthetic process from formic acid
-relationship: positively_regulates GO:2001127 ! methane biosynthetic process from formic acid
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:05:11Z
 
 [Term]
 id: GO:1900342
-name: regulation of methane biosynthetic process from dimethyl sulfide
+name: obsolete regulation of methane biosynthetic process from dimethyl sulfide
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
-relationship: regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:06:38Z
 
 [Term]
 id: GO:1900343
-name: negative regulation of methane biosynthetic process from dimethyl sulfide
+name: obsolete negative regulation of methane biosynthetic process from dimethyl sulfide
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from dimethyl sulfide" NARROW [GOC:TermGenie]
-is_a: GO:1900342 ! regulation of methane biosynthetic process from dimethyl sulfide
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
-relationship: negatively_regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:06:47Z
 
 [Term]
 id: GO:1900344
-name: positive regulation of methane biosynthetic process from dimethyl sulfide
+name: obsolete positive regulation of methane biosynthetic process from dimethyl sulfide
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from dimethyl sulfide." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from dimethyl sulfide" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from dimethyl sulfide" EXACT [GOC:TermGenie]
-is_a: GO:1900342 ! regulation of methane biosynthetic process from dimethyl sulfide
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
-relationship: positively_regulates GO:2001131 ! methane biosynthetic process from dimethyl sulfide
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:06:56Z
 
 [Term]
 id: GO:1900345
-name: regulation of methane biosynthetic process from methanethiol
+name: obsolete regulation of methane biosynthetic process from methanethiol
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001133 ! methane biosynthetic process from methanethiol
-relationship: regulates GO:2001133 ! methane biosynthetic process from methanethiol
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:09:49Z
 
 [Term]
 id: GO:1900346
-name: negative regulation of methane biosynthetic process from methanethiol
+name: obsolete negative regulation of methane biosynthetic process from methanethiol
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from methanethiol" NARROW [GOC:TermGenie]
-is_a: GO:1900345 ! regulation of methane biosynthetic process from methanethiol
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001133 ! methane biosynthetic process from methanethiol
-relationship: negatively_regulates GO:2001133 ! methane biosynthetic process from methanethiol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:09:58Z
 
 [Term]
 id: GO:1900347
-name: positive regulation of methane biosynthetic process from methanethiol
+name: obsolete positive regulation of methane biosynthetic process from methanethiol
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from methanethiol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from methanethiol" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from methanethiol" EXACT [GOC:TermGenie]
-is_a: GO:1900345 ! regulation of methane biosynthetic process from methanethiol
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001133 ! methane biosynthetic process from methanethiol
-relationship: positively_regulates GO:2001133 ! methane biosynthetic process from methanethiol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:10:06Z
 
 [Term]
 id: GO:1900348
-name: regulation of methane biosynthetic process from methylamine
+name: obsolete regulation of methane biosynthetic process from methylamine
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
-is_a: GO:0033238 ! regulation of amine metabolic process
-is_a: GO:0043457 ! regulation of cellular respiration
-is_a: GO:1901577 ! regulation of alkane biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:2001128 ! methane biosynthetic process from methylamine
-relationship: regulates GO:2001128 ! methane biosynthetic process from methylamine
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:11:54Z
 
 [Term]
 id: GO:1900349
-name: negative regulation of methane biosynthetic process from methylamine
+name: obsolete negative regulation of methane biosynthetic process from methylamine
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
 synonym: "down-regulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
 synonym: "downregulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
 synonym: "inhibition of methane biosynthetic process from methylamine" NARROW [GOC:TermGenie]
-is_a: GO:0033239 ! negative regulation of amine metabolic process
-is_a: GO:1900348 ! regulation of methane biosynthetic process from methylamine
-is_a: GO:1901578 ! negative regulation of alkane biosynthetic process
-is_a: GO:1901856 ! negative regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:2001128 ! methane biosynthetic process from methylamine
-relationship: negatively_regulates GO:2001128 ! methane biosynthetic process from methylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:12:04Z
 
 [Term]
 id: GO:1900350
-name: positive regulation of methane biosynthetic process from methylamine
+name: obsolete positive regulation of methane biosynthetic process from methylamine
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of methane biosynthetic process from methylamine." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of methane biosynthetic process from methylamine" NARROW [GOC:TermGenie]
 synonym: "up regulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
 synonym: "up-regulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
 synonym: "upregulation of methane biosynthetic process from methylamine" EXACT [GOC:TermGenie]
-is_a: GO:0033240 ! positive regulation of amine metabolic process
-is_a: GO:1900348 ! regulation of methane biosynthetic process from methylamine
-is_a: GO:1901579 ! positive regulation of alkane biosynthetic process
-is_a: GO:1901857 ! positive regulation of cellular respiration
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:2001128 ! methane biosynthetic process from methylamine
-relationship: positively_regulates GO:2001128 ! methane biosynthetic process from methylamine
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-04-06T02:12:12Z
 
@@ -514457,23 +516219,22 @@
 
 [Term]
 id: GO:1900494
-name: regulation of butyryl-CoA biosynthetic process from acetyl-CoA
+name: obsolete regulation of butyryl-CoA biosynthetic process from acetyl-CoA
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0042304 ! regulation of fatty acid biosynthetic process
-is_a: GO:0050812 ! regulation of acyl-CoA biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
-relationship: regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:51:38Z
 
 [Term]
 id: GO:1900495
-name: negative regulation of butyryl-CoA biosynthetic process from acetyl-CoA
+name: obsolete negative regulation of butyryl-CoA biosynthetic process from acetyl-CoA
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "down regulation of butyryl-CoA biosynthetic process from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "down-regulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
@@ -514483,21 +516244,17 @@
 synonym: "inhibition of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "inhibition of butyryl-CoA biosynthetic process from acetyl-CoA" NARROW [GOC:TermGenie]
 synonym: "negative regulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0045717 ! negative regulation of fatty acid biosynthetic process
-is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
-is_a: GO:1900494 ! regulation of butyryl-CoA biosynthetic process from acetyl-CoA
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
-relationship: negatively_regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:51:49Z
 
 [Term]
 id: GO:1900496
-name: positive regulation of butyryl-CoA biosynthetic process from acetyl-CoA
+name: obsolete positive regulation of butyryl-CoA biosynthetic process from acetyl-CoA
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of butyryl-CoA biosynthetic process from acetyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "activation of butyryl-CoA biosynthetic process from acetyl-CoA" NARROW [GOC:TermGenie]
 synonym: "positive regulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
@@ -514507,39 +516264,29 @@
 synonym: "up-regulation of butyryl-CoA biosynthetic process from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA biosynthesis from acetyl-CoA" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA biosynthetic process from acetyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0045723 ! positive regulation of fatty acid biosynthetic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
-is_a: GO:1900494 ! regulation of butyryl-CoA biosynthetic process from acetyl-CoA
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
-relationship: positively_regulates GO:0044579 ! butyryl-CoA biosynthetic process from acetyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:51:58Z
 
 [Term]
 id: GO:1900497
-name: regulation of butyryl-CoA catabolic process to butanol
+name: obsolete regulation of butyryl-CoA catabolic process to butanol
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
-is_a: GO:0019217 ! regulation of fatty acid metabolic process
-is_a: GO:0019219 ! regulation of nucleobase-containing compound metabolic process
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0046890 ! regulation of lipid biosynthetic process
-is_a: GO:0050994 ! regulation of lipid catabolic process
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
-is_a: GO:1902930 ! regulation of alcohol biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
-relationship: regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:53:20Z
 
 [Term]
 id: GO:1900498
-name: negative regulation of butyryl-CoA catabolic process to butanol
+name: obsolete negative regulation of butyryl-CoA catabolic process to butanol
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of butyryl-CoA catabolic process to butanol" EXACT [GOC:TermGenie]
 synonym: "down regulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
 synonym: "down-regulation of butyryl-CoA catabolic process to butanol" EXACT [GOC:TermGenie]
@@ -514549,24 +516296,17 @@
 synonym: "inhibition of butyryl-CoA catabolic process to butanol" NARROW [GOC:TermGenie]
 synonym: "inhibition of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
 synonym: "negative regulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
-is_a: GO:0045922 ! negative regulation of fatty acid metabolic process
-is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
-is_a: GO:0050995 ! negative regulation of lipid catabolic process
-is_a: GO:0051055 ! negative regulation of lipid biosynthetic process
-is_a: GO:1900497 ! regulation of butyryl-CoA catabolic process to butanol
-is_a: GO:1902931 ! negative regulation of alcohol biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
-relationship: negatively_regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:53:31Z
 
 [Term]
 id: GO:1900499
-name: positive regulation of butyryl-CoA catabolic process to butanol
+name: obsolete positive regulation of butyryl-CoA catabolic process to butanol
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of butyryl-CoA catabolic process to butanol." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of butyryl-CoA catabolic process to butanol" NARROW [GOC:TermGenie]
 synonym: "activation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
 synonym: "positive regulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
@@ -514576,40 +516316,29 @@
 synonym: "up-regulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA catabolic process to butanol" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA catabolism to butanol" EXACT [GOC:TermGenie]
-is_a: GO:0045923 ! positive regulation of fatty acid metabolic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
-is_a: GO:0046889 ! positive regulation of lipid biosynthetic process
-is_a: GO:0050996 ! positive regulation of lipid catabolic process
-is_a: GO:1900497 ! regulation of butyryl-CoA catabolic process to butanol
-is_a: GO:1902932 ! positive regulation of alcohol biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
-relationship: positively_regulates GO:0044582 ! butyryl-CoA catabolic process to butanol
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:53:40Z
 
 [Term]
 id: GO:1900500
-name: regulation of butyryl-CoA catabolic process to butyrate
+name: obsolete regulation of butyryl-CoA catabolic process to butyrate
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
-is_a: GO:0019219 ! regulation of nucleobase-containing compound metabolic process
-is_a: GO:0042304 ! regulation of fatty acid biosynthetic process
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0050994 ! regulation of lipid catabolic process
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
-relationship: regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:56:19Z
 
 [Term]
 id: GO:1900501
-name: negative regulation of butyryl-CoA catabolic process to butyrate
+name: obsolete negative regulation of butyryl-CoA catabolic process to butyrate
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of butyryl-CoA catabolic process to butyrate" EXACT [GOC:TermGenie]
 synonym: "down regulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
 synonym: "down-regulation of butyryl-CoA catabolic process to butyrate" EXACT [GOC:TermGenie]
@@ -514619,22 +516348,17 @@
 synonym: "inhibition of butyryl-CoA catabolic process to butyrate" NARROW [GOC:TermGenie]
 synonym: "inhibition of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
 synonym: "negative regulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
-is_a: GO:0045717 ! negative regulation of fatty acid biosynthetic process
-is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
-is_a: GO:0050995 ! negative regulation of lipid catabolic process
-is_a: GO:1900500 ! regulation of butyryl-CoA catabolic process to butyrate
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
-relationship: negatively_regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:56:30Z
 
 [Term]
 id: GO:1900502
-name: positive regulation of butyryl-CoA catabolic process to butyrate
+name: obsolete positive regulation of butyryl-CoA catabolic process to butyrate
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of butyryl-CoA catabolic process to butyrate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of butyryl-CoA catabolic process to butyrate" NARROW [GOC:TermGenie]
 synonym: "activation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
 synonym: "positive regulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
@@ -514644,13 +516368,8 @@
 synonym: "up-regulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA catabolic process to butyrate" EXACT [GOC:TermGenie]
 synonym: "upregulation of butyryl-CoA catabolism to butyrate" EXACT [GOC:TermGenie]
-is_a: GO:0045723 ! positive regulation of fatty acid biosynthetic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
-is_a: GO:0050996 ! positive regulation of lipid catabolic process
-is_a: GO:1900500 ! regulation of butyryl-CoA catabolic process to butyrate
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
-relationship: positively_regulates GO:0044581 ! butyryl-CoA catabolic process to butyrate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-05-02T03:56:40Z
 
@@ -520018,7 +521737,6 @@
 synonym: "deoxycarnitine transport" RELATED [GOC:TermGenie]
 synonym: "gamma-Butyrobetain transport" EXACT [GOC:TermGenie]
 synonym: "gamma-butyrobetaine transport" EXACT [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015838 ! amino-acid betaine transport
 created_by: jl
 creation_date: 2012-05-29T02:32:37Z
@@ -520049,7 +521767,6 @@
 synonym: "Adriamycin transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicine transport" RELATED [GOC:TermGenie]
 synonym: "doxorubicinum transport" RELATED [GOC:TermGenie]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015850 ! organic hydroxy compound transport
 is_a: GO:0071705 ! nitrogen compound transport
 is_a: GO:1901656 ! glycoside transport
@@ -521829,7 +523546,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving sarcinapterin." [GOC:mengo_curators, GOC:TermGenie]
 synonym: "sarcinapterin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:0042558 ! pteridine-containing compound metabolic process
 is_a: GO:0072350 ! tricarboxylic acid metabolic process
@@ -524107,7 +525823,7 @@
 synonym: "negative regulation of sarcinapterin formation" EXACT [GOC:TermGenie]
 synonym: "negative regulation of sarcinapterin synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0009890 ! negative regulation of biosynthetic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 is_a: GO:1900971 ! regulation of sarcinapterin biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
@@ -524146,7 +525862,7 @@
 synonym: "upregulation of sarcinapterin formation" EXACT [GOC:TermGenie]
 synonym: "upregulation of sarcinapterin synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0009891 ! positive regulation of biosynthetic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0062013 ! positive regulation of small molecule metabolic process
 is_a: GO:1900971 ! regulation of sarcinapterin biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
@@ -525610,13 +527326,15 @@
 
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
 
@@ -526593,7 +528311,7 @@
 synonym: "actinorhodin breakdown" EXACT [GOC:TermGenie]
 synonym: "actinorhodin catabolism" EXACT [GOC:TermGenie]
 synonym: "actinorhodin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0043649 ! dicarboxylic acid catabolic process
+is_a: GO:0046395 ! carboxylic acid catabolic process
 created_by: yaf
 creation_date: 2012-07-11T03:06:00Z
 
@@ -526606,7 +528324,7 @@
 synonym: "actinorhodin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "actinorhodin formation" EXACT [GOC:TermGenie]
 synonym: "actinorhodin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
+is_a: GO:0046394 ! carboxylic acid biosynthetic process
 created_by: yaf
 creation_date: 2012-07-11T03:06:08Z
 
@@ -526807,8 +528525,7 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving gentamycin." [GOC:TermGenie, GOC:yaf, UniPathway:UPA00967]
 synonym: "gentamycin metabolism" EXACT [GOC:TermGenie]
-is_a: GO:0016137 ! glycoside metabolic process
-is_a: GO:0019751 ! polyol metabolic process
+is_a: GO:0008152 ! metabolic process
 created_by: yaf
 creation_date: 2012-07-11T03:26:25Z
 
@@ -526820,8 +528537,7 @@
 synonym: "gentamycin breakdown" EXACT [GOC:TermGenie]
 synonym: "gentamycin catabolism" EXACT [GOC:TermGenie]
 synonym: "gentamycin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0030649 ! aminoglycoside antibiotic catabolic process
-is_a: GO:0046174 ! polyol catabolic process
+is_a: GO:0009056 ! catabolic process
 is_a: GO:1901128 ! gentamycin metabolic process
 created_by: yaf
 creation_date: 2012-07-11T03:26:51Z
@@ -526835,8 +528551,7 @@
 synonym: "gentamycin biosynthesis" EXACT [GOC:TermGenie]
 synonym: "gentamycin formation" EXACT [GOC:TermGenie]
 synonym: "gentamycin synthesis" EXACT [GOC:TermGenie]
-is_a: GO:0030648 ! aminoglycoside antibiotic biosynthetic process
-is_a: GO:0046173 ! polyol biosynthetic process
+is_a: GO:0009058 ! biosynthetic process
 is_a: GO:1901128 ! gentamycin metabolic process
 created_by: yaf
 creation_date: 2012-07-11T03:26:59Z
@@ -529504,6 +531219,7 @@
 synonym: "tartrate degradation" EXACT [GOC:TermGenie]
 is_a: GO:0016052 ! carbohydrate catabolic process
 is_a: GO:0019579 ! aldaric acid catabolic process
+is_a: GO:0043649 ! dicarboxylic acid catabolic process
 is_a: GO:1901275 ! tartrate metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: yaf
@@ -529520,6 +531236,7 @@
 synonym: "tartrate synthesis" EXACT [GOC:TermGenie]
 is_a: GO:0016051 ! carbohydrate biosynthetic process
 is_a: GO:0019578 ! aldaric acid biosynthetic process
+is_a: GO:0043650 ! dicarboxylic acid biosynthetic process
 is_a: GO:1901275 ! tartrate metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: yaf
@@ -529615,7 +531332,6 @@
 synonym: "5,6,7,8-tetrahydromethanopterin breakdown" EXACT [GOC:TermGenie]
 synonym: "5,6,7,8-tetrahydromethanopterin catabolism" EXACT [GOC:TermGenie]
 synonym: "5,6,7,8-tetrahydromethanopterin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0042560 ! pteridine-containing compound catabolic process
 is_a: GO:0043649 ! dicarboxylic acid catabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
@@ -531070,7 +532786,6 @@
 synonym: "cyclic 2,3-bisphospho-D-glyceric acid formation" EXACT [GOC:TermGenie]
 synonym: "cyclic 2,3-bisphospho-D-glyceric acid synthesis" EXACT [GOC:TermGenie]
 synonym: "cyclic 2,3-diphosphoglycerate biosynthesis" EXACT [CHEBI:28699]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0072330 ! monocarboxylic acid biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
 is_a: GO:1901137 ! carbohydrate derivative biosynthetic process
@@ -532029,27 +533744,25 @@
 
 [Term]
 id: GO:1901410
-name: regulation of tetrapyrrole biosynthetic process from glutamate
+name: obsolete regulation of tetrapyrrole biosynthetic process from glutamate
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of tetrapyrrole anabolism from glutamate" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole biosynthesis from glutamate" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole formation from glutamate" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole synthesis from glutamate" EXACT [GOC:TermGenie]
-is_a: GO:0006521 ! regulation of amino acid metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-is_a: GO:1901463 ! regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
-relationship: regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tt
 creation_date: 2012-10-01T16:20:56Z
 
 [Term]
 id: GO:1901411
-name: negative regulation of tetrapyrrole biosynthetic process from glutamate
+name: obsolete negative regulation of tetrapyrrole biosynthetic process from glutamate
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of tetrapyrrole anabolism from glutamate" EXACT [GOC:TermGenie]
 synonym: "down regulation of tetrapyrrole biosynthesis from glutamate" EXACT [GOC:TermGenie]
 synonym: "down regulation of tetrapyrrole biosynthetic process from glutamate" EXACT [GOC:TermGenie]
@@ -532074,21 +533787,18 @@
 synonym: "negative regulation of tetrapyrrole biosynthesis from glutamate" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tetrapyrrole formation from glutamate" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tetrapyrrole synthesis from glutamate" EXACT [GOC:TermGenie]
-is_a: GO:0045763 ! negative regulation of amino acid metabolic process
-is_a: GO:0062014 ! negative regulation of small molecule metabolic process
-is_a: GO:1901410 ! regulation of tetrapyrrole biosynthetic process from glutamate
-is_a: GO:1901464 ! negative regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
-relationship: negatively_regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901464
 created_by: tt
 creation_date: 2012-10-01T16:22:03Z
 
 [Term]
 id: GO:1901412
-name: positive regulation of tetrapyrrole biosynthetic process from glutamate
+name: obsolete positive regulation of tetrapyrrole biosynthetic process from glutamate
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of tetrapyrrole biosynthetic process from glutamate." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of tetrapyrrole anabolism from glutamate" EXACT [GOC:TermGenie]
 synonym: "activation of tetrapyrrole biosynthesis from glutamate" EXACT [GOC:TermGenie]
 synonym: "activation of tetrapyrrole biosynthetic process from glutamate" NARROW [GOC:TermGenie]
@@ -532113,42 +533823,34 @@
 synonym: "upregulation of tetrapyrrole biosynthetic process from glutamate" EXACT [GOC:TermGenie]
 synonym: "upregulation of tetrapyrrole formation from glutamate" EXACT [GOC:TermGenie]
 synonym: "upregulation of tetrapyrrole synthesis from glutamate" EXACT [GOC:TermGenie]
-is_a: GO:0045764 ! positive regulation of amino acid metabolic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
-is_a: GO:1901410 ! regulation of tetrapyrrole biosynthetic process from glutamate
-is_a: GO:1901465 ! positive regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
-relationship: positively_regulates GO:0033526 ! tetrapyrrole biosynthetic process from glutamate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901465
 created_by: tt
 creation_date: 2012-10-01T16:22:21Z
 
 [Term]
 id: GO:1901413
-name: regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+name: obsolete regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of tetrapyrrole anabolism from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole biosynthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole formation from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "regulation of tetrapyrrole synthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0006521 ! regulation of amino acid metabolic process
-is_a: GO:0019219 ! regulation of nucleobase-containing compound metabolic process
-is_a: GO:0042762 ! regulation of sulfur metabolic process
-is_a: GO:0051174 ! regulation of phosphorus metabolic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-is_a: GO:1901463 ! regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
-relationship: regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901463
 created_by: tt
 creation_date: 2012-10-01T16:27:43Z
 
 [Term]
 id: GO:1901414
-name: negative regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+name: obsolete negative regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
 namespace: biological_process
-def: "Any process that stops, prevents or reduces the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that stops, prevents or reduces the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "down regulation of tetrapyrrole anabolism from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "down regulation of tetrapyrrole biosynthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "down regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
@@ -532173,23 +533875,18 @@
 synonym: "negative regulation of tetrapyrrole biosynthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tetrapyrrole formation from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "negative regulation of tetrapyrrole synthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0045763 ! negative regulation of amino acid metabolic process
-is_a: GO:0045934 ! negative regulation of nucleobase-containing compound metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
-is_a: GO:0062014 ! negative regulation of small molecule metabolic process
-is_a: GO:1901413 ! regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
-is_a: GO:1901464 ! negative regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
-relationship: negatively_regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901464
 created_by: tt
 creation_date: 2012-10-01T16:28:54Z
 
 [Term]
 id: GO:1901415
-name: positive regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+name: obsolete positive regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
 namespace: biological_process
-def: "Any process that activates or increases the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+def: "OBSOLETE. Any process that activates or increases the frequency, rate or extent of tetrapyrrole biosynthetic process from glycine and succinyl-CoA." [GOC:mengo_curators, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "activation of tetrapyrrole anabolism from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "activation of tetrapyrrole biosynthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "activation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA" NARROW [GOC:TermGenie]
@@ -532214,14 +533911,9 @@
 synonym: "upregulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "upregulation of tetrapyrrole formation from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
 synonym: "upregulation of tetrapyrrole synthesis from glycine and succinyl-CoA" EXACT [GOC:TermGenie]
-is_a: GO:0045764 ! positive regulation of amino acid metabolic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
-is_a: GO:0062013 ! positive regulation of small molecule metabolic process
-is_a: GO:1901413 ! regulation of tetrapyrrole biosynthetic process from glycine and succinyl-CoA
-is_a: GO:1901465 ! positive regulation of tetrapyrrole biosynthetic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
-relationship: positively_regulates GO:0033527 ! tetrapyrrole biosynthetic process from glycine and succinyl-CoA
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:1901465
 created_by: tt
 creation_date: 2012-10-01T16:29:12Z
 
@@ -537056,7 +538748,7 @@
 synonym: "L-glutamine synthesis" EXACT [GOC:TermGenie]
 xref: MetaCyc:GLNSYN-PWY
 is_a: GO:0006541 ! L-glutamine metabolic process
-is_a: GO:0009084 ! L-glutamine family amino acid biosynthetic process
+is_a: GO:0009084 ! glutamate family amino acid biosynthetic process
 property_value: skos:broadMatch MetaCyc:PWY-5505
 property_value: skos:narrowMatch MetaCyc:GLNSYN-PWY
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31525" xsd:anyURI
@@ -537077,7 +538769,6 @@
 xref: MetaCyc:PWY-5103
 xref: MetaCyc:PWY-5104
 xref: MetaCyc:PWY-5108
-is_a: GO:0006549 ! isoleucine metabolic process
 is_a: GO:0009067 ! aspartate family amino acid biosynthetic process
 is_a: GO:0009082 ! branched-chain amino acid biosynthetic process
 property_value: skos:narrowMatch MetaCyc:ILEUSYN-PWY
@@ -539461,7 +541152,6 @@
 synonym: "5,6,7,8-tetrahydrosarcinapterin breakdown" EXACT [GOC:TermGenie]
 synonym: "5,6,7,8-tetrahydrosarcinapterin catabolism" EXACT [GOC:TermGenie]
 synonym: "5,6,7,8-tetrahydrosarcinapterin degradation" EXACT [GOC:TermGenie]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0042560 ! pteridine-containing compound catabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 is_a: GO:0072352 ! tricarboxylic acid catabolic process
@@ -541567,7 +543257,6 @@
 name: glycerate transmembrane transporter activity
 namespace: molecular_function
 def: "Enables the transfer of glycerate from one side of a membrane to the other." [GOC:TermGenie, PMID:23382251]
-is_a: GO:0008028 ! monocarboxylic acid transmembrane transporter activity
 is_a: GO:0015144 ! carbohydrate transmembrane transporter activity
 is_a: GO:0042879 ! aldonate transmembrane transporter activity
 relationship: part_of GO:1901975 ! glycerate transmembrane transport
@@ -541938,25 +543627,22 @@
 
 [Term]
 id: GO:1901996
-name: regulation of indoleacetic acid biosynthetic process via tryptophan
+name: obsolete regulation of indoleacetic acid biosynthetic process via tryptophan
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of indoleacetic acid biosynthetic process via tryptophan." [GOC:TermGenie, PMID:23377040]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of indoleacetic acid biosynthetic process via tryptophan." [GOC:TermGenie, PMID:23377040]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
 synonym: "regulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
 synonym: "regulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
 synonym: "regulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
-is_a: GO:0006521 ! regulation of amino acid metabolic process
-is_a: GO:0010600 ! regulation of auxin biosynthetic process
-is_a: GO:0062012 ! regulation of small molecule metabolic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0009848 ! indoleacetic acid biosynthetic process via tryptophan
-relationship: regulates GO:0009848 ! indoleacetic acid biosynthetic process via tryptophan
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
 created_by: tb
 creation_date: 2013-03-19T19:14:09Z
 
 [Term]
 id: GO:1901997
-name: negative regulation of indoleacetic acid biosynthetic process via tryptophan
+name: negative regulation of indoleacetic acid biosynthetic process
 namespace: biological_process
 def: "Any process that stops, prevents or reduces the frequency, rate or extent of indoleacetic acid biosynthetic process via tryptophan." [GOC:TermGenie, PMID:23377040]
 synonym: "down regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
@@ -541981,16 +543667,18 @@
 synonym: "inhibition of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
 synonym: "negative regulation of IAA biosynthetic process via tryptophan" EXACT [GOC:TermGenie]
 synonym: "negative regulation of indoleacetic acid anabolism via tryptophan" EXACT [GOC:TermGenie]
+synonym: "negative regulation of indoleacetic acid biosynthetic process via tryptophan" NARROW []
 synonym: "negative regulation of indoleacetic acid formation via tryptophan" EXACT [GOC:TermGenie]
 synonym: "negative regulation of indoleacetic acid synthesis via tryptophan" EXACT [GOC:TermGenie]
+is_a: GO:0010600 ! regulation of auxin biosynthetic process
 is_a: GO:0032353 ! negative regulation of hormone biosynthetic process
 is_a: GO:0045763 ! negative regulation of amino acid metabolic process
 is_a: GO:0062014 ! negative regulation of small molecule metabolic process
 is_a: GO:0090356 ! negative regulation of auxin metabolic process
-is_a: GO:1901996 ! regulation of indoleacetic acid biosynthetic process via tryptophan
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0009848 ! indoleacetic acid biosynthetic process via tryptophan
 relationship: negatively_regulates GO:0009848 ! indoleacetic acid biosynthetic process via tryptophan
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
 created_by: tb
 creation_date: 2013-03-19T19:14:13Z
 
@@ -542412,7 +544100,6 @@
 name: L-lysine transport
 namespace: biological_process
 def: "The directed movement of a L-lysine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015807 ! L-amino acid transport
 created_by: kmv
 creation_date: 2013-03-27T16:09:06Z
@@ -542422,7 +544109,6 @@
 name: L-histidine transport
 namespace: biological_process
 def: "The directed movement of a L-histidine into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:kmv, GOC:TermGenie, PMID:22822152]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015801 ! aromatic amino acid transport
 is_a: GO:0015802 ! basic amino acid transport
 is_a: GO:0015807 ! L-amino acid transport
@@ -546076,7 +547762,7 @@
 id: GO:1902223
 name: erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthetic process
 namespace: biological_process
-def: "The chemical reactions and pathways resulting in the formation of erythrose 4-phosphate/phosphoenolpyruvate family amino acid." [GOC:pr, GOC:TermGenie]
+def: "The chemical reactions and pathways resulting in the formation of an L-amino acid derived from erythrose 4-phosphate and phosphoenolpyruvate (L-phenylalanine, L-tyrosine and L-tryptophan)." [GOC:curators]
 comment: Note that this term was reinstated from obsolete.
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid anabolism" EXACT [GOC:TermGenie]
 synonym: "erythrose 4-phosphate/phosphoenolpyruvate family amino acid biosynthesis" EXACT [GOC:TermGenie]
@@ -546086,20 +547772,21 @@
 is_a: GO:0170038 ! proteinogenic amino acid biosynthetic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/29444" xsd:anyURI
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31371" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/32000" xsd:anyURI
 created_by: pr
 creation_date: 2013-06-13T10:37:49Z
 
 [Term]
 id: GO:1902224
-name: ketone body metabolic process
+name: obsolete ketone body metabolic process
 namespace: biological_process
-def: "The chemical reactions and pathways involving ketone body." [GOC:pr, GOC:TermGenie]
+def: "OBSOLETE. The chemical reactions and pathways involving ketone body." [GOC:pr, GOC:TermGenie]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "ketone body metabolism" EXACT [GOC:TermGenie]
 xref: Reactome:R-HSA-74182 "Ketone body metabolism"
-is_a: GO:0006091 ! generation of precursor metabolites and energy
-is_a: GO:0044281 ! small molecule metabolic process
-is_a: GO:1901568 ! fatty acid derivative metabolic process
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/22938" xsd:anyURI
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31806" xsd:anyURI
+is_obsolete: true
 created_by: pr
 creation_date: 2013-06-13T10:37:54Z
 
@@ -549014,7 +550701,6 @@
 name: ceramide 1-phosphate transport
 namespace: biological_process
 def: "The directed movement of a ceramide 1-phosphate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:TermGenie, PMID:23863933]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015914 ! phospholipid transport
 is_a: GO:0035627 ! ceramide transport
 created_by: uh
@@ -551452,7 +553138,6 @@
 namespace: biological_process
 def: "The process in which 5'-adenylyl sulfate is transported across a membrane." [GOC:TermGenie, PMID:24296033]
 synonym: "adenosine 5'-phosphosulfate transmembrane transport" EXACT [PMID:24296033]
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0015868 ! purine ribonucleotide transport
 is_a: GO:0051503 ! adenine nucleotide transport
 is_a: GO:0072348 ! sulfur compound transport
@@ -555090,7 +556775,6 @@
 synonym: "6-sulfoquinovose(1-) breakdown" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) catabolism" EXACT [GOC:TermGenie]
 synonym: "6-sulfoquinovose(1-) degradation" EXACT [GOC:TermGenie]
-is_a: GO:0016054 ! organic acid catabolic process
 is_a: GO:0044273 ! sulfur compound catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
 created_by: dph
@@ -557718,7 +559402,7 @@
 synonym: "poly(hydroxyvalerate) biosynthesis" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyvalerate) formation" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyvalerate) synthesis" EXACT [GOC:TermGenie]
-is_a: GO:1901441 ! poly(hydroxyalkanoate) biosynthetic process
+is_a: GO:0009058 ! biosynthetic process
 created_by: tt
 creation_date: 2014-04-21T19:12:38Z
 
@@ -557757,7 +559441,7 @@
 synonym: "poly(hydroxyalkanoate) formation from glucose" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyalkanoate) synthesis from glucose" EXACT [GOC:TermGenie]
 is_a: GO:0006006 ! glucose metabolic process
-is_a: GO:1901441 ! poly(hydroxyalkanoate) biosynthetic process
+is_a: GO:0009058 ! biosynthetic process
 created_by: tt
 creation_date: 2014-04-21T22:49:07Z
 
@@ -557771,7 +559455,7 @@
 synonym: "poly(hydroxyalkanoate) formation from fatty acid" EXACT [GOC:TermGenie]
 synonym: "poly(hydroxyalkanoate) synthesis from fatty acid" EXACT [GOC:TermGenie]
 is_a: GO:0006631 ! fatty acid metabolic process
-is_a: GO:1901441 ! poly(hydroxyalkanoate) biosynthetic process
+is_a: GO:0009058 ! biosynthetic process
 created_by: tt
 creation_date: 2014-04-21T22:53:59Z
 
@@ -563310,31 +564994,29 @@
 
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
 
@@ -563462,26 +565144,25 @@
 
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
@@ -563506,20 +565187,17 @@
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
@@ -563544,12 +565222,8 @@
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
 
@@ -564608,8 +566282,8 @@
 is_a: GO:0062012 ! regulation of small molecule metabolic process
 is_a: GO:2000282 ! regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0019240 ! citrulline biosynthetic process
-relationship: regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:34Z
 
@@ -564646,8 +566320,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000283 ! negative regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: negatively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: negatively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: negatively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:46Z
 
@@ -564684,8 +566358,8 @@
 is_a: GO:1903248 ! regulation of citrulline biosynthetic process
 is_a: GO:2000284 ! positive regulation of amino acid biosynthetic process
 intersection_of: GO:0065007 ! biological regulation
-intersection_of: positively_regulates GO:0019240 ! citrulline biosynthetic process
-relationship: positively_regulates GO:0019240 ! citrulline biosynthetic process
+intersection_of: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
+relationship: positively_regulates GO:0019240 ! L-citrulline biosynthetic process
 created_by: rl
 creation_date: 2014-08-04T15:24:52Z
 
@@ -573769,12 +575443,13 @@
 
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
 
@@ -573977,8 +575652,8 @@
 synonym: "inhibition of phospholipid metabolic process" NARROW [GOC:TermGenie]
 synonym: "inhibition of phospholipid metabolism" NARROW [GOC:TermGenie]
 synonym: "negative regulation of phospholipid metabolism" EXACT [GOC:TermGenie]
+is_a: GO:0010563 ! negative regulation of phosphorus metabolic process
 is_a: GO:0045833 ! negative regulation of lipid metabolic process
-is_a: GO:0045936 ! negative regulation of phosphate metabolic process
 is_a: GO:1903725 ! regulation of phospholipid metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0006644 ! phospholipid metabolic process
@@ -574000,8 +575675,8 @@
 synonym: "up-regulation of phospholipid metabolism" EXACT [GOC:TermGenie]
 synonym: "upregulation of phospholipid metabolic process" EXACT [GOC:TermGenie]
 synonym: "upregulation of phospholipid metabolism" EXACT [GOC:TermGenie]
+is_a: GO:0010562 ! positive regulation of phosphorus metabolic process
 is_a: GO:0045834 ! positive regulation of lipid metabolic process
-is_a: GO:0045937 ! positive regulation of phosphate metabolic process
 is_a: GO:1903725 ! regulation of phospholipid metabolic process
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0006644 ! phospholipid metabolic process
@@ -575021,7 +576696,6 @@
 name: L-valine transmembrane transport
 namespace: biological_process
 def: "The directed movement of L-valine across a membrane." [GO_REF:0000069, GOC:TermGenie, PMID:20944394]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015829 ! valine transport
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 created_by: al
@@ -575473,7 +577147,6 @@
 synonym: "isoleucine import" BROAD []
 synonym: "L-isoleucine import" BROAD []
 synonym: "L-isoleucine import into cell" EXACT []
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903714 ! isoleucine transmembrane transport
@@ -575489,7 +577162,6 @@
 synonym: "L-threonine import" BROAD []
 synonym: "L-threonine import into cell" EXACT []
 synonym: "L-threonine uptake" EXACT [GOC:bf]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015826 ! threonine transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
@@ -575535,7 +577207,6 @@
 synonym: "asparagine import" BROAD []
 synonym: "L-asparagine import into cell" EXACT []
 is_a: GO:0006867 ! asparagine transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0089718 ! amino acid import across plasma membrane
 is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
 is_a: GO:1903713 ! asparagine transmembrane transport
@@ -575796,10 +577467,10 @@
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
 
@@ -581520,7 +583191,7 @@
 synonym: "protein localisation in microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localisation to microvillus" EXACT [GOC:TermGenie]
 synonym: "protein localization in microvillus" EXACT [GOC:TermGenie]
-is_a: GO:0008104 ! intracellular protein localization
+is_a: GO:1903119 ! protein localization to actin cytoskeleton
 created_by: kmv
 creation_date: 2015-04-01T18:14:41Z
 
@@ -590127,15 +591798,15 @@
 
 [Term]
 id: GO:1904538
-name: regulation of glycolytic process through fructose-6-phosphate
+name: obsolete regulation of glycolytic process through fructose-6-phosphate
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of glycolytic process through fructose-6-phosphate." [GO_REF:0000058, GOC:dph, GOC:TermGenie, ISBN:0201090910, ISBN:0879010479]
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of glycolytic process through fructose-6-phosphate." [GO_REF:0000058, GOC:dph, GOC:TermGenie, ISBN:0201090910, ISBN:0879010479]
+comment: This term was obsoleted because it is an unnecessary grouping term.
 synonym: "regulation of glycolysis through fructose-6-phosphate" EXACT [GOC:TermGenie]
 xref: Reactome:R-HSA-9634600 "Regulation of glycolysis by fructose 2,6-bisphosphate metabolism"
-is_a: GO:0006110 ! regulation of glycolytic process
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
-relationship: regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0006110
 created_by: dph
 creation_date: 2015-08-07T11:35:10Z
 
@@ -590154,7 +591825,6 @@
 synonym: "inhibition of glycolytic process through fructose-6-phosphate" NARROW [GOC:TermGenie]
 synonym: "negative regulation of glycolysis through fructose-6-phosphate" EXACT [GOC:TermGenie]
 is_a: GO:0045820 ! negative regulation of glycolytic process
-is_a: GO:1904538 ! regulation of glycolytic process through fructose-6-phosphate
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
 relationship: negatively_regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
@@ -590176,7 +591846,6 @@
 synonym: "upregulation of glycolysis through fructose-6-phosphate" EXACT [GOC:TermGenie]
 synonym: "upregulation of glycolytic process through fructose-6-phosphate" EXACT [GOC:TermGenie]
 is_a: GO:0045821 ! positive regulation of glycolytic process
-is_a: GO:1904538 ! regulation of glycolytic process through fructose-6-phosphate
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
 relationship: positively_regulates GO:0061615 ! glycolytic process through fructose-6-phosphate
@@ -590185,15 +591854,17 @@
 
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
 
@@ -591188,10 +592859,10 @@
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
 
@@ -591204,6 +592875,8 @@
 synonym: "protein localisation to actin fusion focus" EXACT [GOC:TermGenie]
 synonym: "protein localization in actin fusion focus" EXACT [GOC:TermGenie]
 is_a: GO:0015031 ! protein transport
+relationship: part_of GO:0000755 ! cytogamy
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31774" xsd:anyURI
 created_by: al
 creation_date: 2015-08-26T10:36:22Z
 
@@ -593919,13 +595592,13 @@
 
 [Term]
 id: GO:1904735
-name: regulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase
+name: obsolete regulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase
 namespace: biological_process
-def: "Any process that modulates the frequency, rate or extent of fatty acid beta-oxidation using acyl-CoA dehydrogenase." [GO_REF:0000058, GOC:TermGenie, PMID:25416781]
-is_a: GO:0031998 ! regulation of fatty acid beta-oxidation
-intersection_of: GO:0065007 ! biological regulation
-intersection_of: regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
-relationship: regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
+def: "OBSOLETE. Any process that modulates the frequency, rate or extent of fatty acid beta-oxidation using acyl-CoA dehydrogenase." [GO_REF:0000058, GOC:TermGenie, PMID:25416781]
+comment: This term was obsoleted because it is an unnecessary grouping term.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31933" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0031998
 created_by: lb
 creation_date: 2015-10-15T08:14:51Z
 
@@ -593939,7 +595612,6 @@
 synonym: "downregulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase" EXACT [GOC:TermGenie]
 synonym: "inhibition of fatty acid beta-oxidation using acyl-CoA dehydrogenase" NARROW [GOC:TermGenie]
 is_a: GO:0031999 ! negative regulation of fatty acid beta-oxidation
-is_a: GO:1904735 ! regulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: negatively_regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
 relationship: negatively_regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
@@ -593956,7 +595628,6 @@
 synonym: "up-regulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase" EXACT [GOC:TermGenie]
 synonym: "upregulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase" EXACT [GOC:TermGenie]
 is_a: GO:0032000 ! positive regulation of fatty acid beta-oxidation
-is_a: GO:1904735 ! regulation of fatty acid beta-oxidation using acyl-CoA dehydrogenase
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
 relationship: positively_regulates GO:0033539 ! fatty acid beta-oxidation using acyl-CoA dehydrogenase
@@ -598910,6 +600581,7 @@
 synonym: "regulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0010155 ! regulation of proton transport
 is_a: GO:0022898 ! regulation of transmembrane transporter activity
+is_a: GO:0051341 ! regulation of oxidoreductase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: regulates GO:0004129 ! cytochrome-c oxidase activity
 relationship: regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -599002,6 +600674,7 @@
 synonym: "upregulation of NADH cytochrome c oxidase" EXACT [GOC:TermGenie]
 synonym: "upregulation of warburg's respiratory enzyme activity" RELATED [GOC:TermGenie]
 is_a: GO:0032414 ! positive regulation of ion transmembrane transporter activity
+is_a: GO:0051353 ! positive regulation of oxidoreductase activity
 is_a: GO:1904959 ! regulation of cytochrome-c oxidase activity
 intersection_of: GO:0065007 ! biological regulation
 intersection_of: positively_regulates GO:0004129 ! cytochrome-c oxidase activity
@@ -602559,7 +604232,6 @@
 name: carcinine import across plasma membrane
 namespace: biological_process
 def: "The directed movement of carcinine from outside of a cell, across the plasma membrane and into the cytosol." [GO_REF:0000075, GOC:dph, GOC:TermGenie, PMID:26653853, PMID:26713872]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0045117 ! azole transmembrane transport
 is_a: GO:0072337 ! modified amino acid transport
 is_a: GO:0098739 ! import across plasma membrane
@@ -606131,7 +607803,6 @@
 synonym: "sphingoid transport" RELATED []
 synonym: "sphingosine transport" NARROW []
 is_a: GO:0006869 ! lipid transport
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0071705 ! nitrogen compound transport
 created_by: tb
 creation_date: 2016-07-22T01:40:59Z
@@ -622343,11 +624014,14 @@
 
 [Term]
 id: GO:1990334
-name: Bfa1-Bub2 complex
+name: SIN/MEN two-component GAP complex
 namespace: cellular_component
-def: "A protein complex that acts as a two-component GTPase-activating protein for Tem1 GTPase, thus regulating a signal transduction cascade, called the mitotic exit network (MEN), which is required for mitotic exit and cytokinesis. Bub2/Bfa1 keeps Tem1 inactive until the spindle is properly oriented, thus inhibiting MEN activation." [GOC:bhm, PMID:16449187]
+def: "A protein complex that acts as a two-component GTPase-activating protein for the Tem1/Spg1 GTPase, thus regulating a signal transduction cascade (the mitotic exit network, MEN, in budding yeast; the septation initiation network, SIN, in fission yeast), which is required for mitotic exit and cytokinesis. The complex keeps the GTPase inactive until the spindle is properly oriented, thus inhibiting MEN/SIN activation." [GOC:bhm, PMID:16449187]
+synonym: "Bfa1-Bub2 complex" NARROW []
+synonym: "Byr4-Cdc16 GAP complex" NARROW []
 is_a: GO:1902773 ! GTPase activator complex
 relationship: part_of GO:0005816 ! spindle pole body
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31636" xsd:anyURI
 created_by: bhm
 creation_date: 2014-03-17T14:34:21Z
 
@@ -624842,7 +626516,6 @@
 alt_id: GO:0015788
 def: "The process in which UDP-N-acetylglucosamine is transported across a membrane." [PMID:10788474]
 synonym: "UDP-N-acetylglucosamine transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090481 ! pyrimidine nucleotide-sugar transmembrane transport
 created_by: vw
 creation_date: 2014-11-27T11:56:35Z
@@ -624854,7 +626527,6 @@
 alt_id: GO:0015784
 def: "The process in which GDP-mannose is transported across a membrane." [PMID:9395539]
 synonym: "GDP-mannose transport" RELATED []
-is_a: GO:0015711 ! organic anion transport
 is_a: GO:0090480 ! purine nucleotide-sugar transmembrane transport
 property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27059" xsd:anyURI
 created_by: vw
@@ -626604,10 +628276,12 @@
 
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
 
@@ -627333,7 +629007,7 @@
 id: GO:1990799
 name: mitochondrial tRNA wobble position uridine thiolation
 namespace: biological_process
-def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from cysteine to position C2 by several steps." [PMID:15509579]
+def: "The process in which a uridine residue at position 34 in the anticodon of a mitochondrial tRNA is post-transcriptionally thiolated at the C2 position. This process involves transfer of a sulfur from L-cysteine to position C2 by several steps." [PMID:15509579]
 is_a: GO:0002143 ! tRNA wobble position uridine thiolation
 is_a: GO:0070899 ! mitochondrial tRNA wobble uridine modification
 is_a: GO:0070903 ! mitochondrial tRNA thio-modification
@@ -627571,9 +629245,8 @@
 name: L-arginine transmembrane export from vacuole
 namespace: biological_process
 def: "The directed movement of L-arginine out of the vacuole, across the vacuolar membrane." [PMID:26083598]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0032974 ! amino acid transmembrane export from vacuole
-is_a: GO:1902475 ! L-alpha-amino acid transmembrane transport
+is_a: GO:1903826 ! L-arginine transmembrane transport
 created_by: vw
 creation_date: 2015-08-06T15:06:33Z
 
@@ -627581,13 +629254,14 @@
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
 
@@ -627951,18 +629625,13 @@
 
 [Term]
 id: GO:1990854
-name: vacuole-ER tethering
+name: obsolete vacuole-ER tethering
 namespace: biological_process
-def: "The attachment of a lytic vacuole to the endoplasmic reticulum, which may facilitate exchange of metabolites between the organelles." [PMID:26283797]
-synonym: "vacuole-endoplasmic reticulum attachment" EXACT []
-synonym: "vacuole-endoplasmic reticulum tethering" EXACT []
-synonym: "vacuole-ER attachment" EXACT []
-is_a: GO:0016043 ! cellular component organization
-is_a: GO:0051685 ! maintenance of ER location
-is_a: GO:0140056 ! organelle localization by membrane tethering
-is_a: GO:1990849 ! vacuolar localization
-created_by: mcc
-creation_date: 2015-09-15T18:50:04Z
+def: "OBSOLETE. The attachment of a lytic vacuole to the endoplasmic reticulum, which may facilitate exchange of metabolites between the organelles." [PMID:26283797]
+comment: The reason for obsoletion is that this term represents a molecular function, not a biological process. The molecular function is captured by GO:7770066 endoplasmic reticulum-vacuole tether activity.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31874" xsd:anyURI
+is_obsolete: true
+consider: GO:7770066
 
 [Term]
 id: GO:1990855
@@ -644347,7 +646016,6 @@
 def: "The chemical reactions and pathways resulting in the breakdown of a D-tagatose 6-phosphate." [GOC:mengo_curators]
 synonym: "D-tagatose 6-phosphate catabolism" EXACT [GOC:obol]
 xref: UniPathway:UPA00704
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0046434 ! organophosphate catabolic process
 is_a: GO:1901136 ! carbohydrate derivative catabolic process
 created_by: jl
@@ -644359,7 +646027,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways involving a D-glycero-D-manno-heptose 7-phosphate." [GOC:mengo_curators]
 synonym: "D-glycero-D-manno-heptose 7-phosphate metabolism" EXACT [GOC:obol]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 is_a: GO:1901135 ! carbohydrate derivative metabolic process
 created_by: jl
@@ -644944,7 +646611,6 @@
 namespace: biological_process
 def: "The chemical reactions and pathways resulting in the formation of a methanopterin." [GOC:mengo_curators]
 synonym: "methanopterin biosynthesis" EXACT [GOC:obol]
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0042559 ! pteridine-containing compound biosynthetic process
 is_a: GO:0090407 ! organophosphate biosynthetic process
 created_by: jl
@@ -645257,7 +646923,6 @@
 name: N-methylnicotinate transport
 namespace: biological_process
 def: "The directed movement of a N-methylnicotinateacetate into, out of or within a cell, or between cells, by means of some agent such as a transporter or pore." [GOC:obol]
-is_a: GO:0015695 ! organic cation transport
 is_a: GO:0015697 ! quaternary ammonium group transport
 created_by: tb
 creation_date: 2011-10-18T05:16:08Z
@@ -647297,7 +648962,6 @@
 synonym: "2-deoxy-3-O-[(3R)-3-hydroxytetradecanoyl]-2-{[(3R)-3-hydroxytetradecanoyl]amino}-1-O-phosphono-alpha-D-glucopyranose metabolism" EXACT [GOC:obol]
 synonym: "lipid X metabolism" EXACT [GOC:obol]
 is_a: GO:0006040 ! amino sugar metabolic process
-is_a: GO:0006796 ! phosphate-containing compound metabolic process
 is_a: GO:0019637 ! organophosphate metabolic process
 created_by: tb
 creation_date: 2012-01-13T11:28:58Z
@@ -648043,12 +649707,13 @@
 
 [Term]
 id: GO:7770028
-name: glycoprotein cargo receptor activity
+name: obsolete glycoprotein cargo receptor activity
 namespace: molecular_function
-def: "Binding specifically to a glycoprotein (cargo) to deliver it to a transport vesicle. Glycoprotein cargo receptors span membranes, binding simultaneously to cargo molecules and coat adaptors, to efficiently recruit the cargo molecules to nascent vesicles." [PMID:41203586]
-is_a: GO:0038024 ! cargo receptor activity
-property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31038" xsd:anyURI
-created_by: dragon-ai-agent
+def: "OBSOLETE. Binding specifically to a glycoprotein (cargo) to deliver it to a transport vesicle. Glycoprotein cargo receptors span membranes, binding simultaneously to cargo molecules and coat adaptors, to efficiently recruit the cargo molecules to nascent vesicles." [PMID:41203586]
+comment: The reason for obsoletion is that this term was added in error. Most vesicle cargo are glycoproteins, so classifying cargo receptors by glycoprotein substrate introduces an additional, unhelpful axis of classification. Cargo receptor activities should instead be organized by transport domain (i.e., the vesicles they connect cargo to), with substrates captured via has_input.
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31948" xsd:anyURI
+is_obsolete: true
+replaced_by: GO:0038024
 
 [Term]
 id: GO:7770029
@@ -648086,20 +649751,18 @@
 
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
@@ -648387,6 +650050,167 @@
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
+[Term]
+id: GO:7770062
+name: vesicle membrane tethering activity
+namespace: molecular_function
+def: "A membrane-membrane adaptor activity that provides the first point of contact and physically bridges the vesicle membrane and its target membrane prior to vesicle docking and fusion." [PMID:19575650, PMID:19887069]
+synonym: "vesicle membrane tether activity" EXACT []
+synonym: "vesicle tethering activity" EXACT []
+is_a: GO:0140177 ! membrane-membrane adaptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31863" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-13T23:43:55Z
+
+[Term]
+id: GO:7770063
+name: beta barrel protein insertion into mitochondrial outer membrane
+namespace: biological_process
+def: "The import of beta barrel proteins from the cytosol and their insertion into the mitochondrial outer membrane." [PMID:36931257]
+synonym: "TOM-SAM pathway" EXACT []
+is_a: GO:0006886 ! intracellular protein transport
+is_a: GO:0010496 ! intercellular transport
+is_a: GO:0045040 ! protein insertion into mitochondrial outer membrane
+is_a: GO:0070585 ! protein localization to mitochondrion
+is_a: GO:0072657 ! protein localization to membrane
+is_a: GO:7770058 ! mitochondrial protein import pathway
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31711" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-15T13:26:12Z
+
+[Term]
+id: GO:7770064
+name: actin-filament cross-linking activity
+namespace: molecular_function
+def: "An adaptor activity that brings together two actin filaments, enabling the bundling or networking of actin filaments (F-actin)." [GOC:vw, PMID:37025173]
+synonym: "actin filament cross-linking activity" EXACT []
+synonym: "actin filament crosslinking activity" EXACT []
+synonym: "F-actin cross-linking activity" EXACT []
+is_a: GO:0008093 ! cytoskeletal adaptor activity
+relationship: has_part GO:0051015 ! actin filament binding
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/19185" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-16T11:21:46Z
+
+[Term]
+id: GO:7770065
+name: peroxisome-chloroplast membrane tether activity
+namespace: molecular_function
+def: "The binding activity of a molecule that brings together the peroxisome membrane and the chloroplast membrane, establishing the localization of the peroxisome close to the chloroplast." [PMID:17215364]
+synonym: "peroxisome-chloroplast membrane adaptor activity" EXACT []
+is_a: GO:0140177 ! membrane-membrane adaptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31877" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-20T22:23:03Z
+
+[Term]
+id: GO:7770066
+name: endoplasmic reticulum-vacuole tether activity
+namespace: molecular_function
+def: "The binding activity of a molecule that brings together an endoplasmic reticulum membrane and a vacuole membrane either via membrane lipid binding or by interacting with a membrane protein, to establish or maintain membrane contact sites." [PMID:26283797]
+synonym: "ER-vacuole tether activity" EXACT []
+synonym: "vacuole-endoplasmic reticulum tether activity" EXACT []
+synonym: "vacuole-ER tether activity" EXACT []
+is_a: GO:0170009 ! endoplasmic reticulum-organelle membrane tether activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31874" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-21T00:26:25Z
+
+[Term]
+id: GO:7770067
+name: contractile vacuole-plasma membrane tether activity
+namespace: molecular_function
+def: "The binding activity of a molecule that brings together the contractile vacuolar membrane and the plasma membrane, either via membrane lipid binding or by interacting with a membrane protein, to establish or maintain the localization of the contractile vacuole at a specific plasma membrane discharge site." [PMID:22323285]
+synonym: "contractile vacuole-plasma membrane tethering activity" EXACT []
+synonym: "plasma membrane-contractile vacuole tether activity" EXACT []
+is_a: GO:0140177 ! membrane-membrane adaptor activity
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/31870" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-21T19:33:16Z
+
+[Term]
+id: GO:7770068
+name: ferric iron reductase activity
+namespace: molecular_function
+def: "Catalysis of the reaction: 2 Fe2+ + NADP+ + H+ = 2 Fe3+ + NADPH." [PMID:34614242, PMID:39940646, PMID:8321236, RHEA:71767]
+synonym: "Fe3+ reductase activity" EXACT []
+synonym: "ferric reductase activity" EXACT []
+xref: RHEA:71767
+is_a: GO:0016723 ! oxidoreductase activity, acting on metal ions, NAD or NADP as acceptor
+property_value: skos:exactMatch RHEA:71767
+property_value: term_tracker_item "https://github.com/geneontology/go-ontology/issues/27593" xsd:anyURI
+created_by: dragon-ai-agent
+creation_date: 2026-04-28T09:37:41Z
+
 [Typedef]
 id: ends_during
 name: ends during
```
