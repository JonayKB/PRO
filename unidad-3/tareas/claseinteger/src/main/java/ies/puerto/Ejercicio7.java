package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer entrada = scanner.nextInt();

        scanner.close();

        String resultado = Integer.toBinaryString(entrada);

        System.out.println(resultado);
    }
}