package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que elimine los espacios en blanco al principio y al final de una cadena de texto.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        input.close();

        entrada = entrada.trim();

        System.out.println(entrada);
    }
}