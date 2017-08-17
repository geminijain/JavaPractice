package com.gemini.kal.string;

public class ReverseString2 {

    public static void main(String[] args) throws Exception {
        String input = "aabbbccdd";

        String output = findReversedString(input);
        System.out.println("Reversed string: " + output);
    }

    public static String findReversedString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        char[] chString = input.toCharArray();
        int end = chString.length - 1;
        for (int i = 0; i < chString.length / 2; i++) {
            char temp = chString[end - i];
            chString[end - i] = chString[i];
            chString[i] = temp;
        }
        String result = new String(chString);
        return result;
    }
}
