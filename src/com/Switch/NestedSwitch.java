package com.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rollno = in.nextInt();
        String dept = in.next();

        switch (rollno) {
            case 1 -> System.out.println("Ishwarya");
            case 2 -> System.out.println("Ram");
            case 3 -> {
                System.out.println("Vimala");
                switch (dept) {
                    case "Physics" -> System.out.println("Physics dept");
                    case "Maths" -> System.out.println("Maths dept");
                    default -> System.out.println("Enter valid dept ");
                }
            }
            default -> System.out.println("Enter valid rollno");
        }


    }
}
