package com.gemini.array;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { { 8, 7, 6 }, { 4, 5, 2 }, { 1, 9, 3 } };

        int[][] c = multiply(a, b);
        
        for(int i=0; i<c.length; i++) {
            for(int j=0; j <c[i].length; j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }

    }

    public static int[][] multiply(int[][] a, int[][] b) {
        if (a == null || b == null) {
            throw new RuntimeException("Matrix can not be null");
        }

        if (a[0].length != b.length) {
            throw new RuntimeException(
                    "Column of first matrix should be equal to rows of second matrix");
        }

        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < a[0].length; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;

            }
        }

        return c;
    }
}
