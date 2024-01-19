package ies.puerto.Reproductor.impl;

import ies.puerto.Reproductor.abstrac.LecturaDatosAbstract;


public class LecturaDatosBaseDatos extends LecturaDatosAbstract{

    @Override
    public String apertura() {
        // TODO Auto-generated method stub
        return "Apertura de la BBDD";
    }

    @Override
    public String cierro() {
        // TODO Auto-generated method stub
        return "Cierre de la BBDD";
    }

    @Override
    public String lectura() {
        // TODO Auto-generated method stub
        return "Leyendo los datos desde BBDD";
    }
    
}
