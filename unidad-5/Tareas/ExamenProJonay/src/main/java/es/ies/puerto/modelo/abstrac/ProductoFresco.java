package es.ies.puerto.modelo.abstrac;

import es.ies.puerto.modelo.interfaces.ISaludable;


public abstract class ProductoFresco extends Producto implements ISaludable {
    private String fechaCaducidad;

    public ProductoFresco() {
    }

    public ProductoFresco(String nombre, float precio, String fechaEntrada, String udi,String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, udi);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return this.fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", fechaEntrada='" + getFechaEntrada() + "'" +
            ", udi='" + getUdi() + "'" +
            ", fechaCaducidad='" + getFechaCaducidad() + "'" +
            "}";
    }

}
