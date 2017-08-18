package com.gemini.java_practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifySSN {
    public static void main(String[] args) {
        // enter ssn
        String ssn = "123-55-6789";
        boolean isValidSsn = isVaidSsn(ssn);

        if (isValidSsn) {
            System.out.println("This is valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }

    //method to check valid ssn 
    private static boolean isVaidSsn(String ssn) {
        // enter pattern
        String patternStr = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pat = Pattern.compile(patternStr);
        
        //match pattern for ssn
        Matcher match = pat.matcher(ssn);

        return match.find();
    }
}
