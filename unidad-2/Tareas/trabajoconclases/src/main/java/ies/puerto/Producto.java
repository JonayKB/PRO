package ies.puerto;
/**
 * Crea una clase Producto con propiedades nombre, precio y stock. 
 * @author JonayKB
 */
public class Producto {
    private String nombre;
    private float precio;
    private int stock;

    //Setters y Getters
    public String getNombre() {
        return this.nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    /**
     * Constructor por defecto
     */
    public Producto(){}

    /**
     * Constructor
     * @param nombre del producto
     */
    public Producto(String nombre){
        this.nombre=nombre;
    }

    /**
     * Constructor
     * @param nombre del producto
     * @param precio del producto
     */
    public Producto(String nombre, float precio){
        this.nombre=nombre;
        this.precio = precio;
    }

    /**
     * Constructor
     * @param nombre del producto
     * @param precio del producto
     * @param stock del producto
     */
    public Producto(String nombre, float precio, int stock){
        this.nombre=nombre;
        this.precio = precio;
        this.stock = stock;


    
    }

    /**
     * Función para agregar stock a un producto
     * @param clase del producto
     * @param aAnadir cantidad que se añade
     */
    public void agregarStock(int aAnadir){
        setStock(getStock()+aAnadir);
    }
    /**
     * Función para eliminar Stock de un producto
     * @param clase a vender
     * @param aVender cuantos se han vendido
     */
    public void vender(int aVender){
        setStock(getStock()-aVender);
    }
    /**
     * Clase para cambiar el precio de un producto
     * @param clase de la que cambiar el precio
     * @param nuevoPrecio del producto
     */
    public void cambiarPrecio(float nuevoPrecio){
        setPrecio(nuevoPrecio);
    }


}
