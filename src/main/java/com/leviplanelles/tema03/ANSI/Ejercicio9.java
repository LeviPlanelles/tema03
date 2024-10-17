package com.leviplanelles.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String ESC = "\u001B[";
        final String RESET = ESC + "0m";
        String ciudad;
        int dia,mes,anio;
        int h,m,s;
        int velocidad;
        float temperatura,presion;
        int probabilidad;
        int uva;
        boolean esBisiesto,check;
        final String TITULO;
        final String CIUDAD;
        final String FECHA;
        final String HORA;
        final String VIENTO;
        final String TEMPERATURA;
        final String PRESION;
        final String LLUVIA;
        final String UVI;

        //PEDIR CIUDAD
        System.out.print("Dime la ciudad en la que vives: ");
        ciudad = scanner.nextLine();

        //PEDIR FECHA
        do {
            System.out.print("Año: ");
            anio = Integer.parseInt(scanner.nextLine());
            check = anio >= 2024;
            if (!check) {
                System.out.println("El año tiene que ser o 2024 o mayor");
            }
        }while (!check);

        do {
            System.out.print("Mes: ");
            mes = Integer.parseInt(scanner.nextLine());
            check = mes >= 1 && mes <= 12;
            if (!check) {
                System.out.println("El día debe estar entre el Enero y Diciembre");
            }
        }while (!check);

        do {
            System.out.print("Día: ");
            dia = Integer.parseInt(scanner.nextLine());
            check = dia >= 1 && dia <= 31;
            esBisiesto = anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0;
            if (esBisiesto) {
                check = dia >= 1 && dia <= 29;
            }
            if (esBisiesto && mes == 2 && dia > 29) {
                System.out.println("Estas en el mes de febrero y el año es bisiesto, no puedes poner un día mayor a 29");
            } else if (!check && mes == 2 && dia > 28) {
                System.out.println("Estas en el mes de febrero, no puedes poner un día mayor a 28");
            } else if (!check) {
                System.out.println("El día debe estar entre el 1 y el 31");
            }
        }while (!check);

        //PEDIR HORA DE LA MEDIDA
        do {
            System.out.print("Dime la hora (0-23h): ");
            h = Integer.parseInt(scanner.nextLine());
            check = h >= 0 && h < 24;
            if (!check) {
                System.out.println("Las horas tienen que estar entre el 0 y el 23");

            }
        }while (!check);

        do {
            System.out.print("Dime los minutos (0-59min): ");
            m = Integer.parseInt(scanner.nextLine());
            check = m >= 0 && m < 60;
            if (!check) {
                System.out.println("Los minutos tienen que estar entre el 0 y el 59");
            }
        }while (!check);

        do {
            System.out.print("Dime los segundos (0-59s): ");
            s = Integer.parseInt(scanner.nextLine());
            check = s >= 0 && s < 60;
            if (!check) {
                System.out.println("Los segundos tienen que estar entre el 0 y el 59");
            }
        }while (!check);

        //PEDIR LA VELOCIDAD DEL VIENTO
        do {
            System.out.print("Indique la velocidad del viento (km/h): ");
            velocidad = Integer.parseInt(scanner.nextLine());
            check = velocidad >= 0;
            if (!check) {
                System.out.println("La velocidad no puede ser menor a 0");
            }
        }while (!check);


        //PEDIR TEMPERATURA
        System.out.print("Indique la temperatura actual (Cº): ");
        temperatura = Float.parseFloat(scanner.nextLine());

        //PEDIR PRESION ATMOSFÉRICA
        System.out.print("Indique la presión atmosfércia (hPa): ");
        presion = Float.parseFloat(scanner.nextLine());

        //PEDIR PROBABILIDAD LLUVIA
        do {
            System.out.print("Dime la probabilidad de lluvia (0-100%): ");
            probabilidad = Integer.parseInt(scanner.nextLine());
            check = probabilidad >= 0 && probabilidad <= 100;
            if (!check) {
                System.out.println("La probabilidad tiene que ser entre el 0 y el 100");
            }
        }while (!check);

        //PEDIR UVI
        do {
            System.out.print("Dime el índice de radiación ultravioleta: ");
            uva = Integer.parseInt(scanner.nextLine());
            check = uva >= 0;
            if (!check) {
                System.out.println("El UVI tiene que ser un número positivo");
            }
        }while (!check);
        //CAMBIAR COLORES SEGÚN LOS CASOS
        String colorVelocidad = "";
        if (velocidad <= 29) {
            colorVelocidad = ESC + "32m";
        } else if (velocidad > 29 && velocidad <= 60) {
            colorVelocidad = ESC + "33m";
        } else if (velocidad > 60) {
            colorVelocidad = ESC + "31m";
        }
        String colorTemperatura = "";
        if (temperatura < 22) {
            colorTemperatura = ESC + "34m";
        } else if (temperatura >= 22 && temperatura <= 27) {
            colorTemperatura = ESC + "32m";
        } else if (temperatura >= 27 && temperatura <= 35) {
            colorTemperatura = ESC + "33m";
        } else if (temperatura > 35) {
            colorTemperatura = ESC + "31m";
        }
        String colorProbabilidad = "";
        if (probabilidad < 35) {
            colorProbabilidad = ESC + "32m";
        } else if (probabilidad >= 35 && probabilidad <= 70) {
            colorProbabilidad = ESC + "33m";
        } else if (probabilidad > 70) {
            colorProbabilidad = ESC + "31m";
        }
        String colorRadiacion = "";
        if (uva <= 2) {
            colorRadiacion = ESC + "32m";
        } else if (uva >= 3 && uva <= 5) {
            colorRadiacion = ESC + "34m";
        } else if (uva >= 6 && uva <= 7) {
            colorRadiacion = ESC + "33m";
        } else if (uva >= 8 && uva <= 10) {
            colorRadiacion = ESC + "31m";
        } else if (uva > 10) {
            colorRadiacion = ESC + "35m";
        }

        //MOSTRAR SALIDA POR PANTALLA
        TITULO = "** DATOS ESTACIÓN METEREOLÓGICA **";
        CIUDAD = "Ciudad:";
        FECHA = "Fecha:";
        HORA = "Hora de la mesura:";
        VIENTO = "Velocidad del viento";
        TEMPERATURA = "Temperatura:";
        PRESION = "Presión atmosférica:";
        LLUVIA = "Probabilidad de lluvia:";
        UVI = "UVI:";
        System.out.printf(ESC+"0;30;44m"+"%34s"+RESET+"\n",TITULO);
        System.out.printf("%-24s%s\n",CIUDAD,ciudad);
        System.out.printf("%-24s%02d/%02d/%4d\n",FECHA,dia,mes,anio);
        System.out.printf("%-24s%02d:%02d:%02d\n",HORA,h,m,s);
        System.out.printf("%-24s"+ colorVelocidad +"%d"+RESET+" km/h\n",VIENTO,velocidad);
        System.out.printf("%-24s"+colorTemperatura+"%.2f"+RESET+" Cº\n",TEMPERATURA,temperatura);
        System.out.printf("%-24s%.1f hPa\n",PRESION,presion);
        System.out.printf("%-24s"+colorProbabilidad+"%d "+RESET,LLUVIA,probabilidad);
        System.out.println("%");
        System.out.printf("%-24s"+colorRadiacion+"%d"+RESET+"\n",UVI,uva);






    }
}
