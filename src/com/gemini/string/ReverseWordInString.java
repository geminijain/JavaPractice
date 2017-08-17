package com.gemini.string;

public class ReverseWordInString {

    public static void main(String[] args) {
        String sentence = "All is Well";
        String[] word = sentence.split(" ");
        int len = word.length;

        String reverseWord = "";
        for (int i = 0; i < len; i++) {
            reverseWord += reverseWord(word[i]) + " ";
        }
        System.out.println(reverseWord);
    }

    public static String reverseWord(String eachWord) {
        char[] character = eachWord.toCharArray();
        int end = character.length - 1;

        for (int i = 0; i <= end / 2; i++) {
            int last = end - i;
            if (character[i] != character[last]) {
                char temp = character[i];
                character[i] = character[last];
                character[last] = temp;
            }
        }

        String reversedString = "";
        for (int i = 0; i < character.length; i++) {
            reversedString += character[i];
        }

        return reversedString;
    }

}
