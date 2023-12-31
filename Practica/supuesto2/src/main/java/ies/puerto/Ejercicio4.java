package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer. 
 * Puntuación 1 punto. Con test que verifique el comportamiento 1,25). 
 * Recuerda que  la representación binaria de un número se obtiene al dividir repetidamente el número entre 2 y registrar el resto de cada división. 
 * Luego, los residuos se leen de abajo hacia arriba para obtener la representación binaria. Aquí hay un ejemplo de cómo convertir el número decimal 25 a binario:
 * @author JonayKB
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();
        scanner.close();
        String resultado = pasarABinario(entrada);
        System.out.println(resultado);
    }
    /**
     * Pasa un número a binario
     * @param entrada numero a pasar
     * @return el número convertido
     */
    public static String pasarABinario(int entrada){
        String resultado = "";

        resultado = Integer.toBinaryString(entrada);
        
        return resultado;
        
    }
}