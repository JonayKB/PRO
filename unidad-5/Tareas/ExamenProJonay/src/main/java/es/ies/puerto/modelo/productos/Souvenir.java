package es.ies.puerto.modelo.productos;

import es.ies.puerto.modelo.abstrac.Producto;

public class Souvenir extends Producto{

    public Souvenir() {
    }
    
    public Souvenir(String nombre, float precio, String fechaEntrada, String udi){
        super(nombre, precio, fechaEntrada, udi);

    }

    @Override
    public int cantidadDisponible() {
        // TODO 
        return 0;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.3f;
    }
}
