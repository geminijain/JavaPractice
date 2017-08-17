package com.gemini.misc;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {
    public static void main(String[] args) {
        String str = "hello";

        char[] chrArr = str.toCharArray();
        int size = chrArr.length;

        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if ((j < i) && (chrArr[i] == chrArr[j])) {
                    break;
                }

                if (chrArr[i] == chrArr[j]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("Element " + chrArr[i] + " present :"
                        + count + " times");
            }
        }
    }

    public static void check(String str) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(Character.valueOf(str.charAt(i)))) {
                int j = ((Integer) hm.get(Character.valueOf(str.charAt(i))))
                        .intValue();
                j++;
                hm.put(Character.valueOf(str.charAt(i)), Integer.valueOf(j));
            } else {
                hm.put(Character.valueOf(str.charAt(i)), Integer.valueOf(1));
            }
        }
        System.out.println(hm);
    }
}
