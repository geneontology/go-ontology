---
name: Term obsoletion
about: Request to obsolete a term
title: 'Obsoletion request: [GO ID:Term label]'
labels: obsoletion
assignees: ''

---

Please provide as much information as you can:

* **GO term ID and Label**

* **Reason for deprecation** Put an x in the appropriate box: 
 - [ ] The reason for obsoletion is that the term is not clearly defined and usage has been inconsistent.
 - [ ]  The reason for obsoletion is that this term is pre-composed and should be represented as a GO-CAM model.
 - [ ]  The reason for obsoletion is that this term represent an assay and not a GO process.
 - [ ]  The reason for obsoletion is that this represents a phenotype.
 - [ ] The reason for obsoletion is that the data from the paper for which the term was requested can be accurately described using [appropriate GO term].
 - [ ] The reason for obsoletion is that this term represents a molecular function.
 - [ ]  The reason for obsoletion is that this term represents a gene product.
 - [ ] The reason for obsoletion is that this term refers to a class of proteins.
 - [ ]  The reason for obsoletion is that this term was added in error.
 - [ ]  The reason for obsoletion is that more specific terms were created.
 - [ ]  The reason for obsoletion is that this term was an unnecessary grouping term.
 - [ ]  The reason for obsoletion is that the meaning of the term is ambiguous.
 - [ ]  The reason for obsoletion is that is not known to be catalyzed by any gene product.
 - [ ]  The reason for obsoletion is that it more specific than the specificity of any known gene product.
 - [ ]  The reason for obsoletion is that there is no evidence that this function/process/component exists.

* **"Replace by" term (ID and label)**
If all annotations can safely be moved to that term

* **"Consider" term(s) (ID and label)**
Suggestions for reannotation

* **Are there annotations to this term?**
- How many EXP:

* **Are there mappings and cross references to this term? (InterPro, Keywords; check QuickGO cross-references section)**

* **Is this term in a subset? (check the AmiGO page for that term)**

* **Any other information**


----
Checklist for ontology editor

***Check term usage and metadata in Protégé***
- [ ] check term usage in the ontology 
- [ ] check internal mappings: RHEA, EC, MetaCyc
- [ ] check subset usage
- [ ] check taxon constraints 

***Check annotations***
- [ ] create Annotation Review spreadsheet 
- * Annotation Review template: https://docs.google.com/spreadsheets/d/1izV3q1jnq_Ybg5MJ53O_b5BCTkGtjl_Fi-cOg3-7eBE/edit#gid=0
- * Instructions: https://wiki.geneontology.org/Annotation_Review_Request
- [ ] create annotation review ticket: https://github.com/geneontology/go-annotation/issues/new?assignees=&labels=annotation+review&template=annotation-review-for-obsoletion.md&title=Review+annotations+to+%5BINSERT+GO+TERM%5D
- [ ] find external mappings (via IEAS), include in obsoletion notice  
- [ ] tag curators in Annotation Review ticket. Responsible annotator for each group: https://github.com/geneontology/go-site/blob/master/metadata/group-contacts.csv

***Notification***
- [ ] create [obsoletion announcement](https://github.com/geneontology/go-announcements/issues/new?assignees=&labels=obsoletion&template=obsoletion-notice.md&title=Obsoletion+notice%3A+%5BGO+ID%3A+term+label%5D)
- [ ] announce to GO friends (go-friends@mailman.stanford.edu)
- [ ] paste the text in the ontology ticket
