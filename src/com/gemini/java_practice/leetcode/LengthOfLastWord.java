package com.gemini.java_practice.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String input = "a";
        
        int result = lengthOfLastWord(input);
        
        System.out.println("Length of last word : " +result);
    }
    
    public static int lengthOfLastWord(String input){
    String[] word = input.split(" ");
    return word[word.length -1].length();
    
    }
    
    
  /*  public static int lengthOfLastWord(String input){
        if(input == null || input.length() == 0){
            return -1;
        }
        input.trim();
        int size = input.length()-1 ;
        
        for(int i = size; i >= 0; i--){
            if(input.charAt(i) == ' '){
                return size - i;
            }
        }
        return 0;
    }
    
    */
    
    

}
