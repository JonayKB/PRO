package es.ies.puerto.modelo.productos;


import es.ies.puerto.modelo.abstrac.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {
    int popularidad;
    public CuidadoPersonal() {
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String udi, int popularidad){
        super(nombre, precio, fechaEntrada, udi);
        this.popularidad = popularidad;
    }
    @Override
    public int calcularPopularidad() {

        return popularidad;
    }

    @Override
    public boolean recomendarProducto() {

        return calcularPopularidad()>=7 ? true : false;
    }

    @Override
    public int cantidadDisponible() {
        // TODO 
        return 0;
    }

    @Override
    public float precioMaximo() {
        // TODO Auto-generated method stub
        return getPrecio()*1.8f;
    }


    @Override
    public String toCsv(){
        return getNombre()+SEPARADOR+getPrecio()+SEPARADOR+getFechaEntrada()+SEPARADOR+getUdi()+SEPARADOR+popularidad;
    }
    
}
