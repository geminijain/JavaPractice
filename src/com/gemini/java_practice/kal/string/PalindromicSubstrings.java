package com.gemini.java_practice.kal.string;

import java.util.HashSet;

public class PalindromicSubstrings {

    public static void main(String[] args) throws Exception {
        String input = "abaaa";
        findPalindromicString(input);
    }

    public static void findPalindromicString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be null");
        }
        HashSet<String> st = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            boolean output;
            for (int j = input.length() - 1; j >= i; j--) {

                if (input.charAt(i) == input.charAt(j)) {
                    String temp = input.substring(i, j + 1);
                    output = isPalindrome(temp);
                    if (output) {
                        if (!st.contains(temp)) {
                            System.out.println(temp);
                            st.add(temp);
                        }
                    }
                }

            }
        }

    }

    public static boolean isPalindrome(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be null");
        }
        int end = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }
}