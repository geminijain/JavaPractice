package com.gemini.string;

public class ReverseWord {

    public static void main(String[] args) {
        String quote = "All is well";
        String[] words = quote.split(" ");

        int wordsCount = words.length;
        String reversedQuote = "";
        for (int i = 0; i < wordsCount; i++) {
            char[] word = words[i].toCharArray();
            int wordSize = word.length - 1;

            for (int j = 0; j <= (wordSize / 2); j++) {
                char temp = word[j];
                word[j] = word[wordSize - j];
                word[wordSize - j] = temp;
            }

            String reversedWord = String.valueOf(word);
            reversedQuote = reversedQuote + " " + reversedWord;
        }
        System.out.print(reversedQuote);
    }
}
