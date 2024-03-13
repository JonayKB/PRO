package es.ies.puerto.negocio.impl;

import java.util.List;

import es.ies.puerto.modelo.ficheros.impl.Csv;
import es.ies.puerto.modelo.ficheros.impl.Json;
import es.ies.puerto.modelo.ficheros.impl.Xml;
import es.ies.puerto.modelo.ficheros.interfaces.IFicheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.negocio.interfaces.INegocio;

public class Negocio implements INegocio {
    IFicheros ficheros;
    List<Personaje> personas;
    public Negocio() {
        ficheros = new Xml();
        personas = ficheros.leer();
    }
    public Personaje obtenerPersonaje(String alias){
        if (personas.isEmpty()) {
            return null;
        }
        Personaje personajeBuscar = new Personaje(null, alias, null, null);
        int index = personas.indexOf(personajeBuscar);
        return personas.get(index);
    }
    public boolean agregarPersona(String nombre,String alias, String genero, List<String> poderes){
        Personaje personaje = new Personaje(nombre, alias, genero, poderes);
        if (personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    public boolean actualizarPersona(String nombre,String alias, String genero, List<String> poderes){
        Personaje personaje = new Personaje(nombre, alias, genero, poderes);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return false;
        }
        personas.remove(personaje);
        personas.add(personaje);
        return ficheros.actualizar(personas);
    }
    public boolean eliminarPersona(String alias){
        Personaje personaje = obtenerPersonaje(alias);
        if (!personas.contains(personaje) || personas.isEmpty()) {
            return true;
        }
        personas.remove(personaje);
        return ficheros.actualizar(personas);
    }
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

    public IFicheros getFicheros() {
        return this.ficheros;
    }

    public void setFicheros(IFicheros ficheros) {
        this.ficheros = ficheros;
    }

    public List<Personaje> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Personaje> personas) {
        this.personas = personas;
        ficheros.actualizar(personas);
    }
    
}
