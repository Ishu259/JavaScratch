package com.StarPattern;

import java.util.Scanner;

public class LeftTriStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        //5 - 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();

        }


    }
}
