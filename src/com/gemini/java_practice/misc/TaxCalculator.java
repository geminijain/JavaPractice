package com.gemini.java_practice.misc;

import java.util.Scanner;

public class TaxCalculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Salary : ");
    double salary = scan.nextDouble();
    
    System.out.println("Enter gender [0 for Male and 1 for Female : ]");
    int gender = scan.nextInt();
    
    double tax = 0.0D;
    if (gender == 0) {
      if ((salary > 10000.0D) && (salary < 30000.0D)) {
        tax = salary * 0.1D;
      }
      else if ((salary >= 30000.0D) && (salary < 60000.0D)) {
        tax = salary * 0.2D;
      }
      else if (salary > 60000.0D) {
        tax = salary * 0.3D;
      }
      else {
        System.out.println("Invalid entry");
      }
    }
    if (gender == 1) {
      if ((salary > 10000.0D) && (salary < 30000.0D)) {
        tax = salary * 0.05D;
      }
      else if ((salary >= 30000.0D) && (salary < 60000.0D)) {
        tax = salary * 0.1D;
      }
      else if (salary > 60000.0D) {
        tax = salary * 0.15D;
      }
      else {
        System.out.println("Invalid entry");
      }
    }
    System.out.println("Calculated tax is : " + tax);
    scan.close();
  }
}


