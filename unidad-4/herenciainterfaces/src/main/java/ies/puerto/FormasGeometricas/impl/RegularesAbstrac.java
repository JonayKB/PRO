package ies.puerto.FormasGeometricas.impl;

public class RegularesAbstrac {
    private float base;
    private float altura;
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public RegularesAbstrac(){}
    public RegularesAbstrac (float base, float altura){
        this.base = base;
        this.altura = altura;
    }
}
