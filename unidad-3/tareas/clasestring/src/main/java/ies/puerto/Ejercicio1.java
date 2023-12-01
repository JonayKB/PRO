package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena de texto e imprima su longitud.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada= input.nextLine();
        input.close();
        System.out.println(entrada.length());
    }
}