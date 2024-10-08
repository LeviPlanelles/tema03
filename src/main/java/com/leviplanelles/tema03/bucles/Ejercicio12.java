package com.leviplanelles.tema03.bucles;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int intentos;

        System.out.println("****************");
        System.out.println("GUESS THE NUMBER");
        System.out.println("****************\n");

        System.out.println("Generando un numero aleatorio...\n");
        int numRandom = random.nextInt(1,101);
        System.out.print("Indica el número de intentos que vas a tener para adivinar el número: ");
        intentos = Integer.parseInt(leer.nextLine());

    }
}
