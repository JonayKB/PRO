package ies.puerto;

public class Rectangulo {
    private float largo;
    private float ancho;

    public float getLargo() {
        return this.largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Rectangulo(){}
    public Rectangulo(float largo){
        this.largo = largo;
    }
    public Rectangulo(float largo, float ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public float calcularPerimetro(){
        return largo+ancho;
    }
    public float calcularArea(){
        return largo*ancho;
    }
}
