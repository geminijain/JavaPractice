package com.gemini.java_practice.array;

public class UniquePairOfArraySumToNumber {

    public static void main(String[] args) {
        // input array
        int[] a = { 5, 7, 3, 1, 2, 4};

        // number value for sum
        int number = 6;

        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < a.length; j++) {

                sum = a[i] + a[j];
                if (sum == number) {
                    System.out.println(a[i] + " , " + a[j]);

                }
            }
        }

    }

    /*
     * public static int[] sortedArray(int[] b) { int temp = b[0]; for (int i =
     * 1; i < b.length; i++) { if (b[i] < temp) { temp = b[i]; } } return b; }
     */
}
