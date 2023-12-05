package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que cuente el número de palabras en formato Camel Case (palabras concatenadas sin espacios) en una cadena.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int palabras = 0;
        String regex = "[A-Z][a-z]+";
        String texto= "HolaBuenosDias";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            palabras++;
        }
        System.out.println("Hay un total de "+palabras+" palabras");
    }
}