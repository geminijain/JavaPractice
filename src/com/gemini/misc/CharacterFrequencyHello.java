package com.gemini.misc;

import java.util.Scanner;

public class CharacterFrequencyHello
{
  public static void main(String[] args) {
    System.out.print("Enter a string : ");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    characterFrequency(str);
    scan.close();
  }
  
  public static void characterFrequency(String str) {
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++)
      {

        if (str.charAt(i) == str.charAt(j)) {
          if (j < i) break;
          count++;
        }
      }
      





      if (count > 0) {
        System.out.println("Character " + str.charAt(i) + " present " + count + " times ");
      }
    }
  }
}


