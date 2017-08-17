package com.gemini.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterFrequency {

    public static void main(String[] args) {
        String str = "HELLO";

        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            int count = 1;

            if (hm.containsKey(chr)) {
                count = hm.get(chr) + 1;
            }
            hm.put(chr, count);
        }

        for (Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
