package com.gemini.array;

public class AgainSumOfElementsUntilSingleDigit {

    public static void main(String[] args) throws Exception {
        int[] input = { 1,2,3,4,5,6,7,8,9,-2,4,6,-7};

        int number = SumOfArray(input);

                while (number > 9) {
          number = SumOfDigits(number);
        }
       
       System.out.println(number);
    }

    public static int SumOfArray(int[] a) throws Exception {
        int sum = 0;
        if (a.length == 0) {
            throw new Exception("array cannot be empty");

        } else {
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            return sum;
        }
    }

    public static int SumOfDigits(int num) {
        int sum = 0;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            sum = remainder + sum;
            num = num / 10;
        }
        return sum;

    }
}
