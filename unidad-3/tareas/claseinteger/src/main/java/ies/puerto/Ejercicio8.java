package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que calcule el factorial de un número entero utilizando métodos de la clase Integer.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        scanner.close();
        int resultado=1;

        Integer integer = Integer.parseInt(entrada);

        for (int i = integer; i > 0; i--) {
            resultado *= i;
        }

        System.out.println(resultado);

    }
}
