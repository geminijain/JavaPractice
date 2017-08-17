package com.gemini.io;

public class MergeTwoSortedArrayIntoSortedArray {

    public static void main(String[] args) {
        int[] a = { 4, -5, 8, 1, -3 };
        int[] b = { 100, 2, -8,0 };

        int[] result = sortedMergedArray(a,b);
                
        for(int i =0; i < result.length; i++){
            System.out.print(result[i] + " , ");
        } 
            
    }

    public static int[] sortedMergedArray(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];

        // merge two given arrays
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            output[a.length + i] = b[i];
        }

        for (int i = 0; i < output.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < output.length; j++) {
                if (output[j] < output[min]) {
                    min = j;

                }

            }
            int temp = output[min];
            output[min] = output[i];
            output[i] = temp;

        }
return output;
    }
}
