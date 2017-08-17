package com.gemini.array;

public class SumTillSingleDigit {

    public static void main(String[] args) {
        int[] input = { 1, 4, 5, 8, 10 };

        int number = SumOfArray(input);

        if (number > 9) {
            DigitSum(number);
        } else {
            System.out.println(DigitSum(number));
        }

    }

    public static int SumOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int DigitSum(int num) {
        int remainder = num / 10;
        int count = 1;
        while (remainder != 0) {
            remainder = num / 10;
            count++;

        }
        int sum = 0;
        for (int i = 0; i <= count; i++) {
            int remain = num | 10;
            sum = sum + remain;
            num = num / 10;
        }

        return sum;
    }

}
