package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int resultado = 0;
        System.out.println("Dime un número: ");
        num1 = Integer.parseInt(leer.nextLine());

        System.out.println("Dime otro número: ");
        num2 = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }

        System.out.println("El resultado de "+ num1 + " por "+ num2+ " es " + resultado);
    }
}
