package com.leviplanelles.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String confirmacion,respuesta;
        int porras = 0;
        int porrasOrdenador = 0;
        int tirada,tiradaOrdenador;
        int puntuacion = 0;
        int puntuacionOrdenador = 0;
        System.out.println("**************");
        System.out.println("JUEGO DEL DADO");
        System.out.println("**************");

        while (porras < 5 || porrasOrdenador < 5) {
            do {
                System.out.println("¿Estas listo? (s/n)");
                respuesta = scanner.nextLine();

            }while (respuesta.equals("n"));

            while (puntuacion <= 11) {
                System.out.println("Lanzando dados...");
                tirada = random.nextInt(1,7);
                System.out.println("Has sacado un: " + tirada);
                puntuacion += tirada;
                System.out.println("Tu puntuación es de: " + puntuacion);
                System.out.println("¿Quieres volver a tirar? (s/n)");
                confirmacion = scanner.nextLine();
                if (confirmacion.equals("n")) {
                    break;
                }

            }
            if (puntuacion == 11) {
                porras += 2;
                System.out.println("Has conseguido la puntuación exacta para ganar, ganas dos porras");
                System.out.println("Actualmente tienes: " + porras + "porras");
                continue;
            } else if (puntuacion > 12) {
                porrasOrdenador++;
                System.out.println("Ohh, te has pasado, el ordenador gana 1 porra");
                System.out.println("El ordenador tiene " + porrasOrdenador + "porras");
                continue;
            }else {
                System.out.println("Has obtenido una puntuación de " + puntuacion + "por lo que no te has pasado.");
            }
            System.out.println("TURNO DEL ORDENADOR");

            while (puntuacionOrdenador <= 11) {
                System.out.println("Lanzando dados...");
                tiradaOrdenador = random.nextInt(1,7);
                System.out.println("El ordenador ha sacado un: " + tiradaOrdenador);
                puntuacionOrdenador += tiradaOrdenador;
                System.out.println("Su puntuación es de: " + puntuacionOrdenador);
            }
            System.out.println("Las tiradas del ordenador suman " + puntuacionOrdenador);
            if (puntuacionOrdenador >= puntuacion) {
                porrasOrdenador++;
                System.out.println("La puntuación del ordenador es " + puntuacionOrdenador + ", es mayor que tú puntuación: " + puntuacion);
                System.out.println("El ordenador gana una porra");
            }else {
                porras++;
                System.out.println("Tu puntuación: " + puntuacion + " es mayor que la del ordenador: " + puntuacionOrdenador);
            }
        }
        String ganador = porrasOrdenador > 4 ? "Ha ganado el ordenador" : "Ha ganado el jugador";
        System.out.println(ganador);


    }
}
