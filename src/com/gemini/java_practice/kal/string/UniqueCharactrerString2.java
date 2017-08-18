package com.gemini.java_practice.kal.string;

import java.util.Arrays;

public class UniqueCharactrerString2 {

    public static void main(String[] args) throws Exception  {
        String input = "abcdef";

        boolean output = isUnique(input);

        if(output){
            System.out.println("String has Unique Characters");
        }else{
            System.out.println("String has no Unique Characters");
        }
        
    }
    
    public static boolean isUnique(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new Exception("Input cannot be Empty");
        }
       char[] chString = input.toCharArray();
       Arrays.sort(chString);
       for(int i = 0; i < chString.length - 1; i++ ){
           if(chString[i] == chString[i+1]){
               return false;
           }
       }
      
     return true;   
    }

}
