package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float PI = 3.1416f;
        System.out.println("Introduzca el radio");
        float radio = scanner.nextFloat();
        scanner.close();
        System.out.println("EL area es: "+radio*radio*PI+" m");
    }
}
