package es.ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mayuscula {
    public String toCamelCase(String frase){
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(frase);
        while (matcher.find()) {
            String nuevaPalabra=matcher.group(0);
            stringBuilder.append(Character.toUpperCase(nuevaPalabra.charAt(0))).append(nuevaPalabra.substring(1)).append(" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }
}
