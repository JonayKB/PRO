package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }
    /**
     * Función para calcular el mcd de dos numeros dados
     * @param numero1 primer número del cálculo
     * @param numero2 segundo número del cálculo
     * @return el mcd de los dos numeros
     */
    public int mcd (int numero1, int numero2) {
        boolean encontrado = false;
        int resultado = 0;
        int mayor = numero2;

        if (numero1>numero2){
            mayor = numero1;
        }
        int i = mayor/2;
        while ((encontrado == false) && (i>0)){

            if((numero1%i == 0) && (numero2%i == 0)){
                encontrado = true;
                resultado = i;        
            }
        i--;
        }
        return resultado;
    }

}