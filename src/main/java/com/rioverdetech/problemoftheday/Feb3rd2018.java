package com.rioverdetech.problemoftheday;

public class Feb3rd2018 {

    /**
     * Rasing a number to a power without multiplication
     * @param n the number
     * @param p the power
     * @return the number raised to the power
     */
    public static long power(long n, long p) {
        if( p == 0) {
            return 1;
        }
        else if( p < 0) {
            // Wrong but...
            return 0;
        }
        long r = 0;
        long add = n;
        // Perform the successive addition power - 1 times
        for(long i= 0; i < p-1 ; i++) {
            r = 0;
            // Add the number to itself the number of times
            // Each successive time is the previous result of successive addition
            for (long j = 0; j < n; j++) {
                r = r + add;
            }
            add = r;
        }

        return r;
    }
}
