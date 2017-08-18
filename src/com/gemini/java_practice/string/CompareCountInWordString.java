package com.gemini.java_practice.string;

//program to write number of words in a given string is greater than or equal to given number. 
public class CompareCountInWordString {

    public static void main(String[] args) {

        // take a string input
        String quote = "My name is Tanu & my wife name is Gimi";

        // split into words
        String[] word = quote.split(" ");
        int len = word.length;
        int num = 4;

        // to count words with greater size than number
        int count = 0;
        for (int i = 0; i < len; i++) {
            // if word length is greater than number increase the count
            if (word[i].length() >= num) {
                count++;

            }
        }
        // to print the count
        System.out.printf(
                "Number of word greater than or equal to size %d are %d", num,
                count);

    }

}
