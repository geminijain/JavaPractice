package com.gemini.java_practice.misc;

import java.util.Scanner;


public class GradeSecured
{
  public static void main(String[] args)
  {
    Scanner scan = new java.util.Scanner(System.in);
    

    System.out.println("Enter Marks : ");
    int marks = scan.nextInt();
    

    if ((marks > 80) && (marks <= 100)) {
      System.out.println("Grade A");
    } else if ((marks > 60) && (marks <= 80)) {
      System.out.println("Grade B");
    } else if ((marks > 40) && (marks <= 60)) {
      System.out.println("Grade C");
    } else if ((marks >= 0) && (marks <= 40)) {
      System.out.println("Fail");
    } else {
      System.out.println("Invalid");
    }
    scan.close();
  }
}


