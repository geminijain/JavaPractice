package com.gemini.java_practice.kal.string;

public class CompressedString {

    public static void main(String[] args) throws Exception {
        String input = "aabbbccdd";

        String output = findCompressedString(input);
        System.out.println("Compressed smaller string: " + output);
    }

    public static String findCompressedString(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be empty");
        }
        StringBuilder sb = new StringBuilder("");
        int totalCount = 1;
        int count = 1;
        char temp = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {

            if (sb.length() <= input.length()) {

                if (input.charAt(i) == temp) {
                    count++;
                } else {
                    totalCount = count;
                    temp = input.charAt(i);
                    count = 1;
                }
                if (count == 1) {
                    sb.append(input.charAt(i - 1));
                    sb.append(totalCount);
                }
            } else {
                return input;
            }
        }
        sb.append(temp);
        sb.append(count);

        if (sb.length() < input.length()) {
            return sb.toString();
        } else {
            return input;
        }

    }
}
