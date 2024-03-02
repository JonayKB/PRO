package es.ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContandoPalabras {
    public int contarPalabras(String frase){
        int resultado=0;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(frase);
        while (matcher.find()) {
            resultado++;
        }
        return resultado;
    }
}
