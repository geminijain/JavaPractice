package com.gemini.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidateBracketsInString {

    public static void main(String[] args) throws Exception {
        String input = "2 * ( 3 + 5(sasdfasdfasd))";

        if (isValidString(input)) {
            System.out.println("All brackets in string are properly handled");
        } else {
            System.out
                    .println("All brackets in string are not properly handled");
        }

    }

    public static boolean isValidString(String str) throws Exception {
        if ((str == null) || (str.isEmpty())) {
            throw new Exception("String can not be empty");
        }
        boolean isBracket = true;

        Set<Character> leftBracket = new HashSet<>();
        leftBracket.add('(');
        leftBracket.add('{');
        leftBracket.add('[');

        Set<Character> rightBracket = new HashSet<>();
        rightBracket.add(')');
        rightBracket.add('}');
        rightBracket.add(']');

        HashMap<Character, Character> bracketPair = new HashMap<>();
        bracketPair.put('{', '}');
        bracketPair.put('(', ')');
        bracketPair.put('[', ']');

        Stack<Character> bracket = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (leftBracket.contains(chr)) {
                bracket.push(chr);
            } else if (rightBracket.contains(chr)) {
                if (bracket.size() > 0) {
                    char temp = bracket.pop();
                    if (chr != bracketPair.get(temp)) {
                        isBracket = false;
                        break;
                    }
                } else {
                    isBracket = false;
                    break;
                }
            }

        }

        return (isBracket && bracket.isEmpty());
    }
}
