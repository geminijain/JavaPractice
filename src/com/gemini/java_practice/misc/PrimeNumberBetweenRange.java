package com.gemini.java_practice.misc;

import java.util.Scanner;

public class PrimeNumberBetweenRange
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    

    System.out.println("Enter start range : ");
    int start = scan.nextInt();
    

    System.out.println("Enter end range : ");
    int end = scan.nextInt();
    

    if (start == 1) {
      start++;
    }
    

    for (int i = start; i <= end; i++) {
      boolean isPrime = true;
      
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      
      if (isPrime) {
        System.out.print(i + " ");
      }
    }
    scan.close();
  }
}


