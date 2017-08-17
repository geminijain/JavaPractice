package com.gemini.misc;

public class MinNumberValidation {
    public static void main(String[] args) throws Exception {
        int[] num = { 5, 8, 6, 4, 9, -1, -5 };
        int minNum = calculateMinNum(num);
        System.out.println(minNum);
    }

    public static int calculateMinNum(int[] num) throws Exception {
        int minNum = 0;

        if (num == null) {
            throw new Exception("input array cannot be null");
        }

        if (num.length > 0) {
            minNum = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] < minNum) {
                    minNum = num[i];
                }
            }
        }
        return minNum;
    }
}
