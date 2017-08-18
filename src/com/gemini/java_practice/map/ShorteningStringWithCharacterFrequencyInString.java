package com.gemini.java_practice.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class ShorteningStringWithCharacterFrequencyInString {

    public static void main(String[] args) {
        String input = "aaaabbcccddddeaaa";

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (hm.containsKey(input.charAt(i))) {
                int temp = hm.get(input.charAt(i));
                hm.put(input.charAt(i), temp + 1);
            } else {
                hm.put(input.charAt(i), 1);
            }
        }

        for (Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }

        System.out.println("\nPrint character with even frequency : ");

        for (Entry<Character, Integer> entry : hm.entrySet()) {
            int temp = entry.getValue();

            if (temp % 2 == 0) {
                System.out.print(entry.getKey());
                System.out.print(entry.getValue());
            }
        }
    }

}
