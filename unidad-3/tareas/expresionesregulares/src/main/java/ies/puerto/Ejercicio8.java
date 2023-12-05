package ies.puerto;

import java.util.regex.Pattern;

/**
 * Escribe un programa que verifique si una cadena cumple con ciertos criterios de complejidad, como longitud mínima, uso de mayúsculas, minúsculas y números.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String mensaje = "No es valido";
        String regex = "^(?=(?:.*\\d){2})(?=(?:.*[A-Z]){2})(?=(?:.*[a-z]){2})\\S{8,}$"; //Ni idea de porque funciona
        String contraseña = "SamaelAA123133";
        
        if (Pattern.matches(regex, contraseña)) {
            mensaje = "Es valido";
        }

        System.out.println(mensaje);
    }
}