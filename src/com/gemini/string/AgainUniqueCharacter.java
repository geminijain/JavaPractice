package com.gemini.string;

public class AgainUniqueCharacter {

    public static void main(String[] args) throws Exception {
        String input = " ";
        boolean output = isUnique(input);

        if (output) {
            System.out.println("This string has unique characters");
        } else {
            System.out.println("This string does not have unique characters");
        }
    }

    public static boolean isUnique(String s) throws Exception {
        boolean isUniq = true;
        if(s == null || s.length()== 0 || s.isEmpty()){
            throw new Exception ("String cannot be empty");
        }
        else{
           
            for(int i = 0; i < s.length(); i++){
                for(int j = i+1; j < s.length(); j++){
                    if(s.charAt(i)== s.charAt(j)){
                        isUniq = false;
                        break;
                    }
                }
            }
            
        }
        return isUniq;
        

}

}
