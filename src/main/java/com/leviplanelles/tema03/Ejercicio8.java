package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dado;
        int caraOpuesta = -1;
        //String texto = "La cara opuesta del resultado de tu dado es el ";
        System.out.println("Has tirado un dado, que número has sacado? (1-6)");
        dado = Integer.parseInt(scanner.nextLine());

        if (dado > 0 && dado < 7) {
            caraOpuesta = switch (dado) {
                case 1 -> 6;
                case 2 -> 5;
                case 3 -> 4;
                case 4 -> 4;
                case 5 -> 2;
                case 6 -> 1;
                default -> 0;
                /*
                case 1 -> System.out.println(texto + "6");
                case 2 -> System.out.println(texto + "5");
                case 3 -> System.out.println(texto + "4");
                case 4 -> System.out.println(texto + "3");
                case 5 -> System.out.println(texto + "2");
                case 6 -> System.out.println(texto + "1");

                 */

            };
            System.out.println("La cara opuesta de tu dado es el " + caraOpuesta);
        }else {
            System.err.println("ERROR");
        }

    }
}
