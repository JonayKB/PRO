package ies.puerto;

public class Tienda {
    public Tienda(){};
    
    
    Producto producto1 = new Producto("Jabon", 3f, 100);
    Producto producto2 = new Producto("Tenedor", 1f, 1000);
    Producto producto3 = new Producto("Filete de ternera", 5f, 10);

    public Producto[] arrayProductos = {producto1,producto2,producto3};



    public void agregarStock(Producto clase, int aAnadir){
        clase.setStock(clase.getStock()+aAnadir);
    }
    public void vender(Producto clase, int aVender){
        clase.setStock(clase.getStock()-aVender);
    }
    public void cambiarPrecio(Producto clase, float nuevoPrecio){
        clase.setPrecio(nuevoPrecio);
    }
    public String mostrarInventario(){
        String resultado ="";
        for (Producto producto : arrayProductos) {
            resultado = resultado+"\nNombre: "+producto.getNombre()+"\nPrecio: "+producto.getPrecio()+"\nStock: "+producto.getStock();
        }
        return resultado;
    }

    
}
