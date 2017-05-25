# Installing and Using git

## Installing git

1. In order to locally edit the ontology and push changes back to the GitHub repository, you will need to have git installed on your machine.

2. To check if you already have git installed, or to see what version of git you have, type either of these commands in your terminal:
   1. ```which git```
   2. ```git --version```

3. To install git, follow  instructions here: [https://git-scm.com/](https://git-scm.com/)

4. __Note for MacOSX users:__ it is advised to install Xcode tools.


## Cloning the go-ontology repository from GitHub

1. Create a directory called ```repos``` on your local machine using this command:

    ```mkdir repos```

2. Then paste this command into your terminal:

    ```git clone https://github.com/geneontology/go-ontology.git```

Example result:

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

1. Navigate to the ontology directory of go-ontology:  ```/repos/go-ontology/src/ontology```

2. Type: ```git status``` to reveal the branch you are working on.

3. Make sure you are working on the master branch.

    If you are, you will see: 
    
    ```On branch master```

    ```Your branch is up-to-date with 'origin/master'.```

4. If you’re not in the master branch, type: ```git checkout master```

5. From the master branch, type: ```git pull```

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

2. To create a new branch, make sure you are in the src directory on your local machine and then type:  ```git checkout -b issue-NNNNN```

   1. Users may customize the name of the branch; we recommend using the string 'issue-' followed by the issue number.
	
      For instance, for this issue in the tracker: https://github.com/geneontology/go-ontology/issues/13390

      You would create this branch: ```git checkout -b issue-13390```


   2. Typing this command will automatically put you in the new branch. You will see this message in your terminal window: 

      ```
      ~/repos/go-ontology/src/ontology(master) $ git checkout -b issue-13390
      Switched to a new branch 'issue-13390'
      ~/repos/go-ontology/src/ontology(issue-13390) $
      ```
