package com.gemini.java_practice.selenium2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion {

    public static void main(String[] args) {
    }
    // Implement the unix find command
    // $ find /directory/to/search/ -name "file.txt"
    // /directory/to/search/file.txt
    // /directory/to/search/subdir/file.txt

    // java.io.File
    // - isFile()
    // - isDir()
    // - getName()
    // - getChildren() -- List<File>

    public static List<File> find(File dirToSearch, String filename) {

        if (dirToSearch == null || filename == null) {
            return null;
        }

        List<File> result = new ArrayList<File>();

        if (dirToSearch.isDirectory()) {
            String currentFileName = dirToSearch.getName();
            if (filename.equals(currentFileName)) {
                result.add(dirToSearch);
            }
        } else if (dirToSearch.isDirectory()) {
            for (File currentFile : dirToSearch.listFiles()) {
                List<File> results = find(currentFile, filename);
                result.addAll(results);
            }
        } else {
            throw new RuntimeException();
        }
        return result;
    }

}
