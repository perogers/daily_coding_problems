package com.rioverdetech.problemoftheday;

/**
 Good morning. Here's your coding interview problem for today.
 This problem was asked by Amazon.

 Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

 For example, given the following matrix:

 [[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
 You should print out the following:

 1
 2
 3
 4
 5
 10
 15
 20
 19
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMarch8th2018 {

    @Test
    public void testSimple() {
        // Given
        int [] [] m = {{1,2}, {3,4}, {5,6}};

        // Then
        assertEquals("1\n2\n4\n6\n5\n3\n", Mar8th2018.unrollMatrix(m));

    }
}
