package com.gemini.java_practice.array;

import java.util.ArrayList;
import java.util.List;

public class PairToSum {

    public static void main(String[] args) {
       int[] input = {1,2,4,3,5,6,54,79,2,56,78,8};
       
       ArrayList<List<Integer>> ar = new ArrayList<>();
       int sum = 10;
       for(int i = 0; i < input.length-1; i++){
           ArrayList<Integer> pair = new ArrayList<>();
           for(int j = i+1; j < input.length; j++){
               if(input[i] + input[j] == sum){
                 pair.add(input[i]);
                 pair.add(input[j]);
                 if(ar.contains(pair)) {
                 continue;
                 
               }
                 else {
                     ar.add(pair);
                 }
               
           }
           
       }

  }

       System.out.print(ar); }
    
}
