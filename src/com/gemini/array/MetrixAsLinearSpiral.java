package com.gemini.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetrixAsLinearSpiral {

    public static void main(String[] args) {
        int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("input : " + Arrays.deepToString(input));

        int[] expectedOutput = { 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7,
                11, 10 };
        int[] output = getMatrixAsLinearSpiral(input);
        System.out.println("Output is Expected? : "
                + Arrays.equals(expectedOutput, output));
    }

    private static int[] getMatrixAsLinearSpiral(int[][] input) {
        int length = input[0].length - 1;
        int height = input.length - 1;
        int rowMin = 0;
        int columnMin = 0;
        int columnTotal = length;
        int rowTotal = height;
        List<Integer> output = new ArrayList<>();
        while (rowMin < rowTotal && columnMin < columnTotal) {
            for (int column = columnMin; column <= columnTotal; column++) {
                output.add(input[rowMin][column]);
            }
            rowMin++;
            for (int row = rowMin; row <= rowTotal; row++) {
                output.add(input[row][columnTotal]);
            }
            columnTotal--;
            for (int column = columnTotal; column >= columnMin; column--) {
                output.add(input[rowTotal][column]);
            }
            rowTotal--;
            for (int row = rowTotal; row >= rowMin; row--) {
                output.add(input[row][columnMin]);
            }
            columnMin--;
        }
        return toIntArray(output);
    }

    private static int[] toIntArray(List<Integer> input) {
        int[] output = {};
        int i = 0;
        for (Integer x : input) {
            output[i++] = x.intValue();
        }

        return output;
    }
}
