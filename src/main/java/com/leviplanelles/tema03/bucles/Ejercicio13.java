package com.leviplanelles.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        int contadorCara = 0;
        int contadorCruz = 0;
        float porcentajeCara,porcentajeCruz;

        for (int i = 1; i <= 1_000_000; i++) {
            int caraCruz = random.nextInt(0,2);
            if (caraCruz == 0){
                contadorCara++;
            }else {
                contadorCruz++;
            }
        }
        porcentajeCara = (contadorCara + contadorCruz) * (float)contadorCara / 100;
        porcentajeCruz = (contadorCara + contadorCruz) * (float)contadorCruz / 100;

        System.out.println("El número de caras son: " + contadorCara + " y el número de cruces son: " + contadorCruz);
        System.out.println(porcentajeCara + " % de caras vs " + porcentajeCruz + "% de cruces.");



    }
}
