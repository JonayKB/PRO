package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que invierta una cadena de texto dada.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        input.close();
        String resultado = "";

        for (int i = entrada.length()-1; i >= 0; i--) {
            resultado += entrada.charAt(i);
        }

        System.out.println(resultado);
    }
}