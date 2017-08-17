package com.gemini.interviewPractise;

import java.util.HashMap;

public class FindCharacterOccurance {

    public static void main(String[] args) throws Exception {
        String input = "aabcde";
        char ch = 'a';

        int result = findCharacterCount(input, ch);
        System.out.print(result);

    }

    private static int findCharacterCount(String input, char ch)
            throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("input cannot be null");
        } else if (ch == '\0') {
            throw new Exception("enter search character");
        } else {
            char[] chrString = input.toCharArray();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < chrString.length; i++) {
                char temp = chrString[i];
                if (hm.containsKey(temp)) {
                    int count = hm.get(temp);
                    hm.put(temp, count + 1);
                } else {
                    hm.put(chrString[i], 1);
                }
            }

            if (hm.containsKey(ch)) {
                int result = hm.get(ch);
                return result;
            }
        }
        return -1;
    }
}
