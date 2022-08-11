package com.HackerRank;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.close();

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
