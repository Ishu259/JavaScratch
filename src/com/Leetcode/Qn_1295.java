package com.Leetcode;

//Qn: Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Qn_1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int n = 0;
        for (int i : nums) {
            if (noofDigits2(i)) {
                n++;
            }
        }
        return n;
    }


    //Finding number of digits
    static boolean noOfDigits(int num) {
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return false;
        }

        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }


    //Another way of finding the number of digits in a number
    static boolean noofDigits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int count = (int) Math.log10(num) + 1;  //it gives the number of digits in a number(shortcut)will discuss in number system
        return count % 2 == 0;

    }

}
