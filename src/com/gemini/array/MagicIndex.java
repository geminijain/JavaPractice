package com.gemini.array;

public class MagicIndex {

    public static void main(String[] args) {
        int[] input = { 1, 2, 8, 3, 4, 7 };

        for (int i = 0; i < input.length; i++) {
            if (input[i] == i) {
                System.out.print(i);
                break;
            }
        }
    }
}