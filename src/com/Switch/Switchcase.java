package com.Switch;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {
            case "Apple" -> System.out.println("A round red fruit");
            case "Orange" -> System.out.println("A round orange fruit");
            case "Banana" -> System.out.println("Banana fruit");
            default -> System.out.println("Unknown fruit");
        }
    }
}
