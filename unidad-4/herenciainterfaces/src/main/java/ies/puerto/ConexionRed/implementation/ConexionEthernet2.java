package ies.puerto.ConexionRed.implementation;

import ies.puerto.ConexionRed.abstrac.ConexionAbstract;


public class ConexionEthernet2 extends ConexionAbstract{
    @Override
    public String conectar() {
        return "Conectando mediante Ethernet";
    }
}
