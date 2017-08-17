package com.gemini.interviewPractise;

public class MergeTwoArray {

    public static void main(String[] args) {
        int[] input1 = { 3, 45, 6, -2, 6 };
        int[] input2 = {};

        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Array cannot be empty");
        }

        else {
            int size = input1.length + input2.length;

            int[] output = new int[size];

            for (int i = 0; i < input1.length; i++) {
                output[i] = input1[i];
            }
            for (int i = 0; i < input2.length; i++) {
                output[i + input1.length] = input2[i];
            }

            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i] + ",");
            }
        }
    }
}
/*
 * test cases - 1) valid two array inputs 2) empty 3) character 4) symbol 5)
 * value more than int data type 6) float/ double data value 7) positive and
 * negative integer *
 */