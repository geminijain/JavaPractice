package com.gemini.java_practice.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) throws Exception {
        int[] input = { 1, 3, 1, 2, 4, 31, 455, 67, 2 };

        Arrays.sort(input);
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int temp = input[i];

            if (ar.contains(temp)) {
                continue;
            } else {
                ar.add(temp);
            }

        }

        System.out.print(ar);

    }
}
