package com.gemini.misc;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principle : ");
        double principle = scan.nextDouble();

        System.out.println("Enter Rate : ");
        double rate = scan.nextDouble();

        System.out.println("Enter Time : ");
        double time = scan.nextDouble();

        double simpleInterest = principle * rate * time / 100.0D;
        System.out.println("Simple Interest : " + simpleInterest);

        scan.close();
    }
}
