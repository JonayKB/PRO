package ies.puerto;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo() {
    }
    /**
     * Constructor de vehiculo
     * @param marca del vehiculo
     * @param modelo del vehiculo
     * @param precio del vehiculo
     */
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Soy un Vehiculo:{Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"}";
    }
}
