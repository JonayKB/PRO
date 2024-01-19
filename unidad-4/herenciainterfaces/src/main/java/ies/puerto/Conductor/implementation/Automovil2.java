package ies.puerto.Conductor.implementation;

import ies.puerto.Conductor.abstrac.ConductorAbstract;

public class Automovil2 extends ConductorAbstract {
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
