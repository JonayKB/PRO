package ies.puerto.map;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String dni;


    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    @Override
    public String toString() {
        return "Persona {" +
            " nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }
    

}
