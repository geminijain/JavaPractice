package com.gemini.java_practice.leetcode;

public class RomanToNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
String input = "MCMXCVI";
RomanToNumber obj = new RomanToNumber(); 
System.out.println("number : " + obj.romanToDecimal(input));

    }

    int value(char r){
        if(r == 'I')
            return 1;
        if(r == 'V')
            return 5;
        if(r == 'X')
            return 10;
        if(r == 'C')
            return 100;
        if(r == 'L')
            return 50;
        if(r == 'D')
            return 500;
        if(r == 'M')
            return 1000;
        return -1;
    }
    
    int romanToDecimal(String input){
        int result = 0;
        for(int i =0; i < input.length(); i++){
            int s1 = value(input.charAt(i));
            
            if(i+1 < input.length()){
                int s2 = value(input.charAt(i+1));
                if(s1 >= s2 ){
                    result = result + s1;
                }
                else{
                    result = result + s2 - s1;
                    i++;
                }
                
            }
            else {
                result = result + s1;
                i++;
            }
        }
        return result;
    }
    
}
