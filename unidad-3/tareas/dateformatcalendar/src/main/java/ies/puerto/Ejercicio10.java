package ies.puerto;

import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar y muestre un mensaje apropiado.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String mensaje = "Dia de la semana normal";
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            break;

            case 6:
            mensaje = "Es sábado";
            break;

            case 7:
            mensaje = "Es Domingo";
            break;
            default:
            mensaje = "Ese dia no existe";
                break;
        }
        System.out.println(mensaje);
    }
}
