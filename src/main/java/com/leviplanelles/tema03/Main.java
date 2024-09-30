package com.leviplanelles.tema03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime un número:");
        int input = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < input ; i++) {
            System.out.println(i);
        }


    }
}