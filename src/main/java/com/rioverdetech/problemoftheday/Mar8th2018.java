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

public class Mar8th2018 {

    private static final String NL = "\n";

    public static void main(String [] args) {
        int [] [] m = {{1,2,3}, {4,5,6}, {7,8,9}};
        unrollMatrix(m);
    }

    public static String unrollMatrix (int [][] matrix) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < matrix.length; i++) {
            // Walk through cols 0..n on 0 row // L -> H
            for (int c = 0; c < matrix[0].length; c++) {
                sb.append(matrix[0][c]);
                sb.append(NL);
            }
            sb.append("-" + NL);
            // Walk through rows 1..n on nth col // L -> H
            for (int r = 1; r < matrix.length; r++) {
                sb.append(matrix[r][matrix[0].length - 1]);
                sb.append(NL);
            }
            sb.append("-" + NL);
            // Walk through cols n-1..0 on the nth row // H -> L
            for (int c = matrix[0].length - 2; c >= 0; c--) {
                sb.append(matrix[matrix[0].length - 1][c]);
                sb.append(NL);
            }
            sb.append("-" + NL);
            // Walk through rows n..0+1 on 0 col // H -> L
            for (int r = matrix.length - 2; r >= 1; r--) {
                sb.append(matrix[r][0]);
                sb.append(NL);
            }
            sb.append("-" + NL);
        }

        System.out.print(sb.toString());
        return "";
    }

}
