package es.ies.puerto.negocio.impl;

import java.util.List;

import es.ies.puerto.modelo.ficheros.impl.Csv;
import es.ies.puerto.modelo.ficheros.impl.Json;
import es.ies.puerto.modelo.ficheros.impl.Xml;
import es.ies.puerto.modelo.ficheros.interfaces.IFicheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.negocio.interfaces.INegocio;
/**
 * Negocio que controla en si la aplicacion
 */
public class Negocio implements INegocio {
    IFicheros ficheros;
    List<Personaje> personas;
    public Negocio() {
        ficheros = new Xml();
        personas = ficheros.leer();
    }
    @Override
    /**
     * Obtiene un personaje por su alias
     * @param alias del personaje
     * @return el personaje
     */
    public Personaje obtenerPersonaje(String alias){
        Personaje personajeBuscar = new Personaje(null, alias, null, null);
        if (personas.isEmpty() || !personas.contains(personajeBuscar)) {
            return null;
        }
        int index = personas.indexOf(personajeBuscar);
        return personas.get(index);
    }
    @Override
    /**
     * Agrega una persona nueva
     * @param nombre de la persona
     * @param alias de la persona
     * @param genero de la persona
     * @param poderes de la persona
     * @return
     */
    public boolean agregarPersona(Personaje personaje){
        if (personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Cambia valores de una persona (buscada por su alias)
     * @param nombre de la persona
     * @param alias de la persona
     * @param genero de la persona
     * @param poderes de la persona
     * @return si se puedo actulizar o no
     */
    public boolean actualizarPersona(Personaje personaje){
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return false;
        }
        personas.remove(personaje);
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Elimina a una persona
     * @param alias de la persona a eliminar
     * @return si se elimino o no
     */
    public boolean eliminarPersona(String alias){
        Personaje personaje = obtenerPersonaje(alias);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.remove(personaje);
        return ficheros.actualizar(personas);
    }
    @Override
    /**
     * Muestra todos los personajes de todos los ficheros
     * @return personajes y en que fichero estan
     */
    public String mostrarPersonajesTodosFormatos(){
        StringBuilder stringBuilder = new StringBuilder();
        IFicheros ficherosMostrar = new Xml();
        stringBuilder.append("XML:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new Json();
        stringBuilder.append("JSON:\n").append(ficherosMostrar.leer()).append("\n");
        ficherosMostrar = new Csv();
        stringBuilder.append("CSV:\n").append(ficherosMostrar.leer()).append("\n");
        return stringBuilder.toString();
    }
    /**
     * Obtiene los personajes de el fichero
     * @return
     */
    public List<Personaje> obtenerPersonajes(){
        return ficheros.leer();
    }

    public List<Personaje> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Personaje> personas) {
        this.personas = personas;
        ficheros.actualizar(personas);
    }
    
}
