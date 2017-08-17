package com.gemini.array;



public class SecondMinMaxPart1 {

    private static void findSecondMinMax(int[] input) throws Exception {

        int firstMinValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        int firstMaxValue = Integer.MIN_VALUE;
        if (input == null || input.length == 0) {
            throw new Exception("Input cannot be null or empty");
        } else if (input.length == 1) {
            throw new Exception("Atleast two number required");
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] < firstMinValue) {
                    firstMinValue = input[i];
                }
                if (input[i] > firstMaxValue) {
                    firstMaxValue = input[i];
                }

            }
            for (int i = 0; i < input.length; i++) {
                if (input[i] < secondMinValue && input[i] != firstMinValue) {
                    secondMinValue = input[i];
                }
                if (input[i] > secondMaxValue && input[i] != firstMaxValue) {
                    secondMaxValue = input[i];
                }
            }
        }
        System.out.println("Second minimum Number : " + secondMinValue);
        System.out.println("Second Maximum Number : " + secondMaxValue);
    }

    public static void main(String[] args) throws Exception {
        int[] input = { 1};
        findSecondMinMax(input);

    }

}
