package com.gemini.java_practice.misc;

public class WordWithAtleastLength {

    public static void main(String[] args) throws Exception {
        String input = "My name is chuchu";
        int number = 2;
        findWordWithAtleastLength(input, number);
    }

    private static void findWordWithAtleastLength(String input, int num)
            throws Exception {

        if (input == null || input.length() == 0) {
            throw new Exception("input cannot be null or empty");
        } else {
            String[] word = new String[input.length()];
            for (int i = 0; i < input.length(); i++) {
                word = input.split(" ");
            }
            int end = word.length;
            for (int i = 0; i < end; i++) {
                if (word[i].length() >= num) {
                    System.out.println(word[i]);
                }
            }
        }
    }

}
