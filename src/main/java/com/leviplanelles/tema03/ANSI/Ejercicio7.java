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
        for (int i = 1; i <= 9; i++) {
            cadena += i;
            System.out.printf("%9s",cadena);
            for (int j = (cadena.length()-1); j >= 0; j--) {
                System.out.print(cadena.charAt(j));
            }
            System.out.println();
        }


    }
}
