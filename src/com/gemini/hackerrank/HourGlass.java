package com.gemini.hackerrank;

import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int result = findHourGlass(arr);
        System.out.print(result);
        scan.close();
    }

    private static int findHourGlass(int[][] input) {
        int hourGlassSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hourGlassSum = input[i][j] + input[i][j + 1] + input[i][j + 2]
                        + input[i + 1][j] + input[i + 1][j + 1]
                        + input[i + 1][j + 2] + input[i + 2][j]
                        + input[i + 2][j + 1] + input[i + 2][j + 2];
                if (hourGlassSum > maxSum) {
                    maxSum = hourGlassSum;
                }
            }

        }
        return maxSum;
    }

}
