package org.os;
import java.io.File;
import java.util.List;

public class CommandLineInterpreter {

    //the directory that you open the CLI from
    private File currentDirectory;

    public CommandLineInterpreter(File initialDirectory) {
        this.currentDirectory = initialDirectory;
    }

    // Display help message for internal commands and supported system commands
    public void displayHelp() {
        System.out.println("Available Commands:");
        System.out.println(" - pwd, cd, ls, ls -a, ls -r, mkdir, rmdir, touch, mv, rm, cat");
        System.out.println(" - >, >>, | (supports limited redirection and piping)");
        System.out.println(" - exit: To terminate the CLI");
        System.out.println(" - help: Displays this help message");
    }

    // Execute a system command using ProcessBuilder
    public void errorHandler(String command) {
        System.out.println("Error executing command: " + command + " not valid");

    }

    // Change directory (cd)
    public void changeDirectory(List<String> commandTokens) {

        //cd + nothing
        if (commandTokens.size() <= 1) {
            System.out.println("cd: missing argument");
            return;
        }

        String path = commandTokens.get(1);
        File newDirectory;

        //go back one step
        if (path.equals("..")) {
            newDirectory = currentDirectory.getParentFile(); // Move up a directory
        } else {
            newDirectory = new File(currentDirectory, path); // Navigate to specified directory
        }

        //must be valid directory and not a file
        if (newDirectory != null && newDirectory.exists() && newDirectory.isDirectory()) {
            currentDirectory = newDirectory.getAbsoluteFile();
        } else {
            System.out.println("cd: No such directory: " + path);
        }
    }

    // Print the current working directory (pwd)
    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}

