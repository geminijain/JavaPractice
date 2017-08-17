package com.gemini.array;

public class ReveredNumber {

    public static void main(String[] args) {
       int number = 1234;
       String reversedDigit = "";
       int remainder = 0;
       while (number != 0) {
           remainder = number %10;
           number = number/10;
           reversedDigit = reversedDigit + remainder;
       }
       System.out.println(reversedDigit);

    }

}
