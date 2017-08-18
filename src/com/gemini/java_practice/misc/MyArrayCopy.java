package com.gemini.java_practice.misc;

import java.util.Arrays;

public class MyArrayCopy {
    public static void main(String[] args) {
        int[] myArr = { 49, 50, 56, 55, 57, 53 };

        System.out.println("Size of array before copy : " + myArr.length);

        int[] newMyArr = Arrays.copyOf(myArr, 15);

        System.out.println("Size of array after copy : " + newMyArr.length);
    }
}
