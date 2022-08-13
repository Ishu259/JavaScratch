package com.Assignments.Conditions_loops;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextFloat();

        double ans = A_cirle(radius);
        System.out.println("Radius is: " + ans);


    }

    static double A_cirle(double r) {
        double area = (3.14 * (r * r));
        return area;
    }
}
