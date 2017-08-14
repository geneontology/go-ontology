Warning - this document is liable to become stale.  You are encouraged to check the ontology using Protege for the latest upper level classifications and relation (object property) definitions and axiomatisation.

## Upper level classification in GO.

GO maintains an file of upper level classifications and bridging axioms: [extensions/go-bridge.owl](https://github.com/geneontology/go-ontology/blob/master/src/ontology/extensions/go-bridge.owl).

This includes an upper level classification of GO and various import ontologies using Basic Formal Ontology ([BFO](http://www.ebi.ac.uk/ols/ontologies/bfo)).  This is useful for consistency checking via a combination of disjointness axioms and domain and range. (See examples below).

Classification of terms in GO is rightly in the domain of work of the gene ontology.  Ideally, upper level classifications for terms from other ontologies will be imported.  However, this is not always currently possible.  In an ideal world, we wouldn't have to bridge between similar or identical classes in different import ontologies.  However, some such axioms are currently necessary in order to get complete inferences within GO. 

### Upper level classifications.

**Occurents**

![image](https://user-images.githubusercontent.com/112839/29290698-ee6c0360-80f5-11e7-9e58-aa46cedbe01b.png)
Both molecular function and biological process are classified as types of BFO process.  molecular functions are simply processes that can be carried out by a single gene product or complex.

**Continuants**

TBA - Classification of continuants  (Rqd ontology updates pending)

### Equivalence axioms bridge between ontologies

ChEBI and PRO both have terms for proteins.  We bridge these using:

FIG TBA

We treat SO RNA as a type of molecule, not an information artifact (the official definition).  This allows us to use CHEBI for chemical classification of RNA and DNA, but SO for classification of transcript types (e.g. miRNA).

FIG TBA

## GO relations crib

GO uses relations from the relations ontology (RO), but at the time of writing still has some GO-specific axiomatisation and relations.  These should probably be move to RO.

## Primitive relations

GO/RO have a small number of primitive/fundamental relations.

'has participant':  A relation between a process and an independent continuant, in which the process takes place entirely within the independent continuant.

'part of': 





