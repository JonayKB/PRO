package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {
    String nombre;
    static Date fechaNacimiento;
    static SimpleDateFormat format;

    public Ejercicio2(String nombre, String fechaNacimiento, String formata) throws ParseException{
        this.format = new SimpleDateFormat(formata);
        this.fechaNacimiento = this.format.parse(fechaNacimiento);

    }
    public static void main(String[] args) throws ParseException {
        
        Ejercicio2 ejercicio2 = new Ejercicio2(null, "1/12/2000", "dd/MM/yyyy");
        System.out.println(calcularSigno());
    }

    public static int calcularEdad(){
        long edad = 0;
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNacimientoCalendar = Calendar.getInstance();
        fechaNacimientoCalendar.setTime(fechaNacimiento);
        edad = fechaActual.getTimeInMillis() - fechaNacimientoCalendar.getTimeInMillis();
        return (int)(edad/(1000*60*60*24*365L));
    }

    public static String calcularSigno(){
        int dia = fechaNacimiento.getDate();
        int mes = fechaNacimiento.getMonth()+1;
        return "Dia: "+String.valueOf(dia)+"\nMes: "+String.valueOf(mes);
    }
}
