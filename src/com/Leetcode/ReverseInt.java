package com.Leetcode;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            int num = x % 10;
            rev = (rev * 10) + num;
            x = x / 10;
        }
        return rev;
    }
}
