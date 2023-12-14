package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 1: Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido. 
 * El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error. Puntuación 5 puntos.
 * @author JonayKB
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();
        scanner.close();
        System.out.println(imprimir(crearTabla(entrada)));

        
    }

    public static int[][] crearTabla(int entrada){
        int[][] array = new int[4][(((entrada)/2)*2)+1];
        for(int i=0; i<4; i++){
            for (int j = i; j <array[i].length-i ; j++) {
                array[i][j]=1;
            }
        }
        return array;
    }

    public static String imprimir(int[][] array){
        String resultado = "";
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]==1) {
                            resultado += "*";
                    }else{
                        resultado += " ";
                    }
                   
                }
                resultado +="\n";
            }
            return resultado;
    }

}