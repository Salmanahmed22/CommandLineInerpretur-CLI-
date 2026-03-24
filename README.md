# 🖥️ Java Command Line Interpreter (CLI)

A custom-built Command Line Interpreter (CLI) developed in Java that simulates basic shell functionalities such as file manipulation, directory navigation, and command execution.

---

## 🚀 Features

* 📂 Directory navigation (`cd`, `pwd`)
* 📄 File operations (`touch`, `rm`, `cat`)
* 📁 Directory operations (`mkdir`, `rmdir`)
* 📜 Listing contents (`ls`, `ls -a`, `ls -r`)
* 🔄 Move/Rename files (`mv`)
* 🔁 Output redirection:

  * `>` overwrite
  * `>>` append
* 🧪 Comprehensive unit testing using JUnit 5

---

## 🛠️ Supported Commands

| Command           | Description                       |
| ----------------- | --------------------------------- |
| `pwd`             | Print current directory           |
| `cd <path>`       | Change directory                  |
| `ls`              | List files (non-hidden)           |
| `ls -a`           | List all files (including hidden) |
| `ls -r`           | List files in reverse order       |
| `mkdir <dir>`     | Create directory                  |
| `rmdir <dir>`     | Remove empty directory            |
| `touch <file>`    | Create file                       |
| `mv <src> <dest>` | Move or rename file               |
| `rm <file>`       | Remove file                       |
| `cat <file>`      | Display file content              |
| `cat > file`      | Write to file (overwrite)         |
| `cat >> file`     | Append to file                    |
| `>`               | Redirect output                   |
| `>>`              | Append output                     |
| `help`            | Show commands                     |
| `exit`            | Exit CLI                          |

---

## 🏗️ Project Structure

```
org.os
│
├── CommandLineInterpreter.java     # Core CLI logic
├── Main.java                       # Entry point
└── CommandLineInterpreterTest.java # Unit tests
```

---

## ▶️ How to Run

### 1. Compile the project

```bash
javac org/os/*.java
```

### 2. Run the CLI

```bash
java org.os.Main
```

---

## 🧪 Running Tests

This project uses **JUnit 5**.

### Run tests using your IDE

* Right-click → Run `CommandLineInterpreterTest`

### Or using Maven (if configured):

```bash
mvn test
```

---

## 💡 Example Usage

```
/home/user > mkdir test
/home/user > cd test
/home/user/test > touch file1
/home/user/test > ls
1-file1,

/home/user/test > cat > file1
Enter text (type 'stop' to finish):
Hello World
stop

/home/user/test > cat file1
Hello World
```

---

## 🧠 Design Highlights

* Uses Java `File` API for filesystem operations
* Modular command handling inside `CommandLineInterpreter`
* Input parsing via tokenization (`split(" ")`)
* Supports output redirection (`>`, `>>`)
* Includes error handling for invalid commands

---

## 🧪 Testing Highlights

* Unit testing implemented using JUnit 5
* Covers:

  * Directory navigation (`cd`)
  * File and directory operations (`mkdir`, `touch`, `rm`, `rmdir`)
  * Move/rename operations (`mv`)
  * Listing commands (`ls`, `ls -a`, `ls -r`)
  * Output redirection
* Uses temporary directories to isolate test environment
* Captures console output for assertions

---

## ⚠️ Limitations

* Limited piping (`|`) support
* No support for advanced shell scripting
* Basic parsing (no support for quoted paths with spaces)

