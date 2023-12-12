package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 3: Implementa un programa que calcule y muestre la suma de los dígitos de un número entero. Puntuación 1 punto. 
 * Con test que verifique el comportamiento 1,25).
 * @author JonayKB
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        
        String entrada = scanner.nextLine();
        int resultado = calcularSuma(entrada);
        System.out.println(resultado);
    }
    /**
     * Calcula la suma de todos los dígios de una numero
     * @param entrada el número
     * @return la suma final
     */
    public static int calcularSuma(String entrada){
        int resultado = 0;
        for (int i = 0; i < entrada.length(); i++) {

            resultado += Integer.parseInt(entrada.substring(i, i+1));
        }
        return resultado;
    }
}