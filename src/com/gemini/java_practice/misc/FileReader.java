package com.gemini.java_practice.misc;

import java.io.BufferedReader;

public class FileReader
{
  public static void main(String[] args) throws java.io.IOException {
    java.io.FileInputStream fstream = new java.io.FileInputStream("D:\\Selenium Practice\\FileReaderText.txt");
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(fstream));
    
    int count = 0;
    String line = br.readLine();

    while (line != null) {
      System.out.println(line);
      line = br.readLine();
      count++;
    }
    fstream.close();
    br.close();

    System.out.println(count);
  }
}


