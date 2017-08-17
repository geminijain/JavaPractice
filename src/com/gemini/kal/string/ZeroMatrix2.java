package com.gemini.kal.string;

public class ZeroMatrix2 {

    public static void main(String[] args) throws Exception {
        int[][] input = { { 0, 2, 3, 4 }, { 2, 7, 9, 5 }, { 6, 7, 8, 8 } };
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

        boolean rowHasZero = false;
        boolean columnHasZero = false;

        // check if first row has zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        // check if first column has zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                columnHasZero = true;
                break;
            }
        }
        
        // check rest of matrix for zero
        for(int i =1; i < matrix.length; i++){
            for(int j =1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // nullify row based on first column
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix, i);
            }
        }
        
        
        // nullify column 
        for(int j =0; j < matrix[0].length; j++){
            if(matrix[0][j] ==0){
                nullifyColumn(matrix, j);
            }
        }
        // check fist row to set zero
        if(rowHasZero){
            nullifyRow(matrix, 0);
        }
        
        // check first column to set zero
        if(columnHasZero) {
            nullifyColumn(matrix,0);
        }

        
       return matrix;  
    }

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
