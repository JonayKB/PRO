package ies.puerto.FormasGeometricas.impl;

import ies.puerto.FormasGeometricas.interfaz.IFormasGeometricas;

public class Circulo implements IFormasGeometricas{
    private float radio;
    public Circulo(){}
    public Circulo(float radio){
        this.radio = radio;
    }
    @Override
    public float calcularArea(){
        return 3.14f*radio*radio;
    }
}
