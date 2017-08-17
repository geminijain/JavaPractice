package com.gemini.array;

import java.util.Arrays;

public class MinMaxValuePart2 {

    private static void findMinMax(int[] input) throws Exception {
        int minValue = 0;
        int maxValue = 0;
        if (input == null || input.length == 0) {
            throw new Exception("Input cannot be null or empty");
        } else {
            Arrays.sort(input);
            minValue = input[0];
            maxValue = input[input.length - 1];
        }
        System.out.println("Minimum Value : " + minValue);
        System.out.print("Maximum Value : " + maxValue);
    }

    public static void main(String[] args) throws Exception {
        int[] input = { -1 };
        findMinMax(input);
    }

}
