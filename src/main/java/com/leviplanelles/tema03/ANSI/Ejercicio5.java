package com.leviplanelles.tema03.ANSI;

public class Ejercicio5 {
    public static void main(String[] args) {
        String cadena = "";
        int color = 29;
        for (int i = 1; i <= 9; i++) {
            cadena += i;
            if (color >= 37) {
                color = 30;
            }else {
                color++;
            }
            System.out.printf("\u001B[0;"+color+"m"+"%9s\n"+"\u001B[0m",cadena);
        }
    }
}
