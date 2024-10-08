package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultadoFactorial = 1;

        for (int i = 4; i > 0; i--) {
            resultadoFactorial *= i;
        }
        System.out.println(resultadoFactorial);

    }
}
