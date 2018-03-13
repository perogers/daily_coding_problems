package com.rioverdetech.problemoftheday;

// Good morning. Here's your coding interview problem for today.
// This problem was asked by Google.
//
// The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.
//
// Hint: The basic equation of a circle is x2 + y2 = r2.


import java.util.Random;

public class Jan16th2018 {

    private static final double MAX = 1000000.0;

    public static void main(String [] args) {

        Random random = new Random();
        double in = 0;

        for(int i = 0; i < MAX; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double result = Math.sqrt((x*x) + (y*y));

            if( result < 1.0) {
                //System.out.println(result);
                in += 1.0;
            }
        }

        double pi = 4.0 * (in / MAX);

        System.out.println( String.format("In: %f  Out: %f tries %f result: %f", in, MAX - in, MAX, pi));


    }



}
