package com.leviplanelles.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int total;
        float porcentaje1,porcentaje2,porcentaje3,porcentaje4,porcentaje5,porcentaje6;

        for (int i = 1; i <= 1_000_000; i++) {
            int dado = random.nextInt(1,7);
            switch (dado){
                case 1 -> contador1++;
                case 2 -> contador2++;
                case 3 -> contador3++;
                case 4 -> contador4++;
                case 5 -> contador5++;
                case 6 -> contador6++;
            }

        }
        total = contador1 + contador2 + contador3 + contador4 + contador5 + contador6;
        porcentaje1 = (total) * (float)contador1 / 100;
        porcentaje2 = (total) * (float)contador2 / 100;
        porcentaje3 = (total) * (float)contador3 / 100;
        porcentaje4 = (total) * (float)contador4 / 100;
        porcentaje5 = (total) * (float)contador5 / 100;
        porcentaje6 = (total) * (float)contador6 / 100;

        System.out.println("El número 1 ha aparecido " + contador1 + " veces y con una probabilidad del " + porcentaje1 + "%");
        System.out.println("El número 2 ha aparecido " + contador2 + " veces y con una probabilidad del " + porcentaje2 + "%");
        System.out.println("El número 3 ha aparecido " + contador3 + " veces y con una probabilidad del " + porcentaje3 + "%");
        System.out.println("El número 4 ha aparecido " + contador4 + " veces y con una probabilidad del " + porcentaje4 + "%");
        System.out.println("El número 5 ha aparecido " + contador5 + " veces y con una probabilidad del " + porcentaje5 + "%");
        System.out.println("El número 6 ha aparecido " + contador6 + " veces y con una probabilidad del " + porcentaje6 + "%");
    }
}
