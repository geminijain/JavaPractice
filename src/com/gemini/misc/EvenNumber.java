package com.gemini.misc;

import java.util.Scanner;

public class EvenNumber
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    

    System.out.println("Enter a number : ");
    int num = scan.nextInt();
    

    if (num % 2 == 0) {
      System.out.println(num + " is even number ");
    }
    scan.close();
  }
}


