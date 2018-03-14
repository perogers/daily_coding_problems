package com.rioverdetech.problemoftheday;

/*
Good morning. Here's your coding interview problem for today.
        This problem was asked by Microsoft.

        A number is considered perfect if its digits sum up to exactly 10.

        Given a positive integer n, return the n-th perfect number.

        For example, given 1, you should return 19. Given 2, you should return 28.

*/

public class March14th2018 {

    private static final long PERFECT = 10L;

    public static long findPerfectNumber(long n) {

        long numberToCheck = 18;
        long count = 0;
        while(count < n) {
            ++numberToCheck;
            if( calcSumOfDigits(numberToCheck) == PERFECT ) {
                count++;
            }
        }

        return numberToCheck;
    }


    static long calcSumOfDigits(long num) {

        long sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

}
