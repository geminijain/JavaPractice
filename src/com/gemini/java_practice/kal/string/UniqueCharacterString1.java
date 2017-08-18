package com.gemini.java_practice.kal.string;

public class UniqueCharacterString1 {

    public static void main(String[] args) throws Exception {
        String input = "abcdeff";

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
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
   return true; }

}
