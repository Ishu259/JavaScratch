package com.StarPattern;

import java.util.Scanner;

public class RightTriStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        //1 to 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //5 to 1
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
