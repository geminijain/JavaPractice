package com.gemini.java_practice.misc;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string to check Palindrome : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
        scan.close();
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }
}
