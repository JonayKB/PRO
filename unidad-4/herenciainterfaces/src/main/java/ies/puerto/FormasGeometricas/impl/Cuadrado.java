package ies.puerto.FormasGeometricas.impl;

import ies.puerto.FormasGeometricas.interfaz.IFormasGeometricas;

public class Cuadrado extends RegularesAbstrac implements IFormasGeometricas {
    public Cuadrado (float base, float altura){
        super(base, altura);
    }
    @Override
    public float calcularArea() {
        return getBase()*getAltura();
    }
    
}
