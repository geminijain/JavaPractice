package com.gemini.java_practice.string;

import java.util.Scanner;

public class ActionOnString
{
  public static void main(String[] args) {
    String[] str = new String[2];
    Scanner scan = new Scanner(System.in);
    
    for (int i = 0; i < str.length; i++) {
      System.out.printf("Enter String %d : ", new Object[] { Integer.valueOf(i + 1) });
      str[i] = scan.nextLine();
      str[i] = str[i].trim();
      str[i] = str[i].toLowerCase();
    }
    scan.close();
    System.out.println(largestCharacter(str));
    System.out.println(smallestCharacter(str));
    
    int[] vowels = vowelArray(str);
    for (int i = 0; i < vowels.length; i++) {
      System.out.print(str[i] + "=" + vowels[i] + ", ");
    }
  }
  
  public static String largestCharacter(String[] str)
  {
    int j = 0;
    
    if (str.length > 0) {
      for (int i = 1; i < str.length; i++) {
        if (str[i].length() > str[j].length()) {
          j = i;
        }
      }
    }
    
    return str[j];
  }
  
  public static String smallestCharacter(String[] str) {
    int j = 0;
    
    if (str.length > 0) {
      for (int i = 1; i < str.length; i++) {
        if (str[i].length() < str[j].length()) {
          j = i;
        }
      }
    }
    return str[j];
  }
  
  public static int[] vowelArray(String[] str)
  {
    int[] vowelArray = new int[str.length];
    for (int i = 0; i < str.length; i++) {
      int count = 0;
      String local = str[i];
      for (int j = 0; j < local.length(); j++) {
        char chr = local.charAt(j);
        if ((chr == 'a') || (chr == 'e') || (chr == 'i') || (chr == 'o') || (chr == 'u')) {
          count++;
        }
      }
      vowelArray[i] = count;
    }
    
    return vowelArray;
  }
}


