package com.gemini.java_practice.kal.string;

public class Permutation1 {

    public static void main(String[] args) throws Exception {
        String input1 = "abcde";
        String input2 = "edcbe";
        
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
        
        StringBuilder sb = new StringBuilder(input2);
        
        for(int i = 0; i < input1.length(); i++){
            for(int j = 0; j < sb.length(); j++){
                if(input1.charAt(i) == sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }
        return ((sb.length() ==0));
        
    }

}
