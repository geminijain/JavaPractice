package com.gemini.array;

public class AgainMatrixMultiplication {

    public static void main(String[] args) throws Exception {
        int[][] a = { {1,2,3} , {4,5,6}};
        int[][] b = {{1,2}, {3,4}, {5,6}};
        
        int[] [] c = multiply(a,b);      
        
        for(int i = 0; i <c.length; i++){
            for(int j =0; j < c[i].length ; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiply (int[][] a, int[][] b) throws Exception{
        int[][] c = new int[a.length] [b[0].length] ;
        if (a.length == 0 || b.length == 0) {
            throw new Exception ("array cannot be empty");
        }
        else if(a[0].length != b.length){
            throw new Exception ("number of column in first array should be equal to number of rows in second array");
        }
        else{ 
            for(int i = 0; i < a.length ; i++){
                
                for(int j = 0; j < b[0].length; j++){
                    int sum = 0;
                    for(int k = 0; k < b.length; k++ ){
                        sum = sum + a[i][k]*b[k][j];
                    }
                    c[i][j] = sum;
                }
               
        }
    }

return c;}
}
