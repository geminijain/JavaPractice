package com.gemini.java_practice.string;


public class AgainLongestPalindrome {

    public static void main(String[] args) throws Exception {
        String input = "aabbabbccbbabbcc";
        boolean output = isPalindrome(input);

        if (output) {
            System.out.println(input +" => Palindrome");
        } else {
            System.out.println(input +" =>  not Palindrome");
        }

        System.out.println("LongestPalindrome => " +LongestPalindrome(input));
    }
public static String LongestPalindrome(String input) throws Exception {
    String maxString = null;
    if (input == null || input.isEmpty()) {
        throw new Exception("Strings cannot be empty");
    }
    else{int end = input.length()-1;
    int size = 0;
    String temp ="/0" ;
    
    boolean isPalin = true;
        for(int i =0; i < input.length(); i++){
            for(int j =end; j >i; j--){
                if(input.charAt(i) == input.charAt(j)){
                    temp = input.substring(i, j+1);
                    isPalin = isPalindrome(temp);
                                //    System.out.println(temp);   
                }if((isPalin) && temp.length() > size){
                    size =  temp.length();
                    maxString = temp;
                }
            }
            
        }
    }
return maxString;}
    
    public static boolean isPalindrome(String input) throws Exception {
        boolean isPalindrome = true;

        if (input == null || input.isEmpty()) {
            throw new Exception("Strings cannot be empty");
        } else {
            int end = input.length() - 1;

            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(end - i)) {
                    isPalindrome = false;
                }
            }
        }
        return isPalindrome;
    }
}