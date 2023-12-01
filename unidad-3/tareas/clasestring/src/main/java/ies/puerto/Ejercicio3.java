package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadVocales= 0;
        String entrada = input.nextLine();
        input.close();
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        
        for (char vocal : vocales) {
            for(int i=0; i<entrada.length(); i++){
                if (entrada.charAt(i)==vocal) {
                    cantidadVocales++;
                }
            }
        }

        System.out.println(cantidadVocales);
    }
            

}