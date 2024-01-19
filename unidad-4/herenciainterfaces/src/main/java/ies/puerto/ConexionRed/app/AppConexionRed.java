package ies.puerto.ConexionRed.app;

import ies.puerto.ConexionRed.impl.ConexionEthernet;
import ies.puerto.ConexionRed.impl.ConexionWifi;
import ies.puerto.ConexionRed.implementation.ConexionEthernet2;
import ies.puerto.ConexionRed.implementation.ConexionWifi2;
import ies.puerto.ConexionRed.interfaz.IConexionRed;

public class AppConexionRed {
    static IConexionRed wifi;
    static IConexionRed ethernet;

    static ConexionWifi2 wifi2;
    static ConexionEthernet2 ethernet2;
    public static void main(String[] args) {
        wifi = new ConexionWifi();
        ethernet = new ConexionEthernet();
        wifi2 = new ConexionWifi2();
        ethernet2 = new ConexionEthernet2();

        System.out.println(wifi.conectar());
        System.out.println(ethernet.conectar());
        System.out.println(wifi2.conectar());
        System.out.println(ethernet2.conectar());
    }
}
