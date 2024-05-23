package es.ies.puerto.DTO;

import es.ies.puerto.modelo.db.entidades.Personaje;
import java.util.Objects;

public class EquipamientoDTO {
    String id;
    String nombre;
    String descripcion;


    public EquipamientoDTO() {
    }

    public EquipamientoDTO(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EquipamientoDTO)) {
            return false;
        }
        EquipamientoDTO equipamientoDTO = (EquipamientoDTO) o;
        return Objects.equals(id, equipamientoDTO.id);}

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
