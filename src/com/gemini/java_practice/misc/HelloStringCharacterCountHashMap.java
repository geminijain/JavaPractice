package com.gemini.java_practice.misc;

import java.util.HashMap;
import java.util.Map;

public class HelloStringCharacterCountHashMap {
    public static void main(String[] args) {
        String word = "hello";

        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (hm.containsKey(Character.valueOf(letter))) {
                hm.put(letter, hm.get(letter) + 1);
            } else {
                hm.put(letter, 1);
            }
        }
        System.out.println(hm);
    }
}
