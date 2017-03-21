GO Ontology Editors Guide

Installing Protege

1. Follow the instructions on the GO wiki page:

[http://wiki.geneontology.org/index.php/Protege_setup_for_GO_Eds](http://wiki.geneontology.org/index.php/Protege_setup_for_GO_Eds)

      2.  Need to add more here about the different Views and Tabs needed for working.

		

Cloning the github go-ontology repo

1. Make a repos directory on your local machine

2. Then paste into the command line:

    		**git clone ****[https://github.com/geneontology/go-ontology.gi**t](https://github.com/geneontology/go-ontology.git)

Editing .profile (or .bashrc) file to indicate branch

1. It can be very helpful to know what branch you are working in on your terminal window.

2. You can set this up to display by adding the following information to your .profile file (found by typing ls -a):

    1. export GO_REPO=$/repos/go-ontology  (full path name to the go-ontology directory on your local machine)

    2. . $GO_REPO/src/util/git-completion.bash

    3. parse_git_branch() {

    4.   git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'

    5. }

    6. PS1="\w\$(parse_git_branch) $ 

Daily Workflow - Updating with ‘git pull’

1. Navigate to the src directory of go-ontology:  /repos/go-ontology/src

2. Type: **git status** - this will tell you what branch you are working on

3. From the master branch, 

type: **git pull**.  

This will update your master branch with the origin branch on github, bringing in any changes that were made since your last ‘git pull’ command.

You will see something like this:

~/repos/go-ontology(master) $ git pull

remote: Counting objects: 26, done.

remote: Compressing objects: 100% (26/26), done.

remote: Total 26 (delta 12), reused 0 (delta 0), pack-reused 0

Unpacking objects: 100% (26/26), done.

From https://github.com/geneontology/go-ontology

   580c01d..7225e89  master 	-> origin/master

 * [new branch]  	issue#13029 -> origin/issue#13029

Updating 580c01d..7225e89

Fast-forward

 src/ontology/go-edit.obo | 39 ++++++++++++++++++++++++---------------

 1 file changed, 24 insertions(+), 15 deletions(-)

~/repos/go-ontology(master) $

Daily Workflow - Creating a New Working Branch with **git checkout**

1. When starting to work on a ticket, you should create a new branch of the repository to edit the ontology file.

2. To create a new branch, make sure you are in the src directory on your local machine and then 

type:  **git checkout -b mynewbranch (issue-#####)**

    1. Typing this command will automatically put you in the new branch.

    2. Note that the use of checkout is different between git and SVN.  Checkout in git is the method to create and move between branches, it does not retrieve a file from the repository. Checkout, when used with the -b argument, creates a new branch.  Checkout without the argument switches you from one branch to another.

Creating a New Ontology Term

1. Making sure you are in your working branch of the repo, start Protege.

2. Open the file: go-edit.obo

3. Click on the Entities tab

4. Use the search box on the upper right to search for a term in the ontology.

5. Double-click on the term and you should see the term appear in the Class hierarchy window.

6. To see the term in the Class hierarchy (inferred) window, you will need to run the ELK reasoner.  

7. In the Class hierarchy window, click on the Add subclass button at the upper left of the window.

8. A pop-up window will appear asking you to enter the Name of the new term. Add it and save. Then navigate to the OBO annotation plug-in. 

9. ***Need to fill in here wrt other information to add for a term, e.g. logical defs, synonyms, etc.*** 

10. When you have finished adding the term, save the file and* ***_return to your terminal window_**** **and 

type: **git status**  

This will confirm which file has been modified. 

11. Then 

type: **git diff**

This will confirm how the file was modified.

12. Now commit to the changes you’ve made to your branch.

type: **git commit -m ‘Meaningful message plus Fixes #ticketnumber’** . or filename.

The ‘.’ saves all files.

Fixes is a magic github word; when used in combination with the ticket number, it   

                        will automatically close the ticket.

		A note about git commit.  git needs to know who you are when you commit    

                       changes, so the first time you commit, you may see the following message type of

                       message:

                             Committer: Kimberly Van Auken <vanauken@kimberlukensmbp.dhcp.lbnl.us>

                             Your name and email address were configured automatically based on your 

                             username and hostname. Please check that they are accurate.

                             You can suppress this message by setting your name and email explicitly:

		type: **git config --global user.name "Your Name"**

		type: **git config --global user.email you@example.com**

After doing this, you may fix the identity used for this commit with:

		type: **git commit --amend --reset-author**

13. To now incorporate the changes into the remote repository 

type: **git push origin mynewbranch**

14. Now go back to the geneontology/go-ontology repository on github

    1. https://github.com/geneontology/go-ontology

15. Migrate to geneontology/go-ontology/code and generate a pull request.

16. Wait for the Travis build to complete

17. If all is fine with the Travis build, then merge the pull request, and confirm the merge which will close the ticket. You can now safely delete your branch from origin using the button on the right of the successful merge message.

18. If you want to have the ticket reviewed before closing, you can select a reviewer for the ticket before you make the pull request. The reviewer will not be notified until the pull request is made. The reviewer’s comments will show up in the pull request the same way they do in issues when we work on tickets.

19. In the terminal window of your machine, you can now delete the working branch, if desired, by returning to master 

type: **git checkout master**

type: **git branch -d workingbranchname**

Obsoleting an Existing Ontology Term

1. Making sure you are in your working branch of the repo, start Protege.

2. Open the ontology file: go-edit.obo

3. Click on the Entities tab

4. Click on the Search button on the upper right and search for the term(s) slated for obsoletion

5. Select the term you want by double-clicking it in the resulting list

6. Change view to Classes

7. In Annotations window, click on the + sign next to Annotations

8. In the resulting pop-up window, select owl:deprecated from the left-hand menu

9. With owl:deprecated selected, select the Literal tab view from the right-hand tab list and

   	 		type: **true** 

            in the text box.

    10.  In the Type drop-down menu underneath the text box, select

**xsd:boolean**

    11.  Click OK

    12.  You should now see the term crossed out in the Class hierarchy view

    13.  Now move to the Description window

    14.  If there is an equivalence axiom, then under the Equivalent To entry, click the X on the  

           right-hand side to delete the logical definition. 

    15.  Under the SubClass Of entry, click the X on the right-hand side to delete the SubClass 

           Relation.

    16.  Now you need to add obsolete to the term name and definition.  For the term name, go 

           Back to the Annotations window and click on the O on the right-hand side of the rdfs:label 

           entry to edit the term string.  In the resulting window, in the Literal tab, in front of the term 

           name: 

   	         type: **obsolete**

**    **17.  For the definition, again, click on the O on the right-hand side of the definition entry.  In

           the resulting window, in the Literal tab, at the beginning of the definition:

   	         type: **OBSOLETE** 

    18.  Now move to the OBO annotation window.

    19.  In the Comment box, add a statement about why the term was made obsolete.

       	 Consult wiki documentation for suggestions on standard comments.

	http://wiki.geneontology.org/index.php/Curator_Guide:_Obsoletion

             [http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms](http://wiki.geneontology.org/index.php/Obsoleting_GO_Terms)

             [http://wiki.geneontology.org/index.php/Editor_Guide](http://wiki.geneontology.org/index.php/Editor_Guide)

    20.  In the Type drop-down menu, select:

   	        **xsd:string**

    21. From the File menu in Protege, Save the file.

    22. Now go back to your terminal window.

                   type: **git status**

**          **This will confirm what branch you’re on.

    23.  Then:

    	        type: **git diff**

   	should see +is_obsolete: true

    24.  Next:

                    type: **git commit -m ‘obsoleted GO term Fixes #12923’** 

    25.  Then push your changes back to the origin (github):    

                    Type: **git push origin myworkingbranch**

    26.  Now go back to the geneontology/go-ontology repository on github

    2. [https://github.com/geneontology/go-ontology](https://github.com/geneontology/go-ontology)

    27.  Navigate to the Code tab

    28.  Create a pull request

    29.  You can review the diff by clicking on string next to gold circle

    30.  Wait for Travis build

    31.  If all checks okay, then merge pull request, confirm merge/close ticket

    

Merging Ontology Terms

1. In Protege, select the Classes tab.

2. Write down the GO IDs of the terms that will be merged so you can keep track of the ‘winning’ and ‘losing’ terms.

3. In the Protege menu, click on Refactor.

4. Select ‘Rename entity’ from the list of options.

5. In the ‘Change entity URI’ pop-up window, enter the GO ID of the term that will be merged into another term (the losing term).

6. Return to the Refactor -> ‘Rename entity’ menu and enter the GO ID of the term that will receive the merge (the winning term).

7. You will now see the term name replaced in the Class hierarchy window and the annotations associated with both terms in each of the annotation windows.

8. In the Annotations window, navigate to the ‘losing’ GO ID.

9. Click on the O symbol to add an annotation to this ID.

10. In the resulting pop-up window, select ‘has_alternate_id’ from the list on the left side.

11. Make sure the Literal tab is selected in the right side box, and check that the entry corresponds to the GO ID of the ‘losing term’.  

12. Click okay.

13. Check the existing list of synonyms to see if the ‘losing’ name was already listed as a synonym.  If not,

14. To add the ‘losing’ term name to the list of synonyms, navigate to the list of labels, and select the O button to edit the property of the ‘losing’ name.

15. Select the appropriate synonym label from the list on the left:

    1. has_broad_synonym

    2. has_exact_synonym

    3. has_narrow_synonym

    4. has_related_synonym

    

   	     Add synonym from losing term name

   	 Check existing list of synonyms to see if the losing term name was already there

   	 Check existing list of synonyms to see if they all still make sense

     

 	

	

