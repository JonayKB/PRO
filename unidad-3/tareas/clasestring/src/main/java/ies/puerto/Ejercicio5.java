package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduca palabra");
        String entrada = input.nextLine();

        System.out.println("Introduzca la letra a cambiar");
        String aCambiar = input.nextLine();

        System.out.println("Valor nuevo");
        String nuevo = input.nextLine();
        
        input.close();

        entrada = entrada.replaceAll(aCambiar, nuevo);

        System.out.println(entrada);
    }
}