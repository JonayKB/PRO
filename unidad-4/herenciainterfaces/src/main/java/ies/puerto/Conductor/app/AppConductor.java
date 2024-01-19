package ies.puerto.Conductor.app;

import ies.puerto.Conductor.impl.Automovil;
import ies.puerto.Conductor.implementation.Automovil2;


public class AppConductor {
    static Automovil automovil;
    static Automovil2 automovil2;
    public static void main(String[] args) {
        automovil = new Automovil();
        System.out.println(automovil.arrancar());
        System.out.println(automovil.conducir());
        System.out.println(automovil.detener());

        automovil2 = new Automovil2();
        System.out.println(automovil.arrancar());
        System.out.println(automovil.conducir());
        System.out.println(automovil.detener());
    }
}
