package com.gemini.misc;

public class ShortestPath {
    public static void main(String[] args) {
        int[] num = { 0, 1, Integer.MAX_VALUE };
        int mindiff = Integer.MAX_VALUE;
        boolean isMinDiff = false;
        for (int i = 0; i < num.length - 1; i++) {
            int diff = num[(i + 1)] - num[i];
            if (diff < mindiff) {
                mindiff = diff;
                isMinDiff = true;
            }
        }

        if (isMinDiff) {
            System.out.println("Minimum difference : " + mindiff);
        } else {
            System.out.println("Minimun difference can not be determined");
        }
    }
}
