package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 1: Implementa un programa que invierta una cadena de texto dada. 
 * La cadena debe de tener al menos 10 caracteres no vacíos. Puntuación 1 punto. (Con test que verifique el comportamiento 1,25)
 * @author JonayKB
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String resultado = "";
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < entrada.length(); i++) {
            resultado += entrada.charAt(entrada.length()-1-i);
        }

        System.out.println(resultado);
    }
}