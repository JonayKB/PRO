package ies.puerto;
/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */

import java.util.Calendar;

public class Ejercicio9 {
    

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
