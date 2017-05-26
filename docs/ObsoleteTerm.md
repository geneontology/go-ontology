# Obsoleting an Existing Ontology Term

1. Making sure you are in your working branch of the repo (git checkout issue-####), start Protege.

2. Open the ontology file: go-edit.obo

3. Click on the 'Classes' tab.

4. Click on the 'Search' button on the upper right and search for the term(s) slated for obsoletion.

5. Select the term you want by double-clicking it in the resulting list.

6. In the 'Annotations' window, click on the ```+``` sign next to 'Annotations'.

7. In the resulting pop-up window, select ```owl:deprecated``` from the left-hand menu.

8. With owl:deprecated selected, select the 'Literal' tab view from the right-hand tab list. Type: ```true``` in the text box.
        
9. In the drop-down menu underneath the text box, select: ```xsd:boolean```.
   
10. Click OK.

11. You should now see the term crossed out in the Class hierarchy view.

12. Now move to the 'Description' window.

13. If there is an equivalence axiom, then under the 'Equivalent To', click the 'X' on the right-hand side to delete the logical definition. 

14. Under the 'SubClass Of' entry, click the 'X' on the right-hand side to delete the SubClass Relation.

15. Now you need to add ‘obsolete’ to the term name and ‘OBSOLETE’ to the term definition. __Note the case-sensitivity for each__. 
          
    1. For the term name, go back to the 'Annotations' window and click on the 'O' on the right-hand side of the rdfs:label entry to edit the term string. In the resulting window, in the Literal tab, in front of the term name, type: ```obsolete```

    2. For the definition, again, click on the 'O' on the right-hand side of the definition entry. In the resulting window, in the Literal tab, at the beginning of the definition, type: ```OBSOLETE``` 

16. Now move to the OBO annotation window.

17. In the Comment box, add a statement about why the term was made obsolete. Consult wiki documentation for suggestions on standard comments:
      
      [http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion](http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion)
      
      [http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms](http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms)
      
      [http://wiki.geneontology.org/index.php/Editor_Guide](http://wiki.geneontology.org/index.php/Editor_Guide)

18. In the drop-down menu, select: ```Xsd:string```

19. If the obsoleted term was replaced by another term in the ontology, enter the ID of the replacement term in the 'replaced_by' tag.

20. If the obsoleted term was not replaced by another term in the ontology, but there are existing terms that might be appropriate for annotation, add those term IDs in the 'consider' tag.

21. From the 'File' menu in Protege, 'Save' the file.

22. Now go back to your terminal window and type: ```git status```. This will confirm the branch you’re on.

23. Then type: ```git diff```. You should see ```+is_obsolete: true```.

24. Next, type ```git commit -m ‘obsoleted GO term Fixes #12923’```.

25. Then push your changes back to the origin (GitHub), by typing: ```git push origin myworkingbranch```.

26. Using your browser, return to the GO Ontology repository on GitHub, located at [https://github.com/geneontology/go-ontology](https://github.com/geneontology/go-ontology).

27. Navigate to the tab labeled as 'Code' (```geneontology/go-ontology/code```). You will see your commit listed at the top of the page in a light yellow box. If you don’t see it, click on the 'Branches' link to reveale it in the list, and click on it. 

    1. The diff for your file is at the bottom of the page. Examine it as a sanity check. 
     
    2. Click on the green box to generate a pull request.

28. You may now add comments and ask a colleague to review your pull request.

29. If you want to have the ticket reviewed before closing it, you can select a reviewer for the ticket before you make the pull request by clicking on the 'Reviewers' list and entering a GitHub identifier (e.g. @superuser1). The reviewer will not be notified until the pull request is made. The reviewer’s comments will show up in the pull request the same way they do in issues when we work on tickets.

30. Wait for the Travis checks to complete (this can take a few minutes). 

31. If all is fine with the Travis checks, then merge the pull request, and confirm the merge which will close the ticket if you have used the word 'fixes' in your pull request. You can now safely delete your branch using the button on the right of the successful merge message.

32. Back in your terminal, if appropriate, you may now delete the working branch. Do this by returning to master, then: 

    1. Type: ```git checkout master```

    2. Type: ```git branch -d workingbranchname```. Example: ```git branch -d issue-13390```
