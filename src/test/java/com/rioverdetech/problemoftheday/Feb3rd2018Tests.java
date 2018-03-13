package com.rioverdetech.problemoftheday;

//Good morning. Here's your coding interview problem for today.
//        This problem was asked by Google.
//
//        Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
//
//        Do this faster than the naive method of repeated multiplication.
//
//        For example, pow(2, 10) should return 1024.

import org.junit.Test;
import static org.junit.Assert.*;


public class Feb3rd2018Tests {

    @Test
    public void testPower1() {
        // Given
        long x = 2;
        long p = 10;

        // When
        assertEquals(1024, Feb3rd2018.power(x, p));
    }

    @Test
    public void testPower2() {
        // Given
        long x = 4;
        long p = 3;

        // When
        assertEquals(64, Feb3rd2018.power(x, p));
    }


    @Test
    public void testPower3() {
        // Given
        long x = 5;
        long p = 6;

        // When
        assertEquals(15625, Feb3rd2018.power(x, p));

    }

    @Test
    public void testPower4() {
        // Given
        long x = 5;
        long p = 0;

        // When
        assertEquals(1, Feb3rd2018.power(x, p));
    }


}
