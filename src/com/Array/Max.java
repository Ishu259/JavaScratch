package com.Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 34, 6, 3};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 4));
    }


    //Maximum value of an array
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //Maximum value of an array in an range
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {    //work on edge cases
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


}
