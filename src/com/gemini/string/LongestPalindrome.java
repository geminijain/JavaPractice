package com.gemini.string;

public class LongestPalindrome {

    public static void main(String[] args) {
        String input = "bananabas".toLowerCase();
        String longestSubstring = "";
        for (int i = 0; i <= input.length(); i++) {
            for (int j = input.length() - 1; j > i; j--) {
                String substring = input.substring(i, j + 1);
                if ((isPalindrome(substring))
                        && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }
        if (longestSubstring.isEmpty()) {
            System.out.println("There are no palindromes!!!");
        } else {
            System.out.println("Longest Palindrome : " + longestSubstring);
        }
    }

    public static boolean isPalindrome(String input) {
        int end = input.length() - 1;
        for (int i = 0; i <= end / 2; i++) {
            if (input.charAt(i) != input.charAt(end - i)) {
                return false;
            }
        }
        return true;

    }

}
