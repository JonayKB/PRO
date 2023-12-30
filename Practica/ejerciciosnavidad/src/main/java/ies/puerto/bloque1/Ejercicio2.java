package ies.puerto.bloque1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        scanner.close();
        System.out.println("¡Hola, "+nombre+"!");
    }
}