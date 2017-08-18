package com.gemini.java_practice.misc;


public class ActionOnTenMarks
{
  public static void main(String[] args) throws Exception
  {
    int[] a = new int[10];
    java.util.Scanner scan = new java.util.Scanner(System.in);
    

    for (int i = 0; i < 10; i++) {
      System.out.printf("Enter marks for %d subject : ", new Object[] { Integer.valueOf(i + 1) });
      System.out.println();
      a[i] = scan.nextInt();
    }
    scan.close();
    
    int highestMarks = highestMark(a);
    System.out.println("Highest Marks is : " + highestMarks);
    
    int lowestMarks = lowestMark(a);
    System.out.println("Lowest Marks is : " + lowestMarks);
    
    int average = average(a);
    System.out.println("Average of marks is " + average);
  }
  
  public static int highestMark(int[] a) throws Exception
  {
    if ((a == null) || (a.length == 0)) {
      throw new Exception("Array can not be null or empty");
    }
    
    int highestMarks = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > highestMarks) {
        highestMarks = a[i];
      }
    }
    return highestMarks;
  }
  
  public static int lowestMark(int[] a) throws Exception
  {
    if ((a == null) || (a.length == 0)) {
      throw new Exception("Array can not be null or empty");
    }
    
    int lowestMarks = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < lowestMarks) {
        lowestMarks = a[i];
      }
    }
    return lowestMarks;
  }
  
  public static int average(int[] a) throws Exception
  {
    if ((a == null) || (a.length == 0)) {
      throw new Exception("Array can not be null or empty");
    }
    
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    int average = sum / a.length;
    return average;
  }
}


