package com.gemini.java_practice.array;

public class UniquePairSumToNumberPart2 {

    public static void main(String[] args) {
        // input array
        int[] a = { 1,1,1,1,1,1 };

        // number value for sum
        int number = 2;

        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;
            while (i < 1) {
                for (int j = i + 1; j < a.length; j++) {

                    sum = a[i] + a[j];
                    if (sum == number) {
                        System.out.println(a[i] + " , " + a[j]);

                    }
                }
            }

            while (i >= 1) {
                if (a[i] != a[i - 1]) {
                    for (int j = i + 1; j < a.length; j++) {
                        sum = a[i] + a[j];
                        if (sum == number) {
                            System.out.println(a[i] + " , " + a[j]);

                        }
                    }
                }
            }
        }

    }

}
