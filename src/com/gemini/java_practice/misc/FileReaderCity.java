package com.gemini.java_practice.misc;

import java.io.BufferedReader;
import java.io.FileInputStream;

public class FileReaderCity
{
  public static void main(String[] args) throws java.io.IOException
  {
    FileInputStream file = new FileInputStream("D:\\Selenium\\FileReaderCity.txt");
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(file));
    
    String line = br.readLine();
    
    while (line != null) {
      System.out.println(line);
      line = br.readLine();
    }
    file.close();
    br.close();
  }
}


