package ies.puerto;
/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego intente convertirla a un objeto Date. 
 * Maneja la excepción ParseException
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String valor = input.next();
        Date fecha = null;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fecha= format.parse(valor);
            
            
        } catch (ParseException e) {
            throw new Exception("Error de conversion");
        }

            System.out.println("La fecha es "+fecha+".");
        
    }
   

    
    


    
}
