package com.gemini.string;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "opto";
        String str2 = "OTOP";

        if (isAnagram(str1, str2)) {
            System.out.println("It is Anagram");
        }
        else {
            System.out.println("It is not an Anagram");
        }

    }

    public static boolean isAnagram(String strg1, String strg2) {
        strg1 = strg1.toLowerCase();
        strg2 = strg2.toLowerCase();
        StringBuffer sb = new StringBuffer(strg2);

        if (strg1.length() != sb.length()) {
            return false;
        }

        for (int i = 0; i < strg1.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (strg1.charAt(i) == sb.charAt(j)) {
                    sb = sb.deleteCharAt(j);
                    break;
                }
            }
        }
        if (sb.length() != 0) {
            return false;
        }
        return true;
    }

}
