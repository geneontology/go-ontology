# Obsoleting an Existing Ontology Term

See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-updating-with-git-pull) for creating branches and basic Protégé instructions. 

0. Check if the term (or any of its children) is being used for annotation: go to the term in AmiGO, 

00. Check if the term is used elsewhere in the ontology: In Protégé, go to the 'Usage' tab to see if that ID is used elsewhere. 

000. Send a notification email: 

1. Navigate to the term to be obsoleted.
 
2. Make the status of the term obsolete: 

   1. In the 'Annotations' window, click on the ```+``` sign next to 'Annotations'.
   2. In the resulting pop-up window, select ```owl:deprecated``` from the left-hand menu.
   3. Make sure the 'Literal' tab view is selected from the right-hand tab list. Type ```true``` in the text box.
   4. In the 'Type' drop-down menu underneath the text box, select ```xsd:boolean```  
   5. Click OK.  You should now see the term crossed out in the Class hierarchy view.

3. Remove equivalence axiom:  In the 'Description' window, under the 'Equivalent To', click the ```x``` on the right-hand side to delete the logical definition. 
 
4. Remove 'SubClass Of' relations: In the 'Description' window, under the 'SubClass Of' entry, click the ```x``` on the right-hand side to delete the SubClass Relation.  
 
5. Add ‘obsolete’ to the term name: In the 'Annotations' window, click on the ```o``` on the right-hand side of the rdfs:label entry to edit the term string. In the resulting window, in the Literal tab, in front of the term name, type: ```obsolete```
For example: ```obsolete gamma-glutamyltransferase activity```
 __Note the case-sensitivity. Make sure to have a space (and no other character) between 'obsolete' and the term label__.   
  
5. Add ‘OBSOLETE’ to the term definition: In the 'Description' window, click on the ```o``` on the right-hand side of the definition entry. In the resulting window, in the Literal tab, at the beginning of the definition, type: ```OBSOLETE.``` 
For example: ```OBSOLETE. Catalysis of the reaction: (5-L-glutamyl)-peptide + an amino acid = peptide + 5-L-glutamyl-amino acid.```
 __Note the case-sensitivity__.   
 
6. Add a statement about why the term was made obsolete: In the 'Annotations' window, select ```+``` to add an annotation. In the resulting menu, select ```rdfs:comment``` and select Type:  ```Xsd:string```.
Consult the wiki documentation for suggestions on standard comments:
      
     - [http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion](http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion)
      
     - [http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms](http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms)
      
     - [http://wiki.geneontology.org/index.php/Editor_Guide](http://wiki.geneontology.org/index.php/Editor_Guide)
 
7. If the obsoleted term was replaced by another term in the ontology: In the 'Annotations' window, select ```+``` to add an annotation. In the resulting menu, select ```term replaced by``` and enter the ID of the replacement term.  
 
8. If the obsoleted term was not replaced by another term in the ontology, but there are existing terms that might be appropriate for annotation, add those term IDs in the 'consider' tag: In the 'Annotations' window, select ```+``` to add an annotation. In the resulting menu, select ```consider``` and enter the ID of the replacement term.  

9. Save changes. 
    
See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-committing-pushing-and-merging-your-changes-to-the-repository) section for commit, push and merge instructions. 
