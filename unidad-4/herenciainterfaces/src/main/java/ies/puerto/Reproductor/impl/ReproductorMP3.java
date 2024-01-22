package ies.puerto.Reproductor.impl;

import ies.puerto.Reproductor.interfaz.IReproductor;

public class ReproductorMP3 implements IReproductor {

    @Override
    public String detener() {
        return "Deteniendo MP3";
    }

    @Override
    public String reproducir() {
        return "Reproduciendo MP3";
    }

    
    
}
