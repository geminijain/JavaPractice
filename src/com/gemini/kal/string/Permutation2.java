package com.gemini.kal.string;

import java.util.Arrays;

public class Permutation2 {
    public static void main(String[] args) throws Exception {
        String input1 = "abcde";
        String input2 = "edaba";
        
        boolean output = isPermute(input1, input2);
        if(output){
            System.out.print("String are permuatation");
        } else{
            System.out.println("Strings are not permutation");
        }
        
    }
    
    public static boolean isPermute(String input1, String input2) throws Exception{
        if(input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()){
            throw new Exception("Input cannot be null or empty");
        }
        if(input1.length() != input2.length()){
            return false;
        }
        char[] chString1 = input1.toCharArray();
        char[] chString2 = input2.toCharArray();
        
        Arrays.sort(chString1);
        Arrays.sort(chString2);
        
        return(Arrays.equals(chString1, chString2));
        
        
    }
}
