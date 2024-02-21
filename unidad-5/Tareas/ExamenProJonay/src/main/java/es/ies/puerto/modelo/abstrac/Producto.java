package es.ies.puerto.modelo.abstrac;

import es.ies.puerto.modelo.interfaces.IVendible;
import java.util.Objects;

public abstract class Producto implements IVendible{
    private String nombre;
    private float precio;
    private String fechaEntrada;
    private String udi;
    public static final String SEPARADOR = ",";
    public Producto(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
    }

    public Producto() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getUdi() {
        return this.udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(udi, producto.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", fechaEntrada='" + getFechaEntrada() + "'" +
            ", udi='" + getUdi() + "'" +
            "}";
    }

    public String toCsv(){
        return nombre+SEPARADOR+precio+SEPARADOR+fechaEntrada+SEPARADOR+udi;
    }
    

}
