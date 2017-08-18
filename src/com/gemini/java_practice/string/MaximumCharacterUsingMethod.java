package com.gemini.java_practice.string;

//program to display a character occured maximum times & if two or more characters are
// ocurring same number of times then display 1st character in string. 
import java.util.Scanner;

public class MaximumCharacterUsingMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // to take a string from user
        System.out.print("Enter a string : ");
        String sentence = scan.nextLine();
        scan.close();

        // to get maximum frequency first letter from method
        char maxLetter = maxFrequencyFirstCharacter(sentence);
        System.out.println("Maximum Frequency first character is : "
                + maxLetter);
    }

    // method to return maximum frequency first character
    public static char maxFrequencyFirstCharacter(String sentence) {
        // to trim extra space
        sentence = sentence.trim();

        // to convert in lowercase
        String sentence1 = sentence.toLowerCase();

        int size = sentence.length();

        // initiate a counter to get first previousCount value
        int previousCount = 0;
        char maxLetter = '\0';
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = i + 1; j < size; j++) {
                if (sentence1.charAt(i) == sentence1.charAt(j)) {
                    count++;
                }
            }

            // to get character with maximum frequency
            if (count > previousCount) {
                previousCount = count;
                maxLetter = sentence.charAt(i);
            }
        }
        return maxLetter;
    }

}
