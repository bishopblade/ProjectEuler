/*
Problem 1 - Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

Solved - 233168
(Ver. 1: <1ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem001 {
    private static int multiplesThreeFive() {
        final int MAX_MULTIPLE = 1000;

        int sum = 0;

        for (int i = 0; i < MAX_MULTIPLE; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem001::multiplesThreeFive);
    }
}
