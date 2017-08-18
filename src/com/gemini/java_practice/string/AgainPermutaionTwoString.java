package com.gemini.java_practice.string;

import java.util.Arrays;

public class AgainPermutaionTwoString {

    public static void main(String[] args) throws Exception {
        String str1 = "abccdef";
        String str2 = "fedcbca";
        boolean output = isPermutation(str1, str2);
        if (output) {
            System.out.println("This strings are permutation");
        } else {
            System.out.println("This strings are not permutation");
        }
    }

    public static boolean isPermutation(String str1, String str2)
            throws Exception {
        boolean isPermutation = true;
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            throw new Exception("String can not be empty");
        } else if (str1.length() != str2.length()) {
            isPermutation = false;

        } else {
            char[] chrstr1 = str1.toCharArray();
            char[] chrstr2 = str2.toCharArray();
            Arrays.sort(chrstr1);
            Arrays.sort(chrstr2);
            for (int i = 0; i < str1.length(); i++) {
                if (chrstr1[i] != chrstr2[i]) {
                    isPermutation = false;
                    break;
                }
            }
        }
        return isPermutation;
    }

}
