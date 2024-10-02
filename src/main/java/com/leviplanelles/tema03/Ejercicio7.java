package com.leviplanelles.tema03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        String socio;
        int cuotaBase = 500;
        float descuentoPersonasMayores = cuotaBase * (float)50 / 100;
        float descuentoPersonasMenores = cuotaBase * (float)25 / 100;
        float descuentoPersonasMenoresSocios = cuotaBase * (float)35 / 100;

        System.out.println("Introduce tu edad en años:");
        edad = Integer.parseInt(scanner.nextLine());

        if (edad < 18) {
            System.out.println("¿Tus padres son socios del club de golf? S/N");
            socio = scanner.next();

            if (socio.equals("S") || socio.equals("s")) {
                float precioFinalMenoresSocio = cuotaBase - descuentoPersonasMenoresSocios;
                System.out.println("La cuota para un menor de edad, siendo sus padres socios es de " + precioFinalMenoresSocio + "€");
            }else {
                float precioFinalMenores = cuotaBase - descuentoPersonasMenores;
                System.out.println("La cuota para un menor de edad es de " + precioFinalMenores + "€");
            }
        }else if (edad >= 65){
            float precioFinalMayores = cuotaBase - descuentoPersonasMayores;
            System.out.println("La cuota para un senior es de " + precioFinalMayores + "€");

        }else {
            System.out.println("La cuota para una persona adulta es " + cuotaBase + "€");

        }




    }
}
