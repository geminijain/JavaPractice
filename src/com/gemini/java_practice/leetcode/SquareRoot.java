package com.gemini.java_practice.leetcode;

/*
 * Implement int sqrt(int x).
Compute and return the square root of x.
https://leetcode.com/problems/sqrtx
 */

public class SquareRoot {

    public static void main(String[] args) {
        int input = 2147395599;
        int output = mySqrt(input);
        System.out.println(output);
    }

    public static int mySqrt(int x) {
        int high = x / 2;
        int low = 0;

        if(x == 0 || x == 1 ){
            return x;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x >= (mid * mid) && x < ((mid + 1) * (mid + 1))) {
                return mid;
            } else if (x < mid * mid) {
                high = mid - 1;
            } else if (x > (mid)*(mid)) {
                low = mid + 1;
            }
}
       
        return 0;
    }
}
