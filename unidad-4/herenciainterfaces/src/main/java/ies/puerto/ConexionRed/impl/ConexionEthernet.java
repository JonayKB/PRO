package ies.puerto.ConexionRed.impl;

import ies.puerto.ConexionRed.interfaz.IConexionRed;

public class ConexionEthernet implements IConexionRed{
    @Override
    public String conectar() {
        return "Conectando mediante Ethernet";
    }
}
