package es.ies.puerto.modelo.productos;


import es.ies.puerto.modelo.abstrac.Producto;

public class Aparato extends Producto{

    public Aparato() {
    }

    public Aparato(String nombre, float precio, String fechaEntrada, String udi){
        super(nombre, precio, fechaEntrada, udi);

    }

    @Override
    public int cantidadDisponible() {
        // TODO 
        return 0;
    }

    @Override
    public float precioMaximo() {

        return getPrecio()*1.42f;
    }
}
