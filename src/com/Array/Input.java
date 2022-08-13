package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of Primitives
        int[] arr = new int[5];

//        //Input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        //Printing the array using for loop
//        for (int i = 4; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//
//        //using enhanced for loop
//        for (int num : arr) {   //here num represents the element of the array
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        //using builtin class
//        System.out.println(Arrays.toString(arr));


        //Array of Objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
