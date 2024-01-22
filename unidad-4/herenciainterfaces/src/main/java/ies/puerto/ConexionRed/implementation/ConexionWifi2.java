package ies.puerto.ConexionRed.implementation;

import ies.puerto.ConexionRed.abstrac.ConexionAbstract;

public class ConexionWifi2 extends ConexionAbstract {

    @Override
    public String conectar() {
        return "Conectando mediante WIFI";
    }
    
}
