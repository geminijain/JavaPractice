package com.gemini.java_practice.array;

public class SumElementsInMatrix {

    public static void main(String[] args) throws Exception {
        int[][] input = { { 11, 1, 1 }, { 1, 3, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int output = findSumOfElements(input);

        System.out.println("Sum of elements in matrix : " + output);

    }

    private static int findSumOfElements(int[][] input) throws Exception {

        int sum = 0;

        if (input == null || input.length == 0) {
            throw new Exception("input cannot be null");
        } else {
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[0].length; j++) {
                    sum = sum + input[i][j];
                }
            }
        }
        return sum;

    }
}
