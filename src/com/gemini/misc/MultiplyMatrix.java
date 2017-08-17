package com.gemini.misc;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] a = { {1,2,3} , {4,5,6}};
        int[][] b = {{1,2}, {3,4}, {5,6}};

        int[][] c = multiply(a, b);

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiply(int[][] a, int[][] b) {
        if ((a == null) || (b == null)) {
            throw new RuntimeException("Invalid matrix");
        }

        if (a[0].length != b.length) {
            throw new RuntimeException(
                    "Column for first matrix should be same as row od second matrix.");
        }
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int cell = 0;
                for (int k = 0; k < b.length; k++) {
                    cell += a[i][k] * b[k][j];
                }
                c[i][j] = cell;
            }
        }

        return c;
    }
}
