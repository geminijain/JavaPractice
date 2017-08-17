package com.gemini.kal.string;

public class ZeroMatrix1 {

    public static void main(String[] args) throws Exception {
        int[][] input = { { 0, 2, 3, 4 }, { 2, 7, 9, 5 }, { 6, 7, 8, 0 } };
        int[][] output = findZeroMatrix(input);

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] findZeroMatrix(int[][] matrix) throws Exception {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new Exception("Input cannot be null or empty");
        }

        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        // find cell that contains zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // null rows to zero
        for (int i = 0; i < matrix.length; i++) {
            if (row[i]) {
                nullifyRow(matrix, i);
            }
        }

        // null columns to zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (column[j]) {
                nullifyColumn(matrix, j);
            }
        }
   return matrix; }

    public static void nullifyRow(int[][] input, int row) {
        for (int j = 0; j < input[0].length; j++) {
            input[row][j] = 0;
        }
    }

    public static void nullifyColumn(int[][] input, int column) {
        for (int i = 0; i < input.length; i++) {
            input[i][column] = 0;
        }
    }
}
