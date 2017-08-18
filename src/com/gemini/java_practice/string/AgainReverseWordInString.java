package com.gemini.java_practice.string;

public class AgainReverseWordInString {

    public static void main(String[] args) {
        String input = "all is Well";
        String[] word = input.split(" ");
        String output = "";
        int size = word.length;
        for(int i =0; i < size; i++){
                        String reverseWord = reversedWord(word[i]);
                        output = output +reverseWord + " ";
        }
        System.out.println(output);
        }
    
    public static String reversedWord(String input){
        char[] chrStr = input.toCharArray();
        int end = chrStr.length -1;
        for(int i =0; i < chrStr.length/2; i++){
            char temp = chrStr[i];
            chrStr[i] = chrStr[end-i];
            chrStr[end-i] = temp;
        }
        
        String result = new String(chrStr);
  return result;  }
}
    