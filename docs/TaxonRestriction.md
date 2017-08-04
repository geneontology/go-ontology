# Adding taxon restrictions

See [Daily Workflow](http://ontologydocs.readthedocs.io/en/latest/index.html#updating-the-local-copy-of-the-ontology-with-git-pull) for creating branches and basic Protégé instructions. 

1. ```Only in taxon``` relations are added as ```Subclasses```. 
   1.	Navigate to the term for which you want to add the only in taxon restriction.
   2.	In the Description window click on the ```+```.
   3.	In the pop-up window type a new relationship (e.g. ```'only in taxon' some Viridiplantae```).
   4.	The taxa available are imported ontology terms and can be browsed just like any other ontology term.

2. ```Never in taxon``` relations added as ```Annotations```. 
   1.	Navigate to the term for which you want to add the never in taxon restriction.
   2.	In the class annotations window, click on the ```+```. 
   3.	In the left-hand panel, select ```never_in_taxon```.
   4.	In the right-hand panel, in the Entity IRI tab, navigate to the correct taxon: thing/material entity/object/organism.
   5.	Select the appropriate taxon.
   6.	Click OK to save your changes.
   
   
See [Daily Workflow](http://ontologydocs.readthedocs.io/en/latest/index.html#committing-pushing-and-merging-your-changes-to-the-repository) section for commit, push and merge instructions. 
