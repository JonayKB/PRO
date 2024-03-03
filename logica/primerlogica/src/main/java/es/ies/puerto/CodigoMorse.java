package es.ies.puerto;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Pattern;

public class CodigoMorse {
    public static String cambiarACodigoMorse(String entrada){
        entrada = entrada.toUpperCase();
        Dictionary<String,String> dictionary = new Hashtable<>();
        StringBuilder stringBuilder = new StringBuilder();
        dictionary.put( "A","· -");
        dictionary.put( "B","- · · ·");
        dictionary.put( "C","- · - ·");
        dictionary.put( "D","- · ·");
        dictionary.put("·", "E");
        dictionary.put("· · - ·", "F");
        dictionary.put("- - ·", "G");
        dictionary.put("· · · ·", "H");
        dictionary.put("· ·", "I");
        dictionary.put("· - - -", "J");
        dictionary.put("- · -", "K");
        dictionary.put("· - · ·", "L");
        dictionary.put("- -", "M");
        dictionary.put("- .", "N");
        dictionary.put("- - -", "O");
        dictionary.put("· - - ·", "P");
        dictionary.put("- - · -", "Q");
        dictionary.put("· - ·", "R");
        dictionary.put("· · ·", "S");
        dictionary.put("-", "T");
        dictionary.put("· · -", "U");
        dictionary.put("· · · -", "V");
        dictionary.put("· - -", "W");
        dictionary.put("- · · -", "X");
        dictionary.put("- · - -", "Y");
        dictionary.put("- - · ·", "Z");
        dictionary.put("  ", " ");
        String regex="(\\w| )+";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matches(regex, entrada)) {
            char[] letras = entrada.toCharArray();
            for (char c : letras) {
                stringBuilder.append(dictionary.get("A"));
                System.out.println(stringBuilder.toString());
            }
        }
        else{
            dictionary.remove("  ");
            String[] simbolos = entrada.split(" ");
            for (String letra : simbolos) {
                stringBuilder.append(dictionary.get(letra));
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(cambiarACodigoMorse("AAA bbb ccc"));
        
    }
}
