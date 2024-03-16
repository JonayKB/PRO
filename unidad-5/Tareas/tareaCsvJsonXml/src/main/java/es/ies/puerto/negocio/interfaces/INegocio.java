package es.ies.puerto.negocio.interfaces;


import es.ies.puerto.modelo.impl.Personaje;

public interface INegocio {
    public Personaje obtenerPersonaje(String alias);
    public boolean agregarPersona(Personaje personaje);
    public boolean actualizarPersona(Personaje personaje);
    public boolean eliminarPersona(String alias);
    public String mostrarPersonajesTodosFormatos();
}
