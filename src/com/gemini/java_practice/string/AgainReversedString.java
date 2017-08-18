package com.gemini.java_practice.string;

public class AgainReversedString {

    public static void main(String[] args) throws Exception {
        String input = "all is well";
        String output = reversedString(input);
        System.out.println(output);
    }

    public static String reversedString(String input) throws Exception {
        char[] chrStr = input.toCharArray();
        if (input.isEmpty()) {
            throw new Exception("Strings cannot be empty");
        } else {
            int end = input.length() - 1;
            for (int i = 0; i < input.length() / 2; i++) {
                char temp = chrStr[i];
                chrStr[i] = chrStr[end - i];
                chrStr[end - i] = temp;
            }
        }
        String result = new String(chrStr);
        return result;
    }
}
