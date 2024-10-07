package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int sumaPar = 0;
        int sumaImpar = 0;
        int contador = 0;
        int sumaMultiplos = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " Es par.");
                sumaPar += i;
                if (i % 5 == 0) {
                    contador++;
                    sumaMultiplos += i;

                }
            } else {
                System.out.println("El número " + i + " Es impar.");
                sumaImpar += i;
                if (i % 5 == 0) {
                    contador++;
                    sumaMultiplos += i;

                }
            }

        }
        System.out.println("La suma de todos los pares es " + sumaPar);
        System.out.println("La suma de todos los impares es " + sumaImpar);
        System.out.println("En los números del 1 al 100 hay " + contador + " multiplos de 5 y todos ellos juntos suman " + sumaMultiplos);

    }
}
