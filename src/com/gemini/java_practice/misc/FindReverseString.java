package com.gemini.java_practice.misc;

public class FindReverseString {

    public static void main(String[] args) {
        String input = "fdjfdklsfjs";
        if (input == null || input.isEmpty()) {
            System.out.println("Input cannot be empty or null");
        } else {
            char[] temp = input.toCharArray();

            for (int i = temp.length - 1; i >= 0; i--) {
                System.out.print(temp[i]);
            }
        }
    }
}

/* 
Test Cases : 
1) valid string
2) alphanumeric string ex: "rnn8934th4tg 849ru54940"  
3) all numbers
4) null
5) empty
6) all spaces
*/