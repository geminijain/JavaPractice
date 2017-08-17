package com.gemini.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readLogFile {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\file1.txt");
        BufferedReader br = new BufferedReader(file);
        String word = "hello";
        boolean isKeyword = false;
        String line = br.readLine();

        while (line != null) {
            if (line.contains(word)) {
                isKeyword = true;
                break;

            }
            line = br.readLine();
        }
        
        if(isKeyword) {
            System.out.println("Keyword has been found");
        }
        else{
            System.out.println("Keyword is not in file");
        }

        br.close();
    }

}
