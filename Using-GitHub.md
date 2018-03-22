# Git Hub workflows and solutions

1. [Initially create personal GitHub repo from Class repo](#CloneToPersonalGitHubRepo)
1. [Initially create a copy of personal GitHub repo on a local computer](#CloneToPersonalComputer)
1. [You have made changes locally that you want to have in your GitHub repo](#PushChangesToPersonalGitHubRepo)
1. [Move changes from your personal GitHub repo to the class GitHub repo](#PushChangesToClassRepo)
* [After you crete the repository on your personal space, it is updated](#PullClassChangesToPersonalGitHubReop)
* [Pulling changes to your local computer that happened after you cloned the repo](#PullUpdatesFromPersonalGitHubRepoToLocalRepo)



## CloneToPersonalGitHubRepo

You need to have a personal account on GitHub.

* Go to the class repo you would like to copy into your space on GitHub.
* Click the fork button.
* Select your name in the window that comes up.

You should now have a copy of the repository that has what was current at the time you created the copy.


## CloneToPersonalComputer

You need to have GitBash installed on your computer if you are running windows.  
If not using windows, then install Git, and use the command line instead of GitBash in these instructions.

* Go to the repo in your personal space on GitHub (your user name will be in the upper left.)
* Click the green "Clone or Download"button on the right hand side.
* Copy the link that is shown here (note that clicking on the clipboard icon will copy the text.)
* In GitBash, navigate to the folder you want te repository to be located in (use the 'cd' command.)
* Run the command: 'git clone ' and past the link you copied above.  Then hit return.

You should now have a folder with the name of the repository at the location you are at on the computer.
Inside that should be the files that were in the repository when you cloned it.


## PushChangesToPersonalGitHubRepo

* Open GitBash and navigate inside the repository folder.
* Run the command 'git add -A' to work towards having all changes added.
* Run the command 'git commit' to make a commit with the changes on these files.
* Run the command 'git push origin/master' to push the changes in the commit to your personal GitHub repo.

Note: you can run the command 'git status' at any time to get a feel for what has been done/needs to be done.
* Any files whose name is in red are files that have changes that have not been added yet.
* Any files whose name is in green have been added, and are waiting on being committed.
* If a file name does not show up here, then either it current version has been committed, or there has been not change to it.

Also Note, you can always check if this worked properly, as you can log into the GitHub web page, and from there, go to your personal repository for this project.  Check if the changes you made to files are in those files.  If so, then you are good.  If not, ggheck a git status, and verify you did the git push command above.  If neither of those solve your issue, please contact the professor.


## PushChangesToClassRepo

* Open up the GitHub website, and go to your personal repository for this project.
* Click the create pull request button.
* Make sure your personal repo is on the right, and the class repo is on the left.
* Click create repo (entering in a description if it wants it, or you want to.)
* Go through two or three more screens saying yes merge, until it says that either it can't merge, or it merged successfully.

If you get a note that it can't merge, let the professor know.  


## PullClassChangesToPersonalGitHubReop

* Go to your personal GitHub copy of the repository.
* Select new pull request.
* Make sure the class repository is on the right and your personal is on the left.
* Select "Create Pull Request", and continue to click the buttons to merge this in.

If you get a merge conflict, and GitHub can not merge, contact the professor for help.


## PullUpdatesFromPersonalGitHubRepoToLocalRepo

* In GitBash, go inside the folder for this repo on your local machine.  (usind the command 'cd')
* Run the command 'git pull origin master'
