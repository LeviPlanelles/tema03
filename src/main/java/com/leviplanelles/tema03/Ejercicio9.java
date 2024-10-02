package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Dime el tamaño del primer lado del triangulo:");
        lado1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Dime el tamaño del segundo lado del triangulo:");
        lado2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Dime el tamaño del tercero lado del triangulo:");
        lado3 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Los tres lados son iguales así que es un triangulo equilatero");
        } else if (lado1 == lado2 && lado1 != lado3 && lado2 != lado3 || lado1 != lado2 && lado1 != lado3 && lado2 == lado3 || lado1 == lado3 && lado1 != lado2 && lado2 != lado3) {
            System.out.println("Hay dos lados iguales y uno diferente así que es un triangulo isósceles");
        }else {
            System.out.println("No hay ningun lado igual así que es un triangulo escaleno");
        }

    }
}
