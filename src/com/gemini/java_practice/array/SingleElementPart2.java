package com.gemini.java_practice.array;

/* Algorithm :
 * compare element to adjacent element, and if matches, then skip to next element
 * and continue;
 * if elements not equals to adjacent element, then print the current element 
 */

public class SingleElementPart2 {
      
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 1, 3, 3, 4,5, 5, 7, 7, 8, 8}; //test input 
        int size = arr.length -1;
        int i = 0;
        if(size % 2 == 0){
            System.out.print("No single element");
        }
        else{
        while(i != size){
            if(arr[i] == arr[i+1]){
                i = i+2;
            }
            else{
                System.out.print(arr[i]);
            }
        }
        }
        
    }

}
