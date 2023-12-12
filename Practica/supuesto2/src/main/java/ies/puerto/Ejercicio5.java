package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer. 
 * Puntuación 1 punto. Con test que verifique el comportamiento 1,25). 
 * Recuerda que  la representación binaria de un número se obtiene al dividir repetidamente el número entre 2 y registrar el resto de cada división. 
 * Luego, los residuos se leen de abajo hacia arriba para obtener la representación binaria. Aquí hay un ejemplo de cómo convertir el número decimal 25 a binario:
 * @author JonayKB
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        //Es una basura de código, pero ante problemas soluciones
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        do{
            entrada=scanner.nextInt()*2;
        }while(entrada<4);
        scanner.close();
        String[][] array = new String[3][entrada];
        String resultado = mostrar(crearTabla(array));
        System.out.println(resultado);
    }
    /**
     * Muestra el array creado
     * @param array que contiene los caracteres
     * @return string con el resultado
     */
    public static String mostrar(String[][] array){
        String resultado = "\n";
        for (String[] is : array) {
            for (String numero : is) {
                if (numero==null) {
                    numero = " ";
                }
                resultado += numero;
            }
            resultado += "\n";
        }
        return resultado;
    }
    /**
     * Crea la tabla con los "*"
     * @param array que contiene las dimensiones
     * @return tabla terminada
     */
    public static String[][] crearTabla(String[][] array){
        int espera =0;
        int esperaArriba =2;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                switch (i) {
                    case 2:
                        array[i][j]= "*";
                        break;
                    case 1:
                        if(espera>0){
                            array[i][j]= "*";
                            espera--;
                        }else{
                            espera=3;
                        }
                    case 0: //Por que si es 10 o 20 o 30... entra en case 0?????
                        if(esperaArriba>0){
                            esperaArriba--;
                        }else if(i==0){ 
                            esperaArriba=3;
                            array[i][j]= "*";
                        }
                }
            }

        }
        return array;
    }
    
}