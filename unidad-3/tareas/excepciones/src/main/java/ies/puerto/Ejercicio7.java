package ies.puerto;

import java.util.Scanner;

/**
 * 
 * Crea un método que acepte un número y maneja la excepción IllegalArgumentException si el número es negativo.
 */
public class Ejercicio7 {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        if (input.nextInt()<0) {
            throw new IllegalArgumentException("El numero es negativo");
        }
    }
}
