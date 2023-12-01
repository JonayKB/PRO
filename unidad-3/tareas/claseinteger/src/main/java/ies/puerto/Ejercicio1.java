package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando los métodos de la clase Integer. 
 * Controla las exeption que pudiera generar.
 */
public class Ejercicio1 {
    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);
        Integer valor;
        
        String mensaje = "Es impar";

        try {
            int entrada = scanner.nextInt();
            valor = Integer.valueOf(entrada);
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }finally{
            scanner.close();
        }
        
        if (valor%2==0) {
            mensaje = "Es par";
        }

        System.out.println(mensaje);
    }
}