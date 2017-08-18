package com.gemini.java_practice.misc;

import java.util.Arrays;


public class BinarySearchOnCharArray
{
  public static void main(String[] args)
  {
    char[] charArray = { 'l', 'm', 'n', 'o', 'p', 'q' };
    

    int index = Arrays.binarySearch(charArray, 0, charArray.length - 1, 'o');
    

    System.out.println("Char 'o' index is : " + index);
  }
}


