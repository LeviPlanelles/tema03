package com.leviplanelles.tema03.bucles;


import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int intentos, guess;
        int numRandom = random.nextInt(1,101);
        //System.out.println(numRandom);

        System.out.println("****************");
        System.out.println("GUESS THE NUMBER");
        System.out.println("****************\n");

        System.out.println("Generando un numero aleatorio del 1 al 100...\n");
        do {
            System.out.print("Indica el número de intentos que vas a tener para adivinar el número: ");
            intentos = Integer.parseInt(leer.nextLine());
            boolean error = intentos < 1;
            String mensaje = error ? "Vuelve a intentarlo" : "Adelante!\n";
            System.out.println(mensaje);
        }while (intentos < 1);


        for (int i = 1; i <= intentos;) {
            do {
                System.out.println("Adivina el numerito mágico: ");
                guess = Integer.parseInt(leer.nextLine());
                if (guess < 0)
                    System.err.println("El numero tiene que ser POSITIVO, intentalo otra vez");
            }while (guess < 0);
            if (guess != numRandom) {
                System.out.println("TE QUEDAN " + intentos + " INTENTOS.");
                intentos--;
                System.err.println("Número incorrecto, intentalo otra vez\n");
                if (guess < numRandom) {
                    System.out.println("TIP: El número mágico es más grande que " + guess + "\n");
                }else {
                    System.out.println("TIP: El número mágico es mas pequeño que " + guess + "\n");
                }
            }else {
                System.out.println("¡¡FELICIDADES HAS ACERTADO EL NÚMERO!!");
                System.out.println("**************************************");
                break;
            }


        }
        if (intentos == 0) {
            System.out.println("Se te han acabado los intentos, has perdido!");
            System.out.println("El numerito mágico era: " + numRandom);

        }



    }
}
