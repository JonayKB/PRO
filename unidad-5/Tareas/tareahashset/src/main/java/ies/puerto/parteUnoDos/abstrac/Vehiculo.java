package ies.puerto.parteUnoDos.abstrac;

import java.util.Objects;

import ies.puerto.parteUnoDos.interfaz.IVehiculo;

public abstract class Vehiculo implements IVehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private int velocidad;


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String matricula, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehiculo)) {
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, velocidad);
    }
    @Override
    public String toString() {
        return "Soy un Vehiculo, Matricula: "+matricula+"\n Marca: "+marca+"\nModelo: "+modelo+"\nVelocidad: "+velocidad;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
