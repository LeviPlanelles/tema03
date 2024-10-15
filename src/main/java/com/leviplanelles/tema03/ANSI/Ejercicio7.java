package com.leviplanelles.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*String cadena = "";
        String cadena1 = "";
        for (int i = 1; i <= 9; i++) {
            cadena += i;
            cadena1 = i + cadena1;
            System.out.printf("%9s%-9s\n",cadena,cadena1);

        }*/
        String cadena = "";
        String cadena1 = "";
        for (int i = 1; i <= 9; i++) {
            cadena += i;
            System.out.printf("%9s\n",cadena);
            for (int j = 0; j <= 1; j++) {
                cadena1 = j + cadena1;
            }

        }

    }
}
