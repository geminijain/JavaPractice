package com.gemini.array;

public class SortedArray {

    public static void main(String[] args) {
        int[] a = { 4 , 5 , 8 , 1 , 3 , 100 , 2 , 8};

        int[] newSortedA = sorted(a);

        for (int i = 0; i < newSortedA.length; i++) {
            System.out.print(newSortedA[i] + ",");
        }
    }

    public static int[] sorted(int[] b) {

        for (int i = 0; i < b.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < b[min]) {
                    min = j;
                    
                }

            }
            int temp = b[min];
            b[min] = b[i];
            b[i] = temp;

        }
        return b;
    }

}
