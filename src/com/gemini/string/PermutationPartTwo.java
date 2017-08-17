package com.gemini.string;

public class PermutationPartTwo {

    public static void main(String[] args) {
        String input1 = "abcee";
        String input2 = "bddea";

        boolean output = isPermutation(input1, input2);

        if (output) {
            System.out.println("Two strings are permutation");
        } else {
            System.out.println("Two strings are not permutation");
        }
    }

    public static boolean isPermutation(String str1, String str2) {

        boolean isPermute = true;

        if (str1.length() == 0 || str1.isEmpty()
                || str1.length() != str2.length()) {
            isPermute = false;
        }

        else {
            StringBuilder str = new StringBuilder(str2);

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str1.charAt(i) == str.charAt(j)) {
                        str.deleteCharAt(j);
                    }
                }
            }

            if (str.length() != 0) {
                isPermute = false;
            }

        }
        return isPermute;
    }
}
