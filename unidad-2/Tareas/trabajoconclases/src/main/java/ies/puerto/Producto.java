package ies.puerto;

public class Producto {
    private String nombre;
    private float precio;
    private int stock;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Producto(){}
    public Producto(String nombre){
        this.nombre=nombre;
    }
    public Producto(String nombre, float precio){
        this.nombre=nombre;
        this.precio = precio;
    }
    public Producto(String nombre, float precio, int stock){
        this.nombre=nombre;
        this.precio = precio;
        this.stock = stock;
    }



}
