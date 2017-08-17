package com.gemini.array;

public class UniqueCharacterASCII {
    public static void main(String[] args) {

        String input = "pzbcflr";
        boolean result = isUnique(input);
        if (result) {
            System.out.println("this string has unique characters");
        } else {
            System.out.println("This string has no unique characters");
        }
    }

    private static boolean isUnique(String input) {
        if (input.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int value = input.charAt(i);
            if (charSet[value]) {
                return false;
            }
            charSet[value] = true;
        }
        return true;
    }
}