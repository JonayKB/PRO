package ies.puerto.Conductor.impl;

import ies.puerto.Conductor.interfaz.IConductor;

public class Automovil implements IConductor {
    public Automovil(){}

    @Override
    public String arrancar() {
        return "Arrancando el Automovil...";
    }

    @Override
    public String detener() {
        return "Deteniendo el Automovil...";
    }

    public String conducir(){
        return "Conduciendo el Automovil...";
    }
    
}
