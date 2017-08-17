package com.gemini.string;

import java.util.Arrays;
//program to implement an alogorithm to determine if a string has all unique characters.
//What if you cannot use additional data structure. 
public class UniqueCharacterPart2 {
    public static void main(String[] args) {
        String input = "abcdd";

        boolean output = isUnique(input);

        if (output) {
            System.out.println("This string contains unique characters");
        } else {
            System.out
                    .println("This string doesnot contains unique characters");
        }
    }

    public static boolean isUnique(String str) {
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        Boolean isUnique = true;
        for (int i = 0; i < charStr.length-1; i++) {
            if (charStr[i] == charStr[i + 1]) {
                isUnique = false;
                break;
            }
        }

        return isUnique;
    }
}
