package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos cadenas de texto e indique si son iguales o diferentes.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String mensaje = "Son distintos";
        Scanner input = new Scanner(System.in);
        String entrada= input.nextLine();
        String entrada1= input.nextLine();
        input.close();

        if(entrada.equals(entrada1)){
            mensaje = "Son iguales";
        }

        System.out.println(mensaje);
    }
}