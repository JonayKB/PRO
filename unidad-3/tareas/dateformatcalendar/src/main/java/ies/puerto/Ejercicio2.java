package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss" utilizando la clase SimpleDateFormat de DateFormat.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Date fecha = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

        System.out.println(format.format(fecha));

    }

}
