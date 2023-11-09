package ies.puerto;
/**
 * Crea una clase Circulo que tenga una propiedad radio y métodos para calcular el área y la circunferencia. 
 * Crea objetos de esta clase y calcula el área y circunferencia de varios círculos.
 * @author JonayKB
 */
public class Circulo {
    private float radio;
    private float PI = 3.14159f;

    //Getters y Setters
    public float getRadio() {
        return this.radio;
    }

    public Circulo(){}

    /**
     * Constructor
     * @param radio del ciruclo
     */
    public Circulo(float radio){
        this.radio = radio;
    }

    /**
     * Función para calcular el area
     * @return area del circulo
     */
    public float calcularArea(){
        return (radio*radio)*PI;
    } 

    /**
     * Función para calcular la circurferencia
     * @return circurferencia del circulo
     */
    public float calcularCircurferencia(){
        return (radio*2)*PI;
    }
}
