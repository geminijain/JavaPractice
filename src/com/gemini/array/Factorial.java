package com.gemini.array;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number for factorial");
        int number = scan.nextInt();

        if (number < 1) {
            System.out.println("Please enter positive number");
        } else {
            double fact = 1;
            for (int i = number; i > 1; i--) {
                fact = fact * i;
            }
            if (fact == 0 ) {
                System.out.println(
                        "Factorial of this number is beyond the limit of data type");
            } else {
                System.out.println("Factorial of " + number + "  is : " + fact);
            }
            scan.close();
        }

    }
}