package com.gemini.array;

import java.util.Scanner;

public class AgainPrimeNumberRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start range for prime number");
        int start = scan.nextInt();

        System.out.println("Enter end range for prime number");
        int end = scan.nextInt();

        if (start > end) {
            System.out.println("start range should be less than end range ");
        } 
        else if(start < 0 || end <0){
            System.out.println("start & end range cannot be less than zero");
        }
        else {
            if (start == 1) {
                start = start + 1;
            }
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;
                
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }

                    }
                
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    scan.close();}
}
