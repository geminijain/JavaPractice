package com.gemini.java_practice.misc;

import java.util.Scanner;

public class ThreeNumberAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = scan.nextInt();

        int num4 = (num1 + num2 + num3) / 3;

        System.out.println("Average of three number : " + num4);
        scan.close();
    }
}
