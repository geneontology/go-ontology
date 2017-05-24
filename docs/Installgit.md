## Installing git

1. In order to edit the ontology locally and push changes back to the github repository, you will need to have git installed on your machine.

2. To check if you already have git installed or to see what version of git you have, on the command line type either:
   1. ```which git```
   2. ```git --version```

3. If you need to install git, follow the instructions here:

https://git-scm.com/

4. Note that for MacOSX users, it is advised to install Xcode tools.

## Cloning the github go-ontology repo

1. Make a ```repos``` directory on your local machine

    ```mkdir repos```

2. Then paste into the command line:

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

## Editing .profile (or .bashrc) file to indicate branch

1. It can be very helpful to know what branch you are working in on your terminal window.

2. You can set this up to display by adding the following information to your .profile file (found by typing ls -a):

```
export GO_REPO=~/repos/go-ontology
. $GO_REPO/src/util/git-completion.bash
parse_git_branch() {
    git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'
}
PS1="\w\$(parse_git_branch) $ “
```

Note that ```export GO_REPO=~/repos/go-ontology``` is the full path name to the go-ontology directory on your local machine.

## Daily Workflow - Updating with ‘git pull’

1. Navigate to the ontology directory of go-ontology:  /repos/go-ontology/src/ontology

2. Type: ```git status``` - this will tell you what branch you are working on

3. Make sure you’re in the master branch.

    If you are, you will see:

    On branch master

    ```Your branch is up-to-date with 'origin/master'.```

4. If you’re not in the master branch:

    type: ```git checkout master```

5. From the master branch: 

    type: ```git pull```

    This will update your master branch, and all working branches, with the files that are most current on github, bringing in and merging any changes that were made since your last ‘git pull’ command.

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

## Daily Workflow - Creating a New Working Branch with git checkout

1. When starting to work on a ticket, you should create a new branch of the repository to edit the ontology file.

2. To create a new branch, make sure you are in the src directory on your local machine and then 

    type:  ```git checkout -b issue-NNNNN```

   1. You can choose any branch name you like, but we recommend the string ‘issue-’ followed by the issue number
	
      For instance, for this issue in the tracker: https://github.com/geneontology/go-ontology/issues/13390

      You would create this branch: ```git checkout -b issue-13390```


   2. Typing this command will automatically put you in the new branch.

```
~/repos/go-ontology/src/ontology(master) $ git checkout -b issue-13390
Switched to a new branch 'issue-13390'
~/repos/go-ontology/src/ontology(issue-13390) $
```
