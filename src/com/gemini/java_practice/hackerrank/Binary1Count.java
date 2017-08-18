package com.gemini.java_practice.hackerrank;

import java.util.Scanner;

public class Binary1Count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int result = findBinaryConsecutiveOneCount(num);
        System.out.print("Number of Consecutive One's in binary number : " +result);
    }

    private static int findBinaryConsecutiveOneCount(int number) {
        int count = 0;
        int min = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
                if (count >= min) {
                    min = count;
                }
            } else {
                count = 0;
            }
            number = number / 2;
        }
        return count;
    }

}
