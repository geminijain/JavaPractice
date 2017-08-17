package com.jyothi.misc;

public class SubArraysWithSameSum {
    public static void subArrayHavingSameSum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 6) {
                System.out.println("single element arrays with sum 6: {" + a[i]
                        + "}");
            } else if (a[i] != 6) {
                for (int j = i + 1; j < a.length; j++)
                    if (a[i] + a[j] == 6) {
                        System.out.println("2 element arrays with sum 6: {"
                                + a[i] + "," + a[j] + "}");
                    } else
                        for (int k = j + 1; k < a.length; k++)
                            if (a[i] + a[j] + a[k] == 6)
                                System.out
                                        .println("3 element arrays with sum 6: {"
                                                + a[i]
                                                + ","
                                                + a[j]
                                                + ","
                                                + a[k] + "}");
            }
        }
    }

    public static void main(String[] args) {
        int[] Original_array = { 1, 2, 3, 4, 5, 6 };
        subArrayHavingSameSum(Original_array);
    }
}
