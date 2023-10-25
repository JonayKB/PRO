package ies.puerto;
/**
 * Realiza una función que realiza el cálculo del área en cuadrado y un rectángulo.
 * @author JonayKB
 */
public class Ejercicio3 {

/**
 * Calcula el area del cuadrado
 * @param a es el lado del cuadrado
 * @return devuelve el area del cuadrado
 */
    public int areaCuadrado(int a) {
        int resultado = 0;
        resultado = areaRectangulo(a, a);
        return resultado;
    }
/**
 * Calclula el area del rectangulo
 * @param a es uno de los lados del rectangulo
 * @param b es uno de los lados del rectangulo
 * @return devuelve el area del rectangulo
 */
    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = a*b;

        return resultado;
    }
}