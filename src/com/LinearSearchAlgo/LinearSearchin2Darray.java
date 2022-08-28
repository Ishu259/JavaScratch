package com.LinearSearchAlgo;

import java.util.Arrays;

public class LinearSearchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 6, 2, 6},
                {9, 53, 76},
                {25, 67, 99}
        };
        int[] ans = search2d(arr, 76);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }


    //searching in 2D array
    static int[] search2d(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    //Maximum in 2d array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
