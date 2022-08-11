package com.ConditionsAndLoops;

import java.util.Scanner;

public class CountofDIgits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("Count of 3: " + count);


    }
}
