package com.gemini.java_practice.string;

public class MaximumCharacter {

    public static void main(String[] args) {
        String sentence = "HELLO WORLD";
        int size = sentence.length();
        String sentence1 = sentence.toLowerCase();
        char maxLetter = '\0';
        int icounter = 0;
        int previousCount = 0;
        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {
                if (sentence1.charAt(i) == sentence1.charAt(j) && j >= i) {
                    count++;
                    
                }
                while (icounter < 1) {
                    previousCount = count;
                    icounter++;
                }
            }
           
                    if (count > previousCount) {
                    previousCount = count;
                    maxLetter = sentence.charAt(i);

                }
            }

          System.out.println(maxLetter);

    }

}
