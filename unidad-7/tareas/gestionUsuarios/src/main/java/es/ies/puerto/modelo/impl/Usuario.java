package es.ies.puerto.modelo.impl;

import es.ies.puerto.modelo.abstrac.Persona;

public class Usuario extends Persona{

    public Usuario(String id, String nombre, int edad, String ciudad) {
        super(id, nombre, edad, ciudad);
    }
    public Usuario(String id) {
        super(id);
    }
    
}
