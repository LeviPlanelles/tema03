package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los números del 1 al 100 es: " + suma);
    }
}
