package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float real1;
        float real2;

        System.out.println("Dime un número con decimales:");
        real1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Dime otro número con decimales:");
        real2 = Float.parseFloat(scanner.nextLine());

        if (real1 > real2) {
            System.out.println(real2 + " , " + real1);
        }else {
            System.out.println(real1 + " , " + real2);
        }

    }
}
