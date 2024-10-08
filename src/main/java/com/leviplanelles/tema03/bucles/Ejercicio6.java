package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,resultado;
        do {
            System.out.print("Dime un número del 1 al 10 y te digo su tabla de multiplicar hasta su multiplo por 10: ");
            num = Integer.parseInt(scanner.nextLine());
        }while (num < 0 || num > 10);
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

    }
}
