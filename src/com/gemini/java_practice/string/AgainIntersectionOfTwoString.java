package com.gemini.java_practice.string;

import java.util.HashSet;

public class AgainIntersectionOfTwoString {

    public static void main(String[] args) throws Exception {
        String input1 = "abcgdef";
        String input2 = "ghiaqerb";

        if (input1 == null || input2 == null || input1.isEmpty()
                || input2.isEmpty()) {
            throw new Exception("String cannot be empty");
        } else {
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();
            for (int i = 0; i < input1.length(); i++) {
                hs1.add(input1.charAt(i));
            }
            for (int i = 0; i < input2.length(); i++) {
                hs2.add(input2.charAt(i));

            }
            hs1.addAll(hs2);

            System.out.println(hs1);

        }

    }

}
