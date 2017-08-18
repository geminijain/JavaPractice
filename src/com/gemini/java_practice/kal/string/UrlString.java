package com.gemini.java_practice.kal.string;

public class UrlString {

    public static void main(String[] args) throws Exception {
        String input = "the seattle times";

        String output = findUrlString(input);
        System.out.print(output);
    }

    public static String findUrlString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be Empty");
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (temp != ' ') {
                sb.append(temp);
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

}
