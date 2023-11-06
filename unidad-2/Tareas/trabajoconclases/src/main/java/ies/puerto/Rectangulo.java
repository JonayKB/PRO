package ies.puerto;
/**
 * Crea una clase Rectangulo con propiedades largo y ancho. 
 * Agrega métodos para calcular el área y el perímetro del rectángulo.
 * @author JonayKB
 */
public class Rectangulo {
    private float largo;
    private float ancho;
    //Getters
    public float getLargo() {
        return this.largo;
    }


    public float getAncho() {
        return this.ancho;
    }

    /**
     * Constructor por default
     */
    public Rectangulo(){}

    /**
     * Constructor 
     * @param largo del rectangulo
     * @param ancho del rectangulo
     */
    public Rectangulo(float largo, float ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    /**
     * Función para calcular el perimetro del rectangulo
     * @return perimetro
     */
    public float calcularPerimetro(){
        return largo+ancho;
    }

    /**
     * Función para calcular el area del rectangulo
     * @return area
     */
    public float calcularArea(){
        return largo*ancho;
    }
}
