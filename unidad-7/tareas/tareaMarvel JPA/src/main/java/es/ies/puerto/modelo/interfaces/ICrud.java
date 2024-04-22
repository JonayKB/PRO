package es.ies.puerto.modelo.interfaces;



import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public interface ICrud {
    public Personaje obtenerPersonaje(Personaje personaje)throws UsuarioException ;
    public Set<Personaje> obtenerPersonajes() throws UsuarioException;

    public void agregarPersonaje(Personaje personaje) throws UsuarioException;
    public void actualizarPersonaje(Personaje personaje) throws UsuarioException;
    public void eliminarPersonaje(Personaje personaje) throws UsuarioException;
}
