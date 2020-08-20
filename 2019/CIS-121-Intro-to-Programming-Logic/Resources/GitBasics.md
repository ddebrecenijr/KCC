# Git Basics
We will not be using git as a part of this class, but if you would like to, here are some things that can help you.

## What is Git?
Git is what is known as a Distributed Version Control System.
To start, a Version Control is a type of software that records changes to a file or set of files over time. In this way, you can recover or go back to specific versions of these files later.
With this, you can revert files or entire projects to previous states. Or you can review the changes that have occurred over time. It'll also show you who made these changes so you can quickly see who it was that caused a problem. Essentially, if you screw up, all is not lost, just revert to before!
The "Distributed" part comes in as meaning that there isn't just one central location storing these files. It has a complete copy of everything wherever you downloaded them! This is helpful for say, your hard disk fails, you can easily recover that data from another machine you used it on.
GitHub is a central place that keeps a copy of your projects on its servers for you. That way if you only worked on one computer anyways, if it died tomorrow, you've no fear (lest you forgot to push).

## Commands
I won't go crazy about all the nuances of git, but here are a couple of helpful commands for you guys.
- `git clone <repository-url>`: On github exists your projects. You may want to download them to a couple places as you work and switch classes. This allows you to clone (create an exact copy) of your current files on GitHub. For Example, to clone this repository: `git clone https://github.com/ddebrecenijr/CIS-121-Intro-to-Programming-Logic.git`
- `git status`: When you make modifications/changes or create/delete files in your project, git knows about them! By running this command, you can see what files have pending changes in them.
- `git add <files>`: This typically follows after you have run `git status`. This is what is known as "staging your files for commit". For Example, if I had changed this file, I could run: `git add GitBasics.md`
- `git commit -m "message"`: This is what is known as commiting your changes. Its like hitting save on your files. The `-m` is asking for a message which we can put in `"quotes"`. If you don't provide this, it'll ask you to make one anyways. This is just a shorter notation for it. For Example, `git commit -m "Updated GitBasics.md to include what commits are"
- `git push`: This is probably the most important part of git. We need to update our repository, the place where our files are stored, with our changes. To do so, we can *push* our changes.
- `git pull`: This will grab the latest changes from the remote repository and attempt to merge them into your local copy. Be careful though, you may run across merge conflicts if you didn't push files. As a note, pull regularly if you are working with others.

## Advanced Commands
Git has this notion of branches, which is like separating your work from your main files to test something out, but you aren't quite sure if you want it or not.
So we can create branches to focus on specific tasks and then make Pull Requests (PR)s back into our main development branch. This is common practice.
To do so we can run `git checkout -b <branch_name>`. This will create a new branch for us and we switched over to it. This includes whatever work we were working on. For example, `git checkout -b homework1`.

You can use the regular commands that you were using before to add your changes and push them up.

Now, if we go to GitHub, you'll notice that there are two branches. We'll want to eventually perform a `merge` from one to the other. We can do that by utilizing the Pull Request functionality built into GitHub. Just go ahead and create a new PR in GitHub. Here you'll have a final chance to correct anything wrong, review your code, ask others to review it for you, etc. Once completed, just go ahead and merge it!
