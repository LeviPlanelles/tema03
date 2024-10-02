package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dineroInput;

        System.out.println("Dime una cantidad de dinero y te digo la cantidad mínima de monedas para representar la cantidad de monedas indicada:");
        dineroInput = Float.parseFloat(scanner.nextLine());

        int dinero = (int)(dineroInput * 100);

        int moneda200 = dinero / 200;
        int resto = dinero % 200;

        int monedas100 = resto / 100;
        resto = resto % 100;

        int monedas50 = resto / 50;
        resto = resto % 50;

        int monedas20 = resto / 20;
        resto = resto % 20;

        int monedas10 = resto / 10;
        resto = resto % 10;

        int monedas5 = resto / 5;
        resto = resto % 5;

        int monedas2 = resto / 2;
        resto = resto % 2;

        int monedas1 = resto;
        scanner.close();
        System.out.println("Para representar " + dineroInput + " con las menores monedas posibles sería:" + moneda200 + " de 2€, " + monedas100 + "de 1€, " + monedas50 + " de 50 cenitmos, " + monedas20 + " de 20 centimos, " + monedas10 + " de 10 centimos, " + monedas5 + " de 5 centimos, " + monedas2 + " de 2 centimos y " + monedas1 + " de 1 centimo.");
        


    }
}
