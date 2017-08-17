package com.gemini.misc;

import java.util.Arrays;

public class MyArrayFill
{
  public static void main(String[] args)
  {
    String[] arr = new String[10];
    
    Arrays.fill(arr, "NoValue");
    String[] arrayOfString1; int j = (arrayOfString1 = arr).length; for (int i = 0; i < j; i++) { String str = arrayOfString1[i];
      System.out.println(str);
    }
  }
}


