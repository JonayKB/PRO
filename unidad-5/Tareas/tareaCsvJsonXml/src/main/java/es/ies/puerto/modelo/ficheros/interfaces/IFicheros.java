package es.ies.puerto.modelo.ficheros.interfaces;

import java.util.List;
import es.ies.puerto.modelo.impl.Personaje;
/**
 * Interfaz CRUD
 */
public interface IFicheros {
    /**
     * Lee los personajes de un documento
     * @return los personajes
     */
    public List<Personaje> leer();
    /**
     * Elimina el contenido de un archivo
     * @param path del archivo
     * @return si se elimino o no
     */
    public boolean eliminar(String path);
    /**
     * Comprueba si existe un archivo y si es un fichero
     * @param path del archivo
     * @return si cumple los requisitos o no
     */
    public boolean existe(String path);
    /**
     * Actualiza la lista de personaje, es decir, eliminar el contenido y añade el actual
     * @param personas que añade
     * @return si se completo correctamente
     */
    public boolean actualizar(List<Personaje> personas);
    /**
     * Reemplaza el texto con nuevo (actualizar)(Esto es asi por elecciones de varios tipos de fichero)
     * @param personas a añadir
     * @return si se completo o no
     */
    public boolean escribir(List<Personaje> personas);
    /**
     * Modifica un documento (borra y escribe)
     * @param personas a añadir
     * @return
     */
    public boolean modificar(List<Personaje> personas);


}
