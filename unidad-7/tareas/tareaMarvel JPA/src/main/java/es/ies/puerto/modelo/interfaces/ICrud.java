package es.ies.puerto.modelo.interfaces;



import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public interface ICrud {
    /**
     * Obtiene un personaje
     * @param personaje a obtener
     * @return personaje obtenido
     * @throws UsuarioException
     */
    public Personaje obtenerPersonaje(Personaje personaje)throws UsuarioException;
    /**
     * Obtiene todos los personajes
     * @return los personajes
     * @throws UsuarioException
     */
    public Set<Personaje> obtenerPersonajes() throws UsuarioException;
    /**
     * Agrega un personaje
     * @param personaje a agregar
     * @throws UsuarioException
     */
    public void agregarPersonaje(Personaje personaje) throws UsuarioException;
    /**
     * Actualiza un personaje
     * @param personaje nuevo personaje
     * @throws UsuarioException
     */
    public void actualizarPersonaje(Personaje personaje) throws UsuarioException;
    /**
     * Elimina un personaje
     * @param personaje a eliminar
     * @throws UsuarioException
     */
    public void eliminarPersonaje(Personaje personaje) throws UsuarioException;
}
