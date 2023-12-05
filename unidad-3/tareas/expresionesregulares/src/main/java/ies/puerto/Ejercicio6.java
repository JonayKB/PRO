package ies.puerto;

import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena representa un número de tarjeta de crédito válido según un formato específico.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String mensaje = "No es valido";
        String regex = "^\\d{4} \\d{4} \\d{4} \\d{4}$";
        String tarjeta = "6243 7456 4321 0749";
        
        if (Pattern.matches(regex, tarjeta)) {
            mensaje = "Es valido";
        }

        System.out.println(mensaje);
    }
}