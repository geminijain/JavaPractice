package com.gemini.array;

public class AgainTransposeMatrix {

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
int[][] output = transposeMatrix(a);

for(int i= 0; i < output.length; i++){
    for(int j = 0; j < output[0].length; j++){
        System.out.print(output[i][j] + " ");
    }
    System.out.println();}

    }

    public static int[][] transposeMatrix(int[][] a) {
        int row = a.length;
        int column = a[0].length;
        
        int[][] b = new int[row][column];
        for(int i = 0; i < row; i ++){
            for(int j =0 ; j < column ; j++){
                b[i][j] = a[j][i];
            }
        }
        
        
    return b;}
}
