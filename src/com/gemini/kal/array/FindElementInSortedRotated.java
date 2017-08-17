package com.gemini.kal.array;

public class FindElementInSortedRotated {

    public static void main(String[] args) {
        int[] input = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int output = findpivotBinarySearchElement(input, 0, input.length - 1,
                key);
        System.out.println("Index of key element is : " + output);
    }

    private static int findpivotBinarySearchElement(int[] input, int low,
            int high, int key) {
        int pivot = findPivot(input, 0, input.length - 1);

        if (pivot == -1) {
            return -1;
        }
        if (input[pivot] == key) {
            return pivot;
        }
        if (input[0] <= key) {
            return binarySearch(input, 0, pivot - 1, key);
        } else {
            return binarySearch(input, pivot + 1, high, key);
        }
    }

    private static int findPivot(int[] input, int low, int high) {
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }
        int mid = (low + high) / 2;
        if (mid < high && input[mid] > input[mid + 1]) {
            return mid;
        }
        if (mid > low && input[mid] < input[mid - 1]) {
            return mid - 1;
        }
        if (mid > low && input[mid] < input[mid - 1]) {
            return findPivot(input, low, mid - 1);
        } else {
            return findPivot(input, mid + 1, high);
        }

    }

    private static int binarySearch(int[] input, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == input[mid]) {
            return mid;
        }
        if (key > input[mid]) {
            return binarySearch(input, mid + 1, high, key);
        } else {
            return binarySearch(input, low, mid - 1, key);
        }
    }
}
