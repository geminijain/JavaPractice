package com.gemini.string;

import java.util.Scanner;

public class CompressString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to compress : ");
        String sentence = scan.nextLine();
        scan.close();
        System.out.println(compressedString(sentence));
    }
    
    public static String compressedString(String word) {
        word = word.toLowerCase();

        return word;
    }

}
