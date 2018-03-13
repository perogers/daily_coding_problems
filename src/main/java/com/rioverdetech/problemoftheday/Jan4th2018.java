package com.rioverdetech.problemoftheday;

// Good morning. Here's your coding interview problem for today.
// This problem was asked by Uber.
// 
// Given an array of integers, return a new array such that each element at index i of the new array is the product of all
//         the numbers in the original array except the one at i. Solve it without using division and in O(n) time.
// 
// For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
//         If our input was [3, 2, 1], the expected output would be [2, 3, 6].


import java.util.Arrays;

public class Jan4th2018 {

    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        int [] products = {1,2,3};

        Arrays.setAll(products, index ->1);

        int size = numbers.length;
        int p = 1;
        for(int i = 0, j = size -1; i < size && j >= 0; i++, j--) {
            products[i] *= numbers[j];

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("%d == %d => %d", i , numbers[i], products[i]));
        }
    }
}
