package com.gemini.array;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 100;
        int a =0;
        int b = 1;
        int c = a+b;
        
        System.out.print(a +"," +b);
        while(c < number ){
            
            System.out.print( "," +c );
            a = b;
            b = c;
            c = a+b;
        }
        
    }

}
