package ies.puerto.parteUnoDos.vehiculos;

import java.util.Objects;

import ies.puerto.parteUnoDos.abstrac.Vehiculo;

public class Camion extends Vehiculo{

    @Override
    public int velocidadMaxima() {

        return 160;
    }

    
    @Override
    public String toString() {
        return "Soy un Camion, Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nVelocidad: "+getVelocidad();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Camion camion = (Camion) o;
        return Objects.equals(getMatricula(), camion.getMatricula());
    }
}
