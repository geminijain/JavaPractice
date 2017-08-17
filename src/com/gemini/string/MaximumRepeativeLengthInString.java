package com.gemini.string;

import java.util.Scanner;

public class MaximumRepeativeLengthInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String sentence = scan.nextLine();
        scan.close();

        char maxConsecutiveCharacter = maxCharacter(sentence);
        System.out.println("Maximum time character repeated consecutively: "
                + maxConsecutiveCharacter);
    }

    public static char maxCharacter(String word) {
        char maxCharacter = '\0';
        if (word == null || word.isEmpty()) {
            return maxCharacter;
        }

        word = word.toLowerCase();
        int tempCount = 1;
        int maxCount = 0;

        maxCharacter = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char thisChar = word.charAt(i);
            char previousChar = word.charAt(i - 1);

            if (thisChar == previousChar) {
                tempCount++;
            } else {
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                    maxCharacter = previousChar;
                }
                tempCount = 1;
            }
        }
        if (tempCount > maxCount) {
            maxCount = tempCount;
            maxCharacter = word.charAt(word.length());
        }
        return maxCharacter;
    }
}
