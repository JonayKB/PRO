package es.ies.puerto.modelo.ficheros.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.impl.PersonajeContainer;

/**
 * Contiene toda las funciones del interfaz necesaria para la administracion de
 * ficheros con XML
 */
public class Xml extends Ficheros {
    @Override
    public boolean actualizar(List<Personaje> personajes) {
        PersonajeContainer personajeContainer = new PersonajeContainer(personajes);
        try {
            Persister persister = new Persister();
            persister.write(personajeContainer, new File(RUTA_XML));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
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
}
