package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 3: Implementa un programa que calcule y muestre la suma de los dígitos de un número entero. Puntuación 1 punto. 
 * Con test que verifique el comportamiento 1,25).
 * @author JonayKB
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer resultado = 0;
        String entrada = scanner.nextLine();

        for (int i = 0; i < entrada.length(); i++) {

            resultado += Integer.parseInt(entrada.substring(i, i+1));
        }
        System.out.println(resultado);
    }
}