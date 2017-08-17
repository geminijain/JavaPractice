package com.gemini.kal.string;

public class CompactString {

    public static void main(String[] args) throws Exception {
        String input = "I love icecream";

        String output = findCompactString(input);
        System.out.println(output);

    }

    public static String findCompactString(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be null or empty");
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (temp != ' ') {
                sb.append(temp);
            }
        }
        return sb.toString();
    }

}
