package ies.puerto;

import java.util.regex.Pattern;

/**
 * Implementa un validador que verifique si una cadena sigue el formato de fecha común (por ejemplo, DD/MM/AAAA).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String mensaje = "No es valido";
        String regex = "^[0-9]{2}\\/[1-9]{2}\\/[0-9]{4}$";
        String email = "10/12/2023";
        
        if (Pattern.matches(regex, email)) {
            mensaje = "Es valido";
        }

        System.out.println(mensaje);
    }
}