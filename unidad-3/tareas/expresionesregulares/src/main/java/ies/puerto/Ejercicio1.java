package ies.puerto;

import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando expresiones regulares.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        String mensaje = "No es valido";
        String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}";
        String email = "jonayKB@gmail.com";
        
        if (Pattern.matches(regex, email)) {
            mensaje = "Es valido";
        }

        System.out.println(mensaje);

    }
}