package com.ConditionsAndLoops;

public class Condition {
    public static void main(String[] args) {
         /*
             Syntax of if statement

             if(condition T or F){
                do this
             }
             else{
                do this
              }
          */

        int salary = 24392;
        if(salary > 10000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
