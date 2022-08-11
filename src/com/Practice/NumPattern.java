package com.Practice;

import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //input
        int[] ans = new int[n];

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < (n - (i - 1)); j++) {
                if (j == 0) {
                    ans[j] = n - (i - 1);
                    System.out.print(ans[j] + " ");
                } else {
                    ans[j] = ans[j - 1] + (n - j);
                    System.out.print(ans[j] + " ");
                }

            }
            System.out.println();

        }

    }
}
