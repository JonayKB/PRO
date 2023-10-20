package ies.puerto;
/**
 * Realiza una función que realiza el cálculo del área en triángulo.
 * @author JonayKB
 */
public class Ejercicio1 {
    /**
     * Función para calcular el area de un triangulo
     * @param base base del triangulo
     * @param altura altura del triangulo
     * @return devuelve el area del triangulo
     */
    public int areaTriangulo(int base, int altura) {
        int resultado = 0;
        resultado = (base*altura)/2;

        return resultado;
    }

}