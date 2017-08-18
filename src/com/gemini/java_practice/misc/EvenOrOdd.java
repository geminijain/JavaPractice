package com.gemini.java_practice.misc;

import java.util.Scanner;

public class EvenOrOdd
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a number : ");
    int num = scan.nextInt();
    

    if (num % 2 == 0) {
      System.out.println("This is a even number");
    } else {
      System.out.println("This is an odd number");
    }
    scan.close();
  }
}


