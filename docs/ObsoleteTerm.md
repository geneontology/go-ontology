# Obsoleting an Existing Ontology Term

 
See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-committing-pushing-and-merging-your-changes-to-the-repository) section for commit, push and merge instructions. 

1. Navigate to the term to be obsoleted using the Search box.

2. Select the term you want by double-clicking it in the resulting list.

3. In the 'Annotations' window, click on the ```+``` sign next to 'Annotations'.
   1. In the resulting pop-up window, select ```owl:deprecated``` from the left-hand menu.

   2. With owl:deprecated selected, select the 'Literal' tab view from the right-hand tab list. Type: ```true``` in the text box.
        
   3. In the drop-down menu underneath the text box, select: ```xsd:boolean```.
   
   4. Click OK.

You should now see the term crossed out in the Class hierarchy view.

4. Removing equivalence axiom
In the 'Description' window, if there is an equivalence axiom, under the 'Equivalent To' click the 'X' on the right-hand side to delete the logical definition. 
   
5. Removing Subclass   
In the 'Description' window, under the 'SubClass Of' entry, click the 'X' on the right-hand side to delete the SubClass Relation.

6. Add ‘obsolete’ to the term name
In the 'Annotations' window, click on the 'O' on the right-hand side of the rdfs:label entry to edit the term string. In the resulting window, in the Literal tab, in front of the term name, type: ```obsolete```
 __Note the case-sensitivity__. 

7. Add ‘OBSOLETE’ to the definition
In the 'Annotations' window, click on the 'O' on the right-hand side of the definition entry. In the resulting window, in the Literal tab, at the beginning of the definition, type: ```OBSOLETE``` 
 __Note the case-sensitivity__. 
          
8. Add a comment about the reason for obsoletion
Move to the OBO annotation window. In the Comment box, add a statement about why the term was made obsolete. Consult wiki documentation for suggestions on standard comments:
      
     - [http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion](http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion)
      
     - [http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms](http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms)
      
     - [http://wiki.geneontology.org/index.php/Editor_Guide](http://wiki.geneontology.org/index.php/Editor_Guide)

In the drop-down menu, select: ```Xsd:string```.

9. If the obsoleted term was replaced by another term in the ontology, enter the ID of the replacement term in the 'replaced_by' tag.

10. If the obsoleted term was not replaced by another term in the ontology, but there are existing terms that might be appropriate for annotation, add those term IDs in the 'consider' tag.

See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-committing-pushing-and-merging-your-changes-to-the-repository) section for commit, push and merge instructions. 

