package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        float num, media;
        float suma = 0;


        do {
            System.out.print("Introduce números con los que se harán una media hasta que ingreses un número negativo: ");
            num = Float.parseFloat(leer.nextLine());
            if (num >= 0) {
                contador++;
                suma += num;
            }

        }while (num >= 0);
        media = suma / contador;
        System.out.println("La media de la suma de todos los números ingresados es: " + media);
    }
}
