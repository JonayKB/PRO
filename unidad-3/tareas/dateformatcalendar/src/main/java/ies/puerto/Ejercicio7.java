package ies.puerto;

import java.util.Date;
import java.util.Calendar;

/**
 * Escribir un programa que calcule la diferencia en días entre dos fechas utilizando la clase Calendar.
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        int diasAnio0=0;
        int diasAnio1=0;
        Date fecha = new Date();
        Calendar calendario = Calendar.getInstance();
        Calendar calendario1 = Calendar.getInstance();

        calendario.setTime(fecha);
        calendario1.add(Calendar.DAY_OF_MONTH, 7);
        
        diasAnio0 = calendario.get(Calendar.DAY_OF_YEAR);
        diasAnio1 = calendario1.get(Calendar.DAY_OF_YEAR);

        int operacion=diasAnio1-diasAnio0;
        
        if (operacion<=7 && operacion>0) {
            System.out.println("La diferencia es de "+operacion+" dias");
        }
    }
}
