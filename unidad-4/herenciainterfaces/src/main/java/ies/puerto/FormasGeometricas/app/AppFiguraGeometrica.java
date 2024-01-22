package ies.puerto.FormasGeometricas.app;

import ies.puerto.FormasGeometricas.impl.Circulo;
import ies.puerto.FormasGeometricas.impl.Cuadrado;
import ies.puerto.FormasGeometricas.impl.Rectangulo;
import ies.puerto.FormasGeometricas.interfaz.IFormasGeometricas;

public class AppFiguraGeometrica {
    static IFormasGeometricas circulo;
    static IFormasGeometricas cuadrado;
    static IFormasGeometricas rectangulo;
    public static void main(String[] args) {
        cuadrado = new Cuadrado(3, 4);
        rectangulo = new Rectangulo(3, 5);
        circulo = new Circulo(10);

        System.out.println(circulo.calcularArea());
        System.out.println(cuadrado.calcularArea());
        System.out.println(rectangulo.calcularArea());
    }
}
