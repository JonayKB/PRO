package es.ies.puerto.negocio.impl;

import java.util.List;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.ficheros.impl.Csv;
import es.ies.puerto.modelo.ficheros.impl.Xml;
import es.ies.puerto.modelo.ficheros.interfaces.IFicheros;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.negocio.interfaces.INegocio;

public class Negocio implements INegocio {
    IFicheros ficheros;

    public Negocio() {
        ficheros = new Xml();
        List<Personaje> personas = ficheros.leer();
    }
    
}
