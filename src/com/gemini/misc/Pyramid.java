package com.gemini.misc;

public class Pyramid {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Print pyramid for number of rows : ");
        int row = scan.nextInt();

        printPyramid(row);
        scan.close();
    }

    private static void printPyramid(int row) {
        for (int i = 1; i <= row; i++) {

            for (int j = i; j <= 2 * row - 1; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            for (int l = i - 1; l > 0; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}
