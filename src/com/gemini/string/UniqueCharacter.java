package com.gemini.string;

public class UniqueCharacter {

    public static void main(String[] args) throws Exception {
        String input = "abc";

        boolean output = isUnique(input);

        if (output) {
            System.out.println("This string contains unique characters");
        } else {
            System.out
                    .println("this string does not contains unique characters");
        }
        

    }

    public static boolean isUnique(String str) throws Exception {
        Boolean isUnique = true;
        if (str.length() == 0 || str.isEmpty()) {
            throw new Exception("String can not be null or empty");

        }

        else {

            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }

            }
            return isUnique;

        }
    }
}
