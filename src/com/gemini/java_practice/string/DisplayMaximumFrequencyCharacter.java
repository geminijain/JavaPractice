package com.gemini.java_practice.string;

// program to display maximum frequency character or first highest repetitive character
import java.util.Scanner;

public class DisplayMaximumFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); // initialize scanner class

        System.out.println("Enter a string : "); // ask user to enter a string
        String sentence = scan.nextLine(); // scan entered string
        scan.close(); // close scanner

        char maxFrequencyCharacter = maxCharacter(sentence); // get max
                                                             // Character from
                                                             // method
        System.out // print the output
                .println("Maximum Frequency Character or first highest repeatative character is : "
                        + maxFrequencyCharacter);
    }

    public static char maxCharacter(String word) throws Exception {
        if (word.isEmpty()) { // if word is empty throw exception
            throw new Exception("String can not be empty or null");
        }
        word = word.trim(); // trim extra spaces from string
        String changeWord = word.toLowerCase(); // convert to lowercase to
                                                // compare words
        int len = changeWord.length();

        int maxCount = 0;
        char maxCharacter = word.charAt(0); //

        for (int i = 0; i < len; i++) { // pointer to pick a character
            int count = 1;
            for (int j = i + 1; j < len; j++) { // pointer to compare other
                                                // character
                if (changeWord.charAt(i) == changeWord.charAt(j)) {
                    count++;
                }
                if (count > maxCount) { // if count in maximum then replace the
                                        // maximum count value and set the
                                        // character value
                    maxCount = count;
                    maxCharacter = word.charAt(i);
                }
            }
        }
        return maxCharacter;
    }
}
