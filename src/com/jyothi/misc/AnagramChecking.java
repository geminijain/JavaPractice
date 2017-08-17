package com.jyothi.misc;

public class AnagramChecking {
    public static void isAnagram(StringBuffer s1, StringBuffer s2) {
        if (s1.length() == s2.length()) {
            int len = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        len++;
                        s2.deleteCharAt(j);
                    }
                }
            }
            if (len == s1.length()) {
                System.out.println("Two strings are Anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    public static void main(String[] args) {
        String s1 = "TOPO";
        String s2 = "potO";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        StringBuffer string1 = new StringBuffer(s1);
        StringBuffer string2 = new StringBuffer(s2);
        System.out.println("Checking if two strings are anagrams--");
        isAnagram(string1, string2);
    }
}
