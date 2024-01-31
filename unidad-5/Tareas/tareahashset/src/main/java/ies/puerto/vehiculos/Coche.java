package ies.puerto.vehiculos;

import java.util.Objects;

import ies.puerto.abstrac.Vehiculo;

public class Coche extends Vehiculo{
    public Coche (String matricula, String marca, String modelo, int velocidad){
        super(marca, modelo, matricula, velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 180;
    }
    @Override
    public String toString() {
        return "Soy un Coche, Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nVelocidad: "+getVelocidad();
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coche)) {
            return false;
        }
        Coche coche = (Coche) o;
        return Objects.equals(getMatricula(), coche.getMatricula());
    }
    
}
