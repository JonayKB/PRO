package ies.puerto.UltimoEjercicio.abstrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persona {
    private String nombre;
    private String fechaNacimiento;

    public Persona(){}
    public Persona(String nombre, String fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public int anios() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimientoDate= new Date();
        Date fechaActual = new Date();

        
        fechaNacimientoDate = format.parse(fechaNacimiento);

        long edad = ((fechaActual.getTime()-fechaNacimientoDate.getTime())/(1000*3600L*24*365));

        return (int)edad;

    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
