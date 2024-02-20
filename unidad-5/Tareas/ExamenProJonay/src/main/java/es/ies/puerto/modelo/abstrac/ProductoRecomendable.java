package es.ies.puerto.modelo.abstrac;

import es.ies.puerto.modelo.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable{

    public ProductoRecomendable() {
    }
    
    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }
}
