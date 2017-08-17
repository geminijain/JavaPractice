package com.gemini.string;

public class Palindrom {

    public static void main(String[] args) throws Exception {
        String input1 = "MALAYALAM";
        String input2 = "MALAYLAAM";

        boolean result = isPalindrome(input1, input2);

        if (result) {
            System.out.println("Strings are palindrome");
        } else {
            System.out.println("String are not palindrome");
        }
    }

    public static boolean isPalindrome(String input1, String input2)
            throws Exception {
        boolean isPalindrome = true;
        if (input1.isEmpty() || input2.isEmpty()) {
            throw new Exception("Strings can not be empty");
        } else if (input1.length() != input2.length()) {
            isPalindrome = false;
        } else {
            char[] chrStr1 = input1.toCharArray();
            char[] chrStr2 = input2.toCharArray();
            int end = input1.length() - 1;
            for (int i = 0; i < input1.length(); i++) {

                if (chrStr1[i] != chrStr2[end - i]) {
                    isPalindrome = false;
                    break;

                }
            }
        }

        return isPalindrome;
    }

}
