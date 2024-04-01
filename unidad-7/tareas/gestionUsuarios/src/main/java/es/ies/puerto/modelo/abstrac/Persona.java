package es.ies.puerto.modelo.abstrac;
import java.util.Objects;

public abstract class Persona {
    private String id;
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String id){
        this.id = id;
    }

    public Persona(String id, String nombre, int edad, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudaString) {
        this.ciudad = ciudaString;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad, ciudad);
    }

    @Override
    public String toString() {
        return " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", ciudaString='" + getCiudad() + "'";
    }
    
}
