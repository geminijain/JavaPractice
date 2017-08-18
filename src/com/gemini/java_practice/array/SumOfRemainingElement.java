package com.gemini.java_practice.array;

public class SumOfRemainingElement {

    public static void main(String[] args) {
        int[] input = {};

        int[] output = remainingSumElements(input);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

    }

    public static int[] remainingSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int sum = sumOfElements(input);
        for (int i = 0; i < input.length; i++) {
            input[i] = sum - input[i];
        }
        return input;
    }

    public static int sumOfElements(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }
}
