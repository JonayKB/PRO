package ies.puerto;
/**
 * Desarrolla un programa que reemplace todas las etiquetas HTML en una cadena con su contenido. Por ejemplo,
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        String resultado = "";
        String regex = "<\\w+>(\\w+)</\\w+>";
        String texto= "<p>Texto</p><p>Dios</p>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            resultado+= matcher.group(1)+" ";
        }
        System.out.println(resultado);
    }
}   
