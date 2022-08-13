package com.LinearSearchAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 63, 36, 64, 23};
        int target = 21;
        System.out.println(linearSearch2(arr, target));

    }

    static boolean search(int[] arr) {
        for (int j : arr) {
            if (j == 34) {
                return true;
            }
        }
        return false;
    }

    //search in an array: return the index if found
    //return -1 if not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //linear searching and returning the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int j : arr) {
            if (j == target) {
                return j;
            }
        }
        return Integer.MAX_VALUE;
    }

}
