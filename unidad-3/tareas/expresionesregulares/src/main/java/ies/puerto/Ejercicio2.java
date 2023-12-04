package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada. (Convina lo aprendido).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        String telefono = "+34-648-74-23-61 +34-647-23-23-61";
        String regex= "(\\+[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}-[0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);
        int i = 1;
        while (matcher.find()) {
            System.out.println("Numero valido "+i+": "+matcher.group(i));
            i++;
        }



    }
}