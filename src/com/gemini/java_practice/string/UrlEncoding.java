package com.gemini.java_practice.string;

public class UrlEncoding {
    public static void main(String[] args) {
        String str = "My name is khan      ";
        char[] input = str.toCharArray();

        // loop start
        int jstart = 0;
        for (int i = input.length - 1; i > 0; i--) {
            if (input[i] != ' ') {
                jstart = i;
                break;
            }
        }

        int i = input.length - 1;
        for (int j = jstart; j >= 0; j--) {
            if (input[j] != ' ') {
                input[i] = input[j];
                i--;

            } else if (input[j] == ' ') {
                input[i] = '0';
                input[i - 1] = '2';
                input[i - 2] = '%';
                i = i - 3;

            }
        }

        System.out.println(input);
    }
}
