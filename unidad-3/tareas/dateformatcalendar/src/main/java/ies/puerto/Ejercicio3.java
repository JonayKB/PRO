package ies.puerto;

import java.util.Calendar;

/**
 * Escribir un programa que utilice la clase Calendar para obtener y mostrar la fecha actual con los componentes separados (año, mes, día).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
   

        System.out.println("Dia: "+dia+"\nMes: "+mes+"\nAño: "+año);
    }
}
