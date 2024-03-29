package es.ies.puerto.modelo.impl;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "personajes")
/**
 * Clase que contiene varios personajes
 */
public class PersonajeContainer {
    @ElementList(inline = true)
    private List<Personaje> personajes;

    public List<Personaje> getPersonajes() {
        return this.personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }
    public PersonajeContainer(List<Personaje> personajes) {
        this.personajes = personajes;
    }
    public PersonajeContainer() {
    }
    

}

    
