package es.ies.puerto.modelo.ficheros.interfaces;

import java.util.List;

import es.ies.puerto.modelo.impl.Personaje;

public interface IFicheros {
    public List<Personaje> leer();
    public boolean eliminar(String path);
    public boolean existe(String path);
    public boolean eliminarEscribir( String textoNuevo);
    public boolean escribir( String textoNuevo);
    public boolean modificar( String textoNuevo);
    public String toFile(List<Personaje> personas);

}
