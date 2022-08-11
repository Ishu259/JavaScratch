package com.Functions;

public class Shadowing {
    static int a = 10; //this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(a);  //10
//        int a = 20; //the class var at line 4 is shadowing by this
//        System.out.println(a);  //20

        int a;  //declaration
        //  System.out.println(a);  //Scope always begins at initialization

        a = 20;
        fun();
    }

    static void fun() {
        System.out.println(a);  //10
    }
}
