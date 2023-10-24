package ies.puerto;
/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo 
 * y si es par o impar.
 */
public class Ejercicio2 {
    /**
     * Función para calcular si un número es positivo o negativo
     * @param numero el numero que introduciomos
     * @return un boolean diciendo el resultado
     */
public boolean calcularPositivo(int numero){
    boolean resultado = false;
    if (numero>0){
        resultado = true;
    }
    return resultado;
}
/**
 * Función para comprobar si un número es par o no
 * @param numero el numero que introducimos
 * @return un boolena diciendo el resultado
 */
public boolean calcularPar(int numero){
    boolean resultado = false;
    if (numero%2==0){
        resultado = true;
    }
    return resultado;
}
}
