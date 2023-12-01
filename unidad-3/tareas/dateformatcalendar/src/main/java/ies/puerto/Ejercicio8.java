package ies.puerto;
/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Ejercicio8 {
    

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = new Date();

        
        try {
            fecha=format.parse(input.nextLine());
        } catch (ParseException e) {
            throw new ParseException("Error parse",1);
        }finally{
            input.close();
        }

        System.out.println(fecha);
    }

}
