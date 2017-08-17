package com.gemini.array;

public class AgainSumOfRemainingElement {

    public static void main(String[] args) throws Exception {
       int[] input ={1,4,8};
       int temp = SumOfArray(input);
       
       int[] output = SumOfRemaining(temp, input);
       
       for(int i = 0; i < output.length; i++) {
           System.out.print(output[i] + " " );
       }

    }
    public static int SumOfArray(int[] a) throws Exception {
        int sum = 0;
        if (a == null || a.length == 0) {
            throw new Exception ("array cannot be empty");
        }
        else {
           
            for(int i =0; i < a.length; i++){
                sum = sum + a[i];
            }
        }
        return sum;
    }
    public static int[] SumOfRemaining(int s, int[] b) {
        int[] out = new int[b.length] ;
        for(int i = 0; i < b.length; i++) {
            out[i] =  s - b[i];
        }
        return out;
    }

}
