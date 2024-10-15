package com.leviplanelles.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;
        System.out.print("Ponme un número real: ");
        num = Float.parseFloat(scanner.nextLine());

        System.out.printf("El numero introducido es %.2f",num);
    }
}
