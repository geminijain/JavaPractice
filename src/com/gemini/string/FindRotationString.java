package com.gemini.string;

public class FindRotationString {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String temp = s2 + s2;

        boolean isRotation = isubstring(s1, temp);

        if (isRotation) {
            System.out.println("s2 is rotation of s1");

        } else {
            System.out.println("s2 is not rotation of s1");
        }

    }

   

}
