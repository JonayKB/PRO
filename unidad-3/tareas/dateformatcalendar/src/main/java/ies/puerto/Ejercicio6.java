package ies.puerto;

import java.util.Date;

/**
 * Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String mensaje = "Las fechas son distintas";
        Date fecha1 = new Date();
        Date fecha2 = new Date();
   
        
        if (fecha1.compareTo(fecha2)==0) {
            mensaje = "Las fechas son iguales";
        }

        System.out.println(mensaje);
    }
}
