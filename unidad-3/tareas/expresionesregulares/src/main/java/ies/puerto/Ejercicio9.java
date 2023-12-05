package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todas las URLs válidas de una cadena de texto. Considera los diferentes formatos de URLs.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        String resultado = "";
        String regex = "https:\\/(\\/([a-z.A-Z0-9-%_#@|!?'¿¡*])+){1,}";
        String urls= "https://es.stackoverflow.com/questions/75907/validar-caracteres-may%C3%BAsculas-min%C3%BAsculas-y-caracteres-num%C3%A9ricos-para-una-contr asdadasdasd https://github.com/jpexposito/docencia/blob/master/Primero/PRO/Apuntes/Unidad-3-Estructuras-Control/Ejercicios/Expresiones-regulares.md";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(urls);
        while (matcher.find()) {
            resultado+= matcher.group()+"\n";
        }
        System.out.println(resultado);
    }
}