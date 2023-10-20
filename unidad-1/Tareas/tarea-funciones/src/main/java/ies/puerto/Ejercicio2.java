package ies.puerto;
/**
 * Realiza una función que realiza el cálculo del área en circulo.
 * @author JonayKB
 */
public class Ejercicio2 {
    double PI = 3.14;
    /**
     * Calcula el area del circulo
     * @param radio es el radio del circulo
     * @return devuelve el area del circulo
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        resultado = (radio*radio)*PI;
        return resultado;
    }
}