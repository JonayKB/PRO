package ies.puerto;
/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */

import java.util.Calendar;

public class Ejercicio9 {
    

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

    }
}
