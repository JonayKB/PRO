package ies.puerto;
import java.util.Calendar;

/**
 * Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)+10);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(dia);
    }
}
