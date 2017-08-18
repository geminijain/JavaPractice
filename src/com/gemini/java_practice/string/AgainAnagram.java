package com.gemini.java_practice.string;

public class AgainAnagram {

    public static void main(String[] args) throws Exception {
        String input1 = "opto";
        String input2 = "OTOP";

        boolean output = isAnagram(input1, input2);

        if (output) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }

    public static boolean isAnagram(String input1, String input2)
            throws Exception {
        boolean isAnagram = true;
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            throw new Exception("Strings cannot be empty");
        }

        else if (input1.length() != input2.length()) {
            isAnagram = false;
        } else {
            StringBuffer temp = new StringBuffer(input2);

            for (int i = 0; i < input1.length(); i++) {
                for (int j = 0; j < temp.length(); j++) {
                    if (input1.charAt(i) == temp.charAt(j)) {
                        temp.deleteCharAt(j);
                        break;
                    }
                }
            }
            if (temp.length() != 0) {
                isAnagram = false;

            }

        }
        return isAnagram;
    }
}
