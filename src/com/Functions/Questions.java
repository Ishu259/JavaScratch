package com.Functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);

        System.out.println("3 digit Armstrong numbers are: ");

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }


    //Prime or not
    static boolean isPrime(int n) {
        int c = 2;
        //  boolean ans = false;

        if (n < c) {
            return false;
        }
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    //Armstrong or not
    static boolean isArmstrong(int a) {
        int sum = 0;
        int original = a;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum += cube;
            a = a / 10;
        }

        return sum == original;
    }
}
