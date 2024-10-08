package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float numReal,resultado;
        resultado = 1;
        int potencia;
        System.out.print("Dime un número: ");
        numReal = Float.parseFloat(leer.nextLine());

        System.out.print("Dime una potencia para el número anterior: ");
        potencia = Integer.parseInt(leer.nextLine());
        leer.close();
        int signo = potencia < 0 ? -1 : 1;
        potencia *= signo;
        for (int i = 1; i <= potencia; i++) {
            resultado *= numReal;
        }
        potencia *= signo;
        resultado = signo < 0 ? 1 / resultado : resultado;

        System.out.println("El número " + numReal + " elevado a " + potencia + " es igual a " + resultado);

    }
}
