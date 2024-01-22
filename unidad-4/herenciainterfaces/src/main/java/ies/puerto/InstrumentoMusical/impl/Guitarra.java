package ies.puerto.InstrumentoMusical.impl;

import ies.puerto.InstrumentoMusical.interfaz.IInstrumentoMusical;

public class Guitarra implements IInstrumentoMusical{

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
