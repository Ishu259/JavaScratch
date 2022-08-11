package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 4, 6, 3, 7, 3, 7, 2, 82, 4);
        fun1("Ishu", "Sedhu", "Ram", "Vimala");
        multiple(6, 8, "Ishwarya", "jeorijw");
    }

    static void fun(int... v) {  //v can accept multiple no of int..and store it as an array
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... s) {  //VarArgs always at the end
        System.out.println();
    }

    static void fun1(String... s) {  // s can accept multiple no of String values..and store it as an array
        System.out.println(Arrays.toString(s));
    }
}
