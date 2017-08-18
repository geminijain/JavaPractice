package com.gemini.java_practice.misc;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string 1 : ");
        String str1 = scan.next();

        System.out.println("Enter String 2 : ");
        String str2 = scan.next();
        scan.close();
        boolean name = isSubstring(str1, str2);
        if (name) {
            System.out.println("String 2 is substring of String 1");
        } else {
            System.out.println("String 2 is not substring of String 1");
        }
    }

    public static boolean isSubstring(String str1, String str2) {
        if ((str1 == null) || (str2 == null)) {
            return false;
        }

        if ((str1.isEmpty()) || (str2.isEmpty())) {
            return false;
        }

        if (str2.length() > str1.length()) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int i = 0;
        for (int j = 0; j < str1.length(); j++) {
            if (str2.charAt(i) == str1.charAt(j)) {
                i++;
            } else if (i > 0) {
                i = 0;
                j--;
            }

            if (i == str2.length()) {
                return true;
            }
        }

        return false;
    }
}
