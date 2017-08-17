package com.gemini.array;

public class TwoConsecutiveMaxSum {

    public static void main(String[] args) throws Exception {
        int[] input = {3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,4,5,6,7,8,9,01,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
        int output = findMaxSum(input);
        System.out.print("Max sum of two consecutive integer : " + output);
    }

    private static int findMaxSum(int[] input) throws Exception {
        int maxSum = 0;
        if (input == null || input.length == 0) {
            throw new Exception("input cannot be empty or null");
        } else if (input.length == 1) {
            throw new Exception("input should contain two integers");

        } else {
            int sum = 0;
            for (int i = 0; i < input.length - 1; i++) {
                sum = input[i] + input[i + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                } else {
                    continue;
                }
            }
        }
        return maxSum;
    }
}
