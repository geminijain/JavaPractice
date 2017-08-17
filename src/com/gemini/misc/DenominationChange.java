package com.gemini.misc;

public class DenominationChange {
    public static void main(String[] args) {
        int i = 0;
        double amount = 53.55D;

        while (amount > 20.0D) {
            amount -= 20.0D;
            i++;
        }
        System.out.println("20's - " + i);

        i = 0;
        while (amount > 10.0D) {
            amount -= 10.0D;
            i++;
        }
        System.out.println("10's - " + i);

        i = 0;
        while (amount > 1.0D) {
            amount -= 1.0D;
            i++;
        }
        System.out.println("1's - " + i);

        i = 0;
        while (amount > 0.1D) {
            amount -= 0.1D;
            i++;
        }
        System.out.println("10 cent's - " + i);

        i = 0;
        while (amount > 0.01D) {
            amount -= 0.01D;
            i++;
        }
        System.out.println("1 cent's - " + (i + 1));
    }
}
