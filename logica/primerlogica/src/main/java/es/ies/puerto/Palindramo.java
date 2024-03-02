package es.ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindramo {
    public static boolean esPalindramo(String frase){
        StringBuilder aComprobar= new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(frase);
        while (matcher.find()) {
            aComprobar.append(matcher.group(0).toLowerCase());
        }
        for (int i = 0; i <= aComprobar.length()/2; i++) {
            if (aComprobar.charAt(i)!=aComprobar.charAt(aComprobar.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
