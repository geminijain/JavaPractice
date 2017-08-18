package com.gemini.java_practice.arraylist;

import java.util.*;

public class Duplicates {

    public static void main(String[] args) throws Exception {
        int[] input = { 4, 3, 6, 100, 2, 4, 3, 3, 4 };
        Set<Integer> output = findDuplicates(input);

        Iterator<Integer> iter = output.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " , ");
        }
    }

    private static Set<Integer> findDuplicates(int[] input) throws Exception {
        Set<Integer> result = new HashSet<Integer>();
        Set<Integer> temp = new HashSet<Integer>();
        if (input == null || input.length == 0) {
            throw new Exception("input cannot be empty");
        } else {
            for (int i = 0; i < input.length; i++) {
                if (temp.contains(input[i])) {
                    result.add(input[i]); // adding duplicates to set

                } else {
                    temp.add(input[i]); // preparing set
                }
            }
        }
        return result;
    }

}
