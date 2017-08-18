package com.gemini.java_practice.kal.string;

import java.util.HashMap;
import java.util.Map.Entry;

public class Permutation3 {

    public static void main(String[] args) throws Exception {
        String input1 = "acde";
        String input2 = "edca";

        boolean output = isPermute(input1, input2);
        if (output) {
            System.out.print("String are permuatation");
        } else {
            System.out.println("Strings are not permutation");
        }
    }

    public static boolean isPermute(String input1, String input2)
            throws Exception {
        if (input1 == null || input2 == null || input1.isEmpty()
                || input2.isEmpty()) {
            throw new Exception("Input cannot be null or empty");
        }
        if (input1.length() != input2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < input1.length(); i++) {
            char temp = input1.charAt(i);
            if (hm.containsKey(temp)) {
                int value = hm.get(temp);
                hm.put(temp, value);
            } else {
                hm.put(input1.charAt(i), 1);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            char temp = input2.charAt(i);
            if (hm.containsKey(temp)) {
                int value = hm.get(temp);
                value--;
                hm.put(temp, value);

            } else {
                return false;
            }

        }

        for (Entry<Character, Integer> pair : hm.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        return true;

    }

}
