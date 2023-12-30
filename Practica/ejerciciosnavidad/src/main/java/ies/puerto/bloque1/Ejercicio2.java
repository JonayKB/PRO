package ies.puerto.bloque1;

import java.util.Scanner;
/**
 * ea un programa que solicite al usuario su nombre y luego muestre 
 * "¡Hola, [nombre]!", donde [nombre] es el nombre proporcionado por el usuario.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        scanner.close();
        System.out.println("¡Hola, "+nombre+"!");
    }
}