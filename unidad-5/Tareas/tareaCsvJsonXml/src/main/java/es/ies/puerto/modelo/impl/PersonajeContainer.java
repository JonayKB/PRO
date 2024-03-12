package es.ies.puerto.modelo.impl;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import com.google.gson.annotations.SerializedName;

@Root(name = "personajes")
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

    
