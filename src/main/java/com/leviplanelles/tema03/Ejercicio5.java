package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la nota que has sacado en la asignatura de programación:");
        input = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case 0, 1, 2, 3, 4 -> System.out.println("INSUFICIENTE");
            case 5 -> System.out.println("SUFICIENTE");
            case 6 -> System.out.println("BIEN");
            case 7, 8 -> System.out.println("NOTABLE");
            case 9, 10 -> System.out.println("SOBRESALIENTE");
            default -> System.out.println("ERROR");
        }
    }
}
