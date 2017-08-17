package com.gemini.kal.string;

public class ReverseString1 {

    public static void main(String[] args) throws Exception {
        String input = "aabbbccdd";

        String output = findReversedString(input);
        System.out.println("Reversed string: " + output);
    }

    public static String findReversedString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = input.length()-1; i >= 0; i--) {
            char ch = input.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}
