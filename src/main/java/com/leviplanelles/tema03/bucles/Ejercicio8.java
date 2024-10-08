package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int resultadoFactorial = 1;
        do {
            System.out.print("Dime un numero y te hago su factorial: ");
            num = Integer.parseInt(leer.nextLine());
        }while (num == 0);

        leer.close();

        for (int i = num; i > 0; i--) {
            resultadoFactorial *= i;
        }
        System.out.println(num + "! es igual a " + resultadoFactorial);

    }
}
