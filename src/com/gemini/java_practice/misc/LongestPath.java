package com.gemini.java_practice.misc;

public class LongestPath {
    public static void main(String[] args) {
        int[] input = { -1, 1, 1, 2, 7, 9, 19, 30 };
        int maxdiff = -1;
        int max = input.length - 1;
        int diff = input[max] - input[0];
        if (diff > maxdiff) {
            maxdiff = diff;
        }

        System.out.println("Max difference between numbers is : " + maxdiff);
    }
}
