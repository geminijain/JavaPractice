package com.gemini.string;

public class Palindromes {

    public static void main(String[] args) {
        String str1 = "abbaaccdccaabba";
        String str2 = "ABBAACCDCCAABBA";

        if (isPalindrome(str1, str2)) {
            System.out.println("Given strings are Palindrome");
        } else {
            System.out.println("Given strings are not Palindromes");
        }
    }

    // method to check its palindrome or not
    public static boolean isPalindrome(String strg1, String strg2) {
        strg1 = strg1.toLowerCase();
        strg2 = strg2.toLowerCase();
        // validate length of strings
        if (strg1.length() != strg2.length()) {
            return false;
        }
        
        
        int end = strg1.length() - 1;
        for (int i = 0; i <= end / 2; i++) {
            if ((strg1.charAt(i) != strg1.charAt(end - i))
                    || (strg2.charAt(i) != strg2.charAt(end - i)) 
                    || (strg1.charAt(i) != strg2.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
