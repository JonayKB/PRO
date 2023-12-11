package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que verifique si una cadena de texto puede convertirse en un número entero utilizando métodos de la clase Integer.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        try {
          Integer textoInteger = Integer.parseInt(entrada);  
          System.out.println(textoInteger);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("No funciono bien el parse");
        }finally{
            scanner.close();
        }
        
    }
}