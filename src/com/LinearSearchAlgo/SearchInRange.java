package com.LinearSearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 72, 5, 3, 7};
        int target = 5;
        System.out.println((linearSearch(arr, target, 0, 6)));

    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
//        int[] indices = new int[end - start]; //to store the target's indices
//        int size = 0;
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }


}
