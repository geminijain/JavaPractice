package com.gemini.array;

public class FirstNonRepetitiveCharacter {

    public static void main(String[] args) throws Exception {
        String input = "gemini";
        findFirstNonRepetitive(input);
    }

    private static void findFirstNonRepetitive(String input) throws Exception {
        char result = '\0';
        if (input == null || input.length() == 0) {
            throw new Exception("input cannot be null or empty");
        } else {
            char[] chrString = input.toCharArray();

            for (int i = 0; i < chrString.length; i++) {
                int count = 0;
                for (int j = 0; j < chrString.length; j++) {

                    if (chrString[i] == chrString[j]) {
                        count = count + 1;
                    } else {
                        count = 1;
                    }

                }
                if (count == 1) {
                    result = chrString[i];
                    System.out.println("Unique Character : " + result);
                    break;

                }

            }

        }

    }
}
