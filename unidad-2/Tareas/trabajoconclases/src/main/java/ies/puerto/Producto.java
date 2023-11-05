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



}
