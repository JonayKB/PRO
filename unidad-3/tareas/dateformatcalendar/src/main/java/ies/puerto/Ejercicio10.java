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
            mensaje = "Es Domingo";
            break;

            case 2:case 3:case 4:case 5:case 6:
                break;

            case 7:
            mensaje = "Es sábado";
            break;

            default:
            mensaje = "Ese dia no existe";
                break;
        }
        System.out.println(mensaje);

    }
}
