package com.gemini.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifySsn {

    public static void main(String[] args) {
        String line = "123-45-6789";

        String patternStr = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pat = Pattern.compile(patternStr);

        Matcher match = pat.matcher(line);

        if (match.find()) {
            System.out.println("This is valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }

    }

}
