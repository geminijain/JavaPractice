package com.gemini.java_practice.misc;

public class MyStringArraySorting
{
  public static void main(String[] args)
  {
    String[] strArr = { "apple", "banana", "canberry", "date", "fig" };
    
    String[] arrayOfString1;
    int j = (arrayOfString1 = strArr).length; for (int i = 0; i < j; i++) { String str = arrayOfString1[i];
      System.out.println(str);
    }
  }
}


