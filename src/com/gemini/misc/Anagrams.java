package com.gemini.misc;


public class Anagrams {
  public static void main(String[] args) {
    String str1 = "Top";
    String str2 = "OPt";
    
    if (str1.length() == str2.length()) {
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      
      int k = 0;
      for (int i = 0; i < str1.length(); i++) {
        for (int j = 0; j < str2.length(); j++) {
          if (str1.charAt(i) == str2.charAt(j)) {
            k++;
          }
        }
      }
      if (k == str1.length()) {
        System.out.println("This is an anagram");
      } else {
        System.out.println("This is not an anagram");
      }
    }
  }
}


