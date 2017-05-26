# Merging Ontology Terms

1.	Before performing the merge, make sure that you know all of the consequences that the merge will cause. In particular, be sure to look at child terms and any other terms that refer to the ‘deprecated’ term. In many cases a simple merge of two terms is not sufficient because it will result in equivalent classes for child terms. For example if deprecated term X is going to be merged into target term Y and ‘regulation of X’ and ‘regulation of Y’ terms exist, then you will need to merge the regulation terms in addition to the primary terms. You will also need to edit any terms that refer to the deprecated term to be sure that the names and definitions are consistent.

2.	In Protege, select the Classes tab.

3.	Write down the GO IDs of the terms that will be merged so you can keep track of the ‘target’ and ‘deprecated’ terms. In general it is best practice to keep the name of the target term and its identifier as the primary GO:id.

4.	Navigate to the deprecated term.

5.	In the Protege menu, click on Refactor.

6.	Select ‘Rename entity’ from the list of options.

7.	In the ‘Change entity URI’ pop-up window, enter the GO URI of the target term. Be sure to use the underscore ```_``` in the identifier instead of the colon ```:```, for example: GO_1234567. Make sure that the 'change all entities with this URI' box is checked.

8.	In the 'Annotations' and 'Descriptions' windows, you will now see all of the information about the target and deprecated terms duplicated. In the 'Annotations' window, navigate to the ‘deprecated’ GO ID.

9.	Click on the ```O``` symbol to modify the annotation associating this ID to the deprecated term.

10.	In the resulting pop-up window, select ```has_alternate_id``` from the list on the left side.

11.	Make sure the 'Literal' tab is selected in the right side box, and check that the entry corresponds to the GO ID of the ‘deprecated term’.  

12.	Click 'OK'. The deprecated term identifier should now be ```has_alternative_id``` instead of id.

13.	Check the existing list of synonyms to see if the name of the deprecated term was already listed as a synonym.  If not, you will need to add it to the list.

14.	To add the ‘deprecated’ term name to the list of synonyms, navigate to the list of labels, and select the ```O``` button to edit the property of the ‘deprecated term’ name.

15.	Select the appropriate synonym label from the list on the left:
    1.	```has_broad_synonym```
    2.	```has_exact_synonym```
    3.	```has_narrow_synonym```
    4.	```has_related_synonym```

16. Check existing list of synonyms to see if they all still make sense.

17. The definitions of both the target term and the deprecated term will be listed as annotations. Click on the ```X``` to delete the incorrect definition. Modify the remaining definition by clicking on the ```O``` button and editing the text in the pop-up window. Save your changes.

18. Review subsets, logical definitions (```Equivalent to```) and other relationships (```Subclass of```) to make sure they all make sense for the merged term. If both terms had logical definitions, delete the one from the deprecated term.

19. Synchronize the reasoner and see if there are terms that now have identical definitions as a result of the merge.
