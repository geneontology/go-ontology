# Installing and Using git

## Installing git

  1. In order to locally edit the ontology and push changes back to the GitHub repository, you will need to have git installed on your machine.⋅⋅

  2. To check if you already have git installed, or to see what version of git you have, type either of these commands in your terminal: 
      ```which git```   
      ```git --version```    
  
  3. To install git, follow  instructions here: [https://git-scm.com/](https://git-scm.com/)
  
 __Note for MacOSX users:__ it is advised to install Xcode tools.


## Cloning the go-ontology repository from GitHub

1. Create a directory called ```repos``` on your local machine using this command:

       mkdir repos

2. Then paste this command into your terminal:

       git clone https://github.com/geneontology/go-ontology.git

- Example result:

```
Cloning into 'go-ontology'...
remote: Counting objects: 2541, done.
remote: Compressing objects: 100% (100/100), done.
remote: Total 2541 (delta 52), reused 0 (delta 0), pack-reused 2440
Receiving objects: 100% (2541/2541), 21.19 MiB | 5.22 MiB/s, done.
Resolving deltas: 100% (1532/1532), done.
```

## Editing the .profile (or .bashrc) file to indicate the branch you are working on

1. It can be very helpful to know what branch you are working in on your terminal window.

2. You can set this up to display by adding the following information to your .profile file (found by typing ls -a):

```
export GO_REPO=~/repos/go-ontology
. $GO_REPO/src/util/git-completion.bash
parse_git_branch() {
    git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'
}
PS1="\w\$(parse_git_branch) $ "
```


## Daily Workflow - Updating with 'git pull'

1. Navigate to the ontology directory of go-ontology:  ```cd repos/go-ontology/src/ontology```

2. If the terminal window is not configured to display the branch name, type: ```git status```. You will see: 
    
       On branch [master] [or the name of the branch you are on]

       Your branch is up-to-date with 'origin/master'.

3. If you’re not in the master branch, type: ```git checkout master```

4. From the master branch, type: ```git pull```

    This will update your master branch, and all working branches, with the files that are most current on GitHub, bringing in and merging any changes that were made since you last pulled the repository using the command ```git pull```.

    You will see something like this:

```
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
```

## Daily Workflow - Creating a New Working Branch with 'git checkout'

1. When starting to work on a ticket, you should create a new branch of the repository to edit the ontology file.

2. **Make sure you are on the master branch before creating a new branch**. If the terminal window is not configured to display the branch name, type: ```git status``` to check which is the active branch. If necessary, go to master by typing ```git checkout master```.  

3. To create a new branch, type:  ```git checkout -b issue-NNNNN``` in the terminal window.

   1. Branch names: we recommend using the string 'issue-' followed by the issue number.
	
      For instance, for this issue in the tracker: https://github.com/geneontology/go-ontology/issues/13390

      You would create this branch: ```git checkout -b issue-13390```

   2. Typing this command will automatically put you in the new branch. You will see this message in your terminal window: 

      ```
      ~/repos/go-ontology/src/ontology(master) $ git checkout -b issue-13390
      Switched to a new branch 'issue-13390'
      ~/repos/go-ontology/src/ontology(issue-13390) $
      ```


## Daily Workflow - Continuing work on an existing Working Branch 
1. If you are continuing to do work on an existing branch, in addition to updating master, go to your branch by typing ```git checkout [branch name]```
 - Note that you can view the existing local branches by typing ```git branch -l```
2. Make the content of the branch up to date with master (ie, the information in the GO repository) by typing ```git pull origin master ```


## Daily Workflow - Loading, navigating and saving the Ontology in Protegé 

1. Before launching Protégé, make sure you are in the correct branch. Type ```git status``` to check the current branch if necessary. 

2. Click on the 'File' pulldown. Open the file: go-edit.obo. The first time, you will have to navigate to ```repos/go-ontology/src/ontology```. Once you have worked on the file, it will show up in the menu under 'Open'/'Recent'.

3. Click on the 'Classes' tab.

4. Searching: Use the search box on the upper right to search for a term in the ontology. Wait for autocomplete to work in the pop-up window.

5. Viewing a term: Double-click on the term. This will reveal the term in the 'Class hierarchy' window after a few seconds.

6. Launching the reasoner: To see the term in the 'Class hierarchy' (inferred) window, you will need to run the 'ELK reasoner'. 'Reasoner' > select ELK 0.4.3, then click 'Start reasoner'. Close the various pop-up warnings about the ELK reasoner. You will now see the terms in the inferred hierarchy.

7. After each modification of the ontology, synchronize the reasoner. 'Reasoner' > ' Synchronize reasoner'

8. Use File > Save to save your changes. 

## Daily Workflow - Committing, pushing and merging your changes to the repository
 
1. **Review**: Changes made to the ontology can be viewed by typing ```git diff``` in the terminal window. If there are changes that have already been committed, the changes in the active branch relative to master can be viewed by typing  ```git diff master```. 

2. **Commit**: Changes can be committed by typing: ```git commit -m ‘Meaningful message Fixes #ticketnumber’ go-edit.obo```. 
- Example:  ```git commit -m ‘hepatic stellate cell migration and contraction and regulation terms. Fixes #13390’ go-edit.obo```. This will save the changes to the go-edit.obo file.
        ```
        ~/repos/go-ontology/src/ontology(issue-13390) $ git commit -m 'Added hepatic stellate cell migration and contraction and regulation terms. Fixes #13390' go-edit.obo
        [issue-13390 dec9df0] Added hepatic stellate cell migration and contraction and regulation terms. Fixes #13390
        1 file changed, 79 insertions(+)
        ~/repos/go-ontology/src/ontology(issue-13390) $
        ```
- **Note**: The word 'fixes' is a magic word in GitHub; when used in combination with the ticket number, it will automatically close the ticket. In the above example, when the file is merged in GitHub, it will close issue number 13390. Learn moree on this [GitHub Help Documentation page about 'Closing issues via commit messages'](https://help.github.com/articles/closing-issues-via-commit-messages/).
	If you don't want to close the close the ticket, just refer to the ticket # without the word 'Fixes'. The commit will be associated with the correct ticket but the ticket will remain open. 
- **Identifying the user for commits** Git needs to know who is committing changes to the repository, so the first time you commit, you may see the following message: ```Committer: Kimberly Van Auken <vanauken@kimberlukensmbp.dhcp.lbnl.us>```

       Your name and email address were configured automatically based on your username and hostname. Please check that they are accurate.
 
       You can suppress this message by setting your name and email explicitly:

       - Type: ```git config --global user.name "Your Name"```
 
       - Type: ```git config --global user.email you@example.com```
 
       - After doing this, you may fix the identity used for this commit by typing: ```git commit --amend --reset-author```
3. **Push**: To incorporate the changes into the remote repository, type: ```git push origin mynewbranch```. Example: git push origin issue-13390
- The first time you push, git will prompt you for your username and password. If you are working on a Mac, git will remember the values and you won’t be prompted every time you try to make a push. If you change your git password, you won’t be recognized. If this happens, you need to reset git by entering: ```git config --global credential.helper osxkeychain```
-  When you try to push, git will prompt you to update your information. You will need to enter your username and your password.

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
4. **Pull** Using your browser, return to the GO Ontology repository on GitHub, located at [https://github.com/geneontology/go-ontology](https://github.com/geneontology/go-ontology).
    1. Navigate to the tab labeled as 'Code' (```geneontology/go-ontology/code```). You will see your commit listed at the top of the page in a light yellow box. If you don’t see it, click on the 'Branches' link to reveale it in the list, and click on it. 

    2. The diff for your file is at the bottom of the page. Examine it as a sanity check. 
     
    3. Click on the green box to generate a pull request.

    4. You may now add comments and ask a colleague to review your pull request. If you want to have the ticket reviewed before closing it, you can select a reviewer for the ticket before you make the pull request by clicking on the 'Reviewers' list and entering a GitHub identifier (e.g. @superuser1). The reviewer will not be notified until the pull request is submitted. The reviewer’s comments will show up in the dialog tab of the pull request, similarly to comments displayed in response to issues you file on the tracker.

    5. Wait for the Travis checks to complete (this can take a few minutes). 

5. **Merge** If the Travis checks are succesful, merge the pull request. Confirming the merge will close the ticket if you have used the word 'fixes' in your commit comment. 

6. You can now safely delete your branch on the repository using the button on the right of the successful merge message. 

7. If appropriate, you may now delete the working branch on your local copy. Back in your terminal, return to master and delete 

    1. Type: ```git checkout master```

    2. Type: ```git branch -d workingbranchname```. Example: ```git branch -d issue-13390```

