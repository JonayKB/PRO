package ies.puerto;

import java.util.Scanner;

/**
 *
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena específica.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        input.close();

        System.out.println("Empieza con ¡: "+entrada.startsWith("¡"));
        System.out.println("Termina con !: "+entrada.endsWith("!"));
    }
}