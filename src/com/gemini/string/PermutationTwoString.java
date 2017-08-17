package com.gemini.string;

import java.util.Arrays;
// given two strings, write a method to decide if one is permutation of the other.
public class PermutationTwoString {

    public static void main(String[] args) {
        String input1 = "eebcd";
        String input2 = "dcbae";

        Boolean output = isPermutation(input1, input2);
        if (output) {
            System.out.println("Two strings are permutation of each other");
        } else {
            System.out
                    .println("Two strings are not the permutation of each other");
        }

    }

    public static boolean isPermutation(String str1, String str2) {
        boolean isPermut = true;
        if (str1.length() != str2.length()) {
            isPermut = false;
        }

        else {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            for (int i = 0; i < str1CharArray.length; i++) {
                if (str1CharArray[i] != str2CharArray[i]) {
                    isPermut = false;
                    break;
                }

            }
        }
        return isPermut;
    }

}
