package es.ies.puerto.modelo.ficheros.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.core.Persister;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PersonajeContainer;

public class Xml extends Ficheros{
    private static List<Personaje> personajes;
    public static void main(String[] args) {
        System.out.println();
        
    }
    @Override
    public boolean eliminarEscribir(String textoNuevo) {
        return false;
    }
    public boolean eliminarEscribir(List<Personaje> personajes) {
        return escribir(personajes);
    }

    @Override
    public boolean escribir(String textoNuevo) {
        return false;
    }
    public boolean escribir(List<Personaje> personajes) {
        PersonajeContainer personajeContainer = new PersonajeContainer();
        personajeContainer.setPersonajes(personajes);
        
        try  {
            Persister persister = new Persister();
            persister.write(personajeContainer, new File(RUTA_XML));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if (existe(RUTA_XML)) {
            Persister persister = new Persister();
            File file = new File(Ficheros.RUTA_XML);
            try {
                PersonajeContainer personajeContainer = persister.read(PersonajeContainer.class, file);
                personajes = personajeContainer.getPersonajes();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return personajes;
    }

    @Override
    public boolean modificar(String textoNuevo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String toFile(List<Personaje> personas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toFile'");
    }
    
}
