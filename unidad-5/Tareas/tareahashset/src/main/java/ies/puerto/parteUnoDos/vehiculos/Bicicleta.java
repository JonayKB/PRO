package ies.puerto.parteUnoDos.vehiculos;

import java.util.Objects;

import ies.puerto.parteUnoDos.abstrac.Vehiculo;

public class Bicicleta extends Vehiculo{

    @Override
    public int velocidadMaxima() {

        return 40;
    }

    
    @Override
    public String toString() {
        return "Soy una Bicicleta, Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nVelocidad: "+getVelocidad();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(getMatricula(), bicicleta.getMatricula());
    }
}
