package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla. 
 * Maneja la excepción ArithmeticException u otra excepción adecuada.
 */
public class Ejercicio5 {
    

    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner(System.in);
        try {
            int operacion = input.nextInt();

        } catch (InputMismatchException e) {
            throw new Exception("Error de conversion");
        }
    }
}
