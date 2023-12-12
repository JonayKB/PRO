package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 2: Desarrolla un programa que cuente el número de vocales en una cadena de texto. Puntuación 1 punto. 
 * Con test que verifique el comportamiento 1,25).
 * @author JonayKB
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String regex = "[aeiouAEIOU]";
        int contador = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(entrada);
        
        while (matcher.find()) {
            contador++;
        }
        System.out.println("Hay "+contador+" vocales");
    }
}