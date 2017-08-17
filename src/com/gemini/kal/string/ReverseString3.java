package com.gemini.kal.string;

import java.util.Stack;

public class ReverseString3 {

    public static void main(String[] args) throws Exception {
        String input = "aabbbccdd";

        String output = findReversedString(input);
        System.out.println("Reversed string: " + output);
    }

    public static String findReversedString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            st.push(ch);
        }

        StringBuilder sb = new StringBuilder("");

        while (!st.isEmpty()) {
            char ch = st.pop();
            sb.append(ch);

        }
        return sb.toString();
    }

}
