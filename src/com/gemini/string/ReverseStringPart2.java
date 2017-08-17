package com.gemini.string;

public class ReverseStringPart2 {

    public static void main(String[] args) {
        String str = "abra ka dabra";

        String result = reversedString(str);
        System.out.println(result);

    }

    public static String reversedString(String word) {
        char[] charStr = word.toCharArray();

        char temp = '\0';
        int end = charStr.length - 1;
        for (int i = 0; i <= charStr.length / 2; i++) {
            if (charStr[i] != charStr[end - i]) {
                temp = charStr[end - i];
                charStr[end - i] = charStr[i];
                charStr[i] = temp;
            }
        }
        String reversedString = "";
        for (int i = 0; i < charStr.length; i++) {
            reversedString += charStr[i];
        }
        return reversedString;

    }
}
