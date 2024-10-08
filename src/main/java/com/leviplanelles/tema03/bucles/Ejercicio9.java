package com.leviplanelles.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,contador;
        contador = 0;

        System.out.print("Dime un número entero: ");
        num = Integer.parseInt(leer.nextLine());
        leer.close();
        //Bucle que va dividiendo num con i (iterador) para ver si su resto es cero, si lo es, suma el contador
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
        //Si el contador llega a 3 significa que se puede dividir por más números que el 1 y ese mismo número, entonces no hace falta seguir el bucle
            }else if (contador > 2) {
                break;
            }
        }
        //Si el contador es menor o igual a dos, el número es primo, sino no es primo
        String resultado = contador <= 2 ? "El número " + num + " es primo" : "El número " + num + " no es primo";
        System.out.println(resultado);
    }
}
