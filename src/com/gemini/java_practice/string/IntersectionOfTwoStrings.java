package com.gemini.java_practice.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoStrings {

    public static void main(String[] args) {
        String str1 = "abcdefghij";
        String str2 = "lmnopqrsatwe";
        
        System.out.println(intersection(str1, str2));
    }

    public static List<Character> intersection(String strg1, String strg2) {
        Set<Character> letters = new HashSet<>();
        List<Character> intersectedLetters = new  ArrayList<>();
        for(int i=0; i < strg1.length(); i++) {
        letters.add(strg1.charAt(i));
        }
        
        for(int i =0; i < strg2.length(); i++) {
            if (letters.contains(strg2.charAt(i)) ){
                intersectedLetters.add(strg2.charAt(i));
            }
        }
    return intersectedLetters;
    }
}
