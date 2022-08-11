package com.firstJavaProgram;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your rollno: ");
//        int rollno = input.nextInt();
//        System.out.println("Your rollno is " + rollno);

        int a = 234_000_00; //two hundred and thirty-four million..instead of comma,here we can put underscore
        System.out.println(a);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println(name);
    }
}
