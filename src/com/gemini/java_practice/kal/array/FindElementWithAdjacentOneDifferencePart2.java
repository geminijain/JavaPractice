package com.gemini.java_practice.kal.array;

public class FindElementWithAdjacentOneDifferencePart2 {

    public static void main(String[] args) {
        int[] input = { 8, 7, 6, 7, 6};
        int searchElement = 6;
        int output = findElement(input, searchElement);
        System.out.println("Index of " +searchElement +" : " +output);
        
       
        }
        
        
        private static int findElement(int[] input, int key){
            int i = 0;
            int n = input.length;
            while(i < n){
                if(input[i] == key){
                    return i;
                }
                else{
                    i = i + Math.abs(input[i] - key);
            }
              
        }
            return -1;
    }

}

