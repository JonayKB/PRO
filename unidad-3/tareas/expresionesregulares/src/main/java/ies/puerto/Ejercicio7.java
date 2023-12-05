package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un programa que cuente el número de palabras en una cadena de texto. Considera que las palabras pueden estar separadas por espacios, comas o puntos.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int palabras = 0;
        String regex = "\\w+";
        String texto= "Hola buenos, dias. Que guay";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            palabras++;
        }
        System.out.println("Hay un total de "+palabras+" palabras");
    }
}