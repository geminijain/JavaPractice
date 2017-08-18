package com.gemini.java_practice.string;

public class LongestPalindromePartTwo {

    public static void main(String[] args) throws Exception {
        String input = "a1b9b1abcdefghit";

        // check for string length
        if (input == null || input.length() == 0) {
            throw new Exception("string can not be null or empty");
        }
        int end = input.length() - 1;
        String longestPalindrome = "";
        for (int start = 0; start < end; start++) {
            for (int last = end; last > start; last--) {
                if (input.charAt(start) == input.charAt(last)) {
                    String checkInput = input.substring(start, last + 1);
                    int size = last - start;
                    if ((isPalindrome(checkInput))
                            && size > longestPalindrome.length()) {
                        longestPalindrome = checkInput;
                    }
                }
            }
        }
        if (longestPalindrome.length() == 0) {
            System.out.println("String has no palindrome");
        }
        System.out.println(longestPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int end = str.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < end / 2; i++) {
            char begin = str.charAt(i);
            char last = str.charAt(end - i);
            if (begin != last) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
