package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que determine si un número entero es positivo, negativo o cero utilizando métodos de la clase Integer.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        scanner.close();
        int compare =Integer.compare(Integer.parseInt(entrada), 0);
        switch (compare) {
            case 1:
                System.out.println("Es positivo");
                break;
            case -1:
                System.out.println("Es negativo");
            break;
        
            default:
                System.out.println("Es cero");
                break;
        }
       
    }
}