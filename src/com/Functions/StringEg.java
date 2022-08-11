package com.Functions;

import java.util.Scanner;

public class StringEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String greet = Greet(name);
        System.out.println(greet);
    }

    static String Greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
