package es.ies.puerto.modelo.ficheros.interfaces;

import java.util.List;

import es.ies.puerto.modelo.impl.Personaje;

public interface IFicheros {
    public List<Personaje> leer();
    public boolean eliminar(String path);
    public boolean existe(String path);
    public boolean eliminarEscribir(List<Personaje> personas);
    public boolean escribir(List<Personaje> personas);
    public boolean modificar(List<Personaje> personas);
    public String toFile(List<Personaje> personas);

}
