package com.LinearSearchAlgo;

public class MinimumNum {
    public static void main(String[] args) {
        int[] arr = {18, 12, 23, 0, -4, 2};
        System.out.println(minimum(arr));
        System.out.println(max(arr));
    }

    //Minimum number
    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    //Maximum number
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
