package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
       1 2 3
       4 5 6
       7 8 9
       */

        //declaration
        int[][] arr2D = new int[3][3];   //no need to give no.of Columns,as each row can have variable no of columns

        //how it is working -> see notes

        int[][] arr1 = {
                {3, 5, 2, 5},
                {1, 2},
                {3, 7, 3},
        };

//        System.out.println(arr1[1][1]);

        //input
        for (int row = 0; row < arr2D.length; row++) {  //iterate each row
            for (int col = 0; col < arr2D[row].length; col++) {   //iterating all columns in each row
                arr2D[row][col] = in.nextInt();
            }
        }

//        //output
//        for (int row = 0; row < arr2D.length; row++) {  //iterate each row
//            for (int col = 0; col < arr2D[row].length; col++) {   //iterating all columns in each row
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

        //output
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
        System.out.println();

        //enhanced for loop
        for (int[] arr : arr2D) {
            System.out.println(Arrays.toString(arr));
        }


    }


}
