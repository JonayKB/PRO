package ies.puerto.parteDos;

public class Nota {
    private String nombre;
    private float valor;

    public Nota(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Nota() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        
        return nombre+" "+valor;
    }
}
