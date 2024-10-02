package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anyo;

        System.out.println("Dime un año y te digo si es bisiesto o no:");
        anyo = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0) {
            System.out.println("El año " + anyo + " es bisiesto");
        } else {
            System.out.println("El año " + anyo + " no es bisiesto");
        }


    }
}
