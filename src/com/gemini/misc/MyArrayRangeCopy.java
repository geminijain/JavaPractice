package com.gemini.misc;

import java.util.Arrays;

public class MyArrayRangeCopy {
    public static void main(String[] args) {
        int[] myArr = { 1, 8, 9, 7, 6, 3, 4, 2 };
        System.out.println("Element of Array : \n");
        int[] arrayOfInt1;
        int j = (arrayOfInt1 = myArr).length;
        for (int i = 0; i < j; i++) {
            int num = arrayOfInt1[i];
            System.out.print(num + " ");
        }

        int[] newArr = Arrays.copyOfRange(myArr, 2, 6);

        System.out.println("\n Element of newArray : \n");
        int[] arrayOfInt2;
        int k = (arrayOfInt2 = newArr).length;
        for (j = 0; j < k; j++) {
            int num1 = arrayOfInt2[j];
            System.out.print(num1 + " ");
        }
    }
}
