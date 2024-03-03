package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpresionesEquilibradas {
    public String EquilibrarExpresion(String str1, String str2){
        List<Character> str1Characters=obtenerListaChar(str1.toCharArray());
        List<Character> str2Characters=obtenerListaChar(str2.toCharArray());
        List<Character> out1Characters = new ArrayList<>();
        List<Character> out2Characters = new ArrayList<>();
        for (Character character : str1Characters) {
            if (!str2Characters.contains(character)) {
                out1Characters.add(character);
            }
        }
        for (Character character : str2Characters) {
            if (!str1Characters.contains(character)) {
                out2Characters.add(character);
            }
        }
        return "OUT1: "+out1Characters+" OUT2: "+out2Characters;
    }
    public List<Character> obtenerListaChar(char[] characters){
        List<Character> charactersList = new ArrayList<>();
        for (char c : characters) {
            charactersList.add(c);
        }
        return charactersList;
    }
}
