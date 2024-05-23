package es.ies.puerto.modelo.db.interfaces;

import java.util.List;

import es.ies.puerto.modelo.db.entidades.Personaje;

public interface IGuardado {
    public void agregarPersonaje(Personaje personaje);
    public Personaje obtenerPersonaje(Personaje personaje);
    public List<Personaje> obtenerPersonajes();
    public void eliminarPersonaje(Personaje personaje);
}
