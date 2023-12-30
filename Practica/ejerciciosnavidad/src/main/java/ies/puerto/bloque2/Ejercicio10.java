package ies.puerto.bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome el precio de un producto ingresado por el usuario y muestre el precio final con el 7% de IGIC incluido .
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double IGIC = 0.07;
        System.out.println("Introduzca el precio sin el IGIC");
        double precio = scanner.nextDouble();
        System.out.println("El precio con IGIC es: "+(precio+precio*IGIC));
    }
}
