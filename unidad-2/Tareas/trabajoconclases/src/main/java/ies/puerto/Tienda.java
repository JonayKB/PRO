package ies.puerto;


/**
 * Luego, crea una clase Tienda que tenga una lista de productos y métodos para agregar, vender y mostrar el inventario.
 * @author JonayKB
 */
public class Tienda {
    Producto[] arrayProductos;
    public Tienda(Producto[] arrayProductos){
        this.arrayProductos = arrayProductos;
    };
    
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
