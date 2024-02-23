package es.ies.puerto.modelo.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import es.ies.puerto.modelo.abstrac.ProductoFresco;


public class Alimento extends ProductoFresco {
    Date fechaActualDate;
    Date fechaCaducidadDate;
    SimpleDateFormat format;

    public Alimento() {
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String udi, String fechaCaducidad) throws ParseException{
        super(nombre, precio, fechaEntrada, udi, fechaCaducidad);
        fechaActualDate = new Date();
        fechaCaducidadDate = new Date();
        format = new SimpleDateFormat("yyyy-MM-dd");
        fechaCaducidadDate = format.parse(fechaCaducidad);

    }


    @Override
    public int diasCaducidad() {
        return (int)((fechaCaducidadDate.getTime()-fechaActualDate.getTime())/(1000*3600*24L));
    }

    @Override
    public boolean productoCaducado() {
        return diasCaducidad()<5;
    }

    @Override
    public int cantidadDisponible() {
        // TODO 
        return 0;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.35f;
    }
    @Override
    public String toCsv(){
        return getNombre()+SEPARADOR+getPrecio()+SEPARADOR+getFechaEntrada()+SEPARADOR+getUdi()+SEPARADOR+getFechaCaducidad();
    }
    
}
