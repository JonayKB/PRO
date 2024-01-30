package ies.puerto.vehiculos;

import java.util.Objects;

import ies.puerto.abstrac.Vehiculo;

public class Motocicleta extends Vehiculo{
    public Motocicleta (String matricula, String marca, String modelo, int velocidad){
        super(marca, modelo, matricula, velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 120;
    }
    @Override
    public String toString() {
        return "Soy una Motocicleta, Matricula: "+getMatricula()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nVelocidad: "+getVelocidad();
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motocicleta)) {
            return false;
        }
        Motocicleta motocicleta = (Motocicleta) o;
        return Objects.equals(getMatricula(), motocicleta.getMatricula());
    }
    
}
