package com.leviplanelles.tema03.ANSI;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "";
        for (int i = 1; i <= 9; i++) {
            cadena += i;
            System.out.printf("%9s\n",cadena);
        }
    }
}
