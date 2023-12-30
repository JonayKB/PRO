package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario su edad y luego muestre si es mayor de edad o no.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        String resultado=(scanner.nextInt() >= 18)? "Es mayor de edad": "No es mayor de edad";

        System.out.println(resultado);
    }
}
