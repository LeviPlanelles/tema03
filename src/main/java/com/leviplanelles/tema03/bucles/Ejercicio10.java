package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num;
        float resultado = 0;
        do {
            System.out.println("Introduce números que se añadiran a una suma hasta que pongas 0: ");
            num = Float.parseFloat(leer.nextLine());
            resultado += num;
        }while (num != 0);

        System.out.println("La suma de todos los números introducidos es: " + resultado);




    }
}
