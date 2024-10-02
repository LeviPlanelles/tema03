package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique un número:");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Indique otro número:");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        }else {
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        }


    }
}
