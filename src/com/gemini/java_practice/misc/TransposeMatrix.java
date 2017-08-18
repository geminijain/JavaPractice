package com.gemini.java_practice.misc;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        print(a);

        System.out.println();
        int[][] b = transpose(a);
        print(b);
    }

    private static int[][] transpose(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[][] b = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    private static void print(int[][] a) {
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
