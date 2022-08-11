package com.ConditionsAndLoops;

import java.util.Scanner;


//Q: To find the nth fibonacci number
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;  //as we already have first two nums in the series
        int sum = 1;

        while (count < n) {
            int temp = i;
            i = i + p;
            sum += i;
            p = temp;
            count++;
        }

        System.out.println(i);
        System.out.println("Sum of fibo is: " + sum);
    }
}
