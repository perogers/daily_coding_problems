package com.rioverdetech.problemoftheday;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMarch14th2018 {


    @Test
    public void testOne() {
        long n = 1;

        assertEquals(19, March14th2018.findPerfectNumber(n));
    }


    @Test
    public void test2() {
        long n = 2;

        assertEquals(28, March14th2018.findPerfectNumber(n));
    }

    @Test
    public void test3() {
        long n = 3;

        assertEquals(37, March14th2018.findPerfectNumber(n));
    }

    @Test
    public void testSum1() {
        long n = 19;
        assertEquals(10, March14th2018.calcSumOfDigits(n));
    }

    @Test
    public void testSum2() {
        long n = 28;
        assertEquals(10, March14th2018.calcSumOfDigits(n));
    }

    @Test
    public void testSum3() {
        long n = 181;
        assertEquals(10, March14th2018.calcSumOfDigits(n));
    }


    @Test
    public void testSum4() {
        long n = 1819;
        assertEquals(19, March14th2018.calcSumOfDigits(n));
    }

}
