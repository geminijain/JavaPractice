package com.gemini.java_practice.array;

/* Algorithm :
 * compare two adjacent elements and if there is no same element next to each other
 * print it
 * if odd number of elements, and no adjacent elements are equal then print last one.
 * */
public class SingleElementPart1 {

    public static void main(String[] args) throws Exception {

        int[] arr = { 1, 1, 3, 3, 4,5, 5, 7, 7, 8, 8}; //test input 
        int size = arr.length-1;
Boolean isSingle = true;
        
                for(int i =0; i < arr.length-1; i++){
        if(arr[i] == arr[i+1]){    // verify condition that adjacent are equal
            i = i+1;                // skip one and then compare
           
        }
        else{
            System.out.print(arr[i]);          // print if adjacent elements are not equal
            isSingle = false;                  // flag to save, that not equal elements
        }
        }
                if((size %2) == 0 && isSingle ) {  // no equal elements and odd number of elements
                 System.out.print(arr[arr.length -1]);    //print last element
                }
    }
}


