package com.gemini.array;
// program to sort an array
public class SortZeroAndOne {

    public static void main(String[] args) {
        int[] mix = { 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1 }; // take a zero and one
                                                         // mix array
        int len = mix.length;
        int[] sortedArray = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) { // loop to count 0 in array
            if (mix[i] == 0) {
                count++;
            }
        }
        for (int j = 0; j < count; j++) { // insert counted 0 in array
            sortedArray[j] = 0;
        }
        for (int j = count; j < len; j++) { // insert counted 1 in an array
            sortedArray[j] = 1;
        }
        for (int j = 0; j < len; j++) { // print new array
            System.out.print(sortedArray[j] + " ");
        }

    }
}
