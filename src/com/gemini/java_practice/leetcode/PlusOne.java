package com.gemini.java_practice.leetcode;

public class PlusOne {

    public static void main(String[] args) {
      int[] input = {9,9,9};
      
      int[] result = findPlusOne(input);
      
      for(int i =0; i < result.length; i++){
          System.out.print(result[i]);
      }
    }
    public static int[] findPlusOne(int[] input){
        
        if(input == null || input.length == 0){
            return null;
            
        }
        
        int size = input.length;
        for(int i = size -1; i >= 0; i--){
            if(input[i] < 9){
                input[i] ++;
                return input;
            }
            input[i] = 0;
        }
        
        int[] newNumber = new int[size+1];
        newNumber[0] = 1;
        return newNumber;
      
     }

}
