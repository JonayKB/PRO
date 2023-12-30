package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros y muestre su equivalente en dólares solicitando el valor cambio.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de € que quiere pasar a $");
        double euros = scanner.nextDouble();
        System.out.println("¿Cuánto vale el dolar actualmente?");
        double valorCambio = scanner.nextDouble();
        scanner.close();

        System.out.println(euros+"€ valen "+euros*valorCambio+"$");
    }
}
