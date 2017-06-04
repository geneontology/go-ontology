# Merging Ontology Terms


See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-updating-with-git-pull) for creating branches and basic Protégé instructions. 

**Note** Before performing a merge, make sure that you know all of the consequences that the merge will cause. In particular, be sure to look at child terms and any other terms that refer to the ‘deprecated’ term. In many cases a simple merge of two terms is not sufficient because it will result in equivalent classes for child terms. For example if deprecated term X is going to be merged into target term Y and ‘regulation of X’ and ‘regulation of Y’ terms exist, then you will need to merge the regulation terms in addition to the primary terms. You will also need to edit any terms that refer to the deprecated term to be sure that the names and definitions are consistent.

1.	**Find the ID of the term to be deprecated** 
    Navigate to the term to be deprecated using the Search box. In the Protege menu, click on Refactor > Rename entity’ (shortcut: command-U). **Copy the ID of the term to be deprecated.**
 
 2. **Remove annotations from the deprecated terms**
    - Remove the logical definition by clicking on the (x) on the right
    - Remove all subclasses by clicking on the (x) on the right
    - Look at the definition; if it does not seem relevant, remove it by clicking on the (x) on the right; otherwise copy/paste it somewhere
    - Note down the created_by and created_date (there can only be one value per term for each of these fields)
    - Check existing list of synonyms to see if they need to be moved to the new term, otherwise delete them by clicking on the (x) on the right.
   
3.  **Merge the term to be deprecated into target term**
    - Using the Search box, navigate to the target term.
    - In the Protege menu, click on Refactor > Rename entity’ (shortcut: command-U) 
    - Paste the ID of the term to be deprecated (obtained in Step 2). 
    - Be sure to use the underscore ```_``` in the identifier instead of the colon ```:```, for example: GO_1234567. Make sure that the 'change all entities with this URI' box is checked.
 
 4. **Make the deprecated ID an 'alternative ID'**
 In the annotations box, go to xx 
 - In the resulting pop-up window, select ```has_alternate_id``` from the list on the left side. 
-  Make sure the 'Literal' tab is selected in the right side box, and check that the entry corresponds to the GO ID of the ‘deprecated term’.  
- Click 'OK'. The deprecated term identifier should now be ```has_alternative_id``` instead of id.

 5. **Fix synonyms** 
 - In the annotations box, go to xx 	
 Check the existing list of synonyms to see if the name of the deprecated term was already listed as a synonym.  If not, you will need to add it to the list.
 - Select the appropriate synonym label from the list on the left:
    1.	```has_broad_synonym```
    2.	```has_exact_synonym```
    3.	```has_narrow_synonym```
    4.	```has_related_synonym```

- Check existing list of synonyms to see if they all still make sense.


6. Synchronize the reasoner and see if there are terms that now have identical definitions as a result of the merge. This will be shown by a 'equivalent' sign `≡`. 


See [Daily Workflow](http://go-ontology.readthedocs.io/en/latest/Installgit.html#daily-workflow-committing-pushing-and-merging-your-changes-to-the-repository) section for commit, push and merge instructions. 
