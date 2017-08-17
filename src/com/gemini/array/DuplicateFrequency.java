package com.gemini.array;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateFrequency {

    public static void main(String[] args) throws Exception {
        int[] input = { 4, 3, 6, 100, 5, 2, 4, 3, 3, 4, 5 };
        HashMap<Integer, Integer> output = findDuplicateFrequency(input);
        
   for(Entry<Integer, Integer> entry : output.entrySet()){
       int key = entry.getKey();
       int value = entry.getValue();
       if(value > 1) {
           System.out.print(key +" , " + value +" , ");
       }
   }

    }

    private static HashMap<Integer, Integer> findDuplicateFrequency(
            int[] input) throws Exception {
      HashMap<Integer, Integer> result = new HashMap<>();

        if (input == null || input.length == 0) {
            throw new Exception("input cannot be null or empty");
        } else {
            for (int i = 0; i < input.length; i++)
                if (result.containsKey(input[i])) {
                    int count = result.get(input[i]);
                    result.put(input[i], count + 1);
                } else {
                    result.put(input[i], 1);

                }
        }

        return result;
    }
}
