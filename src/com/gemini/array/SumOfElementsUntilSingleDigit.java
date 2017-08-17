package com.gemini.array;

//program to find sum of elements in an array until single digit sum

public class SumOfElementsUntilSingleDigit {

    public static void main(String[] args) throws Exception {
        int[] a = { 1,2,3,4,5,6,7,8,9,-2,4,6,-7};

        int sum = sumElementsOfArray(a);
        while (sum > 9) {
            sum = sumDigitsOfNumber(sum);
        }

        System.out.println("Sum of Element until Single digit : " + sum);
    }

    // method to return sum of an array
    public static int sumElementsOfArray(int[] b) throws Exception {
        if (b.length == 0) {
            throw new Exception("array can not be empty");
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        return sum;
    }

    public static int sumDigitsOfNumber(int number) {
        int digitSum = 0;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            digitSum = digitSum + remainder;
        }

        return digitSum;
    }

}

// test cases :
// 1. give an empty array and see if its throwing exception or not
// 2. take an array element more than int range, check if its showing error or
// not
// 3. take a single digit less than 10 and see if showing the result correctly
// or not