package com.gemini.array;

import java.util.Arrays;

public class SecondMinMaxPart2 {

    private static void findSecondMinMax(int[] input) throws Exception {

        if (input == null || input.length == 0) {
            throw new Exception("Input cannot be null or empty");
        } else if (input.length == 1) {
            throw new Exception("Atleast two number required");
        } else {
            Arrays.sort(input);
            
System.out.println("Second minimum Number : " + input[1]);
System.out.println("Second Maximum Number : " + input[input.length - 2]);
        }

    }

    public static void main(String[] args) throws Exception {
        int[] input = {1,2,3,4,5,6,7};
        findSecondMinMax(input);

    }

}
