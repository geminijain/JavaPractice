package com.gemini.java_practice.kal.string;

public class ReverseWordString {

    public static void main(String[] args) throws Exception {
        String input = "This is a String";

        String output = findReversedWordString(input);
        System.out.println("Reversed word string: " + output);
    }

    public static String findReversedWordString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        String[] word = input.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < word.length; i++) {
            String temp = findReversedString(word[i]);
            sb.append(temp +" ");
        }
        return sb.toString();
        
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
