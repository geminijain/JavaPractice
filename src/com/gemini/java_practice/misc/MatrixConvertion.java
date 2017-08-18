package com.gemini.java_practice.misc;

public class MatrixConvertion {
    public static void main(String[] args) {
        int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 0, 8, 9 } };

        for (int i = 0; i < input.length; i++) {
            for (int j = 0 ; j < input.length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
