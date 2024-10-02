package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        System.out.println("Dime tu edad y te digo si eres menor o mayor de edad:");
        edad = Integer.parseInt(scanner.nextLine());

        if (edad > 17) {
            System.out.println("Con " + edad + " años eres mayor de edad");
        }else {
            System.out.println("Con " + edad + " años eres menor de edad");

        }
    }
}
