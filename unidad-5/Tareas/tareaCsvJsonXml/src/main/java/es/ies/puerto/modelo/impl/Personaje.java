package es.ies.puerto.modelo.impl;




import java.util.Arrays;
import java.util.List;

import org.simpleframework.xml.Element;

import org.simpleframework.xml.Root;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
@Root(name = "personaje")
public class Personaje {
    @Element(name = "nombre")
    @Expose
    private String nombre;

    @Element(name = "alias")
    @Expose
    private String alias;

    @Element(name = "genero")
    @Expose
    private String genero;

    @Expose
    private List<String> poderes;

    @Element(name = "poderes")
    private PoderContainer poderContainer;


    public Personaje() {
    }

    public Personaje(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
        poderContainer = new PoderContainer(poderes);
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

    public PoderContainer getPoderContainer() {
        return this.poderContainer;
    }

    public void setPoderContainer(PoderContainer poderes) {
        this.poderContainer = poderes;
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
        if (poderes == null) {
            return "{" +
            " nombre='" + nombre + "'" +
            ", alias='" + alias + "'" +
            ", genero='" + genero + "'" +
            ", poderes='" + poderContainer.getPoderes() + "'" +
            "}";
        }
        return "{" +
            " nombre='" + nombre + "'" +
            ", alias='" + alias + "'" +
            ", genero='" + genero + "'" +
            ", poderes='" + poderes + "'" +
            "}";
    }

}
