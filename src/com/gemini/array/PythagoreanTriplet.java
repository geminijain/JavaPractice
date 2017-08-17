package com.gemini.array;

// program to Given a array of integers, find the number of Pythagorean triplets in the array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        int[] input = { 2, 3, 1, 4, 5, 9, 8, 15, 17, 7, 24, 25 };
        Arrays.sort(input);

        for (List<Integer> i : pythagoreanTriplet(input)) {
            System.out.print(i + ",");
        }
    }

    public static List<List<Integer>> pythagoreanTriplet(int[] arr) {

        List<List<Integer>> output = new ArrayList<>();
        int size = arr.length;

        // loop for hypotenuse
        for (int h = size - 1; h > 1; h--) {
            // loop for length
            for (int l = 0; l < h; l++) {
                // loop for base
                for (int b = l + 1; b < h; b++) {
                    // length + breadth > hypotenuse
                    if ((arr[l] + arr[b] > arr[h]) && // pythagoreanTriplet
                                                      // condition
                            ((arr[l] * arr[l] + arr[b] * arr[b]) == arr[h]
                                    * arr[h])) {
                        List<Integer> result = new ArrayList<>();
                        result.add(arr[l]);
                        result.add(arr[b]);
                        result.add(arr[h]);

                        output.add(result);
                    }
                }
            }
        }
        return output;
    }
}
