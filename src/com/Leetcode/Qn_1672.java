package com.Leetcode;

//Qn:Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/submissions/

public class Qn_1672 {
    public static void main(String[] args) {
        int[][] acc = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(maximumWealth(acc));
    }

    static int maximumWealth(int[][] accounts) {
        int rich = Integer.MIN_VALUE;
        int sum = 0;
        for (int[] row : accounts) {
            for (int wealth : row) {
                sum += wealth;
                if (sum > rich) {
                    rich = sum;
                }
            }
            sum = 0;
        }
        return rich;
    }
}
