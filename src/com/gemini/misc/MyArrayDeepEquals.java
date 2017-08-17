package com.gemini.misc;

import java.util.Arrays;

public class MyArrayDeepEquals
{
  public static void main(String[] args)
  {
    String[] strArr1 = { "Apple", "Banana", "Cranberry", "Date", "Orange" };
    String[] strArr2 = { "Apple", "Banana", "Cranberry", "Date", "Orange" };
    String[] strArr3 = { "Apple", "Banana", "Cranberry", "Date" };
    System.out.println("strArr1 and strArr2 are same ? : " + Arrays.deepEquals(strArr1, strArr2));
    
    System.out.println("strArr2 and strArr3 are same ? : " + Arrays.deepEquals(strArr2, strArr3));
  }
}


