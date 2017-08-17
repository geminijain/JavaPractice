package com.gemini.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetrixAsLinearSpiralLogic {

    public static void main(String[] args) throws Exception {
        int[][] input = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 }

        };

        System.out.println("Input: " + Arrays.deepToString(input));
        List<Integer> result = spiralOutput(input);
        System.out.println("Output: " + result);
    }

    public static List<Integer> spiralOutput(int[][] input) throws Exception {

        if (input == null || input.length == 0) {
            throw new Exception("array can not be null or empty");
        }

        else {
            int length = input[0].length - 1;
            int height = input.length - 1;
            int rowMin = 0;
            int columnMin = 0;
            int columnTotal = length;
            int rowTotal = height;

            List<Integer> output = new ArrayList<>();
            while (rowMin <= rowTotal && columnMin <= columnTotal) {
                // take upper row of current matrix
                for (int column = columnMin; column <= columnTotal; column++) {
                    output.add(input[rowMin][column]);
                }
                rowMin++;

                // take right column of current matrix
                for (int row = rowMin; row <= rowTotal; row++) {
                    output.add(input[row][columnTotal]);
                }
                columnTotal--;

                if (rowMin <= rowTotal && columnMin <= columnTotal) {
                    // take lower row of current matrix
                    for (int column = columnTotal; column >= columnMin; column--) {
                        output.add(input[rowTotal][column]);
                    }
                    rowTotal--;

                    // take left column of current matrix
                    for (int row = rowTotal; row >= rowMin; row--) {
                        output.add(input[row][columnMin]);
                    }
                    columnMin++;
                }
            }

            return output;
        }
    }
}