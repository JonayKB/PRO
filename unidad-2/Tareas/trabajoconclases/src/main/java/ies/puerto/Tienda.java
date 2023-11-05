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
     * Función para agregar stock a un producto
     * @param clase del producto
     * @param aAnadir cantidad que se añade
     */
    public void agregarStock(Producto clase, int aAnadir){
        clase.setStock(clase.getStock()+aAnadir);
    }
    /**
     * Función para eliminar Stock de un producto
     * @param clase a vender
     * @param aVender cuantos se han vendido
     */
    public void vender(Producto clase, int aVender){
        clase.setStock(clase.getStock()-aVender);
    }
    /**
     * Clase para cambiar el precio de un producto
     * @param clase de la que cambiar el precio
     * @param nuevoPrecio del producto
     */
    public void cambiarPrecio(Producto clase, float nuevoPrecio){
        clase.setPrecio(nuevoPrecio);
    }
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
