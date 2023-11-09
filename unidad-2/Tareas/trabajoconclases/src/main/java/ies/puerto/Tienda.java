package ies.puerto;


/**
 * Luego, crea una clase Tienda que tenga una lista de productos y métodos para agregar, vender y mostrar el inventario.
 * @author JonayKB
 */
public class Tienda {
    /**
     * Constructor por default
     */
    public Tienda(){};
    
    
    Producto producto1 = new Producto("Jabon", 3f, 100);
    Producto producto2 = new Producto("Tenedor", 1f, 1000);
    Producto producto3 = new Producto("Filete de ternera", 5f, 10);

    public Producto[] arrayProductos = {producto1,producto2,producto3};

    
    
    

    
    /**
     * Enseña todos los detalles de todos los productos
     * @return string con los detalles
     */
    public String mostrarInventario(){
        String resultado ="";
        for (Producto producto : arrayProductos) {
            resultado = resultado+"\nNombre: "+producto.getNombre()+"\nPrecio: "+producto.getPrecio()+"\nStock: "+producto.getStock();
        }
        return resultado;
    }

    
}
