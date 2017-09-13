package com.gemini.java_practice.leetcode;

public class PalindromeInteger {

    public static void main(String[] args) {
        int input = 112211;
        boolean output = isPalindrome(input);
        if (output)
            System.out.println(input + " is palindrome");
        else {
            System.out.println(input + " is not Palindrome");
        }

    }

    public static boolean isPalindrome(int input) {

        if (input < 0 || input % 10 == 0)
            return false;

        int temp = 0;
        while (temp < input) {

            temp = temp * 10 + input % 10;
            input = input / 10;
        }
        return (temp == input || input == temp / 10);

    }

}
