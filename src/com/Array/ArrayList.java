package com.Array;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();


        //adding elements
        list.add(34);
        list.add(5);
        list.add(9);
        list.add(23);
        list.add(29);

        System.out.println(list);

        System.out.println(list.contains(23));  //it checks whether the element is in the list -> here gives true

        //to modify
        list.set(1, 6);

        //to remove
        list.remove(2);
        System.out.println(list);

        //to get the element
        System.out.println(list.get(0));


    }
}
