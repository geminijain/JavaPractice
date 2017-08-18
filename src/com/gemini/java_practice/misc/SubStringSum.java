package com.gemini.java_practice.misc;


public class SubStringSum {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6 };

    System.out.println("Array entered as : ");
    for (int i = 0; i < array.length; i++) {
      System.out.println("value at array [" + i + "] = " + array[i]);
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 6) {
        System.out.println("1 element array : {" + array[i] + "}");
      }
      int j = 0;
      for (j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == 6) {
          System.out.println("2 element array : {" + array[i] + "," + array[j] + "}");
        }
        int k = 0;
        for (k = j + 1; k < array.length; k++) {
          if (array[i] + array[j] + array[k] == 6) {
            System.out.println("3 element array : {" + array[i] + "," + array[j] + "," + array[k] + "}");
          }
        }
      }
    }
  }
}


