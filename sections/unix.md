[Back to Contents](../README.md#contents)

---

## <a name="unix"></a>UNIX Command Line Basics

Before we learn **Git**, we first need to cover some Command Line basics.

### <a name="macos"></a>Mac OS / Linux

(Local Machine)

1) Open:

- (Mac OS) "Terminal.app", located at `/Applications/Utilities/Terminal.app`

    - (Optional) Download and install <a href="https://iterm2.com/" target="_blank">iTerm 2</a>, an alternative to Terminal. I would recommend mainly to proficient users.

- (Linux) Your default Command Line application.

2) You will see a Command Prompt along the lines of:

```bash
user@hostname:~$
```

3) <a name="macosStep3"></a>To get a taste for some basic UNIX commands, <a href="https://blog.teamtreehouse.com/introduction-to-the-mac-os-x-command-line" target="_blank">click here</a>. Also Refer to the [Mac OS / Linux Commands Appendix](#macosCommand) for a crib sheet of basic commands.

(Optional)

**Connect to Raptor** :

If you have not connected to Raptor before, you'll have to create a CS UNIX User and password at the link : <a href="https://www.cs.kent.ac.uk/systems/newuser/" target="_blank">https://www.cs.kent.ac.uk/systems/newuser/</a>

4) Run the command:

```bash
# Replace `<user>` with your university username (e.g. abc123)
user@hostname:~$ ssh <user>@raptor.kent.ac.uk
```

- (Optional) Learn more about Secure Shell (SSH) by runnning the command:

    ```bash
    user@r:~$ man ssh
    # Press 'q' to quit the manual for the 'ssh' command
    ```

5) You'll be prompted for your CS UNIX User password in order to authenticate the SSH connection to Raptor (**IMPORTANT** Typed characters do not appear).

- If you have a CS UNIX User, though you do not remeber your password, you can reset your password using the same link as above : <a href="https://www.cs.kent.ac.uk/systems/newuser/" target="_blank">https://www.cs.kent.ac.uk/systems/newuser/</a>

6) If the SSH connection is succesful, a Command Prompt should appear along the lines of:

```bash
user@raptor:~$
```

7) To exit Raptor, run the command:

```bash
user@raptor:~$ exit
```

(Optional)

Use the <a href="https://GitHub.com/ohmyzsh/ohmyzsh/wiki/Installing-ZSH" target="_blank">zsh shell (with the oh-my-zsh framework)</a> instead of bash.

### <a name="windows"></a>Windows

(Local Machine)

Windows is not a UNIX-based OS, unlike Linux and Mac OS. For the sake of learning UNIX, we advise you connect to Raptor on Windows (see below).

- (Optional) If in the long-term you'd like to invest in a way of running UNIX commands on Windows, see the following article : <a href="https://www.howtogeek.com/249966/how-to-install-and-use-the-linux-bash-shell-on-windows-10/" target="_blank">https://www.howtogeek.com/249966/how-to-install-and-use-the-linux-bash-shell-on-windows-10/</a>

**Connect to Raptor** :

If you have not connected to Raptor before, you'll have to create a CS UNIX User and password at the link : <a href="https://www.cs.kent.ac.uk/systems/newuser/" target="_blank">https://www.cs.kent.ac.uk/systems/newuser/</a>

1) Download and open <a href="https://www.putty.org/" target="_blank">PuTTY</a>

2) Specify the following properties:

- Hostname: `raptor.kent.ac.uk`
- Port: `22`
- Connection Type: `SSH` (button option)

3) Click "Connect", then you'll be prompted for your univerity username (e.g. abc123) and your CS UNIX User password in order to authenticate the SSH connection to Raptor (**IMPORTANT** Typed characters do not appear).

- If you have a CS UNIX User, though you do not remeber your password, you can reset your password using the same link as above : <a href="https://www.cs.kent.ac.uk/systems/newuser/" target="_blank">https://www.cs.kent.ac.uk/systems/newuser/</a>

4) If the SSH connection is succesful, a Command Prompt should appear along the lines of:

```bash
user@raptor:~$
```

5) <a name="macosStep3"></a>Refer to the [Mac OS / Linux Commands Appendix](#macosCommand) for a guide to basic commands.

6) To exit Raptor, run the command:

```bash
user@raptor:~$ exit
# Or close PuTTY
```

---

### <a name="macosCommand"></a>Mac OS / Linux Basic Commands

**Symbols** : (A "directory" is a location for storing files on your computer, a GUI equivalent is a folder. A directory and folder are synonymous)

(`.`) current directory

(`..`) parent directory

(`~`) home directory

(`/ ...`) root directory - the top-level directory of a file system

(`... / ...`) directory separator

(`-`) last previously visited directory

(`\`) escape the next character - most commonly used to escape spaces in file/directory names

(`''`) or (`""`) used to encapsulate names, containing spaces

(`?`) placeholder for a single character

(`*`) placeholder for any number of characters

**Common Commands** :

| Command | Command Description                                                                                                                                                                                                                                                                                                                                                | Common Flags                                             | Examples                                                                                                                                                                 |
|---------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ls      | List directory contents | `-a` `-h` `-l`                                                 | `ls` `ls ~` `ls -l ~` `ls -al ./` `ls -ahl ../` `ls -ahl /` `ls /Users/foobar` `ls ~/Desktop/test\ folder/` `ls "~/Desktop/test folder/"` `ls -ahl test?.txt` `ls -ahl *.txt` |
| pwd     | Present Working Directory                                                                                                                                                                                                                                                                                                                                          |                                                          | `pwd`                                                                                                                                                                    |
| cd      | Change Directory                                                                                                                                                                                                                                                                                                                                                   |                                                          | `cd` `cd .` `cd ..` `cd ~` `cd -` `cd /Users` `cd ../Desktop` `cd ./Desktop/test\ folder` `cd "./Desktop/test folder"`                                                                                     |
| mkdir   | Make an empty directory                                                                                                                                                                                                                                                                                                                                            | `-v`                                                       | `mkdir nameOfNewDir`                                                                                                                                                       |
| touch   | Make an empty file                                                                                                                                                                                                                                                                                                                                                 |                                                          | `touch newFile.txt`                                                                                                                                                        |
| cp      | Copy from source to destination                                                                                                                                                                                                                                                                                                                                    | `-a` `-v`                                                    | `cp ~/test.txt ~/Desktop/test` `cp -av ./*.txt ../otherDir`                                                                                                                  |
| mv      | Move from source to destination                                                                                                                                                                                                                                                                                                                                    | `-v`                                                       | `mv ./test.txt ..` `mv -v ~/Desktop/test.txt /`                                                                                                                              |
| rm      | Remove files/directories                                                                                                                                                                                                                                                                                                                                           | `-r` `-f` `-v` (\*\***IMPORTANT**\*\* be careful of using `-rf` together !! ) | `rm ./test.txt` `rm -v test.txt` `rm -r ./myDir` `rm -rfv ~/Desktop`                                                                                                            |
| nano    | A basic command line text editor                                                                                                                                                                                                                                                                                                                                   |                                                          | `nano newFile.txt`                                                                                                                                                         |
| less    | View file contents without opening file. Press 'q' to quit                                                                                                                                                                                                                                                                                                         |                                                          | `less text.txt`                                                                                                                                                            |
| cat     | Print file contents to standard output for viewing                                                                                                                                                                                                                                                                                                                 |                                                          | `cat test.txt`                                                                                                                                                             |
| man     | Manual, learn about other commands. Press 'q' to quit                                                                                                                                                                                                                                                                                                              |                                                          | `man ssh`                                                                                                                                                                  |
| ssh     | Secure Shell (SSH) connection                                                                                                                                                                                                                                                                                                                                      |                                                          | `ssh <user>@raptor.kent.ac.uk`                                                                                                                                             |
| open (Mac OS only)     | Open files and directories                                                                                                                                                                                                                                                                                                                                       | `-a`                                                          | `open ~/Desktop` `open -a Safari` `open -a TextEdit test.txt`                                                                                                                                             |
| nautilus (Ubuntu/Linux only)     | A file manager for GNOME, can be used to open directories in a GUI                                                                                                                                                                                                                                                                                                                                     |                                                          | `nautilus ~/Desktop`                                                                                                                                             |
| xdg-open (Ubuntu/Linux only)     | Opens a file or URL in the user's preferred application                                                                                                                                                                                                                                                                                                                                    |                                                          | `xdg-open ~/Desktop/test.txt`                                                                                                                                             |

---

[Back to Contents](../README.md#contents)
