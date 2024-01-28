package ies.puerto.parteDos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persona {
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    public Persona(){}

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int anios()throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dateNacimiento = format.parse(fechaNacimiento);
        Date dateActual = new Date();

        int edad = (int)((dateActual.getTime()-dateNacimiento.getTime())/(1000*3600+24*365L));
        return edad;
    }
}
