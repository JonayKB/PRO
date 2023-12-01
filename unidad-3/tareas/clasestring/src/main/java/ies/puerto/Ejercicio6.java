package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        input.close();

        String[] palabras = entrada.split(" ");

        for (String string : palabras) {
            System.out.println(string);
        }
    }
}