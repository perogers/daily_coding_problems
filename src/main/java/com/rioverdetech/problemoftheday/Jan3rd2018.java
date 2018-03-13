package com.rioverdetech.problemoftheday;

// Good morning. Here's your coding interview problem for today.
// This problem was asked by Google.
// 
// Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue.
// This should be done in-place.
// 
// Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.
// 
// For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].
// 
// Hint: Try working backwords from the end state.
// 
// If you liked this problem, feel free to forward it along!
// If you got here from a forwarded email, you can sign up for Daily Coding Problem here.
// As always, shoot me an email if there's anything I can help with!
// 
// Lawrence

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Jan3rd2018
{

    public static void main(String[] args) {

        int [] numbers =  {1,2,3,4,5,6,7,8};

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>() ;

        System.out.println("Adding to stack");
        for(int i =0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }


        for(int n = 1; n < numbers.length; n++) {
            for (int i = 0; i < numbers.length - n; i++) {
                queue.add(stack.pop());
            }

            for (int i = 0; i < numbers.length - n; i++) {
                stack.push(queue.remove());
            }
        }

        System.out.println("Stack contents");
        for(int i =0; i < numbers.length; i++) {
            System.out.println(stack.pop());
        }
    }
}
