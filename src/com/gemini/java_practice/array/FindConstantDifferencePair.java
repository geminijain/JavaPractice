package com.gemini.java_practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindConstantDifferencePair {

    public static void main(String[] args) {
       int[] input = {-5,-3,-1,1,7,5,9,6,12,13,11};
      Arrays.sort(input);
       int diff = 2;
       for(List<Integer> i : constantDifferencePair(input, diff)){
           System.out.print(i +" , ");
       }
       

    }

    public static List<List<Integer>> constantDifferencePair(int[] a, int k ){
        List<List<Integer>> output = new ArrayList<>();
        int diff = 0;
        for(int i =0; i < a.length; i++){
            for(int j = i+1; j< a.length ; j++){
                diff = a[j] - a[i];
                if(diff == k ) {
                    List<Integer> result = new ArrayList<>();
                    result.add(a[i]);
                    result.add(a[j]);
                    output.add(result);
                }
            }
        }
    return output;}

}
