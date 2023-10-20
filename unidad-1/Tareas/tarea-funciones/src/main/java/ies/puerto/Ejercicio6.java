package ies.puerto;
/**
 * Crear una función que convierte de grados Fahrenheit a Celsius.
 * @author JonayKB
 */
public class Ejercicio6 {
    /**
     * Función para pasar de fahrenheit a celsius
     * @param numero valor que queremos pasar a celsius
     * @return devolvemos el vlaor en celsius
     */
    public double fahrenheitACelsius(double numero){
        double resultado = 0;
        resultado = ((5.0 / 9.0)*(numero-32.0));
        return resultado;
    }

}