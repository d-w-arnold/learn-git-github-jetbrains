[Back to Contents](../README.md#contents)

---

## <a name="git"></a>Git (Version Control)

**Git** : a command line, version control tool.

- Version Control is the **management of changes to documents**.

Reasons to use **Git** :

- Use of **Git** looks good to employers for **Year in Industry**.
    
- Using **Git** version control allows us to record changes to a project (a directory of files) over time, we can then recall specific versions later, especially if we end up breaking our code.

- With **Git** version control, you'll no longer need to keep a copy of working code before attempting big changes.

---

**Three main components** of a **Git project** :

- **Repository** : or **repo**

    - A centrally located directory/folder for storing all your code.

    - A repo is a “container” that **tracks the changes to your project files**.
    
    - It holds all **commits** — a snapshot of all your files at a point in time — that have been made.
    
    - `git log` - **access the commit history** within a Git repo.

- **Working Tree** : or **working directory**

    - Consists of **files that you are currently working on**.
    
    - You can think of a working tree as a file system where you can view and modify files.

- **Index** : or **staging area**

    - Is **where commits are prepared**.
    
    - The index compares the files in the working tree to the files in the repo.
    
    - When you make a change in the working tree, the **index marks the file as modified before it is committed**.

---

**Three states** of **files in Git project** :

- **Modified** : When a file is first modified, the change can only be found in the working tree.

- **Staged** : You must stage the changes you want to be included in your next commit. The index contains all file changes that will be committed.

- **Committed** : Once you have finished staging files, commit them with a message describing what you changed. The modified files are now safely stored in the repo.

---

**Two types** of **Git repos**:

- Remote repository : is hosted on a remote, or off-site, server that is shared among multiple team members.

- Local repository : is hosted on a local machine for an individual user.

While you can take advantage of Git (version control) features with a local repository, collaboration features—like pulling and pushing code changes with teammates—will be better suited on a remote repository.

---

### <a name="install_git"></a>Install Git

[Install for Mac OS / Windows](https://git-scm.com/download)

[Install for Linux](https://git-scm.com/download/linux)

(Optional)

Install through **HomeBrew** (Mac OS Package Manager) :

```bash
user@hostname:~$ brew install git
```

---

### <a name="config_git"></a>Git configuration

- `git config` - lets you **get and set configuration variables** that control all **aspects of how Git looks and operates**.

    ```bash
    # Set the users user name for Git locally.
    git config --global user.name "John Doe"
    
    # Set the users email address for Git locally.
    git config --global user.email johndoe@example.com
    
    # Set the default editor for Git locally, to 'nano' text editor.
    git config --global core.editor nano
    ```

---

### <a name="learning_git_commands"></a>Learning about Git commands

(\*\***IMPORTANT**\*\*) If you need to learn about a Git command, use the following style:

```bash
# Learn about the command 'git config'
man git-config

# Learn about the command 'git commit'
man git-commit

# Learn about the command 'git status'
man git-status
```

---

### <a name="create_repo"></a>Create a Git repository

- `git init` - create a **new repo from scratch** (init -> initialisation).

    ```bash
    git init
    ```

    - It can be used to introduce Git into an existing, unversioned project in order to start tracking changes.

    - Creates a `.git` (hidden) directory/folder in the current directory.

    - Features a default `master` branch.

- `git clone <url>` - **copy a remote repository onto your local machine**.

    ```bash
    # Using HTTP protocol.
    git clone https://github.com/libgit2/libgit2
    
    # Using SSH protocol.
    git clone ssh://git@github.com/user/repository_name.git
    ```

    - Automatically sets up a local `master` branch that tracks the remote `master` branch it was cloned from.

    - Has the same history log as the original repo - you can refer and backtrack to any of those commits within your local copy of the cloned repo.

---

### <a name="commiting"></a>Commiting to Git repository

- `git status` - show changed files in the working tree.

    ```bash
    git status
    ```
    
- `git diff` - show changes to tracked files.

    ```bash
    git diff
    # Press 'q' to exit
    ```    

- `git add <file>` - adds a file to the index (staging area) in preparation for the next commit.

    ```bash
    # Add to the index, the file 'test.java' in the current directory.
    git add test.txt
    
    # Add to the index, all Java files in the current directory.
    git add *.java
    ```

- `git commit` - enables you to record file changes in the repository's Git history.

    ```bash
    git commit # Default editor will open, add a message to commit.
    
    # Automatically stage files that have been modified and deleted, new files are not affected.
    git commit -a
    
    # Add a message to commit, while comminting.
    git commit -m "Write message here"
    
    # Change the last commit.
    git commit --amend
    
    # Change the last commit, without changing the message for the commit.
    git commit --amend --no-edit
    ```

- `git log` - show commit logs.

    ```bash
    git log
    ```

---

### <a name="undo"></a>Undo in Git repository

```bash
# Discard local changes in a specific file.
# 'HEAD' is a reference to the current branch.
git checkout HEAD <file>

# Revert a commit (by producing a new commit with contrary changes).
git revert <commit> 

# To unstage all changes, undo a 'git add'.
git reset
    
# To unstage all changes in a specific file, undo a 'git add'.
git reset <file>
    
# Discard all local changes in your working directory.
git reset --hard HEAD
    
# Reset HEAD to a previous commit
# ... and preserve all changes as unstaged changes.
git reset <commit>
    
# ... and discard all changes since then.
git reset --hard <commit>
    
# ... and preserve uncommited local changes.
git reset --keep <commit>
```

---

### <a name="undo"></a>Publish and Update - working with a Remote repository

```bash
# Add new remote repository, named <shortname>
git remote add <shortname> <url>

# Changes URL for the remote <shortname>.
git remote set-url <shortname> <url>

# List all currently configured remotes.
git remote -v

# Download all changes from <remote>, but don't intergrate into HEAD.
git fetch <remote>

# Download changes and directly merge/integrate into HEAD.
git pull <remote> <branch>

# Publish local changes on remote.
git push <remote> <branch>

# Publish local changes on remote, forcefully.
git push -f <remote> <branch>
```

---

### <a name="undo"></a>Branches and Merging Branches

**Git branches** are effectively a pointer to a snapshot of your changes.

When you want to **add a new feature or fix a bug** — no matter how big or how small — you **spawn a new branch to encapsulate your changes**.

```bash
# Create new branch, remaining in current branch.
git branch <new_branch_name>

# Switch to an exisiting branch.
git checkout <existing_branch_name>

# Combination of the two above commands: create new branch, and switch to new branch.
git checkout -b <new_branch_name>

# Delete branch
git branch -d <branch_to_be_deleted_name>

# Merge a branch into the 'master' branch
git merge <branch_to_be_merged_name>
```

**Basic Merge Conflicts** : Occasionally, the merge  process doesn’t go smoothly. If you changed the same part of the same file differently in the two branches you’re merging, Git won’t be able to merge them cleanly.

```bash
# A graphical tool to resolve these issues
git mergetool

# After using mergetool, check that all conflicts have been resolved.
git status

# Finalise the merge commit.
git commit
```

Branches can do a lot more that just these basics, [click here](https://git-scm.com/book/en/v2/Git-Branching-Branch-Management) to learn more.

---

(Optional)

To improve your Git repository, consider the following:

- A `README.md` (`.md` is the [Markdown](https://www.markdownguide.org/getting-started/) file extension) in your repository is to tell other people why your project is useful, what they can do with your project, and how they can use it.

    - A `README.md` also helps when a Git repository is published to [GitHub](github.md#gitHub).

    - [Click here](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/about-readmes) to learn more.

- A `.gitignore` file specifies intentionally untracked files that Git should ignore.

    - Place the `.gitignore` file in the root directory of the repo/project (the same directory as the `.git` directory can be found in).

    - Files already tracked by Git are not affected.

    - [Click here](https://git-scm.com/docs/gitignore) to learn more about `.gitignore`.

- Check out [Tig](https://medium.com/@tommasi.v/git-enhanced-with-tig-9eb07fc30168), a Git repository browser, but can also assist in staging changes for commit at chunk level and act as a pager for output from various Git commands.

---

[Back to Contents](../README.md#contents)
