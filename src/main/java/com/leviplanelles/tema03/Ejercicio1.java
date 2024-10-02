package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número y te digo si es par o impar:");

        int input = Integer.parseInt(scanner.nextLine());
        if (input % 2 == 0) {
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");

        }
        scanner.close();
    }
}
