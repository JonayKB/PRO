package es.ies.puerto.modelo.impl;


import java.util.Arrays;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
@Root(name = "personaje")
public class Personaje {
    @Element(name = "nombre")
    private String nombre;
    @Element(name = "alias")
    private String alias;

    @Element(name = "genero")
    private String genero;

    @ElementList(name = "poderes")
    private List<String> poderes;


    public Personaje() {
    }

    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }


    public String toCsv(){
        return nombre+Ficheros.SEPARADOR+alias+Ficheros.SEPARADOR+genero+Ficheros.SEPARADOR+poderesToCsv();
    }
    public String poderesToCsv(){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i<poderes.size()-1) {
            stringBuilder.append(poderes.get(i)).append(Ficheros.SEPARADOR);
            i++;
        }
        stringBuilder.append(poderes.get(i));
        return stringBuilder.toString();
    }
    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", alias='" + alias + "'" +
            ", genero='" + genero + "'" +
            ", poderes='" + poderes + "'" +
            "}";
    }

}
