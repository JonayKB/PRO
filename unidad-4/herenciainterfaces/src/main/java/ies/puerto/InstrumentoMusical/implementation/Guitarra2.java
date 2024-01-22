package ies.puerto.InstrumentoMusical.implementation;

import ies.puerto.InstrumentoMusical.abstrac.InstrumentoMusicalAbstract;

public class Guitarra2 extends InstrumentoMusicalAbstract{
    @Override
    public String afinar() {
        return "Afinando guitarra...";
    }

    @Override
    public String tocarNota(String nota) {

        return "*Suena la nota*: "+nota;
    }

    public String cambiarCuerdas() {

        return "Cambiando cuerdas...";
    }
}
