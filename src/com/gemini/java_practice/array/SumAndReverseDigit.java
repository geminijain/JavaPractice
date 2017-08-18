package com.gemini.java_practice.array;
// program to find sum and reverse digits
public class SumAndReverseDigit {

    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 7, 100,45 };

        int sumOfElements = sum(a);
        System.out.println("Sum of elements is : " + sumOfElements);

        if (sumOfElements < 9) {
            System.out.println("Reversed number is : " + sumOfElements);
        }

        else {
            System.out.println("Reversed String is : "
                    + reversedNumber(sumOfElements));
        }
    }

    public static int sum(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return sum;
    }

    public static String reversedNumber(int number) {
        int remainder = 0;
        String reverseNumber = "";
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber + remainder;
        }
        return reverseNumber;
    }
    
    
}
