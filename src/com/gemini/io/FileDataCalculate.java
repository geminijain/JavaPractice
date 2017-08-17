package com.gemini.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataCalculate {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\numberFile1.txt");
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();
        int sum = 0;
        while (line != null) {
            int number = Integer.parseInt(line);
            sum = sum + number;
            line = br.readLine();
        }
        System.out.println("Sum of data from file is : " + sum);
        br.close();
    }

}
