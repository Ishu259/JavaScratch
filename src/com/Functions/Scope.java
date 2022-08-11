package com.Functions;

public class Scope {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        //Block Scope
        {
            //     int a = 29; //cannot re-initialized the var
            a = 29; // can change the value of the var
            int c = 50;
            System.out.println("Print c: " + c);
        }

        //    System.out.println("Print c: " + c); //cannot access the var that is initialized in the block

        //for loop scope is same as Block scope
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //Function Scope
    void sum(int a, int b) {
        int sum = a + b;  //this sum cannot access outside this function

    }


}
