package com.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', '0'};
        reverseString(s);
    }

    static void reverseString(char[] s) {
        int a = 0, b = s.length - 1;
        while (a <= b) {
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
        System.out.println();

    }

}
