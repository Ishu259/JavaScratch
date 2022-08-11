package com.ConditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        //Q: Print numbers from 1 to 5
        /*
        For loop :
            for(initialization; condition; inc/dec){
                body
             }
         */

        for(int i = 1; i <= 5; i++){
            System.out.print(i);
        }

        //Print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
            System.out.println("Hello World!");
        }

        /*
        While loop:
        while(condition){
            body
        }
         */

        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        //do while loop:
        /*
        do{

        }while(condition);
         */

    }
}
