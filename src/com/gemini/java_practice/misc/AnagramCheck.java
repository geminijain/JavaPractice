package com.gemini.java_practice.misc;


public class AnagramCheck {
  public static void isAnagram(StringBuffer a, StringBuffer b) {
    if (a.length() != b.length()) {
      System.out.println("This is not an Anagram");
    } else {
      int k = 0;
      for (int i = 0; i < a.length(); i++) {
        for (int j = 0; j < b.length(); j++) {
          if (a.charAt(i) == b.charAt(j)) {
            k++;
            b.deleteCharAt(j);
          }
        }
      }
      if (k == a.length()) {
        System.out.println("This is an Anagram");
      } else {
        System.out.println("This is not an Anagram");
      }
    }
  }
  
  public static void main(String[] args)
  {
    String s1 = "ToPO";
    String s2 = "OPTo";
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    
    StringBuffer sb1 = new StringBuffer(s1);
    StringBuffer sb2 = new StringBuffer(s2);
    isAnagram(sb1, sb2);
  }
}


