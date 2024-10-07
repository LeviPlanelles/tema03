package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Del 1 al 100 hay " + contador + " números impares.");
    }
}
