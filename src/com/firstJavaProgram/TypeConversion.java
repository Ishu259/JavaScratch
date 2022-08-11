package com.firstJavaProgram;

public class TypeConversion {
    public static void main(String[] args) {
        int i = 45;
        float f = 34.34f;
        double d = 32792.345;
        short s = 3250;
        char c = 'A';
        byte b = 45;
        double res = (c * i) + (s * b) + (f + d); // int + short + double = double

        System.out.println((c * i) + " " +  (s * b) + " " + (f + d));
        System.out.println(res);
    }
}
