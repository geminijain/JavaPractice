package com.gemini.java_practice.leetcode;

public class MaxSumSubarray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] input = {-2,1,-3,4,-1,2,1,-5,4} ;
        int result = maxSumSubarray(input);
        System.out.println("Maximum sum : " +result);

    }
    
    public static int maxSumSubarray(int[] input){
        
        if(input == null || input.length == 0){
            return -1;
        }
        int max_sum_sofar = input[0];
        int max_ending_here = 0;
        
        for(int i = 0; i < input.length; i ++){
            max_ending_here = max_ending_here + input[i];
        
            if(max_sum_sofar < max_ending_here){
                max_sum_sofar = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
           }
      return max_sum_sofar;  
    }

}
