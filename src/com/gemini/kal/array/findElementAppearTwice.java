package com.gemini.kal.array;

public class findElementAppearTwice {

    public static void main(String[] args) throws Exception {
        int[] input = { 4, 1, 2, 2, 3 };
        int output = findDuplicate(input);
        System.out.println("Duplicate : " + output);
    }

    private static int findDuplicate(int[] input) throws Exception {
        int result = 0;
        if (input == null || input.length == 0) {
            throw new Exception("input cannot be null");
        } else {
            int end = input.length - 1;
            int sum = end * (end + 1) / 2;
            int totalSum = 0;
            for (int i = 0; i <= end; i++) {
                totalSum = totalSum + input[i];
            }
            result = totalSum - sum;
            return result;
        }
      
    }
}
