package com.gemini.array;

import java.util.ArrayList;
import java.util.List;

public class AgainPythagoreanTriplet {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 43, 45, 67, 8, 9, 23, 6, 0 };

        for (List<Integer> i : pythogoreanTriplet(input)) {
            System.out.println(i + ", ");
        }

    }

    public static List<List<Integer>> pythogoreanTriplet(int[] a) {
        List<List<Integer>> output = new ArrayList<>();
        for (int h = a.length - 1; h > 1; h--) {
            for (int b = 0; b < h; b++) {
                for (int l = b + 1; l < h ; l++) {
                    if ((a[l] + a[b] > a[h])
                            && (a[l] * a[l] + a[b] * a[b] == a[h] * a[h])) {
                        List<Integer> result = new ArrayList<>();
                        result.add(a[l]);
                        result.add(a[b]);
                        result.add(a[h]);
                        output.add(result);
                    }

                }

            }

           
        }

        return output;}
}