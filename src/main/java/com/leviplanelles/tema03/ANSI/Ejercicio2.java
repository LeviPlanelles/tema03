package com.leviplanelles.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int h,m,s;

        do {
            System.out.println("Dime una hora: (0-24h)");
            h = Integer.parseInt(leer.nextLine());
            System.out.println("Dime los minutos : (0-60min)");
            m = Integer.parseInt(leer.nextLine());
            System.out.println("Dime los segundos: (0-60s)");
            s = Integer.parseInt(leer.nextLine());
            if (h < 0 || h > 24 || m < 0 || m > 59 || s < 0 || s > 59) {
                System.err.println("Has puesto algún número mal, vuelve a intentarlo");
            }

        }while (h < 0 || h > 24 || m < 0 || m > 59 || s < 0 || s > 59);
        leer.close();
        System.out.printf("Hora introducida: %02d:%02d:%02d",h,m,s);
    }
}
