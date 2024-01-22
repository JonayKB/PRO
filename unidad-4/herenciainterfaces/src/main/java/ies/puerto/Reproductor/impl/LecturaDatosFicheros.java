package ies.puerto.Reproductor.impl;

import ies.puerto.Reproductor.interfaz.ILecturaDatos;

public class LecturaDatosFicheros implements ILecturaDatos{

    @Override
    public String apertura() {
        return "Abriendo el sistema de ficheros";
    }

    @Override
    public String cierro() {
        return "Cerrando el sistema de ficheros";
    }

    @Override
    public String lectura() {
        return "Realizada la lectura de datos de este fichero";
    }
    
}
