package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1,num2,resultado;
        resultado = 0;


        System.out.print("Dime un número: ");
        num1 = Integer.parseInt(leer.nextLine());

        System.out.print("Dime otro número: ");
        num2 = Integer.parseInt(leer.nextLine());
        leer.close();
        if (num1 < 0 && num2 < 0) {
            num1 = -num1;
            num2 = -num2;
            for (int i = 0; i < num2; i++) {
                resultado += num1;
            }
            System.out.println("El resultado de "+ -num1 + " por "+ -num2+ " es " + resultado);

        }else if (num1 < 0 && num2 > 0) {
            num1 = -num1;
            for (int i = 0; i < num2; i++) {
                resultado += num1;
            }
            resultado = -resultado;
            System.out.println("El resultado de "+ -num1 + " por "+ num2+ " es " + resultado);
        }else if (num1 > 0 && num2 < 0) {
            num2 = -num2;
            for (int i = 0; i < num2; i++) {
                resultado += num1;
            }
            resultado = -resultado;
            System.out.println("El resultado de "+ num1 + " por "+ -num2+ " es " + resultado);
        }else if (num1 > 0 && num2 > 0) {
            for (int i = 0; i < num2; i++) {
                resultado += num1;
            }
            System.out.println("El resultado de "+ num1 + " por "+ num2+ " es " + resultado);
        }







    }
}
