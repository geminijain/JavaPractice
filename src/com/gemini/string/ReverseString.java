package com.gemini.string;

import java.util.Scanner;
// program to reverse a string with taking another string
public class ReverseString {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a string : ");
       String str1 = scan.nextLine();
       scan.close();
       System.out.println("Reversed string is : " +reverseString(str1));

    }
    public static String reverseString(String str){
        String revString = "";
        int end = str.length()-1;
        for(int i = end; i >=0 ; i-- ){
            revString = revString + str.charAt(i);
        }
        return revString;
        
    }

}
