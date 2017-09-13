package com.gemini.java_practice.leetcode;

/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 * Note:
The input is assumed to be a 32-bit signed integer. 
Your function should return 0 when the reversed integer overflows.
 * 
 */

public class ReverseInteger {

    public static void main(String[] args) {
        int input = Integer.MAX_VALUE;
        int output = reverse(input);
        System.out.println(output);
    }

    public static int reverse(int x) {
        int remainder = 0;
        int result = 0;

        if (x < 10 && x > -10) {
            return x;
        }

        while (x != 0) {
            remainder = x % 10;

            int absResult = Math.abs(result);
            int maxResultMultipliedBy10 = Integer.MAX_VALUE / 10;
            if (absResult > maxResultMultipliedBy10) {
                return 0;
            }

            int resultMultipliedBy10 = absResult * 10;

            int maxRemainder = Integer.MAX_VALUE - resultMultipliedBy10;
            if (remainder > maxRemainder) {
                return 0;
            }

            result = result * 10 + remainder;
            x = x / 10;
        }

        return result;
    }

}
