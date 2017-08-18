package com.gemini.java_practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//program to verify email address
public class VerifyEmail {

    public static void main(String[] args) {
        String email = "agygjh@gmail.com";
        boolean isValidEmail = isValidEmail(email);

        if (isValidEmail) {
            System.out.println("This is valid Email");
        } else {
            System.out.println("This is invlaid Email");
        }
    }

    public static boolean isValidEmail(String email) {

        String patternStr = "^[a-z0-9_\\-\\.]+@[a-z]+\\.[a-z]+$";
        Pattern pat = Pattern.compile(patternStr);

        // match for pattern string
        Matcher match = pat.matcher(email);

        return match.find();

    }
}
