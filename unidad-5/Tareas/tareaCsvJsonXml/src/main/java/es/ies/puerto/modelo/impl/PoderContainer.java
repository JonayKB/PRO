package es.ies.puerto.modelo.impl;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "poderes")
/**
 * Clase que contiene los poderes
 */
public class PoderContainer {
    @ElementList(inline = true, entry = "poder")
    List<String> poderes;

    public List<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    public PoderContainer() {
    }

    public PoderContainer(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return poderes.toString();
    }
}
