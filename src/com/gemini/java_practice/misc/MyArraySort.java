package com.gemini.java_practice.misc;

import java.util.Arrays;

public class MyArraySort
{
  public static void main(String[] args)
  {
    int[] myArr = { 45, 65, 7, 85, 43, 59 };
    
    Arrays.sort(myArr);
    int[] arrayOfInt1;
    int j = (arrayOfInt1 = myArr).length; for (int i = 0; i < j; i++) { int a = arrayOfInt1[i];
      System.out.println(a);
    }
  }
}


