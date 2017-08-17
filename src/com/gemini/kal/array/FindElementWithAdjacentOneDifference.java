package com.gemini.kal.array;

public class FindElementWithAdjacentOneDifference {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] input = { 8, 7, 6, 7, 6, 5, 4, 3, 2, 4, 3 };
        int searchElement = 1;
        int i = 0;
        int n = input.length;
        while (i < n) {                            
            if (searchElement == input[i]) {                  //check condition for search element
                System.out.print("index: " + i);
                i = n;
            } else if (input[i+1] == input[i] + 1             //check condition for next element
                        || input[i+1] == input[i] - 1) {
                    i++;
                }
            else {
                System.out.print("not found");                // element not present in array
                i = n;
            }
            }
        }
    }

