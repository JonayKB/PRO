package ies.puerto;

public class Circulo {
    private float radio;
    private float PI= 3.14159f;

    public Circulo(){}
    public Circulo(float radio){
        this.radio = radio;
    }

    public float calcularArea(){
        return (radio*radio)*PI;
    } 
    public float calcularCircurferencia(){
        return (radio*2)*PI;
    }
}
