package es.ies.puerto.modelo.ficheros.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PersonajeContainer;

public class Xml extends Ficheros{

    public boolean actualizar(List<Personaje> personajes) {
        PersonajeContainer personajeContainer = new PersonajeContainer(personajes);
        try  {
            Persister persister = new Persister();
            persister.write(personajeContainer, new File(RUTA_XML));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean escribir(List<Personaje> personajes) {
        return actualizar(personajes);
    }

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        if (existe(RUTA_XML)) {
            Persister persister = new Persister(new AnnotationStrategy());
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
    public boolean modificar(List<Personaje> personas) {
        return actualizar(personas);
    }

    @Override
    public String toFile(List<Personaje> personas) {
        return null;
    }
    
}
