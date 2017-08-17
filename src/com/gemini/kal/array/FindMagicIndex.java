package com.gemini.kal.array;

public class FindMagicIndex {

    public static void main(String[] args) {
        int[] input = { -8, -6, -1, 0, 2, 5, 8, 9, 18 };
        int end = input.length;
        int output = findMagicIndex(input, input[0], end - 1);
        System.out.print("Magic Index : " + output);

    }

    private static int findMagicIndex(int[] input, int low, int high) {

        if (high >= low) {

            int mid = (low + high) / 2;

            if (mid == input[mid]) {
                return mid;
            }
            if (mid > input[mid]) {
                return findMagicIndex(input, mid + 1, high);
            } else {
                return findMagicIndex(input, low, mid - 1);
            }

        }
        return -1;
    }

}
