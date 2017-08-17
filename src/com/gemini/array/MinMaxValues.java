package com.gemini.array;

public class MinMaxValues {

    private static void findMinMax(int[] input) throws Exception{
        
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        if (input == null || input.length == 0){
            throw new Exception("Input cannot be null or empty");
        }
        else {
    for(int i =0; i < input.length; i++){
        if(input[i] < minValue){
            minValue = input[i];
        }
        if(input[i] > maxValue){
            maxValue = input[i];
        }
    }
        }
    System.out.println("Minimum Value : " +minValue );
    System.out.print("Maximum Value : " +maxValue);
    }
    
    public static void main(String[] args) throws Exception {
    int[] input = {-9, -9, 12,4,6,-18};
    
    findMinMax(input);
    }

}
