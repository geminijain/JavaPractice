package com.gemini.string;

import java.util.Arrays;

public class Again2IsUniqueCharacter {

    public static void main(String[] args) throws Exception {
        String input = " ";

        boolean output = isUnique(input);

        if (output) {
            System.out.println("This is Unique Character");
        } else {
            System.out.println("This is not unique character");
        }
    }

    public static boolean isUnique(String s) throws Exception {
        if (s == null || s.isEmpty()){
            throw new Exception ("string cannot be empty");
        }
        else {
        boolean isUnique = true;
        char[] chstr = s.toCharArray();

        Arrays.sort(chstr);

        for (int i = 0; i < chstr.length-1; i++) {
            if (chstr[i] == chstr[i + 1]) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

}
}
