package com.gemini.java_practice.misc;

import java.util.Scanner;

public class StringResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = scan.next();

        System.out.println("Enter String 2 : ");
        String str2 = scan.next();
        scan.close();
        if (isSubstring(str1, str2)) {
            System.out
                    .println("The second string is substring of first string");
        } else {
            System.out
                    .println("The second string is not substing of first string ");
        }
    }

    public static boolean isSubstring(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean compare = false;

        if (str2.length() > str1.length()) {
            compare = false;
        } else {
            for (int i = 0; i < str2.length(); i++) {
                char a = str2.charAt(i);
                for (int j = 0; j < str1.length(); j++) {
                    char b = str1.charAt(j);
                    if (a == b) {
                        break;
                    }

                    for (int k = 0; k < str2.length(); i++) {
                    }
                }
            }
        }

        return compare;
    }
}
