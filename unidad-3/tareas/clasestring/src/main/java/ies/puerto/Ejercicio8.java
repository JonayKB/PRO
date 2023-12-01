package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que convierta una cadena de texto a minúsculas y otra a mayúsculas.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        input.close();


        System.out.println(entrada.toLowerCase());
        System.out.println(entrada.toUpperCase());
    }
}