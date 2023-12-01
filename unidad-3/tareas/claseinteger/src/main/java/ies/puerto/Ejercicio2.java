package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que convierta un número entero en una cadena de texto y viceversa utilizando los métodos de la clase Integer.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            Integer entrada = scanner.nextInt();
            String resultado = entrada.toString();
            System.out.println(resultado);
        } catch (InputMismatchException e) {
            String entrada = scanner.nextLine();
            Integer resultado = Integer.parseInt(entrada);
            System.out.println(resultado);
        }finally{
            scanner.close();
        }

        

    }
}