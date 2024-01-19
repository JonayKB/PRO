package ies.puerto.ConexionRed.impl;

import ies.puerto.ConexionRed.interfaz.IConexionRed;

public class ConexionWifi implements IConexionRed {

    @Override
    public String conectar() {
        return "Conectando mediante WIFI";
    }
    
}
