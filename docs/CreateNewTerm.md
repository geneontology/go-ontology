# Creating a New Ontology Term

1. Making sure you are in your working branch of the repo, start Protege.

2. Click on the 'File' pulldown. Open the file: go-edit.obo. The first time, you will have to navigate to ```repos/go-ontology/src/ontology```. Once you have worked on the file, it will show up in the menu under 'Open'/'Recent'.

3. Click on the 'Classes' tab.

4. Use the search box on the upper right to search for a term in the ontology. Wait for autocomplete to work in the pop-up window.

5. Double-click on the term. This will reveal the term in the 'Class hierarchy' window after a few seconds.

6. To see the term in the 'Class hierarchy' (inferred) window, you will need to run the 'ELK reasoner'. 'Reasoner' > select ELK 0.4.3, then click 'Start reasoner'. Close the various pop-up warnings about the ELK reasoner. You will now see the terms in the inferred hierarchy.

7. In the Class hierarchy window, click on the 'Add subclass' button at the upper left of the window.

8. A pop-up window will appear asking you to enter the Name of the new term. When you enter the term name, you will see your ID automatically populate the IRI box. Once you have entered the term, click 'OK' to save the new term. You will see it appear in the class hierarchy. 

9. Navigate to the OBO annotation window. 

10. In the OBO annotation window add:

    1. Namespace
       1. Begin typing one of the three branches (autocomplete will guide you to the correct term):
          1. ```biological_process```
          2. ```cellular _component```
          3. ```molecular_function```
       2. For Type, select: ```xsd:string```
           
    2. Definition
       1. Click on the  ```+``` next to the Definition box
       2. Add the textual definition in the pop-up box.
       3. For Type, select: ```Xsd:string```
       4. Click OK.
       
     3. Add Definition References
        1. Click on the circle with the ‘Ref’ in it next to add Definition References and in the resulting pop-up click on the ```+``` to add a new ref, making sure they are properly formatted with a database abbreviation followed by a colon, followed by the text string or ID. Examples: ```GOC:bhm, PMID:27450630```.
         2. Select Type: ```xsd:string``` 
         3. Click OK.
         4. Add each definition reference separately by clicking on the ```+``` sign.
	 
      4. Add synonyms and dbxrefs following the same procedure if they are required for the term.

11. If you have created a logical definition for your term, you can delete the asserted ```is_a``` parent in the ‘subclass of’ section. Once you synchronize the reasoner, you will see the automated classification of your new term. If the inferred classification doesn’t make sense, then you will need to modify the logical definition. 

12. In some cases such as ```part_of``` relations based on external partonomies, it might be necessary to assert the ```part_of``` relationships. For example: ```‘heart valve development’ part_of some ‘heart development’```. In those cases, it is important to browse the external ontologies to be sure that nothing is missing. 

13. When you have finished adding the term, you can hover over it in the class window to reveal its GO_id.

14. Save the file and ___return to your terminal window___. Then, type: ```git status```. This will confirm which file has been modified. 

15. Then, type: ```git diff```. This will show how the branch was modified. In this case, go-edit.obo was modified. The text below is not the entire diff for this edit, but is an example. If the diff is very large, you will need to hit a space to continue to see it and then hit ‘q’ to get back to the prompt at the end of the diff file. 
 
     ```
     ~/repos/go-ontology/src/ontology(issue-13390) $ git diff
     diff --git a/src/ontology/go-edit.obo b/src/ontology/go-edit.obo
     index 72ae7e9..8d47fa1 100644
     --- a/src/ontology/go-edit.obo
     +++ b/src/ontology/go-edit.obo
     @@ -400751,6 +400751,85 @@ created_by: dph
      creation_date: 2017-04-28T12:39:13Z
      
      [Term]
     +id: GO:0061868
     +name: hepatic stellate cell migration
     +namespace: biological_process
     +def: "The orderly movement of a hepatic stellate cell from one site to another." [PMID:24204762]
     +intersection_of: GO:0016477 ! cell migration
     +intersection_of: results_in_movement_of CL:0000632 ! hepatic stellate cell
     +created_by: dph
     +creation_date: 2017-05-01T13:01:40Z
     +
     +[Term]
      id: GO:0065001
      name: specification of axis polarity
      namespace: biological_process
     ~/repos/go-ontology/src/ontology(issue-13390) $
     ``` 
 
16. Commit the changes you have made to your branch.
 
    1. Type: ```git commit -m ‘Meaningful message Fixes #ticketnumber’ go-edit.obo```. Example:  ```git commit -m ‘hepatic stellate cell migration and contraction and regulation terms. Fixes #13390’ go-edit.obo```. This will save the changes to the go-edit.obo file.

        ```
        ~/repos/go-ontology/src/ontology(issue-13390) $ git commit -m 'Added hepatic stellate cell migration and contraction and regulation terms. Fixes #13390' go-edit.obo
        [issue-13390 dec9df0] Added hepatic stellate cell migration and contraction and regulation terms. Fixes #13390
        1 file changed, 79 insertions(+)
        ~/repos/go-ontology/src/ontology(issue-13390) $
        ```

        The word 'fixes' is a magic word in GitHub; when used in combination with the ticket number, it will automatically close the ticket. In the above example, when the file is merged in GitHub, it will close issue number 13390. Learn moree on this [GitHub Help Documentation page about 'Closing issues via commit messages'](https://help.github.com/articles/closing-issues-via-commit-messages/).
 
    2. A note about ```git commit```. git needs to know who you are when you commit changes, so the first time you commit, you may see the following message: ```Committer: Kimberly Van Auken <vanauken@kimberlukensmbp.dhcp.lbnl.us>```

       Your name and email address were configured automatically based on your username and hostname. Please check that they are accurate.
 
       You can suppress this message by setting your name and email explicitly:

       - Type: ```git config --global user.name "Your Name"```
 
       - Type: ```git config --global user.email you@example.com```
 
    3. After doing this, you may fix the identity used for this commit by typing: ```git commit --amend --reset-author```
 
17. To incorporate the changes into the remote repository, type: ```git push origin mynewbranch```. Example: git push origin issue-13390
 
    1. The first time you push, git will prompt you for your username and password. If you are working on a Mac, git will remember the values and you won’t be prompted every time you try to make a push. If you change your git password, you won’t be recognized. If this happens, you need to reset git by entering: ```git config --global credential.helper osxkeychain```
        
    2. When you try to push, git will prompt you to update your information. You will need to enter your username and your password.

            ```
            ~/repos/go-ontology/src/ontology(issue-13390) $ git push origin issue-13390
            Counting objects: 5, done.
            Delta compression using up to 8 threads.
            Compressing objects: 100% (5/5), done.
            Writing objects: 100% (5/5), 1.81 KiB | 0 bytes/s, done.
            Total 5 (delta 3), reused 0 (delta 0)
            remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
            To https://github.com/geneontology/go-ontology.git
             * [new branch]  	issue-13390 -> issue-13390
            ~/repos/go-ontology/src/ontology(issue-13390) $
            ```

18. Using your browser, return to the GO Ontology repository on GitHub, located at [https://github.com/geneontology/go-ontology](https://github.com/geneontology/go-ontology).
    
19. Navigate to the tab labeled as 'Code' (```geneontology/go-ontology/code```). You will see your commit listed at the top of the page in a light yellow box. If you don’t see it, click on the 'Branches' link to reveale it in the list, and click on it. 

    1. The diff for your file is at the bottom of the page. Examine it as a sanity check. 
     
    2. Click on the green box to generate a pull request.

20. You may now add comments and ask a colleague to review your pull request.

21. If you want to have the ticket reviewed before closing it, you can select a reviewer for the ticket before you make the pull request by clicking on the 'Reviewers' list and entering a GitHub identifier (e.g. @superuser1). The reviewer will not be notified until the pull request is submitted. The reviewer’s comments will show up in the dialog tab of the pull request, similarly to comments displayed in response to issues you file on the tracker.

22. Wait for the Travis checks to complete (this can take a few minutes). 

23. If all is fine with the Travis checks, then merge the pull request, and confirm the merge which will close the ticket if you have used the word 'fixes' in your pull request. You can now safely delete your branch using the button on the right of the successful merge message.

24. Back in your terminal, if appropriate, you may now delete the working branch. Do this by returning to master, then: 

    1. Type: ```git checkout master```

    2. Type: ```git branch -d workingbranchname```. Example: ```git branch -d issue-13390```
