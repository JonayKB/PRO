package ies.puerto.parteDos.implement;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Nota)) {
            return false;
        }
        Nota nota = (Nota) o;
        return Objects.equals(nombre, nota.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, valor);
    }
    
}
