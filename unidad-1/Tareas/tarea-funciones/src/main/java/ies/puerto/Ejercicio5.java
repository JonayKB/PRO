package ies.puerto;
/**
 * Crea una función que tome como parámetro un número e indique si es primo o no.
 * @author JonayKB
 */
public class Ejercicio5 {
    /**
     * Función que calcula los divisoresde un número
     * @param numero el cual introducimos
     * @return devolvemos la cantidad de divisores que tiene
     */
    public int calcularDivisores(int numero){
        int divisores = 0;
        for (int i = 1; i<=numero/2; i++){
            if(numero%i == 0){
                divisores++;
                if(divisores>2){
                    break;
                }
            }
        }

        return divisores;
    }
    /**
     * Función que verifica si un número es primo o no
     * @param numero el valor que introducimos
     * @return devolvemos si es primo o no
     */
    public boolean verificarPrimo(int numero){
        boolean resultado = true;
        int divisores = 0;
        divisores = calcularDivisores(numero);

        if (divisores>1){
            resultado = false;
        }
        return resultado;
    }


}