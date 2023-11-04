package ies.puerto;

public class Tienda {
    Producto producto1 = new Producto("Jabon", 3, 100);
    Producto producto2 = new Producto("Tenedor", 1, 1000);
    Producto producto3 = new Producto("Filete de ternera", 5, 10);


    public void agregarStock(Producto clase, int aAnadir){
        clase.setStock(clase.getStock()+aAnadir);
    }
    public void vender(Producto clase, int aVender){
        clase.setStock(clase.getStock()-aVender);
    }
    public String mostrarInventario(Producto clase){
        return "Nombre: "+clase.getNombre()+"\nPrecio: "+clase.getPrecio()+"\nStock: "+clase.getStock();
    }

    
}
