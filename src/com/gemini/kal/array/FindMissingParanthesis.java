package com.gemini.kal.array;

import java.util.Stack;

public class FindMissingParanthesis {

    public static void main(String[] args) throws Exception {
        String input = "2 * ( 3 + 5(sasdfasdfasd)";
        final boolean isValidExpression = isValidExpression(input);
        System.out.printf("This string has %smissing paranthesis",
                isValidExpression ? "no " : "");
    }

    public static boolean isValidExpression(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be null or empty");
        }

        char[] chrString = input.toCharArray();

        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < chrString.length; i++) {
            char ch = chrString[i];
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
