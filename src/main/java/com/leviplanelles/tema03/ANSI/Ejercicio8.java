package com.leviplanelles.tema03.ANSI;


public class Ejercicio8 {
    public static void main(String[] args) {
        final String ESC = "\u001B[";
        final String RESET = ESC + "0m";
        int color = 29;
        int bg = 40;
        int intensidad = 0;
        final int COLUMNAS = 8;
        final int FILAS = 16;

        for (int j = 1; j <= FILAS; j++) {
            color = color == 37 ? 30 : ++color;
            for (int i = 1; i <= COLUMNAS; i++) {
                System.out.printf(ESC + intensidad + ";" + color + ";" + bg + "m %d;%d;%d "+RESET,intensidad,color,bg);
                bg = bg == 47 ? 40 : ++bg;
            }
            intensidad = j >= 8 ? intensidad = 1 : intensidad;
            System.out.println();

        }


    }
}
