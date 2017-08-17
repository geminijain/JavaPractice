package com.gemini.misc;

public class HelloStringCount {
    public static void main(String[] args) {
        String word = "hello";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    if (i > j) {
                        break;
                    }
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(word.charAt(i) + " " + count);
            }
        }
    }
}
